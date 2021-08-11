/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.U.B;
import net.minecraft.ad.a;
import net.minecraft.ag.O;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class K
extends k {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean d() {
        return true;
    }

    public K() {
        this.a(net.minecraft.ad.a.t);
        this.b(1);
        this.d(25);
    }

    @Override
    public boolean k() {
        return true;
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        d d10;
        block7: {
            j j3;
            block5: {
                block6: {
                    block10: {
                        d d11;
                        block9: {
                            boolean bl2;
                            block8: {
                                boolean bl3;
                                int n2;
                                block4: {
                                    d10 = j2.c(a32);
                                    n2 = bl.c();
                                    bl3 = z2.C;
                                    if (n2 != 0) break block4;
                                    if (bl3) {
                                        return new t<d>(aX.PASS, d10);
                                    }
                                    j3 = j2;
                                    if (n2 != 0) break block5;
                                    bl3 = j3.N();
                                }
                                if (!bl3) break block6;
                                j3 = j2;
                                if (n2 != 0) break block5;
                                if (!(j3.as() instanceof O)) break block6;
                                O o2 = (O)j2.as();
                                if (n2 != 0) break block7;
                                if (d10.E() - d10.d() < 7) break block6;
                                bl2 = o2.D();
                                if (n2 != 0) break block8;
                                if (!bl2) break block6;
                                d10.a(7, (B)j2);
                                d11 = d10;
                                if (n2 != 0) break block9;
                                bl2 = d11.G();
                            }
                            if (!bl2) break block10;
                            d11 = new d(net.minecraft.u.h.bQ);
                        }
                        d d12 = d11;
                        d12.b(d10.v());
                        return new t<d>(aX.SUCCESS, d12);
                    }
                    return new t<d>(aX.SUCCESS, d10);
                }
                j3 = j2;
            }
            j3.b(m.b(this));
        }
        return new t<d>(aX.PASS, d10);
    }
}

