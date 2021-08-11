/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.ar.aA;

class o {
    static final /* synthetic */ int[] a;

    static {
        a = new int[aA.values().length];
        try {
            o.a[aA.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o.a[aA.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o.a[aA.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            o.a[aA.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

