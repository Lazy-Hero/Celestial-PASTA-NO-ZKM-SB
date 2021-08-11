/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.dG;
import net.minecraft.W.x;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.k.n;
import net.minecraft.w.k;

public class bd
extends K {
    public static final /* synthetic */ d<dG> z;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected net.minecraft.w.d q(i i2) {
        net.minecraft.w.d d10;
        block5: {
            dG dG2;
            dG dG3;
            block4: {
                dG dG4 = i2.b(z);
                boolean bl2 = cL.b();
                dG3 = dG4;
                dG2 = dG.LINES_X;
                if (bl2) break block4;
                if (dG3 == dG2) break block5;
                dG3 = dG4;
                dG2 = dG.LINES_Z;
            }
            if (dG3 != dG2) {
                d10 = super.q(i2);
                return d10;
            }
        }
        d10 = new net.minecraft.w.d(net.minecraft.w.k.b(this), 1, dG.LINES_Y.a());
        return d10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public int g(i var1_1) {
        var3_2 = var1_1.b(bd.z);
        var2_3 = cL.b();
        v0 = var3_2;
        if (!var2_3) {
            if (v0 != dG.LINES_X) {
                v0 = var3_2;
                if (!var2_3) {
                    if (v0 != dG.LINES_Z) {
                        v1 = var3_2.a();
                        return v1;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = dG.LINES_Y;
            }
        }
        v1 = v0.a();
        return v1;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        int n4;
        int n5;
        block7: {
            block9: {
                block8: {
                    boolean bl2 = cL.e();
                    n5 = n3;
                    n4 = dG.LINES_Y.a();
                    if (!bl2) break block7;
                    if (n5 != n4) break block8;
                    n5 = net.minecraft.W.x.c[aA2.g().ordinal()];
                    if (!bl2) break block9;
                    switch (n5) {
                        case 1: {
                            return this.d().a(z, dG.LINES_Z);
                        }
                        case 2: {
                            return this.d().a(z, dG.LINES_X);
                        }
                        case 3: {
                            return this.d().a(z, dG.LINES_Y);
                        }
                    }
                }
                n5 = n3;
            }
            n4 = dG.CHISELED.a();
        }
        return n5 == n4 ? this.d().a(z, dG.CHISELED) : this.d().a(z, dG.DEFAULT);
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, dG.a(n2));
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.V;
    }

    static {
        z = d.a("variant", dG.class);
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    public bd() {
        super(net.minecraft.ac.c.H);
        this.h(this.e.a().a(z, dG.DEFAULT));
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public void a(a a10, a2<net.minecraft.w.d> a22) {
        a22.add(new net.minecraft.w.d(this, 1, dG.DEFAULT.a()));
        a22.add(new net.minecraft.w.d(this, 1, dG.CHISELED.a()));
        a22.add(new net.minecraft.w.d(this, 1, dG.LINES_Y.a()));
    }

    @Override
    public int d(i i2) {
        return i2.b(z).a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.e();
        v0 = net.minecraft.W.x.b[var2_2.ordinal()];
        if (!var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: 
            case 2: {
                v0 = net.minecraft.W.x.a[var1_1.b(bd.z).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bd.z, dG.LINES_Z);
                    }
                    case 2: {
                        return var1_1.a(bd.z, dG.LINES_X);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

