/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.C;

import net.minecraft.B.X;
import net.minecraft.client.C.m;
import net.minecraft.client.C.w;
import net.minecraft.client.Q;
import net.minecraft.client.q.a;
import net.minecraft.client.r.ae;
import net.minecraft.k.h;
import net.minecraft.w.d;

public class v
implements w<a> {
    private final /* synthetic */ ae a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a a10, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        block8: {
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            boolean bl2;
            block14: {
                float f22;
                block13: {
                    block12: {
                        a a11;
                        block11: {
                            boolean bl3;
                            block10: {
                                block9: {
                                    block7: {
                                        bl2 = m.c();
                                        bl3 = a10.m();
                                        if (!bl2) break block7;
                                        if (!bl3) break block8;
                                        bl3 = a10.a3();
                                    }
                                    if (!bl2) break block9;
                                    if (bl3) break block8;
                                    bl3 = a10.a(net.minecraft.i.a.CAPE);
                                }
                                if (!bl2) break block10;
                                if (!bl3) break block8;
                                a11 = a10;
                                if (!bl2) break block11;
                                bl3 = a11.g().equals(Q.P().aR().b());
                            }
                            if (!bl3) break block8;
                            a11 = a10;
                        }
                        d d10 = a11.b(X.CHEST);
                        if (!bl2) break block12;
                        if (d10.w() == net.minecraft.u.h.cf) break block8;
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        this.a.b(new net.minecraft.ar.v("celestial/celestial.png"));
                        net.minecraft.client.a.v.M();
                        net.minecraft.client.a.v.b(0.0f, 0.0f, 0.125f);
                    }
                    double d11 = a10.b5 + (a10.cq - a10.b5) * (double)f12 - (a10.N + (a10.a - a10.N) * (double)f12);
                    double d12 = a10.cs + (a10.b_ - a10.cs) * (double)f12 - (a10.L + (a10.aF - a10.L) * (double)f12);
                    double d13 = a10.cn + (a10.b0 - a10.cn) * (double)f12 - (a10.k + (a10.ax - a10.k) * (double)f12);
                    float f23 = a10.aU + (a10.bf - a10.aU) * f12;
                    double d14 = h.g(f23 * ((float)Math.PI / 180));
                    double d15 = -h.c(f23 * ((float)Math.PI / 180));
                    f21 = (float)d12 * 10.0f;
                    f21 = h.c(f21, -6.0f, 32.0f);
                    f20 = (float)(d11 * d14 + d13 * d15) * 50.0f;
                    f19 = (float)(d11 * d15 - d13 * d14) * 50.0f;
                    float f24 = f20 - 0.0f;
                    f22 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                    if (!bl2) break block13;
                    if (f22 < 0) {
                        f20 = 0.0f;
                    }
                    f18 = f20;
                    f17 = 165.0f;
                    if (!bl2) break block14;
                    float f25 = f18 - f17;
                    f22 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
                }
                if (f22 > 0) {
                    f20 = 165.0f;
                }
                f18 = a10.bZ;
                f17 = (a10.b9 - a10.bZ) * f12;
            }
            float f26 = f18 + f17;
            f21 += h.g((a10.Y + (a10.as - a10.Y) * f12) * 6.0f) * 32.0f * f26;
            if (bl2) {
                if (a10.a4()) {
                    f21 += 25.0f;
                    net.minecraft.client.a.v.b(0.0f, 0.142f, -0.0178f);
                }
                net.minecraft.client.a.v.a(6.0f + f20 / 2.0f + f21, 1.0f, 0.0f, 0.0f);
                net.minecraft.client.a.v.a(f19 / 2.0f, 0.0f, 0.0f, 1.0f);
                net.minecraft.client.a.v.a(-f19 / 2.0f, 0.0f, 1.0f, 0.0f);
                net.minecraft.client.a.v.a(180.0f, 0.0f, 1.0f, 0.0f);
                this.a.a().a(0.0625f);
            }
            net.minecraft.client.a.v.B();
        }
    }

    public v(ae ae2) {
        this.a = ae2;
    }

    @Override
    public boolean a() {
        return false;
    }
}

