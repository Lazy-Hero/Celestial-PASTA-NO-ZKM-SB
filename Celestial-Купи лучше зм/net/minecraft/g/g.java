/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.g;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Map;
import java.util.Set;
import net.minecraft.L.b;
import net.minecraft.L.c;
import net.minecraft.L.d;
import net.minecraft.aj.t;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.g.e;
import net.minecraft.g.f;
import net.minecraft.k.m;

public class g
extends f<e> {
    @Override
    public e a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        Set set = aG.l(jsonObject, "properties").entrySet();
        int[] arrn = f.b();
        b[] arrb = new b[set.size()];
        int n2 = 0;
        for (Map.Entry entry : set) {
            arrb[n2++] = c.a(new v((String)entry.getKey())).a((JsonElement)entry.getValue(), jsonDeserializationContext);
            if (arrn != null) continue;
            m.b(!m.d());
            break;
        }
        return new e(arrb, aG.a(jsonObject, "entity", jsonDeserializationContext, t.class));
    }

    protected g() {
        super(new v("entity_properties"), e.class);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(JsonObject jsonObject, e e10, JsonSerializationContext jsonSerializationContext) {
        block3: {
            block2: {
                JsonObject jsonObject2 = new JsonObject();
                b[] arrb = e.a(e10);
                int n2 = arrb.length;
                int[] arrn = f.b();
                for (int i2 = 0; i2 < n2; ++i2) {
                    b b10 = arrb[i2];
                    d<b> d10 = c.a(b10);
                    jsonObject2.add(d10.b().toString(), d10.a(b10, jsonSerializationContext));
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block2;
                }
                jsonObject.add("properties", (JsonElement)jsonObject2);
                jsonObject.add("entity", jsonSerializationContext.serialize((Object)e.b(e10)));
            }
            if (m.d()) break block3;
            f.b(new int[4]);
        }
    }
}

