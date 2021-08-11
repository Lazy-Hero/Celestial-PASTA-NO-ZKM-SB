/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.a;
import net.minecraft.g.f;

public class k
extends f<a> {
    @Override
    public void a(JsonObject jsonObject, a a10, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("chance", (Number)Float.valueOf(a.a(a10)));
        jsonObject.addProperty("looting_multiplier", (Number)Float.valueOf(a.b(a10)));
    }

    protected k() {
        super(new v("random_chance_with_looting"), a.class);
    }

    @Override
    public a a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new a(aG.h(jsonObject, "chance"), aG.h(jsonObject, "looting_multiplier"));
    }
}

