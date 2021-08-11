/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import net.minecraft.U.k;

class E {
    static final /* synthetic */ int[] a;

    static {
        a = new int[k.values().length];
        try {
            E.a[k.MONSTER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            E.a[k.CREATURE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            E.a[k.WATER_CREATURE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            E.a[k.AMBIENT.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

