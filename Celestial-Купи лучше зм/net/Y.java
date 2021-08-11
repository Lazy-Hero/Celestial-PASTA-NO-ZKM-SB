/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.N.E;
import net.minecraft.client.F.b;
import net.minecraft.client.F.k;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.y;
import net.q;

public class Y
extends I {
    @Override
    public q a(j j2, float f10) {
        k k2;
        b b10 = b.e;
        String[] arrstring = I.c();
        k k3 = k2 = b10.a(E.class);
        if (arrstring != null) {
            if (!(k3 instanceof k)) {
                return null;
            }
            k3 = k2;
        }
        if (k3.b() == null) {
            k2 = new k();
            k2.a(b10);
        }
        boolean bl2 = cq.dm.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: TileEntityEnchantmentTableRenderer.modelBook");
                return null;
            }
            bl2 = cq.a((Object)k2, cq.dm, (Object)j2);
        }
        return k2;
    }

    public Y() {
        super(E.class, "book", 0.0f);
    }

    @Override
    public j e() {
        return new y();
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof y)) {
                return null;
            }
            j3 = j2;
        }
        y y2 = (y)j3;
        boolean bl2 = string.equals("cover_right");
        if (arrstring != null) {
            if (bl2) {
                return y2.i;
            }
            bl2 = string.equals("cover_left");
        }
        if (arrstring != null) {
            if (bl2) {
                return y2.k;
            }
            bl2 = string.equals("pages_right");
        }
        if (arrstring != null) {
            if (bl2) {
                return y2.o;
            }
            bl2 = string.equals("pages_left");
        }
        if (arrstring != null) {
            if (bl2) {
                return y2.n;
            }
            bl2 = string.equals("flipping_page_right");
        }
        if (arrstring != null) {
            if (bl2) {
                return y2.l;
            }
            bl2 = string.equals("flipping_page_left");
        }
        if (arrstring != null) {
            if (bl2) {
                return y2.m;
            }
            bl2 = string.equals("book_spine");
        }
        return bl2 ? y2.j : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

