/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.N.D;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class a_
extends ak {
    private final /* synthetic */ boolean B;
    public static final /* synthetic */ f z;
    protected static final /* synthetic */ k A;

    @Override
    public int a(i i2, t t2, n n2, aA aA2) {
        return i2.b(z);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    static {
        z = f.a("power", 0, 15);
        A = new k(0.0, 0.0, 0.0, 1.0, 0.375, 1.0);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    public void a(z z2, n n2) {
        block9: {
            int n3;
            int n4;
            i i2;
            boolean bl2;
            block10: {
                block11: {
                    z z3;
                    block8: {
                        bl2 = cL.e();
                        z3 = z2;
                        if (!bl2) break block8;
                        if (!z3.D.h()) break block9;
                        z3 = z2;
                    }
                    i2 = z3.d(n2);
                    n4 = z2.a(net.minecraft.ah.c.SKY, n2) - z2.Q();
                    float f10 = z2.e(1.0f);
                    n3 = this.B;
                    if (bl2) {
                        if (n3 != 0) {
                            n4 = 15 - n4;
                        }
                        n3 = n4;
                    }
                    if (!bl2) break block10;
                    if (n3 <= 0) break block11;
                    n3 = this.B ? 1 : 0;
                    if (!bl2) break block10;
                    if (n3 == 0) {
                        float f11 = f10;
                        if (bl2) {
                            f11 = f11 < (float)Math.PI ? 0.0f : (float)Math.PI * 2;
                        }
                        float f12 = f11;
                        f10 += (f12 - f10) * 0.2f;
                        n4 = Math.round((float)n4 * net.minecraft.k.h.c(f10));
                    }
                }
                n4 = net.minecraft.k.h.c(n4, 0, 15);
                n3 = i2.b(z);
            }
            if (bl2 && n3 != n4) {
                n3 = z2.a(n2, i2.a(z, n4), 3) ? 1 : 0;
            }
        }
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block3: {
            a_ a_2;
            block2: {
                boolean bl2 = cL.b();
                a_2 = this;
                if (bl2) break block2;
                if (a_2.B) break block3;
                a_2 = this;
            }
            super.a(a10, a22);
        }
    }

    public a_(boolean bl2) {
        super(net.minecraft.ac.c.k);
        this.B = bl2;
        this.h(this.e.a().a(z, 0));
        this.a(net.minecraft.ad.a.p);
        this.c(0.2f);
        this.a(d_.e);
        this.c("daylightDetector");
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return new d(g.cQ);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, n2);
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block5: {
            block6: {
                block9: {
                    block7: {
                        boolean bl3;
                        block8: {
                            boolean bl4 = cL.b();
                            bl2 = j2.E();
                            if (bl4) break block5;
                            if (!bl2) break block6;
                            bl3 = z2.C;
                            if (!bl4) {
                                if (bl3) {
                                    return true;
                                }
                                bl3 = this.B;
                            }
                            if (bl4) break block7;
                            if (!bl3) break block8;
                            z2.a(n2, g.cQ.d().a(z, i2.b(z)), 4);
                            g.cQ.a(z2, n2);
                            if (!bl4) break block9;
                        }
                        bl3 = z2.a(n2, g.b6.d().a(z, i2.b(z)), 4);
                    }
                    g.b6.a(z2, n2);
                }
                return true;
            }
            bl2 = super.a(z2, n2, i2, j2, a32, aA2, f10, f11, f12);
        }
        return bl2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.cQ);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean o(i i2) {
        return true;
    }

    @Override
    public int d(i i2) {
        return i2.b(z);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public y a(z z2, int n2) {
        return new D();
    }
}

