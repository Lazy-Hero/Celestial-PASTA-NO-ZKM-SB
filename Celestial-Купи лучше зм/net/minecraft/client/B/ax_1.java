/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.aA.l;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.Q;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

class ax
extends aL {
    public /* synthetic */ int x;
    final /* synthetic */ Q y;

    @Override
    protected int h() {
        return this.k - 70;
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

    @Override
    protected void c() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        String string;
        block12: {
            l l2;
            block13: {
                int n8;
                String[] arrstring;
                block10: {
                    block11: {
                        k k2;
                        K k3;
                        i i2;
                        block4: {
                            block6: {
                                block9: {
                                    K k4;
                                    block8: {
                                        block7: {
                                            block5: {
                                                l2 = Q.a(this.y).e().get(Q.a(this.y).e().size() - n2 - 1);
                                                i2 = l2.b();
                                                arrstring = net.minecraft.client.b.q.b();
                                                k3 = i2.b();
                                                k2 = net.minecraft.w.k.b(k3);
                                                if (k2 != h.v) break block4;
                                                k4 = k3;
                                                if (arrstring == null) break block5;
                                                if (k4 == net.minecraft.u.g.bQ) break block6;
                                                k4 = k3;
                                            }
                                            if (arrstring == null) break block7;
                                            if (k4 == net.minecraft.u.g.cL) break block6;
                                            k4 = k3;
                                        }
                                        if (arrstring == null) break block8;
                                        if (k4 == net.minecraft.u.g.bq) break block9;
                                        k4 = k3;
                                    }
                                    if (k4 != net.minecraft.u.g.ag) break block4;
                                }
                                k2 = h.cg;
                                if (arrstring != null) break block4;
                            }
                            k2 = h.ah;
                        }
                        d d10 = new d(k2, 1, k2.l() ? k3.d(i2) : 0);
                        String string2 = k2.h(d10);
                        this.a(n3, n4, d10);
                        this.y.v.b(string2, n3 + 18 + 5, n4 + 3, 0xFFFFFF);
                        n8 = n2;
                        if (arrstring == null) break block10;
                        if (n8 != 0) break block11;
                        string = net.minecraft.client.D.h.a("createWorld.customize.flat.layer.top", l2.d());
                        if (arrstring != null) break block12;
                    }
                    n8 = n2;
                }
                if (n8 != Q.a(this.y).e().size() - 1) break block13;
                string = net.minecraft.client.D.h.a("createWorld.customize.flat.layer.bottom", l2.d());
                if (arrstring != null) break block12;
            }
            string = net.minecraft.client.D.h.a("createWorld.customize.flat.layer", l2.d());
        }
        this.y.v.b(string, n3 + 2 + 213 - this.y.v.e(string), n4 + 3, 0xFFFFFF);
    }

    private void c(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    public ax(Q q2) {
        this.y = q2;
        super(q2.m, L.h, L.w, 43, L.w - 60, 24);
        this.x = -1;
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

    private void a(int n2, int n3, d d10) {
        String[] arrstring = net.minecraft.client.b.q.b();
        this.c(n2 + 1, n3 + 1);
        String[] arrstring2 = arrstring;
        net.minecraft.client.a.v.q();
        if (arrstring2 != null) {
            if (!d10.G()) {
                a0.b();
                this.y.x.b(d10, n2 + 2, n3 + 2);
                a0.a();
            }
            net.minecraft.client.a.v.u();
        }
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x = n2;
        this.y.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected int d() {
        return Q.a(this.y).e().size();
    }
}

