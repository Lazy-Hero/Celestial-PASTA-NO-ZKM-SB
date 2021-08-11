/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 */
package net.minecraft.r;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.r.m;

final class u
implements JsonDeserializer<k> {
    u() {
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public k a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        block8: {
            k k2;
            block5: {
                JsonElement jsonElement2;
                String string;
                block7: {
                    boolean bl2;
                    block6: {
                        string = m.b();
                        bl2 = jsonElement.isJsonPrimitive();
                        if (string != null) break block6;
                        if (bl2) {
                            return new g(jsonElement.getAsString());
                        }
                        jsonElement2 = jsonElement;
                        if (string != null) break block7;
                        bl2 = jsonElement2.isJsonArray();
                    }
                    if (!bl2) break block8;
                    jsonElement2 = jsonElement;
                }
                JsonArray jsonArray = jsonElement2.getAsJsonArray();
                k k3 = null;
                for (JsonElement jsonElement3 : jsonArray) {
                    block9: {
                        k k4;
                        block10: {
                            k4 = this.a(jsonElement3, jsonElement3.getClass(), jsonDeserializationContext);
                            k2 = k3;
                            if (string != null) break block5;
                            if (string != null) break block9;
                            if (k2 != null) break block10;
                            k3 = k4;
                            if (string == null) break block9;
                        }
                        k3.a(k4);
                    }
                    if (string == null) continue;
                }
                k2 = k3;
            }
            return k2;
        }
        throw new JsonParseException("Don't know how to turn " + (Object)jsonElement + " into a Component");
    }
}

