/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.U.A;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.w.O;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ay
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new O();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        net.minecraft.client.r.q q2 = new net.minecraft.client.r.q(a42);
        String[] arrstring = I.c();
        boolean bl2 = cq.m.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderLeashKnot.leashKnotModel");
                return null;
            }
            bl2 = cq.a((Object)q2, cq.m, (Object)j2);
        }
        q2.a = f10;
        return q2;
    }

    public ay() {
        super(A.class, "lead_knot", 0.0f);
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof O)) {
                return null;
            }
            j3 = j2;
        }
        O o2 = (O)j3;
        return string.equals("knot") ? o2.i : null;
    }
}

