/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.W.bo;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.g;
import net.minecraft.u.x;
import net.minecraft.w.d;
import net.minecraft.w.m;

final class B
extends x {
    @Override
    protected d b(i i2, d d10) {
        d d11;
        block9: {
            block8: {
                d d12;
                boolean bl2;
                block6: {
                    boolean bl3;
                    bo bo2;
                    n n2;
                    z z2;
                    block7: {
                        block5: {
                            z2 = i2.a();
                            bl2 = f.f();
                            n2 = i2.e().a(i2.b().b(a3.C));
                            bo2 = (bo)g.G;
                            this.c = true;
                            bl3 = z2.a(n2);
                            if (bl2) break block5;
                            if (!bl3) break block6;
                            bl3 = bo2.b(z2, n2);
                        }
                        if (bl2) break block7;
                        if (!bl3) break block6;
                        bl3 = z2.C;
                    }
                    if (!bl2 && !bl3) {
                        bl3 = z2.a(n2, bo2.d(), 3);
                    }
                    d10.b(1);
                    if (!bl2) break block8;
                }
                d11 = d12 = m.a(i2, d10);
                if (bl2) break block9;
                if (d11.G()) {
                    this.c = false;
                }
            }
            d11 = d10;
        }
        return d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    B() {
    }
}

