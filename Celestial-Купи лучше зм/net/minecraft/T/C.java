/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aW;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.j.b;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.z.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class C
extends net.minecraft.ak.h {
    private /* synthetic */ int d;
    private final /* synthetic */ aW c;
    private /* synthetic */ int e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double a() {
        b b10 = this.c.a(M.b);
        int[] arrn = S.f();
        b b11 = b10;
        if (arrn != null) {
            if (b11 == null) {
                return 16.0;
            }
            b11 = b10;
        }
        double d10 = b11.d();
        return d10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        B b10 = this.c.J();
        int[] arrn = S.f();
        B b11 = b10;
        if (arrn != null) {
            if (b11 == null) return false;
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block19: {
            block21: {
                block24: {
                    block25: {
                        block26: {
                            block22: {
                                block23: {
                                    block20: {
                                        block17: {
                                            block18: {
                                                --this.d;
                                                var2_1 = this.c.J();
                                                var1_2 = S.f();
                                                var3_3 = this.c.s(var2_1);
                                                cfr_temp_0 = var3_3 - 4.0;
                                                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                                if (var1_2 == null) break block17;
                                                if (v0 >= 0) break block18;
                                                v1 = this;
                                                if (var1_2 != null) {
                                                    if (v1.d <= 0) {
                                                        this.d = 20;
                                                        this.c.j(var2_1);
                                                    }
                                                    v1 = this;
                                                }
                                                v1.c.w().a(var2_1.a, var2_1.aF, var2_1.ax, 1.0);
                                                if (var1_2 != null) break block19;
                                            }
                                            v2 = var3_3;
                                            v3 = this.a() * this.a();
                                            if (var1_2 == null) break block20;
                                            cfr_temp_1 = v2 - v3;
                                            v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                        }
                                        if (v0 >= 0) break block21;
                                        v2 = var2_1.a;
                                        v3 = this.c.a;
                                    }
                                    var5_4 = v2 - v3;
                                    var7_5 = var2_1.m().b + (double)(var2_1.aD / 2.0f) - (this.c.aF + (double)(this.c.aD / 2.0f));
                                    var9_6 = var2_1.ax - this.c.ax;
                                    v4 = this;
                                    if (var1_2 == null) ** GOTO lbl73
                                    if (v4.d > 0) ** GOTO lbl-1000
                                    v5 = ++this.e;
                                    v6 = 1;
                                    if (var1_2 == null) break block22;
                                    if (v5 != v6) break block23;
                                    this.d = 60;
                                    this.c.a(true);
                                    if (var1_2 != null) break block24;
                                }
                                v7 = this;
                                if (var1_2 == null) break block25;
                                v5 = v7.e;
                                v6 = 4;
                            }
                            if (v5 > v6) break block26;
                            this.d = 6;
                            if (var1_2 != null) break block24;
                        }
                        this.d = 100;
                        this.e = 0;
                        v7 = this;
                    }
                    v7.c.a(false);
                }
                v4 = this;
                if (var1_2 != null) {
                    ** if (v4.e <= 1) goto lbl-1000
lbl-1000:
                    // 1 sources

                    {
                        var11_7 = h.a((float)h.e((double)var3_3)) * 0.5f;
                        this.c.aG.a(null, (int)1018, (n)new n((int)((int)this.c.a), (int)((int)this.c.aF), (int)((int)this.c.ax)), (int)0);
                        for (var12_8 = 0; var12_8 < 1; ++var12_8) {
                            var13_9 = new m((z)this.c.aG, (B)this.c, (double)(var5_4 + this.c.f().nextGaussian() * (double)var11_7), (double)var7_5, (double)(var9_6 + this.c.f().nextGaussian() * (double)var11_7));
                            var13_9.aF = this.c.aF + (double)(this.c.aD / 2.0f) + 0.5;
                            this.c.aG.f((x)var13_9);
                            if (var1_2 != null) {
                                if (var1_2 != null) continue;
                            } else {
                                ** GOTO lbl70
                            }
lbl70:
                            // 2 sources

                            ** GOTO lbl74
                        }
                    }
                }
                ** GOTO lbl73
lbl-1000:
                // 4 sources

                {
                    v4 = this;
lbl73:
                    // 3 sources

                    v4.c.I().a(var2_1, 10.0f, 10.0f);
                }
lbl74:
                // 2 sources

                if (var1_2 != null) break block19;
            }
            this.c.l().f();
            this.c.w().a(var2_1.a, var2_1.aF, var2_1.ax, 1.0);
        }
        super.b();
    }

    @Override
    public void g() {
        this.c.a(false);
    }

    public C(aW aW2) {
        this.c = aW2;
        this.a(3);
    }

    @Override
    public void a() {
        this.e = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

