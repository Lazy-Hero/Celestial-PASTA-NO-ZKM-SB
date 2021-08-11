/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonParseException
 */
package net.minecraft.r;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import net.minecraft.P.r;
import net.minecraft.ar.aD;
import net.minecraft.ar.aG;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.av.a;
import net.minecraft.r.u;

public class m
implements a {
    private static /* synthetic */ String b;
    public static final /* synthetic */ Gson c;

    @Override
    public r a(r r2) {
        block3: {
            block2: {
                String string = m.b();
                if (string != null) break block2;
                if (!"Sign".equals(r2.j("id"))) break block3;
                this.a(r2, "Text1");
                this.a(r2, "Text2");
                this.a(r2, "Text3");
            }
            this.a(r2, "Text4");
        }
        return r2;
    }

    public static void b(String string) {
        b = string;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(r var1_1, String var2_2) {
        block21: {
            block16: {
                block20: {
                    block18: {
                        block19: {
                            block17: {
                                block15: {
                                    var4_3 = var1_1.j(var2_2);
                                    var3_4 = m.b();
                                    var5_5 = null;
                                    v0 = "null".equals(var4_3);
                                    if (var3_4 != null) break block15;
                                    if (v0 != 0) break block16;
                                    v0 = aD.a(var4_3);
                                }
                                if (var3_4 != null) break block17;
                                if (v0 != 0) break block16;
                                v0 = var4_3.charAt(0);
                            }
                            v1 = 34;
                            if (var3_4 != null) break block18;
                            if (v0 != v1) break block19;
                            v2 = var4_3;
                            if (var3_4 != null) ** GOTO lbl34
                            if (v2.charAt(var4_3.length() - 1) == '\"') ** GOTO lbl-1000
                        }
                        v0 = var4_3.charAt(0);
                        v1 = 123;
                    }
                    if (var3_4 != null) break block20;
                    if (v0 != v1) ** GOTO lbl-1000
                    v2 = var4_3;
                    if (var3_4 != null) ** GOTO lbl34
                    v0 = v2.charAt(var4_3.length() - 1);
                    v1 = 125;
                }
                ** if (v0 != v1) goto lbl-1000
lbl-1000:
                // 2 sources

                {
                    try {
                        v2 = aG.a(m.c, var4_3, k.class, true);
lbl34:
                        // 3 sources

                        if ((var5_6 = (k)v2) == null) {
                            var5_7 = new g("");
                        }
                    }
                    catch (JsonParseException var6_18) {
                        // empty catch block
                    }
                    v3 = var5_9;
                    if (var3_4 == null) {
                        if (v3 == null) {
                            try {
                                var5_10 = o.a(var4_3);
                            }
                            catch (JsonParseException var6_19) {
                                // empty catch block
                            }
                        }
                        v3 = var5_11;
                    }
                    if (var3_4 == null) {
                        if (v3 == null) {
                            try {
                                var5_12 = o.b(var4_3);
                            }
                            catch (JsonParseException var6_20) {
                                // empty catch block
                            }
                        }
                        v3 = var5_13;
                    }
                    if (v3 == null) {
                        var5_14 = new g(var4_3);
                    }
                    ** GOTO lbl63
                }
lbl-1000:
                // 2 sources

                {
                    var5_15 = new g(var4_3);
                }
                break block21;
            }
            var5_16 = new g("");
        }
        var1_1.a(var2_2, o.a((k)var5_17));
    }

    public static String b() {
        return b;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    static {
        c = new GsonBuilder().registerTypeAdapter(k.class, (Object)new u()).create();
        m.b(null);
    }

    @Override
    public int a() {
        return 101;
    }
}

