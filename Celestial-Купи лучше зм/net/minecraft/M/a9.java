/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.M.aA;
import net.minecraft.M.t;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.ax.u;

public class a9 {
    private final /* synthetic */ aA c;
    private final /* synthetic */ u b;
    public static final /* synthetic */ a9 a;

    static {
        a = new a9();
    }

    public a9() {
        this.b = null;
        this.c = aA.c;
    }

    private static JsonSyntaxException a(JsonSyntaxException jsonSyntaxException) {
        return jsonSyntaxException;
    }

    public a9(@Nullable u u2, aA aA2) {
        this.b = u2;
        this.c = aA2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(Map<u, Integer> map) {
        int n2 = t.b();
        a9 a92 = this;
        if (n2 == 0) {
            if (a92.b != null) {
                int n3 = map.containsKey(this.b);
                if (n2 == 0) {
                    if (n3 == 0) {
                        return false;
                    }
                    n3 = map.get(this.b);
                }
                int n4 = n3;
                aA aA2 = this.c;
                if (n2 == 0) {
                    if (aA2 == null) return true;
                    aA2 = this.c;
                }
                boolean bl2 = aA2.a(n4);
                if (n2 != 0) return bl2;
                if (!bl2) return false;
                return true;
            }
            a92 = this;
        }
        if (a92.c == null) return true;
        Iterator<Integer> iterator = map.values().iterator();
        do {
            if (!iterator.hasNext()) return false;
            Integer n5 = iterator.next();
            boolean bl3 = this.c.a(n5.intValue());
            if (n2 != 0) return bl3;
            if (n2 != 0) boolean bl4;
            return bl4;
            if (!bl3) continue;
            return true;
        } while (n2 == 0);
        return false;
    }

    public static a9 a(@Nullable JsonElement jsonElement) {
        block5: {
            Object object;
            JsonElement jsonElement2;
            block6: {
                int n2;
                block4: {
                    n2 = t.b();
                    jsonElement2 = jsonElement;
                    if (n2 != 0) break block4;
                    if (jsonElement2 == null) break block5;
                    jsonElement2 = jsonElement;
                }
                if (n2 != 0) break block6;
                if (jsonElement2.isJsonNull()) break block5;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "enchantment");
            u u2 = null;
            if (jsonObject.has("enchantment") && (u2 = u.e.a((v)(object = new v(aG.f(jsonObject, "enchantment"))))) == null) {
                throw new JsonSyntaxException("Unknown enchantment '" + object + "'");
            }
            object = aA.a(jsonObject.get("levels"));
            return new a9(u2, (aA)object);
        }
        return a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a9[] b(@Nullable JsonElement jsonElement) {
        int n2;
        block6: {
            JsonElement jsonElement2;
            int n3;
            block5: {
                n3 = t.b();
                jsonElement2 = jsonElement;
                if (n3 != 0) break block5;
                if (jsonElement2 == null) break block6;
                jsonElement2 = jsonElement;
            }
            n2 = jsonElement2.isJsonNull();
            if (n3 != 0) return new a9[n2];
            if (n2 == 0) {
                a9[] arra9;
                JsonArray jsonArray = aG.c(jsonElement, "enchantments");
                a9[] arra92 = new a9[jsonArray.size()];
                for (int i2 = 0; i2 < arra92.length; ++i2) {
                    arra9 = arra92;
                    if (n3 != 0) return arra9;
                    arra9[i2] = a9.a(jsonArray.get(i2));
                    if (n3 == 0) continue;
                }
                arra9 = arra92;
                return arra9;
            }
        }
        n2 = 0;
        return new a9[n2];
    }
}

