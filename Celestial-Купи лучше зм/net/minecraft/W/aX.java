/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.al;
import net.minecraft.W.cI;
import net.minecraft.W.cL;
import net.minecraft.W.cs;
import net.minecraft.W.d2;
import net.minecraft.W.e;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.g;
import net.minecraft.u.h;

public class aX
extends Y
implements cs {
    public static final /* synthetic */ d<e> B;
    protected static final /* synthetic */ k A;

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this, 1, i2.b().d(i2));
    }

    @Override
    public boolean a(z z2, Random random, n n2, i i2) {
        return true;
    }

    static {
        B = d.a("type", e.class);
        A = new k(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return random.nextInt(8) == 0 ? net.minecraft.u.h.a6 : net.minecraft.u.h.v;
    }

    @Override
    public cI h() {
        return cI.XYZ;
    }

    @Override
    public void b(z z2, Random random, n n2, i i2) {
        block5: {
            n n3;
            z z3;
            al al2;
            d2 d22;
            block4: {
                d22 = d2.GRASS;
                boolean bl2 = cL.b();
                if (i2.b(B) == net.minecraft.W.e.FERN) {
                    d22 = d2.FERN;
                }
                al2 = g.bW;
                z3 = z2;
                n3 = n2;
                if (bl2) break block4;
                if (!al2.a(z3, n3)) break block5;
                al2 = g.bW;
                z3 = z2;
                n3 = n2;
            }
            al2.a(z3, n3, d22, 2);
        }
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return A;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B);
    }

    @Override
    public boolean b(t t2, n n2) {
        return true;
    }

    protected aX() {
        super(net.minecraft.ac.c.z);
        this.h(this.e.a().a(B, net.minecraft.W.e.DEAD_BUSH));
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        boolean bl2 = cL.e();
        for (int i2 = 1; i2 < 3; ++i2) {
            a22.add(new net.minecraft.w.d(this, 1, i2));
            if (bl2) continue;
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2) {
        return this.a(z2.d(n2.k()));
    }

    @Override
    public int a(int n2, Random random) {
        return 1 + random.nextInt(n2 * 2 + 1);
    }

    @Override
    public int d(i i2) {
        return i2.b(B).a();
    }

    @Override
    public i c(int n2) {
        return this.d().a(B, net.minecraft.W.e.a(n2));
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, net.minecraft.w.d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.b();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                aX.a(z2, n2, new net.minecraft.w.d(g.dc, 1, i2.b(B).a()));
                if (!bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2, boolean bl2) {
        return i2.b(B) != net.minecraft.W.e.DEAD_BUSH;
    }
}

