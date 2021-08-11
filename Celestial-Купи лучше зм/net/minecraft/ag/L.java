/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.P;
import net.minecraft.ak.W;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.al;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.a;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L
extends C {
    public /* synthetic */ float cM;
    public /* synthetic */ float cH;
    public /* synthetic */ boolean cL;
    public /* synthetic */ float cJ;
    public /* synthetic */ float cO;
    public /* synthetic */ float cK;
    public /* synthetic */ int cI;
    private static final /* synthetic */ Set<k> cN;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.fl;
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.H, 0.15f, 1.0f);
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, L.class);
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.eP;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(4.0);
        this.a(net.minecraft.U.M.d).a(0.25);
    }

    @Override
    public L a(E e10) {
        return new L(this.aG);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean k() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.b();
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = this.aU();
        }
        if (arrstring == null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public void a(r r2) {
        block3: {
            int n2;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                super.a(r2);
                String[] arrstring2 = arrstring;
                L l2 = this;
                n2 = r2.f("IsChickenJockey");
                if (arrstring2 == null) break block2;
                l2.cL = n2;
                if (!r2.b("EggLayTime")) break block3;
                l2 = this;
                n2 = r2.m("EggLayTime");
            }
            l2.cI = n2;
        }
    }

    @Override
    public void E() {
        block17: {
            int n2;
            block20: {
                L l2;
                int n3;
                block19: {
                    String[] arrstring;
                    block18: {
                        block16: {
                            block14: {
                                block15: {
                                    block12: {
                                        block13: {
                                            String[] arrstring2 = net.minecraft.ag.A.b();
                                            super.E();
                                            arrstring = arrstring2;
                                            this.cK = this.cO;
                                            this.cJ = this.cM;
                                            double d10 = this.cM;
                                            int n4 = this.A;
                                            if (arrstring != null) {
                                                n4 = n4 != 0 ? -1 : 4;
                                            }
                                            this.cM = (float)(d10 + (double)n4 * 0.3);
                                            this.cM = h.c(this.cM, 0.0f, 1.0f);
                                            n3 = this.A;
                                            if (arrstring == null) break block12;
                                            if (n3 != 0) break block13;
                                            float f10 = this.cH - 1.0f;
                                            n3 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                            if (arrstring == null) break block12;
                                            if (n3 < 0) {
                                                this.cH = 1.0f;
                                            }
                                        }
                                        this.cH = (float)((double)this.cH * 0.9);
                                        n3 = this.A ? 1 : 0;
                                    }
                                    if (arrstring == null) break block14;
                                    if (n3 != 0) break block15;
                                    double d11 = this.G - 0.0;
                                    n3 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                    if (arrstring == null) break block14;
                                    if (n3 < 0) {
                                        this.G *= 0.6;
                                    }
                                }
                                this.cO += this.cH * 2.0f;
                                n3 = this.aG.C ? 1 : 0;
                            }
                            if (arrstring == null) break block16;
                            if (n3 != 0) break block17;
                            n3 = this.Q();
                        }
                        if (arrstring == null) break block18;
                        if (n3 != 0) break block17;
                        n3 = this.b() ? 1 : 0;
                    }
                    if (arrstring == null) break block19;
                    if (n3 != 0) break block17;
                    L l2 = this;
                    l2 = l2;
                    n2 = l3.cI - 1;
                    if (arrstring == null) break block20;
                    n3 = l2.cI = n2;
                }
                if (n3 > 0) break block17;
                this.a(net.minecraft.u.E.O, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                this.a(net.minecraft.u.h.bB, 1);
                l2 = this;
                n2 = this.g.nextInt(6000) + 6000;
            }
            l2.cI = n2;
        }
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("IsChickenJockey", this.cL);
        r2.b("EggLayTime", this.cI);
    }

    public L(z z2) {
        super(z2);
        this.cH = 1.0f;
        this.c(0.4f, 0.7f);
        this.cI = this.g.nextInt(6000) + 6000;
        this.a(net.minecraft.e.a.WATER, 0.0f);
    }

    @Override
    public float l() {
        return this.aD;
    }

    @Override
    public void d(float f10, float f11) {
    }

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(1, new P(this, 1.4));
        this.b5.a(2, new net.minecraft.ak.G(this, 1.0));
        this.b5.a(3, new al((D)this, 1.0, false, cN));
        this.b5.a(4, new net.minecraft.ak.A(this, 1.1));
        this.b5.a(5, new aA(this, 1.0));
        this.b5.a(6, new aa(this, j.class, 6.0f));
        this.b5.a(7, new F(this));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int a(j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        L l2 = this;
        if (arrstring != null) {
            if (l2.b()) {
                return 10;
            }
            l2 = this;
        }
        int n2 = super.a(j2);
        return n2;
    }

    @Override
    public boolean a(d d10) {
        return cN.contains(d10.w());
    }

    static {
        cN = Sets.newHashSet((Object[])new k[]{net.minecraft.u.h.a6, net.minecraft.u.h.bu, net.minecraft.u.h.bJ, net.minecraft.u.h.bR});
    }

    public void a(boolean bl2) {
        this.cL = bl2;
    }

    public boolean b() {
        return this.cL;
    }

    @Override
    public void q(x x2) {
        block3: {
            block2: {
                super.q(x2);
                float f10 = h.g(this.bf * ((float)Math.PI / 180));
                float f11 = h.c(this.bf * ((float)Math.PI / 180));
                String[] arrstring = net.minecraft.ag.A.b();
                float f12 = 0.1f;
                float f13 = 0.0f;
                x2.g(this.a + (double)(0.1f * f10), this.aF + (double)(this.aD * 0.5f) + x2.an() + 0.0, this.ax - (double)(0.1f * f11));
                x x3 = x2;
                if (arrstring == null) break block2;
                if (!(x3 instanceof B)) break block3;
                x3 = x2;
            }
            ((B)x3).bf = this.bf;
        }
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.fE;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.Z;
    }
}

