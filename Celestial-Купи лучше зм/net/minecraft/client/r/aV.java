/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.al;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.z.q;

public class aV
extends b<q> {
    private static final /* synthetic */ net.minecraft.ar.v i;
    private final /* synthetic */ al j;

    protected net.minecraft.ar.v a(q q2) {
        return i;
    }

    public void a(q q2, double d10, double d11, double d12, float f10, float f11) {
        v.M();
        float f12 = this.a(q2.ak, q2.e, f11);
        float f13 = q2.E + (q2.at - q2.E) * f11;
        float f14 = (float)q2.H + f11;
        v.b((float)d10, (float)d11 + 0.15f, (float)d12);
        v.a(net.minecraft.k.h.g(f14 * 0.1f) * 180.0f, 0.0f, 1.0f, 0.0f);
        v.a(net.minecraft.k.h.c(f14 * 0.1f) * 180.0f, 1.0f, 0.0f, 0.0f);
        v.a(net.minecraft.k.h.g(f14 * 0.15f) * 360.0f, 0.0f, 0.0f, 1.0f);
        float f15 = 0.03125f;
        v.q();
        v.d(-1.0f, -1.0f, 1.0f);
        this.c(q2);
        this.j.b(q2, 0.0f, 0.0f, 0.0f, f12, f13, 0.03125f);
        v.a();
        v.b(1.0f, 1.0f, 1.0f, 0.5f);
        v.d(1.5f, 1.5f, 1.5f);
        this.j.b(q2, 0.0f, 0.0f, 0.0f, f12, f13, 0.03125f);
        v.f();
        v.B();
        super.d(q2, d10, d11, d12, f10, f11);
    }

    static {
        i = new net.minecraft.ar.v("textures/entity/shulker/spark.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private float a(float f10, float f11, float f12) {
        float f13;
        block5: {
            float f14;
            block4: {
                m[] arrm = b.b();
                for (f14 = f11 - f10; f14 < -180.0f; f14 += 360.0f) {
                    if (arrm == null) {
                        if (arrm == null) continue;
                    }
                    break block4;
                }
                while (f14 >= 180.0f) {
                    f13 = f14 - 360.0f;
                    if (arrm == null) {
                        f14 = f13;
                        if (arrm == null) continue;
                    }
                    break block5;
                }
            }
            f13 = f10 + f12 * f14;
        }
        return f13;
    }

    public aV(a4 a42) {
        super(a42);
        this.j = new al();
    }
}

