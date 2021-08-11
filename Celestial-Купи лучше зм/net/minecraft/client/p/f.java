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
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.client.p.a;
import net.minecraft.client.p.h;
import net.minecraft.client.p.m;
import net.minecraft.client.p.r;

final class f
implements Function<Map.Entry<String, JsonElement>, m> {
    f() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public m a(@Nullable Map.Entry<String, JsonElement> entry) {
        String string = h.b();
        Map.Entry<String, JsonElement> entry2 = entry;
        if (string != null) {
            if (entry2 == null) {
                return null;
            }
            entry2 = entry;
        }
        r r2 = a.a(entry2);
        return r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

