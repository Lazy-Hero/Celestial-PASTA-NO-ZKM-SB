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
import net.minecraft.T.ae;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.i;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aq
extends ae {
    private /* synthetic */ boolean cy;
    private /* synthetic */ int cx;

    public aq(z z2) {
        super(z2);
        this.ch = 3;
        this.c(0.4f, 0.3f);
    }

    @Override
    public float l() {
        return 0.1f;
    }

    public static void b(b b10) {
        C.a(b10, aq.class);
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.ee;
    }

    public void a(boolean bl2) {
        this.cy = bl2;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("Lifetime", this.cx);
        r2.a("PlayerSpawned", this.cy);
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.cX;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.n;
    }

    @Override
    public g ag() {
        return net.minecraft.U.g.ARTHROPOD;
    }

    public boolean f() {
        return this.cy;
    }

    @Override
    public void ae() {
        this.bf = this.e;
        super.ae();
    }

    @Override
    public double an() {
        return 0.1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.bf, 0.15f, 1.0f);
    }

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(2, new i(this, 1.0, false));
        this.b5.a(3, new aA(this, 1.0));
        this.b5.a(7, new aa(this, j.class, 8.0f));
        this.b5.a(8, new F(this));
        this.ci.a(1, new Z((D)this, true, new Class[0]));
        this.ci.a(2, new au<j>((D)this, j.class, true));
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(8.0);
        this.a(net.minecraft.U.M.d).a(0.25);
        this.a(net.minecraft.U.M.g).a(2.0);
    }

    @Override
    public boolean C() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.C();
        if (arrn != null) {
            if (bl2) {
                j j2 = this.aG.a((x)this, 5.0);
                return j2 == null;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void e(float f10) {
        this.e = f10;
        super.e(f10);
    }

    @Override
    public void E() {
        block7: {
            aq aq2;
            block11: {
                int n2;
                block10: {
                    int[] arrn;
                    block8: {
                        block9: {
                            int[] arrn2 = net.minecraft.T.S.f();
                            super.E();
                            arrn = arrn2;
                            n2 = this.aG.C;
                            if (arrn == null) break block8;
                            if (n2 == 0) break block9;
                            for (int i2 = 0; i2 < 2; ++i2) {
                                this.aG.a(net.minecraft.ar.aH.PORTAL, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, (this.g.nextDouble() - 0.5) * 2.0, -this.g.nextDouble(), (this.g.nextDouble() - 0.5) * 2.0, new int[0]);
                                if (arrn != null) {
                                    if (arrn != null) continue;
                                }
                                break block7;
                            }
                            if (arrn != null) break block7;
                        }
                        n2 = this.d();
                    }
                    if (arrn == null) break block10;
                    if (n2 == 0) {
                        ++this.cx;
                    }
                    aq2 = this;
                    if (arrn == null) break block11;
                    n2 = aq2.cx;
                }
                if (n2 < 2400) break block7;
                aq2 = this;
            }
            aq2.a();
        }
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.cx = r2.m("Lifetime");
        this.cy = r2.f("PlayerSpawned");
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.hS;
    }

    @Override
    protected boolean h() {
        return false;
    }
}

