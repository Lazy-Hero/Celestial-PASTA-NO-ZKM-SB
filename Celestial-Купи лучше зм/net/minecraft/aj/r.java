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
 */
package net.minecraft.aj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.aj.c;
import net.minecraft.aj.i;
import net.minecraft.ar.aG;

public class r
implements JsonDeserializer<i>,
JsonSerializer<i> {
    public JsonElement a(i i2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("pools", jsonSerializationContext.serialize((Object)i.a(i2)));
        return jsonObject;
    }

    public i a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = aG.b(jsonElement, "loot table");
        c[] arrc = aG.a(jsonObject, "pools", new c[0], jsonDeserializationContext, c[].class);
        return new i(arrc);
    }
}

