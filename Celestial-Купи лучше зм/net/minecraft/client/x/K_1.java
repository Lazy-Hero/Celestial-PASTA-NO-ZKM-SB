/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.ar.aG;
import net.minecraft.client.x.P;
import net.minecraft.client.x.b;
import net.minecraft.client.x.l;
import net.minecraft.client.x.v;
import net.minecraft.client.x.y;

public class K
implements JsonDeserializer<v> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Map<String, String> c(JsonObject jsonObject) {
        HashMap hashMap;
        HashMap hashMap2;
        block4: {
            String string;
            JsonObject jsonObject2;
            String[] arrstring;
            block3: {
                hashMap2 = Maps.newHashMap();
                arrstring = P.o();
                jsonObject2 = jsonObject;
                string = "textures";
                if (arrstring != null) break block3;
                if (!jsonObject2.has(string)) break block4;
                jsonObject2 = jsonObject;
                string = "textures";
            }
            JsonObject jsonObject3 = jsonObject2.getAsJsonObject(string);
            for (Map.Entry entry : jsonObject3.entrySet()) {
                hashMap = hashMap2;
                if (arrstring != null) return hashMap;
                hashMap.put(entry.getKey(), ((JsonElement)entry.getValue()).getAsString());
                if (arrstring == null) continue;
            }
        }
        hashMap = hashMap2;
        return hashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected List<b> a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        block4: {
            String string;
            JsonObject jsonObject2;
            String[] arrstring;
            block3: {
                arrayList2 = Lists.newArrayList();
                arrstring = P.o();
                jsonObject2 = jsonObject;
                string = "overrides";
                if (arrstring != null) break block3;
                if (!jsonObject2.has(string)) break block4;
                jsonObject2 = jsonObject;
                string = "overrides";
            }
            for (JsonElement jsonElement : aG.i(jsonObject2, string)) {
                arrayList = arrayList2;
                if (arrstring != null) return arrayList;
                arrayList.add(jsonDeserializationContext.deserialize(jsonElement, b.class));
                if (arrstring == null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    protected boolean b(JsonObject jsonObject) {
        return aG.a(jsonObject, "ambientocclusion", true);
    }

    private String a(JsonObject jsonObject) {
        return aG.a(jsonObject, "parent", "");
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected List<l> b(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        block4: {
            String string;
            JsonObject jsonObject2;
            String[] arrstring;
            block3: {
                arrayList2 = Lists.newArrayList();
                arrstring = P.o();
                jsonObject2 = jsonObject;
                string = "elements";
                if (arrstring != null) break block3;
                if (!jsonObject2.has(string)) break block4;
                jsonObject2 = jsonObject;
                string = "elements";
            }
            for (JsonElement jsonElement : aG.i(jsonObject2, string)) {
                arrayList = arrayList2;
                if (arrstring != null) return arrayList;
                arrayList.add(jsonDeserializationContext.deserialize(jsonElement, l.class));
                if (arrstring == null) continue;
            }
        }
        arrayList = arrayList2;
        return arrayList;
    }

    public v a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Object object;
        y y2;
        boolean bl2;
        Map<String, String> map;
        String string;
        List<l> list;
        JsonObject jsonObject;
        block3: {
            String string2;
            JsonObject jsonObject2;
            block2: {
                jsonObject = jsonElement.getAsJsonObject();
                list = this.b(jsonDeserializationContext, jsonObject);
                string = this.a(jsonObject);
                map = this.c(jsonObject);
                bl2 = this.b(jsonObject);
                String[] arrstring = P.o();
                y2 = y.e;
                jsonObject2 = jsonObject;
                string2 = "display";
                if (arrstring != null) break block2;
                if (!jsonObject2.has(string2)) break block3;
                jsonObject2 = jsonObject;
                string2 = "display";
            }
            object = aG.l(jsonObject2, string2);
            y2 = (y)jsonDeserializationContext.deserialize((JsonElement)object, y.class);
        }
        object = this.a(jsonDeserializationContext, jsonObject);
        net.minecraft.ar.v v2 = string.isEmpty() ? null : new net.minecraft.ar.v(string);
        return new v(v2, list, map, bl2, true, y2, (List<b>)object);
    }
}

