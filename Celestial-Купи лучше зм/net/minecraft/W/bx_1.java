/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.H;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;

public class bx
extends K {
    public static final /* synthetic */ d<H> z;

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.K;
    }

    @Override
    public int d(i i2) {
        return i2.b(z).a();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    public bx() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(z, H.DEFAULT));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, H.a(n2));
    }

    static {
        z = d.a("type", H.class);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        H[] arrh = H.values();
        int n2 = arrh.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            H h2 = arrh[i2];
            a22.add(new net.minecraft.w.d(this, 1, h2.a()));
            if (!bl2) continue;
        }
    }

    @Override
    public int g(i i2) {
        return i2.b(z).a();
    }
}

