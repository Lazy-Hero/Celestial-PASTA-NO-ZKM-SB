/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.bf;
import net.minecraft.W.c3;
import net.minecraft.W.cL;
import net.minecraft.W.cj;
import net.minecraft.W.o;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ar.a2;
import net.minecraft.k.n;
import net.minecraft.w.k;

public class bL
extends bf {
    public static final /* synthetic */ d<D> B;

    @Override
    public int g(i i2) {
        return i2.b(B).b() - 4;
    }

    @Override
    protected c f() {
        return new c((K)this, B, A);
    }

    public bL() {
        this.h(this.e.a().a(B, D.ACACIA).a(A, net.minecraft.W.o.Y));
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, D.ACACIA.b() - 4));
        a22.add(new net.minecraft.w.d(this, 1, D.DARK_OAK.b() - 4));
    }

    static {
        B = d.a("variant", D.class, new c3());
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(B).b() - 4;
        boolean bl2 = cL.e();
        int n3 = cj.a[((o)i2.b(A)).ordinal()];
        if (bl2) {
            switch (n3) {
                case 1: {
                    n2 |= 4;
                    if (bl2) break;
                }
                case 2: {
                    n2 |= 8;
                    if (bl2) break;
                }
                case 3: {
                    n2 |= 0xC;
                }
            }
            n3 = n2;
        }
        return n3;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    protected net.minecraft.w.d q(i i2) {
        return new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, i2.b(B).b() - 4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public net.minecraft.ac.a f(i var1_1, t var2_2, n var3_3) {
        var5_4 = var1_1.b(bL.B);
        var4_5 = cL.b();
        v0 = cj.a[((o)var1_1.b(bL.A)).ordinal()];
        if (var4_5) ** GOTO lbl8
        switch (v0) {
            default: {
                v0 = cj.b[var5_4.ordinal()];
lbl8:
                // 2 sources

                switch (v0) {
                    default: {
                        return net.minecraft.ac.a.T;
                    }
                    case 2: 
                }
                return D.DARK_OAK.a();
            }
            case 4: 
        }
        return var5_4.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i c(int var1_1) {
        var3_2 = this.d().a(bL.B, D.a((var1_1 & 3) + 4));
        var2_3 = cL.b();
        if (var2_3) ** GOTO lbl7
        switch (var1_1 & 12) {
            case 0: {
                var3_2 = var3_2.a(bL.A, net.minecraft.W.o.Y);
lbl7:
                // 2 sources

                if (var2_3 == false) return var3_2;
            }
            case 4: {
                var3_2 = var3_2.a(bL.A, net.minecraft.W.o.X);
                if (var2_3 == false) return var3_2;
            }
            case 8: {
                var3_2 = var3_2.a(bL.A, net.minecraft.W.o.Z);
                if (var2_3 == false) return var3_2;
            }
        }
        return var3_2.a(bL.A, net.minecraft.W.o.NONE);
    }
}

