/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.O;
import net.minecraft.B.a;
import net.minecraft.B.e;
import net.minecraft.B.j;
import net.minecraft.B.l;
import net.minecraft.B.n;
import net.minecraft.ah.z;
import net.minecraft.i.h;
import net.minecraft.u.g;
import net.minecraft.w.d;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class y
extends n {
    private final /* synthetic */ net.minecraft.k.n k;
    private final /* synthetic */ net.minecraft.i.j p;
    private /* synthetic */ String q;
    private final /* synthetic */ a r;
    private /* synthetic */ int l;
    private final /* synthetic */ z n;
    public /* synthetic */ int m;
    private static final /* synthetic */ Logger o;
    private final /* synthetic */ a s;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(net.minecraft.i.j j2) {
        block3: {
            y y2;
            block2: {
                int n2 = net.minecraft.B.n.b();
                super.b(j2);
                int n3 = n2;
                y2 = this;
                if (n3 == 0) break block2;
                if (y2.n.C) break block3;
                y2 = this;
            }
            y2.a(j2, this.n, this.s);
        }
    }

    @Override
    public void a(a a10) {
        block3: {
            y y2;
            block2: {
                int n2 = net.minecraft.B.n.b();
                y2 = this;
                if (n2 == 0) break block2;
                super.a(a10);
                if (a10 != this.s) break block3;
                y2 = this;
            }
            y2.b();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(net.minecraft.i.j var1_1, int var2_2) {
        block19: {
            block18: {
                block17: {
                    block14: {
                        block15: {
                            block16: {
                                block12: {
                                    block13: {
                                        var4_3 = net.minecraft.w.d.m;
                                        var3_4 = net.minecraft.B.n.b();
                                        v0 = var5_5 = (D)this.f.get(var2_2);
                                        if (var3_4 != 0) {
                                            if (v0 == null) return var4_3;
                                            v0 = var5_5;
                                        }
                                        if (var3_4 != 0) {
                                            if (v0.b() == false) return var4_3;
                                            v0 = var5_5;
                                        }
                                        var6_6 = v0.d();
                                        var4_3 = var6_6.C();
                                        v1 = var2_2;
                                        if (var3_4 == 0) break block12;
                                        if (v1 != 2) break block13;
                                        if (!this.a(var6_6, 3, 39, true)) {
                                            return net.minecraft.w.d.m;
                                        }
                                        var5_5.a(var6_6, var4_3);
                                        if (var3_4 != 0) break block14;
                                    }
                                    v1 = var2_2;
                                }
                                if (var3_4 == 0) break block15;
                                if (v1 == 0) break block16;
                                v1 = var2_2;
                                if (var3_4 == 0) break block15;
                                if (v1 == 1) break block16;
                                v1 = var2_2;
                                if (var3_4 == 0) break block17;
                                if (v1 < 3) break block14;
                                v1 = var2_2;
                                if (var3_4 == 0) break block17;
                                if (v1 >= 39) break block14;
                                v1 = this.a(var6_6, 0, 2, false) ? 1 : 0;
                                if (var3_4 == 0) break block17;
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                }
                                break block14;
                            }
                            v1 = this.a(var6_6, 3, 39, false) ? 1 : 0;
                        }
                        if (var3_4 != 0) {
                            if (v1 == 0) {
                                return net.minecraft.w.d.m;
                            } else {
                                ** GOTO lbl45
                            }
                        }
                        break block17;
                    }
                    v1 = var6_6.G() ? 1 : 0;
                }
                if (v1 == 0) break block18;
                var5_5.a(net.minecraft.w.d.m);
                if (var3_4 != 0) break block19;
            }
            var5_5.f();
        }
        v2 = var6_6;
        if (var3_4 == 0) return var4_3;
        if (v2.t() == var4_3.t()) {
            return net.minecraft.w.d.m;
        }
        v2 = var5_5.a(var1_1, var6_6);
        return var4_3;
    }

    static a b(y y2) {
        return y2.s;
    }

    public y(h h2, z z2, net.minecraft.k.n n2, net.minecraft.i.j j2) {
        int n3;
        int n4;
        block4: {
            int n5;
            this.r = new l();
            this.s = new e(this, "Repair", true, 2);
            n4 = net.minecraft.B.n.b();
            this.k = n2;
            this.n = z2;
            this.p = j2;
            this.a(new D(this.s, 0, 27, 47));
            this.a(new D(this.s, 1, 76, 47));
            this.a(new O(this, this.r, 2, 134, 47, z2, n2));
            n3 = 0;
            while (n3 < 3) {
                block5: {
                    n5 = 0;
                    if (n4 == 0) break block4;
                    for (int i2 = v1412223; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n3 * 9 + 9, 8 + i2 * 18, 84 + n3 * 18));
                        if (n4 != 0) {
                            if (n4 != 0) continue;
                        }
                        break block5;
                    }
                    ++n3;
                }
                if (n4 != 0) continue;
            }
            n5 = n3 = 0;
        }
        while (n3 < 9) {
            this.a(new D(h2, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n4 != 0) continue;
        }
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        j2.a((n)this, 0, this.m);
    }

    @Override
    public boolean a(net.minecraft.i.j j2) {
        int n2 = net.minecraft.B.n.b();
        if (this.n.d(this.k).b() != g.cb) {
            return false;
        }
        double d10 = j2.a((double)this.k.e() + 0.5, (double)this.k.b() + 0.5, (double)this.k.a() + 0.5) - 64.0;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (n2 != 0) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }

    public y(h h2, z z2, net.minecraft.i.j j2) {
        this(h2, z2, net.minecraft.k.n.o, j2);
    }

    /*
     * Exception decompiling
     */
    public void b() {
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

    @Override
    public void a(int n2, int n3) {
        block0: {
            if (n2 != 0) break block0;
            this.m = n3;
        }
    }

    public void a(String string) {
        y y2;
        block2: {
            block3: {
                d d10;
                block5: {
                    int n2;
                    block4: {
                        this.q = string;
                        n2 = net.minecraft.B.n.c();
                        y2 = this;
                        if (n2 != 0) break block2;
                        if (!y2.a(2).b()) break block3;
                        d10 = this.a(2).d();
                        if (n2 != 0) break block4;
                        if (!StringUtils.isBlank((CharSequence)string)) break block5;
                        d10.q();
                    }
                    if (n2 == 0) break block3;
                }
                d10.d(this.q);
            }
            y2 = this;
        }
        y2.b();
    }

    static int a(y y2) {
        return y2.l;
    }

    static {
        o = LogManager.getLogger();
    }
}

