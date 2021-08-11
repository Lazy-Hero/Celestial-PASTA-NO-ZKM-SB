/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.aF;
import net.minecraft.client.Q;
import net.minecraft.client.r.al;
import net.minecraft.client.w.av;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class a4
extends I {
    public a4() {
        super(aF.class, "shulker", 0.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
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
        net.minecraft.client.r.a4 a42 = Q.P().aQ();
        al al2 = new al(a42);
        al2.i = j2;
        al2.a = f10;
        return al2;
    }

    @Override
    public j e() {
        return new av();
    }
}

