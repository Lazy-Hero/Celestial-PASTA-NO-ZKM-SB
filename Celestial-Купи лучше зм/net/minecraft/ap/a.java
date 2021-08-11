/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ap;

import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class a {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        a = new int[h.values().length];
        try {
            net.minecraft.ap.a.a[h.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.ap.a.a[h.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[ae.values().length];
        try {
            net.minecraft.ap.a.b[ae.COUNTERCLOCKWISE_90.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.ap.a.b[ae.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.ap.a.b[ae.CLOCKWISE_180.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.ap.a.b[ae.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

