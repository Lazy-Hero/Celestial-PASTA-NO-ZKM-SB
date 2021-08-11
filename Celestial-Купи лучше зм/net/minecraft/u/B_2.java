/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.U;

import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.J.E;
import net.minecraft.J.o;
import net.minecraft.J.t;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.Q.C;
import net.minecraft.Q.aC;
import net.minecraft.Q.q;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.N;
import net.minecraft.U.g;
import net.minecraft.U.l;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bk;
import net.minecraft.W.ck;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.b;
import net.minecraft.ar.d;
import net.minecraft.ar.e;
import net.minecraft.ar.s;
import net.minecraft.ax.F;
import net.minecraft.ax.T;
import net.minecraft.client.Q;
import net.minecraft.i.j;
import net.minecraft.j.c;
import net.minecraft.j.h;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.R;
import net.minecraft.w.bE;
import net.minecraft.w.k;
import net.minecraft.z.f;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class B
extends x {
    protected /* synthetic */ float aP;
    protected /* synthetic */ double bi;
    protected static final /* synthetic */ net.minecraft.q.r<Byte> bd;
    protected /* synthetic */ int aM;
    private final /* synthetic */ a2<net.minecraft.w.d> bV;
    private static final /* synthetic */ Logger bH;
    public /* synthetic */ boolean ba;
    protected /* synthetic */ float aN;
    private static final /* synthetic */ UUID bl;
    private static final /* synthetic */ net.minecraft.q.r<Boolean> aZ;
    public /* synthetic */ float bF;
    public /* synthetic */ float bt;
    private final /* synthetic */ a2<net.minecraft.w.d> bz;
    protected /* synthetic */ float bx;
    public /* synthetic */ float aU;
    public /* synthetic */ int bn;
    public /* synthetic */ float bR;
    public /* synthetic */ int bk;
    public /* synthetic */ int a7;
    public /* synthetic */ float aR;
    private static final /* synthetic */ net.minecraft.q.r<Float> bg;
    protected /* synthetic */ int a9;
    public /* synthetic */ int bc;
    public /* synthetic */ float bT;
    protected /* synthetic */ boolean aW;
    private final /* synthetic */ s bj;
    private static /* synthetic */ int a4;
    protected /* synthetic */ double bD;
    protected /* synthetic */ boolean aL;
    public /* synthetic */ float bf;
    protected /* synthetic */ int a8;
    protected /* synthetic */ int bA;
    private /* synthetic */ int bI;
    private /* synthetic */ int bp;
    private /* synthetic */ float bs;
    public /* synthetic */ float bU;
    public /* synthetic */ float be;
    public /* synthetic */ a3 aY;
    public /* synthetic */ float bG;
    private /* synthetic */ B bW;
    public /* synthetic */ float a_;
    private final /* synthetic */ Map<net.minecraft.K.b, net.minecraft.K.j> bw;
    private /* synthetic */ G aK;
    private /* synthetic */ float bv;
    public /* synthetic */ float bQ;
    public /* synthetic */ float bL;
    public /* synthetic */ float bS;
    private /* synthetic */ boolean by;
    public /* synthetic */ float a1;
    protected /* synthetic */ int bO;
    private static final /* synthetic */ net.minecraft.q.r<Integer> bq;
    protected /* synthetic */ float br;
    public /* synthetic */ float bB;
    public /* synthetic */ int a2;
    protected /* synthetic */ int aV;
    private /* synthetic */ n bN;
    protected /* synthetic */ int bM;
    public /* synthetic */ float bK;
    protected /* synthetic */ double bo;
    protected /* synthetic */ double a5;
    protected /* synthetic */ net.minecraft.w.d aX;
    public /* synthetic */ float bu;
    private /* synthetic */ net.minecraft.j.g bm;
    protected /* synthetic */ j bP;
    protected /* synthetic */ float bb;
    private static final /* synthetic */ net.minecraft.q.r<Integer> aQ;
    public /* synthetic */ float a3;
    private /* synthetic */ long a6;
    protected /* synthetic */ float a0;
    public /* synthetic */ int aO;
    public /* synthetic */ float bh;
    public /* synthetic */ int aS;
    public /* synthetic */ float bJ;
    protected /* synthetic */ double bC;
    private /* synthetic */ B aT;
    private static final /* synthetic */ net.minecraft.j.f bE;

    protected boolean j() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.Q();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Nullable
    public G C() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (b10.aG.r() - this.a6 > 40L) {
                this.aK = null;
            }
            b10 = this;
        }
        return b10.aK;
    }

    public int Y() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.l();
        if (arrn != null) {
            n2 = n2 != 0 ? this.aX.o() - this.G() : 0;
        }
        return n2;
    }

    public void a(n n2, boolean bl2) {
    }

    public void b(a3 a32) {
        block4: {
            z z2;
            block5: {
                int n2;
                block2: {
                    int[] arrn;
                    block3: {
                        arrn = net.minecraft.U.M.b();
                        n2 = this.ba;
                        if (arrn == null) break block2;
                        if (n2 == 0) break block3;
                        n2 = this.aS;
                        if (arrn == null) break block2;
                        if (n2 >= this.w() / 2) break block3;
                        n2 = this.aS;
                        if (arrn == null) break block2;
                        if (n2 >= 0) break block4;
                    }
                    this.aS = -1;
                    this.ba = true;
                    this.aY = a32;
                    z2 = this.aG;
                    if (arrn == null) break block5;
                    n2 = z2 instanceof A;
                }
                if (n2 == 0) break block4;
                z2 = this.aG;
            }
            ((A)z2).x().a(this, new C(this, a32 == net.minecraft.ar.a3.MAIN_HAND ? 0 : 3));
        }
    }

    public void l(boolean bl2) {
        this.aL = bl2;
    }

    public void c(net.minecraft.w.d d10) {
        int[] arrn = net.minecraft.U.M.b();
        this.a(net.minecraft.u.E.fe, 0.8f, 0.8f + this.aG.J.nextFloat() * 0.4f);
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < 5; ++i2) {
            net.minecraft.k.l l2 = new net.minecraft.k.l(((double)this.g.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            l2 = l2.a(-this.at * ((float)Math.PI / 180));
            l2 = l2.b(-this.e * ((float)Math.PI / 180));
            double d11 = (double)(-this.g.nextFloat()) * 0.6 - 0.3;
            net.minecraft.k.l l3 = new net.minecraft.k.l(((double)this.g.nextFloat() - 0.5) * 0.3, d11, 0.6);
            l3 = l3.a(-this.at * ((float)Math.PI / 180));
            l3 = l3.b(-this.e * ((float)Math.PI / 180));
            l3 = l3.c(this.a, this.aF + (double)this.l(), this.ax);
            this.aG.a(net.minecraft.ar.aH.ITEM_CRACK, l3.e, l3.d, l3.b, l2.e, l2.d + 0.05, l2.b, net.minecraft.w.k.a(d10.w()));
            if (arrn2 != null) continue;
        }
    }

    public boolean aq() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.ap.b(bd) & 1;
        if (arrn != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public B(z z2) {
        super(z2);
        this.bj = new s(this);
        this.bw = Maps.newHashMap();
        this.bz = net.minecraft.ar.a2.a(2, net.minecraft.w.d.m);
        this.bV = net.minecraft.ar.a2.a(4, net.minecraft.w.d.m);
        this.a7 = 20;
        this.a_ = 0.02f;
        this.by = true;
        this.aX = net.minecraft.w.d.m;
        this.D();
        this.f(this.H());
        this.az = true;
        this.bL = (float)((Math.random() + 1.0) * (double)0.01f);
        this.g(this.a, this.aF, this.ax);
        this.bB = (float)Math.random() * 12398.0f;
        this.a1 = this.e = (float)(Math.random() * (Math.PI * 2));
        this.aI = 0.6f;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block63: {
            block62: {
                block61: {
                    block60: {
                        block59: {
                            block58: {
                                block57: {
                                    block78: {
                                        block77: {
                                            block73: {
                                                block74: {
                                                    block75: {
                                                        block76: {
                                                            block64: {
                                                                block65: {
                                                                    block72: {
                                                                        block56: {
                                                                            block67: {
                                                                                block69: {
                                                                                    block68: {
                                                                                        block66: {
                                                                                            super.ae();
                                                                                            v0 = net.minecraft.U.M.b();
                                                                                            this.z();
                                                                                            var1_1 = v0;
                                                                                            v1 = this;
                                                                                            if (var1_1 == null) break block64;
                                                                                            if (v1.aG.C) break block65;
                                                                                            v2 = var2_2 = this.I();
                                                                                            if (var1_1 == null) break block66;
                                                                                            if (v2 <= 0) break block67;
                                                                                            v2 = this.bk;
                                                                                        }
                                                                                        if (var1_1 == null) break block68;
                                                                                        if (v2 <= 0) {
                                                                                            this.bk = 20 * (30 - var2_2);
                                                                                        }
                                                                                        --this.bk;
                                                                                        v3 = this;
                                                                                        if (var1_1 == null) break block69;
                                                                                        v2 = v3.bk;
                                                                                    }
                                                                                    if (v2 > 0) break block67;
                                                                                    v3 = this;
                                                                                }
                                                                                v3.j(var2_2 - 1);
                                                                            }
                                                                            var3_4 = net.minecraft.B.X.values();
                                                                            var4_6 = var3_4.length;
                                                                            var5_8 = 0;
                                                                            while (var5_8 < var4_6) {
                                                                                block71: {
                                                                                    block70: {
                                                                                        var6_9 = var3_4[var5_8];
                                                                                        v4 /* !! */  = l.a;
                                                                                        if (var1_1 == null) ** GOTO lbl38
                                                                                        v5 = v4 /* !! */ [var6_9.b().ordinal()];
                                                                                        if (var1_1 == null) break block56;
                                                                                        switch (v5) {
                                                                                            case 1: {
                                                                                                v4 /* !! */  = (int[])this.bz.get(var6_9.a());
lbl38:
                                                                                                // 2 sources

                                                                                                var7_11 = (net.minecraft.w.d)v4 /* !! */ ;
                                                                                                if (var1_1 != null) break;
                                                                                            }
                                                                                            case 2: {
                                                                                                var7_11 = this.bV.get(var6_9.a());
                                                                                                if (var1_1 != null) break;
                                                                                            }
                                                                                            default: {
                                                                                                break block70;
                                                                                            }
                                                                                        }
                                                                                        var8_13 = this.b(var6_9);
                                                                                        if (var1_1 == null) break block71;
                                                                                        if (net.minecraft.w.d.a(var8_13, var7_11)) break block70;
                                                                                        ((A)this.aG).x().a(this, new aC(this.W(), var6_9, var8_13));
                                                                                        v6 = var7_11.G();
                                                                                        if (var1_1 != null) {
                                                                                            if (v6 == 0) {
                                                                                                this.ao().a(var7_11.a(var6_9));
                                                                                            }
                                                                                            v6 = var8_13.G();
                                                                                        }
                                                                                        if (var1_1 != null) {
                                                                                            if (v6 == 0) {
                                                                                                this.ao().b(var8_13.a(var6_9));
                                                                                            }
                                                                                            v6 = l.a[var6_9.b().ordinal()];
                                                                                        }
                                                                                        switch (v6 ? 1 : 0) {
                                                                                            case 1: {
                                                                                                v7 = var6_9.a();
                                                                                                v8 = var8_13;
                                                                                                if (var1_1 == null) ** GOTO lbl67
                                                                                                if (v8.G()) {
                                                                                                    v9 = net.minecraft.w.d.m;
                                                                                                } else {
                                                                                                    v8 = var8_13;
lbl67:
                                                                                                    // 2 sources

                                                                                                    v9 = v8.C();
                                                                                                }
                                                                                                this.bz.set(v7, v9);
                                                                                                if (var1_1 != null) break;
                                                                                            }
                                                                                            case 2: {
                                                                                                v10 = var6_9.a();
                                                                                                v11 = var8_13;
                                                                                                if (var1_1 == null) ** GOTO lbl79
                                                                                                if (v11.G()) {
                                                                                                    v12 = net.minecraft.w.d.m;
                                                                                                } else {
                                                                                                    v11 = var8_13;
lbl79:
                                                                                                    // 2 sources

                                                                                                    v12 = v11.C();
                                                                                                }
                                                                                                this.bV.set(v10, v12);
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    ++var5_8;
                                                                                }
                                                                                if (var1_1 != null) continue;
                                                                            }
                                                                            v5 = this.H % 20;
                                                                        }
                                                                        if (var1_1 == null) break block72;
                                                                        if (v5 == 0) {
                                                                            this.aC().f();
                                                                        }
                                                                        v1 = this;
                                                                        if (var1_1 == null) break block64;
                                                                        v5 = v1.m ? 1 : 0;
                                                                    }
                                                                    if (v5 != 0) break block65;
                                                                    var3_5 = this.c(net.minecraft.u.c.i);
                                                                    v1 = this;
                                                                    if (var1_1 == null) break block64;
                                                                    if (v1.f(6) != var3_5) {
                                                                        this.a(6, var3_5);
                                                                    }
                                                                }
                                                                this.E();
                                                                v1 = this;
                                                            }
                                                            var2_3 = v1.a - this.N;
                                                            var4_7 = this.ax - this.k;
                                                            var6_10 = (float)(var2_3 * var2_3 + var4_7 * var4_7);
                                                            var7_12 = this.bf;
                                                            var8_14 = 0.0f;
                                                            this.br = this.a0;
                                                            var9_15 = 0.0f;
                                                            cfr_temp_0 = var6_10 - 0.0025000002f;
                                                            v13 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                            if (var1_1 == null) break block73;
                                                            if (v13 <= 0) break block74;
                                                            var9_15 = 1.0f;
                                                            var8_14 = (float)Math.sqrt(var6_10) * 3.0f;
                                                            var10_16 = (float)net.minecraft.k.h.a(var4_7, var2_3) * 57.295776f - 90.0f;
                                                            var11_17 = net.minecraft.k.h.e(net.minecraft.k.h.b(this.e) - var10_16);
                                                            v14 = 95.0f;
                                                            if (var1_1 == null) break block75;
                                                            if (!(v14 < var11_17)) break block76;
                                                            v14 = var11_17;
                                                            if (var1_1 == null) break block75;
                                                            if (!(v14 < 265.0f)) break block76;
                                                            var7_12 = var10_16 - 180.0f;
                                                            if (var1_1 != null) break block74;
                                                        }
                                                        v14 = var10_16;
                                                    }
                                                    var7_12 = v14;
                                                }
                                                v13 = (cfr_temp_1 = this.aR - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                            }
                                            if (var1_1 == null) break block77;
                                            if (v13 > 0) {
                                                var7_12 = this.e;
                                            }
                                            v15 = this;
                                            if (var1_1 == null) break block78;
                                            v13 = (float)v15.A;
                                        }
                                        if (v13 == false) {
                                            var9_15 = 0.0f;
                                        }
                                        this.a0 += (var9_15 - this.a0) * 0.3f;
                                        this.aG.H.b("headTurn");
                                        var8_14 = this.a(var7_12, var8_14);
                                        this.aG.H.c();
                                        v15 = this;
                                    }
                                    v15.aG.H.b("rangeChecks");
                                    while (this.e - this.ak < -180.0f) {
                                        this.ak -= 360.0f;
                                        if (var1_1 != null) {
                                            if (var1_1 != null) continue;
                                        }
                                        break block57;
                                    }
                                    while (this.e - this.ak >= 180.0f) {
                                        this.ak += 360.0f;
                                        if (var1_1 != null) {
                                            if (var1_1 != null) continue;
                                        }
                                        break block58;
                                    }
                                }
                                while (this.bf - this.aU < -180.0f) {
                                    this.aU -= 360.0f;
                                    if (var1_1 != null) {
                                        if (var1_1 != null) continue;
                                    }
                                    break block59;
                                }
                            }
                            while (this.bf - this.aU >= 180.0f) {
                                this.aU += 360.0f;
                                if (var1_1 != null) {
                                    if (var1_1 != null) continue;
                                }
                                break block60;
                            }
                        }
                        while (this.at - this.E < -180.0f) {
                            this.E -= 360.0f;
                            if (var1_1 != null) {
                                if (var1_1 != null) continue;
                            }
                            break block61;
                        }
                    }
                    while (this.at - this.E >= 180.0f) {
                        this.E += 360.0f;
                        if (var1_1 != null) {
                            if (var1_1 != null) continue;
                        }
                        break block62;
                    }
                }
                while (this.a1 - this.bh < -180.0f) {
                    this.bh -= 360.0f;
                    if (var1_1 != null) {
                        if (var1_1 != null) continue;
                    }
                    break block63;
                }
            }
            while (this.a1 - this.bh >= 180.0f) {
                this.bh += 360.0f;
                if (var1_1 != null) {
                    if (var1_1 != null) continue;
                }
                break block63;
            }
            this.aG.H.c();
            this.aN += var8_14;
        }
        v16 = this;
        if (var1_1 != null) {
            if (v16.aK()) {
                ++this.aM;
                if (var1_1 != null) return;
            }
            v16 = this;
        }
        v16.aM = 0;
    }

    public int Z() {
        return this.bp;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean ab() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aq()) return false;
            b10 = this;
        }
        if (b10.aX.w().b(this.aX) != net.minecraft.w.bE.BLOCK) return false;
        return true;
    }

    public net.minecraft.j.g ao() {
        int[] arrn = net.minecraft.U.M.b();
        net.minecraft.j.g g10 = this.bm;
        if (arrn != null) {
            if (g10 == null) {
                this.bm = new h();
            }
            g10 = this.bm;
        }
        return g10;
    }

    public float c(float f10) {
        float f11 = this.aR - this.bG;
        int[] arrn = net.minecraft.U.M.b();
        float f12 = f11;
        float f13 = 0.0f;
        if (arrn != null) {
            if (f12 < f13) {
                f11 += 1.0f;
            }
            f12 = this.bG;
            f13 = f11 * f10;
        }
        return f12 + f13;
    }

    public int G() {
        return this.aV;
    }

    public void f(float f10) {
        this.ap.b(bg, Float.valueOf(net.minecraft.k.h.c(f10, 0.0f, this.H())));
    }

    public void f(x x2) {
        block26: {
            B b10;
            block30: {
                boolean bl2;
                block29: {
                    float f10;
                    double d10;
                    double d11;
                    int[] arrn;
                    block28: {
                        block27: {
                            block13: {
                                block15: {
                                    B b11;
                                    double d12;
                                    double d13;
                                    block11: {
                                        block16: {
                                            x x3;
                                            block14: {
                                                boolean bl3;
                                                block12: {
                                                    arrn = net.minecraft.U.M.b();
                                                    bl3 = x2 instanceof o;
                                                    if (arrn == null) break block12;
                                                    if (bl3) break block13;
                                                    x3 = x2;
                                                    if (arrn == null) break block14;
                                                    bl3 = x3 instanceof net.minecraft.ag.D;
                                                }
                                                if (bl3) break block13;
                                                x3 = x2;
                                            }
                                            d11 = x3.a;
                                            d13 = x2.m().b + (double)x2.aD;
                                            d12 = x2.ax;
                                            aA aA2 = x2.b();
                                            if (arrn == null) break block15;
                                            if (aA2 == null) break block16;
                                            aA aA3 = aA2.l();
                                            int[][] arrarrn = new int[][]{{0, 1}, {0, -1}, {-1, 1}, {-1, -1}, {1, 1}, {1, -1}, {-1, 0}, {1, 0}, {0, 1}};
                                            d10 = Math.floor(this.a) + 0.5;
                                            double d14 = Math.floor(this.ax) + 0.5;
                                            double d15 = this.m().f - this.m().e;
                                            double d16 = this.m().g - this.m().d;
                                            net.minecraft.k.k k2 = new net.minecraft.k.k(d10 - d15 / 2.0, x2.m().b, d14 - d16 / 2.0, d10 + d15 / 2.0, Math.floor(x2.m().b) + (double)this.aD, d14 + d16 / 2.0);
                                            for (int[] arrn2 : arrarrn) {
                                                B b12;
                                                double d17;
                                                block25: {
                                                    boolean bl4;
                                                    double d18;
                                                    block24: {
                                                        block17: {
                                                            net.minecraft.k.k k3;
                                                            block18: {
                                                                block23: {
                                                                    B b13;
                                                                    block21: {
                                                                        block22: {
                                                                            block20: {
                                                                                B b14;
                                                                                block19: {
                                                                                    double d19 = aA2.r() * arrn2[0] + aA3.r() * arrn2[1];
                                                                                    double d20 = aA2.i() * arrn2[0] + aA3.i() * arrn2[1];
                                                                                    d18 = d10 + d19;
                                                                                    d17 = d14 + d20;
                                                                                    k3 = k2.c(d19, 0.0, d20);
                                                                                    b11 = this;
                                                                                    if (arrn == null) break block11;
                                                                                    bl4 = b11.aG.d(k3);
                                                                                    if (arrn == null) break block17;
                                                                                    if (bl4) break block18;
                                                                                    b14 = this;
                                                                                    if (arrn == null) break block19;
                                                                                    if (!b14.aG.d(new n(d18, this.aF, d17)).d()) break block20;
                                                                                    b14 = this;
                                                                                }
                                                                                b14.c(d18, this.aF + 1.0, d17);
                                                                                return;
                                                                            }
                                                                            n n2 = new n(d18, this.aF - 1.0, d17);
                                                                            b13 = this;
                                                                            if (arrn == null) break block21;
                                                                            if (b13.aG.d(n2).d()) break block22;
                                                                            b13 = this;
                                                                            if (arrn == null) break block21;
                                                                            if (b13.aG.d(n2).o() != net.minecraft.ac.c.L) break block23;
                                                                        }
                                                                        d11 = d18;
                                                                        b13 = this;
                                                                    }
                                                                    d13 = b13.aF + 1.0;
                                                                    d12 = d17;
                                                                }
                                                                if (arrn != null) continue;
                                                            }
                                                            bl4 = this.aG.d(k3.c(0.0, 1.0, 0.0));
                                                        }
                                                        if (arrn == null) break block24;
                                                        if (bl4) continue;
                                                        b12 = this;
                                                        if (arrn == null) break block25;
                                                        bl4 = b12.aG.d(new n(d18, this.aF + 1.0, d17)).d();
                                                    }
                                                    if (!bl4) continue;
                                                    d11 = d18;
                                                    b12 = this;
                                                }
                                                d13 = b12.aF + 2.0;
                                                d12 = d17;
                                                if (arrn != null) continue;
                                            }
                                        }
                                        b11 = this;
                                    }
                                    b11.c(d11, d13, d12);
                                }
                                if (arrn != null) break block26;
                            }
                            d11 = (double)(this.ad / 2.0f + x2.ad / 2.0f) + 0.4;
                            if (!(x2 instanceof o)) break block27;
                            f10 = 0.0f;
                            if (arrn != null) break block28;
                        }
                        f10 = 1.5707964f * (float)(this.al() == b.RIGHT ? -1 : 1);
                    }
                    float f11 = -net.minecraft.k.h.g(-this.e * ((float)Math.PI / 180) - (float)Math.PI + f10);
                    float f12 = -net.minecraft.k.h.c(-this.e * ((float)Math.PI / 180) - (float)Math.PI + f10);
                    double d21 = Math.abs(f11) > Math.abs(f12) ? d11 / (double)Math.abs(f11) : d11 / (double)Math.abs(f12);
                    double d22 = this.a + (double)f11 * d21;
                    d10 = this.ax + (double)f12 * d21;
                    this.g(d22, x2.aF + (double)x2.aD + 0.001, d10);
                    bl2 = this.aG.d(this.m());
                    if (arrn == null) break block29;
                    if (!bl2) break block26;
                    this.g(d22, x2.aF + (double)x2.aD + 1.001, d10);
                    b10 = this;
                    if (arrn == null) break block30;
                    bl2 = b10.aG.d(this.m());
                }
                if (!bl2) break block26;
                b10 = this;
            }
            b10.g(x2.a, x2.aF + (double)this.aD + 0.001, x2.ax);
        }
    }

    public int v() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.aq();
        if (arrn != null) {
            n2 = n2 != 0 ? this.aX.o() - this.G() : 0;
        }
        return n2;
    }

    public boolean L() {
        return true;
    }

    @Override
    protected void B() {
        int[] arrn = net.minecraft.U.M.b();
        double d10 = this.g.nextDouble() - this.a(net.minecraft.U.M.h).d();
        double d11 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (arrn != null) {
            d11 = d11 >= 0 ? 1.0 : 0.0;
        }
        this.M = d11;
    }

    @Override
    public boolean v() {
        return this.i();
    }

    protected void g() {
    }

    public boolean a(X x2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.b(x2).G();
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    protected void k() {
        this.G += (double)0.04f;
    }

    protected void D() {
        this.ao().b(net.minecraft.U.M.f);
        this.ao().b(net.minecraft.U.M.h);
        this.ao().b(net.minecraft.U.M.d);
        this.ao().b(net.minecraft.U.M.i);
        this.ao().b(net.minecraft.U.M.e);
    }

    protected void M() {
        block4: {
            Map<net.minecraft.K.b, net.minecraft.K.j> map;
            block2: {
                block3: {
                    int[] arrn = net.minecraft.U.M.b();
                    map = this.bw;
                    if (arrn == null) break block2;
                    if (!map.isEmpty()) break block3;
                    this.t();
                    this.g(false);
                    if (arrn != null) break block4;
                }
                map = this.bw;
            }
            Collection<net.minecraft.K.j> collection = map.values();
            this.ap.b(aZ, net.minecraft.U.B.a(collection));
            this.ap.b(bq, net.minecraft.K.k.a(collection));
            this.g(this.c(net.minecraft.u.c.c));
        }
    }

    public int n() {
        net.minecraft.j.b b10 = this.a(net.minecraft.U.M.i);
        return net.minecraft.k.h.f(b10.d());
    }

    protected d a(int n2) {
        return n2 > 4 ? net.minecraft.u.E.aT : net.minecraft.u.E.b1;
    }

    protected void h(float f10) {
    }

    public void a(a3 a32, net.minecraft.w.d d10) {
        block6: {
            a3 a33;
            a3 a34;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.U.M.b();
                    a34 = a32;
                    a33 = net.minecraft.ar.a3.MAIN_HAND;
                    if (arrn == null) break block4;
                    if (a34 != a33) break block5;
                    this.a(net.minecraft.B.X.MAINHAND, d10);
                    if (arrn != null) break block6;
                }
                a34 = a32;
                a33 = net.minecraft.ar.a3.OFF_HAND;
            }
            if (a34 != a33) {
                throw new IllegalArgumentException("Invalid hand " + (Object)((Object)a32));
            }
            this.a(net.minecraft.B.X.OFFHAND, d10);
        }
    }

    @Override
    public void a(float f10) {
        this.a1 = f10;
    }

    public void a(G g10) {
        block14: {
            z z2;
            block19: {
                B b10;
                block22: {
                    block20: {
                        boolean bl2;
                        int n2;
                        int[] arrn;
                        block21: {
                            B b11;
                            block18: {
                                B b12;
                                block17: {
                                    block15: {
                                        block16: {
                                            x x2;
                                            block13: {
                                                arrn = net.minecraft.U.M.b();
                                                x2 = this;
                                                if (arrn == null) break block13;
                                                if (x2.aW) break block14;
                                                x2 = g10.h();
                                            }
                                            b11 = x2;
                                            B b13 = this.m();
                                            b12 = this;
                                            if (arrn == null) break block15;
                                            if (b12.bO < 0) break block16;
                                            b12 = b13;
                                            if (arrn == null) break block15;
                                            if (b12 != null) {
                                                b13.a(this, this.bO, g10);
                                            }
                                        }
                                        b12 = b11;
                                    }
                                    if (arrn == null) break block17;
                                    if (b12 == null) break block18;
                                    b12 = b11;
                                }
                                b12.a(this);
                            }
                            this.aW = true;
                            this.aC().f();
                            z2 = this.aG;
                            if (arrn == null) break block19;
                            if (z2.C) break block20;
                            n2 = 0;
                            bl2 = b11 instanceof j;
                            if (arrn == null) break block21;
                            if (bl2) {
                                n2 = net.minecraft.ax.T.g(b11);
                            }
                            b10 = this;
                            if (arrn == null) break block22;
                            bl2 = b10.j();
                        }
                        if (!bl2) break block20;
                        z2 = this.aG;
                        if (arrn == null) break block19;
                        if (z2.M().c("doMobLoot")) {
                            boolean bl3 = this.bM;
                            if (arrn != null) {
                                bl3 = bl3 > false;
                            }
                            boolean bl4 = bl3;
                            this.a(bl4, n2, g10);
                        }
                    }
                    b10 = this;
                }
                z2 = b10.aG;
            }
            z2.a((x)this, (byte)3);
        }
    }

    public void ap() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aX.G()) {
                this.aX.a(this.aG, this, this.G());
            }
            b10 = this;
        }
        b10.aJ();
    }

    public void aJ() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aG.C) {
                this.ap.b(bd, (byte)0);
            }
            this.aX = net.minecraft.w.d.m;
            b10 = this;
        }
        b10.aV = 0;
    }

    protected int a(j j2) {
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean W() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aq()) return false;
            b10 = this;
        }
        if (b10.aX.w().b(this.aX) != net.minecraft.w.bE.EAT) return false;
        return true;
    }

    @Override
    public void f(r r2) {
        block15: {
            boolean bl2;
            int[] arrn;
            Object object;
            block14: {
                boolean bl3;
                net.minecraft.w.d d10;
                X x2;
                int n2;
                int n3;
                block13: {
                    r2.a("Health", this.V());
                    r2.a("HurtTime", (short)this.bc);
                    r2.b("HurtByTimestamp", this.bp);
                    int[] arrn2 = net.minecraft.U.M.b();
                    r2.a("DeathTime", (short)this.a2);
                    r2.a("AbsorptionAmount", this.ax());
                    object = net.minecraft.B.X.values();
                    arrn = arrn2;
                    n3 = ((X[])object).length;
                    n2 = 0;
                    while (n2 < n3) {
                        x2 = object[n2];
                        d10 = this.b(x2);
                        if (arrn != null) {
                            bl3 = d10.G();
                            if (arrn == null) break block13;
                            if (!bl3) {
                                this.ao().a(d10.a(x2));
                            }
                            ++n2;
                        }
                        if (arrn != null) continue;
                    }
                    r2.a("Attributes", net.minecraft.U.M.a(this.ao()));
                    object = net.minecraft.B.X.values();
                    n3 = ((X[])object).length;
                    bl3 = false;
                }
                n2 = bl3 ? 1 : 0;
                while (n2 < n3) {
                    x2 = object[n2];
                    d10 = this.b(x2);
                    if (arrn != null) {
                        bl2 = d10.G();
                        if (arrn == null) break block14;
                        if (!bl2) {
                            this.ao().b(d10.a(x2));
                        }
                        ++n2;
                    }
                    if (arrn != null) continue;
                }
                bl2 = this.bw.isEmpty();
            }
            if (!bl2) {
                object = new u();
                for (net.minecraft.K.j j2 : this.bw.values()) {
                    ((u)object).a(j2.b(new r()));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block15;
                }
                r2.a("ActiveEffects", (net.minecraft.P.i)object);
            }
            r2.a("FallFlying", this.aK());
        }
    }

    public void c(@Nullable B b10) {
        this.aT = b10;
        this.bp = this.H;
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.bo = d10;
        this.bC = d11;
        this.bD = d12;
        this.a5 = f10;
        this.bi = f11;
        this.bA = n2;
    }

    public boolean c(net.minecraft.K.b b10) {
        return this.bw.containsKey(b10);
    }

    protected void b(G g10, float f10) {
        block3: {
            float f11;
            block4: {
                G g11;
                B b10;
                int[] arrn;
                block2: {
                    arrn = net.minecraft.U.M.b();
                    b10 = this;
                    g11 = g10;
                    if (arrn == null) break block2;
                    if (b10.a(g11)) break block3;
                    f10 = this.c(g10, f10);
                    b10 = this;
                    g11 = g10;
                }
                float f12 = f10 = b10.a(g11, f10);
                f10 = Math.max(f10 - this.ax(), 0.0f);
                this.d(this.ax() - (f12 - f10));
                f11 = f10;
                if (arrn == null) break block4;
                if (f11 == 0.0f) break block3;
                f11 = this.V();
            }
            float f13 = f11;
            this.f(f13 - f10);
            this.aC().a(g10, f13, f10);
            this.d(this.ax() - f10);
        }
    }

    public final float V() {
        return this.ap.b(bg).floatValue();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void d(float var1_1, float var2_2) {
        v0 = net.minecraft.U.M.b();
        super.d(var1_1, var2_2);
        var3_3 = v0;
        v1 = var4_4 = this.a(net.minecraft.u.c.n);
        if (var3_3 == null) ** GOTO lbl10
        if (v1 == null) {
            v2 = 0.0f;
        } else {
            v1 = var4_4;
lbl10:
            // 2 sources

            v2 = v1.h() + 1;
        }
        var5_5 = v2;
        v3 = var6_6 = net.minecraft.k.h.f((var1_1 - 3.0f - var5_5) * var2_2);
        if (var3_3 != null) {
            if (v3 <= 0) return;
            this.a(this.a(var6_6), 1.0f, 1.0f);
            this.a(net.minecraft.ar.G.e, (float)var6_6);
            v3 = net.minecraft.k.h.f(this.a);
        }
        var7_7 = v3;
        var8_8 = net.minecraft.k.h.f(this.aF - 0.20000000298023224);
        var9_9 = net.minecraft.k.h.f(this.ax);
        v4 = var10_10 = this.aG.d(new n(var7_7, var8_8, var9_9));
        if (var3_3 != null) {
            if (v4.o() == net.minecraft.ac.c.A) return;
            v4 = var10_10;
        }
        var11_11 = v4.b().l();
        this.a(var11_11.g(), var11_11.c() * 0.5f, var11_11.e() * 0.75f);
    }

    protected float T() {
        return 0.42f;
    }

    public void a(a3 a32) {
        block5: {
            int n2;
            block7: {
                int n3;
                int[] arrn;
                block6: {
                    net.minecraft.w.d d10;
                    block4: {
                        d10 = this.c(a32);
                        arrn = net.minecraft.U.M.b();
                        n3 = d10.G();
                        if (arrn == null) break block4;
                        if (n3 != 0) break block5;
                        n3 = this.aq();
                    }
                    if (arrn == null) break block6;
                    if (n3 != 0) break block5;
                    this.aX = d10;
                    this.aV = d10.o();
                    n3 = this.aG.C ? 1 : 0;
                }
                if (arrn == null) break block7;
                if (n3 != 0) break block5;
                n3 = n2 = 1;
            }
            if (a32 == net.minecraft.ar.a3.OFF_HAND) {
                n2 |= 2;
            }
            this.ap.b(bd, (byte)n2);
        }
    }

    public net.minecraft.w.d a() {
        return this.aX;
    }

    public static void e(int n2) {
        a4 = n2;
    }

    protected void a(boolean bl2, int n2, G g10) {
        this.a(bl2, n2);
        this.b(bl2, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean S() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aq()) return false;
            b10 = this;
        }
        if (b10.aX.w().b(this.aX) != net.minecraft.w.bE.BOW) return false;
        return true;
    }

    public void a(net.minecraft.w.d d10, int n2) {
        block6: {
            boolean bl2;
            int[] arrn;
            block7: {
                arrn = net.minecraft.U.M.b();
                bl2 = d10.G();
                if (arrn == null) break block7;
                if (bl2) break block6;
                bl2 = this.aq();
            }
            if (!bl2) break block6;
            bE bE2 = d10.h();
            bE bE3 = net.minecraft.w.bE.DRINK;
            if (arrn != null) {
                if (bE2 == bE3) {
                    this.a(net.minecraft.u.E.en, 0.5f, this.aG.J.nextFloat() * 0.1f + 0.9f);
                }
                bE2 = d10.h();
                bE3 = net.minecraft.w.bE.EAT;
            }
            if (bE2 != bE3) break block6;
            for (int i2 = 0; i2 < n2; ++i2) {
                net.minecraft.k.l l2;
                net.minecraft.k.l l3;
                block9: {
                    block8: {
                        l3 = new net.minecraft.k.l(((double)this.g.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
                        l3 = l3.a(-this.at * ((float)Math.PI / 180));
                        l3 = l3.b(-this.e * ((float)Math.PI / 180));
                        double d11 = (double)(-this.g.nextFloat()) * 0.6 - 0.3;
                        l2 = new net.minecraft.k.l(((double)this.g.nextFloat() - 0.5) * 0.3, d11, 0.6);
                        l2 = l2.a(-this.at * ((float)Math.PI / 180));
                        l2 = l2.b(-this.e * ((float)Math.PI / 180));
                        l2 = l2.c(this.a, this.aF + (double)this.l(), this.ax);
                        if (arrn == null) break block6;
                        if (arrn == null) break block8;
                        if (!d10.z()) break block9;
                        this.aG.a(net.minecraft.ar.aH.ITEM_CRACK, l2.e, l2.d, l2.b, l3.e, l3.d + 0.05, l3.b, net.minecraft.w.k.a(d10.w()), d10.d());
                    }
                    if (arrn != null) continue;
                }
                this.aG.a(net.minecraft.ar.aH.ITEM_CRACK, l2.e, l2.d, l2.b, l3.e, l3.d + 0.05, l3.b, net.minecraft.w.k.a(d10.w()));
                if (arrn != null) continue;
            }
            this.a(net.minecraft.u.E.c5, 0.5f + 0.5f * (float)this.g.nextInt(2), (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
        }
    }

    public boolean X() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(net.minecraft.K.j j2) {
        net.minecraft.K.b b10;
        int[] arrn = net.minecraft.U.M.b();
        if (this.ag() != net.minecraft.U.g.UNDEAD) return true;
        net.minecraft.K.b b11 = b10 = j2.g();
        net.minecraft.K.b b12 = net.minecraft.u.c.t;
        if (arrn != null) {
            if (b11 == b12) return false;
            b11 = b10;
            b12 = net.minecraft.u.c.g;
        }
        if (b11 == b12) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aq()) return false;
            b10 = this;
        }
        bE bE2 = b10.aX.w().b(this.aX);
        bE bE3 = net.minecraft.w.bE.EAT;
        if (arrn != null) {
            if (bE2 == bE3) return true;
            bE2 = this.aX.w().b(this.aX);
            bE3 = net.minecraft.w.bE.BLOCK;
        }
        if (arrn != null) {
            if (bE2 == bE3) return true;
            bE2 = this.aX.w().b(this.aX);
            bE3 = net.minecraft.w.bE.BOW;
        }
        if (arrn != null) {
            if (bE2 == bE3) return true;
            bE2 = this.aX.w().b(this.aX);
            bE3 = net.minecraft.w.bE.DRINK;
        }
        if (bE2 != bE3) return false;
        return true;
    }

    private static ConcurrentModificationException a(ConcurrentModificationException concurrentModificationException) {
        return concurrentModificationException;
    }

    public int aO() {
        return this.bI;
    }

    protected void t() {
        this.ap.b(aZ, false);
        this.ap.b(bq, 0);
    }

    @Override
    protected void a(double d10, boolean n2, i i2, n n3) {
        block9: {
            B b10;
            block6: {
                block7: {
                    int n4;
                    int[] arrn;
                    block8: {
                        boolean bl2;
                        block5: {
                            arrn = net.minecraft.U.M.b();
                            bl2 = this.aj();
                            if (arrn == null) break block5;
                            if (!bl2) {
                                this.t();
                            }
                            b10 = this;
                            if (arrn == null) break block6;
                            bl2 = b10.aG.C;
                        }
                        if (bl2) break block7;
                        b10 = this;
                        if (arrn == null) break block6;
                        if (!(b10.an > 3.0f)) break block7;
                        n4 = n2;
                        if (arrn == null) break block8;
                        if (n4 == 0) break block7;
                        n4 = net.minecraft.k.h.f(this.an - 3.0f);
                    }
                    float f10 = n4;
                    if (arrn == null) break block9;
                    if (i2.o() != net.minecraft.ac.c.A) {
                        double d11 = Math.min((double)(0.2f + f10 / 15.0f), 2.5);
                        int n5 = (int)(150.0 * d11);
                        ((A)this.aG).a(net.minecraft.ar.aH.BLOCK_DUST, this.a, this.aF, this.ax, n5, 0.0, 0.0, 0.0, (double)0.15f, net.minecraft.W.K.l(i2));
                    }
                }
                b10 = this;
            }
            super.a(d10, n2 != 0, i2, n3);
        }
    }

    @Override
    public net.minecraft.k.l b(float f10) {
        int[] arrn = net.minecraft.U.M.b();
        float f11 = f10;
        float f12 = 1.0f;
        if (arrn != null) {
            if (f11 == f12) {
                return net.minecraft.U.B.b(this.at, this.a1);
            }
            f11 = this.E;
            f12 = (this.at - this.E) * f10;
        }
        float f13 = f11 + f12;
        float f14 = this.bh + (this.a1 - this.bh) * f10;
        return net.minecraft.U.B.b(f13, f14);
    }

    protected void c(G g10) {
        block0: {
            d d10 = this.e(g10);
            if (d10 == null) break block0;
            this.a(d10, this.x(), this.p());
        }
    }

    public boolean a(double d10, double d11, double d12) {
        boolean bl2;
        block26: {
            block20: {
                int n2;
                int n3;
                Random random;
                z z2;
                double d13;
                int[] arrn;
                double d14;
                double d15;
                block21: {
                    int n4;
                    block22: {
                        block19: {
                            d15 = this.a;
                            d14 = this.aF;
                            arrn = net.minecraft.U.M.b();
                            d13 = this.ax;
                            this.a = d10;
                            this.aF = d11;
                            this.ax = d12;
                            n4 = 0;
                            n n5 = new n(this);
                            z2 = this.aG;
                            random = this.f();
                            n3 = z2.n(n5);
                            if (arrn == null) break block21;
                            if (n3 == 0) break block22;
                            n2 = 0;
                            while (n2 == 0) {
                                block25: {
                                    n n6;
                                    block23: {
                                        block24: {
                                            n3 = n5.b();
                                            if (arrn == null || arrn == null) break block19;
                                            if (n3 <= 0) break;
                                            n6 = n5.k();
                                            i i2 = z2.d(n6);
                                            if (arrn == null) break block23;
                                            if (!i2.o().n()) break block24;
                                            n2 = 1;
                                            if (arrn != null) break block25;
                                        }
                                        this.aF -= 1.0;
                                    }
                                    n5 = n6;
                                }
                                if (arrn != null) continue;
                            }
                            n3 = n2;
                        }
                        if (arrn == null) break block21;
                        if (n3 == 0) break block22;
                        this.c(this.a, this.aF, this.ax);
                        n3 = z2.a((x)this, this.m()).isEmpty() ? 1 : 0;
                        if (arrn == null) break block21;
                        if (n3 == 0) break block22;
                        n3 = z2.a(this.m()) ? 1 : 0;
                        if (arrn == null) break block21;
                        if (n3 == 0) {
                            n4 = 1;
                        }
                    }
                    n3 = n4;
                }
                if (arrn != null) {
                    if (n3 == 0) {
                        this.c(d15, d14, d13);
                        return false;
                    }
                    n3 = 128;
                }
                n2 = n3;
                for (int i3 = 0; i3 < 128; ++i3) {
                    double d16 = (double)i3 / 127.0;
                    float f10 = (random.nextFloat() - 0.5f) * 0.2f;
                    float f11 = (random.nextFloat() - 0.5f) * 0.2f;
                    float f12 = (random.nextFloat() - 0.5f) * 0.2f;
                    double d17 = d15 + (this.a - d15) * d16 + (random.nextDouble() - 0.5) * (double)this.ad * 2.0;
                    double d18 = d14 + (this.aF - d14) * d16 + random.nextDouble() * (double)this.aD;
                    double d19 = d13 + (this.ax - d13) * d16 + (random.nextDouble() - 0.5) * (double)this.ad * 2.0;
                    z2.a(net.minecraft.ar.aH.PORTAL, d17, d18, d19, (double)f10, (double)f11, (double)f12, new int[0]);
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block20;
                }
                bl2 = this instanceof D;
                if (arrn == null) break block26;
                if (bl2) {
                    ((D)this).l().f();
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    public void K() {
        block3: {
            B b10;
            block4: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.U.M.b();
                    bl2 = this.aX.G();
                    if (arrn == null) break block2;
                    if (bl2) break block3;
                    b10 = this;
                    if (arrn == null) break block4;
                    bl2 = b10.aq();
                }
                if (!bl2) break block3;
                this.a(this.aX, 16);
                this.a(this.aN(), this.aX.a(this.aG, this));
                b10 = this;
            }
            b10.aJ();
        }
    }

    @Nullable
    protected d aI() {
        return net.minecraft.u.E.fg;
    }

    private boolean b(G g10) {
        boolean bl2;
        block4: {
            block5: {
                net.minecraft.k.l l2;
                net.minecraft.k.l l3;
                int[] arrn;
                block6: {
                    arrn = net.minecraft.U.M.b();
                    bl2 = g10.f();
                    if (arrn == null) break block4;
                    if (bl2) break block5;
                    bl2 = this.am();
                    if (arrn == null) break block4;
                    if (!bl2) break block5;
                    l2 = l3 = g10.t();
                    if (arrn == null) break block6;
                    if (l2 == null) break block5;
                    l2 = this.b(1.0f);
                }
                net.minecraft.k.l l4 = l2;
                net.minecraft.k.l l5 = l3.e(new net.minecraft.k.l(this.a, this.aF, this.ax)).d();
                l5 = new net.minecraft.k.l(l5.e, 0.0, l5.b);
                double d10 = l5.g(l4) - 0.0;
                double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                if (arrn != null) {
                    d11 = d11 < 0 ? 1.0 : 0.0;
                }
                return (boolean)d11;
            }
            bl2 = false;
        }
        return bl2;
    }

    public float aa() {
        return this.bv;
    }

    protected void d(net.minecraft.K.j j2) {
        block0: {
            this.by = true;
            if (this.aG.C) break block0;
            j2.g().b(this, this.ao(), j2.h());
        }
    }

    public boolean j(x x2) {
        this.e(x2);
        return false;
    }

    protected void b(B b10) {
        b10.a(this, 0.5f, this.a - b10.a, this.ax - b10.ax);
    }

    public final int I() {
        return this.ap.b(aQ);
    }

    public final float H() {
        return (float)this.a(net.minecraft.U.M.f).d();
    }

    public boolean r() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.aG.C;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void d() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean aL() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.P;
        if (arrn != null) {
            if (n2 != 0) return 0 != 0;
            float f10 = this.V() - 0.0f;
            n2 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
        }
        if (arrn == null) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public float aK() {
        return this.a1;
    }

    @Override
    public boolean M() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.P;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public Collection<net.minecraft.K.j> az() {
        return this.bw.values();
    }

    protected boolean aB() {
        return false;
    }

    public net.minecraft.j.b a(c c10) {
        return this.ao().a(c10);
    }

    protected float a(G g10, float f10) {
        int n2;
        int[] arrn = net.minecraft.U.M.b();
        int n3 = g10.l();
        if (arrn != null) {
            if (n3 != 0) {
                return f10;
            }
            n3 = this.c(net.minecraft.u.c.b);
        }
        if (arrn != null) {
            float f11;
            if (n3 != 0 && g10 != net.minecraft.ar.G.l) {
                n2 = (this.a(net.minecraft.u.c.b).h() + 1) * 5;
                int n4 = 25 - n2;
                float f12 = f10 * (float)n4;
                f10 = f12 / 25.0f;
            }
            n3 = (f11 = f10 - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        }
        if (arrn != null) {
            if (n3 <= 0) {
                return 0.0f;
            }
            n3 = net.minecraft.ax.T.a(this.aV(), g10);
        }
        if ((n2 = n3) > 0) {
            f10 = net.minecraft.ar.g.a(f10, n2);
        }
        return f10;
    }

    public void e(x x2) {
        block4: {
            block3: {
                int[] arrn;
                block2: {
                    arrn = net.minecraft.U.M.b();
                    if (arrn == null) break block2;
                    if (!(x2 instanceof B)) break block3;
                    this.bW = (B)x2;
                }
                if (arrn != null) break block4;
            }
            this.bW = null;
        }
        this.bI = this.H;
    }

    @Override
    public void k(boolean bl2) {
        block4: {
            net.minecraft.j.b b10;
            block3: {
                net.minecraft.j.b b11;
                block2: {
                    int[] arrn = net.minecraft.U.M.b();
                    super.k(bl2);
                    int[] arrn2 = arrn;
                    b11 = b10 = this.a(net.minecraft.U.M.d);
                    if (arrn2 == null) break block2;
                    if (b11.a(bl) == null) break block3;
                    b11 = b10;
                }
                b11.a(bE);
            }
            if (!bl2) break block4;
            b10.b(bE);
        }
    }

    protected void b(net.minecraft.w.d d10) {
        block4: {
            d d11;
            block7: {
                k k2;
                block5: {
                    k k3;
                    block6: {
                        int[] arrn = net.minecraft.U.M.b();
                        if (d10.G()) break block4;
                        d11 = net.minecraft.u.E.hU;
                        k2 = k3 = d10.w();
                        if (arrn == null) break block5;
                        if (!(k2 instanceof net.minecraft.w.m)) break block6;
                        d11 = ((net.minecraft.w.m)k3).c().a();
                        if (arrn != null) break block7;
                    }
                    k2 = k3;
                }
                if (k2 == net.minecraft.u.h.cf) {
                    d11 = net.minecraft.u.E.g2;
                }
            }
            this.a(d11, 1.0f, 1.0f);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean aG() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (!b10.aq()) return false;
            b10 = this;
        }
        if (b10.aX.w().b(this.aX) != net.minecraft.w.bE.DRINK) return false;
        return true;
    }

    protected float c(G g10, float f10) {
        block3: {
            block2: {
                int[] arrn = net.minecraft.U.M.b();
                if (arrn == null) break block2;
                if (g10.f()) break block3;
                this.b(f10);
            }
            f10 = net.minecraft.ar.g.a(f10, this.n(), (float)this.a(net.minecraft.U.M.e).d());
        }
        return f10;
    }

    protected void aH() {
        block8: {
            B b10;
            boolean bl2;
            fT fT2;
            block7: {
                int[] arrn = net.minecraft.U.M.b();
                fT2 = new fT(this.e);
                af.a(fT2);
                int[] arrn2 = arrn;
                bl2 = fT2.a();
                if (arrn2 != null) {
                    if (bl2) {
                        return;
                    }
                    this.G = this.T();
                    bl2 = this.c(net.minecraft.u.c.n);
                }
                if (arrn2 == null) break block7;
                if (bl2) {
                    this.G += (double)((float)(this.a(net.minecraft.u.c.n).h() + 1) * 0.1f);
                }
                b10 = this;
                if (arrn2 == null) break block8;
                bl2 = b10.ai();
            }
            if (bl2) {
                float f10 = fT2.a() * ((float)Math.PI / 180);
                this.aq -= (double)(net.minecraft.k.h.g(f10) * 0.2f);
                this.d += (double)(net.minecraft.k.h.c(f10) * 0.2f);
            }
            b10 = this;
        }
        b10.aA = true;
    }

    public void O() {
    }

    static {
        bH = LogManager.getLogger();
        bl = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
        net.minecraft.U.B.e(80);
        bE = new net.minecraft.j.f(bl, "Sprinting speed boost", 0.3f, 2).a(false);
        bd = net.minecraft.q.m.a(B.class, net.minecraft.q.h.m);
        bg = net.minecraft.q.m.a(B.class, net.minecraft.q.h.k);
        bq = net.minecraft.q.m.a(B.class, net.minecraft.q.h.n);
        aZ = net.minecraft.q.m.a(B.class, net.minecraft.q.h.g);
        aQ = net.minecraft.q.m.a(B.class, net.minecraft.q.h.n);
    }

    @Nullable
    public B aA() {
        return this.aT;
    }

    protected void b(boolean bl2, int n2) {
    }

    public boolean as() {
        return false;
    }

    public net.minecraft.w.d av() {
        return this.b(net.minecraft.B.X.MAINHAND);
    }

    @Nullable
    public net.minecraft.K.j b(@Nullable net.minecraft.K.b b10) {
        return this.bw.remove(b10);
    }

    @Override
    protected void ac() {
        this.a(net.minecraft.ar.G.l, 4.0f);
    }

    public void a(x x2, float f10, double d10, double d11) {
        block3: {
            block5: {
                B b10;
                int n2;
                block4: {
                    double d12;
                    double d13;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.U.M.b();
                        d13 = this.g.nextDouble();
                        d12 = this.a(net.minecraft.U.M.h).d();
                        if (arrn == null) break block2;
                        if (!(d13 >= d12)) break block3;
                        this.aA = true;
                        d13 = d10 * d10;
                        d12 = d11 * d11;
                    }
                    float f11 = net.minecraft.k.h.e(d13 + d12);
                    this.aq /= 2.0;
                    this.d /= 2.0;
                    this.aq -= d10 / (double)f11 * (double)f10;
                    this.d -= d11 / (double)f11 * (double)f10;
                    n2 = this.A;
                    if (arrn == null) break block4;
                    if (n2 == 0) break block3;
                    this.G /= 2.0;
                    this.G += (double)f10;
                    b10 = this;
                    if (arrn == null) break block5;
                    double d14 = b10.G - (double)0.4f;
                    n2 = d14 == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
                }
                if (n2 <= 0) break block3;
                b10 = this;
            }
            b10.G = 0.4f;
        }
    }

    public boolean aK() {
        return this.f(7);
    }

    public net.minecraft.w.d c(a3 a32) {
        int[] arrn = net.minecraft.U.M.b();
        a3 a33 = a32;
        a3 a34 = net.minecraft.ar.a3.MAIN_HAND;
        if (arrn != null) {
            if (a33 == a34) {
                return this.b(net.minecraft.B.X.MAINHAND);
            }
            a33 = a32;
            a34 = net.minecraft.ar.a3.OFF_HAND;
        }
        if (a33 == a34) {
            return this.b(net.minecraft.B.X.OFFHAND);
        }
        throw new IllegalArgumentException("Invalid hand " + (Object)((Object)a32));
    }

    private int w() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = cj.b.i.a(bB.class).i();
        if (arrn != null) {
            if (n2 != 0) {
                int n3 = cj.b.f.a("Swing Speed").c();
                int n4 = this.c(net.minecraft.u.c.q);
                if (arrn != null) {
                    n4 = n4 != 0 ? 6 + (1 + this.a(net.minecraft.u.c.q).h()) * 2 : n3;
                }
                return n4;
            }
            n2 = this.c(net.minecraft.u.c.q);
        }
        if (arrn != null) {
            n2 = n2 != 0 ? 6 + (1 + this.a(net.minecraft.u.c.q).h()) * 2 : 6;
        }
        return n2;
    }

    protected void z() {
        block8: {
            block9: {
                B b10;
                int[] arrn;
                block13: {
                    int n2;
                    block12: {
                        block10: {
                            block11: {
                                net.minecraft.w.d d10;
                                B b11;
                                block7: {
                                    arrn = net.minecraft.U.M.b();
                                    b11 = this;
                                    if (arrn == null) break block7;
                                    if (!b11.aq()) break block8;
                                    b11 = this;
                                }
                                if ((d10 = b11.c(this.aN())) != this.aX) break block9;
                                n2 = this.G();
                                if (arrn == null) break block10;
                                if (n2 > 25) break block11;
                                n2 = this.G() % 4;
                                if (arrn == null) break block10;
                                if (n2 == 0) {
                                    this.a(this.aX, 5);
                                }
                            }
                            n2 = this.aV = this.aV - 1;
                        }
                        if (arrn == null) break block12;
                        if (n2 != 0) break block8;
                        b10 = this;
                        if (arrn == null) break block13;
                        n2 = b10.aG.C ? 1 : 0;
                    }
                    if (n2 != 0) break block8;
                    b10 = this;
                }
                b10.K();
                if (arrn != null) break block8;
            }
            this.aJ();
        }
    }

    public s aC() {
        return this.bj;
    }

    public net.minecraft.w.d b() {
        return this.b(net.minecraft.B.X.OFFHAND);
    }

    protected void a(net.minecraft.K.j j2, boolean bl2) {
        block5: {
            boolean bl3;
            block4: {
                this.by = true;
                int[] arrn = net.minecraft.U.M.b();
                bl3 = bl2;
                if (arrn == null) break block4;
                if (!bl3) break block5;
                bl3 = this.aG.C;
            }
            if (!bl3) {
                net.minecraft.K.b b10 = j2.g();
                b10.a(this, this.ao(), j2.h());
                b10.b(this, this.ao(), j2.h());
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean s() {
        K k2;
        i i2;
        n n2;
        int[] arrn;
        block11: {
            K k3;
            K k4;
            block10: {
                int n3;
                int n4;
                int n5;
                block9: {
                    boolean bl2;
                    block8: {
                        n5 = net.minecraft.k.h.f(this.a);
                        n4 = net.minecraft.k.h.f(this.m().b);
                        n3 = net.minecraft.k.h.f(this.ax);
                        arrn = net.minecraft.U.M.b();
                        bl2 = this instanceof j;
                        if (arrn == null) break block8;
                        if (!bl2) break block9;
                        bl2 = ((j)this).ae();
                    }
                    if (arrn == null) return bl2;
                    if (bl2) {
                        return false;
                    }
                }
                n2 = new n(n5, n4, n3);
                i2 = this.aG.d(n2);
                k2 = k4 = i2.b();
                k3 = net.minecraft.u.g.cD;
                if (arrn == null) break block10;
                if (k2 == k3) return true;
                k2 = k4;
                if (arrn == null) break block11;
                k3 = net.minecraft.u.g.aW;
            }
            if (k2 == k3) return true;
            k2 = k4;
        }
        boolean bl3 = k2 instanceof ck;
        if (arrn != null) {
            if (!bl3) return false;
            bl3 = this.a(n2, i2);
        }
        if (arrn == null) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    protected void ab() {
        this.ap.c(bd, (byte)0);
        this.ap.c(bq, 0);
        this.ap.c(aZ, false);
        this.ap.c(aQ, 0);
        this.ap.c(bg, Float.valueOf(1.0f));
    }

    protected boolean B() {
        int[] arrn = net.minecraft.U.M.b();
        float f10 = this.V() - 0.0f;
        float f11 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
        if (arrn != null) {
            f11 = f11 <= 0 ? 1.0f : 0.0f;
        }
        return (boolean)f11;
    }

    @Nullable
    public net.minecraft.K.j a(net.minecraft.K.b b10) {
        return this.bw.get(b10);
    }

    protected void N() {
        this.G += (double)0.04f;
    }

    public void d(float f10) {
        int[] arrn = net.minecraft.U.M.b();
        if (arrn != null) {
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            this.bs = f10;
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a0() {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected int f(int var1_1) {
        var3_2 = net.minecraft.ax.T.a(this);
        var2_3 = net.minecraft.U.M.b();
        v0 = var3_2;
        if (var2_3 != null) {
            if (v0 > 0) {
                v0 = this.g.nextInt(var3_2 + 1);
                if (var2_3 != null) {
                    if (v0 > 0) {
                        v1 = var1_1;
                        return v1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        v1 = v0 - 1;
        return v1;
    }

    public abstract net.minecraft.w.d b(X var1);

    @Override
    public void aO() {
        block3: {
            B b10;
            x x2;
            block4: {
                x x3;
                int[] arrn;
                block2: {
                    x2 = this.as();
                    arrn = net.minecraft.U.M.b();
                    super.aO();
                    x3 = x2;
                    if (arrn == null) break block2;
                    if (x3 == null) break block3;
                    x3 = x2;
                }
                if (x3 == this.as()) break block3;
                b10 = this;
                if (arrn == null) break block4;
                if (b10.aG.C) break block3;
                b10 = this;
            }
            b10.f(x2);
        }
    }

    @Override
    public void y() {
        this.a(net.minecraft.ar.G.l, Float.MAX_VALUE);
    }

    public boolean P() {
        return net.minecraft.client.Q.P().ac.v.d;
    }

    protected void a(boolean bl2, int n2) {
    }

    @Override
    public void e(float f10) {
        this.bf = f10;
    }

    public void E() {
        B b10;
        block32: {
            block29: {
                block25: {
                    B b11;
                    block26: {
                        boolean bl2;
                        int[] arrn;
                        block30: {
                            block31: {
                                block27: {
                                    block28: {
                                        int n2;
                                        block24: {
                                            block23: {
                                                block21: {
                                                    block22: {
                                                        block20: {
                                                            double d10;
                                                            block19: {
                                                                block17: {
                                                                    block18: {
                                                                        arrn = net.minecraft.U.M.b();
                                                                        n2 = this.aO--;
                                                                        if (arrn != null) {
                                                                            if (n2 > 0) {
                                                                                // empty if block
                                                                            }
                                                                            n2 = this.bA;
                                                                        }
                                                                        if (arrn == null) break block17;
                                                                        if (n2 <= 0) break block18;
                                                                        n2 = this.a1() ? 1 : 0;
                                                                        if (arrn == null) break block17;
                                                                        if (n2 != 0) break block18;
                                                                        double d11 = this.a + (this.bo - this.a) / (double)this.bA;
                                                                        double d12 = this.aF + (this.bC - this.aF) / (double)this.bA;
                                                                        double d13 = this.ax + (this.bD - this.ax) / (double)this.bA;
                                                                        double d14 = net.minecraft.k.h.b(this.a5 - (double)this.e);
                                                                        this.e = (float)((double)this.e + d14 / (double)this.bA);
                                                                        this.at = (float)((double)this.at + (this.bi - (double)this.at) / (double)this.bA);
                                                                        --this.bA;
                                                                        this.g(d11, d12, d13);
                                                                        this.e(this.e, this.at);
                                                                        if (arrn != null) break block19;
                                                                    }
                                                                    n2 = this.r() ? 1 : 0;
                                                                }
                                                                if (arrn == null) break block20;
                                                                if (n2 == 0) {
                                                                    this.aq *= 0.98;
                                                                    this.G *= 0.98;
                                                                    this.d *= 0.98;
                                                                }
                                                            }
                                                            n2 = (d10 = Math.abs(this.aq) - 0.003) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                                                        }
                                                        if (arrn != null) {
                                                            double d15;
                                                            if (n2 < 0) {
                                                                this.aq = 0.0;
                                                            }
                                                            n2 = (d15 = Math.abs(this.G) - 0.003) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                                        }
                                                        if (arrn != null) {
                                                            double d16;
                                                            if (n2 < 0) {
                                                                this.G = 0.0;
                                                            }
                                                            n2 = (d16 = Math.abs(this.d) - 0.003) == 0.0 ? 0 : (d16 < 0.0 ? -1 : 1);
                                                        }
                                                        if (arrn != null) {
                                                            if (n2 < 0) {
                                                                this.d = 0.0;
                                                            }
                                                            this.aG.H.b("ai");
                                                            n2 = this.B() ? 1 : 0;
                                                        }
                                                        if (arrn == null) break block21;
                                                        if (n2 == 0) break block22;
                                                        this.aL = false;
                                                        this.bu = 0.0f;
                                                        this.bU = 0.0f;
                                                        this.bT = 0.0f;
                                                        if (arrn != null) break block23;
                                                    }
                                                    n2 = this.r() ? 1 : 0;
                                                }
                                                if (arrn == null) break block24;
                                                if (n2 != 0) {
                                                    this.aG.H.b("newAi");
                                                    this.g();
                                                    this.aG.H.c();
                                                }
                                            }
                                            this.aG.H.c();
                                            this.aG.H.b("jump");
                                            b11 = this;
                                            if (arrn == null) break block25;
                                            n2 = b11.aL ? 1 : 0;
                                        }
                                        if (n2 == 0) break block26;
                                        bl2 = this.aj();
                                        if (arrn == null) break block27;
                                        if (!bl2) break block28;
                                        this.N();
                                        if (arrn != null) break block29;
                                    }
                                    bl2 = this.av();
                                }
                                if (arrn == null) break block30;
                                if (!bl2) break block31;
                                this.k();
                                if (arrn != null) break block29;
                            }
                            b10 = this;
                            if (arrn == null) break block32;
                            bl2 = b10.A;
                        }
                        if (!bl2) break block29;
                        b10 = this;
                        if (arrn == null) break block32;
                        if (b10.aO != 0) break block29;
                        this.aH();
                        int n3 = cj.b.i.a(bz.class).i();
                        if (arrn != null) {
                            n3 = n3 != 0 ? 0 : 10;
                        }
                        this.aO = n3;
                        if (arrn != null) break block29;
                    }
                    b11 = this;
                }
                b11.aO = 0;
            }
            this.aG.H.c();
            this.aG.H.b("travel");
            this.bu *= 0.98f;
            this.bU *= 0.98f;
            this.bT *= 0.9f;
            this.ad();
            this.a(this.bu, this.bS, this.bU);
            this.aG.H.c();
            this.aG.H.b("push");
            this.af();
            b10 = this;
        }
        b10.aG.H.c();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void ay() {
        block9: {
            var1_1 = net.minecraft.U.M.b();
            v0 = ++this.a2;
            if (var1_1 != null) {
                if (v0 != 20) return;
                v0 = this.aG.C ? 1 : 0;
            }
            if (var1_1 == null) break block9;
            if (v0 != 0) ** GOTO lbl-1000
            v1 = this.aB();
            if (var1_1 == null) ** GOTO lbl24
            if (v1 != 0) ** GOTO lbl-1000
            v0 = this.bM;
            if (var1_1 == null) break block9;
            if (v0 <= 0) ** GOTO lbl-1000
            v0 = this.j() ? 1 : 0;
            if (var1_1 != null) {
                if (v0 != 0) {
                    v0 = this.aG.M().c("doMobLoot") ? 1 : 0;
                    if (var1_1 != null) {
                        ** if (v0 == 0) goto lbl-1000
                    } else {
                        ** GOTO lbl22
                    }
                } else {
                    ** GOTO lbl21
                }
            }
            break block9;
lbl21:
            // 2 sources

            ** GOTO lbl-1000
lbl22:
            // 2 sources

            break block9;
lbl-1000:
            // 2 sources

            {
                v1 = this.a(this.bP);
lbl24:
                // 3 sources

                for (var2_2 = (int)((v1749149) ? 1 : 0); var2_2 > 0; var2_2 -= var3_3) {
                    var3_3 = net.minecraft.J.E.a(var2_2);
                    this.aG.f(new E(this.aG, this.a, this.aF, this.ax, var3_3));
                    if (var1_1 != null) {
                        if (var1_1 != null) continue;
                    }
                    ** GOTO lbl32
                }
            }
lbl-1000:
            // 6 sources

            {
                this.a();
            }
lbl32:
            // 2 sources

            v0 = 0;
        }
        var2_2 = v0;
        do {
            if (var2_2 >= 20) return;
            var3_4 = this.g.nextGaussian() * 0.02;
            var5_5 = this.g.nextGaussian() * 0.02;
            var7_6 = this.g.nextGaussian() * 0.02;
            this.aG.a(net.minecraft.ar.aH.EXPLOSION_NORMAL, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, var3_4, var5_5, var7_6, new int[0]);
            ++var2_2;
        } while (var1_1 != null);
    }

    @Override
    public void aZ() {
        super.aZ();
        this.br = this.a0;
        this.a0 = 0.0f;
        this.an = 0.0f;
    }

    @Override
    public void aT() {
        this.bc = this.bn = 10;
        this.bJ = 0.0f;
    }

    public void g(float f10) {
        this.bv = f10;
    }

    protected void b(n n2) {
        block0: {
            int n3 = net.minecraft.ax.T.a(net.minecraft.u.b.h, this);
            if (n3 <= 0) break block0;
            net.minecraft.ax.F.a(this, this.aG, n2, n3);
        }
    }

    public void a(x x2, int n2) {
        block1: {
            N n3;
            block4: {
                boolean bl2;
                block5: {
                    int[] arrn;
                    block3: {
                        z z2;
                        block2: {
                            boolean bl3;
                            block0: {
                                arrn = net.minecraft.U.M.b();
                                bl3 = x2.P;
                                if (arrn == null) break block0;
                                if (bl3) break block1;
                                z2 = this.aG;
                                if (arrn == null) break block2;
                                bl3 = z2.C;
                            }
                            if (bl3) break block1;
                            z2 = this.aG;
                        }
                        n3 = ((A)z2).x();
                        bl2 = x2 instanceof t;
                        if (arrn == null) break block3;
                        if (bl2) break block4;
                        bl2 = x2 instanceof f;
                    }
                    if (arrn == null) break block5;
                    if (bl2) break block4;
                    bl2 = x2 instanceof E;
                }
                if (!bl2) break block1;
            }
            n3.a(x2, new q(x2.W(), this.W(), n2));
        }
    }

    public int u() {
        return this.a8;
    }

    public boolean aF() {
        return true;
    }

    /*
     * Exception decompiling
     */
    protected float a(float var1_1, float var2_2) {
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

    protected void a(net.minecraft.K.j j2) {
        block0: {
            this.by = true;
            if (this.aG.C) break block0;
            j2.g().a(this, this.ao(), j2.h());
        }
    }

    @Override
    public abstract Iterable<net.minecraft.w.d> aV();

    public g ag() {
        return net.minecraft.U.g.UNDEFINED;
    }

    public static boolean a(Collection<net.minecraft.K.j> collection) {
        boolean bl2;
        block3: {
            Iterator<net.minecraft.K.j> iterator = collection.iterator();
            int[] arrn = net.minecraft.U.M.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        net.minecraft.K.j j2 = iterator.next();
                        bl2 = j2.c();
                        if (arrn == null) break block3;
                        if (arrn == null) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (arrn != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean a(G var1_1, float var2_2) {
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

    @Override
    public void a(byte n2) {
        block15: {
            d d10;
            Object object;
            block21: {
                block22: {
                    int n3;
                    int[] arrn;
                    block19: {
                        int n4;
                        block20: {
                            int n5;
                            block11: {
                                int n6;
                                block12: {
                                    block18: {
                                        int n7;
                                        int n8;
                                        block16: {
                                            block17: {
                                                block13: {
                                                    block14: {
                                                        arrn = net.minecraft.U.M.b();
                                                        int n9 = n2;
                                                        if (arrn != null) {
                                                            n9 = n9 == 33 ? 1 : 0;
                                                        }
                                                        n6 = n9;
                                                        int n10 = n2;
                                                        if (arrn != null) {
                                                            n10 = n10 == 36 ? 1 : 0;
                                                        }
                                                        n4 = n10;
                                                        int n11 = n2;
                                                        if (arrn != null) {
                                                            n11 = n11 == 37 ? 1 : 0;
                                                        }
                                                        n5 = n11;
                                                        n3 = n2;
                                                        if (arrn == null) break block11;
                                                        if (n3 == 2) break block12;
                                                        n3 = n6;
                                                        if (arrn == null) break block11;
                                                        if (n3 != 0) break block12;
                                                        n3 = n4;
                                                        if (arrn == null) break block11;
                                                        if (n3 != 0) break block12;
                                                        n3 = n5;
                                                        if (arrn == null) break block11;
                                                        if (n3 != 0) break block12;
                                                        n8 = n2;
                                                        n7 = 3;
                                                        if (arrn == null) break block13;
                                                        if (n8 != n7) break block14;
                                                        object = this.aI();
                                                        if (arrn != null) {
                                                            if (object != null) {
                                                                this.a((d)object, this.x(), (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                                                            }
                                                            this.f(0.0f);
                                                            this.a(net.minecraft.ar.G.B);
                                                        }
                                                        if (arrn != null) break block15;
                                                    }
                                                    n8 = n2;
                                                    n7 = 30;
                                                }
                                                if (arrn == null) break block16;
                                                if (n8 != n7) break block17;
                                                this.a(net.minecraft.u.E.cl, 0.8f, 0.8f + this.aG.J.nextFloat() * 0.4f);
                                                if (arrn != null) break block15;
                                            }
                                            n8 = n2;
                                            n7 = 29;
                                        }
                                        if (n8 != n7) break block18;
                                        this.a(net.minecraft.u.E.fb, 1.0f, 0.8f + this.aG.J.nextFloat() * 0.4f);
                                        if (arrn != null) break block15;
                                    }
                                    super.a((byte)n2);
                                    if (arrn != null) break block15;
                                }
                                this.a3 = 1.5f;
                                this.Q = this.a7;
                                this.bc = this.bn = 10;
                                this.bJ = 0.0f;
                                n3 = n6;
                            }
                            if (arrn != null) {
                                if (n3 != 0) {
                                    this.a(net.minecraft.u.E.eV, this.x(), (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
                                }
                                n3 = n5;
                            }
                            if (arrn == null) break block19;
                            if (n3 == 0) break block20;
                            object = net.minecraft.ar.G.x;
                            if (arrn != null) break block21;
                        }
                        n3 = n4;
                    }
                    if (n3 == 0) break block22;
                    object = net.minecraft.ar.G.u;
                    if (arrn != null) break block21;
                }
                object = net.minecraft.ar.G.B;
            }
            if ((d10 = this.e((G)object)) != null) {
                this.a(d10, this.x(), (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
            }
            this.a(net.minecraft.ar.G.B, 0.0f);
        }
    }

    public a3 aN() {
        return (this.ap.b(bd) & 2) > 0 ? net.minecraft.ar.a3.OFF_HAND : net.minecraft.ar.a3.MAIN_HAND;
    }

    public boolean ak() {
        return this.ag() == net.minecraft.U.g.UNDEAD;
    }

    public Random f() {
        return this.g;
    }

    protected float x() {
        return 1.0f;
    }

    @Nullable
    public B m() {
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this.bj.e();
        if (arrn != null) {
            if (b10 != null) {
                return this.bj.e();
            }
            b10 = this;
        }
        B b11 = b10.bP;
        if (arrn != null) {
            if (b11 != null) {
                return this.bP;
            }
            b11 = this.aT;
        }
        if (arrn != null) {
            b11 = b11 != null ? this.aT : null;
        }
        return b11;
    }

    public void b(net.minecraft.K.j j2) {
        block3: {
            net.minecraft.K.j j3;
            net.minecraft.K.j j4;
            block4: {
                block5: {
                    Object object;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.U.M.b();
                        object = this;
                        if (arrn == null) break block2;
                        if (!((B)object).c(j2)) break block3;
                        object = this.bw.get(j2.g());
                    }
                    j3 = j4 = (net.minecraft.K.j)object;
                    if (arrn == null) break block4;
                    if (j3 != null) break block5;
                    this.bw.put(j2.g(), j2);
                    this.d(j2);
                    if (arrn != null) break block3;
                }
                j3 = j4;
            }
            j3.a(j2);
            this.a(j4, true);
        }
    }

    public void i(float f10) {
        block0: {
            float f11 = this.V();
            if (!(f11 > 0.0f)) break block0;
            this.f(f11 + f10);
        }
    }

    protected float o() {
        return 0.8f;
    }

    public B aM() {
        return this.bW;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean am() {
        k k2;
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.aq();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        bl2 = this.aX.G();
        if (arrn == null) return bl2;
        if (bl2) return false;
        k k3 = k2 = this.aX.w();
        net.minecraft.w.d d10 = this.aX;
        if (arrn != null) {
            if (k3.b(d10) != net.minecraft.w.bE.BLOCK) {
                return false;
            }
            k3 = k2;
            d10 = this.aX;
        }
        boolean bl3 = k3.g(d10) - this.aV;
        if (arrn == null) return bl3;
        if (bl3 < BADBOOL 5) return false;
        return true;
    }

    protected void U() {
        this.by = true;
    }

    public void d(net.minecraft.K.b b10) {
        block0: {
            net.minecraft.K.j j2 = this.b(b10);
            if (j2 == null) break block0;
            this.a(j2);
        }
    }

    public boolean c(x x2) {
        return this.aG.a(new net.minecraft.k.l(this.a, this.aF + (double)this.l(), this.ax), new net.minecraft.k.l(x2.a, x2.aF + (double)x2.l(), x2.ax), false, true, false) == null;
    }

    public float ax() {
        return this.bs;
    }

    public Map<net.minecraft.K.b, net.minecraft.K.j> e() {
        return this.bw;
    }

    @Override
    public abstract void a(X var1, net.minecraft.w.d var2);

    protected void aE() {
        int n2;
        block4: {
            B b10;
            block5: {
                block2: {
                    B b11;
                    block3: {
                        n2 = this.w();
                        int[] arrn = net.minecraft.U.M.b();
                        b11 = this;
                        if (arrn == null) break block2;
                        if (!b11.ba) break block3;
                        ++this.aS;
                        b10 = this;
                        if (arrn == null) break block4;
                        if (b10.aS < n2) break block5;
                        this.aS = 0;
                        this.ba = false;
                        if (arrn != null) break block5;
                    }
                    b11 = this;
                }
                b11.aS = 0;
            }
            b10 = this;
        }
        b10.aR = (float)this.aS / (float)n2;
    }

    public final void j(int n2) {
        block4: {
            block3: {
                boolean bl2;
                block2: {
                    int[] arrn = net.minecraft.U.M.b();
                    bl2 = cj.b.i.a(c7.class).i();
                    if (arrn == null) break block2;
                    if (!bl2) break block3;
                    bl2 = c7.p.l();
                }
                if (bl2) break block4;
            }
            this.ap.b(aQ, n2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(n n2, i i2) {
        i i3;
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = i2.b(ck.D);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        i i4 = i3 = this.aG.d(n2.k());
        if (arrn != null) {
            if (i4.b() != net.minecraft.u.g.cD) return false;
            i4 = i3;
        }
        if (i4.b(net.minecraft.W.bk.z) != i2.b(ck.E)) return false;
        return true;
    }

    public int an() {
        return this.aM;
    }

    protected void af() {
        block10: {
            int n2;
            int[] arrn;
            List<x> list;
            block11: {
                int n3;
                block12: {
                    int n4;
                    block8: {
                        int n5;
                        block9: {
                            list = this.aG.a((x)this, this.m(), net.minecraft.ar.e.b(this));
                            arrn = net.minecraft.U.M.b();
                            n5 = list.isEmpty();
                            if (arrn == null) break block9;
                            if (n5 != 0) break block10;
                            n5 = this.aG.M().b("maxEntityCramming");
                        }
                        n3 = n4 = n5;
                        if (arrn == null) break block11;
                        if (n3 <= 0) break block12;
                        n3 = list.size();
                        if (arrn == null) break block11;
                        if (n3 <= n4 - 1) break block12;
                        n3 = this.g.nextInt(4);
                        if (arrn == null) break block11;
                        if (n3 != 0) break block12;
                        n2 = 0;
                        for (int i2 = 0; i2 < list.size(); ++i2) {
                            n3 = list.get(i2).N() ? 1 : 0;
                            if (arrn != null) {
                                if (n3 != 0) continue;
                                ++n2;
                                if (arrn != null) continue;
                            }
                            break block8;
                        }
                        n3 = n2;
                    }
                    if (arrn == null) break block11;
                    if (n3 > n4 - 1) {
                        this.a(net.minecraft.ar.G.i, 6.0f);
                    }
                }
                n3 = n2 = 0;
            }
            while (n2 < list.size()) {
                x x2 = list.get(n2);
                this.d(x2);
                ++n2;
                if (arrn != null) continue;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public void a(float var1_1, float var2_2, float var3_3) {
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

    @Nullable
    protected d e(G g10) {
        return net.minecraft.u.E.bw;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean aY() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.aL();
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.s();
        }
        if (arrn == null) return bl2;
        if (bl2) return false;
        return true;
    }

    private boolean d(G g10) {
        int[] arrn;
        block10: {
            boolean bl2;
            block9: {
                arrn = net.minecraft.U.M.b();
                bl2 = g10.b();
                if (arrn == null) break block9;
                if (!bl2) break block10;
                bl2 = false;
            }
            return bl2;
        }
        net.minecraft.w.d d10 = null;
        Object object = net.minecraft.ar.a3.values();
        int n2 = ((a3[])object).length;
        int n3 = 0;
        while (n3 < n2) {
            a3 a32 = object[n3];
            net.minecraft.w.d d11 = this.c(a32);
            if (arrn == null) continue;
            if (d11.w() == net.minecraft.u.h.A) {
                d10 = d11.C();
                d11.b(1);
                break;
            }
            ++n3;
        }
        net.minecraft.w.d d12 = d10;
        if (arrn != null) {
            if (d12 != null) {
                B b10 = this;
                if (arrn != null) {
                    if (b10 instanceof net.minecraft.i.k) {
                        object = (net.minecraft.i.k)this;
                        ((j)object).b(net.minecraft.l.m.b(net.minecraft.u.h.A));
                        net.minecraft.a6.m.a((net.minecraft.i.k)object, d10);
                    }
                    this.f(1.0f);
                    this.au();
                    this.b(new net.minecraft.K.j(net.minecraft.u.c.t, 900, 1));
                    this.b(new net.minecraft.K.j(net.minecraft.u.c.a, 100, 1));
                    b10 = this;
                }
                b10.aG.a((x)this, (byte)35);
            }
            d12 = d10;
        }
        return d12 != null;
    }

    protected void J() {
        block28: {
            int n2;
            int n3;
            int n4;
            block33: {
                int[] arrn;
                block32: {
                    int n5;
                    block31: {
                        int n6;
                        block29: {
                            block30: {
                                block27: {
                                    int n7;
                                    block21: {
                                        Iterator<net.minecraft.K.b> iterator = this.bw.keySet().iterator();
                                        arrn = net.minecraft.U.M.b();
                                        try {
                                            while (iterator.hasNext()) {
                                                block26: {
                                                    int n8;
                                                    net.minecraft.K.j j2;
                                                    block23: {
                                                        block24: {
                                                            B b10;
                                                            block25: {
                                                                net.minecraft.K.b b11 = iterator.next();
                                                                j2 = this.bw.get(b11);
                                                                n7 = j2.a(this) ? 1 : 0;
                                                                if (arrn == null) break block21;
                                                                if (arrn == null) break block23;
                                                                if (n7 != 0) break block24;
                                                                b10 = this;
                                                                if (arrn == null) break block25;
                                                                if (b10.aG.C) break block26;
                                                                iterator.remove();
                                                                b10 = this;
                                                            }
                                                            b10.a(j2);
                                                            if (arrn != null) break block26;
                                                        }
                                                        n8 = j2.e() % 600;
                                                    }
                                                    if (n8 == 0) {
                                                        this.a(j2, false);
                                                    }
                                                }
                                                if (arrn != null) continue;
                                                break;
                                            }
                                        }
                                        catch (ConcurrentModificationException concurrentModificationException) {
                                            // empty catch block
                                        }
                                        n7 = this.by;
                                    }
                                    if (arrn != null) {
                                        if (n7 != 0) {
                                            B b12 = this;
                                            if (arrn != null) {
                                                if (!b12.aG.C) {
                                                    this.M();
                                                }
                                                b12 = this;
                                            }
                                            b12.by = false;
                                        }
                                        n7 = this.ap.b(bq);
                                    }
                                    n4 = n7;
                                    n3 = this.ap.b(aZ).booleanValue();
                                    n6 = n4;
                                    if (arrn == null) break block27;
                                    if (n6 <= 0) break block28;
                                    n6 = this.a3() ? 1 : 0;
                                }
                                if (arrn == null) break block29;
                                if (n6 == 0) break block30;
                                int n9 = this.g.nextInt(15);
                                if (arrn != null) {
                                    n9 = n5 = n9 == 0 ? 1 : 0;
                                }
                                if (arrn != null) break block31;
                            }
                            n6 = this.g.nextBoolean() ? 1 : 0;
                        }
                        n5 = n6;
                    }
                    n2 = n3;
                    if (arrn != null) {
                        if (n2 != 0) {
                            int n10 = this.g.nextInt(5);
                            if (arrn != null) {
                                n10 = n10 == 0 ? 1 : 0;
                            }
                            n5 &= n10;
                        }
                        n2 = n5;
                    }
                    if (arrn == null) break block32;
                    if (n2 == 0) break block28;
                    n2 = n4;
                }
                if (arrn == null) break block33;
                if (n2 <= 0) break block28;
                n2 = n4 >> 16 & 0xFF;
            }
            double d10 = (double)n2 / 255.0;
            double d11 = (double)(n4 >> 8 & 0xFF) / 255.0;
            double d12 = (double)(n4 >> 0 & 0xFF) / 255.0;
            this.aG.a(n3 != 0 ? net.minecraft.ar.aH.SPELL_MOB_AMBIENT : net.minecraft.ar.aH.SPELL_MOB, this.a + (this.g.nextDouble() - 0.5) * (double)this.ad, this.aF + this.g.nextDouble() * (double)this.aD, this.ax + (this.g.nextDouble() - 0.5) * (double)this.ad, d10, d11, d12, new int[0]);
        }
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block3: {
            block9: {
                B b10;
                boolean bl2;
                block8: {
                    int[] arrn;
                    block5: {
                        block6: {
                            block7: {
                                block4: {
                                    block2: {
                                        int[] arrn2 = net.minecraft.U.M.b();
                                        super.a(r2);
                                        arrn = arrn2;
                                        bl2 = bd.equals(r2);
                                        if (arrn == null) break block2;
                                        if (!bl2) break block3;
                                        bl2 = this.aG.C;
                                    }
                                    if (arrn == null) break block4;
                                    if (!bl2) break block3;
                                    bl2 = this.aq();
                                }
                                if (arrn == null) break block5;
                                if (!bl2) break block6;
                                bl2 = this.aX.G();
                                if (arrn == null) break block5;
                                if (!bl2) break block6;
                                this.aX = this.c(this.aN());
                                B b11 = this;
                                if (arrn == null) break block7;
                                if (b11.aX.G()) break block3;
                                b11 = this;
                            }
                            b11.aV = this.aX.o();
                            if (arrn != null) break block3;
                        }
                        bl2 = this.aq();
                    }
                    if (arrn == null) break block8;
                    if (bl2) break block3;
                    b10 = this;
                    if (arrn == null) break block9;
                    bl2 = b10.aX.G();
                }
                if (bl2) break block3;
                this.aX = net.minecraft.w.d.m;
                b10 = this;
            }
            b10.aV = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected float p() {
        float f10;
        int[] arrn = net.minecraft.U.M.b();
        B b10 = this;
        if (arrn != null) {
            if (b10.Q()) {
                f10 = (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.5f;
                return f10;
            }
            b10 = this;
        }
        f10 = (b10.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f;
        return f10;
    }

    public static int ah() {
        int n2 = net.minecraft.U.B.aL();
        if (n2 == 0) {
            return 70;
        }
        return 0;
    }

    public static int aL() {
        return a4;
    }

    public boolean Q() {
        return false;
    }

    public abstract b al();

    protected void d(x x2) {
        x2.n(this);
    }

    @Override
    public void a(r r2) {
        block31: {
            int n2;
            block29: {
                block30: {
                    int n3;
                    Object object;
                    int[] arrn;
                    block28: {
                        block24: {
                            block25: {
                                block26: {
                                    z z2;
                                    block27: {
                                        int[] arrn2 = net.minecraft.U.M.b();
                                        this.d(r2.d("AbsorptionAmount"));
                                        arrn = arrn2;
                                        n2 = r2.a("Attributes", 9);
                                        if (arrn == null) break block25;
                                        if (n2 == 0) break block26;
                                        z2 = this.aG;
                                        if (arrn == null) break block27;
                                        if (z2 == null) break block26;
                                        z2 = this.aG;
                                    }
                                    n2 = z2.C;
                                    if (arrn == null) break block25;
                                    if (n2 == 0) {
                                        net.minecraft.U.M.a(this.ao(), r2.c("Attributes", 10));
                                    }
                                }
                                n2 = r2.a("ActiveEffects", 9);
                            }
                            if (arrn != null) {
                                if (n2 != 0) {
                                    object = r2.c("ActiveEffects", 10);
                                    n3 = 0;
                                    while (n3 < ((u)object).b()) {
                                        r r3 = ((u)object).d(n3);
                                        net.minecraft.K.j j2 = net.minecraft.K.j.a(r3);
                                        if (arrn != null) {
                                            if (arrn != null) {
                                                if (j2 != null) {
                                                    this.bw.put(j2.g(), j2);
                                                }
                                                ++n3;
                                            }
                                            if (arrn != null) continue;
                                        }
                                        break block24;
                                    }
                                }
                                n2 = r2.a("Health", 99);
                            }
                            if (arrn == null) break block28;
                            if (n2 != 0) {
                                this.f(r2.d("Health"));
                            }
                            this.bc = r2.q("HurtTime");
                            this.a2 = r2.q("DeathTime");
                            this.bp = r2.m("HurtByTimestamp");
                        }
                        n2 = r2.a("Team", 8) ? 1 : 0;
                    }
                    if (arrn == null) break block29;
                    if (n2 == 0) break block30;
                    object = r2.j("Team");
                    n2 = n3 = (int)(this.aG.c().a(this.a2(), (String)object) ? 1 : 0);
                    if (arrn == null) break block29;
                    if (n2 == 0) {
                        bH.warn("Unable to add mob to team \"" + (String)object + "\" (that team probably doesn't exist)");
                    }
                }
                n2 = r2.f("FallFlying");
            }
            if (n2 == 0) break block31;
            this.a(7, true);
        }
    }

    protected void b(float f10) {
    }

    public void au() {
        block4: {
            B b10;
            int[] arrn;
            block3: {
                arrn = net.minecraft.U.M.b();
                b10 = this;
                if (arrn == null) break block3;
                if (b10.aG.C) break block4;
                b10 = this;
            }
            Iterator<net.minecraft.K.j> iterator = b10.bw.values().iterator();
            while (iterator.hasNext()) {
                this.a(iterator.next());
                iterator.remove();
                if (arrn != null) continue;
            }
        }
    }

    private void ad() {
        block14: {
            B b10;
            boolean bl2;
            block13: {
                int[] arrn;
                block12: {
                    boolean bl3;
                    block6: {
                        block7: {
                            block10: {
                                boolean bl4;
                                block9: {
                                    int n2;
                                    net.minecraft.w.d d10;
                                    block11: {
                                        net.minecraft.w.d d11;
                                        block8: {
                                            bl2 = this.f(7);
                                            arrn = net.minecraft.U.M.b();
                                            bl3 = bl2;
                                            if (arrn == null) break block6;
                                            if (!bl3) break block7;
                                            bl3 = this.A;
                                            if (arrn == null) break block6;
                                            if (bl3) break block7;
                                            bl3 = this.N();
                                            if (arrn == null) break block6;
                                            if (bl3) break block7;
                                            d11 = d10 = this.b(net.minecraft.B.X.CHEST);
                                            if (arrn == null) break block8;
                                            if (d11.w() != net.minecraft.u.h.cf) break block9;
                                            d11 = d10;
                                        }
                                        bl4 = R.a(d11);
                                        if (arrn == null) break block10;
                                        if (!bl4) break block9;
                                        bl2 = true;
                                        n2 = this.aG.C;
                                        if (arrn == null) break block11;
                                        if (n2 != 0) break block10;
                                        n2 = (this.aM + 1) % 20;
                                    }
                                    if (n2 != 0) break block10;
                                    d10.a(1, this);
                                    if (arrn != null) break block10;
                                }
                                bl4 = bl2 = false;
                            }
                            if (arrn != null) break block12;
                        }
                        bl3 = false;
                    }
                    bl2 = bl3;
                }
                b10 = this;
                if (arrn == null) break block13;
                if (b10.aG.C) break block14;
                b10 = this;
            }
            b10.a(7, bl2);
        }
    }
}

