/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.I;
import net.minecraft.client.Q;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aW;
import net.minecraft.client.w.a9;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.minecraft.z.n;
import net.q;

public class aj
extends I {
    @Override
    public c a(j j2, String string) {
        String[] arrstring = I.c();
        j j3 = j2;
        if (arrstring != null) {
            if (!(j3 instanceof a9)) {
                return null;
            }
            j3 = j2;
        }
        a9 a92 = (a9)j3;
        return string.equals("head") ? a92.i : null;
    }

    @Override
    public j e() {
        return new a9();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aj() {
        super(n.class, "wither_skull", 0.0f);
    }

    @Override
    public q a(j j2, float f10) {
        a4 a42 = Q.P().aQ();
        String[] arrstring = I.c();
        aW aW2 = new aW(a42);
        boolean bl2 = cq.di.c();
        if (arrstring != null) {
            if (!bl2) {
                fU.h("Field not found: RenderWitherSkull_model");
                return null;
            }
            bl2 = cq.a((Object)aW2, cq.di, (Object)j2);
        }
        aW2.a = f10;
        return aW2;
    }
}

