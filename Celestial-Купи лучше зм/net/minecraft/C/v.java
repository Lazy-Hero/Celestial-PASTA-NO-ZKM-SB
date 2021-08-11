/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;
import net.minecraft.C.m;

public class v {
    private /* synthetic */ byte[] b;
    private final /* synthetic */ Cipher c;
    private /* synthetic */ byte[] a;

    protected v(Cipher cipher) {
        this.a = new byte[0];
        this.b = new byte[0];
        this.c = cipher;
    }

    private byte[] a(ByteBuf byteBuf) {
        int n2 = byteBuf.readableBytes();
        int n3 = m.b();
        byte[] arrby = this.a;
        if (n3 == 0) {
            if (arrby.length < n2) {
                this.a = new byte[n2];
            }
            byteBuf.readBytes(this.a, 0, n2);
            arrby = this.a;
        }
        return arrby;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void a(ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException {
        int n2 = byteBuf.readableBytes();
        byte[] arrby = this.a(byteBuf);
        int n3 = this.c.getOutputSize(n2);
        int n4 = m.b();
        if (n4 == 0) {
            if (this.b.length < n3) {
                this.b = new byte[n3];
            }
            byteBuf2.writeBytes(this.b, 0, this.c.update(arrby, 0, n2, this.b));
        }
    }

    protected ByteBuf a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws ShortBufferException {
        int n2 = byteBuf.readableBytes();
        byte[] arrby = this.a(byteBuf);
        ByteBuf byteBuf2 = channelHandlerContext.alloc().heapBuffer(this.c.getOutputSize(n2));
        byteBuf2.writerIndex(this.c.update(arrby, 0, n2, byteBuf2.array(), byteBuf2.arrayOffset()));
        return byteBuf2;
    }
}

