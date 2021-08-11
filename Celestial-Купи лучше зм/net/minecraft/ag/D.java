/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Optional
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import java.util.Iterator;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.a;
import net.minecraft.P.r;
import net.minecraft.U.B;
import net.minecraft.U.E;
import net.minecraft.U.M;
import net.minecraft.U.t;
import net.minecraft.W.K;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.a.m;
import net.minecraft.a6;
import net.minecraft.ag.A;
import net.minecraft.ag.C;
import net.minecraft.ag.x;
import net.minecraft.ah.h;
import net.minecraft.ah.z;
import net.minecraft.ak.F;
import net.minecraft.ak.G;
import net.minecraft.ak.P;
import net.minecraft.ak.T;
import net.minecraft.ak.W;
import net.minecraft.ak.aA;
import net.minecraft.ak.aa;
import net.minecraft.ar.aH;
import net.minecraft.ar.d;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.i.j;
import net.minecraft.j.e;
import net.minecraft.k.n;
import net.minecraft.w.k;
import net.minecraft.x.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class D
extends C
implements t,
net.minecraft.B.g {
    protected /* synthetic */ net.minecraft.B.d cO;
    private /* synthetic */ float c1;
    protected /* synthetic */ int cK;
    private /* synthetic */ float cZ;
    private /* synthetic */ float cJ;
    private /* synthetic */ int cL;
    private /* synthetic */ int cY;
    private static final /* synthetic */ net.minecraft.q.r<Optional<UUID>> cP;
    private static final /* synthetic */ net.minecraft.q.r<Byte> cS;
    protected static final /* synthetic */ net.minecraft.j.c cT;
    private static final /* synthetic */ Predicate<net.minecraft.U.x> c0;
    private /* synthetic */ float cN;
    public /* synthetic */ int cU;
    protected /* synthetic */ int cI;
    private /* synthetic */ float cV;
    protected /* synthetic */ float c2;
    protected /* synthetic */ boolean cH;
    private /* synthetic */ int cW;
    private /* synthetic */ float cQ;
    public /* synthetic */ int cX;
    private /* synthetic */ boolean cM;
    protected /* synthetic */ boolean cR;

    public boolean D() {
        return this.o(16);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d(float f10, float f11) {
        D d10;
        block8: {
            float f12;
            float f13;
            String[] arrstring;
            block7: {
                arrstring = net.minecraft.ag.A.b();
                float f14 = f10 - 1.0f;
                float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                if (arrstring != null) {
                    if (f15 > 0) {
                        this.a(net.minecraft.u.E.bP, 0.4f, 1.0f);
                    }
                    f15 = net.minecraft.k.h.f((f10 * 0.5f - 3.0f) * f11);
                }
                f12 = f13 = f15;
                if (arrstring == null) break block7;
                if (f12 <= 0) return;
                this.a(net.minecraft.ar.G.e, f13);
                d10 = this;
                if (arrstring == null) break block8;
                f12 = (float)d10.aU();
            }
            if (f12 != false) {
                for (net.minecraft.U.x x2 : this.r()) {
                    x2.a(net.minecraft.ar.G.e, f13);
                    if (arrstring == null) return;
                    if (arrstring != null) continue;
                }
            }
            d10 = this;
        }
        i i2 = d10.aG.d(new n(this.a, this.aF - 0.2 - (double)this.ak, this.ax));
        K k2 = i2.b();
        if (i2.o() == net.minecraft.ac.c.A || this.aR()) return;
        d_ d_2 = k2.l();
        this.aG.a(null, this.a, this.aF, this.ax, d_2.b(), this.ad(), d_2.c() * 0.5f, d_2.e() * 0.75f);
    }

    public void m(int n2) {
        this.cK = n2;
    }

    @Override
    protected void H() {
        this.b5.a(0, new W(this));
        this.b5.a(1, new P(this, 1.2));
        this.b5.a(1, new T(this, 1.2));
        this.b5.a(2, new G(this, 1.0, D.class));
        this.b5.a(4, new net.minecraft.ak.A(this, 1.0));
        this.b5.a(6, new aA(this, 0.7));
        this.b5.a(7, new aa(this, j.class, 6.0f));
        this.b5.a(8, new F(this));
    }

    @Override
    public int X() {
        return 400;
    }

    @Nullable
    protected d ap() {
        this.aB();
        this.V();
        return null;
    }

    public int aA() {
        return 100;
    }

    public double T() {
        return this.a(cT).d();
    }

    public void v(boolean bl2) {
        String[] arrstring = net.minecraft.ag.A.b();
        if (arrstring != null) {
            if (bl2) {
                this.r(false);
            }
            this.c(32, bl2);
        }
    }

    @Override
    public void a(float f10, float f11, float f12) {
        block34: {
            D d10;
            block21: {
                block22: {
                    D d11;
                    String[] arrstring;
                    block33: {
                        float f13;
                        block32: {
                            block31: {
                                block29: {
                                    B b10;
                                    block30: {
                                        block25: {
                                            block26: {
                                                block28: {
                                                    D d12;
                                                    int n2;
                                                    block27: {
                                                        block23: {
                                                            float f14;
                                                            block24: {
                                                                arrstring = net.minecraft.ag.A.b();
                                                                d10 = this;
                                                                if (arrstring == null) break block21;
                                                                if (!d10.aU()) break block22;
                                                                d10 = this;
                                                                if (arrstring == null) break block21;
                                                                if (!d10.K()) break block22;
                                                                d10 = this;
                                                                if (arrstring == null) break block21;
                                                                if (!d10.ac()) break block22;
                                                                b10 = (B)this.af();
                                                                this.ak = this.e = b10.e;
                                                                this.at = b10.at * 0.5f;
                                                                this.e(this.e, this.at);
                                                                this.a1 = this.bf = this.e;
                                                                f10 = b10.bu * 0.5f;
                                                                f12 = b10.bU;
                                                                float f15 = f12 - 0.0f;
                                                                f13 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                                                                if (arrstring != null) {
                                                                    if (f13 <= 0) {
                                                                        f12 *= 0.25f;
                                                                        this.cI = 0;
                                                                    }
                                                                    f13 = (float)this.A;
                                                                }
                                                                if (arrstring == null) break block23;
                                                                if (f13 == false) break block24;
                                                                float f16 = this.c2 - 0.0f;
                                                                f13 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                                                if (arrstring == null) break block23;
                                                                if (f13 != false) break block24;
                                                                f13 = (float)this.ax();
                                                                if (arrstring == null) break block23;
                                                                if (f13 == false) break block24;
                                                                f13 = (float)this.cM;
                                                                if (arrstring == null) break block23;
                                                                if (f13 == false) {
                                                                    f10 = 0.0f;
                                                                    f12 = 0.0f;
                                                                }
                                                            }
                                                            f13 = (f14 = this.c2 - 0.0f) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                                                        }
                                                        if (arrstring == null) break block25;
                                                        if (f13 <= 0) break block26;
                                                        f13 = (float)this.au();
                                                        if (arrstring == null) break block25;
                                                        if (f13 != false) break block26;
                                                        f13 = (float)this.A;
                                                        if (arrstring == null) break block25;
                                                        if (f13 == false) break block26;
                                                        this.G = this.T() * (double)this.c2;
                                                        n2 = this.c(net.minecraft.u.c.n);
                                                        if (arrstring == null) break block27;
                                                        if (n2 != 0) {
                                                            this.G += (double)((float)(this.a(net.minecraft.u.c.n).h() + 1) * 0.1f);
                                                        }
                                                        this.t(true);
                                                        d12 = this;
                                                        if (arrstring == null) break block28;
                                                        d12.aA = true;
                                                        float f17 = f12 - 0.0f;
                                                        n2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                    }
                                                    if (n2 > 0) {
                                                        float f18 = net.minecraft.k.h.g(this.e * ((float)Math.PI / 180));
                                                        float f19 = net.minecraft.k.h.c(this.e * ((float)Math.PI / 180));
                                                        this.aq += (double)(-0.4f * f18 * this.c2);
                                                        this.d += (double)(0.4f * f19 * this.c2);
                                                        this.a(net.minecraft.u.E.cY, 0.4f, 1.0f);
                                                    }
                                                    d12 = this;
                                                }
                                                d12.c2 = 0.0f;
                                            }
                                            this.a_ = this.aa() * 0.1f;
                                            f13 = (float)this.a1();
                                        }
                                        if (arrstring == null) break block29;
                                        if (f13 == false) break block30;
                                        this.g((float)this.a(net.minecraft.U.M.d).d());
                                        super.a(f10, f11, f12);
                                        if (arrstring != null) break block31;
                                    }
                                    f13 = (float)(b10 instanceof j);
                                }
                                if (arrstring == null) break block32;
                                if (f13 != false) {
                                    this.aq = 0.0;
                                    this.G = 0.0;
                                    this.d = 0.0;
                                }
                            }
                            d11 = this;
                            if (arrstring == null) break block33;
                            f13 = (float)d11.A;
                        }
                        if (f13 != false) {
                            this.c2 = 0.0f;
                            this.t(false);
                        }
                        this.bR = this.a3;
                        d11 = this;
                    }
                    double d13 = d11.a - this.N;
                    double d14 = this.ax - this.k;
                    float f20 = net.minecraft.k.h.e(d13 * d13 + d14 * d14) * 4.0f;
                    if (arrstring != null) {
                        if (f20 > 1.0f) {
                            f20 = 1.0f;
                        }
                        this.a3 += (f20 - this.a3) * 0.4f;
                        this.bK += this.a3;
                    }
                    if (arrstring != null) break block34;
                }
                this.a_ = 0.02f;
                d10 = this;
            }
            super.a(f10, f11, f12);
        }
    }

    public static void b(b b10, Class<?> class_) {
        net.minecraft.U.C.a(b10, class_);
        b10.a(net.minecraft.av.f.ENTITY, (g)new c(class_, "SaddleItem"));
    }

    @Override
    public int U() {
        return 6;
    }

    @Override
    public boolean aY() {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.aU();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public float b(float f10) {
        return this.c1 + (this.cQ - this.c1) * f10;
    }

    protected int ao() {
        return 2;
    }

    public void u(boolean bl2) {
        this.c(2, bl2);
    }

    @Override
    public void a(byte n2) {
        block2: {
            block3: {
                int n3;
                int n4;
                String[] arrstring;
                block0: {
                    block1: {
                        arrstring = net.minecraft.ag.A.b();
                        n4 = n2;
                        n3 = 7;
                        if (arrstring == null) break block0;
                        if (n4 != n3) break block1;
                        this.x(true);
                        if (arrstring != null) break block2;
                    }
                    n4 = n2;
                    n3 = 6;
                }
                if (n4 != n3) break block3;
                this.x(false);
                if (arrstring != null) break block2;
            }
            super.a((byte)n2);
        }
    }

    private void aB() {
        block3: {
            D d10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                d10 = this;
                if (arrstring == null) break block2;
                if (d10.aG.C) break block3;
                this.cW = 1;
                d10 = this;
            }
            d10.c(64, true);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int var1_1, net.minecraft.w.d var2_2) {
        block6: {
            block8: {
                block7: {
                    var4_3 = var1_1 - 400;
                    var3_4 = net.minecraft.ag.A.b();
                    v0 = var4_3;
                    if (var3_4 == null) break block6;
                    if (v0 < 0) break block7;
                    v1 = var4_3;
                    v2 = 2;
                    if (var3_4 == null) break block8;
                    if (v1 < v2) {
                        v1 = var4_3;
                        v2 = this.cO.e();
                        if (var3_4 != null) {
                            if (v1 < v2) {
                                v3 = var4_3;
                                if (var3_4 != null) {
                                    if (v3 == 0 && var2_2.w() != net.minecraft.u.h.be) {
                                        return false;
                                    }
                                    v3 = var4_3;
                                }
                                if (var3_4 == null) return (boolean)v3;
                                if (v3 == 1) {
                                    v4 = this.E();
                                    if (var3_4 == null) return v4;
                                    if (v4 == false) return false;
                                    v4 = this.c(var2_2);
                                    if (var3_4 == null) return v4;
                                    if (v4 == false) return false;
                                }
                                this.cO.a(var4_3, var2_2);
                                this.ah();
                                return (boolean)1;
                            } else {
                                ** GOTO lbl32
                            }
                        } else {
                            ** GOTO lbl31
                        }
                    }
                    break block7;
lbl31:
                    // 2 sources

                    break block8;
                }
                v1 = var1_1 - 500;
                v2 = 2;
            }
            v0 = v1 + v2;
        }
        v5 = var5_5 = v0;
        if (var3_4 == null) return (boolean)v5;
        if (v5 < 2) return (boolean)0;
        v5 = var5_5;
        if (var3_4 == null) return (boolean)v5;
        if (v5 >= this.cO.e()) return (boolean)0;
        this.cO.a(var5_5, var2_2);
        return true;
    }

    @Override
    public void a(int n2) {
        this.cM = true;
        this.V();
    }

    @Override
    protected float x() {
        return 0.8f;
    }

    @Override
    public void b(int n2) {
        block3: {
            block7: {
                String[] arrstring;
                block6: {
                    block5: {
                        block4: {
                            int n3;
                            block2: {
                                arrstring = net.minecraft.ag.A.b();
                                n3 = this.ac();
                                if (arrstring == null) break block2;
                                if (n3 == 0) break block3;
                                n3 = n2;
                            }
                            if (arrstring == null) break block4;
                            if (n3 >= 0) break block5;
                            n3 = n2 = 0;
                        }
                        if (arrstring != null) break block6;
                    }
                    this.cM = true;
                    this.V();
                }
                if (n2 < 90) break block7;
                this.c2 = 1.0f;
                if (arrstring != null) break block3;
            }
            this.c2 = 0.4f + 0.4f * (float)n2 / 90.0f;
        }
    }

    @Override
    @Nullable
    public net.minecraft.U.j a(h h2, @Nullable net.minecraft.U.j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        net.minecraft.U.j j3 = super.a(h2, j2);
        if (arrstring != null) {
            j2 = j3;
            if (this.g.nextInt(5) == 0) {
                this.l(-24000);
            }
            j3 = j2;
        }
        return j3;
    }

    protected boolean a(j j2, net.minecraft.w.d d10) {
        float f10;
        String[] arrstring;
        boolean bl2;
        block36: {
            block37: {
                int n2;
                block38: {
                    block39: {
                        block34: {
                            block35: {
                                int n3;
                                block32: {
                                    block33: {
                                        float f11;
                                        block31: {
                                            float f12;
                                            block22: {
                                                k k2;
                                                k k3;
                                                block29: {
                                                    k k4;
                                                    block30: {
                                                        block27: {
                                                            block28: {
                                                                block25: {
                                                                    block26: {
                                                                        block23: {
                                                                            block24: {
                                                                                block20: {
                                                                                    block21: {
                                                                                        bl2 = false;
                                                                                        f11 = 0.0f;
                                                                                        n3 = 0;
                                                                                        arrstring = net.minecraft.ag.A.b();
                                                                                        n2 = 0;
                                                                                        k3 = k4 = d10.w();
                                                                                        k2 = net.minecraft.u.h.b1;
                                                                                        if (arrstring == null) break block20;
                                                                                        if (k3 != k2) break block21;
                                                                                        f11 = 2.0f;
                                                                                        n3 = 20;
                                                                                        n2 = 3;
                                                                                        if (arrstring != null) break block22;
                                                                                    }
                                                                                    k3 = k4;
                                                                                    k2 = net.minecraft.u.h.bm;
                                                                                }
                                                                                if (arrstring == null) break block23;
                                                                                if (k3 != k2) break block24;
                                                                                f11 = 1.0f;
                                                                                n3 = 30;
                                                                                n2 = 3;
                                                                                if (arrstring != null) break block22;
                                                                            }
                                                                            k3 = k4;
                                                                            k2 = net.minecraft.w.k.b(net.minecraft.u.g.aL);
                                                                        }
                                                                        if (arrstring == null) break block25;
                                                                        if (k3 != k2) break block26;
                                                                        f11 = 20.0f;
                                                                        n3 = 180;
                                                                        if (arrstring != null) break block22;
                                                                    }
                                                                    k3 = k4;
                                                                    k2 = net.minecraft.u.h.ci;
                                                                }
                                                                if (arrstring == null) break block27;
                                                                if (k3 != k2) break block28;
                                                                f11 = 3.0f;
                                                                n3 = 60;
                                                                n2 = 3;
                                                                if (arrstring != null) break block22;
                                                            }
                                                            k3 = k4;
                                                            k2 = net.minecraft.u.h.aN;
                                                        }
                                                        if (arrstring == null) break block29;
                                                        if (k3 != k2) break block30;
                                                        f11 = 4.0f;
                                                        n3 = 60;
                                                        n2 = 5;
                                                        f10 = (float)this.aD();
                                                        if (arrstring == null) break block31;
                                                        if (f10 == false) break block22;
                                                        f10 = this.z();
                                                        if (arrstring == null) break block31;
                                                        if (f10 != false) break block22;
                                                        f10 = (float)this.z();
                                                        if (arrstring == null) break block31;
                                                        if (f10 != false) break block22;
                                                        bl2 = true;
                                                        this.a(j2);
                                                        if (arrstring != null) break block22;
                                                    }
                                                    k3 = k4;
                                                    k2 = net.minecraft.u.h.bt;
                                                }
                                                if (k3 != k2) break block22;
                                                f11 = 10.0f;
                                                n3 = 240;
                                                n2 = 10;
                                                f10 = (float)this.aD();
                                                if (arrstring == null) break block31;
                                                if (f10 == false) break block22;
                                                f10 = this.z();
                                                if (arrstring == null) break block31;
                                                if (f10 != false) break block22;
                                                f10 = (float)this.z();
                                                if (arrstring == null) break block31;
                                                if (f10 == false) {
                                                    bl2 = true;
                                                    this.a(j2);
                                                }
                                            }
                                            f10 = (f12 = this.V() - this.H()) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                                        }
                                        if (arrstring == null) break block32;
                                        if (f10 >= 0) break block33;
                                        float f13 = f11 - 0.0f;
                                        f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                        if (arrstring == null) break block32;
                                        if (f10 > 0) {
                                            this.i(f11);
                                            bl2 = true;
                                        }
                                    }
                                    f10 = (float)this.Q();
                                }
                                if (arrstring == null) break block34;
                                if (f10 == false) break block35;
                                f10 = n3;
                                if (arrstring == null) break block34;
                                if (f10 > 0) {
                                    this.aG.a(net.minecraft.ar.aH.VILLAGER_HAPPY, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, 0.0, 0.0, 0.0, new int[0]);
                                    boolean bl3 = this.aG.C;
                                    if (arrstring != null) {
                                        if (!bl3) {
                                            this.k(n3);
                                        }
                                        bl3 = true;
                                    }
                                    bl2 = bl3;
                                }
                            }
                            f10 = n2;
                        }
                        if (arrstring == null) break block36;
                        if (f10 <= 0) break block37;
                        f10 = (float)bl2;
                        if (arrstring == null) break block38;
                        if (f10 != false) break block39;
                        f10 = (float)this.aD();
                        if (arrstring == null) break block36;
                        if (f10 != false) break block37;
                    }
                    f10 = this.R();
                }
                if (arrstring == null) break block36;
                if (f10 >= this.aA()) break block37;
                bl2 = true;
                f10 = (float)this.aG.C;
                if (arrstring == null) break block36;
                if (f10 == false) {
                    this.n(n2);
                }
            }
            f10 = (float)bl2;
        }
        if (arrstring != null) {
            if (f10 != false) {
                this.Q();
            }
            f10 = (float)bl2;
        }
        return (boolean)f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        D d10 = this;
        if (arrstring != null) {
            if (!super.a(j2)) return false;
            d10 = this;
        }
        if (d10.ag() == net.minecraft.U.g.UNDEAD) return false;
        return true;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cS, (byte)0);
        this.ap.c(cP, Optional.absent());
    }

    @Override
    public boolean a(net.minecraft.w.d d10) {
        return false;
    }

    @Override
    public void f(r r2) {
        block2: {
            String[] arrstring = net.minecraft.ag.A.b();
            super.f(r2);
            r2.a("EatingHaystack", this.D());
            r2.a("Bred", this.ad());
            String[] arrstring2 = arrstring;
            r2.b("Temper", this.R());
            r2.a("Tame", this.aD());
            D d10 = this;
            if (arrstring2 != null) {
                if (d10.aq() != null) {
                    r2.a("OwnerUUID", this.aq().toString());
                }
                d10 = this;
            }
            if (d10.cO.a(0).G()) break block2;
            r2.a("SaddleItem", this.cO.a(0).a(new r()));
        }
    }

    public boolean al() {
        return true;
    }

    public void b(@Nullable UUID uUID) {
        this.ap.b(cP, Optional.fromNullable((Object)uUID));
    }

    @Override
    @Nullable
    protected d q() {
        block3: {
            D d10;
            block4: {
                int n2;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    this.aB();
                    String[] arrstring2 = arrstring;
                    n2 = this.g.nextInt(10);
                    if (arrstring2 == null) break block2;
                    if (n2 != 0) break block3;
                    d10 = this;
                    if (arrstring2 == null) break block4;
                    n2 = d10.B() ? 1 : 0;
                }
                if (n2 != 0) break block3;
                d10 = this;
            }
            d10.V();
        }
        return null;
    }

    public boolean ad() {
        return this.o(8);
    }

    @Nullable
    protected D a(net.minecraft.U.x x2, double d10) {
        net.minecraft.U.x x3;
        block3: {
            double d11 = Double.MAX_VALUE;
            String[] arrstring = net.minecraft.ag.A.b();
            net.minecraft.U.x x4 = null;
            Iterator<net.minecraft.U.x> iterator = this.aG.a(x2, x2.m().d(d10, d10, d10), c0).iterator();
            while (iterator.hasNext()) {
                net.minecraft.U.x x5;
                x3 = x5 = iterator.next();
                if (arrstring != null) {
                    double d12;
                    double d13 = d12 = x3.a(x2.a, x2.aF, x2.ax);
                    if (arrstring != null && d13 < d11) {
                        x4 = x5;
                        d13 = d11 = d12;
                    }
                    if (arrstring != null) continue;
                }
                break block3;
            }
            x3 = x4;
        }
        return (D)x3;
    }

    protected void d(j j2) {
        j2.e = this.e;
        j2.at = this.at;
        String[] arrstring = net.minecraft.ag.A.b();
        this.r(false);
        this.v(false);
        String[] arrstring2 = arrstring;
        boolean bl2 = this.aG.C;
        if (arrstring2 != null && !bl2) {
            bl2 = j2.h(this);
        }
    }

    protected void a(E e10, D d10) {
        double d11 = this.a(net.minecraft.U.M.f).a() + e10.a(net.minecraft.U.M.f).a() + (double)this.at();
        d10.a(net.minecraft.U.M.f).a(d11 / 3.0);
        double d12 = this.a(cT).a() + e10.a(cT).a() + this.a();
        d10.a(cT).a(d12 / 3.0);
        double d13 = this.a(net.minecraft.U.M.d).a() + e10.a(net.minecraft.U.M.d).a() + this.as();
        d10.a(net.minecraft.U.M.d).a(d13 / 3.0);
    }

    public boolean ax() {
        return this.o(32);
    }

    @Override
    protected void a(n n2, K k2) {
        block3: {
            d_ d_2;
            block11: {
                String[] arrstring;
                block5: {
                    D d10;
                    block10: {
                        int n3;
                        int n4;
                        block7: {
                            block9: {
                                block8: {
                                    block6: {
                                        block4: {
                                            K k3;
                                            block2: {
                                                arrstring = net.minecraft.ag.A.b();
                                                k3 = k2;
                                                if (arrstring == null) break block2;
                                                if (k3.d().o().b()) break block3;
                                                k3 = k2;
                                            }
                                            d_2 = k3.l();
                                            D d11 = this;
                                            if (arrstring != null) {
                                                if (d11.aG.d(n2.a()).b() == net.minecraft.u.g.o) {
                                                    d_2 = net.minecraft.u.g.o.l();
                                                }
                                                d11 = this;
                                            }
                                            n4 = d11.aU();
                                            if (arrstring == null) break block4;
                                            if (n4 == 0) break block5;
                                            n4 = this.cR;
                                        }
                                        if (arrstring == null) break block6;
                                        if (n4 == 0) break block5;
                                        n4 = ++this.cI;
                                    }
                                    n3 = 5;
                                    if (arrstring == null) break block7;
                                    if (n4 <= n3) break block8;
                                    n4 = this.cI % 3;
                                    if (arrstring == null) break block9;
                                    if (n4 != 0) break block8;
                                    this.a(d_2);
                                    if (arrstring != null) break block3;
                                }
                                d10 = this;
                                if (arrstring == null) break block10;
                                n4 = d10.cI;
                            }
                            n3 = 5;
                        }
                        if (n4 > n3) break block3;
                        d10 = this;
                    }
                    d10.a(net.minecraft.u.E.bq, d_2.c() * 0.15f, d_2.e());
                    if (arrstring != null) break block3;
                }
                if (d_2 != d_.e) break block11;
                this.a(net.minecraft.u.E.bq, d_2.c() * 0.15f, d_2.e());
                if (arrstring != null) break block3;
            }
            this.a(net.minecraft.u.E.bx, d_2.c() * 0.15f, d_2.e());
        }
    }

    public boolean c(net.minecraft.w.d d10) {
        return false;
    }

    public boolean au() {
        return this.cH;
    }

    @Override
    public boolean K() {
        return this.af() instanceof B;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public net.minecraft.U.x af() {
        String[] arrstring = net.minecraft.ag.A.b();
        Object object = this.j();
        if (arrstring != null) {
            if (object.isEmpty()) {
                return null;
            }
            object = this.j().get(0);
        }
        net.minecraft.U.x x2 = (net.minecraft.U.x)object;
        return x2;
    }

    @Override
    public boolean b() {
        return this.ac();
    }

    @Override
    public void E() {
        block12: {
            D d10;
            block15: {
                block16: {
                    int n2;
                    String[] arrstring;
                    block17: {
                        block19: {
                            block18: {
                                int n3;
                                block13: {
                                    block14: {
                                        block11: {
                                            arrstring = net.minecraft.ag.A.b();
                                            n3 = this.g.nextInt(200);
                                            if (arrstring != null) {
                                                if (n3 == 0) {
                                                    this.S();
                                                }
                                                super.E();
                                                n3 = this.aG.C ? 1 : 0;
                                            }
                                            if (arrstring == null) break block11;
                                            if (n3 != 0) break block12;
                                            n3 = this.g.nextInt(900);
                                        }
                                        if (arrstring == null) break block13;
                                        if (n3 != 0) break block14;
                                        n3 = this.a2;
                                        if (arrstring == null) break block13;
                                        if (n3 == 0) {
                                            this.i(1.0f);
                                        }
                                    }
                                    d10 = this;
                                    if (arrstring == null) break block15;
                                    n3 = d10.aw() ? 1 : 0;
                                }
                                if (n3 == 0) break block16;
                                n2 = this.D();
                                if (arrstring == null) break block17;
                                if (n2 != 0) break block18;
                                n2 = this.aU();
                                if (arrstring == null) break block17;
                                if (n2 != 0) break block18;
                                n2 = this.g.nextInt(300);
                                if (arrstring == null) break block17;
                                if (n2 != 0) break block18;
                                d10 = this;
                                if (arrstring == null) break block19;
                                if (d10.aG.d(new n(net.minecraft.k.h.f(this.a), net.minecraft.k.h.f(this.aF) - 1, net.minecraft.k.h.f(this.ax))).b() == net.minecraft.u.g.aU) {
                                    this.r(true);
                                }
                            }
                            d10 = this;
                        }
                        if (arrstring == null) break block15;
                        n2 = d10.D();
                    }
                    if (n2 == 0) break block16;
                    d10 = this;
                    if (arrstring == null) break block15;
                    if (++d10.cY > 50) {
                        this.cY = 0;
                        this.r(false);
                    }
                }
                d10 = this;
            }
            d10.az();
        }
    }

    private void V() {
        block3: {
            D d10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                d10 = this;
                if (arrstring == null) break block2;
                if (!d10.a1()) break block3;
                this.cL = 1;
                d10 = this;
            }
            d10.v(true);
        }
    }

    @Override
    public void a(r r2) {
        block17: {
            block16: {
                String[] arrstring;
                block15: {
                    Object object;
                    Object object2;
                    block14: {
                        String string;
                        block13: {
                            String string2;
                            r r3;
                            block11: {
                                block12: {
                                    super.a(r2);
                                    String[] arrstring2 = net.minecraft.ag.A.b();
                                    this.r(r2.f("EatingHaystack"));
                                    arrstring = arrstring2;
                                    this.w(r2.f("Bred"));
                                    this.m(r2.m("Temper"));
                                    this.u(r2.f("Tame"));
                                    r3 = r2;
                                    string2 = "OwnerUUID";
                                    if (arrstring == null) break block11;
                                    if (!r3.a(string2, 8)) break block12;
                                    string = r2.j("OwnerUUID");
                                    if (arrstring != null) break block13;
                                }
                                r3 = r2;
                                string2 = "Owner";
                            }
                            object2 = r3.j(string2);
                            string = net.minecraft.a.m.a(this.e(), (String)object2);
                        }
                        if (!string.isEmpty()) {
                            this.b(UUID.fromString(string));
                        }
                        object = object2 = this.ao().a("Speed");
                        if (arrstring == null) break block14;
                        if (object == null) break block15;
                        object = this.a(net.minecraft.U.M.d);
                    }
                    object.a(object2.a() * 0.25);
                }
                if (!r2.a("SaddleItem", 10)) break block16;
                net.minecraft.w.d d10 = new net.minecraft.w.d(r2.h("SaddleItem"));
                if (arrstring == null) break block17;
                if (d10.w() == net.minecraft.u.h.be) {
                    this.cO.a(0, d10);
                }
            }
            this.ah();
        }
    }

    public float e(float f10) {
        return this.cV + (this.cJ - this.cV) * f10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean B() {
        boolean bl2;
        String[] arrstring;
        block4: {
            block5: {
                arrstring = net.minecraft.ag.A.b();
                bl2 = super.B();
                if (arrstring == null) break block4;
                if (!bl2) break block5;
                bl2 = this.aU();
                if (arrstring == null) break block4;
                if (bl2) {
                    bl2 = this.ac();
                    if (arrstring == null) return bl2;
                    if (bl2) return true;
                }
            }
            bl2 = this.D();
        }
        if (arrstring == null) return bl2;
        if (bl2) return true;
        bl2 = this.ax();
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public void w(boolean bl2) {
        this.c(8, bl2);
    }

    public boolean ac() {
        return this.o(4);
    }

    protected double a() {
        return (double)0.4f + this.g.nextDouble() * 0.2 + this.g.nextDouble() * 0.2 + this.g.nextDouble() * 0.2;
    }

    private void Q() {
        block3: {
            D d10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                this.aB();
                String[] arrstring2 = arrstring;
                d10 = this;
                if (arrstring2 == null) break block2;
                if (d10.aR()) break block3;
                d10 = this;
            }
            d10.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.c9, this.ad(), 1.0f, 1.0f + (this.g.nextFloat() - this.g.nextFloat()) * 0.2f);
        }
    }

    @Override
    public void c() {
    }

    public boolean aw() {
        return true;
    }

    public void P() {
        block0: {
            this.V();
            d d10 = this.ap();
            if (d10 == null) break block0;
            this.a(d10, this.x(), this.p());
        }
    }

    @Override
    public void ae() {
        block46: {
            block47: {
                D d10;
                int n2;
                block43: {
                    String[] arrstring;
                    block44: {
                        block45: {
                            block41: {
                                block42: {
                                    block39: {
                                        block40: {
                                            block37: {
                                                block38: {
                                                    block35: {
                                                        block36: {
                                                            block33: {
                                                                block34: {
                                                                    block31: {
                                                                        block32: {
                                                                            block29: {
                                                                                block30: {
                                                                                    block27: {
                                                                                        block28: {
                                                                                            String[] arrstring2 = net.minecraft.ag.A.b();
                                                                                            super.ae();
                                                                                            arrstring = arrstring2;
                                                                                            n2 = this.cW;
                                                                                            if (arrstring == null) break block27;
                                                                                            if (n2 <= 0) break block28;
                                                                                            n2 = this.cW = this.cW + 1;
                                                                                            if (arrstring == null) break block27;
                                                                                            if (n2 > 30) {
                                                                                                this.cW = 0;
                                                                                                this.c(64, false);
                                                                                            }
                                                                                        }
                                                                                        n2 = this.a1() ? 1 : 0;
                                                                                    }
                                                                                    if (arrstring == null) break block29;
                                                                                    if (n2 == 0) break block30;
                                                                                    n2 = this.cL;
                                                                                    if (arrstring == null) break block29;
                                                                                    if (n2 <= 0) break block30;
                                                                                    n2 = this.cL = this.cL + 1;
                                                                                    if (arrstring == null) break block29;
                                                                                    if (n2 > 20) {
                                                                                        this.cL = 0;
                                                                                        this.v(false);
                                                                                    }
                                                                                }
                                                                                n2 = this.cU;
                                                                            }
                                                                            if (arrstring == null) break block31;
                                                                            if (n2 <= 0) break block32;
                                                                            n2 = this.cU = this.cU + 1;
                                                                            if (arrstring == null) break block31;
                                                                            if (n2 > 8) {
                                                                                this.cU = 0;
                                                                            }
                                                                        }
                                                                        n2 = this.cX;
                                                                    }
                                                                    if (arrstring == null) break block33;
                                                                    if (n2 <= 0) break block34;
                                                                    n2 = ++this.cX;
                                                                    if (arrstring == null) break block33;
                                                                    if (n2 > 300) {
                                                                        this.cX = 0;
                                                                    }
                                                                }
                                                                this.c1 = this.cQ;
                                                                n2 = this.D() ? 1 : 0;
                                                            }
                                                            if (arrstring == null) break block35;
                                                            if (n2 == 0) break block36;
                                                            this.cQ += (1.0f - this.cQ) * 0.4f + 0.05f;
                                                            float f10 = this.cQ - 1.0f;
                                                            n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                            if (arrstring == null) break block37;
                                                            if (n2 <= 0) break block38;
                                                            this.cQ = 1.0f;
                                                            if (arrstring != null) break block38;
                                                        }
                                                        this.cQ += (0.0f - this.cQ) * 0.4f - 0.05f;
                                                        float f11 = this.cQ - 0.0f;
                                                        n2 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                                    }
                                                    if (arrstring == null) break block37;
                                                    if (n2 < 0) {
                                                        this.cQ = 0.0f;
                                                    }
                                                }
                                                this.cZ = this.cN;
                                                n2 = this.ax() ? 1 : 0;
                                            }
                                            if (arrstring == null) break block39;
                                            if (n2 == 0) break block40;
                                            this.c1 = this.cQ = 0.0f;
                                            this.cN += (1.0f - this.cN) * 0.4f + 0.05f;
                                            float f12 = this.cN - 1.0f;
                                            n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                            if (arrstring == null) break block41;
                                            if (n2 <= 0) break block42;
                                            this.cN = 1.0f;
                                            if (arrstring != null) break block42;
                                        }
                                        this.cM = false;
                                        this.cN += (0.8f * this.cN * this.cN * this.cN - this.cN) * 0.6f - 0.05f;
                                        float f13 = this.cN - 0.0f;
                                        n2 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                    }
                                    if (arrstring == null) break block41;
                                    if (n2 < 0) {
                                        this.cN = 0.0f;
                                    }
                                }
                                this.cV = this.cJ;
                                n2 = this.o(64) ? 1 : 0;
                            }
                            if (arrstring == null) break block43;
                            if (n2 == 0) break block44;
                            this.cJ += (1.0f - this.cJ) * 0.7f + 0.05f;
                            D d11 = this;
                            if (arrstring == null) break block45;
                            if (!(d11.cJ > 1.0f)) break block46;
                            d11 = this;
                        }
                        d11.cJ = 1.0f;
                        if (arrstring != null) break block46;
                    }
                    this.cJ += (0.0f - this.cJ) * 0.7f - 0.05f;
                    d10 = this;
                    if (arrstring == null) break block47;
                    float f14 = d10.cJ - 0.0f;
                    n2 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                }
                if (n2 >= 0) break block46;
                d10 = this;
            }
            d10.cJ = 0.0f;
        }
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public float l() {
        return this.aD;
    }

    @Override
    public boolean a(C c10) {
        return false;
    }

    public boolean E() {
        return false;
    }

    public D(z z2) {
        super(z2);
        this.cR = true;
        this.c(1.3964844f, 1.6f);
        this.aI = 1.0f;
        this.ar();
    }

    public float a(float f10) {
        return this.cZ + (this.cN - this.cZ) * f10;
    }

    protected void x(boolean bl2) {
        String[] arrstring = net.minecraft.ag.A.b();
        aH aH2 = bl2 ? net.minecraft.ar.aH.HEART : net.minecraft.ar.aH.SMOKE_NORMAL;
        for (int i2 = 0; i2 < 7; ++i2) {
            double d10 = this.g.nextGaussian() * 0.02;
            double d11 = this.g.nextGaussian() * 0.02;
            double d12 = this.g.nextGaussian() * 0.02;
            this.aG.a(aH2, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, d10, d11, d12, new int[0]);
            if (arrstring != null) continue;
        }
    }

    @Override
    protected void l(float f10) {
        block3: {
            D d10;
            block4: {
                float f11;
                block2: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    float f12 = f10 - 6.0f;
                    f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (arrstring == null) break block2;
                    if (f11 <= 0) break block3;
                    d10 = this;
                    if (arrstring == null) break block4;
                    f11 = (float)d10.D();
                }
                if (f11 == false) break block3;
                d10 = this;
            }
            d10.r(false);
        }
    }

    public void t(boolean bl2) {
        this.cH = bl2;
    }

    public boolean aD() {
        return this.o(2);
    }

    @Override
    @Nullable
    protected d e(net.minecraft.ar.G g10) {
        block3: {
            D d10;
            block2: {
                String[] arrstring = net.minecraft.ag.A.b();
                this.aB();
                String[] arrstring2 = arrstring;
                d10 = this;
                if (arrstring2 == null) break block2;
                if (d10.g.nextInt(3) != 0) break block3;
                d10 = this;
            }
            d10.V();
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean Y() {
        String[] arrstring = net.minecraft.ag.A.b();
        int n2 = this.aU();
        if (arrstring != null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.N();
        }
        if (arrstring != null) {
            if (n2 != 0) return 0 != 0;
            n2 = this.aD();
        }
        if (arrstring != null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.Q();
        }
        if (arrstring != null) {
            if (n2 != 0) return 0 != 0;
            float f10 = this.V() - this.H();
            n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        }
        if (arrstring != null) {
            if (n2 < 0) return 0 != 0;
            n2 = this.z() ? 1 : 0;
        }
        if (arrstring == null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void q(net.minecraft.U.x x2) {
        block6: {
            block7: {
                float f10;
                float f11;
                String[] arrstring;
                block5: {
                    int n2;
                    block4: {
                        String[] arrstring2 = net.minecraft.ag.A.b();
                        super.q(x2);
                        arrstring = arrstring2;
                        n2 = x2 instanceof net.minecraft.U.C;
                        if (arrstring == null) break block4;
                        if (n2 != 0) {
                            net.minecraft.U.C c10 = (net.minecraft.U.C)x2;
                            this.bf = c10.bf;
                        }
                        f11 = this.cZ;
                        f10 = 0.0f;
                        if (arrstring == null) break block5;
                        float f12 = f11 - f10;
                        n2 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    }
                    if (n2 <= 0) break block6;
                    f11 = this.bf;
                    f10 = (float)Math.PI / 180;
                }
                float f13 = net.minecraft.k.h.g(f11 * f10);
                float f14 = net.minecraft.k.h.c(this.bf * ((float)Math.PI / 180));
                float f15 = 0.7f * this.cZ;
                float f16 = 0.15f * this.cZ;
                x2.g(this.a + (double)(f15 * f13), this.aF + this.o() + x2.an() + (double)f16, this.ax - (double)(f15 * f14));
                net.minecraft.U.x x3 = x2;
                if (arrstring == null) break block7;
                if (!(x3 instanceof B)) break block6;
                x3 = x2;
            }
            ((B)x3).bf = this.bf;
        }
    }

    public int R() {
        return this.cK;
    }

    private void S() {
        this.cU = 1;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    @Nullable
    public E a(E e10) {
        return null;
    }

    @Override
    public void a(net.minecraft.ar.G g10) {
        block8: {
            D d10;
            String[] arrstring;
            block7: {
                String[] arrstring2 = net.minecraft.ag.A.b();
                super.a(g10);
                arrstring = arrstring2;
                d10 = this;
                if (arrstring == null) break block7;
                if (d10.aG.C) break block8;
                d10 = this;
            }
            if (d10.cO != null) {
                int n2 = 0;
                while (n2 < this.cO.e()) {
                    net.minecraft.w.d d11 = this.cO.a(n2);
                    if (arrstring != null) {
                        if (!d11.G()) {
                            this.a(d11, 0.0f);
                        }
                        ++n2;
                    }
                    if (arrstring != null) continue;
                }
            }
        }
    }

    @Nullable
    public UUID aq() {
        return (UUID)this.ap.b(cP).orNull();
    }

    protected boolean o(int n2) {
        String[] arrstring = net.minecraft.ag.A.b();
        boolean bl2 = this.ap.b(cS) & n2;
        if (arrstring != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    protected void c(int n2, boolean bl2) {
        block2: {
            byte by2;
            block1: {
                String[] arrstring;
                block0: {
                    by2 = this.ap.b(cS);
                    arrstring = net.minecraft.ag.A.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    this.ap.b(cS, (byte)(by2 | n2));
                }
                if (arrstring != null) break block2;
            }
            this.ap.b(cS, (byte)(by2 & ~n2));
        }
    }

    protected void a(d_ d_2) {
        this.a(net.minecraft.u.E.fk, d_2.c() * 0.15f, d_2.e());
    }

    public float av() {
        return 0.5f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void ar() {
        net.minecraft.B.d d10 = this.cO;
        String[] arrstring = net.minecraft.ag.A.b();
        this.cO = new net.minecraft.B.d("HorseChest", this.ao());
        this.cO.a(this.g());
        net.minecraft.B.d d11 = d10;
        if (arrstring != null) {
            if (d11 != null) {
                d10.a(this);
                int n2 = Math.min(d10.e(), this.cO.e());
                int n3 = 0;
                while (n3 < n2) {
                    net.minecraft.w.d d12 = d10.a(n3);
                    if (arrstring == null) return;
                    if (arrstring != null) {
                        if (!d12.G()) {
                            this.cO.a(n3, d12.C());
                        }
                        ++n3;
                    }
                    if (arrstring != null) continue;
                }
            }
            d11 = this.cO;
        }
        d11.b(this);
        this.ah();
    }

    @Override
    public void p(boolean bl2) {
        this.m(bl2 ? this.av() : 1.0f);
    }

    static {
        c0 = new x();
        cT = new e(null, "horse.jumpStrength", 0.7, 0.0, 2.0).a("Jump Strength").a(true);
        cS = net.minecraft.q.m.a(D.class, net.minecraft.q.h.m);
        cP = net.minecraft.q.m.a(D.class, net.minecraft.q.h.c);
    }

    /*
     * Exception decompiling
     */
    protected void ah() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    public void r(boolean bl2) {
        this.c(16, bl2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        boolean bl2;
        String[] arrstring;
        block2: {
            block3: {
                net.minecraft.U.x x2 = g10.h();
                arrstring = net.minecraft.ag.A.b();
                bl2 = this.aU();
                if (arrstring == null) break block2;
                if (!bl2 || x2 == null) break block3;
                bl2 = this.b(x2);
                if (arrstring == null) break block2;
                if (bl2) return false;
            }
            bl2 = super.a(g10, f10);
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected float at() {
        return 15.0f + (float)this.g.nextInt(8) + (float)this.g.nextInt(9);
    }

    @Override
    protected void D() {
        super.D();
        this.ao().b(cT);
        this.a(net.minecraft.U.M.f).a(53.0);
        this.a(net.minecraft.U.M.d).a(0.225f);
    }

    public void f(j j2) {
        block3: {
            D d10;
            block6: {
                boolean bl2;
                block4: {
                    String[] arrstring;
                    block5: {
                        block2: {
                            arrstring = net.minecraft.ag.A.b();
                            bl2 = this.aG.C;
                            if (arrstring == null) break block2;
                            if (bl2) break block3;
                            bl2 = this.aU();
                        }
                        if (arrstring == null) break block4;
                        if (!bl2) break block5;
                        bl2 = this.l(j2);
                        if (arrstring == null) break block4;
                        if (!bl2) break block3;
                    }
                    d10 = this;
                    if (arrstring == null) break block6;
                    bl2 = d10.aD();
                }
                if (!bl2) break block3;
                d10 = this;
            }
            d10.cO.a(this.g());
            j2.a(this, this.cO);
        }
    }

    protected void az() {
        block3: {
            D d10;
            D d11;
            block7: {
                String[] arrstring;
                block6: {
                    D d12;
                    block5: {
                        boolean bl2;
                        block4: {
                            block2: {
                                arrstring = net.minecraft.ag.A.b();
                                bl2 = this.ad();
                                if (arrstring == null) break block2;
                                if (!bl2) break block3;
                                bl2 = this.Q();
                            }
                            if (arrstring == null) break block4;
                            if (!bl2) break block3;
                            d12 = this;
                            if (arrstring == null) break block5;
                            bl2 = d12.D();
                        }
                        if (bl2) break block3;
                        d12 = this.a((net.minecraft.U.x)this, 16.0);
                    }
                    d10 = d11 = d12;
                    if (arrstring == null) break block6;
                    if (d10 == null) break block3;
                    d10 = this;
                }
                if (arrstring == null) break block7;
                if (!(d10.s(d11) > 4.0)) break block3;
                d10 = this;
            }
            d10.b7.a(d11);
        }
    }

    @Override
    @Nullable
    protected d aI() {
        this.aB();
        return null;
    }

    protected double as() {
        return ((double)0.45f + this.g.nextDouble() * 0.3 + this.g.nextDouble() * 0.3 + this.g.nextDouble() * 0.3) * 0.25;
    }

    public void s(boolean bl2) {
        this.c(4, bl2);
    }

    public int n(int n2) {
        int n3 = net.minecraft.k.h.c(this.R() + n2, 0, this.aA());
        this.m(n3);
        return n3;
    }

    public boolean c(j j2) {
        String[] arrstring = net.minecraft.ag.A.b();
        this.b(j2.u());
        String[] arrstring2 = arrstring;
        this.u(true);
        boolean bl2 = j2 instanceof net.minecraft.i.k;
        if (arrstring2 != null) {
            if (bl2) {
                a6.g.a((net.minecraft.i.k)j2, this);
            }
            this.aG.a((net.minecraft.U.x)this, (byte)7);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(a a10) {
        block3: {
            D d10;
            block5: {
                int n2;
                block4: {
                    String[] arrstring;
                    block2: {
                        String[] arrstring2 = net.minecraft.ag.A.b();
                        boolean bl2 = this.ac();
                        this.ah();
                        arrstring = arrstring2;
                        n2 = this.H;
                        if (arrstring == null) break block2;
                        if (n2 <= 20) break block3;
                        n2 = bl2 ? 1 : 0;
                    }
                    if (arrstring == null) break block4;
                    if (n2 != 0) break block3;
                    d10 = this;
                    if (arrstring == null) break block5;
                    n2 = d10.ac() ? 1 : 0;
                }
                if (n2 == 0) break block3;
                d10 = this;
            }
            d10.a(net.minecraft.u.E.bd, 0.5f, 1.0f);
        }
    }
}

