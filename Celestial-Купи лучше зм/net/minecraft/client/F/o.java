/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.T;
import net.minecraft.N.p;
import net.minecraft.U.x;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;

public class o
extends f<T> {
    @Override
    public void a(T t2, double d10, double d11, double d12, float f10, int n2, float f11) {
        v.M();
        v.b((float)d10 + 0.5f, (float)d11, (float)d12 + 0.5f);
        o.a(t2.a(), d10, d11, d12, f10);
        v.B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(p p2, double d10, double d11, double d12, float f10) {
        x x2 = p2.a();
        String[] arrstring = net.minecraft.client.F.f.b();
        if (x2 != null) {
            float f11 = 0.53125f;
            float f12 = Math.max(x2.ad, x2.aD);
            double d13 = f12;
            double d14 = 1.0;
            if (arrstring != null) {
                if (d13 > d14) {
                    f11 /= f12;
                }
                v.b(0.0f, 0.4f, 0.0f);
                d13 = p2.e();
                d14 = (p2.i() - p2.e()) * (double)f10;
            }
            v.a((float)(d13 + d14) * 10.0f, 0.0f, 1.0f, 0.0f);
            v.b(0.0f, -0.2f, 0.0f);
            v.a(-30.0f, 1.0f, 0.0f, 0.0f);
            v.d(f11, f11, f11);
            x2.c(d10, d11, d12, 0.0f, 0.0f);
            Q.P().aQ().a(x2, 0.0, 0.0, 0.0, 0.0f, f10, false);
        }
    }
}

