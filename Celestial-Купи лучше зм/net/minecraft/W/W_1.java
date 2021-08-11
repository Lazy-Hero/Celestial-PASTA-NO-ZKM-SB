/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.R;
import net.minecraft.W.cL;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.aC;
import net.minecraft.k.n;

public class W
extends R {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, x x2) {
        boolean bl2 = cL.e();
        if (bl2) {
            if (Math.abs(x2.G) < 0.1 && !x2.a4()) {
                double d10 = 0.4 + Math.abs(x2.G) * 0.2;
                x2.aq *= d10;
                x2.d *= d10;
            }
            super.a(z2, n2, x2);
        }
    }

    @Override
    public aC p() {
        return aC.TRANSLUCENT;
    }

    @Override
    public void a(z z2, n n2, x x2, float f10) {
        block4: {
            x x3;
            block2: {
                block3: {
                    boolean bl2 = cL.b();
                    x3 = x2;
                    if (bl2) break block2;
                    if (!x3.a4()) break block3;
                    super.a(z2, n2, x2, f10);
                    if (!bl2) break block4;
                }
                x3 = x2;
            }
            x3.d(f10, 0.0f);
        }
    }

    public W() {
        super(net.minecraft.ac.c.N, false, net.minecraft.ac.a.t);
        this.a(net.minecraft.ad.a.j);
        this.x = 0.8f;
    }

    @Override
    public void a(z z2, x x2) {
        block4: {
            block6: {
                x x3;
                int n2;
                block5: {
                    boolean bl2;
                    block2: {
                        double d10;
                        block3: {
                            bl2 = cL.b();
                            n2 = x2.a4();
                            if (bl2) break block2;
                            if (n2 == 0) break block3;
                            super.a(z2, x2);
                            if (!bl2) break block4;
                        }
                        n2 = (d10 = x2.G - 0.0) == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
                    }
                    if (bl2) break block5;
                    if (n2 >= 0) break block4;
                    x2.G = -x2.G;
                    x3 = x2;
                    if (bl2) break block6;
                    n2 = x3 instanceof B;
                }
                if (n2 != 0) break block4;
                x3 = x2;
            }
            x3.G *= 0.8;
        }
    }
}

