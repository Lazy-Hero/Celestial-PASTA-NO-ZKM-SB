/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aA;
import net.minecraft.client.a.aU;
import net.minecraft.client.a.c;

public enum ao {
    DOWN(new c[]{new c(aU.c, aU.f, aU.e, null), new c(aU.c, aU.f, aU.b, null), new c(aU.a, aU.f, aU.b, null), new c(aU.a, aU.f, aU.e, null)}),
    UP(new c[]{new c(aU.c, aU.d, aU.b, null), new c(aU.c, aU.d, aU.e, null), new c(aU.a, aU.d, aU.e, null), new c(aU.a, aU.d, aU.b, null)}),
    NORTH(new c[]{new c(aU.a, aU.d, aU.b, null), new c(aU.a, aU.f, aU.b, null), new c(aU.c, aU.f, aU.b, null), new c(aU.c, aU.d, aU.b, null)}),
    SOUTH(new c[]{new c(aU.c, aU.d, aU.e, null), new c(aU.c, aU.f, aU.e, null), new c(aU.a, aU.f, aU.e, null), new c(aU.a, aU.d, aU.e, null)}),
    WEST(new c[]{new c(aU.c, aU.d, aU.b, null), new c(aU.c, aU.f, aU.b, null), new c(aU.c, aU.f, aU.e, null), new c(aU.c, aU.d, aU.e, null)}),
    EAST(new c[]{new c(aU.a, aU.d, aU.e, null), new c(aU.a, aU.f, aU.e, null), new c(aU.a, aU.f, aU.b, null), new c(aU.a, aU.d, aU.b, null)});

    private final /* synthetic */ c[] c;
    private static final /* synthetic */ ao[] b;

    public static ao a(aA aA2) {
        return b[aA2.f()];
    }

    private ao(c[] arrc) {
        this.c = arrc;
    }

    public c a(int n2) {
        return this.c[n2];
    }

    static {
        b = new ao[6];
        ao.b[aU.f] = DOWN;
        ao.b[aU.d] = UP;
        ao.b[aU.b] = NORTH;
        ao.b[aU.e] = SOUTH;
        ao.b[aU.c] = WEST;
        ao.b[aU.a] = EAST;
    }
}

