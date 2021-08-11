/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.bk;
import net.minecraft.W.cV;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class aD
extends aH {
    protected /* synthetic */ int h;

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.a((aV)u2, list, random, 4, 1);
        this.c((aV)u2, list, random, 1, 4);
        this.b((aV)u2, list, random, 1, 4);
    }

    public aD(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
        this.h = random.nextInt(5);
    }

    public static aD a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -4, -1, 0, 11, 7, 11, aA2);
        return aD.a(b10) && u.a(list, b10) == null ? new aD(n5, random, b10, aA2) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("Type", this.h);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z var1_1, Random var2_2, b var3_3) {
        var4_4 = u.b();
        v0 = this.a(var1_1, var3_3);
        if (var4_4 != null) {
            if (v0 != 0) {
                return false;
            }
            this.a(var1_1, var3_3, 0, 0, 0, 10, 6, 10, true, var2_2, b7.b());
            this.a(var1_1, var2_2, var3_3, this.g, 4, 1, 0);
            this.a(var1_1, var3_3, 4, 1, 10, 6, 3, 10, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            this.a(var1_1, var3_3, 0, 1, 4, 0, 3, 6, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            this.a(var1_1, var3_3, 10, 1, 4, 10, 3, 6, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            v0 = this.h;
        }
        if (var4_4 == null) return (boolean)v0;
        switch (v0 ? 1 : 0) {
            case 0: {
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 2, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 3, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.h.d().a(cV.z, aA.WEST), 4, 3, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.h.d().a(cV.z, aA.EAST), 6, 3, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.h.d().a(cV.z, aA.SOUTH), 5, 3, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.h.d().a(cV.z, aA.NORTH), 5, 3, 6, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 4, 1, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 4, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 4, 1, 6, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 6, 1, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 6, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 6, 1, 6, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 5, 1, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.bO.d(), 5, 1, 6, var3_3);
                if (var4_4 != null) return (boolean)1;
            }
            case 1: {
                for (var5_5 = 0; var5_5 < 5; ++var5_5) {
                    this.a(var1_1, net.minecraft.u.g.ay.d(), 3, 1, 3 + var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.ay.d(), 7, 1, 3 + var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.ay.d(), 3 + var5_5, 1, 3, var3_3);
                    this.a(var1_1, net.minecraft.u.g.ay.d(), 3 + var5_5, 1, 7, var3_3);
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    ** GOTO lbl44
                }
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 2, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.ay.d(), 5, 3, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.cL.d(), 5, 4, 5, var3_3);
lbl44:
                // 2 sources

                if (var4_4 != null) return (boolean)1;
            }
            case 2: {
                for (var5_5 = 1; var5_5 <= 9; ++var5_5) {
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 1, 3, var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 9, 3, var5_5, var3_3);
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    ** GOTO lbl53
                }
                var5_5 = 1;
lbl53:
                // 3 sources

                while (var5_5 <= 9) {
                    this.a(var1_1, net.minecraft.u.g.cW.d(), var5_5, 3, 1, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cW.d(), var5_5, 3, 9, var3_3);
                    ++var5_5;
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    ** GOTO lbl68
                }
                this.a(var1_1, net.minecraft.u.g.cW.d(), 5, 1, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 5, 1, 6, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 5, 3, 4, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 5, 3, 6, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 4, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 6, 1, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 4, 3, 5, var3_3);
                this.a(var1_1, net.minecraft.u.g.cW.d(), 6, 3, 5, var3_3);
lbl68:
                // 3 sources

                for (var5_5 = 1; var5_5 <= 3; ++var5_5) {
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 4, var5_5, 4, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 6, var5_5, 4, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 4, var5_5, 6, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cW.d(), 6, var5_5, 6, var3_3);
                    if (var4_4 != null) {
                        if (var4_4 != null) continue;
                    }
                    ** GOTO lbl77
                }
                this.a(var1_1, net.minecraft.u.g.h.d(), 5, 3, 5, var3_3);
lbl77:
                // 3 sources

                for (var5_5 = 2; var5_5 <= 8; ++var5_5) {
                    this.a(var1_1, net.minecraft.u.g.cB.d(), 2, 3, var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cB.d(), 3, 3, var5_5, var3_3);
                    if (var4_4 == null) ** GOTO lbl86
                    v0 = var5_5;
                    if (var4_4 == null) return (boolean)v0;
                    if (v0 > 3 && var5_5 < 7) ** GOTO lbl87
                    this.a(var1_1, net.minecraft.u.g.cB.d(), 4, 3, var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cB.d(), 5, 3, var5_5, var3_3);
lbl86:
                    // 2 sources

                    this.a(var1_1, net.minecraft.u.g.cB.d(), 6, 3, var5_5, var3_3);
lbl87:
                    // 2 sources

                    this.a(var1_1, net.minecraft.u.g.cB.d(), 7, 3, var5_5, var3_3);
                    this.a(var1_1, net.minecraft.u.g.cB.d(), 8, 3, var5_5, var3_3);
                    if (var4_4 != null) continue;
                }
                var5_6 = net.minecraft.u.g.cD.d().a(bk.z, aA.WEST);
                this.a(var1_1, var5_6, 9, 1, 3, var3_3);
                this.a(var1_1, var5_6, 9, 2, 3, var3_3);
                this.a(var1_1, var5_6, 9, 3, 3, var3_3);
                this.a(var1_1, var3_3, var2_2, 3, 4, 8, net.minecraft.aj.j.R);
            }
        }
        return (boolean)1;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.m("Type");
    }

    public aD() {
    }
}

