/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.bw;
import net.minecraft.W.cL;
import net.minecraft.W.dq;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;

public class b6
extends bw {
    public static final /* synthetic */ d<dq> A;

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return i2.b(A).c();
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, dq.a(n2));
    }

    @Override
    public int d(i i2) {
        return i2.b(A).b();
    }

    @Override
    public int b(i i2) {
        dq dq2 = i2.b(A);
        return dq2.a();
    }

    @Override
    public int g(i i2) {
        return i2.b(A).b();
    }

    public b6() {
        this.h(this.e.a().a(A, dq.SAND));
    }

    static {
        A = d.a("variant", dq.class);
    }

    @Override
    protected c f() {
        return new c((K)this, A);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        dq[] arrdq = dq.values();
        int n2 = arrdq.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            dq dq2 = arrdq[i2];
            a22.add(new net.minecraft.w.d(this, 1, dq2.b()));
            if (!bl2) continue;
        }
    }
}

