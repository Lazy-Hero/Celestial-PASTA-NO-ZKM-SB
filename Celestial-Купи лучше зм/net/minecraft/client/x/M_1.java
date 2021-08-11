/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.V;
import net.minecraft.client.x.au;
import net.minecraft.client.x.aw;
import net.minecraft.client.x.j;
import net.minecraft.client.x.l;
import net.minecraft.client.x.v;
import net.minecraft.client.x.z;
import org.lwjgl.util.vector.Vector3f;

public class M {
    public static final /* synthetic */ List<String> a;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public v a(net.minecraft.client.j.j var1_1, v var2_2) {
        block6: {
            var4_3 = Maps.newHashMap();
            var5_4 = Lists.newArrayList();
            var3_5 = P.o();
            for (var6_6 = 0; var6_6 < M.a.size(); ++var6_6) {
                var7_7 = M.a.get(var6_6);
                v0 = var2_2;
                v1 = var7_7;
                if (var3_5 == null) {
                    v2 = v0.d(v1);
                    if (var3_5 != null) break block6;
                    if (!v2 && var3_5 == null) break;
                    v0 = var2_2;
                    v1 = var7_7;
                }
                var8_8 = v0.c(v1);
                var4_3.put(var7_7, var8_8);
                var9_9 = var1_1.b(new net.minecraft.ar.v(var8_8).toString());
                var5_4.addAll(this.a(var6_6, var7_7, var9_9));
                if (var3_5 == null) continue;
            }
            v2 = var5_4.isEmpty();
        }
        if (v2) {
            return null;
        }
        v3 /* !! */  = var2_2;
        if (var3_5 != null) ** GOTO lbl31
        if (v3 /* !! */ .d("particle")) {
            v4 = var2_2.c("particle");
        } else {
            v3 /* !! */  = var4_3.get("layer0");
lbl31:
            // 2 sources

            v4 = (String)v3 /* !! */ ;
        }
        var4_3.put("particle", v4);
        return new v(null, var5_4, var4_3, false, false, var2_2.j(), var2_2.f());
    }

    private List<aw> a(c c10) {
        int n2 = c10.f();
        int n3 = c10.b();
        ArrayList arrayList = Lists.newArrayList();
        String[] arrstring = P.o();
        int n4 = 0;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 < c10.o()) {
                int[] arrn = c10.f(n4)[0];
                int n6 = 0;
                block2: while (true) {
                    int n7 = n6;
                    block3: while (n7 < n3) {
                        n5 = 0;
                        if (arrstring != null) continue block1;
                        for (int i2 = v1793987; i2 < n2; ++i2) {
                            boolean bl2;
                            n7 = this.a(arrn, i2, n6, n2, n3) ? 1 : 0;
                            if (arrstring != null) continue block3;
                            if (arrstring == null) {
                                bl2 = n7 == 0;
                            }
                            boolean bl3 = bl2;
                            this.a(j.UP, arrayList, arrn, i2, n6, n2, n3, bl3);
                            this.a(j.DOWN, arrayList, arrn, i2, n6, n2, n3, bl3);
                            this.a(j.LEFT, arrayList, arrn, i2, n6, n2, n3, bl3);
                            this.a(j.RIGHT, arrayList, arrn, i2, n6, n2, n3, bl3);
                            if (arrstring == null) continue;
                        }
                        ++n6;
                        if (arrstring == null) continue block2;
                    }
                    break;
                }
                ++n4;
                if (arrstring == null) continue block0;
            }
            break;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private List<l> a(c var1_1, String var2_2, int var3_3) {
        var5_4 = var1_1.f();
        var6_5 = var1_1.b();
        var7_6 = Lists.newArrayList();
        var8_7 = this.a(var1_1).iterator();
        var4_8 = P.o();
        block12: do {
            if (var8_7.hasNext() == false) return var7_6;
            var9_9 = var8_7.next();
            var10_10 = 0.0f;
            var11_11 = 0.0f;
            var12_12 = 0.0f;
            var13_13 = 0.0f;
            var14_14 = 0.0f;
            var15_15 = 0.0f;
            var16_16 = 0.0f;
            var17_17 = 0.0f;
            var18_18 = 0.0f;
            var19_19 = 0.0f;
            var20_20 = var9_9.d();
            var21_21 = var9_9.c();
            var22_22 = var9_9.b();
            var23_23 = var9_9.a();
            if (var4_8 != null) ** GOTO lbl35
            switch (V.a[var23_23.ordinal()]) {
                case 1: {
                    var14_14 = var20_20;
                    var10_10 = var20_20;
                    var12_12 = var15_15 = var21_21 + 1.0f;
                    var16_16 = var22_22;
                    var11_11 = var22_22;
                    var17_17 = var22_22;
                    var13_13 = var22_22;
                    var18_18 = 16.0f / var5_4;
                    var19_19 = 16.0f / (var6_5 - 1.0f);
lbl35:
                    // 2 sources

                    if (var4_8 == null) break;
                }
                case 2: {
                    var17_17 = var22_22;
                    var16_16 = var22_22;
                    var14_14 = var20_20;
                    var10_10 = var20_20;
                    var12_12 = var15_15 = var21_21 + 1.0f;
                    var11_11 = var22_22 + 1.0f;
                    var13_13 = var22_22 + 1.0f;
                    var18_18 = 16.0f / var5_4;
                    var19_19 = 16.0f / (var6_5 - 1.0f);
                    if (var4_8 == null) break;
                }
                case 3: {
                    var14_14 = var22_22;
                    var10_10 = var22_22;
                    var15_15 = var22_22;
                    var12_12 = var22_22;
                    var17_17 = var20_20;
                    var11_11 = var20_20;
                    var13_13 = var16_16 = var21_21 + 1.0f;
                    var18_18 = 16.0f / (var5_4 - 1.0f);
                    var19_19 = 16.0f / var6_5;
                    if (var4_8 == null) break;
                }
                case 4: {
                    var15_15 = var22_22;
                    var14_14 = var22_22;
                    var10_10 = var22_22 + 1.0f;
                    var12_12 = var22_22 + 1.0f;
                    var17_17 = var20_20;
                    var11_11 = var20_20;
                    var13_13 = var16_16 = var21_21 + 1.0f;
                    var18_18 = 16.0f / (var5_4 - 1.0f);
                    var19_19 = 16.0f / var6_5;
                    break;
                }
            }
            var24_24 = 16.0f / var5_4;
            var25_25 = 16.0f / var6_5;
            var10_10 *= var24_24;
            var12_12 *= var24_24;
            var11_11 *= var25_25;
            var13_13 *= var25_25;
            var11_11 = 16.0f - var11_11;
            var13_13 = 16.0f - var13_13;
            var26_26 = Maps.newHashMap();
            var26_26.put(var23_23.d(), new z(null, var3_3, var2_2, new au(new float[]{var14_14 *= var18_18, var16_16 *= var19_19, var15_15 *= var18_18, var17_17 *= var19_19}, 0)));
            v0 = V.a[var23_23.ordinal()];
            if (var4_8 != null) ** GOTO lbl85
            switch (v0) {
                case 1: {
                    v0 = var7_6.add(new l(new Vector3f(var10_10, var11_11, 7.5f), new Vector3f(var12_12, var11_11, 8.5f), var26_26, null, true)) ? 1 : 0;
lbl85:
                    // 2 sources

                    if (var4_8 == null) continue block12;
                }
                case 2: {
                    var7_6.add(new l(new Vector3f(var10_10, var13_13, 7.5f), new Vector3f(var12_12, var13_13, 8.5f), var26_26, null, true));
                    if (var4_8 == null) continue block12;
                }
                case 3: {
                    var7_6.add(new l(new Vector3f(var10_10, var11_11, 7.5f), new Vector3f(var10_10, var13_13, 8.5f), var26_26, null, true));
                    if (var4_8 == null) continue block12;
                }
                case 4: {
                    var7_6.add(new l(new Vector3f(var12_12, var11_11, 7.5f), new Vector3f(var12_12, var13_13, 8.5f), var26_26, null, true));
                    break;
                }
            }
        } while (var4_8 == null);
        return var7_6;
    }

