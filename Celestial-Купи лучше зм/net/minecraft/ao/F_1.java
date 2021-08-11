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
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.D;
import net.minecraft.ao.aI;
import net.minecraft.ao.aP;
import net.minecraft.ao.aQ;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class F
extends D {
    private /* synthetic */ aA i;
    private /* synthetic */ boolean h;

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("tf");
        this.i = aA.b(r2.m("D"));
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("tf", this.h);
        r2.b("D", this.i.k());
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block11: {
            i i2;
            String[] arrstring;
            block14: {
                F f10;
                block12: {
                    block13: {
                        arrstring = u.b();
                        F f11 = this;
                        if (arrstring != null) {
                            if (f11.a(z2, b10)) {
                                return false;
                            }
                            f11 = this;
                        }
                        i2 = f11.a();
                        f10 = this;
                        if (arrstring == null) break block12;
                        if (!f10.h) break block13;
                        this.a(z2, b10, this.e.c + 1, this.e.e, this.e.f, this.e.a - 1, this.e.e + 3 - 1, this.e.d, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.e.c, this.e.e, this.e.f + 1, this.e.a, this.e.e + 3 - 1, this.e.d - 1, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.e.c + 1, this.e.b - 2, this.e.f, this.e.a - 1, this.e.b, this.e.d, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.e.c, this.e.b - 2, this.e.f + 1, this.e.a, this.e.b, this.e.d - 1, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        this.a(z2, b10, this.e.c + 1, this.e.e + 3, this.e.f + 1, this.e.a - 1, this.e.e + 3, this.e.d - 1, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                        if (arrstring != null) break block14;
                    }
                    this.a(z2, b10, this.e.c + 1, this.e.e, this.e.f, this.e.a - 1, this.e.b, this.e.d, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                    f10 = this;
                }
                f10.a(z2, b10, this.e.c, this.e.e, this.e.f + 1, this.e.a, this.e.b, this.e.d - 1, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            this.a(z2, b10, this.e.c + 1, this.e.e, this.e.f + 1, this.e.b);
            this.a(z2, b10, this.e.c + 1, this.e.e, this.e.d - 1, this.e.b);
            this.a(z2, b10, this.e.a - 1, this.e.e, this.e.f + 1, this.e.b);
            this.a(z2, b10, this.e.a - 1, this.e.e, this.e.d - 1, this.e.b);
            for (int i3 = this.e.c; i3 <= this.e.a; ++i3) {
                F f12 = this;
                block1: while (true) {
                    n2 = f12.e.f;
                    if (arrstring == null) break block11;
                    for (int i4 = v450828; i4 <= this.e.d; ++i4) {
                        F f13;
                        z z3;
                        block16: {
                            b b11;
                            int n3;
                            int n4;
                            int n5;
                            block15: {
                                f12 = this;
                                if (arrstring == null) continue block1;
                                z3 = z2;
                                n5 = i3;
                                n4 = this.e.e - 1;
                                n3 = i4;
                                b11 = b10;
                                if (arrstring == null) break block15;
                                if (f12.b(z3, n5, n4, n3, b11).o() != net.minecraft.ac.c.A) continue;
                                f13 = this;
                                z3 = z2;
                                if (arrstring == null) break block16;
                                n5 = i3;
                                n4 = this.e.e - 1;
                                n3 = i4;
                                b11 = b10;
                            }
                            if (f13.c(z3, n5, n4, n3, b11) >= 8) continue;
                            f13 = this;
                            z3 = z2;
                        }
                        f13.a(z3, i2, i3, this.e.e - 1, i4, b10);
                        if (arrstring != null) continue;
                    }
                    break;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public F(int n2, Random random, b b10, @Nullable aA aA2, aQ aQ2) {
        String[] arrstring = u.b();
        super(n2, aQ2);
        this.i = aA2;
        this.e = b10;
        String[] arrstring2 = arrstring;
        int n3 = b10.c();
        if (arrstring2 != null) {
            n3 = n3 > 3 ? 1 : 0;
        }
        this.h = n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(u var1_1, List<u> var2_2, Random var3_3) {
        var5_4 = this.d();
        var4_5 = u.b();
        if (var4_5 == null) ** GOTO lbl34
        switch (aI.b[this.i.ordinal()]) {
            default: {
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.f - 1, aA.NORTH, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, this.e.f + 1, aA.WEST, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, this.e.f + 1, aA.EAST, var5_4);
                if (var4_5 != null) break;
            }
            case 2: {
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.d + 1, aA.SOUTH, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, this.e.f + 1, aA.WEST, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, this.e.f + 1, aA.EAST, var5_4);
                if (var4_5 != null) break;
            }
            case 3: {
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.f - 1, aA.NORTH, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.d + 1, aA.SOUTH, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, this.e.f + 1, aA.WEST, var5_4);
                if (var4_5 != null) break;
            }
            case 4: {
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.f - 1, aA.NORTH, var5_4);
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e, this.e.d + 1, aA.SOUTH, var5_4);
lbl34:
                // 2 sources

                aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, this.e.f + 1, aA.EAST, var5_4);
            }
        }
        v0 = this.h;
        if (var4_5 != null) {
            if (v0 == false) return;
            v0 = var3_3.nextBoolean();
        }
        if (var4_5 != null) {
            if (v0) {
                aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e + 3 + 1, this.e.f - 1, aA.NORTH, var5_4);
            }
            v0 = var3_3.nextBoolean();
        }
        if (var4_5 != null) {
            if (v0) {
                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e + 3 + 1, this.e.f + 1, aA.WEST, var5_4);
            }
            v0 = var3_3.nextBoolean();
        }
        if (var4_5 != null) {
            if (v0) {
                aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e + 3 + 1, this.e.f + 1, aA.EAST, var5_4);
            }
            v0 = var3_3.nextBoolean();
        }
        if (v0 == false) return;
        aP.a(var1_1, var2_2, var3_3, this.e.c + 1, this.e.e + 3 + 1, this.e.d + 1, aA.SOUTH, var5_4);
    }

    public static b a(List<u> list, Random random, int n2, int n3, int n4, aA aA2) {
        b b10 = new b(n2, n3, n4, n2, n3 + 2, n4);
        String[] arrstring = u.b();
        int n5 = random.nextInt(4);
        if (arrstring != null) {
            if (n5 == 0) {
                b10.b += 4;
            }
            n5 = aI.b[aA2.ordinal()];
        }
        switch (n5) {
            default: {
                b10.c = n2 - 1;
                b10.a = n2 + 3;
                b10.f = n4 - 4;
                if (arrstring != null) break;
            }
            case 2: {
                b10.c = n2 - 1;
                b10.a = n2 + 3;
                b10.d = n4 + 3 + 1;
                if (arrstring != null) break;
            }
            case 3: {
                b10.c = n2 - 4;
                b10.f = n4 - 1;
                b10.d = n4 + 3;
                if (arrstring != null) break;
            }
            case 4: {
                b10.a = n2 + 3 + 1;
                b10.f = n4 - 1;
                b10.d = n4 + 3;
                break;
            }
        }
        return u.a(list, b10) != null ? null : b10;
    }

    private void a(z z2, b b10, int n2, int n3, int n4, int n5) {
        block3: {
            z z3;
            F f10;
            block2: {
                String[] arrstring = u.b();
                f10 = this;
                z3 = z2;
                if (arrstring == null) break block2;
                if (f10.b(z3, n2, n5 + 1, n4, b10).o() == net.minecraft.ac.c.A) break block3;
                f10 = this;
                z3 = z2;
            }
            f10.a(z3, b10, n2, n3, n4, n2, n5, n4, this.a(), net.minecraft.u.g.bf.d(), false);
        }
    }

    public F() {
    }
}

