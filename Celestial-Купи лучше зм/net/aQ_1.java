/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.ag.V;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.an;
import net.minecraft.client.w.ae;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aQ
extends I {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        an an2 = new an(a42);
        an2.i = j2;
        an2.a = f10;
        return an2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new ae();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block19: {
            boolean bl2;
            ae ae2;
            block18: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof ae)) {
                        return null;
                    }
                    j3 = j2;
                }
                ae2 = (ae)j3;
                bl2 = string.equals("head");
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.m;
                    }
                    bl2 = string.equals("body");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.p;
                    }
                    bl2 = string.equals("leg1");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.o;
                    }
                    bl2 = string.equals("leg2");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.n;
                    }
                    bl2 = string.equals("leg3");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.j;
                    }
                    bl2 = string.equals("leg4");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return ae2.i;
                    }
                    bl2 = string.equals("tail");
                }
                if (arrstring == null) break block18;
                if (bl2) {
                    return (c)cq.a(ae2, cq.c5);
                }
                object = string;
                if (arrstring == null) break block19;
                bl2 = ((String)object).equals("mane");
            }
            if (!bl2) return null;
            object = cq.a(ae2, cq.bV);
        }
        c c10 = (c)object;
        return c10;
    }

    public aQ() {
        super(V.class, "wolf", 0.5f);
    }
}

