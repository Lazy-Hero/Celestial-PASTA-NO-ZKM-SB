/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.j;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import net.minecraft.client.a.U;
import net.minecraft.client.j.a;
import net.minecraft.client.j.c;
import net.minecraft.client.j.l;
import net.minecraft.client.j.u;
import net.minecraft.k.h;

public class s {
    private final /* synthetic */ int e;
    private final /* synthetic */ int a;
    private /* synthetic */ int g;
    private /* synthetic */ int c;
    private final /* synthetic */ int h;
    private final /* synthetic */ List<l> d;
    private final /* synthetic */ Set<a> b;
    private final /* synthetic */ int f;

    public s(int n2, int n3, int n4, int n5) {
        this.b = Sets.newHashSetWithExpectedSize((int)256);
        this.d = Lists.newArrayListWithCapacity((int)256);
        this.h = n5;
        this.e = n2;
        this.a = n3;
        this.f = n4;
    }

    public List<c> c() {
        ArrayList arrayList;
        block3: {
            ArrayList arrayList2 = Lists.newArrayList();
            boolean bl2 = u.d();
            for (l object : this.d) {
                object.a(arrayList2);
                if (bl2) continue;
            }
            ArrayList arrayList3 = Lists.newArrayList();
            for (l l2 : arrayList2) {
                a a10 = l2.c();
                c c10 = a10.b();
                c10.a(this.c, this.g, l2.a(), l2.b(), a10.e());
                arrayList = arrayList3;
                if (bl2) {
                    arrayList.add(c10);
                    if (bl2) continue;
                }
                break block3;
            }
            arrayList = arrayList3;
        }
        return arrayList;
    }

    private boolean b(a a10) {
        boolean bl2;
        block8: {
            c c10 = a10.b();
            boolean bl3 = u.c();
            int n2 = c10.f();
            if (!bl3) {
                n2 = n2 != c10.b() ? 1 : 0;
            }
            int n3 = n2;
            for (int i2 = 0; i2 < this.d.size(); ++i2) {
                a a11;
                block10: {
                    int n4;
                    block9: {
                        bl2 = this.d.get(i2).a(a10);
                        if (bl3) break block8;
                        if (!bl3) {
                            if (bl2) {
                                return true;
                            }
                            n4 = n3;
                        }
                        if (bl3) break block9;
                        if (n4 == 0) continue;
                        a11 = a10;
                        if (bl3) break block10;
                        a11.d();
                        n4 = this.d.get(i2).a(a10) ? 1 : 0;
                    }
                    if (n4 != 0) {
                        return true;
                    }
                    a11 = a10;
                }
                a11.d();
                if (!bl3) continue;
            }
            bl2 = this.a(a10);
        }
        return bl2;
    }

    private static int b(int n2, int n3) {
        boolean bl2 = u.c();
        int n4 = n2 & (1 << n3) - 1;
        if (!bl2) {
            n4 = n4 == 0 ? 0 : 1;
        }
        return (n2 >> n3) + n4 << n3;
    }

    private static U a(U u2) {
        return u2;
    }

    public void b() {
        block4: {
            s s2;
            Object[] arrobject = this.b.toArray(new a[this.b.size()]);
            boolean bl2 = u.c();
            Arrays.sort(arrobject);
            Object[] arrobject2 = arrobject;
            boolean bl3 = bl2;
            int n2 = arrobject2.length;
            int n3 = 0;
            while (n3 < n2) {
                Object object = arrobject2[n3];
                if (!bl3) {
                    s2 = this;
                    if (bl3) break block4;
                    if (!s2.b((a)object)) {
                        String string = String.format("Unable to fit: %s, size: %dx%d, atlas: %dx%d, atlasMax: %dx%d - Maybe try a lower resolution resourcepack?", ((a)object).b().e(), ((a)object).b().f(), ((a)object).b().b(), this.c, this.g, this.e, this.a);
                        throw new U((a)object, string);
                    }
                    ++n3;
                }
                if (!bl3) continue;
            }
            this.c = net.minecraft.k.h.e(this.c);
            s2 = this;
        }
        s2.g = net.minecraft.k.h.e(this.g);
    }

    public void a(c c10) {
        a a10 = new a(c10, this.h);
        boolean bl2 = u.c();
        int n2 = this.f;
        if (!bl2) {
            if (n2 > 0) {
                a10.a(this.f);
            }
            n2 = this.b.add(a10) ? 1 : 0;
        }
    }

    /*
     * Exception decompiling
     */
    private boolean a(a var1_1) {
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

    static int a(int n2, int n3) {
        return s.b(n2, n3);
    }

    public int a() {
        return this.c;
    }

    public int d() {
        return this.g;
    }
}

