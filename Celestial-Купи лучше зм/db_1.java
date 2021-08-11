/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.ar.X;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import org.lwjgl.opengl.GL11;

public class db
extends q {
    private /* synthetic */ int g;
    private final /* synthetic */ int u;
    private final /* synthetic */ int t;
    private /* synthetic */ int k;
    private final /* synthetic */ int v;
    private final /* synthetic */ boolean m = true;
    private /* synthetic */ int a;
    public /* synthetic */ int h;
    private /* synthetic */ boolean q;
    private final /* synthetic */ int i;
    public /* synthetic */ boolean j;
    private final /* synthetic */ int w = 0x707070;
    private final /* synthetic */ a5 n;
    private /* synthetic */ int o;
    private /* synthetic */ boolean s;
    public /* synthetic */ String l;
    private /* synthetic */ boolean r;
    private /* synthetic */ int p;

    public boolean f() {
        return this.r;
    }

    public void c(int n2) {
        block3: {
            db db2;
            block4: {
                block5: {
                    int n3;
                    int n4;
                    block2: {
                        n4 = fQ.d();
                        n3 = this.l.length();
                        if (n4 != 0) break block2;
                        if (n3 == 0) break block3;
                        db2 = this;
                        if (n4 != 0) break block4;
                        n3 = db2.a;
                    }
                    if (n3 == this.o) break block5;
                    this.a("");
                    if (n4 == 0) break block3;
                }
                db2 = this;
            }
            db2.a(this.h(n2) - this.o);
        }
    }

    public void a(boolean bl2) {
        this.q = bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String k() {
        var1_1 = fQ.e();
        v0 = this;
        if (var1_1 == 0) ** GOTO lbl8
        if (v0.o < this.a) {
            v1 = this.o;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.a;
        }
        var2_2 = v1;
        v2 = this;
        if (var1_1 == 0) ** GOTO lbl16
        if (v2.o < this.a) {
            v3 = this.a;
        } else {
            v2 = this;
lbl16:
            // 2 sources

            v3 = v2.o;
        }
        var3_3 = v3;
        return this.l.substring(var2_2, var3_3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(char n2, int n3) {
        int n4 = fQ.e();
        this.getClass();
        int n5 = n4;
        boolean bl2 = this.j;
        if (n5 == 0) return bl2;
        if (!bl2) return false;
        boolean bl3 = n2;
        if (n5 != 0) {
            switch (bl3) {
                case 1: {
                    this.i();
                    this.f(0);
                    return true;
                }
                case 3: {
                    L.e(this.k());
                    return true;
                }
                case 22: {
                    this.a(L.l());
                    return true;
                }
                case 24: {
                    L.e(this.k());
                    this.a("");
                    return true;
                }
            }
            bl3 = n3;
        }
        if (n5 != 0) {
            switch (bl3) {
                case 14: {
                    if (L.q()) {
                        this.c(-1);
                        if (n5 != 0) return true;
                    }
                    this.a(-1);
                    return true;
                }
                case 199: {
                    if (L.o()) {
                        this.f(0);
                        if (n5 != 0) return true;
                    }
                    this.m();
                    return true;
                }
                case 203: {
                    boolean bl4 = L.o();
                    if (n5 != 0) {
                        if (bl4) {
                            if (L.q()) {
                                this.f(this.a(-1, this.e()));
                                if (n5 != 0) return true;
                            }
                            this.f(this.e() - 1);
                            if (n5 != 0) return true;
                        }
                        bl4 = L.q();
                    }
                    if (bl4) {
                        this.d(this.h(-1));
                        if (n5 != 0) return true;
                    }
                    this.g(-1);
                    return true;
                }
                case 205: {
                    boolean bl5 = L.o();
                    if (n5 != 0) {
                        if (bl5) {
                            if (L.q()) {
                                this.f(this.a(1, this.e()));
                                if (n5 != 0) return true;
                            }
                            this.f(this.e() + 1);
                            if (n5 != 0) return true;
                        }
                        bl5 = L.q();
                    }
                    if (bl5) {
                        this.d(this.h(1));
                        if (n5 != 0) return true;
                    }
                    this.g(1);
                    return true;
                }
                case 207: {
                    if (L.o()) {
                        this.f(this.l.length());
                        if (n5 != 0) return true;
                    }
                    this.i();
                    return true;
                }
                case 211: {
                    if (L.q()) {
                        this.c(1);
                        if (n5 != 0) return true;
                    }
                    this.a(1);
                    return true;
                }
            }
            bl3 = (X.a((char)n2) ? 1 : 0) != 0;
        }
        if (n5 == 0) return bl3;
        if (!bl3) return false;
        this.a(Character.toString((char)n2));
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(String var1_1) {
        block13: {
            block11: {
                block12: {
                    var3_2 = "";
                    var4_3 = X.a(var1_1);
                    var2_4 = fQ.e();
                    v0 = this;
                    if (var2_4 == 0) ** GOTO lbl10
                    if (v0.o < this.a) {
                        v1 = this.o;
                    } else {
                        v0 = this;
lbl10:
                        // 2 sources

                        v1 = v0.a;
                    }
                    var5_5 = v1;
                    v2 = this;
                    if (var2_4 == 0) ** GOTO lbl18
                    if (v2.o < this.a) {
                        v3 = this.a;
                    } else {
                        v2 = this;
lbl18:
                        // 2 sources

                        v3 = v2.o;
                    }
                    var6_6 = v3;
                    var7_7 = this.h - this.l.length() - (var5_5 - this.a);
                    var8_8 = false;
                    v4 = this.l.length();
                    if (var2_4 != 0) {
                        if (v4 > 0) {
                            var3_2 = var3_2 + this.l.substring(0, var5_5);
                        }
                        v4 = var7_7;
                    }
                    if (var2_4 == 0) break block11;
                    if (v4 >= var4_3.length()) break block12;
                    var3_2 = var3_2 + var4_3.substring(0, var7_7);
                    var9_9 = var7_7;
                    if (var2_4 != 0) break block13;
                }
                var3_2 = var3_2 + var4_3;
                v4 = var4_3.length();
            }
            var9_9 = v4;
        }
        v5 = this;
        if (var2_4 != 0) {
            if (v5.l.length() > 0 && var6_6 < this.l.length()) {
                var3_2 = var3_2 + this.l.substring(var6_6);
            }
            this.l = var3_2.replaceAll(" ", "");
            v5 = this;
        }
        v5.g(var5_5 - this.a + var9_9);
    }

    public String a() {
        return this.l.replaceAll(" ", "");
    }

    public void b(boolean bl2) {
        block4: {
            block6: {
                db db2;
                block5: {
                    int n2 = fQ.d();
                    if (n2 != 0) break block4;
                    if (!bl2) break block5;
                    db2 = this;
                    if (n2 != 0) break block6;
                    if (!db2.j) {
                        this.p = 0;
                    }
                }
                db2 = this;
            }
            db2.j = bl2;
        }
    }

    public void d(int n2) {
        db db2;
        block6: {
            int n3;
            int n4;
            block5: {
                this.o = n2;
                n4 = this.l.length();
                int n5 = fQ.e();
                n3 = this.o;
                if (n5 == 0) break block5;
                if (n3 < 0) {
                    this.o = 0;
                }
                db2 = this;
                if (n5 == 0) break block6;
                n3 = db2.o;
            }
            if (n3 > n4) {
                this.o = n4;
            }
            db2 = this;
        }
        db2.f(this.o);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(int n2) {
        this.g = n2;
    }

    public void e(int n2) {
        block3: {
            block2: {
                this.h = n2;
                int n3 = fQ.d();
                db db2 = this;
                if (n3 != 0) break block2;
                if (db2.l.length() <= n2) break block3;
                db2 = this;
            }
            db2.l = this.l.substring(0, n2);
        }
    }

    public int j() {
        return this.h;
    }

    public void c(boolean bl2) {
        this.r = bl2;
    }

    public void d(boolean bl2) {
        this.s = bl2;
    }

    public void f(int n2) {
        block20: {
            int n3;
            block26: {
                db db2;
                int n4;
                block25: {
                    int n5;
                    block24: {
                        block23: {
                            int n6;
                            block21: {
                                block22: {
                                    db db3;
                                    block19: {
                                        block18: {
                                            int n7;
                                            block17: {
                                                n3 = this.l.length();
                                                n5 = fQ.d();
                                                n7 = n2;
                                                if (n5 == 0) {
                                                    if (n7 > n3) {
                                                        n2 = n3;
                                                    }
                                                    n7 = n2;
                                                }
                                                if (n5 != 0) break block17;
                                                if (n7 >= 0) break block18;
                                                n7 = 0;
                                            }
                                            n2 = n7;
                                        }
                                        this.a = n2;
                                        db3 = this;
                                        if (n5 != 0) break block19;
                                        if (db3.n == null) break block20;
                                        db3 = this;
                                    }
                                    int n8 = db3.k;
                                    if (n5 == 0) {
                                        if (n8 > n3) {
                                            this.k = n3;
                                        }
                                        n8 = this.d();
                                    }
                                    int n9 = n8;
                                    String string = this.n.e(this.l.substring(this.k), n9);
                                    int n10 = string.length() + this.k;
                                    n4 = n2;
                                    n6 = this.k;
                                    if (n5 == 0) {
                                        if (n4 == n6) {
                                            this.k -= this.n.a(this.l, n9, true).length();
                                        }
                                        n4 = n2;
                                        n6 = n10;
                                    }
                                    if (n5 != 0) break block21;
                                    if (n4 <= n6) break block22;
                                    this.k += n2 - n10;
                                    if (n5 == 0) break block23;
                                }
                                n4 = n2;
                                if (n5 != 0) break block24;
                                n6 = this.k;
                            }
                            if (n4 <= n6) {
                                this.k -= this.k - n2;
                            }
                        }
                        n4 = this.k;
                    }
                    if (n5 != 0) break block25;
                    if (n4 < 0) {
                        this.k = 0;
                    }
                    db2 = this;
                    if (n5 != 0) break block26;
                    n4 = db2.k;
                }
                if (n4 <= n3) break block20;
                db2 = this;
            }
            db2.k = n3;
        }
    }

    public int h(int n2) {
        return this.a(n2, this.g());
    }

    public void b(String string) {
        block4: {
            block3: {
                int n2;
                block2: {
                    n2 = fQ.d();
                    if (n2 != 0) break block2;
                    if (string.length() <= this.h) break block3;
                    this.l = string.substring(0, this.h);
                }
                if (n2 == 0) break block4;
            }
            this.l = string;
        }
        this.i();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1, int var2_2, int var3_3) {
        block14: {
            block13: {
                block12: {
                    block11: {
                        var4_4 = fQ.e();
                        v0 = var1_1;
                        v1 = this.t;
                        if (var4_4 == 0) break block11;
                        if (v0 < v1) ** GOTO lbl-1000
                        v0 = var1_1;
                        v1 = this.t + this.u;
                    }
                    if (var4_4 == 0) break block12;
                    if (v0 >= v1) ** GOTO lbl-1000
                    v0 = var2_2;
                    v1 = this.v;
                }
                if (var4_4 == 0) break block13;
                if (v0 < v1) ** GOTO lbl-1000
                v0 = var2_2;
                if (var4_4 == 0) break block14;
                v1 = this.v + this.i;
            }
            ** if (v0 >= v1) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v0 = true;
                ** GOTO lbl25
            }
lbl-1000:
            // 4 sources

            {
                v0 = false;
            }
        }
        var5_5 = v0;
        v2 = this.q;
        if (var4_4 != 0) {
            if (v2 != 0) {
                this.getClass();
                v3 = var5_5;
                if (var4_4 != 0) {
                    v3 = v3 != false;
                }
                this.b(v3);
            }
            v2 = this.j;
        }
        if (var4_4 != 0) {
            if (v2 == 0) return;
            v2 = var3_3;
        }
        if (var4_4 != 0) {
            if (v2 != 0) return;
            v2 = var1_1 - this.t;
        }
        var6_6 = v2;
        v4 = this;
        if (var4_4 != 0) {
            if (v4.s) {
                var6_6 -= 4;
            }
            v4 = this;
        }
        var7_7 = v4.n.e(this.l.substring(this.k), this.d());
        this.d(this.n.e(var7_7, var6_6).length() + this.k);
    }

    private void c(int n2, int n3, int n4, int n5) {
        block6: {
            int n6;
            int n7;
            block5: {
                int n8;
                block4: {
                    int n9 = fQ.d();
                    n7 = n2;
                    n8 = n4;
                    if (n9 != 0) break block4;
                    if (n7 < n8) {
                        n6 = n2;
                        n2 = n4;
                        n4 = n6;
                    }
                    n7 = n3;
                    if (n9 != 0) break block5;
                    n8 = n5;
                }
                if (n7 >= n8) break block6;
                n7 = n3;
            }
            n6 = n7;
            n3 = n5;
            n5 = n6;
        }
        W w2 = W.c();
        I i2 = w2.b();
        GL11.glColor4f((float)0.0f, (float)0.0f, (float)255.0f, (float)255.0f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3058);
        GL11.glLogicOp((int)5387);
        i2.a(7, b.k);
        i2.c((double)n2, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n3, 0.0).d();
        i2.c((double)n2, (double)n3, 0.0).d();
        w2.a();
        GL11.glDisable((int)3058);
        GL11.glEnable((int)3553);
    }

    /*
     * Exception decompiling
     */
    public void h() {
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

    public int a(int n2, int n3) {
        return this.a(n2, this.g(), true);
    }

    public void l() {
        ++this.p;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(int var1_1, int var2_2, boolean var3_3) {
        var5_4 = var2_2;
        var4_5 = fQ.e();
        v0 = var1_1;
        if (var4_5 != 0) {
            v0 = v0 < 0 ? 1 : 0;
        }
        var6_6 = v0;
        var7_7 = Math.abs(var1_1);
        var8_8 = 0;
        block0: while (true) {
            v1 = var8_8;
            v2 = var7_7;
            block1: while (v1 < v2) {
                block13: {
                    block10: {
                        block12: {
                            block11: {
                                v3 = var6_6;
                                if (var4_5 == 0) return v3;
                                if (var4_5 == 0) ** GOTO lbl42
                                if (v3 != 0) break block10;
                                var9_9 = this.l.length();
                                v4 = var5_4 = this.l.indexOf(32, var5_4);
                                if (var4_5 == 0) ** GOTO lbl26
                                if (v4 != -1) break block11;
                                var5_4 = var9_9;
                                if (var4_5 != 0) break block12;
                            }
                            do {
                                v4 = var3_3 ? 1 : 0;
lbl26:
                                // 2 sources

                                if (v4 == 0) break;
                                v1 = var5_4;
                                v2 = var9_9;
                                if (var4_5 == 0) continue block1;
                                if (var4_5 != 0) {
                                    if (v1 >= v2) break;
                                    v5 = this.l.charAt(var5_4);
                                    v6 = 32;
                                }
                                if (v5 != v6) break;
                                ++var5_4;
                            } while (var4_5 != 0);
                        }
                        if (var4_5 != 0) break block13;
                    }
                    do {
                        v7 = var3_3;
lbl42:
                        // 2 sources

                        if (!v7) break;
                        v8 = var5_4;
                        if (var4_5 == 0 || var4_5 == 0) ** GOTO lbl53
                        if (v8 <= 0) break;
                        v8 = this.l.charAt(var5_4 - 1);
                        if (var4_5 == 0) ** GOTO lbl53
                        if (v8 != 32) break;
                        --var5_4;
                    } while (var4_5 != 0);
                    do {
                        v8 = var5_4;
lbl53:
                        // 3 sources

                        if (v8 <= 0) break;
                        v1 = this.l.charAt(var5_4 - 1);
                        v2 = 32;
                        if (var4_5 == 0) continue block1;
                        if (v1 == v2) break;
                        --var5_4;
                    } while (var4_5 != 0);
                }
                ++var8_8;
                if (var4_5 != 0) continue block0;
            }
            break;
        }
        v3 = var5_4;
        return v3;
    }

    public boolean b() {
        return this.s;
    }

    public int e() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int d() {
        int n2;
        int n3 = fQ.d();
        db db2 = this;
        if (n3 == 0) {
            if (db2.b()) {
                n2 = this.u - 8;
                return n2;
            }
            db2 = this;
        }
        n2 = db2.u;
        return n2;
    }

    public void m() {
        this.d(0);
    }

    public boolean c() {
        return this.j;
    }

    public db(a5 a52, int n2, int n3, int n4, int n5) {
        this.m = true;
        this.w = 0x707070;
        this.l = "";
        this.h = 50;
        this.j = false;
        this.s = true;
        this.q = true;
        this.k = 0;
        this.o = 0;
        this.a = 0;
        this.g = 0xE0E0E0;
        this.r = true;
        this.n = a52;
        this.t = n2;
        this.v = n3;
        this.u = n4;
        this.i = n5;
    }

    public int g() {
        return this.o;
    }

    public void g(int n2) {
        this.d(this.a + n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1) {
        block14: {
            block13: {
                var2_2 = fQ.d();
                v0 = this.l.length();
                if (var2_2 == 0) {
                    if (v0 == 0) return;
                    v0 = this.a;
                }
                if (var2_2 == 0) {
                    if (v0 != this.o) {
                        this.a("");
                        if (var2_2 == 0) return;
                    }
                    v0 = var1_1;
                }
                if (var2_2 == 0) {
                    v0 = v0 < 0 ? 1 : 0;
                }
                v1 = var3_3 = v0;
                if (var2_2 == 0) {
                    v1 = v1 != 0 ? this.o + var1_1 : this.o;
                }
                var4_4 = v1;
                v2 = var3_3;
                if (var2_2 != 0) ** GOTO lbl23
                if (v2 != 0) {
                    v3 = this.o;
                } else {
                    v2 = this.o;
lbl23:
                    // 2 sources

                    v3 = v2 + var1_1;
                }
                var5_5 = v3;
                var6_6 = "";
                v4 = var4_4;
                if (var2_2 == 0) {
                    if (v4 >= 0) {
                        var6_6 = this.l.substring(0, var4_4);
                    }
                    v4 = var5_5;
                }
                if (var2_2 != 0) break block13;
                if (v4 < this.l.length()) {
                    var6_6 = var6_6 + this.l.substring(var5_5);
                }
                v5 = this;
                if (var2_2 != 0) break block14;
                v5.l = var6_6;
                v4 = var3_3;
            }
            if (v4 == 0) return;
            v5 = this;
        }
        v5.g(var1_1);
    }

    public void i() {
        this.d(this.l.length());
    }
}

