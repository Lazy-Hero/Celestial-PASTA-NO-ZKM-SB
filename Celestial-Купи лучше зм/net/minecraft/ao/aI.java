/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ao.aQ;
import net.minecraft.ar.aA;

class aI {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        a = new int[aQ.values().length];
        try {
            aI.a[aQ.NORMAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aI.a[aQ.MESA.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[aA.values().length];
        try {
            aI.b[aA.NORTH.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aI.b[aA.SOUTH.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aI.b[aA.WEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aI.b[aA.EAST.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

