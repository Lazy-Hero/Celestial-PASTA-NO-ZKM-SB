/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.F;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.N.A;
import net.minecraft.N.E;
import net.minecraft.N.F;
import net.minecraft.N.G;
import net.minecraft.N.H;
import net.minecraft.N.K;
import net.minecraft.N.O;
import net.minecraft.N.S;
import net.minecraft.N.T;
import net.minecraft.N.V;
import net.minecraft.N.W;
import net.minecraft.N.X;
import net.minecraft.N.Y;
import net.minecraft.N.y;
import net.minecraft.N.z;
import net.minecraft.U.x;
import net.minecraft.ar.Z;
import net.minecraft.client.F.f;
import net.minecraft.client.F.g;
import net.minecraft.client.F.h;
import net.minecraft.client.F.i;
import net.minecraft.client.F.j;
import net.minecraft.client.F.k;
import net.minecraft.client.F.l;
import net.minecraft.client.F.m;
import net.minecraft.client.F.n;
import net.minecraft.client.F.o;
import net.minecraft.client.F.p;
import net.minecraft.client.F.q;
import net.minecraft.client.F.r;
import net.minecraft.client.F.s;
import net.minecraft.client.F.t;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.j.u;
import net.minecraft.client.w.av;

public class b {
    public /* synthetic */ double m;
    public static /* synthetic */ double r;
    public /* synthetic */ float o;
    public /* synthetic */ double c;
    public final /* synthetic */ Map<Class, f> g;
    public /* synthetic */ x d;
    private /* synthetic */ boolean h;
    public /* synthetic */ a5 b;
    public static /* synthetic */ double j;
    public static /* synthetic */ double l;
    private final /* synthetic */ net.minecraft.client.a.W a;
    public static /* synthetic */ b e;
    public /* synthetic */ u p;
    public /* synthetic */ double f;
    public /* synthetic */ float n;
    public /* synthetic */ net.minecraft.ah.z k;
    public /* synthetic */ y i;
    public /* synthetic */ net.minecraft.k.i q;

    /*
     * Exception decompiling
     */
    public void a(y var1_1, float var2_2, int var3_3) {
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

    public void a(int n2) {
        block6: {
            int n3;
            block4: {
                block5: {
                    this.p.b(net.minecraft.client.j.j.x);
                    a0.a();
                    String[] arrstring = net.minecraft.client.F.f.b();
                    v.f(770, 771);
                    v.a();
                    String[] arrstring2 = arrstring;
                    v.E();
                    n3 = Q.at();
                    if (arrstring2 == null) break block4;
                    if (n3 == 0) break block5;
                    v.g(7425);
                    if (arrstring2 != null) break block6;
                }
                n3 = 7424;
            }
            v.g(n3);
        }
        if (n2 > 0) {
            this.a.b().a(0.0f, 0.0f, 0.0f);
        }
        this.a.a();
        a0.c();
        this.h = false;
    }

    @Nullable
    public <T extends y> f<T> a(@Nullable y y2) {
        return y2 == null ? null : this.a(y2.getClass());
    }

    public void a(y y2, double d10, double d11, double d12, float f10) {
        this.a(y2, d10, d11, d12, f10, 1.0f);
    }

    private b() {
        this.g = Maps.newHashMap();
        this.a = new net.minecraft.client.a.W(0x200000);
        this.h = false;
        this.g.put(W.class, new r());
        this.g.put(T.class, new o());
        this.g.put(V.class, new p());
        this.g.put(O.class, new j());
        this.g.put(H.class, new n());
        this.g.put(E.class, new k());
        this.g.put(F.class, new l());
        this.g.put(G.class, new m());
        this.g.put(K.class, new h());
        this.g.put(X.class, new s());
        this.g.put(z.class, new g());
        this.g.put(Y.class, new t());
        this.g.put(S.class, new q(new av()));
        this.g.put(A.class, new i());
        for (f f10 : this.g.values()) {
            f10.a(this);
        }
    }

    public void a(net.minecraft.ah.z z2, u u2, a5 a52, x x2, net.minecraft.k.i i2, float f10) {
        String[] arrstring = net.minecraft.client.F.f.b();
        b b10 = this;
        if (arrstring != null) {
            if (b10.k != z2) {
                this.a(z2);
            }
            this.p = u2;
            this.d = x2;
            this.b = a52;
            this.q = i2;
            this.o = x2.ak + (x2.e - x2.ak) * f10;
            this.n = x2.E + (x2.at - x2.E) * f10;
            this.c = x2.am + (x2.a - x2.am) * (double)f10;
            this.m = x2.af + (x2.aF - x2.af) * (double)f10;
            b10 = this;
        }
        b10.f = x2.n + (x2.ax - x2.n) * (double)f10;
    }

    public <T extends y> f<T> a(Class<? extends y> class_) {
        f<T> f10 = this.g.get(class_);
        String[] arrstring = net.minecraft.client.F.f.b();
        f<T> f11 = f10;
        if (arrstring != null) {
            if (f11 == null) {
                Object object = class_;
                if (arrstring != null && object != y.class) {
                    f10 = this.a(class_.getSuperclass());
                    object = this.g.put(class_, f10);
                }
            }
            f11 = f10;
        }
        return f11;
    }

    public void a(@Nullable net.minecraft.ah.z z2) {
        block3: {
            block2: {
                String[] arrstring = net.minecraft.client.F.f.b();
                b b10 = this;
                if (arrstring == null) break block2;
                b10.k = z2;
                if (z2 != null) break block3;
                b10 = this;
            }
            b10.d = null;
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        e = new b();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(y var1_1, double var2_2, double var4_3, double var6_4, float var8_5, int var9_6, float var10_7) {
        block8: {
            block7: {
                var12_8 = this.a(var1_1);
                var11_9 = net.minecraft.client.F.f.b();
                if (var11_9 == null) ** GOTO lbl7
                if (var12_8 == null) return;
                try {
                    this.i = var1_1;
lbl7:
                    // 2 sources

                    v0 = this.h;
                    if (var11_9 != null) {
                        if (!v0) break block7;
                        v0 = cq.g(var1_1, cq.e, new Object[0]);
                    }
                    if (!v0) break block7;
                    var12_8.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6, var10_7, this.a.b());
                    if (var11_9 != null) break block8;
                }
                catch (Throwable var13_10) {
                    var14_11 = net.minecraft.c.f.a(var13_10, "Rendering Block Entity");
                    var15_12 = var14_11.a("Block Entity Details");
                    var1_1.a(var15_12);
                    throw new Z(var14_11);
                }
            }
            var12_8.a(var1_1, var2_2, var4_3, var6_4, var8_5, var9_6, var10_7);
        }
        this.i = null;
    }

    public a5 b() {
        return this.b;
    }

    public void a(y y2, double d10, double d11, double d12, float f10, float f11) {
        this.a(y2, d10, d11, d12, f10, -1, f11);
    }

    public void a() {
        this.a.b().a(7, net.minecraft.client.y.b.s);
        this.h = true;
    }
}

