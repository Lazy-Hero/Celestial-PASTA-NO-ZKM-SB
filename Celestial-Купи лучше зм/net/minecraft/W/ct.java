/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.cM;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.k;

public class ct
extends K {
    public static final /* synthetic */ d<cM> z;

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(z).c();
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, cM.a(n2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + "." + cM.STONE.b() + ".name");
    }

    @Override
    public int d(i i2) {
        return i2.b(z).d();
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        cM[] arrcM = cM.values();
        int n2 = arrcM.length;
        boolean bl2 = cL.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            cM cM2 = arrcM[i2];
            a22.add(new net.minecraft.w.d(this, 1, cM2.d()));
            if (bl2) continue;
        }
    }

    public ct() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(z, cM.STONE));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int g(i i2) {
        return i2.b(z).d();
    }

    static {
        z = d.a("variant", cM.class);
    }

    @Override
    public k a(i i2, Random random, int n2) {
        return i2.b(z) == cM.STONE ? net.minecraft.w.k.b(g.cW) : net.minecraft.w.k.b(g.bx);
    }
}

