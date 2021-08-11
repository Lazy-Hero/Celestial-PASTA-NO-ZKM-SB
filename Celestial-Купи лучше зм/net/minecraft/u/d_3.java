/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.ar.ae;

class d {
    static final /* synthetic */ int[] a;

    static {
        a = new int[ae.values().length];
        try {
            d.a[ae.CLOCKWISE_180.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            d.a[ae.COUNTERCLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            d.a[ae.CLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

