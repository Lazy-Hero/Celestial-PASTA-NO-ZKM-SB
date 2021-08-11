/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.k;

public enum a8 {
    WOOD(0, 59, 2.0f, 0.0f, 15),
    STONE(1, 131, 4.0f, 1.0f, 5),
    IRON(2, 250, 6.0f, 2.0f, 14),
    DIAMOND(3, 1561, 8.0f, 3.0f, 10),
    GOLD(0, 32, 12.0f, 0.0f, 22);

    private final /* synthetic */ int c;
    private final /* synthetic */ float e;
    private final /* synthetic */ int d;
    private final /* synthetic */ int a;
    private final /* synthetic */ float b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public float a() {
        return this.e;
    }

    public int b() {
        return this.d;
    }

    public int e() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    private a8(int n3, int n4, float f10, float f11, int n5) {
        this.d = n3;
        this.a = n4;
        this.b = f10;
        this.e = f11;
        this.c = n5;
    }

    public float f() {
        return this.b;
    }

    public k d() {
        int n2 = bl.c();
        a8 a82 = this;
        a8 a83 = WOOD;
        if (n2 == 0) {
            if (a82 == a83) {
                return k.b(g.cB);
            }
            a82 = this;
            a83 = STONE;
        }
        if (n2 == 0) {
            if (a82 == a83) {
                return k.b(g.cW);
            }
            a82 = this;
            a83 = GOLD;
        }
        if (n2 == 0) {
            if (a82 == a83) {
                return h.I;
            }
            a82 = this;
            a83 = IRON;
        }
        if (n2 == 0) {
            if (a82 == a83) {
                return h.ad;
            }
            a82 = this;
            a83 = DIAMOND;
        }
        return a82 == a83 ? h.ag : null;
    }
}

