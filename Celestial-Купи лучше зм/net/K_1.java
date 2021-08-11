/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.z;
import net.minecraft.client.F.b;
import net.minecraft.client.F.g;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.k;
import net.q;

public class K
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public q a(j j2, float f10) {
        b b10 = b.e;
        g g10 = b10.a(z.class);
        String[] arrstring = I.c();
        g g11 = g10;
        if (arrstring != null) {
            if (!(g11 instanceof g)) {
                return null;
            }
            g11 = g10;
        }
        if (g11.b() == null) {
            g10 = new g();
            g10.a(b10);
        }
        boolean bl2 = cq.cs.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntityBannerRenderer.bannerModel");
                return null;
            }
            bl2 = cq.a((Object)g10, cq.cs, (Object)j2);
        }
        return g10;
    }

    @Override
    public j e() {
        return new k();
    }

    public K() {
        super(z.class, "banner", 0.0f);
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof k)) {
                return null;
            }
            j3 = j2;
        }
        k k2 = (k)j3;
        boolean bl2 = string.equals("slate");
        if (arrstring != null) {
            if (bl2) {
                return k2.i;
            }
            bl2 = string.equals("stand");
        }
        if (arrstring != null) {
            if (bl2) {
                return k2.k;
            }
            bl2 = string.equals("top");
        }
        return bl2 ? k2.j : null;
    }
}

