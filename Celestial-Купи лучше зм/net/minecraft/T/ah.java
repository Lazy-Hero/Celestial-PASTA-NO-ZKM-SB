/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Optional;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.T.D;
import net.minecraft.T.E;
import net.minecraft.T.S;
import net.minecraft.T.ae;
import net.minecraft.T.aq;
import net.minecraft.T.c;
import net.minecraft.T.t;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ak.F;
import net.minecraft.ak.W;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.I;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.a;
import net.minecraft.j.f;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ah
extends ae {
    private static final /* synthetic */ net.minecraft.q.r<Optional<i>> cx;
    private /* synthetic */ int cB;
    private /* synthetic */ int cC;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> cD;
    private static final /* synthetic */ f cy;
    private static final /* synthetic */ Set<K> cA;
    private static final /* synthetic */ UUID cz;

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block4: {
            ah ah2;
            block6: {
                block5: {
                    int[] arrn = net.minecraft.T.S.f();
                    if (arrn == null) break block4;
                    if (!cD.equals(r2)) break block5;
                    ah2 = this;
                    if (arrn == null) break block6;
                    if (!ah2.f()) break block5;
                    ah2 = this;
                    if (arrn == null) break block6;
                    if (ah2.aG.C) {
                        this.P();
                    }
                }
                ah2 = this;
            }
            super.a(r2);
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cx, Optional.absent());
        this.ap.c(cD, false);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ak;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.eZ;
    }

    @Override
    public float l() {
        return 2.55f;
    }

    private boolean b(double d10, double d11, double d12) {
        boolean bl2 = this.a(d10, d11, d12);
        int[] arrn = net.minecraft.T.S.f();
        boolean bl3 = bl2;
        if (arrn != null) {
            if (bl3) {
                this.aG.a(null, this.N, this.L, this.k, net.minecraft.u.E.ed, this.ad(), 1.0f, 1.0f);
                this.a(net.minecraft.u.E.ed, 1.0f, 1.0f);
            }
            bl3 = bl2;
        }
        return bl3;
    }

    public void b(@Nullable i i2) {
        this.ap.b(cx, Optional.fromNullable((Object)i2));
    }

    protected boolean y() {
        double d10 = this.a + (this.g.nextDouble() - 0.5) * 64.0;
        double d11 = this.aF + (double)(this.g.nextInt(64) - 32);
        double d12 = this.ax + (this.g.nextDouble() - 0.5) * 64.0;
        return this.b(d10, d11, d12);
    }

    public ah(z z2) {
        super(z2);
        this.c(0.6f, 2.9f);
        this.aI = 1.0f;
        this.a(net.minecraft.e.a.WATER, -1.0f);
    }

    public static void b(b b10) {
        C.a(b10, ah.class);
    }

    static {
        cz = UUID.fromString("020E0DFB-87AE-4653-9556-831010E291A0");
        cy = new f(cz, "Attacking speed boost", 0.15f, 0).a(false);
        cA = Sets.newIdentityHashSet();
        cx = net.minecraft.q.m.a(ah.class, h.a);
        cD = net.minecraft.q.m.a(ah.class, h.g);
        cA.add(net.minecraft.u.g.aU);
        cA.add(net.minecraft.u.g.bv);
        cA.add(net.minecraft.u.g.aO);
        cA.add(net.minecraft.u.g.di);
        cA.add(net.minecraft.u.g.cZ);
        cA.add(net.minecraft.u.g.cj);
        cA.add(net.minecraft.u.g.cg);
        cA.add(net.minecraft.u.g.z);
        cA.add(net.minecraft.u.g.cR);
        cA.add(net.minecraft.u.g.aA);
        cA.add(net.minecraft.u.g.d);
        cA.add(net.minecraft.u.g.G);
        cA.add(net.minecraft.u.g.ae);
        cA.add(net.minecraft.u.g.a8);
        cA.add(net.minecraft.u.g.j);
    }

    public boolean f() {
        return this.ap.b(cD);
    }

    @Override
    public void d(@Nullable B b10) {
        block4: {
            f f10;
            net.minecraft.j.b b11;
            block5: {
                int[] arrn;
                net.minecraft.j.b b12;
                block2: {
                    block3: {
                        super.d(b10);
                        b12 = this.a(net.minecraft.U.M.d);
                        arrn = net.minecraft.T.S.f();
                        if (arrn == null) break block2;
                        if (b10 != null) break block3;
                        this.cB = 0;
                        this.ap.b(cD, false);
                        b12.a(cy);
                        if (arrn != null) break block4;
                    }
                    this.cB = this.H;
                    this.ap.b(cD, true);
                }
                b11 = b12;
                f10 = cy;
                if (arrn == null) break block5;
                if (b11.c(f10)) break block4;
                b11 = b12;
                f10 = cy;
            }
            b11.b(f10);
        }
    }

    public void P() {
        block3: {
            ah ah2;
            block4: {
                int n2;
                block2: {
                    int[] arrn = net.minecraft.T.S.f();
                    n2 = this.H;
                    if (arrn == null) break block2;
                    if (n2 < this.cC + 400) break block3;
                    this.cC = this.H;
                    ah2 = this;
                    if (arrn == null) break block4;
                    n2 = ah2.aR() ? 1 : 0;
                }
                if (n2 != 0) break block3;
                ah2 = this;
            }
            ah2.aG.a(this.a, this.aF + (double)this.l(), this.ax, net.minecraft.u.E.d1, this.ad(), 2.5f, 1.0f, false);
        }
    }

    @Override
    public void a(r r2) {
        i i2;
        block10: {
            block8: {
                i i3;
                block9: {
                    int[] arrn;
                    block7: {
                        block6: {
                            int n2;
                            block4: {
                                block5: {
                                    int[] arrn2 = net.minecraft.T.S.f();
                                    super.a(r2);
                                    arrn = arrn2;
                                    n2 = r2.a("carried", 8);
                                    if (arrn == null) break block4;
                                    if (n2 == 0) break block5;
                                    i2 = net.minecraft.W.K.d(r2.j("carried")).c(r2.q("carriedData") & 0xFFFF);
                                    if (arrn != null) break block6;
                                }
                                n2 = r2.q("carried");
                            }
                            i2 = net.minecraft.W.K.b(n2).c(r2.q("carriedData") & 0xFFFF);
                        }
                        i3 = i2;
                        if (arrn == null) break block7;
                        if (i3 == null) break block8;
                        i3 = i2;
                    }
                    if (arrn == null) break block9;
                    if (i3.b() == null) break block8;
                    i3 = i2;
                }
                if (i3.o() != net.minecraft.ac.c.A) break block10;
            }
            i2 = null;
        }
        this.b(i2);
    }

    @Nullable
    public i Q() {
        return (i)this.ap.b(cx).orNull();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void E() {
        int[] arrn = net.minecraft.T.S.f();
        ah ah2 = this;
        if (arrn != null) {
            if (ah2.aG.C) {
                for (int i2 = 0; i2 < 2; ++i2) {
                    this.aG.a(net.minecraft.ar.aH.PORTAL, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD - 0.25, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, (this.g.nextDouble() - 0.5) * 2.0, -this.g.nextDouble(), (this.g.nextDouble() - 0.5) * 2.0, new int[0]);
                    if (arrn == null) return;
                    if (arrn != null) continue;
                }
            }
            this.aL = false;
            ah2 = this;
        }
        super.E();
    }

    protected boolean k(x x2) {
        l l2 = new l(this.a - x2.a, this.m().b + (double)(this.aD / 2.0f) - x2.aF + (double)x2.l(), this.ax - x2.ax);
        l2 = l2.d();
        double d10 = 16.0;
        double d11 = this.a + (this.g.nextDouble() - 0.5) * 8.0 - l2.e * 16.0;
        double d12 = this.aF + (double)(this.g.nextInt(16) - 8) - l2.d * 16.0;
        double d13 = this.ax + (this.g.nextDouble() - 0.5) * 8.0 - l2.b * 16.0;
        return this.b(d11, d12, d13);
    }

    @Override
    protected d q() {
        return this.f() ? net.minecraft.u.E.h1 : net.minecraft.u.E.cF;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        block5: {
            i i2;
            i i3;
            int[] arrn;
            block4: {
                int[] arrn2 = net.minecraft.T.S.f();
                super.b(bl2, n2);
                arrn = arrn2;
                i2 = i3 = this.Q();
                if (arrn == null) break block4;
                if (i2 == null) break block5;
                i2 = i3;
            }
            k k2 = net.minecraft.w.k.b(i2.b());
            int n3 = k2.l();
            if (arrn != null) {
                n3 = n3 != 0 ? i3.b().d(i3) : 0;
            }
            int n4 = n3;
            this.a(new net.minecraft.w.d(k2, 1, n4), 0.0f);
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(40.0);
        this.a(net.minecraft.U.M.d).a(0.3f);
        this.a(net.minecraft.U.M.g).a(7.0);
        this.a(net.minecraft.U.M.b).a(64.0);
    }

    @Override
    public void f(r r2) {
        block3: {
            i i2;
            block2: {
                int[] arrn = net.minecraft.T.S.f();
                super.f(r2);
                int[] arrn2 = arrn;
                i2 = this.Q();
                if (arrn2 == null) break block2;
                if (i2 == null) break block3;
                r2.a("carried", (short)net.minecraft.W.K.b(i2.b()));
            }
            r2.a("carriedData", (short)i2.b().d(i2));
        }
    }

    static boolean a(ah ah2, net.minecraft.i.j j2) {
        return ah2.d(j2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean d(net.minecraft.i.j j2) {
        double d10;
        block6: {
            int[] arrn;
            block5: {
                net.minecraft.w.d d11 = j2.cB.e.get(3);
                arrn = net.minecraft.T.S.f();
                if (d11.w() == net.minecraft.w.k.b(net.minecraft.u.g.G)) {
                    return false;
                }
                l l2 = j2.b(1.0f).d();
                l l3 = new l(this.a - j2.a, this.m().b + (double)this.l() - (j2.aF + (double)j2.l()), this.ax - j2.ax);
                double d12 = l3.a();
                l3 = l3.d();
                double d13 = l2.g(l3);
                double d14 = d13 - (1.0 - 0.025 / d12);
                d10 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                if (arrn == null) break block5;
                if (d10 <= 0) break block6;
                d10 = (double)j2.c((x)this);
            }
            if (arrn == null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    @Override
    protected void h() {
        block8: {
            ah ah2;
            block6: {
                block7: {
                    boolean bl2;
                    int[] arrn;
                    block5: {
                        arrn = net.minecraft.T.S.f();
                        bl2 = this.ar();
                        if (arrn == null) break block5;
                        if (bl2) {
                            this.a(net.minecraft.ar.G.u, 1.0f);
                        }
                        ah2 = this;
                        if (arrn == null) break block6;
                        bl2 = ah2.aG.R();
                    }
                    if (!bl2) break block7;
                    ah2 = this;
                    if (arrn == null) break block6;
                    if (ah2.H < this.cB + 600) break block7;
                    float f10 = this.S();
                    if (arrn == null) break block8;
                    if (!(f10 > 0.5f)) break block7;
                    ah2 = this;
                    if (arrn == null) break block6;
                    if (!ah2.aG.w(new n(this))) break block7;
                    ah2 = this;
                    if (arrn == null) break block6;
                    if (ah2.g.nextFloat() * 30.0f < (f10 - 0.4f) * 2.0f) {
                        this.d((B)null);
                        this.y();
                    }
                }
                ah2 = this;
            }
            super.h();
        }
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.h0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(G g10, float f10) {
        int n2;
        block14: {
            int n3;
            block15: {
                int[] arrn = net.minecraft.T.S.f();
                int n4 = this.a(g10);
                if (arrn != null) {
                    if (n4 != 0) {
                        return false;
                    }
                    n4 = g10 instanceof I;
                }
                if (arrn != null) {
                    if (n4 != 0) {
                        boolean bl2;
                        block13: {
                            for (int i2 = 0; i2 < 64; ++i2) {
                                bl2 = this.y();
                                if (arrn != null) {
                                    boolean bl3;
                                    if (arrn != null) {
                                        if (!bl2) continue;
                                        bl3 = true;
                                    }
                                    return bl3;
                                }
                                break block13;
                            }
                            bl2 = false;
                        }
                        return bl2;
                    }
                    n4 = super.a(g10, f10);
                }
                n3 = n4;
                n2 = g10.f();
                if (arrn == null) break block14;
                if (n2 == 0) break block15;
                n2 = this.g.nextInt(10);
                if (arrn == null) break block14;
                if (n2 != 0) {
                    this.y();
                }
            }
            n2 = n3;
        }
        return n2 != 0;
    }

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(2, new net.minecraft.ak.i(this, 1.0, false));
        this.b5.a(7, new aA((net.minecraft.U.D)this, 1.0, 0.0f));
        this.b5.a(8, new aa(this, net.minecraft.i.j.class, 8.0f));
        this.b5.a(8, new F(this));
        this.b5.a(10, new D(this));
        this.b5.a(11, new E(this));
        this.ci.a(1, new t(this));
        this.ci.a(2, new Z((net.minecraft.U.D)this, false, new Class[0]));
        this.ci.a(3, new au<aq>(this, aq.class, 10, true, false, new c(this)));
    }

    static Set z() {
        return cA;
    }
}

