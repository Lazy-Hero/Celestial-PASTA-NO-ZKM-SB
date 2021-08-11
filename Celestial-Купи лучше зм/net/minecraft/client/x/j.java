/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.minecraft.ar.aA;
import net.minecraft.client.x.P;

enum j {
    UP(aA.UP, 0, -1),
    DOWN(aA.DOWN, 0, 1),
    LEFT(aA.EAST, -1, 0),
    RIGHT(aA.WEST, 1, 0);

    private final /* synthetic */ aA c;
    private final /* synthetic */ int b;
    private final /* synthetic */ int d;

    public int a() {
        return this.d;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aA d() {
        return this.c;
    }

    private j(aA aA2, int n3, int n4) {
        this.c = aA2;
        this.d = n3;
        this.b = n4;
    }

    public int c() {
        return this.b;
    }

    static boolean a(j j2) {
        return j2.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        String[] arrstring = P.o();
        j j2 = this;
        j j3 = DOWN;
        if (arrstring == null) {
            if (j2 == j3) return true;
            j2 = this;
            j3 = UP;
        }
        if (j2 != j3) return false;
        return true;
    }
}

