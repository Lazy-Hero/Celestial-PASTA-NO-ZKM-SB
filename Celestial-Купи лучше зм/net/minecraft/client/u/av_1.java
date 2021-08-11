/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.u;

import java.util.Random;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.j.c;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class av {
    protected /* synthetic */ float F;
    protected /* synthetic */ float A;
    protected /* synthetic */ float h;
    protected /* synthetic */ double D;
    protected /* synthetic */ double q;
    protected /* synthetic */ float L;
    protected /* synthetic */ double t;
    protected /* synthetic */ float p;
    protected /* synthetic */ float E;
    protected /* synthetic */ float C;
    private static final /* synthetic */ k v;
    protected /* synthetic */ boolean k;
    protected /* synthetic */ float i;
    protected /* synthetic */ float c;
    protected /* synthetic */ float u;
    protected /* synthetic */ int x;
    protected /* synthetic */ boolean l;
    protected /* synthetic */ float B;
    protected /* synthetic */ double f;
    protected /* synthetic */ z a;
    public static /* synthetic */ l g;
    protected /* synthetic */ double n;
    protected /* synthetic */ double s;
    protected /* synthetic */ float d;
    protected /* synthetic */ boolean m;
    protected /* synthetic */ int K;
    protected /* synthetic */ int e;
    private static /* synthetic */ int[] r;
    protected /* synthetic */ int J;
    protected /* synthetic */ double b;
    public static /* synthetic */ double o;
    protected /* synthetic */ c G;
    protected /* synthetic */ Random y;
    public static /* synthetic */ double j;
    protected /* synthetic */ double z;
    protected /* synthetic */ double I;
    private /* synthetic */ k H;
    public static /* synthetic */ double w;

    public static int[] e() {
        return r;
    }

    protected void j() {
        k k2 = this.g();
        this.b = (k2.e + k2.f) / 2.0;
        this.D = k2.b;
        this.z = (k2.d + k2.g) / 2.0;
    }

    public boolean l() {
        int[] arrn = av.e();
        boolean bl2 = this.k;
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    static {
        v = new k(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        av.b(new int[1]);
    }

    public av d(float f10) {
        this.s *= (double)f10;
        this.n = (this.n - (double)0.1f) * (double)f10 + (double)0.1f;
        this.I *= (double)f10;
        return this;
    }

    public void h() {
        ++this.J;
    }

    public void c() {
        this.k = true;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public k g() {
        return this.H;
    }

    public void c(float f10) {
        this.i = f10;
    }

    public void b(double d10, double d11, double d12) {
        this.b = d10;
        this.D = d11;
        this.z = d12;
        float f10 = this.h / 2.0f;
        float f11 = this.A;
        this.a(new k(d10 - (double)f10, d11, d12 - (double)f10, d10 + (double)f10, d11 + (double)f11, d12 + (double)f10));
    }

    public static void b(int[] arrn) {
        r = arrn;
    }

    protected av(z z2, double d10, double d11, double d12) {
        this.H = v;
        this.h = 0.6f;
        this.A = 1.8f;
        this.y = new Random();
        this.i = 1.0f;
        this.a = z2;
        this.a(0.2f, 0.2f);
        this.b(d10, d11, d12);
        this.q = d10;
        this.t = d11;
        this.f = d12;
        this.B = 1.0f;
        this.C = 1.0f;
        this.p = 1.0f;
        this.L = this.y.nextFloat() * 3.0f;
        this.d = this.y.nextFloat() * 3.0f;
        this.E = (this.y.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.e = (int)(4.0f / (this.y.nextFloat() * 0.9f + 0.1f));
        this.K = 0;
        this.m = true;
    }

    public void a(I i2, x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = (float)this.J / 16.0f;
        float f17 = f16 + 0.0624375f;
        int[] arrn = av.e();
        float f18 = (float)this.x / 16.0f;
        float f19 = f18 + 0.0624375f;
        float f20 = 0.1f * this.E;
        av av2 = this;
        if (arrn != null) {
            if (av2.G != null) {
                f16 = this.G.i();
                f17 = this.G.l();
                f18 = this.G.u();
                f19 = this.G.m();
            }
            av2 = this;
        }
        float f21 = (float)(av2.q + (this.b - this.q) * (double)f10 - j);
        float f22 = (float)(this.t + (this.D - this.t) * (double)f10 - o);
        float f23 = (float)(this.f + (this.z - this.f) * (double)f10 - w);
        int n2 = this.a(f10);
        int n3 = n2 >> 16 & 0xFFFF;
        int n4 = n2 & 0xFFFF;
        l[] arrl = new l[]{new l(-f11 * f20 - f14 * f20, -f12 * f20, -f13 * f20 - f15 * f20), new l(-f11 * f20 + f14 * f20, f12 * f20, -f13 * f20 + f15 * f20), new l(f11 * f20 + f14 * f20, f12 * f20, f13 * f20 + f15 * f20), new l(f11 * f20 - f14 * f20, -f12 * f20, f13 * f20 - f15 * f20)};
        if (arrn != null) {
            if (this.c != 0.0f) {
                float f24 = this.c + (this.c - this.F) * f10;
                float f25 = net.minecraft.k.h.c(f24 * 0.5f);
                float f26 = net.minecraft.k.h.g(f24 * 0.5f) * (float)av.g.e;
                float f27 = net.minecraft.k.h.g(f24 * 0.5f) * (float)av.g.d;
                float f28 = net.minecraft.k.h.g(f24 * 0.5f) * (float)av.g.b;
                l l2 = new l(f26, f27, f28);
                for (int i3 = 0; i3 < 4; ++i3) {
                    arrl[i3] = l2.a(2.0 * arrl[i3].g(l2)).c(arrl[i3].a((double)(f25 * f25) - l2.g(l2))).c(l2.a(arrl[i3]).a((double)(2.0f * f25)));
                    if (arrn != null) {
                        if (arrn != null) continue;
                        net.minecraft.k.m.b(!net.minecraft.k.m.c());
                    }
                    break;
                }
            } else {
                i2.c((double)f21 + arrl[0].e, (double)f22 + arrl[0].d, (double)f23 + arrl[0].b).a(f17, f19).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
                i2.c((double)f21 + arrl[1].e, (double)f22 + arrl[1].d, (double)f23 + arrl[1].b).a(f17, f18).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
                i2.c((double)f21 + arrl[2].e, (double)f22 + arrl[2].d, (double)f23 + arrl[2].b).a(f16, f18).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
                i2.c((double)f21 + arrl[3].e, (double)f22 + arrl[3].d, (double)f23 + arrl[3].b).a(f16, f19).a(this.B, this.C, this.p, this.i).a(n3, n4).d();
            }
        }
    }

    public void a(c c10) {
        block4: {
            block3: {
                int[] arrn;
                block2: {
                    int n2 = this.d();
                    arrn = av.e();
                    if (arrn == null) break block2;
                    if (n2 != 1) break block3;
                    this.G = c10;
                }
                if (arrn != null) break block4;
            }
            throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
        }
    }

    public boolean a() {
        return false;
    }

    public void a(k k2) {
        this.H = k2;
    }

    public int a(float f10) {
        n n2 = new n(this.b, this.D, this.z);
        int[] arrn = av.e();
        int n3 = this.a.n(n2);
        if (arrn != null) {
            n3 = n3 != 0 ? this.a.a(n2, 0) : 0;
        }
        return n3;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public float b() {
        return this.C;
    }

    /*
     * Exception decompiling
     */
    public void a(double var1_1, double var3_2, double var5_3) {
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

    public av(z z2, double d10, double d11, double d12, double d13, double d14, double d15) {
        this(z2, d10, d11, d12);
        this.s = d13 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.n = d14 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        this.I = d15 + (Math.random() * 2.0 - 1.0) * (double)0.4f;
        float f10 = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f11 = net.minecraft.k.h.e(this.s * this.s + this.n * this.n + this.I * this.I);
        this.s = this.s / (double)f11 * (double)f10 * (double)0.4f;
        this.n = this.n / (double)f11 * (double)f10 * (double)0.4f + (double)0.1f;
        this.I = this.I / (double)f11 * (double)f10 * (double)0.4f;
    }

    public int d() {
        return 0;
    }

    public void a(int n2) {
        int[] arrn = av.e();
        av av2 = this;
        if (arrn != null) {
            if (av2.d() != 0) {
                throw new RuntimeException("Invalid call to Particle.setMiscTex");
            }
            this.J = n2 % 16;
            av2 = this;
        }
        av2.x = n2 / 16;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.b + "," + this.D + "," + this.z + "), RGBA (" + this.B + "," + this.C + "," + this.p + "," + this.i + "), Age " + this.K;
    }

    public void i() {
        block6: {
            block5: {
                av av2;
                int n2;
                block4: {
                    this.q = this.b;
                    int[] arrn = av.e();
                    this.t = this.D;
                    this.f = this.z;
                    int n3 = this.K;
                    n2 = n3;
                    this.K = n3 + 1;
                    if (arrn == null) break block4;
                    if (n2 >= this.e) {
                        this.c();
                    }
                    this.n -= 0.04 * (double)this.u;
                    this.a(this.s, this.n, this.I);
                    this.s *= (double)0.98f;
                    this.n *= (double)0.98f;
                    this.I *= (double)0.98f;
                    av2 = this;
                    if (arrn == null) break block5;
                    n2 = av2.l ? 1 : 0;
                }
                if (n2 == 0) break block6;
                this.s *= (double)0.7f;
                av2 = this;
            }
            av2.I *= (double)0.7f;
        }
    }

    public av b(float f10) {
        this.a(0.2f * f10, 0.2f * f10);
        this.E *= f10;
        return this;
    }

    protected void a(float f10, float f11) {
        block3: {
            block2: {
                int[] arrn = av.e();
                if (arrn == null) break block2;
                if (f10 == this.h && f11 == this.A) break block3;
                this.h = f10;
                this.A = f11;
            }
            k k2 = this.g();
            this.a(new k(k2.e, k2.b, k2.d, k2.e + (double)this.h, k2.b + (double)this.A, k2.d + (double)this.h));
        }
    }

    public float k() {
        return this.p;
    }

    public void a(float f10, float f11, float f12) {
        this.B = f10;
        this.C = f11;
        this.p = f12;
    }

    public float f() {
        return this.B;
    }
}

