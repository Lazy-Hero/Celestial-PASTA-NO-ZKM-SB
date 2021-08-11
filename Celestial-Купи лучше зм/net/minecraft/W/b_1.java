/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class b {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        a = new int[h.values().length];
        try {
            net.minecraft.W.b.a[h.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.W.b.a[h.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[ae.values().length];
        try {
            net.minecraft.W.b.b[ae.CLOCKWISE_180.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.W.b.b[ae.COUNTERCLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.W.b.b[ae.CLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

