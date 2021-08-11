/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.h;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.w;
import net.minecraft.client.h.c;
import net.minecraft.client.h.e;
import net.minecraft.client.h.f;
import net.minecraft.client.h.i;
import net.minecraft.client.h.k;

public class h {
    private /* synthetic */ List<k> d;
    private final /* synthetic */ List<i> m;
    private /* synthetic */ w e;
    private /* synthetic */ net.minecraft.az.k l;
    private final /* synthetic */ f c;
    private /* synthetic */ net.minecraft.l.i f;
    private /* synthetic */ k g;
    private /* synthetic */ w i;
    private /* synthetic */ c a;
    private /* synthetic */ int h;
    private final /* synthetic */ List<c> j;
    private /* synthetic */ int k;
    private /* synthetic */ Q b;

    public h() {
        String[] arrstring = net.minecraft.client.h.k.d();
        String[] arrstring2 = arrstring;
        this.j = Lists.newArrayListWithCapacity((int)20);
        this.c = new f();
        this.m = Lists.newArrayList();
        for (int i2 = 0; i2 < 20; ++i2) {
            this.j.add(new c());
            if (arrstring2 != null) continue;
        }
    }

    private void c() {
        block3: {
            int n2 = 20 * this.k;
            String[] arrstring = net.minecraft.client.h.k.d();
            for (int i2 = 0; i2 < this.j.size(); ++i2) {
                c c10 = this.j.get(i2);
                if (arrstring != null) {
                    if (n2 + i2 < this.d.size()) {
                        k k2 = this.d.get(n2 + i2);
                        c10.a(k2, this, this.f);
                        c10.l = true;
                        if (arrstring != null) continue;
                    }
                    c10.l = false;
                    if (arrstring != null) continue;
                }
                break block3;
            }
            this.b();
        }
    }

    public void a(e e10) {
        this.m.remove(e10);
        this.m.add(e10);
    }

    public void a(int n2, int n3) {
        block3: {
            h h2;
            block5: {
                String[] arrstring;
                block4: {
                    block2: {
                        arrstring = net.minecraft.client.h.k.d();
                        h2 = this;
                        if (arrstring == null) break block2;
                        if (h2.b.aO == null) break block3;
                        h2 = this;
                    }
                    if (arrstring == null) break block4;
                    if (h2.a == null) break block3;
                    h2 = this;
                }
                if (arrstring == null) break block5;
                if (h2.c.b()) break block3;
                h2 = this;
            }
            h2.b.aO.a(this.a.a(this.b.aO), n2, n3);
        }
    }

