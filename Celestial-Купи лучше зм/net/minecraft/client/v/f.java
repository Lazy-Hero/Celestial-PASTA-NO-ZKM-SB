/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.v;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.client.v.a;
import net.minecraft.client.v.q;

public class f
extends a<q> {
    public q a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        boolean bl2 = aG.a(jsonObject, "blur", false);
        boolean bl3 = aG.a(jsonObject, "clamp", false);
        return new q(bl2, bl3);
    }

    @Override
    public String a() {
        return "texture";
    }
}

