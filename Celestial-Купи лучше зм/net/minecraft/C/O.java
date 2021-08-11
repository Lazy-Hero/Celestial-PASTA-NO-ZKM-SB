/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.C.G;
import net.minecraft.C.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class O
extends ChannelInboundHandlerAdapter {
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ G b;

    private void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        channelHandlerContext.pipeline().firstContext().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE);
    }

    /*
     * Exception decompiling
     */
    public void channelRead(ChannelHandlerContext var1_1, Object var2_2) throws Exception {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 22[CASE]
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

    private ByteBuf a(String string) {
        ByteBuf byteBuf;
        block2: {
            ByteBuf byteBuf2 = Unpooled.buffer();
            int n2 = m.b();
            byteBuf2.writeByte(255);
            char[] arrc = string.toCharArray();
            byteBuf2.writeShort(arrc.length);
            char[] arrc2 = arrc;
            int n3 = arrc2.length;
            int n4 = n2;
            for (int i2 = 0; i2 < n3; ++i2) {
                char c10 = arrc2[i2];
                byteBuf = byteBuf2.writeChar((int)c10);
                if (n4 == 0) {
                    if (n4 == 0) continue;
                }
                break block2;
            }
            byteBuf = byteBuf2;
        }
        return byteBuf;
    }

    public O(G g10) {
        this.b = g10;
    }

    static {
        a = LogManager.getLogger();
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

