/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aA;

enum f {
    DOWN(0, 1, 2, 3),
    UP(2, 3, 0, 1),
    NORTH(3, 0, 1, 2),
    SOUTH(0, 1, 2, 3),
    WEST(3, 0, 1, 2),
    EAST(1, 2, 3, 0);

    private final /* synthetic */ int a;
    private final /* synthetic */ int f;
    private final /* synthetic */ int e;
    private static final /* synthetic */ f[] d;
    private final /* synthetic */ int c;

    private f(int n3, int n4, int n5, int n6) {
        this.c = n3;
        this.e = n4;
        this.a = n5;
        this.f = n6;
    }

    static int c(f f10) {
        return f10.c;
    }

    public static f a(aA aA2) {
        return d[aA2.f()];
    }

    static {
        d = new f[6];
        net.minecraft.client.a.f.d[aA.DOWN.f()] = DOWN;
        net.minecraft.client.a.f.d[aA.UP.f()] = UP;
        net.minecraft.client.a.f.d[aA.NORTH.f()] = NORTH;
        net.minecraft.client.a.f.d[aA.SOUTH.f()] = SOUTH;
        net.minecraft.client.a.f.d[aA.WEST.f()] = WEST;
        net.minecraft.client.a.f.d[aA.EAST.f()] = EAST;
    }

    static int d(f f10) {
        return f10.a;
    }

    static int b(f f10) {
        return f10.e;
    }

    static int a(f f10) {
        return f10.f;
    }
}

