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
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import net.minecraft.client.x.P;
import net.minecraft.client.x.S;
import net.minecraft.client.x.W;

public class B
implements JsonDeserializer<W> {
    public W a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ArrayList arrayList;
        block8: {
            boolean bl2;
            block9: {
                JsonArray jsonArray;
                arrayList = Lists.newArrayList();
                String[] arrstring = P.o();
                bl2 = jsonElement.isJsonArray();
                if (arrstring != null) break block8;
                if (!bl2) break block9;
                JsonArray jsonArray2 = jsonArray = jsonElement.getAsJsonArray();
                if (arrstring == null) {
                    if (jsonArray2.size() == 0) {
                        throw new JsonParseException("Empty variant array");
                    }
                    jsonArray2 = jsonArray;
                }
                for (JsonElement jsonElement2 : jsonArray2) {
                    arrayList.add(jsonDeserializationContext.deserialize(jsonElement2, S.class));
                    if (arrstring == null) {
                        if (arrstring == null) continue;
                    }
                    break block8;
                }
                if (arrstring == null) break block8;
            }
            bl2 = arrayList.add(jsonDeserializationContext.deserialize(jsonElement, S.class));
        }
        return new W(arrayList);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

