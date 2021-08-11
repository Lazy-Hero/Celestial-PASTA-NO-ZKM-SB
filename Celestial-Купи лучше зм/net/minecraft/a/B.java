/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.a;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.UUID;
import net.minecraft.a.i;
import net.minecraft.a.k;
import net.minecraft.a.n;
import net.minecraft.a.o;

class B
implements JsonDeserializer<i>,
JsonSerializer<i> {
    final /* synthetic */ o a;

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public JsonElement a(i var1_1, Type var2_2, JsonSerializationContext var3_3) {
        var5_4 = new JsonObject();
        var4_5 = k.q();
        var5_4.addProperty("name", var1_1.a().getName());
        v0 = var6_6 = var1_1.a().getId();
        if (var4_5) ** GOTO lbl10
        if (v0 == null) {
            v1 = "";
        } else {
            v0 = var6_6;
lbl10:
            // 2 sources

            v1 = v0.toString();
        }
        var5_4.addProperty("uuid", v1);
        var5_4.addProperty("expiresOn", o.c.format(var1_1.b()));
        return var5_4;
    }

    private B(o o2) {
        this.a = o2;
    }

    B(o o2, n n2) {
        this(o2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public i a(JsonElement var1_1, Type var2_2, JsonDeserializationContext var3_3) throws JsonParseException {
        var4_4 = k.t();
        v0 = var1_1;
        if (var4_4) {
            if (v0.isJsonObject() == false) return null;
            v0 = var1_1;
        }
        var5_5 = v0.getAsJsonObject();
        var6_6 = var5_5.get("name");
        var7_7 = var5_5.get("uuid");
        var8_8 = var5_5.get("expiresOn");
        v1 = var6_6;
        if (var4_4) {
            if (v1 == null) return null;
            v1 = var7_7;
        }
        if (var4_4) {
            if (v1 == null) return null;
            v1 = var7_7;
        }
        var9_9 = v1.getAsString();
        var10_10 = var6_6.getAsString();
        var11_11 = null;
        if (var8_8 != null) {
            try {
                var11_11 = o.c.parse(var8_8.getAsString());
            }
            catch (ParseException var12_12) {
                var11_11 = null;
            }
        }
        v2 = var10_10;
        if (var4_4) {
            if (v2 == null) return null;
            v2 = var9_9;
        }
        if (!var4_4) ** GOTO lbl34
        if (v2 == null) return null;
        try {
            v2 = var9_9;
lbl34:
            // 2 sources

            var12_13 = UUID.fromString(v2);
        }
        catch (Throwable var13_14) {
            return null;
        }
        v3 = this.a;
        v3.getClass();
        return new i(v3, new GameProfile(var12_13, var10_10), var11_11, null);
    }
}

