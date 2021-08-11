/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.N.X;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.aQ;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.W.p;
import net.minecraft.Z.d;
import net.minecraft.Z.f;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ab.a;
import net.minecraft.ah.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.h.c;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class aY
extends ak {
    private static final /* synthetic */ Predicate<f> F;
    protected static final /* synthetic */ net.minecraft.k.k C;
    public static final /* synthetic */ net.minecraft.ae.c B;
    private /* synthetic */ net.minecraft.au.d E;
    public static final /* synthetic */ net.minecraft.ae.e I;
    protected static final /* synthetic */ net.minecraft.k.k G;
    protected static final /* synthetic */ net.minecraft.k.k H;
    private /* synthetic */ net.minecraft.au.d D;
    protected static final /* synthetic */ net.minecraft.k.k A;
    protected static final /* synthetic */ net.minecraft.k.k z;

    @Override
    public String n() {
        return net.minecraft.ab.a.a("tile.skull.skeleton.name");
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(I).f();
        boolean bl2 = cL.b();
        int n3 = i2.b(B).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    static {
        I = aQ.z;
        B = net.minecraft.ae.c.a("nodrop");
        F = new p();
        A = new net.minecraft.k.k(0.25, 0.0, 0.25, 0.75, 0.5, 0.75);
        G = new net.minecraft.k.k(0.25, 0.25, 0.5, 0.75, 0.75, 1.0);
        z = new net.minecraft.k.k(0.25, 0.25, 0.0, 0.75, 0.75, 0.5);
        C = new net.minecraft.k.k(0.5, 0.25, 0.25, 1.0, 0.75, 0.75);
        H = new net.minecraft.k.k(0.0, 0.25, 0.25, 0.5, 0.75, 0.75);
    }

    @Override
    public boolean r(i i2) {
        return true;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        int n3;
        block3: {
            int n4;
            block2: {
                n3 = 0;
                boolean bl2 = cL.b();
                y y2 = z2.b(n2);
                n4 = y2 instanceof X;
                if (bl2) break block2;
                if (n4 == 0) break block3;
                n4 = ((X)y2).a();
            }
            n3 = n4;
        }
        return new net.minecraft.w.d(net.minecraft.u.h.cp, 1, n3);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    protected net.minecraft.au.d a() {
        boolean bl2 = cL.e();
        net.minecraft.au.d d10 = this.E;
        if (bl2) {
            if (d10 == null) {
                this.E = net.minecraft.au.g.b().a("^^^", "###", "~#~").a('#', f.a(net.minecraft.au.e.a(g.br))).a('^', F).a('~', f.a(net.minecraft.au.f.a(net.minecraft.ac.c.A))).a();
            }
            d10 = this.E;
        }
        return d10;
    }

    protected net.minecraft.au.d b() {
        boolean bl2 = cL.e();
        net.minecraft.au.d d10 = this.D;
        if (bl2) {
            if (d10 == null) {
                this.D = net.minecraft.au.g.b().a("   ", "###", "~#~").a('#', f.a(net.minecraft.au.e.a(g.br))).a('~', f.a(net.minecraft.au.f.a(net.minecraft.ac.c.A))).a();
            }
            d10 = this.D;
        }
        return d10;
    }

    @Override
    public void a(z z2, n n2, i i2, j j2) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (j2.cw.g) {
                i2 = i2.a(B, true);
                z2.a(n2, i2, 4);
            }
            super.a(z2, n2, i2, j2);
        }
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(z z2, n n2, net.minecraft.w.d d10) {
        boolean bl2 = cL.e();
        int n3 = d10.d();
        if (!bl2) return n3 != 0;
        if (n3 != 1) return 0 != 0;
        n3 = n2.b();
        if (!bl2) return n3 != 0;
        if (n3 < 2) return 0 != 0;
        z z3 = z2;
        if (bl2) {
            if (z3.g() == net.minecraft.ah.e.PEACEFUL) return 0 != 0;
            z3 = z2;
        }
        n3 = z3.C ? 1 : 0;
        if (!bl2) return n3 != 0;
        if (n3 != 0) return 0 != 0;
        if (this.b().a(z2, n2) == null) return false;
        return true;
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.cp;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, I, B);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(I, aA.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(B, bl3);
    }

    protected aY() {
        super(net.minecraft.ac.c.n);
        this.h(this.e.a().a(I, aA.NORTH).a(B, false));
    }

    public void a(z z2, n n2, X x2) {
        block16: {
            net.minecraft.au.d d10;
            net.minecraft.au.h h2;
            z z3;
            boolean bl2;
            block22: {
                int n3;
                int n4;
                block21: {
                    bl2 = cL.e();
                    n4 = x2.a();
                    n3 = 1;
                    if (!bl2) break block21;
                    if (n4 != n3) break block16;
                    n4 = n2.b();
                    n3 = 2;
                }
                if (n4 < n3) break block16;
                z3 = z2;
                if (!bl2) break block22;
                if (z3.g() == net.minecraft.ah.e.PEACEFUL) break block16;
                z3 = z2;
            }
            if (!z3.C && (h2 = (d10 = this.a()).a(z2, n2)) != null) {
                int n5;
                block19: {
                    n n6;
                    block18: {
                        Object object;
                        Object object2;
                        int n7;
                        block15: {
                            for (n7 = 0; n7 < 3; ++n7) {
                                object2 = h2.a(n7, 0, 0);
                                z2.a(((f)object2).c(), ((f)object2).b().a(B, true), 2);
                                if (bl2) {
                                    if (bl2) continue;
                                }
                                break block15;
                            }
                            n7 = 0;
                        }
                        while (n7 < d10.a()) {
                            block17: {
                                if (!bl2) break block16;
                                for (int i2 = 0; i2 < d10.c(); ++i2) {
                                    object = h2.a(n7, i2, 0);
                                    z2.a(((f)object).c(), g.bf.d(), 2);
                                    if (bl2) {
                                        if (bl2) continue;
                                    }
                                    break block17;
                                }
                                ++n7;
                            }
                            if (bl2) continue;
                        }
                        n6 = h2.a(1, 0, 0).c();
                        object2 = new c(z2);
                        object = h2.a(1, 2, 0).c();
                        ((x)object2).c((double)((m)object).e() + 0.5, (double)((m)object).b() + 0.55, (double)((m)object).a() + 0.5, h2.e().g() == Q.X ? 0.0f : 90.0f, 0.0f);
                        ((c)object2).bf = h2.e().g() == Q.X ? 0.0f : 90.0f;
                        ((c)object2).l();
                        for (net.minecraft.i.k k2 : z2.a(net.minecraft.i.k.class, ((x)object2).m().a(50.0))) {
                            a6.z.a(k2, (x)object2);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block18;
                        }
                        z2.f((x)object2);
                    }
                    for (n5 = 0; n5 < 120; ++n5) {
                        z2.a(aH.SNOWBALL, (double)n6.e() + z2.J.nextDouble(), (double)(n6.b() - 2) + z2.J.nextDouble() * 3.9, (double)n6.a() + z2.J.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block19;
                    }
                    n5 = 0;
                }
                while (n5 < d10.a()) {
                    block20: {
                        for (int i3 = 0; i3 < d10.c(); ++i3) {
                            f f10 = h2.a(n5, i3, 0);
                            z2.b(f10.c(), g.bf, false);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block20;
                        }
                        ++n5;
                    }
                    if (bl2) continue;
                }
            }
        }
    }

    @Override
    public void a(z z2, n n2, i i2) {
        block5: {
            block6: {
                net.minecraft.w.d d10;
                block9: {
                    X x2;
                    X x3;
                    block8: {
                        y y2;
                        boolean bl2;
                        block7: {
                            y y3;
                            boolean bl3;
                            block4: {
                                bl2 = cL.e();
                                bl3 = z2.C;
                                if (!bl2) break block4;
                                if (bl3) break block5;
                                bl3 = i2.b(B);
                            }
                            if (bl3) break block6;
                            y2 = y3 = z2.b(n2);
                            if (!bl2) break block7;
                            if (!(y2 instanceof X)) break block6;
                            y2 = y3;
                        }
                        x3 = (X)y2;
                        d10 = this.c(z2, n2, i2);
                        x2 = x3;
                        if (!bl2) break block8;
                        if (x2.a() != 3) break block9;
                        x2 = x3;
                    }
                    if (x2.b() != null) {
                        d10.b(new r());
                        r r2 = new r();
                        net.minecraft.P.c.a(r2, x3.b());
                        d10.v().a("SkullOwner", r2);
                    }
                }
                aY.a(z2, n2, d10);
            }
            super.a(z2, n2, i2);
        }
    }

    @Override
    public y a(z z2, int n2) {
        return new X();
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(I, ae2.a(i2.b(I)));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(i i2, h h2) {
        return i2.a(h2.b(i2.b(I)));
    }

    @Override
    public void a(z z2, n n2, i i2, float f10, int n3) {
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(I, b10.K()).a(B, false);
    }

    @Override
    public net.minecraft.k.k a(i i2, t t2, n n2) {
        switch (i2.b(I)) {
            default: {
                return A;
            }
            case NORTH: {
                return G;
            }
            case SOUTH: {
                return z;
            }
            case WEST: {
                return C;
            }
            case EAST: 
        }
        return H;
    }
}

