/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.m;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.d;
import net.minecraft.m.c;
import net.minecraft.m.m;
import net.minecraft.m.q;
import net.minecraft.m.w;

public class g
extends c<q> {
    @Override
    public void a(JsonObject jsonObject, q q2, JsonSerializationContext jsonSerializationContext) {
        block2: {
            JsonArray jsonArray = new JsonArray();
            net.minecraft.k.m[] arrm = m.b();
            for (w w2 : q.a(q2)) {
                jsonArray.add((JsonElement)w2.a(jsonSerializationContext));
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block2;
            }
            jsonObject.add("modifiers", (JsonElement)jsonArray);
        }
    }

    public g() {
        super(new v("set_attributes"), q.class);
    }

    @Override
    public q a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        w[] arrw;
        block3: {
            JsonArray jsonArray = aG.i(jsonObject, "modifiers");
            arrw = new w[jsonArray.size()];
            net.minecraft.k.m[] arrm = m.b();
            int n2 = 0;
            for (JsonElement jsonElement : jsonArray) {
                arrw[n2++] = w.a(aG.b(jsonElement, "modifier"), jsonDeserializationContext);
                if (arrm != null) {
                    if (arrm != null) continue;
                }
                break block3;
            }
            if (arrw.length == 0) {
                throw new JsonSyntaxException("Invalid attribute modifiers array; cannot be empty");
            }
        }
        return new q(arrd, arrw);
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }
}

