/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.t;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;
import net.minecraft.t.f;
import net.minecraft.t.m;

public class i {
    private final /* synthetic */ int[] a;
    private /* synthetic */ int g;
    private /* synthetic */ List<Boolean> e;
    private /* synthetic */ RandomAccessFile b;
    private final /* synthetic */ int[] f;
    private static final /* synthetic */ byte[] h;
    private final /* synthetic */ File d;
    private /* synthetic */ long c;

    @Nullable
    public DataOutputStream c(int n2, int n3) {
        return this.d(n2, n3) ? null : new DataOutputStream(new BufferedOutputStream(new DeflaterOutputStream(new m(this, n2, n3))));
    }

    public boolean b(int n2, int n3) {
        int n4 = net.minecraft.t.f.d();
        boolean bl2 = this.e(n2, n3);
        if (n4 != 0) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    public synchronized DataInputStream a(int var1_1, int var2_2) {
        block14: {
            var3_3 = net.minecraft.t.f.e();
            v0 = this.d(var1_1, var2_2);
            if (var3_3 != 0) ** GOTO lbl8
            if (v0 != 0) {
                return null;
            }
            try {
                v0 = this.e(var1_1, var2_2);
lbl8:
                // 2 sources

                v1 = var4_4 = v0;
                if (var3_3 == 0) {
                    if (v1 == 0) {
                        return null;
                    }
                    v1 = var4_4 >> 8;
                }
                var5_6 = v1;
                var6_7 = var4_4 & 255;
                v2 = var5_6 + var6_7;
                if (var3_3 == 0) {
                    if (v2 > this.e.size()) {
                        return null;
                    }
                    this.b.seek(var5_6 * 4096);
                    v2 = this.b.readInt();
                }
                v3 = var7_8 = v2;
                if (var3_3 != 0) ** GOTO lbl29
                if (v3 <= 4096 * var6_7) ** GOTO lbl28
            }
            catch (IOException var4_5) {
                return null;
            }
            return null;
lbl28:
            // 1 sources

            v3 = var7_8;
lbl29:
            // 2 sources

            if (var3_3 != 0) ** GOTO lbl34
            if (v3 > 0) ** GOTO lbl33
            return null;
lbl33:
            // 1 sources

            v3 = this.b.readByte();
lbl34:
            // 2 sources

            v4 = var8_9 = v3;
            v5 = 1;
            if (var3_3 != 0) ** GOTO lbl45
            if (v4 != v5) ** GOTO lbl43
            var9_10 = new byte[var7_8 - 1];
            this.b.read(var9_10);
            return new DataInputStream(new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(var9_10))));
lbl43:
            // 1 sources

            v4 = var8_9;
            v5 = 2;
lbl45:
            // 2 sources

            if (var3_3 != 0) break block14;
            if (v4 != v5) return null;
            v4 = var7_8;
            v5 = 1;
        }
        var9_11 = new byte[v4 - v5];
        this.b.read(var9_11);
        return new DataInputStream(new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(var9_11))));
    }

    /*
     * Exception decompiling
     */
    public i(File var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[TRYBLOCK]], but top level block is 16[WHILELOOP]
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

    static {
        h = new byte[4096];
    }

    private void b(int n2, int n3, int n4) throws IOException {
        this.f[n2 + n3 * 32] = n4;
        this.b.seek((n2 + n3 * 32) * 4);
        this.b.writeInt(n4);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Exception decompiling
     */
    protected synchronized void a(int var1_1, int var2_2, byte[] var3_3, int var4_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[TRYBLOCK]], but top level block is 24[FORLOOP]
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean d(int n2, int n3) {
        int n4 = net.minecraft.t.f.d();
        int n5 = n2;
        if (n4 == 0) return n5 != 0;
        if (n5 < 0) return 1 != 0;
        n5 = n2;
        if (n4 == 0) return n5 != 0;
        if (n5 >= 32) return 1 != 0;
        n5 = n3;
        if (n4 == 0) return n5 != 0;
        if (n5 < 0) return 1 != 0;
        n5 = n3;
        if (n4 == 0) return n5 != 0;
        if (n5 < 32) return 0 != 0;
        return 1 != 0;
    }

    private void a(int n2, byte[] arrby, int n3) throws IOException {
        this.b.seek(n2 * 4096);
        this.b.writeInt(n3 + 1);
        this.b.writeByte(2);
        this.b.write(arrby, 0, n3);
    }

    private void a(int n2, int n3, int n4) throws IOException {
        this.a[n2 + n3 * 32] = n4;
        this.b.seek(4096 + (n2 + n3 * 32) * 4);
        this.b.writeInt(n4);
    }

    private int e(int n2, int n3) {
        return this.f[n2 + n3 * 32];
    }

    public void a() throws IOException {
        block3: {
            RandomAccessFile randomAccessFile;
            block2: {
                int n2 = net.minecraft.t.f.d();
                randomAccessFile = this.b;
                if (n2 == 0) break block2;
                if (randomAccessFile == null) break block3;
                randomAccessFile = this.b;
            }
            randomAccessFile.close();
        }
    }
}

