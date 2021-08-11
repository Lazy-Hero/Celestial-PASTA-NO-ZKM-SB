/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.N.Y;
import net.minecraft.N.r;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.client.F.a;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aF;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.y.b;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class t
extends f<Y> {
    @Override
    public boolean a(Y y2) {
        return true;
    }

    private void a(W w2, I i2, double d10, double d11, double d12, double d13, double d14, double d15, int n2, int n3, int n4) {
        v.d(2.0f);
        i2.a(3, b.i);
        i2.c(d10, d11, d12).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        i2.c(d10, d11, d12).b(n3, n3, n3, n2).d();
        i2.c(d13, d11, d12).b(n3, n4, n4, n2).d();
        i2.c(d13, d11, d15).b(n3, n3, n3, n2).d();
        i2.c(d10, d11, d15).b(n3, n3, n3, n2).d();
        i2.c(d10, d11, d12).b(n4, n4, n3, n2).d();
        i2.c(d10, d14, d12).b(n4, n3, n4, n2).d();
        i2.c(d13, d14, d12).b(n3, n3, n3, n2).d();
        i2.c(d13, d14, d15).b(n3, n3, n3, n2).d();
        i2.c(d10, d14, d15).b(n3, n3, n3, n2).d();
        i2.c(d10, d14, d12).b(n3, n3, n3, n2).d();
        i2.c(d10, d14, d15).b(n3, n3, n3, n2).d();
        i2.c(d10, d11, d15).b(n3, n3, n3, n2).d();
        i2.c(d13, d11, d15).b(n3, n3, n3, n2).d();
        i2.c(d13, d14, d15).b(n3, n3, n3, n2).d();
        i2.c(d13, d14, d12).b(n3, n3, n3, n2).d();
        i2.c(d13, d11, d12).b(n3, n3, n3, n2).d();
        i2.c(d13, d11, d12).a((float)n3, (float)n3, (float)n3, 0.0f).d();
        w2.a();
        v.d(1.0f);
    }

    private void a(Y y2, double d10, double d11, double d12, n n2, W w2, I i2, boolean bl2) {
        block3: {
            String[] arrstring = net.minecraft.client.F.f.b();
            v.d(bl2 ? 3.0f : 1.0f);
            i2.a(3, b.i);
            z z2 = y2.d();
            n n3 = y2.j();
            n n4 = n3.b(n2);
            for (n n5 : n.b(n4, n4.b(y2.k()).a(-1, -1, -1))) {
                block6: {
                    double d13;
                    double d14;
                    double d15;
                    double d16;
                    double d17;
                    double d18;
                    block9: {
                        boolean bl3;
                        block7: {
                            boolean bl4;
                            block8: {
                                boolean bl5;
                                block4: {
                                    block5: {
                                        i i3 = z2.d(n5);
                                        if (arrstring == null) break block3;
                                        bl4 = i3 == g.bf.d();
                                        boolean bl6 = i3 == g.Y.d();
                                        bl5 = bl4;
                                        if (arrstring == null) break block4;
                                        if (bl5) break block5;
                                        bl5 = bl6;
                                        if (arrstring == null) break block4;
                                        if (!bl5) break block6;
                                    }
                                    bl5 = bl4;
                                }
                                float f10 = bl5 ? 0.05f : 0.0f;
                                d18 = (double)((float)(n5.e() - n3.e()) + 0.45f) + d10 - (double)f10;
                                d17 = (double)((float)(n5.b() - n3.b()) + 0.45f) + d11 - (double)f10;
                                d16 = (double)((float)(n5.a() - n3.a()) + 0.45f) + d12 - (double)f10;
                                d15 = (double)((float)(n5.e() - n3.e()) + 0.55f) + d10 + (double)f10;
                                d14 = (double)((float)(n5.b() - n3.b()) + 0.55f) + d11 + (double)f10;
                                d13 = (double)((float)(n5.a() - n3.a()) + 0.55f) + d12 + (double)f10;
                                bl3 = bl2;
                                if (arrstring == null) break block7;
                                if (!bl3) break block8;
                                aF.b(i2, d18, d17, d16, d15, d14, d13, 0.0f, 0.0f, 0.0f, 1.0f);
                                if (arrstring != null) break block6;
                            }
                            bl3 = bl4;
                        }
                        if (!bl3) break block9;
                        aF.b(i2, d18, d17, d16, d15, d14, d13, 0.5f, 0.5f, 1.0f, 1.0f);
                        if (arrstring != null) break block6;
                    }
                    aF.b(i2, d18, d17, d16, d15, d14, d13, 1.0f, 0.25f, 0.25f, 1.0f);
                }
                if (arrstring != null) continue;
            }
            w2.a();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Y var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
        block47: {
            block46: {
                block45: {
                    block43: {
                        block44: {
                            block41: {
                                block42: {
                                    block40: {
                                        block39: {
                                            var11_8 = net.minecraft.client.F.f.b();
                                            if (var11_8 != null) {
                                                if (!Q.P().s.b()) {
                                                    if (Q.P().s.ae() == false) return;
                                                }
                                                super.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6, var10_7);
                                            }
                                            var12_9 = var1_1.d();
                                            var13_10 = var1_1.k();
                                            v0 = var13_10.e();
                                            v1 = 1;
                                            if (var11_8 != null) {
                                                if (v0 < v1) return;
                                                v0 = var13_10.b();
                                                v1 = 1;
                                            }
                                            if (var11_8 != null) {
                                                if (v0 < v1) return;
                                                v0 = var13_10.a();
                                                v1 = 1;
                                            }
                                            if (v0 < v1) return;
                                            v2 = var1_1.o();
                                            v3 = r.SAVE;
                                            if (var11_8 == null) break block39;
                                            if (v2 == v3) break block40;
                                            v2 = var1_1.o();
                                            v3 = r.LOAD;
                                        }
                                        if (v2 != v3) return;
                                    }
                                    var14_11 = 0.01;
                                    var16_12 = var12_9.e();
                                    var18_13 = var12_9.a();
                                    var20_14 = var4_3 + (double)var12_9.b() - 0.01;
                                    var22_15 = var20_14 + (double)var13_10.b() + 0.02;
                                    v4 = a.b[var1_1.s().ordinal()];
                                    if (var11_8 == null) ** GOTO lbl46
                                    switch (v4) {
                                        case 1: {
                                            var24_16 = (double)var13_10.e() + 0.02;
                                            var26_17 = -((double)var13_10.a() + 0.02);
                                            if (var11_8 != null) break;
                                        }
                                        case 2: {
                                            var24_16 = -((double)var13_10.e() + 0.02);
                                            var26_17 = (double)var13_10.a() + 0.02;
                                            if (var11_8 != null) break;
                                        }
                                        default: {
                                            v4 = var13_10.e();
lbl46:
                                            // 2 sources

                                            var24_16 = (double)v4 + 0.02;
                                            var26_17 = (double)var13_10.a() + 0.02;
                                        }
                                    }
                                    switch (a.a[var1_1.e().ordinal()]) {
                                        case 1: {
                                            v5 = var26_17;
                                            v6 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl58
                                            if (v5 < v6) {
                                                v7 = var16_12 - 0.01;
                                            } else {
                                                v5 = var16_12 + 1.0;
                                                v6 = 0.01;
lbl58:
                                                // 2 sources

                                                v7 = v5 + v6;
                                            }
                                            var28_18 = var2_2 + v7;
                                            v8 = var24_16;
                                            v9 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl68
                                            if (v8 < v9) {
                                                v10 = var18_13 + 1.0 + 0.01;
                                            } else {
                                                v8 = var18_13;
                                                v9 = 0.01;
lbl68:
                                                // 2 sources

                                                v10 = v8 - v9;
                                            }
                                            var30_19 = var6_4 + v10;
                                            var32_20 = var28_18 - var26_17;
                                            var34_21 = var30_19 + var24_16;
                                            if (var11_8 != null) break;
                                        }
                                        case 2: {
                                            v11 = var24_16;
                                            v12 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl82
                                            if (v11 < v12) {
                                                v13 = var16_12 - 0.01;
                                            } else {
                                                v11 = var16_12 + 1.0;
                                                v12 = 0.01;
lbl82:
                                                // 2 sources

                                                v13 = v11 + v12;
                                            }
                                            var28_18 = var2_2 + v13;
                                            v14 = var26_17;
                                            v15 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl92
                                            if (v14 < v15) {
                                                v16 = var18_13 - 0.01;
                                            } else {
                                                v14 = var18_13 + 1.0;
                                                v15 = 0.01;
lbl92:
                                                // 2 sources

                                                v16 = v14 + v15;
                                            }
                                            var30_19 = var6_4 + v16;
                                            var32_20 = var28_18 - var24_16;
                                            var34_21 = var30_19 - var26_17;
                                            if (var11_8 != null) break;
                                        }
                                        case 3: {
                                            v17 = var26_17;
                                            v18 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl106
                                            if (v17 < v18) {
                                                v19 = var16_12 + 1.0 + 0.01;
                                            } else {
                                                v17 = var16_12;
                                                v18 = 0.01;
lbl106:
                                                // 2 sources

                                                v19 = v17 - v18;
                                            }
                                            var28_18 = var2_2 + v19;
                                            v20 = var24_16;
                                            v21 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl116
                                            if (v20 < v21) {
                                                v22 = var18_13 - 0.01;
                                            } else {
                                                v20 = var18_13 + 1.0;
                                                v21 = 0.01;
lbl116:
                                                // 2 sources

                                                v22 = v20 + v21;
                                            }
                                            var30_19 = var6_4 + v22;
                                            var32_20 = var28_18 + var26_17;
                                            var34_21 = var30_19 - var24_16;
                                            if (var11_8 != null) break;
                                        }
                                        default: {
                                            v23 = var24_16;
                                            v24 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl130
                                            if (v23 < v24) {
                                                v25 = var16_12 + 1.0 + 0.01;
                                            } else {
                                                v23 = var16_12;
                                                v24 = 0.01;
lbl130:
                                                // 2 sources

                                                v25 = v23 - v24;
                                            }
                                            var28_18 = var2_2 + v25;
                                            v26 = var26_17;
                                            v27 = 0.0;
                                            if (var11_8 == null) ** GOTO lbl140
                                            if (v26 < v27) {
                                                v28 = var18_13 + 1.0 + 0.01;
                                            } else {
                                                v26 = var18_13;
                                                v27 = 0.01;
lbl140:
                                                // 2 sources

                                                v28 = v26 - v27;
                                            }
                                            var30_19 = var6_4 + v28;
                                            var32_20 = var28_18 + var24_16;
                                            var34_21 = var30_19 + var26_17;
                                        }
                                    }
                                    var36_22 = 255;
                                    var37_23 = 223;
                                    var38_24 = 127;
                                    var39_25 = W.c();
                                    var40_26 = var39_25.b();
                                    v.C();
                                    v.y();
                                    v.L();
                                    v.a();
                                    v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
                                    v29 = this;
                                    if (var11_8 == null) break block41;
                                    v29.a(true);
                                    if (var1_1.o() == r.SAVE) break block42;
                                    v30 = var1_1;
                                    if (var11_8 == null) break block43;
                                    if (!v30.v()) break block44;
                                }
                                v29 = this;
                            }
                            v29.a(var39_25, var40_26, var28_18, var20_14, var30_19, var32_20, var22_15, var34_21, 255, 223, 127);
                        }
                        v30 = var1_1;
                    }
                    if (var11_8 == null) break block45;
                    if (v30.o() != r.SAVE) break block46;
                    v30 = var1_1;
                }
                v31 = v30.l();
                if (var11_8 == null) break block47;
                if (v31) {
                    this.a(var1_1, var2_2, var4_3, var6_4, var12_9, var39_25, var40_26, true);
                    this.a(var1_1, var2_2, var4_3, var6_4, var12_9, var39_25, var40_26, false);
                }
            }
            this.a(false);
            v.d(1.0f);
            v.j();
            v.x();
            v.t();
            v31 = true;
        }
        v.a(v31);
        v.o();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

