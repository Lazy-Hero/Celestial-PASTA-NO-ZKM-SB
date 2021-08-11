/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.I;
import net.minecraft.k.m;
import net.minecraft.z.i;

public class l
extends b<i> {
    private final /* synthetic */ I i;
    private static final /* synthetic */ net.minecraft.ar.v j;

    public l(a4 a42) {
        super(a42);
        this.i = new I();
    }

    public void a(i i2, double d10, double d11, double d12, float f10, float f11) {
        block6: {
            float f12;
            m[] arrm;
            float f13;
            block5: {
                f13 = i2.a(f11);
                arrm = b.b();
                f12 = f13;
                if (arrm != null) break block5;
                if (f12 == 0.0f) break block6;
                f12 = 2.0f;
            }
            float f14 = f12;
            float f15 = f13 - 0.9f;
            float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            if (arrm == null) {
                if (f16 > 0) {
                    f14 = (float)((double)f14 * ((1.0 - (double)f13) / (double)0.1f));
                }
                v.M();
                v.E();
                v.e();
                f16 = (float)this.c(i2);
            }
            v.b((float)d10, (float)d11, (float)d12);
            v.a(90.0f - i2.e, 0.0f, 1.0f, 0.0f);
            v.d(-f14, -f14, f14);
            float f17 = 0.03125f;
            v.b(0.0f, -0.626f, 0.0f);
            this.i.b(i2, f13, 0.0f, 0.0f, i2.e, i2.at, 0.03125f);
            v.B();
            v.c();
            super.d(i2, d10, d11, d12, f10, f11);
        }
    }

    static {
        j = new net.minecraft.ar.v("textures/entity/illager/fangs.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected net.minecraft.ar.v a(i i2) {
        return j;
    }
}

