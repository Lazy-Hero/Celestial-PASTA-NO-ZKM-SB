/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import com.google.common.base.Predicate;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import net.minecraft.E.B;
import net.minecraft.E.E;
import net.minecraft.E.H;
import net.minecraft.E.I;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.a3;
import net.minecraft.E.f;
import net.minecraft.E.m;
import net.minecraft.E.p;
import net.minecraft.E.r;
import net.minecraft.E.s;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.k.n;

public class a0 {
    private static final /* synthetic */ Splitter v;
    private static final /* synthetic */ String e;
    private static final /* synthetic */ String p;
    private static final /* synthetic */ String z;
    private static final /* synthetic */ String f;
    private static final /* synthetic */ String i;
    private static final /* synthetic */ Set<String> d;
    private static final /* synthetic */ String x;
    private static final /* synthetic */ String m;
    private static final /* synthetic */ String c;
    private static final /* synthetic */ String l;
    private static final /* synthetic */ String t;
    private static final /* synthetic */ String o;
    private static final /* synthetic */ Splitter h;
    private static final /* synthetic */ String b;
    private static final /* synthetic */ String j;
    private static final /* synthetic */ String a;
    private static final /* synthetic */ Pattern s;
    private static final /* synthetic */ String k;
    private static final /* synthetic */ Set<String> u;
    private static final /* synthetic */ String r;
    private static final /* synthetic */ Predicate<String> w;
    private static final /* synthetic */ String n;
    private static final /* synthetic */ String g;
    private static final /* synthetic */ String y;
    private static final /* synthetic */ String q;

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    public static <T extends x> T b(J j2, String string, Class<? extends T> class_) throws s {
        x x2;
        List<T> list = a0.a(j2, string, class_);
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        List<T> list2 = list;
        if (arrm != null) {
            if (list2.size() != 1) {
                x2 = null;
                return (T)x2;
            }
            list2 = list.get(0);
        }
        x2 = (x)((Object)list2);
        return (T)x2;
    }

    public static List<net.minecraft.i.k> c(J j2, String string) throws s {
        return a0.a(j2, string, net.minecraft.i.k.class);
    }

    private static String b(String string) {
        u.add(string);
        return string;
    }

    static Set a() {
        return u;
    }

    private static n a(Map<String, String> map, n n2) {
        return new n(a0.a(map, m, n2.e()), a0.a(map, o, n2.b()), a0.a(map, p, n2.a()));
    }

    @Nullable
    private static String b(Map<String, String> map, String string) {
        return map.get(string);
    }

    public static boolean a(String string) {
        return s.matcher(string).matches();
    }

