/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bv;
import net.minecraft.W.bw;
import net.minecraft.W.dA;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aA;
import net.minecraft.av.b;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class r
extends x {
    private /* synthetic */ boolean aM;
    private /* synthetic */ int aK;
    private /* synthetic */ i aR;
    private /* synthetic */ boolean aO;
    public /* synthetic */ int aP;
    protected static final /* synthetic */ net.minecraft.q.r<n> aS;
    public /* synthetic */ net.minecraft.P.r aQ;
    public /* synthetic */ boolean aL;
    private /* synthetic */ float aN;

    @Override
    public boolean M() {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.P;
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        aS = net.minecraft.q.m.a(r.class, net.minecraft.q.h.j);
    }

    @Override
    public boolean aa() {
        return true;
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    protected void a(net.minecraft.P.r r2) {
        block19: {
            block18: {
                K k2;
                block17: {
                    K k3;
                    int n2;
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    int n3;
                                    block13: {
                                        boolean bl2;
                                        block10: {
                                            block11: {
                                                n3 = r2.r("Data") & 0xFF;
                                                n2 = net.minecraft.J.j.d();
                                                bl2 = r2.a("Block", 8);
                                                if (n2 == 0) break block10;
                                                if (!bl2) break block11;
                                                this.aR = net.minecraft.W.K.d(r2.j("Block")).c(n3);
                                                if (n2 != 0) break block12;
                                            }
                                            bl2 = r2.a("TileID", 99);
                                        }
                                        if (!bl2) break block13;
                                        this.aR = net.minecraft.W.K.b(r2.m("TileID")).c(n3);
                                        if (n2 != 0) break block12;
                                    }
                                    this.aR = net.minecraft.W.K.b(r2.r("Tile") & 0xFF).c(n3);
                                }
                                this.aP = r2.m("Time");
                                k3 = this.aR.b();
                                if (n2 == 0) break block14;
                                if (!r2.a("HurtEntities", 99)) break block15;
                                this.aM = r2.f("HurtEntities");
                                this.aN = r2.d("FallHurtAmount");
                                this.aK = r2.m("FallHurtMax");
                            }
                            if (n2 != 0) break block16;
                        }
                        if (k3 == net.minecraft.u.g.cb) {
                            this.aM = true;
                        }
                    }
                    boolean bl3 = r2.a("DropItem", 99);
                    if (n2 != 0) {
                        if (bl3) {
                            this.aL = r2.f("DropItem");
                        }
                        bl3 = r2.a("TileEntityData", 10);
                    }
                    if (bl3) {
                        this.aQ = r2.h("TileEntityData");
                    }
                    k2 = k3;
                    if (n2 == 0) break block17;
                    if (k2 == null) break block18;
                    k2 = k3;
                }
                if (k2.d().o() != c.A) break block19;
            }
            this.aR = net.minecraft.u.g.aO.d();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void ae() {
        block36: {
            block54: {
                block37: {
                    block68: {
                        block55: {
                            block56: {
                                block57: {
                                    block58: {
                                        block64: {
                                            block33: {
                                                block63: {
                                                    block62: {
                                                        block61: {
                                                            block59: {
                                                                block60: {
                                                                    block53: {
                                                                        block51: {
                                                                            block52: {
                                                                                block41: {
                                                                                    block42: {
                                                                                        block49: {
                                                                                            block50: {
                                                                                                block47: {
                                                                                                    block48: {
                                                                                                        block44: {
                                                                                                            block46: {
                                                                                                                block45: {
                                                                                                                    block43: {
                                                                                                                        block38: {
                                                                                                                            block40: {
                                                                                                                                block39: {
                                                                                                                                    block35: {
                                                                                                                                        block34: {
                                                                                                                                            var2_1 = this.aR.b();
                                                                                                                                            var1_2 = net.minecraft.J.j.c();
                                                                                                                                            v0 = this;
                                                                                                                                            if (var1_2 == 0) {
                                                                                                                                                if (v0.aR.o() == c.A) {
                                                                                                                                                    this.a();
                                                                                                                                                    if (var1_2 == 0) return;
                                                                                                                                                }
                                                                                                                                                this.N = this.a;
                                                                                                                                                this.L = this.aF;
                                                                                                                                                this.k = this.ax;
                                                                                                                                                v0 = this;
                                                                                                                                            }
                                                                                                                                            v1 = v0.aP;
                                                                                                                                            v2 = v1;
                                                                                                                                            v0.aP = v1 + 1;
                                                                                                                                            if (var1_2 != 0) break block34;
                                                                                                                                            if (v2 != 0) ** GOTO lbl-1000
                                                                                                                                            var3_3 = new n(this);
                                                                                                                                            v3 = this.aG;
                                                                                                                                            if (var1_2 != 0) ** GOTO lbl25
                                                                                                                                            if (v3.d(var3_3).b() != var2_1) ** GOTO lbl-1000
                                                                                                                                            this.aG.v(var3_3);
                                                                                                                                            if (var1_2 != 0) lbl-1000:
                                                                                                                                            // 2 sources

                                                                                                                                            {
                                                                                                                                                v3 = this.aG;
lbl25:
                                                                                                                                                // 2 sources

                                                                                                                                                v2 = v3.C ? 1 : 0;
                                                                                                                                                if (var1_2 == 0) {
                                                                                                                                                    if (v2 == 0) {
                                                                                                                                                        this.a();
                                                                                                                                                        return;
                                                                                                                                                    } else {
                                                                                                                                                        ** GOTO lbl-1000
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } else lbl-1000:
                                                                                                                                            // 4 sources

                                                                                                                                            {
                                                                                                                                                v2 = this.aI() ? 1 : 0;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (var1_2 != 0) break block35;
                                                                                                                                        if (v2 == 0) {
                                                                                                                                            this.G -= 0.03999999910593033;
                                                                                                                                        }
                                                                                                                                        this.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                                                                                                                                        v4 = this;
                                                                                                                                        if (var1_2 != 0) break block36;
                                                                                                                                        v2 = v4.aG.C ? 1 : 0;
                                                                                                                                    }
                                                                                                                                    if (v2 != 0) break block37;
                                                                                                                                    var3_3 = new n(this);
                                                                                                                                    var4_4 = this.aR.b() == net.minecraft.u.g.aw ? 1 : 0;
                                                                                                                                    var5_5 = var4_4 != 0 && this.aG.d(var3_3).o() == c.L ? 1 : 0;
                                                                                                                                    var6_6 = this.aq * this.aq + this.G * this.G + this.d * this.d;
                                                                                                                                    v5 = var4_4;
                                                                                                                                    if (var1_2 != 0) break block38;
                                                                                                                                    if (v5 == 0) break block39;
                                                                                                                                    cfr_temp_0 = var6_6 - 1.0;
                                                                                                                                    v5 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                                                                                    if (var1_2 != 0) break block38;
                                                                                                                                    if (v5 <= 0) break block39;
                                                                                                                                    v6 = this;
                                                                                                                                    if (var1_2 != 0) break block40;
                                                                                                                                    var8_7 = v6.aG.a(new l(this.N, this.L, this.k), new l(this.a, this.aF, this.ax), true);
                                                                                                                                    if (var8_7 == null) break block39;
                                                                                                                                    v6 = this;
                                                                                                                                    if (var1_2 != 0) break block40;
                                                                                                                                    if (v6.aG.d(var8_7.a()).o() == c.L) {
                                                                                                                                        var3_3 = var8_7.a();
                                                                                                                                        var5_5 = 1;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v6 = this;
                                                                                                                            }
                                                                                                                            if (var1_2 != 0) break block41;
                                                                                                                            v5 = v6.A;
                                                                                                                        }
                                                                                                                        if (v5 != 0) break block42;
                                                                                                                        v7 = var5_5;
                                                                                                                        if (var1_2 != 0) break block43;
                                                                                                                        if (v7 != 0) break block42;
                                                                                                                        v7 = this.aP;
                                                                                                                    }
                                                                                                                    v8 = 100;
                                                                                                                    if (var1_2 != 0) break block44;
                                                                                                                    if (v7 <= v8) break block45;
                                                                                                                    v7 = this.aG.C ? 1 : 0;
                                                                                                                    if (var1_2 != 0) break block46;
                                                                                                                    if (v7 != 0) break block45;
                                                                                                                    v9 = var3_3.b();
                                                                                                                    if (var1_2 != 0) break block47;
                                                                                                                    if (v9 < 1) break block48;
                                                                                                                    v9 = var3_3.b();
                                                                                                                    if (var1_2 != 0) break block47;
                                                                                                                    if (v9 > 256) break block48;
                                                                                                                }
                                                                                                                v4 = this;
                                                                                                                if (var1_2 != 0) break block36;
                                                                                                                v7 = v4.aP;
                                                                                                            }
                                                                                                            v8 = 600;
                                                                                                        }
                                                                                                        if (v7 <= v8) break block37;
                                                                                                    }
                                                                                                    v10 = this;
                                                                                                    if (var1_2 != 0) break block49;
                                                                                                    v9 = v10.aL;
                                                                                                }
                                                                                                if (v9 == 0) break block50;
                                                                                                v10 = this;
                                                                                                if (var1_2 != 0) break block49;
                                                                                                if (v10.aG.M().c("doEntityDrops")) {
                                                                                                    this.a(new d(var2_1, 1, var2_1.g(this.aR)), 0.0f);
                                                                                                }
                                                                                            }
                                                                                            v10 = this;
                                                                                        }
                                                                                        v10.a();
                                                                                        if (var1_2 == 0) break block37;
                                                                                    }
                                                                                    v6 = this;
                                                                                }
                                                                                var8_7 = v6.aG.d(var3_3);
                                                                                if (var1_2 != 0) break block51;
                                                                                if (var5_5 != 0) break block52;
                                                                                v11 = this.aG.d(new n(this.a, this.aF - 0.009999999776482582, this.ax));
                                                                                if (var1_2 == 0) {
                                                                                    if (bw.a(v11)) {
                                                                                        this.A = false;
                                                                                        return;
                                                                                    } else {
                                                                                        ** GOTO lbl122
                                                                                    }
                                                                                }
                                                                                break block53;
                                                                            }
                                                                            this.aq *= 0.699999988079071;
                                                                            this.d *= 0.699999988079071;
                                                                            this.G *= -0.5;
                                                                        }
                                                                        if (var1_2 != 0) break block54;
                                                                        v11 = var8_7;
                                                                    }
                                                                    if (v11.b() == net.minecraft.u.g.cS) break block37;
                                                                    this.a();
                                                                    v12 = this.aO;
                                                                    if (var1_2 != 0) break block55;
                                                                    if (v12) break block56;
                                                                    v13 = this.aG.a(var2_1, var3_3, true, net.minecraft.ar.aA.UP, null);
                                                                    if (var1_2 != 0) break block57;
                                                                    if (v13 == 0) break block58;
                                                                    v13 = var5_5;
                                                                    if (var1_2 != 0) break block59;
                                                                    if (v13 != 0) break block60;
                                                                    v13 = bw.a(this.aG.d(var3_3.k())) ? 1 : 0;
                                                                    if (var1_2 != 0) break block57;
                                                                    if (v13 != 0) break block58;
                                                                }
                                                                v13 = this.aG.a(var3_3, this.aR, 3) ? 1 : 0;
                                                            }
                                                            if (var1_2 != 0) break block57;
                                                            if (v13 == 0) break block58;
                                                            v14 = var2_1;
                                                            if (var1_2 != 0) break block61;
                                                            if (!(v14 instanceof bw)) break block62;
                                                            v14 = var2_1;
                                                        }
                                                        ((bw)v14).a(this.aG, var3_3, this.aR, (i)var8_7);
                                                    }
                                                    v4 = this;
                                                    if (var1_2 != 0) break block36;
                                                    if (v4.aQ == null || !(var2_1 instanceof dA)) break block37;
                                                    v15 = var9_8 = this.aG.b(var3_3);
                                                    if (var1_2 != 0) break block63;
                                                    if (v15 == null) break block64;
                                                    v15 = var9_8;
                                                }
                                                var10_9 = v15.a(new net.minecraft.P.r());
                                                for (String var12_11 : this.aQ.d()) {
                                                    block66: {
                                                        block67: {
                                                            block65: {
                                                                var13_12 = this.aQ.g(var12_11);
                                                                if (var1_2 != 0) break block33;
                                                                v16 = "x".equals(var12_11);
                                                                if (var1_2 != 0) break block65;
                                                                if (v16) break block66;
                                                                v16 = "y".equals(var12_11);
                                                            }
                                                            if (var1_2 != 0) break block67;
                                                            if (v16) break block66;
                                                            v16 = "z".equals(var12_11);
                                                        }
                                                        if (!v16) {
                                                            var10_9.a(var12_11, var13_12.e());
                                                        }
                                                    }
                                                    if (var1_2 == 0) continue;
                                                }
                                                var9_8.c(var10_9);
                                            }
                                            var9_8.b();
                                        }
                                        if (var1_2 == 0) break block37;
                                    }
                                    v4 = this;
                                    if (var1_2 != 0) break block36;
                                    v13 = v4.aL ? 1 : 0;
                                }
                                if (v13 == 0) break block37;
                                v4 = this;
                                if (var1_2 != 0) break block36;
                                if (!v4.aG.M().c("doEntityDrops")) break block37;
                                this.a(new d(var2_1, 1, var2_1.g(this.aR)), 0.0f);
                                if (var1_2 == 0) break block37;
                            }
                            v17 = var2_1;
                            if (var1_2 != 0) break block68;
                            v12 = v17 instanceof bw;
                        }
                        if (!v12) break block37;
                        v17 = var2_1;
                    }
                    ((bw)v17).a(this.aG, var3_3);
                }
                this.aq *= 0.9800000190734863;
                this.G *= 0.9800000190734863;
            }
            v4 = this;
        }
        v4.d *= 0.9800000190734863;
    }

    public void a(boolean bl2) {
        this.aM = bl2;
    }

    public r(z z2) {
        super(z2);
        this.aL = true;
        this.aK = 40;
        this.aN = 2.0f;
    }

    @Override
    public boolean aN() {
        return false;
    }

    public z a() {
        return this.aG;
    }

    public void b(n n2) {
        this.ap.b(aS, n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void f(net.minecraft.P.r var1_1) {
        var2_2 = net.minecraft.J.j.c();
        v0 = this.aR;
        if (var2_2 != 0) ** GOTO lbl6
        if (v0 != null) {
            v0 = this.aR;
lbl6:
            // 2 sources

            v1 = v0.b();
        } else {
            v1 = net.minecraft.u.g.bf;
        }
        var3_3 = v1;
        v2 = var4_4 = net.minecraft.W.K.h.b(var3_3);
        if (var2_2 != 0) ** GOTO lbl16
        if (v2 == null) {
            v3 = "";
        } else {
            v2 = var4_4;
lbl16:
            // 2 sources

            v3 = v2.toString();
        }
        var1_1.a("Block", v3);
        var1_1.a("Data", (byte)var3_3.d(this.aR));
        var1_1.b("Time", this.aP);
        var1_1.a("DropItem", this.aL);
        var1_1.a("HurtEntities", this.aM);
        var1_1.a("FallHurtAmount", this.aN);
        var1_1.b("FallHurtMax", this.aK);
        v4 = this.aQ;
        if (var2_2 == 0) {
            if (v4 == null) return;
            v4 = var1_1;
        }
        v4.a("TileEntityData", this.aQ);
    }

    @Override
    protected boolean h() {
        return false;
    }

    @Override
    public void d(float f10, float f11) {
        block2: {
            int n2;
            block7: {
                int n3;
                block6: {
                    int n4;
                    block5: {
                        block4: {
                            int n5;
                            int n6;
                            K k2;
                            block3: {
                                k2 = this.aR.b();
                                n3 = net.minecraft.J.j.d();
                                n6 = this.aM;
                                if (n3 == 0) break block3;
                                if (n6 == 0) break block2;
                                n6 = h.f(f10 - 1.0f);
                            }
                            if ((n5 = n6) <= 0) break block2;
                            ArrayList arrayList = Lists.newArrayList(this.aG.b((x)this, this.m()));
                            int n7 = k2 == net.minecraft.u.g.cb ? 1 : 0;
                            G g10 = n7 != 0 ? net.minecraft.ar.G.r : net.minecraft.ar.G.h;
                            for (x x2 : arrayList) {
                                x2.a(g10, (float)Math.min(h.d((float)n5 * this.aN), this.aK));
                                if (n3 != 0) {
                                    if (n3 != 0) continue;
                                }
                                break block2;
                            }
                            n4 = n7;
                            if (n3 == 0) break block4;
                            if (n4 == 0) break block2;
                            double d10 = (double)this.g.nextFloat() - ((double)0.05f + (double)n5 * 0.05);
                            n4 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                        }
                        if (n3 == 0) break block5;
                        if (n4 >= 0) break block2;
                        n4 = this.aR.b(bv.E);
                    }
                    n2 = n4;
                    ++n2;
                    if (n3 == 0) break block6;
                    if (n2 <= 2) break block7;
                    this.aO = true;
                }
                if (n3 != 0) break block2;
            }
            this.aR = this.aR.a(bv.E, n2);
        }
    }

    @Override
    public void a(net.minecraft.c.l l2) {
        block3: {
            i i2;
            block2: {
                int n2 = net.minecraft.J.j.c();
                super.a(l2);
                int n3 = n2;
                i2 = this.aR;
                if (n3 != 0) break block2;
                if (i2 == null) break block3;
                i2 = this.aR;
            }
            K k2 = i2.b();
            l2.a("Immitating block ID", net.minecraft.W.K.b(k2));
            l2.a("Immitating block data", k2.d(this.aR));
        }
    }

    public r(z z2, double d10, double d11, double d12, i i2) {
        super(z2);
        this.aL = true;
        this.aK = 40;
        this.aN = 2.0f;
        this.aR = i2;
        this.az = true;
        this.c(0.98f, 0.98f);
        this.g(d10, d11 + (double)((1.0f - this.aD) / 2.0f), d12);
        this.aq = 0.0;
        this.G = 0.0;
        this.d = 0.0;
        this.N = d10;
        this.L = d11;
        this.k = d12;
        this.b(new n(this));
    }

    @Override
    protected void ab() {
        this.ap.c(aS, net.minecraft.k.n.o);
    }

    @Nullable
    public i c() {
        return this.aR;
    }

    public n b() {
        return this.ap.b(aS);
    }

    public static void b(b b10) {
    }
}

