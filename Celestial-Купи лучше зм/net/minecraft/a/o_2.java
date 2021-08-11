/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.f;
import net.minecraft.A.h;
import net.minecraft.W.b8;
import net.minecraft.W.d1;
import net.minecraft.ag.G;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.p.L;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class o
extends h {
    private final /* synthetic */ f J;
    private final /* synthetic */ a I;
    private final /* synthetic */ net.minecraft.p.l H;

    @Override
    public void b(z z2, Random random, l l2, int n2, int n3, double d10) {
        o o2;
        block10: {
            block9: {
                double d11;
                boolean bl2;
                block6: {
                    double d12;
                    block7: {
                        block8: {
                            o o3;
                            block4: {
                                block5: {
                                    this.B = g.aU.d();
                                    bl2 = net.minecraft.A.b.c();
                                    o3 = this;
                                    if (!bl2) break block4;
                                    o3.z = g.bv.d();
                                    if (d10 < -1.0) break block5;
                                    double d13 = d10 - 2.0;
                                    d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                    if (!bl2) break block6;
                                    if (d11 <= 0) break block7;
                                }
                                o3 = this;
                            }
                            if (!bl2) break block8;
                            if (o3.J != net.minecraft.A.f.MUTATED) break block7;
                            this.B = g.di.d();
                            o3 = this;
                        }
                        o3.z = g.di.d();
                        if (bl2) break block9;
                    }
                    d11 = (d12 = d10 - 1.0) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                }
                if (d11 <= 0) break block9;
                o2 = this;
                if (!bl2) break block10;
                if (o2.J != net.minecraft.A.f.EXTRA_TREES) {
                    this.B = g.bx.d();
                    this.z = g.bx.d();
                }
            }
            o2 = this;
        }
        o2.a(z2, random, l2, n2, n3, d10);
    }

    protected o(f f10, e e10) {
        boolean bl2 = net.minecraft.A.b.f();
        super(e10);
        boolean bl3 = bl2;
        this.I = new L(g.be.d().a(b8.z, d1.STONE), 9);
        this.H = new net.minecraft.p.l(false);
        if (!bl3) {
            if (f10 == net.minecraft.A.f.EXTRA_TREES) {
                this.a.I = 3;
            }
            this.j.add(new d(G.class, 5, 4, 6));
            this.J = f10;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return random.nextInt(3) > 0 ? this.H : super.b(random);
    }

    @Override
    public void a(z z2, Random random, n n2) {
        int n3;
        int n4;
        int n5;
        boolean bl2;
        int n6;
        block5: {
            boolean bl3 = net.minecraft.A.b.c();
            super.a(z2, random, n2);
            int n7 = 3 + random.nextInt(6);
            n6 = 0;
            bl2 = bl3;
            while (n6 < n7) {
                n5 = random.nextInt(16);
                n4 = random.nextInt(28) + 4;
                n3 = random.nextInt(16);
                n n8 = n2.a(n5, n4, n3);
                if (bl2) {
                    if (bl2) {
                        if (z2.d(n8).b() == g.bx) {
                            z2.a(n8, g.au.d(), 2);
                        }
                        ++n6;
                    }
                    if (bl2) continue;
                }
                break block5;
            }
            n6 = 0;
        }
        while (n6 < 7) {
            n5 = random.nextInt(16);
            n4 = random.nextInt(64);
            n3 = random.nextInt(16);
            this.I.a(z2, random, n2.a(n5, n4, n3));
            ++n6;
            if (bl2) continue;
        }
    }
}

