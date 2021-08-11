/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.D;
import net.minecraft.W.K;
import net.minecraft.W.bc;
import net.minecraft.W.cs;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ag.Q;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class P
extends k {
    public static final /* synthetic */ int[] s;

    public static void a(z z2, n n2, int n3) {
        i i2;
        int n4 = bl.g();
        int n5 = n3;
        if (n4 != 0 && n5 == 0) {
            n5 = n3 = 15;
        }
        if ((i2 = z2.d(n2)).o() != c.A) {
            for (int i3 = 0; i3 < n3; ++i3) {
                double d10 = r.nextGaussian() * 0.02;
                double d11 = r.nextGaussian() * 0.02;
                double d12 = r.nextGaussian() * 0.02;
                z2.a(aH.VILLAGER_HAPPY, (double)((float)n2.e() + r.nextFloat()), (double)n2.b() + (double)r.nextFloat() * i2.f((t)z2, (n)n2).a, (double)((float)n2.a() + r.nextFloat()), d10, d11, d12, new int[0]);
                if (n4 != 0) continue;
            }
        }
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block13: {
            block16: {
                d d10;
                block19: {
                    block18: {
                        aA aA3;
                        aA aA4;
                        block17: {
                            bl bl2;
                            bl bl3;
                            int n3;
                            block10: {
                                bl bl4;
                                block11: {
                                    block15: {
                                        z z3;
                                        block14: {
                                            boolean bl5;
                                            block12: {
                                                d10 = j2.c(a32);
                                                n3 = bl.c();
                                                int n4 = j2.a(n2.a(aA2), aA2, d10);
                                                if (n3 == 0) {
                                                    if (n4 == 0) {
                                                        return aX.FAIL;
                                                    }
                                                    n4 = d10.d();
                                                }
                                                bl bl2 = bl4 = bl.d(n4);
                                                bl2 = bl.WHITE;
                                                if (n3 != 0) break block10;
                                                if (bl3 != bl2) break block11;
                                                bl5 = P.a(d10, z2, n2);
                                                if (n3 != 0) break block12;
                                                if (!bl5) break block13;
                                                z3 = z2;
                                                if (n3 != 0) break block14;
                                                bl5 = z3.C;
                                            }
                                            if (bl5) break block15;
                                            z3 = z2;
                                        }
                                        z3.b(2005, n2, 0);
                                    }
                                    return aX.SUCCESS;
                                }
                                bl bl2 = bl4;
                                bl2 = bl.BROWN;
                            }
                            if (bl3 != bl2) break block13;
                            i i2 = z2.d(n2);
                            K k2 = i2.b();
                            if (k2 != g.bu || i2.b(bc.B) != D.JUNGLE) break block16;
                            aA aA3 = aA2;
                            aA3 = aA.DOWN;
                            if (n3 != 0) break block17;
                            if (aA4 == aA3) break block18;
                            aA aA3 = aA2;
                            aA3 = aA.UP;
                        }
                        if (aA4 != aA3) break block19;
                    }
                    return aX.FAIL;
                }
                if (z2.a(n2 = n2.a(aA2))) {
                    i i3 = g.cT.a(z2, n2, aA2, f10, f11, f12, 0, j2);
                    z2.a(n2, i3, 10);
                    if (!j2.cw.g) {
                        d10.b(1);
                    }
                    return aX.SUCCESS;
                }
            }
            return aX.FAIL;
        }
        return aX.PASS;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public String d(d d10) {
        int n2 = d10.d();
        return super.h() + "." + bl.d(n2).d();
    }

    public static boolean a(d d10, z z2, n n2) {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                block4: {
                    block5: {
                        block7: {
                            i i2;
                            n n3;
                            Random random;
                            z z3;
                            cs cs2;
                            block6: {
                                i i3 = z2.d(n2);
                                int n4 = bl.c();
                                bl2 = i3.b() instanceof cs;
                                if (n4 != 0) break block2;
                                if (!bl2) break block3;
                                cs cs3 = (cs)((Object)i3.b());
                                bl2 = cs3.a(z2, n2, i3, z2.C);
                                if (n4 != 0) break block2;
                                if (!bl2) break block3;
                                bl3 = z2.C;
                                if (n4 != 0) break block4;
                                if (bl3) break block5;
                                cs2 = cs3;
                                z3 = z2;
                                random = z2.J;
                                n3 = n2;
                                i2 = i3;
                                if (n4 != 0) break block6;
                                if (!cs2.a(z3, random, n3, i2)) break block7;
                                cs2 = cs3;
                                z3 = z2;
                                random = z2.J;
                                n3 = n2;
                                i2 = i3;
                            }
                            cs2.b(z3, random, n3, i2);
                        }
                        d10.b(1);
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block4: {
            int n2;
            int n3;
            block3: {
                n3 = bl.g();
                int n4 = this.b(a10);
                if (n3 == 0) break block3;
                if (n4 == 0) break block4;
                n4 = n2 = 0;
            }
            while (n2 < 16) {
                a22.add(new d(this, 1, n2));
                ++n2;
                if (n3 != 0) continue;
            }
        }
    }

    public P() {
        this.a(true);
        this.d(0);
        this.a(net.minecraft.ad.a.m);
    }

    static {
        s = new int[]{0x1E1B1B, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 0xABABAB, 0x434343, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 0xF0F0F0};
    }

    @Override
    public boolean a(d d10, j j2, B b10, a3 a32) {
        boolean bl2;
        block2: {
            block3: {
                boolean bl3;
                block4: {
                    block5: {
                        Q q2;
                        bl bl4;
                        block6: {
                            int n2 = bl.c();
                            bl2 = b10 instanceof Q;
                            if (n2 != 0) break block2;
                            if (!bl2) break block3;
                            Q q3 = (Q)b10;
                            bl4 = bl.d(d10.d());
                            bl3 = q3.b();
                            if (n2 != 0) break block4;
                            if (bl3) break block5;
                            q2 = q3;
                            if (n2 != 0) break block6;
                            if (q2.a() == bl4) break block5;
                            q2 = q3;
                        }
                        q2.b(bl4);
                        d10.b(1);
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }
}

