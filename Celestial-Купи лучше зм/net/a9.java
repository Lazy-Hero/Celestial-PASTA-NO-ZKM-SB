/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aq;
import net.minecraft.client.Q;
import net.minecraft.client.r.M;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.H;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a9
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

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
            if (!(j3 instanceof H)) {
                return null;
            }
            j3 = j2;
        }
        H h2 = (H)j3;
        String string2 = "body";
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string2)) return null;
            object = cq.a(h2, cq.d8);
        }
        if ((arrc = (c[])object) == null) {
            return null;
        }
        String string3 = string.substring(string2.length());
        int n2 = fU.b(string3, -1);
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
        a4 a42 = Q.P().aQ();
        M m2 = new M(a42);
        m2.i = j2;
        m2.a = f10;
        return m2;
    }

    @Override
    public j e() {
        return new H();
    }

    public a9() {
        super(aq.class, "endermite", 0.3f);
    }
}

