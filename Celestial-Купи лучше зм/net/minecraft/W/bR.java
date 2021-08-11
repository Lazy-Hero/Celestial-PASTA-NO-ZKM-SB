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
import net.minecraft.W.K;
import net.minecraft.W.b2;
import net.minecraft.W.cL;
import net.minecraft.W.l;
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

public class bR
extends b2 {
    public static final /* synthetic */ d<D> D;

    @Override
    public D a(int n2) {
        return net.minecraft.W.D.a((n2 & 3) % 4);
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(D, this.a(n2));
        boolean bl3 = n2 & 4;
        if (bl2) {
            bl3 = !bl3;
        }
        i i3 = i2.a(C, bl3);
        boolean bl4 = n2 & 8;
        if (bl2) {
            bl4 = bl4 > false;
        }
        return i3.a(A, bl4);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(D).b();
        boolean bl2 = cL.e();
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

    @Override
    protected net.minecraft.w.d q(i i2) {
        return new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, i2.b(D).b());
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, net.minecraft.w.d d10) {
        block1: {
            block0: {
                boolean bl2 = cL.e();
                if (z2.C || d10.w() != net.minecraft.u.h.aT) break block0;
                j2.b(net.minecraft.l.m.a(this));
                bR.a(z2, n2, new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, i2.b(D).b()));
                if (bl2) break block1;
            }
            super.a(z2, j2, n2, i2, y2, d10);
        }
    }

    @Override
    protected c f() {
        return new c((K)this, D, A, C);
    }

    @Override
    protected int a(i i2) {
        return i2.b(D) == net.minecraft.W.D.JUNGLE ? 40 : super.a(i2);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, net.minecraft.W.D.OAK.b()));
        a22.add(new net.minecraft.w.d(this, 1, net.minecraft.W.D.SPRUCE.b()));
        a22.add(new net.minecraft.w.d(this, 1, net.minecraft.W.D.BIRCH.b()));
        a22.add(new net.minecraft.w.d(this, 1, net.minecraft.W.D.JUNGLE.b()));
    }

    @Override
    protected void b(z z2, n n2, i i2, int n3) {
        block2: {
            z z3;
            block3: {
                boolean bl2 = cL.e();
                if (i2.b(D) != net.minecraft.W.D.OAK) break block2;
                z3 = z2;
                if (!bl2) break block3;
                if (z3.J.nextInt(n3) != 0) break block2;
                z3 = z2;
            }
            bR.a(z3, n2, new net.minecraft.w.d(net.minecraft.u.h.ci));
        }
    }

    @Override
    public int g(i i2) {
        return i2.b(D).b();
    }

    public bR() {
        this.h(this.e.a().a(D, net.minecraft.W.D.OAK).a(A, true).a(C, true));
    }

    static {
        D = d.a("variant", D.class, new l());
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

