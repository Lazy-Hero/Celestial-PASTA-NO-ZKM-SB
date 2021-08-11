/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.a6;
import net.minecraft.client.w.aC;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ai
extends I {
    public ai() {
        super(net.minecraft.T.ai.class, "slime", 0.25f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        a6 a62 = new a6(a42);
        a62.i = j2;
        a62.a = f10;
        return a62;
    }

    @Override
    public j e() {
        return new aC(16);
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
        block11: {
            boolean bl2;
            aC aC2;
            block10: {
                String[] arrstring = I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof aC)) {
                        return null;
                    }
                    j3 = j2;
                }
                aC2 = (aC)j3;
                bl2 = string.equals("body");
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)aC2, cq.b1, 0);
                    }
                    bl2 = string.equals("left_eye");
                }
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)aC2, cq.b1, 1);
                    }
                    bl2 = string.equals("right_eye");
                }
                if (arrstring == null) break block10;
                if (bl2) {
                    return (c)cq.a((Object)aC2, cq.b1, 2);
                }
                object = string;
                if (arrstring == null) break block11;
                bl2 = ((String)object).equals("mouth");
            }
            if (!bl2) return null;
            object = cq.a((Object)aC2, cq.b1, 3);
        }
        c c10 = (c)object;
        return c10;
    }
}

