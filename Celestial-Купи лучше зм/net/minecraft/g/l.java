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
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.b;
import net.minecraft.g.d;
import net.minecraft.g.f;

public class l
implements JsonDeserializer<d>,
JsonSerializer<d> {
    public JsonElement a(d d10, Type type, JsonSerializationContext jsonSerializationContext) {
        f<d> f10 = b.a(d10);
        JsonObject jsonObject = new JsonObject();
        f10.a(jsonObject, d10, jsonSerializationContext);
        jsonObject.addProperty("condition", f10.c().toString());
        return jsonObject;
    }

    public d a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        f<?> f10;
        JsonObject jsonObject = aG.b(jsonElement, "condition");
        v v2 = new v(aG.f(jsonObject, "condition"));
        try {
            f10 = b.a(v2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new JsonSyntaxException("Unknown condition '" + v2 + "'");
        }
        return f10.a(jsonObject, jsonDeserializationContext);
    }
}

