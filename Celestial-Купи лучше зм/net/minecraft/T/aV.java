/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Calendar;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.J.o;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.aX;
import net.minecraft.T.ae;
import net.minecraft.T.n;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.V;
import net.minecraft.ah.e;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.i;
import net.minecraft.ak.l;
import net.minecraft.ak.v;
import net.minecraft.ar.d;
import net.minecraft.i.j;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class aV
extends ae
implements O {
    private final /* synthetic */ l<aV> cy;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cx;
    private final /* synthetic */ i cz;

    public void l() {
        block3: {
            block5: {
                net.minecraft.w.d d10;
                aV aV2;
                int[] arrn;
                block4: {
                    z z2;
                    block2: {
                        arrn = net.minecraft.T.S.f();
                        z2 = this.aG;
                        if (arrn == null) break block2;
                        if (z2 == null) break block3;
                        aV2 = this;
                        if (arrn == null) break block4;
                        z2 = aV2.aG;
                    }
                    if (z2.C) break block3;
                    this.b5.a(this.cz);
                    this.b5.a(this.cy);
                    aV2 = this;
                }
                if ((d10 = aV2.av()).w() != net.minecraft.u.h.i) break block5;
                int n2 = 20;
                aV aV3 = this;
                if (arrn != null) {
                    if (aV3.aG.g() != net.minecraft.ah.e.HARD) {
                        n2 = 40;
                    }
                    this.cy.b(n2);
                    aV3 = this;
                }
                aV3.b5.a(4, this.cy);
                if (arrn != null) break block3;
            }
            this.b5.a(4, this.cz);
        }
    }

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(2, new net.minecraft.ak.S(this));
        this.b5.a(3, new v(this, 1.0));
        this.b5.a(3, new net.minecraft.ak.m<V>(this, V.class, 6.0f, 1.0, 1.2));
        this.b5.a(5, new aA(this, 1.0));
        this.b5.a(6, new aa(this, j.class, 8.0f));
        this.b5.a(6, new F(this));
        this.ci.a(1, new Z((D)this, false, new Class[0]));
        this.ci.a(2, new au<j>((D)this, j.class, true));
        this.ci.a(3, new au<aX>((D)this, aX.class, true));
    }

    @Override
    protected void b(h h2) {
        super.b(h2);
        this.a(net.minecraft.B.X.MAINHAND, new net.minecraft.w.d(net.minecraft.u.h.i));
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cx, false);
    }

    static {
        cx = net.minecraft.q.m.a(aV.class, net.minecraft.q.h.g);
    }

    public aV(z z2) {
        super(z2);
        this.cy = new l<aV>(this, 1.0, 20, 15.0f);
        this.cz = new n(this, this, 1.2, false);
        this.c(0.6f, 1.99f);
        this.l();
    }

    @Override
    public double an() {
        return -0.6;
    }

    @Override
    protected void a(net.minecraft.k.n n2, K k2) {
        this.a(this.m(), 0.15f, 1.0f);
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.l();
    }

    @Override
    public void aZ() {
        block3: {
            x x2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.aZ();
                int[] arrn2 = arrn;
                x2 = this.as();
                if (arrn2 == null) break block2;
                if (!(x2 instanceof D)) break block3;
                x2 = this.as();
            }
            D d10 = (D)x2;
            this.bf = d10.bf;
        }
    }

    @Override
    public void a(B b10, float f10) {
        f f11 = this.a(f10);
        double d10 = b10.a - this.a;
        double d11 = b10.m().b + (double)(b10.aD / 3.0f) - f11.aF;
        double d12 = b10.ax - this.ax;
        double d13 = net.minecraft.k.h.e(d10 * d10 + d12 * d12);
        f11.a(d10, d11 + d13 * (double)0.2f, d12, 1.6f, (float)(14 - this.aG.g().a() * 4));
        this.a(net.minecraft.u.E.L, 1.0f, 1.0f / (this.f().nextFloat() * 0.4f + 0.8f));
        this.aG.f(f11);
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.25);
    }

    @Override
    public float l() {
        return 1.74f;
    }

    @Override
    public net.minecraft.U.g ag() {
        return net.minecraft.U.g.UNDEAD;
    }

    public boolean f() {
        return this.ap.b(cx);
    }

    abstract d m();

    @Override
    public void a(boolean bl2) {
        this.ap.b(cx, bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected f a(float f10) {
        net.minecraft.z.h h2 = new net.minecraft.z.h(this.aG, this);
        h2.a((B)this, f10);
        return h2;
    }

    @Override
    public void E() {
        block7: {
            aV aV2;
            block5: {
                block6: {
                    int n2;
                    block8: {
                        int n3;
                        block9: {
                            int n4;
                            block10: {
                                block11: {
                                    net.minecraft.k.n n5;
                                    int[] arrn = net.minecraft.T.S.f();
                                    aV2 = this;
                                    if (arrn == null) break block5;
                                    if (!aV2.aG.R()) break block6;
                                    aV2 = this;
                                    if (arrn == null) break block5;
                                    if (aV2.aG.C) break block6;
                                    float f10 = this.S();
                                    net.minecraft.k.n n6 = n5 = this.as() instanceof o ? new net.minecraft.k.n(this.a, Math.round(this.aF), this.ax).a() : new net.minecraft.k.n(this.a, Math.round(this.aF), this.ax);
                                    if (arrn == null) break block7;
                                    if (!(f10 > 0.5f)) break block6;
                                    aV2 = this;
                                    if (arrn == null) break block5;
                                    if (!(aV2.g.nextFloat() * 30.0f < (f10 - 0.4f) * 2.0f)) break block6;
                                    aV2 = this;
                                    if (arrn == null) break block5;
                                    if (!aV2.aG.w(n5)) break block6;
                                    n3 = 1;
                                    net.minecraft.w.d d10 = this.b(net.minecraft.B.X.HEAD);
                                    n2 = d10.G();
                                    if (arrn == null) break block8;
                                    if (n2 != 0) break block9;
                                    n4 = d10.j();
                                    if (arrn == null) break block10;
                                    if (n4 == 0) break block11;
                                    d10.a(d10.u() + this.g.nextInt(2));
                                    n4 = d10.u();
                                    if (arrn == null) break block10;
                                    if (n4 >= d10.E()) {
                                        this.c(d10);
                                        this.a(net.minecraft.B.X.HEAD, net.minecraft.w.d.m);
                                    }
                                }
                                n4 = 0;
                            }
                            n3 = n4;
                        }
                        n2 = n3;
                    }
                    if (n2 != 0) {
                        this.h(8);
                    }
                }
                aV2 = this;
            }
            super.E();
        }
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        block5: {
            aV aV2;
            block8: {
                int n2;
                block7: {
                    int n3;
                    int[] arrn;
                    block6: {
                        aV aV3;
                        block4: {
                            j2 = super.a(h2, j2);
                            int[] arrn2 = net.minecraft.T.S.f();
                            this.b(h2);
                            arrn = arrn2;
                            this.a(h2);
                            this.l();
                            float f10 = this.g.nextFloat() - 0.55f * h2.b();
                            float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                            if (arrn != null) {
                                f11 = f11 < 0 ? 1.0f : 0.0f;
                            }
                            this.o((boolean)f11);
                            aV3 = this;
                            if (arrn == null) break block4;
                            if (!aV3.b(net.minecraft.B.X.HEAD).G()) break block5;
                            aV3 = this;
                        }
                        Calendar calendar = aV3.aG.F();
                        n2 = calendar.get(2) + 1;
                        n3 = 10;
                        if (arrn == null) break block6;
                        if (n2 != n3) break block5;
                        n2 = calendar.get(5);
                        if (arrn == null) break block7;
                        n3 = 31;
                    }
                    if (n2 != n3) break block5;
                    aV2 = this;
                    if (arrn == null) break block8;
                    float f12 = aV2.g.nextFloat() - 0.25f;
                    n2 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                }
                if (n2 >= 0) break block5;
                aV2 = this;
            }
            aV2.a(net.minecraft.B.X.HEAD, new net.minecraft.w.d(this.g.nextFloat() < 0.1f ? net.minecraft.u.g.y : net.minecraft.u.g.G));
            this.cf[net.minecraft.B.X.HEAD.a()] = 0.0f;
        }
        return j2;
    }

    @Override
    public void a(X x2, net.minecraft.w.d d10) {
        block0: {
            super.a(x2, d10);
            if (this.aG.C || x2 != net.minecraft.B.X.MAINHAND) break block0;
            this.l();
        }
    }
}

