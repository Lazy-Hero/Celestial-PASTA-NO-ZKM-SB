/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.B.X;
import net.minecraft.ar.d;
import net.minecraft.u.E;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.k;
import net.minecraft.w.m;

public enum aU {
    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, E.dR, 0.0f),
    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, E.ht, 0.0f),
    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, E.Q, 0.0f),
    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, E.hc, 0.0f),
    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, E.cx, 2.0f);

    private final /* synthetic */ int[] d;
    private final /* synthetic */ int f;
    private final /* synthetic */ d b;
    private final /* synthetic */ float c;
    private final /* synthetic */ int g;
    private final /* synthetic */ String e;

    public d a() {
        return this.b;
    }

    public int b(X x2) {
        return this.d[x2.a()];
    }

    private aU(String string2, int n3, int[] arrn, int n4, d d10, float f10) {
        this.e = string2;
        this.g = n3;
        this.d = arrn;
        this.f = n4;
        this.b = d10;
        this.c = f10;
    }

    public String b() {
        return this.e;
    }

    public int d() {
        return this.f;
    }

    public float e() {
        return this.c;
    }

    public int a(X x2) {
        return m.b()[x2.a()] * this.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k c() {
        int n2 = bl.g();
        aU aU2 = this;
        aU aU3 = LEATHER;
        if (n2 != 0) {
            if (aU2 == aU3) {
                return h.aQ;
            }
            aU2 = this;
            aU3 = CHAIN;
        }
        if (n2 != 0) {
            if (aU2 == aU3) {
                return h.ad;
            }
            aU2 = this;
            aU3 = GOLD;
        }
        if (n2 != 0) {
            if (aU2 == aU3) {
                return h.I;
            }
            aU2 = this;
            aU3 = IRON;
        }
        if (n2 != 0) {
            if (aU2 == aU3) {
                return h.ad;
            }
            aU2 = this;
            aU3 = DIAMOND;
        }
        return aU2 == aU3 ? h.ag : null;
    }
}

