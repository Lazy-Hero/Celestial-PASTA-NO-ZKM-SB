/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.v;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.client.v.a;
import net.minecraft.client.v.p;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;

public class c
extends a<p> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public p a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        p p2;
        block14: {
            float[] arrf;
            float[] arrf2;
            float[] arrf3;
            block12: {
                int n2;
                String string;
                JsonObject jsonObject;
                float f10;
                float f11;
                float f12;
                String string2;
                block13: {
                    boolean bl2;
                    JsonObject jsonObject2;
                    block11: {
                        jsonObject2 = jsonElement.getAsJsonObject();
                        arrf3 = new float[256];
                        arrf2 = new float[256];
                        string2 = a.b();
                        arrf = new float[256];
                        f12 = 1.0f;
                        f11 = 0.0f;
                        f10 = 0.0f;
                        bl2 = jsonObject2.has("characters");
                        if (string2 != null) break block11;
                        if (!bl2) break block12;
                        jsonObject = jsonObject2;
                        string = "characters";
                        if (string2 != null) break block13;
                        bl2 = jsonObject.get(string).isJsonObject();
                    }
                    if (!bl2) {
                        throw new JsonParseException("Invalid font->characters: expected object, was " + (Object)jsonObject2.get("characters"));
                    }
                    jsonObject = jsonObject2;
                    string = "characters";
                }
                JsonObject jsonObject3 = jsonObject.getAsJsonObject(string);
                int n3 = jsonObject3.has("default");
                if (string2 == null) {
                    if (n3 != 0) {
                        JsonObject jsonObject4 = jsonObject3;
                        String string3 = "default";
                        if (string2 == null) {
                            if (!jsonObject4.get(string3).isJsonObject()) {
                                throw new JsonParseException("Invalid font->characters->default: expected object, was " + (Object)jsonObject3.get("default"));
                            }
                            jsonObject4 = jsonObject3;
                            string3 = "default";
                        }
                        JsonObject jsonObject5 = jsonObject4.getAsJsonObject(string3);
                        f12 = aG.a(jsonObject5, "width", f12);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f12, (String)"Invalid default width");
                        f11 = aG.a(jsonObject5, "spacing", f11);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f11, (String)"Invalid default spacing");
                        f10 = aG.a(jsonObject5, "left", f11);
                        Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f10, (String)"Invalid default left");
                    }
                    n3 = n2 = 0;
                }
                while (n2 < 256) {
                    JsonElement jsonElement2 = jsonObject3.get(Integer.toString(n2));
                    float f13 = f12;
                    float f14 = f11;
                    float f15 = f10;
                    if (string2 == null) {
                        if (jsonElement2 != null) {
                            JsonObject jsonObject6 = aG.b(jsonElement2, "characters[" + n2 + "]");
                            f13 = aG.a(jsonObject6, "width", f12);
                            Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f13, (String)"Invalid width");
                            f14 = aG.a(jsonObject6, "spacing", f11);
                            Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f14, (String)"Invalid spacing");
                            f15 = aG.a(jsonObject6, "left", f10);
                            Validate.inclusiveBetween((double)0.0, (double)3.4028234663852886E38, (double)f15, (String)"Invalid left");
                        }
                        arrf3[n2] = f13;
                        arrf2[n2] = f14;
                        arrf[n2] = f15;
                        ++n2;
                    }
                    if (string2 == null) continue;
                }
            }
            p2 = new p(arrf3, arrf, arrf2);
            if (m.d()) break block14;
            a.b("SGjKU");
        }
        return p2;
    }

    @Override
    public String a() {
        return "font";
    }
}

