/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.ag.au;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aa;
import net.minecraft.client.w.a7;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aK
extends I {
    @Override
    public j e() {
        return new a7();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aa aa2 = new aa(a42);
        aa2.i = j2;
        aa2.a = f10;
        return aa2;
    }

    public aK() {
        super(au.class, "squid", 0.7f);
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
            if (!(j3 instanceof a7)) {
                return null;
            }
            j3 = j2;
        }
        a7 a72 = (a7)j3;
        String string2 = string;
        if (arrstring != null) {
            if (string2.equals("body")) {
                return (c)cq.a(a72, cq.X);
            }
            string2 = "tentacle";
        }
        String string3 = string2;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string3)) return null;
            object = cq.a(a72, cq.bB);
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
}

