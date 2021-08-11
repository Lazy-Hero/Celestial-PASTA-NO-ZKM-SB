/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  com.google.gson.JsonElement
 *  javax.annotation.Nullable
 */
package net.minecraft.client.p;

import com.google.common.base.Function;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import net.minecraft.client.p.a;
import net.minecraft.client.p.h;
import net.minecraft.client.p.m;

final class j
implements Function<JsonElement, m> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public m a(@Nullable JsonElement jsonElement) {
        String string = h.b();
        JsonElement jsonElement2 = jsonElement;
        if (string != null) {
            if (jsonElement2 == null) {
                return null;
            }
            jsonElement2 = jsonElement;
        }
        m m2 = a.a(jsonElement2.getAsJsonObject());
        return m2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    j() {
    }
}

