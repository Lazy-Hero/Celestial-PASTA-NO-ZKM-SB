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
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.aj;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import java.lang.reflect.Type;
import net.minecraft.aj.d;
import net.minecraft.aj.e;
import net.minecraft.aj.f;
import net.minecraft.aj.g;
import net.minecraft.aj.j;
import net.minecraft.ar.aG;
import net.minecraft.k.m;

public class n
implements JsonDeserializer<d>,
JsonSerializer<d> {
    public JsonElement a(d d10, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject;
        block8: {
            int n2;
            block9: {
                block10: {
                    m[] arrm;
                    block6: {
                        block7: {
                            jsonObject = new JsonObject();
                            m[] arrm2 = j.b();
                            jsonObject.addProperty("weight", (Number)d10.c);
                            arrm = arrm2;
                            jsonObject.addProperty("quality", (Number)d10.b);
                            n2 = d10.a.length;
                            if (arrm != null) {
                                if (n2 > 0) {
                                    jsonObject.add("conditions", jsonSerializationContext.serialize((Object)d10.a));
                                }
                                n2 = d10 instanceof f;
                            }
                            if (arrm == null) break block6;
                            if (n2 == 0) break block7;
                            jsonObject.addProperty("type", "item");
                            if (arrm != null) break block8;
                        }
                        n2 = d10 instanceof g;
                    }
                    if (arrm == null) break block9;
                    if (n2 == 0) break block10;
                    jsonObject.addProperty("type", "loot_table");
                    if (arrm != null) break block8;
                }
                n2 = d10 instanceof e;
            }
            if (n2 == 0) {
                throw new IllegalArgumentException("Don't know how to serialize " + d10);
            }
            jsonObject.addProperty("type", "empty");
        }
        d10.a(jsonObject, jsonSerializationContext);
        return jsonObject;
    }

    public d a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        net.minecraft.g.d[] arrd;
        int n2;
        int n3;
        String string;
        m[] arrm;
        JsonObject jsonObject;
        block11: {
            int n4;
            block9: {
                block10: {
                    jsonObject = aG.b(jsonElement, "loot item");
                    arrm = j.b();
                    string = aG.f(jsonObject, "type");
                    n3 = aG.a(jsonObject, "weight", 1);
                    n2 = aG.a(jsonObject, "quality", 0);
                    n4 = jsonObject.has("conditions");
                    if (arrm == null) break block9;
                    if (n4 == 0) break block10;
                    arrd = aG.a(jsonObject, "conditions", jsonDeserializationContext, net.minecraft.g.d[].class);
                    if (arrm != null) break block11;
                }
                n4 = 0;
            }
            arrd = new net.minecraft.g.d[n4];
        }
        boolean bl2 = "item".equals(string);
        if (arrm != null) {
            if (bl2) {
                return f.a(jsonObject, jsonDeserializationContext, n3, n2, arrd);
            }
            bl2 = "loot_table".equals(string);
        }
        if (arrm != null) {
            if (bl2) {
                return g.a(jsonObject, jsonDeserializationContext, n3, n2, arrd);
            }
            bl2 = "empty".equals(string);
        }
        if (bl2) {
            e e10 = e.a(jsonObject, jsonDeserializationContext, n3, n2, arrd);
            if (m.c()) {
                j.b(new m[1]);
            }
            return e10;
        }
        throw new JsonSyntaxException("Unknown loot entry type '" + string + "'");
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

