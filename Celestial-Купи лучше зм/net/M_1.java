/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.n;

public abstract class M
extends I {
    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof n)) {
                return null;
            }
            j3 = j2;
        }
        n n2 = (n)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return n2.n;
            }
            bl2 = string.equals("headwear");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.q;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.j;
            }
            bl2 = string.equals("left_arm");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.k;
            }
            bl2 = string.equals("right_arm");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.o;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.m;
            }
            bl2 = string.equals("right_leg");
        }
        return bl2 ? n2.i : null;
    }

    public M(Class class_, String string, float f10) {
        super(class_, string, f10);
    }
}