    public void a(Q q2, int n2, int n3) {
        block2: {
            this.b = q2;
            String[] arrstring = net.minecraft.client.h.k.d();
            this.f = q2.s.G();
            for (int i2 = 0; i2 < this.j.size(); ++i2) {
                this.j.get(i2).c(n2 + 11 + 25 * (i2 % 5), n3 + 31 + 25 * (i2 / 5));
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            this.i = new w(0, n2 + 93, n3 + 137, 12, 17, false);
            this.i.a(1, 208, 13, 18, net.minecraft.client.h.e.q);
            this.e = new w(0, n2 + 38, n3 + 137, 12, 17, true);
            this.e.a(1, 208, 13, 18, net.minecraft.client.h.e.q);
        }
    }

    @Nullable
    public k d() {
        return this.g;
    }

    /*
     * Exception decompiling
     */
    private void b() {
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

    public void a(List<k> list, boolean bl2) {
        block3: {
            block2: {
                this.d = list;
                String[] arrstring = net.minecraft.client.h.k.d();
                this.h = (int)Math.ceil((double)list.size() / 20.0);
                h h2 = this;
                if (arrstring == null) break block2;
                if (h2.h > this.k && !bl2) break block3;
                h2 = this;
            }
            h2.k = 0;
        }
        this.c();
    }

    public void a(int n2, int n3, int n4, int n5, float f10) {
        block7: {
            String[] arrstring = net.minecraft.client.h.k.d();
            h h2 = this;
            if (arrstring != null) {
                if (h2.h > 1) {
                    String string = this.k + 1 + "/" + this.h;
                    int n6 = this.b.a6.e(string);
                    this.b.a6.b(string, n2 - n6 / 2 + 73, n3 + 141, -1);
                }
                a0.a();
                this.a = null;
                h2 = this;
            }
            for (c c10 : h2.j) {
                block9: {
                    boolean bl2;
                    block8: {
                        c10.a(this.b, n4, n5, f10);
                        if (arrstring == null) break block7;
                        bl2 = c10.l;
                        if (arrstring == null) break block8;
                        if (!bl2) break block9;
                        bl2 = c10.c();
                    }
                    if (bl2) {
                        this.a = c10;
                    }
                }
                if (arrstring != null) continue;
            }
            this.e.a(this.b, n4, n5, f10);
            this.i.a(this.b, n4, n5, f10);
            this.c.a(n4, n5, f10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7) {
        block18: {
            block16: {
                block17: {
                    this.l = null;
                    var8_8 = net.minecraft.client.h.k.d();
                    this.g = null;
                    v0 = this.c.b();
                    if (var8_8 != null) {
                        if (v0 != 0) {
                            v1 = this.c;
                            v2 = var1_1;
                            if (var8_8 != null) {
                                if (v1.a(v2, var2_2, var3_3)) {
                                    this.l = this.c.a();
                                    this.g = this.c.d();
                                    if (var8_8 != null) return true;
                                }
                                v1 = this.c;
                                v2 = 0;
                            }
                            v1.a((boolean)v2);
                            return true;
                        }
                        v0 = this.i.a(this.b, var1_1, var2_2) ? 1 : 0;
                    }
                    if (var8_8 == null) break block16;
                    if (v0 == 0) break block17;
                    v0 = var3_3;
                    if (var8_8 != null) {
                        if (v0 == 0) {
                            this.i.a(this.b.p());
                            ++this.k;
                            this.c();
                            return true;
                        } else {
                            ** GOTO lbl29
                        }
                    }
                    break block16;
                }
                v3 = this;
                if (var8_8 == null) break block18;
                v0 = v3.e.a(this.b, var1_1, var2_2) ? 1 : 0;
            }
            if (v0 != 0) {
                v4 = var3_3;
                if (var8_8 == null) return v4;
                if (!v4) {
                    this.e.a(this.b.p());
                    --this.k;
                    this.c();
                    return true;
                }
            }
            v3 = this;
        }
        var9_9 = v3.j.iterator();
        do {
            if (var9_9.hasNext() == false) return false;
            var10_10 = var9_9.next();
            v5 = var10_10.a(this.b, var1_1, var2_2);
            if (var8_8 == null) return v5;
            if (var8_8 != null) {
                if (!v5) continue;
                var10_10.a(this.b.p());
                v6 = var3_3;
            }
            if (var8_8 != null) {
                if (v6 == 0) {
                    this.l = var10_10.b();
                    this.g = var10_10.c();
                    if (var8_8 != null) return (boolean)1;
                }
                v6 = this.c.b();
            }
            if (var8_8 == null) return (boolean)v6;
            if (v6 != false) return (boolean)1;
            v6 = var10_10.a();
            if (var8_8 == null) return (boolean)v6;
            if (v6 != 0) return (boolean)1;
            this.c.a(this.b, var10_10.c(), var10_10.o, var10_10.r, var4_4 + var6_6 / 2, var5_5 + 13 + var7_7 / 2, var10_10.a(), this.f);
            return (boolean)1;
        } while (var8_8 != null);
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void e() {
        this.c.a(false);
    }

    @Nullable
    public net.minecraft.az.k a() {
        return this.l;
    }

    public void a(List<net.minecraft.az.k> list) {
        Iterator<i> iterator = this.m.iterator();
        String[] arrstring = net.minecraft.client.h.k.d();
        while (iterator.hasNext()) {
            i i2 = iterator.next();
            i2.a(list);
            if (arrstring != null) continue;
        }
    }
}

