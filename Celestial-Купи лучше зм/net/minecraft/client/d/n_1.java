/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.D;

import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.minecraft.client.D.h;
import net.minecraft.client.D.t;
import net.minecraft.client.D.v;
import org.apache.commons.io.IOUtils;

public class n {
    private static final /* synthetic */ Pattern d;
    private static final /* synthetic */ Splitter b;
    /* synthetic */ Map<String, String> a;
    private /* synthetic */ boolean c;

    public boolean a(String string) {
        return this.a.containsKey(string);
    }

    public boolean a() {
        return this.c;
    }

    public String a(String string, Object[] arrobject) {
        String string2 = this.b(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    /*
     * Exception decompiling
     */
    private void b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[DOLOOP]], but top level block is 4[SIMPLE_IF_TAKEN]
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

    public n() {
        this.a = Maps.newHashMap();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private void a(InputStream inputStream) throws IOException {
        Iterator iterator = IOUtils.readLines((InputStream)inputStream, (Charset)StandardCharsets.UTF_8).iterator();
        boolean bl2 = h.b();
        while (iterator.hasNext()) {
            block4: {
                String[] arrstring;
                String[] arrstring2;
                block6: {
                    block5: {
                        int n2;
                        String string;
                        block3: {
                            string = (String)iterator.next();
                            n2 = string.isEmpty();
                            if (bl2) break block3;
                            if (n2 != 0) break block4;
                            n2 = string.charAt(0);
                        }
                        if (n2 == 35) break block4;
                        arrstring = arrstring2 = (String[])Iterables.toArray((Iterable)b.split((CharSequence)string), String.class);
                        if (bl2) break block5;
                        if (arrstring == null) break block4;
                        arrstring = arrstring2;
                    }
                    if (bl2) break block6;
                    if (arrstring.length != 2) break block4;
                    arrstring = arrstring2;
                }
                String string = arrstring[0];
                String string2 = d.matcher(arrstring2[1]).replaceAll("%$1s");
                this.a.put(string, string2);
            }
            if (!bl2) continue;
        }
    }

    public synchronized void a(t t2, List<String> list) {
        block4: {
            boolean bl2 = h.c();
            this.a.clear();
            boolean bl3 = bl2;
            block2: for (String string : list) {
                String string2 = String.format("lang/%s.lang", string);
                if (!bl3) break block4;
                for (String string3 : t2.a()) {
                    try {
                        this.a(t2.b(new net.minecraft.ar.v(string3, string2)));
                        if (!bl3) continue block2;
                    }
                    catch (IOException iOException) {
                        // empty catch block
                    }
                    if (bl3) continue;
                }
                if (bl3) continue;
            }
            this.b();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(List<v> list) throws IOException {
        Iterator<v> iterator = list.iterator();
        boolean bl2 = h.c();
        while (iterator.hasNext()) {
            v v2 = iterator.next();
            InputStream inputStream = v2.c();
            try {
                this.a(inputStream);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
            if (bl2) continue;
        }
    }

    static {
        b = Splitter.on((char)'=').limit(2);
        d = Pattern.compile("%(\\d+\\$)?[\\d\\.]*[df]");
    }

    private String b(String string) {
        String string2 = this.a.get(string);
        return string2 == null ? string : string2;
    }
}

