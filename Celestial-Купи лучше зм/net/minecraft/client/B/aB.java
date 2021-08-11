/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.X;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.as;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import net.minecraft.w.d;
import net.minecraft.w.k;

class aB
extends aL {
    final /* synthetic */ X y;
    public /* synthetic */ int x;

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        as as2 = (as)X.c().get(n2);
        this.a(n3, n4, as2.a, as2.b);
        this.y.v.b(as2.c, n3 + 18 + 5, n4 + 6, 0xFFFFFF);
    }

    @Override
    protected boolean a(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        if (arrstring != null) {
            n3 = n3 == this.x ? 1 : 0;
        }
        return n3 != 0;
    }

    public aB(X x2) {
        this.y = x2;
        super(x2.m, L.h, L.w, 80, L.w - 37, 24);
        this.x = -1;
    }

    private void c(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x = n2;
        this.y.b();
        X.a(this.y).a(((as)X.c().get((int)X.b((X)this.y).x)).d);
    }

    private void c(int n2, int n3, int n4, int n5) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.aN().b(net.minecraft.client.b.q.d);
        float f10 = 0.0078125f;
        float f11 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(n2 + 0), (double)(n3 + 18), (double)net.minecraft.client.b.q.c).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        i2.c((double)(n2 + 18), (double)(n3 + 18), (double)net.minecraft.client.b.q.c).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        i2.c((double)(n2 + 18), (double)(n3 + 0), (double)net.minecraft.client.b.q.c).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        i2.c((double)(n2 + 0), (double)(n3 + 0), (double)net.minecraft.client.b.q.c).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        w2.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(int n2, int n3, k k2, int n4) {
        this.c(n2 + 1, n3 + 1);
        net.minecraft.client.a.v.q();
        a0.b();
        this.y.x.b(new d(k2, 1, k2.l() ? n4 : 0), n2 + 2, n3 + 2);
        a0.a();
        net.minecraft.client.a.v.u();
    }

    @Override
    protected int d() {
        return X.c().size();
    }

    @Override
    protected void c() {
    }
}

