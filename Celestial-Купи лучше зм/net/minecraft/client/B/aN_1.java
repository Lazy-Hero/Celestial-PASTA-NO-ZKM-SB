/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ThreadFactoryBuilder
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufInputStream
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.base64.Base64
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.base64.Base64;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.client.E.a;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.av;
import net.minecraft.client.b.q;
import net.minecraft.client.j.d;
import net.minecraft.client.j.f;
import net.minecraft.client.j.p;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aN
implements aJ {
    private /* synthetic */ f b;
    private final /* synthetic */ net.minecraft.ar.v j;
    private static final /* synthetic */ Logger k;
    private /* synthetic */ String i;
    private final /* synthetic */ Q a;
    private /* synthetic */ long c;
    private static final /* synthetic */ ThreadPoolExecutor f;
    private final /* synthetic */ av e;
    private static final /* synthetic */ net.minecraft.ar.v g;
    private final /* synthetic */ a d;
    private static final /* synthetic */ net.minecraft.ar.v h;

    static {
        k = LogManager.getLogger();
        f = new ScheduledThreadPoolExecutor(5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).build());
        g = new net.minecraft.ar.v("textures/misc/unknown_server.png");
        h = new net.minecraft.ar.v("textures/gui/server_selection.png");
    }

    private boolean c() {
        return true;
    }

    static a a(aN aN2) {
        return aN2.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    protected aN(av av2, a a10) {
        this.e = av2;
        this.d = a10;
        this.a = Q.P();
        this.j = new net.minecraft.ar.v("servers/" + a10.h + "/icon");
        this.b = (f)this.a.aN().a(this.j);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean b(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
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
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    /*
     * Exception decompiling
     */
    @Override
    public void a(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6, int var7_7, boolean var8_8, float var9_9) {
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

    public a b() {
        return this.d;
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a() {
        block20: {
            block19: {
                block17: {
                    var1_1 = q.b();
                    v0 = this.d.d();
                    if (var1_1 != null) {
                        if (v0 == null) {
                            this.a.aN().c(this.j);
                            this.b = null;
                            if (var1_1 != null) return;
                        }
                        v0 = this.d.d();
                    }
                    var2_2 = Unpooled.copiedBuffer((CharSequence)v0, (Charset)StandardCharsets.UTF_8);
                    var3_3 = null;
                    var3_3 = Base64.decode((ByteBuf)var2_2);
                    var4_4 = p.a((InputStream)new ByteBufInputStream(var3_3));
                    v1 = var4_4.getWidth();
                    if (var1_1 != null) {
                        v1 = v1 == BADBOOL 64;
                    }
                    Validate.validState((boolean)v1, (String)"Must be 64 pixels wide", (Object[])new Object[0]);
                    v2 = var4_4.getHeight();
                    if (var1_1 == null) break block17;
                    if (v2 != BADBOOL 64) ** GOTO lbl26
                    v2 = true;
                }
                try {
                    block18: {
                        break block18;
lbl26:
                        // 1 sources

                        v2 = false;
                    }
                    Validate.validState((boolean)v2, (String)"Must be 64 pixels high", (Object[])new Object[0]);
                }
                catch (Throwable var5_5) {
                    try {
                        aN.k.error("Invalid icon for server {} ({})", (Object)this.d.c, (Object)this.d.h, (Object)var5_5);
                        this.d.a((String)null);
                    }
                    catch (Throwable var6_6) {
                        var2_2.release();
                        v4 = var3_3;
                        if (var1_1 != null) {
                            if (v4 == null) throw var6_6;
                            v4 = var3_3;
                        }
                        v4.release();
                        throw var6_6;
                    }
                    var2_2.release();
                    v5 = var3_3;
                    if (var1_1 != null) {
                        if (v5 == null) return;
                        v5 = var3_3;
                    }
                    v5.release();
                    return;
                }
                var2_2.release();
                v3 = var3_3;
                if (var1_1 == null) break block19;
                if (v3 == null) break block20;
                v3 = var3_3;
            }
            v3.release();
        }
        v6 = this.b;
        if (var1_1 != null) {
            if (v6 == null) {
                this.b = new f(var4_4.getWidth(), var4_4.getHeight());
                this.a.aN().a(this.j, (d)this.b);
            }
            var4_4.getRGB(0, 0, var4_4.getWidth(), var4_4.getHeight(), this.b.a(), 0, var4_4.getWidth());
            v6 = this.b;
        }
        v6.d();
    }

    protected void a(int n2, int n3, net.minecraft.ar.v v2) {
        this.a.aN().b(v2);
        v.a();
        q.a(n2, n3, 0.0f, 0.0f, 32.0f, 32.0f, 32.0f, 32.0f);
        v.f();
    }

    static av b(aN aN2) {
        return aN2.e;
    }
}

