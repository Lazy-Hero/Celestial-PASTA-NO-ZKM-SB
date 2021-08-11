/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.N.F;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.at;
import net.minecraft.client.a.o;
import net.minecraft.client.y.b;

public class l
extends f<F> {
    private static final /* synthetic */ v i;
    private static final /* synthetic */ FloatBuffer k;
    private static final /* synthetic */ v h;
    private final /* synthetic */ FloatBuffer a;
    private static final /* synthetic */ FloatBuffer g;
    private static final /* synthetic */ Random j;

    private FloatBuffer a(float f10, float f11, float f12, float f13) {
        this.a.clear();
        this.a.put(f10).put(f11).put(f12).put(f13);
        this.a.flip();
        return this.a;
    }

    static {
        h = new v("textures/environment/end_sky.png");
        i = new v("textures/entity/end_portal.png");
        j = new Random(31100L);
        k = aZ.e(16);
        g = aZ.e(16);
    }

    @Override
    public void a(F f10, double d10, double d11, double d12, float f11, int n2, float f12) {
        block24: {
            int n3;
            block21: {
                int n4;
                String[] arrstring;
                block22: {
                    block23: {
                        arrstring = net.minecraft.client.F.f.b();
                        n4 = fU.ag();
                        if (arrstring == null) break block22;
                        if (n4 == 0) break block23;
                        n4 = as.a(f10, d10, d11, d12, f11, n2, this.a()) ? 1 : 0;
                        if (arrstring == null) break block22;
                        if (n4 != 0) break block24;
                    }
                    net.minecraft.client.a.v.y();
                    j.setSeed(31100L);
                    net.minecraft.client.a.v.a(2982, k);
                    n4 = 2983;
                }
                net.minecraft.client.a.v.a(n4, g);
                double d13 = d10 * d10 + d11 * d11 + d12 * d12;
                int n5 = this.a(d13);
                float f13 = this.a();
                int n6 = 0;
                for (int i2 = 0; i2 < n5; ++i2) {
                    net.minecraft.client.a.v.M();
                    float f14 = 2.0f / (float)(18 - i2);
                    n3 = i2;
                    if (arrstring != null) {
                        int n7;
                        if (arrstring != null) {
                            if (n3 == 0) {
                                this.b(h);
                                f14 = 0.15f;
                                net.minecraft.client.a.v.a();
                                net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
                            }
                            n7 = i2;
                        }
                        int n8 = 1;
                        if (arrstring != null) {
                            if (n7 >= n8) {
                                this.b(i);
                                n6 = 1;
                                Q.P().Y.a(true);
                            }
                            int n8 = i2;
                            n8 = 1;
                        }
                        if (arrstring != null) {
                            if (n7 == n8) {
                                net.minecraft.client.a.v.a();
                                net.minecraft.client.a.v.a(o.ONE, G.ONE);
                            }
                            net.minecraft.client.a.v.a(at.S, 9216);
                            net.minecraft.client.a.v.a(at.T, 9216);
                            net.minecraft.client.a.v.a(at.R, 9216);
                            net.minecraft.client.a.v.a(at.S, 9474, this.a(1.0f, 0.0f, 0.0f, 0.0f));
                            net.minecraft.client.a.v.a(at.T, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
                            net.minecraft.client.a.v.a(at.R, 9474, this.a(0.0f, 0.0f, 1.0f, 0.0f));
                            net.minecraft.client.a.v.c(at.S);
                            net.minecraft.client.a.v.c(at.T);
                            net.minecraft.client.a.v.c(at.R);
                            net.minecraft.client.a.v.B();
                            net.minecraft.client.a.v.q(5890);
                            net.minecraft.client.a.v.M();
                            net.minecraft.client.a.v.l();
                            net.minecraft.client.a.v.b(0.5f, 0.5f, 0.0f);
                            net.minecraft.client.a.v.d(0.5f, 0.5f, 1.0f);
                            int n8 = i2;
                            n8 = 1;
                        }
                        float f15 = n7 + n8;
                        net.minecraft.client.a.v.b(17.0f / f15, (2.0f + f15 / 1.5f) * ((float)Q.aj() % 800000.0f / 800000.0f), 0.0f);
                        net.minecraft.client.a.v.a((f15 * f15 * 4321.0f + f15 * 9.0f) * 2.0f, 0.0f, 0.0f, 1.0f);
                        net.minecraft.client.a.v.d(4.5f - f15 / 4.0f, 4.5f - f15 / 4.0f, 1.0f);
                        net.minecraft.client.a.v.a(g);
                        net.minecraft.client.a.v.a(k);
                        W w2 = W.c();
                        I i3 = w2.b();
                        i3.a(7, b.i);
                        float f16 = (j.nextFloat() * 0.5f + 0.1f) * f14;
                        float f17 = (j.nextFloat() * 0.5f + 0.4f) * f14;
                        float f18 = (j.nextFloat() * 0.5f + 0.5f) * f14;
                        int n9 = f10.a(aA.SOUTH);
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11 + 1.0, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11 + 1.0, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                            }
                            n9 = f10.a(aA.NORTH);
                        }
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10, d11 + 1.0, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11 + 1.0, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11, d12).a(f16, f17, f18, 1.0f).d();
                            }
                            n9 = f10.a(aA.EAST);
                        }
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10 + 1.0, d11 + 1.0, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11 + 1.0, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12).a(f16, f17, f18, 1.0f).d();
                            }
                            n9 = f10.a(aA.WEST);
                        }
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10, d11, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11 + 1.0, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11 + 1.0, d12).a(f16, f17, f18, 1.0f).d();
                            }
                            n9 = f10.a(aA.DOWN);
                        }
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10, d11, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                            }
                            n9 = f10.a(aA.UP) ? 1 : 0;
                        }
                        if (arrstring != null) {
                            if (n9 != 0) {
                                i3.c(d10, d11 + (double)f13, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11 + (double)f13, d12 + 1.0).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10 + 1.0, d11 + (double)f13, d12).a(f16, f17, f18, 1.0f).d();
                                i3.c(d10, d11 + (double)f13, d12).a(f16, f17, f18, 1.0f).d();
                            }
                            w2.a();
                            net.minecraft.client.a.v.B();
                            n9 = 5888;
                        }
                        net.minecraft.client.a.v.q(n9);
                        this.b(h);
                        if (arrstring != null) continue;
                    }
                    break block21;
                }
                net.minecraft.client.a.v.f();
                net.minecraft.client.a.v.b(at.S);
                net.minecraft.client.a.v.b(at.T);
                net.minecraft.client.a.v.b(at.R);
                net.minecraft.client.a.v.j();
                n3 = n6;
            }
            if (n3 != 0) {
                Q.P().Y.a(false);
            }
        }
    }

    public l() {
        this.a = aZ.e(16);
    }

    protected float a() {
        return 0.75f;
    }

    protected int a(double d10) {
        int n2;
        block4: {
            double d11;
            block17: {
                block18: {
                    String[] arrstring;
                    block15: {
                        double d12;
                        block16: {
                            block13: {
                                double d13;
                                block14: {
                                    block11: {
                                        double d14;
                                        block12: {
                                            block9: {
                                                double d15;
                                                block10: {
                                                    block7: {
                                                        double d16;
                                                        block8: {
                                                            block5: {
                                                                double d17;
                                                                block6: {
                                                                    block2: {
                                                                        double d18;
                                                                        block3: {
                                                                            arrstring = net.minecraft.client.F.f.b();
                                                                            double d19 = d10 - 36864.0;
                                                                            d11 = d19 == 0.0 ? 0 : (d19 > 0.0 ? 1 : -1);
                                                                            if (arrstring == null) break block2;
                                                                            if (d11 <= 0) break block3;
                                                                            n2 = 1;
                                                                            if (arrstring != null) break block4;
                                                                        }
                                                                        d11 = (d18 = d10 - 25600.0) == 0.0 ? 0 : (d18 > 0.0 ? 1 : -1);
                                                                    }
                                                                    if (arrstring == null) break block5;
                                                                    if (d11 <= 0) break block6;
                                                                    n2 = 3;
                                                                    if (arrstring != null) break block4;
                                                                }
                                                                d11 = (d17 = d10 - 16384.0) == 0.0 ? 0 : (d17 > 0.0 ? 1 : -1);
                                                            }
                                                            if (arrstring == null) break block7;
                                                            if (d11 <= 0) break block8;
                                                            n2 = 5;
                                                            if (arrstring != null) break block4;
                                                        }
                                                        d11 = (d16 = d10 - 9216.0) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
                                                    }
                                                    if (arrstring == null) break block9;
                                                    if (d11 <= 0) break block10;
                                                    n2 = 7;
                                                    if (arrstring != null) break block4;
                                                }
                                                d11 = (d15 = d10 - 4096.0) == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                                            }
                                            if (arrstring == null) break block11;
                                            if (d11 <= 0) break block12;
                                            n2 = 9;
                                            if (arrstring != null) break block4;
                                        }
                                        d11 = (d14 = d10 - 1024.0) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                                    }
                                    if (arrstring == null) break block13;
                                    if (d11 <= 0) break block14;
                                    n2 = 11;
                                    if (arrstring != null) break block4;
                                }
                                d11 = (d13 = d10 - 576.0) == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                            }
                            if (arrstring == null) break block15;
                            if (d11 <= 0) break block16;
                            n2 = 13;
                            if (arrstring != null) break block4;
                        }
                        d11 = (d12 = d10 - 256.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                    }
                    if (arrstring == null) break block17;
                    if (d11 <= 0) break block18;
                    n2 = 14;
                    if (arrstring != null) break block4;
                }
                d11 = 15;
            }
            n2 = (int)d11;
        }
        return n2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

