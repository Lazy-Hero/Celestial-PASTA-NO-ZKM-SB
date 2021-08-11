/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import javax.annotation.Nullable;
import net.minecraft.T.C;
import net.minecraft.T.S;
import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.M;
import net.minecraft.ak.Z;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ak.au;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.e.a;
import net.minecraft.i.j;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.u.E;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aW
extends ae {
    private /* synthetic */ int cy;
    private /* synthetic */ float cx;
    private static final /* synthetic */ r<Byte> cz;

    @Override
    protected d aI() {
        return net.minecraft.u.E.gk;
    }

    @Override
    public boolean p() {
        return this.f();
    }

    public void a(boolean bl2) {
        byte by2;
        block4: {
            byte by3;
            block2: {
                block3: {
                    by2 = this.ap.b(cz);
                    int[] arrn = net.minecraft.T.S.f();
                    by3 = bl2;
                    if (arrn == null) break block2;
                    if (by3 == false) break block3;
                    by2 = (byte)(by2 | 1);
                    if (arrn != null) break block4;
                }
                by3 = (byte)(by2 & 0xFFFFFFFE);
            }
            by2 = by3;
        }
        this.ap.b(cz, by2);
    }

    @Override
    protected void H() {
        this.b5.a(4, new C(this));
        this.b5.a(5, new M(this, 1.0));
        this.b5.a(7, new aA((D)this, 1.0, 0.0f));
        this.b5.a(8, new aa(this, j.class, 8.0f));
        this.b5.a(8, new F(this));
        this.ci.a(1, new Z((D)this, true, new Class[0]));
        this.ci.a(2, new au<j>((D)this, j.class, true));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aW(z z2) {
        super(z2);
        this.cx = 0.5f;
        this.a(net.minecraft.e.a.WATER, -1.0f);
        this.a(net.minecraft.e.a.LAVA, 8.0f);
        this.a(net.minecraft.e.a.DANGER_FIRE, 0.0f);
        this.a(net.minecraft.e.a.DAMAGE_FIRE, 0.0f);
        this.al = true;
        this.ch = 10;
    }

    @Override
    public int aS() {
        return 0xF000F0;
    }

    public boolean f() {
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = this.ap.b(cz) & 1;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    @Override
    public float S() {
        return 1.0f;
    }

    @Override
    protected boolean b() {
        return true;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cz, (byte)0);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.aG;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.g).a(6.0);
        this.a(net.minecraft.U.M.d).a(0.23f);
        this.a(net.minecraft.U.M.b).a(48.0);
    }

    @Override
    protected void h() {
        B b10;
        int[] arrn;
        block8: {
            B b11;
            int n2;
            block7: {
                arrn = net.minecraft.T.S.f();
                n2 = this.ar();
                if (arrn == null) break block7;
                if (n2 != 0) {
                    this.a(net.minecraft.ar.G.u, 1.0f);
                }
                --this.cy;
                b11 = this;
                if (arrn == null) break block8;
                n2 = ((aW)b11).cy;
            }
            if (n2 <= 0) {
                this.cy = 100;
                this.cx = 0.5f + (float)this.g.nextGaussian() * 3.0f;
            }
            b11 = b10 = this.J();
        }
        if (arrn != null) {
            if (b10 != null && b10.aF + (double)b10.l() > this.aF + (double)this.l() + (double)this.cx) {
                this.G += ((double)0.3f - this.G) * (double)0.3f;
                this.aA = true;
            }
            super.h();
        }
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.aH;
    }

    @Override
    public void E() {
        block8: {
            aW aW2;
            block11: {
                block12: {
                    int n2;
                    int[] arrn;
                    block13: {
                        int n3;
                        block14: {
                            int n4;
                            block9: {
                                block10: {
                                    arrn = net.minecraft.T.S.f();
                                    n4 = this.A;
                                    if (arrn == null) break block9;
                                    if (n4 != 0) break block10;
                                    double d10 = this.G - 0.0;
                                    n4 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                    if (arrn == null) break block9;
                                    if (n4 < 0) {
                                        this.G *= 0.6;
                                    }
                                }
                                aW2 = this;
                                if (arrn == null) break block11;
                                n4 = aW2.aG.C;
                            }
                            if (n4 == 0) break block12;
                            n3 = this.g.nextInt(24);
                            if (arrn == null) break block13;
                            if (n3 != 0) break block14;
                            n3 = this.aR() ? 1 : 0;
                            if (arrn == null) break block13;
                            if (n3 == 0) {
                                this.aG.a(this.a + 0.5, this.aF + 0.5, this.ax + 0.5, net.minecraft.u.E.hQ, this.ad(), 1.0f + this.g.nextFloat(), this.g.nextFloat() * 0.7f + 0.3f, false);
                            }
                        }
                        n3 = n2 = 0;
                    }
                    while (n2 < 2) {
                        this.aG.a(net.minecraft.ar.aH.SMOKE_LARGE, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, 0.0, 0.0, 0.0, new int[0]);
                        ++n2;
                        if (arrn != null) {
                            if (arrn != null) continue;
                        }
                        break block8;
                    }
                }
                aW2 = this;
            }
            super.E();
        }
    }

    @Override
    public void d(float f10, float f11) {
    }

    static {
        cz = net.minecraft.q.m.a(aW.class, h.m);
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.dF;
    }

    public static void b(b b10) {
        net.minecraft.U.C.a(b10, aW.class);
    }
}

