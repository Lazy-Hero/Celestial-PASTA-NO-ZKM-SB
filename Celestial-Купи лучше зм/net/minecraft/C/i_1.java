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
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSerializer
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.C;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mojang.authlib.GameProfile;
import java.lang.reflect.Type;
import java.util.UUID;
import net.minecraft.C.j;
import net.minecraft.C.m;
import net.minecraft.ar.aG;

public class i
implements JsonDeserializer<j>,
JsonSerializer<j> {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public JsonElement a(j var1_1, Type var2_2, JsonSerializationContext var3_3) {
        block4: {
            block3: {
                v0 = m.b();
                var5_4 = new JsonObject();
                var5_4.addProperty("max", (Number)var1_1.a());
                var4_5 = v0;
                v1 = var5_4;
                if (var4_5 != 0) return v1;
                v1.addProperty("online", (Number)var1_1.c());
                if (var1_1.b() == null || var1_1.b().length <= 0) break block4;
                var6_6 = new JsonArray();
                for (var7_7 = 0; var7_7 < var1_1.b().length; ++var7_7) {
                    var8_8 = new JsonObject();
                    var9_9 = var1_1.b()[var7_7].getId();
                    v2 = var8_8;
                    v3 = "id";
                    if (var4_5 != 0) break block3;
                    v4 = var9_9;
                    if (var4_5 != 0) ** GOTO lbl22
                    if (v4 == null) {
                        v5 = "";
                    } else {
                        v4 = var9_9;
lbl22:
                        // 2 sources

                        v5 = v4.toString();
                    }
                    v2.addProperty(v3, v5);
                    var8_8.addProperty("name", var1_1.b()[var7_7].getName());
                    var6_6.add((JsonElement)var8_8);
                    if (var4_5 == 0) continue;
                }
                v2 = var5_4;
                v3 = "sample";
            }
            v2.add(v3, (JsonElement)var6_6);
        }
        v1 = var5_4;
        return v1;
    }

    public j a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        j j2;
        block5: {
            int n2;
            JsonArray jsonArray;
            int n3;
            block7: {
                String string;
                JsonObject jsonObject;
                block6: {
                    JsonObject jsonObject2 = aG.b(jsonElement, "players");
                    n3 = m.b();
                    j2 = new j(aG.d(jsonObject2, "max"), aG.d(jsonObject2, "online"));
                    jsonObject = jsonObject2;
                    string = "sample";
                    if (n3 != 0) break block6;
                    if (!aG.k(jsonObject, string)) break block5;
                    jsonObject = jsonObject2;
                    string = "sample";
                }
                jsonArray = aG.i(jsonObject, string);
                n2 = jsonArray.size();
                if (n3 != 0) break block7;
                if (n2 <= 0) break block5;
                n2 = jsonArray.size();
            }
            GameProfile[] arrgameProfile = new GameProfile[n2];
            for (int i2 = 0; i2 < arrgameProfile.length; ++i2) {
                JsonObject jsonObject = aG.b(jsonArray.get(i2), "player[" + i2 + "]");
                String string = aG.f(jsonObject, "id");
                arrgameProfile[i2] = new GameProfile(UUID.fromString(string), aG.f(jsonObject, "name"));
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block5;
            }
            j2.a(arrgameProfile);
        }
        return j2;
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

