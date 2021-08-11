/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.K.j;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.u.c;
import net.minecraft.w.aw;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.h;

public class av
extends aw {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e(d d10) {
        int n2 = bl.g();
        int n3 = super.e(d10);
        if (n2 == 0) return n3 != 0;
        if (n3 != 0) return 1 != 0;
        n3 = d10.d();
        if (n2 == 0) return n3 != 0;
        if (n3 <= 0) return 0 != 0;
        return 1 != 0;
    }

    public av(int n2, float f10, boolean bl2) {
        super(n2, f10, bl2);
        this.a(true);
    }

    @Override
    public h a(d d10) {
        return d10.d() == 0 ? net.minecraft.w.h.RARE : net.minecraft.w.h.EPIC;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        int n2 = bl.g();
        boolean bl2 = this.b(a10);
        if (n2 != 0 && bl2) {
            a22.add(new d(this));
            bl2 = a22.add(new d(this, 1, 1));
        }
    }

    @Override
    protected void b(d d10, z z2, net.minecraft.i.j j2) {
        block1: {
            block2: {
                int n2;
                int n3;
                block0: {
                    n3 = bl.g();
                    n2 = z2.C;
                    if (n3 == 0) break block0;
                    if (n2 != 0) break block1;
                    n2 = d10.d();
                }
                if (n2 <= 0) break block2;
                j2.b(new j(c.t, 400, 1));
                j2.b(new j(c.b, 6000, 0));
                j2.b(new j(c.h, 6000, 0));
                j2.b(new j(c.a, 2400, 3));
                if (n3 != 0) break block1;
            }
            j2.b(new j(c.t, 100, 1));
            j2.b(new j(c.a, 2400, 0));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

