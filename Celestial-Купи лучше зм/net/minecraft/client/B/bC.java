/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.v;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a9;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.aj;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;

class bC
extends aL {
    final /* synthetic */ a9 y;
    public /* synthetic */ int x;

    private void a(int n2, int n3, v v2) {
        int n4 = n2 + 5;
        this.y.a(n4 - 1, n4 + 32, n3 - 1, -2039584);
        this.y.a(n4 - 1, n4 + 32, n3 + 32, -6250336);
        this.y.b(n4 - 1, n3 - 1, n3 + 32, -2039584);
        this.y.b(n4 + 32, n3 - 1, n3 + 32, -6250336);
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.aN().b(v2);
        int n5 = 32;
        int n6 = 32;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(n4 + 0), (double)(n3 + 32), 0.0).a(0.0, 1.0).d();
        i2.c((double)(n4 + 32), (double)(n3 + 32), 0.0).a(1.0, 1.0).d();
        i2.c((double)(n4 + 32), (double)(n3 + 0), 0.0).a(1.0, 0.0).d();
        i2.c((double)(n4 + 0), (double)(n3 + 0), 0.0).a(0.0, 0.0).d();
        w2.a();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x = n2;
        this.y.a();
        a9.a(this.y).a(((aj)a9.b().get((int)a9.b((a9)this.y).x)).c.toString());
    }

    @Override
    protected void c() {
    }

    @Override
    protected int d() {
        return a9.b().size();
    }

    public bC(a9 a92) {
        this.y = a92;
        super(a92.m, L.h, L.w, 80, L.w - 32, 38);
        this.x = -1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        aj aj2 = (aj)a9.b().get(n2);
        this.a(n3, n4, aj2.b);
        this.y.v.b(aj2.a, n3 + 32 + 10, n4 + 14, 0xFFFFFF);
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
}

