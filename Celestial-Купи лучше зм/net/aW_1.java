/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.a2;
import net.minecraft.J.B;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.ao;
import net.minecraft.client.w.j;
import net.q;

public class aW
extends a2 {
    public aW() {
        super(B.class, "spawner_minecart", 0.5f);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        ao ao2 = new ao(a42);
        String[] arrstring = I.c();
        boolean bl2 = cq.dj.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderMinecart.modelMinecart");
                return null;
            }
            bl2 = cq.a((Object)ao2, cq.dj, (Object)j2);
        }
        ao2.a = f10;
        return ao2;
    }
}

