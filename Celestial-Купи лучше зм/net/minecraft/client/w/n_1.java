/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.a3;
import net.minecraft.ar.b;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.e;
import net.minecraft.client.w.j;

public class n
extends j {
    public /* synthetic */ e r;
    public /* synthetic */ c m;
    public /* synthetic */ c q;
    public /* synthetic */ boolean p;
    public /* synthetic */ c k;
    public /* synthetic */ c n;
    public /* synthetic */ c i;
    public /* synthetic */ e l;
    public /* synthetic */ c j;
    public /* synthetic */ c o;

    public n(float f10) {
        this(f10, 0.0f, 64, 32);
    }

    @Override
    public void a(j j2) {
        block3: {
            j j3;
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                super.a(j2);
                int[] arrn2 = arrn;
                j3 = j2;
                if (arrn2 != null) break block2;
                if (!(j3 instanceof n)) break block3;
                j3 = j2;
            }
            n n2 = (n)j3;
            this.l = n2.l;
            this.r = n2.r;
            this.p = n2.p;
        }
    }

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        block6: {
            boolean bl2;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.client.w.j.b();
                    this.a(f10, f11, f12, f13, f14, f15, x2);
                    v.M();
                    int[] arrn2 = arrn;
                    bl2 = this.h;
                    if (arrn2 != null) break block4;
                    if (!bl2) break block5;
                    float f16 = 2.0f;
                    v.d(0.75f, 0.75f, 0.75f);
                    v.b(0.0f, 16.0f * f15, 0.0f);
                    this.n.b(f15);
                    v.B();
                    v.M();
                    v.d(0.5f, 0.5f, 0.5f);
                    v.b(0.0f, 24.0f * f15, 0.0f);
                    this.j.b(f15);
                    this.o.b(f15);
                    this.k.b(f15);
                    this.i.b(f15);
                    this.m.b(f15);
                    this.q.b(f15);
                    if (arrn2 == null) break block6;
                }
                bl2 = x2.a4();
            }
            if (bl2) {
                v.b(0.0f, 0.2f, 0.0f);
            }
            this.n.b(f15);
            this.j.b(f15);
            this.o.b(f15);
            this.k.b(f15);
            this.i.b(f15);
            this.m.b(f15);
            this.q.b(f15);
        }
        v.B();
    }

    public n() {
        this(0.0f);
    }

    protected c a(b b10) {
        return b10 == net.minecraft.ar.b.LEFT ? this.k : this.o;
    }

    public void a(float f10, b b10) {
        this.a(b10).a(f10);
    }

    public void a(boolean bl2) {
        this.n.q = bl2;
        this.q.q = bl2;
        this.j.q = bl2;
        this.o.q = bl2;
        this.k.q = bl2;
        this.i.q = bl2;
        this.m.q = bl2;
    }

    public n(float f10, float f11, int n2, int n3) {
        this.l = e.EMPTY;
        this.r = e.EMPTY;
        this.g = n2;
        this.f = n3;
        this.n = new c(this, 0, 0);
        this.n.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, f10);
        this.n.a(0.0f, 0.0f + f11, 0.0f);
        this.q = new c(this, 32, 0);
        this.q.b(-4.0f, -8.0f, -4.0f, 8, 8, 8, f10 + 0.5f);
        this.q.a(0.0f, 0.0f + f11, 0.0f);
        this.j = new c(this, 16, 16);
        this.j.b(-4.0f, 0.0f, -2.0f, 8, 12, 4, f10);
        this.j.a(0.0f, 0.0f + f11, 0.0f);
        this.o = new c(this, 40, 16);
        this.o.b(-3.0f, -2.0f, -2.0f, 4, 12, 4, f10);
        this.o.a(-5.0f, 2.0f + f11, 0.0f);
        this.k = new c(this, 40, 16);
        this.k.A = true;
        this.k.b(-1.0f, -2.0f, -2.0f, 4, 12, 4, f10);
        this.k.a(5.0f, 2.0f + f11, 0.0f);
        this.i = new c(this, 0, 16);
        this.i.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.i.a(-1.9f, 12.0f + f11, 0.0f);
        this.m = new c(this, 0, 16);
        this.m.A = true;
        this.m.b(-2.0f, 0.0f, -2.0f, 4, 12, 4, f10);
        this.m.a(1.9f, 12.0f + f11, 0.0f);
    }

    protected b a(x x2) {
        block3: {
            x x3;
            block2: {
                int[] arrn = net.minecraft.client.w.j.b();
                x3 = x2;
                if (arrn != null) break block2;
                if (!(x3 instanceof B)) break block3;
                x3 = x2;
            }
            B b10 = (B)x3;
            b b11 = b10.al();
            return b10.aY == a3.MAIN_HAND ? b11 : b11.a();
        }
        return net.minecraft.ar.b.RIGHT;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, float var6_6, x var7_7) {
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
}

