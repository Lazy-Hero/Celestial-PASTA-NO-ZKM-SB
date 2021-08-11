/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.I;

import com.google.common.collect.Maps;
import java.util.Map;

public enum c {
    SHOW_TEXT("show_text", true),
    SHOW_ITEM("show_item", true),
    SHOW_ENTITY("show_entity", true);

    private final /* synthetic */ boolean d;
    private static final /* synthetic */ Map<String, c> a;
    private final /* synthetic */ String b;

    public static c a(String string) {
        return a.get(string);
    }

    private c(String string2, boolean bl2) {
        this.b = string2;
        this.d = bl2;
    }

    public boolean b() {
        return this.d;
    }

    static {
        a = Maps.newHashMap();
        for (c c10 : net.minecraft.I.c.values()) {
            a.put(c10.a(), c10);
        }
    }

    public String a() {
        return this.b;
    }
}

