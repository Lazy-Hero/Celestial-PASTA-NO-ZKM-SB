/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.N.W;
import net.minecraft.N.y;
import net.minecraft.W.aM;
import net.minecraft.W.ar;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.w.s;

public class ah
extends k {
    public ah() {
        this.f = 16;
        this.a(net.minecraft.ad.a.j);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block10: {
            block14: {
                boolean bl2;
                d d10;
                block18: {
                    block19: {
                        int n3;
                        block17: {
                            block16: {
                                boolean bl3;
                                boolean bl4;
                                block15: {
                                    block13: {
                                        boolean bl5;
                                        block11: {
                                            block12: {
                                                i i2 = z2.d(n2);
                                                bl4 = i2.b().b((t)z2, n2);
                                                n3 = bl.g();
                                                if (aA2 == aA.DOWN) break block10;
                                                bl5 = i2.o().d();
                                                if (n3 == 0) break block11;
                                                if (bl5) break block12;
                                                bl5 = bl4;
                                                if (n3 == 0) break block11;
                                                if (!bl5) break block10;
                                            }
                                            bl5 = bl4;
                                        }
                                        if (bl5 && aA2 != aA.UP) break block10;
                                        n2 = n2.a(aA2);
                                        d10 = j2.c(a32);
                                        bl3 = j2.a(n2, aA2, d10);
                                        if (n3 == 0) break block13;
                                        if (!bl3) break block14;
                                        bl3 = g.aR.a(z2, n2);
                                    }
                                    if (n3 == 0) break block15;
                                    if (!bl3) break block14;
                                    bl3 = z2.C;
                                }
                                if (n3 != 0) {
                                    if (bl3) {
                                        return aX.SUCCESS;
                                    }
                                    bl3 = bl4;
                                }
                                n n4 = n2 = bl3 ? n2.k() : n2;
                                if (aA2 != aA.UP) break block16;
                                int n5 = net.minecraft.k.h.f((double)((j2.e + 180.0f) * 16.0f / 360.0f) + 0.5) & 0xF;
                                z2.a(n2, g.aR.d().a(ar.A, n5), 11);
                                if (n3 != 0) break block17;
                            }
                            z2.a(n2, g.b0.d().a(aM.D, aA2), 11);
                        }
                        y y2 = z2.b(n2);
                        bl2 = y2 instanceof W;
                        if (n3 == 0) break block18;
                        if (!bl2) break block19;
                        bl2 = s.a(z2, j2, n2, d10);
                        if (n3 == 0) break block18;
                        if (!bl2) {
                            j2.a((W)y2);
                        }
                    }
                    bl2 = j2 instanceof net.minecraft.i.k;
                }
                if (bl2) {
                    a6.s.a((net.minecraft.i.k)j2, n2, d10);
                }
                d10.b(1);
                return aX.SUCCESS;
            }
            return aX.FAIL;
        }
        return aX.FAIL;
    }
}

