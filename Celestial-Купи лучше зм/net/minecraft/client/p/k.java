/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.p;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.p.h;
import net.minecraft.client.p.n;

public class k
implements JsonDeserializer<n> {
    private List<h> a(JsonDeserializationContext jsonDeserializationContext, JsonArray jsonArray) {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            String string = h.b();
            for (JsonElement jsonElement : jsonArray) {
                arrayList = arrayList2;
                if (string != null) {
                    arrayList.add(jsonDeserializationContext.deserialize(jsonElement, h.class));
                    if (string != null) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public n a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        return new n(this.a(jsonDeserializationContext, jsonElement.getAsJsonArray()));
    }
}

