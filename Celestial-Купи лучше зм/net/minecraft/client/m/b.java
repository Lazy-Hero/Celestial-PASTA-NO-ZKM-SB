/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.m;

import java.io.IOException;
import net.minecraft.W.K;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a4;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aL;
import net.minecraft.client.m.e;
import net.minecraft.client.m.f;
import net.minecraft.client.m.g;
import net.minecraft.client.m.h;
import net.minecraft.d.J;
import net.minecraft.d.s;
import net.minecraft.k.m;
import net.minecraft.w.k;

public class b
extends L
implements a4 {
    private /* synthetic */ h y;
    private /* synthetic */ g F;
    private /* synthetic */ f B;
    private /* synthetic */ boolean E;
    private final /* synthetic */ net.minecraft.l.g z;
    private /* synthetic */ e A;
    private /* synthetic */ aL D;
    protected /* synthetic */ L C;
    protected /* synthetic */ String G;

    static a5 n(b b10) {
        return b10.v;
    }

    static a5 s(b b10) {
        return b10.v;
    }

    static a5 d(b b10) {
        return b10.v;
    }

    static a5 e(b b10) {
        return b10.v;
    }

    @Override
    public void b() {
        block3: {
            block2: {
                String string = K.c();
                b b10 = this;
                if (string == null) break block2;
                if (!b10.E) break block3;
                this.c();
                this.d();
                this.D = this.F;
                b10 = this;
            }
            b10.E = false;
        }
    }

    static a5 g(b b10) {
        return b10.v;
    }

    static net.minecraft.l.g p(b b10) {
        return b10.z;
    }

    @Override
    public void r() {
        this.G = net.minecraft.client.D.h.a("gui.stats", new Object[0]);
        this.E = true;
        this.m.ar().a(new s(J.REQUEST_STATS));
    }

    static a5 a(b b10) {
        return b10.v;
    }

    static a5 l(b b10) {
        return b10.v;
    }

    static a5 r(b b10) {
        return b10.v;
    }

    @Override
    protected void a(net.minecraft.client.b.s s2) throws IOException {
        block1: {
            block10: {
                int n2;
                int n3;
                String string;
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                block4: {
                                    block5: {
                                        block2: {
                                            block3: {
                                                block0: {
                                                    string = K.c();
                                                    n3 = s2.h;
                                                    if (string == null) break block0;
                                                    if (n3 == 0) break block1;
                                                    n3 = s2.g;
                                                }
                                                if (string == null) break block2;
                                                if (n3 != 0) break block3;
                                                this.m.a(this.C);
                                                if (string != null) break block1;
                                            }
                                            n3 = s2.g;
                                        }
                                        n2 = 1;
                                        if (string == null) break block4;
                                        if (n3 != n2) break block5;
                                        this.D = this.F;
                                        if (string != null) break block1;
                                    }
                                    n3 = s2.g;
                                    n2 = 3;
                                }
                                if (string == null) break block6;
                                if (n3 != n2) break block7;
                                this.D = this.B;
                                if (string != null) break block1;
                            }
                            n3 = s2.g;
                            n2 = 2;
                        }
                        if (string == null) break block8;
                        if (n3 != n2) break block9;
                        this.D = this.A;
                        if (string != null) break block1;
                    }
                    n3 = s2.g;
                    n2 = 4;
                }
                if (n3 != n2) break block10;
                this.D = this.y;
                if (string != null) break block1;
            }
            this.D.a(s2);
        }
    }

    static a5 m(b b10) {
        return b10.v;
    }

    private void a(int n2, int n3, k k2) {
        this.b(n2 + 1, n3 + 1);
        net.minecraft.client.a.v.q();
        a0.b();
        this.x.b(k2.b(), n2 + 2, n3 + 2);
        a0.a();
        net.minecraft.client.a.v.u();
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block4: {
            b b10;
            block2: {
                block3: {
                    String string = K.c();
                    b10 = this;
                    if (string == null) break block2;
                    if (!b10.E) break block3;
                    this.n();
                    this.b(this.v, net.minecraft.client.D.h.a("multiplayer.downloadingStats", new Object[0]), h / 2, w / 2, 0xFFFFFF);
                    this.b(this.v, a[(int)(Q.aj() / 150L % (long)a.length)], h / 2, w / 2 + this.v.p * 2, 0xFFFFFF);
                    if (string != null) break block4;
                }
                this.D.b(n2, n3, f10);
                this.b(this.v, this.G, h / 2, 20, 0xFFFFFF);
                b10 = this;
            }
            super.a(n2, n3, f10);
        }
    }

    static a5 f(b b10) {
        return b10.v;
    }

    static a5 k(b b10) {
        return b10.v;
    }

    @Override
    public boolean i() {
        String string = K.c();
        boolean bl2 = this.E;
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static a5 c(b b10) {
        return b10.v;
    }

    static a5 i(b b10) {
        return b10.v;
    }

    public b(L l2, net.minecraft.l.g g10) {
        this.G = "Select world";
        this.E = true;
        this.C = l2;
        this.z = g10;
    }

    public void c() {
        this.F = new g(this, this.m);
        this.F.a(1, 1);
        this.B = new f(this, this.m);
        this.B.a(1, 1);
        this.A = new e(this, this.m);
        this.A.a(1, 1);
        this.y = new h(this, this.m);
        this.y.a(1, 1);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static a5 o(b b10) {
        return b10.v;
    }

    private void b(int n2, int n3) {
        this.c(n2, n3, 0, 0);
    }

    @Override
    public void k() throws IOException {
        block3: {
            aL aL2;
            block2: {
                String string = K.c();
                super.k();
                String string2 = string;
                aL2 = this.D;
                if (string2 == null) break block2;
                if (aL2 == null) break block3;
                aL2 = this.D;
            }
            aL2.f();
        }
    }

    public void d() {
        block5: {
            String string = K.c();
            this.t.add(new net.minecraft.client.b.s(0, h / 2 + 4, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
            this.t.add(new net.minecraft.client.b.s(1, h / 2 - 160, w - 52, 80, 20, net.minecraft.client.D.h.a("stat.generalButton", new Object[0])));
            net.minecraft.client.b.s s2 = this.b(new net.minecraft.client.b.s(2, h / 2 - 80, w - 52, 80, 20, net.minecraft.client.D.h.a("stat.blocksButton", new Object[0])));
            net.minecraft.client.b.s s3 = this.b(new net.minecraft.client.b.s(3, h / 2, w - 52, 80, 20, net.minecraft.client.D.h.a("stat.itemsButton", new Object[0])));
            net.minecraft.client.b.s s4 = this.b(new net.minecraft.client.b.s(4, h / 2 + 80, w - 52, 80, 20, net.minecraft.client.D.h.a("stat.mobsButton", new Object[0])));
            String string2 = string;
            int n2 = this.A.d();
            if (string2 != null) {
                if (n2 == 0) {
                    s2.h = false;
                }
                n2 = this.B.d();
            }
            if (string2 != null) {
                if (n2 == 0) {
                    s3.h = false;
                }
                n2 = this.y.d();
            }
            if (n2 == 0) {
                s4.h = false;
            }
            if (net.minecraft.k.m.d()) break block5;
            K.b("A92wM");
        }
    }

    static a5 h(b b10) {
        return b10.v;
    }

    static a5 j(b b10) {
        return b10.v;
    }

    static void a(b b10, int n2, int n3, k k2) {
        b10.a(n2, n3, k2);
    }

    private void c(int n2, int n3, int n4, int n5) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(d);
        float f10 = 0.0078125f;
        float f11 = 0.0078125f;
        int n6 = 18;
        int n7 = 18;
        W w2 = W.c();
        I i2 = w2.b();
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c((double)(n2 + 0), (double)(n3 + 18), (double)c).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        i2.c((double)(n2 + 18), (double)(n3 + 18), (double)c).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 18) * 0.0078125f).d();
        i2.c((double)(n2 + 18), (double)(n3 + 0), (double)c).a((float)(n4 + 18) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        i2.c((double)(n2 + 0), (double)(n3 + 0), (double)c).a((float)(n4 + 0) * 0.0078125f, (float)(n5 + 0) * 0.0078125f).d();
        w2.a();
    }

    static a5 q(b b10) {
        return b10.v;
    }

    static void a(b b10, int n2, int n3, int n4, int n5) {
        b10.c(n2, n3, n4, n5);
    }

    static a5 b(b b10) {
        return b10.v;
    }
}

