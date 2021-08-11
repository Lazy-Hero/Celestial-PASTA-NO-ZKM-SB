/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aA;

public enum aX {
    DOWN(aA.DOWN, false),
    UP(aA.UP, false),
    NORTH(aA.NORTH, false),
    SOUTH(aA.SOUTH, false),
    WEST(aA.WEST, false),
    EAST(aA.EAST, false),
    FLIP_DOWN(aA.DOWN, true),
    FLIP_UP(aA.UP, true),
    FLIP_NORTH(aA.NORTH, true),
    FLIP_SOUTH(aA.SOUTH, true),
    FLIP_WEST(aA.WEST, true),
    FLIP_EAST(aA.EAST, true);

    private final /* synthetic */ int b;

    static int a(aX aX2) {
        return aX2.b;
    }

    private aX(aA aA2, boolean bl2) {
        this.b = aA2.f() + (bl2 ? aA.values().length : 0);
    }
}

