/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import java.util.Random;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.J.t;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.w.d;

public class V {
    private static final /* synthetic */ Random a;

    public static void a(z z2, net.minecraft.k.n n2, a a10) {
        V.a(z2, (double)n2.e(), (double)n2.b(), (double)n2.a(), a10);
    }

    public static void a(z z2, double d10, double d11, double d12, d d13) {
        float f10 = a.nextFloat() * 0.8f + 0.1f;
        float f11 = a.nextFloat() * 0.8f + 0.1f;
        float f12 = a.nextFloat() * 0.8f + 0.1f;
        int n2 = n.c();
        while (!d13.G()) {
            t t2 = new t(z2, d10 + (double)f10, d11 + (double)f11, d12 + (double)f12, d13.d(a.nextInt(21) + 10));
            float f13 = 0.05f;
            t2.aq = a.nextGaussian() * (double)0.05f;
            t2.G = a.nextGaussian() * (double)0.05f + (double)0.2f;
            t2.d = a.nextGaussian() * (double)0.05f;
            z2.f(t2);
            if (n2 == 0) continue;
        }
    }

    private static void a(z z2, double d10, double d11, double d12, a a10) {
        int n2 = 0;
        int n3 = n.c();
        while (n2 < a10.e()) {
            d d13 = a10.a(n2);
            if (n3 == 0) {
                if (!d13.G()) {
                    V.a(z2, d10, d11, d12, d13);
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = new Random();
    }

    public static void a(z z2, x x2, a a10) {
        V.a(z2, x2.a, x2.aF, x2.ax, a10);
    }
}

