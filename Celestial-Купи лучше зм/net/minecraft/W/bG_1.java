/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class bG
extends bF {
    protected static final /* synthetic */ k E;
    protected static final /* synthetic */ k F;
    public static final /* synthetic */ c C;
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ c I;
    protected static final /* synthetic */ k G;
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ c H;
    protected static final /* synthetic */ k D;

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, C, I, H);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(z, aA.b(n2));
        boolean bl3 = n2 & 4;
        if (!bl2) {
            bl3 = bl3;
        }
        i i3 = i2.a(C, bl3);
        boolean bl4 = n2 & 8;
        if (!bl2) {
            bl4 = bl4;
        }
        return i3.a(I, bl4);
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        boolean bl2 = z2.x(n2);
        return this.d().a(z, b10.K()).a(C, bl2).a(I, bl2).a(H, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = z2.d(n2.k()).o().d();
        if (!bl2) {
            if (!bl3) return false;
            bl3 = super.a(z2, n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2;
        block8: {
            block7: {
                block6: {
                    bl2 = cL.e();
                    boolean bl3 = i2.b(C);
                    if (!bl2) break block6;
                    if (!bl3) break block7;
                    i2 = i2.a(C, false);
                    bl3 = z2.a(n2, i2, 10);
                }
                if (bl2) break block8;
            }
            aA aA3 = aA.a(j2.e);
            i i3 = i2;
            if (bl2) {
                if (i3.b(z) == aA3.h()) {
                    i2 = i2.a(z, aA3);
                }
                i3 = i2.a(C, true);
            }
            i2 = i3;
            z2.a(n2, i2, 10);
        }
        int n3 = i2.b(C).booleanValue();
        if (bl2) {
            n3 = n3 != 0 ? 1008 : 1014;
        }
        z2.a(j2, n3, n2, 0);
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i e(i i2, t t2, n n2) {
        i i3;
        block7: {
            block6: {
                i i4;
                block4: {
                    block5: {
                        Q q2;
                        Q q3;
                        boolean bl2;
                        block2: {
                            Q q4;
                            block3: {
                                q4 = i2.b(z).g();
                                bl2 = cL.b();
                                q3 = q4;
                                q2 = Q.Z;
                                if (bl2) break block2;
                                if (q3 != q2) break block3;
                                i4 = t2.d(n2.b());
                                if (bl2) break block4;
                                if (i4.b() == g.bl) break block5;
                                i4 = t2.d(n2.m());
                                if (bl2) break block4;
                                if (i4.b() == g.bl) break block5;
                            }
                            q3 = q4;
                            q2 = Q.X;
                        }
                        if (q3 != q2) break block6;
                        i4 = t2.d(n2.i());
                        if (bl2) break block4;
                        if (i4.b() == g.bl) break block5;
                        i3 = t2.d(n2.j());
                        if (bl2) break block7;
                        if (i3.b() != g.bl) break block6;
                    }
                    i4 = i2.a(H, true);
                }
                i2 = i4;
            }
            i3 = i2;
        }
        return i3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    public bG(D d10) {
        super(net.minecraft.ac.c.k, d10.a());
        this.h(this.e.a().a(C, false).a(I, false).a(H, false));
        this.a(net.minecraft.ad.a.p);
    }

    @Override
    public boolean a(t t2, n n2) {
        return t2.d(n2).b(C);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        i2 = this.e(i2, t2, n2);
        boolean bl2 = cL.b();
        Object object = i2.b(H);
        if (!bl2) {
            if (((Boolean)object).booleanValue()) {
                return i2.b(z).g() == Q.X ? A : G;
            }
            object = i2.b(z);
        }
        return ((aA)object).g() == Q.X ? B : D;
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            z z3;
            int n4;
            boolean bl2;
            block7: {
                int n5;
                boolean bl3;
                block6: {
                    int n6;
                    block4: {
                        bl2 = cL.e();
                        n6 = z2.C;
                        if (!bl2) break block4;
                        if (n6 != 0) break block5;
                        n6 = z2.x(n2);
                    }
                    n4 = n6;
                    bl3 = i2.b(I);
                    n5 = n4;
                    if (!bl2) break block6;
                    if (bl3 == n5) break block5;
                    z3 = z2;
                    if (!bl2) break block7;
                    z3.a(n2, i2.a(I, n4 != 0).a(C, n4 != 0), 2);
                    bl3 = i2.b(C);
                    n5 = n4;
                }
                if (bl3 == n5) break block5;
                z3 = z2;
            }
            int n7 = n4;
            if (bl2) {
                n7 = n7 != 0 ? 1008 : 1014;
            }
            z3.a(null, n7, n2, 0);
        }
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        block3: {
            aA aA3;
            block4: {
                aA aA4;
                block2: {
                    boolean bl2 = cL.e();
                    aA3 = aA2;
                    aA4 = aA.UP;
                    if (!bl2) break block2;
                    if (aA3 == aA4) break block3;
                    aA3 = aA2;
                    if (!bl2) break block4;
                    aA4 = aA.DOWN;
                }
                if (aA3 == aA4) break block3;
                aA3 = i2.b(z);
            }
            return aA3.g() == aA2.l().g() ? d.MIDDLE_POLE : d.UNDEFINED;
        }
        return d.UNDEFINED;
    }

    static {
        C = net.minecraft.ae.c.a("open");
        I = net.minecraft.ae.c.a("powered");
        H = net.minecraft.ae.c.a("in_wall");
        D = new k(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
        B = new k(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
        G = new k(0.0, 0.0, 0.375, 1.0, 0.8125, 0.625);
        A = new k(0.375, 0.0, 0.0, 0.625, 0.8125, 1.0);
        E = new k(0.0, 0.0, 0.375, 1.0, 1.5, 0.625);
        F = new k(0.375, 0.0, 0.0, 0.625, 1.5, 1.0);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(z).k();
        boolean bl2 = cL.e();
        int n3 = i2.b(I).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = i2.b(C).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 4;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        boolean bl2 = cL.b();
        Object object = i2.b(C);
        if (!bl2) {
            if (((Boolean)object).booleanValue()) {
                return a;
            }
            object = i2.b(z);
        }
        return ((aA)object).g() == Q.Z ? E : F;
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return true;
    }
}

