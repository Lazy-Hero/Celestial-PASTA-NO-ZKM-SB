/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.x;
import net.minecraft.w.P;
import net.minecraft.w.bl;
import net.minecraft.w.d;

final class z
extends x {
    private static gP a(gP gP2) {
        return gP2;
    }

    z() {
    }

    @Override
    protected d b(i i2, d d10) {
        z z2;
        block2: {
            block3: {
                block7: {
                    block5: {
                        net.minecraft.ah.z z3;
                        n n2;
                        boolean bl2;
                        block6: {
                            boolean bl3;
                            net.minecraft.ah.z z4;
                            block4: {
                                bl2 = f.f();
                                z2 = this;
                                if (bl2) break block2;
                                z2.c = true;
                                if (bl.WHITE != bl.d(d10.d())) break block3;
                                z4 = i2.a();
                                n2 = i2.e().a(i2.b().b(a3.C));
                                bl3 = P.a(d10, z4, n2);
                                if (bl2) break block4;
                                if (!bl3) break block5;
                                z3 = z4;
                                if (bl2) break block6;
                                bl3 = z3.C;
                            }
                            if (bl3) break block7;
                            z3 = z4;
                        }
                        z3.b(2005, n2, 0);
                        if (!bl2) break block7;
                    }
                    this.c = false;
                }
                return d10;
            }
            z2 = this;
        }
        return super.b(i2, d10);
    }
}

