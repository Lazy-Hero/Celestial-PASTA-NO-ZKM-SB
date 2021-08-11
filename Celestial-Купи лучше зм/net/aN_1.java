/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aV;
import net.minecraft.client.w.al;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aN
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new al();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        String[] arrstring = I.c();
        aV aV2 = new aV(a42);
        boolean bl2 = cq.O.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderShulkerBullet.model");
                return null;
            }
            bl2 = cq.a((Object)aV2, cq.O, (Object)j2);
        }
        aV2.a = f10;
        return aV2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof al)) {
                return null;
            }
            j3 = j2;
        }
        al al2 = (al)j3;
        return string.equals("bullet") ? al2.i : null;
    }

    public aN() {
        super(net.minecraft.z.q.class, "shulker_bullet", 0.0f);
    }
}

