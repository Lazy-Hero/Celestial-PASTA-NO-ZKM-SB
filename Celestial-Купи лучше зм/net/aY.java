/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aF;
import net.minecraft.client.w.an;
import net.minecraft.client.w.j;
import net.minecraft.h.c;
import net.q;

public class aY
extends I {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.client.w.c a(j j2, String string) {
        net.minecraft.client.w.c[] arrc;
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof an)) {
                return null;
            }
            j3 = j2;
        }
        an an2 = (an)j3;
        String string2 = "body";
        String string3 = string;
        if (arrstring != null) {
            if (string3.startsWith(string2)) {
                net.minecraft.client.w.c[] arrc2 = (net.minecraft.client.w.c[])cq.a(an2, cq.dK);
                if (arrc2 == null) {
                    return null;
                }
                String string4 = string.substring(string2.length());
                int n2 = fU.b(string4, -1);
                int n3 = --n2;
                if (arrstring != null) {
                    if (n3 < 0) return null;
                    n3 = n2;
                }
                if (n3 >= arrc2.length) return null;
                net.minecraft.client.w.c c10 = arrc2[n2];
                return c10;
            }
            string3 = "head";
        }
        String string5 = string3;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string5)) return null;
            object = cq.a(an2, cq.dc);
        }
        if ((arrc = (net.minecraft.client.w.c[])object) == null) {
            return null;
        }
        String string6 = string.substring(string5.length());
        int n4 = fU.b(string6, -1);
        int n5 = --n4;
        if (arrstring != null) {
            if (n5 < 0) return null;
            n5 = n4;
        }
        if (n5 >= arrc.length) return null;
        net.minecraft.client.w.c c11 = arrc[n4];
        return c11;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aF aF2 = new aF(a42);
        aF2.i = j2;
        aF2.a = f10;
        return aF2;
    }

    public aY() {
        super(c.class, "wither", 0.5f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new an(0.0f);
    }
}

