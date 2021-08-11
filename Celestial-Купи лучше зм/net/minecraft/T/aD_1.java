/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.Q;
import net.minecraft.T.S;
import net.minecraft.T.W;
import net.minecraft.T.X;
import net.minecraft.T.a9;
import net.minecraft.T.aX;
import net.minecraft.T.at;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.O;
import net.minecraft.U.g;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ak.Z;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.u.E;
import net.minecraft.w.d;
import net.minecraft.z.f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aD
extends at
implements O {
    private /* synthetic */ int cC;
    private final /* synthetic */ l[][] cB;

    @Override
    public void E() {
        block8: {
            int n2;
            int[] arrn;
            block9: {
                block13: {
                    aD aD2;
                    block14: {
                        int n3;
                        block15: {
                            int n4;
                            block12: {
                                block11: {
                                    block10: {
                                        int[] arrn2 = net.minecraft.T.S.f();
                                        super.E();
                                        arrn = arrn2;
                                        n4 = this.aG.C;
                                        if (arrn == null) break block10;
                                        if (n4 == 0) break block8;
                                        n4 = this.a3();
                                    }
                                    if (arrn == null) break block11;
                                    if (n4 == 0) break block8;
                                    n4 = --this.cC;
                                }
                                if (arrn == null) break block12;
                                if (n4 < 0) {
                                    this.cC = 0;
                                }
                                aD2 = this;
                                if (arrn == null) break block13;
                                n4 = aD2.bc;
                            }
                            if (n4 == 1) break block14;
                            aD2 = this;
                            if (arrn == null) break block13;
                            if (aD2.H % 1200 == 0) break block14;
                            int n5 = this.bc;
                            if (arrn == null) break block15;
                            if (n5 != this.bn - 1) break block8;
                            this.cC = 3;
                            n5 = n3 = 0;
                        }
                        while (n3 < 4) {
                            this.cB[0][n3] = this.cB[1][n3];
                            this.cB[1][n3] = new l(0.0, 0.0, 0.0);
                            ++n3;
                            if (arrn != null) {
                                if (arrn != null) continue;
                            }
                            break block8;
                        }
                        if (arrn != null) break block8;
                    }
                    aD2 = this;
                }
                aD2.cC = 3;
                float f10 = -6.0f;
                int n6 = 13;
                for (n2 = 0; n2 < 4; ++n2) {
                    this.cB[0][n2] = this.cB[1][n2];
                    this.cB[1][n2] = new l((double)(-6.0f + (float)this.g.nextInt(13)) * 0.5, Math.max(0, this.g.nextInt(6) - 4), (double)(-6.0f + (float)this.g.nextInt(13)) * 0.5);
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block9;
                }
                n2 = 0;
            }
            while (n2 < 16) {
                this.aG.a(net.minecraft.ar.aH.CLOUD, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, 0.0, 0.0, 0.0, new int[0]);
                ++n2;
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block8;
            }
            this.aG.a(this.a, this.aF, this.ax, net.minecraft.u.E.gG, this.ad(), 1.0f, 1.0f, false);
        }
    }

    public aD(z z2) {
        super(z2);
        this.c(0.6f, 1.95f);
        this.ch = 5;
        this.cB = new l[2][4];
        int[] arrn = net.minecraft.T.S.f();
        for (int i2 = 0; i2 < 4; ++i2) {
            this.cB[0][i2] = new l(0.0, 0.0, 0.0);
            this.cB[1][i2] = new l(0.0, 0.0, 0.0);
            if (arrn != null) continue;
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.d).a(0.5);
        this.a(net.minecraft.U.M.b).a(18.0);
        this.a(net.minecraft.U.M.f).a(32.0);
    }

    public l[] a(float f10) {
        l[] arrl;
        block4: {
            int[] arrn = net.minecraft.T.S.f();
            int n2 = this.cC;
            if (arrn != null) {
                if (n2 <= 0) {
                    return this.cB[1];
                }
                n2 = this.cC;
            }
            double d10 = ((float)n2 - f10) / 3.0f;
            d10 = Math.pow(d10, 0.25);
            l[] arrl2 = new l[4];
            for (int i2 = 0; i2 < 4; ++i2) {
                arrl = arrl2;
                if (arrn != null) {
                    arrl[i2] = this.cB[1][i2].a(1.0 - d10).c(this.cB[0][i2].a(d10));
                    if (arrn != null) continue;
                }
                break block4;
            }
            arrl = arrl2;
        }
        return arrl;
    }

    protected f b(float f10) {
        net.minecraft.z.h h2 = new net.minecraft.z.h(this.aG, this);
        h2.a((B)this, f10);
        return h2;
    }

    @Override
    public void a(B b10, float f10) {
        f f11 = this.b(f10);
        double d10 = b10.a - this.a;
        double d11 = b10.m().b + (double)(b10.aD / 3.0f) - f11.aF;
        double d12 = b10.ax - this.ax;
        double d13 = h.e(d10 * d10 + d12 * d12);
        f11.a(d10, d11 + d13 * (double)0.2f, d12, 1.6f, (float)(14 - this.aG.g().a() * 4));
        this.a(net.minecraft.u.E.L, 1.0f, 1.0f / (this.f().nextFloat() * 0.4f + 0.8f));
        this.aG.f(f11);
    }

    @Override
    public void a(boolean bl2) {
        this.b(1, bl2);
    }

    @Override
    public a9 a() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.f();
        if (arrn != null) {
            if (bl2) {
                return net.minecraft.T.a9.SPELLCASTING;
            }
            bl2 = this.y();
        }
        return bl2 ? net.minecraft.T.a9.BOW_AND_ARROW : net.minecraft.T.a9.CROSSED;
    }

    @Override
    protected void ab() {
        super.ab();
    }

    @Override
    public net.minecraft.U.j a(net.minecraft.ah.h h2, net.minecraft.U.j j2) {
        this.a(net.minecraft.B.X.MAINHAND, new d(net.minecraft.u.h.i));
        return super.a(h2, j2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(x x2) {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = super.e(x2);
        if (arrn != null) {
            if (bl2) {
                return true;
            }
            bl2 = x2 instanceof B;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        if (((B)x2).ag() != net.minecraft.U.g.ILLAGER) return false;
        net.minecraft.D.l l2 = this.aM();
        if (arrn != null) {
            if (l2 != null) return false;
            l2 = x2.aM();
        }
        if (l2 != null) return false;
        return true;
    }

    @Override
    public k aF() {
        return this.m().a(3.0, 0.0, 3.0);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.ar.d aI() {
        return net.minecraft.u.E.g1;
    }

    @Override
    protected void H() {
        block0: {
            int[] arrn = net.minecraft.T.S.f();
            super.H();
            int[] arrn2 = arrn;
            this.b5.a(0, new net.minecraft.ak.W(this));
            this.b5.a(1, new Q(this));
            this.b5.a(4, new X(this, null));
            this.b5.a(5, new W(this, null));
            this.b5.a(6, new net.minecraft.ak.l<aD>(this, 0.5, 20, 15.0f));
            this.b5.a(8, new net.minecraft.ak.a9(this, 0.6));
            this.b5.a(9, new aa(this, j.class, 3.0f, 1.0f));
            this.b5.a(10, new aa(this, C.class, 8.0f));
            this.ci.a(1, new Z((D)this, true, aD.class));
            this.ci.a(2, new au<j>((D)this, j.class, true).a(300));
            this.ci.a(3, new au<net.minecraft.ag.W>((D)this, net.minecraft.ag.W.class, false).a(300));
            this.ci.a(3, new au<aX>((D)this, aX.class, false).a(300));
            if (!net.minecraft.k.m.c()) break block0;
            net.minecraft.T.S.b(new int[3]);
        }
    }

    public boolean y() {
        return this.a(1);
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.y;
    }

    @Override
    protected net.minecraft.ar.d e(G g10) {
        return net.minecraft.u.E.bU;
    }

    @Override
    protected net.minecraft.ar.d g() {
        return net.minecraft.u.E.ck;
    }

    @Override
    protected v D() {
        return net.minecraft.aj.j.av;
    }
}

