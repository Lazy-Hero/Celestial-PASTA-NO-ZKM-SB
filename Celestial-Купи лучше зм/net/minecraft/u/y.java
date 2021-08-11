/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.i;
import net.minecraft.W.K;
import net.minecraft.W.a3;
import net.minecraft.W.cT;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.g;
import net.minecraft.u.x;
import net.minecraft.w.d;

final class y
extends x {
    y() {
    }

    @Override
    protected d b(i i2, d d10) {
        d d11;
        block4: {
            block5: {
                block7: {
                    K k2;
                    n n2;
                    boolean bl2;
                    z z2;
                    block6: {
                        n n3;
                        z z3;
                        block2: {
                            block3: {
                                z2 = i2.a();
                                this.c = true;
                                bl2 = f.f();
                                n2 = i2.e().a(i2.b().b(a3.C));
                                z3 = z2;
                                n3 = n2;
                                if (bl2) break block2;
                                if (!z3.a(n3)) break block3;
                                z2.a(n2, g.C.d());
                                d11 = d10;
                                if (bl2) break block4;
                                if (!d11.a(1, z2.J, null)) break block5;
                                d10.c(0);
                                if (!bl2) break block5;
                            }
                            z3 = z2;
                            n3 = n2;
                        }
                        k2 = z3.d(n3).b();
                        if (bl2) break block6;
                        if (k2 != g.cR) break block7;
                        k2 = g.cR;
                    }
                    k2.d(z2, n2, g.cR.d().a(cT.z, true));
                    z2.v(n2);
                    if (!bl2) break block5;
                }
                this.c = false;
            }
            d11 = d10;
        }
        return d11;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

