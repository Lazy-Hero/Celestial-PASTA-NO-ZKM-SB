/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.w.a9;
import net.minecraft.k.m;
import net.minecraft.z.n;

public class aW
extends b<n> {
    private static final /* synthetic */ net.minecraft.ar.v j;
    private final /* synthetic */ a9 k;
    private static final /* synthetic */ net.minecraft.ar.v i;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(n n2, double d10, double d11, double d12, float f10, float f11) {
        aW aW2;
        block6: {
            boolean bl2;
            block5: {
                m[] arrm = b.b();
                v.M();
                v.E();
                m[] arrm2 = arrm;
                float f12 = this.a(n2.ak, n2.e, f11);
                float f13 = n2.E + (n2.at - n2.E) * f11;
                v.b((float)d10, (float)d11, (float)d12);
                float f14 = 0.0625f;
                v.q();
                v.d(-1.0f, -1.0f, 1.0f);
                v.e();
                this.c(n2);
                bl2 = this.g;
                if (arrm2 != null) break block5;
                if (bl2) {
                    v.r();
                    v.m(this.a(n2));
                }
                this.k.b(n2, 0.0f, 0.0f, 0.0f, f12, f13, 0.0625f);
                aW2 = this;
                if (arrm2 != null) break block6;
                bl2 = aW2.g;
            }
            if (bl2) {
                v.s();
                v.h();
            }
            v.B();
            aW2 = this;
        }
        super.d(n2, d10, d11, d12, f10, f11);
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

    static {
        j = new net.minecraft.ar.v("textures/entity/wither/wither_invulnerable.png");
        i = new net.minecraft.ar.v("textures/entity/wither/wither.png");
    }

    protected net.minecraft.ar.v a(n n2) {
        return n2.c() ? j : i;
    }

    public aW(a4 a42) {
        super(a42);
        this.k = new a9();
    }
}

