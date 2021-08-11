/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.W.bz;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class b0
extends bq {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(z var1_1, n var2_2, i var3_3, Random var4_4) {
        block20: {
            block21: {
                var5_5 = cL.b();
                if (this.y != net.minecraft.ac.c.g) return;
                v0 = var1_1.M().c("doFireTick");
                if (!var5_5) {
                    if (v0 == 0) return;
                    v0 = var4_4.nextInt(3);
                }
                v1 = var6_6 = v0;
                if (var5_5) break block20;
                if (v1 <= 0) break block21;
                var7_7 = var2_2;
                for (var8_9 = 0; var8_9 < var6_6; ++var8_9) {
                    block25: {
                        block23: {
                            block24: {
                                block22: {
                                    var7_7 = var7_7.a(var4_4.nextInt(3) - 1, 1, var4_4.nextInt(3) - 1);
                                    if (var5_5 != false) return;
                                    v2 = var7_7.b();
                                    if (var5_5) break block22;
                                    if (v2 < 0) break block23;
                                    v2 = var7_7.b();
                                }
                                if (var5_5) break block24;
                                if (v2 >= 256) break block23;
                                v3 = var1_1;
                                v4 = var7_7;
                                if (var5_5) break block25;
                                v2 = v3.n(v4) ? 1 : 0;
                            }
                            if (v2 == 0) {
                                return;
                            }
                        }
                        v3 = var1_1;
                        v4 = var7_7;
                    }
                    var9_11 = v3.d(v4).b();
                    v5 = var9_11.y;
                    if (!var5_5) {
                        if (v5 == net.minecraft.ac.c.A) {
                            v6 = this.b(var1_1, var7_7);
                            if (var5_5 != false) return;
                            if (!v6) continue;
                            v6 = var1_1.a(var7_7, g.C.d());
                            return;
                        }
                        v5 = var9_11.y;
                    }
                    if (!v5.n()) continue;
                    return;
                }
                if (var5_5 == false) return;
            }
            v1 = 0;
        }
        var7_8 = v1;
        do {
            block29: {
                block28: {
                    block26: {
                        block27: {
                            if (var7_8 >= 3) return;
                            var8_10 = var2_2.a(var4_4.nextInt(3) - 1, 0, var4_4.nextInt(3) - 1);
                            v7 = var8_10.b();
                            if (var5_5) break block26;
                            if (v7 < 0) break block27;
                            v7 = var8_10.b();
                            if (var5_5) break block26;
                            if (v7 < 256) {
                                v7 = var1_1.n(var8_10) ? 1 : 0;
                                if (!var5_5) {
                                    if (v7 == 0) {
                                        return;
                                    } else {
                                        ** GOTO lbl65
                                    }
                                } else {
                                    ** GOTO lbl64
                                }
                            }
                            break block27;
lbl64:
                            // 2 sources

                            break block26;
                        }
                        v7 = var1_1.a(var8_10.a()) ? 1 : 0;
                    }
                    if (var5_5) break block28;
                    if (v7 == 0) break block29;
                    v7 = this.c(var1_1, var8_10) ? 1 : 0;
                }
                if (!var5_5 && v7 != 0) {
                    v7 = var1_1.a(var8_10.a(), g.C.d()) ? 1 : 0;
                }
            }
            ++var7_8;
        } while (!var5_5);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void c(z z2, n n2, i i2) {
        bz bz2 = b0.b(this.y);
        z2.a(n2, bz2.d().a(z, i2.b(z)), 2);
        z2.a(n2, (K)bz2, this.a(z2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean c(z z2, n n2) {
        int n3;
        boolean bl2;
        block2: {
            block3: {
                bl2 = cL.e();
                n3 = n2.b();
                if (!bl2) break block2;
                if (n3 < 0) break block3;
                n3 = n2.b();
                if (!bl2) break block2;
                if (n3 >= 256) break block3;
                n3 = z2.n(n2) ? 1 : 0;
                if (!bl2) break block2;
                if (n3 == 0) return 0 != 0;
            }
            n3 = z2.d(n2).o().e();
        }
        if (!bl2) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    protected boolean b(z z2, n n2) {
        boolean bl2;
        block4: {
            aA[] arraA = aA.values();
            int n3 = arraA.length;
            boolean bl3 = cL.e();
            int n4 = 0;
            while (n4 < n3) {
                aA aA2 = arraA[n4];
                if (bl3) {
                    bl2 = this.c(z2, n2.a(aA2));
                    if (!bl3) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n4;
                }
                if (bl3) continue;
            }
            bl2 = false;
        }
        return bl2;
    }

    protected b0(c c10) {
        boolean bl2 = cL.b();
        super(c10);
        boolean bl3 = bl2;
        K k2 = this.a(false);
        if (!bl3 && c10 == net.minecraft.ac.c.g) {
            k2 = this.a(true);
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block3: {
            i i3;
            n n4;
            z z3;
            b0 b02;
            block2: {
                boolean bl2 = cL.e();
                b02 = this;
                z3 = z2;
                n4 = n2;
                i3 = i2;
                if (!bl2) break block2;
                if (b02.a(z3, n4, i3)) break block3;
                b02 = this;
                z3 = z2;
                n4 = n2;
                i3 = i2;
            }
            b02.c(z3, n4, i3);
        }
    }
}

