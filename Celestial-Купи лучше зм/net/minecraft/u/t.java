/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.N.P;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.K;
import net.minecraft.W.a3;
import net.minecraft.W.bq;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.h;
import net.minecraft.w.k;

final class t
extends d {
    private final /* synthetic */ d c;

    t() {
        this.c = new d();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        block12: {
            k k2;
            n n2;
            boolean bl2;
            z z2;
            block7: {
                block11: {
                    block9: {
                        int n3;
                        block10: {
                            net.minecraft.Z.i i3;
                            block8: {
                                K k3;
                                block5: {
                                    c c10;
                                    block6: {
                                        z2 = i2.a();
                                        bl2 = f.a();
                                        n2 = i2.e().a(i2.b().b(a3.C));
                                        i3 = z2.d(n2);
                                        k3 = i3.b();
                                        c10 = i3.o();
                                        n3 = net.minecraft.ac.c.L.equals(c10);
                                        if (!bl2) break block5;
                                        if (n3 == 0) break block6;
                                        n3 = k3 instanceof bq;
                                        if (!bl2) break block5;
                                        if (n3 == 0) break block6;
                                        n3 = i3.b(bq.z);
                                        if (!bl2) break block5;
                                        if (n3 != 0) break block6;
                                        k2 = h.ah;
                                        if (bl2) break block7;
                                    }
                                    n3 = net.minecraft.ac.c.g.equals(c10);
                                }
                                if (!bl2) break block8;
                                if (n3 == 0) break block9;
                                n3 = k3 instanceof bq;
                            }
                            if (!bl2) break block10;
                            if (n3 == 0) break block9;
                            n3 = i3.b(bq.z);
                        }
                        if (n3 == 0) break block11;
                    }
                    return super.b(i2, d10);
                }
                k2 = h.cg;
            }
            z2.v(n2);
            d10.b(1);
            int n4 = d10.G();
            if (bl2) {
                if (n4 != 0) {
                    return new net.minecraft.w.d(k2);
                }
                n4 = ((P)i2.c()).a(new net.minecraft.w.d(k2));
            }
            if (n4 >= 0) break block12;
            this.c.a(i2, new net.minecraft.w.d(k2));
        }
        return d10;
    }
}

