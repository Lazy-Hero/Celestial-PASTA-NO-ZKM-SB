/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum G implements p
{
    UPPER,
    LOWER;


    public String toString() {
        return this.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String a() {
        return this == UPPER ? "upper" : "lower";
    }
}

