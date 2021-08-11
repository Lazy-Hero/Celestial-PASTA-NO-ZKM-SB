/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.a6;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class I
extends k {
    private final /* synthetic */ K s;

    private static gP a(gP gP2) {
        return gP2;
    }

    private d a(d d10, net.minecraft.i.j j2, k k2) {
        block8: {
            net.minecraft.i.j j3;
            block7: {
                boolean bl2;
                block6: {
                    int n2 = bl.c();
                    bl2 = j2.cw.g;
                    if (n2 == 0) {
                        if (bl2) {
                            return d10;
                        }
                        d10.b(1);
                        bl2 = d10.G();
                    }
                    if (n2 != 0) break block6;
                    if (bl2) {
                        return new d(k2);
                    }
                    j3 = j2;
                    if (n2 != 0) break block7;
                    bl2 = j3.cB.b(new d(k2));
                }
                if (bl2) break block8;
                j3 = j2;
            }
            j3.a(new d(k2), false);
        }
        return d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable net.minecraft.i.j var1_1, z var2_2, n var3_3) {
        block18: {
            block19: {
                block20: {
                    block17: {
                        block15: {
                            block16: {
                                var4_4 = bl.c();
                                if (this.s == g.bf) {
                                    return false;
                                }
                                var5_5 = var2_2.d(var3_3);
                                var6_6 = var5_5.o();
                                v0 = var6_6.d();
                                if (var4_4 == 0) {
                                    v0 = v0 == false;
                                }
                                var7_7 = v0;
                                var8_8 = var5_5.b().b((t)var2_2, var3_3);
                                v1 = var2_2.a(var3_3);
                                if (var4_4 != 0) break block15;
                                if (v1) break block16;
                                v1 = var7_7;
                                if (var4_4 != 0) break block15;
                                if (!v1) {
                                    v1 = var8_8;
                                    if (var4_4 == 0) {
                                        if (!v1) {
                                            return false;
                                        } else {
                                            ** GOTO lbl23
                                        }
                                    } else {
                                        ** GOTO lbl22
                                    }
                                }
                                break block16;
lbl22:
                                // 2 sources

                                break block15;
                            }
                            v1 = var2_2.D.e();
                        }
                        if (var4_4 == 0) {
                            if (v1 && this.s == g.cL) {
                                var9_9 = var3_3.e();
                                var10_11 = var3_3.b();
                                var11_12 = var3_3.a();
                                var2_2.a(var1_1, var3_3, E.gE, ay.BLOCKS, 0.5f, 2.6f + (var2_2.J.nextFloat() - var2_2.J.nextFloat()) * 0.8f);
                                for (var12_13 = 0; var12_13 < 8; ++var12_13) {
                                    var2_2.a(aH.SMOKE_LARGE, (double)var9_9 + Math.random(), (double)var10_11 + Math.random(), (double)var11_12 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
                                    if (var4_4 != 0) return true;
                                    if (var4_4 == 0) continue;
                                }
                                if (var4_4 == 0) return true;
                            }
                            v1 = var2_2.C;
                        }
                        if (var4_4 != 0) break block17;
                        if (v1) break block18;
                        v1 = var7_7;
                    }
                    if (var4_4 != 0) break block19;
                    if (v1) break block20;
                    v1 = var8_8;
                    if (var4_4 != 0) break block19;
                    if (!v1) break block18;
                }
                v1 = var6_6.b();
            }
            if (var4_4 == 0 && !v1) {
                v1 = var2_2.a(var3_3, true);
            }
        }
        var9_10 = this.s == g.ag ? E.dx : E.cp;
        var2_2.a(var1_1, var3_3, var9_10, ay.BLOCKS, 1.0f, 1.0f);
        var2_2.a(var3_3, this.s.d(), 11);
        return true;
    }

    public I(K k2) {
        this.f = 1;
        this.s = k2;
        this.a(net.minecraft.ad.a.n);
    }

    @Override
    public net.minecraft.ar.t<d> a(z z2, net.minecraft.i.j j2, a3 a32) {
        d d10;
        block28: {
            boolean bl2;
            n n2;
            int n3;
            block27: {
                boolean bl3;
                boolean bl4;
                n n4;
                i i2;
                block20: {
                    block21: {
                        block25: {
                            block26: {
                                c c10;
                                c c11;
                                net.minecraft.Z.i i3;
                                block22: {
                                    c c12;
                                    block23: {
                                        block24: {
                                            n3 = bl.c();
                                            boolean bl5 = this.s == g.bf;
                                            d10 = j2.c(a32);
                                            i i4 = i2 = this.a(z2, j2, bl5);
                                            if (n3 == 0) {
                                                if (i4 == null) {
                                                    return new net.minecraft.ar.t<d>(aX.PASS, d10);
                                                }
                                                i4 = i2;
                                            }
                                            if (n3 == 0) {
                                                if (i4.d != j.BLOCK) {
                                                    return new net.minecraft.ar.t<d>(aX.PASS, d10);
                                                }
                                                i4 = i2;
                                            }
                                            n4 = i4.a();
                                            bl4 = z2.a(j2, n4);
                                            if (n3 == 0) {
                                                if (!bl4) {
                                                    return new net.minecraft.ar.t<d>(aX.FAIL, d10);
                                                }
                                                bl4 = bl5;
                                            }
                                            if (n3 != 0) break block20;
                                            if (!bl4) break block21;
                                            if (!j2.a(n4.a(i2.b), i2.b, d10)) {
                                                return new net.minecraft.ar.t<d>(aX.FAIL, d10);
                                            }
                                            i3 = z2.d(n4);
                                            c11 = c12 = i3.o();
                                            c10 = c.L;
                                            if (n3 != 0) break block22;
                                            if (c11 != c10) break block23;
                                            int n5 = i3.b(bq.z);
                                            if (n3 != 0) break block24;
                                            if (n5 != 0) break block23;
                                            n5 = z2.a(n4, g.bf.d(), 11) ? 1 : 0;
                                        }
                                        j2.b(m.b(this));
                                        j2.a(E.gl, 1.0f, 1.0f);
                                        return new net.minecraft.ar.t<d>(aX.SUCCESS, this.a(d10, j2, net.minecraft.u.h.ah));
                                    }
                                    c11 = c12;
                                    c10 = c.g;
                                }
                                if (c11 != c10) break block25;
                                int n6 = i3.b(bq.z);
                                if (n3 != 0) break block26;
                                if (n6 != 0) break block25;
                                j2.a(E.eM, 1.0f, 1.0f);
                                n6 = z2.a(n4, g.bf.d(), 11) ? 1 : 0;
                            }
                            j2.b(m.b(this));
                            return new net.minecraft.ar.t<d>(aX.SUCCESS, this.a(d10, j2, net.minecraft.u.h.cg));
                        }
                        return new net.minecraft.ar.t<d>(aX.FAIL, d10);
                    }
                    bl4 = z2.d(n4).b().b((t)z2, n4);
                }
                n2 = (bl3 = bl4) && i2.b == aA.UP ? n4 : n4.a(i2.b);
                bl2 = j2.a(n2, i2.b, d10);
                if (n3 == 0) {
                    if (!bl2) {
                        return new net.minecraft.ar.t<d>(aX.FAIL, d10);
                    }
                    bl2 = this.a(j2, z2, n2);
                }
                if (n3 != 0) break block27;
                if (!bl2) break block28;
                bl2 = j2 instanceof net.minecraft.i.k;
            }
            if (n3 == 0) {
                if (bl2) {
                    a6.s.a((net.minecraft.i.k)j2, n2, d10);
                }
                j2.b(m.b(this));
                bl2 = j2.cw.g;
            }
            return !bl2 ? new net.minecraft.ar.t<d>(aX.SUCCESS, new d(net.minecraft.u.h.P)) : new net.minecraft.ar.t<d>(aX.SUCCESS, d10);
        }
        return new net.minecraft.ar.t<d>(aX.FAIL, d10);
    }
}

