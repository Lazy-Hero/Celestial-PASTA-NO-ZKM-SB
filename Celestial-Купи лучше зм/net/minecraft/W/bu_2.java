/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.da;

class bu {
    static final /* synthetic */ int[] a;

    static {
        a = new int[da.values().length];
        try {
            bu.a[da.DIRT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            bu.a[da.COARSE_DIRT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

