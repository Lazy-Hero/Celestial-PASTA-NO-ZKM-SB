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
import net.minecraft.client.x.L;
import net.minecraft.client.x.P;
import net.minecraft.client.x.y;

class e
implements JsonDeserializer<y> {
    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    e() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private L a(JsonDeserializationContext jsonDeserializationContext, JsonObject jsonObject, String string) {
        L l2;
        String[] arrstring = P.o();
        Object object = jsonObject;
        if (arrstring == null) {
            if (!object.has(string)) {
                l2 = L.c;
                return l2;
            }
            object = jsonDeserializationContext.deserialize(jsonObject.get(string), L.class);
        }
        l2 = (L)object;
        return l2;
    }

    public y a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        L l2;
        L l3;
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        L l4 = this.a(jsonDeserializationContext, jsonObject, "thirdperson_righthand");
        String[] arrstring = P.o();
        L l5 = l3 = this.a(jsonDeserializationContext, jsonObject, "thirdperson_lefthand");
        if (arrstring == null) {
            if (l5 == L.c) {
                l3 = l4;
            }
            l5 = this.a(jsonDeserializationContext, jsonObject, "firstperson_righthand");
        }
        L l6 = l5;
        L l7 = l2 = this.a(jsonDeserializationContext, jsonObject, "firstperson_lefthand");
        if (arrstring == null) {
            if (l7 == L.c) {
                l2 = l6;
            }
            l7 = this.a(jsonDeserializationContext, jsonObject, "head");
        }
        L l8 = l7;
        L l9 = this.a(jsonDeserializationContext, jsonObject, "gui");
        L l10 = this.a(jsonDeserializationContext, jsonObject, "ground");
        L l11 = this.a(jsonDeserializationContext, jsonObject, "fixed");
        return new y(l3, l4, l2, l6, l8, l9, l10, l11);
    }
}

