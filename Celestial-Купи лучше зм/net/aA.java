/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.l;
import net.minecraft.client.w.I;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.z.i;
import net.q;

public class aA
extends net.I {
    public aA() {
        super(i.class, "evocation_fangs", 0.0f);
    }

    @Override
    public j e() {
        return new I();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(j j2, String string) {
        Object object;
        block9: {
            boolean bl2;
            I i2;
            block8: {
                String[] arrstring = net.I.c();
                j j3 = j2;
                if (arrstring != null) {
                    if (!(j3 instanceof I)) {
                        return null;
                    }
                    j3 = j2;
                }
                i2 = (I)j3;
                bl2 = string.equals("base");
                if (arrstring != null) {
                    if (bl2) {
                        return (c)cq.a((Object)i2, cq.cu, 0);
                    }
                    bl2 = string.equals("upper_jaw");
                }
                if (arrstring == null) break block8;
                if (bl2) {
                    return (c)cq.a((Object)i2, cq.cu, 1);
                }
                object = string;
                if (arrstring == null) break block9;
                bl2 = ((String)object).equals("lower_jaw");
            }
            if (!bl2) return null;
            object = cq.a((Object)i2, cq.cu, 2);
        }
        c c10 = (c)object;
        return c10;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        String[] arrstring = net.I.c();
        l l2 = new l(a42);
        boolean bl2 = cq.aZ.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderEvokerFangs.model");
                return null;
            }
            bl2 = cq.a((Object)l2, cq.aZ, (Object)j2);
        }
        l2.a = f10;
        return l2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

