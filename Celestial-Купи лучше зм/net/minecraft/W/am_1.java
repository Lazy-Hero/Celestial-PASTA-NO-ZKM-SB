/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.B.a;
import net.minecraft.N.P;
import net.minecraft.N.Q;
import net.minecraft.N.R;
import net.minecraft.N.y;
import net.minecraft.O.c;
import net.minecraft.O.d;
import net.minecraft.W.a3;
import net.minecraft.W.cL;
import net.minecraft.W.dT;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;

public class am
extends a3 {
    private final /* synthetic */ c D;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public y a(z z2, int n2) {
        return new Q();
    }

    @Override
    protected void a(z z2, n n2) {
        block3: {
            net.minecraft.w.d d10;
            int n3;
            P p2;
            block7: {
                net.minecraft.w.d d11;
                block8: {
                    net.minecraft.w.d d12;
                    block9: {
                        a a10;
                        aA aA2;
                        boolean bl2;
                        block6: {
                            dT dT2;
                            block5: {
                                block4: {
                                    P p3;
                                    block2: {
                                        dT2 = new dT(z2, n2);
                                        p2 = (P)dT2.c();
                                        bl2 = cL.b();
                                        p3 = p2;
                                        if (bl2) break block2;
                                        if (p3 == null) break block3;
                                        p3 = p2;
                                    }
                                    n3 = p3.b();
                                    if (bl2) break block4;
                                    if (n3 >= 0) break block5;
                                    z2.b(1001, n2, 0);
                                }
                                if (!bl2) break block3;
                            }
                            if ((d12 = p2.a(n3)).G()) break block3;
                            aA2 = z2.d(n2).b(C);
                            n n4 = n2.a(aA2);
                            a10 = R.a(z2, n4.e(), (double)n4.b(), n4.a());
                            if (a10 != null) break block6;
                            d10 = this.D.a(dT2, d12);
                            if (!bl2) break block7;
                        }
                        d11 = d10 = R.a((a)p2, a10, d12.C().d(1), aA2.h());
                        if (bl2) break block8;
                        if (!d11.G()) break block9;
                        d10 = d12.C();
                        d10.b(1);
                        if (!bl2) break block7;
                    }
                    d11 = d12.C();
                }
                d10 = d11;
            }
            p2.a(n3, d10);
        }
    }

    public am() {
        this.D = new d();
    }

    @Override
    protected c a(net.minecraft.w.d d10) {
        return this.D;
    }
}

