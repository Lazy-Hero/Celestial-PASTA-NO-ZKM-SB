/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.O;
import net.minecraft.client.F.b;
import net.minecraft.client.w.A;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.z;
import net.q;

public class au
extends I {
    public au() {
        super(O.class, "chest_large", 0.0f);
    }

    @Override
    public j e() {
        return new A();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        b b10 = b.e;
        net.minecraft.client.F.j j3 = b10.a(O.class);
        String[] arrstring = I.c();
        net.minecraft.client.F.j j4 = j3;
        if (arrstring != null) {
            if (!(j4 instanceof net.minecraft.client.F.j)) {
                return null;
            }
            j4 = j3;
        }
        if (j4.b() == null) {
            j3 = new net.minecraft.client.F.j();
            j3.a(b10);
        }
        boolean bl2 = cq.c8.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntityChestRenderer.largeChest");
                return null;
            }
            bl2 = cq.a((Object)j3, cq.c8, (Object)j2);
        }
        return j3;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof z)) {
                return null;
            }
            j3 = j2;
        }
        z z2 = (z)j3;
        boolean bl2 = string.equals("lid");
        if (arrstring != null) {
            if (bl2) {
                return z2.i;
            }
            bl2 = string.equals("base");
        }
        if (arrstring != null) {
            if (bl2) {
                return z2.k;
            }
            bl2 = string.equals("knob");
        }
        return bl2 ? z2.j : null;
    }
}

