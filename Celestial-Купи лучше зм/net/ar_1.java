/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.ag.W;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aH;
import net.minecraft.client.w.aX;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ar
extends I {
    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof aX)) {
                return null;
            }
            j3 = j2;
        }
        aX aX2 = (aX)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return aX2.j;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return aX2.l;
            }
            bl2 = string.equals("arms");
        }
        if (arrstring != null) {
            if (bl2) {
                return aX2.m;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return aX2.n;
            }
            bl2 = string.equals("right_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return aX2.i;
            }
            bl2 = string.equals("nose");
        }
        return bl2 ? aX2.k : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new aX(0.0f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aH aH2 = new aH(a42);
        aH2.i = j2;
        aH2.a = f10;
        return aH2;
    }

    public ar() {
        super(W.class, "villager", 0.5f);
    }
}

