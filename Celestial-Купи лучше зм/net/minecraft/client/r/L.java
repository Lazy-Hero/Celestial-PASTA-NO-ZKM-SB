/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import java.util.Random;
import net.minecraft.T.ah;
import net.minecraft.Z.i;
import net.minecraft.ar.v;
import net.minecraft.client.C.d;
import net.minecraft.client.C.r;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.q;
import net.minecraft.k.m;

public class L
extends u<ah> {
    private final /* synthetic */ Random z;
    private static final /* synthetic */ v A;

    static {
        A = new v("textures/entity/enderman/enderman.png");
    }

    public q a() {
        return (q)super.b();
    }

    protected v a(ah ah2) {
        return A;
    }

    public L(a4 a42) {
        super(a42, new q(0.0f), 0.5f);
        this.z = new Random();
        this.a(new r(this));
        this.a(new d(this));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(ah ah2, double d10, double d11, double d12, float f10, float f11) {
        i i2 = ah2.Q();
        m[] arrm = b.b();
        q q2 = this.a();
        q2.s = i2 != null;
        q2.t = ah2.f();
        if (arrm == null) {
            if (ah2.f()) {
                double d13 = 0.02;
                d10 += this.z.nextGaussian() * 0.02;
                d12 += this.z.nextGaussian() * 0.02;
            }
            super.b(ah2, d10, d11, d12, f10, f11);
        }
    }
}

