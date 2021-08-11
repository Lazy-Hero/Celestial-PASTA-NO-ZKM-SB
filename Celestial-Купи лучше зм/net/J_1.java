/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.J.n;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.t;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.p;
import net.q;

public class J
extends I {
    @Override
    public j e() {
        return new p();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof p)) {
                return null;
            }
            j3 = j2;
        }
        p p2 = (p)j3;
        boolean bl2 = string.equals("right");
        if (arrstring != null) {
            if (bl2) {
                return p2.v;
            }
            bl2 = string.equals("left");
        }
        if (arrstring != null) {
            if (bl2) {
                return p2.u;
            }
            bl2 = string.equals("waist");
        }
        if (arrstring != null) {
            if (bl2) {
                return p2.t;
            }
            bl2 = string.equals("base");
        }
        return bl2 ? p2.s : null;
    }

    public J() {
        super(n.class, "armor_stand", 0.7f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        t t2 = new t(a42);
        t2.i = j2;
        t2.a = f10;
        return t2;
    }
}

