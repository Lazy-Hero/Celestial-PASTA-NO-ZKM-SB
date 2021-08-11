/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import java.util.zip.Inflater;
import net.minecraft.C.m;

public class Q
extends ByteToMessageDecoder {
    private final /* synthetic */ Inflater b;
    private /* synthetic */ int a;

    private static Exception a(Exception exception) {
        return exception;
    }

    public Q(int n2) {
        this.a = n2;
        this.b = new Inflater();
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        block5: {
            int n2;
            int n3;
            m m2;
            block9: {
                int n4;
                block8: {
                    int n5;
                    block6: {
                        block7: {
                            n5 = m.b();
                            if (byteBuf.readableBytes() == 0) break block5;
                            m2 = new m(byteBuf);
                            n2 = n3 = m2.a();
                            if (n5 != 0) break block6;
                            if (n2 != 0) break block7;
                            list.add((Object)m2.readBytes(m2.readableBytes()));
                            if (n5 == 0) break block5;
                        }
                        n2 = n3;
                    }
                    n4 = this.a;
                    if (n5 != 0) break block8;
                    if (n2 < n4) {
                        throw new DecoderException("Badly compressed packet - size of " + n3 + " is below server threshold of " + this.a);
                    }
                    n2 = n3;
                    if (n5 != 0) break block9;
                    n4 = 0x200000;
                }
                if (n2 > n4) {
                    throw new DecoderException("Badly compressed packet - size of " + n3 + " is larger than protocol maximum of " + 0x200000);
                }
                n2 = m2.readableBytes();
            }
            byte[] arrby = new byte[n2];
            m2.readBytes(arrby);
            this.b.setInput(arrby);
            byte[] arrby2 = new byte[n3];
            this.b.inflate(arrby2);
            list.add((Object)Unpooled.wrappedBuffer((byte[])arrby2));
            this.b.reset();
        }
    }

    public void a(int n2) {
        this.a = n2;
    }
}

