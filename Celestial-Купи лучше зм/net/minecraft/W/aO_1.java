/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.I;
import net.minecraft.N.y;
import net.minecraft.W.C;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.a;
import net.minecraft.W.aE;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.ci;
import net.minecraft.W.d0;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ae.f;
import net.minecraft.ah.T;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.s;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aO
extends ak {
    public static final /* synthetic */ d<a> A;
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ f z;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i e(i var1_1, t var2_2, n var3_3) {
        block43: {
            block42: {
                var5_4 = net.minecraft.W.a.EMPTY;
                var4_5 = cL.e();
                v0 = var2_2;
                if (!var4_5) ** GOTO lbl9
                if (v0 instanceof T) {
                    v1 = ((T)var2_2).a(var3_3, net.minecraft.o.j.CHECK);
                } else {
                    v0 = var2_2;
lbl9:
                    // 2 sources

                    v1 = v0.b(var3_3);
                }
                v2 = var6_6 = v1;
                if (var4_5) {
                    if (v2 instanceof I == false) return var1_1.a(aO.A, var5_4);
                    v2 = var6_6;
                }
                var7_7 = (I)v2;
                var8_8 = var7_7.a();
                v3 = var8_8 instanceof s;
                if (var4_5) {
                    if (v3 == 0) return var1_1.a(aO.A, var5_4);
                    v3 = var7_7.c();
                }
                var9_9 = v3;
                v4 = var10_10 = K.a(var8_8);
                if (var4_5) {
                    if (v4 == g.dj) {
                        switch (d0.b[D.a(var9_9).ordinal()]) {
                            case 1: {
                                var5_4 = net.minecraft.W.a.OAK_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 2: {
                                var5_4 = net.minecraft.W.a.SPRUCE_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 3: {
                                var5_4 = net.minecraft.W.a.BIRCH_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 4: {
                                var5_4 = net.minecraft.W.a.JUNGLE_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 5: {
                                var5_4 = net.minecraft.W.a.ACACIA_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 6: {
                                var5_4 = net.minecraft.W.a.DARK_OAK_SAPLING;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                        }
                        var5_4 = net.minecraft.W.a.EMPTY;
                        if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                    }
                    v4 = var10_10;
                }
                if (var4_5) {
                    if (v4 == g.dc) {
                        switch (var9_9) {
                            case 0: {
                                var5_4 = net.minecraft.W.a.DEAD_BUSH;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 2: {
                                var5_4 = net.minecraft.W.a.FERN;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                        }
                        var5_4 = net.minecraft.W.a.EMPTY;
                        if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                    }
                    v4 = var10_10;
                }
                v5 /* !! */  = g.cZ;
                if (var4_5) {
                    if (v4 == v5 /* !! */ ) {
                        var5_4 = net.minecraft.W.a.DANDELION;
                        if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                    }
                    v4 = var10_10;
                    v5 /* !! */  = g.cj;
                }
                if (var4_5) {
                    if (v4 == v5 /* !! */ ) {
                        switch (d0.a[C.a(ci.RED, var9_9).ordinal()]) {
                            case 1: {
                                var5_4 = net.minecraft.W.a.POPPY;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 2: {
                                var5_4 = net.minecraft.W.a.BLUE_ORCHID;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 3: {
                                var5_4 = net.minecraft.W.a.ALLIUM;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 4: {
                                var5_4 = net.minecraft.W.a.HOUSTONIA;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 5: {
                                var5_4 = net.minecraft.W.a.RED_TULIP;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 6: {
                                var5_4 = net.minecraft.W.a.ORANGE_TULIP;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 7: {
                                var5_4 = net.minecraft.W.a.WHITE_TULIP;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 8: {
                                var5_4 = net.minecraft.W.a.PINK_TULIP;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                            case 9: {
                                var5_4 = net.minecraft.W.a.OXEYE_DAISY;
                                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                            }
                        }
                        var5_4 = net.minecraft.W.a.EMPTY;
                        if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                    }
                    v4 = var10_10;
                    v5 /* !! */  = g.z;
                }
                if (!var4_5) break block42;
                if (v4 == v5 /* !! */ ) {
                    var5_4 = net.minecraft.W.a.MUSHROOM_RED;
                    if (var4_5 != false) return var1_1.a(aO.A, var5_4);
                }
                v4 = var10_10;
                if (!var4_5) break block43;
                v5 /* !! */  = g.cg;
            }
            if (v4 == v5 /* !! */ ) {
                var5_4 = net.minecraft.W.a.MUSHROOM_BROWN;
                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
            }
            v4 = var10_10;
        }
        if (var4_5) {
            if (v4 == g.b9) {
                var5_4 = net.minecraft.W.a.DEAD_BUSH;
                if (var4_5 != false) return var1_1.a(aO.A, var5_4);
            }
            v4 = var10_10;
        }
        if (v4 != g.aA) return var1_1.a(aO.A, var5_4);
        var5_4 = net.minecraft.W.a.CACTUS;
        return var1_1.a(aO.A, var5_4);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A, z);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return B;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.cx;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private I a(z z2, n n2) {
        y y2 = z2.b(n2);
        boolean bl2 = cL.b();
        y y3 = y2;
        if (!bl2) {
            if (!(y3 instanceof I)) return null;
            y3 = y2;
        }
        I i2 = (I)y3;
        return i2;
    }

    static {
        z = f.a("legacy_data", 0, 15);
        A = d.a("contents", a.class);
        B = new k(0.3125, 0.0, 0.3125, 0.6875, 0.375, 0.6875);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(net.minecraft.w.d d10) {
        K k2;
        boolean bl2;
        K k3;
        block11: {
            K k4;
            block10: {
                block9: {
                    aE aE2;
                    block8: {
                        k3 = K.a(d10.w());
                        bl2 = cL.e();
                        k2 = k3;
                        aE2 = g.cZ;
                        if (!bl2) break block8;
                        if (k2 == aE2) return true;
                        k2 = k3;
                        if (!bl2) break block9;
                        aE2 = g.cj;
                    }
                    if (k2 == aE2) return true;
                    k2 = k3;
                }
                if (bl2) {
                    if (k2 == g.aA) return true;
                    k2 = k3;
                }
                k4 = g.cg;
                if (bl2) {
                    if (k2 == k4) return true;
                    k2 = k3;
                    k4 = g.z;
                }
                if (!bl2) break block10;
                if (k2 == k4) return true;
                k2 = k3;
                if (!bl2) break block11;
                k4 = g.dj;
            }
            if (k2 == k4) return true;
            k2 = k3;
        }
        if (k2 == g.b9) return true;
        int n2 = d10.d();
        if (k3 != g.dc) return 0 != 0;
        int n3 = n2;
        if (!bl2) return n3 != 0;
        if (n3 != net.minecraft.W.e.FERN.a()) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block3: {
            I i3;
            block4: {
                I i4;
                n n3;
                z z3;
                aO aO2;
                boolean bl2;
                block2: {
                    bl2 = cL.e();
                    aO2 = this;
                    z3 = z2;
                    n3 = n2;
                    if (!bl2) break block2;
                    super.a(z3, n3, i2, j2);
                    if (!j2.cw.g) break block3;
                    aO2 = this;
                    z3 = z2;
                    n3 = n2;
                }
                i3 = i4 = aO2.a(z3, n3);
                if (!bl2) break block4;
                if (i3 == null) break block3;
                i3 = i4;
            }
            i3.a(net.minecraft.w.d.m);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        net.minecraft.w.d d10;
        block5: {
            net.minecraft.w.d d11;
            I i3;
            boolean bl2;
            block4: {
                I i4 = this.a(z2, n2);
                bl2 = cL.b();
                i3 = i4;
                if (bl2) break block4;
                if (i3 == null) break block5;
                i3 = i4;
            }
            d10 = d11 = i3.b();
            if (bl2) return d10;
            if (!d10.G()) {
                return d11;
            }
        }
        d10 = new net.minecraft.w.d(net.minecraft.u.h.cx);
        return d10;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.d(n2.k()).d();
        if (!bl2 && !bl3) {
            this.a(z2, n2, i2, 0);
            bl3 = z2.v(n2);
        }
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a("item.flowerPot.name");
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = super.a(z2, n2);
        if (bl2) {
            if (!bl3) return false;
            bl3 = z2.d(n2.k()).d();
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public y a(z z2, int n2) {
        K k2 = null;
        int n3 = 0;
        switch (n2) {
            case 1: {
                k2 = g.cj;
                n3 = C.POPPY.b();
                break;
            }
            case 2: {
                k2 = g.cZ;
                break;
            }
            case 3: {
                k2 = g.dj;
                n3 = D.OAK.b();
                break;
            }
            case 4: {
                k2 = g.dj;
                n3 = D.SPRUCE.b();
                break;
            }
            case 5: {
                k2 = g.dj;
                n3 = D.BIRCH.b();
                break;
            }
            case 6: {
                k2 = g.dj;
                n3 = D.JUNGLE.b();
                break;
            }
            case 7: {
                k2 = g.z;
                break;
            }
            case 8: {
                k2 = g.cg;
                break;
            }
            case 9: {
                k2 = g.aA;
                break;
            }
            case 10: {
                k2 = g.b9;
                break;
            }
            case 11: {
                k2 = g.dc;
                n3 = net.minecraft.W.e.FERN.a();
                break;
            }
            case 12: {
                k2 = g.dj;
                n3 = D.ACACIA.b();
                break;
            }
            case 13: {
                k2 = g.dj;
                n3 = D.DARK_OAK.b();
            }
        }
        return new I(net.minecraft.w.k.b(k2), n3);
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block9: {
            I i3;
            block10: {
                block13: {
                    net.minecraft.w.d d10;
                    j j3;
                    block14: {
                        boolean bl3;
                        net.minecraft.w.d d11;
                        block11: {
                            boolean bl4;
                            block12: {
                                block7: {
                                    net.minecraft.w.d d12;
                                    block8: {
                                        d12 = j2.c(a32);
                                        i3 = this.a(z2, n2);
                                        bl4 = cL.e();
                                        I i4 = i3;
                                        if (bl4) {
                                            if (i4 == null) {
                                                return false;
                                            }
                                            i4 = i3;
                                        }
                                        d11 = i4.b();
                                        bl3 = d11.G();
                                        if (!bl4) break block7;
                                        if (!bl3) break block8;
                                        bl2 = this.a(d12);
                                        if (bl4) {
                                            if (!bl2) {
                                                return false;
                                            }
                                            i3.a(d12);
                                            j2.b(net.minecraft.l.m.N);
                                            bl2 = j2.cw.g;
                                        }
                                        if (!bl4) break block9;
                                        if (bl2) break block10;
                                        d12.b(1);
                                        if (bl4) break block10;
                                    }
                                    bl3 = d12.G();
                                }
                                if (!bl4) break block11;
                                if (!bl3) break block12;
                                j2.a(a32, d11);
                                if (bl4) break block13;
                            }
                            j3 = j2;
                            d10 = d11;
                            if (!bl4) break block14;
                            bl3 = j3.a(d10);
                        }
                        if (bl3) break block13;
                        j3 = j2;
                        d10 = d11;
                    }
                    j3.a(d10, false);
                }
                i3.a(net.minecraft.w.d.m);
            }
            i3.b();
            z2.a(n2, i2, i2, 3);
            bl2 = true;
        }
        return bl2;
    }

    public aO() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(A, net.minecraft.W.a.EMPTY).a(z, 0));
    }

    @Override
    public void a(z z2, n n2, i i2) {
        I i3 = this.a(z2, n2);
        boolean bl2 = cL.b();
        if (!bl2) {
            if (i3 != null && i3.a() != null) {
                aO.a(z2, n2, new net.minecraft.w.d(i3.a(), 1, i3.c()));
            }
            super.a(z2, n2, i2);
        }
    }
}

