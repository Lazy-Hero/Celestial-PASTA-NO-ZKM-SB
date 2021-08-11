/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.ag.Y;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.w;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.l;
import net.q;

public class L
extends I {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        w w2 = new w(a42);
        w2.i = j2;
        w2.a = f10;
        return w2;
    }

    @Override
    public j e() {
        return new l();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block15: {
            boolean bl2;
            l l2;
            block14: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof l)) {
                        return null;
                    }
                    j3 = j2;
                }
                l2 = (l)j3;
                bl2 = string.equals("head");
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)l2, cq.a3, 0);
                    }
                    bl2 = string.equals("body");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)l2, cq.a3, 1);
                    }
                    bl2 = string.equals("right_wing");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)l2, cq.a3, 2);
                    }
                    bl2 = string.equals("left_wing");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)l2, cq.a3, 3);
                    }
                    bl2 = string.equals("outer_right_wing");
                }
                if (arrstring == null) break block14;
                if (bl2) {
                    return (c)cq.a((Object)l2, cq.a3, 4);
                }
                object = string;
                if (arrstring == null) break block15;
                bl2 = ((String)object).equals("outer_left_wing");
            }
            if (!bl2) return null;
            object = cq.a((Object)l2, cq.a3, 5);
        }
        c c10 = (c)object;
        return c10;
    }

    public L() {
        super(Y.class, "bat", 0.25f);
    }
}

