/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.annotations.VisibleForTesting
 *  com.google.common.base.Function
 *  com.google.common.collect.Iterables
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonDeserializer
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 */
package net.minecraft.client.p;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import net.minecraft.ar.aG;
import net.minecraft.client.p.c;
import net.minecraft.client.p.e;
import net.minecraft.client.p.f;
import net.minecraft.client.p.h;
import net.minecraft.client.p.j;
import net.minecraft.client.p.m;
import net.minecraft.client.p.r;
import net.minecraft.client.x.W;

public class a
implements JsonDeserializer<h> {
    private static final /* synthetic */ Function<Map.Entry<String, JsonElement>, m> b;
    private static final /* synthetic */ Function<JsonElement, m> a;

    static r a(Map.Entry entry) {
        return net.minecraft.client.p.a.b(entry);
    }

    private static r b(Map.Entry<String, JsonElement> entry) {
        return new r(entry.getKey(), entry.getValue().getAsString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private m b(JsonObject jsonObject) {
        m m2;
        String string = h.b();
        JsonObject jsonObject2 = jsonObject;
        String string2 = "when";
        if (string != null) {
            if (!jsonObject2.has(string2)) {
                m2 = m.a;
                return m2;
            }
            jsonObject2 = jsonObject;
            string2 = "when";
        }
        m2 = net.minecraft.client.p.a.a(aG.l(jsonObject2, string2));
        return m2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @VisibleForTesting
    static m a(JsonObject jsonObject) {
        m m2;
        Object object;
        block10: {
            int n2;
            Set set;
            block9: {
                set = jsonObject.entrySet();
                String string = h.b();
                n2 = set.isEmpty();
                if (string != null) {
                    if (n2 != 0) {
                        throw new JsonParseException("No elements found in selector");
                    }
                    n2 = set.size();
                }
                if (string != null) {
                    if (n2 != 1) {
                        e e10 = new e(Iterables.transform((Iterable)set, b));
                        if (!net.minecraft.k.m.c()) return e10;
                        h.b("eAFIY");
                        return e10;
                    }
                    n2 = jsonObject.has("OR") ? 1 : 0;
                }
                if (string == null) break block9;
                if (n2 != 0) {
                    return new c(Iterables.transform((Iterable)aG.i(jsonObject, "OR"), a));
                }
                object = jsonObject;
                if (string == null) break block10;
                n2 = object.has("AND") ? 1 : 0;
            }
            if (n2 != 0) {
                m2 = new e(Iterables.transform((Iterable)aG.i(jsonObject, "AND"), a));
                return m2;
            }
            object = set.iterator().next();
        }
        m2 = net.minecraft.client.p.a.b((Map.Entry)object);
        return m2;
    }

    static {
        a = new j();
        b = new f();
    }

    public h a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        return new h(this.b(jsonObject), (W)jsonDeserializationContext.deserialize(jsonObject.get("apply"), W.class));
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }
}

