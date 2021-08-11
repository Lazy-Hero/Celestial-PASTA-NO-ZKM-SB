/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.aA;

class dD {
    static final /* synthetic */ int[] a;

    static {
        a = new int[aA.values().length];
        try {
            dD.a[aA.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dD.a[aA.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dD.a[aA.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            dD.a[aA.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

