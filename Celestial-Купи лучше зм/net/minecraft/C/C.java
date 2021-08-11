/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;
import net.minecraft.C.m;

public class C
extends MessageToByteEncoder<ByteBuf> {
    private final /* synthetic */ Deflater a;
    private /* synthetic */ int c;
    private final /* synthetic */ byte[] b;

    private static Exception a(Exception exception) {
        return exception;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) throws Exception {
        block5: {
            int n2;
            int n3;
            m m2;
            int n4;
            block6: {
                block7: {
                    n4 = byteBuf.readableBytes();
                    m2 = new m(byteBuf2);
                    n3 = m.h();
                    n2 = n4;
                    if (n3 == 0) break block6;
                    if (n2 >= this.c) break block7;
                    m2.d(0);
                    m2.writeBytes(byteBuf);
                    if (n3 != 0) break block5;
                }
                n2 = n4;
            }
            byte[] arrby = new byte[n2];
            byteBuf.readBytes(arrby);
            m2.d(arrby.length);
            this.a.setInput(arrby, 0, n4);
            this.a.finish();
            while (!this.a.finished()) {
                int n5 = this.a.deflate(this.b);
                m2.writeBytes(this.b, 0, n5);
                if (n3 != 0) {
                    if (n3 != 0) continue;
                }
                break block5;
            }
            this.a.reset();
        }
    }

    public void a(int n2) {
        this.c = n2;
    }

    public C(int n2) {
        this.b = new byte[8192];
        this.c = n2;
        this.a = new Deflater();
    }
}