    private void a(List<aw> list, j j2, int n2, int n3) {
        block11: {
            aw aw2;
            int n4;
            block9: {
                aw aw3;
                block10: {
                    aw3 = null;
                    String[] arrstring = P.o();
                    for (aw aw4 : list) {
                        j j3 = aw4.a();
                        if (arrstring == null) {
                            if (j3 != j2) continue;
                            j3 = j2;
                        }
                        int n5 = j.a(j3);
                        if (arrstring == null) {
                            n5 = n5 != 0 ? n3 : n2;
                        }
                        int n6 = n5;
                        aw aw5 = aw4;
                        if (arrstring == null) {
                            if (aw5.b() != n6) continue;
                            aw5 = aw4;
                        }
                        aw3 = aw5;
                        break;
                    }
                    int n7 = j.a(j2);
                    if (arrstring == null) {
                        n7 = n7 != 0 ? n3 : n2;
                    }
                    int n8 = n7;
                    int n9 = j.a(j2);
                    if (arrstring == null) {
                        n9 = n9 != 0 ? n2 : n3;
                    }
                    n4 = n9;
                    aw2 = aw3;
                    if (arrstring != null) break block9;
                    if (aw2 != null) break block10;
                    list.add(new aw(j2, n4, n8));
                    if (arrstring == null) break block11;
                }
                aw2 = aw3;
            }
            aw2.a(n4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int[] arrn, int n2, int n3, int n4, int n5) {
        String[] arrstring = P.o();
        int n6 = n2;
        if (arrstring != null) return n6 != 0;
        if (n6 < 0) return 1 != 0;
        n6 = n3;
        if (arrstring != null) return n6 != 0;
        if (n6 < 0) return 1 != 0;
        n6 = n2;
        if (arrstring != null) return n6 != 0;
        if (n6 >= n4) return 1 != 0;
        n6 = n3;
        if (arrstring != null) return n6 != 0;
        if (n6 >= n5) return 1 != 0;
        boolean bl2 = arrn[n3 * n4 + n2] >> 24 & 0xFF;
        if (arrstring != null) return bl2;
        if (bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(j j2, List<aw> list, int[] arrn, int n2, int n3, int n4, int n5, boolean bl2) {
        String[] arrstring = P.o();
        boolean bl3 = this.a(arrn, n2 + j2.a(), n3 + j2.c(), n4, n5);
        if (arrstring == null) {
            if (!bl3) return;
            bl3 = bl2;
        }
        if (arrstring == null) {
            if (!bl3) return;
            bl3 = true;
        }
        boolean bl4 = bl3;
        if (!bl4) return;
        this.a(list, j2, n2, n3);
    }

    private List<l> a(int n2, String string, c c10) {
        HashMap hashMap = Maps.newHashMap();
        hashMap.put(aA.SOUTH, new z(null, n2, string, new au(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put(aA.NORTH, new z(null, n2, string, new au(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new l(new Vector3f(0.0f, 0.0f, 7.5f), new Vector3f(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.a(c10, string, n2));
        return arrayList;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        a = Lists.newArrayList((Object[])new String[]{"layer0", "layer1", "layer2", "layer3", "layer4"});
    }
}

