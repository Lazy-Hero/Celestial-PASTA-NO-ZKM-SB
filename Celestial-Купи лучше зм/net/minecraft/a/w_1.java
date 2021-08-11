/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.e;
import net.minecraft.A.v;
import net.minecraft.W.ax;
import net.minecraft.W.da;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.l;
import net.minecraft.u.g;

public class w
extends v {
    @Override
    public void a(z z2, Random random, n n2) {
        this.a.a(z2, random, this, n2);
    }

    @Override
    public void b(z z2, Random random, l l2, int n2, int n3, double d10) {
        block6: {
            double d11;
            block4: {
                double d12;
                block5: {
                    this.B = g.aU.d();
                    this.z = g.bv.d();
                    boolean bl2 = net.minecraft.A.b.c();
                    double d13 = d10 - 1.75;
                    d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                    if (!bl2) break block4;
                    if (d11 <= 0) break block5;
                    this.B = g.bx.d();
                    this.z = g.bx.d();
                    if (bl2) break block6;
                }
                d11 = (d12 = d10 - -0.5) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
            }
            if (d11 > 0) {
                this.B = g.bv.d().a(ax.A, da.COARSE_DIRT);
            }
        }
        this.a(z2, random, l2, n2, n3, d10);
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public w(e e10) {
        super(e10);
        this.a.I = 2;
        this.a.C = 2;
        this.a.G = 5;
    }
}

