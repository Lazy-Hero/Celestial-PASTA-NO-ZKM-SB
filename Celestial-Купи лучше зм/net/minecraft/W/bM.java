/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dZ;
import net.minecraft.W.dq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ar.a2;

public class bM
extends K {
    public static final /* synthetic */ d<dZ> z;

    @Override
    public int d(i i2) {
        return i2.b(z).a();
    }

    @Override
    public int g(i i2) {
        return i2.b(z).a();
    }

    static {
        z = d.a("type", dZ.class);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        dZ[] arrdZ = dZ.values();
        int n2 = arrdZ.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            dZ dZ2 = arrdZ[i2];
            a22.add(new net.minecraft.w.d(this, 1, dZ2.a()));
            if (!bl2) continue;
        }
    }

    public bM() {
        super(net.minecraft.ac.c.H, dq.RED_SAND.c());
        this.h(this.e.a().a(z, dZ.DEFAULT));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, dZ.a(n2));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }
}

