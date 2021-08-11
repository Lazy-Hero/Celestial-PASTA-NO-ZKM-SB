/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import javax.annotation.Nullable;
import net.minecraft.J.l;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.w.N;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.e;

class ax
implements e {
    /* synthetic */ double b;
    /* synthetic */ double d;
    /* synthetic */ long c;
    final /* synthetic */ N a;

    @Override
    public float a(d d10, @Nullable z z2, @Nullable B b10) {
        double d11;
        boolean bl2;
        block10: {
            block9: {
                boolean bl3;
                x x2;
                int n2;
                block8: {
                    n2 = bl.g();
                    B b11 = b10;
                    if (n2 != 0) {
                        if (b11 == null && !d10.B()) {
                            return 0.0f;
                        }
                        b11 = b10;
                    }
                    bl2 = b11 != null;
                    x2 = bl2 ? b10 : d10.e();
                    z z3 = z2;
                    if (n2 != 0) {
                        if (z3 == null) {
                            z2 = x2.aG;
                        }
                        z3 = z2;
                    }
                    bl3 = z3.D.s();
                    if (n2 == 0) break block8;
                    if (!bl3) break block9;
                    bl3 = bl2;
                }
                double d12 = bl3 ? (double)x2.e : this.a((l)x2);
                d12 = h.c(d12 / 360.0, 1.0);
                double d13 = this.a(z2, x2) / (Math.PI * 2);
                d11 = 0.5 - (d12 - 0.25 - d13);
                if (n2 != 0) break block10;
            }
            d11 = Math.random();
        }
        if (bl2) {
            d11 = this.a(z2, d11);
        }
        return h.a((float)d11, 1.0f);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    ax(N n2) {
        this.a = n2;
    }

    private double a(z z2, double d10) {
        block3: {
            block2: {
                int n2 = bl.g();
                if (n2 == 0) break block2;
                if (z2.r() == this.c) break block3;
                this.c = z2.r();
            }
            double d11 = d10 - this.d;
            d11 = h.c(d11 + 0.5, 1.0) - 0.5;
            this.b += d11 * 0.1;
            this.b *= 0.8;
            this.d = h.c(this.d + this.b, 1.0);
        }
        return this.d;
    }

    private double a(l l2) {
        return h.b(180 + l2.aL.k() * 90);
    }

    private double a(z z2, x x2) {
        n n2 = z2.G();
        return Math.atan2((double)n2.a() - x2.ax, (double)n2.e() - x2.a);
    }
}

