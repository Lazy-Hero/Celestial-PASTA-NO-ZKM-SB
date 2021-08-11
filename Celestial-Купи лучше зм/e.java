/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public class e
implements Cloneable,
Serializable {
    /* synthetic */ double[] a;
    private /* synthetic */ int b;
    static final /* synthetic */ long serialVersionUID = 1398850036893875112L;

    public final void a(o o2) {
        int n2;
        int n3 = ae.g();
        int n4 = this.b;
        if (n3 == 0) {
            if (n4 < 3) {
                this.b = 3;
                this.a = new double[3];
            }
            this.a[0] = o2.c;
            this.a[1] = o2.b;
            this.a[2] = o2.a;
            n4 = n2 = 3;
        }
        while (n2 < this.b) {
            this.a[n2] = 0.0;
            ++n2;
            if (n3 == 0) continue;
        }
    }

    public final void a(x x2) {
        int n2;
        int n3 = ae.f();
        int n4 = this.b;
        if (n3 != 0) {
            if (n4 < 2) {
                this.b = 2;
                this.a = new double[2];
            }
            this.a[0] = x2.b;
            this.a[1] = x2.a;
            n4 = n2 = 2;
        }
        while (n2 < this.b) {
            this.a[n2] = 0.0;
            ++n2;
            if (n3 != 0) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public final void c(e e10) {
        int n2;
        int n3 = ae.f();
        int n4 = this.b;
        if (n3 != 0) {
            if (n4 != e10.b) {
                throw new gX(cK.a("GVector4"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.b) {
            int n5 = n2;
            this.a[n5] = this.a[n5] + e10.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void a(e e10, double d10) {
        int n2;
        int n3 = ae.f();
        int n4 = e10.b;
        if (n3 != 0) {
            if (n4 != this.b) {
                throw new gX(cK.a("GVector22"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = (1.0 - d10) * this.a[n2] + d10 * e10.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void a(fI fI2, e e10) {
        double[] arrd;
        int n2;
        block18: {
            Object object;
            block16: {
                block17: {
                    block15: {
                        int n3;
                        int n4;
                        block14: {
                            n2 = ae.f();
                            n4 = fI2.d();
                            n3 = e10.b;
                            if (n2 == 0) break block14;
                            if (n4 != n3) {
                                throw new gX(cK.a("GVector10"));
                            }
                            object = this;
                            if (n2 == 0) break block15;
                            n4 = ((e)object).b;
                            n3 = fI2.a();
                        }
                        if (n4 != n3) {
                            throw new gX(cK.a("GVector11"));
                        }
                        object = e10;
                    }
                    if (n2 == 0) break block16;
                    if (object == this) break block17;
                    arrd = e10.a;
                    if (n2 != 0) break block18;
                }
                object = this.a.clone();
            }
            arrd = (double[])object;
        }
        int n5 = this.b - 1;
        while (n5 >= 0) {
            block13: {
                this.a[n5] = 0.0;
                for (int i2 = e10.b - 1; i2 >= 0; --i2) {
                    int n6 = n5;
                    this.a[n6] = this.a[n6] + fI2.c[n5][i2] * arrd[i2];
                    if (n2 != 0) {
                        if (n2 != 0) continue;
                    }
                    break block13;
                }
                --n5;
            }
            if (n2 != 0) continue;
        }
    }

    public final void a(e e10, e e11, float f10) {
        this.a(e10, e11, (double)f10);
    }

    public e(double[] arrd) {
        int n2 = ae.g();
        this.b = arrd.length;
        int n3 = n2;
        this.a = new double[arrd.length];
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.a[i2] = arrd[i2];
            if (n3 == 0) continue;
        }
    }

    public final void a(gS gS2) {
        int n2;
        int n3 = ae.g();
        int n4 = this.b;
        if (n3 == 0) {
            if (n4 < 4) {
                this.b = 4;
                this.a = new double[4];
            }
            this.a[0] = gS2.c;
            this.a[1] = gS2.a;
            this.a[2] = gS2.b;
            this.a[3] = gS2.d;
            n4 = n2 = 4;
        }
        while (n2 < this.b) {
            this.a[n2] = 0.0;
            ++n2;
            if (n3 == 0) continue;
        }
    }

    public e(e e10) {
        int n2 = ae.g();
        this.a = new double[e10.b];
        this.b = e10.b;
        int n3 = n2;
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.a[i2] = e10.a[i2];
            if (n3 == 0) continue;
        }
    }

    public e(int n2) {
        int n3 = ae.g();
        int n4 = n3;
        this.b = n2;
        this.a = new double[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = 0.0;
            if (n4 == 0) continue;
        }
    }

    public final void a(e e10, fI fI2) {
        double[] arrd;
        int n2;
        block18: {
            Object object;
            block16: {
                block17: {
                    block15: {
                        int n3;
                        int n4;
                        block14: {
                            n2 = ae.g();
                            n4 = fI2.a();
                            n3 = e10.b;
                            if (n2 != 0) break block14;
                            if (n4 != n3) {
                                throw new gX(cK.a("GVector12"));
                            }
                            object = this;
                            if (n2 != 0) break block15;
                            n4 = ((e)object).b;
                            n3 = fI2.d();
                        }
                        if (n4 != n3) {
                            throw new gX(cK.a("GVector13"));
                        }
                        object = e10;
                    }
                    if (n2 != 0) break block16;
                    if (object == this) break block17;
                    arrd = e10.a;
                    if (n2 == 0) break block18;
                }
                object = this.a.clone();
            }
            arrd = (double[])object;
        }
        int n5 = this.b - 1;
        while (n5 >= 0) {
            block13: {
                this.a[n5] = 0.0;
                for (int i2 = e10.b - 1; i2 >= 0; --i2) {
                    int n6 = n5;
                    this.a[n6] = this.a[n6] + fI2.c[i2][n5] * arrd[i2];
                    if (n2 == 0) {
                        if (n2 == 0) continue;
                    }
                    break block13;
                }
                --n5;
            }
            if (n2 == 0) continue;
        }
    }

    public final double b(int n2) {
        return this.a[n2];
    }

    public final void a(int n2) {
        block6: {
            int n3;
            int n4;
            double[] arrd;
            block9: {
                int n5;
                block7: {
                    block8: {
                        arrd = new double[n2];
                        n4 = ae.g();
                        n5 = this.b;
                        if (n4 != 0) break block7;
                        if (n5 >= n2) break block8;
                        n3 = this.b;
                        if (n4 == 0) break block9;
                    }
                    n5 = n2;
                }
                n3 = n5;
            }
            for (int i2 = 0; i2 < n3; ++i2) {
                arrd[i2] = this.a[i2];
                if (n4 == 0) {
                    if (n4 == 0) continue;
                }
                break block6;
            }
            this.b = n2;
            this.a = arrd;
        }
    }

    public final void a(e e10, e e11) {
        int n2;
        int n3;
        block7: {
            int n4;
            int n5;
            block6: {
                n3 = ae.g();
                n5 = e10.b;
                n4 = e11.b;
                if (n3 != 0) break block6;
                if (n5 != n4) {
                    throw new gX(cK.a("GVector8"));
                }
                n5 = this.b;
                if (n3 != 0) break block7;
                n4 = e10.b;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GVector9"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = e10.a[n2] - e11.a[n2];
            ++n2;
            if (n3 == 0) continue;
        }
    }

    public boolean b(e e10, double d10) {
        int n2;
        block8: {
            int n3;
            int n4 = ae.g();
            int n5 = this.b;
            if (n4 == 0) {
                if (n5 != e10.b) {
                    return false;
                }
                n5 = n3 = 0;
            }
            while (n3 < this.b) {
                block10: {
                    double d11;
                    block9: {
                        double d12;
                        double d13;
                        double d14 = d13 = this.a[n3] - e10.a[n3];
                        if (n4 == 0) {
                            double d15 = d14 - 0.0;
                            n2 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                            if (n4 != 0) break block8;
                            d14 = n2 < 0 ? -d13 : d13;
                        }
                        d11 = (d12 = d14 - d10) == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                        if (n4 != 0) break block9;
                        if (d11 <= 0) break block10;
                        d11 = 0.0;
                    }
                    return (boolean)d11;
                }
                ++n3;
                if (n4 == 0) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public e(ae ae2) {
        this.a = new double[4];
        this.a[0] = ae2.c;
        this.a[1] = ae2.a;
        this.a[2] = ae2.b;
        this.a[3] = ae2.d;
        this.b = 4;
    }

    public final void a(double d10) {
        int n2 = ae.f();
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.a[i2] = this.a[i2] * d10;
            if (n2 != 0) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean f(e var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[DOLOOP]], but top level block is 3[TRYBLOCK]
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

    public final double b() {
        double d10;
        block2: {
            double d11 = 0.0;
            int n2 = ae.f();
            for (int i2 = 0; i2 < this.b; ++i2) {
                d10 = d11 + this.a[i2] * this.a[i2];
                if (n2 != 0) {
                    d11 = d10;
                    if (n2 != 0) continue;
                }
                break block2;
            }
            d10 = d11;
        }
        return d10;
    }

    public final void a(fI fI2, fI fI3, fI fI4, e e10) {
        fI fI5;
        block12: {
            block13: {
                block10: {
                    int n2;
                    int n3;
                    block11: {
                        int n4;
                        block9: {
                            block7: {
                                block8: {
                                    block5: {
                                        block6: {
                                            block4: {
                                                n4 = ae.f();
                                                n3 = fI2.a;
                                                n2 = e10.c();
                                                if (n4 == 0) break block4;
                                                if (n3 != n2) break block5;
                                                n3 = fI2.a;
                                                n2 = fI2.e;
                                            }
                                            if (n4 == 0) break block6;
                                            if (n3 != n2) break block5;
                                            n3 = fI2.a;
                                            n2 = fI3.a;
                                        }
                                        if (n4 == 0) break block7;
                                        if (n3 == n2) break block8;
                                    }
                                    throw new gX(cK.a("GVector15"));
                                }
                                n3 = fI3.e;
                                n2 = this.a.length;
                            }
                            if (n4 == 0) break block9;
                            if (n3 != n2) break block10;
                            n3 = fI3.e;
                            n2 = fI4.e;
                        }
                        if (n4 == 0) break block11;
                        if (n3 != n2) break block10;
                        fI5 = fI3;
                        if (n4 == 0) break block12;
                        n3 = fI5.e;
                        n2 = fI4.a;
                    }
                    if (n3 == n2) break block13;
                }
                throw new gX(cK.a("GVector23"));
            }
            fI5 = new fI(fI2.a, fI3.e);
        }
        fI fI6 = fI5;
        fI6.e(fI2, fI4);
        fI6.d(fI2, fI3);
        fI6.f();
        this.a(fI6, e10);
    }

    public final void a(fI fI2, e e10, e e11) {
        int n2;
        double[] arrd;
        int n3;
        block22: {
            int[] arrn;
            double[] arrd2;
            block21: {
                block20: {
                    int n4;
                    block18: {
                        int n5;
                        block24: {
                            int n6;
                            int n7;
                            block23: {
                                n4 = fI2.a * fI2.e;
                                arrd2 = new double[n4];
                                n3 = ae.f();
                                arrd = new double[n4];
                                arrn = new int[e10.c()];
                                n7 = fI2.a;
                                n6 = e10.c();
                                if (n3 != 0) {
                                    if (n7 != n6) {
                                        throw new gX(cK.a("GVector16"));
                                    }
                                    n7 = fI2.a;
                                    n6 = e11.c();
                                }
                                if (n3 == 0) break block23;
                                if (n7 != n6) {
                                    throw new gX(cK.a("GVector24"));
                                }
                                n7 = fI2.a;
                                if (n3 == 0) break block24;
                                n6 = fI2.e;
                            }
                            if (n7 != n6) {
                                throw new gX(cK.a("GVector25"));
                            }
                            n7 = n2 = 0;
                        }
                        while (n2 < fI2.a) {
                            block19: {
                                n5 = 0;
                                if (n3 == 0) break block18;
                                for (int i2 = v10218; i2 < fI2.e; ++i2) {
                                    arrd2[n2 * fI2.e + i2] = fI2.c[n2][i2];
                                    if (n3 != 0) {
                                        if (n3 != 0) continue;
                                    }
                                    break block19;
                                }
                                ++n2;
                            }
                            if (n3 != 0) continue;
                        }
                        n5 = n2 = 0;
                    }
                    while (n2 < n4) {
                        arrd[n2] = 0.0;
                        ++n2;
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block20;
                    }
                    n2 = 0;
                }
                while (n2 < fI2.a) {
                    arrd[n2 * fI2.e] = e10.a[n2];
                    ++n2;
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block21;
                }
                n2 = 0;
            }
            while (n2 < fI2.e) {
                arrn[n2] = (int)e11.a[n2];
                ++n2;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block22;
            }
            fI.a(fI2.a, arrd2, arrn, arrd);
        }
        for (n2 = 0; n2 < fI2.a; ++n2) {
            this.a[n2] = arrd[n2 * fI2.e];
            if (n3 != 0) continue;
        }
    }

    public final void b(e e10, e e11) {
        int n2;
        int n3;
        block7: {
            int n4;
            int n5;
            block6: {
                n3 = ae.f();
                n5 = e10.b;
                n4 = e11.b;
                if (n3 == 0) break block6;
                if (n5 != n4) {
                    throw new gX(cK.a("GVector5"));
                }
                n5 = this.b;
                if (n3 == 0) break block7;
                n4 = e10.b;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GVector6"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = e10.a[n2] + e11.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void a(e e10, float f10) {
        this.a(e10, (double)f10);
    }

    public final double a(e e10) {
        double d10;
        block3: {
            int n2 = ae.g();
            if (this.b != e10.b) {
                throw new gX(cK.a("GVector14"));
            }
            double d11 = 0.0;
            for (int i2 = 0; i2 < this.b; ++i2) {
                d10 = d11 + this.a[i2] * e10.a[i2];
                if (n2 == 0) {
                    d11 = d10;
                    if (n2 == 0) continue;
                }
                break block3;
            }
            d10 = d11;
        }
        return d10;
    }

    public final void b(e e10) {
        double d10;
        int n2;
        int n3;
        block5: {
            double d11 = 0.0;
            n3 = ae.f();
            int n4 = this.b;
            if (n3 != 0) {
                if (n4 != e10.b) {
                    throw new gX(cK.a("GVector0"));
                }
                n4 = n2 = 0;
            }
            while (n2 < this.b) {
                d10 = d11 + e10.a[n2] * e10.a[n2];
                if (n3 != 0) {
                    d11 = d10;
                    ++n2;
                    if (n3 != 0) continue;
                }
                break block5;
            }
            d10 = 1.0 / Math.sqrt(d11);
        }
        double d12 = d10;
        for (n2 = 0; n2 < this.b; ++n2) {
            this.a[n2] = e10.a[n2] * d12;
            if (n3 != 0) continue;
        }
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 6[DOLOOP]
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

    public final void g(e e10) {
        int n2;
        int n3 = ae.f();
        int n4 = this.b;
        if (n3 != 0) {
            if (n4 != e10.b) {
                throw new gX(cK.a("GVector7"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.b) {
            int n5 = n2;
            this.a[n5] = this.a[n5] - e10.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(e e10) {
        int n2;
        int n3;
        block6: {
            n3 = ae.f();
            int n4 = this.b;
            if (n3 != 0) {
                if (n4 < e10.b) {
                    this.b = e10.b;
                    this.a = new double[this.b];
                    n2 = 0;
                    do {
                        if (n2 >= this.b) return;
                        this.a[n2] = e10.a[n2];
                        ++n2;
                    } while (n3 != 0);
                }
                n4 = n2 = 0;
            }
            while (n2 < e10.b) {
                this.a[n2] = e10.a[n2];
                ++n2;
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block6;
            }
            n2 = e10.b;
        }
        do {
            if (n2 >= this.b) return;
            this.a[n2] = 0.0;
            ++n2;
        } while (n3 != 0);
    }

    public e(gS gS2) {
        this.a = new double[4];
        this.a[0] = gS2.c;
        this.a[1] = gS2.a;
        this.a[2] = gS2.b;
        this.a[3] = gS2.d;
        this.b = 4;
    }

    public final void a(ae ae2) {
        int n2;
        int n3 = ae.g();
        int n4 = this.b;
        if (n3 == 0) {
            if (n4 < 4) {
                this.b = 4;
                this.a = new double[4];
            }
            this.a[0] = ae2.c;
            this.a[1] = ae2.a;
            this.a[2] = ae2.b;
            this.a[3] = ae2.d;
            n4 = n2 = 4;
        }
        while (n2 < this.b) {
            this.a[n2] = 0.0;
            ++n2;
            if (n3 == 0) continue;
        }
    }

    public final void a(int n2, double d10) {
        this.a[n2] = d10;
    }

    public final void e() {
        int n2 = ae.f();
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.a[i2] = 0.0;
            if (n2 != 0) continue;
        }
    }

    public e(double[] arrd, int n2) {
        this.b = n2;
        int n3 = ae.f();
        this.a = new double[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            this.a[i2] = arrd[i2];
            if (n3 != 0) continue;
        }
    }

    public String toString() {
        StringBuffer stringBuffer;
        block2: {
            StringBuffer stringBuffer2 = new StringBuffer(this.b * 8);
            int n2 = ae.f();
            for (int i2 = 0; i2 < this.b; ++i2) {
                stringBuffer = stringBuffer2.append(this.a[i2]).append(" ");
                if (n2 != 0) {
                    if (n2 != 0) continue;
                }
                break block2;
            }
            stringBuffer = stringBuffer2;
        }
        return stringBuffer.toString();
    }

    public final void a(double[] arrd) {
        int n2 = ae.f();
        for (int i2 = this.b - 1; i2 >= 0; --i2) {
            this.a[i2] = arrd[i2];
            if (n2 != 0) continue;
        }
    }

    public final void a(e e10, e e11, double d10) {
        int n2;
        int n3;
        block7: {
            int n4;
            int n5;
            block6: {
                n3 = ae.f();
                n5 = e11.b;
                n4 = e10.b;
                if (n3 == 0) break block6;
                if (n5 != n4) {
                    throw new gX(cK.a("GVector20"));
                }
                n5 = this.b;
                if (n3 == 0) break block7;
                n4 = e10.b;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GVector21"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = (1.0 - d10) * e10.a[n2] + d10 * e11.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void d() {
        int n2 = this.b - 1;
        int n3 = ae.f();
        while (n2 >= 0) {
            int n4 = n2--;
            this.a[n4] = this.a[n4] * -1.0;
            if (n3 != 0) continue;
        }
    }

    public e(o o2) {
        this.a = new double[3];
        this.a[0] = o2.c;
        this.a[1] = o2.b;
        this.a[2] = o2.a;
        this.b = 3;
    }

    public Object clone() {
        e e10;
        block4: {
            e e11 = null;
            int n2 = ae.f();
            try {
                e11 = (e)super.clone();
            }
            catch (CloneNotSupportedException cloneNotSupportedException) {
                throw new InternalError();
            }
            e11.a = new double[this.b];
            for (int i2 = 0; i2 < this.b; ++i2) {
                e10 = e11;
                if (n2 != 0) {
                    e10.a[i2] = this.a[i2];
                    if (n2 != 0) continue;
                }
                break block4;
            }
            e10 = e11;
        }
        return e10;
    }

    public final int c() {
        return this.a.length;
    }

    public final void a(double d10, e e10, e e11) {
        int n2;
        int n3;
        block7: {
            int n4;
            int n5;
            block6: {
                n3 = ae.f();
                n5 = e11.b;
                n4 = e10.b;
                if (n3 == 0) break block6;
                if (n5 != n4) {
                    throw new gX(cK.a("GVector2"));
                }
                n5 = this.b;
                if (n3 == 0) break block7;
                n4 = e10.b;
            }
            if (n5 != n4) {
                throw new gX(cK.a("GVector3"));
            }
            n5 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = e10.a[n2] * d10 + e11.a[n2];
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void a(U u2) {
        int n2;
        int n3 = ae.f();
        int n4 = this.b;
        if (n3 != 0) {
            if (n4 < 3) {
                this.b = 3;
                this.a = new double[3];
            }
            this.a[0] = u2.c;
            this.a[1] = u2.a;
            this.a[2] = u2.b;
            n4 = n2 = 3;
        }
        while (n2 < this.b) {
            this.a[n2] = 0.0;
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public final void a(double d10, e e10) {
        int n2;
        int n3 = ae.g();
        int n4 = this.b;
        if (n3 == 0) {
            if (n4 != e10.b) {
                throw new gX(cK.a("GVector1"));
            }
            n4 = n2 = 0;
        }
        while (n2 < this.b) {
            this.a[n2] = e10.a[n2] * d10;
            ++n2;
            if (n3 == 0) continue;
        }
    }

    public final double f() {
        double d10;
        block2: {
            double d11 = 0.0;
            int n2 = ae.g();
            for (int i2 = 0; i2 < this.b; ++i2) {
                d10 = d11 + this.a[i2] * this.a[i2];
                if (n2 == 0) {
                    d11 = d10;
                    if (n2 == 0) continue;
                }
                break block2;
            }
            d10 = Math.sqrt(d11);
        }
        return d10;
    }

    public int hashCode() {
        long l2;
        block2: {
            long l3 = 1L;
            int n2 = ae.f();
            for (int i2 = 0; i2 < this.b; ++i2) {
                l2 = gW.a(l3, this.a[i2]);
                if (n2 != 0) {
                    l3 = l2;
                    if (n2 != 0) continue;
                }
                break block2;
            }
            l2 = l3;
        }
        return gW.a(l2);
    }

    public e(U u2) {
        this.a = new double[3];
        this.a[0] = u2.c;
        this.a[1] = u2.a;
        this.a[2] = u2.b;
        this.b = 3;
    }

    public final void a() {
        double d10;
        int n2;
        int n3;
        block3: {
            double d11 = 0.0;
            n3 = ae.f();
            for (n2 = 0; n2 < this.b; ++n2) {
                d10 = d11 + this.a[n2] * this.a[n2];
                if (n3 != 0) {
                    d11 = d10;
                    if (n3 != 0) continue;
                }
                break block3;
            }
            d10 = 1.0 / Math.sqrt(d11);
        }
        double d12 = d10;
        for (n2 = 0; n2 < this.b; ++n2) {
            this.a[n2] = this.a[n2] * d12;
            if (n3 != 0) continue;
        }
    }

    public final double d(e e10) {
        return Math.acos(this.a(e10) / (this.f() * e10.f()));
    }

    public e(x x2) {
        this.a = new double[2];
        this.a[0] = x2.b;
        this.a[1] = x2.a;
        this.b = 2;
    }
}

