/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.ar.ae;

class q {
    static final /* synthetic */ int[] a;

    static {
        a = new int[ae.values().length];
        try {
            q.a[ae.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            q.a[ae.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            q.a[ae.CLOCKWISE_180.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            q.a[ae.COUNTERCLOCKWISE_90.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

