/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.a5;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aX;
import net.minecraft.client.w.aF;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aM
extends I {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aX aX2 = new aX(a42);
        aX2.i = j2;
        aX2.a = f10;
        return aX2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof aF)) {
                return null;
            }
            j3 = j2;
        }
        aF aF2 = (aF)j3;
        boolean bl2 = string.equals("mole");
        if (arrstring != null) {
            if (bl2) {
                return (c)cq.a(aF2, cq.bU);
            }
            bl2 = string.equals("hat");
        }
        if (arrstring != null) {
            if (bl2) {
                return (c)cq.a(aF2, cq.by);
            }
            bl2 = string.equals("head");
        }
        if (arrstring != null) {
            if (bl2) {
                return aF2.j;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return aF2.l;
            }
            bl2 = string.equals("arms");
        }
        if (arrstring != null) {
            if (bl2) {
                return aF2.m;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return aF2.n;
            }
            bl2 = string.equals("right_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return aF2.i;
            }
            bl2 = string.equals("nose");
        }
        return bl2 ? aF2.k : null;
    }

    @Override
    public j e() {
        return new aF(0.0f);
    }

    public aM() {
        super(a5.class, "witch", 0.5f);
    }
}

