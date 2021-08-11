/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.a2;
import net.minecraft.J.C;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aD;
import net.minecraft.client.w.j;
import net.q;

public class aR
extends a2 {
    public aR() {
        super(C.class, "tnt_minecart", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        aD aD2 = new aD(a42);
        String[] arrstring = I.c();
        boolean bl2 = cq.dj.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderMinecart.modelMinecart");
                return null;
            }
            bl2 = cq.a((Object)aD2, cq.dj, (Object)j2);
        }
        aD2.a = f10;
        return aD2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

