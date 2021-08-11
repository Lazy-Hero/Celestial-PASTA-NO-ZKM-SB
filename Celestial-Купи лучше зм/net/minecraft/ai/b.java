/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ai;

import net.minecraft.C.p;

class b {
    static final /* synthetic */ int[] a;

    static {
        a = new int[p.values().length];
        try {
            b.a[p.LOGIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            b.a[p.STATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

