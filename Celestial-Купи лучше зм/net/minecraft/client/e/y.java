/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.ar.v;
import net.minecraft.client.e.n;
import net.minecraft.client.e.s;

public class y
extends s {
    public y(d d10, ay ay2, float f10, float f11, float f12, float f13, float f14) {
        this(d10, ay2, f10, f11, false, 0, n.LINEAR, f12, f13, f14);
    }

    private y(d d10, ay ay2, float f10, float f11, boolean bl2, int n2, n n3, float f12, float f13, float f14) {
        this(d10.a(), ay2, f10, f11, bl2, n2, n3, f12, f13, f14);
    }

    public static y a(d d10, float f10) {
        return y.a(d10, f10, 0.25f);
    }

    public static y a(d d10) {
        return new y(d10, ay.MUSIC, 1.0f, 1.0f, false, 0, n.NONE, 0.0f, 0.0f, 0.0f);
    }

    public y(v v2, ay ay2, float f10, float f11, boolean bl2, int n2, n n3, float f12, float f13, float f14) {
        super(v2, ay2);
        this.e = f10;
        this.f = f11;
        this.b = f12;
        this.h = f13;
        this.i = f14;
        this.c = bl2;
        this.g = n2;
        this.a = n3;
    }

    public static y a(d d10, float f10, float f11) {
        return new y(d10, ay.MASTER, f11, f10, false, 0, n.NONE, 0.0f, 0.0f, 0.0f);
    }

    public y(d d10, ay ay2, float f10, float f11, net.minecraft.k.n n2) {
        this(d10, ay2, f10, f11, (float)n2.e() + 0.5f, (float)n2.b() + 0.5f, (float)n2.a() + 0.5f);
    }

    public static y a(d d10, float f10, float f11, float f12) {
        return new y(d10, ay.RECORDS, 4.0f, 1.0f, false, 0, n.LINEAR, f10, f11, f12);
    }
}

