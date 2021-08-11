/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum dm implements p
{
    TOP("top"),
    BOTTOM("bottom");

    private final /* synthetic */ String a;

    @Override
    public String a() {
        return this.a;
    }

    private dm(String string2) {
        this.a = string2;
    }

    public String toString() {
        return this.a;
    }
}

