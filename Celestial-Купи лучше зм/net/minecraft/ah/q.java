/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.z;

public class q {
    private static /* synthetic */ int[] a;

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new int[65536];
    }

    public static void a(int[] arrn) {
        a = arrn;
    }

    public static int a(double d10, double d11) {
        int n2;
        String string = z.I();
        int n3 = (int)((1.0 - d10) * 255.0);
        int n4 = (int)((1.0 - (d11 *= d10)) * 255.0);
        int n5 = n2 = n4 << 8 | n3;
        if (string != null) {
            n5 = n5 > a.length ? -65281 : a[n2];
        }
        return n5;
    }
}

