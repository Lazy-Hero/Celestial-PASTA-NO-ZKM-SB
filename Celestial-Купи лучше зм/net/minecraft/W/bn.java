/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Iterator;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.A;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.dA;
import net.minecraft.W.dV;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.b;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.ar.aW;
import net.minecraft.ar.ae;
import net.minecraft.i.f;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.bl;

public class bn
extends bF
implements dA {
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ d<dV> B;
    public static final /* synthetic */ c A;

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    public static boolean a(int n2) {
        boolean bl2 = cL.e();
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3;
        }
        return bl3;
    }

    @Override
    public int d(i i2) {
        int n2;
        block4: {
            int n3;
            block5: {
                n3 = 0;
                boolean bl2 = cL.b();
                n2 = n3 | i2.b(z).k();
                if (bl2) break block4;
                n3 = n2;
                if (i2.b(B) != dV.HEAD) break block5;
                n3 |= 8;
                n2 = i2.b(A).booleanValue() ? 1 : 0;
                if (bl2) break block4;
                if (n2 != 0) {
                    n3 |= 4;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public boolean r(i i2) {
        return true;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        block4: {
            block5: {
                i i4;
                boolean bl2 = cL.e();
                i3 = i2;
                if (!bl2) break block4;
                if (i3.b(B) != dV.FOOT) break block5;
                i3 = i4 = t2.d(n2.a(i2.b(z)));
                if (!bl2) break block4;
                if (i3.b() == this) {
                    i2 = i2.a(A, i4.b(A));
                }
            }
            i3 = i2;
        }
        return i3;
    }

    @Override
    public a f(i i2, t t2, n n2) {
        block2: {
            y y2;
            block3: {
                y y3;
                boolean bl2 = cL.e();
                if (i2.b(B) != dV.FOOT) break block2;
                y2 = y3 = t2.b(n2);
                if (!bl2) break block3;
                if (!(y2 instanceof A)) break block2;
                y2 = y3;
            }
            bl bl3 = ((A)y2).a();
            return net.minecraft.ac.a.a(bl3);
        }
        return net.minecraft.ac.a.i;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    private j c(z z2, n n2) {
        Iterator<j> iterator = z2.k.iterator();
        boolean bl2 = cL.b();
        while (iterator.hasNext()) {
            block4: {
                j j2;
                block5: {
                    boolean bl3;
                    j j3;
                    block3: {
                        j3 = iterator.next();
                        bl3 = j3.as();
                        if (bl2) break block3;
                        if (!bl3) break block4;
                        j2 = j3;
                        if (bl2) break block5;
                        bl3 = j2.cf.equals(n2);
                    }
                    if (!bl3) break block4;
                    j2 = j3;
                }
                return j2;
            }
            if (!bl2) continue;
        }
        return null;
    }

    @Override
    public y a(z z2, int n2) {
        return new A();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean b(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.d(n2.k()).d();
        if (!bl2) {
            if (!bl3) return false;
            bl3 = z2.d(n2).o().d();
        }
        if (!bl2) {
            if (bl3) return false;
            bl3 = z2.d(n2.a()).o().d();
        }
        if (bl2) return bl3;
        if (bl3) return false;
        return true;
    }

    public bn() {
        super(net.minecraft.ac.c.x);
        this.h(this.e.a().a(B, dV.FOOT).a(A, false));
        this.n = true;
    }

    @Override
    public aW b(i i2) {
        return aW.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return i2.b(B) == dV.FOOT ? net.minecraft.u.h.v : net.minecraft.u.h.bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, n var2_2, i var3_3, float var4_4, int var5_5) {
        var6_6 = cL.e();
        if (var3_3.b(bn.B) != dV.HEAD) return;
        v0 = var7_7 = var1_1.b(var2_2);
        if (!var6_6) ** GOTO lbl7
        if (v0 instanceof A) {
            v0 = var7_7;
lbl7:
            // 2 sources

            v1 = ((A)v0).a();
        } else {
            v1 = bl.RED;
        }
        var8_8 = v1;
        bn.a(var1_1, var2_2, new net.minecraft.w.d(net.minecraft.u.h.bl, 1, var8_8.e()));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.w.d c(z var1_1, n var2_2, i var3_3) {
        var5_4 = var2_2;
        var4_5 = cL.b();
        if (var3_3.b(bn.B) == dV.FOOT) {
            var5_4 = var2_2.a(var3_3.b(bn.z));
        }
        v0 = var6_6 = var1_1.b(var5_4);
        if (var4_5) ** GOTO lbl9
        if (v0 instanceof A) {
            v0 = var6_6;
lbl9:
            // 2 sources

            v1 = ((A)v0).a();
        } else {
            v1 = bl.RED;
        }
        var7_7 = v1;
        return new net.minecraft.w.d(net.minecraft.u.h.bl, 1, var7_7.e());
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, B, A);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public i c(int n2) {
        i i2;
        aA aA2 = aA.b(n2);
        boolean bl2 = cL.b();
        if ((n2 & 8) > 0) {
            i i3 = this.d().a(B, dV.HEAD).a(z, aA2);
            boolean bl3 = n2 & 4;
            if (!bl2) {
                bl3 = bl3 > false;
            }
            i2 = i3.a(A, bl3);
        } else {
            i2 = this.d().a(B, dV.FOOT).a(z, aA2);
        }
        return i2;
    }

    @Override
    public void a(z z2, n n2, x x2, float f10) {
        super.a(z2, n2, x2, f10 * 0.5f);
    }

    @Override
    public void a(z z2, x x2) {
        block4: {
            block6: {
                x x3;
                int n2;
                block5: {
                    boolean bl2;
                    block2: {
                        double d10;
                        block3: {
                            bl2 = cL.e();
                            n2 = x2.a4();
                            if (!bl2) break block2;
                            if (n2 == 0) break block3;
                            super.a(z2, x2);
                            if (bl2) break block4;
                        }
                        n2 = (d10 = x2.G - 0.0) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    if (!bl2) break block5;
                    if (n2 >= 0) break block4;
                    x2.G = -x2.G * (double)0.66f;
                    x3 = x2;
                    if (!bl2) break block6;
                    n2 = x3 instanceof B;
                }
                if (n2 != 0) break block4;
                x3 = x2;
            }
            x3.G *= 0.8;
        }
    }

    static {
        B = d.a("part", dV.class);
        A = net.minecraft.ae.c.a("occupied");
        C = new k(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return C;
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, y y2, net.minecraft.w.d d10) {
        block2: {
            block0: {
                y y3;
                boolean bl2;
                block1: {
                    bl2 = cL.e();
                    if (i2.b(B) != dV.HEAD) break block0;
                    y3 = y2;
                    if (!bl2) break block1;
                    if (!(y3 instanceof A)) break block0;
                    y3 = y2;
                }
                A a10 = (A)y3;
                net.minecraft.w.d d11 = a10.c();
                bn.a(z2, n2, d11);
                if (bl2) break block2;
            }
            super.a(z2, j2, n2, i2, null, d10);
        }
    }

    @Override
    public aC p() {
        return aC.CUTOUT;
    }

    @Nullable
    public static n a(z z2, n n2, int n3) {
        aA aA2 = z2.d(n2).b(z);
        int n4 = n2.e();
        int n5 = n2.b();
        int n6 = n2.a();
        int n7 = 0;
        boolean bl2 = cL.b();
        block0: while (true) {
            int n8 = n7;
            block1: while (n8 <= 1) {
                int n9 = n4 - aA2.r() * n7 - 1;
                int n10 = n6 - aA2.i() * n7 - 1;
                int n11 = n9 + 2;
                int n12 = n10 + 2;
                int n13 = n9;
                block2: while (true) {
                    int n14 = n13;
                    block3: while (n14 <= n11) {
                        n8 = n10;
                        if (bl2) continue block1;
                        int n15 = n8;
                        while (n15 <= n12) {
                            n n16 = new n(n13, n5, n15);
                            if (!bl2) {
                                n14 = bn.b(z2, n16) ? 1 : 0;
                                if (bl2) continue block3;
                                if (n14 != 0) {
                                    if (n3 <= 0) {
                                        return n16;
                                    }
                                    --n3;
                                }
                                ++n15;
                            }
                            if (!bl2) continue;
                        }
                        ++n13;
                        if (!bl2) continue block2;
                    }
                    break;
                }
                ++n7;
                if (!bl2) continue block0;
            }
            break;
        }
        return null;
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        block2: {
            n n3;
            z z3;
            block3: {
                boolean bl2 = cL.e();
                if (!j2.cw.g || i2.b(B) != dV.FOOT) break block2;
                n n4 = n2.a(i2.b(z));
                z3 = z2;
                n3 = n4;
                if (!bl2) break block3;
                if (z3.d(n3).b() != this) break block2;
                z3 = z2;
                n3 = n4;
            }
            z3.v(n3);
        }
    }

    @Override
    public b m(i i2) {
        return net.minecraft.ac.b.DESTROY;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block24: {
            n n3;
            z z3;
            boolean bl3;
            block26: {
                block25: {
                    block29: {
                        f f13;
                        f f14;
                        block30: {
                            Object object;
                            block31: {
                                block27: {
                                    block28: {
                                        z z4;
                                        block23: {
                                            block22: {
                                                i i3;
                                                block21: {
                                                    block20: {
                                                        boolean bl4;
                                                        block19: {
                                                            bl2 = cL.b();
                                                            bl4 = z2.C;
                                                            if (bl2) break block19;
                                                            if (!bl4) break block20;
                                                            bl4 = true;
                                                        }
                                                        return bl4;
                                                    }
                                                    i3 = i2;
                                                    if (bl2) break block21;
                                                    if (i3.b(B) == dV.HEAD) break block22;
                                                    n2 = n2.a(i2.b(z));
                                                    z4 = z2;
                                                    if (bl2) break block23;
                                                    i3 = i2 = z4.d(n2);
                                                }
                                                if (i3.b() != this) {
                                                    return true;
                                                }
                                            }
                                            z4 = z2;
                                        }
                                        bl3 = z4.D.l();
                                        if (bl2) break block24;
                                        if (!bl3) break block25;
                                        z3 = z2;
                                        n3 = n2;
                                        if (bl2) break block26;
                                        if (z3.c(n3) == net.minecraft.u.d.R) break block25;
                                        if (i2.b(A).booleanValue()) {
                                            object = this.c(z2, n2);
                                            if (!bl2) {
                                                if (object != null) {
                                                    j2.a(new net.minecraft.at.h("tile.bed.occupied", new Object[0]), true);
                                                    return true;
                                                }
                                                i2 = i2.a(A, false);
                                            }
                                            z2.a(n2, i2, 4);
                                        }
                                        f14 = object = j2.a(n2);
                                        f13 = f.OK;
                                        if (!bl2) {
                                            if (f14 == f13) {
                                                i2 = i2.a(A, true);
                                                z2.a(n2, i2, 4);
                                                return true;
                                            }
                                            f14 = object;
                                            f13 = f.NOT_POSSIBLE_NOW;
                                        }
                                        if (bl2) break block27;
                                        if (f14 != f13) break block28;
                                        j2.a(new net.minecraft.at.h("tile.bed.noSleep", new Object[0]), true);
                                        if (!bl2) break block29;
                                    }
                                    f14 = object;
                                    f13 = f.NOT_SAFE;
                                }
                                if (bl2) break block30;
                                if (f14 != f13) break block31;
                                j2.a(new net.minecraft.at.h("tile.bed.notSafe", new Object[0]), true);
                                if (!bl2) break block29;
                            }
                            f14 = object;
                            f13 = f.TOO_FAR_AWAY;
                        }
                        if (f14 == f13) {
                            j2.a(new net.minecraft.at.h("tile.bed.tooFarAway", new Object[0]), true);
                        }
                    }
                    return true;
                }
                z3 = z2;
                n3 = n2;
            }
            bl3 = z3.v(n3);
        }
        n n4 = n2.a(i2.b(z).h());
        z z5 = z2;
        if (!bl2) {
            if (z5.d(n4).b() == this) {
                z2.v(n4);
            }
            z5 = z2;
        }
        z5.a(null, (double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5, 5.0f, true, true);
        return true;
    }

    @Override
    public void a(z z2, n n2, i i2) {
        super.a(z2, n2, i2);
        z2.z(n2);
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block8: {
            z z3;
            boolean bl2;
            block9: {
                i i3;
                block5: {
                    aA aA2;
                    block6: {
                        n n4;
                        z z4;
                        block7: {
                            aA2 = i2.b(z);
                            bl2 = cL.e();
                            i3 = i2;
                            if (!bl2) break block5;
                            if (i3.b(B) != dV.FOOT) break block6;
                            z4 = z2;
                            n4 = n2.a(aA2);
                            if (!bl2) break block7;
                            if (z4.d(n4).b() == this) break block8;
                            z4 = z2;
                            n4 = n2;
                        }
                        z4.v(n4);
                        if (bl2) break block8;
                    }
                    z3 = z2;
                    if (!bl2) break block9;
                    i3 = z3.d(n2.a(aA2.h()));
                }
                if (i3.b() == this) break block8;
                z3 = z2;
            }
            boolean bl3 = z3.C;
            if (bl2) {
                if (!bl3) {
                    this.a(z2, n2, i2, 0);
                }
                bl3 = z2.v(n2);
            }
        }
    }
}

