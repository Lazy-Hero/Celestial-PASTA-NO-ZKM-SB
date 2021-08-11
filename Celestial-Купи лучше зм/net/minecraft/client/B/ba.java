/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import net.minecraft.k.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ba
extends aL {
    private final /* synthetic */ net.minecraft.as.h x;

    @Override
    public void f() {
        super.f();
    }

    public int b() {
        return this.k;
    }

    public ba(net.minecraft.as.h h2, int n2, int n3, int n4, int n5, int n6) {
        super(Q.P(), n2, n3, n4, n5, n6);
        this.x = h2;
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.x.a(n2, bl2, n3, n4);
    }

    @Override
    protected void c() {
        this.x.e();
    }

    public int c() {
        return this.q;
    }

    @Override
    protected int h() {
        return this.x.d();
    }

    @Override
    public void b(int n2, int n3, float f10) {
        block10: {
            int n4;
            int n5;
            String[] arrstring;
            block9: {
                arrstring = net.minecraft.client.b.q.b();
                n5 = this.g;
                if (arrstring == null) break block9;
                if (n5 == 0) break block10;
                this.i = n2;
                this.q = n3;
                this.c();
                n5 = this.h();
            }
            int n6 = n5;
            int n7 = n6 + 6;
            this.b();
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.C();
            W w2 = W.c();
            I i2 = w2.b();
            int n8 = this.e + this.k / 2 - this.j() / 2 + 2;
            int n9 = this.s + 4 - (int)this.f;
            int n10 = this.p;
            if (arrstring != null) {
                if (n10 != 0) {
                    this.a(n8, n9, w2);
                }
                this.a(n8, n9, n2, n3, f10);
                net.minecraft.client.a.v.n();
                this.b(0, this.s, 255, 255);
                this.b(this.o, this.d, 255, 255);
                net.minecraft.client.a.v.a();
                net.minecraft.client.a.v.a(net.minecraft.client.a.o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ZERO, G.ONE);
                net.minecraft.client.a.v.v();
                net.minecraft.client.a.v.g(7425);
                net.minecraft.client.a.v.L();
                n10 = this.k();
            }
            int n11 = n4 = n10;
            if (arrstring != null) {
                if (n11 > 0) {
                    int n12 = (this.o - this.s) * (this.o - this.s) / this.a();
                    n12 = h.c(n12, 32, this.o - this.s - 8);
                    int n13 = (int)this.f * (this.o - this.s - n12) / n4 + this.s;
                    if (arrstring != null) {
                        if (n13 < this.s) {
                            n13 = this.s;
                        }
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)this.o, 0.0).a(0.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.o, 0.0).a(1.0, 1.0).b(0, 0, 0, 255).d();
                        i2.c((double)n7, (double)this.s, 0.0).a(1.0, 0.0).b(0, 0, 0, 255).d();
                        i2.c((double)n6, (double)this.s, 0.0).a(0.0, 0.0).b(0, 0, 0, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n13 + n12), 0.0).a(0.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)(n13 + n12), 0.0).a(1.0, 1.0).b(128, 128, 128, 255).d();
                        i2.c((double)n7, (double)n13, 0.0).a(1.0, 0.0).b(128, 128, 128, 255).d();
                        i2.c((double)n6, (double)n13, 0.0).a(0.0, 0.0).b(128, 128, 128, 255).d();
                        w2.a();
                        i2.a(7, net.minecraft.client.y.b.t);
                        i2.c((double)n6, (double)(n13 + n12 - 1), 0.0).a(0.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)(n13 + n12 - 1), 0.0).a(1.0, 1.0).b(192, 192, 192, 255).d();
                        i2.c((double)(n7 - 1), (double)n13, 0.0).a(1.0, 0.0).b(192, 192, 192, 255).d();
                        i2.c((double)n6, (double)n13, 0.0).a(0.0, 0.0).b(192, 192, 192, 255).d();
                    }
                    w2.a();
                }
                this.d(n2, n3);
                net.minecraft.client.a.v.x();
                n11 = 7424;
            }
            net.minecraft.client.a.v.g(n11);
            net.minecraft.client.a.v.e();
            net.minecraft.client.a.v.f();
        }
    }

    public int e() {
        return this.i;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        this.x.a(n2, n3, n4, n5, n6, n7);
    }

    @Override
    protected int a() {
        return this.x.c();
    }

    @Override
    protected int d() {
        return this.x.g();
    }

    @Override
    protected boolean a(int n2) {
        return this.x.b(n2);
    }
}

