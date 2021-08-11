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
import net.minecraft.g.c;
import net.minecraft.g.f;

public class i
extends f<c> {
    @Override
    public c a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        return new c(aG.a(jsonObject, "inverse", false));
    }

    protected i() {
        super(new v("killed_by_player"), c.class);
    }

    @Override
    public void a(JsonObject jsonObject, c c10, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("inverse", Boolean.valueOf(c.a(c10)));
    }
}

