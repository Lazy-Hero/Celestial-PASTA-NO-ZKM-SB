/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.D;
import net.minecraft.W.b2;
import net.minecraft.W.bL;
import net.minecraft.W.bW;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.av;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.p.a;
import net.minecraft.p.b;
import net.minecraft.u.g;

public class e
extends b {
    private static final /* synthetic */ i a;
    private static final /* synthetic */ i d;

    public e(boolean bl2) {
        super(bl2);
    }

    static {
        d = g.aB.d().a(bL.B, D.DARK_OAK);
        a = g.S.d().a(bW.D, D.DARK_OAK).a(b2.A, false);
    }

    private void a(z z2, int n2, int n3, int n4) {
        block0: {
            n n5 = new n(n2, n3, n4);
            c c10 = z2.d(n5).o();
            if (c10 != c.A) break block0;
            this.a(z2, n5, a);
        }
    }

    private void b(z z2, n n2) {
        block3: {
            n n3;
            z z3;
            e e10;
            block2: {
                boolean bl2 = net.minecraft.p.a.d();
                e10 = this;
                z3 = z2;
                n3 = n2;
                if (bl2) break block2;
                if (!e10.a(z3.d(n3).b())) break block3;
                e10 = this;
                z3 = z2;
                n3 = n2;
            }
            e10.a(z3, n3, d);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private boolean a(z z2, n n2, int n3) {
        int n4;
        block10: {
            int n5 = n2.e();
            int n6 = n2.b();
            int n7 = n2.a();
            o o2 = new o();
            int n8 = 0;
            boolean bl2 = net.minecraft.p.a.c();
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 <= n3 + 1) {
                    int n10;
                    int n11 = 1;
                    n4 = n8;
                    if (!bl2) break block10;
                    if (bl2) {
                        if (n4 == 0) {
                            n11 = 0;
                        }
                        n10 = n8;
                    }
                    if (bl2) {
                        if (n10 >= n3 - 1) {
                            n11 = 2;
                        }
                        n10 = -n11;
                    }
                    int n12 = n10;
                    block2: while (true) {
                        int n13 = n12;
                        block3: while (n13 <= n11) {
                            n9 = -n11;
                            if (!bl2) continue block1;
                            for (int i2 = v2054750; i2 <= n11; ++i2) {
                                boolean bl3;
                                n13 = this.a(z2.d(o2.a(n5 + n12, n6 + n8, n7 + i2)).b()) ? 1 : 0;
                                if (!bl2) continue block3;
                                if (bl2) {
                                    if (n13 != 0) continue;
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            ++n12;
                            if (bl2) continue block2;
                        }
                        break;
                    }
                    ++n8;
                    if (bl2) continue block0;
                }
                break;
            }
            n4 = 1;
        }
        return n4 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, n var3_3) {
        block65: {
            block64: {
                block70: {
                    block69: {
                        var5_4 = var2_2.nextInt(3) + var2_2.nextInt(2) + 6;
                        var6_5 = var3_3.e();
                        var7_6 = var3_3.b();
                        var8_7 = var3_3.a();
                        var4_8 = net.minecraft.p.a.d();
                        v0 = var7_6;
                        if (var4_8 != false) return (boolean)v0;
                        if (v0 < 1) return (boolean)0;
                        v0 = var7_6 + var5_4 + 1;
                        if (var4_8 != false) return (boolean)v0;
                        if (v0 >= 256) return (boolean)0;
                        var9_9 = var3_3.k();
                        v1 = var10_10 = var1_1.d(var9_9).b();
                        v2 /* !! */  = g.aU;
                        if (var4_8) break block69;
                        if (v1 == v2 /* !! */ ) break block70;
                        v1 = var10_10;
                        v2 /* !! */  = g.bv;
                    }
                    if (v1 != v2 /* !! */ ) {
                        return false;
                    }
                }
                v3 = this;
                v4 = var1_1;
                v5 = var3_3;
                if (!var4_8) {
                    if (!v3.a(v4, v5, var5_4)) {
                        return false;
                    }
                    this.a(var1_1, var9_9);
                    this.a(var1_1, var9_9.m());
                    this.a(var1_1, var9_9.j());
                    v3 = this;
                    v4 = var1_1;
                    v5 = var9_9.j().m();
                }
                v3.a(v4, v5);
                var11_11 = av.HORIZONTAL.a(var2_2);
                var12_12 = var5_4 - var2_2.nextInt(4);
                var13_13 = 2 - var2_2.nextInt(3);
                var14_14 = var6_5;
                var15_15 = var8_7;
                var16_16 = var7_6 + var5_4 - 1;
                for (var17_17 = 0; var17_17 < var5_4; ++var17_17) {
                    block73: {
                        block71: {
                            block72: {
                                v6 = var17_17;
                                v7 = var12_12;
                                if (var4_8) ** GOTO lbl120
                                if (var4_8) break block71;
                                if (v6 < v7) break block72;
                                v8 = var13_13--;
                                if (var4_8) break block73;
                                if (v8 > 0) {
                                    var14_14 += var11_11.r();
                                    var15_15 += var11_11.i();
                                }
                            }
                            v9 = var7_6;
                            v10 = var17_17;
                        }
                        v8 = v9 + v10;
                    }
                    var18_18 = v8;
                    var19_19 = new n(var14_14, var18_18, var15_15);
                    var20_22 = var1_1.d(var19_19).o();
                    if (!var4_8) {
                        if (var20_22 != c.A && var20_22 != c.J) continue;
                        this.b(var1_1, var19_19);
                        this.b(var1_1, var19_19.m());
                        this.b(var1_1, var19_19.j());
                    }
                    this.b(var1_1, var19_19.m().j());
                    if (!var4_8) continue;
                }
                for (var17_17 = -2; var17_17 <= 0; ++var17_17) {
                    v11 = -2;
                    if (var4_8) break block64;
                    for (var18_18 = v2059685; var18_18 <= 0; ++var18_18) {
                        block76: {
                            block74: {
                                block75: {
                                    var19_20 = -1;
                                    this.a(var1_1, var14_14 + var17_17, var16_16 + var19_20, var15_15 + var18_18);
                                    this.a(var1_1, 1 + var14_14 - var17_17, var16_16 + var19_20, var15_15 + var18_18);
                                    this.a(var1_1, var14_14 + var17_17, var16_16 + var19_20, 1 + var15_15 - var18_18);
                                    this.a(var1_1, 1 + var14_14 - var17_17, var16_16 + var19_20, 1 + var15_15 - var18_18);
                                    v6 = var17_17;
                                    v7 = -2;
                                    if (var4_8) ** GOTO lbl120
                                    if (var4_8) break block74;
                                    if (v6 > v7) break block75;
                                    v12 = var18_18;
                                    v13 = -1;
                                    if (!var4_8) {
                                        if (v12 <= v13) continue;
                                    }
                                    break block74;
                                }
                                v12 = var17_17;
                                if (var4_8) break block76;
                                v13 = -1;
                            }
                            if (v12 == v13) {
                                v12 = var18_18;
                                if (!var4_8) {
                                    if (v12 == -2) continue;
                                }
                            } else {
                                v12 = 1;
                            }
                        }
                        var19_20 = v12;
                        this.a(var1_1, var14_14 + var17_17, var16_16 + var19_20, var15_15 + var18_18);
                        this.a(var1_1, 1 + var14_14 - var17_17, var16_16 + var19_20, var15_15 + var18_18);
                        this.a(var1_1, var14_14 + var17_17, var16_16 + var19_20, 1 + var15_15 - var18_18);
                        this.a(var1_1, 1 + var14_14 - var17_17, var16_16 + var19_20, 1 + var15_15 - var18_18);
                        if (!var4_8) continue;
                    }
                    if (!var4_8) continue;
                }
                v11 = var2_2.nextBoolean() ? 1 : 0;
            }
            if (!var4_8) {
                if (v11 != 0) {
                    this.a(var1_1, var14_14, var16_16 + 2, var15_15);
                    this.a(var1_1, var14_14 + 1, var16_16 + 2, var15_15);
                    this.a(var1_1, var14_14 + 1, var16_16 + 2, var15_15 + 1);
                    this.a(var1_1, var14_14, var16_16 + 2, var15_15 + 1);
                }
                v11 = -3;
            }
            var17_17 = v11;
            block3: while (true) {
                v6 = var17_17;
                v7 = 4;
                block4: while (v6 <= v7) {
                    v14 = -3;
                    if (var4_8) break block65;
                    for (var18_18 = v2059735; var18_18 <= 4; ++var18_18) {
                        block78: {
                            block77: {
                                v6 = var17_17;
                                v7 = -3;
                                if (var4_8) continue block4;
                                if (!var4_8) {
                                    if (v6 == v7) {
                                        v15 = var18_18;
                                        v16 = -3;
                                        if (!var4_8) {
                                            if (v15 == v16) continue;
                                        }
                                    } else {
                                        v15 = var17_17;
                                        v16 = -3;
                                    }
                                }
                                if (!var4_8) {
                                    if (v15 == v16) {
                                        v15 = var18_18;
                                        v16 = 4;
                                        if (!var4_8) {
                                            if (v15 == v16) continue;
                                        }
                                    } else {
                                        v15 = var17_17;
                                        v16 = 4;
                                    }
                                }
                                if (!var4_8) {
                                    if (v15 == v16) {
                                        v15 = var18_18;
                                        v16 = -3;
                                        if (!var4_8) {
                                            if (v15 == v16) continue;
                                        }
                                    } else {
                                        v15 = var17_17;
                                        v16 = 4;
                                    }
                                }
                                if (!var4_8) {
                                    if (v15 == v16) {
                                        v15 = var18_18;
                                        v16 = 4;
                                        if (!var4_8) {
                                            if (v15 == v16) continue;
                                        }
                                    } else {
                                        v15 = Math.abs(var17_17);
                                        v16 = 3;
                                    }
                                }
                                if (var4_8) break block77;
                                if (v15 < v16) break block78;
                                v15 = Math.abs(var18_18);
                                v16 = 3;
                            }
                            if (v15 >= v16) continue;
                        }
                        this.a(var1_1, var14_14 + var17_17, var16_16, var15_15 + var18_18);
                        if (!var4_8) continue;
                    }
                    ++var17_17;
                    if (!var4_8) continue block3;
                }
                break;
            }
            v14 = -1;
        }
        var17_17 = v14;
        do {
            v17 = var17_17;
            block7: while (true) {
                if (v17 > 2) return (boolean)1;
                v18 = -1;
                if (var4_8 != false) return (boolean)v18;
                var18_18 = v18;
                block8: while (true) {
                    v19 = var18_18;
                    block9: while (v19 <= 2) {
                        block81: {
                            block67: {
                                block66: {
                                    block82: {
                                        block79: {
                                            block80: {
                                                v17 = var17_17;
                                                if (var4_8) continue block7;
                                                if (var4_8) break block79;
                                                if (v17 < 0) break block80;
                                                v20 = var17_17;
                                                if (var4_8) break block79;
                                                if (v20 > 1) break block80;
                                                v20 = var18_18;
                                                if (var4_8) break block79;
                                                if (v20 < 0) break block80;
                                                v20 = var18_18;
                                                if (var4_8) break block79;
                                                if (v20 <= 1) break block81;
                                            }
                                            v20 = var2_2.nextInt(3);
                                        }
                                        if (var4_8) break block82;
                                        if (v20 > 0) break block81;
                                        v20 = var2_2.nextInt(3) + 2;
                                    }
                                    var19_21 = v20;
                                    for (var20_23 = 0; var20_23 < var19_21; ++var20_23) {
                                        this.b(var1_1, new n(var6_5 + var17_17, var16_16 - var20_23 - 1, var8_7 + var18_18));
                                        if (!var4_8) {
                                            if (!var4_8) continue;
                                        }
                                        break block66;
                                    }
                                    var20_23 = -1;
                                }
                                while (var20_23 <= 1) {
                                    block68: {
                                        v21 = -1;
                                        if (var4_8) break block67;
                                        for (var21_24 = v2059806; var21_24 <= 1; ++var21_24) {
                                            this.a(var1_1, var14_14 + var17_17 + var20_23, var16_16, var15_15 + var18_18 + var21_24);
                                            if (!var4_8) {
                                                if (!var4_8) continue;
                                            }
                                            break block68;
                                        }
                                        ++var20_23;
                                    }
                                    if (!var4_8) continue;
                                }
                                v21 = -2;
                            }
                            var20_23 = v21;
                            block13: while (true) {
                                v22 = var20_23;
                                v23 = 2;
                                block14: while (v22 <= v23) {
                                    v19 = -2;
                                    if (var4_8) continue block9;
                                    for (var21_24 = v2059740; var21_24 <= 2; ++var21_24) {
                                        block84: {
                                            block83: {
                                                v22 = Math.abs(var20_23);
                                                v23 = 2;
                                                if (var4_8) continue block14;
                                                if (var4_8) break block83;
                                                if (v22 != v23) break block84;
                                                v24 = Math.abs(var21_24);
                                                v25 = 2;
                                            }
                                            if (v24 == v25) continue;
                                        }
                                        this.a(var1_1, var14_14 + var17_17 + var20_23, var16_16 - 1, var15_15 + var18_18 + var21_24);
                                        if (!var4_8) continue;
                                    }
                                    ++var20_23;
                                    if (!var4_8) continue block13;
                                }
                                break;
                            }
                        }
                        ++var18_18;
                        if (!var4_8) continue block8;
                    }
                    break block7;
                    break;
                }
                break;
            }
            ++var17_17;
        } while (!var4_8);
        return (boolean)1;
    }
}

