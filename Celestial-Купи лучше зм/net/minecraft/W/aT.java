/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.w.bl;

public class aT
extends K {
    public static final /* synthetic */ d<bl> z;

    @Override
    public int g(i i2) {
        return i2.b(z).e();
    }

    public aT(c c10) {
        super(c10);
        this.h(this.e.a().a(z, bl.WHITE));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    static {
        z = d.a("color", bl.class);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        bl[] arrbl = bl.values();
        boolean bl2 = cL.b();
        for (bl bl3 : arrbl) {
            a22.add(new net.minecraft.w.d(this, 1, bl3.e()));
            if (!bl2) continue;
        }
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, bl.c(n2));
    }

    @Override
    public int d(i i2) {
        return i2.b(z).e();
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.a(i2.b(z));
    }
}

