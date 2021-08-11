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
import net.minecraft.J.l;
import net.minecraft.N.C;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bD;
import net.minecraft.W.cL;
import net.minecraft.W.dA;
import net.minecraft.W.q;
import net.minecraft.W.s;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.u.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bT
extends bD
implements dA {
    public static final /* synthetic */ c C;
    public static final /* synthetic */ d<s> D;

    @Override
    protected int c(t t2, n n2, i i2) {
        y y2 = t2.b(n2);
        boolean bl2 = cL.b();
        int n3 = y2 instanceof C;
        if (!bl2) {
            n3 = n3 != 0 ? ((C)y2).a() : 0;
        }
        return n3;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (!j2.cw.c) {
                return false;
            }
            i2 = i2.a(D);
        }
        float f13 = i2.b(D) == net.minecraft.W.s.SUBTRACT ? 0.55f : 0.5f;
        z2.a(j2, n2, E.bL, ay.BLOCKS, 0.3f, f13);
        z2.a(n2, i2, 2);
        this.e(z2, n2, i2);
        return true;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(z).k();
        boolean bl2 = cL.e();
        Object object = i2.b(C);
        if (bl2) {
            if (((Boolean)object).booleanValue()) {
                n2 |= 8;
            }
            object = i2.b(D);
        }
        if (object == net.minecraft.W.s.SUBTRACT) {
            n2 |= 4;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private l a(z z2, aA aA2, n n2) {
        List<x> list = z2.a(l.class, new k(n2.e(), n2.b(), n2.a(), n2.e() + 1, n2.b() + 1, n2.a() + 1), new q(this, aA2));
        boolean bl2 = cL.b();
        Object object = list;
        if (!bl2) {
            if (object.size() != 1) return null;
            object = list.get(0);
        }
        l l2 = (l)object;
        return l2;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        super.b(z2, n2, i2);
        z2.b(n2, this.a(z2, 0));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected int c(i i2) {
        return 2;
    }

    @Override
    protected i i(i i2) {
        Boolean bl2 = i2.b(C);
        s s2 = i2.b(D);
        aA aA2 = i2.b(z);
        return g.cP.d().a(z, aA2).a(C, bl2).a(D, s2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(i i2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.A;
        if (bl2) return bl3;
        if (bl3) return true;
        bl3 = i2.b(C);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    static {
        C = net.minecraft.ae.c.a("powered");
        D = d.a("mode", s.class);
    }

    @Override
    protected boolean f(z z2, n n2, i i2) {
        boolean bl2;
        boolean bl3 = this.d(z2, n2, i2);
        boolean bl4 = cL.b();
        boolean bl5 = bl3;
        if (!bl4) {
            if (bl5 >= BADBOOL 15) {
                return true;
            }
            bl5 = bl3;
        }
        if (!bl4) {
            if (!bl5) {
                return false;
            }
            bl5 = this.b((t)z2, n2, i2);
        }
        boolean bl6 = bl2 = bl5;
        if (!bl4) {
            if (!bl6) {
                return true;
            }
            bl6 = bl3;
        }
        if (!bl4) {
            bl6 = bl6 >= bl2;
        }
        return bl6;
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(net.minecraft.u.h.t);
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    private void e(z z2, n n2, i i2) {
        block7: {
            block10: {
                int n3;
                boolean bl2;
                block11: {
                    int n4;
                    block8: {
                        int n5;
                        block9: {
                            int n6;
                            block6: {
                                int n7 = this.a(z2, n2, i2);
                                y y2 = z2.b(n2);
                                int n8 = 0;
                                bl2 = cL.e();
                                n6 = y2 instanceof C;
                                if (bl2) {
                                    if (n6 != 0) {
                                        C c10 = (C)y2;
                                        n8 = c10.a();
                                        c10.a(n7);
                                    }
                                    n6 = n8;
                                }
                                if (!bl2) break block6;
                                if (n6 == n7 && i2.b(D) != net.minecraft.W.s.COMPARE) break block7;
                                n6 = this.f(z2, n2, i2) ? 1 : 0;
                            }
                            n4 = n6;
                            n3 = n5 = this.b(i2);
                            if (!bl2) break block8;
                            if (n3 == 0) break block9;
                            n3 = n4;
                            if (!bl2) break block8;
                            if (n3 != 0) break block9;
                            z2.a(n2, i2.a(C, false), 2);
                            if (bl2) break block10;
                        }
                        n3 = n5;
                    }
                    if (!bl2) break block11;
                    if (n3 != 0) break block10;
                    n3 = n4;
                }
                if (bl2 && n3 != 0) {
                    n3 = z2.a(n2, i2.a(C, true), 2) ? 1 : 0;
                }
            }
            this.c(z2, n2, i2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(i i2, z z2, n n2, int n3, int n4) {
        boolean bl2 = cL.e();
        super.a(i2, z2, n2, n3, n4);
        y y2 = z2.b(n2);
        boolean bl3 = bl2;
        y y3 = y2;
        if (bl3) {
            if (y3 == null) return false;
            y3 = y2;
        }
        boolean bl4 = y3.a(n3, n4);
        if (!bl3) return bl4;
        if (!bl4) return false;
        return true;
    }

    @Override
    protected void g(z z2, n n2, i i2) {
        block2: {
            block5: {
                int n3;
                boolean bl2;
                block3: {
                    block4: {
                        int n4;
                        block1: {
                            bl2 = cL.e();
                            n4 = z2.c(n2, this);
                            if (!bl2) break block1;
                            if (n4 != 0) break block2;
                            n4 = this.a(z2, n2, i2);
                        }
                        int n5 = n4;
                        y y2 = z2.b(n2);
                        int n6 = y2 instanceof C;
                        if (bl2) {
                            n6 = n6 != 0 ? ((C)y2).a() : 0;
                        }
                        int n7 = n6;
                        n3 = n5;
                        if (!bl2) break block3;
                        if (n3 != n7) break block4;
                        n3 = this.b(i2) ? 1 : 0;
                        if (!bl2) break block3;
                        if (n3 == this.f(z2, n2, i2)) break block2;
                    }
                    n3 = this.e(z2, n2, i2) ? 1 : 0;
                }
                if (n3 == 0) break block5;
                z2.b(n2, this, 2, -1);
                if (bl2) break block2;
            }
            z2.b(n2, this, 2, 0);
        }
    }

    @Override
    protected int d(z z2, n n2, i i2) {
        int n3;
        block5: {
            int n4;
            block4: {
                l l2;
                block8: {
                    l l3;
                    i i3;
                    boolean bl2;
                    n n5;
                    aA aA2;
                    block6: {
                        i i4;
                        block7: {
                            block2: {
                                block3: {
                                    n4 = super.d(z2, n2, i2);
                                    aA2 = i2.b(z);
                                    n5 = n2.a(aA2);
                                    bl2 = cL.b();
                                    i4 = z2.d(n5);
                                    n3 = i4.p();
                                    if (bl2) break block2;
                                    if (n3 == 0) break block3;
                                    n4 = i4.c(z2, n5);
                                    if (!bl2) break block4;
                                }
                                n3 = n4;
                            }
                            if (bl2) break block5;
                            if (n3 >= 15) break block4;
                            n3 = i4.r() ? 1 : 0;
                            if (bl2) break block5;
                            if (n3 == 0) break block4;
                            n5 = n5.a(aA2);
                            i3 = i4 = z2.d(n5);
                            if (bl2) break block6;
                            if (!i3.p()) break block7;
                            n4 = i4.c(z2, n5);
                            if (!bl2) break block4;
                        }
                        i3 = i4;
                    }
                    if (i3.o() != net.minecraft.ac.c.A) break block4;
                    l2 = l3 = this.a(z2, aA2, n5);
                    if (bl2) break block8;
                    if (l2 == null) break block4;
                    l2 = l3;
                }
                n4 = l2.a();
            }
            n3 = n4;
        }
        return n3;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.t;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, b10.K().h()).a(C, false).a(D, net.minecraft.W.s.COMPARE);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(z, aA.b(n2));
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(C, bl3).a(D, (n2 & 4) > 0 ? net.minecraft.W.s.SUBTRACT : net.minecraft.W.s.COMPARE);
    }

    private int a(z z2, n n2, i i2) {
        return i2.b(D) == net.minecraft.W.s.SUBTRACT ? Math.max(this.d(z2, n2, i2) - this.b((t)z2, n2, i2), 0) : this.d(z2, n2, i2);
    }

    public bT(boolean bl2) {
        super(bl2);
        this.h(this.e.a().a(z, aA.NORTH).a(C, false).a(D, net.minecraft.W.s.COMPARE));
        this.n = true;
    }

    @Override
    public y a(z z2, int n2) {
        return new C();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z, D, C);
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a("item.comparator.name");
    }

    @Override
    protected i e(i i2) {
        Boolean bl2 = i2.b(C);
        s s2 = i2.b(D);
        aA aA2 = i2.b(z);
        return g.aV.d().a(z, aA2).a(C, bl2).a(D, s2);
    }

    @Override
    public void a(z z2, n n2, i i2) {
        super.a(z2, n2, i2);
        z2.z(n2);
        this.c(z2, n2, i2);
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        boolean bl2 = cL.b();
        bT bT2 = this;
        if (!bl2) {
            if (bT2.A) {
                z2.a(n2, this.i(i2).a(C, true), 4);
            }
            bT2 = this;
        }
        bT2.e(z2, n2, i2);
    }
}

