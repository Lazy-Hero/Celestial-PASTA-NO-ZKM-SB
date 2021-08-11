/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import java.util.BitSet;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.aJ;
import net.minecraft.client.a.aW;
import net.minecraft.client.a.v;
import net.minecraft.client.a.x;
import net.minecraft.client.j.p;
import net.minecraft.client.x.N;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.y.b;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class y {
    private static final /* synthetic */ aC[] a;
    private static /* synthetic */ float c;
    private final /* synthetic */ net.minecraft.client.z.m b;

    private void a(t t2, i i2, n n2, I i3, List<P> list, e9 e92) {
        float[] arrf = e92.b();
        BitSet bitSet = e92.i();
        aJ aJ2 = e92.c();
        l l2 = i2.b(t2, n2);
        double d10 = (double)n2.e() + l2.e;
        double d11 = (double)n2.b() + l2.d;
        double d12 = (double)n2.a() + l2.b;
        String string = I.j();
        int n3 = list.size();
        for (int i4 = 0; i4 < n3; ++i4) {
            block18: {
                int n4;
                int n5;
                P p2;
                block16: {
                    block17: {
                        block15: {
                            I i5;
                            block13: {
                                block14: {
                                    p2 = list.get(i4);
                                    this.a(i2, p2.d(), p2.b(), arrf, bitSet);
                                    aJ2.a(t2, i2, n2, p2.b(), arrf, bitSet);
                                    i5 = i3;
                                    if (string != null) break block13;
                                    if (!i5.c()) break block14;
                                    i3.a(p2.f());
                                    i3.b(p2.p());
                                    if (string == null) break block15;
                                }
                                i5 = i3;
                            }
                            i5.a(p2.d());
                        }
                        i3.c(aJ.a(aJ2)[0], aJ.a(aJ2)[1], aJ.a(aJ2)[2], aJ.a(aJ2)[3]);
                        int n6 = p2.l();
                        if (string == null) {
                            if (n6 != 0) {
                                float f10 = N.a(p2.b());
                                float[] arrf2 = aJ.b(aJ2);
                                arrf2[0] = arrf2[0] * f10;
                                arrf2 = aJ.b(aJ2);
                                arrf2[1] = arrf2[1] * f10;
                                arrf2 = aJ.b(aJ2);
                                arrf2[2] = arrf2[2] * f10;
                                arrf2 = aJ.b(aJ2);
                                arrf2[3] = arrf2[3] * f10;
                            }
                            n6 = fa.a(p2, i2, t2, n2, e92);
                        }
                        n5 = n6;
                        n4 = p2.c();
                        if (string != null) break block16;
                        if (n4 != 0) break block17;
                        n4 = n5;
                        if (string != null) break block16;
                        if (n4 != -1) break block17;
                        i3.b(aJ.b(aJ2)[0], aJ.b(aJ2)[0], aJ.b(aJ2)[0], 4);
                        i3.b(aJ.b(aJ2)[1], aJ.b(aJ2)[1], aJ.b(aJ2)[1], 3);
                        i3.b(aJ.b(aJ2)[2], aJ.b(aJ2)[2], aJ.b(aJ2)[2], 2);
                        i3.b(aJ.b(aJ2)[3], aJ.b(aJ2)[3], aJ.b(aJ2)[3], 1);
                        if (string == null) break block18;
                    }
                    n4 = n5;
                }
                int n7 = n4;
                int n8 = n5;
                if (string == null) {
                    if (n8 == -1) {
                        n7 = this.b.a(i2, t2, n2, p2.q());
                    }
                    n8 = x.S ? 1 : 0;
                }
                if (string == null) {
                    if (n8 != 0) {
                        n7 = p.d(n7);
                    }
                    n8 = n7 >> 16 & 0xFF;
                }
                float f11 = (float)n8 / 255.0f;
                float f12 = (float)(n7 >> 8 & 0xFF) / 255.0f;
                float f13 = (float)(n7 & 0xFF) / 255.0f;
                i3.b(aJ.b(aJ2)[0] * f11, aJ.b(aJ2)[0] * f12, aJ.b(aJ2)[0] * f13, 4);
                i3.b(aJ.b(aJ2)[1] * f11, aJ.b(aJ2)[1] * f12, aJ.b(aJ2)[1] * f13, 3);
                i3.b(aJ.b(aJ2)[2] * f11, aJ.b(aJ2)[2] * f12, aJ.b(aJ2)[2] * f13, 2);
                i3.b(aJ.b(aJ2)[3] * f11, aJ.b(aJ2)[3] * f12, aJ.b(aJ2)[3] * f13, 1);
            }
            i3.b(d10, d11, d12);
            if (string == null) continue;
        }
    }

    static {
        c = 0.2f;
        a = new aC[]{aC.CUTOUT, aC.CUTOUT_MIPPED, aC.TRANSLUCENT};
    }

    public boolean b(t t2, Y y2, i i2, n n2, I i3, boolean n3, long l2) {
        List<P> list;
        String string;
        Object object;
        e9 e92;
        boolean bl2;
        block6: {
            bl2 = false;
            e92 = i3.a(t2, i2, n2);
            object = aA.VALUES;
            int n4 = ((aA[])object).length;
            string = I.j();
            int n5 = 0;
            while (n5 < n4) {
                block7: {
                    block8: {
                        int n6;
                        List<P> list2;
                        aA aA2;
                        block9: {
                            block10: {
                                aA2 = object[n5];
                                list2 = y2.a(i2, aA2, l2);
                                if (string != null) break block7;
                                list = list2;
                                if (string != null) break block6;
                                if (list.isEmpty()) break block8;
                                n6 = n3;
                                if (string != null) break block9;
                                if (n6 == 0) break block10;
                                n6 = i2.d(t2, n2, aA2) ? 1 : 0;
                                if (string != null) break block9;
                                if (n6 == 0) break block8;
                            }
                            n6 = i2.e(t2, n2.a(aA2));
                        }
                        int n7 = n6;
                        list2 = zzzzd6Customizer.a(list2, t2, i2, n2, aA2, l2, e92);
                        this.a(t2, i2, n2, n7, false, i3, list2, e92);
                        bl2 = true;
                    }
                    ++n5;
                }
                if (string == null) continue;
            }
            list = y2.a(i2, null, l2);
        }
        object = list;
        boolean bl3 = object.isEmpty();
        if (string == null) {
            if (!bl3) {
                object = zzzzd6Customizer.a((List<P>)object, t2, i2, n2, null, l2, e92);
                this.a(t2, i2, n2, -1, true, i3, (List<P>)object, e92);
                bl2 = true;
            }
            bl3 = bl2;
        }
        return bl3;
    }

    /*
     * Exception decompiling
     */
    private void a(i var1_1, int[] var2_2, aA var3_3, @Nullable float[] var4_4, BitSet var5_5) {
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

    public boolean c(t t2, Y y2, i i2, n n2, I i3, boolean bl2, long l2) {
        List<P> list;
        Object object;
        e9 e92;
        String string;
        boolean bl3;
        block6: {
            bl3 = false;
            string = I.j();
            e92 = i3.a(t2, i2, n2);
            object = aA.VALUES;
            int n3 = ((aA[])object).length;
            int n4 = 0;
            while (n4 < n3) {
                block7: {
                    block8: {
                        boolean bl4;
                        block9: {
                            List<P> list2;
                            aA aA2;
                            block10: {
                                aA2 = object[n4];
                                list2 = y2.a(i2, aA2, l2);
                                if (string != null) break block7;
                                list = list2;
                                if (string != null) break block6;
                                if (list.isEmpty()) break block8;
                                bl4 = bl2;
                                if (string != null) break block9;
                                if (!bl4) break block10;
                                bl4 = i2.d(t2, n2, aA2);
                                if (string != null) break block9;
                                if (!bl4) break block8;
                            }
                            list2 = zzzzd6Customizer.a(list2, t2, i2, n2, aA2, l2, e92);
                            this.a(t2, i2, n2, i3, list2, e92);
                            bl4 = true;
                        }
                        bl3 = bl4;
                    }
                    ++n4;
                }
                if (string == null) continue;
            }
            list = y2.a(i2, null, l2);
        }
        object = list;
        boolean bl5 = object.isEmpty();
        if (string == null) {
            if (!bl5) {
                object = zzzzd6Customizer.a((List<P>)object, t2, i2, n2, null, l2, e92);
                this.a(t2, i2, n2, i3, (List<P>)object, e92);
                bl3 = true;
            }
            bl5 = bl3;
        }
        return bl5;
    }

    public boolean a(t t2, Y y2, i i2, n n2, I i3, boolean bl2) {
        return this.a(t2, y2, i2, n2, i3, bl2, h.a(n2));
    }

    public y(net.minecraft.client.z.m m2) {
        this.b = m2;
        String string = I.j();
        boolean bl2 = cq.ck.c();
        if (string == null && bl2) {
            bl2 = cq.a(cq.ck, (Object)false);
        }
    }

    private void a(t t2, Y y2, i i2, n n2, I i3, boolean bl2, long l2, e9 e92, boolean bl3) {
        block21: {
            Object object;
            int n3;
            block22: {
                String string;
                block20: {
                    block12: {
                        block13: {
                            string = I.j();
                            n3 = e92.h();
                            if (string != null) break block12;
                            if (n3 == 0) break block13;
                            int n4 = 0;
                            block0: while (true) {
                                int n5 = n4;
                                block1: while (n5 < a.length) {
                                    block14: {
                                        gp gp2;
                                        block16: {
                                            int n6;
                                            aW aW2;
                                            block15: {
                                                aW aW3;
                                                object = a[n4];
                                                gp2 = e92.a((aC)((Object)object));
                                                if (string != null) continue block0;
                                                n3 = gp2.a();
                                                if (string != null) break block12;
                                                if (n3 <= 0) break block14;
                                                aW2 = aW3 = e92.e();
                                                if (string != null) break block15;
                                                if (aW2 == null) break block16;
                                                aW2 = aW3;
                                            }
                                            I i4 = aW2.a((aC)((Object)object));
                                            int n7 = i4.e();
                                            if (string == null) {
                                                if (n7 == 0) {
                                                    i4.a(7, net.minecraft.client.y.b.s);
                                                    i4.a(i3.q(), i3.n(), i3.l());
                                                }
                                                n7 = n6 = 0;
                                            }
                                            while (n6 < gp2.a()) {
                                                block19: {
                                                    int n8;
                                                    i i5;
                                                    List<P> list;
                                                    block17: {
                                                        P p2;
                                                        block18: {
                                                            p2 = gp2.b(n6);
                                                            list = gp2.a(p2);
                                                            i5 = gp2.a(n6);
                                                            e92.a(t2, i5, n2);
                                                            n5 = bl3 ? 1 : 0;
                                                            if (string != null) continue block1;
                                                            if (string != null) break block17;
                                                            if (n5 == 0) break block18;
                                                            this.a(t2, i5, n2, i4, list, e92);
                                                            if (string == null) break block19;
                                                        }
                                                        n8 = i5.e(t2, n2.a(p2.b()));
                                                    }
                                                    void var21_21 = n8;
                                                    this.a(t2, i5, n2, (int)var21_21, false, i4, list, e92);
                                                }
                                                ++n6;
                                                if (string == null) continue;
                                            }
                                        }
                                        gp2.b();
                                    }
                                    ++n4;
                                    if (string == null) continue block0;
                                }
                                break;
                            }
                        }
                        n3 = fU.bd();
                    }
                    if (string != null) break block20;
                    if (n3 == 0) break block21;
                    n3 = e92.p();
                }
                if (string != null) break block22;
                if (n3 != 0) break block21;
                n3 = cP.a(t2, i2, n2);
            }
            if (n3 != 0) {
                Y y3 = cP.a();
                object = cP.c();
                this.a(t2, y3, (i)object, n2, i3, bl2, l2);
            }
        }
    }

    public static void a() {
        c = 1.0f - fU.q() * 0.8f;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public static float a(float f10) {
        String string = I.j();
        float f11 = f10;
        if (string == null) {
            f11 = f11 == 0.2f ? c : f10;
        }
        return f11;
    }

    public void a(Y y2, i i2, float f10, boolean bl2) {
        K k2 = i2.b();
        String string = I.j();
        v.a(90.0f, 0.0f, 1.0f, 0.0f);
        int n2 = this.b.a(i2, null, null, 0);
        int n3 = x.S;
        if (string == null) {
            if (n3 != 0) {
                n2 = p.d(n2);
            }
            n3 = n2 >> 16 & 0xFF;
        }
        float f11 = (float)n3 / 255.0f;
        float f12 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f13 = (float)(n2 & 0xFF) / 255.0f;
        if (string == null) {
            if (!bl2) {
                v.b(f10, f10, f10, 1.0f);
            }
            this.a(i2, y2, f10, f11, f12, f13);
        }
    }

    public void a(Y y2, float f10, float f11, float f12, float f13) {
        this.a(null, y2, f10, f11, f12, f13);
    }

    /*
     * Exception decompiling
     */
    public boolean a(t var1_1, Y var2_2, i var3_3, n var4_4, I var5_5, boolean var6_6, long var7_7) {
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

    private void a(t t2, i i2, n n2, int n3, boolean bl2, I i3, List<P> list, e9 e92) {
        BitSet bitSet = e92.i();
        String string = I.j();
        l l2 = i2.b(t2, n2);
        double d10 = (double)n2.e() + l2.e;
        double d11 = (double)n2.b() + l2.d;
        double d12 = (double)n2.a() + l2.b;
        int n4 = list.size();
        for (int i4 = 0; i4 < n4; ++i4) {
            block21: {
                int n5;
                int n6;
                P p2;
                block18: {
                    block19: {
                        P p3;
                        block20: {
                            block17: {
                                I i5;
                                block15: {
                                    block16: {
                                        boolean bl3;
                                        block14: {
                                            p2 = list.get(i4);
                                            bl3 = bl2;
                                            if (string != null) break block14;
                                            if (bl3) {
                                                this.a(i2, p2.d(), p2.b(), null, bitSet);
                                                n n7 = bitSet.get(0) ? n2.a(p2.b()) : n2;
                                                n3 = i2.e(t2, n7);
                                            }
                                            i5 = i3;
                                            if (string != null) break block15;
                                            bl3 = i5.c();
                                        }
                                        if (!bl3) break block16;
                                        i3.a(p2.f());
                                        i3.b(p2.p());
                                        if (string == null) break block17;
                                    }
                                    i5 = i3;
                                }
                                i5.a(p2.d());
                            }
                            i3.c(n3, n3, n3, n3);
                            n6 = fa.a(p2, i2, t2, n2, e92);
                            n5 = p2.c();
                            if (string != null) break block18;
                            if (n5 != 0) break block19;
                            n5 = n6;
                            if (string != null) break block18;
                            if (n5 != -1) break block19;
                            p3 = p2;
                            if (string != null) break block20;
                            if (!p3.l()) break block21;
                            p3 = p2;
                        }
                        float f10 = N.a(p3.b());
                        i3.b(f10, f10, f10, 4);
                        i3.b(f10, f10, f10, 3);
                        i3.b(f10, f10, f10, 2);
                        i3.b(f10, f10, f10, 1);
                        if (string == null) break block21;
                    }
                    n5 = n6;
                }
                int n8 = n5;
                int n9 = n6;
                if (string == null) {
                    if (n9 == -1) {
                        n8 = this.b.a(i2, t2, n2, p2.q());
                    }
                    n9 = x.S ? 1 : 0;
                }
                if (string == null) {
                    if (n9 != 0) {
                        n8 = p.d(n8);
                    }
                    n9 = n8 >> 16 & 0xFF;
                }
                float f11 = (float)n9 / 255.0f;
                float f12 = (float)(n8 >> 8 & 0xFF) / 255.0f;
                float f13 = (float)(n8 & 0xFF) / 255.0f;
                if (string == null) {
                    if (p2.l()) {
                        float f14 = N.a(p2.b());
                        f11 *= f14;
                        f12 *= f14;
                        f13 *= f14;
                    }
                    i3.b(f11, f12, f13, 4);
                    i3.b(f11, f12, f13, 3);
                    i3.b(f11, f12, f13, 2);
                }
                i3.b(f11, f12, f13, 1);
            }
            i3.b(d10, d11, d12);
            if (string == null) continue;
        }
    }

    public void a(i i2, Y y2, float f10, float f11, float f12, float f13) {
        block2: {
            aA[] arraA = aA.VALUES;
            int n2 = arraA.length;
            String string = I.j();
            for (int i3 = 0; i3 < n2; ++i3) {
                aA aA2 = arraA[i3];
                this.a(f10, f11, f12, f13, y2.a(i2, aA2, 0L));
                if (string == null) {
                    if (string == null) continue;
                }
                break block2;
            }
            this.a(f10, f11, f12, f13, y2.a(i2, null, 0L));
        }
    }

    private void a(float f10, float f11, float f12, float f13, List<P> list) {
        W w2 = W.c();
        String string = I.j();
        I i2 = w2.b();
        int n2 = list.size();
        for (int i3 = 0; i3 < n2; ++i3) {
            P p2;
            block5: {
                I i4;
                block3: {
                    block4: {
                        p2 = list.get(i3);
                        i2.a(7, net.minecraft.client.y.b.f);
                        i4 = i2;
                        if (string != null) break block3;
                        i4.a(p2.d());
                        if (!p2.c()) break block4;
                        i2.b(f11 * f10, f12 * f10, f13 * f10);
                        if (string == null) break block5;
                    }
                    i4 = i2;
                }
                i4.b(f10, f10, f10);
            }
            m m2 = p2.b().m();
            i2.c(m2.e(), m2.b(), m2.a());
            w2.a();
            if (string == null) continue;
        }
    }
}

