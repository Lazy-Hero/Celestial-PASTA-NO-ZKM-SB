/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.client.o;

import com.google.common.collect.Iterables;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.GenericFutureListener;
import java.nio.charset.StandardCharsets;
import net.minecraft.at.l;
import net.minecraft.client.o.i;
import net.minecraft.client.o.j;
import net.minecraft.client.o.o;
import net.minecraft.k.h;

class r
extends SimpleChannelInboundHandler<ByteBuf> {
    final /* synthetic */ i a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        block10: {
            int[] arrn = j.b();
            super.channelActive(channelHandlerContext);
            int[] arrn2 = arrn;
            ByteBuf byteBuf = Unpooled.buffer();
            try {
                char c10;
                int n2;
                int n3;
                char[] arrc;
                block9: {
                    byteBuf.writeByte(254);
                    byteBuf.writeByte(1);
                    byteBuf.writeByte(250);
                    char[] arrc2 = "MC|PingHost".toCharArray();
                    byteBuf.writeShort(arrc2.length);
                    arrc = arrc2;
                    n3 = arrc.length;
                    for (n2 = 0; n2 < n3; ++n2) {
                        c10 = arrc[n2];
                        byteBuf.writeChar((int)c10);
                        if (arrn2 != null) {
                            if (arrn2 != null) continue;
                        }
                        break block9;
                    }
                    byteBuf.writeShort(7 + 2 * this.a.b.a().length());
                    byteBuf.writeByte(127);
                    arrc2 = this.a.b.a().toCharArray();
                    byteBuf.writeShort(arrc2.length);
                    arrc = arrc2;
                    n3 = arrc.length;
                }
                for (n2 = 0; n2 < n3; ++n2) {
                    c10 = arrc[n2];
                    byteBuf.writeChar((int)c10);
                    if (arrn2 != null) {
                        if (arrn2 != null) continue;
                    }
                    break block10;
                }
                byteBuf.writeInt(this.a.b.b());
                channelHandlerContext.channel().writeAndFlush((Object)byteBuf).addListener((GenericFutureListener)ChannelFutureListener.CLOSE_ON_FAILURE);
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        channelHandlerContext.close();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    r(i i2) {
        this.a = i2;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {
        block4: {
            block5: {
                short s2 = byteBuf.readUnsignedByte();
                int[] arrn = j.b();
                if (arrn == null) break block4;
                if (s2 != 255) break block5;
                String string = new String(byteBuf.readBytes(byteBuf.readShort() * 2).array(), StandardCharsets.UTF_16BE);
                String[] arrstring = (String[])Iterables.toArray((Iterable)o.d().split((CharSequence)string), String.class);
                if (arrn == null) break block4;
                if ("\u00a71".equals(arrstring[0])) {
                    int n2 = h.a(arrstring[1], 0);
                    String string2 = arrstring[2];
                    String string3 = arrstring[3];
                    int n3 = h.a(arrstring[4], -1);
                    int n4 = h.a(arrstring[5], -1);
                    this.a.a.g = -1;
                    this.a.a.i = string2;
                    this.a.a.k = string3;
                    this.a.a.j = (Object)((Object)l.GRAY) + "" + n3 + "" + (Object)((Object)l.DARK_GRAY) + "/" + (Object)((Object)l.GRAY) + n4;
                }
            }
            channelHandlerContext.close();
        }
    }
}

