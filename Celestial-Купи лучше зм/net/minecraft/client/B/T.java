/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.primitives.Floats
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import com.google.common.primitives.Floats;
import java.io.IOException;
import java.util.Random;
import net.minecraft.aA.t;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.b.F;
import net.minecraft.client.b.L;
import net.minecraft.client.b.R;
import net.minecraft.client.b.a9;
import net.minecraft.client.b.aQ;
import net.minecraft.client.b.aU;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.bl;
import net.minecraft.client.b.d;
import net.minecraft.client.b.f;
import net.minecraft.client.b.g;
import net.minecraft.client.b.h;
import net.minecraft.client.b.i;
import net.minecraft.client.b.j;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.b.y;
import net.minecraft.client.y.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T
extends L
implements d,
aU {
    private /* synthetic */ bl A;
    protected /* synthetic */ String B;
    private /* synthetic */ s S;
    private final /* synthetic */ R Q;
    private final /* synthetic */ Random N;
    private /* synthetic */ t J;
    private /* synthetic */ s L;
    private /* synthetic */ boolean G;
    private /* synthetic */ boolean D;
    private final /* synthetic */ t H;
    protected /* synthetic */ String[] M;
    private /* synthetic */ s K;
    private /* synthetic */ s C;
    private /* synthetic */ s y;
    private /* synthetic */ s I;
    private /* synthetic */ int R;
    private final /* synthetic */ Predicate<String> E;
    protected /* synthetic */ String O;
    private /* synthetic */ s z;
    private /* synthetic */ s P;
    protected /* synthetic */ String F;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            int n4;
            block2: {
                this.n();
                this.A.b(n2, n3, f10);
                this.b(this.v, this.O, h / 2, 2, 0xFFFFFF);
                this.b(this.v, this.F, h / 2, 12, 0xFFFFFF);
                this.b(this.v, this.B, h / 2, 22, 0xFFFFFF);
                String[] arrstring = q.b();
                super.a(n2, n3, f10);
                String[] arrstring2 = arrstring;
                n4 = this.R;
                if (arrstring2 == null) break block2;
                if (n4 == 0) break block3;
                n4 = 0;
            }
            T.a(n4, 0, h, w, Integer.MIN_VALUE);
            this.a(h / 2 - 91, h / 2 + 90, 99, -2039584);
            this.a(h / 2 - 91, h / 2 + 90, 185, -6250336);
            this.b(h / 2 - 91, 99, 185, -2039584);
            this.b(h / 2 + 90, 99, 185, -6250336);
            float f11 = 85.0f;
            float f12 = 180.0f;
            net.minecraft.client.a.v.y();
            net.minecraft.client.a.v.C();
            W w2 = W.c();
            I i2 = w2.b();
            this.m.aN().b(f);
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            float f13 = 32.0f;
            i2.a(7, b.t);
            i2.c((double)(h / 2 - 90), 185.0, 0.0).a(0.0, 2.65625).b(64, 64, 64, 64).d();
            i2.c((double)(h / 2 + 90), 185.0, 0.0).a(5.625, 2.65625).b(64, 64, 64, 64).d();
            i2.c((double)(h / 2 + 90), 100.0, 0.0).a(5.625, 0.0).b(64, 64, 64, 64).d();
            i2.c((double)(h / 2 - 90), 100.0, 0.0).a(0.0, 0.0).b(64, 64, 64, 64).d();
            w2.a();
            this.b(this.v, net.minecraft.client.D.h.a("createWorld.customize.custom.confirmTitle", new Object[0]), h / 2, 105, 0xFFFFFF);
            this.b(this.v, net.minecraft.client.D.h.a("createWorld.customize.custom.confirm1", new Object[0]), h / 2, 125, 0xFFFFFF);
            this.b(this.v, net.minecraft.client.D.h.a("createWorld.customize.custom.confirm2", new Object[0]), h / 2, 135, 0xFFFFFF);
            this.C.a(this.m, n2, n3, f10);
            this.z.a(this.m, n2, n3, f10);
        }
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        block6: {
            int n5;
            String[] arrstring;
            block4: {
                block5: {
                    String[] arrstring2 = q.b();
                    super.b(n2, n3, n4);
                    arrstring = arrstring2;
                    n5 = this.D;
                    if (arrstring == null) break block4;
                    if (n5 == 0) break block5;
                    this.D = false;
                    if (arrstring != null) break block6;
                }
                n5 = this.R;
            }
            if (arrstring != null && n5 == 0) {
                n5 = this.A.a(n2, n3, n4) ? 1 : 0;
            }
        }
    }

    private void d() throws IOException {
        String[] arrstring = q.b();
        T t2 = this;
        if (arrstring != null) {
            switch (t2.R) {
                case 300: {
                    this.a((y)this.A.c(300));
                    if (arrstring != null) break;
                }
                case 304: {
                    this.a();
                    break;
                }
            }
            this.R = 0;
            this.D = true;
            t2 = this;
        }
        t2.b(false);
    }

    private void a(int n2) {
        this.R = n2;
        this.b(true);
    }

    private void c(boolean bl2) {
        this.G = bl2;
        this.L.h = bl2;
    }

    @Override
    public String a(int n2, String string, float f10) {
        return string + ": " + this.a(n2, f10);
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.A.f();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        var2_2 = q.b();
        v0 = var1_1.h;
        if (var2_2 != null) {
            if (v0 == 0) return;
            v0 = var1_1.g;
        }
        switch (v0 ? 1 : 0) {
            case 300: {
                this.Q.T = this.J.toString();
                this.m.a(this.Q);
                if (var2_2 != null) return;
            }
            case 301: {
                var3_3 = 0;
                do {
                    if (var3_3 >= this.A.d()) return;
                    var4_4 = this.A.a(var3_3);
                    v1 = var5_5 = var4_4.a();
                    if (var2_2 == null) ** GOTO lbl31
                    if (!(v1 instanceof s)) ** GOTO lbl30
                    var6_6 = (s)var5_5;
                    v2 = var6_6 instanceof F;
                    if (var2_2 == null) ** GOTO lbl27
                    if (!v2) ** GOTO lbl26
                    var7_7 = ((F)var6_6).b() * (0.75f + this.N.nextFloat() * 0.5f) + (this.N.nextFloat() * 0.1f - 0.05f);
                    ((F)var6_6).a(net.minecraft.k.h.c(var7_7, 0.0f, 1.0f));
                    if (var2_2 != null) ** GOTO lbl30
lbl26:
                    // 2 sources

                    v2 = var6_6 instanceof y;
lbl27:
                    // 2 sources

                    if (var2_2 == null) ** GOTO lbl33
                    if (v2) {
                        ((y)var6_6).a(this.N.nextBoolean());
                    }
lbl30:
                    // 5 sources

                    v1 = var6_6 = var4_4.b();
lbl31:
                    // 2 sources

                    if (var2_2 == null) continue;
                    v2 = var6_6 instanceof s;
lbl33:
                    // 2 sources

                    if (!v2) ** GOTO lbl47
                    var7_8 = (s)var6_6;
                    v3 = var7_8 instanceof F;
                    if (var2_2 == null) ** GOTO lbl44
                    if (!v3) ** GOTO lbl41
                    var8_9 = ((F)var7_8).b() * (0.75f + this.N.nextFloat() * 0.5f) + (this.N.nextFloat() * 0.1f - 0.05f);
                    ((F)var7_8).a(net.minecraft.k.h.c(var8_9, 0.0f, 1.0f));
                    if (var2_2 != null) ** GOTO lbl47
lbl41:
                    // 2 sources

                    v4 = var7_8;
                    if (var2_2 == null) ** GOTO lbl46
                    v3 = v4 instanceof y;
lbl44:
                    // 2 sources

                    if (!v3) ** GOTO lbl47
                    v4 = var7_8;
lbl46:
                    // 2 sources

                    ((y)v4).a(this.N.nextBoolean());
lbl47:
                    // 4 sources

                    ++var3_3;
                } while (var2_2 != null);
                return;
            }
            case 302: {
                this.A.d();
                this.g();
                if (var2_2 != null) return;
            }
            case 303: {
                this.A.g();
                this.g();
                if (var2_2 != null) return;
            }
            case 304: {
                v5 = this;
                if (var2_2 != null) {
                    if (v5.G == false) return;
                    v5 = this;
                }
                v5.a(304);
                if (var2_2 != null) return;
            }
            case 305: {
                this.m.a(new a9(this));
                if (var2_2 != null) return;
            }
            case 306: {
                this.d();
                if (var2_2 != null) return;
            }
            case 307: {
                this.R = 0;
                this.d();
                return;
            }
        }
    }

    private void g() {
        String[] arrstring = q.b();
        int n2 = this.A.b();
        if (arrstring != null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.K.h = n2;
        int n3 = this.A.b();
        if (arrstring != null) {
            n3 = n3 != this.A.l() - 1 ? 1 : 0;
        }
        this.S.h = n3;
        this.F = net.minecraft.client.D.h.a("book.pageIndicator", this.A.b() + 1, this.A.l());
        this.B = this.M[this.A.b()];
        int n4 = this.A.b();
        if (arrstring != null) {
            n4 = n4 != this.A.l() - 1 ? 1 : 0;
        }
        this.I.h = n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, float var2_2) {
        block79: {
            block76: {
                block78: {
                    block77: {
                        var3_3 = q.b();
                        if (var3_3 == null) ** GOTO lbl6
                        switch (var1_1) {
                            case 100: {
                                this.J.R = var2_2;
lbl6:
                                // 2 sources

                                if (var3_3 != null) break;
                            }
                            case 101: {
                                this.J.aw = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 102: {
                                this.J.ac = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 103: {
                                this.J.l = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 104: {
                                this.J.ak = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 105: {
                                this.J.aB = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 106: {
                                this.J.M = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 107: {
                                this.J.L = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 108: {
                                this.J.I = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 109: {
                                this.J.v = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 110: {
                                this.J.Z = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 111: {
                                this.J.S = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 112: {
                                this.J.J = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 113: {
                                this.J.ab = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 114: {
                                this.J.D = var2_2;
                                if (var3_3 != null) break;
                            }
                            case 115: {
                                this.J.aa = var2_2;
                            }
                            default: {
                                if (var3_3 != null) break;
                            }
                            case 157: {
                                this.J.Y = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 158: {
                                this.J.ad = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 159: {
                                this.J.a = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 160: {
                                this.J.ah = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 162: {
                                this.J.j = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 163: {
                                this.J.B = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 164: {
                                this.J.r = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 165: {
                                this.J.i = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 166: {
                                this.J.X = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 167: {
                                this.J.az = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 168: {
                                this.J.s = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 169: {
                                this.J.d = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 170: {
                                this.J.q = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 171: {
                                this.J.ai = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 172: {
                                this.J.ay = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 173: {
                                this.J.E = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 174: {
                                this.J.w = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 175: {
                                this.J.o = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 176: {
                                this.J.ag = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 177: {
                                this.J.al = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 178: {
                                this.J.V = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 179: {
                                this.J.G = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 180: {
                                this.J.U = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 181: {
                                this.J.aj = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 182: {
                                this.J.t = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 183: {
                                this.J.u = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 184: {
                                this.J.g = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 185: {
                                this.J.ax = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 186: {
                                this.J.F = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 187: {
                                this.J.av = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 189: {
                                this.J.k = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 190: {
                                this.J.N = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 191: {
                                this.J.ap = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 192: {
                                this.J.as = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 193: {
                                this.J.P = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 194: {
                                this.J.m = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 195: {
                                this.J.at = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 196: {
                                this.J.n = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 197: {
                                this.J.au = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 198: {
                                this.J.e = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 199: {
                                this.J.y = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 200: {
                                this.J.af = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 201: {
                                this.J.C = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 202: {
                                this.J.ae = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 203: {
                                this.J.T = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 204: {
                                this.J.x = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 205: {
                                this.J.aq = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 206: {
                                this.J.an = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 207: {
                                this.J.H = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 208: {
                                this.J.b = (int)var2_2;
                                if (var3_3 != null) break;
                            }
                            case 209: {
                                this.J.A = (int)var2_2;
                                break;
                            }
                        }
                        v0 = var1_1;
                        if (var3_3 == null) break block76;
                        if (v0 < 100) break block77;
                        v0 = var1_1;
                        if (var3_3 == null) break block76;
                        if (v0 >= 116) break block77;
                        v1 = this;
                        if (var3_3 == null) break block78;
                        var4_4 = v1.A.c(var1_1 - 100 + 132);
                        if (var4_4 != null) {
                            ((aq)var4_4).a(this.a(var1_1, var2_2));
                        }
                    }
                    v1 = this;
                }
                if (var3_3 == null) break block79;
                v0 = v1.J.equals(this.H) ? 1 : 0;
            }
            if (v0 != 0) return;
            v1 = this;
        }
        v1.c(true);
    }

    @Override
    public void a(int n2, boolean bl2) {
        block18: {
            T t2;
            block17: {
                int n3;
                block16: {
                    String[] arrstring = q.b();
                    n3 = n2;
                    if (arrstring == null) break block16;
                    switch (n3) {
                        case 148: {
                            this.J.f = bl2;
                            if (arrstring != null) break;
                        }
                        case 149: {
                            this.J.K = bl2;
                            if (arrstring != null) break;
                        }
                        case 150: {
                            this.J.ar = bl2;
                            if (arrstring != null) break;
                        }
                        case 151: {
                            this.J.O = bl2;
                            if (arrstring != null) break;
                        }
                        case 152: {
                            this.J.Q = bl2;
                            if (arrstring != null) break;
                        }
                        case 153: {
                            this.J.aA = bl2;
                            if (arrstring != null) break;
                        }
                        case 154: {
                            this.J.p = bl2;
                            if (arrstring != null) break;
                        }
                        case 155: {
                            this.J.am = bl2;
                            if (arrstring != null) break;
                        }
                        case 156: {
                            this.J.W = bl2;
                            if (arrstring != null) break;
                        }
                        case 161: {
                            this.J.c = bl2;
                            if (arrstring != null) break;
                        }
                        case 210: {
                            this.J.h = bl2;
                            if (arrstring != null) break;
                        }
                        case 211: {
                            this.J.ao = bl2;
                            break;
                        }
                    }
                    t2 = this;
                    if (arrstring == null) break block17;
                    n3 = t2.J.equals(this.H) ? 1 : 0;
                }
                if (n3 != 0) break block18;
                t2 = this;
            }
            t2.c(true);
        }
    }

    /*
     * Exception decompiling
     */
    private void b(boolean var1_1) {
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

    public void a(String string) {
        block2: {
            block1: {
                String string2;
                String[] arrstring;
                block0: {
                    arrstring = q.b();
                    string2 = string;
                    if (arrstring == null) break block0;
                    if (string2 == null) break block1;
                    string2 = string;
                }
                if (string2.isEmpty()) break block1;
                this.J = net.minecraft.aA.t.a(string);
                if (arrstring != null) break block2;
            }
            this.J = new t();
        }
    }

    @Override
    public void r() {
        block8: {
            block7: {
                int n2;
                int n3;
                int n4;
                block6: {
                    n4 = 0;
                    n3 = 0;
                    String[] arrstring = q.b();
                    T t2 = this;
                    if (arrstring != null) {
                        if (t2.A != null) {
                            n4 = this.A.b();
                            n3 = this.A.g();
                        }
                        this.O = net.minecraft.client.D.h.a("options.customizeTitle", new Object[0]);
                        this.t.clear();
                        this.K = this.b(new s(302, 20, 5, 80, 20, net.minecraft.client.D.h.a("createWorld.customize.custom.prev", new Object[0])));
                        this.S = this.b(new s(303, h - 100, 5, 80, 20, net.minecraft.client.D.h.a("createWorld.customize.custom.next", new Object[0])));
                        this.L = this.b(new s(304, h / 2 - 187, w - 27, 90, 20, net.minecraft.client.D.h.a("createWorld.customize.custom.defaults", new Object[0])));
                        this.I = this.b(new s(301, h / 2 - 92, w - 27, 90, 20, net.minecraft.client.D.h.a("createWorld.customize.custom.randomize", new Object[0])));
                        this.y = this.b(new s(305, h / 2 + 3, w - 27, 90, 20, net.minecraft.client.D.h.a("createWorld.customize.custom.presets", new Object[0])));
                        this.P = this.b(new s(300, h / 2 + 98, w - 27, 90, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
                        this.L.h = this.G;
                        this.C = new s(306, h / 2 - 55, 160, 50, 20, net.minecraft.client.D.h.a("gui.yes", new Object[0]));
                        this.C.l = false;
                        this.t.add(this.C);
                        this.z = new s(307, h / 2 + 5, 160, 50, 20, net.minecraft.client.D.h.a("gui.no", new Object[0]));
                        this.z.l = false;
                        this.t.add(this.z);
                        t2 = this;
                    }
                    n2 = t2.R;
                    if (arrstring == null) break block6;
                    if (n2 != 0) {
                        this.C.l = true;
                        this.z.l = true;
                    }
                    this.b();
                    if (arrstring == null) break block7;
                    n2 = n4;
                }
                if (n2 == 0) break block8;
                this.A.b(n4);
                this.A.d(n3);
            }
            this.g();
        }
    }

    public String c() {
        return this.J.toString().replace("\n", "");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String a(int n2, float f10) {
        net.minecraft.A.h h2;
        String[] arrstring = q.b();
        int n3 = n2;
        if (arrstring != null) {
            switch (n3) {
                case 100: 
                case 101: 
                case 102: 
                case 103: 
                case 104: 
                case 107: 
                case 108: 
                case 110: 
                case 111: 
                case 132: 
                case 133: 
                case 134: 
                case 135: 
                case 136: 
                case 139: 
                case 140: 
                case 142: 
                case 143: {
                    return String.format("%5.3f", Float.valueOf(f10));
                }
                case 105: 
                case 106: 
                case 109: 
                case 112: 
                case 113: 
                case 114: 
                case 115: 
                case 137: 
                case 138: 
                case 141: 
                case 144: 
                case 145: 
                case 146: 
                case 147: {
                    return String.format("%2.3f", Float.valueOf(f10));
                }
                default: {
                    return String.format("%d", (int)f10);
                }
                case 162: 
            }
            float f11 = f10 - 0.0f;
            n3 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
        }
        if (arrstring != null) {
            if (n3 < 0) {
                return net.minecraft.client.D.h.a("gui.all", new Object[0]);
            }
            n3 = (int)f10;
        }
        if (arrstring != null) {
            if (n3 >= net.minecraft.A.h.b(net.minecraft.u.d.R)) {
                net.minecraft.A.h h3;
                net.minecraft.A.h h4 = h3 = net.minecraft.A.h.a((int)f10 + 2);
                if (arrstring != null) {
                    if (h4 == null) return "?";
                    h4 = h3;
                }
                String string = h4.n();
                return string;
            }
            n3 = (int)f10;
        }
        net.minecraft.A.h h5 = h2 = net.minecraft.A.h.a(n3);
        if (arrstring != null) {
            if (h5 == null) return "?";
            h5 = h2;
        }
        String string = h5.n();
        return string;
    }

    @Override
    public void a(int n2, String string) {
        block28: {
            T t2;
            block27: {
                int n3;
                block25: {
                    float f10;
                    String[] arrstring;
                    block26: {
                        float f11 = 0.0f;
                        arrstring = q.b();
                        try {
                            f11 = Float.parseFloat(string);
                        }
                        catch (NumberFormatException numberFormatException) {
                            // empty catch block
                        }
                        f10 = 0.0f;
                        n3 = n2;
                        if (arrstring != null) {
                            switch (n3) {
                                case 132: {
                                    f10 = this.J.R = net.minecraft.k.h.c(f11, 1.0f, 5000.0f);
                                    if (arrstring != null) break;
                                }
                                case 133: {
                                    f10 = this.J.aw = net.minecraft.k.h.c(f11, 1.0f, 5000.0f);
                                    if (arrstring != null) break;
                                }
                                case 134: {
                                    f10 = this.J.ac = net.minecraft.k.h.c(f11, 1.0f, 5000.0f);
                                    if (arrstring != null) break;
                                }
                                case 135: {
                                    f10 = this.J.l = net.minecraft.k.h.c(f11, 1.0f, 2000.0f);
                                    if (arrstring != null) break;
                                }
                                case 136: {
                                    f10 = this.J.ak = net.minecraft.k.h.c(f11, 1.0f, 2000.0f);
                                    if (arrstring != null) break;
                                }
                                case 137: {
                                    f10 = this.J.aB = net.minecraft.k.h.c(f11, 0.01f, 20.0f);
                                    if (arrstring != null) break;
                                }
                                case 138: {
                                    f10 = this.J.M = net.minecraft.k.h.c(f11, 1.0f, 25.0f);
                                    if (arrstring != null) break;
                                }
                                case 139: {
                                    f10 = this.J.L = net.minecraft.k.h.c(f11, 1.0f, 6000.0f);
                                    if (arrstring != null) break;
                                }
                                case 140: {
                                    f10 = this.J.I = net.minecraft.k.h.c(f11, 1.0f, 6000.0f);
                                    if (arrstring != null) break;
                                }
                                case 141: {
                                    f10 = this.J.v = net.minecraft.k.h.c(f11, 0.01f, 50.0f);
                                    if (arrstring != null) break;
                                }
                                case 142: {
                                    f10 = this.J.Z = net.minecraft.k.h.c(f11, 1.0f, 5000.0f);
                                    if (arrstring != null) break;
                                }
                                case 143: {
                                    f10 = this.J.S = net.minecraft.k.h.c(f11, 1.0f, 5000.0f);
                                    if (arrstring != null) break;
                                }
                                case 144: {
                                    f10 = this.J.J = net.minecraft.k.h.c(f11, 1.0f, 20.0f);
                                    if (arrstring != null) break;
                                }
                                case 145: {
                                    f10 = this.J.ab = net.minecraft.k.h.c(f11, 0.0f, 20.0f);
                                    if (arrstring != null) break;
                                }
                                case 146: {
                                    f10 = this.J.D = net.minecraft.k.h.c(f11, 1.0f, 20.0f);
                                    if (arrstring != null) break;
                                }
                                case 147: {
                                    f10 = this.J.aa = net.minecraft.k.h.c(f11, 0.0f, 20.0f);
                                }
                            }
                            n3 = f10 == f11 ? 0 : (f10 > f11 ? 1 : -1);
                        }
                        if (arrstring == null) break block25;
                        if (n3 == 0) break block26;
                        float f12 = f11 - 0.0f;
                        n3 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        if (arrstring == null) break block25;
                        if (n3 != 0) {
                            ((aq)this.A.c(n2)).a(this.a(n2, f10));
                        }
                    }
                    ((F)this.A.c(n2 - 132 + 100)).a(f10, false);
                    t2 = this;
                    if (arrstring == null) break block27;
                    n3 = t2.J.equals(this.H) ? 1 : 0;
                }
                if (n3 != 0) break block28;
                t2 = this;
            }
            t2.c(true);
        }
    }

    private void a() {
        this.J.a();
        this.b();
        this.c(false);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block7: {
            int n3;
            String[] arrstring;
            block6: {
                String[] arrstring2 = q.b();
                super.a(c10, n2);
                arrstring = arrstring2;
                n3 = this.R;
                if (arrstring == null) break block6;
                if (n3 != 0) break block7;
                n3 = n2;
            }
            switch (n3) {
                case 200: {
                    this.a(1.0f);
                    if (arrstring != null) break;
                }
                case 208: {
                    this.a(-1.0f);
                    if (arrstring != null) break;
                }
                default: {
                    this.A.a(c10, n2);
                    break;
                }
            }
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block5: {
            int n5;
            String[] arrstring;
            block4: {
                String[] arrstring2 = q.b();
                super.a(n2, n3, n4);
                arrstring = arrstring2;
                n5 = this.R;
                if (arrstring == null) break block4;
                if (n5 != 0) break block5;
                n5 = this.D ? 1 : 0;
            }
            if (arrstring != null && n5 == 0) {
                n5 = this.A.b(n2, n3, n4) ? 1 : 0;
            }
        }
    }

    private void b() {
        block2: {
            f[] arrf = new f[]{new j(160, net.minecraft.client.D.h.a("createWorld.customize.custom.seaLevel", new Object[0]), true, this, 1.0f, 255.0f, this.J.ah), new h(148, net.minecraft.client.D.h.a("createWorld.customize.custom.useCaves", new Object[0]), true, this.J.f), new h(150, net.minecraft.client.D.h.a("createWorld.customize.custom.useStrongholds", new Object[0]), true, this.J.ar), new h(151, net.minecraft.client.D.h.a("createWorld.customize.custom.useVillages", new Object[0]), true, this.J.O), new h(152, net.minecraft.client.D.h.a("createWorld.customize.custom.useMineShafts", new Object[0]), true, this.J.Q), new h(153, net.minecraft.client.D.h.a("createWorld.customize.custom.useTemples", new Object[0]), true, this.J.aA), new h(210, net.minecraft.client.D.h.a("createWorld.customize.custom.useMonuments", new Object[0]), true, this.J.h), new h(211, net.minecraft.client.D.h.a("createWorld.customize.custom.useMansions", new Object[0]), true, this.J.ao), new h(154, net.minecraft.client.D.h.a("createWorld.customize.custom.useRavines", new Object[0]), true, this.J.p), new h(149, net.minecraft.client.D.h.a("createWorld.customize.custom.useDungeons", new Object[0]), true, this.J.K), new j(157, net.minecraft.client.D.h.a("createWorld.customize.custom.dungeonChance", new Object[0]), true, this, 1.0f, 100.0f, this.J.Y), new h(155, net.minecraft.client.D.h.a("createWorld.customize.custom.useWaterLakes", new Object[0]), true, this.J.am), new j(158, net.minecraft.client.D.h.a("createWorld.customize.custom.waterLakeChance", new Object[0]), true, this, 1.0f, 100.0f, this.J.ad), new h(156, net.minecraft.client.D.h.a("createWorld.customize.custom.useLavaLakes", new Object[0]), true, this.J.W), new j(159, net.minecraft.client.D.h.a("createWorld.customize.custom.lavaLakeChance", new Object[0]), true, this, 10.0f, 100.0f, this.J.a), new h(161, net.minecraft.client.D.h.a("createWorld.customize.custom.useLavaOceans", new Object[0]), true, this.J.c), new j(162, net.minecraft.client.D.h.a("createWorld.customize.custom.fixedBiome", new Object[0]), true, this, -1.0f, 37.0f, this.J.j), new j(163, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeSize", new Object[0]), true, this, 1.0f, 8.0f, this.J.B), new j(164, net.minecraft.client.D.h.a("createWorld.customize.custom.riverSize", new Object[0]), true, this, 1.0f, 5.0f, this.J.r)};
            String[] arrstring = q.b();
            f[] arrf2 = new f[]{new i(416, net.minecraft.client.D.h.a("tile.dirt.name", new Object[0]), false), null, new j(165, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.i), new j(166, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.X), new j(167, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.az), new j(168, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.s), new i(417, net.minecraft.client.D.h.a("tile.gravel.name", new Object[0]), false), null, new j(169, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.d), new j(170, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.q), new j(171, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.ai), new j(172, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.ay), new i(418, net.minecraft.client.D.h.a("tile.stone.granite.name", new Object[0]), false), null, new j(173, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.E), new j(174, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.w), new j(175, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.o), new j(176, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.ag), new i(419, net.minecraft.client.D.h.a("tile.stone.diorite.name", new Object[0]), false), null, new j(177, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.al), new j(178, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.V), new j(179, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.G), new j(180, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.U), new i(420, net.minecraft.client.D.h.a("tile.stone.andesite.name", new Object[0]), false), null, new j(181, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.aj), new j(182, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.t), new j(183, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.u), new j(184, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.g), new i(421, net.minecraft.client.D.h.a("tile.oreCoal.name", new Object[0]), false), null, new j(185, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.ax), new j(186, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.F), new j(187, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.av), new j(189, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.k), new i(422, net.minecraft.client.D.h.a("tile.oreIron.name", new Object[0]), false), null, new j(190, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.N), new j(191, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.ap), new j(192, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.as), new j(193, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.P), new i(423, net.minecraft.client.D.h.a("tile.oreGold.name", new Object[0]), false), null, new j(194, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.m), new j(195, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.at), new j(196, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.n), new j(197, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.au), new i(424, net.minecraft.client.D.h.a("tile.oreRedstone.name", new Object[0]), false), null, new j(198, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.e), new j(199, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.y), new j(200, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.af), new j(201, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.C), new i(425, net.minecraft.client.D.h.a("tile.oreDiamond.name", new Object[0]), false), null, new j(202, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.ae), new j(203, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.T), new j(204, net.minecraft.client.D.h.a("createWorld.customize.custom.minHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.x), new j(205, net.minecraft.client.D.h.a("createWorld.customize.custom.maxHeight", new Object[0]), false, this, 0.0f, 255.0f, this.J.aq), new i(426, net.minecraft.client.D.h.a("tile.oreLapis.name", new Object[0]), false), null, new j(206, net.minecraft.client.D.h.a("createWorld.customize.custom.size", new Object[0]), false, this, 1.0f, 50.0f, this.J.an), new j(207, net.minecraft.client.D.h.a("createWorld.customize.custom.count", new Object[0]), false, this, 0.0f, 40.0f, this.J.H), new j(208, net.minecraft.client.D.h.a("createWorld.customize.custom.center", new Object[0]), false, this, 0.0f, 255.0f, this.J.b), new j(209, net.minecraft.client.D.h.a("createWorld.customize.custom.spread", new Object[0]), false, this, 0.0f, 255.0f, this.J.A)};
            f[] arrf3 = new f[]{new j(100, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]), false, this, 1.0f, 5000.0f, this.J.R), new j(101, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]), false, this, 1.0f, 5000.0f, this.J.aw), new j(102, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]), false, this, 1.0f, 5000.0f, this.J.ac), new j(103, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]), false, this, 1.0f, 2000.0f, this.J.l), new j(104, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]), false, this, 1.0f, 2000.0f, this.J.ak), new j(105, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]), false, this, 0.01f, 20.0f, this.J.aB), new j(106, net.minecraft.client.D.h.a("createWorld.customize.custom.baseSize", new Object[0]), false, this, 1.0f, 25.0f, this.J.M), new j(107, net.minecraft.client.D.h.a("createWorld.customize.custom.coordinateScale", new Object[0]), false, this, 1.0f, 6000.0f, this.J.L), new j(108, net.minecraft.client.D.h.a("createWorld.customize.custom.heightScale", new Object[0]), false, this, 1.0f, 6000.0f, this.J.I), new j(109, net.minecraft.client.D.h.a("createWorld.customize.custom.stretchY", new Object[0]), false, this, 0.01f, 50.0f, this.J.v), new j(110, net.minecraft.client.D.h.a("createWorld.customize.custom.upperLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.J.Z), new j(111, net.minecraft.client.D.h.a("createWorld.customize.custom.lowerLimitScale", new Object[0]), false, this, 1.0f, 5000.0f, this.J.S), new j(112, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]), false, this, 1.0f, 20.0f, this.J.J), new j(113, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]), false, this, 0.0f, 20.0f, this.J.ab), new j(114, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]), false, this, 1.0f, 20.0f, this.J.D), new j(115, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]), false, this, 0.0f, 20.0f, this.J.aa)};
            f[] arrf4 = new f[]{new i(400, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleX", new Object[0]) + ":", false), new g(132, String.format("%5.3f", Float.valueOf(this.J.R)), false, this.E), new i(401, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleY", new Object[0]) + ":", false), new g(133, String.format("%5.3f", Float.valueOf(this.J.aw)), false, this.E), new i(402, net.minecraft.client.D.h.a("createWorld.customize.custom.mainNoiseScaleZ", new Object[0]) + ":", false), new g(134, String.format("%5.3f", Float.valueOf(this.J.ac)), false, this.E), new i(403, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleX", new Object[0]) + ":", false), new g(135, String.format("%5.3f", Float.valueOf(this.J.l)), false, this.E), new i(404, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleZ", new Object[0]) + ":", false), new g(136, String.format("%5.3f", Float.valueOf(this.J.ak)), false, this.E), new i(405, net.minecraft.client.D.h.a("createWorld.customize.custom.depthNoiseScaleExponent", new Object[0]) + ":", false), new g(137, String.format("%2.3f", Float.valueOf(this.J.aB)), false, this.E), new i(406, net.minecraft.client.D.h.a("createWorld.customize.custom.baseSize", new Object[0]) + ":", false), new g(138, String.format("%2.3f", Float.valueOf(this.J.M)), false, this.E), new i(407, net.minecraft.client.D.h.a("createWorld.customize.custom.coordinateScale", new Object[0]) + ":", false), new g(139, String.format("%5.3f", Float.valueOf(this.J.L)), false, this.E), new i(408, net.minecraft.client.D.h.a("createWorld.customize.custom.heightScale", new Object[0]) + ":", false), new g(140, String.format("%5.3f", Float.valueOf(this.J.I)), false, this.E), new i(409, net.minecraft.client.D.h.a("createWorld.customize.custom.stretchY", new Object[0]) + ":", false), new g(141, String.format("%2.3f", Float.valueOf(this.J.v)), false, this.E), new i(410, net.minecraft.client.D.h.a("createWorld.customize.custom.upperLimitScale", new Object[0]) + ":", false), new g(142, String.format("%5.3f", Float.valueOf(this.J.Z)), false, this.E), new i(411, net.minecraft.client.D.h.a("createWorld.customize.custom.lowerLimitScale", new Object[0]) + ":", false), new g(143, String.format("%5.3f", Float.valueOf(this.J.S)), false, this.E), new i(412, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeDepthWeight", new Object[0]) + ":", false), new g(144, String.format("%2.3f", Float.valueOf(this.J.J)), false, this.E), new i(413, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeDepthOffset", new Object[0]) + ":", false), new g(145, String.format("%2.3f", Float.valueOf(this.J.ab)), false, this.E), new i(414, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeScaleWeight", new Object[0]) + ":", false), new g(146, String.format("%2.3f", Float.valueOf(this.J.D)), false, this.E), new i(415, net.minecraft.client.D.h.a("createWorld.customize.custom.biomeScaleOffset", new Object[0]) + ":", false), new g(147, String.format("%2.3f", Float.valueOf(this.J.aa)), false, this.E)};
            this.A = new bl(this.m, h, w, 32, w - 32, 25, this, arrf, arrf2, arrf3, arrf4);
            for (int i2 = 0; i2 < 4; ++i2) {
                this.M[i2] = net.minecraft.client.D.h.a("createWorld.customize.custom.page" + i2, new Object[0]);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.g();
        }
    }

    private void a(float f10) {
        block4: {
            Float f11;
            Float f12;
            aq aq2;
            block11: {
                float f13;
                String[] arrstring;
                q q2;
                block8: {
                    float f14;
                    block10: {
                        boolean bl2;
                        block9: {
                            block5: {
                                block6: {
                                    block7: {
                                        q2 = this.A.e();
                                        arrstring = q.b();
                                        if (!(q2 instanceof aq)) break block4;
                                        f13 = f10;
                                        bl2 = net.minecraft.client.b.L.o();
                                        if (arrstring == null) break block5;
                                        if (!bl2) break block6;
                                        f13 = f10 * 0.1f;
                                        if (arrstring == null) break block7;
                                        if (!net.minecraft.client.b.L.q()) break block8;
                                        f13 *= 0.1f;
                                    }
                                    if (arrstring != null) break block8;
                                }
                                bl2 = net.minecraft.client.b.L.q();
                            }
                            if (arrstring == null) break block9;
                            if (!bl2) break block8;
                            f14 = f10 * 10.0f;
                            if (arrstring == null) break block10;
                            f13 = f14;
                            bl2 = net.minecraft.client.b.L.m();
                        }
                        if (!bl2) break block8;
                        f14 = f13 * 10.0f;
                    }
                    f13 = f14;
                }
                aq2 = (aq)q2;
                f11 = f12 = Floats.tryParse((String)aq2.n());
                if (arrstring == null) break block11;
                if (f11 == null) break block4;
                f11 = Float.valueOf(f12.floatValue() + f13);
            }
            f12 = f11;
            int n2 = aq2.g();
            String string = this.a(aq2.g(), f12.floatValue());
            aq2.a(string);
            this.a(n2, string);
        }
    }

    public T(L l2, String string) {
        this.O = "Customize World Settings";
        this.F = "Page 1 of 3";
        this.B = "Basic Settings";
        this.M = new String[4];
        this.E = new aQ(this);
        this.H = new t();
        this.N = new Random();
        this.Q = (R)l2;
        this.a(string);
    }
}

