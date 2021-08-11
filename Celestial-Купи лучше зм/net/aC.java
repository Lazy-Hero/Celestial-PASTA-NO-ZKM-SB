/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aZ;
import net.minecraft.client.Q;
import net.minecraft.client.r.O;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.J;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aC
extends I {
    @Override
    public j e() {
        return new J();
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
            if (!(j3 instanceof J)) {
                return null;
            }
            j3 = j2;
        }
        J j4 = (J)j3;
        String string2 = string;
        if (arrstring != null) {
            if (string2.equals("body")) {
                return (c)cq.a(j4, cq.b5);
            }
            string2 = "tentacle";
        }
        String string3 = string2;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string3)) return null;
            object = cq.a(j4, cq.am);
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
        a4 a42 = Q.P().aQ();
        O o2 = new O(a42);
        o2.i = j2;
        o2.a = f10;
        return o2;
    }

    public aC() {
        super(aZ.class, "ghast", 0.5f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

