/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.ad.a;
import net.minecraft.ar.a2;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class M
extends k {
    @Override
    public void a(a a10, a2<d> a22) {
        int n2 = bl.c();
        boolean bl2 = this.b(a10);
        if (n2 == 0 && bl2) {
            a22.add(new d(this, 1, 0));
            bl2 = a22.add(new d(this, 1, 1));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String d(d d10) {
        return d10.d() == 1 ? "item.charcoal" : "item.coal";
    }

    public M() {
        this.a(true);
        this.d(0);
        this.a(net.minecraft.ad.a.m);
    }
}

