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
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.ar.aG;
import net.minecraft.client.p.n;
import net.minecraft.client.x.P;
import net.minecraft.client.x.W;
import net.minecraft.client.x.Z;

public class T
implements JsonDeserializer<Z> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected Map<String, W> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        HashMap hashMap;
        HashMap hashMap2;
        block4: {
            String string;
            JsonObject jsonObject2;
            String[] arrstring;
            block3: {
                hashMap2 = Maps.newHashMap();
                arrstring = P.o();
                jsonObject2 = jsonObject;
                string = "variants";
                if (arrstring != null) break block3;
                if (!jsonObject2.has(string)) break block4;
                jsonObject2 = jsonObject;
                string = "variants";
            }
            JsonObject jsonObject3 = aG.l(jsonObject2, string);
            for (Map.Entry entry : jsonObject3.entrySet()) {
                hashMap = hashMap2;
                if (arrstring != null) return hashMap;
                hashMap.put(entry.getKey(), jsonDeserializationContext.deserialize((JsonElement)entry.getValue(), W.class));
                if (arrstring == null) continue;
            }
        }
        hashMap = hashMap2;
        return hashMap;
    }

    public Z a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        block4: {
            n n2;
            Map<String, W> map;
            block2: {
                n n3;
                block3: {
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    map = this.b(jsonDeserializationContext, jsonObject);
                    String[] arrstring = P.o();
                    n2 = this.a(jsonDeserializationContext, jsonObject);
                    if (!map.isEmpty()) break block2;
                    n3 = n2;
                    if (arrstring != null) break block3;
                    if (n3 == null) break block4;
                    n3 = n2;
                }
                if (n3.a().isEmpty()) break block4;
            }
            return new Z(map, n2);
        }
        throw new JsonParseException("Neither 'variants' nor 'multipart' found");
    }

    @Nullable
    protected n a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        String[] arrstring = P.o();
        JsonObject jsonObject2 = jsonObject;
        String string = "multipart";
        if (arrstring == null) {
            if (!jsonObject2.has(string)) {
                return null;
            }
            jsonObject2 = jsonObject;
            string = "multipart";
        }
        JsonArray jsonArray = aG.i(jsonObject2, string);
        return (n)jsonDeserializationContext.deserialize((JsonElement)jsonArray, n.class);
    }
}

