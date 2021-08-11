/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.bp;
import net.minecraft.W.cL;
import net.minecraft.W.dh;
import net.minecraft.W.n;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;

public class bs
extends bp {
    public static final /* synthetic */ d<cL> C;

    protected bs() {
        super(false);
        this.h(this.e.a().a(C, cL.NORTH_SOUTH));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = dh.b[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = dh.a[var1_1.b(bs.C).ordinal()];
lbl7:
                // 2 sources

                if (var3_3) ** GOTO lbl27
                switch (v0) {
                    case 1: {
                        return var1_1.a(bs.C, cL.ASCENDING_WEST);
                    }
                    case 2: {
                        return var1_1.a(bs.C, cL.ASCENDING_EAST);
                    }
                    case 3: {
                        return var1_1.a(bs.C, cL.ASCENDING_SOUTH);
                    }
                    case 4: {
                        return var1_1.a(bs.C, cL.ASCENDING_NORTH);
                    }
                    case 5: {
                        return var1_1.a(bs.C, cL.NORTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bs.C, cL.NORTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bs.C, cL.SOUTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(bs.C, cL.SOUTH_WEST);
                    }
                }
            }
            case 2: {
                v0 = dh.a[var1_1.b(bs.C).ordinal()];
lbl27:
                // 2 sources

                if (var3_3) ** GOTO lbl51
                switch (v0) {
                    case 1: {
                        return var1_1.a(bs.C, cL.ASCENDING_NORTH);
                    }
                    case 2: {
                        return var1_1.a(bs.C, cL.ASCENDING_SOUTH);
                    }
                    case 3: {
                        return var1_1.a(bs.C, cL.ASCENDING_WEST);
                    }
                    case 4: {
                        return var1_1.a(bs.C, cL.ASCENDING_EAST);
                    }
                    case 5: {
                        return var1_1.a(bs.C, cL.NORTH_EAST);
                    }
                    case 6: {
                        return var1_1.a(bs.C, cL.SOUTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bs.C, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(bs.C, cL.NORTH_WEST);
                    }
                    case 9: {
                        return var1_1.a(bs.C, cL.EAST_WEST);
                    }
                    case 10: {
                        return var1_1.a(bs.C, cL.NORTH_SOUTH);
                    }
                }
            }
            case 3: {
                v0 = dh.a[var1_1.b(bs.C).ordinal()];
lbl51:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(bs.C, cL.ASCENDING_SOUTH);
                    }
                    case 2: {
                        return var1_1.a(bs.C, cL.ASCENDING_NORTH);
                    }
                    case 3: {
                        return var1_1.a(bs.C, cL.ASCENDING_EAST);
                    }
                    case 4: {
                        return var1_1.a(bs.C, cL.ASCENDING_WEST);
                    }
                    case 5: {
                        return var1_1.a(bs.C, cL.SOUTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bs.C, cL.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(bs.C, cL.NORTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(bs.C, cL.SOUTH_EAST);
                    }
                    case 9: {
                        return var1_1.a(bs.C, cL.EAST_WEST);
                    }
                    case 10: {
                        return var1_1.a(bs.C, cL.NORTH_SOUTH);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    static {
        C = d.a("shape", cL.class);
    }

    @Override
    public int d(i i2) {
        return i2.b(C).d();
    }

    @Override
    protected void a(i i2, z z2, net.minecraft.k.n n2, K k2) {
        block2: {
            int n3;
            block1: {
                boolean bl2 = cL.e();
                n3 = k2.d().a();
                if (!bl2) break block1;
                if (n3 == 0) break block2;
                n3 = new n(this, z2, n2, i2).a();
            }
            if (n3 == 3) {
                this.a(z2, n2, i2, false);
            }
        }
    }

    @Override
    public a<cL> a() {
        return C;
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, cL.a(n2));
    }

    @Override
    protected c f() {
        return new c((K)this, C);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, h var2_2) {
        var4_3 = var1_1.b(bs.C);
        var3_4 = cL.e();
        v0 = dh.c[var2_2.ordinal()];
        if (!var3_4) ** GOTO lbl8
        switch (v0) {
            case 1: {
                v0 = dh.a[var4_3.ordinal()];
lbl8:
                // 2 sources

                switch (v0) {
                    case 3: {
                        return var1_1.a(bs.C, cL.ASCENDING_SOUTH);
                    }
                    case 4: {
                        return var1_1.a(bs.C, cL.ASCENDING_NORTH);
                    }
                    case 5: {
                        return var1_1.a(bs.C, cL.NORTH_EAST);
                    }
                    case 6: {
                        return var1_1.a(bs.C, cL.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(bs.C, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(bs.C, cL.SOUTH_EAST);
                    }
                }
                return super.a(var1_1, var2_2);
            }
            case 2: {
                switch (dh.a[var4_3.ordinal()]) {
                    case 1: {
                        return var1_1.a(bs.C, cL.ASCENDING_WEST);
                    }
                    case 2: {
                        return var1_1.a(bs.C, cL.ASCENDING_EAST);
                    }
                    default: {
                        if (var3_4 != false) return super.a(var1_1, var2_2);
                    }
                    case 5: {
                        return var1_1.a(bs.C, cL.SOUTH_WEST);
                    }
                    case 6: {
                        return var1_1.a(bs.C, cL.SOUTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(bs.C, cL.NORTH_EAST);
                    }
                    case 8: 
                }
                return var1_1.a(bs.C, cL.NORTH_WEST);
            }
        }
        return super.a(var1_1, var2_2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

