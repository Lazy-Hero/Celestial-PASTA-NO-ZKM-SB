/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.h;

class an {
    static final /* synthetic */ int[] a;

    static {
        a = new int[h.values().length];
        try {
            an.a[h.FRONT_BACK.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            an.a[h.LEFT_RIGHT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

