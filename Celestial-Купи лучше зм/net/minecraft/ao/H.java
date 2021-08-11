/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.ah.z;
import net.minecraft.ao.D;
import net.minecraft.ao.aI;
import net.minecraft.ao.aP;
import net.minecraft.ao.aQ;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class H
extends D {
    @Override
    public void a(u u2, List<u> list, Random random) {
        int n2 = this.d();
        String[] arrstring = u.b();
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                default: {
                    aP.a(u2, list, random, this.e.c, this.e.e, this.e.f - 1, aA.NORTH, n2);
                    if (arrstring != null) break;
                }
                case SOUTH: {
                    aP.a(u2, list, random, this.e.c, this.e.e, this.e.d + 1, aA.SOUTH, n2);
                    if (arrstring != null) break;
                }
                case WEST: {
                    aP.a(u2, list, random, this.e.c - 1, this.e.e, this.e.f, aA.WEST, n2);
                    if (arrstring != null) break;
                }
                case EAST: {
                    aP.a(u2, list, random, this.e.a + 1, this.e.e, this.e.f, aA.EAST, n2);
                    break;
                }
            }
        }
    }

    public H(int n2, Random random, b b10, aA aA2, aQ aQ2) {
        super(n2, aQ2);
        this.a(aA2);
        this.e = b10;
    }

    public H() {
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        String[] arrstring = u.b();
        int n3 = this.a(z2, b10);
        if (arrstring != null) {
            if (n3 != 0) {
                return false;
            }
            this.a(z2, b10, 0, 5, 0, 2, 7, 1, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            this.a(z2, b10, 0, 0, 7, 2, 2, 8, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            n3 = n2 = 0;
        }
        while (n2 < 5) {
            int n4 = n2;
            if (arrstring != null) {
                n4 = n4 < 4 ? 1 : 0;
            }
            this.a(z2, b10, 0, 5 - n2 - n4, 2 + n2, 2, 7 - n2, 2 + n2, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            ++n2;
            if (arrstring != null) continue;
        }
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static b a(List<u> var0, Random var1_1, int var2_2, int var3_3, int var4_4, aA var5_5) {
        var7_6 = new b(var2_2, var3_3 - 5, var4_4, var2_2, var3_3 + 2, var4_4);
        var6_7 = u.b();
        if (var6_7 == null) ** GOTO lbl19
        switch (aI.b[var5_5.ordinal()]) {
            default: {
                var7_6.a = var2_2 + 2;
                var7_6.f = var4_4 - 8;
                if (var6_7 != null) break;
            }
            case 2: {
                var7_6.a = var2_2 + 2;
                var7_6.d = var4_4 + 8;
                if (var6_7 != null) break;
            }
            case 3: {
                var7_6.c = var2_2 - 8;
                var7_6.d = var4_4 + 2;
                if (var6_7 != null) break;
            }
            case 4: {
                var7_6.a = var2_2 + 8;
lbl19:
                // 2 sources

                var7_6.d = var4_4 + 2;
            }
        }
        if (u.a(var0, var7_6) != null) {
            return null;
        }
        v0 = var7_6;
        return v0;
    }
}

