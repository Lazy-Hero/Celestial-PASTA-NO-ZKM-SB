/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.R;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.aC;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.b;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class T
extends R {
    @Override
    public net.minecraft.ac.b m(i i2) {
        return net.minecraft.ac.b.NORMAL;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    public T() {
        super(net.minecraft.ac.c.O, false);
        this.x = 0.98f;
        this.a(true);
        this.a(net.minecraft.ad.a.r);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block0: {
            if (z2.a(net.minecraft.ah.c.BLOCK, n2) <= 11 - this.d().j()) break block0;
            this.a(z2, n2);
        }
    }

    @Override
    public void a(z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block7: {
            boolean bl2;
            block8: {
                int n3;
                boolean bl3;
                block5: {
                    block6: {
                        j2.b(net.minecraft.l.m.a(this));
                        boolean bl4 = cL.b();
                        j2.c(0.005f);
                        bl3 = bl4;
                        n3 = this.r();
                        if (bl3) break block5;
                        if (n3 == 0) break block6;
                        n3 = net.minecraft.ax.T.a(net.minecraft.u.b.v, d10);
                        if (bl3) break block5;
                        if (n3 <= 0) break block6;
                        T.a(z2, n2, this.q(i2));
                        if (!bl3) break block7;
                    }
                    n3 = z2.D.e();
                }
                if (!bl3) {
                    if (n3 != 0) {
                        z2.v(n2);
                        return;
                    }
                    n3 = net.minecraft.ax.T.a(net.minecraft.u.b.B, d10);
                }
                int n4 = n3;
                this.a(z2, n2, i2, n4);
                c c10 = z2.d(n2.k()).o();
                bl2 = c10.n();
                if (bl3) break block7;
                if (bl2) break block8;
                bl2 = c10.b();
                if (bl3 || !bl2) break block7;
            }
            bl2 = z2.a(n2, g.cL.d());
        }
    }

    protected void a(z z2, n n2) {
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    boolean bl3 = cL.b();
                    bl2 = z2.D.e();
                    if (bl3) break block2;
                    if (!bl2) break block3;
                    z2.v(n2);
                    if (!bl3) break block4;
                }
                this.a(z2, n2, z2.d(n2), 0);
                bl2 = z2.a(n2, g.bQ.d());
            }
            z2.a(n2, (K)g.bQ, n2);
        }
    }
}

