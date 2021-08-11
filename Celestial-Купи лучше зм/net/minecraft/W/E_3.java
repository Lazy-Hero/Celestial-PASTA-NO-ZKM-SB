/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.W.cX;
import net.minecraft.W.d_;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.w.s;

public class E
extends k {
    private final /* synthetic */ K s;

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block15: {
            K k2;
            d d10;
            block17: {
                block18: {
                    boolean bl2;
                    int n3;
                    block16: {
                        block14: {
                            block13: {
                                int n4;
                                block12: {
                                    K k3;
                                    block10: {
                                        K k4;
                                        block11: {
                                            i i2 = z2.d(n2);
                                            n3 = bl.g();
                                            k3 = k4 = i2.b();
                                            if (n3 == 0) break block10;
                                            if (k3 != g.o) break block11;
                                            n4 = i2.b(cX.A);
                                            if (n3 == 0) break block12;
                                            if (n4 >= 1) break block11;
                                            aA2 = aA.UP;
                                            if (n3 != 0) break block13;
                                        }
                                        k3 = k4;
                                    }
                                    n4 = k3.b((t)z2, n2);
                                }
                                if (n4 == 0) {
                                    n2 = n2.a(aA2);
                                }
                            }
                            d10 = j2.c(a32);
                            bl2 = d10.G();
                            if (n3 == 0) break block14;
                            if (bl2) break block15;
                            bl2 = j2.a(n2, aA2, d10);
                        }
                        if (n3 == 0) break block16;
                        if (!bl2) break block15;
                        bl2 = z2.a(this.s, n2, false, aA2, null);
                    }
                    if (!bl2) break block15;
                    i i3 = this.s.a(z2, n2, aA2, f10, f11, f12, 0, j2);
                    z z3 = z2;
                    n n5 = n2;
                    if (n3 != 0) {
                        if (!z3.a(n5, i3, 11)) {
                            return aX.FAIL;
                        }
                        z3 = z2;
                        n5 = n2;
                    }
                    i3 = z3.d(n5);
                    k2 = i3.b();
                    if (n3 == 0) break block17;
                    if (k2 != this.s) break block18;
                    net.minecraft.w.s.a(z2, j2, n2, d10);
                    k2 = i3.b();
                    if (n3 == 0) break block17;
                    k2.a(z2, n2, i3, j2, d10);
                    if (j2 instanceof net.minecraft.i.k) {
                        a6.s.a((net.minecraft.i.k)j2, n2, d10);
                    }
                }
                k2 = this.s;
            }
            d_ d_2 = k2.l();
            z2.a(j2, n2, d_2.a(), ay.BLOCKS, (d_2.c() + 1.0f) / 2.0f, d_2.e() * 0.8f);
            d10.b(1);
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public E(K k2) {
        this.s = k2;
    }
}

