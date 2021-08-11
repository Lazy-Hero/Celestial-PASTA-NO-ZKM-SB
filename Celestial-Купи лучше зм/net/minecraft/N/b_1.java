/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.f;
import net.minecraft.ar.Q;

class b {
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        a = new int[Q.values().length];
        try {
            net.minecraft.N.b.a[Q.X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.N.b.a[Q.Y.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.N.b.a[Q.Z.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[f.values().length];
        try {
            net.minecraft.N.b.b[f.CLOSED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.N.b.b[f.OPENING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.N.b.b[f.CLOSING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.N.b.b[f.OPENED.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

