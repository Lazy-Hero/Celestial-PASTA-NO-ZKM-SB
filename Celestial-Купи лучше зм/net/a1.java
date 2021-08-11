/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.ag.L;
import net.minecraft.client.Q;
import net.minecraft.client.r.H;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.B;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a1
extends I {
    @Override
    public j e() {
        return new B();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        H h2 = new H(a42);
        h2.i = j2;
        h2.a = f10;
        return h2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof B)) {
                return null;
            }
            j3 = j2;
        }
        B b10 = (B)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return b10.k;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.i;
            }
            bl2 = string.equals("right_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.p;
            }
            bl2 = string.equals("left_leg");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.l;
            }
            bl2 = string.equals("right_wing");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.j;
            }
            bl2 = string.equals("left_wing");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.m;
            }
            bl2 = string.equals("bill");
        }
        if (arrstring != null) {
            if (bl2) {
                return b10.o;
            }
            bl2 = string.equals("chin");
        }
        return bl2 ? b10.n : null;
    }

    public a1() {
        super(L.class, "chicken", 0.3f);
    }
}

