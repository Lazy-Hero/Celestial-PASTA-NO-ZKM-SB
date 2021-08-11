/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.C;
import net.minecraft.W.F;
import net.minecraft.W.K;
import net.minecraft.W.Y;
import net.minecraft.W.cI;
import net.minecraft.W.cL;
import net.minecraft.W.ci;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.k;
import net.minecraft.k.n;

public abstract class aE
extends Y {
    protected /* synthetic */ d<C> A;

    @Override
    public i c(int n2) {
        return this.d().a(this.a(), C.a(this.b(), n2));
    }

    @Override
    public int g(i i2) {
        return i2.b(this.a()).b();
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return super.a(i2, t2, n2).e(i2.b(t2, n2));
    }

    @Override
    public cI h() {
        return cI.XZ;
    }

    @Override
    public int d(i i2) {
        return i2.b(this.a()).b();
    }

    @Override
    protected c f() {
        return new c((K)this, this.a());
    }

    public abstract ci b();

    protected aE() {
        this.h(this.e.a().a(this.a(), this.b() == ci.RED ? C.POPPY : C.DANDELION));
    }

    public a<C> a() {
        boolean bl2 = cL.b();
        d<C> d10 = this.A;
        if (!bl2) {
            if (d10 == null) {
                this.A = d.a("type", C.class, new F(this));
            }
            d10 = this.A;
        }
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.ad.a a10, a2<net.minecraft.w.d> a22) {
        C[] arrc = C.a(this.b());
        boolean bl2 = cL.e();
        for (C c10 : arrc) {
            a22.add(new net.minecraft.w.d(this, 1, c10.b()));
            if (bl2) continue;
        }
    }
}

