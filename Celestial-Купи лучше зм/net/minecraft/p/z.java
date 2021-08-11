/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.W.cV;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.u.g;

public class z
extends a {
    private final /* synthetic */ boolean a;
    public static final /* synthetic */ n d;
    public static final /* synthetic */ n e;

    public z(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public boolean a(net.minecraft.ah.z z2, Random random, n n2) {
        int n3;
        boolean bl2;
        block5: {
            int n4;
            Iterator<o> iterator = n.a(new n(n2.e() - 4, n2.b() - 1, n2.a() - 4), new n(n2.e() + 4, n2.b() + 32, n2.a() + 4)).iterator();
            bl2 = net.minecraft.p.a.c();
            while (iterator.hasNext()) {
                block7: {
                    z z3;
                    o o2;
                    block16: {
                        block17: {
                            int n5;
                            block14: {
                                block15: {
                                    block12: {
                                        double d10;
                                        double d11;
                                        block13: {
                                            int n6;
                                            block8: {
                                                block9: {
                                                    double d12;
                                                    block10: {
                                                        block11: {
                                                            block6: {
                                                                o2 = iterator.next();
                                                                d11 = o2.a(n2.e(), o2.b(), n2.a());
                                                                double d13 = d11 - 3.5;
                                                                n4 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                                                if (!bl2) break block5;
                                                                if (!bl2) break block6;
                                                                if (n4 > 0) break block7;
                                                                n5 = o2.b();
                                                            }
                                                            n6 = n2.b();
                                                            if (!bl2) break block8;
                                                            if (n5 >= n6) break block9;
                                                            double d14 = d11 - 2.5;
                                                            d12 = d14 == 0.0 ? 0 : (d14 < 0.0 ? -1 : 1);
                                                            if (!bl2) break block10;
                                                            if (d12 > 0) break block11;
                                                            this.a(z2, o2, g.g.d());
                                                            if (bl2) break block7;
                                                        }
                                                        d12 = o2.b();
                                                    }
                                                    if (d12 >= n2.b()) break block7;
                                                    this.a(z2, o2, g.v.d());
                                                    if (bl2) break block7;
                                                }
                                                n5 = o2.b();
                                                if (!bl2) break block12;
                                                n6 = n2.b();
                                            }
                                            if (n5 <= n6) break block13;
                                            this.a(z2, o2, g.bf.d());
                                            if (bl2) break block7;
                                        }
                                        n5 = (d10 = d11 - 2.5) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                    }
                                    if (!bl2) break block14;
                                    if (n5 <= 0) break block15;
                                    this.a(z2, o2, g.g.d());
                                    if (bl2) break block7;
                                }
                                z3 = this;
                                if (!bl2) break block16;
                                n5 = z3.a ? 1 : 0;
                            }
                            if (n5 == 0) break block17;
                            this.a(z2, new n(o2), g.df.d());
                            if (bl2) break block7;
                        }
                        z3 = this;
                    }
                    z3.a(z2, new n(o2), g.bf.d());
                }
                if (bl2) continue;
            }
            n4 = n3 = 0;
        }
        while (n3 < 4) {
            this.a(z2, n2.c(n3), g.g.d());
            ++n3;
            if (bl2) continue;
        }
        n n7 = n2.c(2);
        for (aA aA2 : av.HORIZONTAL) {
            this.a(z2, n7.a(aA2), g.h.d().a(cV.z, aA2));
            if (bl2) continue;
        }
        return true;
    }

    static {
        d = n.o;
        e = new n(d.e() - 4 & 0xFFFFFFF0, 0, d.a() - 4 & 0xFFFFFFF0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

