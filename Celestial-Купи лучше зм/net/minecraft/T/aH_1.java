/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.S;
import net.minecraft.T.a;
import net.minecraft.T.o;
import net.minecraft.T.q;
import net.minecraft.T.s;
import net.minecraft.T.v;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ak.A;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.a9;
import net.minecraft.ak.aa;
import net.minecraft.ar.G;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aH
extends C {
    private /* synthetic */ float cH;
    private /* synthetic */ int cJ;
    private static final /* synthetic */ r<Boolean> cI;
    private /* synthetic */ float cK;

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cI, false);
    }

    protected void c() {
        block3: {
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                aH aH2 = this;
                if (arrn == null) break block2;
                if (aH2.cJ > 0) break block3;
                this.a(net.minecraft.u.E.fm, 1.0f, 1.0f);
                aH2 = this;
            }
            aH2.cJ = 40;
        }
    }

    @Override
    @Nullable
    protected net.minecraft.ar.v D() {
        return net.minecraft.aj.j.ai;
    }

    @Override
    protected void H() {
        super.H();
        this.b5.a(0, new W(this));
        this.b5.a(1, new o(this));
        this.b5.a(1, new q(this));
        this.b5.a(4, new A(this, 1.25));
        this.b5.a(5, new a9(this, 1.0));
        this.b5.a(6, new aa(this, j.class, 6.0f));
        this.b5.a(7, new F(this));
        this.ci.a(1, new s(this));
        this.ci.a(2, new v(this));
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(30.0);
        this.a(net.minecraft.U.M.b).a(20.0);
        this.a(net.minecraft.U.M.d).a(0.25);
        this.ao().b(net.minecraft.U.M.g);
        this.a(net.minecraft.U.M.g).a(6.0);
    }

    public boolean b() {
        return this.ap.b(cI);
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.eQ;
    }

    @Override
    public boolean j(x x2) {
        boolean bl2 = x2.a(net.minecraft.ar.G.a(this), (float)((int)this.a(net.minecraft.U.M.g).d()));
        int[] arrn = net.minecraft.T.S.f();
        boolean bl3 = bl2;
        if (arrn != null) {
            if (bl3) {
                this.a(this, x2);
            }
            bl3 = bl2;
        }
        return bl3;
    }

    public float a(float f10) {
        return (this.cK + (this.cH - this.cK) * f10) / 6.0f;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.by, 0.15f, 1.0f);
    }

    @Override
    protected float o() {
        return 0.98f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(d d10) {
        return false;
    }

    static {
        cI = net.minecraft.q.m.a(aH.class, net.minecraft.q.h.g);
    }

    public void a(boolean bl2) {
        this.ap.b(cI, bl2);
    }

    public aH(z z2) {
        super(z2);
        this.c(1.3f, 1.4f);
    }

    @Override
    public void ae() {
        block9: {
            aH aH2;
            block8: {
                int n2;
                block4: {
                    int[] arrn;
                    block5: {
                        block6: {
                            aH aH3;
                            block7: {
                                int[] arrn2 = net.minecraft.T.S.f();
                                super.ae();
                                arrn = arrn2;
                                n2 = this.aG.C;
                                if (arrn == null) break block4;
                                if (n2 == 0) break block5;
                                this.cK = this.cH;
                                aH3 = this;
                                if (arrn == null) break block6;
                                if (!aH3.b()) break block7;
                                this.cH = h.c(this.cH + 1.0f, 0.0f, 6.0f);
                                if (arrn != null) break block5;
                            }
                            aH3 = this;
                        }
                        aH3.cH = h.c(this.cH - 1.0f, 0.0f, 6.0f);
                    }
                    aH2 = this;
                    if (arrn == null) break block8;
                    n2 = aH2.cJ;
                }
                if (n2 <= 0) break block9;
                aH2 = this;
            }
            --aH2.cJ;
        }
    }

    @Override
    protected net.minecraft.ar.d q() {
        return this.Q() ? net.minecraft.u.E.h2 : net.minecraft.u.E.fT;
    }

    @Override
    public net.minecraft.U.j a(net.minecraft.ah.h h2, net.minecraft.U.j j2) {
        net.minecraft.U.j j3;
        block4: {
            block5: {
                block3: {
                    boolean bl2;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.T.S.f();
                        bl2 = j2 instanceof a;
                        if (arrn == null) break block2;
                        if (!bl2) break block3;
                        j3 = (a)j2;
                        if (arrn == null) break block4;
                        bl2 = ((a)j3).a;
                    }
                    if (!bl2) break block5;
                    this.l(-24000);
                    if (arrn != null) break block5;
                }
                a a10 = new a(null);
                a10.a = true;
                j2 = a10;
            }
            j3 = j2;
        }
        return j3;
    }

    @Override
    public E a(E e10) {
        return new aH(this.aG);
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.fq;
    }
}

