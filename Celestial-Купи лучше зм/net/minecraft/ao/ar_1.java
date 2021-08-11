/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class ar {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        b = new int[h.values().length];
        try {
            ar.b[h.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ar.b[h.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ar.b[h.LEFT_RIGHT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[ae.values().length];
        try {
            ar.a[ae.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ar.a[ae.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ar.a[ae.COUNTERCLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            ar.a[ae.CLOCKWISE_180.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

