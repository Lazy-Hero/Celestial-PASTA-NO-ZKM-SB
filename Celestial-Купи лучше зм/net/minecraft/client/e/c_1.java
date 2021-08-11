/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import net.minecraft.ar.d;
import net.minecraft.u.E;

public enum c {
    MENU(E.hh, 20, 600),
    GAME(E.a3, 12000, 24000),
    CREATIVE(E.em, 1200, 3600),
    CREDITS(E.d7, 0, 0),
    NETHER(E.dQ, 1200, 3600),
    END_BOSS(E.gM, 0, 0),
    END(E.f7, 6000, 24000);

    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ d a;

    public int c() {
        return this.c;
    }

    private c(d d10, int n3, int n4) {
        this.a = d10;
        this.c = n3;
        this.b = n4;
    }

    public int a() {
        return this.b;
    }

    public d b() {
        return this.a;
    }
}

