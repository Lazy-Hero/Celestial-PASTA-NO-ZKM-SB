/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.client.b;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import net.minecraft.ar.X;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aU;
import net.minecraft.client.b.q;
import net.minecraft.client.y.b;
import net.minecraft.k.h;

public class aq
extends q {
    public /* synthetic */ int k;
    private /* synthetic */ boolean m;
    private /* synthetic */ Predicate<String> w;
    private /* synthetic */ int u;
    private /* synthetic */ boolean j;
    private /* synthetic */ int x;
    private final /* synthetic */ int n;
    private final /* synthetic */ int r;
    private /* synthetic */ String s;
    private /* synthetic */ aU z;
    private final /* synthetic */ a5 a;
    private /* synthetic */ int y;
    private /* synthetic */ int v;
    public /* synthetic */ boolean h;
    private /* synthetic */ boolean l;
    private /* synthetic */ boolean t;
    private /* synthetic */ int p;
    public /* synthetic */ int o;
    private /* synthetic */ int q;
    private final /* synthetic */ int i;
    public /* synthetic */ int g;

    public int h() {
        return this.v;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(char c10, int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = this.h;
        if (arrstring != null) {
            if (n3 == 0) {
                return false;
            }
            n3 = L.c(n2);
        }
        if (arrstring != null) {
            if (n3 != 0) {
                this.c();
                this.g(0);
                return true;
            }
            n3 = L.g(n2);
        }
        if (arrstring != null) {
            if (n3 != 0) {
                L.e(this.f());
                return true;
            }
            n3 = L.d(n2);
        }
        if (arrstring != null) {
            if (n3 != 0) {
                boolean bl2 = this.j;
                if (arrstring == null) return bl2;
                if (!bl2) return true;
                this.b(L.l());
                return true;
            }
            n3 = L.e(n2);
        }
        if (arrstring != null) {
            if (n3 != 0) {
                L.e(this.f());
                boolean bl3 = this.j;
                if (arrstring == null) return bl3;
                if (!bl3) return true;
                this.b("");
                return true;
            }
            n3 = n2;
        }
        if (arrstring != null) {
            switch (n3) {
                case 14: {
                    boolean bl4 = L.q();
                    if (arrstring != null) {
                        if (bl4) {
                            bl4 = this.j;
                            if (arrstring == null) return bl4;
                            if (!bl4) return true;
                            this.i(-1);
                            if (arrstring != null) return true;
                        }
                        bl4 = this.j;
                    }
                    if (arrstring == null) return bl4;
                    if (!bl4) return true;
                    this.h(-1);
                    return true;
                }
                case 199: {
                    if (L.o()) {
                        this.g(0);
                        if (arrstring != null) return true;
                    }
                    this.l();
                    return true;
                }
                case 203: {
                    boolean bl5 = L.o();
                    if (arrstring != null) {
                        if (bl5) {
                            if (L.q()) {
                                this.g(this.a(-1, this.h()));
                                if (arrstring != null) return true;
                            }
                            this.g(this.h() - 1);
                            if (arrstring != null) return true;
                        }
                        bl5 = L.q();
                    }
                    if (bl5) {
                        this.a(this.e(-1));
                        if (arrstring != null) return true;
                    }
                    this.d(-1);
                    return true;
                }
                case 205: {
                    boolean bl6 = L.o();
                    if (arrstring != null) {
                        if (bl6) {
                            if (L.q()) {
                                this.g(this.a(1, this.h()));
                                if (arrstring != null) return true;
                            }
                            this.g(this.h() + 1);
                            if (arrstring != null) return true;
                        }
                        bl6 = L.q();
                    }
                    if (bl6) {
                        this.a(this.e(1));
                        if (arrstring != null) return true;
                    }
                    this.d(1);
                    return true;
                }
                case 207: {
                    if (L.o()) {
                        this.g(this.s.length());
                        if (arrstring != null) return true;
                    }
                    this.c();
                    return true;
                }
                case 211: {
                    boolean bl7 = L.q();
                    if (arrstring != null) {
                        if (bl7) {
                            bl7 = this.j;
                            if (arrstring == null) return bl7;
                            if (!bl7) return true;
                            this.i(1);
                            if (arrstring != null) return true;
                        }
                        bl7 = this.j;
                    }
                    if (arrstring == null) return bl7;
                    if (!bl7) return true;
                    this.h(1);
                    return true;
                }
            }
            n3 = X.a(c10) ? 1 : 0;
        }
        if (arrstring == null) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        boolean bl8 = this.j;
        if (arrstring == null) return bl8;
        if (!bl8) return true;
        this.b(Character.toString(c10));
        return true;
    }

    public void f(int n2) {
        this.u = n2;
    }

    public void a(aU aU2) {
        this.z = aU2;
    }

    public void a(int n2) {
        this.y = n2;
        int n3 = this.s.length();
        this.y = net.minecraft.k.h.c(this.y, 0, n3);
        this.g(this.y);
    }

    /*
     * Exception decompiling
     */
    public void d() {
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

    public void l() {
        this.a(0);
    }

    public void a(String string) {
        block3: {
            block5: {
                block4: {
                    int n2;
                    String[] arrstring;
                    block2: {
                        arrstring = net.minecraft.client.b.q.b();
                        n2 = this.w.apply((Object)string);
                        if (arrstring == null) break block2;
                        if (n2 == 0) break block3;
                        n2 = string.length();
                    }
                    if (n2 <= this.k) break block4;
                    this.s = string.substring(0, this.k);
                    if (arrstring != null) break block5;
                }
                this.s = string;
            }
            this.c();
        }
    }

    public int e(int n2) {
        return this.a(n2, this.m());
    }

    public void d(boolean bl2) {
        this.t = bl2;
    }

    public int e() {
        return this.k;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(int var1_1, int var2_2, boolean var3_3) {
        var5_4 = var2_2;
        var4_5 = net.minecraft.client.b.q.b();
        v0 = var1_1;
        if (var4_5 != null) {
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
                                if (var4_5 == null) return v3;
                                if (var4_5 == null) ** GOTO lbl42
                                if (v3 != 0) break block10;
                                var9_9 = this.s.length();
                                v4 = var5_4 = this.s.indexOf(32, var5_4);
                                if (var4_5 == null) ** GOTO lbl26
                                if (v4 != -1) break block11;
                                var5_4 = var9_9;
                                if (var4_5 != null) break block12;
                            }
                            do {
                                v4 = var3_3 ? 1 : 0;
lbl26:
                                // 2 sources

                                if (v4 == 0) break;
                                v1 = var5_4;
                                v2 = var9_9;
                                if (var4_5 == null) continue block1;
                                if (var4_5 != null) {
                                    if (v1 >= v2) break;
                                    v5 = this.s.charAt(var5_4);
                                    v6 = 32;
                                }
                                if (v5 != v6) break;
                                ++var5_4;
                            } while (var4_5 != null);
                        }
                        if (var4_5 != null) break block13;
                    }
                    do {
                        v7 = var3_3;
lbl42:
                        // 2 sources

                        if (!v7) break;
                        v8 = var5_4;
                        if (var4_5 == null || var4_5 == null) ** GOTO lbl53
                        if (v8 <= 0) break;
                        v8 = this.s.charAt(var5_4 - 1);
                        if (var4_5 == null) ** GOTO lbl53
                        if (v8 != 32) break;
                        --var5_4;
                    } while (var4_5 != null);
                    do {
                        v8 = var5_4;
lbl53:
                        // 3 sources

                        if (v8 <= 0) break;
                        v1 = this.s.charAt(var5_4 - 1);
                        v2 = 32;
                        if (var4_5 == null) continue block1;
                        if (v1 == v2) break;
                        --var5_4;
                    } while (var4_5 != null);
                }
                ++var8_8;
                if (var4_5 != null) continue block0;
            }
            break;
        }
        v3 = var5_4;
        return v3;
    }

    public boolean j() {
        return this.l;
    }

    public void b(int n2) {
        block3: {
            block2: {
                this.k = n2;
                String[] arrstring = net.minecraft.client.b.q.b();
                aq aq2 = this;
                if (arrstring == null) break block2;
                if (aq2.s.length() <= n2) break block3;
                aq2 = this;
            }
            aq2.s = this.s.substring(0, n2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void h(int var1_1) {
        block16: {
            block15: {
                var2_2 = net.minecraft.client.b.q.b();
                v0 = this.s.isEmpty();
                if (var2_2 != null) {
                    if (v0 != 0) return;
                    v0 = this.v;
                }
                if (var2_2 != null) {
                    if (v0 != this.y) {
                        this.b("");
                        if (var2_2 != null) return;
                    }
                    v0 = var1_1;
                }
                if (var2_2 != null) {
                    v0 = v0 < 0 ? 1 : 0;
                }
                v1 = var3_3 = v0;
                if (var2_2 != null) {
                    v1 = v1 != 0 ? this.y + var1_1 : this.y;
                }
                var4_4 = v1;
                v2 = var3_3;
                if (var2_2 == null) ** GOTO lbl23
                if (v2 != 0) {
                    v3 = this.y;
                } else {
                    v2 = this.y;
lbl23:
                    // 2 sources

                    v3 = v2 + var1_1;
                }
                var5_5 = v3;
                var6_6 = "";
                v4 = var4_4;
                if (var2_2 != null) {
                    if (v4 >= 0) {
                        var6_6 = this.s.substring(0, var4_4);
                    }
                    v4 = var5_5;
                }
                if (var2_2 != null) {
                    if (v4 < this.s.length()) {
                        var6_6 = var6_6 + this.s.substring(var5_5);
                    }
                    v4 = this.w.apply((Object)var6_6) ? 1 : 0;
                }
                if (var2_2 == null) break block15;
                if (v4 == 0) return;
                v5 = this;
                if (var2_2 == null) break block16;
                v5.s = var6_6;
                v4 = var3_3;
            }
            if (v4 != 0) {
                this.d(var1_1);
            }
            v5 = this;
        }
        v5.a(this.r, this.s);
    }

    public void b(boolean bl2) {
        this.m = bl2;
    }

    public boolean b() {
        return this.h;
    }

    public void c() {
        this.a(this.s.length());
    }

    public void a(boolean bl2) {
        this.j = bl2;
    }

    public void c(int n2) {
        this.x = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean k() {
        return this.t;
    }

    public void a(int n2, String string) {
        block3: {
            aU aU2;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                aU2 = this.z;
                if (arrstring == null) break block2;
                if (aU2 == null) break block3;
                aU2 = this.z;
            }
            aU2.a(n2, string);
        }
    }

    public String n() {
        return this.s;
    }

    public int a(int n2, int n3) {
        return this.a(n2, n3, true);
    }

    public aq(int n2, a5 a52, int n3, int n4, int n5, int n6) {
        this.s = "";
        this.k = 32;
        this.t = true;
        this.m = true;
        this.j = true;
        this.x = 0xE0E0E0;
        this.u = 0x707070;
        this.l = true;
        this.w = Predicates.alwaysTrue();
        this.r = n2;
        this.a = a52;
        this.g = n3;
        this.o = n4;
        this.n = n5;
        this.i = n6;
    }

    public void d(int n2) {
        this.a(this.v + n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int a() {
        int n2;
        String[] arrstring = net.minecraft.client.b.q.b();
        aq aq2 = this;
        if (arrstring != null) {
            if (aq2.k()) {
                n2 = this.n - 8;
                return n2;
            }
            aq2 = this;
        }
        n2 = aq2.n;
        return n2;
    }

    public int g() {
        return this.r;
    }

    public int m() {
        return this.y;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(int var1_1, int var2_2, int var3_3) {
        block11: {
            block10: {
                block9: {
                    block8: {
                        var4_4 = net.minecraft.client.b.q.b();
                        v0 = var1_1;
                        v1 = this.g;
                        if (var4_4 == null) break block8;
                        if (v0 < v1) ** GOTO lbl-1000
                        v0 = var1_1;
                        v1 = this.g + this.n;
                    }
                    if (var4_4 == null) break block9;
                    if (v0 >= v1) ** GOTO lbl-1000
                    v0 = var2_2;
                    v1 = this.o;
                }
                if (var4_4 == null) break block10;
                if (v0 < v1) ** GOTO lbl-1000
                v0 = var2_2;
                if (var4_4 == null) break block11;
                v1 = this.o + this.i;
            }
            ** if (v0 >= v1) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v0 = 1;
                ** GOTO lbl25
            }
lbl-1000:
            // 4 sources

            {
                v0 = 0;
            }
        }
        var5_5 = v0;
        v2 = this.m;
        if (var4_4 != null) {
            if (v2 != 0) {
                this.c((boolean)var5_5);
            }
            v2 = this.h;
        }
        if (var4_4 == null) return (boolean)v2;
        if (v2 == 0) return (boolean)0;
        v2 = var5_5;
        if (var4_4 == null) return (boolean)v2;
        if (v2 == 0) return (boolean)0;
        v2 = var3_3;
        if (var4_4 == null) return (boolean)v2;
        if (v2 != 0) return (boolean)0;
        var6_6 = var1_1 - this.g;
        v3 = this;
        if (var4_4 != null) {
            if (v3.t) {
                var6_6 -= 4;
            }
            v3 = this;
        }
        var7_7 = v3.a.e(this.s.substring(this.p), this.a());
        this.a(this.a.e(var7_7, var6_6).length() + this.p);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String f() {
        var1_1 = net.minecraft.client.b.q.b();
        v0 = this;
        if (var1_1 == null) ** GOTO lbl8
        if (v0.y < this.v) {
            v1 = this.y;
        } else {
            v0 = this;
lbl8:
            // 2 sources

            v1 = v0.v;
        }
        var2_2 = v1;
        v2 = this;
        if (var1_1 == null) ** GOTO lbl16
        if (v2.y < this.v) {
            v3 = this.v;
        } else {
            v2 = this;
lbl16:
            // 2 sources

            v3 = v2.y;
        }
        var3_3 = v3;
        return this.s.substring(var2_2, var3_3);
    }

    public void i() {
        ++this.q;
    }

    public void a(Predicate<String> predicate) {
        this.w = predicate;
    }

    public void i(int n2) {
        block3: {
            aq aq2;
            block4: {
                block5: {
                    int n3;
                    String[] arrstring;
                    block2: {
                        arrstring = net.minecraft.client.b.q.b();
                        n3 = this.s.isEmpty();
                        if (arrstring == null) break block2;
                        if (n3 != 0) break block3;
                        aq2 = this;
                        if (arrstring == null) break block4;
                        n3 = aq2.v;
                    }
                    if (n3 == this.y) break block5;
                    this.b("");
                    if (arrstring != null) break block3;
                }
                aq2 = this;
            }
            aq2.h(this.e(n2) - this.y);
        }
    }

    public void g(int n2) {
        block16: {
            int n3;
            block19: {
                int n4;
                int n5;
                block17: {
                    block18: {
                        aq aq2;
                        String[] arrstring;
                        block15: {
                            block14: {
                                int n6;
                                block13: {
                                    n3 = this.s.length();
                                    arrstring = net.minecraft.client.b.q.b();
                                    n6 = n2;
                                    if (arrstring != null) {
                                        if (n6 > n3) {
                                            n2 = n3;
                                        }
                                        n6 = n2;
                                    }
                                    if (arrstring == null) break block13;
                                    if (n6 >= 0) break block14;
                                    n6 = 0;
                                }
                                n2 = n6;
                            }
                            this.v = n2;
                            aq2 = this;
                            if (arrstring == null) break block15;
                            if (aq2.a == null) break block16;
                            aq2 = this;
                        }
                        int n7 = aq2.p;
                        if (arrstring != null) {
                            if (n7 > n3) {
                                this.p = n3;
                            }
                            n7 = this.a();
                        }
                        int n8 = n7;
                        String string = this.a.e(this.s.substring(this.p), n8);
                        int n9 = string.length() + this.p;
                        n5 = n2;
                        n4 = this.p;
                        if (arrstring != null) {
                            if (n5 == n4) {
                                this.p -= this.a.a(this.s, n8, true).length();
                            }
                            n5 = n2;
                            n4 = n9;
                        }
                        if (arrstring == null) break block17;
                        if (n5 <= n4) break block18;
                        this.p += n2 - n9;
                        if (arrstring != null) break block19;
                    }
                    n5 = n2;
                    n4 = this.p;
                }
                if (n5 <= n4) {
                    this.p -= this.p - n2;
                }
            }
            this.p = net.minecraft.k.h.c(this.p, 0, n3);
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        block10: {
            int n6;
            int n7;
            block9: {
                int n8;
                String[] arrstring = net.minecraft.client.b.q.b();
                n7 = n2;
                n6 = n4;
                if (arrstring != null) {
                    if (n7 < n6) {
                        n8 = n2;
                        n2 = n4;
                        n4 = n8;
                    }
                    n7 = n3;
                    n6 = n5;
                }
                if (arrstring != null) {
                    if (n7 < n6) {
                        n8 = n3;
                        n3 = n5;
                        n5 = n8;
                    }
                    n7 = n4;
                    n6 = this.g + this.n;
                }
                if (arrstring != null) {
                    if (n7 > n6) {
                        n4 = this.g + this.n;
                    }
                    n7 = n2;
                    n6 = this.g + this.n;
                }
                if (arrstring == null) break block9;
                if (n7 <= n6) break block10;
                n7 = this.g;
                n6 = this.n;
            }
            n2 = n7 + n6;
        }
        W w2 = W.c();
        I i2 = w2.b();
        net.minecraft.client.a.v.b(0.0f, 0.0f, 255.0f, 255.0f);
        net.minecraft.client.a.v.L();
        net.minecraft.client.a.v.g();
        net.minecraft.client.a.v.a(net.minecraft.client.a.L.OR_REVERSE);
        i2.a(7, b.k);
        i2.c((double)n2, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n5, 0.0).d();
        i2.c((double)n4, (double)n3, 0.0).d();
        i2.c((double)n2, (double)n3, 0.0).d();
        w2.a();
        net.minecraft.client.a.v.F();
        net.minecraft.client.a.v.x();
    }

    public void c(boolean bl2) {
        block11: {
            L l2;
            block10: {
                String[] arrstring;
                block7: {
                    block9: {
                        aq aq2;
                        block8: {
                            arrstring = net.minecraft.client.b.q.b();
                            if (arrstring == null) break block7;
                            if (!bl2) break block8;
                            aq2 = this;
                            if (arrstring == null) break block9;
                            if (!aq2.h) {
                                this.q = 0;
                            }
                        }
                        aq2 = this;
                    }
                    aq2.h = bl2;
                }
                l2 = Q.P().aO;
                if (arrstring == null) break block10;
                if (l2 == null) break block11;
                l2 = Q.P().aO;
            }
            l2.a(bl2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(String var1_1) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        block13: {
                            block14: {
                                var3_2 = "";
                                var4_3 = X.a(var1_1);
                                var2_4 = net.minecraft.client.b.q.b();
                                v0 = this;
                                if (var2_4 == null) ** GOTO lbl10
                                if (v0.y < this.v) {
                                    v1 = this.y;
                                } else {
                                    v0 = this;
lbl10:
                                    // 2 sources

                                    v1 = v0.v;
                                }
                                var5_5 = v1;
                                v2 = this;
                                if (var2_4 == null) ** GOTO lbl18
                                if (v2.y < this.v) {
                                    v3 = this.v;
                                } else {
                                    v2 = this;
lbl18:
                                    // 2 sources

                                    v3 = v2.y;
                                }
                                var6_6 = v3;
                                var7_7 = this.k - this.s.length() - (var5_5 - var6_6);
                                v4 = this.s.isEmpty();
                                if (var2_4 != null) {
                                    if (v4 == 0) {
                                        var3_2 = var3_2 + this.s.substring(0, var5_5);
                                    }
                                    v4 = var7_7;
                                }
                                if (var2_4 == null) break block13;
                                if (v4 >= var4_3.length()) break block14;
                                var3_2 = var3_2 + var4_3.substring(0, var7_7);
                                var8_8 = var7_7;
                                if (var2_4 != null) break block15;
                            }
                            var3_2 = var3_2 + var4_3;
                            v4 = var4_3.length();
                        }
                        var8_8 = v4;
                    }
                    v5 = this.s.isEmpty();
                    if (var2_4 == null) break block16;
                    if (v5 != 0) break block17;
                    v5 = var6_6;
                    if (var2_4 == null) break block16;
                    if (v5 < this.s.length()) {
                        var3_2 = var3_2 + this.s.substring(var6_6);
                    }
                }
                v6 = this;
                if (var2_4 == null) break block18;
                v5 = v6.w.apply((Object)var3_2) ? 1 : 0;
            }
            if (v5 == 0) return;
            this.s = var3_2;
            this.d(var5_5 - this.v + var8_8);
            v6 = this;
        }
        v6.a(this.r, this.s);
    }

    public void e(boolean bl2) {
        this.l = bl2;
    }
}

