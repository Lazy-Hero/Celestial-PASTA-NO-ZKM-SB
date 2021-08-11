/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aA;
import net.minecraft.client.a.aX;

public enum O {
    DOWN(new aA[]{aA.WEST, aA.EAST, aA.NORTH, aA.SOUTH}, 0.5f, true, new aX[]{aX.FLIP_WEST, aX.SOUTH, aX.FLIP_WEST, aX.FLIP_SOUTH, aX.WEST, aX.FLIP_SOUTH, aX.WEST, aX.SOUTH}, new aX[]{aX.FLIP_WEST, aX.NORTH, aX.FLIP_WEST, aX.FLIP_NORTH, aX.WEST, aX.FLIP_NORTH, aX.WEST, aX.NORTH}, new aX[]{aX.FLIP_EAST, aX.NORTH, aX.FLIP_EAST, aX.FLIP_NORTH, aX.EAST, aX.FLIP_NORTH, aX.EAST, aX.NORTH}, new aX[]{aX.FLIP_EAST, aX.SOUTH, aX.FLIP_EAST, aX.FLIP_SOUTH, aX.EAST, aX.FLIP_SOUTH, aX.EAST, aX.SOUTH}),
    UP(new aA[]{aA.EAST, aA.WEST, aA.NORTH, aA.SOUTH}, 1.0f, true, new aX[]{aX.EAST, aX.SOUTH, aX.EAST, aX.FLIP_SOUTH, aX.FLIP_EAST, aX.FLIP_SOUTH, aX.FLIP_EAST, aX.SOUTH}, new aX[]{aX.EAST, aX.NORTH, aX.EAST, aX.FLIP_NORTH, aX.FLIP_EAST, aX.FLIP_NORTH, aX.FLIP_EAST, aX.NORTH}, new aX[]{aX.WEST, aX.NORTH, aX.WEST, aX.FLIP_NORTH, aX.FLIP_WEST, aX.FLIP_NORTH, aX.FLIP_WEST, aX.NORTH}, new aX[]{aX.WEST, aX.SOUTH, aX.WEST, aX.FLIP_SOUTH, aX.FLIP_WEST, aX.FLIP_SOUTH, aX.FLIP_WEST, aX.SOUTH}),
    NORTH(new aA[]{aA.UP, aA.DOWN, aA.EAST, aA.WEST}, 0.8f, true, new aX[]{aX.UP, aX.FLIP_WEST, aX.UP, aX.WEST, aX.FLIP_UP, aX.WEST, aX.FLIP_UP, aX.FLIP_WEST}, new aX[]{aX.UP, aX.FLIP_EAST, aX.UP, aX.EAST, aX.FLIP_UP, aX.EAST, aX.FLIP_UP, aX.FLIP_EAST}, new aX[]{aX.DOWN, aX.FLIP_EAST, aX.DOWN, aX.EAST, aX.FLIP_DOWN, aX.EAST, aX.FLIP_DOWN, aX.FLIP_EAST}, new aX[]{aX.DOWN, aX.FLIP_WEST, aX.DOWN, aX.WEST, aX.FLIP_DOWN, aX.WEST, aX.FLIP_DOWN, aX.FLIP_WEST}),
    SOUTH(new aA[]{aA.WEST, aA.EAST, aA.DOWN, aA.UP}, 0.8f, true, new aX[]{aX.UP, aX.FLIP_WEST, aX.FLIP_UP, aX.FLIP_WEST, aX.FLIP_UP, aX.WEST, aX.UP, aX.WEST}, new aX[]{aX.DOWN, aX.FLIP_WEST, aX.FLIP_DOWN, aX.FLIP_WEST, aX.FLIP_DOWN, aX.WEST, aX.DOWN, aX.WEST}, new aX[]{aX.DOWN, aX.FLIP_EAST, aX.FLIP_DOWN, aX.FLIP_EAST, aX.FLIP_DOWN, aX.EAST, aX.DOWN, aX.EAST}, new aX[]{aX.UP, aX.FLIP_EAST, aX.FLIP_UP, aX.FLIP_EAST, aX.FLIP_UP, aX.EAST, aX.UP, aX.EAST}),
    WEST(new aA[]{aA.UP, aA.DOWN, aA.NORTH, aA.SOUTH}, 0.6f, true, new aX[]{aX.UP, aX.SOUTH, aX.UP, aX.FLIP_SOUTH, aX.FLIP_UP, aX.FLIP_SOUTH, aX.FLIP_UP, aX.SOUTH}, new aX[]{aX.UP, aX.NORTH, aX.UP, aX.FLIP_NORTH, aX.FLIP_UP, aX.FLIP_NORTH, aX.FLIP_UP, aX.NORTH}, new aX[]{aX.DOWN, aX.NORTH, aX.DOWN, aX.FLIP_NORTH, aX.FLIP_DOWN, aX.FLIP_NORTH, aX.FLIP_DOWN, aX.NORTH}, new aX[]{aX.DOWN, aX.SOUTH, aX.DOWN, aX.FLIP_SOUTH, aX.FLIP_DOWN, aX.FLIP_SOUTH, aX.FLIP_DOWN, aX.SOUTH}),
    EAST(new aA[]{aA.DOWN, aA.UP, aA.NORTH, aA.SOUTH}, 0.6f, true, new aX[]{aX.FLIP_DOWN, aX.SOUTH, aX.FLIP_DOWN, aX.FLIP_SOUTH, aX.DOWN, aX.FLIP_SOUTH, aX.DOWN, aX.SOUTH}, new aX[]{aX.FLIP_DOWN, aX.NORTH, aX.FLIP_DOWN, aX.FLIP_NORTH, aX.DOWN, aX.FLIP_NORTH, aX.DOWN, aX.NORTH}, new aX[]{aX.FLIP_UP, aX.NORTH, aX.FLIP_UP, aX.FLIP_NORTH, aX.UP, aX.FLIP_NORTH, aX.UP, aX.NORTH}, new aX[]{aX.FLIP_UP, aX.SOUTH, aX.FLIP_UP, aX.FLIP_SOUTH, aX.UP, aX.FLIP_SOUTH, aX.UP, aX.SOUTH});

    private final /* synthetic */ aA[] f;
    private final /* synthetic */ aX[] c;
    private final /* synthetic */ aX[] g;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ float h;
    private final /* synthetic */ aX[] e;
    private static final /* synthetic */ O[] b;
    private final /* synthetic */ aX[] d;

    static aX[] b(O o2) {
        return o2.e;
    }

    static {
        b = new O[6];
        O.b[aA.DOWN.f()] = DOWN;
        O.b[aA.UP.f()] = UP;
        O.b[aA.NORTH.f()] = NORTH;
        O.b[aA.SOUTH.f()] = SOUTH;
        O.b[aA.WEST.f()] = WEST;
        O.b[aA.EAST.f()] = EAST;
    }

    static boolean f(O o2) {
        return o2.i;
    }

    private O(aA[] arraA, float f10, boolean bl2, aX[] arraX, aX[] arraX2, aX[] arraX3, aX[] arraX4) {
        this.f = arraA;
        this.h = f10;
        this.i = bl2;
        this.g = arraX;
        this.e = arraX2;
        this.c = arraX3;
        this.d = arraX4;
    }

    static aX[] d(O o2) {
        return o2.g;
    }

    static aA[] c(O o2) {
        return o2.f;
    }

    public static O a(aA aA2) {
        return b[aA2.f()];
    }

    static aX[] a(O o2) {
        return o2.c;
    }

    static aX[] e(O o2) {
        return o2.d;
    }
}

