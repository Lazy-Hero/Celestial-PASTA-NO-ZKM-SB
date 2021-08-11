/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.W;

import com.google.common.base.Predicate;
import net.minecraft.T.aX;
import net.minecraft.T.an;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.W.de;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.ae;
import net.minecraft.au.d;
import net.minecraft.au.e;
import net.minecraft.au.f;
import net.minecraft.au.h;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class bo
extends bF {
    private /* synthetic */ d B;
    private static final /* synthetic */ Predicate<i> D;
    private /* synthetic */ d A;
    private /* synthetic */ d E;
    private /* synthetic */ d C;

    protected bo() {
        super(net.minecraft.ac.c.h, net.minecraft.ac.a.N);
        this.h(this.e.a().a(z, aA.NORTH));
        this.a(true);
        this.a(net.minecraft.ad.a.r);
    }

    protected d d() {
        boolean bl2 = cL.e();
        d d10 = this.A;
        if (bl2) {
            if (d10 == null) {
                this.A = net.minecraft.au.g.b().a("~ ~", "###", "~#~").a('#', net.minecraft.Z.f.a(net.minecraft.au.e.a(g.E))).a('~', net.minecraft.Z.f.a(f.a(net.minecraft.ac.c.A))).a();
            }
            d10 = this.A;
        }
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.d((n)n2).b().y.k();
        if (bl2) {
            if (!bl3) return false;
            bl3 = z2.d(n2.k()).d();
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(z z2, n n2) {
        boolean bl2 = cL.b();
        h h2 = this.c().a(z2, n2);
        if (!bl2) {
            if (h2 != null) return true;
            h2 = this.d().a(z2, n2);
        }
        if (h2 == null) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected d c() {
        boolean bl2 = cL.b();
        d d10 = this.C;
        if (!bl2) {
            if (d10 == null) {
                this.C = net.minecraft.au.g.b().a(" ", "#", "#").a('#', net.minecraft.Z.f.a(net.minecraft.au.e.a(g.da))).a();
            }
            d10 = this.C;
        }
        return d10;
    }

    protected d b() {
        boolean bl2 = cL.b();
        d d10 = this.E;
        if (!bl2) {
            if (d10 == null) {
                this.E = net.minecraft.au.g.b().a("~^~", "###", "~#~").a('^', net.minecraft.Z.f.a(D)).a('#', net.minecraft.Z.f.a(net.minecraft.au.e.a(g.E))).a('~', net.minecraft.Z.f.a(f.a(net.minecraft.ac.c.A))).a();
            }
            d10 = this.E;
        }
        return d10;
    }

    protected d a() {
        boolean bl2 = cL.b();
        d d10 = this.B;
        if (!bl2) {
            if (d10 == null) {
                this.B = net.minecraft.au.g.b().a("^", "#", "#").a('^', net.minecraft.Z.f.a(D)).a('#', net.minecraft.Z.f.a(net.minecraft.au.e.a(g.da))).a();
            }
            d10 = this.B;
        }
        return d10;
    }

    @Override
    public void b(z z2, n n2, i i2) {
        super.b(z2, n2, i2);
        this.c(z2, n2);
    }

    /*
     * WARNING - void declaration
     */
    private void c(z z2, n n2) {
        block21: {
            h h2;
            boolean bl2;
            h h3;
            block26: {
                block27: {
                    int n3;
                    block22: {
                        Object object;
                        h3 = this.a().a(z2, n2);
                        bl2 = cL.e();
                        h2 = h3;
                        if (!bl2) break block26;
                        if (h2 == null) break block27;
                        for (int i2 = 0; i2 < this.a().c(); ++i2) {
                            object = h3.a(0, i2, 0);
                            z2.a(((net.minecraft.Z.f)object).c(), g.bf.d(), 2);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block21;
                        }
                        an an2 = new an(z2);
                        object = h3.a(0, 2, 0).c();
                        an2.c((double)((m)object).e() + 0.5, (double)((m)object).b() + 0.05, (double)((m)object).a() + 0.5, 0.0f, 0.0f);
                        z2.f(an2);
                        for (k object2 : z2.a(k.class, an2.m().a(5.0))) {
                            a6.z.a(object2, an2);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block21;
                        }
                        for (n3 = 0; n3 < 120; ++n3) {
                            z2.a(aH.SNOW_SHOVEL, (double)((m)object).e() + z2.J.nextDouble(), (double)((m)object).b() + z2.J.nextDouble() * 2.5, (double)((m)object).a() + z2.J.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block22;
                        }
                        n3 = 0;
                    }
                    while (n3 < this.a().c()) {
                        net.minecraft.Z.f f10 = h3.a(0, n3, 0);
                        z2.b(f10.c(), g.bf, false);
                        ++n3;
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block21;
                    }
                    if (bl2) break block21;
                }
                h2 = h3 = this.b().a(z2, n2);
            }
            if (h2 != null) {
                int n4;
                block24: {
                    int n5 = 0;
                    while (n5 < this.b().a()) {
                        block23: {
                            if (!bl2) break block21;
                            for (int i3 = 0; i3 < this.b().c(); ++i3) {
                                z2.a(h3.a(n5, i3, 0).c(), g.bf.d(), 2);
                                if (bl2) {
                                    if (bl2) continue;
                                }
                                break block23;
                            }
                            ++n5;
                        }
                        if (bl2) continue;
                    }
                    n n6 = h3.a(1, 2, 0).c();
                    aX aX2 = new aX(z2);
                    aX2.p(true);
                    aX2.c((double)n6.e() + 0.5, (double)n6.b() + 0.05, (double)n6.a() + 0.5, 0.0f, 0.0f);
                    z2.f(aX2);
                    for (k k2 : z2.a(k.class, aX2.m().a(5.0))) {
                        a6.z.a(k2, aX2);
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block21;
                    }
                    for (n4 = 0; n4 < 120; ++n4) {
                        z2.a(aH.SNOWBALL, (double)n6.e() + z2.J.nextDouble(), (double)n6.b() + z2.J.nextDouble() * 3.9, (double)n6.a() + z2.J.nextDouble(), 0.0, 0.0, 0.0, new int[0]);
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block24;
                    }
                    n4 = 0;
                }
                while (n4 < this.b().a()) {
                    block25: {
                        void var8_22;
                        boolean bl3 = false;
                        while (var8_22 < this.b().c()) {
                            net.minecraft.Z.f f11 = h3.a(n4, (int)var8_22, 0);
                            z2.b(f11.c(), g.bf, false);
                            ++var8_22;
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block25;
                        }
                        ++n4;
                    }
                    if (bl2) continue;
                }
            }
        }
    }

    static {
        D = new de();
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, aA.b(n2));
    }

    @Override
    public int d(i i2) {
        return i2.b(z).k();
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(z)));
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(z, b10.K().h());
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(z, ae2.a(i2.b(z)));
    }
}

