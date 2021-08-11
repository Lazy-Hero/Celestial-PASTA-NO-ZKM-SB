/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.S;
import net.minecraft.client.F.b;
import net.minecraft.client.w.av;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class aO
extends I {
    @Override
    public j e() {
        return new av();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aO() {
        super(S.class, "shulker_box", 0.0f);
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof av)) {
                return null;
            }
            j3 = j2;
        }
        av av2 = (av)j3;
        boolean bl2 = string.equals("head");
        if (arrstring != null) {
            if (bl2) {
                return av2.i;
            }
            bl2 = string.equals("base");
        }
        if (arrstring != null) {
            if (bl2) {
                return av2.k;
            }
            bl2 = string.equals("lid");
        }
        return bl2 ? av2.j : null;
    }

    @Override
    public q a(j j2, float f10) {
        b b10 = b.e;
        net.minecraft.client.F.q q2 = b10.a(S.class);
        String[] arrstring = I.c();
        net.minecraft.client.F.q q3 = q2;
        if (arrstring != null) {
            if (!(q3 instanceof net.minecraft.client.F.q)) {
                return null;
            }
            q3 = q2;
        }
        if (q3.b() == null) {
            q2 = new net.minecraft.client.F.q((av)j2);
            q2.a(b10);
        }
        boolean bl2 = cq.dM.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntityShulkerBoxRenderer.model");
                return null;
            }
            bl2 = cq.a((Object)q2, cq.dM, (Object)j2);
        }
        return q2;
    }
}

