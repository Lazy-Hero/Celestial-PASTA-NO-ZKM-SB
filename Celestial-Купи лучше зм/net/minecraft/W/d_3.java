/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Multimap
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.I.c;
import net.minecraft.J.l;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ab.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.av.g;
import net.minecraft.ax.C;
import net.minecraft.ax.T;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.h;
import net.minecraft.w.k;
import net.minecraft.x.e;

public final class d {
    public static final /* synthetic */ d m;
    private /* synthetic */ l a;
    private /* synthetic */ int j;
    private /* synthetic */ int e;
    private /* synthetic */ boolean b;
    private final /* synthetic */ k i;
    private /* synthetic */ boolean k;
    private /* synthetic */ K l;
    private static /* synthetic */ String d;
    private /* synthetic */ r n;
    public /* synthetic */ int g;
    public static final /* synthetic */ DecimalFormat h;
    private /* synthetic */ boolean f;
    private /* synthetic */ K c;

    public void c(int n2) {
        this.g = n2;
        this.s();
    }

    public boolean a(i i2) {
        return this.w().a(i2);
    }

    public static boolean c(d d10, d d11) {
        if (d10 == d11) {
            return true;
        }
        return !d10.G() && !d11.G() && d10.c(d11);
    }

    public int d() {
        return this.j;
    }

