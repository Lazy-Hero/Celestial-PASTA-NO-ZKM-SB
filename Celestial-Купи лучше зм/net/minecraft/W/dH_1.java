/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

enum dH implements p
{
    UP("up"),
    SIDE("side"),
    NONE("none");

    private final /* synthetic */ String b;

    private dH(String string2) {
        this.b = string2;
    }

    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this.b;
    }
}

