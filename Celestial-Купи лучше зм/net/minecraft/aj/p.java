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
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.aj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import net.minecraft.aj.c;
import net.minecraft.aj.d;
import net.minecraft.aj.j;
import net.minecraft.aj.l;
import net.minecraft.ar.aG;
import net.minecraft.k.m;
import org.apache.commons.lang3.ArrayUtils;

public class p
implements JsonDeserializer<c>,
JsonSerializer<c> {
    public JsonElement a(c c10, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block6: {
            float f10;
            block4: {
                block5: {
                    m[] arrm = j.b();
                    jsonObject = new JsonObject();
                    jsonObject.add("entries", jsonSerializationContext.serialize((Object)c.b(c10)));
                    jsonObject.add("rolls", jsonSerializationContext.serialize((Object)c.c(c10)));
                    m[] arrm2 = arrm;
                    float f11 = c.d(c10).b() - 0.0f;
                    f10 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                    if (arrm2 == null) break block4;
                    if (f10 == false) break block5;
                    float f12 = c.d(c10).a() - 0.0f;
                    f10 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                    if (arrm2 == null) break block4;
                    if (f10 != false) {
                        jsonObject.add("bonus_rolls", jsonSerializationContext.serialize((Object)c.d(c10)));
                    }
                }
                f10 = (float)ArrayUtils.isEmpty((Object[])c.a(c10));
            }
            if (f10 != false) break block6;
            jsonObject.add("conditions", jsonSerializationContext.serialize((Object)c.a(c10)));
        }
        return jsonObject;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public c a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = aG.b(jsonElement, "loot pool");
        d[] arrd = aG.a(jsonObject, "entries", jsonDeserializationContext, d[].class);
        net.minecraft.g.d[] arrd2 = aG.a(jsonObject, "conditions", new net.minecraft.g.d[0], jsonDeserializationContext, net.minecraft.g.d[].class);
        l l2 = aG.a(jsonObject, "rolls", jsonDeserializationContext, l.class);
        l l3 = aG.a(jsonObject, "bonus_rolls", new l(0.0f, 0.0f), jsonDeserializationContext, l.class);
        m[] arrm = j.b();
        c c10 = new c(arrd, arrd2, l2, l3);
        if (arrm == null) {
            m.b(!m.c());
        }
        return c10;
    }
}

