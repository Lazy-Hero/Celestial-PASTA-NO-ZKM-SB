/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum dC implements p
{
    STRAIGHT("straight"),
    INNER_LEFT("inner_left"),
    INNER_RIGHT("inner_right"),
    OUTER_LEFT("outer_left"),
    OUTER_RIGHT("outer_right");

    private final /* synthetic */ String b;

    private dC(String string2) {
        this.b = string2;
    }

    @Override
    public String a() {
        return this.b;
    }

    public String toString() {
        return this.b;
    }
}

