/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.client.v;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.at.k;
import net.minecraft.client.v.a;
import net.minecraft.client.v.m;

public class e
extends a<m>
implements JsonSerializer<m> {
    public m a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        k k2 = (k)jsonDeserializationContext.deserialize(jsonObject.get("description"), k.class);
        if (k2 == null) {
            throw new JsonParseException("Invalid/missing description!");
        }
        int n2 = aG.d(jsonObject, "pack_format");
        return new m(k2, n2);
    }

    public JsonElement a(m m2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_format", (Number)m2.b());
        jsonObject.add("description", jsonSerializationContext.serialize((Object)m2.a()));
        return jsonObject;
    }

    @Override
    public String a() {
        return "pack";
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

