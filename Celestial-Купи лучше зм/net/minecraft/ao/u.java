/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ao;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.O;
import net.minecraft.N.P;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.W.G;
import net.minecraft.W.a3;
import net.minecraft.W.aB;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ao.b;
import net.minecraft.ao.b6;
import net.minecraft.ao.by;
import net.minecraft.ao.i;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.g;

public abstract class u {
    protected /* synthetic */ int c;
    private /* synthetic */ ae f;
    protected /* synthetic */ b e;
    @Nullable
    private /* synthetic */ aA b;
    private /* synthetic */ h a;
    private static /* synthetic */ String[] d;

    protected u(int n2) {
        this.c = n2;
    }

    protected int a(int n2, int n3) {
        aA aA2 = this.e();
        String[] arrstring = u.b();
        if (aA2 == null) {
            return n3;
        }
        int n4 = i.a[aA2.ordinal()];
        if (arrstring != null) {
            switch (n4) {
                case 1: {
                    return this.e.d - n3;
                }
                case 2: {
                    return this.e.f + n3;
                }
                case 3: 
                case 4: {
                    return this.e.f + n2;
                }
            }
            n4 = n3;
        }
        return n4;
    }

    public void a(u u2, List<u> list, Random random) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(z var1_1, r var2_2) {
        var3_3 = u.b();
        v0 = var2_2.b("BB");
        if (var3_3 != null) {
            if (v0 != 0) {
                this.e = new b(var2_2.n("BB"));
            }
            v0 = var2_2.m("O");
        }
        v1 = var4_4 = v0;
        if (var3_3 == null) ** GOTO lbl13
        if (v1 == -1) {
            v2 = null;
        } else {
            v1 = var4_4;
lbl13:
            // 2 sources

            v2 = aA.b(v1);
        }
        this.a(v2);
        this.c = var2_2.m("GD");
        this.a(var2_2, var1_1.v().d());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(z var1_1, b var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, int var8_8, boolean var9_9, Random var10_10, b6 var11_11) {
        var13_12 = var4_4;
        var12_13 = u.b();
        do {
            v0 = var13_12;
            block1: while (true) {
                if (v0 > var7_7) return;
                var14_14 = var3_3;
                block2: while (true) {
                    v1 = var14_14;
                    block3: while (v1 <= var6_6) {
                        v0 = var5_5;
                        if (var12_13 == null) continue block1;
                        for (var15_15 = v464982; var15_15 <= var8_8; ++var15_15) {
                            block12: {
                                v1 = var9_9 ? 1 : 0;
                                if (var12_13 == null) continue block3;
                                if (v1 != 0 && this.b(var1_1, var14_14, var13_12, var15_15, var2_2).o() == net.minecraft.ac.c.A) continue;
                                v2 = var13_12;
                                if (var12_13 == null) break block12;
                                if (v2 == var4_4) ** GOTO lbl-1000
                                v2 = var13_12;
                                if (var12_13 == null) break block12;
                                if (v2 == var7_7) ** GOTO lbl-1000
                                v2 = var14_14;
                                if (var12_13 == null) break block12;
                                if (v2 == var3_3) ** GOTO lbl-1000
                                v2 = var14_14;
                                if (var12_13 != null) {
                                    if (v2 != var6_6) {
                                        v2 = var15_15;
                                        if (var12_13 != null) {
                                            if (v2 != var5_5) {
                                                v2 = var15_15;
                                                if (var12_13 != null) {
                                                    ** if (v2 != var8_8) goto lbl-1000
                                                } else {
                                                    ** GOTO lbl39
                                                }
                                            } else {
                                                ** GOTO lbl38
                                            }
                                        } else {
                                            ** GOTO lbl37
                                        }
                                    } else {
                                        ** GOTO lbl36
                                    }
                                }
                                break block12;
lbl36:
                                // 2 sources

                                ** GOTO lbl-1000
lbl37:
                                // 2 sources

                                break block12;
lbl38:
                                // 2 sources

                                ** GOTO lbl-1000
lbl39:
                                // 2 sources

                                break block12;
lbl-1000:
                                // 6 sources

                                {
                                    v2 = 1;
                                    ** GOTO lbl43
                                }
lbl-1000:
                                // 1 sources

                                {
                                    v2 = 0;
                                }
                            }
                            var11_11.a(var10_10, var14_14, var13_12 ? 1 : 0, var15_15 ? 1 : 0, (boolean)v2);
                            this.a(var1_1, var11_11.a(), var14_14, var13_12, var15_15, var2_2);
                            if (var12_13 != null) continue;
                        }
                        ++var14_14;
                        if (var12_13 != null) continue block2;
                    }
                    break block1;
                    break;
                }
                break;
            }
            ++var13_12;
        } while (var12_13 != null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void a(z var1_1, b var2_2, Random var3_3, float var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10, net.minecraft.Z.i var11_11, net.minecraft.Z.i var12_12, boolean var13_13, int var14_14) {
        var16_15 = var6_6;
        var15_16 = u.b();
        do {
            v0 = var16_15;
            block1: while (true) {
                if (v0 > var9_9) return;
                var17_17 = var5_5;
                block2: while (true) {
                    v1 = var17_17;
                    block3: while (v1 <= var8_8) {
                        v0 = var7_7;
                        if (var15_16 == null) continue block1;
                        for (var18_18 = v465811; var18_18 <= var10_10; ++var18_18) {
                            block16: {
                                block20: {
                                    block19: {
                                        block18: {
                                            block17: {
                                                block15: {
                                                    cfr_temp_0 = var3_3.nextFloat() - var4_4;
                                                    v1 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                    if (var15_16 == null) continue block3;
                                                    if (var15_16 != null) {
                                                        if (v1 > 0) continue;
                                                        v2 = var13_13;
                                                    }
                                                    if (var15_16 != null) {
                                                        if (v2 != 0 && this.b(var1_1, var17_17, var16_15, var18_18, var2_2).o() == net.minecraft.ac.c.A) continue;
                                                        v2 = var14_14;
                                                    }
                                                    if (var15_16 == null) ** GOTO lbl31
                                                    if (v2 > 0) {
                                                        v2 = this.c(var1_1, var17_17, var16_15, var18_18, var2_2);
                                                        v3 = var14_14;
                                                        if (var15_16 != null) {
                                                            if (v2 >= v3) continue;
                                                        }
                                                    } else {
                                                        v2 = var16_15;
lbl31:
                                                        // 2 sources

                                                        v3 = var6_6;
                                                    }
                                                    if (var15_16 == null) break block15;
                                                    if (v2 == v3) break block16;
                                                    v2 = var16_15;
                                                    v3 = var9_9;
                                                }
                                                if (var15_16 == null) break block17;
                                                if (v2 == v3) break block16;
                                                v2 = var17_17;
                                                v3 = var5_5;
                                            }
                                            if (var15_16 == null) break block18;
                                            if (v2 == v3) break block16;
                                            v2 = var17_17;
                                            v3 = var8_8;
                                        }
                                        if (var15_16 == null) break block19;
                                        if (v2 == v3) break block16;
                                        v2 = var18_18;
                                        v3 = var7_7;
                                    }
                                    if (var15_16 == null) break block20;
                                    if (v2 == v3) break block16;
                                    v2 = var18_18;
                                    v3 = var10_10;
                                }
                                if (v2 != v3) {
                                    this.a(var1_1, var12_12, var17_17, var16_15, var18_18, var2_2);
                                    if (var15_16 != null) continue;
                                }
                            }
                            this.a(var1_1, var11_11, var17_17, var16_15, var18_18, var2_2);
                            if (var15_16 != null) continue;
                        }
                        ++var17_17;
                        if (var15_16 != null) continue block2;
                    }
                    break block1;
                    break;
                }
                break;
            }
            ++var16_15;
        } while (var15_16 != null);
    }

    protected boolean a(z z2, b b10) {
        int n2;
        block20: {
            int n3;
            int n4;
            int n5;
            o o2;
            String[] arrstring;
            int n6;
            int n7;
            int n8;
            int n9;
            int n10;
            block19: {
                int n11;
                int n12;
                block18: {
                    n10 = Math.max(this.e.c - 1, b10.c);
                    n9 = Math.max(this.e.e - 1, b10.e);
                    n12 = Math.max(this.e.f - 1, b10.f);
                    n8 = Math.min(this.e.a + 1, b10.a);
                    n7 = Math.min(this.e.b + 1, b10.b);
                    n6 = Math.min(this.e.d + 1, b10.d);
                    arrstring = u.b();
                    o2 = new o();
                    n5 = n10;
                    block0: while (true) {
                        int n13 = n5;
                        block1: while (n13 <= n8) {
                            n11 = n12;
                            if (arrstring == null) break block18;
                            for (n4 = v465988; n4 <= n6; ++n4) {
                                boolean bl2;
                                n13 = z2.d(o2.a(n5, n9, n4)).o().b() ? 1 : 0;
                                if (arrstring == null) continue block1;
                                if (arrstring != null) {
                                    if (n13 != 0) {
                                        return true;
                                    }
                                    bl2 = z2.d(o2.a(n5, n7, n4)).o().b();
                                }
                                if (arrstring != null) {
                                    if (!bl2) continue;
                                    bl2 = true;
                                }
                                return bl2;
                            }
                            ++n5;
                            if (arrstring != null) continue block0;
                        }
                        break;
                    }
                    n11 = n10;
                }
                n5 = n11;
                block3: while (true) {
                    int n14 = n5;
                    block4: while (n14 <= n8) {
                        n3 = n9;
                        if (arrstring == null) break block19;
                        for (n4 = v466020; n4 <= n7; ++n4) {
                            boolean bl3;
                            n14 = z2.d(o2.a(n5, n4, n12)).o().b() ? 1 : 0;
                            if (arrstring == null) continue block4;
                            if (arrstring != null) {
                                if (n14 != 0) {
                                    return true;
                                }
                                bl3 = z2.d(o2.a(n5, n4, n6)).o().b();
                            }
                            if (arrstring != null) {
                                if (!bl3) continue;
                                bl3 = true;
                            }
                            return bl3;
                        }
                        ++n5;
                        if (arrstring != null) continue block3;
                    }
                    break;
                }
                n3 = n12;
            }
            n5 = n3;
            block6: while (true) {
                int n15 = n5;
                block7: while (n15 <= n6) {
                    n2 = n9;
                    if (arrstring == null) break block20;
                    for (n4 = v466052; n4 <= n7; ++n4) {
                        boolean bl4;
                        n15 = z2.d(o2.a(n10, n4, n5)).o().b() ? 1 : 0;
                        if (arrstring == null) continue block7;
                        if (arrstring != null) {
                            if (n15 != 0) {
                                return true;
                            }
                            bl4 = z2.d(o2.a(n8, n4, n5)).o().b();
                        }
                        if (arrstring != null) {
                            if (!bl4) continue;
                            bl4 = true;
                        }
                        return bl4;
                    }
                    ++n5;
                    if (arrstring != null) continue block6;
                }
                break;
            }
            n2 = 0;
        }
        return n2 != 0;
    }

    protected void a(z z2, b b10, Random random, float f10, int n2, int n3, int n4, net.minecraft.Z.i i2) {
        block0: {
            if (!(random.nextFloat() < f10)) break block0;
            this.a(z2, i2, n2, n3, n4, b10);
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected void a(z z2, int n2, int n3, int n4, b b10) {
        n n5 = new n(this.b(n2, n4), this.a(n3), this.a(n2, n4));
        String[] arrstring = u.b();
        boolean bl2 = b10.a(n5);
        boolean bl3 = true;
        do {
            block6: {
                block5: {
                    if (!bl3 || (bl3 = false)) break block5;
                    if (arrstring == null) break block6;
                    if (!bl2) break;
                }
                bl2 = z2.a(n5);
            }
            if (bl2) break;
            int n6 = n5.b();
            if (arrstring != null) {
                if (n6 >= 255) break;
                n6 = z2.a(n5, g.bf.d(), 2) ? 1 : 0;
            }
            n5 = n5.a();
        } while (arrstring != null);
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n3;
        String[] arrstring = u.b();
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 <= n6) {
                int n10 = n2;
                while (n10 <= n5) {
                    block5: {
                        n9 = n4;
                        if (arrstring == null) continue block1;
                        for (int i2 = v466369; i2 <= n7; ++i2) {
                            this.a(z2, g.bf.d(), n10, n8, i2, b10);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block5;
                        }
                        ++n10;
                    }
                    if (arrstring != null) continue;
                }
                ++n8;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    protected void a(z z2, b b10, Random random, int n2, int n3, int n4, aA aA2, aB aB2) {
        this.a(z2, aB2.d().a(aB.z, aA2), n2, n3, n4, b10);
        this.a(z2, aB2.d().a(aB.z, aA2).a(aB.D, G.UPPER), n2, n3 + 1, n4, b10);
    }

    public static u a(List<u> list, b b10) {
        Iterator<u> iterator = list.iterator();
        String[] arrstring = u.b();
        while (iterator.hasNext()) {
            block4: {
                u u2;
                block5: {
                    b b11;
                    u u3;
                    block3: {
                        u3 = iterator.next();
                        b11 = u3.a();
                        if (arrstring == null) break block3;
                        if (b11 == null) break block4;
                        u2 = u3;
                        if (arrstring == null) break block5;
                        b11 = u2.a();
                    }
                    if (!b11.b(b10)) break block4;
                    u2 = u3;
                }
                return u2;
            }
            if (arrstring != null) continue;
        }
        return null;
    }

    public static String[] b() {
        return d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final r c() {
        var2_1 = new r();
        var1_2 = u.b();
        var2_1.a("id", by.a(this));
        var2_1.a("BB", this.e.e());
        v0 = var3_3 = this.e();
        if (var1_2 == null) ** GOTO lbl11
        if (v0 == null) {
            v1 = -1;
        } else {
            v0 = var3_3;
lbl11:
            // 2 sources

            v1 = v0.k();
        }
        var2_1.b("O", v1);
        var2_1.b("GD", this.c);
        this.a(var2_1);
        return var2_1;
    }

    static {
        if (u.b() == null) {
            u.b(new String[4]);
        }
    }

    public abstract boolean a(z var1, Random var2, b var3);

    protected int b(int n2, int n3) {
        aA aA2 = this.e();
        String[] arrstring = u.b();
        if (aA2 == null) {
            return n2;
        }
        int n4 = i.a[aA2.ordinal()];
        if (arrstring != null) {
            switch (n4) {
                case 1: 
                case 2: {
                    return this.e.c + n2;
                }
                case 3: {
                    return this.e.a - n3;
                }
                case 4: {
                    return this.e.c + n3;
                }
            }
            n4 = n2;
        }
        return n4;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    protected void b(z z2, net.minecraft.Z.i i2, int n2, int n3, int n4, b b10) {
        int n5 = this.b(n2, n4);
        int n6 = this.a(n3);
        int n7 = this.a(n2, n4);
        String[] arrstring = u.b();
        boolean bl2 = b10.a(new n(n5, n6, n7));
        boolean bl3 = true;
        do {
            int n8;
            block9: {
                block8: {
                    if (!bl3 || (bl3 = false)) break block8;
                    if (arrstring == null) break block9;
                    if (!bl2) break;
                }
                bl2 = z2.a(new n(n5, n6, n7));
            }
            if (!bl2) {
                n8 = z2.d(new n(n5, n6, n7)).o().b() ? 1 : 0;
                if (arrstring != null && arrstring != null) {
                    if (n8 == 0) break;
                }
            } else {
                n8 = n6;
            }
            if (arrstring != null) {
                if (n8 <= 1) break;
                n8 = z2.a(new n(n5, n6, n7), i2, 2) ? 1 : 0;
            }
            --n6;
        } while (arrstring != null);
    }

    protected void a(z z2, net.minecraft.Z.i i2, int n2, int n3, int n4, b b10) {
        n n5 = new n(this.b(n2, n4), this.a(n3), this.a(n2, n4));
        String[] arrstring = u.b();
        if (b10.a(n5)) {
            u u2 = this;
            if (arrstring != null) {
                if (u2.a != h.NONE) {
                    i2 = i2.a(this.a);
                }
                u2 = this;
            }
            if (u2.f != ae.NONE) {
                i2 = i2.a(this.f);
            }
            z2.a(n5, i2, 2);
        }
    }

    public u() {
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, int n7, net.minecraft.Z.i i2, net.minecraft.Z.i i3, boolean bl2) {
        int n8 = n3;
        String[] arrstring = u.b();
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 <= n6) {
                int n10 = n2;
                block2: while (true) {
                    int n11 = n10;
                    block3: while (n11 <= n5) {
                        n9 = n4;
                        if (arrstring == null) continue block1;
                        for (int i4 = v467261; i4 <= n7; ++i4) {
                            block11: {
                                int n12;
                                int n13;
                                block15: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                block10: {
                                                    n11 = bl2 ? 1 : 0;
                                                    if (arrstring == null) continue block3;
                                                    if (arrstring != null) {
                                                        if (n11 != 0 && this.b(z2, n10, n8, i4, b10).o() == net.minecraft.ac.c.A) continue;
                                                        n13 = n8;
                                                    }
                                                    n12 = n3;
                                                    if (arrstring == null) break block10;
                                                    if (n13 == n12) break block11;
                                                    n13 = n8;
                                                    n12 = n6;
                                                }
                                                if (arrstring == null) break block12;
                                                if (n13 == n12) break block11;
                                                n13 = n10;
                                                n12 = n2;
                                            }
                                            if (arrstring == null) break block13;
                                            if (n13 == n12) break block11;
                                            n13 = n10;
                                            n12 = n5;
                                        }
                                        if (arrstring == null) break block14;
                                        if (n13 == n12) break block11;
                                        n13 = i4;
                                        n12 = n4;
                                    }
                                    if (arrstring == null) break block15;
                                    if (n13 == n12) break block11;
                                    n13 = i4;
                                    n12 = n7;
                                }
                                if (n13 != n12) {
                                    this.a(z2, i3, n10, n8, i4, b10);
                                    if (arrstring != null) continue;
                                }
                            }
                            this.a(z2, i2, n10, n8, i4, b10);
                            if (arrstring != null) continue;
                        }
                        ++n10;
                        if (arrstring != null) continue block2;
                    }
                    break;
                }
                ++n8;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }

    protected abstract void a(r var1, j var2);

    public void a(@Nullable aA aA2) {
        block9: {
            String[] arrstring;
            block8: {
                block7: {
                    this.b = aA2;
                    arrstring = u.b();
                    if (arrstring == null) break block7;
                    if (aA2 != null) break block8;
                    this.f = ae.NONE;
                    this.a = h.NONE;
                }
                if (arrstring != null) break block9;
            }
            switch (aA2) {
                case SOUTH: {
                    this.a = h.LEFT_RIGHT;
                    this.f = ae.NONE;
                    if (arrstring != null) break;
                }
                case WEST: {
                    this.a = h.LEFT_RIGHT;
                    this.f = ae.CLOCKWISE_90;
                    if (arrstring != null) break;
                }
                case EAST: {
                    this.a = h.NONE;
                    this.f = ae.CLOCKWISE_90;
                    if (arrstring != null) break;
                }
                default: {
                    this.a = h.NONE;
                    this.f = ae.NONE;
                    break;
                }
            }
        }
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    protected int c(z z2, int n2, int n3, int n4, b b10) {
        int n5 = this.b(n2, n4);
        String[] arrstring = u.b();
        int n6 = this.a(n3 + 1);
        int n7 = this.a(n2, n4);
        n n8 = new n(n5, n6, n7);
        int n9 = b10.a(n8);
        if (arrstring != null) {
            n9 = n9 == 0 ? net.minecraft.ah.c.SKY.defaultLightValue : z2.a(net.minecraft.ah.c.SKY, n8);
        }
        return n9;
    }

    private static gP d(gP gP2) {
        return gP2;
    }

    protected net.minecraft.Z.i b(z z2, int n2, int n3, int n4, b b10) {
        int n5;
        int n6;
        int n7 = this.b(n2, n4);
        n n8 = new n(n7, n6 = this.a(n3), n5 = this.a(n2, n4));
        return !b10.a(n8) ? g.bf.d() : z2.d(n8);
    }

    public void a(int n2, int n3, int n4) {
        this.e.a(n2, n3, n4);
    }

    protected boolean a(z z2, b b10, Random random, int n2, int n3, int n4, v v2) {
        n n5 = new n(this.b(n2, n4), this.a(n3), this.a(n2, n4));
        return this.a(z2, b10, random, n5, v2, null);
    }

    @Nullable
    public aA e() {
        return this.b;
    }

    protected abstract void a(r var1);

    protected boolean a(z z2, b b10, Random random, int n2, int n3, int n4, aA aA2, v v2) {
        boolean bl2;
        block5: {
            block6: {
                n n5;
                z z3;
                String[] arrstring;
                block7: {
                    n n6 = new n(this.b(n2, n4), this.a(n3), this.a(n2, n4));
                    arrstring = u.b();
                    bl2 = b10.a(n6);
                    if (arrstring == null) break block5;
                    if (!bl2) break block6;
                    z3 = z2;
                    n5 = n6;
                    if (arrstring == null) break block7;
                    if (z3.d(n5).b() == g.n) break block6;
                    this.a(z2, g.n.d().a(a3.C, aA2), n2, n3, n4, b10);
                    z3 = z2;
                    n5 = n6;
                }
                y y2 = z3.b(n5);
                boolean bl3 = y2 instanceof P;
                if (arrstring != null) {
                    if (bl3) {
                        ((P)y2).a(v2, random.nextLong());
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    protected boolean a(z z2, b b10, Random random, n n2, v v2, @Nullable net.minecraft.Z.i i2) {
        boolean bl2;
        block5: {
            block6: {
                String[] arrstring;
                block9: {
                    net.minecraft.Z.i i3;
                    block8: {
                        block7: {
                            arrstring = u.b();
                            bl2 = b10.a(n2);
                            if (arrstring == null) break block5;
                            if (!bl2) break block6;
                            i3 = z2.d(n2);
                            if (arrstring == null) break block7;
                            if (i3.b() == g.cd) break block6;
                            i3 = i2;
                        }
                        if (arrstring == null) break block8;
                        if (i3 != null) break block9;
                        i3 = g.cd.a(z2, n2, g.cd.d());
                    }
                    i2 = i3;
                }
                z2.a(n2, i2, 2);
                y y2 = z2.b(n2);
                boolean bl3 = y2 instanceof O;
                if (arrstring != null) {
                    if (bl3) {
                        ((O)y2).a(v2, random.nextLong());
                    }
                    bl3 = true;
                }
                return bl3;
            }
            bl2 = false;
        }
        return bl2;
    }

    public b a() {
        return this.e;
    }

    public int d() {
        return this.c;
    }

    protected int a(int n2) {
        return this.e() == null ? n2 : n2 + this.e.e;
    }

    protected void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, int n7, net.minecraft.Z.i i2, boolean bl2) {
        float f10 = n5 - n2 + 1;
        float f11 = n6 - n3 + 1;
        float f12 = n7 - n4 + 1;
        float f13 = (float)n2 + f10 / 2.0f;
        float f14 = (float)n4 + f12 / 2.0f;
        int n8 = n3;
        String[] arrstring = u.b();
        block0: while (true) {
            int n9 = n8;
            block1: while (n9 <= n6) {
                float f15 = (float)(n8 - n3) / f11;
                int n10 = n2;
                block2: while (true) {
                    int n11 = n10;
                    block3: while (n11 <= n5) {
                        float f16 = ((float)n10 - f13) / (f10 * 0.5f);
                        n9 = n4;
                        if (arrstring == null) continue block1;
                        int n12 = n9;
                        while (n12 <= n7) {
                            block10: {
                                block9: {
                                    float f17 = ((float)n12 - f14) / (f12 * 0.5f);
                                    n11 = bl2 ? 1 : 0;
                                    if (arrstring == null) continue block3;
                                    if (n11 != 0 && this.b(z2, n10, n8, n12, b10).o() == net.minecraft.ac.c.A) break block9;
                                    float f18 = f16 * f16 + f15 * f15 + f17 * f17;
                                    if (arrstring == null) break block10;
                                    if (f18 <= 1.05f) {
                                        this.a(z2, i2, n10, n8, n12, b10);
                                    }
                                }
                                ++n12;
                            }
                            if (arrstring != null) continue;
                        }
                        ++n10;
                        if (arrstring != null) continue block2;
                    }
                    break;
                }
                ++n8;
                if (arrstring != null) continue block0;
            }
            break;
        }
    }
}

