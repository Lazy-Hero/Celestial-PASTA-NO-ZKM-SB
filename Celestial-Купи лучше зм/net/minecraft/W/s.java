/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum s implements p
{
    COMPARE("compare"),
    SUBTRACT("subtract");

    private final /* synthetic */ String b;

    private s(String string2) {
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

