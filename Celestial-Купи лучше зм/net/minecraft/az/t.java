/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.google.gson.JsonSyntaxException
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.az;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.aG;
import net.minecraft.ar.v;
import net.minecraft.az.a;
import net.minecraft.az.b;
import net.minecraft.az.c;
import net.minecraft.az.e;
import net.minecraft.az.f;
import net.minecraft.az.h;
import net.minecraft.az.i;
import net.minecraft.az.j;
import net.minecraft.az.k;
import net.minecraft.az.l;
import net.minecraft.az.m;
import net.minecraft.az.n;
import net.minecraft.az.p;
import net.minecraft.az.u;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class t {
    private static final /* synthetic */ Logger c;
    private static /* synthetic */ int b;
    public static final /* synthetic */ net.minecraft.b.d<v, k> a;

    public static a2<d> c(net.minecraft.B.m m2, z z2) {
        Object object;
        block8: {
            int n2;
            net.minecraft.k.m[] arrm;
            Object object2;
            block7: {
                object2 = a.iterator();
                arrm = i.b();
                while (object2.hasNext()) {
                    block10: {
                        net.minecraft.B.m m3;
                        k k2;
                        block9: {
                            k k3;
                            k2 = k3 = object2.next();
                            m3 = m2;
                            if (arrm != null) break block9;
                            n2 = k2.a(m3, z2) ? 1 : 0;
                            if (arrm != null) break block7;
                            if (n2 == 0) break block10;
                            k2 = k3;
                            m3 = m2;
                        }
                        return k2.b(m3);
                    }
                    if (arrm == null) continue;
                }
                n2 = m2.e();
            }
            object2 = a2.a(n2, d.m);
            for (int i2 = 0; i2 < ((a2)object2).size(); ++i2) {
                object = object2;
                if (arrm == null) {
                    ((a2)object).set(i2, m2.a(i2));
                    if (arrm == null) continue;
                }
                break block8;
            }
            object = object2;
        }
        return object;
    }

    private static k a(JsonObject jsonObject) {
        String string = aG.f(jsonObject, "type");
        net.minecraft.k.m[] arrm = i.b();
        boolean bl2 = "crafting_shaped".equals(string);
        if (arrm == null) {
            if (bl2) {
                return i.b(jsonObject);
            }
            bl2 = "crafting_shapeless".equals(string);
        }
        if (bl2) {
            return m.a(jsonObject);
        }
        throw new JsonSyntaxException("Invalid or unsupported recipe type '" + string + "'");
    }

    private static JsonParseException a(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    public static void a(String string, k k2) {
        t.a(new v(string), k2);
    }

    static {
        c = LogManager.getLogger();
        a = new net.minecraft.b.d();
    }

    public static void a(v v2, k k2) {
        net.minecraft.k.m[] arrm = i.b();
        net.minecraft.b.d<v, k> d10 = a;
        if (arrm == null) {
            if (d10.a(v2)) {
                throw new IllegalStateException("Duplicate recipe ignored with ID " + v2);
            }
            d10 = a;
        }
        d10.a(b++, v2, k2);
    }

    public static d b(net.minecraft.B.m m2, z z2) {
        Iterator<k> iterator = a.iterator();
        net.minecraft.k.m[] arrm = i.b();
        while (iterator.hasNext()) {
            block4: {
                net.minecraft.B.m m3;
                k k2;
                block3: {
                    k k3;
                    k2 = k3 = iterator.next();
                    m3 = m2;
                    if (arrm != null) break block3;
                    if (!k2.a(m3, z2)) break block4;
                    k2 = k3;
                    m3 = m2;
                }
                return k2.a(m3);
            }
            if (arrm == null) continue;
        }
        return d.m;
    }

    @Nullable
    public static k a(v v2) {
        return a.a(v2);
    }

    @Nullable
    public static k a(int n2) {
        return a.a((v)n2);
    }

    public static boolean a() {
        try {
            t.a("armordye", (k)new u());
            t.a("bookcloning", (k)new f());
            t.a("mapcloning", (k)new b());
            t.a("mapextending", (k)new j());
            t.a("fireworks", (k)new a());
            t.a("repairitem", (k)new n());
            t.a("tippedarrow", (k)new p());
            t.a("bannerduplicate", (k)new l());
            t.a("banneraddpattern", (k)new h());
            t.a("shielddecoration", (k)new c());
            t.a("shulkerboxcoloring", (k)new e());
            return t.b();
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Exception decompiling
     */
    private static boolean b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[TRYBLOCK]
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

    public static int a(k k2) {
        return a.c(k2);
    }

    @Nullable
    public static k a(net.minecraft.B.m m2, z z2) {
        Iterator<k> iterator = a.iterator();
        net.minecraft.k.m[] arrm = i.b();
        while (iterator.hasNext()) {
            block4: {
                k k2;
                block3: {
                    k k3;
                    k2 = k3 = iterator.next();
                    if (arrm != null) break block3;
                    if (!k2.a(m2, z2)) break block4;
                    k2 = k3;
                }
                return k2;
            }
            if (arrm == null) continue;
        }
        return null;
    }
}

