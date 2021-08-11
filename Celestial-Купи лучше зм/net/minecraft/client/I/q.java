/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import java.io.IOException;
import net.minecraft.B.D;
import net.minecraft.B.x;
import net.minecraft.U.B;
import net.minecraft.client.D.h;
import net.minecraft.client.I.p;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.K;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.as;
import net.minecraft.client.b.s;
import net.minecraft.client.b.t;
import net.minecraft.client.h.a;
import net.minecraft.client.h.e;
import net.minecraft.client.r.a4;
import net.minecraft.i.j;
import net.minecraft.k.m;

public class q
extends K
implements a {
    private /* synthetic */ float ac;
    private /* synthetic */ float ab;
    private final /* synthetic */ e af;
    private /* synthetic */ t ae;
    private /* synthetic */ boolean ag;
    private /* synthetic */ boolean ad;

    @Override
    protected void b(int n2, int n3, int n4) {
        block4: {
            q q2;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    q2 = this;
                    if (arrn != null) break block2;
                    if (!q2.ad) break block3;
                    this.ad = false;
                    if (arrn == null) break block4;
                }
                q2 = this;
            }
            super.b(n2, n3, n4);
        }
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(N);
        int n4 = this.H;
        int n5 = this.B;
        this.a(n4, n5, 0, 0, this.M, this.F);
        q.a((float)(n4 + 51), (float)(n5 + 75), 30, (float)(n4 + 51) - this.ac, (float)(n5 + 75 - 50) - this.ab, this.m.s);
    }

    public static void a(float f10, float f11, int n2, float f12, float f13, B b10) {
        block0: {
            net.minecraft.client.a.v.r();
            net.minecraft.client.a.v.M();
            net.minecraft.client.a.v.b(f10, f11, 50.0f);
            net.minecraft.client.a.v.d((float)(-n2), (float)n2, (float)n2);
            net.minecraft.client.a.v.a(180.0f, 0.0f, 0.0f, 1.0f);
            float f14 = b10.bf;
            float f15 = b10.e;
            float f16 = b10.at;
            float f17 = b10.bh;
            float f18 = b10.a1;
            net.minecraft.client.a.v.a(135.0f, 0.0f, 1.0f, 0.0f);
            a0.c();
            net.minecraft.client.a.v.a(-135.0f, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.a.v.a(-((float)Math.atan(f13 / 40.0f)) * 20.0f, 1.0f, 0.0f, 0.0f);
            b10.bf = (float)Math.atan(f12 / 40.0f) * 20.0f;
            b10.e = (float)Math.atan(f12 / 40.0f) * 40.0f;
            b10.at = -((float)Math.atan(f13 / 40.0f)) * 20.0f;
            b10.a1 = b10.e;
            b10.bh = b10.e;
            net.minecraft.client.a.v.b(0.0f, 0.0f, 0.0f);
            a4 a42 = Q.P().aQ();
            a42.a(180.0f);
            a42.a(false);
            a42.a(b10, 0.0, 0.0, 0.0, 0.0f, 1.0f, false);
            a42.a(true);
            b10.bf = f14;
            b10.e = f15;
            int[] arrn = net.minecraft.client.I.v.a();
            b10.at = f16;
            b10.bh = f17;
            b10.a1 = f18;
            net.minecraft.client.a.v.B();
            a0.a();
            net.minecraft.client.a.v.u();
            int[] arrn2 = arrn;
            net.minecraft.client.a.v.u(as.p);
            net.minecraft.client.a.v.L();
            net.minecraft.client.a.v.u(as.U);
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.client.I.v.b(new int[3]);
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                if (arrn != null) break block2;
                if (s2.g != 10) break block3;
                this.af.a(this.ag, ((x)this.X).m);
                this.af.g();
                this.H = this.af.a(this.ag, h, this.M);
                this.ae.c(this.H + 104, w / 2 - 22);
            }
            this.ad = true;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        this.af.a();
        super.h();
    }

    @Override
    public void e() {
        int[] arrn = net.minecraft.client.I.v.a();
        q q2 = this;
        if (arrn == null) {
            if (q2.m.aW.f()) {
                this.m.a(new p(this.m.s));
            }
            q2 = this;
        }
        q2.af.b();
    }

    @Override
    protected void b(int n2, int n3) {
        this.v.b(net.minecraft.client.D.h.a("container.crafting", new Object[0]), 97.0f, 8.0f, 0x404040);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block7: {
            e e10;
            block4: {
                q q2;
                block6: {
                    block5: {
                        int[] arrn = net.minecraft.client.I.v.a();
                        this.n();
                        int[] arrn2 = arrn;
                        boolean bl2 = this.af.d();
                        if (arrn2 == null) {
                            bl2 = !bl2;
                        }
                        this.aa = bl2;
                        e10 = this.af;
                        if (arrn2 != null) break block4;
                        if (!e10.d()) break block5;
                        q2 = this;
                        if (arrn2 != null) break block6;
                        if (!q2.ag) break block5;
                        this.a(f10, n2, n3);
                        this.af.a(n2, n3, f10);
                        if (arrn2 == null) break block7;
                    }
                    this.af.a(n2, n3, f10);
                    super.a(n2, n3, f10);
                    q2 = this;
                }
                e10 = q2.af;
            }
            e10.a(this.H, this.B, false, f10);
        }
        this.c(n2, n3);
        this.af.d(this.H, this.B, n2, n3);
        this.ac = n2;
        this.ab = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2;
        int[] arrn;
        block2: {
            block3: {
                arrn = net.minecraft.client.I.v.a();
                bl2 = this.ag;
                if (arrn != null) break block2;
                if (!bl2) break block3;
                bl2 = this.af.d();
                if (arrn != null) break block2;
                if (bl2) return false;
            }
            bl2 = super.a(n2, n3, n4, n5, n6, n7);
        }
        if (arrn != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int var1_1, int var2_2, int var3_3, int var4_4) {
        block6: {
            var5_5 = net.minecraft.client.I.v.a();
            v0 = var1_1;
            if (var5_5 != null) break block6;
            if (v0 < var3_3) ** GOTO lbl-1000
            v0 = var2_2;
            if (var5_5 != null) break block6;
            if (v0 < var4_4) ** GOTO lbl-1000
            v0 = var1_1;
            if (var5_5 == null) {
                if (v0 < var3_3 + this.M) {
                    v0 = var2_2;
                    if (var5_5 == null) {
                        ** if (v0 < var4_4 + this.F) goto lbl-1000
                    } else {
                        ** GOTO lbl16
                    }
                } else {
                    ** GOTO lbl15
                }
            }
            break block6;
lbl15:
            // 2 sources

            ** GOTO lbl-1000
lbl16:
            // 2 sources

            break block6;
lbl-1000:
            // 4 sources

            {
                v0 = 1;
                ** GOTO lbl20
            }
lbl-1000:
            // 1 sources

            {
                v0 = 0;
            }
        }
        var6_6 = v0;
        v1 = this.af.a(var1_1, var2_2, this.H, this.B, this.M, this.F);
        if (var5_5 == null) {
            if (v1 == 0) return (boolean)0;
            v1 = var6_6;
        }
        if (var5_5 != null) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        return (boolean)1;
    }

    @Override
    public void a(D d10, int n2, int n3, net.minecraft.B.h h2) {
        super.a(d10, n2, n3, h2);
        this.af.a(d10);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block3: {
            q q2;
            block4: {
                block5: {
                    boolean bl2;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.client.I.v.a();
                        bl2 = this.af.a(n2, n3, n4);
                        if (arrn != null) break block2;
                        if (bl2) break block3;
                        q2 = this;
                        if (arrn != null) break block4;
                        bl2 = q2.ag;
                    }
                    if (!bl2) break block5;
                    q2 = this;
                    if (arrn != null) break block4;
                    if (q2.af.d()) break block3;
                }
                q2 = this;
            }
            super.a(n2, n3, n4);
        }
    }

    @Override
    public void c() {
        this.af.h();
    }

    @Override
    public e d() {
        return this.af;
    }

    public q(j j2) {
        super(j2.cu);
        this.af = new e();
        this.l = true;
    }

    @Override
    public void r() {
        int[] arrn;
        block6: {
            q q2;
            block4: {
                block5: {
                    int[] arrn2 = net.minecraft.client.I.v.a();
                    this.t.clear();
                    arrn = arrn2;
                    q2 = this;
                    if (arrn != null) break block4;
                    if (!q2.m.aW.f()) break block5;
                    this.m.a(new p(this.m.s));
                    if (arrn == null) break block6;
                }
                q2 = this;
            }
            super.r();
        }
        int n2 = h;
        if (arrn == null) {
            n2 = n2 < 379 ? 1 : 0;
        }
        this.ag = n2;
        this.af.a(h, w, this.m, this.ag, ((x)this.X).m);
        this.H = this.af.a(this.ag, h, this.M);
        this.ae = new t(10, this.H + 104, w / 2 - 22, 20, 18, 178, 0, 19, N);
        this.t.add(this.ae);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            q q2;
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                q2 = this;
                if (arrn != null) break block2;
                if (q2.af.a(c10, n2)) break block3;
                q2 = this;
            }
            super.a(c10, n2);
        }
    }
}

