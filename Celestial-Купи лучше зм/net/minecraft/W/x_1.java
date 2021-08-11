/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.dG;
import net.minecraft.ar.Q;
import net.minecraft.ar.ae;

class x {
    static final /* synthetic */ int[] a;
    static final /* synthetic */ int[] c;
    static final /* synthetic */ int[] b;

    static {
        b = new int[ae.values().length];
        try {
            x.b[ae.COUNTERCLOCKWISE_90.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            x.b[ae.CLOCKWISE_90.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[dG.values().length];
        try {
            x.a[dG.LINES_X.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            x.a[dG.LINES_Z.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        c = new int[Q.values().length];
        try {
            x.c[Q.Z.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            x.c[Q.X.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            x.c[Q.Y.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

