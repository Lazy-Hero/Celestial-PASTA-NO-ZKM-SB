/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.E;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.client.E.l;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class k
extends Thread {
    private static final /* synthetic */ AtomicInteger a;
    private final /* synthetic */ String c;
    private final /* synthetic */ String f;
    private /* synthetic */ boolean b;
    private static final /* synthetic */ Logger e;
    private final /* synthetic */ DatagramSocket d;

    @Override
    public void interrupt() {
        super.interrupt();
        this.b = false;
    }

    static {
        a = new AtomicInteger(0);
        e = LogManager.getLogger();
    }

    @Override
    public void run() {
        String string = k.a(this.c, this.f);
        String string2 = l.d();
        byte[] arrby = string.getBytes(StandardCharsets.UTF_8);
        while (!this.isInterrupted() && this.b) {
            try {
                InetAddress inetAddress = InetAddress.getByName("224.0.2.60");
                DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length, inetAddress, 4445);
                this.d.send(datagramPacket);
            }
            catch (IOException iOException) {
                e.warn("LanServerPinger: {}", (Object)iOException.getMessage());
                break;
            }
            try {
                k.sleep(1500L);
            }
            catch (InterruptedException interruptedException) {
                if (string2 == null) continue;
            }
        }
    }

    public static String a(String string) {
        int n2;
        int n3;
        int n4;
        int n5 = string.indexOf("[/MOTD]");
        String string2 = l.d();
        int n6 = n5;
        if (string2 == null) {
            if (n6 < 0) {
                return null;
            }
            n6 = string.indexOf("[/MOTD]", n5 + "[/MOTD]".length());
        }
        int n7 = n4 = n6;
        if (string2 == null) {
            if (n7 >= 0) {
                return null;
            }
            n7 = string.indexOf("[AD]", n5 + "[/MOTD]".length());
        }
        int n8 = n3 = n7;
        if (string2 == null) {
            if (n8 < 0) {
                return null;
            }
            n8 = string.indexOf("[/AD]", n3 + "[AD]".length());
        }
        return (n2 = n8) < n3 ? null : string.substring(n3 + "[AD]".length(), n2);
    }

    public static String b(String string) {
        int n2;
        int n3 = string.indexOf("[MOTD]");
        String string2 = l.d();
        int n4 = n3;
        if (string2 == null) {
            if (n4 < 0) {
                return "missing no";
            }
            n4 = string.indexOf("[/MOTD]", n3 + "[MOTD]".length());
        }
        return (n2 = n4) < n3 ? "missing no" : string.substring(n3 + "[MOTD]".length(), n2);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public k(String string, String string2) throws IOException {
        super("LanServerPinger #" + a.incrementAndGet());
        this.b = true;
        this.c = string;
        this.f = string2;
        this.setDaemon(true);
        this.d = new DatagramSocket();
    }

    public static String a(String string, String string2) {
        return "[MOTD]" + string + "[/MOTD][AD]" + string2 + "[/AD]";
    }
}

