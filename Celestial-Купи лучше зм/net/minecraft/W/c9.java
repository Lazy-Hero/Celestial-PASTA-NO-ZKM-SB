/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cu;
import net.minecraft.W.dg;
import net.minecraft.W.dm;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public abstract class c9
extends cu {
    public static final /* synthetic */ c D;
    public static final /* synthetic */ d<dg> C;

    @Override
    protected net.minecraft.Z.c f() {
        return this.b() ? new net.minecraft.Z.c((K)this, D, C) : new net.minecraft.Z.c((K)this, B, C);
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + ".red_sandstone.name");
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(g.U, 1, i2.b(C).a());
    }

    @Override
    public int d(i i2) {
        int n2;
        block6: {
            int n3;
            block7: {
                block5: {
                    boolean bl2;
                    block4: {
                        n3 = 0;
                        n3 |= i2.b(C).a();
                        bl2 = cL.b();
                        n2 = this.b();
                        if (bl2) break block4;
                        if (n2 == 0) break block5;
                        n2 = i2.b(D).booleanValue() ? 1 : 0;
                    }
                    if (bl2) break block6;
                    if (n2 == 0) break block7;
                    n3 |= 8;
                    if (!bl2) break block7;
                }
                if (i2.b(B) == dm.TOP) {
                    n3 |= 8;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    @Override
    public String a(int n2) {
        return super.k() + "." + dg.a(n2).c();
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(C).b();
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.U);
    }

    @Override
    public i c(int n2) {
        i i2;
        block5: {
            block4: {
                i2 = this.d().a(C, dg.a(n2 & 7));
                boolean bl2 = cL.b();
                if (!this.b()) break block4;
                boolean bl3 = n2 & 8;
                if (!bl2) {
                    bl3 = bl3;
                }
                i2 = i2.a(D, bl3);
                if (!bl2) break block5;
            }
            i2 = i2.a(B, (n2 & 8) == 0 ? dm.BOTTOM : dm.TOP);
        }
        return i2;
    }

    @Override
    public a<?> a() {
        return C;
    }

    @Override
    public int g(i i2) {
        return i2.b(C).a();
    }

    @Override
    public Comparable<?> a(net.minecraft.w.d d10) {
        return dg.a(d10.d() & 7);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public c9() {
        i i2;
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    boolean bl3 = cL.e();
                    super(net.minecraft.ac.c.H);
                    bl2 = bl3;
                    i2 = this.e.a();
                    if (!bl2) break block2;
                    if (!this.b()) break block3;
                    i2 = i2.a(D, false);
                }
                if (bl2) break block4;
            }
            i2 = i2.a(B, dm.BOTTOM);
        }
        this.h(i2.a(C, dg.RED_SANDSTONE));
        this.a(net.minecraft.ad.a.r);
    }

    static {
        D = net.minecraft.ae.c.a("seamless");
        C = d.a("variant", dg.class);
    }

    @Override
    public void a(net.minecraft.ad.a a10, a2<net.minecraft.w.d> a22) {
        dg[] arrdg = dg.values();
        boolean bl2 = cL.e();
        for (dg dg2 : arrdg) {
            a22.add(new net.minecraft.w.d(this, 1, dg2.a()));
            if (bl2) continue;
        }
    }
}

