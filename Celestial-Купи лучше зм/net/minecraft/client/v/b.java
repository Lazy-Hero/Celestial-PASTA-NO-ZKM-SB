/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.v;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.client.v.a;
import net.minecraft.client.v.h;
import net.minecraft.client.v.i;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;

public class b
extends a<h>
implements JsonSerializer<h> {
    private static ClassCastException a(ClassCastException classCastException) {
        return classCastException;
    }

    public JsonElement a(h h2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block10: {
            int n2;
            String string;
            block12: {
                int n3;
                block11: {
                    jsonObject = new JsonObject();
                    string = a.b();
                    jsonObject.addProperty("frametime", (Number)h2.a());
                    n2 = h2.b();
                    n3 = -1;
                    if (string != null) break block11;
                    if (n2 != n3) {
                        jsonObject.addProperty("width", (Number)h2.b());
                    }
                    n2 = h2.e();
                    if (string != null) break block12;
                    n3 = -1;
                }
                if (n2 != n3) {
                    jsonObject.addProperty("height", (Number)h2.e());
                }
                n2 = h2.f();
            }
            if (n2 > 0) {
                JsonArray jsonArray = new JsonArray();
                for (int i2 = 0; i2 < h2.f(); ++i2) {
                    if (string == null) {
                        if (h2.b(i2)) {
                            JsonObject jsonObject2 = new JsonObject();
                            jsonObject2.addProperty("index", (Number)h2.c(i2));
                            jsonObject2.addProperty("time", (Number)h2.a(i2));
                            jsonArray.add((JsonElement)jsonObject2);
                            if (string == null) continue;
                        }
                        jsonArray.add((JsonElement)new JsonPrimitive((Number)h2.c(i2)));
                        if (string == null) continue;
                    }
                    break block10;
                }
                jsonObject.add("frames", (JsonElement)jsonArray);
            }
        }
        return jsonObject;
    }

    @Override
    public String a() {
        return "animation";
    }

    private i a(int n2, JsonElement jsonElement) {
        block8: {
            JsonElement jsonElement2;
            String string;
            block7: {
                boolean bl2;
                block6: {
                    string = a.b();
                    bl2 = jsonElement.isJsonPrimitive();
                    if (string != null) break block6;
                    if (bl2) {
                        return new i(aG.f(jsonElement, "frames[" + n2 + "]"));
                    }
                    jsonElement2 = jsonElement;
                    if (string != null) break block7;
                    bl2 = jsonElement2.isJsonObject();
                }
                if (!bl2) break block8;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "frames[" + n2 + "]");
            int n3 = aG.a(jsonObject, "time", -1);
            int n4 = jsonObject.has("time");
            if (string == null) {
                if (n4 != 0) {
                    Validate.inclusiveBetween((long)1L, (long)Integer.MAX_VALUE, (long)n3, (String)"Invalid frame time");
                }
                n4 = aG.d(jsonObject, "index");
            }
            int n5 = n4;
            Validate.inclusiveBetween((long)0L, (long)Integer.MAX_VALUE, (long)n5, (String)"Invalid frame index");
            return new i(n5, n3);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public h a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) throws JsonParseException {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var5_4 = Lists.newArrayList();
                        var4_5 = a.b();
                        var6_6 = aG.b(var1_1, "metadata section");
                        v0 = var7_7 = aG.a(var6_6, "frametime", 1);
                        if (var4_5 == null) {
                            if (!v0) {
                                Validate.inclusiveBetween((long)1L, (long)0x7FFFFFFFL, (long)((long)var7_7), (String)"Invalid default frame time");
                            }
                            v0 = (boolean)(var6_6.has("frames") ? 1 : 0);
                        }
                        if (var4_5 != null) break block15;
                        if (!v0) break block14;
                        try {
                            var8_8 = aG.i(var6_6, "frames");
                            var9_11 = 0;
lbl14:
                            // 2 sources

                            while (var9_11 < var8_8.size()) {
                                var10_12 = var8_8.get(var9_11);
                                var11_14 = this.a(var9_11, var10_12);
                                if (var4_5 != null) break block14;
                                if (var4_5 != null) ** GOTO lbl27
                                ** GOTO lbl-1000
                            }
                            break block14;
                        }
                        catch (ClassCastException var8_9) {
                            throw new JsonParseException("Invalid animation->frames: expected array, was " + (Object)var6_6.get("frames"), (Throwable)var8_9);
                        }
lbl-1000:
                        // 1 sources

                        {
                            if (var11_14 == null) ** GOTO lbl-1000
                        }
                        {
                            var5_4.add(var11_14);
                        }
lbl-1000:
                        // 2 sources

                        {
                            ++var9_11;
lbl27:
                            // 2 sources

                            if (var4_5 == null) ** GOTO lbl14
                            {
                                m.b(m.c() == false);
                            }
                        }
                    }
                    v0 = aG.a(var6_6, "width", -1);
                }
                var8_10 = v0;
                var9_11 = aG.a(var6_6, "height", -1);
                v1 = var8_10;
                v2 = BADBOOL -1;
                if (var4_5 != null) break block16;
                if (v1 != v2) {
                    Validate.inclusiveBetween((long)1L, (long)0x7FFFFFFFL, (long)((long)var8_10), (String)"Invalid width");
                }
                v1 = var9_11;
                if (var4_5 != null) break block17;
                v2 = BADBOOL -1;
            }
            if (v1 != v2) {
                Validate.inclusiveBetween((long)1L, (long)0x7FFFFFFFL, (long)var9_11, (String)"Invalid height");
            }
            v1 = (boolean)(aG.a(var6_6, "interpolate", false) ? 1 : 0);
        }
        var10_13 = v1;
        return new h(var5_4, var8_10 ? 1 : 0, var9_11 ? 1 : 0, var7_7 ? 1 : 0, var10_13);
    }
}

