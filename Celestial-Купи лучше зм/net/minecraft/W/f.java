/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum f implements p
{
    TOP("top"),
    BOTTOM("bottom");

    private final /* synthetic */ String b;

    public String toString() {
        return this.b;
    }

    private f(String string2) {
        this.b = string2;
    }

    @Override
    public String a() {
        return this.b;
    }
}

