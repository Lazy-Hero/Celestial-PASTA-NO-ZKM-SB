/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.r;

import java.util.Random;
import net.minecraft.J.t;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.o;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.j.j;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.x.Y;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;
import org.lwjgl.opengl.GL11;

public class k
extends b<t> {
    private final /* synthetic */ p l;
    public static /* synthetic */ long i;
    private final /* synthetic */ Random j;
    public static /* synthetic */ Random k;
    public static /* synthetic */ p o;
    public static /* synthetic */ Q n;
    public static /* synthetic */ double m;

    private static gP a(gP gP2) {
        return gP2;
    }

    public k(a4 a42, p p2) {
        super(a42);
        this.j = new Random();
        this.l = p2;
        this.a = 0.15f;
        this.d = 0.75f;
    }

    protected net.minecraft.ar.v a(t t2) {
        return net.minecraft.client.j.j.x;
    }

    @Override
    private int a(d d10) {
        int n2;
        block11: {
            int n3;
            block6: {
                int n4;
                block9: {
                    m[] arrm;
                    block10: {
                        block7: {
                            block8: {
                                block4: {
                                    block5: {
                                        n3 = 1;
                                        arrm = b.b();
                                        n2 = d10.t();
                                        n4 = 48;
                                        if (arrm != null) break block4;
                                        if (n2 <= n4) break block5;
                                        n3 = 5;
                                        if (arrm == null) break block6;
                                    }
                                    n2 = d10.t();
                                    n4 = 32;
                                }
                                if (arrm != null) break block7;
                                if (n2 <= n4) break block8;
                                n3 = 4;
                                if (arrm == null) break block6;
                            }
                            n2 = d10.t();
                            n4 = 16;
                        }
                        if (arrm != null) break block9;
                        if (n2 <= n4) break block10;
                        n3 = 3;
                        if (arrm == null) break block6;
                    }
                    n2 = d10.t();
                    if (arrm != null) break block11;
                    n4 = 1;
                }
                if (n2 > n4) {
                    n3 = 2;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(t var1_1, double var2_2, double var4_3, double var6_4, float var8_5, float var9_6) {
        block47: {
            block37: {
                block52: {
                    block50: {
                        block51: {
                            block53: {
                                block49: {
                                    block48: {
                                        block38: {
                                            block39: {
                                                block46: {
                                                    block45: {
                                                        block44: {
                                                            block36: {
                                                                var10_7 = b.b();
                                                                v0 = cj.b.i.a(ca.class).i();
                                                                if (var10_7 != null) break block38;
                                                                if (v0) break block39;
                                                                var11_8 = var1_1.m();
                                                                v1 = var11_8.G();
                                                                if (var10_7 != null) ** GOTO lbl12
                                                                if (v1 != 0) {
                                                                    v2 = 187;
                                                                } else {
                                                                    v1 = net.minecraft.w.k.a(var11_8.w());
lbl12:
                                                                    // 2 sources

                                                                    v2 = v1 + var11_8.d();
                                                                }
                                                                var12_9 = v2;
                                                                this.j.setSeed(var12_9);
                                                                var13_10 = 0;
                                                                v3 = this.c(var1_1);
                                                                if (var10_7 == null) {
                                                                    if (v3 != 0) {
                                                                        this.h.d.a(this.a(var1_1)).a(false, false);
                                                                        var13_10 = 1;
                                                                    }
                                                                    v.q();
                                                                    v3 = 516;
                                                                }
                                                                v.a(v3, 0.1f);
                                                                v.a();
                                                                a0.c();
                                                                v.a(net.minecraft.client.a.o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, G.ZERO);
                                                                v.M();
                                                                var14_12 = this.l.a(var11_8, var1_1.aG, null);
                                                                var15_14 = this.a(var1_1, var2_2, var4_3, var6_4, var9_6, var14_12);
                                                                var16_16 = var14_12.c().n.d.x;
                                                                var17_19 = var14_12.c().n.d.y;
                                                                var18_21 = var14_12.c().n.d.z;
                                                                v4 = var19_23 = var14_12.d();
                                                                if (var10_7 == null) {
                                                                    if (v4 == 0) {
                                                                        var20_24 = -0.0f * (float)(var15_14 - 1) * 0.5f * var16_16;
                                                                        var21_26 = -0.0f * (float)(var15_14 - 1) * 0.5f * var17_19;
                                                                        var22_27 = -0.09375f * (float)(var15_14 - 1) * 0.5f * var18_21;
                                                                        v.b(var20_24, var21_26, var22_27);
                                                                    }
                                                                    v4 = this.g;
                                                                }
                                                                if (var10_7 == null) {
                                                                    if (v4 != 0) {
                                                                        v.r();
                                                                        v.m(this.a(var1_1));
                                                                    }
                                                                    v4 = var20_25 = 0;
                                                                }
                                                                while (var20_25 < var15_14) {
                                                                    block42: {
                                                                        block43: {
                                                                            block40: {
                                                                                block41: {
                                                                                    v5 = var19_23;
                                                                                    if (var10_7 != null) break block36;
                                                                                    if (var10_7 != null) break block40;
                                                                                    if (v5 == 0) break block41;
                                                                                    v.M();
                                                                                    if (var10_7 == null) {
                                                                                        if (var20_25 > 0) {
                                                                                            var21_26 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.15f;
                                                                                            var22_27 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.15f;
                                                                                            var23_28 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.15f;
                                                                                            v.b(var21_26, var22_27, var23_28);
                                                                                        }
                                                                                        var14_12.c().b(net.minecraft.client.x.d.GROUND);
                                                                                        this.l.a(var11_8, var14_12);
                                                                                        v.B();
                                                                                    }
                                                                                    if (var10_7 == null) break block42;
                                                                                }
                                                                                v.M();
                                                                                if (var10_7 != null) break block43;
                                                                                v6 = var20_25;
                                                                            }
                                                                            if (v6 > 0) {
                                                                                var21_26 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                                                                                var22_27 = (this.j.nextFloat() * 2.0f - 1.0f) * 0.15f * 0.5f;
                                                                                v.b(var21_26, var22_27, 0.0f);
                                                                            }
                                                                            var14_12.c().b(net.minecraft.client.x.d.GROUND);
                                                                            this.l.a(var11_8, var14_12);
                                                                            v.B();
                                                                        }
                                                                        v.b(0.0f * var16_16, 0.0f * var17_19, 0.09375f * var18_21);
                                                                    }
                                                                    ++var20_25;
                                                                    if (var10_7 == null) continue;
                                                                }
                                                                v5 = this.g ? 1 : 0;
                                                            }
                                                            if (var10_7 != null) break block44;
                                                            if (v5 != 0) {
                                                                v.s();
                                                                v.h();
                                                            }
                                                            v.B();
                                                            v.u();
                                                            v.f();
                                                            v7 = this;
                                                            if (var10_7 != null) break block45;
                                                            v7.c(var1_1);
                                                            v5 = var13_10;
                                                        }
                                                        if (v5 == 0) break block46;
                                                        v7 = this;
                                                    }
                                                    v7.h.d.a(this.a(var1_1)).b();
                                                }
                                                if (var10_7 == null) break block47;
                                            }
                                            v8 = (double)(System.nanoTime() - net.minecraft.client.r.k.i) / 3000000.0 * (double)ca.k.r();
                                            if (var10_7 != null) break block48;
                                            net.minecraft.client.r.k.m = v8;
                                            v0 = net.minecraft.client.r.k.n.af;
                                        }
                                        if (v0) break block49;
                                        v8 = 0.0;
                                    }
                                    net.minecraft.client.r.k.m = v8;
                                }
                                var11_8 = var1_1.m();
                                if (var10_7 != null) return;
                                if (var11_8.w() == null) break block47;
                                net.minecraft.client.r.k.k.setSeed(187L);
                                var12_9 = 0;
                                if (var10_7 == null) {
                                    if (net.minecraft.client.j.j.x != null) {
                                        net.minecraft.client.r.k.n.aQ().d.b(net.minecraft.client.j.j.x);
                                        net.minecraft.client.r.k.n.aQ().d.a(net.minecraft.client.j.j.x).a(false, false);
                                        var12_9 = 1;
                                    }
                                    v.q();
                                    v.a(516, 0.1f);
                                    v.a();
                                    v.e(770, 771, 1, 0);
                                    v.M();
                                }
                                var13_11 = net.minecraft.client.r.k.o.b().a(var11_8);
                                var14_13 = this.a(var1_1, var2_2, var4_3, var6_4, var9_6, var13_11);
                                var15_15 = new n(var1_1);
                                v9 = var1_1;
                                if (var10_7 == null) {
                                    if (v9.at > 360.0f) {
                                        var1_1.at = 0.0f;
                                    }
                                    v9 = var1_1;
                                }
                                if (var10_7 != null) break block50;
                                if (v9 == null) break block51;
                                v10 = Double.isNaN(var1_1.j());
                                if (var10_7 != null) break block52;
                                if (v10 != 0) break block51;
                                v10 = Double.isNaN(var1_1.P()) ? 1 : 0;
                                if (var10_7 != null) break block52;
                                if (v10 != 0) break block51;
                                v10 = Double.isNaN(var1_1.W()) ? 1 : 0;
                                if (var10_7 != null) break block52;
                                if (v10 != 0) break block51;
                                v9 = var1_1;
                                if (var10_7 != null) break block50;
                                if (v9.f() == null) break block51;
                                v10 = var1_1.A ? 1 : 0;
                                if (var10_7 != null) break block52;
                                if (v10 != 0) break block51;
                                var16_17 = new n(var1_1);
                                var16_17.a(0, 1, 0);
                                var17_20 = var1_1.aG.d(var16_17).b().a((i)null);
                                var18_22 = var1_1.aG.d(var15_15).b().a((i)null);
                                var19_23 = var1_1.a(c.L) ? 1 : 0;
                                var20_25 = var1_1.aj() ? 1 : 0;
                                if ((var19_23 | (var17_20 == c.L ? 1 : 0) | (var18_22 == c.L ? 1 : 0) | var20_25) == 0) break block53;
                                var1_1.at += (float)(net.minecraft.client.r.k.m / 4.0);
                                if (var10_7 == null) break block51;
                            }
                            var1_1.at += (float)(net.minecraft.client.r.k.m * 2.0);
                        }
                        GL11.glRotatef((float)var1_1.e, (float)0.0f, (float)1.0f, (float)0.0f);
                        v9 = var1_1;
                    }
                    GL11.glRotatef((float)(v9.at + 90.0f), (float)1.0f, (float)0.0f, (float)0.0f);
                    v10 = var16_18 = 0;
                }
                while (var16_18 < var14_13) {
                    block56: {
                        block57: {
                            block58: {
                                block54: {
                                    block55: {
                                        v11 = var13_11.b();
                                        if (var10_7 != null) break block37;
                                        if (var10_7 != null) break block54;
                                        if (v11 == 0) break block55;
                                        v.M();
                                        v.d(0.3f, 0.3f, 0.3f);
                                        net.minecraft.client.r.k.o.a(var11_8, var13_11);
                                        v.B();
                                        if (var10_7 == null) break block56;
                                    }
                                    v.M();
                                    v.d(0.6f, 0.6f, 0.6f);
                                    v12 = var16_18;
                                }
                                if (var10_7 != null) break block57;
                                if (v12 <= 0) break block58;
                                v12 = net.minecraft.client.r.k.a();
                                if (var10_7 != null) break block57;
                                if (v12 != 0) {
                                    v.b(0.0f, 0.0f, 0.046875f * (float)var16_18);
                                }
                            }
                            net.minecraft.client.r.k.o.a(var11_8, var13_11);
                            v12 = net.minecraft.client.r.k.a() ? 1 : 0;
                        }
                        if (v12 == 0) {
                            v.b(0.0f, 0.0f, 0.046875f);
                        }
                        v.B();
                    }
                    ++var16_18;
                    if (var10_7 == null) continue;
                }
                v.B();
                v.u();
                v.f();
                net.minecraft.client.r.k.n.aQ().d.b(net.minecraft.client.j.j.x);
                if (var10_7 != null) return;
                v11 = var12_9;
            }
            if (v11 != 0) {
                net.minecraft.client.r.k.n.aQ().d.a(net.minecraft.client.j.j.x).b();
            }
        }
        super.d(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int a(t var1_1, double var2_2, double var4_3, double var6_4, float var8_5, Y var9_6) {
        block10: {
            block7: {
                block8: {
                    block9: {
                        block6: {
                            var11_7 = var1_1.m();
                            var10_8 = b.b();
                            var12_9 = var11_7.w();
                            if (var12_9 == null) {
                                return 0;
                            }
                            var13_10 = var9_6.d();
                            var14_11 = this.a(var11_7);
                            var15_12 = 0.25f;
                            v0 = cj.b.i.a(ca.class).i();
                            if (var10_8 != null) ** GOTO lbl15
                            if (v0 != 0) {
                                v1 = 0.0f;
                            } else {
                                v0 = var1_1.j();
lbl15:
                                // 2 sources

                                v1 = net.minecraft.k.h.g(((float)v0 + var8_5) / 10.0f + var1_1.aK) * 0.1f + 0.1f;
                            }
                            var16_13 = v1;
                            v.a(0.0f, 0.0f, 1.0f, 0.0f);
                            var17_14 = var9_6.c().c((net.minecraft.client.x.d)net.minecraft.client.x.d.GROUND).d.y;
                            v.b((float)var2_2, (float)var4_3 + var16_13 + 0.25f * var17_14, (float)var6_4);
                            v2 = cj.b.i.a(ca.class).i();
                            if (var10_8 != null) break block6;
                            if (v2 != 0) break block7;
                            v2 = var13_10;
                        }
                        if (var10_8 != null) break block8;
                        if (v2 != 0) break block9;
                        v3 = this;
                        if (var10_8 != null) break block10;
                        if (v3.h.q == null) break block7;
                    }
                    v2 = var1_1.j();
                }
                var18_15 = (((float)v2 + var8_5) / 20.0f + var1_1.aK) * 57.295776f;
                v.a(var18_15, 0.0f, 1.0f, 0.0f);
            }
            v3 = this;
        }
        v3.a = cj.b.i.a(ca.class).i() != false ? 0.0f : 0.15f;
        v.b(1.0f, 1.0f, 1.0f, 1.0f);
        return var14_11;
    }

    static {
        k = new Random();
        n = Q.P();
        o = n.Y();
    }

    public static boolean a() {
        return true;
    }
}

