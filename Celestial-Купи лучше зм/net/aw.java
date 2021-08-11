/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aR;
import net.minecraft.client.Q;
import net.minecraft.client.r.J;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.C;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aw
extends I {
    public aw() {
        super(aR.class, "creeper", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        J j3 = new J(a42);
        j3.i = j2;
        j3.a = f10;
        return j3;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof C)) {
                return null;
            }
            j3 = j2;
        }
        C c10 = (C)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return c10.m;
            }
            bl2 = string.equals("armor");
        }
        if (arrstring != null) {
            if (bl2) {
                return c10.o;
            }
            bl2 = string.equals("body");
        }
        if (arrstring != null) {
            if (bl2) {
                return c10.l;
            }
            bl2 = string.equals("leg1");
        }
        if (arrstring != null) {
            if (bl2) {
                return c10.j;
            }
            bl2 = string.equals("leg2");
        }
        if (arrstring != null) {
            if (bl2) {
                return c10.k;
            }
            bl2 = string.equals("leg3");
        }
        if (arrstring != null) {
            if (bl2) {
                return c10.i;
            }
            bl2 = string.equals("leg4");
        }
        return bl2 ? c10.n : null;
    }

    @Override
    public j e() {
        return new C();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

