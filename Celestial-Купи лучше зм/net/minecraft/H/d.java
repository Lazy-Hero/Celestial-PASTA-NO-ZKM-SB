/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.h;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.J.E;
import net.minecraft.J.p;
import net.minecraft.P.r;
import net.minecraft.T.k;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.G;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.aj.j;
import net.minecraft.ar.H;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.ar.v;
import net.minecraft.e.f;
import net.minecraft.e.g;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.v.a;
import net.minecraft.v.b;
import net.minecraft.v.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d
extends C
implements k,
net.minecraft.U.f {
    public /* synthetic */ G cA;
    public /* synthetic */ G cu;
    private final /* synthetic */ a cI;
    private /* synthetic */ int cB;
    private final /* synthetic */ f[] cx;
    public /* synthetic */ G[] ct;
    public /* synthetic */ G cL;
    private static final /* synthetic */ Logger cq;
    public /* synthetic */ p cH;
    private /* synthetic */ int cD;
    public /* synthetic */ float cC;
    public /* synthetic */ G cr;
    public /* synthetic */ int cJ;
    public /* synthetic */ G cO;
    public /* synthetic */ G cs;
    public /* synthetic */ int cG;
    public /* synthetic */ float cv;
    public /* synthetic */ G cy;
    private final /* synthetic */ int[] cE;
    public /* synthetic */ G cz;
    public static final /* synthetic */ net.minecraft.q.r<Integer> cw;
    public /* synthetic */ double[][] cF;
    public /* synthetic */ boolean cN;
    private final /* synthetic */ g cM;
    private final /* synthetic */ net.minecraft.am.g cK;

    @Override
    public boolean a(G g10, net.minecraft.ar.G g11, float f10) {
        float f11;
        block14: {
            block15: {
                float f12;
                int n2;
                block16: {
                    block17: {
                        block13: {
                            block12: {
                                float f13;
                                n2 = net.minecraft.U.D.g();
                                float f14 = this.cI.a().a(g10, g11, f10);
                                if (n2 != 0) {
                                    f10 = f14;
                                    if (g10 != this.cO) {
                                        f10 = f10 / 4.0f + Math.min(f10, 1.0f);
                                    }
                                    f14 = f10;
                                }
                                f11 = (f13 = f14 - 0.01f) == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                if (n2 != 0) {
                                    if (f11 < 0) {
                                        return false;
                                    }
                                    f11 = (float)(g11.h() instanceof net.minecraft.i.j);
                                }
                                if (n2 == 0) break block12;
                                if (f11 != false) break block13;
                                f11 = (float)g11.j();
                            }
                            if (n2 == 0) break block14;
                            if (f11 == false) break block15;
                        }
                        f12 = this.V();
                        this.b(g11, f10);
                        float f15 = this.V() - 0.0f;
                        f11 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                        if (n2 == 0) break block16;
                        if (f11 > 0) break block17;
                        f11 = (float)this.cI.a().i();
                        if (n2 == 0) break block16;
                        if (f11 == false) {
                            this.f(1.0f);
                            this.cI.b(b.m);
                        }
                    }
                    f11 = (float)this.cI.a().i();
                }
                if (n2 == 0) break block14;
                if (f11 == false) break block15;
                this.cB = (int)((float)this.cB + (f12 - this.V()));
                float f16 = (float)this.cB - 0.25f * this.H();
                f11 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                if (n2 == 0) break block14;
                if (f11 > 0) {
                    this.cB = 0;
                    this.cI.b(b.k);
                }
            }
            f11 = 1.0f;
        }
        return (boolean)f11;
    }

    @Override
    public void y() {
        block3: {
            net.minecraft.am.g g10;
            block2: {
                int n2 = net.minecraft.U.D.i();
                this.a();
                int n3 = n2;
                g10 = this.cK;
                if (n3 != 0) break block2;
                if (g10 == null) break block3;
                this.cK.a(this);
                g10 = this.cK;
            }
            g10.b(this);
        }
    }

    @Override
    public boolean M() {
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public net.minecraft.e.h a(int var1_1, int var2_2, @Nullable f var3_3) {
        block37: {
            block27: {
                block30: {
                    block29: {
                        block28: {
                            block26: {
                                var4_6 = net.minecraft.U.D.i();
                                for (var5_4 = 0; var5_4 < 24; ++var5_4) {
                                    var6_7 = this.cx[var5_4];
                                    var6_7.j = false;
                                    var6_7.h = 0.0f;
                                    var6_7.d = 0.0f;
                                    var6_7.c = 0.0f;
                                    var6_7.n = null;
                                    v0 = var6_7;
                                    if (var4_6 == 0) {
                                        v0.l = -1;
                                        if (var4_6 == 0) continue;
                                    }
                                    break block26;
                                }
                                v0 = this.cx[var1_1];
                            }
                            var5_5 = v0;
                            var6_7 = this.cx[var2_2];
                            var5_5.d = 0.0f;
                            var5_5.h = var5_5.c = var5_5.b(var6_7);
                            this.cM.b();
                            this.cM.a(var5_5);
                            var7_8 = var5_5;
                            var8_9 = 0;
                            v1 = this.cK;
                            if (var4_6 != 0) break block28;
                            if (v1 == null) break block29;
                            v1 = this.cK;
                        }
                        v2 = v1.h();
                        if (var4_6 != 0) ** GOTO lbl38
                        if (v2 != 0) break block30;
                    }
                    var8_9 = 12;
                }
                block1: while (true) {
                    v2 = this.cM.c() ? 1 : 0;
                    block2: while (v2 == 0) {
                        v3 = var9_10 = this.cM.a();
                        v4 = var6_7;
                        if (var4_6 != 0) break block27;
                        v5 = v3.equals(v4);
                        if (var4_6 == 0) {
                            if (v5 != 0) {
                                v6 = var3_3;
                                if (var4_6 == 0) {
                                    if (v6 == null) return this.a(var5_5, var6_7);
                                    var3_3.n = var6_7;
                                    v6 = var3_3;
                                }
                                var6_7 = v6;
                                return this.a(var5_5, var6_7);
                            }
                            cfr_temp_0 = var9_10.b(var6_7) - var7_8.b(var6_7);
                            v5 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                        }
                        if (var4_6 == 0) {
                            if (v5 < 0) {
                                var7_8 = var9_10;
                            }
                            var9_10.j = true;
                            v5 = 0;
                        }
                        var10_11 = v5;
                        for (var11_12 = 0; var11_12 < 24; ++var11_12) {
                            v3 = this.cx[var11_12];
                            v4 = var9_10;
                            if (var4_6 == 0) {
                                if (v3 != v4) continue;
                                var10_11 = var11_12;
                                if (var4_6 == 0) break;
                                if (var4_6 == 0) continue;
                            }
                            break block27;
                        }
                        var11_12 = var8_9;
                        while (var11_12 < 24) {
                            block33: {
                                block32: {
                                    block36: {
                                        block34: {
                                            block35: {
                                                block31: {
                                                    v7 = this;
                                                    if (var4_6 != 0) break block31;
                                                    v2 = v7.cE[var10_11] & 1 << var11_12;
                                                    if (var4_6 != 0) continue block2;
                                                    if (v2 <= 0) break block32;
                                                    v7 = this;
                                                }
                                                var12_13 = v7.cx[var11_12];
                                                if (var4_6 != 0) break block33;
                                                if (var12_13.j) break block32;
                                                var13_14 = var9_10.d + var9_10.b(var12_13);
                                                v8 = var12_13.a();
                                                if (var4_6 != 0) break block34;
                                                if (v8 == 0) break block35;
                                                cfr_temp_1 = var13_14 - var12_13.d;
                                                v8 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                                                if (var4_6 != 0) break block34;
                                                if (v8 >= 0) break block32;
                                            }
                                            var12_13.n = var9_10;
                                            var12_13.d = var13_14;
                                            var12_13.c = var12_13.b(var6_7);
                                            v9 = var12_13;
                                            if (var4_6 != 0) break block32;
                                            v8 = v9.a() ? 1 : 0;
                                        }
                                        if (v8 == 0) break block36;
                                        this.cM.a(var12_13, var12_13.d + var12_13.c);
                                        if (var4_6 == 0) break block32;
                                    }
                                    var12_13.h = var12_13.d + var12_13.c;
                                    v9 = this.cM.a(var12_13);
                                }
                                ++var11_12;
                            }
                            if (var4_6 == 0) continue;
                        }
                        if (var4_6 == 0) continue block1;
                    }
                    break;
                }
                v3 = var7_8;
                if (var4_6 != 0) break block37;
                v4 = var5_5;
            }
            if (v3 == v4) {
                return null;
            }
            net.minecraft.h.d.cq.debug("Failed to find path from {} to {}", (Object)var1_1, (Object)var2_2);
            v3 = var3_3;
        }
        if (var4_6 == 0) {
            if (v3 == null) return this.a(var5_5, var7_8);
            var3_3.n = var7_8;
            v3 = var3_3;
        }
        var7_8 = v3;
        return this.a(var5_5, var7_8);
    }

    @Override
    protected net.minecraft.ar.d q() {
        return net.minecraft.u.E.e2;
    }

    public void a(p p2, n n2, net.minecraft.ar.G g10) {
        net.minecraft.i.j j2;
        block6: {
            block5: {
                x x2;
                int n3;
                block4: {
                    n3 = net.minecraft.U.D.i();
                    x2 = g10.h();
                    if (n3 != 0) break block4;
                    if (!(x2 instanceof net.minecraft.i.j)) break block5;
                    x2 = g10.h();
                }
                j2 = (net.minecraft.i.j)x2;
                if (n3 == 0) break block6;
            }
            j2 = this.aG.a(n2, 64.0, 64.0);
        }
        if (p2 == this.cH) {
            this.a(this.cO, net.minecraft.ar.G.b(j2), 10.0f);
        }
        this.cI.a().a(p2, n2, g10, j2);
    }

    @Override
    public ay ad() {
        return ay.HOSTILE;
    }

    @Override
    protected net.minecraft.ar.d e(net.minecraft.ar.G g10) {
        return net.minecraft.u.E.gT;
    }

    @Override
    public boolean a(net.minecraft.ar.G g10, float f10) {
        boolean bl2;
        block4: {
            block5: {
                int n2 = net.minecraft.U.D.i();
                bl2 = g10 instanceof H;
                if (n2 != 0) break block4;
                if (!bl2) break block5;
                bl2 = ((H)g10).d();
                if (n2 != 0) break block4;
                if (bl2) {
                    this.a(this.cz, g10, f10);
                }
            }
            bl2 = false;
        }
        return bl2;
    }

    @Nullable
    public net.minecraft.am.g c() {
        return this.cK;
    }

    public int a() {
        int n2;
        block3: {
            d d10;
            block4: {
                block5: {
                    int n3 = net.minecraft.U.D.g();
                    d10 = this;
                    if (n3 == 0) break block4;
                    if (d10.cx[0] != null) break block5;
                    for (int i2 = 0; i2 < 24; ++i2) {
                        int n4;
                        int n5;
                        int n6;
                        int n7;
                        block8: {
                            int n8;
                            int n9;
                            block9: {
                                block10: {
                                    block6: {
                                        block7: {
                                            n7 = 5;
                                            n2 = i2;
                                            if (n3 == 0) break block3;
                                            n9 = 12;
                                            if (n3 == 0) break block6;
                                            if (n2 >= n9) break block7;
                                            n6 = (int)(60.0f * h.c(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i2)));
                                            n5 = (int)(60.0f * h.g(2.0f * ((float)(-Math.PI) + 0.2617994f * (float)i2)));
                                            if (n3 != 0) break block8;
                                        }
                                        n8 = i2;
                                        n9 = 20;
                                    }
                                    if (n3 == 0) break block9;
                                    if (n8 >= n9) break block10;
                                    n4 = i2 - 12;
                                    n6 = (int)(40.0f * h.c(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n4)));
                                    n5 = (int)(40.0f * h.g(2.0f * ((float)(-Math.PI) + 0.3926991f * (float)n4)));
                                    n7 += 10;
                                    if (n3 != 0) break block8;
                                }
                                n8 = i2;
                                n9 = 20;
                            }
                            n4 = n8 - n9;
                            n6 = (int)(20.0f * h.c(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n4)));
                            n5 = (int)(20.0f * h.g(2.0f * ((float)(-Math.PI) + 0.7853982f * (float)n4)));
                        }
                        n4 = Math.max(this.aG.y() + 10, this.aG.c(new n(n6, 0, n5)).b() + n7);
                        this.cx[i2] = new f(n6, n4, n5);
                        if (n3 != 0) continue;
                    }
                    this.cE[0] = 6146;
                    this.cE[1] = 8197;
                    this.cE[2] = 8202;
                    this.cE[3] = 16404;
                    this.cE[4] = 32808;
                    this.cE[5] = 32848;
                    this.cE[6] = 65696;
                    this.cE[7] = 131392;
                    this.cE[8] = 131712;
                    this.cE[9] = 263424;
                    this.cE[10] = 526848;
                    this.cE[11] = 525313;
                    this.cE[12] = 1581057;
                    this.cE[13] = 3166214;
                    this.cE[14] = 2138120;
                    this.cE[15] = 6373424;
                    this.cE[16] = 4358208;
                    this.cE[17] = 12910976;
                    this.cE[18] = 9044480;
                    this.cE[19] = 9706496;
                    this.cE[20] = 15216640;
                    this.cE[21] = 0xD0E000;
                    this.cE[22] = 11763712;
                    this.cE[23] = 0x7E0000;
                }
                d10 = this;
            }
            n2 = d10.a(this.a, this.aF, this.ax);
        }
        return n2;
    }

    @Override
    protected void ay() {
        block33: {
            int n2;
            int n3;
            int n4;
            block34: {
                int n5;
                block32: {
                    int n6;
                    block31: {
                        block26: {
                            block27: {
                                block28: {
                                    block30: {
                                        block29: {
                                            block25: {
                                                d d10;
                                                block23: {
                                                    block24: {
                                                        int n7;
                                                        block21: {
                                                            block22: {
                                                                n4 = net.minecraft.U.D.g();
                                                                d d11 = this;
                                                                if (n4 != 0) {
                                                                    if (d11.cK != null) {
                                                                        this.cK.a(this);
                                                                    }
                                                                    ++this.cG;
                                                                    d11 = this;
                                                                }
                                                                n7 = d11.cG;
                                                                if (n4 == 0) break block21;
                                                                if (n7 < 180) break block22;
                                                                n7 = this.cG;
                                                                if (n4 == 0) break block21;
                                                                if (n7 <= 200) {
                                                                    float f10 = (this.g.nextFloat() - 0.5f) * 8.0f;
                                                                    float f11 = (this.g.nextFloat() - 0.5f) * 4.0f;
                                                                    float f12 = (this.g.nextFloat() - 0.5f) * 8.0f;
                                                                    this.aG.a(net.minecraft.ar.aH.EXPLOSION_HUGE, this.a + (double)f10, this.aF + 2.0 + (double)f11, this.ax + (double)f12, 0.0, 0.0, 0.0, new int[0]);
                                                                }
                                                            }
                                                            n7 = this.aG.M().c("doMobLoot") ? 1 : 0;
                                                        }
                                                        n5 = n7;
                                                        n3 = 500;
                                                        d10 = this;
                                                        if (n4 == 0) break block23;
                                                        if (d10.cK == null) break block24;
                                                        n2 = this.cK.j();
                                                        if (n4 == 0) break block25;
                                                        if (n2 == 0) {
                                                            n3 = 12000;
                                                        }
                                                    }
                                                    d10 = this;
                                                }
                                                n2 = d10.aG.C;
                                            }
                                            if (n4 == 0) break block26;
                                            if (n2 != 0) break block27;
                                            int n6 = this.cG;
                                            n6 = 150;
                                            if (n4 == 0) break block28;
                                            if (n2 <= n6) break block29;
                                            n2 = this.cG % 5;
                                            if (n4 == 0) break block30;
                                            if (n2 != 0) break block29;
                                            n2 = n5;
                                            if (n4 == 0) break block30;
                                            if (n2 != 0) {
                                                this.a(h.d((float)n3 * 0.08f));
                                            }
                                        }
                                        n2 = this.cG;
                                    }
                                    n6 = 1;
                                }
                                if (n4 == 0) break block31;
                                if (n2 == n6) {
                                    this.aG.a(1028, new n(this), 0);
                                }
                            }
                            this.a(net.minecraft.U.c.SELF, 0.0, (double)0.1f, 0.0);
                            this.e += 20.0f;
                            this.bf = this.e;
                            n2 = this.cG;
                        }
                        if (n4 == 0) break block32;
                        n6 = 200;
                    }
                    if (n2 != n6) break block33;
                    n2 = this.aG.C ? 1 : 0;
                }
                if (n4 == 0) break block34;
                if (n2 != 0) break block33;
                n2 = n5;
            }
            if (n2 != 0) {
                this.a(h.d((float)n3 * 0.2f));
            }
            d d12 = this;
            if (n4 != 0) {
                if (d12.cK != null) {
                    this.cK.b(this);
                }
                d12 = this;
            }
            d12.a();
        }
    }

    private void a(int n2) {
        int n3 = net.minecraft.U.D.i();
        while (n2 > 0) {
            int n4 = net.minecraft.J.E.a(n2);
            n2 -= n4;
            this.aG.f(new E(this.aG, this.a, this.aF, this.ax, n4));
            if (n3 == 0) continue;
        }
    }

    public d(z z2) {
        block4: {
            block2: {
                d d10;
                block3: {
                    int n2 = net.minecraft.U.D.i();
                    super(z2);
                    this.cF = new double[64][3];
                    this.cJ = -1;
                    this.cO = new G(this, "head", 6.0f, 6.0f);
                    int n3 = n2;
                    this.cs = new G(this, "neck", 6.0f, 6.0f);
                    this.cz = new G(this, "body", 8.0f, 8.0f);
                    this.cy = new G(this, "tail", 4.0f, 4.0f);
                    this.cr = new G(this, "tail", 4.0f, 4.0f);
                    this.cA = new G(this, "tail", 4.0f, 4.0f);
                    this.cL = new G(this, "wing", 4.0f, 4.0f);
                    this.cu = new G(this, "wing", 4.0f, 4.0f);
                    this.cD = 200;
                    this.cx = new f[24];
                    this.cE = new int[24];
                    this.cM = new g();
                    this.ct = new G[]{this.cO, this.cs, this.cz, this.cy, this.cr, this.cA, this.cL, this.cu};
                    this.f(this.H());
                    this.c(16.0f, 8.0f);
                    this.K = true;
                    this.al = true;
                    this.cD = 100;
                    d10 = this;
                    if (n3 != 0) break block2;
                    d10.Z = true;
                    if (z2.C || !(z2.D instanceof net.minecraft.ah.H)) break block3;
                    this.cK = ((net.minecraft.ah.H)z2.D).a();
                    if (n3 == 0) break block4;
                    net.minecraft.k.m.b(!net.minecraft.k.m.c());
                }
                d10 = this;
            }
            d10.cK = null;
        }
        this.cI = new a(this);
    }

    @Override
    public void f(r r2) {
        super.f(r2);
        r2.b("DragonPhase", this.cI.a().b().b());
    }

    private float a(double d10) {
        return (float)h.b(d10);
    }

    public a d() {
        return this.cI;
    }

    @Override
    @Nullable
    protected v D() {
        return net.minecraft.aj.j.at;
    }

    @Override
    public void E() {
        block47: {
            int n2;
            l[] arrl;
            int n3;
            block72: {
                int n4;
                block73: {
                    net.minecraft.am.g g10;
                    block74: {
                        block48: {
                            d d10;
                            float f10;
                            float f11;
                            float f12;
                            float f13;
                            float f14;
                            float f15;
                            float f16;
                            Object object;
                            float f17;
                            block70: {
                                block71: {
                                    block66: {
                                        block65: {
                                            l l2;
                                            block69: {
                                                d d11;
                                                block67: {
                                                    block68: {
                                                        double d12;
                                                        double d13;
                                                        double d14;
                                                        d d15;
                                                        block63: {
                                                            block64: {
                                                                int n5;
                                                                block62: {
                                                                    block46: {
                                                                        block60: {
                                                                            block61: {
                                                                                block57: {
                                                                                    float f18;
                                                                                    block58: {
                                                                                        d d16;
                                                                                        block59: {
                                                                                            boolean bl2;
                                                                                            block55: {
                                                                                                block56: {
                                                                                                    float f19;
                                                                                                    float f20;
                                                                                                    block53: {
                                                                                                        block54: {
                                                                                                            float f21;
                                                                                                            int n6;
                                                                                                            block49: {
                                                                                                                block50: {
                                                                                                                    block51: {
                                                                                                                        block52: {
                                                                                                                            n3 = net.minecraft.U.D.i();
                                                                                                                            n6 = this.aG.C;
                                                                                                                            if (n3 != 0) break block49;
                                                                                                                            if (n6 == 0) break block50;
                                                                                                                            this.f(this.V());
                                                                                                                            n6 = this.aR() ? 1 : 0;
                                                                                                                            if (n3 != 0) break block49;
                                                                                                                            if (n6 != 0) break block50;
                                                                                                                            f18 = h.c(this.cC * ((float)Math.PI * 2));
                                                                                                                            f21 = h.c(this.cv * ((float)Math.PI * 2));
                                                                                                                            float f22 = f21 - -0.3f;
                                                                                                                            n6 = f22 == 0.0f ? 0 : (f22 < 0.0f ? -1 : 1);
                                                                                                                            if (n3 != 0) break block51;
                                                                                                                            if (n6 > 0) break block52;
                                                                                                                            float f23 = f18 - -0.3f;
                                                                                                                            n6 = f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1);
                                                                                                                            if (n3 != 0) break block51;
                                                                                                                            if (n6 >= 0) {
                                                                                                                                this.aG.a(this.a, this.aF, this.ax, net.minecraft.u.E.dB, this.ad(), 5.0f, 0.8f + this.g.nextFloat() * 0.3f, false);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        n6 = this.cI.a().i() ? 1 : 0;
                                                                                                                    }
                                                                                                                    if (n3 != 0) break block49;
                                                                                                                    if (n6 != 0) break block50;
                                                                                                                    n6 = this.cD = this.cD - 1;
                                                                                                                    if (n3 != 0) break block49;
                                                                                                                    if (n6 < 0) {
                                                                                                                        this.aG.a(this.a, this.aF, this.ax, net.minecraft.u.E.dA, this.ad(), 2.5f, 0.8f + this.g.nextFloat() * 0.3f, false);
                                                                                                                        this.cD = 200 + this.g.nextInt(200);
                                                                                                                    }
                                                                                                                }
                                                                                                                this.cv = this.cC;
                                                                                                                f20 = this.V();
                                                                                                                f19 = 0.0f;
                                                                                                                if (n3 != 0) break block53;
                                                                                                                float f24 = f20 - f19;
                                                                                                                n6 = f24 == 0.0f ? 0 : (f24 < 0.0f ? -1 : 1);
                                                                                                            }
                                                                                                            if (n6 > 0) break block54;
                                                                                                            f18 = (this.g.nextFloat() - 0.5f) * 8.0f;
                                                                                                            f21 = (this.g.nextFloat() - 0.5f) * 4.0f;
                                                                                                            float f25 = (this.g.nextFloat() - 0.5f) * 8.0f;
                                                                                                            this.aG.a(net.minecraft.ar.aH.EXPLOSION_LARGE, this.a + (double)f18, this.aF + 2.0 + (double)f21, this.ax + (double)f25, 0.0, 0.0, 0.0, new int[0]);
                                                                                                            if (n3 == 0) break block47;
                                                                                                        }
                                                                                                        this.b();
                                                                                                        f20 = 0.2f;
                                                                                                        f19 = h.e(this.aq * this.aq + this.d * this.d) * 10.0f + 1.0f;
                                                                                                    }
                                                                                                    f18 = f20 / f19;
                                                                                                    f18 *= (float)Math.pow(2.0, this.G);
                                                                                                    bl2 = this.cI.a().i();
                                                                                                    if (n3 != 0) break block55;
                                                                                                    if (!bl2) break block56;
                                                                                                    this.cC += 0.1f;
                                                                                                    if (n3 == 0) break block57;
                                                                                                }
                                                                                                d16 = this;
                                                                                                if (n3 != 0) break block58;
                                                                                                bl2 = d16.cN;
                                                                                            }
                                                                                            if (!bl2) break block59;
                                                                                            this.cC += f18 * 0.5f;
                                                                                            if (n3 == 0) break block57;
                                                                                        }
                                                                                        d16 = this;
                                                                                    }
                                                                                    d16.cC += f18;
                                                                                }
                                                                                this.e = h.b(this.e);
                                                                                n5 = this.T();
                                                                                if (n3 != 0) break block60;
                                                                                if (n5 == 0) break block61;
                                                                                this.cC = 0.5f;
                                                                                if (n3 == 0) break block47;
                                                                            }
                                                                            n5 = this.cJ;
                                                                        }
                                                                        if (n3 == 0) {
                                                                            if (n5 < 0) {
                                                                                for (int i2 = 0; i2 < this.cF.length; ++i2) {
                                                                                    this.cF[i2][0] = this.e;
                                                                                    this.cF[i2][1] = this.aF;
                                                                                    if (n3 == 0) {
                                                                                        if (n3 == 0) continue;
                                                                                    }
                                                                                    break block46;
                                                                                }
                                                                            }
                                                                            n5 = this.cJ = this.cJ + 1;
                                                                        }
                                                                        if (n3 != 0) break block62;
                                                                        if (n5 == this.cF.length) {
                                                                            this.cJ = 0;
                                                                        }
                                                                        this.cF[this.cJ][0] = this.e;
                                                                        this.cF[this.cJ][1] = this.aF;
                                                                    }
                                                                    d15 = this;
                                                                    if (n3 != 0) break block63;
                                                                    n5 = d15.aG.C ? 1 : 0;
                                                                }
                                                                if (n5 == 0) break block64;
                                                                d d17 = this;
                                                                if (n3 == 0) {
                                                                    if (d17.bA > 0) {
                                                                        double d18 = this.a + (this.bo - this.a) / (double)this.bA;
                                                                        d14 = this.aF + (this.bC - this.aF) / (double)this.bA;
                                                                        d13 = this.ax + (this.bD - this.ax) / (double)this.bA;
                                                                        d12 = h.b(this.a5 - (double)this.e);
                                                                        this.e = (float)((double)this.e + d12 / (double)this.bA);
                                                                        this.at = (float)((double)this.at + (this.bi - (double)this.at) / (double)this.bA);
                                                                        --this.bA;
                                                                        this.g(d18, d14, d13);
                                                                        this.e(this.e, this.at);
                                                                    }
                                                                    d17 = this;
                                                                }
                                                                d17.cI.a().a();
                                                                if (n3 == 0) break block65;
                                                            }
                                                            d15 = this;
                                                        }
                                                        net.minecraft.v.p p2 = d15.cI.a();
                                                        p2.h();
                                                        net.minecraft.v.p p3 = this.cI.a();
                                                        if (n3 == 0) {
                                                            if (p3 != p2) {
                                                                p2 = this.cI.a();
                                                                p2.h();
                                                            }
                                                            p3 = p2;
                                                        }
                                                        l l3 = p3.e();
                                                        if (n3 != 0) break block66;
                                                        if (l3 == null) break block65;
                                                        d14 = l3.e - this.a;
                                                        d13 = l3.d - this.aF;
                                                        d12 = l3.b - this.ax;
                                                        double d19 = d14 * d14 + d13 * d13 + d12 * d12;
                                                        f17 = p2.g();
                                                        d13 = h.b(d13 / (double)h.e(d14 * d14 + d12 * d12), (double)(-f17), (double)f17);
                                                        this.G += d13 * (double)0.1f;
                                                        this.e = h.b(this.e);
                                                        double d20 = h.b(h.b(180.0 - h.a(d14, d12) * 57.29577951308232 - (double)this.e), -50.0, 50.0);
                                                        object = new l(l3.e - this.a, l3.d - this.aF, l3.b - this.ax).d();
                                                        l2 = new l(h.g(this.e * ((float)Math.PI / 180)), this.G, -h.c(this.e * ((float)Math.PI / 180))).d();
                                                        f16 = Math.max(((float)l2.g((l)object) + 0.5f) / 1.5f, 0.0f);
                                                        this.bT *= 0.8f;
                                                        this.bT = (float)((double)this.bT + d20 * (double)p2.f());
                                                        this.e += this.bT * 0.1f;
                                                        f15 = (float)(2.0 / (d19 + 1.0));
                                                        f14 = 0.06f;
                                                        this.a(0.0f, 0.0f, -1.0f, 0.06f * (f16 * f15 + (1.0f - f15)));
                                                        d11 = this;
                                                        if (n3 != 0) break block67;
                                                        if (!d11.cN) break block68;
                                                        this.a(net.minecraft.U.c.SELF, this.aq * (double)0.8f, this.G * (double)0.8f, this.d * (double)0.8f);
                                                        if (n3 == 0) break block69;
                                                    }
                                                    d11 = this;
                                                }
                                                d11.a(net.minecraft.U.c.SELF, this.aq, this.G, this.d);
                                            }
                                            l l4 = new l(this.aq, this.G, this.d).d();
                                            float f26 = ((float)l4.g(l2) + 1.0f) / 2.0f;
                                            f26 = 0.8f + 0.15f * f26;
                                            this.aq *= (double)f26;
                                            this.d *= (double)f26;
                                            this.G *= (double)0.91f;
                                        }
                                        this.bf = this.e;
                                        this.cO.ad = 1.0f;
                                        this.cO.aD = 1.0f;
                                        this.cs.ad = 3.0f;
                                        this.cs.aD = 3.0f;
                                        this.cy.ad = 2.0f;
                                        this.cy.aD = 2.0f;
                                        this.cr.ad = 2.0f;
                                        this.cr.aD = 2.0f;
                                        this.cA.ad = 2.0f;
                                        this.cA.aD = 2.0f;
                                        this.cz.aD = 3.0f;
                                        this.cz.ad = 5.0f;
                                        this.cL.aD = 2.0f;
                                        this.cL.ad = 4.0f;
                                        this.cu.aD = 3.0f;
                                        this.cu.ad = 4.0f;
                                    }
                                    arrl = new l[this.ct.length];
                                    for (int i3 = 0; i3 < this.ct.length; ++i3) {
                                        arrl[i3] = new l(this.ct[i3].a, this.ct[i3].aF, this.ct[i3].ax);
                                        if (n3 == 0) {
                                            if (n3 == 0) continue;
                                        }
                                        break block47;
                                    }
                                    float f27 = (float)(this.a(5, 1.0f)[1] - this.a(10, 1.0f)[1]) * 10.0f * ((float)Math.PI / 180);
                                    f13 = h.c(f27);
                                    f12 = h.g(f27);
                                    float f28 = this.e * ((float)Math.PI / 180);
                                    f11 = h.g(f28);
                                    f10 = h.c(f28);
                                    this.cz.ae();
                                    this.cz.c(this.a + (double)(f11 * 0.5f), this.aF, this.ax - (double)(f10 * 0.5f), 0.0f, 0.0f);
                                    this.cL.ae();
                                    this.cL.c(this.a + (double)(f10 * 4.5f), this.aF + 2.0, this.ax + (double)(f11 * 4.5f), 0.0f, 0.0f);
                                    this.cu.ae();
                                    this.cu.c(this.a - (double)(f10 * 4.5f), this.aF + 2.0, this.ax - (double)(f11 * 4.5f), 0.0f, 0.0f);
                                    d10 = this;
                                    if (n3 != 0) break block70;
                                    if (d10.aG.C) break block71;
                                    d10 = this;
                                    if (n3 != 0) break block70;
                                    if (d10.bc == 0) {
                                        this.a(this.aG.b((x)this, this.cL.m().a(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
                                        this.a(this.aG.b((x)this, this.cu.m().a(4.0, 2.0, 4.0).c(0.0, -2.0, 0.0)));
                                        this.b(this.aG.b((x)this, this.cO.m().a(1.0)));
                                        this.b(this.aG.b((x)this, this.cs.m().a(1.0)));
                                    }
                                }
                                d10 = this;
                            }
                            double[] arrd = d10.a(5, 1.0f);
                            float f29 = h.g(this.e * ((float)Math.PI / 180) - this.bT * 0.01f);
                            float f30 = h.c(this.e * ((float)Math.PI / 180) - this.bT * 0.01f);
                            this.cO.ae();
                            this.cs.ae();
                            f17 = this.a(1.0f);
                            this.cO.c(this.a + (double)(f29 * 6.5f * f13), this.aF + (double)f17 + (double)(f12 * 6.5f), this.ax - (double)(f30 * 6.5f * f13), 0.0f, 0.0f);
                            this.cs.c(this.a + (double)(f29 * 5.5f * f13), this.aF + (double)f17 + (double)(f12 * 5.5f), this.ax - (double)(f30 * 5.5f * f13), 0.0f, 0.0f);
                            for (n2 = 0; n2 < 3; ++n2) {
                                G g11 = null;
                                n4 = n2;
                                if (n3 == 0) {
                                    if (n4 == 0) {
                                        g11 = this.cy;
                                    }
                                    int n7 = n2;
                                    int n8 = 1;
                                    if (n3 == 0) {
                                        if (n7 == n8) {
                                            g11 = this.cr;
                                        }
                                        n7 = n2;
                                        n8 = 2;
                                    }
                                    if (n7 == n8) {
                                        g11 = this.cA;
                                    }
                                    object = this.a(12 + n2 * 2, 1.0f);
                                    float f31 = this.e * ((float)Math.PI / 180) + this.a((double)(object[0] - arrd[0])) * ((float)Math.PI / 180);
                                    f16 = h.g(f31);
                                    f15 = h.c(f31);
                                    f14 = 1.5f;
                                    float f32 = (float)(n2 + 1) * 2.0f;
                                    g11.ae();
                                    g11.c(this.a - (double)((f11 * 1.5f + f16 * f32) * f13), this.aF + (object[1] - arrd[1]) - (double)((f32 + 1.5f) * f12) + 1.5, this.ax + (double)((f10 * 1.5f + f15 * f32) * f13), 0.0f, 0.0f);
                                    if (n3 == 0) continue;
                                }
                                break block48;
                            }
                            n4 = this.aG.C ? 1 : 0;
                        }
                        if (n3 != 0) break block72;
                        if (n4 != 0) break block73;
                        this.cN = this.a(this.cO.m()) | this.a(this.cs.m()) | this.a(this.cz.m());
                        g10 = this.cK;
                        if (n3 != 0) break block74;
                        if (g10 == null) break block73;
                        g10 = this.cK;
                    }
                    g10.a(this);
                }
                n4 = n2 = 0;
            }
            while (n2 < this.ct.length) {
                this.ct[n2].N = arrl[n2].e;
                this.ct[n2].L = arrl[n2].d;
                this.ct[n2].k = arrl[n2].b;
                ++n2;
                if (n3 == 0) continue;
            }
        }
    }

    @Override
    protected void ab() {
        super.ab();
        this.E().c(cw, b.n.b());
    }

    public double[] a(int n2, float f10) {
        double[] arrd;
        block2: {
            int n3 = net.minecraft.U.D.i();
            float f11 = this.V() - 0.0f;
            float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
            if (n3 == 0) {
                if (f12 <= 0) {
                    f10 = 0.0f;
                }
                f10 = 1.0f - f10;
                f12 = this.cJ - n2 & 0x3F;
            }
            float f13 = f12;
            int n4 = this.cJ - n2 - 1 & 0x3F;
            arrd = new double[3];
            double d10 = this.cF[f13][0];
            double d11 = h.b(this.cF[n4][0] - d10);
            arrd[0] = d10 + d11 * (double)f10;
            d10 = this.cF[f13][1];
            d11 = this.cF[n4][1] - d10;
            arrd[1] = d10 + d11 * (double)f10;
            arrd[2] = this.cF[f13][2] + (this.cF[n4][2] - this.cF[f13][2]) * (double)f10;
            if (!net.minecraft.k.m.c()) break block2;
            net.minecraft.U.D.f(++n3);
        }
        return arrd;
    }

    public static void b(net.minecraft.av.b b10) {
        C.a(b10, d.class);
    }

    @Override
    public x[] aE() {
        return this.ct;
    }

    public float a(int n2, double[] arrd, double[] arrd2) {
        double d10;
        block6: {
            block3: {
                int n3;
                block7: {
                    int n4;
                    block4: {
                        block5: {
                            b<c> b10;
                            b<? extends net.minecraft.v.p> b11;
                            net.minecraft.v.p p2;
                            block2: {
                                p2 = this.cI.a();
                                b<? extends net.minecraft.v.p> b12 = p2.b();
                                n3 = net.minecraft.U.D.g();
                                b11 = b12;
                                b10 = b.j;
                                if (n3 == 0) break block2;
                                if (b11 == b10) break block3;
                                b11 = b12;
                                b10 = b.k;
                            }
                            if (b11 == b10) break block3;
                            n4 = p2.i();
                            if (n3 == 0) break block4;
                            if (n4 == 0) break block5;
                            d10 = n2;
                            if (n3 != 0) break block6;
                        }
                        n4 = n2;
                    }
                    if (n4 != 6) break block7;
                    d10 = 0.0;
                    if (n3 != 0) break block6;
                }
                d10 = arrd2[1] - arrd[1];
                if (n3 != 0) break block6;
            }
            n n5 = this.aG.c(net.minecraft.p.z.d);
            float f10 = Math.max(h.e(this.c(n5)) / 4.0f, 1.0f);
            d10 = (float)n2 / f10;
        }
        return (float)d10;
    }

    protected boolean b(net.minecraft.ar.G g10, float f10) {
        return super.a(g10, f10);
    }

    public int a(double d10, double d11, double d12) {
        int n2;
        int n3;
        f f10;
        int n4;
        float f11;
        block10: {
            int n5;
            int n6;
            block11: {
                block9: {
                    net.minecraft.am.g g10;
                    block8: {
                        f11 = 10000.0f;
                        n4 = 0;
                        f10 = new f(h.f(d10), h.f(d11), h.f(d12));
                        n6 = 0;
                        n3 = net.minecraft.U.D.g();
                        g10 = this.cK;
                        if (n3 == 0) break block8;
                        if (g10 == null) break block9;
                        g10 = this.cK;
                    }
                    n5 = g10.h();
                    if (n3 == 0) break block10;
                    if (n5 != 0) break block11;
                }
                n6 = 12;
            }
            n5 = n2 = n6;
        }
        while (n2 < 24) {
            block14: {
                block13: {
                    f f12;
                    block12: {
                        f12 = this.cx[n2];
                        if (n3 == 0) break block12;
                        if (f12 == null) break block13;
                        f12 = this.cx[n2];
                    }
                    float f13 = f12.a(f10);
                    if (n3 == 0) break block14;
                    if (f13 < f11) {
                        f11 = f13;
                        n4 = n2;
                    }
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
        return n4;
    }

    public l d(float f10) {
        l l2;
        block5: {
            float f11;
            block3: {
                int n2;
                block4: {
                    b<c> b10;
                    b<? extends net.minecraft.v.p> b11;
                    net.minecraft.v.p p2;
                    block2: {
                        p2 = this.cI.a();
                        b<? extends net.minecraft.v.p> b12 = p2.b();
                        n2 = net.minecraft.U.D.i();
                        b11 = b12;
                        b10 = b.j;
                        if (n2 != 0) break block2;
                        if (b11 == b10) break block3;
                        b11 = b12;
                        b10 = b.k;
                    }
                    if (b11 == b10) break block3;
                    if (!p2.i()) break block4;
                    float f12 = this.at;
                    f11 = 1.5f;
                    this.at = -45.0f;
                    l2 = this.b(f10);
                    this.at = f12;
                    if (n2 == 0) break block5;
                }
                l2 = this.b(f10);
                if (n2 == 0) break block5;
            }
            n n3 = this.aG.c(net.minecraft.p.z.d);
            f11 = Math.max(h.e(this.c(n3)) / 4.0f, 1.0f);
            float f13 = 6.0f / f11;
            float f14 = this.at;
            float f15 = 1.5f;
            this.at = -f13 * 1.5f * 5.0f;
            l2 = this.b(f10);
            this.at = f14;
        }
        return l2;
    }

    @Override
    public void a(r r2) {
        block3: {
            d d10;
            block2: {
                int n2 = net.minecraft.U.D.i();
                d10 = this;
                if (n2 != 0) break block2;
                super.a(r2);
                if (!r2.b("DragonPhase")) break block3;
                d10 = this;
            }
            d10.cI.b(b.a(r2.m("DragonPhase")));
        }
    }

    @Override
    public void a(net.minecraft.q.r<?> r2) {
        block4: {
            d d10;
            block6: {
                block5: {
                    int n2 = net.minecraft.U.D.g();
                    if (n2 == 0) break block4;
                    if (!cw.equals(r2)) break block5;
                    d10 = this;
                    if (n2 == 0) break block6;
                    if (d10.aG.C) {
                        this.cI.b(b.a(this.E().b(cw)));
                    }
                }
                d10 = this;
            }
            super.a(r2);
        }
    }

    @Override
    protected void F() {
    }

    private net.minecraft.e.h a(f f10, f arrf) {
        int n2 = 1;
        f[] arrf2 = arrf;
        int n3 = net.minecraft.U.D.i();
        while (arrf2.n != null) {
            ++n2;
            arrf2 = arrf2.n;
            if (n3 == 0) continue;
        }
        arrf2 = new f[n2];
        Object object = arrf;
        arrf2[--n2] = arrf;
        while (object.n != null) {
            object = object.n;
            arrf2[--n2] = object;
            if (n3 == 0) continue;
        }
        return new net.minecraft.e.h(arrf2);
    }

    @Override
    public boolean A() {
        return false;
    }

    private float a(float f10) {
        double d10;
        block4: {
            d d11;
            block2: {
                block3: {
                    int n2 = net.minecraft.U.D.g();
                    d11 = this;
                    if (n2 == 0) break block2;
                    if (!d11.cI.a().i()) break block3;
                    d10 = -1.0;
                    if (n2 != 0) break block4;
                }
                d11 = this;
            }
            double[] arrd = d11.a(5, 1.0f);
            double[] arrd2 = this.a(0, 1.0f);
            d10 = arrd[1] - arrd2[1];
        }
        return (float)d10;
    }

    @Override
    public void b(net.minecraft.K.j j2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public z a() {
        return this.aG;
    }

    private void b() {
        block5: {
            d d10;
            int n2;
            block11: {
                int n3;
                block10: {
                    block6: {
                        block7: {
                            block8: {
                                block9: {
                                    n2 = net.minecraft.U.D.i();
                                    d10 = this;
                                    if (n2 != 0) break block6;
                                    if (d10.cH == null) break block7;
                                    n3 = this.cH.P ? 1 : 0;
                                    if (n2 != 0) break block8;
                                    if (n3 == 0) break block9;
                                    this.cH = null;
                                    if (n2 == 0) break block7;
                                }
                                n3 = this.H % 10;
                            }
                            if (n2 != 0) break block10;
                            if (n3 != 0) break block7;
                            float f10 = this.V() - this.H();
                            n3 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                            if (n2 != 0) break block10;
                            if (n3 < 0) {
                                this.f(this.V() + 1.0f);
                            }
                        }
                        d10 = this;
                    }
                    if (n2 != 0) break block11;
                    n3 = d10.g.nextInt(10);
                }
                if (n3 != 0) break block5;
                d10 = this;
            }
            List<p> list = d10.aG.a(p.class, this.m().a(32.0));
            p p2 = null;
            double d11 = Double.MAX_VALUE;
            for (p p3 : list) {
                block13: {
                    double d12;
                    block12: {
                        double d13 = p3.s(this);
                        if (n2 != 0) break block5;
                        d12 = d13;
                        if (n2 != 0) break block12;
                        if (!(d12 < d11)) break block13;
                        d12 = d13;
                    }
                    d11 = d12;
                    p2 = p3;
                }
                if (n2 == 0) continue;
            }
            this.cH = p2;
        }
    }

    private void b(List<x> list) {
        int n2 = 0;
        int n3 = net.minecraft.U.D.i();
        while (n2 < list.size()) {
            x x2 = list.get(n2);
            if (n3 == 0) {
                if (x2 instanceof B) {
                    x2.a(net.minecraft.ar.G.a(this), 10.0f);
                    this.a(this, x2);
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    static {
        cq = LogManager.getLogger();
        cw = net.minecraft.q.m.a(d.class, net.minecraft.q.h.n);
    }

    /*
     * Exception decompiling
     */
    private boolean a(net.minecraft.k.k var1_1) {
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
    protected float x() {
        return 5.0f;
    }

    private void a(List<x> list) {
        double d10 = (this.cz.m().e + this.cz.m().f) / 2.0;
        double d11 = (this.cz.m().d + this.cz.m().g) / 2.0;
        Iterator<x> iterator = list.iterator();
        int n2 = net.minecraft.U.D.g();
        while (iterator.hasNext()) {
            block4: {
                x x2;
                block6: {
                    int n3;
                    block5: {
                        x x3;
                        block3: {
                            x3 = x2 = iterator.next();
                            if (n2 == 0) break block3;
                            if (!(x3 instanceof B)) break block4;
                            x3 = x2;
                        }
                        double d12 = x3.a - d10;
                        double d13 = x2.ax - d11;
                        double d14 = d12 * d12 + d13 * d13;
                        x2.h(d12 / d14 * 4.0, 0.2f, d13 / d14 * 4.0);
                        n3 = this.cI.a().i();
                        if (n2 == 0) break block5;
                        if (n3 != 0) break block4;
                        n3 = ((B)x2).Z();
                    }
                    if (n2 == 0) break block6;
                    if (n3 >= x2.H - 2) break block4;
                    n3 = x2.a(net.minecraft.ar.G.a(this), 5.0f) ? 1 : 0;
                }
                this.a(this, x2);
            }
            if (n2 != 0) continue;
        }
    }

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(200.0);
    }

    @Override
    protected boolean g(x x2) {
        return false;
    }
}

