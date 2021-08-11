/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public enum am {
    LEGACY("legacy"),
    MOJANG("mojang");

    private static final /* synthetic */ Map<String, am> a;
    private final /* synthetic */ String c;

    @Nullable
    public static am a(String string) {
        return a.get(string.toLowerCase(Locale.ROOT));
    }

    private am(String string2) {
        this.c = string2;
    }

    static {
        a = Maps.newHashMap();
        for (am am2 : am.values()) {
            a.put(am2.c, am2);
        }
    }
}

