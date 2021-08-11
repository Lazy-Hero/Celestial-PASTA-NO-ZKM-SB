/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.m;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import net.minecraft.g.d;
import net.minecraft.m.c;
import net.minecraft.m.v;

public class l
extends c<v> {
    @Override
    public v a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        return new v(arrd);
    }

    @Override
    public void a(JsonObject jsonObject, v v2, JsonSerializationContext jsonSerializationContext) {
    }

    protected l() {
        super(new net.minecraft.ar.v("furnace_smelt"), v.class);
    }
}

