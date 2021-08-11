/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.Validate
 */
package net.minecraft.client.e;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.ar.aG;
import net.minecraft.client.e.b;
import net.minecraft.client.e.h;
import net.minecraft.client.e.s;
import net.minecraft.client.e.z;
import net.minecraft.k.m;
import org.apache.commons.lang3.Validate;

public class f
implements JsonDeserializer<z> {
    public z a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = aG.b(jsonElement, "entry");
        boolean bl2 = aG.a(jsonObject, "replace", false);
        String string = aG.a(jsonObject, "subtitle", null);
        List<b> list = this.b(jsonObject);
        return new z(list, bl2, string);
    }

    private b a(JsonObject jsonObject) {
        int n2;
        String string = aG.f(jsonObject, "name");
        h h2 = this.a(jsonObject, h.FILE);
        float f10 = aG.a(jsonObject, "volume", 1.0f);
        m[] arrm = s.b();
        float f11 = f10 - 0.0f;
        float f12 = f11 == 0.0f ? (int)0 : (f11 > 0.0f ? (int)1 : -1);
        if (arrm != null) {
            f12 = f12 > 0 ? 1.0f : 0.0f;
        }
        Validate.isTrue((boolean)f12, (String)"Invalid volume", (Object[])new Object[0]);
        float f13 = aG.a(jsonObject, "pitch", 1.0f);
        float f14 = f13 - 0.0f;
        float f15 = f14 == 0.0f ? (int)0 : (f14 > 0.0f ? (int)1 : -1);
        if (arrm != null) {
            f15 = f15 > 0 ? 1.0f : 0.0f;
        }
        Validate.isTrue((boolean)f15, (String)"Invalid pitch", (Object[])new Object[0]);
        int n3 = n2 = aG.a(jsonObject, "weight", 1);
        if (arrm != null) {
            n3 = n3 > 0 ? 1 : 0;
        }
        Validate.isTrue(n3 != 0, (String)"Invalid weight", (Object[])new Object[0]);
        boolean bl2 = aG.a(jsonObject, "stream", false);
        return new b(string, f10, f13, n2, h2, bl2);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    private List<b> b(JsonObject jsonObject) {
        ArrayList arrayList;
        block6: {
            String string;
            JsonObject jsonObject2;
            m[] arrm;
            block5: {
                arrayList = Lists.newArrayList();
                arrm = s.b();
                jsonObject2 = jsonObject;
                string = "sounds";
                if (arrm == null) break block5;
                if (!jsonObject2.has(string)) break block6;
                jsonObject2 = jsonObject;
                string = "sounds";
            }
            JsonArray jsonArray = aG.i(jsonObject2, string);
            for (int i2 = 0; i2 < jsonArray.size(); ++i2) {
                JsonElement jsonElement = jsonArray.get(i2);
                boolean bl2 = aG.b(jsonElement);
                if (arrm == null) continue;
                if (bl2) {
                    String string2 = aG.e(jsonElement, "sound");
                    arrayList.add(new b(string2, 1.0f, 1.0f, 1, h.FILE, false));
                    if (arrm != null) continue;
                }
                bl2 = arrayList.add(this.a(aG.b(jsonElement, "sound")));
                if (arrm != null) continue;
            }
        }
        return arrayList;
    }

    private h a(JsonObject jsonObject, h h2) {
        h h3;
        block3: {
            String string;
            JsonObject jsonObject2;
            block2: {
                h3 = h2;
                m[] arrm = s.b();
                jsonObject2 = jsonObject;
                string = "type";
                if (arrm == null) break block2;
                if (!jsonObject2.has(string)) break block3;
                jsonObject2 = jsonObject;
                string = "type";
            }
            h3 = h.a(aG.f(jsonObject2, string));
            Validate.notNull((Object)((Object)h3), (String)"Invalid type", (Object[])new Object[0]);
        }
        return h3;
    }
}

