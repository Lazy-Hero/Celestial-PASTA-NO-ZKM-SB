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
import net.minecraft.m.t;

public class j
extends c<t> {
    @Override
    public void a(JsonObject jsonObject, t t2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("data", jsonSerializationContext.serialize((Object)t.a(t2)));
    }

    @Override
    public t a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        return new t(arrd, aG.a(jsonObject, "data", jsonDeserializationContext, l.class));
    }

    protected j() {
        super(new v("set_data"), t.class);
    }
}

