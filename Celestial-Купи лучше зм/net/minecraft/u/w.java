/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.J.g;
import net.minecraft.J.o;
import net.minecraft.O.d;
import net.minecraft.O.i;
import net.minecraft.W.a3;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.f;

public class w
extends d {
    private final /* synthetic */ g c;
    private final /* synthetic */ d d;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(i i2) {
        i2.a().b(1000, i2.e(), 0);
    }

    @Override
    public net.minecraft.w.d b(i i2, net.minecraft.w.d d10) {
        double d11;
        double d12;
        double d13;
        double d14;
        z z2;
        aA aA2;
        block4: {
            block7: {
                block6: {
                    boolean bl2;
                    block5: {
                        n n2;
                        boolean bl3;
                        block2: {
                            c c10;
                            block3: {
                                aA2 = i2.b().b(a3.C);
                                bl3 = f.a();
                                z2 = i2.a();
                                d14 = i2.a() + (double)((float)aA2.r() * 1.125f);
                                d13 = i2.f() + (double)((float)aA2.p() * 1.125f);
                                d12 = i2.d() + (double)((float)aA2.i() * 1.125f);
                                n2 = i2.e().a(aA2);
                                c10 = z2.d(n2).o();
                                bl2 = net.minecraft.ac.c.L.equals(c10);
                                if (!bl3) break block2;
                                if (!bl2) break block3;
                                d11 = 1.0;
                                if (bl3) break block4;
                            }
                            bl2 = net.minecraft.ac.c.A.equals(c10);
                        }
                        if (!bl3) break block5;
                        if (!bl2) break block6;
                        bl2 = net.minecraft.ac.c.L.equals(z2.d(n2.k()).o());
                    }
                    if (bl2) break block7;
                }
                return this.d.a(i2, d10);
            }
            d11 = 0.0;
        }
        o o2 = new o(z2, d14, d13 + d11, d12);
        o2.a(this.c);
        o2.e = aA2.n();
        z2.f(o2);
        d10.b(1);
        return d10;
    }

    public w(g g10) {
        this.d = new d();
        this.c = g10;
    }
}

