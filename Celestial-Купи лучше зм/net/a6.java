/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.aE;
import net.minecraft.J.p;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.i;
import net.minecraft.client.w.G;
import net.minecraft.client.w.j;
import net.q;

public class a6
extends aE {
    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        b b10 = a42.c().get(p.class);
        String[] arrstring = I.c();
        b b11 = b10;
        if (arrstring != null) {
            if (!(b11 instanceof i)) {
                fU.h("Not an instance of RenderEnderCrystal: " + b10);
                return null;
            }
            b11 = b10;
        }
        i i2 = (i)b11;
        boolean bl2 = cq.bI.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderEnderCrystal.modelEnderCrystalNoBase");
                return null;
            }
            bl2 = cq.a((Object)i2, cq.bI, (Object)j2);
        }
        i2.a = f10;
        return i2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new G(0.0f, false);
    }

    public a6() {
        super("end_crystal_no_base");
    }
}

