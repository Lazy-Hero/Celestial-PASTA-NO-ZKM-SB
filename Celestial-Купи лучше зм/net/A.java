/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.e;

class A {
    static final /* synthetic */ int[] a;

    static {
        a = new int[e.values().length];
        try {
            A.a[e.CONSTANT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.a[e.IDENTIFIER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.a[e.BRACKET_OPEN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            A.a[e.OPERATOR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

