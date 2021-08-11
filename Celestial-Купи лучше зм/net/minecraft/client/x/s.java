/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import net.minecraft.ar.aA;
import net.minecraft.ar.aG;
import net.minecraft.client.x.au;
import net.minecraft.client.x.z;

class s
implements JsonDeserializer<z> {
    protected int a(JsonObject jsonObject) {
        return aG.a(jsonObject, "tintindex", -1);
    }

    private String b(JsonObject jsonObject) {
        return aG.f(jsonObject, "texture");
    }

    @Nullable
    private aA c(JsonObject jsonObject) {
        String string = aG.a(jsonObject, "cullface", "");
        return aA.a(string);
    }

    s() {
    }

    public z a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        aA aA2 = this.c(jsonObject);
        int n2 = this.a(jsonObject);
        String string = this.b(jsonObject);
        au au2 = (au)jsonDeserializationContext.deserialize((JsonElement)jsonObject, au.class);
        return new z(aA2, n2, string, au2);
    }
}

