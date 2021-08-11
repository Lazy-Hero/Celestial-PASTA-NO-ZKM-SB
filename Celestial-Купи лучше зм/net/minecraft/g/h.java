/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.g;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.aj.l;
import net.minecraft.aj.t;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.f;
import net.minecraft.g.n;

public class h
extends f<n> {
    protected h() {
        super(new v("entity_scores"), n.class);
    }

    @Override
    public void a(JsonObject jsonObject, n n2, JsonSerializationContext jsonSerializationContext) {
        block2: {
            JsonObject jsonObject2 = new JsonObject();
            int[] arrn = f.b();
            for (Map.Entry entry : n.b(n2).entrySet()) {
                jsonObject2.add((String)entry.getKey(), jsonSerializationContext.serialize(entry.getValue()));
                if (arrn != null) {
                    if (arrn != null) continue;
                }
                break block2;
            }
            jsonObject.add("scores", (JsonElement)jsonObject2);
            jsonObject.add("entity", jsonSerializationContext.serialize((Object)n.a(n2)));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public n a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Set set = aG.l(jsonObject, "scores").entrySet();
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        int[] arrn = f.b();
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), aG.a((JsonElement)entry.getValue(), "score", jsonDeserializationContext, l.class));
            if (arrn != null) continue;
        }
        return new n(linkedHashMap, aG.a(jsonObject, "entity", jsonDeserializationContext, t.class));
    }
}

