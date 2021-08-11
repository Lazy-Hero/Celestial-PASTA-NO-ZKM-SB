/*
 * Decompiled with CFR 0.150.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import net.minecraft.client.Q;

public class ec {
    public static final /* synthetic */ String c;
    private static /* synthetic */ String b;
    public static final /* synthetic */ String a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String a(String var0, Map var1_1, byte[] var2_2) throws IOException {
        block13: {
            var4_3 = null;
            var3_4 = K.d();
            try {
                var6_5 = new URL(var0);
                var4_3 = (HttpURLConnection)var6_5.openConnection(Q.P().au());
                var4_3.setRequestMethod("POST");
                if (var3_4 == null) {
                    if (var1_1 != null) {
                        for (E var8_7 : var1_1.keySet()) {
                            var9_9 = "" + var1_1.get(var8_7);
                            var4_3.setRequestProperty((String)var8_7, (String)var9_9);
                            if (var3_4 == null) {
                                if (var3_4 == null) continue;
                            }
                            break;
                        }
                    } else {
                        var4_3.setRequestProperty("Content-Type", "text/plain");
                        var4_3.setRequestProperty("Content-Length", "" + var2_2.length);
                        var4_3.setRequestProperty("Content-Language", "en-US");
                        var4_3.setUseCaches(false);
                        var4_3.setDoInput(true);
                        var4_3.setDoOutput(true);
                    }
                }
                var7_6 = var4_3.getOutputStream();
                var7_6.write(var2_2);
                var7_6.flush();
                var7_6.close();
                var8_8 = var4_3.getInputStream();
                var9_9 = new InputStreamReader(var8_8, StandardCharsets.US_ASCII);
                var10_10 = new BufferedReader((Reader)var9_9);
                var11_11 = new StringBuffer();
                while ((var12_12 = var10_10.readLine()) != null) {
                    var11_11.append(var12_12);
                    var11_11.append('\r');
                    if (var3_4 == null) {
                        if (var3_4 == null) continue;
                    }
                    ** GOTO lbl46
                }
            }
            catch (Throwable var13_14) {
                v0 = var4_3;
                if (var3_4 == null) {
                    if (v0 == null) throw var13_14;
                    v0 = var4_3;
                }
                v0.disconnect();
                throw var13_14;
            }
            var10_10.close();
lbl46:
            // 2 sources

            var5_13 = var11_11.toString();
            v1 = var4_3;
            if (var3_4 != null) break block13;
            if (v1 == null) return var5_13;
            v1 = var4_3;
        }
        v1.disconnect();
        return var5_13;
    }

    /*
     * Exception decompiling
     */
    public static byte[] a(String var0) throws IOException {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 9[DOLOOP]
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

    public static synchronized String a() {
        String string;
        block8: {
            block9: {
                String string2 = K.d();
                string = b;
                if (string2 != null) break block8;
                if (string != null) break block9;
                try {
                    boolean bl2 = fU.a(System.getProperty("player.models.local"), false);
                    if (bl2) {
                        File file = Q.P().aJ;
                        File file2 = new File(file, "playermodels");
                        b = file2.toURI().toURL().toExternalForm();
                    }
                }
                catch (Exception exception) {
                    fU.h("" + exception.getClass().getName() + ": " + exception.getMessage());
                }
                string = b;
                if (string2 != null) break block8;
                if (string == null) {
                    b = "http://s.optifine.net";
                }
            }
            string = b;
        }
        return string;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        a = "http://s.optifine.net";
        c = "http://optifine.net";
        b = null;
    }
}

