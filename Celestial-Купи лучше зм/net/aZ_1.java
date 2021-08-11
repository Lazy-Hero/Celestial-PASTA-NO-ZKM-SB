/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.a3;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aE;
import net.minecraft.client.w.a6;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aZ
extends I {
    @Override
    public j e() {
        return new a6();
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
            if (!(j3 instanceof a6)) {
                return null;
            }
            j3 = j2;
        }
        a6 a62 = (a6)j3;
        String string2 = "body";
        String string3 = string;
        if (arrstring != null) {
            if (string3.startsWith(string2)) {
                c[] arrc2 = (c[])cq.a(a62, cq.cW);
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
                c c10 = arrc2[n2];
                return c10;
            }
            string3 = "wing";
        }
        String string5 = string3;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string5)) return null;
            object = cq.a(a62, cq.c0);
        }
        if ((arrc = (c[])object) == null) {
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
        c c11 = arrc[n4];
        return c11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aE aE2 = new aE(a42);
        aE2.i = j2;
        aE2.a = f10;
        return aE2;
    }

    public aZ() {
        super(a3.class, "silverfish", 0.3f);
    }
}

