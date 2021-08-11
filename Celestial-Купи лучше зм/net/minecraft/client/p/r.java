/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.Optional
 *  com.google.common.base.Predicate
 *  com.google.common.base.Splitter
 */
package net.minecraft.client.p;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.client.p.l;
import net.minecraft.client.p.m;

public class r
implements m {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private static final /* synthetic */ Splitter c;

    private Predicate<i> a(a<?> a10, String string) {
        Optional<?> optional = a10.a(string);
        if (!optional.isPresent()) {
            throw new RuntimeException(this + ": has an unknown value: " + this.d);
        }
        return new l(this, a10, optional);
    }

    static Predicate a(r r2, a a10, String string) {
        return r2.a(a10, string);
    }

    /*
     * Exception decompiling
     */
    @Override
    public Predicate<i> a(c var1_1) {
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

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("key", (Object)this.e).add("value", (Object)this.d).toString();
    }

    public r(String string, String string2) {
        this.e = string;
        this.d = string2;
    }

    static {
        c = Splitter.on((char)'|').omitEmptyStrings();
    }
}

