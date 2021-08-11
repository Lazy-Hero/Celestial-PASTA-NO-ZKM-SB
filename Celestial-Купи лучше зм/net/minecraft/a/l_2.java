/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.F;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.W.C;
import net.minecraft.W.d2;
import net.minecraft.ag.P;
import net.minecraft.ag.V;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.p.o;

public class l
extends h {
    protected static final /* synthetic */ net.minecraft.p.d H;
    private final /* synthetic */ F K;
    protected static final /* synthetic */ net.minecraft.p.e J;
    protected static final /* synthetic */ net.minecraft.p.d I;

    public l(F f10, e e10) {
        block8: {
            block7: {
                l l2;
                F f11;
                F f12;
                block6: {
                    super(e10);
                    this.K = f10;
                    boolean bl2 = net.minecraft.A.b.f();
                    this.a.I = 10;
                    this.a.G = 2;
                    f12 = this.K;
                    f11 = F.FLOWER;
                    if (!bl2) {
                        if (f12 == f11) {
                            this.a.I = 6;
                            this.a.C = 100;
                            this.a.G = 1;
                            this.j.add(new d(P.class, 4, 2, 3));
                        }
                        f12 = this.K;
                        f11 = F.NORMAL;
                    }
                    if (bl2) break block6;
                    if (f12 == f11) {
                        this.j.add(new d(V.class, 5, 4, 4));
                    }
                    l2 = this;
                    if (bl2) break block7;
                    f12 = l2.K;
                    f11 = F.ROOFED;
                }
                if (f12 != f11) break block8;
                l2 = this;
            }
            l2.a.I = -999;
        }
    }

    @Override
    public int c(n n2) {
        int n3 = super.c(n2);
        return this.K == F.ROOFED ? (n3 & 0xFEFEFE) + 2634762 >> 1 : n3;
    }

    @Override
    public Class<? extends h> i() {
        return l.class;
    }

    static {
        I = new net.minecraft.p.d(false, true);
        H = new net.minecraft.p.d(false, false);
        J = new net.minecraft.p.e(false);
    }

    @Override
    public void a(z z2, Random random, n n2) {
        boolean bl2;
        block6: {
            l l2;
            block5: {
                bl2 = net.minecraft.A.b.f();
                l2 = this;
                if (bl2) break block5;
                if (l2.K != F.ROOFED) break block6;
                l2 = this;
            }
            l2.b(z2, random, n2);
        }
        int n3 = random.nextInt(5) - 3;
        l l3 = this;
        if (!bl2) {
            if (l3.K == F.FLOWER) {
                n3 += 2;
            }
            this.a(z2, random, n2, n3);
            l3 = this;
        }
        super.a(z2, random, n2);
    }

    protected void b(z z2, Random random, n n2) {
        int n3 = 0;
        boolean bl2 = net.minecraft.A.b.c();
        block0: while (true) {
            int n4 = n3;
            block1: while (n4 < 4) {
                int n5 = 0;
                while (n5 < 4) {
                    block9: {
                        block8: {
                            a a10;
                            n n6;
                            block7: {
                                int n7 = n3 * 4 + 1 + 8 + random.nextInt(3);
                                int n8 = n5 * 4 + 1 + 8 + random.nextInt(3);
                                n6 = z2.C(n2.a(n7, 0, n8));
                                n4 = random.nextInt(20);
                                if (!bl2) continue block1;
                                if (n4 != 0) break block7;
                                a10 = new o();
                                ((o)a10).a(z2, random, n6);
                                if (bl2) break block8;
                            }
                            a10 = this.b(random);
                            a10.a();
                            if (!bl2) break block9;
                            if (a10.a(z2, random, n6)) {
                                ((net.minecraft.p.b)a10).a(z2, random, n6);
                            }
                        }
                        ++n5;
                    }
                    if (bl2) continue;
                }
                ++n3;
                if (bl2) continue block0;
            }
            break;
        }
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        block5: {
            int n2;
            block6: {
                boolean bl2 = net.minecraft.A.b.c();
                F f10 = this.K;
                F f11 = F.ROOFED;
                if (bl2) {
                    if (f10 == f11 && random.nextInt(3) > 0) {
                        return J;
                    }
                    f10 = this.K;
                    f11 = F.BIRCH;
                }
                if (f10 == f11) break block5;
                n2 = random.nextInt(5);
                if (!bl2) break block6;
                if (n2 == 0) break block5;
                n2 = random.nextInt(10);
            }
            return n2 == 0 ? r : C;
        }
        return H;
    }

    protected void a(z z2, Random random, n n2, int n3) {
        int n4 = 0;
        boolean bl2 = net.minecraft.A.b.f();
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 < n3) {
                int n6;
                block13: {
                    int n7;
                    block10: {
                        int n8;
                        block11: {
                            int n9;
                            block12: {
                                block8: {
                                    block9: {
                                        n7 = n9 = random.nextInt(3);
                                        if (bl2) break block8;
                                        if (n7 != 0) break block9;
                                        h.a(d2.SYRINGA);
                                        if (!bl2) break block10;
                                    }
                                    n7 = n9;
                                }
                                n8 = 1;
                                if (bl2) break block11;
                                if (n7 != n8) break block12;
                                h.a(d2.ROSE);
                                if (!bl2) break block10;
                            }
                            n7 = n9;
                            if (bl2) break block13;
                            n8 = 2;
                        }
                        if (n7 == n8) {
                            h.a(d2.PAEONIA);
                        }
                    }
                    n7 = n6 = 0;
                }
                while (n6 < 5) {
                    int n10 = random.nextInt(16) + 8;
                    int n11 = random.nextInt(16) + 8;
                    int n12 = random.nextInt(z2.C(n2.a(n10, 0, n11)).b() + 32);
                    if (!bl2) {
                        n5 = h.a(z2, random, new n(n2.e() + n10, n12, n2.a() + n11)) ? 1 : 0;
                        if (bl2) continue block1;
                        if (n5 != 0 && !bl2) break;
                        ++n6;
                    }
                    if (!bl2) continue;
                }
                ++n4;
                if (!bl2) continue block0;
            }
            break;
        }
    }

    @Override
    public C a(Random random, n n2) {
        boolean bl2 = net.minecraft.A.b.c();
        l l2 = this;
        if (bl2) {
            if (l2.K == F.FLOWER) {
                C c10;
                double d10 = net.minecraft.k.h.b((1.0 + k.a((double)n2.e() / 48.0, (double)n2.a() / 48.0)) / 2.0, 0.0, 0.9999);
                C c11 = c10 = net.minecraft.W.C.values()[(int)(d10 * (double)net.minecraft.W.C.values().length)];
                if (bl2) {
                    c11 = c11 == net.minecraft.W.C.BLUE_ORCHID ? net.minecraft.W.C.POPPY : c10;
                }
                return c11;
            }
            l2 = this;
        }
        return super.a(random, n2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

