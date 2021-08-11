/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import net.minecraft.E.h;
import net.minecraft.aG;
import net.minecraft.aX;
import net.minecraft.ar.v;
import net.minecraft.az.k;
import net.minecraft.az.t;

public class a3
implements JsonDeserializer<aX> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    /*
     * Enabled aggressive block sorting
     */
    public aX a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        h h2;
        v[] arrv;
        v[] arrv2;
        int n2;
        block6: {
            JsonObject jsonObject = net.minecraft.ar.aG.b(jsonElement, "rewards");
            n2 = net.minecraft.ar.aG.a(jsonObject, "experience", 0);
            JsonArray jsonArray = net.minecraft.ar.aG.a(jsonObject, "loot", new JsonArray());
            arrv2 = new v[jsonArray.size()];
            boolean bl2 = aG.b();
            for (int i2 = 0; i2 < arrv2.length; ++i2) {
                arrv2[i2] = new v(net.minecraft.ar.aG.e(jsonArray.get(i2), "loot[" + i2 + "]"));
                if (bl2) continue;
            }
            JsonArray jsonArray2 = net.minecraft.ar.aG.a(jsonObject, "recipes", new JsonArray());
            arrv = new v[jsonArray2.size()];
            int n3 = 0;
            while (n3 < arrv.length) {
                arrv[n3] = new v(net.minecraft.ar.aG.e(jsonArray2.get(n3), "recipes[" + n3 + "]"));
                k k2 = t.a(arrv[n3]);
                if (bl2) {
                    if (bl2) {
                        if (k2 == null) {
                            throw new JsonSyntaxException("Unknown recipe '" + arrv[n3] + "'");
                        }
                        ++n3;
                    }
                    if (bl2) continue;
                }
                break block6;
            }
            if (jsonObject.has("function")) {
                h2 = new h(new v(net.minecraft.ar.aG.f(jsonObject, "function")));
                return new aX(n2, arrv2, arrv, h2);
            }
        }
        h2 = h.b;
        return new aX(n2, arrv2, arrv, h2);
    }
}

