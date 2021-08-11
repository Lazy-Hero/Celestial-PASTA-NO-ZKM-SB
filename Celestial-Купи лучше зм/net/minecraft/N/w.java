/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.ar.aA;

class w {
    static final /* synthetic */ int[] a;

    static {
        a = new int[aA.values().length];
        try {
            w.a[aA.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w.a[aA.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w.a[aA.EAST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            w.a[aA.WEST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

