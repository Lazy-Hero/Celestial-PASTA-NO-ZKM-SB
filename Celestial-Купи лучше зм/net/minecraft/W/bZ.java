/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;

public class bZ
extends K {
    public static final /* synthetic */ d<D> z;

    @Override
    public int g(i i2) {
        return i2.b(z).b();
    }

    static {
        z = d.a("variant", D.class);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    public bZ() {
        super(net.minecraft.ac.c.k);
        this.h(this.e.a().a(z, D.OAK));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(z).a();
    }

    @Override
    public int d(i i2) {
        return i2.b(z).b();
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, D.a(n2));
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        D[] arrd = D.values();
        boolean bl2 = cL.b();
        for (D d10 : arrd) {
            a22.add(new net.minecraft.w.d(this, 1, d10.b()));
            if (!bl2) continue;
        }
    }
}

