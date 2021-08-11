/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.ResourceLeakDetector
 *  io.netty.util.ResourceLeakDetector$Level
 */
package net.minecraft.ar;

import io.netty.util.ResourceLeakDetector;
import net.minecraft.ar.v;

public class X {
    public static final /* synthetic */ char[] b;
    public static final /* synthetic */ char[] a;
    public static final /* synthetic */ ResourceLeakDetector.Level c;

    public static String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = v.d();
        char[] arrc = string.toCharArray();
        int n3 = arrc.length;
        int n4 = 0;
        while (n4 < n3) {
            char c10 = arrc[n4];
            if (n2 != 0) {
                if (X.a(c10)) {
                    stringBuilder.append(c10);
                }
                ++n4;
            }
            if (n2 != 0) continue;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(char c10) {
        int n2 = v.d();
        int n3 = c10;
        int n4 = 167;
        if (n2 != 0) {
            if (n3 == n4) return 0 != 0;
            n3 = c10;
            n4 = 32;
        }
        if (n2 != 0) {
            if (n3 < n4) return 0 != 0;
            n3 = c10;
            if (n2 == 0) return n3 != 0;
            n4 = 127;
        }
        if (n3 == n4) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        c = ResourceLeakDetector.Level.DISABLED;
        a = new char[]{'.', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"'};
        b = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};
        ResourceLeakDetector.setLevel((ResourceLeakDetector.Level)c);
    }
}

