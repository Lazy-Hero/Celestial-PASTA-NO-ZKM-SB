/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.B.a;
import net.minecraft.E.D;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.P.r;
import net.minecraft.Z.i;
import net.minecraft.ao.b;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class O
extends K {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public List<String> a(net.minecraft.R.b var1_1, J var2_2, String[] var3_3, @Nullable n var4_4) {
        block24: {
            block23: {
                block22: {
                    var5_5 = s.b();
                    v0 = var3_3.length;
                    if (var5_5 == null) ** GOTO lbl12
                    if (v0 > 0) {
                        v0 = var3_3.length;
                        v1 = 3;
                        if (var5_5 != null) {
                            if (v0 <= v1) {
                                return O.a(var3_3, 0, var4_4);
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v0 = var3_3.length;
lbl12:
                        // 2 sources

                        v1 = 3;
                    }
                    if (var5_5 != null) {
                        if (v0 > v1) {
                            v0 = var3_3.length;
                            v1 = 6;
                            if (var5_5 != null) {
                                if (v0 <= v1) {
                                    return O.a(var3_3, 3, var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                            v1 = 6;
                        }
                    }
                    if (var5_5 != null) {
                        if (v0 > v1) {
                            v0 = var3_3.length;
                            v1 = 9;
                            if (var5_5 != null) {
                                if (v0 <= v1) {
                                    return O.a(var3_3, 6, var4_4);
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var3_3.length;
                            v1 = 10;
                        }
                    }
                    if (var5_5 != null) {
                        if (v0 == v1) {
                            return O.a(var3_3, new String[]{"replace", "masked", "filtered"});
                        }
                        v0 = var3_3.length;
                        v1 = 11;
                    }
                    if (var5_5 == null) break block22;
                    if (v0 == v1) {
                        return O.a(var3_3, new String[]{"normal", "force", "move"});
                    }
                    v0 = var3_3.length;
                    if (var5_5 == null) break block23;
                    v1 = 12;
                }
                if (v0 != v1) break block24;
                v0 = "filtered".equals(var3_3[9]) ? 1 : 0;
            }
            if (v0 != 0) {
                v2 = O.a(var3_3, net.minecraft.W.K.h.a());
                return v2;
            }
        }
        v2 = Collections.emptyList();
        return v2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.clone.usage";
    }

    @Override
    public String a() {
        return "clone";
    }

    @Override
    public int a() {
        return 2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(net.minecraft.R.b var1_1, J var2_2, String[] var3_3) throws s {
        block90: {
            block89: {
                block104: {
                    block88: {
                        block95: {
                            block98: {
                                block96: {
                                    block97: {
                                        block94: {
                                            block92: {
                                                block93: {
                                                    block91: {
                                                        var4_4 = s.b();
                                                        if (var4_4 != null) {
                                                            if (var3_3.length < 9) {
                                                                throw new z("commands.clone.usage", new Object[0]);
                                                            }
                                                            var2_2.a(d.AFFECTED_BLOCKS, 0);
                                                        }
                                                        var5_5 = O.b(var2_2, var3_3, 0, false);
                                                        var6_6 = O.b(var2_2, var3_3, 3, false);
                                                        var7_7 = O.b(var2_2, var3_3, 6, false);
                                                        var8_8 = new b(var5_5, var6_6);
                                                        var9_9 = new b(var7_7, var7_7.b(var8_8.b()));
                                                        v0 = var10_10 = var8_8.f() * var8_8.c() * var8_8.a();
                                                        if (var4_4 != null) {
                                                            if (v0 > 32768) {
                                                                throw new s("commands.clone.tooManyBlocks", new Object[]{var10_10, 32768});
                                                            }
                                                            v0 = 0;
                                                        }
                                                        var11_11 = v0;
                                                        var12_12 = null;
                                                        var13_13 = null;
                                                        v1 = var3_3.length;
                                                        if (var4_4 == null) ** GOTO lbl31
                                                        if (v1 < 11) ** GOTO lbl-1000
                                                        v1 = "force".equals(var3_3[10]) ? 1 : 0;
                                                        if (var4_4 == null) break block91;
                                                        if (v1 == 0) {
                                                            v1 = "move".equals(var3_3[10]) ? 1 : 0;
                                                            if (var4_4 != null) {
                                                                ** if (v1 != 0) goto lbl-1000
                                                            } else {
                                                                ** GOTO lbl29
                                                            }
                                                        }
                                                        ** GOTO lbl-1000
lbl29:
                                                        // 2 sources

                                                        break block91;
lbl-1000:
                                                        // 2 sources

                                                        {
                                                            v1 = var8_8.b(var9_9) ? 1 : 0;
lbl31:
                                                            // 2 sources

                                                            if (var4_4 != null) {
                                                                if (v1 != 0) {
                                                                    throw new s("commands.clone.noOverlap", new Object[0]);
                                                                } else {
                                                                    ** GOTO lbl-1000
                                                                }
                                                            }
                                                            ** GOTO lbl36
                                                        }
lbl-1000:
                                                        // 4 sources

                                                        {
                                                            v1 = var3_3.length;
                                                        }
                                                    }
                                                    if (var4_4 == null) break block92;
                                                    if (v1 < 11) break block93;
                                                    v1 = "move".equals(var3_3[10]) ? 1 : 0;
                                                    if (var4_4 == null) break block92;
                                                    if (v1 != 0) {
                                                        var11_11 = 1;
                                                    }
                                                }
                                                v1 = var8_8.e;
                                            }
                                            if (var4_4 != null) {
                                                if (v1 < 0) throw new s("commands.clone.outOfWorld", new Object[0]);
                                                v1 = var8_8.b;
                                            }
                                            if (var4_4 != null) {
                                                if (v1 >= 256) throw new s("commands.clone.outOfWorld", new Object[0]);
                                                v1 = var9_9.e;
                                            }
                                            if (var4_4 != null) {
                                                if (v1 < 0) throw new s("commands.clone.outOfWorld", new Object[0]);
                                                v1 = var9_9.b;
                                            }
                                            if (v1 >= 256) throw new s("commands.clone.outOfWorld", new Object[0]);
                                            var14_14 = var2_2.b();
                                            v2 = var14_14.a(var8_8);
                                            if (var4_4 != null) {
                                                if (v2 == false) throw new s("commands.clone.outOfWorld", new Object[0]);
                                                v2 = var14_14.a(var9_9);
                                            }
                                            if (var4_4 != null) {
                                                if (v2 == false) throw new s("commands.clone.outOfWorld", new Object[0]);
                                                v2 = false;
                                            }
                                            var15_15 = v2;
                                            v3 = var3_3.length;
                                            if (var4_4 == null) break block94;
                                            if (v3 < 10) break block95;
                                            v3 = "masked".equals(var3_3[9]) ? 1 : 0;
                                        }
                                        if (var4_4 == null) break block96;
                                        if (v3 == 0) break block97;
                                        var15_15 = true;
                                        if (var4_4 != null) break block95;
                                    }
                                    v3 = "filtered".equals(var3_3[9]) ? 1 : 0;
                                }
                                if (var4_4 == null) break block98;
                                if (v3 == 0) break block95;
                                v3 = var3_3.length;
                            }
                            if (v3 < 12) {
                                throw new z("commands.clone.usage", new Object[0]);
                            }
                            var12_12 = O.b(var2_2, var3_3[11]);
                            if (var3_3.length >= 13) {
                                var13_13 = O.a(var12_12, var3_3[12]);
                            }
                        }
                        var16_16 = Lists.newArrayList();
                        var17_17 = Lists.newArrayList();
                        var18_18 = Lists.newArrayList();
                        var19_19 = Lists.newLinkedList();
                        var20_20 = new n(var9_9.c - var8_8.c, var9_9.e - var8_8.e, var9_9.f - var8_8.f);
                        var21_21 = var8_8.f;
                        block0: while (true) {
                            v4 = var21_21;
                            block1: while (v4 <= var8_8.d) {
                                v5 = var8_8.e;
                                if (var4_4 == null) break block88;
                                var22_24 = v5;
                                block2: while (true) {
                                    v6 = var22_24;
                                    block3: while (v6 <= var8_8.b) {
                                        v4 = var8_8.c;
                                        if (var4_4 == null) continue block1;
                                        for (var23_29 = v1981538; var23_29 <= var8_8.a; ++var23_29) {
                                            block103: {
                                                block102: {
                                                    block100: {
                                                        block101: {
                                                            block99: {
                                                                var24_33 = new n(var23_29, var22_24, var21_21);
                                                                var25_34 = var24_33.b(var20_20);
                                                                var26_35 = var14_14.d((n)var24_33);
                                                                v6 = var15_15 ? 1 : 0;
                                                                if (var4_4 == null) continue block3;
                                                                if (v6 != 0) {
                                                                    v7 = var26_35.b();
                                                                    if (var4_4 != null) {
                                                                        if (v7 == g.bf) continue;
                                                                    }
                                                                } else {
                                                                    v7 = var12_12;
                                                                }
                                                                if (var4_4 == null) break block99;
                                                                if (v7 == null) break block100;
                                                                v7 = var26_35.b();
                                                            }
                                                            if (v7 != var12_12) continue;
                                                            v8 = var13_13;
                                                            if (var4_4 == null) break block101;
                                                            if (v8 == null) break block100;
                                                            v8 = var13_13;
                                                        }
                                                        if (!v8.apply(var26_35)) continue;
                                                    }
                                                    v9 = var27_36 = var14_14.b((n)var24_33);
                                                    if (var4_4 == null) break block102;
                                                    if (v9 == null) break block103;
                                                    v9 = var27_36;
                                                }
                                                var28_37 = v9.a(new r());
                                                var17_17.add(new D((n)var25_34, (i)var26_35, var28_37));
                                                var19_19.addLast(var24_33);
                                                if (var4_4 != null) continue;
                                            }
                                            v10 = var26_35.m();
                                            if (var4_4 != null) {
                                                if (!v10) {
                                                    v10 = var26_35.k();
                                                    if (var4_4 != null) {
                                                        if (!v10) {
                                                            var18_18.add(new D((n)var25_34, (i)var26_35, null));
                                                            var19_19.addFirst(var24_33);
                                                            if (var4_4 != null) continue;
                                                        } else {
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
                                                } else lbl-1000:
                                                // 4 sources

                                                {
                                                    v10 = var16_16.add(new D((n)var25_34, (i)var26_35, null));
                                                }
                                            }
                                            var19_19.addLast(var24_33);
                                            if (var4_4 != null) continue;
                                        }
                                        ++var22_24;
                                        if (var4_4 != null) continue block2;
                                    }
                                    break;
                                }
                                ++var21_21;
                                if (var4_4 != null) continue block0;
                            }
                            break;
                        }
                        v5 = var11_11;
                    }
                    if (v5 == 0) break block104;
                    var21_22 = var19_19.iterator();
                    while (var21_22.hasNext()) {
                        var22_26 = (n)var21_22.next();
                        var23_31 = var14_14.b(var22_26);
                        v11 = var23_31 instanceof a;
                        if (var4_4 != null) {
                            if (var4_4 != null) {
                                if (v11) {
                                    ((a)var23_31).d();
                                }
                                var14_14.a(var22_26, g.ah.d(), 2);
                            }
                            if (var4_4 != null) continue;
                        }
                        ** GOTO lbl176
                    }
                    var21_22 = var19_19.iterator();
                    do {
                        v11 = var21_22.hasNext();
lbl176:
                        // 2 sources

                        if (!v11) break;
                        var22_27 = (n)var21_22.next();
                        var14_14.a(var22_27, g.bf.d(), 3);
                    } while (var4_4 != null);
                }
                var21_23 = Lists.newArrayList();
                var21_23.addAll(var16_16);
                var21_23.addAll(var17_17);
                var21_23.addAll(var18_18);
                var22_28 = Lists.reverse((List)var21_23);
                for (Iterator<E> var24_33 : var22_28) {
                    var25_34 = var14_14.b(var24_33.a);
                    v12 = var25_34 instanceof a;
                    if (var4_4 != null) {
                        if (var4_4 != null) {
                            if (v12 != 0) {
                                ((a)var25_34).d();
                            }
                            var14_14.a(var24_33.a, g.ah.d(), 2);
                        }
                        if (var4_4 != null) continue;
                    }
                    break block89;
                }
                v12 = 0;
            }
            var10_10 = v12;
            var23_32 = var21_23.iterator();
            while (var23_32.hasNext()) {
                var24_33 = (D)var23_32.next();
                v13 = var14_14.a(var24_33.a, var24_33.c, 2);
                if (var4_4 != null) {
                    if (v13) {
                        ++var10_10;
                    }
                    if (var4_4 != null) continue;
                }
                ** GOTO lbl216
            }
            var23_32 = var17_17.iterator();
            do {
                block105: {
                    block106: {
                        v13 = var23_32.hasNext();
lbl216:
                        // 2 sources

                        if (!v13) break;
                        var24_33 = (D)var23_32.next();
                        var25_34 = var14_14.b(var24_33.a);
                        if (var4_4 == null) continue;
                        v14 /* !! */  = var24_33.b;
                        if (var4_4 == null) ** GOTO lbl240
                        if (v14 /* !! */  == null) break block105;
                        v15 = var25_34;
                        if (var4_4 == null) break block106;
                        if (v15 == null) break block105;
                        var24_33.b.b("x", var24_33.a.e());
                        var24_33.b.b("y", var24_33.a.b());
                        var24_33.b.b("z", var24_33.a.a());
                        var25_34.c(var24_33.b);
                        v15 = var25_34;
                    }
                    v15.b();
                }
                var14_14.a(var24_33.a, var24_33.c, 2);
            } while (var4_4 != null);
            var23_32 = var22_28.iterator();
            while (var23_32.hasNext()) {
                v14 /* !! */  = var23_32.next();
lbl240:
                // 2 sources

                var24_33 = (D)v14 /* !! */ ;
                v16 = var14_14;
                if (var4_4 != null) {
                    v16.b(var24_33.a, var24_33.c.b(), false);
                    if (var4_4 != null) continue;
                }
                break block90;
            }
            v16 = var14_14;
        }
        v17 = var23_32 = v16.a(var8_8, false);
        if (var4_4 == null) ** GOTO lbl252
        if (v17 != null) {
            v17 = var23_32;
lbl252:
            // 2 sources

            var24_33 = v17.iterator();
            while (var24_33.hasNext()) {
                var25_34 = (net.minecraft.ah.F)var24_33.next();
                v18 = var8_8.a(var25_34.f) ? 1 : 0;
                if (var4_4 != null) {
                    if (v18 != 0) {
                        var26_35 = var25_34.f.b(var20_20);
                        var14_14.c((n)var26_35, var25_34.a(), (int)(var25_34.b - var14_14.b().x()), var25_34.d);
                    }
                    if (var4_4 != null) continue;
                }
                break;
            }
        } else {
            v18 = var10_10;
        }
        if (v18 <= 0) {
            throw new s("commands.clone.failed", new Object[0]);
        }
        var2_2.a(d.AFFECTED_BLOCKS, var10_10);
        O.a(var2_2, (F)this, "commands.clone.success", new Object[]{var10_10});
        if (m.c() == false) return;
        s.b(new m[3]);
    }
}

