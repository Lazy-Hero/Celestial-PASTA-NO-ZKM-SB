/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.T.aH;
import net.minecraft.T.ak;
import net.minecraft.T.ay;
import net.minecraft.ag.P;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.G;
import net.minecraft.p.H;
import net.minecraft.p.l;
import net.minecraft.u.g;

public class x
extends h {
    private final /* synthetic */ boolean I;
    private final /* synthetic */ H J;
    private final /* synthetic */ G H;

    @Override
    public float j() {
        return 0.07f;
    }

    @Override
    public net.minecraft.p.b b(Random random) {
        return new l(false);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public x(boolean bl2, e e10) {
        block5: {
            boolean bl3 = net.minecraft.A.b.c();
            super(e10);
            this.J = new H();
            this.H = new G(4);
            boolean bl4 = bl3;
            this.I = bl2;
            boolean bl5 = bl2;
            if (bl4) {
                if (bl5) {
                    this.B = g.da.d();
                }
                this.j.clear();
                this.j.add(new d(P.class, 10, 2, 3));
                bl5 = this.j.add(new d(aH.class, 1, 1, 2));
            }
            Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                d d10 = (d)iterator.next();
                if (bl4) {
                    if (d10.b == ay.class) {
                        iterator.remove();
                    }
                    if (bl4) continue;
                }
                break block5;
            }
            this.D.add(new d(ay.class, 20, 4, 4));
            this.D.add(new d(ak.class, 80, 4, 4));
        }
    }

    @Override
    public void a(z z2, Random random, n n2) {
        block7: {
            boolean bl2 = net.minecraft.A.b.c();
            x x2 = this;
            if (bl2) {
                if (x2.I) {
                    int n3;
                    int n4;
                    int n5;
                    block6: {
                        for (n5 = 0; n5 < 3; ++n5) {
                            n4 = random.nextInt(16) + 8;
                            n3 = random.nextInt(16) + 8;
                            this.J.a(z2, random, z2.C(n2.a(n4, 0, n3)));
                            if (bl2) {
                                if (bl2) continue;
                            }
                            break block6;
                        }
                        n5 = 0;
                    }
                    while (n5 < 2) {
                        n4 = random.nextInt(16) + 8;
                        n3 = random.nextInt(16) + 8;
                        this.H.a(z2, random, z2.C(n2.a(n4, 0, n3)));
                        ++n5;
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block7;
                    }
                }
                x2 = this;
            }
            super.a(z2, random, n2);
        }
    }
}

