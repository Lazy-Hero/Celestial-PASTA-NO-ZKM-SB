/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.k.n;

public class aO {
    private static /* synthetic */ cO[] a;

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        a = new cO[0];
    }

    /*
     * Exception decompiling
     */
    public static void a() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 23[WHILELOOP]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
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

    public static P a(n n2, P p2) {
        cO cO2;
        int n3;
        int n4;
        block12: {
            int n5;
            int n6;
            cO cO3;
            String string;
            block11: {
                int n7;
                block10: {
                    c c10 = p2.p();
                    string = K.d();
                    c c11 = c10;
                    if (string == null) {
                        if (c11 == null) {
                            return p2;
                        }
                        c11 = c10;
                    }
                    if ((cO3 = aO.a(c11)) == null) {
                        return p2;
                    }
                    int n8 = cJ.a(p2.b());
                    n6 = fU.a(n2, n8);
                    n4 = 0;
                    n3 = 0;
                    n5 = cO3.a;
                    n7 = 1;
                    if (string != null) break block10;
                    if (n5 > n7) {
                        n4 = n6 & 3;
                    }
                    n5 = cO3.a;
                    if (string != null) break block11;
                    n7 = 2;
                }
                if (n5 == n7) {
                    n4 = n4 / 2 * 2;
                }
                cO2 = cO3;
                if (string != null) break block12;
                n5 = cO2.c ? 1 : 0;
            }
            if (n5 != 0) {
                int n9 = n6 & 4;
                if (string == null) {
                    n9 = n9 != 0 ? 1 : 0;
                }
                n3 = n9;
            }
            cO2 = cO3;
        }
        return cO2.a(p2, n4, n3 != 0);
    }

    public static cO a(c c10) {
        block7: {
            int n2;
            int n3;
            block6: {
                String string = K.d();
                int n4 = c10 instanceof c;
                if (string == null) {
                    if (n4 == 0) {
                        return null;
                    }
                    n4 = c10.h();
                }
                n2 = n3 = n4;
                if (string != null) break block6;
                if (n2 < 0) break block7;
                n2 = n3;
            }
            if (n2 < a.length) {
                cO cO2 = a[n3];
                return cO2;
            }
        }
        return null;
    }
}

