/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class A {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        a = new int[h.values().length];
        try {
            A.a[h.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.a[h.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[ae.values().length];
        try {
            A.b[ae.CLOCKWISE_180.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.b[ae.COUNTERCLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.b[ae.CLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

