/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum cU implements p
{
    DEFAULT("normal"),
    STICKY("sticky");

    private final /* synthetic */ String a;

    private cU(String string2) {
        this.a = string2;
    }

    public String toString() {
        return this.a;
    }

    @Override
    public String a() {
        return this.a;
    }
}

