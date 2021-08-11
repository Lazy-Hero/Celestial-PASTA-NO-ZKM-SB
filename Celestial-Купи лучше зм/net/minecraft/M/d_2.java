/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  com.google.gson.JsonSerializationContext
 *  com.google.gson.JsonSyntaxException
 */
package net.minecraft.m;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.ax.u;
import net.minecraft.m.c;
import net.minecraft.m.m;
import net.minecraft.m.n;

public class d
extends c<n> {
    public d() {
        super(new v("enchant_randomly"), n.class);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a(JsonObject jsonObject, n n2, JsonSerializationContext jsonSerializationContext) {
        block5: {
            net.minecraft.k.m[] arrm = m.b();
            if (!n.a(n2).isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                for (u u2 : n.a(n2)) {
                    v v2 = u.e.b(u2);
                    if (arrm != null) {
                        if (arrm != null) {
                            if (v2 == null) {
                                throw new IllegalArgumentException("Don't know how to serialize enchantment " + u2);
                            }
                            jsonArray.add((JsonElement)new JsonPrimitive(v2.toString()));
                        }
                        if (arrm != null) continue;
                    }
                    break block5;
                }
                jsonObject.add("enchantments", (JsonElement)jsonArray);
            }
        }
    }

    @Override
    public n a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext, net.minecraft.g.d[] arrd) {
        ArrayList arrayList;
        block7: {
            String string;
            JsonObject jsonObject2;
            net.minecraft.k.m[] arrm;
            block6: {
                arrayList = Lists.newArrayList();
                arrm = m.b();
                jsonObject2 = jsonObject;
                string = "enchantments";
                if (arrm == null) break block6;
                if (!jsonObject2.has(string)) break block7;
                jsonObject2 = jsonObject;
                string = "enchantments";
            }
            for (JsonElement jsonElement : aG.i(jsonObject2, string)) {
                String string2 = aG.e(jsonElement, "enchantment");
                u u2 = u.e.a(new v(string2));
                if (arrm != null) {
                    if (u2 == null) {
                        throw new JsonSyntaxException("Unknown enchantment '" + string2 + "'");
                    }
                    arrayList.add(u2);
                }
                if (arrm != null) continue;
            }
        }
        return new n(arrd, arrayList);
    }
}

