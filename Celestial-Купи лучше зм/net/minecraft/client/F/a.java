/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class a {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] b;

    static {
        a = new int[ae.values().length];
        try {
            net.minecraft.client.F.a.a[ae.CLOCKWISE_90.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.F.a.a[ae.CLOCKWISE_180.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.F.a.a[ae.COUNTERCLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[h.values().length];
        try {
            net.minecraft.client.F.a.b[h.LEFT_RIGHT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.F.a.b[h.FRONT_BACK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

