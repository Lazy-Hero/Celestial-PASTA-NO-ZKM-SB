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
package net.minecraft.m;

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
import net.minecraft.g.d;
import net.minecraft.m.a;
import net.minecraft.m.c;
import net.minecraft.m.m;

public class b
implements JsonDeserializer<m>,
JsonSerializer<m> {
    public JsonElement a(m m2, Type type, JsonSerializationContext jsonSerializationContext) {
        net.minecraft.k.m[] arrm = m.b();
        c<m> c10 = a.a(m2);
        JsonObject jsonObject = new JsonObject();
        c10.a(jsonObject, m2, jsonSerializationContext);
        net.minecraft.k.m[] arrm2 = arrm;
        JsonObject jsonObject2 = jsonObject;
        if (arrm2 != null) {
            jsonObject2.addProperty("function", c10.a().toString());
            if (m2.c() != null && m2.c().length > 0) {
                jsonObject.add("conditions", jsonSerializationContext.serialize((Object)m2.c()));
            }
            jsonObject2 = jsonObject;
        }
        return jsonObject2;
    }

    public m a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        c<v> c10;
        JsonObject jsonObject = aG.b(jsonElement, "function");
        v v2 = new v(aG.f(jsonObject, "function"));
        try {
            c10 = a.a(v2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new JsonSyntaxException("Unknown function '" + v2 + "'");
        }
        return c10.a(jsonObject, jsonDeserializationContext, aG.a(jsonObject, "conditions", new d[0], jsonDeserializationContext, d[].class));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

