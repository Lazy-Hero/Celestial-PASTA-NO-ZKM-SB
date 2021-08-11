/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.v;

import com.google.common.collect.Sets;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import net.minecraft.ar.aG;
import net.minecraft.client.D.b;
import net.minecraft.client.v.a;
import net.minecraft.client.v.j;

public class d
extends a<j> {
    public j a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String string = a.b();
        HashSet hashSet = Sets.newHashSet();
        for (Map.Entry entry : jsonObject.entrySet()) {
            String string2;
            String string3 = string2 = (String)entry.getKey();
            if (string == null) {
                if (string3.length() > 16) {
                    throw new JsonParseException("Invalid language->'" + string2 + "': language code must not be more than " + 16 + " characters long");
                }
                string3 = entry.getValue();
            }
            JsonObject jsonObject2 = aG.b((JsonElement)string3, "language");
            String string4 = aG.f(jsonObject2, "region");
            String string5 = aG.f(jsonObject2, "name");
            boolean bl2 = aG.a(jsonObject2, "bidirectional", false);
            boolean bl3 = string4.isEmpty();
            if (string == null) {
                if (bl3) {
                    throw new JsonParseException("Invalid language->'" + string2 + "'->region: empty value");
                }
                bl3 = string5.isEmpty();
            }
            if (string == null) {
                if (bl3) {
                    throw new JsonParseException("Invalid language->'" + string2 + "'->name: empty value");
                }
                bl3 = hashSet.add(new b(string2, string4, string5, bl2));
            }
            if (!bl3) {
                throw new JsonParseException("Duplicate language->'" + string2 + "' defined");
            }
            if (string == null) continue;
        }
        return new j(hashSet);
    }

    @Override
    public String a() {
        return "language";
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

