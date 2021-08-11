/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.aA;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.W.K;
import net.minecraft.aA.h;
import net.minecraft.aA.l;
import net.minecraft.u.d;
import net.minecraft.u.g;

public class p {
    private final /* synthetic */ Map<String, Map<String, String>> a;
    private /* synthetic */ int c;
    private final /* synthetic */ List<l> b;

    public String toString() {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(3);
        stringBuilder.append(";");
        for (n2 = 0; n2 < this.b.size(); ++n2) {
            if (n2 > 0) {
                stringBuilder.append(",");
            }
            stringBuilder.append(this.b.get(n2));
        }
        stringBuilder.append(";");
        stringBuilder.append(this.c);
        if (this.a.isEmpty()) {
            stringBuilder.append(";");
        } else {
            stringBuilder.append(";");
            n2 = 0;
            for (Map.Entry<String, Map<String, String>> entry : this.a.entrySet()) {
                if (n2++ > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(entry.getKey().toLowerCase(Locale.ROOT));
                Map<String, String> map = entry.getValue();
                if (map.isEmpty()) continue;
                stringBuilder.append("(");
                int n3 = 0;
                for (Map.Entry<String, String> entry2 : map.entrySet()) {
                    if (n3++ > 0) {
                        stringBuilder.append(" ");
                    }
                    stringBuilder.append(entry2.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append(entry2.getValue());
                }
                stringBuilder.append(")");
            }
        }
        return stringBuilder.toString();
    }

    public void a(int n2) {
        this.c = n2;
    }

    public List<l> e() {
        return this.b;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public void b() {
        int n2 = 0;
        for (l l2 : this.b) {
            l2.a(n2);
            n2 += l2.d();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static p a(String var0) {
        block22: {
            block20: {
                block21: {
                    var1_1 = h.b();
                    v0 = var0;
                    if (var1_1) {
                        if (v0 == null) {
                            return p.c();
                        }
                        v0 = var0;
                    }
                    v1 = var2_2 = v0.split(";", -1);
                    if (!var1_1) ** GOTO lbl13
                    if (v1.length == 1) {
                        v2 = 0;
                    } else {
                        v1 = var2_2;
lbl13:
                        // 2 sources

                        v2 = net.minecraft.k.h.a(v1[0], 0);
                    }
                    v3 = var3_3 = v2;
                    if (var1_1) {
                        if (v3 < 0) return p.c();
                        v3 = var3_3;
                    }
                    if (v3 > 3) return p.c();
                    var4_4 = new p();
                    v4 = var2_2.length;
                    if (var1_1) {
                        v4 = v4 == 1 ? 0 : 1;
                    }
                    var5_5 = v4;
                    v5 = var6_6 = p.a(var3_3, var2_2[var5_5++]);
                    if (var1_1) {
                        if (v5 == null) return p.c();
                        v5 = var6_6;
                    }
                    v6 = v5.isEmpty();
                    if (var1_1) {
                        if (v6 != 0) return p.c();
                        var4_4.e().addAll(var6_6);
                        var4_4.b();
                        v6 = net.minecraft.A.h.b(d.s);
                    }
                    var7_7 = v6;
                    v7 = var3_3;
                    if (!var1_1) break block20;
                    if (v7 <= 0) break block21;
                    v7 = var2_2.length;
                    if (!var1_1) break block20;
                    if (v7 > var5_5) {
                        var7_7 = net.minecraft.k.h.a(var2_2[var5_5++], var7_7);
                    }
                }
                v8 /* !! */  = var4_4;
                if (var1_1 == false) return var4_4;
                v8 /* !! */ .a(var7_7);
                v7 = var3_3;
            }
            if (v7 <= 0) break block22;
            v8 /* !! */  = var2_2;
            if (var1_1 == false) return var4_4;
            if (v8 /* !! */ .length <= var5_5) break block22;
            var9_9 = var8_8 = var2_2[var5_5++].toLowerCase(Locale.ROOT).split(",");
            var10_10 = var9_9.length;
            var11_11 = 0;
            block0: while (true) {
                v9 = var11_11;
                v10 = var10_10;
                block1: while (v9 < v10) {
                    block23: {
                        block25: {
                            block24: {
                                var12_12 = var9_9[var11_11];
                                var13_13 = var12_12.split("\\(", 2);
                                var14_14 = Maps.newHashMap();
                                if (var1_1 == false) return var4_4;
                                if (!var1_1) continue block0;
                                if (var13_13[0].isEmpty()) break block23;
                                var4_4.a().put(var13_13[0], var14_14);
                                if (!var1_1) continue block0;
                                if (var13_13.length <= 1) break block23;
                                v11 = var13_13[1].endsWith(")");
                                if (!var1_1) break block24;
                                if (v11 == 0) break block23;
                                v12 = var13_13[1];
                                if (!var1_1) break block25;
                                v11 = v12.length();
                            }
                            if (v11 <= 1) break block23;
                            v12 = var13_13[1].substring(0, var13_13[1].length() - 1);
                        }
                        var16_16 = var15_15 = v12.split(" ");
                        var17_17 = var16_16.length;
                        var18_18 = 0;
                        while (var18_18 < var17_17) {
                            var19_19 = var16_16[var18_18];
                            var20_20 = var19_19.split("=", 2);
                            if (var1_1) {
                                v9 = var20_20.length;
                                v10 = 2;
                                if (!var1_1) continue block1;
                                if (v9 == v10) {
                                    var14_14.put(var20_20[0], var20_20[1]);
                                }
                                ++var18_18;
                            }
                            if (var1_1) continue;
                        }
                    }
                    ++var11_11;
                    if (var1_1) continue block0;
                }
                break;
            }
            if (var1_1 != false) return var4_4;
        }
        v8 /* !! */  = var4_4.a().put("village", Maps.newHashMap());
        return var4_4;
    }

    public int d() {
        return this.c;
    }

    private static List<l> a(int n2, String string) {
        block8: {
            String string2;
            boolean bl2;
            block7: {
                bl2 = h.b();
                string2 = string;
                if (!bl2) break block7;
                if (string2 == null) break block8;
                string2 = string;
            }
            if (string2.length() >= 1) {
                ArrayList arrayList = Lists.newArrayList();
                String[] arrstring = string.split(",");
                int n3 = 0;
                String[] arrstring2 = arrstring;
                int n4 = arrstring2.length;
                int n5 = 0;
                while (n5 < n4) {
                    String string3 = arrstring2[n5];
                    l l2 = p.a(n2, string3, n3);
                    if (bl2) {
                        if (l2 == null) {
                            return null;
                        }
                        arrayList.add(l2);
                        n3 += l2.d();
                        ++n5;
                    }
                    if (bl2) continue;
                }
                return arrayList;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static l a(int var0, String var1_1, int var2_2) {
        block37: {
            block35: {
                block36: {
                    block41: {
                        block34: {
                            block40: {
                                block33: {
                                    block39: {
                                        block32: {
                                            block31: {
                                                var3_3 = h.b();
                                                var4_4 = var0 >= 3 ? var1_1.split("\\*", 2) : var1_1.split("x", 2);
                                                var5_5 = 1;
                                                var6_6 = 0;
                                                v0 = var4_4;
                                                if (!var3_3) ** GOTO lbl25
                                                if (v0.length == 2) {
                                                    try {
                                                        var5_5 = Integer.parseInt(var4_4[0]);
                                                        v1 = var2_2 + var5_5;
                                                        if (var3_3) {
                                                            if (v1 >= 256) {
                                                                var5_5 = 256 - var2_2;
                                                            }
                                                            v1 = var5_5;
                                                        }
                                                        if (var3_3) {
                                                            if (v1 >= 0) break block31;
                                                            v1 = 0;
                                                        }
                                                        var5_5 = v1;
                                                    }
                                                    catch (Throwable var7_7) {
                                                        return null;
                                                    }
                                                }
                                            }
                                            try {
                                                block38: {
                                                    v0 = var4_4;
lbl25:
                                                    // 2 sources

                                                    var8_9 = v0[var4_4.length - 1];
                                                    v2 = var0;
                                                    v3 = 3;
                                                    if (!var3_3) ** GOTO lbl47
                                                    if (v2 >= v3) break block38;
                                                    var4_4 = var8_9.split(":", 2);
                                                    v4 = var4_4.length;
                                                    if (var3_3) {
                                                        if (v4 > 1) {
                                                            var6_6 = Integer.parseInt(var4_4[1]);
                                                        }
                                                        v4 = Integer.parseInt(var4_4[0]);
                                                    }
                                                    var7_8 = K.b(v4);
                                                    if (var3_3) ** GOTO lbl92
                                                }
                                                v5 = var8_9;
                                                if (!var3_3) break block32;
                                            }
                                            catch (Throwable var8_10) {
                                                return null;
                                            }
                                            var4_4 = v5.split(":", 3);
                                            v2 = var4_4.length;
                                            v3 = 1;
lbl47:
                                            // 2 sources

                                            if (v2 <= v3) ** GOTO lbl53
                                            v5 = var4_4[0] + ":" + var4_4[1];
                                        }
                                        v6 = K.d(v5);
                                        break block39;
lbl53:
                                        // 1 sources

                                        v6 = null;
                                    }
                                    v7 = var7_8 = v6;
                                    if (!var3_3) ** GOTO lbl72
                                    if (v7 == null) ** GOTO lbl71
                                    v8 = var4_4.length;
                                    if (!var3_3) break block33;
                                    if (v8 <= 2) ** GOTO lbl68
                                    v8 = Integer.parseInt(var4_4[2]);
                                }
                                break block40;
lbl68:
                                // 1 sources

                                v8 = var6_6 = 0;
                            }
                            if (var3_3) ** GOTO lbl87
lbl71:
                            // 2 sources

                            v7 = var7_8 = K.d(var4_4[0]);
lbl72:
                            // 2 sources

                            if (!var3_3) ** GOTO lbl88
                            if (v7 == null) ** GOTO lbl87
                            v9 = var4_4.length;
                            if (!var3_3) break block34;
                            if (v9 <= 1) ** GOTO lbl84
                            v9 = Integer.parseInt(var4_4[1]);
                        }
                        break block41;
lbl84:
                        // 1 sources

                        v9 = 0;
                    }
                    var6_6 = v9;
lbl87:
                    // 3 sources

                    v7 = var7_8;
lbl88:
                    // 2 sources

                    if (!var3_3) ** GOTO lbl93
                    if (v7 != null) ** GOTO lbl92
                    return null;
lbl92:
                    // 2 sources

                    v7 = var7_8;
lbl93:
                    // 2 sources

                    if (v7 == g.bf) {
                        var6_6 = 0;
                    }
                    v10 = var6_6;
                    if (!var3_3) break block35;
                    if (v10 < 0) break block36;
                    v10 = var6_6;
                    if (!var3_3) break block35;
                    if (v10 <= 15) break block37;
                }
                v10 = 0;
            }
            var6_6 = v10;
        }
        var8_9 = new l(var0, var5_5, var7_8, var6_6);
        var8_9.a(var2_2);
        return var8_9;
    }

    public p() {
        this.b = Lists.newArrayList();
        this.a = Maps.newHashMap();
    }

    public Map<String, Map<String, String>> a() {
        return this.a;
    }

    public static p c() {
        p p2 = new p();
        p2.a(net.minecraft.A.h.b(d.s));
        p2.e().add(new l(1, g.g));
        p2.e().add(new l(2, g.bv));
        p2.e().add(new l(1, g.aU));
        p2.b();
        p2.a().put("village", Maps.newHashMap());
        return p2;
    }
}

