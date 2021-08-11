/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonDeserializationContext
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.a6;
import net.minecraft.aG;
import net.minecraft.aR;
import net.minecraft.ar.v;

public class aT {
    private final /* synthetic */ aR a;

    public static aT a(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        v v2;
        v v3 = new v(net.minecraft.ar.aG.f(jsonObject, "trigger"));
        boolean bl2 = aG.b();
        v v4 = v2 = a6.a(v3);
        if (bl2) {
            if (v4 == null) {
                throw new JsonSyntaxException("Invalid criterion trigger: " + v3);
            }
            v4 = v2;
        }
        Object t2 = v4.a(net.minecraft.ar.aG.a(jsonObject, "conditions", new JsonObject()), jsonDeserializationContext);
        return new aT((aR)t2);
    }

    public aT(aR aR2) {
        this.a = aR2;
    }

    public void b(m m2) {
    }

    public aT() {
        this.a = null;
    }

    public static Map<String, aT> a(m m2) {
        HashMap hashMap;
        block2: {
            HashMap hashMap2 = Maps.newHashMap();
            int n2 = m2.a();
            boolean bl2 = aG.a();
            for (int i2 = 0; i2 < n2; ++i2) {
                hashMap = hashMap2;
                if (!bl2) {
                    hashMap.put(m2.c(32767), aT.c(m2));
                    if (!bl2) continue;
                }
                break block2;
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    public static void a(Map<String, aT> map, m m2) {
        boolean bl2 = aG.a();
        m2.d(map.size());
        Iterator<Map.Entry<String, aT>> iterator = map.entrySet().iterator();
        boolean bl3 = bl2;
        while (iterator.hasNext()) {
            Map.Entry<String, aT> entry = iterator.next();
            m2.a(entry.getKey());
            entry.getValue().b(m2);
            if (!bl3) continue;
        }
    }

    @Nullable
    public aR a() {
        return this.a;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public static aT c(m m2) {
        return new aT();
    }

    public static Map<String, aT> b(JsonObject jsonObject, JsonDeserializationContext jsonDeserializationContext) {
        HashMap hashMap;
        block2: {
            HashMap hashMap2 = Maps.newHashMap();
            boolean bl2 = aG.a();
            for (Map.Entry entry : jsonObject.entrySet()) {
                hashMap = hashMap2;
                if (!bl2) {
                    hashMap.put(entry.getKey(), aT.a(net.minecraft.ar.aG.b((JsonElement)entry.getValue(), "criterion"), jsonDeserializationContext));
                    if (!bl2) continue;
                }
                break block2;
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }
}

