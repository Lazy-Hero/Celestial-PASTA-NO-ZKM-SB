/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.W.G;
import net.minecraft.W.aB;
import net.minecraft.W.aI;
import net.minecraft.ah.z;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.bh;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

abstract class aH
extends u {
    protected /* synthetic */ ai g;

    @Override
    protected void a(r r2) {
        r2.a("EntryDoor", this.g.name());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static boolean a(b b10) {
        String[] arrstring = u.b();
        b b11 = b10;
        if (arrstring != null) {
            if (b11 == null) return 0 != 0;
            b11 = b10;
        }
        int n2 = b11.e;
        if (arrstring == null) return n2 != 0;
        if (n2 <= 10) return 0 != 0;
        return 1 != 0;
    }

    @Nullable
    protected u b(aV aV2, List<u> list, Random random, int n2, int n3) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return b7.b(aV2, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d());
                }
                case SOUTH: {
                    return b7.b(aV2, list, random, this.e.a + 1, this.e.e + n2, this.e.f + n3, aA.EAST, this.d());
                }
                case WEST: {
                    return b7.b(aV2, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d());
                }
                case EAST: {
                    return b7.b(aV2, list, random, this.e.c + n3, this.e.e + n2, this.e.d + 1, aA.SOUTH, this.d());
                }
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(z var1_1, Random var2_2, b var3_3, ai var4_4, int var5_5, int var6_6, int var7_7) {
        var8_8 = u.b();
        if (var8_8 == null) ** GOTO lbl6
        switch (bh.b[var4_4.ordinal()]) {
            case 1: {
                this.a(var1_1, var3_3, var5_5, var6_6, var7_7, var5_5 + 3 - 1, var6_6 + 3 - 1, var7_7, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
lbl6:
                // 2 sources

                if (var8_8 != null) return;
            }
            case 2: {
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 1, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.aJ.d(), var5_5 + 1, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.aJ.d().a(aB.D, G.UPPER), var5_5 + 1, var6_6 + 1, var7_7, var3_3);
                if (var8_8 != null) return;
            }
            case 3: {
                this.a(var1_1, net.minecraft.u.g.bf.d(), var5_5 + 1, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.bf.d(), var5_5 + 1, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5 + 1, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5 + 2, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5 + 2, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.dd.d(), var5_5 + 2, var6_6, var7_7, var3_3);
                if (var8_8 != null) return;
            }
            case 4: {
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 1, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6 + 2, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), var5_5 + 2, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.bL.d(), var5_5 + 1, var6_6, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.bL.d().a(aB.D, G.UPPER), var5_5 + 1, var6_6 + 1, var7_7, var3_3);
                this.a(var1_1, net.minecraft.u.g.aI.d().a(aI.z, aA.NORTH), var5_5 + 2, var6_6 + 1, var7_7 + 1, var3_3);
                this.a(var1_1, net.minecraft.u.g.aI.d().a(aI.z, aA.SOUTH), var5_5 + 2, var6_6 + 1, var7_7 - 1, var3_3);
                return;
            }
        }
    }

    public aH() {
        this.g = ai.OPENING;
    }

    protected ai a(Random random) {
        int n2 = random.nextInt(5);
        switch (n2) {
            default: {
                return ai.OPENING;
            }
            case 2: {
                return ai.WOOD_DOOR;
            }
            case 3: {
                return ai.GRATES;
            }
            case 4: 
        }
        return ai.IRON_DOOR;
    }

    @Override
    protected void a(r r2, j j2) {
        this.g = ai.valueOf(r2.j("EntryDoor"));
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Nullable
    protected u a(aV aV2, List<u> list, Random random, int n2, int n3) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return b7.b(aV2, list, random, this.e.c + n2, this.e.e + n3, this.e.f - 1, aA2, this.d());
                }
                case SOUTH: {
                    return b7.b(aV2, list, random, this.e.c + n2, this.e.e + n3, this.e.d + 1, aA2, this.d());
                }
                case WEST: {
                    return b7.b(aV2, list, random, this.e.c - 1, this.e.e + n3, this.e.f + n2, aA2, this.d());
                }
                case EAST: {
                    return b7.b(aV2, list, random, this.e.a + 1, this.e.e + n3, this.e.f + n2, aA2, this.d());
                }
            }
        }
        return null;
    }

    @Nullable
    protected u c(aV aV2, List<u> list, Random random, int n2, int n3) {
        aA aA2 = this.e();
        if (aA2 != null) {
            switch (aA2) {
                case NORTH: {
                    return b7.b(aV2, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d());
                }
                case SOUTH: {
                    return b7.b(aV2, list, random, this.e.c - 1, this.e.e + n2, this.e.f + n3, aA.WEST, this.d());
                }
                case WEST: {
                    return b7.b(aV2, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d());
                }
                case EAST: {
                    return b7.b(aV2, list, random, this.e.c + n3, this.e.e + n2, this.e.f - 1, aA.NORTH, this.d());
                }
            }
        }
        return null;
    }

    protected aH(int n2) {
        super(n2);
        this.g = ai.OPENING;
    }
}

