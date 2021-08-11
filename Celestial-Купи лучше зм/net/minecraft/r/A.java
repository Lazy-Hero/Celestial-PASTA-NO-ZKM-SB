/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 */
package net.minecraft.r;

import com.google.gson.JsonParseException;
import net.minecraft.P.r;
import net.minecraft.P.w;
import net.minecraft.ar.aD;
import net.minecraft.ar.aG;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.av.a;
import net.minecraft.r.m;

public class A
implements a {
    @Override
    public int a() {
        return 165;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public r a(r var1_1) {
        block16: {
            var2_2 = m.b();
            if (!"minecraft:written_book".equals(var1_1.j("id"))) break block16;
            v0 = var3_3 = var1_1.h("tag");
            if (var2_2 != null) return v0;
            if (!v0.a("pages", 9)) break block16;
            var4_4 = var3_3.c("pages", 8);
            for (var5_5 = 0; var5_5 < var4_4.b(); ++var5_5) {
                block23: {
                    block18: {
                        block22: {
                            block20: {
                                block21: {
                                    block19: {
                                        block17: {
                                            var6_6 = var4_4.c(var5_5);
                                            var7_8 = null;
                                            if (var2_2 != null) break block16;
                                            v1 = "null".equals(var6_6);
                                            if (var2_2 != null) break block17;
                                            if (v1 != 0) break block18;
                                            v1 = aD.a(var6_6);
                                        }
                                        if (var2_2 != null) break block19;
                                        if (v1 != 0) break block18;
                                        v1 = var6_6.charAt(0);
                                    }
                                    v2 = 34;
                                    if (var2_2 != null) break block20;
                                    if (v1 != v2) break block21;
                                    v3 = var6_6;
                                    if (var2_2 != null) ** GOTO lbl41
                                    if (v3.charAt(var6_6.length() - 1) == '\"') ** GOTO lbl-1000
                                }
                                v1 = var6_6.charAt(0);
                                v2 = 123;
                            }
                            if (var2_2 != null) break block22;
                            if (v1 != v2) ** GOTO lbl-1000
                            v3 = var6_6;
                            if (var2_2 != null) ** GOTO lbl41
                            v1 = v3.charAt(var6_6.length() - 1);
                            v2 = 125;
                        }
                        ** if (v1 != v2) goto lbl-1000
lbl-1000:
                        // 2 sources

                        {
                            try {
                                v3 = aG.a(m.c, var6_6, k.class, true);
lbl41:
                                // 3 sources

                                if ((var7_9 = (k)v3) == null) {
                                    var7_10 = new g("");
                                }
                            }
                            catch (JsonParseException var8_21) {
                                // empty catch block
                            }
                            v4 = var7_12;
                            if (var2_2 == null) {
                                if (v4 == null) {
                                    try {
                                        var7_13 = o.a(var6_6);
                                    }
                                    catch (JsonParseException var8_22) {
                                        // empty catch block
                                    }
                                }
                                v4 = var7_14;
                            }
                            if (var2_2 == null) {
                                if (v4 == null) {
                                    try {
                                        var7_15 = o.b(var6_6);
                                    }
                                    catch (JsonParseException var8_23) {
                                        // empty catch block
                                    }
                                }
                                v4 = var7_16;
                            }
                            if (v4 == null) {
                                var7_17 = new g(var6_6);
                            }
                            ** GOTO lbl70
                        }
lbl-1000:
                        // 2 sources

                        {
                            var7_18 = new g(var6_6);
                        }
                        break block23;
                    }
                    var7_19 = new g("");
                }
                var4_4.a(var5_5, new w(o.a((k)var7_7)));
                if (var2_2 == null) continue;
            }
            var3_3.a("pages", var4_4);
        }
        v0 = var1_1;
        return v0;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

