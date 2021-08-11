/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.h;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.minecraft.client.B.d;
import net.minecraft.l.i;

public class k {
    private final /* synthetic */ BitSet f;
    private final /* synthetic */ BitSet d;
    private static /* synthetic */ String[] c;
    private /* synthetic */ boolean a;
    private final /* synthetic */ List<net.minecraft.az.k> e;
    private final /* synthetic */ BitSet b;

    public boolean b(net.minecraft.az.k k2) {
        return this.f.get(this.e.indexOf(k2));
    }

    public boolean a() {
        return this.a;
    }

    public List<net.minecraft.az.k> b(boolean bl2) {
        ArrayList arrayList = Lists.newArrayList();
        int n2 = this.d.nextSetBit(0);
        String[] arrstring = k.d();
        while (n2 >= 0) {
            int n3 = (bl2 ? this.f : this.b).get(n2);
            if (arrstring != null) {
                if (n3 != 0) {
                    arrayList.add(this.e.get(n2));
                }
                n3 = this.d.nextSetBit(n2 + 1);
            }
            n2 = n3;
            if (arrstring != null) continue;
        }
        return arrayList;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean c() {
        String[] arrstring = k.d();
        boolean bl2 = this.f.isEmpty();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static String[] d() {
        return c;
    }

    public void a(net.minecraft.az.k k2) {
        this.e.add(k2);
        if (this.a) {
            net.minecraft.w.d d10;
            net.minecraft.w.d d11 = this.e.get(0).d();
            this.a = net.minecraft.w.d.c(d11, d10 = k2.d()) && net.minecraft.w.d.b(d11, d10);
        }
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    static {
        if (k.d() == null) {
            k.b(new String[4]);
        }
    }

    public List<net.minecraft.az.k> b() {
        return this.e;
    }

    public boolean f() {
        String[] arrstring = k.d();
        boolean bl2 = this.b.isEmpty();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public k() {
        this.e = Lists.newArrayList();
        this.f = new BitSet();
        this.b = new BitSet();
        this.d = new BitSet();
        this.a = true;
    }

    public void a(i i2) {
        String[] arrstring = k.d();
        for (int i3 = 0; i3 < this.e.size(); ++i3) {
            this.d.set(i3, i2.f(this.e.get(i3)));
            if (arrstring != null) continue;
        }
    }

    public boolean e() {
        String[] arrstring = k.d();
        boolean bl2 = this.d.isEmpty();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public List<net.minecraft.az.k> a(boolean n2) {
        ArrayList arrayList = Lists.newArrayList();
        int n3 = this.d.nextSetBit(0);
        String[] arrstring = k.d();
        while (n3 >= 0) {
            int n4;
            block5: {
                block6: {
                    n4 = this.b.get(n3);
                    if (arrstring == null) break block5;
                    if (n4 == 0) break block6;
                    n4 = this.f.get(n3);
                    if (arrstring == null) break block5;
                    if (n4 == n2) {
                        arrayList.add(this.e.get(n3));
                    }
                }
                n4 = this.d.nextSetBit(n3 + 1);
            }
            n3 = n4;
            if (arrstring != null) continue;
        }
        return arrayList;
    }

    /*
     * Exception decompiling
     */
    public void a(d var1_1, int var2_2, int var3_3, i var4_4) {
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

