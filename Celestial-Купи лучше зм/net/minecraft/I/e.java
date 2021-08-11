/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.ar.aA;

class e {
    static final /* synthetic */ int[] a;

    static {
        a = new int[aA.values().length];
        try {
            e.a[aA.SOUTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e.a[aA.WEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e.a[aA.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            e.a[aA.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

