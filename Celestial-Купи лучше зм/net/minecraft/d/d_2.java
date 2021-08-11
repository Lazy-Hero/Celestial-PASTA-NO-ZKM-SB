/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.D;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.D.l;

public enum d {
    INTEGER("integer"),
    HEARTS("hearts");

    private static final /* synthetic */ Map<String, d> a;
    private final /* synthetic */ String b;

    private d(String string2) {
        this.b = string2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static d a(String string) {
        d d10 = a.get(string);
        int n2 = l.a();
        d d11 = d10;
        if (n2 == 0) {
            d11 = d11 == null ? INTEGER : d10;
        }
        return d11;
    }

    public String a() {
        return this.b;
    }

    static {
        a = Maps.newHashMap();
        for (d d10 : d.values()) {
            a.put(d10.a(), d10);
        }
    }
}

