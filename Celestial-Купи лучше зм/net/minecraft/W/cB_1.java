/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.cL;
import net.minecraft.W.dn;
import net.minecraft.Z.i;
import net.minecraft.ah.A;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.u.g;

final class cB
implements Runnable {
    final /* synthetic */ n a;
    final /* synthetic */ z b;

    cB(z z2, n n2) {
        this.b = z2;
        this.a = n2;
    }

    @Override
    public void run() {
        n n2;
        a a10 = this.b.b(this.a);
        int n3 = this.a.b() - 1;
        boolean bl2 = cL.b();
        while (n3 >= 0 && (a10.a(n2 = new n(this.a.e(), n3, this.a.a())) || bl2)) {
            i i2 = this.b.d(n2);
            if (!bl2) {
                if (i2.b() == g.bX) {
                    ((A)this.b).a(new dn(this, n2));
                }
                --n3;
            }
            if (!bl2) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

