/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aW;
import net.minecraft.client.Q;
import net.minecraft.client.r.G;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.w;
import net.q;

public class W
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
            if (!(j3 instanceof w)) {
                return null;
            }
            j3 = j2;
        }
        w w2 = (w)j3;
        String string2 = string;
        if (arrstring != null) {
            if (string2.equals("head")) {
                return (c)cq.a(w2, cq.d7);
            }
            string2 = "stick";
        }
        String string3 = string2;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string3)) return null;
            object = cq.a(w2, cq.cb);
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

    public W() {
        super(aW.class, "blaze", 0.5f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        G g10 = new G(a42);
        g10.i = j2;
        g10.a = f10;
        return g10;
    }

    @Override
    public j e() {
        return new w();
    }
}