    /*
     * Exception decompiling
     */
    private static List<Predicate<x>> f(Map<String, String> var0) {
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

    /*
     * Exception decompiling
     */
    private static <T extends x> List<T> a(List<T> var0, Map<String, String> var1_1, J var2_2, Class<? extends T> var3_3, String var4_4, net.minecraft.k.l var5_5) {
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

    /*
     * Exception decompiling
     */
    private static <T extends x> List<T> a(Map<String, String> var0, Class<? extends T> var1_1, List<Predicate<x>> var2_2, String var3_3, z var4_4, n var5_5) {
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Map<String, String> c(@Nullable String var0) throws s {
        var2_1 = Maps.newHashMap();
        var1_2 = net.minecraft.E.s.b();
        if (var0 == null) {
            return var2_1;
        }
        var3_3 = a0.h.split((CharSequence)var0).iterator();
        do {
            if (var3_3.hasNext() == false) return var2_1;
            var4_4 = (String)var3_3.next();
            var5_5 = a0.v.split((CharSequence)var4_4).iterator();
            var6_6 = (String)var5_5.next();
            if (!a0.w.apply((Object)var6_6)) {
                throw new s("commands.generic.selector_argument", new Object[]{var4_4});
            }
            v0 = var5_5;
            if (var1_2 == null) ** GOTO lbl17
            if (v0.hasNext()) {
                v0 = var5_5.next();
lbl17:
                // 2 sources

                v1 = (String)v0;
            } else {
                v1 = "";
            }
            var2_1.put(var6_6, v1);
        } while (var1_2 != null);
        return var2_1;
    }

    private static net.minecraft.k.k a(n n2, int n3, int n4, int n5) {
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        int n6 = n3;
        if (arrm != null) {
            n6 = n6 < 0 ? 1 : 0;
        }
        int n7 = n6;
        int n8 = n4;
        if (arrm != null) {
            n8 = n8 < 0 ? 1 : 0;
        }
        int n9 = n8;
        int n10 = n5;
        if (arrm != null) {
            n10 = n10 < 0 ? 1 : 0;
        }
        int n11 = n10;
        int n12 = n2.e();
        int n13 = n7;
        if (arrm != null) {
            n13 = n13 != 0 ? n3 : 0;
        }
        int n14 = n12 + n13;
        int n15 = n2.b();
        int n16 = n9;
        if (arrm != null) {
            n16 = n16 != 0 ? n4 : 0;
        }
        int n17 = n15 + n16;
        int n18 = n2.a();
        int n19 = n11;
        if (arrm != null) {
            n19 = n19 != 0 ? n5 : 0;
        }
        int n20 = n18 + n19;
        int n21 = n2.e();
        int n22 = n7;
        if (arrm != null) {
            n22 = n22 != 0 ? 0 : n3;
        }
        int n23 = n21 + n22 + 1;
        int n24 = n2.b();
        int n25 = n9;
        if (arrm != null) {
            n25 = n25 != 0 ? 0 : n4;
        }
        int n26 = n24 + n25 + 1;
        int n27 = n2.a();
        int n28 = n11;
        if (arrm != null) {
            n28 = n28 != 0 ? 0 : n5;
        }
        int n29 = n27 + n28 + 1;
        return new net.minecraft.k.k(n14, n17, n20, n23, n26, n29);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static List<Predicate<x>> a(Map<String, String> map, String string) {
        boolean bl2;
        boolean bl3;
        String string2;
        block6: {
            block7: {
                List<Predicate<x>> list;
                block9: {
                    boolean bl4;
                    block8: {
                        String string3;
                        net.minecraft.k.m[] arrm;
                        block4: {
                            block5: {
                                string2 = a0.b(map, f);
                                arrm = net.minecraft.E.s.b();
                                string3 = string2;
                                if (arrm == null) break block4;
                                if (string3 == null) break block5;
                                bl3 = string.equals("e");
                                if (arrm == null) break block6;
                                if (bl3) break block7;
                                bl3 = string.equals("r");
                                if (arrm == null) break block6;
                                if (bl3) break block7;
                                bl3 = string.equals("s");
                                if (arrm == null) break block6;
                                if (bl3) break block7;
                            }
                            string3 = string;
                        }
                        bl4 = string3.equals("e");
                        if (arrm == null) break block8;
                        if (bl4) break block9;
                        bl4 = string.equals("s");
                    }
                    if (!bl4) {
                        list = Collections.singletonList(new p());
                        return list;
                    }
                }
                list = Collections.emptyList();
                return list;
            }
            bl3 = string2.startsWith("!");
        }
        v v2 = new v((bl2 = bl3) ? string2.substring(1) : string2);
        return Collections.singletonList(new f(v2, bl2));
    }

    private static List<Predicate<x>> a(Map<String, String> map) {
        ArrayList arrayList;
        block2: {
            int n2;
            int n3;
            int n4;
            block3: {
                arrayList = Lists.newArrayList();
                net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
                n4 = a0.a(map, e, -1);
                n3 = a0.a(map, t, -1);
                n2 = n4;
                if (arrm == null) break block2;
                if (n2 > -1) break block3;
                n2 = n3;
                if (arrm == null || n2 <= -1) break block2;
            }
            n2 = arrayList.add(new B(n4, n3)) ? 1 : 0;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double a(Map<String, String> map, String string, double d10, boolean bl2) {
        double d11;
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        int n2 = map.containsKey(string);
        if (arrm != null) {
            if (n2 == 0) {
                d11 = d10;
                return d11;
            }
            n2 = net.minecraft.k.h.a(map.get(string), net.minecraft.k.h.f(d10));
        }
        d11 = (double)n2 + (bl2 ? 0.5 : 0.0);
        return d11;
    }

    /*
     * Exception decompiling
     */
    private static List<Predicate<x>> h(Map<String, String> var0) {
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

    private static net.minecraft.k.l a(Map<String, String> map, net.minecraft.k.l l2) {
        return new net.minecraft.k.l(a0.a(map, m, l2.e, true), a0.a(map, o, l2.d, false), a0.a(map, p, l2.b, true));
    }

    /*
     * Exception decompiling
     */
    private static List<Predicate<x>> g(Map<String, String> var0) {
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

    public static <T extends x> List<T> a(J j2, String string, Class<? extends T> class_) throws s {
        block12: {
            boolean bl2;
            net.minecraft.k.m[] arrm;
            Matcher matcher;
            block11: {
                matcher = s.matcher(string);
                arrm = net.minecraft.E.s.b();
                bl2 = matcher.matches();
                if (arrm == null) break block11;
                if (!bl2) break block12;
                bl2 = j2.a(1, "@");
            }
            if (!bl2) break block12;
            Map<String, String> map = a0.c(matcher.group(2));
            if (!a0.c(j2, map)) {
                return Collections.emptyList();
            }
            String string2 = matcher.group(1);
            n n2 = a0.a(map, j2.f());
            net.minecraft.k.l l2 = a0.a(map, j2.h());
            List<z> list = a0.b(j2, map);
            ArrayList arrayList = Lists.newArrayList();
            for (z z2 : list) {
                block13: {
                    boolean bl3;
                    ArrayList arrayList2;
                    block14: {
                        block15: {
                            int n3;
                            x x2;
                            block10: {
                                block19: {
                                    int n4;
                                    int n5;
                                    int n6;
                                    net.minecraft.k.k k2;
                                    int n7;
                                    block17: {
                                        block18: {
                                            block16: {
                                                if (z2 == null) break block13;
                                                arrayList2 = Lists.newArrayList();
                                                arrayList2.addAll(a0.a(map, string2));
                                                arrayList2.addAll(a0.a(map));
                                                arrayList2.addAll(a0.c(map));
                                                arrayList2.addAll(a0.g(map));
                                                arrayList2.addAll(a0.a(j2, map));
                                                arrayList2.addAll(a0.f(map));
                                                arrayList2.addAll(a0.h(map));
                                                arrayList2.addAll(a0.b(map, l2));
                                                arrayList2.addAll(a0.d(map));
                                                bl3 = "s".equalsIgnoreCase(string2);
                                                if (arrm == null) break block13;
                                                if (!bl3) break block14;
                                                x2 = j2.c();
                                                if (x2 == null) break block15;
                                                n7 = class_.isAssignableFrom(x2.getClass());
                                                if (arrm == null) break block16;
                                                if (n7 == 0) break block15;
                                                n7 = map.containsKey(n);
                                            }
                                            if (arrm == null) break block17;
                                            if (n7 != 0) break block18;
                                            n7 = map.containsKey(b);
                                            if (arrm == null) break block17;
                                            if (n7 != 0) break block18;
                                            n7 = map.containsKey(a) ? 1 : 0;
                                            if (arrm == null) break block17;
                                            if (n7 == 0) break block19;
                                        }
                                        n7 = a0.a(map, n, 0);
                                    }
                                    if (!(k2 = a0.a(n2, n6 = n7, n5 = a0.a(map, b, 0), n4 = a0.a(map, a, 0))).c(x2.m())) {
                                        return Collections.emptyList();
                                    }
                                }
                                for (Predicate predicate : arrayList2) {
                                    n3 = predicate.apply((Object)x2) ? 1 : 0;
                                    if (arrm != null) {
                                        if (n3 == 0) {
                                            return Collections.emptyList();
                                        }
                                        if (arrm != null) continue;
                                    }
                                    break block10;
                                }
                                n3 = 1;
                            }
                            Object[] arrobject = new x[n3];
                            arrobject[0] = x2;
                            return Lists.newArrayList((Object[])arrobject);
                        }
                        return Collections.emptyList();
                    }
                    bl3 = arrayList.addAll(a0.a(map, class_, arrayList2, string2, z2, n2));
                }
                if (arrm != null) continue;
            }
            return a0.a(arrayList, map, j2, class_, string2, l2);
        }
        return Collections.emptyList();
    }

    private static int a(Map<String, String> map, String string, int n2) {
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        int n3 = map.containsKey(string);
        if (arrm != null) {
            n3 = n3 != 0 ? net.minecraft.k.h.a(map.get(string), n2) : n2;
        }
        return n3;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static List<Predicate<x>> a(J j2, Map<String, String> map) {
        ArrayList arrayList;
        Map<String, Integer> map2 = a0.b(map);
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        int n2 = map2.isEmpty();
        if (arrm != null) {
            if (n2 != 0) {
                arrayList = Collections.emptyList();
                return arrayList;
            }
            n2 = 1;
        }
        Object[] arrobject = new Predicate[n2];
        arrobject[0] = new a3(j2, map2);
        arrayList = Lists.newArrayList((Object[])arrobject);
        return arrayList;
    }

    private static List<Predicate<x>> b(Map<String, String> map, net.minecraft.k.l l2) {
        double d10;
        double d11;
        double d12;
        double d13;
        block7: {
            double d14;
            block6: {
                d13 = a0.a(map, c, -1);
                net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
                d12 = a0.a(map, q, -1);
                double d15 = d13 - -0.5;
                double d16 = d15 == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                if (arrm != null) {
                    d16 = d16 < 0 ? 1.0 : 0.0;
                }
                d11 = d16;
                double d17 = d12 - -0.5;
                double d18 = d17 == 0.0 ? 0 : (d17 < 0.0 ? -1 : 1);
                if (arrm != null) {
                    d18 = d18 < 0 ? 1.0 : 0.0;
                }
                d10 = d18;
                d14 = d11;
                if (arrm == null) break block6;
                if (d14 == false) break block7;
                d14 = d10;
            }
            if (d14 != false) {
                return Collections.emptyList();
            }
        }
        double d19 = Math.max(d13, 1.0E-4);
        double d20 = d19 * d19;
        double d21 = Math.max(d12, 1.0E-4);
        double d22 = d21 * d21;
        return Lists.newArrayList((Object[])new Predicate[]{new m(l2, (boolean)d11, d20, (boolean)d10, d22)});
    }

    static {
        s = Pattern.compile("^@([pares])(?:\\[([^ ]*)\\])?$");
        h = Splitter.on((char)',').omitEmptyStrings();
        v = Splitter.on((char)'=').limit(2);
        u = Sets.newHashSet();
        q = a0.b("r");
        c = a0.b("rm");
        t = a0.b("l");
        e = a0.b("lm");
        m = a0.b("x");
        o = a0.b("y");
        p = a0.b("z");
        n = a0.b("dx");
        b = a0.b("dy");
        a = a0.b("dz");
        z = a0.b("rx");
        k = a0.b("rxm");
        l = a0.b("ry");
        i = a0.b("rym");
        x = a0.b("c");
        j = a0.b("m");
        y = a0.b("team");
        g = a0.b("name");
        f = a0.b("type");
        r = a0.b("tag");
        w = new r();
        d = Sets.newHashSet((Object[])new String[]{m, o, p, n, b, a, c, q});
    }

    private static List<z> b(J j2, Map<String, String> map) {
        ArrayList arrayList;
        block2: {
            boolean bl2;
            block3: {
                arrayList = Lists.newArrayList();
                net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
                bl2 = a0.e(map);
                if (arrm == null) break block2;
                if (!bl2) break block3;
                arrayList.add(j2.b());
                if (arrm != null) break block2;
            }
            bl2 = Collections.addAll(arrayList, j2.e().S);
        }
        return arrayList;
    }

    private static <T extends x> boolean c(J j2, Map<String, String> map) {
        v v2;
        block5: {
            boolean bl2;
            block4: {
                String string = a0.b(map, f);
                net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
                if (string == null) {
                    return true;
                }
                v2 = new v(string.startsWith("!") ? string.substring(1) : string);
                bl2 = net.minecraft.U.h.b(v2);
                if (arrm == null) break block4;
                if (!bl2) break block5;
                bl2 = true;
            }
            return bl2;
        }
        h h2 = new h("commands.generic.entity.invalidType", v2);
        h2.e().a(net.minecraft.at.l.RED);
        j2.a(h2);
        return false;
    }

    public static Map<String, Integer> b(Map<String, String> map) {
        HashMap hashMap = Maps.newHashMap();
        net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
        for (String string : map.keySet()) {
            block6: {
                Object object;
                int n2;
                block5: {
                    n2 = string.startsWith("score_");
                    if (arrm == null) break block5;
                    if (n2 == 0) break block6;
                    object = string;
                    if (arrm == null) break block6;
                    n2 = ((String)object).length();
                }
                if (n2 > "score_".length()) {
                    object = hashMap.put(string.substring("score_".length()), net.minecraft.k.h.a(map.get(string), 1));
                }
            }
            if (arrm != null) continue;
        }
        return hashMap;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static List<Predicate<x>> c(Map<String, String> var0) {
        var2_1 = Lists.newArrayList();
        var3_2 = a0.b(var0, a0.j);
        var1_3 = net.minecraft.E.s.b();
        v0 = var3_2;
        if (var1_3 != null) {
            if (v0 == null) {
                return var2_1;
            }
            v0 = var3_2;
        }
        var4_4 = v0.startsWith("!");
        v1 = var4_4;
        if (var1_3 == null) ** GOTO lbl16
        if (v1 != 0) {
            var3_2 = var3_2.substring(1);
        }
        try {
            v1 = Integer.parseInt(var3_2);
lbl16:
            // 2 sources

            var6_5 = v1;
            var5_8 = net.minecraft.ah.s.a(var6_5, net.minecraft.ah.s.NOT_SET);
        }
        catch (Throwable var6_6) {
            var5_8 = net.minecraft.ah.s.a(var3_2, net.minecraft.ah.s.NOT_SET);
        }
        var6_7 = var5_8;
        var2_1.add(new H((boolean)var4_4, var6_7));
        return var2_1;
    }

    /*
     * Exception decompiling
     */
    public static boolean d(String var0) throws s {
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

    @Nullable
    public static k b(J j2, String string) throws s {
        ArrayList arrayList;
        block3: {
            List<x> list = a0.a(j2, string, x.class);
            net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = Lists.newArrayList();
            for (x x2 : list) {
                arrayList = arrayList2;
                if (arrm != null) {
                    arrayList.add(x2.d());
                    if (arrm != null) continue;
                }
                break block3;
            }
            arrayList = arrayList2;
        }
        return K.a(arrayList);
    }

    @Nullable
    public static net.minecraft.i.k a(J j2, String string) throws s {
        return a0.b(j2, string, net.minecraft.i.k.class);
    }

    private static List<Predicate<x>> d(Map<String, String> map) {
        ArrayList arrayList;
        block10: {
            int n2;
            int n3;
            int n4;
            block8: {
                block9: {
                    net.minecraft.k.m[] arrm;
                    block6: {
                        block7: {
                            int n5;
                            block4: {
                                block5: {
                                    arrayList = Lists.newArrayList();
                                    arrm = net.minecraft.E.s.b();
                                    n5 = map.containsKey(i);
                                    if (arrm == null) break block4;
                                    if (n5 != 0) break block5;
                                    n4 = map.containsKey(l);
                                    if (arrm == null) break block6;
                                    if (n4 == 0) break block7;
                                }
                                n5 = net.minecraft.k.h.b(a0.a(map, i, 0));
                            }
                            n3 = n5;
                            n2 = net.minecraft.k.h.b(a0.a(map, l, 359));
                            arrayList.add(new I(n3, n2));
                        }
                        n4 = map.containsKey(k);
                    }
                    if (arrm == null) break block8;
                    if (n4 != 0) break block9;
                    n4 = map.containsKey(z);
                    if (arrm == null) break block8;
                    if (n4 == 0) break block10;
                }
                n4 = net.minecraft.k.h.b(a0.a(map, k, 0));
            }
            n3 = n4;
            n2 = net.minecraft.k.h.b(a0.a(map, z, 359));
            arrayList.add(new E(n3, n2));
        }
        return arrayList;
    }

    private static boolean e(Map<String, String> map) {
        boolean bl2;
        block3: {
            Iterator<String> iterator = d.iterator();
            net.minecraft.k.m[] arrm = net.minecraft.E.s.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        String string = iterator.next();
                        bl2 = map.containsKey(string);
                        if (arrm == null) break block3;
                        if (arrm == null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (arrm != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }
}

