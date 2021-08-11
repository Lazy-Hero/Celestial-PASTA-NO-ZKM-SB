/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.c5;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;

public class bi
extends K {
    public static final /* synthetic */ int B;
    public static final /* synthetic */ d<c5> A;
    public static final /* synthetic */ int z;
    public static final /* synthetic */ int C;

    public bi() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(A, c5.ROUGH));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, c5.a(n2));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, A);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, B));
        a22.add(new net.minecraft.w.d(this, 1, z));
        a22.add(new net.minecraft.w.d(this, 1, C));
    }

    static {
        A = d.a("variant", c5.class);
        B = c5.ROUGH.a();
        z = c5.BRICKS.a();
        C = c5.DARK.a();
    }

    @Override
    public int g(i i2) {
        return i2.b(A).a();
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(A) == c5.ROUGH ? net.minecraft.ac.a.h : net.minecraft.ac.a.G;
    }

    @Override
    public int d(i i2) {
        return i2.b(A).a();
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a(this.k() + "." + c5.ROUGH.b() + ".name");
    }
}

