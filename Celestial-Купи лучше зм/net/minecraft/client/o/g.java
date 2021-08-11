/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.o;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import net.minecraft.client.o.a;
import net.minecraft.client.o.f;
import net.minecraft.client.o.j;

public class g
extends Thread {
    private final /* synthetic */ InetAddress b;
    private final /* synthetic */ MulticastSocket c;
    private final /* synthetic */ f a;

    public g(f f10) throws IOException {
        super("LanServerDetector #" + net.minecraft.client.o.a.b().incrementAndGet());
        this.a = f10;
        this.setDaemon(true);
        this.c = new MulticastSocket(4445);
        this.b = InetAddress.getByName("224.0.2.60");
        this.c.setSoTimeout(5000);
        this.c.joinGroup(this.b);
    }

    @Override
    public void run() {
        block6: {
            byte[] arrby = new byte[1024];
            int[] arrn = j.b();
            while (!this.isInterrupted()) {
                DatagramPacket datagramPacket = new DatagramPacket(arrby, arrby.length);
                try {
                    this.c.receive(datagramPacket);
                    if (arrn == null) break block6;
                }
                catch (SocketTimeoutException socketTimeoutException) {
                    continue;
                }
                catch (IOException iOException) {
                    net.minecraft.client.o.a.a().error("Couldn't ping server", (Throwable)iOException);
                    if (arrn != null) break;
                }
                String string = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), StandardCharsets.UTF_8);
                net.minecraft.client.o.a.a().debug("{}: {}", (Object)datagramPacket.getAddress(), (Object)string);
                this.a.a(string, datagramPacket.getAddress());
                if (arrn != null) continue;
            }
            try {
                this.c.leaveGroup(this.b);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.c.close();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

