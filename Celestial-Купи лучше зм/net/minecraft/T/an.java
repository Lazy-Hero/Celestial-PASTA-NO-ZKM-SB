/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.a7;
import net.minecraft.T.k;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.U.x;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.z.u;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class an
extends a7
implements O {
    private static final /* synthetic */ net.minecraft.q.r<Byte> cw;

    public void p(boolean bl2) {
        block2: {
            byte by2;
            block1: {
                int[] arrn;
                block0: {
                    by2 = this.ap.b(cw);
                    arrn = net.minecraft.T.S.f();
                    if (arrn == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cw, (byte)(by2 | 0x10));
                }
                if (arrn != null) break block2;
            }
            this.ap.b(cw, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("Pumpkin", this.b());
    }

    @Override
    protected boolean b(j j2, a3 a32) {
        boolean bl2;
        block5: {
            block4: {
                d d10 = j2.c(a32);
                int[] arrn = net.minecraft.T.S.f();
                if (d10.w() != net.minecraft.u.h.aT) break block4;
                bl2 = this.b();
                if (arrn == null) break block5;
                if (!bl2) break block4;
                bl2 = this.aG.C;
                if (arrn == null) break block5;
                if (!bl2) {
                    this.p(false);
                    d10.a(1, (B)j2);
                }
            }
            bl2 = super.b(j2, a32);
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean b() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.ap.b(cw) & 0x10;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public void E() {
        block12: {
            int n2;
            int n3;
            int[] arrn;
            block11: {
                int[] arrn2 = net.minecraft.T.S.f();
                super.E();
                arrn = arrn2;
                n3 = this.aG.C;
                if (arrn == null) break block11;
                if (n3 != 0) break block12;
                n3 = h.f(this.a);
            }
            int n4 = n3;
            int n5 = h.f(this.aF);
            int n6 = h.f(this.ax);
            int n7 = this.ar();
            if (arrn != null) {
                float f10;
                if (n7 != 0) {
                    this.a(net.minecraft.ar.G.u, 1.0f);
                }
                n7 = (f10 = this.aG.c(new n(n4, 0, n6)).a(new n(n4, n5, n6)) - 1.0f) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
            }
            if (arrn != null) {
                if (n7 > 0) {
                    this.a(net.minecraft.ar.G.x, 1.0f);
                }
                n7 = this.aG.M().c("mobGriefing") ? 1 : 0;
            }
            if (arrn != null) {
                if (n7 == 0) {
                    return;
                }
                n7 = n2 = 0;
            }
            while (n2 < 4) {
                block13: {
                    block14: {
                        float f11;
                        n n8;
                        block15: {
                            n4 = h.f(this.a + (double)((float)(n2 % 2 * 2 - 1) * 0.25f));
                            n5 = h.f(this.aF);
                            n6 = h.f(this.ax + (double)((float)(n2 / 2 % 2 * 2 - 1) * 0.25f));
                            n8 = new n(n4, n5, n6);
                            if (arrn == null) break block13;
                            if (this.aG.d(n8).o() != c.A) break block14;
                            float f12 = this.aG.c(n8).a(n8) - 0.8f;
                            f11 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (arrn == null) break block15;
                            if (f11 >= 0) break block14;
                            f11 = (float)net.minecraft.u.g.o.a(this.aG, n8);
                        }
                        if (arrn != null && f11 != false) {
                            f11 = (float)this.aG.a(n8, net.minecraft.u.g.o.d());
                        }
                    }
                    ++n2;
                }
                if (arrn != null) continue;
            }
        }
    }

    @Override
    @Nullable
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.dl;
    }

    @Override
    protected void H() {
        this.b5.a(1, new net.minecraft.ak.k(this, 1.25, 20, 10.0f));
        this.b5.a(2, new aA((D)this, 1.0, 1.0000001E-5f));
        this.b5.a(3, new aa(this, j.class, 6.0f));
        this.b5.a(4, new F(this));
        this.ci.a(1, new au<x>(this, C.class, 10, true, false, net.minecraft.T.k.b));
    }

    @Override
    public void a(B b10, float f10) {
        u u2 = new u(this.aG, this);
        double d10 = b10.aF + (double)b10.l() - (double)1.1f;
        double d11 = b10.a - this.a;
        double d12 = d10 - u2.aF;
        double d13 = b10.ax - this.ax;
        float f11 = h.e(d11 * d11 + d13 * d13) * 0.2f;
        u2.a(d11, d12 + (double)f11, d13, 1.6f, 12.0f);
        this.a(net.minecraft.u.E.fQ, 1.0f, 1.0f / (this.f().nextFloat() * 0.4f + 0.8f));
        this.aG.f(u2);
    }

    @Override
    public float l() {
        return 1.7f;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(4.0);
        this.a(net.minecraft.U.M.d).a(0.2f);
    }

    public an(z z2) {
        super(z2);
        this.c(0.7f, 1.9f);
    }

    @Override
    public void a(r r2) {
        block3: {
            r r3;
            an an2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                an2 = this;
                r3 = r2;
                if (arrn == null) break block2;
                super.a(r3);
                if (!r2.b("Pumpkin")) break block3;
                an2 = this;
                r3 = r2;
            }
            an2.p(r3.f("Pumpkin"));
        }
    }

    static {
        cw = net.minecraft.q.m.a(an.class, net.minecraft.q.h.m);
    }

    @Override
    public void a(boolean bl2) {
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ac;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cw, (byte)16);
    }

    @Override
    @Nullable
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.D;
    }

    public static void b(b b10) {
        C.a(b10, an.class);
    }

    @Override
    @Nullable
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.eO;
    }
}

