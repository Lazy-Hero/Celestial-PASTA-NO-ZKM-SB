/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ag.A;
import net.minecraft.ag.Z;
import net.minecraft.ag.s;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.G;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.u.E;
import net.minecraft.u.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class au
extends Z {
    private /* synthetic */ float cw;
    private /* synthetic */ float cx;
    public /* synthetic */ float cu;
    public /* synthetic */ float cC;
    public /* synthetic */ float cs;
    public /* synthetic */ float cr;
    private /* synthetic */ float cv;
    public /* synthetic */ float cz;
    public /* synthetic */ float ct;
    public /* synthetic */ float cB;
    private /* synthetic */ float cy;
    public /* synthetic */ float cA;
    private /* synthetic */ float cD;
    private /* synthetic */ float cq;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean C() {
        double d10;
        block5: {
            String[] arrstring;
            block6: {
                block4: {
                    arrstring = net.minecraft.ag.A.b();
                    double d11 = this.aF - 45.0;
                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (arrstring == null) break block4;
                    if (d10 <= 0) break block5;
                    double d12 = this.aF - (double)this.aG.y();
                    d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                }
                if (arrstring == null) break block6;
                if (d10 >= 0) break block5;
                d10 = (double)super.C();
            }
            if (arrstring == null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    @Override
    public float l() {
        return this.aD * 0.5f;
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (by2 != 19) break block1;
                    this.cu = 0.0f;
                }
                if (arrstring != null) break block2;
            }
            super.a(by2);
        }
    }

    @Override
    protected d aI() {
        return net.minecraft.u.E.am;
    }

    public void b(float f10, float f11, float f12) {
        this.cD = f10;
        this.cy = f11;
        this.cw = f12;
    }

    public static void b(b b10) {
        C.a(b10, au.class);
    }

    @Override
    public void E() {
        block28: {
            block29: {
                au au2;
                block30: {
                    block34: {
                        au au3;
                        block33: {
                            boolean bl2;
                            block31: {
                                String[] arrstring;
                                block32: {
                                    double d10;
                                    block21: {
                                        block22: {
                                            float f10;
                                            block27: {
                                                block23: {
                                                    au au4;
                                                    block24: {
                                                        block25: {
                                                            float f11;
                                                            au au5;
                                                            block26: {
                                                                block16: {
                                                                    block17: {
                                                                        au au6;
                                                                        block20: {
                                                                            int n2;
                                                                            block18: {
                                                                                block19: {
                                                                                    super.E();
                                                                                    this.cr = this.cs;
                                                                                    arrstring = net.minecraft.ag.A.b();
                                                                                    this.cA = this.cC;
                                                                                    this.ct = this.cu;
                                                                                    this.cB = this.cz;
                                                                                    this.cu += this.cq;
                                                                                    double d11 = (double)this.cu - Math.PI * 2;
                                                                                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                                                                                    if (arrstring == null) break block16;
                                                                                    if (d10 <= 0) break block17;
                                                                                    n2 = this.aG.C;
                                                                                    if (arrstring == null) break block18;
                                                                                    if (n2 == 0) break block19;
                                                                                    this.cu = (float)Math.PI * 2;
                                                                                    if (arrstring != null) break block17;
                                                                                }
                                                                                this.cu = (float)((double)this.cu - Math.PI * 2);
                                                                                au6 = this;
                                                                                if (arrstring == null) break block20;
                                                                                n2 = au6.g.nextInt(10);
                                                                            }
                                                                            if (n2 == 0) {
                                                                                this.cq = 1.0f / (this.g.nextFloat() + 1.0f) * 0.2f;
                                                                            }
                                                                            au6 = this;
                                                                        }
                                                                        au6.aG.a((x)this, (byte)19);
                                                                    }
                                                                    d10 = (double)this.X;
                                                                }
                                                                if (arrstring == null) break block21;
                                                                if (d10 == false) break block22;
                                                                au4 = this;
                                                                if (arrstring == null) break block23;
                                                                if (!(au4.cu < (float)Math.PI)) break block24;
                                                                f10 = this.cu / (float)Math.PI;
                                                                au5 = this;
                                                                f11 = h.g(f10 * f10 * (float)Math.PI) * (float)Math.PI * 0.25f;
                                                                if (arrstring == null) break block25;
                                                                au5.cz = f11;
                                                                if (!((double)f10 > 0.75)) break block26;
                                                                this.cv = 1.0f;
                                                                this.cx = 1.0f;
                                                                if (arrstring != null) break block25;
                                                            }
                                                            au au7 = this;
                                                            au5 = au7;
                                                            f11 = au5.cx = au7.cx * 0.8f;
                                                        }
                                                        if (arrstring != null) break block27;
                                                    }
                                                    this.cz = 0.0f;
                                                    this.cv *= 0.9f;
                                                    au4 = this;
                                                }
                                                au4.cx *= 0.99f;
                                            }
                                            au au8 = this;
                                            if (arrstring != null) {
                                                if (!au8.aG.C) {
                                                    this.aq = this.cD * this.cv;
                                                    this.G = this.cy * this.cv;
                                                    this.d = this.cw * this.cv;
                                                }
                                                au8 = this;
                                            }
                                            f10 = h.e(au8.aq * this.aq + this.d * this.d);
                                            this.bf += (-((float)h.a(this.aq, this.d)) * 57.295776f - this.bf) * 0.1f;
                                            this.e = this.bf;
                                            this.cC = (float)((double)this.cC + Math.PI * (double)this.cx * 1.5);
                                            this.cs += (-((float)h.a((double)f10, this.G)) * 57.295776f - this.cs) * 0.1f;
                                            if (arrstring != null) break block28;
                                        }
                                        this.cz = h.e(h.g(this.cu)) * (float)Math.PI * 0.25f;
                                        au2 = this;
                                        if (arrstring == null) break block29;
                                        d10 = (double)au2.aG.C;
                                    }
                                    if (d10 != false) break block30;
                                    this.aq = 0.0;
                                    this.d = 0.0;
                                    bl2 = this.c(c.m);
                                    if (arrstring == null) break block31;
                                    if (!bl2) break block32;
                                    this.G += 0.05 * (double)(this.a(c.m).h() + 1) - this.G;
                                    if (arrstring != null) break block33;
                                }
                                au3 = this;
                                if (arrstring == null) break block34;
                                bl2 = au3.aI();
                            }
                            if (!bl2) {
                                this.G -= 0.08;
                            }
                        }
                        au3 = this;
                    }
                    au3.G *= (double)0.98f;
                }
                au2 = this;
            }
            au2.cs = (float)((double)this.cs + (double)(-90.0f - this.cs) * 0.02);
        }
    }

    public au(z z2) {
        super(z2);
        this.c(0.8f, 0.8f);
        this.g.setSeed(1 + this.W());
        this.cq = 1.0f / (this.g.nextFloat() + 1.0f) * 0.2f;
    }

    static boolean a(au au2) {
        return au2.X;
    }

    @Override
    protected void H() {
        this.b5.a(0, new s(this));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected float x() {
        return 0.4f;
    }

    @Override
    protected d q() {
        return net.minecraft.u.E.c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b() {
        String[] arrstring = net.minecraft.ag.A.b();
        float f10 = this.cD - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        if (arrstring == null) return (boolean)f11;
        if (f11 == false) {
            float f12 = this.cy - 0.0f;
            f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (arrstring == null) return (boolean)f11;
            if (f11 == false) {
                float f13 = this.cw - 0.0f;
                f11 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                if (arrstring == null) return (boolean)f11;
                if (f11 == false) {
                    f11 = 0.0f;
                    return (boolean)f11;
                }
            }
        }
        f11 = 1.0f;
        return (boolean)f11;
    }

    @Override
    protected d e(G g10) {
        return net.minecraft.u.E.f2;
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(10.0);
    }

    @Override
    public void a(float f10, float f11, float f12) {
        this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.ah;
    }
}

