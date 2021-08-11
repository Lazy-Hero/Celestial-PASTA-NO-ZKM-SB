/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.aA;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.A.d;
import net.minecraft.U.k;
import net.minecraft.Z.i;
import net.minecraft.aA.h;
import net.minecraft.aA.p;
import net.minecraft.aA.v;
import net.minecraft.ah.z;
import net.minecraft.ao.j;
import net.minecraft.k.f;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.l;
import net.minecraft.p.I;
import net.minecraft.p.w;

public class q
implements v {
    private final /* synthetic */ z a;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ Map<String, j> e;
    private final /* synthetic */ i[] g;
    private /* synthetic */ I h;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ Random i;
    private final /* synthetic */ p f;
    private /* synthetic */ I c;

    @Override
    public List<d> a(k k2, n n2) {
        net.minecraft.A.h h2 = this.a.c(n2);
        return h2.a(k2);
    }

    @Override
    public boolean b(a a10, int n2, int n3) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Exception decompiling
     */
    public q(z var1_1, long var2_2, boolean var4_3, String var5_4) {
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
    public void b(int n2, int n3) {
        block19: {
            int n4;
            net.minecraft.A.h h2;
            n n5;
            boolean bl2;
            block18: {
                q q2;
                block24: {
                    block25: {
                        int n6;
                        n n7;
                        block26: {
                            I i2;
                            int n8;
                            block20: {
                                block23: {
                                    block21: {
                                        int n9;
                                        block22: {
                                            int n10 = n2 * 16;
                                            int n11 = n3 * 16;
                                            bl2 = net.minecraft.aA.h.b();
                                            n5 = new n(n10, 0, n11);
                                            h2 = this.a.c(new n(n10 + 16, 0, n11 + 16));
                                            n8 = 0;
                                            this.i.setSeed(this.a.C());
                                            long l2 = this.i.nextLong() / 2L * 2L + 1L;
                                            long l3 = this.i.nextLong() / 2L * 2L + 1L;
                                            this.i.setSeed((long)n2 * l2 + (long)n3 * l3 ^ this.a.C());
                                            f f10 = new f(n2, n3);
                                            for (j j2 : this.e.values()) {
                                                int n12 = j2.a(this.a, this.i, f10);
                                                n4 = j2 instanceof net.minecraft.ao.p;
                                                if (bl2) {
                                                    if (bl2 && n4 != 0) {
                                                        int n13 = n8 = n8 | n12;
                                                    }
                                                    if (bl2) continue;
                                                }
                                                break block18;
                                            }
                                            i2 = this.h;
                                            if (!bl2) break block20;
                                            if (i2 == null) break block21;
                                            n9 = n8;
                                            if (!bl2) break block22;
                                            if (n9 != 0) break block21;
                                            q2 = this;
                                            if (!bl2) break block23;
                                            n9 = q2.i.nextInt(4);
                                        }
                                        if (n9 == 0) {
                                            this.h.a(this.a, this.i, n5.a(this.i.nextInt(16) + 8, this.i.nextInt(256), this.i.nextInt(16) + 8));
                                        }
                                    }
                                    q2 = this;
                                }
                                if (!bl2) break block24;
                                i2 = q2.c;
                            }
                            if (i2 == null) break block25;
                            n4 = n8;
                            if (!bl2) break block18;
                            if (n4 != 0) break block25;
                            n4 = this.i.nextInt(8);
                            if (!bl2) break block18;
                            if (n4 != 0) break block25;
                            n7 = n5.a(this.i.nextInt(16) + 8, this.i.nextInt(this.i.nextInt(248) + 8), this.i.nextInt(16) + 8);
                            n6 = n7.b();
                            if (!bl2) break block25;
                            if (n6 < this.a.y()) break block26;
                            n4 = this.i.nextInt(10);
                            if (!bl2) break block18;
                            if (n4 != 0) break block25;
                        }
                        n6 = this.c.a(this.a, this.i, n7) ? 1 : 0;
                    }
                    q2 = this;
                }
                n4 = q2.b;
            }
            if (bl2) {
                if (n4 != 0) {
                    for (int i3 = 0; i3 < 8; ++i3) {
                        new w().a(this.a, this.i, n5.a(this.i.nextInt(16) + 8, this.i.nextInt(256), this.i.nextInt(16) + 8));
                        if (bl2) {
                            if (bl2) continue;
                        }
                        break block19;
                    }
                }
                n4 = this.d;
            }
            if (n4 == 0) break block19;
            h2.a(this.a, this.i, n5);
        }
    }

    @Override
    public a a(int n2, int n3) {
        a a10;
        block11: {
            int n4;
            q q2;
            boolean bl2;
            l l2;
            block9: {
                l2 = new l();
                bl2 = net.minecraft.aA.h.a();
                int n5 = 0;
                block0: while (true) {
                    int n6 = n5;
                    block1: while (n6 < this.g.length) {
                        q2 = this;
                        if (bl2) break block9;
                        i arrh2 = q2.g[n5];
                        if (bl2) continue block0;
                        if (arrh2 != null) {
                            int n7 = 0;
                            while (n7 < 16) {
                                block10: {
                                    n6 = 0;
                                    if (bl2) continue block1;
                                    for (n4 = v1860976; n4 < 16; ++n4) {
                                        l2.a(n7, n5, n4, arrh2);
                                        if (!bl2) {
                                            if (!bl2) continue;
                                        }
                                        break block10;
                                    }
                                    ++n7;
                                }
                                if (!bl2) continue;
                            }
                        }
                        ++n5;
                        if (!bl2) continue block0;
                    }
                    break;
                }
                q2 = this;
            }
            for (h h2 : q2.e.values()) {
                h2.a(this.a, n2, n3, l2);
                if (!bl2) continue;
            }
            a10 = new a(this.a, l2, n2, n3);
            net.minecraft.A.h[] arrh = this.a.B().b(null, n2 * 16, n3 * 16, 16, 16);
            byte[] arrby = a10.g();
            for (n4 = 0; n4 < arrby.length; ++n4) {
                arrby[n4] = (byte)net.minecraft.A.h.b(arrh[n4]);
                if (!bl2) {
                    if (!bl2) continue;
                }
                break block11;
            }
            a10.f();
        }
        return a10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public n a(z z2, String string, n n2, boolean bl2) {
        j j2 = this.e.get(string);
        boolean bl3 = net.minecraft.aA.h.b();
        j j3 = j2;
        if (bl3) {
            if (j3 == null) return null;
            j3 = j2;
        }
        n n3 = j3.a(z2, n2, bl2);
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, String string, n n2) {
        j j2 = this.e.get(string);
        boolean bl2 = net.minecraft.aA.h.b();
        j j3 = j2;
        if (bl2) {
            if (j3 == null) return false;
            j3 = j2;
        }
        boolean bl3 = j3.a(n2);
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void a(a a10, int n2, int n3) {
        Iterator<j> iterator = this.e.values().iterator();
        boolean bl2 = net.minecraft.aA.h.a();
        while (iterator.hasNext()) {
            j j2 = iterator.next();
            j2.a(this.a, n2, n3, null);
            if (!bl2) continue;
        }
    }
}

