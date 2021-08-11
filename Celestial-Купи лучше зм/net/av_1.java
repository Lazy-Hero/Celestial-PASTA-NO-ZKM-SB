/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.K;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.D;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.h.d;
import net.q;

public class av
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    public av() {
        super(d.class, "dragon", 0.5f);
    }

    @Override
    public j e() {
        return new D(0.0f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        K k2 = new K(a42);
        k2.i = j2;
        k2.a = f10;
        return k2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block27: {
            boolean bl2;
            D d10;
            block26: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof D)) {
                        return null;
                    }
                    j3 = j2;
                }
                d10 = (D)j3;
                bl2 = string.equals("head");
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 0);
                    }
                    bl2 = string.equals("spine");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 1);
                    }
                    bl2 = string.equals("jaw");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 2);
                    }
                    bl2 = string.equals("body");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 3);
                    }
                    bl2 = string.equals("rear_leg");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 4);
                    }
                    bl2 = string.equals("front_leg");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 5);
                    }
                    bl2 = string.equals("rear_leg_tip");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 6);
                    }
                    bl2 = string.equals("front_leg_tip");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 7);
                    }
                    bl2 = string.equals("rear_foot");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 8);
                    }
                    bl2 = string.equals("front_foot");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)d10, cq.aV, 9);
                    }
                    bl2 = string.equals("wing");
                }
                if (arrstring == null) break block26;
                if (bl2) {
                    return (c)cq.a((Object)d10, cq.aV, 10);
                }
                object = string;
                if (arrstring == null) break block27;
                bl2 = ((String)object).equals("wing_tip");
            }
            if (!bl2) return null;
            object = cq.a((Object)d10, cq.aV, 11);
        }
        c c10 = (c)object;
        return c10;
    }
}

