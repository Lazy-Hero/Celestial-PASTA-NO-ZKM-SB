/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum dV implements p
{
    HEAD("head"),
    FOOT("foot");

    private final /* synthetic */ String b;

    public String toString() {
        return this.b;
    }

    @Override
    public String a() {
        return this.b;
    }

    private dV(String string2) {
        this.b = string2;
    }
}

