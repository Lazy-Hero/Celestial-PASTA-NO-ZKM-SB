/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.ad;
import net.minecraft.client.r.W;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.Q;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ak
extends I {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        c[] arrc;
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof Q)) {
                return null;
            }
            j3 = j2;
        }
        Q q2 = (Q)j3;
        String string2 = string;
        if (arrstring != null) {
            if (string2.equals("core")) {
                return (c)cq.a(q2, cq.b6);
            }
            string2 = "segment";
        }
        String string3 = string2;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string3)) return null;
            object = cq.a(q2, cq.C);
        }
        if ((arrc = (c[])object) == null) {
            return null;
        }
        String string4 = string.substring(string3.length());
        int n2 = fU.b(string4, -1);
        int n3 = --n2;
        if (arrstring != null) {
            if (n3 < 0) return null;
            n3 = n2;
        }
        if (n3 >= arrc.length) return null;
        c c10 = arrc[n2];
        return c10;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = net.minecraft.client.Q.P().aQ();
        W w2 = new W(a42);
        w2.i = j2;
        w2.a = f10;
        return w2;
    }

    @Override
    public j e() {
        return new Q();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public ak() {
        super(ad.class, "magma_cube", 0.5f);
    }
}

