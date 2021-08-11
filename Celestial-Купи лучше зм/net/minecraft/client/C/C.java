/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.T.a5;
import net.minecraft.W.K;
import net.minecraft.ar.aW;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.r.aX;
import net.minecraft.client.w.aF;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class C
implements w<a5> {
    private final /* synthetic */ aX a;

    @Override
    public void a(a5 a52, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block9: {
            Q q2;
            d d10;
            block13: {
                float f17;
                block17: {
                    boolean bl2;
                    boolean bl3;
                    block16: {
                        k k2;
                        k k3;
                        block14: {
                            block15: {
                                block11: {
                                    block12: {
                                        aF aF2;
                                        block10: {
                                            boolean bl4;
                                            block8: {
                                                d10 = a52.av();
                                                bl3 = m.c();
                                                bl4 = d10.G();
                                                if (!bl3) break block8;
                                                if (bl4) break block9;
                                                v.c(1.0f, 1.0f, 1.0f);
                                                v.M();
                                                aF2 = this.a.a();
                                                if (!bl3) break block10;
                                                bl4 = aF2.h;
                                            }
                                            if (bl4) {
                                                v.b(0.0f, 0.625f, 0.0f);
                                                v.a(-20.0f, -1.0f, 0.0f, 0.0f);
                                                float f18 = 0.5f;
                                                v.d(0.5f, 0.5f, 0.5f);
                                            }
                                            aF2 = this.a.a();
                                        }
                                        aF2.k.a(0.0625f);
                                        v.b(-0.0625f, 0.53125f, 0.21875f);
                                        k3 = d10.w();
                                        q2 = Q.P();
                                        k2 = k3;
                                        if (!bl3) break block11;
                                        if (K.a(k2).d().n() != aW.ENTITYBLOCK_ANIMATED) break block12;
                                        v.b(0.0f, 0.0625f, -0.25f);
                                        v.a(30.0f, 1.0f, 0.0f, 0.0f);
                                        v.a(-5.0f, 0.0f, 1.0f, 0.0f);
                                        f17 = 0.375f;
                                        v.d(0.375f, -0.375f, 0.375f);
                                        if (bl3) break block13;
                                    }
                                    k2 = k3;
                                }
                                if (!bl3) break block14;
                                if (k2 != h.i) break block15;
                                v.b(0.0f, 0.125f, -0.125f);
                                v.a(-45.0f, 0.0f, 1.0f, 0.0f);
                                f17 = 0.625f;
                                v.d(0.625f, -0.625f, 0.625f);
                                v.a(-100.0f, 1.0f, 0.0f, 0.0f);
                                v.a(-20.0f, 0.0f, 1.0f, 0.0f);
                                if (bl3) break block13;
                            }
                            k2 = k3;
                        }
                        bl2 = k2.d();
                        if (!bl3) break block16;
                        if (!bl2) break block17;
                        bl2 = k3.k();
                    }
                    if (bl2) {
                        v.a(180.0f, 0.0f, 0.0f, 1.0f);
                        v.b(0.0f, -0.0625f, 0.0f);
                    }
                    this.a.f();
                    v.b(0.0625f, -0.125f, 0.0f);
                    f17 = 0.625f;
                    v.d(0.625f, -0.625f, 0.625f);
                    v.a(0.0f, 1.0f, 0.0f, 0.0f);
                    v.a(0.0f, 0.0f, 1.0f, 0.0f);
                    if (bl3) break block13;
                }
                v.b(0.1875f, 0.1875f, 0.0f);
                f17 = 0.875f;
                v.d(0.875f, 0.875f, 0.875f);
                v.a(-20.0f, 0.0f, 0.0f, 1.0f);
                v.a(-60.0f, 1.0f, 0.0f, 0.0f);
                v.a(-30.0f, 0.0f, 0.0f, 1.0f);
            }
            v.a(-15.0f, 1.0f, 0.0f, 0.0f);
            v.a(40.0f, 0.0f, 0.0f, 1.0f);
            q2.X().a(a52, d10, net.minecraft.client.x.d.THIRD_PERSON_RIGHT_HAND);
            v.B();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public C(aX aX2) {
        this.a = aX2;
    }

    @Override
    public boolean a() {
        return false;
    }
}

