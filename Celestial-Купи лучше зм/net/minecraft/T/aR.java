/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import java.util.Collection;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.S;
import net.minecraft.T.ae;
import net.minecraft.T.ay;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.U.y;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ak.i;
import net.minecraft.ak.o;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.i.j;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aR
extends ae {
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cx;
    private static final /* synthetic */ net.minecraft.q.r<Integer> cC;
    private /* synthetic */ int cA;
    private /* synthetic */ int cy;
    private /* synthetic */ int cE;
    private /* synthetic */ int cz;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cD;
    private /* synthetic */ int cB;

    @Override
    protected void H() {
        this.b5.a(1, new W(this));
        this.b5.a(2, new o(this));
        this.b5.a(3, new net.minecraft.ak.m<net.minecraft.ag.S>(this, net.minecraft.ag.S.class, 6.0f, 1.0, 1.2));
        this.b5.a(4, new i(this, 1.0, false));
        this.b5.a(5, new aA(this, 0.8));
        this.b5.a(6, new aa(this, j.class, 8.0f));
        this.b5.a(6, new F(this));
        this.ci.a(1, new au<j>((D)this, j.class, true));
        this.ci.a(2, new Z((D)this, false, new Class[0]));
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aa;
    }

    @Override
    public void ae() {
        aR aR2;
        block11: {
            block12: {
                int n2;
                block15: {
                    int[] arrn;
                    block13: {
                        int n3;
                        block14: {
                            arrn = net.minecraft.T.S.f();
                            aR2 = this;
                            if (arrn == null) break block11;
                            if (!aR2.aL()) break block12;
                            this.cA = this.cy;
                            int n4 = this.f();
                            if (arrn != null) {
                                if (n4 != 0) {
                                    this.a(1);
                                }
                                n4 = this.d();
                            }
                            n2 = n3 = n4;
                            if (arrn == null) break block13;
                            if (n2 <= 0) break block14;
                            n2 = this.cy;
                            if (arrn == null) break block13;
                            if (n2 == 0) {
                                this.a(net.minecraft.u.E.c_, 1.0f, 0.5f);
                            }
                        }
                        this.cy += n3;
                        n2 = this.cy;
                    }
                    if (arrn == null) break block15;
                    if (n2 < 0) {
                        this.cy = 0;
                    }
                    aR2 = this;
                    if (arrn == null) break block11;
                    n2 = aR2.cy;
                }
                if (n2 >= this.cB) {
                    this.cy = this.cB;
                    this.l();
                }
            }
            aR2 = this;
        }
        super.ae();
    }

    @Override
    public void f(r r2) {
        int[] arrn = net.minecraft.T.S.f();
        super.f(r2);
        int[] arrn2 = arrn;
        if (arrn2 != null) {
            if (this.ap.b(cx).booleanValue()) {
                r2.a("powered", true);
            }
            r2.a("Fuse", (short)this.cB);
            r2.a("ExplosionRadius", (byte)this.cE);
            r2.a("ignited", this.f());
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(b b10) {
        C.a(b10, aR.class);
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.cS;
    }

    @Override
    public void a(G g10) {
        block3: {
            aR aR2;
            block9: {
                boolean bl2;
                block8: {
                    x x2;
                    int[] arrn;
                    block7: {
                        block6: {
                            boolean bl3;
                            block4: {
                                block5: {
                                    block2: {
                                        int[] arrn2 = net.minecraft.T.S.f();
                                        super.a(g10);
                                        arrn = arrn2;
                                        bl3 = this.aG.M().c("doMobLoot");
                                        if (arrn == null) break block2;
                                        if (!bl3) break block3;
                                        bl3 = g10.h() instanceof ay;
                                    }
                                    if (arrn == null) break block4;
                                    if (!bl3) break block5;
                                    int n2 = net.minecraft.w.k.a(h.a3);
                                    int n3 = net.minecraft.w.k.a(h.bj);
                                    int n4 = n2 + this.g.nextInt(n3 - n2 + 1);
                                    this.a(net.minecraft.w.k.a(n4), 1);
                                    if (arrn != null) break block3;
                                }
                                x2 = g10.h();
                                if (arrn == null) break block6;
                                bl3 = x2 instanceof aR;
                            }
                            if (!bl3) break block3;
                            x2 = g10.h();
                        }
                        if (arrn == null) break block7;
                        if (x2 == this) break block3;
                        x2 = g10.h();
                    }
                    bl2 = ((aR)x2).y();
                    if (arrn == null) break block8;
                    if (!bl2) break block3;
                    aR2 = (aR)g10.h();
                    if (arrn == null) break block9;
                    bl2 = aR2.z();
                }
                if (!bl2) break block3;
                ((aR)g10.h()).m();
                aR2 = this;
            }
            aR2.a(new d(h.cp, 1, 4), 0.0f);
        }
    }

    static {
        cC = net.minecraft.q.m.a(aR.class, net.minecraft.q.h.n);
        cx = net.minecraft.q.m.a(aR.class, net.minecraft.q.h.g);
        cD = net.minecraft.q.m.a(aR.class, net.minecraft.q.h.g);
    }

    public boolean f() {
        return this.ap.b(cD);
    }

    private void l() {
        block3: {
            boolean bl2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                bl2 = this.aG.C;
                if (arrn == null) break block2;
                if (bl2) break block3;
                bl2 = this.aG.M().c("mobGriefing");
            }
            boolean bl3 = bl2;
            float f10 = this.y() ? 2.0f : 1.0f;
            this.aW = true;
            this.aG.a(this, this.a, this.aF, this.ax, (float)this.cE * f10, bl3);
            this.a();
            this.c();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean z() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.cz;
        if (arrn != null) {
            if (bl2 >= true) return false;
            bl2 = this.aG.M().c("doMobLoot");
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public aR(z z2) {
        super(z2);
        this.cB = 30;
        this.cE = 3;
        this.c(0.6f, 1.7f);
    }

    public float a(float f10) {
        return ((float)this.cA + (float)(this.cy - this.cA) * f10) / (float)(this.cB - 2);
    }

    public int d() {
        return this.ap.b(cC);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean b(j j2, a3 a32) {
        boolean bl2;
        block5: {
            int[] arrn;
            d d10;
            block4: {
                d10 = j2.c(a32);
                arrn = net.minecraft.T.S.f();
                if (arrn == null) break block4;
                if (d10.w() != h.cn) break block5;
                this.aG.a(j2, this.a, this.aF, this.ax, net.minecraft.u.E.fX, this.ad(), 1.0f, this.g.nextFloat() * 0.4f + 0.8f);
                j2.b(a32);
            }
            bl2 = this.aG.C;
            if (arrn == null) return bl2;
            if (!bl2) {
                this.b();
                d10.a(1, (B)j2);
                return true;
            }
        }
        bl2 = super.b(j2, a32);
        return bl2;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.25);
    }

    @Override
    public void a(net.minecraft.an.b b10) {
        super.a(b10);
        this.ap.b(cx, true);
    }

    public boolean y() {
        return this.ap.b(cx);
    }

    public void m() {
        ++this.cz;
    }

    @Override
    public boolean j(x x2) {
        return true;
    }

    @Override
    public void a(r r2) {
        block4: {
            int[] arrn = net.minecraft.T.S.f();
            super.a(r2);
            int[] arrn2 = arrn;
            this.ap.b(cx, r2.f("powered"));
            boolean bl2 = r2.a("Fuse", 99);
            if (arrn2 != null) {
                if (bl2) {
                    this.cB = r2.q("Fuse");
                }
                bl2 = r2.a("ExplosionRadius", 99);
            }
            if (arrn2 != null) {
                if (bl2) {
                    this.cE = r2.r("ExplosionRadius");
                }
                bl2 = r2.f("ignited");
            }
            if (!bl2) break block4;
            this.b();
        }
    }

    public void a(int n2) {
        this.ap.b(cC, n2);
    }

    private void c() {
        block3: {
            Collection<net.minecraft.K.j> collection = this.az();
            int[] arrn = net.minecraft.T.S.f();
            if (!collection.isEmpty()) {
                y y2 = new y(this.aG, this.a, this.aF, this.ax);
                y2.d(2.5f);
                y2.c(-0.5f);
                y2.e(10);
                y2.a(y2.h() / 2);
                y2.b(-y2.d() / (float)y2.h());
                for (net.minecraft.K.j j2 : collection) {
                    y2.a(new net.minecraft.K.j(j2));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block3;
                }
                this.aG.f(y2);
            }
        }
    }

    @Override
    public int au() {
        return this.J() == null ? 3 : 3 + (int)(this.V() - 1.0f);
    }

    @Override
    public void d(float f10, float f11) {
        block3: {
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.d(f10, f11);
                this.cy = (int)((float)this.cy + f10 * 1.5f);
                int[] arrn2 = arrn;
                aR aR2 = this;
                if (arrn2 == null) break block2;
                if (aR2.cy <= this.cB - 5) break block3;
                aR2 = this;
            }
            aR2.cy = this.cB - 5;
        }
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.bM;
    }

    public void b() {
        this.ap.b(cD, true);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cC, -1);
        this.ap.c(cx, false);
        this.ap.c(cD, false);
    }
}

