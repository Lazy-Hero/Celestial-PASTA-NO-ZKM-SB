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
import net.minecraft.aj.l;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.d;
import net.minecraft.m.c;
import net.minecraft.m.r;

public class h
extends c<r> {
    protected h() {
        super(new v("set_count"), r.class);
    }

    @Override
    public void a(JsonObject jsonObject, r r2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("count", jsonSerializationContext.serialize((Object)r.a(r2)));
    }

    @Override
    public r a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        return new r(arrd, aG.a(jsonObject, "count", jsonDeserializationContext, l.class));
    }
}

