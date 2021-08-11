/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.z;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.a;
import net.minecraft.w.aU;
import net.minecraft.w.d;

public class aG
extends K {
    protected static final /* synthetic */ k A;
    protected static final /* synthetic */ k z;
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k D;
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ f C;

    @Override
    public int d(i i2) {
        return i2.b(C);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C);
    }

    @Override
    public int b(i i2, net.minecraft.ah.z z2, n n2) {
        return i2.b(C);
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, n2);
    }

    @Override
    public void a(net.minecraft.ah.z z2, n n2, i i2, x x2) {
        block3: {
            x x3;
            int n3;
            block6: {
                int n4;
                block5: {
                    boolean bl2;
                    float f10;
                    block4: {
                        block2: {
                            n3 = i2.b(C);
                            f10 = (float)n2.b() + (6.0f + (float)(3 * n3)) / 16.0f;
                            bl2 = cL.e();
                            n4 = z2.C;
                            if (!bl2) break block2;
                            if (n4 != 0) break block3;
                            n4 = x2.p();
                        }
                        if (!bl2) break block4;
                        if (n4 == 0) break block3;
                        n4 = n3;
                    }
                    if (!bl2) break block5;
                    if (n4 <= 0) break block3;
                    x3 = x2;
                    if (!bl2) break block6;
                    double d10 = x3.m().b - (double)f10;
                    n4 = (int)(d10 == 0.0 ? false : (d10 < 0.0 ? BADBOOL -1 : true));
                }
                if (n4 > 0) break block3;
                x3 = x2;
            }
            x3.T();
            this.b(z2, n2, i2, n3 - 1);
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ah.z var1_1, n var2_2, i var3_3, j var4_4, a3 var5_5, aA var6_6, float var7_7, float var8_8, float var9_9) {
        block59: {
            block60: {
                block61: {
                    block56: {
                        block58: {
                            block57: {
                                block48: {
                                    block49: {
                                        block50: {
                                            block55: {
                                                block53: {
                                                    block54: {
                                                        block51: {
                                                            block52: {
                                                                block42: {
                                                                    block43: {
                                                                        block44: {
                                                                            block45: {
                                                                                block46: {
                                                                                    block47: {
                                                                                        var11_10 = var4_4.c(var5_5);
                                                                                        var10_11 = cL.e();
                                                                                        v0 = var11_10.G();
                                                                                        if (var10_11) {
                                                                                            if (v0 != 0) {
                                                                                                return true;
                                                                                            }
                                                                                            v0 = var3_3.b(aG.C);
                                                                                        }
                                                                                        var12_12 = v0;
                                                                                        v1 = var13_13 = var11_10.w();
                                                                                        v2 = net.minecraft.u.h.ah;
                                                                                        if (var10_11) {
                                                                                            if (v1 == v2) {
                                                                                                v3 = var12_12;
                                                                                                if (var10_11 == false) return (boolean)v3;
                                                                                                if (v3 >= 3) return (boolean)1;
                                                                                                v3 = (int)var1_1.C;
                                                                                                if (var10_11 == false) return (boolean)v3;
                                                                                                if (v3 != 0) return (boolean)1;
                                                                                                v4 = var4_4;
                                                                                                if (var10_11) {
                                                                                                    if (!v4.cw.g) {
                                                                                                        var4_4.a(var5_5, new d(net.minecraft.u.h.P));
                                                                                                    }
                                                                                                    v4 = var4_4;
                                                                                                }
                                                                                                v4.b(net.minecraft.l.m.F);
                                                                                                this.b(var1_1, var2_2, var3_3, 3);
                                                                                                var1_1.a(null, var2_2, net.minecraft.u.E.cp, ay.BLOCKS, 1.0f, 1.0f);
                                                                                                return (boolean)1;
                                                                                            }
                                                                                            v1 = var13_13;
                                                                                            v2 = net.minecraft.u.h.P;
                                                                                        }
                                                                                        if (!var10_11) break block42;
                                                                                        if (v1 != v2) break block43;
                                                                                        v5 = var12_12;
                                                                                        if (var10_11 == false) return (boolean)v5;
                                                                                        if (v5 != 3) return (boolean)1;
                                                                                        v5 = var1_1.C;
                                                                                        if (var10_11 == false) return (boolean)v5;
                                                                                        if (v5 != 0) return (boolean)1;
                                                                                        v6 = var4_4;
                                                                                        if (!var10_11) break block44;
                                                                                        if (v6.cw.g) break block45;
                                                                                        var11_10.b(1);
                                                                                        v7 = var11_10.G();
                                                                                        if (!var10_11) break block46;
                                                                                        if (!v7) break block47;
                                                                                        var4_4.a(var5_5, new d(net.minecraft.u.h.ah));
                                                                                        if (var10_11) break block45;
                                                                                    }
                                                                                    v6 = var4_4;
                                                                                    if (!var10_11) break block44;
                                                                                    v7 = v6.cB.b(new d(net.minecraft.u.h.ah));
                                                                                }
                                                                                if (!v7) {
                                                                                    var4_4.a(new d(net.minecraft.u.h.ah), false);
                                                                                }
                                                                            }
                                                                            v6 = var4_4;
                                                                        }
                                                                        v6.b(net.minecraft.l.m.ac);
                                                                        this.b(var1_1, var2_2, var3_3, 0);
                                                                        var1_1.a(null, var2_2, net.minecraft.u.E.gl, ay.BLOCKS, 1.0f, 1.0f);
                                                                        return (boolean)1;
                                                                    }
                                                                    v1 = var13_13;
                                                                    if (!var10_11) break block48;
                                                                    v2 = net.minecraft.u.h.ch;
                                                                }
                                                                if (v1 != v2) break block49;
                                                                v8 = var12_12;
                                                                if (var10_11 == false) return (boolean)v8;
                                                                if (v8 <= 0) return (boolean)1;
                                                                v8 = (int)var1_1.C;
                                                                if (var10_11 == false) return (boolean)v8;
                                                                if (v8 != 0) return (boolean)1;
                                                                if (var4_4.cw.g) break block50;
                                                                var14_14 = net.minecraft.K.k.a(new d(net.minecraft.u.h.V), net.minecraft.u.a.u);
                                                                var4_4.b(net.minecraft.l.m.ac);
                                                                var11_10.b(1);
                                                                v9 = var11_10.G();
                                                                if (!var10_11) break block51;
                                                                if (!v9) break block52;
                                                                var4_4.a(var5_5, var14_14);
                                                                if (var10_11) break block50;
                                                            }
                                                            v9 = var4_4.cB.b(var14_14);
                                                        }
                                                        if (!var10_11) break block53;
                                                        if (v9) break block54;
                                                        var4_4.a(var14_14, false);
                                                        if (var10_11) break block50;
                                                    }
                                                    v10 = var4_4;
                                                    if (!var10_11) break block55;
                                                    v9 = v10 instanceof net.minecraft.i.k;
                                                }
                                                if (!v9) break block50;
                                                v10 = var4_4;
                                            }
                                            ((net.minecraft.i.k)v10).a(var4_4.cu);
                                        }
                                        var1_1.a(null, var2_2, net.minecraft.u.E.g7, ay.BLOCKS, 1.0f, 1.0f);
                                        this.b(var1_1, var2_2, var3_3, var12_12 - 1);
                                        return (boolean)1;
                                    }
                                    v1 = var13_13;
                                }
                                if (v1 != net.minecraft.u.h.V || net.minecraft.K.k.d(var11_10) != net.minecraft.u.a.u) break block56;
                                v11 = var12_12;
                                if (var10_11 == false) return (boolean)v11;
                                if (v11 >= 3) return (boolean)1;
                                v11 = (int)var1_1.C;
                                if (var10_11 == false) return (boolean)v11;
                                if (v11 != 0) return (boolean)1;
                                if (var4_4.cw.g) break block57;
                                var14_15 = new d(net.minecraft.u.h.ch);
                                var4_4.b(net.minecraft.l.m.ac);
                                var4_4.a(var5_5, var14_15);
                                if (!var10_11) break block58;
                                if (var4_4 instanceof net.minecraft.i.k) {
                                    ((net.minecraft.i.k)var4_4).a(var4_4.cu);
                                }
                            }
                            var1_1.a(null, var2_2, net.minecraft.u.E.hz, ay.BLOCKS, 1.0f, 1.0f);
                        }
                        this.b(var1_1, var2_2, var3_3, var12_12 + 1);
                        return (boolean)1;
                    }
                    v12 = var12_12;
                    if (!var10_11) break block59;
                    if (v12 <= 0) break block60;
                    v12 = var13_13 instanceof net.minecraft.w.m;
                    if (!var10_11) break block59;
                    if (v12 == 0) break block60;
                    var14_16 = (net.minecraft.w.m)var13_13;
                    v13 = var14_16;
                    if (!var10_11) break block61;
                    if (v13.c() != aU.LEATHER) break block60;
                    v13 = var14_16;
                }
                v12 = (int)v13.a(var11_10);
                if (var10_11) {
                    if (v12 != 0) {
                        v12 = (int)var1_1.C;
                        if (var10_11) {
                            if (v12 == 0) {
                                var14_16.b(var11_10);
                                this.b(var1_1, var2_2, var3_3, var12_12 - 1);
                                var4_4.b(net.minecraft.l.m.R);
                                return true;
                            } else {
                                ** GOTO lbl152
                            }
                        } else {
                            ** GOTO lbl151
                        }
                    } else {
                        ** GOTO lbl150
                    }
                }
                break block59;
lbl150:
                // 2 sources

                break block60;
lbl151:
                // 2 sources

                break block59;
            }
            v12 = var12_12;
        }
        if (var10_11 == false) return (boolean)v12;
        if (v12 <= 0) return (boolean)0;
        v12 = var13_13 instanceof net.minecraft.w.t;
        if (var10_11 == false) return (boolean)v12;
        if (v12 == 0) return (boolean)0;
        v14 = net.minecraft.N.z.b(var11_10);
        if (var10_11 == false) return (boolean)v14;
        if (v14 <= 0) return (boolean)1;
        v14 = (int)var1_1.C;
        if (var10_11 == false) return (boolean)v14;
        if (v14 != 0) return (boolean)1;
        var14_16 = var11_10.C();
        var14_16.c(1);
        net.minecraft.N.z.a((d)var14_16);
        var4_4.b(net.minecraft.l.m.ab);
        v14 = (int)var4_4.cw.g;
        if (var10_11) {
            if (v14 == 0) {
                var11_10.b(1);
                this.b(var1_1, var2_2, var3_3, var12_12 - 1);
            }
            v14 = (int)var11_10.G();
        }
        if (var10_11) {
            if (v14 != 0) {
                var4_4.a(var5_5, (d)var14_16);
                if (var10_11 != false) return (boolean)1;
            }
            v14 = (int)var4_4.cB.b((d)var14_16);
        }
        if (var10_11) {
            if (v14 == 0) {
                var4_4.a((d)var14_16, false);
                if (var10_11 != false) return (boolean)1;
            }
            v14 = var4_4 instanceof net.minecraft.i.k;
        }
        if (var10_11 == false) return (boolean)v14;
        if (v14 == 0) return (boolean)1;
        ((net.minecraft.i.k)var4_4).a(var4_4.cu);
        return (boolean)1;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.a1;
    }

    @Override
    public void a(i i2, net.minecraft.ah.z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        aG.a(n2, k2, list, B);
        aG.a(n2, k2, list, z);
        aG.a(n2, k2, list, E);
        aG.a(n2, k2, list, A);
        aG.a(n2, k2, list, D);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(net.minecraft.ah.z z2, n n2, i i2, int n3) {
        z2.a(n2, i2.a(C, net.minecraft.k.h.c(n3, 0, 3)), 2);
        z2.b(n2, this);
    }

    @Override
    public boolean a(t t2, n n2) {
        return true;
    }

    @Override
    public void b(net.minecraft.ah.z z2, n n2) {
        block5: {
            net.minecraft.ah.z z3;
            boolean bl2;
            block6: {
                net.minecraft.ah.z z4;
                block4: {
                    bl2 = cL.b();
                    z4 = z2;
                    if (bl2) break block4;
                    if (z4.J.nextInt(20) != 1) break block5;
                    z4 = z2;
                }
                float f10 = z4.c(n2).a(n2);
                z3 = z2;
                if (bl2) break block6;
                if (!(z3.B().a(f10, n2.b()) >= 0.15f)) break block5;
                z3 = z2;
            }
            i i2 = z3.d(n2);
            int n3 = i2.b(C);
            if (!bl2 && n3 < 3) {
                n3 = (int)((z2.a(n2, i2.a(C), 2) ? true : false) ? true : false);
            }
        }
    }

    static {
        C = f.a("level", 0, 3);
        B = new k(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0);
        E = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.125);
        D = new k(0.0, 0.0, 0.875, 1.0, 1.0, 1.0);
        A = new k(0.875, 0.0, 0.0, 1.0, 1.0, 1.0);
        z = new k(0.0, 0.0, 0.0, 0.125, 1.0, 1.0);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return k;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        aA aA3 = aA2;
        aA aA4 = aA.UP;
        if (!bl2) {
            if (aA3 == aA4) {
                return net.minecraft.Z.d.BOWL;
            }
            aA3 = aA2;
            aA4 = aA.DOWN;
        }
        return aA3 == aA4 ? net.minecraft.Z.d.UNDEFINED : net.minecraft.Z.d.SOLID;
    }

    @Override
    public d c(net.minecraft.ah.z z2, n n2, i i2) {
        return new d(net.minecraft.u.h.a1);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    public aG() {
        super(net.minecraft.ac.c.D, net.minecraft.ac.a.T);
        this.h(this.e.a().a(C, 0));
    }
}

