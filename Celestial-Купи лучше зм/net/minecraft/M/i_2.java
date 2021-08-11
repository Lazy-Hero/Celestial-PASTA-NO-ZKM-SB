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
import net.minecraft.m.s;

public class i
extends c<s> {
    @Override
    public void a(JsonObject jsonObject, s s2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("damage", jsonSerializationContext.serialize((Object)s.a(s2)));
    }

    @Override
    public s a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        return new s(arrd, aG.a(jsonObject, "damage", jsonDeserializationContext, l.class));
    }

    protected i() {
        super(new v("set_damage"), s.class);
    }
}

