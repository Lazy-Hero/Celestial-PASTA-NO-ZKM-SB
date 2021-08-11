/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.N;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ae.f;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.E;

public class P
extends N {
    private final /* synthetic */ int D;
    public static final /* synthetic */ f C;

    static {
        C = f.a("power", 0, 15);
    }

    @Override
    protected int a(i i2) {
        return i2.b(C);
    }

    @Override
    protected i a(i i2, int n2) {
        return i2.a(C, n2);
    }

    @Override
    public int a(z z2) {
        return 10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected int e(z z2, n n2) {
        int n3 = Math.min(z2.a(x.class, B.a(n2)).size(), this.D);
        boolean bl2 = cL.b();
        int n4 = n3;
        if (!bl2) {
            if (n4 > 0) {
                float f10 = (float)Math.min(this.D, n3) / (float)this.D;
                return net.minecraft.k.h.f(f10 * 15.0f);
            }
            n4 = 0;
        }
        return n4;
    }

    @Override
    protected void c(z z2, n n2) {
        z2.a(null, n2, E.bK, ay.BLOCKS, 0.3f, 0.75f);
    }

    protected P(c c10, int n2) {
        this(c10, n2, c10.a());
    }

    @Override
    public int d(i i2) {
        return i2.b(C);
    }

    @Override
    protected void a(z z2, n n2) {
        z2.a(null, n2, E.hD, ay.BLOCKS, 0.3f, 0.90000004f);
    }

    protected P(c c10, int n2, a a10) {
        super(c10, a10);
        this.h(this.e.a().a(C, 0));
        this.D = n2;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C);
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, n2);
    }
}

