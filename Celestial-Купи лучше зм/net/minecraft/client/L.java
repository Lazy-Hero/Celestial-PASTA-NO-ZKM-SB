/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.ar.a7;
import net.minecraft.ar.u;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.s.b;
import net.minecraft.k.m;

public class L
implements u {
    private final /* synthetic */ l a;
    private /* synthetic */ long c;
    private /* synthetic */ String d;
    private final /* synthetic */ b e;
    private final /* synthetic */ Q b;
    private /* synthetic */ String f;
    private /* synthetic */ boolean g;

    @Override
    public void b(String string) {
        this.g = true;
        this.d(string);
    }

    private void d(String string) {
        block7: {
            block10: {
                block9: {
                    int n2;
                    m[] arrm;
                    block8: {
                        block5: {
                            block6: {
                                this.d = string;
                                arrm = Q.ag();
                                n2 = this.b.aU;
                                if (arrm == null) break block5;
                                if (n2 != 0) break block6;
                                if (!this.g) {
                                    throw new a7();
                                }
                                break block7;
                            }
                            v.h(256);
                            v.q(5889);
                            v.l();
                            n2 = as.c() ? 1 : 0;
                        }
                        if (arrm == null) break block8;
                        if (n2 == 0) break block9;
                        n2 = l.c();
                    }
                    int n3 = n2;
                    v.a(0.0, this.a.e() * n3, this.a.a() * n3, 0.0, 100.0, 300.0);
                    if (arrm != null) break block10;
                }
                l l2 = new l(this.b);
                v.a(0.0, l2.d(), l2.b(), 0.0, 100.0, 300.0);
            }
            v.q(5888);
            v.l();
            v.b(0.0f, 0.0f, -200.0f);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(String string) {
        m[] arrm = Q.ag();
        L l2 = this;
        if (arrm != null) {
            if (!l2.b.aU) {
                if (this.g) return;
                throw new a7();
            }
            this.c = 0L;
            this.f = string;
            this.a(-1);
            l2 = this;
        }
        l2.c = 0L;
    }

    @Override
    public void c(String string) {
        this.g = false;
        this.d(string);
    }

    @Override
    public void d() {
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public L(Q q2) {
        this.f = "";
        this.d = "";
        this.c = Q.aj();
        this.b = q2;
        this.a = new l(q2);
        this.e = new b(q2.P, q2.aT, false);
        this.e.c(9728);
    }

    @Override
    public void a(int n2) {
        block19: {
            int n3;
            int n4;
            int n5;
            int n6;
            block26: {
                m[] arrm;
                block25: {
                    int n7;
                    block24: {
                        l l2;
                        block23: {
                            int n8;
                            block21: {
                                block22: {
                                    block20: {
                                        block18: {
                                            boolean bl2;
                                            block17: {
                                                arrm = Q.ag();
                                                bl2 = this.b.aU;
                                                if (arrm == null) break block17;
                                                if (bl2) break block18;
                                                bl2 = this.g;
                                            }
                                            if (!bl2) {
                                                throw new a7();
                                            }
                                            break block19;
                                        }
                                        long l3 = Q.aj();
                                        if (arrm == null) break block20;
                                        if (l3 - this.c < 100L) break block19;
                                        this.c = l3;
                                    }
                                    l2 = new l(this.b);
                                    n6 = l.c();
                                    n5 = l2.e();
                                    n4 = l2.a();
                                    n8 = as.c();
                                    if (arrm == null) break block21;
                                    if (n8 == 0) break block22;
                                    this.e.b();
                                    if (arrm != null) break block23;
                                }
                                n8 = 256;
                            }
                            v.h(n8);
                        }
                        this.e.a(false);
                        v.q(5889);
                        v.l();
                        v.a(0.0, l2.d(), l2.b(), 0.0, 100.0, 300.0);
                        v.q(5888);
                        v.l();
                        v.b(0.0f, 0.0f, -200.0f);
                        n7 = as.c();
                        if (arrm == null) break block24;
                        if (n7 != 0) break block25;
                        n7 = 16640;
                    }
                    v.h(n7);
                }
                W w2 = W.c();
                I i2 = w2.b();
                this.b.aN().b(q.f);
                float f10 = 32.0f;
                i2.a(7, net.minecraft.client.y.b.t);
                i2.c(0.0, (double)n4, 0.0).a(0.0, (float)n4 / 32.0f).b(64, 64, 64, 255).d();
                i2.c((double)n5, (double)n4, 0.0).a((float)n5 / 32.0f, (float)n4 / 32.0f).b(64, 64, 64, 255).d();
                i2.c((double)n5, 0.0, 0.0).a((float)n5 / 32.0f, 0.0).b(64, 64, 64, 255).d();
                i2.c(0.0, 0.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 255).d();
                w2.a();
                n3 = n2;
                if (arrm == null) break block26;
                if (n3 >= 0) {
                    int n9 = 100;
                    int n10 = 2;
                    int n11 = n5 / 2 - 50;
                    int n12 = n4 / 2 + 16;
                    v.L();
                    i2.a(7, net.minecraft.client.y.b.i);
                    i2.c((double)n11, (double)n12, 0.0).b(128, 128, 128, 255).d();
                    i2.c((double)n11, (double)(n12 + 2), 0.0).b(128, 128, 128, 255).d();
                    i2.c((double)(n11 + 100), (double)(n12 + 2), 0.0).b(128, 128, 128, 255).d();
                    i2.c((double)(n11 + 100), (double)n12, 0.0).b(128, 128, 128, 255).d();
                    i2.c((double)n11, (double)n12, 0.0).b(128, 255, 128, 255).d();
                    i2.c((double)n11, (double)(n12 + 2), 0.0).b(128, 255, 128, 255).d();
                    i2.c((double)(n11 + n2), (double)(n12 + 2), 0.0).b(128, 255, 128, 255).d();
                    i2.c((double)(n11 + n2), (double)n12, 0.0).b(128, 255, 128, 255).d();
                    w2.a();
                    v.x();
                }
                v.a();
                v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
                this.b.a6.c(this.d, (n5 - this.b.a6.e(this.d)) / 2, n4 / 2 - 4 - 16, 0xFFFFFF);
                this.b.a6.c(this.f, (n5 - this.b.a6.e(this.f)) / 2, n4 / 2 - 4 + 8, 0xFFFFFF);
                this.e.a();
                if (arrm == null) break block19;
                n3 = as.c() ? 1 : 0;
            }
            if (n3 != 0) {
                this.e.b(n5 * n6, n4 * n6);
            }
            this.b.aH();
            try {
                Thread.yield();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

