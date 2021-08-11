/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.x;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.client.x.b;

class c
implements JsonDeserializer<b> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    protected Map<v, Float> a(JsonObject jsonObject) {
        LinkedHashMap linkedHashMap;
        block2: {
            LinkedHashMap linkedHashMap2 = Maps.newLinkedHashMap();
            JsonObject jsonObject2 = aG.l(jsonObject, "predicate");
            String[] arrstring = P.o();
            for (Map.Entry entry : jsonObject2.entrySet()) {
                linkedHashMap = linkedHashMap2;
                if (arrstring == null) {
                    linkedHashMap.put(new v((String)entry.getKey()), Float.valueOf(aG.a((JsonElement)entry.getValue(), (String)entry.getKey())));
                    if (arrstring == null) continue;
                }
                break block2;
            }
            linkedHashMap = linkedHashMap2;
        }
        return linkedHashMap;
    }

    public b a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        v v2 = new v(aG.f(jsonObject, "model"));
        Map<v, Float> map = this.a(jsonObject);
        return new b(v2, map);
    }

    c() {
    }
}

