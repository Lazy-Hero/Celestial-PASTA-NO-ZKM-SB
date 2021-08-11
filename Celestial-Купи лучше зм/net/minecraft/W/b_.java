/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.A;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.ax.T;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;

public class b_
extends K {
    @Override
    public int b(i i2, t t2, n n2) {
        return 0xF000F0;
    }

    @Override
    public boolean a(i i2, x x2) {
        return x2.V();
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block3: {
            z z3;
            n n3;
            block4: {
                boolean bl2;
                block2: {
                    n3 = n2.a();
                    bl2 = cL.b();
                    i i3 = z2.d(n3);
                    if (bl2) break block2;
                    if (i3.b() != g.bQ && i3.b() != g.cL) break block3;
                    z2.v(n3);
                    z2.a(null, n2, E.gE, ay.BLOCKS, 0.5f, 2.6f + (z2.J.nextFloat() - z2.J.nextFloat()) * 0.8f);
                }
                z3 = z2;
                if (bl2) break block4;
                if (!(z3 instanceof A)) break block3;
                z3 = z2;
            }
            ((A)z3).a(aH.SMOKE_LARGE, (double)n3.e() + 0.5, (double)n3.b() + 0.25, (double)n3.a() + 0.5, 8, 0.5, 0.25, 0.5, 0.0, new int[0]);
        }
    }

    @Override
    public net.minecraft.ac.a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.aa;
    }

    @Override
    public void a(z z2, n n2, x x2) {
        block4: {
            block5: {
                boolean bl2;
                boolean bl3;
                block6: {
                    bl3 = cL.e();
                    if (!bl3) break block4;
                    if (x2.V()) break block5;
                    bl2 = x2 instanceof B;
                    if (!bl3) break block6;
                    if (!bl2) break block5;
                    bl2 = T.h((B)x2);
                }
                if (bl3 && !bl2) {
                    bl2 = x2.a(G.y, 1.0f);
                }
            }
            super.a(z2, n2, x2);
        }
    }

    public b_() {
        super(net.minecraft.ac.c.H);
        this.a(net.minecraft.ad.a.r);
        this.b(0.2f);
        this.a(true);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

