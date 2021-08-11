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
package net.minecraft.C;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.C.P;
import net.minecraft.C.j;
import net.minecraft.C.m;
import net.minecraft.C.x;
import net.minecraft.ar.aG;

public class k
implements JsonDeserializer<P>,
JsonSerializer<P> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public JsonElement a(P p2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block6: {
            jsonObject = new JsonObject();
            int n2 = m.b();
            P p3 = p2;
            if (n2 == 0) {
                if (p3.c() != null) {
                    jsonObject.add("description", jsonSerializationContext.serialize((Object)p2.c()));
                }
                p3 = p2;
            }
            if (n2 == 0) {
                if (p3.b() != null) {
                    jsonObject.add("players", jsonSerializationContext.serialize((Object)p2.b()));
                }
                p3 = p2;
            }
            if (n2 == 0) {
                if (p3.d() != null) {
                    jsonObject.add("version", jsonSerializationContext.serialize((Object)p2.d()));
                }
                p3 = p2;
            }
            if (p3.a() == null) break block6;
            jsonObject.addProperty("favicon", p2.a());
        }
        return jsonObject;
    }

    public P a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        P p2;
        block6: {
            JsonObject jsonObject = aG.b(jsonElement, "status");
            int n2 = m.b();
            p2 = new P();
            boolean bl2 = jsonObject.has("description");
            if (n2 == 0) {
                if (bl2) {
                    p2.a((net.minecraft.at.k)jsonDeserializationContext.deserialize(jsonObject.get("description"), net.minecraft.at.k.class));
                }
                bl2 = jsonObject.has("players");
            }
            if (n2 == 0) {
                if (bl2) {
                    p2.a((j)jsonDeserializationContext.deserialize(jsonObject.get("players"), j.class));
                }
                bl2 = jsonObject.has("version");
            }
            if (n2 == 0) {
                if (bl2) {
                    p2.a((x)jsonDeserializationContext.deserialize(jsonObject.get("version"), x.class));
                }
                bl2 = jsonObject.has("favicon");
            }
            if (!bl2) break block6;
            p2.a(aG.f(jsonObject, "favicon"));
        }
        return p2;
    }
}

