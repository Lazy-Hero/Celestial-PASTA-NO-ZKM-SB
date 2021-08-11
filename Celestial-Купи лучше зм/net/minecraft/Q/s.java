/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import net.minecraft.Q.B;

class s {
    static final /* synthetic */ int[] a;

    static {
        a = new int[B.values().length];
        try {
            s.a[B.END_COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            s.a[B.ENTITY_DIED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

