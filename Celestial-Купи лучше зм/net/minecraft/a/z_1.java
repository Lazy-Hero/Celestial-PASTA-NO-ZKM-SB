/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.T.ai;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.p.C;
import net.minecraft.u.g;

public class z
extends h {
    protected static final /* synthetic */ i H;

    protected z(e e10) {
        super(e10);
        this.a.I = 2;
        this.a.C = 1;
        this.a.f = 1;
        this.a.h = 8;
        this.a.d = 10;
        this.a.u = 1;
        this.a.B = 4;
        this.a.a = 0;
        this.a.p = 0;
        this.a.G = 5;
        this.D.add(new d(ai.class, 1, 1, 1));
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return A;
    }

    static {
        H = g.c_.d();
    }

    @Override
    public int c(n n2) {
        double d10 = k.a((double)n2.e() * 0.0225, (double)n2.a() * 0.0225);
        boolean bl2 = net.minecraft.A.b.f();
        double d11 = d10 - -0.1;
        double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (!bl2) {
            d12 = d12 < 0 ? (double)5011004 : (double)6975545;
        }
        return (int)d12;
    }

    @Override
    public net.minecraft.W.C a(Random random, n n2) {
        return net.minecraft.W.C.BLUE_ORCHID;
    }

    @Override
    public int b(n n2) {
        return 6975545;
    }

    @Override
    public void a(net.minecraft.ah.z z2, Random random, n n2) {
        boolean bl2 = net.minecraft.A.b.f();
        super.a(z2, random, n2);
        boolean bl3 = bl2;
        int n3 = random.nextInt(64);
        if (!bl3 && n3 == 0) {
            n3 = new C().a(z2, random, n2) ? 1 : 0;
        }
    }

    @Override
    public void b(net.minecraft.ah.z z2, Random random, l l2, int n2, int n3, double d10) {
        double d11 = k.a((double)n2 * 0.25, (double)n3 * 0.25);
        boolean bl2 = net.minecraft.A.b.f();
        if (!bl2) {
            if (d11 > 0.0) {
                int n4 = n2 & 0xF;
                int n5 = n3 & 0xF;
                for (int i2 = 255; i2 >= 0; --i2) {
                    if (!bl2) {
                        if (l2.b(n5, i2, n4).o() == net.minecraft.ac.c.A) continue;
                        if (i2 != 62) break;
                        l l3 = l2;
                        int n6 = n5;
                        int n7 = i2;
                        int n8 = n4;
                        if (!bl2) {
                            if (l3.b(n6, n7, n8).b() == g.bQ) break;
                            l3 = l2;
                            n6 = n5;
                            n7 = i2;
                            n8 = n4;
                        }
                        l3.a(n6, n7, n8, o);
                        if (!bl2) {
                            if (!(d11 < 0.12)) break;
                            l2.a(n5, i2 + 1, n4, H);
                            if (!bl2) break;
                            if (!bl2) continue;
                        }
                    }
                    break;
                }
            } else {
                this.a(z2, random, l2, n2, n3, d10);
            }
        }
    }
}

