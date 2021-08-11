/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.T.an;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.a9;
import net.minecraft.client.w.aa;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public class ad
extends I {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof aa)) {
                return null;
            }
            j3 = j2;
        }
        aa aa2 = (aa)j3;
        boolean bl2 = string.equals("body");
        if (arrstring != null) {
            if (bl2) {
                return aa2.l;
            }
            bl2 = string.equals("body_bottom");
        }
        if (arrstring != null) {
            if (bl2) {
                return aa2.j;
            }
            bl2 = string.equals("head");
        }
        if (arrstring != null) {
            if (bl2) {
                return aa2.k;
            }
            bl2 = string.equals("left_hand");
        }
        if (arrstring != null) {
            if (bl2) {
                return aa2.m;
            }
            bl2 = string.equals("right_hand");
        }
        return bl2 ? aa2.i : null;
    }

    @Override
    public j e() {
        return new aa();
    }

    public ad() {
        super(an.class, "snow_golem", 0.5f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        a9 a92 = new a9(a42);
        a92.i = j2;
        a92.a = f10;
        return a92;
    }
}

