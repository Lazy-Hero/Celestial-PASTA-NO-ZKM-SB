/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.W;
import net.minecraft.client.F.b;
import net.minecraft.client.F.r;
import net.minecraft.client.w.aE;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ag
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public j e() {
        return new aE();
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof aE)) {
                return null;
            }
            j3 = j2;
        }
        aE aE2 = (aE)j3;
        boolean bl2 = string.equals("board");
        if (arrstring != null) {
            if (bl2) {
                return aE2.j;
            }
            bl2 = string.equals("stick");
        }
        return bl2 ? aE2.i : null;
    }

    public ag() {
        super(W.class, "sign", 0.0f);
    }

    @Override
    public q a(j j2, float f10) {
        r r2;
        b b10 = b.e;
        String[] arrstring = I.c();
        r r3 = r2 = b10.a(W.class);
        if (arrstring != null) {
            if (!(r3 instanceof r)) {
                return null;
            }
            r3 = r2;
        }
        if (r3.b() == null) {
            r2 = new r();
            r2.a(b10);
        }
        boolean bl2 = cq.b7.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntitySignRenderer.model");
                return null;
            }
            bl2 = cq.a((Object)r2, cq.b7, (Object)j2);
        }
        return r2;
    }
}

