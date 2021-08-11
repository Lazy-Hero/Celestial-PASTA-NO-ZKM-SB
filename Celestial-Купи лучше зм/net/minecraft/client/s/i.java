/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.s;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.client.a.as;
import net.minecraft.client.s.h;

public enum i {
    VERTEX("vertex", ".vsh", as.A),
    FRAGMENT("fragment", ".fsh", as.e);

    private final /* synthetic */ String a;
    private final /* synthetic */ Map<String, h> b;
    private final /* synthetic */ int e;
    private final /* synthetic */ String d;

    private i(String string2, String string3, int n3) {
        this.b = Maps.newHashMap();
        this.a = string2;
        this.d = string3;
        this.e = n3;
    }

    private int d() {
        return this.e;
    }

    static int c(i i2) {
        return i2.d();
    }

    private Map<String, h> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    private String c() {
        return this.d;
    }

    static Map b(i i2) {
        return i2.a();
    }

    static String a(i i2) {
        return i2.c();
    }
}

