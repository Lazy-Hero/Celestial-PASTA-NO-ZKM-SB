/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.ar;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public enum ay {
    MASTER("master"),
    MUSIC("music"),
    RECORDS("record"),
    WEATHER("weather"),
    BLOCKS("block"),
    HOSTILE("hostile"),
    NEUTRAL("neutral"),
    PLAYERS("player"),
    AMBIENT("ambient"),
    VOICE("voice");

    private static final /* synthetic */ Map<String, ay> c;
    private final /* synthetic */ String a;

    private ay(String string2) {
        this.a = string2;
    }

    public static ay a(String string) {
        return c.get(string);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static Set<String> a() {
        return c.keySet();
    }

    public String b() {
        return this.a;
    }

    static {
        c = Maps.newHashMap();
        for (ay ay2 : ay.values()) {
            if (c.containsKey(ay2.b())) {
                throw new Error("Clash in Sound Category name pools! Cannot insert " + (Object)((Object)ay2));
            }
            c.put(ay2.b(), ay2);
        }
    }
}

