/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.U;

import net.minecraft.B.X;
import net.minecraft.B.i;

class s {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        b = new int[X.values().length];
        try {
            s.b[X.HEAD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            s.b[X.CHEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            s.b[X.LEGS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            s.b[X.FEET.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[i.values().length];
        try {
            s.a[i.HAND.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            s.a[i.ARMOR.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

