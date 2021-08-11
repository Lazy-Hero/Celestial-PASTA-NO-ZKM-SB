/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.J.x;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.T.ab;
import net.minecraft.U.h;
import net.minecraft.W.bs;
import net.minecraft.W.cL;
import net.minecraft.W.cV;
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
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class E
extends D {
    private /* synthetic */ int i;
    private /* synthetic */ boolean k;
    private /* synthetic */ boolean j;
    private /* synthetic */ boolean h;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(u var1_1, List<u> var2_2, Random var3_3) {
        block29: {
            block28: {
                block27: {
                    var5_4 = this.d();
                    var6_5 = var3_3.nextInt(4);
                    var7_6 = this.e();
                    var4_7 = u.b();
                    if (var7_6 == null) break block27;
                    v0 = aI.b[var7_6.ordinal()];
                    if (var4_7 == null) ** GOTO lbl62
                    switch (v0) {
                        default: {
                            v1 = var6_5;
                            v2 = 1;
                            if (var4_7 != null) {
                                if (v1 <= v2) {
                                    aP.a(var1_1, var2_2, var3_3, this.e.c, this.e.e - 1 + var3_3.nextInt(3), this.e.f - 1, var7_6, var5_4);
                                    if (var4_7 != null) break;
                                }
                                v1 = var6_5;
                                v2 = 2;
                            }
                            if (v1 == v2) {
                                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e - 1 + var3_3.nextInt(3), this.e.f, aA.WEST, var5_4);
                                if (var4_7 != null) break;
                            }
                            aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e - 1 + var3_3.nextInt(3), this.e.f, aA.EAST, var5_4);
                            if (var4_7 != null) break;
                        }
                        case 2: {
                            v3 = var6_5;
                            v4 = 1;
                            if (var4_7 != null) {
                                if (v3 <= v4) {
                                    aP.a(var1_1, var2_2, var3_3, this.e.c, this.e.e - 1 + var3_3.nextInt(3), this.e.d + 1, var7_6, var5_4);
                                    if (var4_7 != null) break;
                                }
                                v3 = var6_5;
                                v4 = 2;
                            }
                            if (v3 == v4) {
                                aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e - 1 + var3_3.nextInt(3), this.e.d - 3, aA.WEST, var5_4);
                                if (var4_7 != null) break;
                            }
                            aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e - 1 + var3_3.nextInt(3), this.e.d - 3, aA.EAST, var5_4);
                            if (var4_7 != null) break;
                        }
                        case 3: {
                            v5 = var6_5;
                            v6 = 1;
                            if (var4_7 != null) {
                                if (v5 <= v6) {
                                    aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e - 1 + var3_3.nextInt(3), this.e.f, var7_6, var5_4);
                                    if (var4_7 != null) break;
                                }
                                v5 = var6_5;
                                v6 = 2;
                            }
                            if (v5 == v6) {
                                aP.a(var1_1, var2_2, var3_3, this.e.c, this.e.e - 1 + var3_3.nextInt(3), this.e.f - 1, aA.NORTH, var5_4);
                                if (var4_7 != null) break;
                            }
                            aP.a(var1_1, var2_2, var3_3, this.e.c, this.e.e - 1 + var3_3.nextInt(3), this.e.d + 1, aA.SOUTH, var5_4);
                            if (var4_7 != null) break;
                        }
                        case 4: {
                            v0 = var6_5;
lbl62:
                            // 2 sources

                            v7 = 1;
                            if (var4_7 != null) {
                                if (v0 <= v7) {
                                    aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e - 1 + var3_3.nextInt(3), this.e.f, var7_6, var5_4);
                                    if (var4_7 != null) break;
                                }
                                v0 = var6_5;
                                v7 = 2;
                            }
                            if (v0 == v7) {
                                aP.a(var1_1, var2_2, var3_3, this.e.a - 3, this.e.e - 1 + var3_3.nextInt(3), this.e.f - 1, aA.NORTH, var5_4);
                                if (var4_7 != null) break;
                            }
                            aP.a(var1_1, var2_2, var3_3, this.e.a - 3, this.e.e - 1 + var3_3.nextInt(3), this.e.d + 1, aA.SOUTH, var5_4);
                            break;
                        }
                    }
                }
                if (var5_4 >= 8) return;
                v8 = var7_6;
                v9 = aA.NORTH;
                if (var4_7 == null) break block28;
                if (v8 == v9) break block29;
                v8 = var7_6;
                v9 = aA.SOUTH;
            }
            if (v8 == v9) break block29;
            var8_8 = this.e.c + 3;
            while (var8_8 + 3 <= this.e.a) {
                block32: {
                    block30: {
                        block31: {
                            var9_9 = var3_3.nextInt(5);
                            if (var4_7 == null) return;
                            v10 = var9_9;
                            if (var4_7 == null) break block30;
                            if (v10 != 0) break block31;
                            aP.a(var1_1, var2_2, var3_3, var8_8, this.e.e, this.e.f - 1, aA.NORTH, var5_4 + 1);
                            if (var4_7 != null) break block32;
                        }
                        v10 = var9_9;
                    }
                    if (v10 == 1) {
                        aP.a(var1_1, var2_2, var3_3, var8_8, this.e.e, this.e.d + 1, aA.SOUTH, var5_4 + 1);
                    }
                }
                var8_8 += 5;
                if (var4_7 != null) continue;
            }
            if (var4_7 != null) return;
        }
        var8_8 = this.e.f + 3;
        do {
            block35: {
                block33: {
                    block34: {
                        if (var8_8 + 3 > this.e.d) return;
                        v11 = var9_9 = var3_3.nextInt(5);
                        if (var4_7 == null) break block33;
                        if (v11 != 0) break block34;
                        aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e, var8_8, aA.WEST, var5_4 + 1);
                        if (var4_7 != null) break block35;
                    }
                    v11 = var9_9;
                }
                if (v11 == 1) {
                    aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e, var8_8, aA.EAST, var5_4 + 1);
                }
            }
            var8_8 += 5;
        } while (var4_7 != null);
    }

    /*
     * Exception decompiling
     */
    public E(int var1_1, Random var2_2, b var3_3, aA var4_4, aQ var5_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public E() {
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("hr", this.j);
        r2.a("sc", this.h);
        r2.a("hps", this.k);
        r2.b("Num", this.i);
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block33: {
            block34: {
                i i2;
                int n3;
                int n4;
                String[] arrstring;
                block24: {
                    block23: {
                        int n5;
                        int n6;
                        int n7;
                        i i3;
                        block22: {
                            int n8;
                            arrstring = u.b();
                            boolean bl2 = this.a(z2, b10);
                            if (arrstring != null) {
                                if (bl2) {
                                    return false;
                                }
                                bl2 = false;
                            }
                            boolean bl3 = bl2;
                            int n9 = 2;
                            boolean bl4 = false;
                            int n10 = 2;
                            n4 = this.i * 5 - 1;
                            i3 = this.a();
                            this.a(z2, b10, 0, 0, 0, 2, 1, n4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                            this.a(z2, b10, random, 0.8f, 0, 2, 0, 2, 2, n4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false, 0);
                            int n11 = this.h;
                            if (arrstring != null) {
                                if (n11 != 0) {
                                    this.a(z2, b10, random, 0.6f, 0, 0, 0, 2, 1, n4, net.minecraft.u.g.dh.d(), net.minecraft.u.g.bf.d(), false, 8);
                                }
                                n11 = n7 = 0;
                            }
                            while (n7 < this.i) {
                                block28: {
                                    block26: {
                                        n n12;
                                        block29: {
                                            int n13;
                                            block27: {
                                                block25: {
                                                    n3 = 2 + n7 * 5;
                                                    this.a(z2, b10, 0, 0, n3, 2, 2, random);
                                                    this.a(z2, b10, random, 0.1f, 0, 2, n3 - 1);
                                                    this.a(z2, b10, random, 0.1f, 2, 2, n3 - 1);
                                                    this.a(z2, b10, random, 0.1f, 0, 2, n3 + 1);
                                                    this.a(z2, b10, random, 0.1f, 2, 2, n3 + 1);
                                                    this.a(z2, b10, random, 0.05f, 0, 2, n3 - 2);
                                                    this.a(z2, b10, random, 0.05f, 2, 2, n3 - 2);
                                                    this.a(z2, b10, random, 0.05f, 0, 2, n3 + 2);
                                                    this.a(z2, b10, random, 0.05f, 2, 2, n3 + 2);
                                                    n8 = random.nextInt(100);
                                                    if (arrstring == null) break block22;
                                                    if (arrstring != null) {
                                                        if (n8 == 0) {
                                                            this.a(z2, b10, random, 2, 0, n3 - 1, net.minecraft.aj.j.ax);
                                                        }
                                                        n13 = random.nextInt(100);
                                                    }
                                                    if (arrstring != null) {
                                                        if (n13 == 0) {
                                                            this.a(z2, b10, random, 0, 0, n3 + 1, net.minecraft.aj.j.ax);
                                                        }
                                                        n13 = this.h ? 1 : 0;
                                                    }
                                                    if (arrstring == null) break block25;
                                                    if (n13 == 0) break block26;
                                                    n13 = this.k ? 1 : 0;
                                                }
                                                if (arrstring == null) break block27;
                                                if (n13 != 0) break block26;
                                                n13 = this.a(0);
                                            }
                                            n6 = n13;
                                            int n14 = n3 - 1 + random.nextInt(3);
                                            n5 = this.b(1, n14);
                                            int n15 = this.a(1, n14);
                                            n12 = new n(n5, n6, n15);
                                            if (arrstring == null) break block28;
                                            if (!b10.a(n12)) break block26;
                                            int n16 = this.c(z2, 1, 0, n14, b10);
                                            if (arrstring == null) break block29;
                                            if (n16 >= 8) break block26;
                                            this.k = true;
                                            n16 = z2.a(n12, net.minecraft.u.g.i.d(), 2) ? 1 : 0;
                                        }
                                        y y2 = z2.b(n12);
                                        if (arrstring == null) break block28;
                                        if (y2 instanceof T) {
                                            ((T)y2).a().a(net.minecraft.U.h.a(ab.class));
                                        }
                                    }
                                    ++n7;
                                }
                                if (arrstring != null) continue;
                            }
                            n8 = n7 = 0;
                        }
                        while (n7 <= 2) {
                            n2 = 0;
                            if (arrstring == null) break block23;
                            n3 = n2;
                            while (n3 <= n4) {
                                block30: {
                                    block31: {
                                        int n17;
                                        block32: {
                                            n6 = -1;
                                            i i4 = this.b(z2, n7, -1, n3, b10);
                                            if (arrstring == null) break block30;
                                            i2 = i4;
                                            if (arrstring == null) break block24;
                                            if (i2.o() != net.minecraft.ac.c.A) break block31;
                                            n17 = this.c(z2, n7, -1, n3, b10);
                                            if (arrstring == null) break block32;
                                            if (n17 >= 8) break block31;
                                            n17 = -1;
                                        }
                                        n5 = n17;
                                        this.a(z2, i3, n7, -1, n3, b10);
                                    }
                                    ++n3;
                                }
                                if (arrstring != null) continue;
                            }
                            ++n7;
                            if (arrstring != null) continue;
                        }
                        n2 = this.j;
                    }
                    if (arrstring == null) break block33;
                    if (n2 == 0) break block34;
                    i2 = net.minecraft.u.g.bM.d().a(bs.C, cL.NORTH_SOUTH);
                }
                i i5 = i2;
                n3 = 0;
                while (n3 <= n4) {
                    block35: {
                        block36: {
                            int n18;
                            block37: {
                                i i6 = this.b(z2, 1, -1, n3, b10);
                                if (arrstring == null) break block35;
                                if (i6.o() == net.minecraft.ac.c.A) break block36;
                                n18 = i6.m();
                                if (arrstring == null) break block37;
                                if (n18 == 0) break block36;
                                n18 = this.c(z2, 1, 0, n3, b10);
                            }
                            float f10 = n18 > 8 ? 0.9f : 0.7f;
                            this.a(z2, b10, random, f10, 1, 0, n3, i5);
                        }
                        ++n3;
                    }
                    if (arrstring != null) continue;
                }
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    private void a(z z2, b b10, int n2, int n3, int n4, int n5, int n6, Random random) {
        block3: {
            block4: {
                i i2;
                i i3;
                block5: {
                    E e10;
                    String[] arrstring;
                    block2: {
                        arrstring = u.b();
                        e10 = this;
                        if (arrstring == null) break block2;
                        if (!e10.a(z2, b10, n2, n6, n5, n4)) break block3;
                        e10 = this;
                    }
                    i3 = e10.a();
                    i i4 = this.b();
                    i2 = net.minecraft.u.g.bf.d();
                    this.a(z2, b10, n2, n3, n4, n2, n5 - 1, n4, i4, i2, false);
                    this.a(z2, b10, n6, n3, n4, n6, n5 - 1, n4, i4, i2, false);
                    if (arrstring == null) break block4;
                    if (random.nextInt(4) != 0) break block5;
                    this.a(z2, b10, n2, n5, n4, n2, n5, n4, i3, i2, false);
                    this.a(z2, b10, n6, n5, n4, n6, n5, n4, i3, i2, false);
                    if (arrstring != null) break block3;
                }
                this.a(z2, b10, n2, n5, n4, n6, n5, n4, i3, i2, false);
                this.a(z2, b10, random, 0.05f, n2 + 1, n5, n4 - 1, net.minecraft.u.g.h.d().a(cV.z, aA.NORTH));
            }
            this.a(z2, b10, random, 0.05f, n2 + 1, n5, n4 + 1, net.minecraft.u.g.h.d().a(cV.z, aA.SOUTH));
        }
    }

    private void a(z z2, b b10, Random random, float f10, int n2, int n3, int n4) {
        block3: {
            z z3;
            E e10;
            block2: {
                String[] arrstring = u.b();
                e10 = this;
                z3 = z2;
                if (arrstring == null) break block2;
                if (e10.c(z3, n2, n3, n4, b10) >= 8) break block3;
                e10 = this;
                z3 = z2;
            }
            e10.a(z3, b10, random, f10, n2, n3, n4, net.minecraft.u.g.dh.d());
        }
    }

    @Override
    protected boolean a(z z2, b b10, Random random, int n2, int n3, int n4, v v2) {
        boolean bl2;
        block2: {
            block3: {
                i i2;
                n n5;
                block5: {
                    c c10;
                    c c11;
                    block4: {
                        n5 = new n(this.b(n2, n4), this.a(n3), this.a(n2, n4));
                        String[] arrstring = u.b();
                        bl2 = b10.a(n5);
                        if (arrstring == null) break block2;
                        if (!bl2) break block3;
                        c11 = z2.d(n5).o();
                        c10 = net.minecraft.ac.c.A;
                        if (arrstring == null) break block4;
                        if (c11 != c10) break block3;
                        i2 = z2.d(n5.k());
                        if (arrstring == null) break block5;
                        c11 = i2.o();
                        c10 = net.minecraft.ac.c.A;
                    }
                    if (c11 == c10) break block3;
                    i2 = net.minecraft.u.g.bM.d();
                }
                i i3 = i2.a(bs.C, random.nextBoolean() ? cL.NORTH_SOUTH : cL.EAST_WEST);
                this.a(z2, i3, n2, n3, n4, b10);
                x x2 = new x(z2, (float)n5.e() + 0.5f, (float)n5.b() + 0.5f, (float)n5.a() + 0.5f);
                x2.a(v2, random.nextLong());
                z2.f(x2);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.j = r2.f("hr");
        this.h = r2.f("sc");
        this.k = r2.f("hps");
        this.i = r2.m("Num");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static b a(List<u> var0, Random var1_1, int var2_2, int var3_3, int var4_4, aA var5_5) {
        block7: {
            var7_6 = new b(var2_2, var3_3, var4_4, var2_2, var3_3 + 2, var4_4);
            var6_8 = u.b();
            for (var8_7 = var1_1.nextInt(3) + 2; var8_7 > 0; --var8_7) {
                var9_9 = var8_7 * 5;
                if (var6_8 == null) ** GOTO lbl23
                v0 = aI.b[var5_5.ordinal()];
                if (var6_8 == null) break block7;
                switch (v0) {
                    default: {
                        var7_6.a = var2_2 + 2;
                        var7_6.f = var4_4 - (var9_9 - 1);
                        if (var6_8 != null) break;
                    }
                    case 2: {
                        var7_6.a = var2_2 + 2;
                        var7_6.d = var4_4 + (var9_9 - 1);
                        if (var6_8 != null) break;
                    }
                    case 3: {
                        var7_6.c = var2_2 - (var9_9 - 1);
                        var7_6.d = var4_4 + 2;
                        if (var6_8 != null) break;
                    }
                    case 4: {
                        var7_6.a = var2_2 + (var9_9 - 1);
lbl23:
                        // 2 sources

                        var7_6.d = var4_4 + 2;
                    }
                }
                if (u.a(var0, var7_6) == null && var6_8 != null) break;
                if (var6_8 != null) continue;
            }
            v0 = var8_7;
        }
        if (v0 <= 0) return null;
        v1 = var7_6;
        return v1;
    }
}

