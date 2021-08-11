/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.client.x.P;
import net.minecraft.client.x.au;

class f
implements JsonDeserializer<au> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public au a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float[] arrf = this.a(jsonObject);
        int n2 = this.b(jsonObject);
        return new au(arrf, n2);
    }

    protected int b(JsonObject jsonObject) {
        int n2;
        block3: {
            int n3;
            block5: {
                String[] arrstring;
                block4: {
                    block2: {
                        n2 = aG.a(jsonObject, "rotation", 0);
                        arrstring = P.o();
                        n3 = n2;
                        if (arrstring != null) break block2;
                        if (n3 < 0) break block3;
                        n3 = n2 % 90;
                    }
                    if (arrstring != null) break block4;
                    if (n3 != 0) break block3;
                    n3 = n2 / 90;
                }
                if (arrstring != null) break block5;
                if (n3 > 3) break block3;
                n3 = n2;
            }
            return n3;
        }
        throw new JsonParseException("Invalid rotation " + n2 + " found, only 0/90/180/270 allowed");
    }

    @Nullable
    private float[] a(JsonObject jsonObject) {
        float[] arrf;
        block6: {
            String[] arrstring = P.o();
            JsonObject jsonObject2 = jsonObject;
            String string = "uv";
            if (arrstring == null) {
                if (!jsonObject2.has(string)) {
                    return null;
                }
                jsonObject2 = jsonObject;
                string = "uv";
            }
            JsonArray jsonArray = aG.i(jsonObject2, string);
            int n2 = jsonArray.size();
            if (arrstring == null) {
                if (n2 != 4) {
                    throw new JsonParseException("Expected 4 uv values, found: " + jsonArray.size());
                }
                n2 = 4;
            }
            float[] arrf2 = new float[n2];
            for (int i2 = 0; i2 < arrf2.length; ++i2) {
                arrf = arrf2;
                if (arrstring == null) {
                    arrf[i2] = aG.a(jsonArray.get(i2), "uv[" + i2 + "]");
                    if (arrstring == null) continue;
                }
                break block6;
            }
            arrf = arrf2;
        }
        return arrf;
    }

    f() {
    }
}

