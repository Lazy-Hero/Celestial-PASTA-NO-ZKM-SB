/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.at.h;
import net.minecraft.at.k;

public enum a {
    CAPE(0, "cape"),
    JACKET(1, "jacket"),
    LEFT_SLEEVE(2, "left_sleeve"),
    RIGHT_SLEEVE(3, "right_sleeve"),
    LEFT_PANTS_LEG(4, "left_pants_leg"),
    RIGHT_PANTS_LEG(5, "right_pants_leg"),
    HAT(6, "hat");

    private final /* synthetic */ int a;
    private final /* synthetic */ k e;
    private final /* synthetic */ String b;
    private final /* synthetic */ int c;

    private a(int n3, String string2) {
        this.a = n3;
        this.c = 1 << n3;
        this.b = string2;
        this.e = new h("options.modelPart." + string2, new Object[0]);
    }

    public String c() {
        return this.b;
    }

    public k d() {
        return this.e;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }
}

