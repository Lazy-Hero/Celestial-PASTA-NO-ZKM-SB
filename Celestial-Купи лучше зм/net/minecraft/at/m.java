/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  javax.annotation.Nullable
 */
package net.minecraft.at;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.minecraft.I.a;
import net.minecraft.I.b;
import net.minecraft.I.d;
import net.minecraft.at.c;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.l;

public class m
implements JsonDeserializer<i>,
JsonSerializer<i> {
    @Nullable
    public JsonElement a(i i2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        i i3;
        JsonObject jsonObject2;
        net.minecraft.k.m[] arrm;
        block20: {
            Boolean bl2;
            block19: {
                arrm = c.b();
                if (i2.b()) {
                    return null;
                }
                jsonObject2 = new JsonObject();
                bl2 = i.i(i2);
                if (arrm == null) {
                    if (bl2 != null) {
                        jsonObject2.addProperty("bold", i.i(i2));
                    }
                    bl2 = i.g(i2);
                }
                if (arrm == null) {
                    if (bl2 != null) {
                        jsonObject2.addProperty("italic", i.g(i2));
                    }
                    bl2 = i.d(i2);
                }
                if (arrm == null) {
                    if (bl2 != null) {
                        jsonObject2.addProperty("underlined", i.d(i2));
                    }
                    bl2 = i.c(i2);
                }
                if (arrm != null) break block19;
                if (bl2 != null) {
                    jsonObject2.addProperty("strikethrough", i.c(i2));
                }
                i3 = i2;
                if (arrm != null) break block20;
                bl2 = i.b(i3);
            }
            if (bl2 != null) {
                jsonObject2.addProperty("obfuscated", i.b(i2));
            }
            i3 = i2;
        }
        if (arrm == null) {
            if (i.a(i3) != null) {
                jsonObject2.add("color", jsonSerializationContext.serialize((Object)i.a(i2)));
            }
            i3 = i2;
        }
        if (arrm == null) {
            if (i.e(i3) != null) {
                jsonObject2.add("insertion", jsonSerializationContext.serialize((Object)i.e(i2)));
            }
            i3 = i2;
        }
        if (arrm == null) {
            if (i.h(i3) != null) {
                jsonObject = new JsonObject();
                jsonObject.addProperty("action", i.h(i2).d().a());
                jsonObject.addProperty("value", i.h(i2).c());
                jsonObject2.add("clickEvent", (JsonElement)jsonObject);
            }
            i3 = i2;
        }
        if (i.f(i3) != null) {
            jsonObject = new JsonObject();
            jsonObject.addProperty("action", i.f(i2).b().a());
            jsonObject.add("value", jsonSerializationContext.serialize((Object)i.f(i2).a()));
            jsonObject2.add("hoverEvent", (JsonElement)jsonObject);
        }
        return jsonObject2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Nullable
    public i a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) throws JsonParseException {
        block30: {
            block27: {
                block29: {
                    block28: {
                        var4_4 = c.b();
                        if (var1_1.isJsonObject() == false) return null;
                        var5_5 = new i();
                        v0 = var6_6 = var1_1.getAsJsonObject();
                        if (var4_4 == null) {
                            if (v0 == null) {
                                return null;
                            }
                            v0 = var6_6;
                        }
                        v1 = v0.has("bold");
                        if (var4_4 == null) {
                            if (v1) {
                                i.b(var5_5, var6_6.get("bold").getAsBoolean());
                            }
                            v1 = var6_6.has("italic");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.a(var5_5, var6_6.get("italic").getAsBoolean());
                            }
                            v1 = var6_6.has("underlined");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.d(var5_5, var6_6.get("underlined").getAsBoolean());
                            }
                            v1 = var6_6.has("strikethrough");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.c(var5_5, var6_6.get("strikethrough").getAsBoolean());
                            }
                            v1 = var6_6.has("obfuscated");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.e(var5_5, var6_6.get("obfuscated").getAsBoolean());
                            }
                            v1 = var6_6.has("color");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.a(var5_5, (l)var3_3.deserialize(var6_6.get("color"), l.class));
                            }
                            v1 = var6_6.has("insertion");
                        }
                        if (var4_4 == null) {
                            if (v1) {
                                i.a(var5_5, var6_6.get("insertion").getAsString());
                            }
                            v1 = var6_6.has("clickEvent");
                        }
                        if (var4_4 != null) break block27;
                        if (!v1) break block28;
                        v2 = var7_7 = var6_6.getAsJsonObject("clickEvent");
                        if (var4_4 != null) break block29;
                        if (v2 == null) break block28;
                        v3 = var8_8 = var7_7.getAsJsonPrimitive("action");
                        if (var4_4 != null) ** GOTO lbl56
                        if (v3 == null) {
                            v4 = null;
                        } else {
                            v3 = var8_8;
lbl56:
                            // 2 sources

                            v4 = a.a(v3.getAsString());
                        }
                        var9_9 = v4;
                        v5 = var10_10 = var7_7.getAsJsonPrimitive("value");
                        if (var4_4 != null) ** GOTO lbl64
                        if (v5 == null) {
                            v6 = null;
                        } else {
                            v5 = var10_10;
lbl64:
                            // 2 sources

                            v6 = var11_12 = v5.getAsString();
                        }
                        if (var9_9 == null || var11_12 == null) break block28;
                        v1 = var9_9.b();
                        if (var4_4 != null) break block27;
                        if (v1) {
                            i.a(var5_5, new d((a)var9_9, var11_12));
                        }
                    }
                    v2 = var6_6;
                }
                v7 = "hoverEvent";
                if (var4_4 != null) break block30;
                v1 = v2.has(v7);
            }
            if (v1 == false) return var5_5;
            v2 = var6_6;
            v7 = "hoverEvent";
        }
        v8 = var7_7 = v2.getAsJsonObject(v7);
        if (var4_4 == null) {
            if (v8 == null) return var5_5;
            v8 = var7_7;
        }
        v9 = var8_8 = v8.getAsJsonPrimitive("action");
        if (var4_4 != null) ** GOTO lbl92
        if (v9 == null) {
            v10 = null;
        } else {
            v9 = var8_8;
lbl92:
            // 2 sources

            v10 = net.minecraft.I.c.a(v9.getAsString());
        }
        var9_9 = v10;
        var10_11 = (k)var3_3.deserialize(var7_7.get("value"), k.class);
        if (var9_9 == null) return var5_5;
        if (var10_11 == null) return var5_5;
        if (var9_9.b() == false) return var5_5;
        i.a(var5_5, new b((net.minecraft.I.c)var9_9, var10_11));
        return var5_5;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

