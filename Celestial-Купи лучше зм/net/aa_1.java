/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.a0;
import net.minecraft.client.r.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.K;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aa
extends I {
    public aa() {
        super(a0.class, "guardian", 0.5f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        c[] arrc;
        String string2;
        K k2;
        String[] arrstring;
        block15: {
            boolean bl2;
            block14: {
                arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof K)) {
                        return null;
                    }
                    j3 = j2;
                }
                k2 = (K)j3;
                bl2 = string.equals("body");
                if (arrstring == null) break block14;
                if (bl2) {
                    return (c)cq.a(k2, cq.dk);
                }
                string2 = string;
                if (arrstring == null) break block15;
                bl2 = string2.equals("eye");
            }
            if (bl2) {
                return (c)cq.a(k2, cq.aR);
            }
            string2 = "spine";
        }
        String string3 = string2;
        String string4 = string;
        if (arrstring != null) {
            if (string4.startsWith(string3)) {
                c[] arrc2 = (c[])cq.a(k2, cq.bl);
                if (arrc2 == null) {
                    return null;
                }
                String string5 = string.substring(string3.length());
                int n2 = fU.b(string5, -1);
                int n3 = --n2;
                if (arrstring != null) {
                    if (n3 < 0) return null;
                    n3 = n2;
                }
                if (n3 >= arrc2.length) return null;
                c c10 = arrc2[n2];
                return c10;
            }
            string4 = "tail";
        }
        String string6 = string4;
        Object object = string;
        if (arrstring != null) {
            if (!((String)object).startsWith(string6)) return null;
            object = cq.a(k2, cq.aj);
        }
        if ((arrc = (c[])object) == null) {
            return null;
        }
        String string7 = string.substring(string6.length());
        int n4 = fU.b(string7, -1);
        int n5 = --n4;
        if (arrstring != null) {
            if (n5 < 0) return null;
            n5 = n4;
        }
        if (n5 >= arrc.length) return null;
        c c11 = arrc[n4];
        return c11;
    }

    @Override
    public j e() {
        return new K();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = net.minecraft.client.Q.P().aQ();
        Q q2 = new Q(a42);
        q2.i = j2;
        q2.a = f10;
        return q2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

