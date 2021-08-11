/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.io.IOException;
import java.util.List;
import net.minecraft.C.D;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.C.p;
import net.minecraft.C.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class l
extends ByteToMessageDecoder {
    private static final /* synthetic */ Logger b;
    private final /* synthetic */ D a;
    private static final /* synthetic */ Marker c;

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        block6: {
            Logger logger;
            K<?> k2;
            int n2;
            block8: {
                int n3;
                block7: {
                    int n4 = m.h();
                    if (byteBuf.readableBytes() == 0) break block6;
                    m m2 = new m(byteBuf);
                    n2 = m2.a();
                    K<?> k3 = k2 = ((p)((Object)channelHandlerContext.channel().attr(u.d).get())).a(this.a, n2);
                    if (n4 != 0) {
                        if (k3 == null) {
                            throw new IOException("Bad packet id " + n2);
                        }
                        k3 = k2;
                    }
                    k3.a(m2);
                    n3 = m2.readableBytes();
                    if (n4 == 0) break block7;
                    if (n3 > 0) {
                        throw new IOException("Packet " + ((p)((Object)channelHandlerContext.channel().attr(u.d).get())).a() + "/" + n2 + " (" + k2.getClass().getSimpleName() + ") was larger than I expected, found " + m2.readableBytes() + " bytes extra whilst reading packet " + n2);
                    }
                    list.add(k2);
                    logger = b;
                    if (n4 == 0) break block8;
                    n3 = logger.isDebugEnabled() ? 1 : 0;
                }
                if (n3 == 0) break block6;
                logger = b;
            }
            logger.debug(c, " IN: [{}:{}] {}", channelHandlerContext.channel().attr(u.d).get(), (Object)n2, (Object)k2.getClass().getName());
        }
    }

    public l(D d10) {
        this.a = d10;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        b = LogManager.getLogger();
        c = MarkerManager.getMarker((String)"PACKET_RECEIVED", (Marker)u.c);
    }
}

