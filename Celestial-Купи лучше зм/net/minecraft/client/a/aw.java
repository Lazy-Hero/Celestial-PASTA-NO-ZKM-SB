/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.ar.aW;

class aw {
    static final /* synthetic */ int[] a;

    static {
        a = new int[aW.values().length];
        try {
            aw.a[aW.MODEL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aw.a[aW.ENTITYBLOCK_ANIMATED.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            aw.a[aW.LIQUID.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

