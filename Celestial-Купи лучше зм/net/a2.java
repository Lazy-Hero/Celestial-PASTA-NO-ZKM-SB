/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.J.u;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.at;
import net.minecraft.client.w.R;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a2
extends I {
    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof R)) {
                return null;
            }
            j3 = j2;
        }
        R r2 = (R)j3;
        boolean bl2 = string.equals("bottom");
        if (arrstring != null) {
            if (bl2) {
                return r2.i[0];
            }
            bl2 = string.equals("back");
        }
        if (arrstring != null) {
            if (bl2) {
                return r2.i[1];
            }
            bl2 = string.equals("front");
        }
        if (arrstring != null) {
            if (bl2) {
                return r2.i[2];
            }
            bl2 = string.equals("right");
        }
        if (arrstring != null) {
            if (bl2) {
                return r2.i[3];
            }
            bl2 = string.equals("left");
        }
        if (arrstring != null) {
            if (bl2) {
                return r2.i[4];
            }
            bl2 = string.equals("dirt");
        }
        return bl2 ? r2.i[5] : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a2() {
        super(u.class, "minecart", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        String[] arrstring = I.c();
        at at2 = new at(a42);
        boolean bl2 = cq.dj.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderMinecart.modelMinecart");
                return null;
            }
            bl2 = cq.a(at2, cq.dj, (Object)j2);
        }
        at2.a = f10;
        return at2;
    }

    protected a2(Class class_, String string, float f10) {
        super(class_, string, f10);
    }

    @Override
    public j e() {
        return new R();
    }
}

