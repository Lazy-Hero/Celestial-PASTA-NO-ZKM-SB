/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.x;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.client.x.S;
import net.minecraft.client.x.g;

public class t
implements JsonDeserializer<S> {
    protected g b(JsonObject jsonObject) {
        g g10;
        int n2 = aG.a(jsonObject, "x", 0);
        int n3 = aG.a(jsonObject, "y", 0);
        String[] arrstring = P.o();
        g g11 = g10 = g.b(n2, n3);
        if (arrstring == null) {
            if (g11 == null) {
                throw new JsonParseException("Invalid BlockModelRotation x: " + n2 + ", y: " + n3);
            }
            g11 = g10;
        }
        return g11;
    }

    public S a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        String string = this.d(jsonObject);
        g g10 = this.b(jsonObject);
        boolean bl2 = this.a(jsonObject);
        int n2 = this.c(jsonObject);
        return new S(this.a(string), g10, bl2, n2);
    }

    private boolean a(JsonObject jsonObject) {
        return aG.a(jsonObject, "uvlock", false);
    }

    private v a(String string) {
        v v2 = new v(string);
        v2 = new v(v2.c(), "block/" + v2.a());
        return v2;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    protected String d(JsonObject jsonObject) {
        return aG.f(jsonObject, "model");
    }

    protected int c(JsonObject jsonObject) {
        int n2 = aG.a(jsonObject, "weight", 1);
        String[] arrstring = P.o();
        int n3 = n2;
        if (arrstring == null) {
            if (n3 < 1) {
                throw new JsonParseException("Invalid weight " + n2 + " found, expected integer >= 1");
            }
            n3 = n2;
        }
        return n3;
    }
}

