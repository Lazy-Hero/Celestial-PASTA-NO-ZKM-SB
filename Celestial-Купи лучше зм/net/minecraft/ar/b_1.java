/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;

public enum b {
    LEFT(new h("options.mainHand.left", new Object[0])),
    RIGHT(new h("options.mainHand.right", new Object[0]));

    private final /* synthetic */ k b;

    private b(k k2) {
        this.b = k2;
    }

    public String toString() {
        return this.b.f();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public b a() {
        int n2 = v.d();
        b b10 = this;
        if (n2 != 0) {
            b10 = b10 == LEFT ? RIGHT : LEFT;
        }
        return b10;
    }
}

