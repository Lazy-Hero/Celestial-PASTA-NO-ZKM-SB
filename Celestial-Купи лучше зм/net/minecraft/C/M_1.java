/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import net.minecraft.C.m;

@ChannelHandler.Sharable
public class M
extends MessageToByteEncoder<ByteBuf> {
    private static Exception a(Exception exception) {
        return exception;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        int n2 = byteBuf.readableBytes();
        int n3 = m.a(n2);
        if (n3 > 3) {
            throw new IllegalArgumentException("unable to fit " + n2 + " into " + 3);
        }
        m m2 = new m(byteBuf2);
        m2.ensureWritable(n3 + n2);
        m2.d(n2);
        m2.writeBytes(byteBuf, byteBuf.readerIndex(), n2);
    }
}

