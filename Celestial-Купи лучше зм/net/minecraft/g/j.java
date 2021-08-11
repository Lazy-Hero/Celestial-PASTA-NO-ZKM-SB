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
import net.minecraft.g.f;
import net.minecraft.g.m;

public class j
extends f<m> {
    @Override
    public m a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new m(aG.h(jsonObject, "chance"));
    }

    @Override
    public void a(JsonObject jsonObject, m m2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("chance", (Number)Float.valueOf(m.a(m2)));
    }

    protected j() {
        super(new v("random_chance"), m.class);
    }
}

