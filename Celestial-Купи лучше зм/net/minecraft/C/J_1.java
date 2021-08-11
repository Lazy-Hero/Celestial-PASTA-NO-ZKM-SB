/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net.minecraft.C;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.io.IOException;
import net.minecraft.C.D;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.C.p;
import net.minecraft.C.u;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class J
extends MessageToByteEncoder<K<?>> {
    private static final /* synthetic */ Logger b;
    private static final /* synthetic */ Marker c;
    private final /* synthetic */ D a;

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    static {
        b = LogManager.getLogger();
        c = MarkerManager.getMarker((String)"PACKET_SENT", (Marker)u.c);
    }

    protected void a(ChannelHandlerContext channelHandlerContext, K<?> k2, ByteBuf byteBuf) throws Exception {
        Integer n2;
        block9: {
            Logger logger;
            block8: {
                p p2 = (p)((Object)channelHandlerContext.channel().attr(u.d).get());
                int n3 = m.b();
                p p3 = p2;
                if (n3 == 0) {
                    if (p3 == null) {
                        throw new RuntimeException("ConnectionProtocol unknown: " + k2);
                    }
                    p3 = p2;
                }
                n2 = p3.a(this.a, k2);
                logger = b;
                if (n3 != 0) break block8;
                if (!logger.isDebugEnabled()) break block9;
                logger = b;
            }
            logger.debug(c, "OUT: [{}:{}] {}", channelHandlerContext.channel().attr(u.d).get(), (Object)n2, (Object)k2.getClass().getName());
        }
        if (n2 == null) {
            throw new IOException("Can't serialize unregistered packet");
        }
        m m2 = new m(byteBuf);
        m2.d(n2);
        try {
            k2.b(m2);
        }
        catch (Throwable throwable) {
            b.error((Object)throwable);
        }
    }

    public J(D d10) {
        this.a = d10;
    }
}

