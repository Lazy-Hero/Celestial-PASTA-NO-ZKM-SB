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
package net.minecraft.a;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.a.a;
import net.minecraft.a.b;
import net.minecraft.a.k;
import net.minecraft.a.t;

class z
implements JsonDeserializer<b<K>>,
JsonSerializer<b<K>> {
    final /* synthetic */ t a;

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private z(t t2) {
        this.a = t2;
    }

    z(t t2, a a10) {
        this(t2);
    }

    public JsonElement a(b<K> b10, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        b10.a(jsonObject);
        return jsonObject;
    }

    public b<K> a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        block3: {
            JsonElement jsonElement2;
            block2: {
                boolean bl2 = k.q();
                jsonElement2 = jsonElement;
                if (bl2) break block2;
                if (!jsonElement2.isJsonObject()) break block3;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = jsonElement2.getAsJsonObject();
            return this.a.a(jsonObject);
        }
        return null;
    }
}

