/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.Q;
import net.minecraft.ar.aA;
import net.minecraft.ar.aG;
import net.minecraft.client.x.P;
import net.minecraft.client.x.l;
import net.minecraft.client.x.w;
import net.minecraft.client.x.z;
import net.minecraft.k.h;
import org.lwjgl.util.vector.Vector3f;

class u
implements JsonDeserializer<l> {
    private Map<aA, z> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        Map<aA, z> map = this.a(jsonDeserializationContext, jsonObject);
        String[] arrstring = P.o();
        Map<aA, z> map2 = map;
        if (arrstring == null) {
            if (map2.isEmpty()) {
                throw new JsonParseException("Expected between 1 and 6 unique faces, got 0");
            }
            map2 = map;
        }
        return map2;
    }

    private Vector3f a(JsonObject jsonObject) {
        Vector3f vector3f;
        block3: {
            Vector3f vector3f2;
            block8: {
                float f10;
                block7: {
                    String[] arrstring;
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    vector3f = this.a(jsonObject, "from");
                                    arrstring = P.o();
                                    float f11 = vector3f.x - -16.0f;
                                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                    if (arrstring != null) break block2;
                                    if (f10 < 0) break block3;
                                    float f12 = vector3f.y - -16.0f;
                                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                }
                                if (arrstring != null) break block4;
                                if (f10 < 0) break block3;
                                float f13 = vector3f.z - -16.0f;
                                f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (arrstring != null) break block5;
                            if (f10 < 0) break block3;
                            float f14 = vector3f.x - 32.0f;
                            f10 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                        }
                        if (arrstring != null) break block6;
                        if (f10 > 0) break block3;
                        float f15 = vector3f.y - 32.0f;
                        f10 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                    }
                    if (arrstring != null) break block7;
                    if (f10 > 0) break block3;
                    vector3f2 = vector3f;
                    if (arrstring != null) break block8;
                    float f16 = vector3f2.z - 32.0f;
                    f10 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                }
                if (f10 > 0) break block3;
                vector3f2 = vector3f;
            }
            return vector3f2;
        }
        throw new JsonParseException("'from' specifier exceeds the allowed boundaries: " + (Object)vector3f);
    }

    private Vector3f b(JsonObject jsonObject) {
        Vector3f vector3f;
        block3: {
            Vector3f vector3f2;
            block8: {
                float f10;
                block7: {
                    String[] arrstring;
                    block6: {
                        block5: {
                            block4: {
                                block2: {
                                    vector3f = this.a(jsonObject, "to");
                                    arrstring = P.o();
                                    float f11 = vector3f.x - -16.0f;
                                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                    if (arrstring != null) break block2;
                                    if (f10 < 0) break block3;
                                    float f12 = vector3f.y - -16.0f;
                                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                }
                                if (arrstring != null) break block4;
                                if (f10 < 0) break block3;
                                float f13 = vector3f.z - -16.0f;
                                f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                            }
                            if (arrstring != null) break block5;
                            if (f10 < 0) break block3;
                            float f14 = vector3f.x - 32.0f;
                            f10 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                        }
                        if (arrstring != null) break block6;
                        if (f10 > 0) break block3;
                        float f15 = vector3f.y - 32.0f;
                        f10 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                    }
                    if (arrstring != null) break block7;
                    if (f10 > 0) break block3;
                    vector3f2 = vector3f;
                    if (arrstring != null) break block8;
                    float f16 = vector3f2.z - 32.0f;
                    f10 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                }
                if (f10 > 0) break block3;
                vector3f2 = vector3f;
            }
            return vector3f2;
        }
        throw new JsonParseException("'to' specifier exceeds the allowed boundaries: " + (Object)vector3f);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    u() {
    }

    private Q e(JsonObject jsonObject) {
        Q q2;
        String string = aG.f(jsonObject, "axis");
        String[] arrstring = P.o();
        Q q3 = q2 = Q.a(string.toLowerCase(Locale.ROOT));
        if (arrstring == null) {
            if (q3 == null) {
                throw new JsonParseException("Invalid rotation axis: " + string);
            }
            q3 = q2;
        }
        return q3;
    }

    private Map<aA, z> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        EnumMap enumMap;
        block2: {
            EnumMap enumMap2 = Maps.newEnumMap(aA.class);
            String[] arrstring = P.o();
            JsonObject jsonObject2 = aG.l(jsonObject, "faces");
            for (Map.Entry entry : jsonObject2.entrySet()) {
                aA aA2 = this.a((String)entry.getKey());
                enumMap = enumMap2;
                if (arrstring == null) {
                    enumMap.put(aA2, jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), z.class));
                    if (arrstring == null) continue;
                }
                break block2;
            }
            enumMap = enumMap2;
        }
        return enumMap;
    }

    private aA a(String string) {
        aA aA2 = aA.a(string);
        String[] arrstring = P.o();
        aA aA3 = aA2;
        if (arrstring == null) {
            if (aA3 == null) {
                throw new JsonParseException("Unknown facing: " + string);
            }
            aA3 = aA2;
        }
        return aA3;
    }

    @Nullable
    private w c(JsonObject jsonObject) {
        w w2;
        block3: {
            String string;
            JsonObject jsonObject2;
            block2: {
                w2 = null;
                String[] arrstring = P.o();
                jsonObject2 = jsonObject;
                string = "rotation";
                if (arrstring != null) break block2;
                if (!jsonObject2.has(string)) break block3;
                jsonObject2 = jsonObject;
                string = "rotation";
            }
            JsonObject jsonObject3 = aG.l(jsonObject2, string);
            Vector3f vector3f = this.a(jsonObject3, "origin");
            vector3f.scale(0.0625f);
            Q q2 = this.e(jsonObject3);
            float f10 = this.d(jsonObject3);
            boolean bl2 = aG.a(jsonObject3, "rescale", false);
            w2 = new w(vector3f, q2, f10, bl2);
        }
        return w2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public l a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) throws JsonParseException {
        var5_4 = var1_1.getAsJsonObject();
        var6_5 = this.a(var5_4);
        var7_6 = this.b(var5_4);
        var8_7 = this.c(var5_4);
        var4_8 = P.o();
        var9_9 = this.b(var3_3, var5_4);
        v0 = var5_4.has("shade");
        if (var4_8 == null) {
            if (v0) {
                v0 = aG.g(var5_4, "shade");
                if (var4_8 == null) {
                    if (!v0) {
                        throw new JsonParseException("Expected shade to be a Boolean");
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = aG.a(var5_4, "shade", true);
            }
        }
        var10_10 = v0;
        return new l(var6_5, var7_6, var9_9, var8_7, var10_10);
    }

    private Vector3f a(JsonObject jsonObject, String string) {
        JsonArray jsonArray = aG.i(jsonObject, string);
        String[] arrstring = P.o();
        int n2 = jsonArray.size();
        if (arrstring == null) {
            if (n2 != 3) {
                throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
            }
            n2 = 3;
        }
        float[] arrf = new float[n2];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = aG.a(jsonArray.get(i2), string + "[" + i2 + "]");
            if (arrstring == null) continue;
        }
        return new Vector3f(arrf[0], arrf[1], arrf[2]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float d(JsonObject jsonObject) {
        float f10 = aG.h(jsonObject, "angle");
        String[] arrstring = P.o();
        float f11 = f10;
        if (arrstring != null) return f11;
        if (f11 != 0.0f) {
            f11 = h.e(f10);
            if (arrstring != null) return f11;
            if (f11 != 22.5f) {
                f11 = h.e(f10);
                if (arrstring != null) return f11;
                if (f11 != 45.0f) {
                    throw new JsonParseException("Invalid rotation " + f10 + " found, only -45/-22.5/0/22.5/45 allowed");
                }
            }
        }
        f11 = f10;
        return f11;
    }
}

