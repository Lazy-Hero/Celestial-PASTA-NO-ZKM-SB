/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.K.b;
import net.minecraft.K.j;
import net.minecraft.M.aF;
import net.minecraft.M.t;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;

public class X {
    private final /* synthetic */ Map<b, aF> b;
    public static final /* synthetic */ X a;

    static {
        a = new X(Collections.emptyMap());
    }

    public boolean a(Map<b, j> map) {
        boolean bl2;
        block6: {
            int n2 = t.c();
            X x2 = this;
            if (n2 != 0) {
                if (x2 == a) {
                    return true;
                }
                x2 = this;
            }
            for (Map.Entry<b, aF> entry : x2.b.entrySet()) {
                block8: {
                    boolean bl3;
                    block7: {
                        j j2 = map.get(entry.getKey());
                        bl2 = entry.getValue().a(j2);
                        if (n2 == 0) break block6;
                        if (n2 == 0) break block7;
                        if (bl2) break block8;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (n2 != 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    public X(Map<b, aF> map) {
        this.b = map;
    }

    public static X a(@Nullable JsonElement jsonElement) {
        block7: {
            JsonElement jsonElement2;
            int n2;
            block8: {
                block6: {
                    n2 = t.b();
                    jsonElement2 = jsonElement;
                    if (n2 != 0) break block6;
                    if (jsonElement2 == null) break block7;
                    jsonElement2 = jsonElement;
                }
                if (n2 != 0) break block8;
                if (jsonElement2.isJsonNull()) break block7;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "effects");
            HashMap hashMap = Maps.newHashMap();
            for (Map.Entry entry : jsonObject.entrySet()) {
                b b10;
                v v2 = new v((String)entry.getKey());
                b b11 = b10 = net.minecraft.K.b.e.a(v2);
                if (n2 == 0) {
                    if (b11 == null) {
                        throw new JsonSyntaxException("Unknown effect '" + v2 + "'");
                    }
                    b11 = entry.getValue();
                }
                aF aF2 = aF.a(aG.b((JsonElement)b11, (String)entry.getKey()));
                hashMap.put(b10, aF2);
                if (n2 == 0) continue;
            }
            return new X(hashMap);
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(B b10) {
        int n2 = t.c();
        X x2 = this;
        if (n2 != 0) {
            if (x2 == a) return true;
            x2 = this;
        }
        boolean bl2 = x2.a(b10.e());
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(x x2) {
        int n2 = t.c();
        if (this == a) {
            return true;
        }
        boolean bl2 = x2 instanceof B;
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = this.a(((B)x2).e());
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }
}

