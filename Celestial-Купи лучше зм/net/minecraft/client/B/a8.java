/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.client.D.b;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aL;
import net.minecraft.client.b.au;
import net.minecraft.client.b.q;

class a8
extends aL {
    private final /* synthetic */ Map<String, b> z;
    private final /* synthetic */ List<String> y;
    final /* synthetic */ au x;

    @Override
    protected void c() {
        this.x.n();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        this.x.v.b(true);
        this.x.b(this.x.v, this.z.get(this.y.get(n2)).toString(), this.k / 2, n4 + 1, 0xFFFFFF);
        this.x.v.b(au.a(this.x).c().b());
    }

    @Override
    protected boolean a(int n2) {
        return this.y.get(n2).equals(au.a(this.x).c().a());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void a(int var1_1, boolean var2_2, int var3_3, int var4_4) {
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
    protected int a() {
        return this.d() * 18;
    }

    @Override
    protected int d() {
        return this.y.size();
    }

    public a8(au au2, Q q2) {
        this.x = au2;
        String[] arrstring = net.minecraft.client.b.q.b();
        super(q2, L.h, L.w, 32, L.w - 65 + 4, 18);
        this.y = Lists.newArrayList();
        String[] arrstring2 = arrstring;
        this.z = Maps.newHashMap();
        for (b b10 : au.a(au2).d()) {
            this.z.put(b10.a(), b10);
            this.y.add(b10.a());
            if (arrstring2 != null) continue;
        }
    }
}

