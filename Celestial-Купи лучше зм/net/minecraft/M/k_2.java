/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.m;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import net.minecraft.P.a;
import net.minecraft.P.d;
import net.minecraft.P.r;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.m.c;
import net.minecraft.m.u;

public class k
extends c<u> {
    public k() {
        super(new v("set_nbt"), u.class);
    }

    @Override
    public u a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, net.minecraft.g.d[] arrd) {
        try {
            r r2 = d.c(aG.f(jsonObject, "tag"));
            return new u(arrd, r2);
        }
        catch (a a10) {
            throw new JsonSyntaxException((Throwable)a10);
        }
    }

    @Override
    public void a(JsonObject jsonObject, u u2, JsonSerializationContext jsonSerializationContext) {
        jsonObject.addProperty("tag", u.a(u2).toString());
    }
}

