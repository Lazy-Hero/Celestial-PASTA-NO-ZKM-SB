/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.m;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.aj.l;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.d;
import net.minecraft.m.c;
import net.minecraft.m.m;
import net.minecraft.m.p;

public class f
extends c<p> {
    @Override
    public p a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        int n2 = aG.a(jsonObject, "limit", 0);
        return new p(arrd, aG.a(jsonObject, "count", jsonDeserializationContext, l.class), n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected f() {
        super(new v("looting_enchant"), p.class);
    }

    @Override
    public void a(JsonObject jsonObject, p p2, JsonSerializationContext jsonSerializationContext) {
        block3: {
            JsonElement jsonElement;
            String string;
            JsonObject jsonObject2;
            block2: {
                net.minecraft.k.m[] arrm = m.b();
                jsonObject2 = jsonObject;
                string = "count";
                jsonElement = jsonSerializationContext.serialize((Object)p.b(p2));
                if (arrm == null) break block2;
                jsonObject2.add(string, jsonElement);
                if (p.a(p2) <= 0) break block3;
                jsonObject2 = jsonObject;
                string = "limit";
                jsonElement = jsonSerializationContext.serialize((Object)p.a(p2));
            }
            jsonObject2.add(string, jsonElement);
        }
    }
}

