/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 */
package net.minecraft.ah;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Random;
import net.minecraft.U.x;
import net.minecraft.ah.A;
import net.minecraft.ah.D;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.R;
import net.minecraft.i.k;
import net.minecraft.k.f;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class u {
    private final /* synthetic */ Random a;
    private final /* synthetic */ Long2ObjectMap<D> b;
    private final /* synthetic */ A c;

    public u(A a10) {
        this.b = new Long2ObjectOpenHashMap(4096);
        this.c = a10;
        this.a = new Random(a10.C());
    }

    public void a(long l2) {
        block4: {
            long l3;
            long l4;
            String string;
            block3: {
                string = z.I();
                l4 = l2 % 100L;
                l3 = 0L;
                if (string == null) break block3;
                if (l4 != l3) break block4;
                l4 = l2;
                l3 = 300L;
            }
            long l5 = l4 - l3;
            ObjectIterator objectIterator = this.b.values().iterator();
            while (objectIterator.hasNext()) {
                block7: {
                    block6: {
                        D d10;
                        block5: {
                            D d11;
                            d10 = d11 = (D)objectIterator.next();
                            if (string == null) break block5;
                            if (d10 == null) break block6;
                            d10 = d11;
                        }
                        if (d10.q >= l5) break block7;
                    }
                    objectIterator.remove();
                }
                if (string != null) continue;
            }
        }
    }

    public void b(x x2, float f10) {
        block11: {
            block7: {
                int n2;
                String string;
                block8: {
                    block9: {
                        block10: {
                            string = z.I();
                            n2 = this.c.D.r().a();
                            if (string == null) break block8;
                            if (n2 == 1) break block9;
                            boolean bl2 = this.a(x2, f10);
                            if (string == null) break block10;
                            if (bl2) break block11;
                            this.a(x2);
                            bl2 = this.a(x2, f10);
                        }
                        if (string != null) break block11;
                    }
                    n2 = h.f(x2.a);
                }
                int n3 = n2;
                int n4 = h.f(x2.aF) - 1;
                int n5 = h.f(x2.ax);
                boolean bl3 = true;
                boolean bl4 = false;
                int n6 = -2;
                block0: while (true) {
                    int n7 = n6;
                    block1: while (n7 <= 2) {
                        if (string == null) break block7;
                        int n8 = -2;
                        block2: while (true) {
                            int n9 = n8;
                            block3: while (n9 <= 2) {
                                n7 = -1;
                                if (string == null) continue block1;
                                for (int i2 = v621962; i2 < 3; ++i2) {
                                    boolean bl5;
                                    int n10 = n3 + n8 * 1 + n6 * 0;
                                    int n11 = n4 + i2;
                                    int n12 = n5 + n8 * 0 - n6 * 1;
                                    n9 = i2;
                                    if (string == null) continue block3;
                                    if (string != null) {
                                        bl5 = n9 < 0;
                                    }
                                    boolean bl6 = bl5;
                                    this.c.a(new n(n10, n11, n12), bl6 ? g.bP.d() : g.bf.d());
                                    if (string != null) continue;
                                }
                                ++n8;
                                if (string != null) continue block2;
                            }
                            break;
                        }
                        ++n6;
                        if (string != null) continue block0;
                    }
                    break;
                }
                x2.c(n3, n4, n5, x2.e, 0.0f);
                x2.aq = 0.0;
                x2.G = 0.0;
            }
            x2.d = 0.0;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(x var1_1, float var2_2) {
        block43: {
            block46: {
                block44: {
                    block45: {
                        block41: {
                            block42: {
                                block40: {
                                    block39: {
                                        block38: {
                                            block29: {
                                                block30: {
                                                    block28: {
                                                        block34: {
                                                            block33: {
                                                                block32: {
                                                                    var4_3 = 128;
                                                                    var5_4 = -1.0;
                                                                    var3_5 = z.I();
                                                                    var7_6 = h.f(var1_1.a);
                                                                    var8_7 = h.f(var1_1.ax);
                                                                    var9_8 = 1;
                                                                    var10_9 = n.o;
                                                                    var11_10 = f.a(var7_6, var8_7);
                                                                    v0 = this.b;
                                                                    v1 = var11_10;
                                                                    if (var3_5 == null) break block32;
                                                                    if (!v0.containsKey(v1)) break block33;
                                                                    v0 = this.b;
                                                                    v1 = var11_10;
                                                                }
                                                                var13_11 = (D)v0.get(v1);
                                                                var5_4 = 0.0;
                                                                var10_9 = var13_11;
                                                                var13_11.q = this.c.r();
                                                                var9_8 = 0;
                                                                if (var3_5 != null) break block34;
                                                            }
                                                            var13_11 = new n(var1_1);
                                                            for (var14_13 = -128; var14_13 <= 128; ++var14_13) {
                                                                v2 = -128;
                                                                if (var3_5 == null) break block28;
                                                                for (var16_16 = v625093; var16_16 <= 128; ++var16_16) {
                                                                    v3 = var13_11.a(var14_13, this.c.e() - 1 - var13_11.b(), var16_16);
                                                                    if (var3_5 == null) break block29;
                                                                    var17_17 = v3;
                                                                    while (var17_17.b() >= 0) {
                                                                        block31: {
                                                                            block35: {
                                                                                block36: {
                                                                                    block37: {
                                                                                        var15_14 = var17_17.k();
                                                                                        if (var3_5 == null) break block31;
                                                                                        v4 = this.c.d((n)var17_17).b();
                                                                                        if (var3_5 == null) break block30;
                                                                                        if (v4 != g.aN) break block35;
                                                                                        var15_14 = var17_17.k();
                                                                                        while (this.c.d(var15_14).b() == g.aN) {
                                                                                            var17_17 = var15_14;
                                                                                            var15_14 = var15_14.k();
                                                                                            if (var3_5 != null) {
                                                                                                if (var3_5 != null) continue;
                                                                                            }
                                                                                            break block31;
                                                                                        }
                                                                                        var18_18 = var17_17.b(var13_11);
                                                                                        v5 = var5_4;
                                                                                        if (var3_5 == null) break block36;
                                                                                        if (v5 < 0.0) break block37;
                                                                                        v5 = var18_18;
                                                                                        if (var3_5 == null) break block36;
                                                                                        if (!(v5 < var5_4)) break block35;
                                                                                    }
                                                                                    v5 = var18_18;
                                                                                }
                                                                                var5_4 = v5;
                                                                                var10_9 = var17_17;
                                                                            }
                                                                            var17_17 = var15_14;
                                                                        }
                                                                        if (var3_5 != null) continue;
                                                                    }
                                                                    if (var3_5 != null) continue;
                                                                }
                                                                if (var3_5 != null) continue;
                                                            }
                                                        }
                                                        v2 = (cfr_temp_0 = var5_4 - 0.0) == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                    }
                                                    if (var3_5 == null) return (boolean)v2;
                                                    if (v2 < 0) {
                                                        return (boolean)0;
                                                    }
                                                    v6 = var9_8;
                                                    if (var3_5 == null) break block38;
                                                    if (v6 != 0) {
                                                        v4 = this.b.put(var11_10, (Object)new D(this, (n)var10_9, this.c.r()));
                                                    }
                                                }
                                                v3 = var10_9;
                                            }
                                            v6 = v3.e();
                                        }
                                        var13_12 = (double)v6 + 0.5;
                                        var15_15 = (double)var10_9.a() + 0.5;
                                        var17_17 = g.aN.a((z)this.c, (n)var10_9);
                                        var18_19 = var17_17.e().l().o() == R.NEGATIVE;
                                        v7 = var17_17;
                                        if (var3_5 == null) ** GOTO lbl87
                                        if (v7.e().g() == Q.X) {
                                            v8 = var17_17.b().a();
                                        } else {
                                            v7 = var17_17;
lbl87:
                                            // 2 sources

                                            v8 = v7.b().e();
                                        }
                                        var19_20 = v8;
                                        var21_21 = (double)(var17_17.b().b() + 1) - var1_1.U().d * (double)var17_17.a();
                                        if (var18_19) {
                                            var19_20 += 1.0;
                                        }
                                        if (var17_17.e().g() != Q.X) break block39;
                                        var15_15 = var19_20 + (1.0 - var1_1.U().e) * (double)var17_17.f() * (double)var17_17.e().l().o().a();
                                        if (var3_5 != null) break block40;
                                    }
                                    var13_12 = var19_20 + (1.0 - var1_1.U().e) * (double)var17_17.f() * (double)var17_17.e().l().o().a();
                                }
                                var23_22 = 0.0f;
                                var24_23 = 0.0f;
                                var25_24 = 0.0f;
                                var26_25 = 0.0f;
                                v9 = var17_17.e().h();
                                v10 = var1_1.O();
                                if (var3_5 == null) break block41;
                                if (v9 != v10) break block42;
                                var23_22 = 1.0f;
                                var24_23 = 1.0f;
                                if (var3_5 != null) break block43;
                            }
                            v9 = var17_17.e().h();
                            v10 = var1_1.O().h();
                        }
                        if (var3_5 == null) break block44;
                        if (v9 != v10) break block45;
                        var23_22 = -1.0f;
                        var24_23 = -1.0f;
                        if (var3_5 != null) break block43;
                    }
                    v9 = var17_17.e().h();
                    v10 = var1_1.O().l();
                }
                if (v9 != v10) break block46;
                var25_24 = 1.0f;
                var26_25 = -1.0f;
                if (var3_5 != null) break block43;
            }
            var25_24 = -1.0f;
            var26_25 = 1.0f;
        }
        var27_26 = var1_1.aq;
        var29_27 = var1_1.d;
        var1_1.aq = var27_26 * (double)var23_22 + var29_27 * (double)var26_25;
        var1_1.d = var27_26 * (double)var25_24 + var29_27 * (double)var24_23;
        var1_1.e = var2_2 - (float)(var1_1.O().h().k() * 90) + (float)(var17_17.e().k() * 90);
        v11 = var1_1;
        if (var3_5 != null) {
            if (v11 instanceof k) {
                ((k)var1_1).cD.a(var13_12, var21_21, var15_15, var1_1.e, var1_1.at);
                if (var3_5 != null) return true;
            }
            v11 = var1_1;
        }
        v11.c(var13_12, var21_21, var15_15, var1_1.e, var1_1.at);
        return true;
    }

    /*
     * Exception decompiling
     */
    public boolean a(x var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[DOLOOP]], but top level block is 4[WHILELOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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
}

