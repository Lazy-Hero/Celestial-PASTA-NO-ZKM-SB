/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.w.M;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public abstract class ao
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    public ao(Class class_, String string, float f10) {
        super(class_, string, f10);
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof M)) {
                return null;
            }
            j3 = j2;
        }
        M m2 = (M)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return m2.j;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.k;
            }
            bl2 = string.equals("arms");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.i;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.l;
            }
            bl2 = string.equals("right_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.m;
            }
            bl2 = string.equals("nose");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.p;
            }
            bl2 = string.equals("left_arm");
        }
        if (arrstring != null) {
            if (bl2) {
                return m2.q;
            }
            bl2 = string.equals("right_arm");
        }
        return bl2 ? m2.o : null;
    }
}

