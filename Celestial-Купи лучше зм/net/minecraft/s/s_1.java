/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.S;

import net.minecraft.A.h;
import net.minecraft.A.p;
import net.minecraft.A.q;
import net.minecraft.S.b;
import net.minecraft.S.d;
import net.minecraft.k.m;

public class s
extends d {
    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int[] a(int var1_1, int var2_2, int var3_3, int var4_4) {
        var6_5 = this.f.a(var1_1 - 1, var2_2 - 1, var3_3 + 2, var4_4 + 2);
        var7_6 = b.a(var3_3 * var4_4);
        var8_7 = 0;
        var5_8 = d.b();
        do {
            v0 = var8_7;
            v1 = var4_4;
            block1: while (true) {
                if (v0 >= v1) return var7_6;
                for (var9_9 = 0; var9_9 < var3_3; ++var9_9) {
                    block43: {
                        block66: {
                            block58: {
                                block63: {
                                    block65: {
                                        block64: {
                                            block62: {
                                                block61: {
                                                    block60: {
                                                        block59: {
                                                            block57: {
                                                                block45: {
                                                                    block46: {
                                                                        block48: {
                                                                            block56: {
                                                                                block53: {
                                                                                    block55: {
                                                                                        block54: {
                                                                                            block52: {
                                                                                                block51: {
                                                                                                    block50: {
                                                                                                        block49: {
                                                                                                            block47: {
                                                                                                                block44: {
                                                                                                                    block42: {
                                                                                                                        block31: {
                                                                                                                            block41: {
                                                                                                                                block33: {
                                                                                                                                    block38: {
                                                                                                                                        block40: {
                                                                                                                                            block39: {
                                                                                                                                                block37: {
                                                                                                                                                    block36: {
                                                                                                                                                        block35: {
                                                                                                                                                            block34: {
                                                                                                                                                                block32: {
                                                                                                                                                                    block30: {
                                                                                                                                                                        block24: {
                                                                                                                                                                            block29: {
                                                                                                                                                                                block26: {
                                                                                                                                                                                    block28: {
                                                                                                                                                                                        block27: {
                                                                                                                                                                                            block25: {
                                                                                                                                                                                                block23: {
                                                                                                                                                                                                    this.a((long)(var9_9 + var1_1), (long)(var8_7 + var2_2));
                                                                                                                                                                                                    var10_10 = var6_5[var9_9 + 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                                                                                                                    var11_11 = h.b(var10_10);
                                                                                                                                                                                                    v2 = var10_10;
                                                                                                                                                                                                    if (var5_8 == null) break block23;
                                                                                                                                                                                                    v1 = h.b(net.minecraft.u.d.v);
                                                                                                                                                                                                    if (var5_8 == null) continue block1;
                                                                                                                                                                                                    if (v2 != v1) break block24;
                                                                                                                                                                                                    v2 = var6_5[var9_9 + 1 + (var8_7 + 1 - 1) * (var3_3 + 2)];
                                                                                                                                                                                                }
                                                                                                                                                                                                var12_12 = v2;
                                                                                                                                                                                                var13_13 = var6_5[var9_9 + 1 + 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                                                                                                                var14_14 = var6_5[var9_9 + 1 - 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                                                                                                                var15_15 = var6_5[var9_9 + 1 + (var8_7 + 1 + 1) * (var3_3 + 2)];
                                                                                                                                                                                                v3 = var12_12;
                                                                                                                                                                                                v4 = h.b(net.minecraft.u.d.e);
                                                                                                                                                                                                if (var5_8 == null) break block25;
                                                                                                                                                                                                if (v3 == v4) break block26;
                                                                                                                                                                                                v3 = var13_13;
                                                                                                                                                                                                v4 = h.b(net.minecraft.u.d.e);
                                                                                                                                                                                            }
                                                                                                                                                                                            if (var5_8 == null) break block27;
                                                                                                                                                                                            if (v3 == v4) break block26;
                                                                                                                                                                                            v3 = var14_14;
                                                                                                                                                                                            v4 = h.b(net.minecraft.u.d.e);
                                                                                                                                                                                        }
                                                                                                                                                                                        if (var5_8 == null) break block28;
                                                                                                                                                                                        if (v3 == v4) break block26;
                                                                                                                                                                                        v3 = var15_15;
                                                                                                                                                                                        v4 = h.b(net.minecraft.u.d.e);
                                                                                                                                                                                    }
                                                                                                                                                                                    if (v3 == v4) break block26;
                                                                                                                                                                                    var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                                                                                                                                                                    if (var5_8 != null) break block29;
                                                                                                                                                                                }
                                                                                                                                                                                var7_6[var9_9 + var8_7 * var3_3] = h.b(net.minecraft.u.d.i);
                                                                                                                                                                            }
                                                                                                                                                                            if (var5_8 != null) continue;
                                                                                                                                                                        }
                                                                                                                                                                        v5 = var11_11;
                                                                                                                                                                        if (var5_8 == null) break block30;
                                                                                                                                                                        if (v5 == null) break block31;
                                                                                                                                                                        v5 = var11_11;
                                                                                                                                                                    }
                                                                                                                                                                    if (v5.i() != p.class) break block31;
                                                                                                                                                                    var12_12 = var6_5[var9_9 + 1 + (var8_7 + 1 - 1) * (var3_3 + 2)];
                                                                                                                                                                    var13_13 = var6_5[var9_9 + 1 + 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                                                                                    var14_14 = var6_5[var9_9 + 1 - 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                                                                                    var15_15 = var6_5[var9_9 + 1 + (var8_7 + 1 + 1) * (var3_3 + 2)];
                                                                                                                                                                    v6 = this.c(var12_12);
                                                                                                                                                                    if (var5_8 == null) break block32;
                                                                                                                                                                    if (!v6) break block33;
                                                                                                                                                                    v6 = this.c(var13_13);
                                                                                                                                                                }
                                                                                                                                                                if (var5_8 == null) break block34;
                                                                                                                                                                if (!v6) break block33;
                                                                                                                                                                v6 = this.c(var14_14);
                                                                                                                                                            }
                                                                                                                                                            if (var5_8 == null) break block35;
                                                                                                                                                            if (!v6) break block33;
                                                                                                                                                            v6 = this.c(var15_15);
                                                                                                                                                        }
                                                                                                                                                        if (var5_8 == null) break block36;
                                                                                                                                                        if (!v6) break block33;
                                                                                                                                                        v6 = s.b(var12_12);
                                                                                                                                                    }
                                                                                                                                                    if (var5_8 == null) break block37;
                                                                                                                                                    if (v6) break block38;
                                                                                                                                                    v6 = s.b(var13_13);
                                                                                                                                                }
                                                                                                                                                if (var5_8 == null) break block39;
                                                                                                                                                if (v6) break block38;
                                                                                                                                                v6 = s.b(var14_14);
                                                                                                                                            }
                                                                                                                                            if (var5_8 == null) break block40;
                                                                                                                                            if (v6) break block38;
                                                                                                                                            v6 = s.b(var15_15);
                                                                                                                                        }
                                                                                                                                        if (v6) break block38;
                                                                                                                                        var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                                                                                                                        if (var5_8 != null) break block41;
                                                                                                                                    }
                                                                                                                                    var7_6[var9_9 + var8_7 * var3_3] = h.b(net.minecraft.u.d.af);
                                                                                                                                    if (var5_8 != null) break block41;
                                                                                                                                }
                                                                                                                                var7_6[var9_9 + var8_7 * var3_3] = h.b(net.minecraft.u.d.j);
                                                                                                                            }
                                                                                                                            if (var5_8 != null) continue;
                                                                                                                        }
                                                                                                                        v7 = var10_10;
                                                                                                                        v8 = h.b(net.minecraft.u.d.W);
                                                                                                                        if (var5_8 == null) break block42;
                                                                                                                        if (v7 == v8) break block43;
                                                                                                                        v7 = var10_10;
                                                                                                                        v8 = h.b(net.minecraft.u.d.U);
                                                                                                                    }
                                                                                                                    if (var5_8 == null) break block44;
                                                                                                                    if (v7 == v8) break block43;
                                                                                                                    v7 = var10_10;
                                                                                                                    v8 = h.b(net.minecraft.u.d.F);
                                                                                                                }
                                                                                                                if (v7 == v8) break block43;
                                                                                                                v9 = var11_11;
                                                                                                                if (var5_8 == null) ** GOTO lbl117
                                                                                                                if (v9 != null) {
                                                                                                                    v9 = var11_11;
lbl117:
                                                                                                                    // 2 sources

                                                                                                                    v10 = v9.d();
                                                                                                                    if (var5_8 != null) {
                                                                                                                        if (v10 != 0) {
                                                                                                                            this.a(var6_5, var7_6, var9_9, var8_7, var3_3, var10_10, h.b(net.minecraft.u.d.K));
                                                                                                                            if (var5_8 != null) continue;
                                                                                                                        } else {
                                                                                                                            ** GOTO lbl-1000
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else lbl-1000:
                                                                                                                // 4 sources

                                                                                                                {
                                                                                                                    v10 = var10_10;
                                                                                                                }
                                                                                                                if (var5_8 == null) break block45;
                                                                                                                if (v10 == h.b(net.minecraft.u.d.C)) break block46;
                                                                                                                v10 = var10_10;
                                                                                                                if (var5_8 == null) break block45;
                                                                                                                if (v10 == h.b(net.minecraft.u.d.t)) break block46;
                                                                                                                v11 = var10_10;
                                                                                                                v12 = h.b(net.minecraft.u.d.e);
                                                                                                                if (var5_8 == null) break block47;
                                                                                                                if (v11 == v12) break block48;
                                                                                                                v11 = var10_10;
                                                                                                                v12 = h.b(net.minecraft.u.d.J);
                                                                                                            }
                                                                                                            if (var5_8 == null) break block49;
                                                                                                            if (v11 == v12) break block48;
                                                                                                            v11 = var10_10;
                                                                                                            v12 = h.b(net.minecraft.u.d.d);
                                                                                                        }
                                                                                                        if (var5_8 == null) break block50;
                                                                                                        if (v11 == v12) break block48;
                                                                                                        v11 = var10_10;
                                                                                                        if (var5_8 == null) break block51;
                                                                                                        v12 = h.b(net.minecraft.u.d.n);
                                                                                                    }
                                                                                                    if (v11 == v12) break block48;
                                                                                                    v11 = var6_5[var9_9 + 1 + (var8_7 + 1 - 1) * (var3_3 + 2)];
                                                                                                }
                                                                                                var12_12 = v11;
                                                                                                var13_13 = var6_5[var9_9 + 1 + 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                var14_14 = var6_5[var9_9 + 1 - 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                                                var15_15 = var6_5[var9_9 + 1 + (var8_7 + 1 + 1) * (var3_3 + 2)];
                                                                                                v13 = s.b(var12_12);
                                                                                                if (var5_8 == null) break block52;
                                                                                                if (v13) break block53;
                                                                                                v13 = s.b(var13_13);
                                                                                            }
                                                                                            if (var5_8 == null) break block54;
                                                                                            if (v13) break block53;
                                                                                            v13 = s.b(var14_14);
                                                                                        }
                                                                                        if (var5_8 == null) break block55;
                                                                                        if (v13) break block53;
                                                                                        v13 = s.b(var15_15);
                                                                                    }
                                                                                    if (v13) break block53;
                                                                                    var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                                                                    if (var5_8 != null) break block56;
                                                                                }
                                                                                var7_6[var9_9 + var8_7 * var3_3] = h.b(net.minecraft.u.d.af);
                                                                            }
                                                                            if (var5_8 != null) continue;
                                                                        }
                                                                        var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                                                        if (var5_8 != null) continue;
                                                                    }
                                                                    v10 = var6_5[var9_9 + 1 + (var8_7 + 1 - 1) * (var3_3 + 2)];
                                                                }
                                                                var12_12 = v10;
                                                                var13_13 = var6_5[var9_9 + 1 + 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                var14_14 = var6_5[var9_9 + 1 - 1 + (var8_7 + 1) * (var3_3 + 2)];
                                                                var15_15 = var6_5[var9_9 + 1 + (var8_7 + 1 + 1) * (var3_3 + 2)];
                                                                v14 = s.b(var12_12);
                                                                if (var5_8 == null) break block57;
                                                                if (v14) break block58;
                                                                v14 = s.b(var13_13);
                                                            }
                                                            if (var5_8 == null) break block59;
                                                            if (v14) break block58;
                                                            v14 = s.b(var14_14);
                                                        }
                                                        if (var5_8 == null) break block60;
                                                        if (v14) break block58;
                                                        v14 = s.b(var15_15);
                                                    }
                                                    if (var5_8 == null) break block61;
                                                    if (v14) break block58;
                                                    v14 = this.a(var12_12);
                                                }
                                                if (var5_8 == null) break block62;
                                                if (!v14) break block63;
                                                v14 = this.a(var13_13);
                                            }
                                            if (var5_8 == null) break block64;
                                            if (!v14) break block63;
                                            v14 = this.a(var14_14);
                                        }
                                        if (var5_8 == null) break block65;
                                        if (!v14) break block63;
                                        v14 = this.a(var15_15);
                                    }
                                    if (!v14) break block63;
                                    var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                                    if (var5_8 != null) break block66;
                                }
                                var7_6[var9_9 + var8_7 * var3_3] = h.b(net.minecraft.u.d.ab);
                                if (var5_8 != null) break block66;
                            }
                            var7_6[var9_9 + var8_7 * var3_3] = var10_10;
                        }
                        if (var5_8 != null) continue;
                    }
                    this.a(var6_5, var7_6, var9_9, var8_7, var3_3, var10_10, h.b(net.minecraft.u.d.a));
                    if (var5_8 != null) continue;
                }
                break;
            }
            ++var8_7;
        } while (var5_8 != null);
        return var7_6;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean c(int var1_1) {
        var2_2 = d.b();
        v0 = var1_1;
        if (var2_2 != null) {
            if (h.b(v0) != null) {
                v0 = var1_1;
                if (var2_2 != null) {
                    if (h.b(v0).i() == p.class) {
                        return true;
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
        if (var2_2 == null) return (boolean)v0;
        if (v0 == h.b(net.minecraft.u.d.j)) return (boolean)1;
        v0 = var1_1;
        if (var2_2 == null) return (boolean)v0;
        if (v0 == h.b(net.minecraft.u.d.l)) return (boolean)1;
        v0 = var1_1;
        if (var2_2 == null) return (boolean)v0;
        if (v0 == h.b(net.minecraft.u.d.r)) return (boolean)1;
        v0 = var1_1;
        if (var2_2 == null) return (boolean)v0;
        if (v0 == h.b(net.minecraft.u.d.L)) return (boolean)1;
        v0 = var1_1;
        if (var2_2 == null) return (boolean)v0;
        if (v0 == h.b(net.minecraft.u.d.Z)) return (boolean)1;
        v0 = s.b(var1_1) ? 1 : 0;
        if (var2_2 == null) return (boolean)v0;
        if (v0 != 0) return (boolean)1;
        return (boolean)0;
    }

    public s(long l2, d d10) {
        super(l2);
        this.f = d10;
    }

    private void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6) {
        block2: {
            block4: {
                boolean bl2;
                m[] arrm;
                block6: {
                    int n7;
                    block5: {
                        int n8;
                        block3: {
                            int n9;
                            block0: {
                                block1: {
                                    arrm = d.b();
                                    n9 = s.b(n5);
                                    if (arrm == null) break block0;
                                    if (n9 == 0) break block1;
                                    arrn2[n2 + n3 * n4] = n5;
                                    if (arrm != null) break block2;
                                }
                                n9 = arrn[n2 + 1 + (n3 + 1 - 1) * (n4 + 2)];
                            }
                            int n10 = n9;
                            int n11 = arrn[n2 + 1 + 1 + (n3 + 1) * (n4 + 2)];
                            n8 = arrn[n2 + 1 - 1 + (n3 + 1) * (n4 + 2)];
                            n7 = arrn[n2 + 1 + (n3 + 1 + 1) * (n4 + 2)];
                            bl2 = s.b(n10);
                            if (arrm == null) break block3;
                            if (bl2) break block4;
                            bl2 = s.b(n11);
                        }
                        if (arrm == null) break block5;
                        if (bl2) break block4;
                        bl2 = s.b(n8);
                    }
                    if (arrm == null) break block6;
                    if (bl2) break block4;
                    bl2 = s.b(n7);
                }
                if (bl2) break block4;
                arrn2[n2 + n3 * n4] = n5;
                if (arrm != null) break block2;
            }
            arrn2[n2 + n3 * n4] = n6;
        }
    }

    private boolean a(int n2) {
        return h.b(n2) instanceof q;
    }
}

