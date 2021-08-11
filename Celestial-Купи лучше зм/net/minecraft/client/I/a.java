/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import net.minecraft.N.r;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;

class a {
    static final /* synthetic */ int[] c;
    static final /* synthetic */ int[] b;
    static final /* synthetic */ int[] a;

    static {
        c = new int[r.values().length];
        try {
            net.minecraft.client.I.a.c[r.SAVE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.c[r.LOAD.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.c[r.CORNER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.c[r.DATA.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        b = new int[ae.values().length];
        try {
            net.minecraft.client.I.a.b[ae.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.b[ae.CLOCKWISE_180.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.b[ae.COUNTERCLOCKWISE_90.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.b[ae.CLOCKWISE_90.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        a = new int[h.values().length];
        try {
            net.minecraft.client.I.a.a[h.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.a[h.LEFT_RIGHT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            net.minecraft.client.I.a.a[h.FRONT_BACK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

