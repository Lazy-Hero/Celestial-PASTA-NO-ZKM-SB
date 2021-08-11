/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.m;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.B.X;
import net.minecraft.aj.l;
import net.minecraft.ar.aG;
import net.minecraft.m.m;

class w {
    @Nullable
    private final /* synthetic */ UUID a;
    private final /* synthetic */ X[] d;
    private final /* synthetic */ String f;
    private final /* synthetic */ l c;
    private final /* synthetic */ int b;
    private final /* synthetic */ String e;

    private static int a(String string) {
        block8: {
            int n2;
            block7: {
                net.minecraft.k.m[] arrm = m.b();
                n2 = "addition".equals(string);
                if (arrm != null) {
                    if (n2 != 0) {
                        return 0;
                    }
                    n2 = "multiply_base".equals(string);
                }
                if (arrm != null) {
                    if (n2 != 0) {
                        return 1;
                    }
                    n2 = "multiply_total".equals(string) ? 1 : 0;
                }
                if (arrm == null) break block7;
                if (n2 == 0) break block8;
                n2 = 2;
            }
            return n2;
        }
        throw new JsonSyntaxException("Unknown attribute modifier operation " + string);
    }

    static X[] a(w w2) {
        return w2.d;
    }

    private static String a(int n2) {
        switch (n2) {
            case 0: {
                return "addition";
            }
            case 1: {
                return "multiply_base";
            }
            case 2: {
                return "multiply_total";
            }
        }
        throw new IllegalArgumentException("Unknown operation " + n2);
    }

    static String b(w w2) {
        return w2.e;
    }

    private w(String string, String string2, int n2, l l2, X[] arrx, @Nullable UUID uUID) {
        this.e = string;
        this.f = string2;
        this.b = n2;
        this.c = l2;
        this.a = uUID;
        this.d = arrx;
    }

    static String e(w w2) {
        return w2.f;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static w a(JsonObject var0, JsonDeserializationContext var1_1) {
        block20: {
            block19: {
                block15: {
                    block18: {
                        block16: {
                            block17: {
                                var3_2 = aG.f(var0, "name");
                                var4_3 = aG.f(var0, "attribute");
                                var5_4 = w.a(aG.f(var0, "operation"));
                                var6_5 = aG.a(var0, "amount", var1_1, l.class);
                                var2_6 = m.b();
                                var7_7 = null;
                                v0 = aG.a(var0, "slot");
                                if (var2_6 == null) break block16;
                                if (!v0) break block17;
                                var8_8 = new X[]{X.a(aG.f(var0, "slot"))};
                                if (var2_6 != null) break block15;
                                net.minecraft.k.m.b(net.minecraft.k.m.c() == false);
                            }
                            v1 = var0;
                            v2 = "slot";
                            if (var2_6 == null) break block18;
                            v0 = aG.k(v1, v2);
                        }
                        if (!v0) {
                            throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
                        }
                        v1 = var0;
                        v2 = "slot";
                    }
                    var9_9 = aG.i(v1, v2);
                    var8_8 = new X[var9_9.size()];
                    var10_11 = 0;
                    for (JsonElement var12_14 : var9_9) {
                        var8_8[var10_11++] = X.a(aG.e(var12_14, "slot"));
                        if (var2_6 != null) {
                            if (var2_6 != null) continue;
                        }
                        break block15;
                    }
                    v3 = var8_8.length;
                    if (var2_6 != null) {
                        if (v3 == 0) {
                            throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
                        } else {
                            ** GOTO lbl37
                        }
                    }
                    break block19;
                }
                v4 = var0;
                v5 = "id";
                if (var2_6 == null) break block20;
                v3 = v4.has(v5);
            }
            if (v3 == 0) return new w(var3_2, var4_3, var5_4, var6_5, var8_8, var7_7);
            v4 = var0;
            v5 = "id";
        }
        var9_10 = aG.f(v4, v5);
        try {
            var7_7 = UUID.fromString(var9_10);
            return new w(var3_2, var4_3, var5_4, var6_5, var8_8, var7_7);
        }
        catch (IllegalArgumentException var10_12) {
            throw new JsonSyntaxException("Invalid attribute modifier id '" + var9_10 + "' (must be UUID format, with dashes)");
        }
    }

    static l f(w w2) {
        return w2.c;
    }

    public JsonObject a(JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block9: {
            block7: {
                net.minecraft.k.m[] arrm;
                block8: {
                    net.minecraft.k.m[] arrm2 = m.b();
                    jsonObject = new JsonObject();
                    jsonObject.addProperty("name", this.e);
                    jsonObject.addProperty("attribute", this.f);
                    jsonObject.addProperty("operation", w.a(this.b));
                    arrm = arrm2;
                    jsonObject.add("amount", jsonSerializationContext.serialize((Object)this.c));
                    w w2 = this;
                    if (arrm != null) {
                        if (w2.a != null) {
                            jsonObject.addProperty("id", this.a.toString());
                        }
                        w2 = this;
                    }
                    if (w2.d.length != 1) break block8;
                    jsonObject.addProperty("slot", this.d[0].c());
                    if (arrm != null) break block7;
                }
                JsonArray jsonArray = new JsonArray();
                for (X x2 : this.d) {
                    jsonArray.add((JsonElement)new JsonPrimitive(x2.c()));
                    if (arrm != null) {
                        if (arrm != null) continue;
                    }
                    break block7;
                }
                jsonObject.add("slot", (JsonElement)jsonArray);
            }
            if (net.minecraft.k.m.d()) break block9;
            m.b(new net.minecraft.k.m[1]);
        }
        return jsonObject;
    }

    static UUID c(w w2) {
        return w2.a;
    }

    static int d(w w2) {
        return w2.b;
    }
}

