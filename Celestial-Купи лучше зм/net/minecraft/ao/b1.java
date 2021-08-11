/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.a4;
import net.minecraft.ao.ac;
import net.minecraft.ao.am;
import net.minecraft.ao.h;
import net.minecraft.ao.u;

public class b1
extends ac {
    private /* synthetic */ boolean e;

    private static gP a(gP gP2) {
        return gP2;
    }

    public b1() {
    }

    @Override
    public void a(r r2) {
        super.a(r2);
        this.e = r2.f("Valid");
    }

    @Override
    public void b(r r2) {
        super.b(r2);
        r2.a("Valid", this.e);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public b1(z var1_1, Random var2_2, int var3_3, int var4_4, int var5_5) {
        block8: {
            super(var3_3, var4_4);
            var7_6 = h.a(var2_2, var5_5);
            var6_7 = u.b();
            var8_8 = new a4(var1_1.B(), 0, var2_2, (var3_3 << 4) + 2, (var4_4 << 4) + 2, var7_6, var5_5);
            this.c.add(var8_8);
            var8_8.a(var8_8, this.c, var2_2);
            var9_9 = var8_8.o;
            var10_10 = var8_8.k;
            do lbl-1000:
            // 3 sources

            {
                block9: {
                    block10: {
                        if (var9_9.isEmpty()) {
                            v0 = var10_10.isEmpty();
                            if (var6_7 != null) {
                                if (var6_7 != null) {
                                    if (v0 != 0) break;
                                }
                                break block8;
                            }
                        } else {
                            v0 = var9_9.isEmpty();
                        }
                        if (var6_7 == null) break block9;
                        if (v0 == 0) break block10;
                        var11_11 = var2_2.nextInt(var10_10.size());
                        var12_14 = var10_10.remove(var11_11);
                        var12_14.a(var8_8, this.c, var2_2);
                        if (var6_7 != null) ** GOTO lbl-1000
                    }
                    v0 = var2_2.nextInt(var9_9.size());
                }
                var11_11 = v0;
                var12_14 = var9_9.remove(var11_11);
                var12_14.a(var8_8, this.c, var2_2);
            } while (var6_7 != null);
            this.c();
            v1 = false;
        }
        var11_12 = v1;
        for (u var13_15 : this.c) {
            if (var6_7 == null) return;
            if (!(var13_15 instanceof am)) {
                ++var11_13;
            }
            if (var6_7 != null) continue;
        }
        v2 = var11_13;
        if (var6_7 != null) {
            v2 = v2 > 2 ? 1 : 0;
        }
        this.e = v2;
    }

    @Override
    public boolean a() {
        return this.e;
    }
}

