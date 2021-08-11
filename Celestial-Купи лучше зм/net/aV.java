/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aX;
import net.minecraft.client.Q;
import net.minecraft.client.r.U;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.N;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aV
extends I {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        U u2 = new U(a42);
        u2.i = j2;
        u2.a = f10;
        return u2;
    }

    @Override
    public j e() {
        return new N();
    }

    public aV() {
        super(aX.class, "iron_golem", 0.5f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof N)) {
                return null;
            }
            j3 = j2;
        }
        N n2 = (N)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return n2.i;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.k;
            }
            bl2 = string.equals("left_arm");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.j;
            }
            bl2 = string.equals("right_arm");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.m;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return n2.n;
            }
            bl2 = string.equals("right_leg");
        }
        return bl2 ? n2.l : null;
    }
}

