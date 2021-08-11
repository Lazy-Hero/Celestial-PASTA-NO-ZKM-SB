/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.annotation.Nullable;
import net.minecraft.M.aA;
import net.minecraft.M.t;
import net.minecraft.ar.aG;
import net.minecraft.k.h;

public class q {
    private final /* synthetic */ aA b;
    private final /* synthetic */ aA e;
    private final /* synthetic */ aA f;
    private final /* synthetic */ aA c;
    private final /* synthetic */ aA d;
    public static final /* synthetic */ q a;

    static {
        a = new q(aA.c, aA.c, aA.c, aA.c, aA.c);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(double d10, double d11, double d12, double d13, double d14, double d15) {
        float f10 = (float)(d10 - d13);
        int n2 = t.b();
        float f11 = (float)(d11 - d14);
        float f12 = (float)(d12 - d15);
        boolean bl2 = this.e.a(h.e(f10));
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        bl2 = this.b.a(h.e(f11));
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        bl2 = this.d.a(h.e(f12));
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        boolean bl3 = this.c.a((double)(f10 * f10 + f12 * f12));
        if (n2 != 0) return bl3;
        if (!bl3) {
            return false;
        }
        bl3 = this.f.a((double)(f10 * f10 + f11 * f11 + f12 * f12));
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q(aA aA2, aA aA3, aA aA4, aA aA5, aA aA6) {
        this.e = aA2;
        this.b = aA3;
        this.d = aA4;
        this.c = aA5;
        this.f = aA6;
    }

    public static q a(@Nullable JsonElement jsonElement) {
        block3: {
            JsonElement jsonElement2;
            block4: {
                int n2;
                block2: {
                    n2 = t.c();
                    jsonElement2 = jsonElement;
                    if (n2 == 0) break block2;
                    if (jsonElement2 == null) break block3;
                    jsonElement2 = jsonElement;
                }
                if (n2 == 0) break block4;
                if (jsonElement2.isJsonNull()) break block3;
                jsonElement2 = jsonElement;
            }
            JsonObject jsonObject = aG.b(jsonElement2, "distance");
            aA aA2 = aA.a(jsonObject.get("x"));
            aA aA3 = aA.a(jsonObject.get("y"));
            aA aA4 = aA.a(jsonObject.get("z"));
            aA aA5 = aA.a(jsonObject.get("horizontal"));
            aA aA6 = aA.a(jsonObject.get("absolute"));
            return new q(aA2, aA3, aA4, aA5, aA6);
        }
        return a;
    }
}

