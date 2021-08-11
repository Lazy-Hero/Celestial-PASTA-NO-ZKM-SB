/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import net.minecraft.C.m;

public class R
extends ByteToMessageDecoder {
    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int n2 = m.b();
        byteBuf.markReaderIndex();
        int n3 = n2;
        byte[] arrby = new byte[3];
        int n4 = 0;
        while (n4 < arrby.length) {
            block10: {
                block11: {
                    block7: {
                        int n5;
                        m m2;
                        block8: {
                            int n6;
                            block9: {
                                n6 = byteBuf.isReadable();
                                if (n3 != 0) break block9;
                                if (n6 == 0) {
                                    byteBuf.resetReaderIndex();
                                    return;
                                }
                                arrby[n4] = byteBuf.readByte();
                                if (n3 != 0) break block10;
                                n6 = arrby[n4];
                            }
                            if (n6 < 0) break block11;
                            m2 = new m(Unpooled.wrappedBuffer((byte[])arrby));
                            int n7 = m2.a();
                            n5 = byteBuf.readableBytes();
                            if (n3 != 0) break block7;
                            if (n5 < n7) break block8;
                            list.add((Object)byteBuf.readBytes(n7));
                            return;
                        }
                        byteBuf.resetReaderIndex();
                        n5 = m2.release() ? 1 : 0;
                        break block7;
                        finally {
                            m2.release();
                        }
                    }
                    return;
                }
                ++n4;
            }
            if (n3 == 0) continue;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }
}

