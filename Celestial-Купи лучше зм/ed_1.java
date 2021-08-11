/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.b.Y;

public class ed
implements ag {
    public static boolean a(x x2, float f10) {
        double d10 = x2.a - ed.b.s.a;
        double d11 = x2.ax - ed.b.s.ax;
        boolean bl2 = d5.a();
        float f11 = (float)(Math.toDegrees(Math.atan2(d11, d10)) - 90.0);
        double d12 = ed.a(f11, (double)ed.b.s.e);
        double d13 = d12 - (double)f10;
        double d14 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
        if (bl2) {
            d14 = d14 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d14;
    }

    public static B a() {
        ArrayList arrayList;
        block17: {
            boolean bl2;
            ArrayList<B> arrayList2;
            block16: {
                boolean bl3;
                block15: {
                    block13: {
                        Object object;
                        block14: {
                            arrayList2 = new ArrayList<B>();
                            object = ed.b.e.O.iterator();
                            bl3 = d5.a();
                            while (object.hasNext()) {
                                block11: {
                                    float f10;
                                    B b10;
                                    block12: {
                                        x x2;
                                        block10: {
                                            x x3;
                                            x2 = x3 = (x)object.next();
                                            if (!bl3) break block10;
                                            if (!(x2 instanceof B)) break block11;
                                            x2 = x3;
                                        }
                                        b10 = (B)x2;
                                        float f11 = ed.b.s.o(b10) - bn.m.r();
                                        f10 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                        if (!bl3) break block12;
                                        if (f10 >= 0) break block11;
                                        f10 = (float)ed.a(b10);
                                    }
                                    if (bl3 && f10 != false) {
                                        f10 = (float)arrayList2.add(b10);
                                    }
                                }
                                if (bl3) continue;
                            }
                            object = cj.b.f.a("TargetSort Mode").m();
                            bl2 = ((String)object).equalsIgnoreCase("Health");
                            if (!bl3) break block13;
                            if (!bl2) break block14;
                            arrayList2.sort(ed::lambda$getSortEntities$0);
                            if (bl3) break block15;
                        }
                        bl2 = ((String)object).equalsIgnoreCase("Distance");
                    }
                    if (!bl3) break block16;
                    if (bl2) {
                        arrayList2.sort(Comparator.comparingDouble(ed.b.s::o));
                    }
                }
                arrayList = arrayList2;
                if (!bl3) break block17;
                bl2 = arrayList.isEmpty();
            }
            if (bl2) {
                return null;
            }
            arrayList = arrayList2.get(0);
        }
        return (B)((Object)arrayList);
    }

    /*
     * Exception decompiling
     */
    public static boolean a(B var0) {
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

    private static boolean a(B b10, double d10) {
        boolean bl2 = d5.c();
        double d11 = (double)ed.b.s.o(b10) - d10;
        double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (!bl2) {
            d12 = d12 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    public static double a(double d10, double d11) {
        float f10 = (float)(Math.abs(d10 - d11) % 360.0);
        boolean bl2 = d5.a();
        float f11 = f10;
        if (bl2) {
            if (f11 > 180.0f) {
                f10 = 360.0f - f10;
            }
            f11 = f10;
        }
        return f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static void b() {
        var1 = (bn)cj.b.i.a(bn.class);
        var0_1 = d5.a();
        v0 = ed.b.aO instanceof Y;
        if (var0_1) {
            if (v0 != 0) {
                v0 = bn.l.P;
                if (var0_1) {
                    if (v0 != 0) {
                        var1.e();
                        gd.a(var1.a(), "Killaura was toggled off!", 2, gD.SUCCESS);
                        return;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = ed.b.s.H;
            }
        }
        if (v0 > 1) return;
        var1.e();
        gd.a(var1.a(), "Killaura was toggled off!", 2, gD.SUCCESS);
    }

    private static int lambda$getSortEntities$0(B b10, B b11) {
        return (int)(b10.V() - b11.V());
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

