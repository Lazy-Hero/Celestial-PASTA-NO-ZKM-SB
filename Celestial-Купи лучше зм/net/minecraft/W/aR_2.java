/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.N.z;
import net.minecraft.W.a3;
import net.minecraft.ad.a;
import net.minecraft.ar.aX;
import net.minecraft.ar.v;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.u.g;
import net.minecraft.w.b9;
import net.minecraft.w.bE;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.w.m;
import net.minecraft.w.t;

public class aR
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int g(d d10) {
        return 72000;
    }

    @Override
    public net.minecraft.ar.t<d> a(net.minecraft.ah.z z2, j j2, net.minecraft.ar.a3 a32) {
        d d10 = j2.c(a32);
        j2.a(a32);
        return new net.minecraft.ar.t<d>(aX.SUCCESS, d10);
    }

    @Override
    public bE b(d d10) {
        return bE.BLOCK;
    }

    @Override
    public void a(d d10, @Nullable net.minecraft.ah.z z2, List<String> list, o o2) {
        t.a(d10, list);
    }

    @Override
    public String h(d d10) {
        block3: {
            d d11;
            block2: {
                int n2 = bl.g();
                d11 = d10;
                if (n2 == 0) break block2;
                if (d11.c("BlockEntityTag") == null) break block3;
                d11 = d10;
            }
            bl bl2 = z.c(d11);
            return net.minecraft.ab.a.a("item.shield." + bl2.d() + ".name");
        }
        return net.minecraft.ab.a.a("item.shield.name");
    }

    public aR() {
        this.f = 1;
        this.a(net.minecraft.ad.a.o);
        this.d(336);
        this.a(new v("blocking"), new b9(this));
        a3.B.a(this, m.w);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, d d11) {
        int n2 = bl.c();
        if (d11.w() == k.b(g.cB)) return true;
        boolean bl2 = super.a(d10, d11);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

