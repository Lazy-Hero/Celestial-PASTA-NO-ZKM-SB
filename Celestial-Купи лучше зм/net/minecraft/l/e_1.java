/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.L;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import net.minecraft.L.a;
import net.minecraft.L.d;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;

public class e
extends d<a> {
    @Override
    public JsonElement a(a a10, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(Boolean.valueOf(a.a(a10)));
    }

    protected e() {
        super(new v("on_fire"), a.class);
    }

    @Override
    public a a(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
        return new a(aG.d(jsonElement, "on_fire"));
    }
}

