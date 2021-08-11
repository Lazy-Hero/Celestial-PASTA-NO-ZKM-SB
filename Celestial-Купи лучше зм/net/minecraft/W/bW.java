/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.D;
import net.minecraft.W.J;
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.h;
import net.minecraft.w.k;

public class bW
extends b2 {
    public static final /* synthetic */ d<D> D;

    @Override
    public int g(i i2) {
        return i2.b(D).b();
    }

    @Override
    protected net.minecraft.w.d q(i i2) {
        return new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, i2.b(D).b() - 4);
    }

    static {
        D = d.a("variant", D.class, new J());
    }

    public bW() {
        this.h(this.e.a().a(D, net.minecraft.W.D.ACACIA).a(A, true).a(C, true));
    }

    @Override
    public D a(int n2) {
        return net.minecraft.W.D.a((n2 & 3) + 4);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, 0));
        a22.add(new net.minecraft.w.d(this, 1, 1));
    }

    @Override
    protected c f() {
        return new c((K)this, D, A, C);
    }

    @Override
    protected void b(z z2, n n2, i i2, int n3) {
        block2: {
            z z3;
            block3: {
                boolean bl2 = cL.e();
                if (i2.b(D) != net.minecraft.W.D.DARK_OAK) break block2;
                z3 = z2;
                if (!bl2) break block3;
                if (z3.J.nextInt(n3) != 0) break block2;
                z3 = z2;
            }
            bW.a(z3, n2, new net.minecraft.w.d(net.minecraft.u.h.ci));
        }
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, net.minecraft.w.d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.e();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                bW.a(z2, n2, new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, i2.b(D).b() - 4));
                if (bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.b();
        i i2 = this.d().a(D, this.a(n2));
        boolean bl3 = n2 & 4;
        if (!bl2) {
            bl3 = !bl3;
        }
        i i3 = i2.a(C, bl3);
        boolean bl4 = n2 & 8;
        if (!bl2) {
            bl4 = bl4 > false;
        }
        return i3.a(A, bl4);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this, 1, i2.b().d(i2) & 3);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        n2 |= i2.b(D).b() - 4;
        int n3 = i2.b(C).booleanValue();
        if (bl2) {
            if (n3 == 0) {
                n2 |= 4;
            }
            n3 = i2.b(A).booleanValue() ? 1 : 0;
        }
        if (bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }
}