    public d(k k2, int n2) {
        this(k2, n2, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public r c(String string) {
        int n2 = bl.g();
        r r2 = this.n;
        if (n2 != 0) {
            if (r2 == null) return null;
            r2 = this.n;
        }
        String string2 = string;
        if (n2 != 0) {
            if (!r2.a(string2, 10)) return null;
            r2 = this.n;
            string2 = string;
        }
        r r3 = r2.h(string2);
        return r3;
    }

    public d(k k2, int n2, int n3) {
        this.i = k2;
        this.j = n3;
        this.g = n2;
        if (this.j < 0) {
            this.j = 0;
        }
        this.s();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(d var0, d var1_1) {
        var2_2 = bl.g();
        v0 = var0.G();
        if (var2_2 != 0) {
            if (v0) {
                v0 = var1_1.G();
                if (var2_2 != 0) {
                    if (v0) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var0.G();
            }
        }
        if (var2_2 != 0) {
            if (v0 != false) return false;
            v0 = var1_1.G();
        }
        if (var2_2 != 0) {
            if (v0 != false) return false;
            v0 = var0.a(var1_1);
        }
        if (var2_2 == 0) return v0;
        if (v0 == false) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int t() {
        int n2 = bl.g();
        d d10 = this;
        if (n2 != 0) {
            if (d10.f) {
                return 0;
            }
            d10 = this;
        }
        int n3 = d10.g;
        return n3;
    }

    public void b(int n2) {
        this.g(-n2);
    }

    public float b(i i2) {
        return this.w().a(this, i2);
    }

    public int E() {
        return this.w().e();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public List<String> a(@Nullable j var1_1, o var2_2) {
        block87: {
            block131: {
                block127: {
                    block128: {
                        block123: {
                            block124: {
                                block121: {
                                    block122: {
                                        block85: {
                                            block84: {
                                                block106: {
                                                    block105: {
                                                        block102: {
                                                            block103: {
                                                                block104: {
                                                                    block101: {
                                                                        block100: {
                                                                            block99: {
                                                                                block97: {
                                                                                    block98: {
                                                                                        block95: {
                                                                                            block96: {
                                                                                                block94: {
                                                                                                    block93: {
                                                                                                        block88: {
                                                                                                            block89: {
                                                                                                                block92: {
                                                                                                                    block91: {
                                                                                                                        block90: {
                                                                                                                            var4_3 = Lists.newArrayList();
                                                                                                                            var3_4 = bl.g();
                                                                                                                            var5_5 = this.g();
                                                                                                                            v0 = this.c();
                                                                                                                            if (var3_4 != 0) {
                                                                                                                                if (v0 != 0) {
                                                                                                                                    var5_5 = (Object)net.minecraft.at.l.ITALIC + var5_5;
                                                                                                                                }
                                                                                                                                var5_5 = var5_5 + (Object)net.minecraft.at.l.RESET;
                                                                                                                                v0 = var2_2.a();
                                                                                                                            }
                                                                                                                            if (var3_4 == 0) break block88;
                                                                                                                            if (v0 == 0) break block89;
                                                                                                                            var6_6 = "";
                                                                                                                            v1 = var5_5.isEmpty();
                                                                                                                            if (var3_4 != 0) {
                                                                                                                                if (v1 == 0) {
                                                                                                                                    var5_5 = var5_5 + " (";
                                                                                                                                    var6_6 = ")";
                                                                                                                                }
                                                                                                                                v1 = var7_8 = net.minecraft.w.k.a(this.i);
                                                                                                                            }
                                                                                                                            if (var3_4 == 0) break block90;
                                                                                                                            if (!this.z()) break block91;
                                                                                                                            var5_5 = var5_5 + String.format("#%04d/%d%s", new Object[]{var7_8, this.j, var6_6});
                                                                                                                        }
                                                                                                                        if (var3_4 != 0) break block92;
                                                                                                                    }
                                                                                                                    var5_5 = var5_5 + String.format("#%04d%s", new Object[]{var7_8, var6_6});
                                                                                                                }
                                                                                                                if (var3_4 != 0) break block93;
                                                                                                            }
                                                                                                            v0 = this.c();
                                                                                                        }
                                                                                                        if (var3_4 == 0) break block94;
                                                                                                        if (v0 == 0 && this.i == net.minecraft.u.h.a9) {
                                                                                                            var5_5 = var5_5 + " #" + this.j;
                                                                                                        }
                                                                                                    }
                                                                                                    var4_3.add(var5_5);
                                                                                                    v0 = 0;
                                                                                                }
                                                                                                var6_7 = v0;
                                                                                                v2 = this.x();
                                                                                                if (var3_4 == 0) break block95;
                                                                                                if (v2 == 0) break block96;
                                                                                                v2 = this.n.a("HideFlags", 99) ? 1 : 0;
                                                                                                if (var3_4 == 0) break block95;
                                                                                                if (v2 != 0) {
                                                                                                    var6_7 = this.n.m("HideFlags");
                                                                                                }
                                                                                            }
                                                                                            v2 = var6_7 & 32;
                                                                                        }
                                                                                        if (var3_4 == 0) break block97;
                                                                                        if (v2 != 0) break block98;
                                                                                        v3 = this.w();
                                                                                        v4 = var1_1;
                                                                                        if (var3_4 == 0) ** GOTO lbl59
                                                                                        if (v4 == null) {
                                                                                            v5 = null;
                                                                                        } else {
                                                                                            v4 = var1_1;
lbl59:
                                                                                            // 2 sources

                                                                                            v5 = v4.aG;
                                                                                        }
                                                                                        v3.a(this, v5, var4_3, var2_2);
                                                                                    }
                                                                                    v2 = this.x() ? 1 : 0;
                                                                                }
                                                                                if (var3_4 == 0) break block99;
                                                                                if (v2 == 0) break block84;
                                                                                v2 = var6_7 & 1;
                                                                            }
                                                                            if (var3_4 == 0) break block100;
                                                                            if (v2 == 0) {
                                                                                var7_9 = this.D();
                                                                                var8_12 = 0;
                                                                                while (var8_12 < var7_9.b()) {
                                                                                    var9_15 = var7_9.d(var8_12);
                                                                                    var10_19 = var9_15.q("id");
                                                                                    var11_21 = var9_15.q("lvl");
                                                                                    var12_23 = net.minecraft.ax.u.c(var10_19);
                                                                                    if (var3_4 != 0) {
                                                                                        if (var3_4 != 0) {
                                                                                            if (var12_23 != null) {
                                                                                                var4_3.add(var12_23.d(var11_21));
                                                                                            }
                                                                                            ++var8_12;
                                                                                        }
                                                                                        if (var3_4 != 0) continue;
                                                                                    }
                                                                                    break block84;
                                                                                }
                                                                            }
                                                                            v6 = this.n;
                                                                            v7 = "display";
                                                                            if (var3_4 == 0) break block101;
                                                                            v2 = v6.a(v7, 10) ? 1 : 0;
                                                                        }
                                                                        if (v2 == 0) break block84;
                                                                        v6 = this.n;
                                                                        v7 = "display";
                                                                    }
                                                                    var7_10 = v6.h(v7);
                                                                    v8 = var7_10.a("color", 3);
                                                                    if (var3_4 == 0) break block102;
                                                                    if (v8 == 0) break block103;
                                                                    v9 = var2_2.a();
                                                                    if (var3_4 == 0) break block103;
                                                                    if (!v9) break block104;
                                                                    var4_3.add(net.minecraft.ab.a.a("item.color", new Object[]{String.format("#%06X", new Object[]{var7_10.m("color")})}));
                                                                    if (var3_4 != 0) break block103;
                                                                }
                                                                v9 = var4_3.add((Object)net.minecraft.at.l.ITALIC + net.minecraft.ab.a.a("item.dyed"));
                                                            }
                                                            v10 = var7_10;
                                                            v11 = "Lore";
                                                            if (var3_4 == 0) break block105;
                                                            v8 = v10.i(v11);
                                                        }
                                                        if (v8 != 9) break block84;
                                                        v10 = var7_10;
                                                        v11 = "Lore";
                                                    }
                                                    var8_13 = v10.c(v11, 8);
                                                    v12 = var8_13.c();
                                                    if (var3_4 == 0) break block106;
                                                    if (v12 != 0) break block84;
                                                    v12 = var9_16 = 0;
                                                }
                                                while (var9_16 < var8_13.b()) {
                                                    var4_3.add((Object)net.minecraft.at.l.DARK_PURPLE + "" + (Object)net.minecraft.at.l.ITALIC + var8_13.c(var9_16));
                                                    ++var9_16;
                                                    if (var3_4 != 0) continue;
                                                }
                                            }
                                            var7_11 = X.values();
                                            var8_14 = ((X[])var7_11).length;
                                            var9_17 = 0;
                                            while (var9_17 < var8_14) {
                                                block86: {
                                                    block107: {
                                                        block108: {
                                                            var10_20 = var7_11[var9_17];
                                                            var11_22 = this.a(var10_20);
                                                            if (var3_4 == 0) break block86;
                                                            v13 = var11_22.isEmpty();
                                                            if (var3_4 == 0) break block85;
                                                            if (v13 != 0) break block107;
                                                            v14 = var6_7 & 2;
                                                            if (var3_4 == 0) break block108;
                                                            if (v14 != 0) break block107;
                                                            var4_3.add("");
                                                            v14 = var4_3.add(net.minecraft.ab.a.a("item.modifiers." + var10_20.c())) ? 1 : 0;
                                                        }
                                                        for (Map.Entry var13_24 : var11_22.entries()) {
                                                            block118: {
                                                                block119: {
                                                                    block120: {
                                                                        block116: {
                                                                            block117: {
                                                                                block115: {
                                                                                    block114: {
                                                                                        block113: {
                                                                                            block112: {
                                                                                                block109: {
                                                                                                    block110: {
                                                                                                        block111: {
                                                                                                            var14_25 = (net.minecraft.j.f)var13_24.getValue();
                                                                                                            var15_26 = var14_25.f();
                                                                                                            var17_27 = 0;
                                                                                                            if (var3_4 == 0) break block86;
                                                                                                            if (var1_1 == null) break block109;
                                                                                                            v15 = var14_25.c();
                                                                                                            v16 = net.minecraft.w.k.h;
                                                                                                            if (var3_4 == 0) break block110;
                                                                                                            if (v15 != v16) break block111;
                                                                                                            var15_26 += var1_1.a(M.g).a();
                                                                                                            var15_26 += (double)T.a(this, net.minecraft.U.g.UNDEFINED);
                                                                                                            var17_27 = 1;
                                                                                                            if (var3_4 != 0) break block109;
                                                                                                        }
                                                                                                        v17 = var14_25;
                                                                                                        if (var3_4 == 0) break block112;
                                                                                                        v15 = v17.c();
                                                                                                        v16 = net.minecraft.w.k.b;
                                                                                                    }
                                                                                                    if (v15 == v16) {
                                                                                                        var15_26 += var1_1.a(M.j).a();
                                                                                                        var17_27 = 1;
                                                                                                    }
                                                                                                }
                                                                                                v17 = var14_25;
                                                                                            }
                                                                                            v18 = v17.e();
                                                                                            v19 = 1;
                                                                                            if (var3_4 == 0) break block113;
                                                                                            if (v18 == v19) break block114;
                                                                                            v18 = var14_25.e();
                                                                                            v19 = 2;
                                                                                        }
                                                                                        if (v18 == v19) break block114;
                                                                                        var18_28 = var15_26;
                                                                                        if (var3_4 != 0) break block115;
                                                                                    }
                                                                                    var18_28 = var15_26 * 100.0;
                                                                                }
                                                                                v20 = var17_27;
                                                                                if (var3_4 == 0) break block116;
                                                                                if (v20 == 0) break block117;
                                                                                var4_3.add(" " + net.minecraft.ab.a.a("attribute.modifier.equals." + var14_25.e(), new Object[]{net.minecraft.w.d.h.format(var18_28), net.minecraft.ab.a.a("attribute.name." + (String)var13_24.getKey())}));
                                                                                if (var3_4 != 0) break block118;
                                                                            }
                                                                            v20 = (cfr_temp_0 = var15_26 - 0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                        }
                                                                        if (var3_4 == 0) break block119;
                                                                        if (v20 <= 0) break block120;
                                                                        var4_3.add((Object)net.minecraft.at.l.BLUE + " " + net.minecraft.ab.a.a("attribute.modifier.plus." + var14_25.e(), new Object[]{net.minecraft.w.d.h.format(var18_28), net.minecraft.ab.a.a("attribute.name." + (String)var13_24.getKey())}));
                                                                        if (var3_4 != 0) break block118;
                                                                    }
                                                                    v20 = (cfr_temp_1 = var15_26 - 0.0) == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                                                                }
                                                                if (var3_4 != 0 && v20 < 0) {
                                                                    v20 = var4_3.add((Object)net.minecraft.at.l.RED + " " + net.minecraft.ab.a.a("attribute.modifier.take." + var14_25.e(), new Object[]{net.minecraft.w.d.h.format(var18_28 *= -1.0), net.minecraft.ab.a.a("attribute.name." + (String)var13_24.getKey())})) ? 1 : 0;
                                                                }
                                                            }
                                                            if (var3_4 != 0) continue;
                                                        }
                                                    }
                                                    ++var9_17;
                                                }
                                                if (var3_4 != 0) continue;
                                            }
                                            v13 = this.x();
                                        }
                                        if (var3_4 == 0) break block121;
                                        if (v13 == 0) break block122;
                                        v13 = this.v().f("Unbreakable");
                                        if (var3_4 == 0) break block121;
                                        if (v13 == 0) break block122;
                                        v13 = var6_7 & 4;
                                        if (var3_4 == 0) break block121;
                                        if (v13 == 0) {
                                            var4_3.add((Object)net.minecraft.at.l.BLUE + net.minecraft.ab.a.a("item.unbreakable"));
                                        }
                                    }
                                    v13 = this.x();
                                }
                                if (var3_4 == 0) break block123;
                                if (v13 == 0) break block124;
                                v13 = this.n.a("CanDestroy", 9);
                                if (var3_4 == 0) break block123;
                                if (v13 == 0) break block124;
                                v13 = var6_7 & 8;
                                if (var3_4 == 0) break block123;
                                if (v13 != 0) break block124;
                                var7_11 = this.n.c("CanDestroy", 8);
                                v13 = var7_11.c() ? 1 : 0;
                                if (var3_4 == 0) break block123;
                                if (v13 != 0) break block124;
                                var4_3.add("");
                                var4_3.add((Object)net.minecraft.at.l.GRAY + net.minecraft.ab.a.a("item.canBreak"));
                                for (var8_14 = 0; var8_14 < var7_11.b(); ++var8_14) {
                                    block126: {
                                        block125: {
                                            var9_18 = K.d(var7_11.c(var8_14));
                                            if (var3_4 == 0) break block125;
                                            v21 = var9_18;
                                            if (var3_4 == 0) ** GOTO lbl278
                                            if (v21 == null) break block126;
                                            var4_3.add((Object)net.minecraft.at.l.DARK_GRAY + var9_18.n());
                                        }
                                        if (var3_4 != 0) continue;
                                    }
                                    var4_3.add((Object)net.minecraft.at.l.DARK_GRAY + "missingno");
                                    if (var3_4 != 0) continue;
                                }
                            }
                            v13 = this.x();
                        }
                        if (var3_4 == 0) break block127;
                        if (v13 == 0) break block128;
                        v13 = this.n.a("CanPlaceOn", 9);
                        if (var3_4 == 0) break block127;
                        if (v13 == 0) break block128;
                        v13 = var6_7 & 16;
                        if (var3_4 == 0) break block127;
                        if (v13 != 0) break block128;
                        var7_11 = this.n.c("CanPlaceOn", 8);
                        v13 = var7_11.c() ? 1 : 0;
                        if (var3_4 == 0) break block127;
                        if (v13 != 0) break block128;
                        var4_3.add("");
                        var4_3.add((Object)net.minecraft.at.l.GRAY + net.minecraft.ab.a.a("item.canPlace"));
                        for (var8_14 = 0; var8_14 < var7_11.b(); ++var8_14) {
                            block130: {
                                block129: {
                                    var9_18 = K.d(var7_11.c(var8_14));
                                    if (var3_4 == 0) break block87;
                                    if (var3_4 == 0) break block129;
                                    v21 = var9_18;
lbl278:
                                    // 2 sources

                                    if (v21 == null) break block130;
                                    var4_3.add((Object)net.minecraft.at.l.DARK_GRAY + var9_18.n());
                                }
                                if (var3_4 != 0) continue;
                            }
                            var4_3.add((Object)net.minecraft.at.l.DARK_GRAY + "missingno");
                            if (var3_4 != 0) continue;
                        }
                    }
                    v13 = var2_2.a();
                }
                if (var3_4 == 0) break block131;
                if (v13 == 0) break block87;
                v13 = this.a();
            }
            if (var3_4 != 0) {
                if (v13 != 0) {
                    var4_3.add(net.minecraft.ab.a.a("item.durability", new Object[]{this.E() - this.u(), this.E()}));
                }
                v22 = var4_3;
                if (var3_4 == 0) return v22;
                v22.add((Object)net.minecraft.at.l.DARK_GRAY + net.minecraft.w.k.q.b(this.i).toString());
                v13 = this.x() ? 1 : 0;
            }
            if (v13 != 0) {
                var4_3.add((Object)net.minecraft.at.l.DARK_GRAY + net.minecraft.ab.a.a("item.nbt_tags", new Object[]{this.v().d().size()}));
            }
        }
        v22 = var4_3;
        return v22;
    }

    public void f(int n2) {
        this.e = n2;
    }

    public static void a(b b10) {
        b10.a(net.minecraft.av.f.ITEM_INSTANCE, (g)new e());
        b10.a(net.minecraft.av.f.ITEM_INSTANCE, (g)new net.minecraft.x.a());
    }

    public String toString() {
        return this.g + "x" + this.w().h() + "@" + this.j;
    }

    public boolean a(int n2, Random random, @Nullable net.minecraft.i.k k2) {
        int n3;
        int n4;
        block20: {
            block19: {
                block17: {
                    boolean bl2;
                    block18: {
                        int n5;
                        int n6;
                        block15: {
                            int n7;
                            block16: {
                                n4 = bl.c();
                                n7 = this.j();
                                if (n4 == 0) {
                                    if (n7 == 0) {
                                        return false;
                                    }
                                    n7 = n2;
                                }
                                if (n4 != 0) break block16;
                                if (n7 <= 0) break block17;
                                n7 = T.a(net.minecraft.u.b.A, this);
                            }
                            int n8 = n7;
                            int n9 = 0;
                            int n10 = 0;
                            while (n8 > 0) {
                                int n5 = n10;
                                n5 = n2;
                                if (n4 == 0 && n4 == 0) {
                                    if (n6 >= n5) break;
                                    if (C.a(this, n8, random)) {
                                        ++n9;
                                    }
                                    ++n10;
                                    if (n4 == 0) continue;
                                }
                                break block15;
                            }
                            int n5 = n2;
                            n5 = n9;
                        }
                        n2 = n6 - n5;
                        bl2 = n2;
                        if (n4 != 0) break block18;
                        if (bl2 > false) break block17;
                        bl2 = false;
                    }
                    return bl2;
                }
                if (k2 == null) break block19;
                n3 = n2;
                if (n4 != 0) break block20;
                if (n3 != 0) {
                    a6.l.a(k2, this, this.j + n2);
                }
            }
            this.j += n2;
            n3 = this.j;
        }
        if (n4 == 0) {
            n3 = n3 > this.E() ? 1 : 0;
        }
        return n3 != 0;
    }

    public boolean m() {
        return this.w().e(this);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String i() {
        return this.w().d(this);
    }

    public boolean B() {
        return this.a != null;
    }

    public void a(z z2, x x2, int n2, boolean bl2) {
        block6: {
            k k2;
            block5: {
                int n3 = bl.g();
                d d10 = this;
                if (n3 != 0) {
                    if (d10.e > 0) {
                        --this.e;
                    }
                    d10 = this;
                }
                k2 = d10.i;
                if (n3 == 0) break block5;
                if (k2 == null) break block6;
                k2 = this.i;
            }
            k2.a(this, z2, x2, n2, bl2);
        }
    }

    public d(k k2) {
        this(k2, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean d(d d10, d d11) {
        int n2 = bl.c();
        d d12 = d10;
        if (n2 == 0) {
            if (d12 == d11) {
                return true;
            }
            d12 = d10;
        }
        boolean bl2 = d12.G();
        if (n2 == 0) {
            if (bl2) return false;
            bl2 = d11.G();
        }
        if (n2 == 0) {
            if (bl2) return false;
            bl2 = d10.b(d11);
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public l e() {
        int n2 = bl.c();
        d d10 = this;
        if (n2 == 0) {
            if (d10.f) {
                return null;
            }
            d10 = this;
        }
        l l2 = d10.a;
        return l2;
    }

    public boolean z() {
        return this.w().l();
    }

    public void a(z z2, j j2, int n2) {
        j2.a(net.minecraft.l.m.c(this.i), n2);
        this.w().a(this, z2, j2);
    }

    public d C() {
        d d10 = new d(this.i, this.g, this.j);
        int n2 = bl.g();
        d10.f(this.n());
        int n3 = n2;
        d d11 = this;
        if (n3 != 0) {
            if (d11.n != null) {
                d10.n = this.n.c();
            }
            d11 = d10;
        }
        return d11;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(K k2) {
        int n2 = bl.c();
        if (n2 == 0) {
            if (k2 == this.l) {
                return this.k;
            }
            this.l = k2;
        }
        boolean bl2 = this.x();
        if (n2 != 0) return bl2;
        if (bl2) {
            bl2 = this.n.a("CanPlaceOn", 9);
            if (n2 != 0) return bl2;
            if (bl2) {
                u u2 = this.n.c("CanPlaceOn", 8);
                int n3 = 0;
                while (n3 < u2.b()) {
                    K k3 = K.d(u2.c(n3));
                    if (n2 != 0) return false;
                    if (n2 == 0) {
                        if (k3 == k2) {
                            this.k = true;
                            return true;
                        }
                        ++n3;
                    }
                    if (n2 == 0) continue;
                }
            }
        }
        this.k = false;
        return false;
    }

    public String g() {
        block5: {
            String string;
            r r2;
            block7: {
                boolean bl2;
                r r3;
                block6: {
                    r r4;
                    int n2;
                    block4: {
                        r3 = this.c("display");
                        n2 = bl.g();
                        r4 = r3;
                        if (n2 == 0) break block4;
                        if (r4 == null) break block5;
                        r4 = r3;
                    }
                    bl2 = r4.a("Name", 8);
                    if (n2 == 0) break block6;
                    if (bl2) {
                        return r3.j("Name");
                    }
                    r2 = r3;
                    string = "LocName";
                    if (n2 == 0) break block7;
                    bl2 = r2.a(string, 8);
                }
                if (!bl2) break block5;
                r2 = r3;
                string = "LocName";
            }
            return net.minecraft.ab.a.a(r2.j(string));
        }
        return this.w().h(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public r a(r var1_1) {
        var3_2 = net.minecraft.w.k.q.b(this.i);
        var2_3 = bl.g();
        v0 = var3_2;
        if (var2_3 == 0) ** GOTO lbl9
        if (v0 == null) {
            v1 = "minecraft:air";
        } else {
            v0 = var3_2;
lbl9:
            // 2 sources

            v1 = v0.toString();
        }
        var1_1.a("id", v1);
        var1_1.a("Count", (byte)this.g);
        var1_1.a("Damage", (short)this.j);
        v2 = this.n;
        if (var2_3 == 0) return v2;
        if (v2 != null) {
            var1_1.a("tag", this.n);
        }
        v2 = var1_1;
        return v2;
    }

    public int n() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(d d10) {
        d d11;
        block5: {
            boolean bl2;
            block4: {
                int n2 = bl.c();
                bl2 = this.j();
                if (n2 != 0) break block4;
                if (!bl2) {
                    return this.c(d10);
                }
                d11 = d10;
                if (n2 != 0) break block5;
                bl2 = d11.G();
            }
            if (bl2) return false;
            d11 = this;
        }
        if (d11.i != d10.i) return false;
        return true;
    }

    public void g(int n2) {
        this.c(this.g + n2);
    }

    public void a(String string, net.minecraft.j.f f10, @Nullable X x2) {
        int n2 = bl.c();
        r r2 = this.n;
        if (n2 == 0) {
            if (r2 == null) {
                this.n = new r();
            }
            r2 = this.n;
        }
        String string2 = "AttributeModifiers";
        int n3 = 9;
        if (n2 == 0) {
            if (!r2.a(string2, n3)) {
                this.n.a("AttributeModifiers", new u());
            }
            r2 = this.n;
            string2 = "AttributeModifiers";
            n3 = 10;
        }
        u u2 = r2.c(string2, n3);
        r r3 = M.a(f10);
        r3.a("AttributeName", string);
        if (n2 == 0) {
            if (x2 != null) {
                r3.a("Slot", x2.c());
            }
            u2.a(r3);
        }
    }

    public d(K k2, int n2, int n3) {
        this(net.minecraft.w.k.b(k2), n2, n3);
    }

    public void e(int n2) {
        int n3 = bl.c();
        d d10 = this;
        if (n3 == 0) {
            if (!d10.x()) {
                this.n = new r();
            }
            d10 = this;
        }
        d10.n.b("RepairCost", n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public r a(String var1_1) {
        var2_2 = bl.g();
        v0 = this.n;
        if (var2_2 != 0) {
            if (v0 != null) {
                v0 = this.n;
                if (var2_2 != 0) {
                    if (v0.a(var1_1, 10)) {
                        return this.n.h(var1_1);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = new r();
            }
        }
        var3_3 = v0;
        this.a(var1_1, var3_3);
        return var3_3;
    }

    public void b(@Nullable r r2) {
        this.n = r2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1, B var2_2) {
        block13: {
            block12: {
                block11: {
                    block9: {
                        block10: {
                            var3_3 = bl.g();
                            v0 = var2_2 instanceof j;
                            if (var3_3 == 0) break block9;
                            if (!v0) break block10;
                            v0 = ((j)var2_2).cw.g;
                            if (var3_3 == 0) break block9;
                            if (v0 != false) return;
                        }
                        v1 = this;
                        if (var3_3 == 0) break block11;
                        v0 = v1.j();
                    }
                    if (v0 == false) return;
                    v1 = this;
                }
                v2 = var2_2.f();
                v3 = var2_2;
                if (var3_3 == 0) ** GOTO lbl21
                if (v3 instanceof net.minecraft.i.k) {
                    v3 = var2_2;
lbl21:
                    // 2 sources

                    v4 = (net.minecraft.i.k)v3;
                } else {
                    v4 = null;
                }
                v5 = v1.a(var1_1, v2, v4);
                if (var3_3 == 0) break block12;
                if (v5 == false) return;
                var2_2.c(this);
                v6 = this;
                v7 = 1;
                if (var3_3 == 0) break block13;
                v6.b(v7);
                v5 = var2_2 instanceof j;
            }
            if (v5) {
                var4_4 = (j)var2_2;
                var4_4.b(net.minecraft.l.m.a(this.i));
            }
            v6 = this;
            v7 = 0;
        }
        v6.j = v7;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int A() {
        int n2 = bl.g();
        int n3 = this.x();
        if (n2 != 0) {
            if (n3 == 0) return 0;
            n3 = this.n.a("RepairCost", 3) ? 1 : 0;
        }
        if (n2 == 0) return n3;
        if (n3 == 0) return 0;
        n3 = this.n.m("RepairCost");
        return n3;
    }

    public boolean G() {
        if (this == m) {
            return true;
        }
        if (this.i != null && this.i != net.minecraft.w.k.b(net.minecraft.u.g.bf)) {
            if (this.g <= 0) {
                return true;
            }
            return this.j < -32768 || this.j > 65535;
        }
        return true;
    }

    public net.minecraft.at.k F() {
        net.minecraft.at.k k2;
        block5: {
            d d10;
            block4: {
                net.minecraft.at.g g10 = new net.minecraft.at.g(this.g());
                int n2 = bl.g();
                if (this.c()) {
                    g10.e().c(true);
                }
                k2 = new net.minecraft.at.g("[").a(g10).a("]");
                d10 = this;
                if (n2 == 0) break block4;
                if (d10.f) break block5;
                d10 = this;
            }
            r r2 = d10.a(new r());
            k2.e().a(new net.minecraft.I.b(net.minecraft.I.c.SHOW_ITEM, new net.minecraft.at.g(r2.toString())));
            k2.e().a(this.l().rarityColor);
        }
        return k2;
    }

    public h l() {
        return this.w().a(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        int n2 = bl.g();
        int n3 = this.j();
        if (n2 != 0) {
            if (n3 == 0) return 0 != 0;
            n3 = this.j;
        }
        if (n2 == 0) return n3 != 0;
        if (n3 <= 0) return 0 != 0;
        return 1 != 0;
    }

    public boolean b() {
        return this.w().m();
    }

    static {
        m = new d((k)null);
        net.minecraft.w.d.e("PhgSBb");
        h = new DecimalFormat("#.##");
    }

    public k w() {
        return this.f ? net.minecraft.w.k.b(net.minecraft.u.g.bf) : this.i;
    }

    public d d(String string) {
        this.a("display").a("Name", string);
        return this;
    }

    public void a(int n2) {
        block3: {
            block2: {
                this.j = n2;
                int n3 = bl.g();
                d d10 = this;
                if (n3 == 0) break block2;
                if (d10.j >= 0) break block3;
                d10 = this;
            }
            d10.j = 0;
        }
    }

    public int u() {
        return this.j;
    }

    public static void e(String string) {
        d = string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public u D() {
        u u2;
        int n2 = bl.g();
        r r2 = this.n;
        if (n2 != 0) {
            if (r2 == null) {
                u2 = new u();
                return u2;
            }
            r2 = this.n;
        }
        u2 = r2.c("ench", 10);
        return u2;
    }

    public boolean c(d d10) {
        return !d10.G() && this.i == d10.i && this.j == d10.j;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean x() {
        int n2 = bl.g();
        d d10 = this;
        if (n2 != 0) {
            if (d10.f) return false;
            d10 = this;
        }
        if (d10.n == null) return false;
        return true;
    }

    public void a(String string, net.minecraft.P.i i2) {
        int n2 = bl.g();
        r r2 = this.n;
        if (n2 != 0) {
            if (r2 == null) {
                this.b(new r());
            }
            r2 = this.n;
        }
        r2.a(string, i2);
    }

    public d d(int n2) {
        int n3 = Math.min(n2, this.g);
        d d10 = this.C();
        d10.c(n3);
        this.b(n3);
        return d10;
    }

    public void a(net.minecraft.ax.u u2, int n2) {
        int n3 = bl.g();
        r r2 = this.n;
        if (n3 != 0) {
            if (r2 == null) {
                this.b(new r());
            }
            r2 = this.n;
        }
        String string = "ench";
        int n4 = 9;
        if (n3 != 0) {
            if (!r2.a(string, n4)) {
                this.n.a("ench", new u());
            }
            r2 = this.n;
            string = "ench";
            n4 = 10;
        }
        u u3 = r2.c(string, n4);
        r r3 = new r();
        r3.a("id", (short)net.minecraft.ax.u.c(u2));
        r3.a("lvl", (short)((byte)n2));
        u3.a(r3);
    }

    public boolean k() {
        int n2 = bl.c();
        boolean bl2 = this.w().f(this);
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.r();
        }
        if (n2 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        aX aX2 = this.w().a(j2, z2, n2, a32, aA2, f10, f11, f12);
        int n3 = bl.c();
        aX aX3 = aX2;
        if (n3 == 0) {
            if (aX3 == aX.SUCCESS) {
                j2.b(net.minecraft.l.m.b(this.i));
            }
            aX3 = aX2;
        }
        return aX3;
    }

    public static boolean b(d d10, d d11) {
        if (d10.G() && d11.G()) {
            return true;
        }
        if (!d10.G() && !d11.G()) {
            if (d10.n == null && d11.n != null) {
                return false;
            }
            return d10.n == null || d10.n.equals(d11.n);
        }
        return false;
    }

    public d(K k2) {
        this(k2, 1);
    }

    public int o() {
        return this.w().g(this);
    }

    public int f() {
        return this.w().a();
    }

    public t<d> a(z z2, j j2, a3 a32) {
        return this.w().a(z2, j2, a32);
    }

    public bE h() {
        return this.w().b(this);
    }

    public void q() {
        block10: {
            block11: {
                d d10;
                r r2;
                block9: {
                    int n2;
                    block7: {
                        block8: {
                            r r3 = this.c("display");
                            n2 = bl.g();
                            r2 = r3;
                            if (n2 == 0) break block7;
                            if (r2 == null) break block8;
                            r3.k("Name");
                            r2 = r3;
                            if (n2 == 0) break block7;
                            if (r2.c()) {
                                this.b("display");
                            }
                        }
                        r2 = this.n;
                    }
                    if (n2 == 0) break block9;
                    if (r2 == null) break block10;
                    d10 = this;
                    if (n2 == 0) break block11;
                    r2 = d10.n;
                }
                if (!r2.c()) break block10;
                d10 = this;
            }
            d10.n = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean r() {
        int n2 = bl.g();
        r r2 = this.n;
        if (n2 != 0) {
            if (r2 == null) return false;
            r2 = this.n;
        }
        boolean bl2 = r2.a("ench", 9);
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        boolean bl3 = this.n.c("ench", 10).c();
        if (n2 == 0) return bl3;
        if (bl3) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(K k2) {
        int n2 = bl.c();
        if (n2 == 0) {
            if (k2 == this.c) {
                return this.b;
            }
            this.c = k2;
        }
        boolean bl2 = this.x();
        if (n2 != 0) return bl2;
        if (bl2) {
            bl2 = this.n.a("CanDestroy", 9);
            if (n2 != 0) return bl2;
            if (bl2) {
                u u2 = this.n.c("CanDestroy", 8);
                int n3 = 0;
                while (n3 < u2.b()) {
                    K k3 = K.d(u2.c(n3));
                    if (n2 != 0) return false;
                    if (n2 == 0) {
                        if (k3 == k2) {
                            this.b = true;
                            return true;
                        }
                        ++n3;
                    }
                    if (n2 == 0) continue;
                }
            }
        }
        this.b = false;
        return false;
    }

    public void a(z z2, B b10, int n2) {
        this.w().a(this, z2, b10, n2);
    }

    public d(r r2) {
        block4: {
            d d10;
            block6: {
                block5: {
                    int n2 = bl.g();
                    int n3 = n2;
                    this.i = net.minecraft.w.k.a(r2.j("id"));
                    this.g = r2.r("Count");
                    this.j = Math.max(0, r2.q("Damage"));
                    if (n3 == 0) break block4;
                    if (!r2.a("tag", 10)) break block5;
                    this.n = r2.h("tag");
                    d10 = this;
                    if (n3 == 0) break block6;
                    if (d10.i != null) {
                        this.i.a(r2);
                    }
                }
                d10 = this;
            }
            d10.s();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j() {
        int n2 = bl.g();
        boolean bl2 = this.f;
        if (n2 != 0) {
            if (bl2) {
                return false;
            }
            bl2 = this.i.e();
        }
        if (n2 != 0) {
            if (bl2 <= false) {
                return false;
            }
            bl2 = (this.x() ? 1 : 0) != 0;
        }
        if (n2 == 0) return bl2;
        if (!bl2) return true;
        bl2 = this.v().f("Unbreakable");
        if (n2 == 0) return bl2;
        if (bl2) return false;
        return true;
    }

    public d(K k2, int n2) {
        this(k2, n2, 0);
    }

    @Nullable
    public r v() {
        return this.n;
    }

    public d f(String string) {
        this.a("display").a("LocName", string);
        return this;
    }

    public void a(z z2, i i2, n n2, j j2) {
        block0: {
            boolean bl2 = this.w().a(this, z2, i2, n2, j2);
            if (!bl2) break block0;
            j2.b(net.minecraft.l.m.b(this.i));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        r r2 = this.c("display");
        int n2 = bl.c();
        r r3 = r2;
        if (n2 == 0) {
            if (r3 == null) return false;
            r3 = r2;
        }
        boolean bl2 = r3.a("Name", 8);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(d var1_1) {
        var2_2 = bl.c();
        v0 = this;
        if (var2_2 == 0) {
            if (v0.g != var1_1.g) {
                return false;
            }
            v0 = this;
        }
        if (var2_2 == 0) {
            if (v0.w() != var1_1.w()) {
                return false;
            }
            v0 = this;
        }
        if (var2_2 == 0) {
            if (v0.j != var1_1.j) {
                return false;
            }
            v0 = this;
        }
        v1 = v0.n;
        if (var2_2 == 0) {
            if (v1 == null) {
                v1 = var1_1.n;
                if (var2_2 == 0) {
                    if (v1 != null) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = this.n;
            }
        }
        if (var2_2 == 0) {
            if (v1 == null) return true;
            v1 = this.n;
        }
        v2 = v1.equals(var1_1.n);
        if (var2_2 != 0) return v2;
        if (v2 != false) return true;
        return false;
    }

    public d a(z z2, B b10) {
        return this.w().a(this, z2, b10);
    }

    public void b(String string) {
        block3: {
            String string2;
            r r2;
            block4: {
                int n2;
                block2: {
                    n2 = bl.c();
                    r2 = this.n;
                    if (n2 != 0) break block2;
                    if (r2 == null) break block3;
                    r2 = this.n;
                }
                string2 = string;
                if (n2 != 0) break block4;
                if (!r2.a(string2, 10)) break block3;
                r2 = this.n;
                string2 = string;
            }
            r2.k(string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean p() {
        int n2 = bl.c();
        boolean bl2 = this.f();
        if (n2 == 0) {
            if (bl2 <= true) return false;
            bl2 = this.j();
        }
        if (n2 != 0) return bl2;
        if (!bl2) return true;
        bl2 = this.a();
        if (n2 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    public void a(B b10, j j2) {
        block0: {
            boolean bl2 = this.i.a(this, b10, (B)j2);
            if (!bl2) break block0;
            j2.b(net.minecraft.l.m.b(this.i));
        }
    }

    private void s() {
        this.f = this.G();
    }

    public Multimap<String, net.minecraft.j.f> a(X x2) {
        HashMultimap hashMultimap;
        block8: {
            d d10;
            block9: {
                block10: {
                    int n2 = bl.g();
                    d10 = this;
                    if (n2 == 0) break block9;
                    if (!d10.x()) break block10;
                    d10 = this;
                    if (n2 == 0) break block9;
                    if (!d10.n.a("AttributeModifiers", 9)) break block10;
                    hashMultimap = HashMultimap.create();
                    u u2 = this.n.c("AttributeModifiers", 10);
                    int n3 = 0;
                    while (n3 < u2.b()) {
                        block11: {
                            block12: {
                                boolean bl2;
                                net.minecraft.j.f f10;
                                r r2;
                                block15: {
                                    block13: {
                                        long l2;
                                        block14: {
                                            r2 = u2.d(n3);
                                            f10 = M.a(r2);
                                            if (n2 == 0) break block8;
                                            if (n2 == 0) break block11;
                                            if (f10 == null) break block12;
                                            bl2 = r2.a("Slot", 8);
                                            if (n2 == 0) break block13;
                                            if (!bl2) break block14;
                                            bl2 = r2.j("Slot").equals(x2.c());
                                            if (n2 == 0) break block13;
                                            if (!bl2) break block12;
                                        }
                                        bl2 = (l2 = f10.c().getLeastSignificantBits() - 0L) == 0L ? 0 : (l2 < 0L ? -1 : 1);
                                    }
                                    if (n2 == 0) break block15;
                                    if (!bl2) break block12;
                                    long l3 = f10.c().getMostSignificantBits() - 0L;
                                    bl2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                                }
                                if (n2 != 0 && bl2) {
                                    bl2 = hashMultimap.put((Object)r2.j("AttributeName"), (Object)f10);
                                }
                            }
                            ++n3;
                        }
                        if (n2 != 0) continue;
                    }
                    if (n2 != 0) break block8;
                }
                d10 = this;
            }
            hashMultimap = d10.w().a(x2);
        }
        return hashMultimap;
    }

    public void a(l l2) {
        this.a = l2;
    }

    public static String y() {
        return d;
    }

    public boolean a(j j2, B b10, a3 a32) {
        return this.w().a(this, j2, b10, a32);
    }
}

