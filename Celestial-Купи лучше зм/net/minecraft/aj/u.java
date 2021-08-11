/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 */
package net.minecraft.aj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.aj.j;
import net.minecraft.aj.l;
import net.minecraft.ar.aG;
import net.minecraft.k.m;

public class u
implements JsonDeserializer<l>,
JsonSerializer<l> {
    public l a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        m[] arrm = j.b();
        JsonElement jsonElement2 = jsonElement;
        if (arrm != null) {
            if (aG.a(jsonElement2)) {
                return new l(aG.a(jsonElement, "value"));
            }
            jsonElement2 = jsonElement;
        }
        JsonObject jsonObject = aG.b(jsonElement2, "value");
        float f10 = aG.h(jsonObject, "min");
        float f11 = aG.h(jsonObject, "max");
        return new l(f10, f11);
    }

    public JsonElement a(l l2, Type type, JsonSerializationContext jsonSerializationContext) {
        if (l.b(l2) == l.a(l2)) {
            return new JsonPrimitive((Number)Float.valueOf(l.b(l2)));
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("min", (Number)Float.valueOf(l.b(l2)));
        jsonObject.addProperty("max", (Number)Float.valueOf(l.a(l2)));
        return jsonObject;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

