/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ac.b;
import net.minecraft.ar.aA;

class cp {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        a = new int[net.minecraft.ac.b.values().length];
        try {
            cp.a[net.minecraft.ac.b.BLOCK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.a[net.minecraft.ac.b.DESTROY.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.a[net.minecraft.ac.b.PUSH_ONLY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[aA.values().length];
        try {
            cp.b[aA.DOWN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.b[aA.UP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.b[aA.NORTH.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.b[aA.SOUTH.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.b[aA.WEST.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            cp.b[aA.EAST.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

