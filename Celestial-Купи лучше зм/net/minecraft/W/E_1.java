/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.p;

public enum E implements p
{
    LEFT,
    RIGHT;


    @Override
    public String a() {
        return this == LEFT ? "left" : "right";
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return this.a();
    }
}

