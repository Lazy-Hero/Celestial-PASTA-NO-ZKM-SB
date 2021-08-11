/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.N.K;
import net.minecraft.N.y;
import net.minecraft.W.cB;
import net.minecraft.W.cL;
import net.minecraft.k.n;
import net.minecraft.u.g;

class dn
implements Runnable {
    final /* synthetic */ n a;
    final /* synthetic */ cB b;

    private static gP a(gP gP2) {
        return gP2;
    }

    dn(cB cB2, n n2) {
        this.b = cB2;
        this.a = n2;
    }

    @Override
    public void run() {
        block3: {
            y y2;
            block2: {
                y y3 = this.b.b.b(this.a);
                boolean bl2 = cL.e();
                y2 = y3;
                if (!bl2) break block2;
                if (!(y2 instanceof K)) break block3;
                y2 = y3;
            }
            ((K)y2).h();
            this.b.b.a(this.a, g.bX, 1, 0);
        }
    }
}

