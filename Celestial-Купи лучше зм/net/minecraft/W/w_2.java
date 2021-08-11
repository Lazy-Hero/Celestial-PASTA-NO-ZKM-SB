/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.W.bq;
import net.minecraft.a6;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.ar.t;
import net.minecraft.i.k;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.v;

public class w
extends v {
    @Override
    public t<d> a(z z2, net.minecraft.i.j j2, a3 a32) {
        d d10;
        block11: {
            net.minecraft.i.j j3;
            n n2;
            block19: {
                int n3;
                block18: {
                    n n4;
                    int n5;
                    block17: {
                        block16: {
                            net.minecraft.Z.i i2;
                            block15: {
                                net.minecraft.Z.i i3;
                                block14: {
                                    block13: {
                                        boolean bl2;
                                        block12: {
                                            i i4;
                                            i i5;
                                            block10: {
                                                d10 = j2.c(a32);
                                                i5 = this.a(z2, j2, true);
                                                n5 = bl.c();
                                                i4 = i5;
                                                if (n5 == 0) {
                                                    if (i4 == null) {
                                                        return new t<d>(aX.PASS, d10);
                                                    }
                                                    i4 = i5;
                                                }
                                                if (n5 != 0) break block10;
                                                if (i4.d != j.BLOCK) break block11;
                                                i4 = i5;
                                            }
                                            n2 = i4.a();
                                            bl2 = z2.a(j2, n2);
                                            if (n5 != 0) break block12;
                                            if (!bl2) break block13;
                                            bl2 = j2.a(n2.a(i5.b), i5.b, d10);
                                        }
                                        if (bl2) break block14;
                                    }
                                    return new t<d>(aX.FAIL, d10);
                                }
                                n4 = n2.a();
                                i2 = i3 = z2.d(n2);
                                if (n5 != 0) break block15;
                                if (i2.o() != c.L) break block11;
                                i2 = i3;
                            }
                            n3 = i2.b(bq.z);
                            if (n5 != 0) break block16;
                            if (n3 != 0) break block11;
                            n3 = z2.a(n4) ? 1 : 0;
                        }
                        if (n5 != 0) break block17;
                        if (n3 == 0) break block11;
                        z2.a(n4, g.c_.d(), 11);
                        n3 = j2 instanceof k;
                    }
                    if (n5 != 0) break block18;
                    if (n3 != 0) {
                        a6.s.a((k)j2, n4, d10);
                    }
                    j3 = j2;
                    if (n5 != 0) break block19;
                    n3 = j3.cw.g ? 1 : 0;
                }
                if (n3 == 0) {
                    d10.b(1);
                }
                j3 = j2;
            }
            j3.b(m.b(this));
            z2.a(j2, n2, E.cr, ay.BLOCKS, 1.0f, 1.0f);
            return new t<d>(aX.SUCCESS, d10);
        }
        return new t<d>(aX.FAIL, d10);
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public w(K k2) {
        super(k2, false);
    }
}

