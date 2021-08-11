/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  org.lwjgl.util.vector.Vector3f
 */
package net.minecraft.client.x;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import net.minecraft.ar.aG;
import net.minecraft.client.x.L;
import net.minecraft.client.x.P;
import net.minecraft.k.h;
import org.lwjgl.util.vector.Vector3f;

class m
implements JsonDeserializer<L> {
    private static final /* synthetic */ Vector3f a;
    private static final /* synthetic */ Vector3f b;
    private static final /* synthetic */ Vector3f c;

    private Vector3f a(JsonObject jsonObject, String string, Vector3f vector3f) {
        String[] arrstring = P.o();
        JsonObject jsonObject2 = jsonObject;
        String string2 = string;
        if (arrstring == null) {
            if (!jsonObject2.has(string2)) {
                return vector3f;
            }
            jsonObject2 = jsonObject;
            string2 = string;
        }
        JsonArray jsonArray = aG.i(jsonObject2, string2);
        int n2 = jsonArray.size();
        if (arrstring == null) {
            if (n2 != 3) {
                throw new JsonParseException("Expected 3 " + string + " values, found: " + jsonArray.size());
            }
            n2 = 3;
        }
        float[] arrf = new float[n2];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrf[i2] = aG.a(jsonArray.get(i2), string + "[" + i2 + "]");
            if (arrstring == null) continue;
        }
        return new Vector3f(arrf[0], arrf[1], arrf[2]);
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    static {
        a = new Vector3f(0.0f, 0.0f, 0.0f);
        c = new Vector3f(0.0f, 0.0f, 0.0f);
        b = new Vector3f(1.0f, 1.0f, 1.0f);
    }

    m() {
    }

    public L a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        L l2;
        block0: {
            String[] arrstring = P.o();
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            Vector3f vector3f = this.a(jsonObject, "rotation", a);
            Vector3f vector3f2 = this.a(jsonObject, "translation", c);
            vector3f2.scale(0.0625f);
            vector3f2.x = h.c(vector3f2.x, -5.0f, 5.0f);
            vector3f2.y = h.c(vector3f2.y, -5.0f, 5.0f);
            vector3f2.z = h.c(vector3f2.z, -5.0f, 5.0f);
            Vector3f vector3f3 = this.a(jsonObject, "scale", b);
            vector3f3.x = h.c(vector3f3.x, -4.0f, 4.0f);
            String[] arrstring2 = arrstring;
            vector3f3.y = h.c(vector3f3.y, -4.0f, 4.0f);
            vector3f3.z = h.c(vector3f3.z, -4.0f, 4.0f);
            l2 = new L(vector3f, vector3f2, vector3f3);
            if (!net.minecraft.k.m.c()) break block0;
            P.b(new String[5]);
        }
        return l2;
    }
}

