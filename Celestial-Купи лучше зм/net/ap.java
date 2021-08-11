/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.am;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aA;
import net.minecraft.client.w.aH;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ap
extends I {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aA aA2 = new aA(a42);
        aA2.i = j2;
        aA2.a = f10;
        return aA2;
    }

    public ap() {
        super(am.class, "spider", 1.0f);
    }

    @Override
    public j e() {
        return new aH();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof aH)) {
                return null;
            }
            j3 = j2;
        }
        aH aH2 = (aH)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return aH2.r;
            }
            bl2 = string.equals("neck");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.m;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.k;
            }
            bl2 = string.equals("leg1");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.q;
            }
            bl2 = string.equals("leg2");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.i;
            }
            bl2 = string.equals("leg3");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.l;
            }
            bl2 = string.equals("leg4");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.n;
            }
            bl2 = string.equals("leg5");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.s;
            }
            bl2 = string.equals("leg6");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.j;
            }
            bl2 = string.equals("leg7");
        }
        if (arrstring != null) {
            if (bl2) {
                return aH2.o;
            }
            bl2 = string.equals("leg8");
        }
        return bl2 ? aH2.p : null;
    }

    protected ap(Class class_, String string, float f10) {
        super(class_, string, f10);
    }
}

