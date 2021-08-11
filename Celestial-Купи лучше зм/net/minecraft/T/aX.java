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
import net.minecraft.T.aR;
import net.minecraft.T.b;
import net.minecraft.T.k;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.I;
import net.minecraft.ak.M;
import net.minecraft.ak.N;
import net.minecraft.ak.Y;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.E;
import net.minecraft.y.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aX
extends a7 {
    private /* synthetic */ int cz;
    @Nullable
    /* synthetic */ g cy;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> cw;
    private /* synthetic */ int cx;
    private /* synthetic */ int cA;

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
                    this.ap.b(cw, (byte)(by2 | 1));
                }
                if (arrn != null) break block2;
            }
            this.ap.b(cw, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    public int e() {
        return this.cz;
    }

    @Override
    public boolean j(x x2) {
        boolean bl2;
        this.cx = 10;
        int[] arrn = net.minecraft.T.S.f();
        this.aG.a((x)this, (byte)4);
        boolean bl3 = bl2 = x2.a(net.minecraft.ar.G.a(this), (float)(7 + this.g.nextInt(15)));
        if (arrn != null) {
            if (bl3) {
                x2.G += (double)0.4f;
                this.a(this, x2);
            }
            this.a(net.minecraft.u.E.bj, 1.0f, 1.0f);
            bl3 = bl2;
        }
        return bl3;
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.a("PlayerCreated", this.b());
    }

    public boolean b() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.ap.b(cw) & 1;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.cq;
    }

    @Override
    protected void d(x x2) {
        block4: {
            aX aX2;
            block7: {
                block5: {
                    int n2;
                    block6: {
                        int[] arrn = net.minecraft.T.S.f();
                        if (arrn == null) break block4;
                        if (!(x2 instanceof k)) break block5;
                        n2 = x2 instanceof aR;
                        if (arrn == null) break block6;
                        if (n2 != 0) break block5;
                        aX2 = this;
                        if (arrn == null) break block7;
                        n2 = aX2.f().nextInt(20);
                    }
                    if (n2 == 0) {
                        this.d((B)x2);
                    }
                }
                aX2 = this;
            }
            super.d(x2);
        }
    }

    public g d() {
        return this.cy;
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.p(r2.f("PlayerCreated"));
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.gX;
    }

    @Override
    protected int f(int n2) {
        return n2;
    }

    @Override
    protected void H() {
        this.b5.a(1, new net.minecraft.ak.i(this, 1.0, true));
        this.b5.a(2, new N(this, 0.9, 32.0f));
        this.b5.a(3, new I(this, 0.6, true));
        this.b5.a(4, new M(this, 1.0));
        this.b5.a(5, new net.minecraft.ak.E(this));
        this.b5.a(6, new aA(this, 0.6));
        this.b5.a(7, new aa(this, j.class, 6.0f));
        this.b5.a(8, new F(this));
        this.ci.a(1, new Y(this));
        this.ci.a(2, new Z((D)this, false, new Class[0]));
        this.ci.a(3, new au<C>(this, C.class, 10, false, true, new b(this)));
    }

    public void a(boolean bl2) {
        block4: {
            block2: {
                block3: {
                    int[] arrn = net.minecraft.T.S.f();
                    if (arrn == null) break block2;
                    if (!bl2) break block3;
                    this.cz = 400;
                    this.aG.a((x)this, (byte)11);
                    if (arrn != null) break block4;
                }
                this.cz = 0;
            }
            this.aG.a((x)this, (byte)34);
        }
    }

    @Override
    protected void a(n n2, K k2) {
        this.a(net.minecraft.u.E.z, 1.0f, 1.0f);
    }

    static {
        cw = net.minecraft.q.m.a(aX.class, net.minecraft.q.h.m);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(Class<? extends B> class_) {
        Class class_2;
        Class<? extends B> class_3;
        int[] arrn;
        block5: {
            block4: {
                boolean bl2;
                block3: {
                    arrn = net.minecraft.T.S.f();
                    bl2 = this.b();
                    if (arrn == null) break block3;
                    if (!bl2) break block4;
                    class_3 = j.class;
                    class_2 = class_;
                    if (arrn == null) break block5;
                    bl2 = class_3.isAssignableFrom(class_2);
                }
                if (bl2) {
                    return false;
                }
            }
            class_3 = class_;
            class_2 = aR.class;
        }
        if (class_3 == class_2) return false;
        boolean bl3 = super.a(class_);
        if (arrn == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    public int c() {
        return this.cx;
    }

    @Override
    public void a(G g10) {
        aX aX2;
        block4: {
            block5: {
                int[] arrn = net.minecraft.T.S.f();
                aX2 = this;
                if (arrn == null) break block4;
                if (aX2.b()) break block5;
                aX2 = this;
                if (arrn == null) break block4;
                if (aX2.bP == null) break block5;
                aX2 = this;
                if (arrn == null) break block4;
                if (aX2.cy != null) {
                    this.cy.a(this.bP.g(), -5);
                }
            }
            aX2 = this;
        }
        super.a(g10);
    }

    @Override
    protected void h() {
        aX aX2;
        block2: {
            block3: {
                g g10;
                block4: {
                    block5: {
                        int[] arrn = net.minecraft.T.S.f();
                        aX2 = this;
                        if (arrn == null) break block2;
                        if (--aX2.cA > 0) break block3;
                        this.cA = 70 + this.g.nextInt(50);
                        g10 = this.cy = this.aG.n().a(new n(this), 32);
                        if (arrn == null) break block4;
                        if (g10 != null) break block5;
                        this.j();
                        if (arrn != null) break block3;
                    }
                    g10 = this.cy;
                }
                n n2 = g10.b();
                this.a(n2, (int)((float)this.cy.j() * 0.6f));
            }
            aX2 = this;
        }
        super.h();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cw, (byte)0);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.x;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(100.0);
        this.a(net.minecraft.U.M.d).a(0.25);
        this.a(net.minecraft.U.M.h).a(1.0);
    }

    @Override
    public void a(byte n2) {
        block2: {
            block5: {
                int n3;
                int n4;
                int[] arrn;
                block3: {
                    block4: {
                        block0: {
                            block1: {
                                arrn = net.minecraft.T.S.f();
                                n4 = n2;
                                n3 = 4;
                                if (arrn == null) break block0;
                                if (n4 != n3) break block1;
                                this.cx = 10;
                                this.a(net.minecraft.u.E.bj, 1.0f, 1.0f);
                                if (arrn != null) break block2;
                            }
                            n4 = n2;
                            n3 = 11;
                        }
                        if (arrn == null) break block3;
                        if (n4 != n3) break block4;
                        this.cz = 400;
                        if (arrn != null) break block2;
                    }
                    n4 = n2;
                    n3 = 34;
                }
                if (n4 != n3) break block5;
                this.cz = 0;
                if (arrn != null) break block2;
            }
            super.a((byte)n2);
        }
    }

    public aX(z z2) {
        super(z2);
        this.c(1.4f, 2.7f);
    }

    public static void b(net.minecraft.av.b b10) {
        C.a(b10, aX.class);
    }

    @Override
    public void E() {
        block6: {
            int n2;
            int n3;
            int n4;
            i i2;
            int n5;
            block7: {
                int[] arrn;
                block5: {
                    int[] arrn2 = net.minecraft.T.S.f();
                    super.E();
                    arrn = arrn2;
                    n5 = this.cx--;
                    if (arrn != null) {
                        if (n5 > 0) {
                            // empty if block
                        }
                        n5 = this.cz;
                    }
                    if (arrn != null) {
                        double d10;
                        if (n5 > 0) {
                            --this.cz;
                        }
                        n5 = (d10 = this.aq * this.aq + this.d * this.d - 2.500000277905201E-7) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                    }
                    if (arrn == null) break block5;
                    if (n5 <= 0) break block6;
                    n5 = this.g.nextInt(5);
                }
                if (arrn == null) break block7;
                if (n5 != 0) break block6;
                n5 = h.f(this.a);
            }
            if ((i2 = this.aG.d(new n(n4 = n5, n3 = h.f(this.aF - (double)0.2f), n2 = h.f(this.ax)))).o() != c.A) {
                this.aG.a(net.minecraft.ar.aH.BLOCK_CRACK, this.a + ((double)this.g.nextFloat() - 0.5) * (double)this.ad, this.m().b + 0.1, this.ax + ((double)this.g.nextFloat() - 0.5) * (double)this.ad, 4.0 * ((double)this.g.nextFloat() - 0.5), 0.5, ((double)this.g.nextFloat() - 0.5) * 4.0, net.minecraft.W.K.l(i2));
            }
        }
    }
}

