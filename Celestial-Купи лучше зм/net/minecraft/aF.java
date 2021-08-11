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
package net.minecraft;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.aC;
import net.minecraft.aG;
import net.minecraft.aS;

public class aF
implements JsonDeserializer<aS>,
JsonSerializer<aS> {
    public JsonElement a(aS aS2, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block9: {
            boolean bl2;
            JsonObject jsonObject2;
            JsonObject jsonObject3;
            block8: {
                jsonObject3 = new JsonObject();
                jsonObject2 = new JsonObject();
                Iterator iterator = aS.b(aS2).entrySet().iterator();
                boolean bl3 = aG.b();
                while (iterator.hasNext()) {
                    Map.Entry entry = iterator.next();
                    aC aC2 = (aC)entry.getValue();
                    bl2 = aC2.c();
                    if (bl3) {
                        if (bl2) {
                            jsonObject2.add((String)entry.getKey(), aC2.b());
                        }
                        if (bl3) continue;
                    }
                    break block8;
                }
                jsonObject = jsonObject2;
                if (!bl3) break block9;
                bl2 = jsonObject.entrySet().isEmpty();
            }
            if (!bl2) {
                jsonObject3.add("criteria", (JsonElement)jsonObject2);
            }
            jsonObject3.addProperty("done", Boolean.valueOf(aS2.d()));
            jsonObject = jsonObject3;
        }
        return jsonObject;
    }

    public aS a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        aS aS2;
        block2: {
            JsonObject jsonObject = net.minecraft.ar.aG.b(jsonElement, "advancement");
            JsonObject jsonObject2 = net.minecraft.ar.aG.a(jsonObject, "criteria", new JsonObject());
            aS aS3 = new aS();
            boolean bl2 = aG.a();
            for (Map.Entry entry : jsonObject2.entrySet()) {
                String string = (String)entry.getKey();
                aS2 = aS3;
                if (!bl2) {
                    aS.b(aS2).put(string, aC.a(aS3, net.minecraft.ar.aG.e((JsonElement)entry.getValue(), string)));
                    if (!bl2) continue;
                }
                break block2;
            }
            aS2 = aS3;
        }
        return aS2;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

