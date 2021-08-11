/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.N.E;
import net.minecraft.N.y;
import net.minecraft.U.B;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;

public class ab
extends ak {
    protected static final /* synthetic */ k z;

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, B b10, d d10) {
        block2: {
            y y2;
            block3: {
                y y3;
                boolean bl2 = cL.b();
                super.a(z2, n2, i2, b10, d10);
                boolean bl3 = bl2;
                if (!d10.c()) break block2;
                y2 = y3 = z2.b(n2);
                if (bl3) break block3;
                if (!(y2 instanceof E)) break block2;
                y2 = y3;
            }
            ((E)y2).a(d10.g());
        }
    }

    static {
        z = new k(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(i var1_1, z var2_2, n var3_3, Random var4_4) {
        v0 = cL.e();
        super.a(var1_1, var2_2, var3_3, var4_4);
        var5_5 = v0;
        var6_6 = -2;
        do {
            v1 = var6_6;
            v2 = 2;
            block1: while (true) {
                if (v1 > v2) return;
                var7_7 = -2;
                while (var7_7 <= 2) {
                    block15: {
                        block16: {
                            v3 = var6_6;
                            if (!var5_5) break block15;
                            v2 = -2;
                            if (!var5_5) continue block1;
                            if (v3 <= v2) break block16;
                            v3 = var6_6;
                            if (!var5_5) break block15;
                            if (v3 >= 2) break block16;
                            v3 = var7_7;
                            if (!var5_5) break block15;
                            if (v3 == -1) {
                                var7_7 = 2;
                            }
                        }
                        v3 = var4_4.nextInt(16);
                    }
                    if (!var5_5) ** GOTO lbl30
                    if (v3 == 0) {
                        v3 = var8_8 = 0;
lbl30:
                        // 3 sources

                        while (var8_8 <= 1) {
                            var9_9 = var3_3.a(var6_6, var8_8, var7_7);
                            if (var5_5) {
                                if (var5_5) {
                                    if (var2_2.d(var9_9).b() == g.c8) {
                                        v4 = var2_2;
                                        if (var5_5) {
                                            if (!v4.a(var3_3.a(var6_6 / 2, 0, var7_7 / 2)) && var5_5) break;
                                            v4 = var2_2;
                                        }
                                        v4.a(aH.ENCHANTMENT_TABLE, (double)var3_3.e() + 0.5, (double)var3_3.b() + 2.0, (double)var3_3.a() + 0.5, (double)((float)var6_6 + var4_4.nextFloat()) - 0.5, (double)((float)var8_8 - var4_4.nextFloat() - 1.0f), (double)((float)var7_7 + var4_4.nextFloat()) - 0.5, new int[0]);
                                    }
                                    ++var8_8;
                                }
                                if (var5_5) continue;
                            }
                            break;
                        }
                    } else {
                        ++var7_7;
                    }
                    if (var5_5) continue;
                }
                break;
            }
            ++var6_6;
        } while (var5_5);
    }

    protected ab() {
        super(net.minecraft.ac.c.H, net.minecraft.ac.a.W);
        this.d(0);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }

    @Override
    public y a(z z2, int n2) {
        return new E();
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.b();
        z z3 = z2;
        if (!bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof E;
        if (!bl2) {
            if (bl3) {
                j2.a((E)y2);
            }
            bl3 = true;
        }
        return bl3;
    }
}

