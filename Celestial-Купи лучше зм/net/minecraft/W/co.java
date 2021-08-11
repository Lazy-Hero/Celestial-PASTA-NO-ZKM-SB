/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dO;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ar.a2;

public class co
extends K {
    public static final /* synthetic */ int B;
    public static final /* synthetic */ int z;
    public static final /* synthetic */ d<dO> D;
    public static final /* synthetic */ int C;
    public static final /* synthetic */ int A;

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, D);
    }

    @Override
    public i c(int n2) {
        return this.d().a(D, dO.a(n2));
    }

    @Override
    public int g(i i2) {
        return i2.b(D).a();
    }

    static {
        D = d.a("variant", dO.class);
        B = dO.DEFAULT.a();
        C = dO.MOSSY.a();
        A = dO.CRACKED.a();
        z = dO.CHISELED.a();
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        dO[] arrdO = dO.values();
        int n2 = arrdO.length;
        boolean bl2 = cL.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            dO dO2 = arrdO[i2];
            a22.add(new net.minecraft.w.d(this, 1, dO2.a()));
            if (!bl2) continue;
        }
    }

    @Override
    public int d(i i2) {
        return i2.b(D).a();
    }

    public co() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(D, dO.DEFAULT));
        this.a(net.minecraft.ad.a.r);
    }
}

