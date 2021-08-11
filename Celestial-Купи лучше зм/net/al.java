/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.H;
import net.minecraft.client.F.b;
import net.minecraft.client.F.n;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.z;
import net.q;

public class al
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new z();
    }

    public al() {
        super(H.class, "ender_chest", 0.0f);
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

    @Override
    public q a(j j2, float f10) {
        b b10 = b.e;
        n n2 = b10.a(H.class);
        String[] arrstring = I.c();
        n n3 = n2;
        if (arrstring != null) {
            if (!(n3 instanceof n)) {
                return null;
            }
            n3 = n2;
        }
        if (n3.b() == null) {
            n2 = new n();
            n2.a(b10);
        }
        boolean bl2 = cq.dl.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntityEnderChestRenderer.modelChest");
                return null;
            }
            bl2 = cq.a((Object)n2, cq.dl, (Object)j2);
        }
        return n2;
    }
}

