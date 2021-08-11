/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.J.o;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.g;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.client.w.x;
import net.q;

public class X
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof x)) {
                return null;
            }
            j3 = j2;
        }
        x x2 = (x)j3;
        boolean bl2 = string.equals("bottom");
        if (arrstring != null) {
            if (bl2) {
                return x2.j[0];
            }
            bl2 = string.equals("back");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.j[1];
            }
            bl2 = string.equals("front");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.j[2];
            }
            bl2 = string.equals("right");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.j[3];
            }
            bl2 = string.equals("left");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.j[4];
            }
            bl2 = string.equals("paddle_left");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.i[0];
            }
            bl2 = string.equals("paddle_right");
        }
        if (arrstring != null) {
            if (bl2) {
                return x2.i[1];
            }
            bl2 = string.equals("bottom_no_water");
        }
        return bl2 ? x2.l : null;
    }

    @Override
    public j e() {
        return new x();
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        g g10 = new g(a42);
        String[] arrstring = I.c();
        boolean bl2 = cq.b8.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderBoat.modelBoat");
                return null;
            }
            bl2 = cq.a((Object)g10, cq.b8, (Object)j2);
        }
        g10.a = f10;
        return g10;
    }

    public X() {
        super(o.class, "boat", 0.5f);
    }
}

