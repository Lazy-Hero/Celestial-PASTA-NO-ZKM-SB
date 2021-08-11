/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.w.U;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public abstract class aq
extends I {
    public aq(Class class_, String string, float f10) {
        super(class_, string, f10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof U)) {
                return null;
            }
            j3 = j2;
        }
        U u2 = (U)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return u2.o;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return u2.m;
            }
            bl2 = string.equals("leg1");
        }
        if (arrstring != null) {
            if (bl2) {
                return u2.p;
            }
            bl2 = string.equals("leg2");
        }
        if (arrstring != null) {
            if (bl2) {
                return u2.k;
            }
            bl2 = string.equals("leg3");
        }
        if (arrstring != null) {
            if (bl2) {
                return u2.n;
            }
            bl2 = string.equals("leg4");
        }
        return bl2 ? u2.l : null;
    }
}

