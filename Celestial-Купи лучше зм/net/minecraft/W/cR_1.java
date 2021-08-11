/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.aL;
import net.minecraft.W.as;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.ae;
import net.minecraft.ar.av;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class cR
extends K {
    public static final /* synthetic */ c E;
    public static final /* synthetic */ c C;
    protected static final /* synthetic */ k G;
    public static final /* synthetic */ c J;
    protected static final /* synthetic */ k I;
    public static final /* synthetic */ c D;
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ c z;
    protected static final /* synthetic */ k B;
    protected static final /* synthetic */ k H;
    public static final /* synthetic */ c[] F;

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d();
        boolean bl3 = n2 & 1;
        if (bl2) {
            bl3 = bl3 > false;
        }
        i i3 = i2.a(E, bl3);
        boolean bl4 = n2 & 2;
        if (bl2) {
            bl4 = bl4 > false;
        }
        i i4 = i3.a(D, bl4);
        boolean bl5 = n2 & 4;
        if (bl2) {
            bl5 = bl5 > false;
        }
        i i5 = i4.a(J, bl5);
        boolean bl6 = n2 & 8;
        if (bl2) {
            bl6 = bl6 > false;
        }
        return i5.a(C, bl6);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        int n3 = i2.b(E).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= 1;
            }
            n3 = i2.b(D).booleanValue();
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 2;
            }
            n3 = i2.b(J).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 4;
            }
            n3 = i2.b(C).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(z z2, n n2, aA aA2) {
        i i2 = z2.d(n2);
        boolean bl2 = cL.e();
        i i3 = i2;
        if (bl2) {
            if (i3.c(z2, n2, aA2) != net.minecraft.Z.d.SOLID) return false;
            i3 = i2;
        }
        boolean bl3 = cR.b(i3.b());
        if (!bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public i a(i i2, ae ae2) {
        switch (ae2) {
            case CLOCKWISE_180: {
                return i2.a(J, i2.b(E)).a(C, i2.b(D)).a(E, i2.b(J)).a(D, i2.b(C));
            }
            case COUNTERCLOCKWISE_90: {
                return i2.a(J, i2.b(C)).a(C, i2.b(E)).a(E, i2.b(D)).a(D, i2.b(J));
            }
            case CLOCKWISE_90: {
                return i2.a(J, i2.b(D)).a(C, i2.b(J)).a(E, i2.b(C)).a(D, i2.b(E));
            }
        }
        return i2;
    }

    public static int a(i i2) {
        int n2;
        block4: {
            int n3 = 0;
            c[] arrc = F;
            int n4 = arrc.length;
            boolean bl2 = cL.e();
            int n5 = 0;
            while (n5 < n4) {
                c c10 = arrc[n5];
                if (bl2) {
                    n2 = i2.b(c10).booleanValue() ? 1 : 0;
                    if (!bl2) break block4;
                    if (n2 != 0) {
                        ++n3;
                    }
                    ++n5;
                }
                if (bl2) continue;
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, n var2_2, i var3_3, Random var4_4) {
        block59: {
            block82: {
                block83: {
                    block84: {
                        block85: {
                            block58: {
                                block81: {
                                    block68: {
                                        block69: {
                                            block80: {
                                                block70: {
                                                    block73: {
                                                        block79: {
                                                            block78: {
                                                                block76: {
                                                                    block77: {
                                                                        block74: {
                                                                            block75: {
                                                                                block71: {
                                                                                    block72: {
                                                                                        block62: {
                                                                                            block60: {
                                                                                                block61: {
                                                                                                    block66: {
                                                                                                        block67: {
                                                                                                            block57: {
                                                                                                                var5_5 = cL.b();
                                                                                                                v0 = var1_1.C;
                                                                                                                if (!var5_5) {
                                                                                                                    if (v0 != 0) return;
                                                                                                                    v0 = var1_1.J.nextInt(4);
                                                                                                                }
                                                                                                                if (!var5_5) {
                                                                                                                    if (v0 != 0) return;
                                                                                                                    v0 = 4;
                                                                                                                }
                                                                                                                var6_6 = v0;
                                                                                                                var7_7 = 5;
                                                                                                                var8_8 = false;
                                                                                                                var9_9 = -4;
                                                                                                                block0: while (true) {
                                                                                                                    v1 = var9_9;
                                                                                                                    block1: while (v1 <= 4) {
                                                                                                                        if (var5_5 != false) return;
                                                                                                                        var10_11 = -4;
                                                                                                                        while (var10_11 <= 4) {
                                                                                                                            block56: {
                                                                                                                                v1 = -1;
                                                                                                                                if (var5_5) continue block1;
                                                                                                                                var11_13 = v1;
                                                                                                                                while (var11_13 <= 1) {
                                                                                                                                    if (!var5_5) {
                                                                                                                                        if (var1_1.d(var2_2.a(var9_9, var11_13, var10_11)).b() == this) {
                                                                                                                                            --var7_7;
                                                                                                                                            if (!var5_5) {
                                                                                                                                                if (var7_7 <= 0) {
                                                                                                                                                    var8_8 = true;
                                                                                                                                                    if (!var5_5) break block0;
                                                                                                                                                } else {
                                                                                                                                                    ** GOTO lbl-1000
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } else lbl-1000:
                                                                                                                                        // 4 sources

                                                                                                                                        {
                                                                                                                                            ++var11_13;
                                                                                                                                        }
                                                                                                                                        if (!var5_5) continue;
                                                                                                                                    }
                                                                                                                                    break block56;
                                                                                                                                }
                                                                                                                                ++var10_11;
                                                                                                                            }
                                                                                                                            if (!var5_5) continue;
                                                                                                                        }
                                                                                                                        ++var9_9;
                                                                                                                        if (!var5_5) continue block0;
                                                                                                                    }
                                                                                                                    break;
                                                                                                                }
                                                                                                                var9_10 = aA.a(var4_4);
                                                                                                                var10_12 = var2_2.a();
                                                                                                                v2 = var9_10;
                                                                                                                if (var5_5) break block60;
                                                                                                                if (v2 != aA.UP) break block61;
                                                                                                                v3 = var2_2.b();
                                                                                                                if (var5_5) break block62;
                                                                                                                if (v3 >= 255) break block61;
                                                                                                                v3 = var1_1.a(var10_12) ? 1 : 0;
                                                                                                                if (var5_5) break block62;
                                                                                                                if (v3 == 0) break block61;
                                                                                                                var11_14 = var3_3;
                                                                                                                for (Object var13_19 : av.HORIZONTAL) {
                                                                                                                    block65: {
                                                                                                                        block64: {
                                                                                                                            block63: {
                                                                                                                                v4 = var4_4.nextBoolean();
                                                                                                                                if (var5_5) break block57;
                                                                                                                                if (var5_5) break block63;
                                                                                                                                if (!v4) break block64;
                                                                                                                                v5 = this.c(var1_1, var10_12, var13_19.h());
                                                                                                                            }
                                                                                                                            if (!v5) break block64;
                                                                                                                            var11_14 = var11_14.a(cR.a((aA)var13_19), true);
                                                                                                                            if (!var5_5) break block65;
                                                                                                                        }
                                                                                                                        var11_14 = var11_14.a(cR.a((aA)var13_19), false);
                                                                                                                    }
                                                                                                                    if (!var5_5) continue;
                                                                                                                }
                                                                                                                v4 = var11_14.b(cR.J);
                                                                                                            }
                                                                                                            if (var5_5) break block66;
                                                                                                            if (v4) break block67;
                                                                                                            v4 = var11_14.b(cR.C);
                                                                                                            if (var5_5) break block66;
                                                                                                            if (v4) break block67;
                                                                                                            v4 = var11_14.b(cR.E);
                                                                                                            if (var5_5) break block66;
                                                                                                            if (v4) break block67;
                                                                                                            v4 = var11_14.b(cR.D);
                                                                                                            if (var5_5 || !v4) break block66;
                                                                                                        }
                                                                                                        v4 = var1_1.a(var10_12, var11_14, 2);
                                                                                                    }
                                                                                                    if (var5_5 == false) return;
                                                                                                }
                                                                                                v2 = var9_10;
                                                                                            }
                                                                                            v3 = v2.g().d();
                                                                                        }
                                                                                        if (var5_5) break block68;
                                                                                        if (v3 == 0) break block69;
                                                                                        v3 = var3_3.b(cR.a(var9_10)).booleanValue() ? 1 : 0;
                                                                                        if (var5_5) break block68;
                                                                                        if (v3 != 0) break block69;
                                                                                        if (var8_8 != false) return;
                                                                                        var11_16 = var2_2.a(var9_10);
                                                                                        var12_18 = var1_1.d(var11_16);
                                                                                        var13_19 = var12_18.b();
                                                                                        if (var13_19.y != net.minecraft.ac.c.A) break block70;
                                                                                        var14_20 = var9_10.l();
                                                                                        var15_21 = var9_10.d();
                                                                                        var16_22 = var3_3.b(cR.a((aA)var14_20));
                                                                                        var17_25 = var3_3.b(cR.a(var15_21));
                                                                                        var18_27 = var11_16.a((aA)var14_20);
                                                                                        var19_28 = var11_16.a(var15_21);
                                                                                        v6 = var16_22;
                                                                                        if (var5_5) break block71;
                                                                                        if (!v6) break block72;
                                                                                        v6 = this.c(var1_1, var18_27.a((aA)var14_20), (aA)var14_20);
                                                                                        if (var5_5) break block71;
                                                                                        if (!v6) break block72;
                                                                                        var1_1.a(var11_16, this.d().a(cR.a((aA)var14_20), true), 2);
                                                                                        if (!var5_5) break block73;
                                                                                    }
                                                                                    v6 = var17_25;
                                                                                }
                                                                                if (var5_5) break block74;
                                                                                if (!v6) break block75;
                                                                                v6 = this.c(var1_1, var19_28.a(var15_21), var15_21);
                                                                                if (var5_5) break block74;
                                                                                if (!v6) break block75;
                                                                                var1_1.a(var11_16, this.d().a(cR.a(var15_21), true), 2);
                                                                                if (!var5_5) break block73;
                                                                            }
                                                                            v6 = var16_22;
                                                                        }
                                                                        if (var5_5) break block76;
                                                                        if (!v6) break block77;
                                                                        v6 = var1_1.a(var18_27);
                                                                        if (var5_5) break block76;
                                                                        if (!v6) break block77;
                                                                        v6 = this.c(var1_1, var18_27, var9_10);
                                                                        if (var5_5) break block76;
                                                                        if (!v6) break block77;
                                                                        var1_1.a(var18_27, this.d().a(cR.a(var9_10.h()), true), 2);
                                                                        if (!var5_5) break block73;
                                                                    }
                                                                    v6 = var17_25;
                                                                }
                                                                if (var5_5) break block78;
                                                                if (!v6) break block73;
                                                                v6 = var1_1.a(var19_28);
                                                            }
                                                            if (var5_5) break block79;
                                                            if (!v6) break block73;
                                                            v6 = this.c(var1_1, var19_28, var9_10);
                                                        }
                                                        if (!var5_5 && v6) {
                                                            v6 = var1_1.a(var19_28, this.d().a(cR.a(var9_10.h()), true), 2);
                                                        }
                                                    }
                                                    if (!var5_5) break block80;
                                                }
                                                if (var12_18.c(var1_1, var11_16, var9_10) == net.minecraft.Z.d.SOLID) {
                                                    var1_1.a(var2_2, var3_3.a(cR.a(var9_10), true), 2);
                                                }
                                            }
                                            if (var5_5 == false) return;
                                        }
                                        v7 = var2_2;
                                        if (var5_5) break block81;
                                        v3 = v7.b();
                                    }
                                    if (v3 <= 1) return;
                                    v7 = var2_2.k();
                                }
                                var11_17 = v7;
                                var12_18 = var1_1.d(var11_17);
                                var13_19 = var12_18.b();
                                v8 = var13_19;
                                if (var5_5) break block82;
                                if (v8.y != net.minecraft.ac.c.A) break block83;
                                var14_20 = var3_3;
                                for (aA var16_23 : av.HORIZONTAL) {
                                    v9 = var4_4.nextBoolean();
                                    if (!var5_5) {
                                        if (v9) {
                                            var14_20 = var14_20.a(cR.a(var16_23), false);
                                        }
                                        if (!var5_5) continue;
                                    }
                                    break block58;
                                }
                                v9 = var14_20.b(cR.J);
                            }
                            if (var5_5) break block84;
                            if (v9) break block85;
                            v9 = var14_20.b(cR.C);
                            if (var5_5) break block84;
                            if (v9) break block85;
                            v9 = var14_20.b(cR.E);
                            if (var5_5) break block84;
                            if (v9) break block85;
                            v9 = var14_20.b(cR.D);
                            if (var5_5 || !v9) break block84;
                        }
                        v9 = var1_1.a(var11_17, (i)var14_20, 2);
                    }
                    if (var5_5 == false) return;
                }
                v8 = var13_19;
            }
            if (v8 != this) return;
            var14_20 = var12_18;
            for (aA var16_24 : av.HORIZONTAL) {
                block87: {
                    block88: {
                        block86: {
                            var17_26 = cR.a(var16_24);
                            v10 = var4_4.nextBoolean();
                            if (var5_5) break block59;
                            if (var5_5) break block86;
                            if (!v10) break block87;
                            v11 = var3_3;
                            v12 = var17_26;
                            if (var5_5) break block88;
                            v13 = v11.b(v12);
                        }
                        if (!v13) break block87;
                        v11 = var14_20;
                        v12 = var17_26;
                    }
                    var14_20 = v11.a(v12, true);
                }
                if (!var5_5) continue;
            }
            v10 = var14_20.b(cR.J);
        }
        if (var5_5 != false) return;
        if (!v10) {
            v10 = var14_20.b(cR.C);
            if (var5_5 != false) return;
            if (!v10) {
                v10 = var14_20.b(cR.E);
                if (var5_5 != false) return;
                if (!v10) {
                    v10 = var14_20.b(cR.D);
                    if (var5_5 != false) return;
                    if (v10 == false) return;
                }
            }
        }
        v10 = var1_1.a(var11_17, (i)var14_20, 2);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    static {
        z = net.minecraft.ae.c.a("up");
        J = net.minecraft.ae.c.a("north");
        C = net.minecraft.ae.c.a("east");
        E = net.minecraft.ae.c.a("south");
        D = net.minecraft.ae.c.a("west");
        F = new c[]{z, J, E, D, C};
        I = new k(0.0, 0.9375, 0.0, 1.0, 1.0, 1.0);
        G = new k(0.0, 0.0, 0.0, 0.0625, 1.0, 1.0);
        B = new k(0.9375, 0.0, 0.0, 1.0, 1.0, 1.0);
        H = new k(0.0, 0.0, 0.0, 1.0, 1.0, 0.0625);
        A = new k(0.0, 0.0, 0.9375, 1.0, 1.0, 1.0);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        switch (h2) {
            case LEFT_RIGHT: {
                return i2.a(J, i2.b(E)).a(E, i2.b(J));
            }
            case FRONT_BACK: {
                return i2.a(C, i2.b(D)).a(D, i2.b(C));
            }
        }
        return super.a(i2, h2);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        n n3 = n2.a();
        return i2.a(z, t2.d(n3).c(t2, n3, aA.DOWN) == net.minecraft.Z.d.SOLID);
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.e();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                cR.a(z2, n2, new d(g.aW, 1, 0));
                if (bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, J, C, E, D);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public boolean b(t t2, n n2) {
        return true;
    }

    public static c a(aA aA2) {
        switch (aA2) {
            case UP: {
                return z;
            }
            case NORTH: {
                return J;
            }
            case SOUTH: {
                return E;
            }
            case WEST: {
                return D;
            }
            case EAST: {
                return C;
            }
        }
        throw new IllegalArgumentException(aA2 + " is an invalid choice");
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            boolean bl3;
            block4: {
                bl3 = cL.b();
                bl2 = z2.C;
                if (bl3) break block4;
                if (bl2) break block5;
                bl2 = this.a(z2, n2, i2);
            }
            if (!bl3 && !bl2) {
                this.a(z2, n2, i2, 0);
                bl2 = z2.v(n2);
            }
        }
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        i i2 = this.d().a(z, false).a(J, false).a(C, false).a(E, false).a(D, false);
        return aA2.g().d() ? i2.a(cR.a(aA2.h()), true) : i2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(K k2) {
        K k3;
        boolean bl2;
        block12: {
            aL aL2;
            block11: {
                block10: {
                    K k4;
                    block9: {
                        bl2 = cL.b();
                        boolean bl3 = k2 instanceof as;
                        if (bl2) return bl3;
                        if (bl3) return true;
                        k3 = k2;
                        if (!bl2) {
                            if (k3 == g.bX) return true;
                            k3 = k2;
                        }
                        k4 = g.aH;
                        if (bl2) break block9;
                        if (k3 == k4) return true;
                        k3 = k2;
                        if (bl2) break block10;
                        k4 = g.a;
                    }
                    if (k3 == k4) return true;
                    k3 = k2;
                }
                if (!bl2) {
                    if (k3 == g.a5) return true;
                    k3 = k2;
                }
                aL2 = g.cr;
                if (bl2) break block11;
                if (k3 == aL2) return true;
                k3 = k2;
                if (bl2) break block12;
                aL2 = g.M;
            }
            if (k3 == aL2) return true;
            k3 = k2;
        }
        K k5 = g.bi;
        if (!bl2) {
            if (k3 == k5) return true;
            K k5 = k2;
            k5 = g.cI;
        }
        if (k3 != k5) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        aA aA3 = aA2;
        aA aA4 = aA.DOWN;
        if (!bl2) {
            if (aA3 == aA4) return false;
            aA3 = aA2;
            aA4 = aA.UP;
        }
        if (aA3 == aA4) return false;
        boolean bl3 = this.c(z2, n2, aA2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = i2.c(t2, n2);
        int n3 = 0;
        boolean bl2 = cL.e();
        k k2 = k;
        int n4 = i2.b(z).booleanValue();
        if (bl2) {
            if (n4 != 0) {
                k2 = I;
                ++n3;
            }
            n4 = i2.b(J).booleanValue();
        }
        if (bl2) {
            if (n4 != 0) {
                k2 = H;
                ++n3;
            }
            n4 = i2.b(C).booleanValue();
        }
        if (bl2) {
            if (n4 != 0) {
                k2 = B;
                ++n3;
            }
            n4 = i2.b(E).booleanValue();
        }
        if (bl2) {
            if (n4 != 0) {
                k2 = A;
                ++n3;
            }
            n4 = i2.b(D).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n4 != 0) {
                k2 = G;
            }
            n4 = ++n3;
        }
        return n4 == 1 ? k2 : k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(z z2, n n2, aA aA2) {
        K k2 = z2.d(n2.a()).b();
        boolean bl2 = cL.e();
        K k3 = this;
        if (bl2) {
            if (!((cR)k3).b(z2, n2.a(aA2.h()), aA2)) return false;
            k3 = k2;
        }
        K k4 = g.bf;
        if (bl2) {
            if (k3 == k4) return true;
            k3 = k2;
            k4 = g.aW;
        }
        if (k3 == k4) return true;
        boolean bl3 = this.b(z2, n2.a(), aA.UP);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private boolean a(z z2, n n2, i i2) {
        block14: {
            i i3;
            block13: {
                int n3;
                i i4;
                block8: {
                    i4 = i2;
                    boolean bl2 = cL.b();
                    for (aA aA2 : av.HORIZONTAL) {
                        block10: {
                            c c10;
                            i i5;
                            i i6;
                            block12: {
                                c c11;
                                block11: {
                                    i i7;
                                    boolean bl3;
                                    block9: {
                                        c11 = cR.a(aA2);
                                        n3 = i2.b(c11).booleanValue() ? 1 : 0;
                                        if (bl2) break block8;
                                        if (bl2) break block9;
                                        if (n3 == 0) break block10;
                                        bl3 = this.c(z2, n2, aA2.h());
                                    }
                                    if (bl3) break block10;
                                    i6 = i7 = z2.d(n2.a());
                                    if (bl2) break block10;
                                    if (i6.b() != this) break block11;
                                    i5 = i7;
                                    c10 = c11;
                                    if (bl2) break block12;
                                    if (i5.b(c10).booleanValue()) break block10;
                                }
                                i5 = i2;
                                c10 = c11;
                            }
                            i6 = i2 = i5.a(c10, false);
                        }
                        if (!bl2) continue;
                    }
                    i3 = i2;
                    if (bl2) break block13;
                    n3 = cR.a(i3);
                }
                if (n3 == 0) {
                    return false;
                }
                i3 = i4;
            }
            if (i3 == i2) break block14;
            z2.a(n2, i2, 2);
        }
        return true;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    public cR() {
        super(net.minecraft.ac.c.z);
        this.h(this.e.a().a(z, false).a(J, false).a(C, false).a(E, false).a(D, false));
        this.a(true);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }
}

