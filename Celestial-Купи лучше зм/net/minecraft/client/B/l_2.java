/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.k.h;

public class l {
    public static /* synthetic */ int d;
    public static /* synthetic */ int a;
    public static /* synthetic */ int b;
    public static /* synthetic */ double e;
    public static /* synthetic */ double c;

    public int a() {
        return d;
    }

    public static int c() {
        return b;
    }

    public double b() {
        return c;
    }

    public double d() {
        return e;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public l(Q q2) {
        a = q2.P;
        d = q2.aT;
        b = 1;
        boolean bl2 = q2.ap();
        int n2 = q2.ac.b7;
        if (n2 == 0) {
            n2 = 1000;
        }
        while (b < n2 && a / (b + 1) >= 320 && d / (b + 1) >= 240) {
            ++b;
        }
        if (bl2 && b % 2 != 0 && b != 1) {
            --b;
        }
        e = (double)a / (double)b;
        c = (double)d / (double)b;
        a = h.i(e);
        d = h.i(c);
    }

    public int e() {
        return a;
    }
}

