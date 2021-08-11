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
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class D
extends s {
    @Override
    public int c(int n2) {
        return n2;
    }

    public D(K k2) {
        super(k2);
        this.d(0);
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block11: {
            block16: {
                boolean bl2;
                n n3;
                int n4;
                d d10;
                block17: {
                    i i2;
                    k k2;
                    int n5;
                    K k3;
                    K k4;
                    i i3;
                    block13: {
                        block15: {
                            K k5;
                            block14: {
                                block12: {
                                    boolean bl3;
                                    block10: {
                                        d10 = j2.c(a32);
                                        n4 = bl.g();
                                        bl3 = d10.G();
                                        if (n4 == 0) break block10;
                                        if (bl3) break block11;
                                        bl3 = j2.a(n2, aA2, d10);
                                    }
                                    if (!bl3) break block11;
                                    i3 = z2.d(n2);
                                    k5 = i3.b();
                                    n3 = n2;
                                    if (aA2 != aA.UP) break block12;
                                    k4 = k5;
                                    k3 = this.s;
                                    if (n4 == 0) break block13;
                                    if (k4 == k3) break block14;
                                }
                                k4 = k5;
                                if (n4 == 0) break block15;
                                if (!k4.b((t)z2, n2)) {
                                    n3 = n2.a(aA2);
                                    i3 = z2.d(n3);
                                    k5 = i3.b();
                                }
                            }
                            k4 = k5;
                        }
                        k3 = this.s;
                    }
                    if (k4 != k3 || (n5 = i3.b(cX.A).intValue()) >= 8 || (k2 = (i2 = i3.a(cX.A, n5 + 1)).d(z2, n3)) == K.a) break block16;
                    bl2 = z2.e(k2.a(n3));
                    if (n4 == 0) break block17;
                    if (!bl2) break block16;
                    bl2 = z2.a(n3, i2, 10);
                }
                if (bl2) {
                    d_ d_2 = this.s.l();
                    z2.a(j2, n3, d_2.a(), ay.BLOCKS, (d_2.c() + 1.0f) / 2.0f, d_2.e() * 0.8f);
                    if (n4 != 0) {
                        if (j2 instanceof net.minecraft.i.k) {
                            a6.s.a((net.minecraft.i.k)j2, n2, d10);
                        }
                        d10.b(1);
                    }
                    return aX.SUCCESS;
                }
            }
            return super.a(j2, z2, n2, a32, aA2, f10, f11, f12);
        }
        return aX.FAIL;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

