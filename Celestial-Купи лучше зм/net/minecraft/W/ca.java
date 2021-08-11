/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cu;
import net.minecraft.W.dm;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ae.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public abstract class ca
extends cu {
    public static final /* synthetic */ d<D> C;

    @Override
    public a<?> a() {
        return C;
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(C).a();
    }

    @Override
    public i c(int n2) {
        i i2 = this.d().a(C, D.a(n2 & 7));
        if (!this.b()) {
            i2 = i2.a(B, (n2 & 8) == 0 ? dm.BOTTOM : dm.TOP);
        }
        return i2;
    }

    public ca() {
        super(net.minecraft.ac.c.k);
        i i2 = this.e.a();
        boolean bl2 = cL.e();
        K k2 = this;
        if (bl2) {
            if (!k2.b()) {
                i2 = i2.a(B, dm.BOTTOM);
            }
            this.h(i2.a(C, D.OAK));
            k2 = this.a(net.minecraft.ad.a.r);
        }
    }

    @Override
    public void a(net.minecraft.ad.a a10, a2<net.minecraft.w.d> a22) {
        D[] arrd = D.values();
        int n2 = arrd.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            D d10 = arrd[i2];
            a22.add(new net.minecraft.w.d(this, 1, d10.b()));
            if (!bl2) continue;
        }
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(C).b();
        boolean bl2 = cL.e();
        int n3 = this.b();
        if (bl2) {
            if (n3 == 0 && i2.b(B) == dm.TOP) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(g.e, 1, i2.b(C).b());
    }

    static {
        C = d.a("variant", D.class);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return this.b() ? new net.minecraft.Z.c((K)this, C) : new net.minecraft.Z.c((K)this, B, C);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int g(i i2) {
        return i2.b(C).b();
    }

    @Override
    public Comparable<?> a(net.minecraft.w.d d10) {
        return D.a(d10.d() & 7);
    }

    @Override
    public String a(int n2) {
        return super.k() + "." + D.a(n2).c();
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(g.e);
    }
}

