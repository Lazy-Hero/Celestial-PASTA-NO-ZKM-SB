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
import net.minecraft.m.o;

public class e
extends c<o> {
    @Override
    public void a(JsonObject jsonObject, o o2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.add("levels", jsonSerializationContext.serialize((Object)o.a(o2)));
        jsonObject.addProperty("treasure", Boolean.valueOf(o.b(o2)));
    }

    @Override
    public o a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, d[] arrd) {
        l l2 = aG.a(jsonObject, "levels", jsonDeserializationContext, l.class);
        boolean bl2 = aG.a(jsonObject, "treasure", false);
        return new o(arrd, l2, bl2);
    }

    public e() {
        super(new v("enchant_with_levels"), o.class);
    }
}

