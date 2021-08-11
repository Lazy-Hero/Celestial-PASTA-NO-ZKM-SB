/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.J;

import javax.annotation.Nullable;
import net.minecraft.J.j;
import net.minecraft.N.G;
import net.minecraft.T.aq;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.a6;
import net.minecraft.ah.z;
import net.minecraft.ar.aH;
import net.minecraft.av.b;
import net.minecraft.i.k;
import net.minecraft.k.i;
import net.minecraft.z.r;

public class F
extends r {
    private /* synthetic */ B aW;

    @Override
    public void ae() {
        block3: {
            block1: {
                boolean bl2;
                int n2;
                block2: {
                    B b10;
                    B b11;
                    block0: {
                        b11 = this.b();
                        n2 = net.minecraft.J.j.c();
                        b10 = b11;
                        if (n2 != 0) break block0;
                        if (b10 == null) break block1;
                        b10 = b11;
                    }
                    bl2 = b10 instanceof net.minecraft.i.j;
                    if (n2 != 0) break block2;
                    if (!bl2) break block1;
                    bl2 = b11.aL();
                }
                if (bl2) break block1;
                this.a();
                if (n2 == 0) break block3;
            }
            super.ae();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    @Nullable
    public x e(int n2) {
        int n3 = net.minecraft.J.j.d();
        x x2 = this.aW;
        if (n3 != 0) {
            if (x2.p != n2) {
                this.aW = null;
            }
            x2 = super.e(n2);
        }
        return x2;
    }

    public F(z z2) {
        super(z2);
    }

    public static void b(b b10) {
        r.a(b10, "ThrownEnderpearl");
    }

    public F(z z2, B b10) {
        super(z2, b10);
        this.aW = b10;
    }

    public F(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(i var1_1) {
        block26: {
            block31: {
                block23: {
                    block24: {
                        block29: {
                            block30: {
                                block28: {
                                    block27: {
                                        block25: {
                                            block22: {
                                                var3_2 = this.b();
                                                var2_3 = net.minecraft.J.j.c();
                                                v0 = var1_1;
                                                if (var2_3 == 0) {
                                                    if (v0.e != null) {
                                                        v1 = var1_1.e;
                                                        v2 = this;
                                                        if (var2_3 == 0) {
                                                            if (v1 == v2.aW) {
                                                                return;
                                                            }
                                                            v1 = var1_1.e;
                                                            v2 = this;
                                                        }
                                                        v1.a(net.minecraft.ar.G.b(v2, var3_2), 0.0f);
                                                    }
                                                    v0 = var1_1;
                                                }
                                                if (var2_3 != 0) ** GOTO lbl19
                                                if (v0.d == net.minecraft.k.j.BLOCK) {
                                                    v0 = var1_1;
lbl19:
                                                    // 2 sources

                                                    var4_4 = v0.a();
                                                    var5_7 = this.aG.b(var4_4);
                                                    v3 = var5_7 instanceof G;
                                                    if (var2_3 == 0) {
                                                        if (v3 != 0) {
                                                            var6_8 = (G)var5_7;
                                                            if (var2_3 != 0) return;
                                                            if (var3_2 == null) {
                                                                var6_8.a(this);
                                                                return;
                                                            }
                                                            if (var3_2 instanceof k) {
                                                                a6.d.a((k)var3_2, this.aG.d(var4_4));
                                                            }
                                                            var6_8.a(var3_2);
                                                            this.a();
                                                            return;
                                                        } else {
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
                                                } else lbl-1000:
                                                // 3 sources

                                                {
                                                    v3 = var4_5 = 0;
                                                }
                                                while (var4_5 < 32) {
                                                    this.aG.a(net.minecraft.ar.aH.PORTAL, this.a, this.aF + this.g.nextDouble() * 2.0, this.ax, this.g.nextGaussian(), 0.0, this.g.nextGaussian(), new int[0]);
                                                    ++var4_5;
                                                    if (var2_3 != 0) return;
                                                    if (var2_3 == 0) continue;
                                                }
                                                v4 = this.aG.C;
                                                if (var2_3 != 0) break block22;
                                                if (v4 != false) return;
                                                v5 = var3_2;
                                                if (var2_3 != 0) break block23;
                                                v4 = v5 instanceof k;
                                            }
                                            if (!v4) break block24;
                                            v6 = var4_6 = (k)var3_2;
                                            if (var2_3 != 0) break block25;
                                            if (!v6.cD.a().j()) break block26;
                                            v6 = var4_6;
                                        }
                                        if (var2_3 != 0) break block27;
                                        if (v6.aG != this.aG) break block26;
                                        v6 = var4_6;
                                    }
                                    v7 = v6.as();
                                    if (var2_3 != 0) break block28;
                                    if (v7 != 0) break block26;
                                    cfr_temp_0 = this.g.nextFloat() - 0.05f;
                                    v7 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                }
                                if (var2_3 != 0) break block29;
                                if (v7 >= 0) break block30;
                                v7 = this.aG.M().c("doMobSpawning") ? 1 : 0;
                                if (var2_3 != 0) break block29;
                                if (v7 != 0) {
                                    var5_7 = new aq(this.aG);
                                    var5_7.a(true);
                                    var5_7.c(var3_2.a, var3_2.aF, var3_2.ax, var3_2.e, var3_2.at);
                                    this.aG.f((x)var5_7);
                                }
                            }
                            v7 = var3_2.N() ? 1 : 0;
                        }
                        if (var2_3 == 0) {
                            if (v7 != 0) {
                                var3_2.aO();
                            }
                            var3_2.c(this.a, this.aF, this.ax);
                            var3_2.an = 0.0f;
                            v7 = var3_2.a(net.minecraft.ar.G.e, 5.0f) ? 1 : 0;
                        }
                        break block26;
                    }
                    v5 = var3_2;
                }
                if (var2_3 != 0) break block31;
                if (v5 == null) break block26;
                var3_2.c(this.a, this.aF, this.ax);
                v5 = var3_2;
            }
            v5.an = 0.0f;
        }
        this.a();
    }
}

