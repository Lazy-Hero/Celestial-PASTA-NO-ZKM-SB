/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.w;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.w.aE;
import net.minecraft.w.bl;
import net.minecraft.w.d;

public enum aY {
    COD(0, "cod", 2, 0.1f, 5, 0.6f),
    SALMON(1, "salmon", 2, 0.1f, 6, 0.8f),
    CLOWNFISH(2, "clownfish", 1, 0.1f),
    PUFFERFISH(3, "pufferfish", 1, 0.1f);

    private final /* synthetic */ boolean g;
    private final /* synthetic */ float f;
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ float c;
    private final /* synthetic */ String i;
    private static final /* synthetic */ Map<Integer, aY> e;
    private final /* synthetic */ int h;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int d() {
        return this.h;
    }

    public int c() {
        return this.a;
    }

    public float g() {
        return this.f;
    }

    private aY(int n3, String string2, int n4, float f10) {
        this.b = n3;
        this.i = string2;
        this.a = n4;
        this.c = f10;
        this.h = 0;
        this.f = 0.0f;
        this.g = false;
    }

    public String b() {
        return this.i;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static aY a(d d10) {
        aY aY2;
        int n2 = bl.g();
        int n3 = d10.w() instanceof aE;
        if (n2 != 0) {
            if (n3 == 0) {
                aY2 = COD;
                return aY2;
            }
            n3 = d10.d();
        }
        aY2 = aY.a(n3);
        return aY2;
    }

    public float f() {
        return this.c;
    }

    public static aY a(int n2) {
        aY aY2 = e.get(n2);
        int n3 = bl.c();
        aY aY3 = aY2;
        if (n3 == 0) {
            aY3 = aY3 == null ? COD : aY2;
        }
        return aY3;
    }

    static {
        e = Maps.newHashMap();
        for (aY aY2 : aY.values()) {
            e.put(aY2.a(), aY2);
        }
    }

    public boolean e() {
        return this.g;
    }

    private aY(int n3, String string2, int n4, float f10, int n5, float f11) {
        this.b = n3;
        this.i = string2;
        this.a = n4;
        this.c = f10;
        this.h = n5;
        this.f = f11;
        this.g = true;
    }

    public int a() {
        return this.b;
    }
}

