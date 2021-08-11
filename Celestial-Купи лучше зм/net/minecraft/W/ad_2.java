/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.w.L;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.e;

class ad
implements e {
    /* synthetic */ double c;
    /* synthetic */ long d;
    /* synthetic */ double a;
    final /* synthetic */ L b;

    private static gP a(gP gP2) {
        return gP2;
    }

    private double a(z z2, double d10) {
        block3: {
            block2: {
                int n2 = bl.c();
                if (n2 != 0) break block2;
                if (z2.r() == this.d) break block3;
                this.d = z2.r();
            }
            double d11 = d10 - this.a;
            d11 = h.c(d11 + 0.5, 1.0) - 0.5;
            this.c += d11 * 0.1;
            this.c *= 0.9;
            this.a = h.c(this.a + this.c, 1.0);
        }
        return this.a;
    }

    @Override
    public float a(d d10, @Nullable z z2, @Nullable B b10) {
        double d11;
        block13: {
            block12: {
                z z3;
                int n2;
                block11: {
                    block8: {
                        block9: {
                            x x2;
                            block10: {
                                n2 = bl.c();
                                boolean bl2 = b10 != null;
                                x x3 = bl2 ? b10 : d10.e();
                                z3 = z2;
                                if (n2 != 0) break block8;
                                if (z3 != null) break block9;
                                x2 = x3;
                                if (n2 != 0) break block10;
                                if (x2 == null) break block9;
                                x2 = x3;
                            }
                            z2 = x2.aG;
                        }
                        z3 = z2;
                    }
                    if (n2 == 0) {
                        if (z3 == null) {
                            return 0.0f;
                        }
                        z3 = z2;
                    }
                    if (n2 != 0) break block11;
                    if (!z3.D.s()) break block12;
                    z3 = z2;
                }
                d11 = z3.h(1.0f);
                if (n2 == 0) break block13;
            }
            d11 = Math.random();
        }
        d11 = this.a(z2, d11);
        return (float)d11;
    }

    ad(L l2) {
        this.b = l2;
    }
}

