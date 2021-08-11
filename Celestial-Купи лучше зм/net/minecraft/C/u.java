/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.EventLoop
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.AttributeKey
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.ArrayUtils
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.Marker
 *  org.apache.logging.log4j.MarkerManager
 */
package net.minecraft.C;

import com.google.common.collect.Queues;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoop;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.AttributeKey;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.crypto.SecretKey;
import net.minecraft.C.B;
import net.minecraft.C.C;
import net.minecraft.C.D;
import net.minecraft.C.F;
import net.minecraft.C.K;
import net.minecraft.C.Q;
import net.minecraft.C.S;
import net.minecraft.C.T;
import net.minecraft.C.U;
import net.minecraft.C.W;
import net.minecraft.C.b;
import net.minecraft.C.c;
import net.minecraft.C.d;
import net.minecraft.C.m;
import net.minecraft.C.o;
import net.minecraft.C.p;
import net.minecraft.C.y;
import net.minecraft.ar.ao;
import net.minecraft.ar.l;
import net.minecraft.at.h;
import net.minecraft.at.k;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class u
extends SimpleChannelInboundHandler<K<?>> {
    public static final /* synthetic */ l<NioEventLoopGroup> i;
    public static final /* synthetic */ l<LocalEventLoopGroup> n;
    private /* synthetic */ Channel h;
    private final /* synthetic */ ReentrantReadWriteLock j;
    private final /* synthetic */ D p;
    public static final /* synthetic */ Marker c;
    public static final /* synthetic */ Marker a;
    private static final /* synthetic */ Logger o;
    private /* synthetic */ boolean k;
    private /* synthetic */ W b;
    private /* synthetic */ k l;
    public static final /* synthetic */ l<EpollEventLoopGroup> m;
    private /* synthetic */ SocketAddress f;
    private /* synthetic */ boolean e;
    private final /* synthetic */ Queue<T> g;
    public static final /* synthetic */ AttributeKey<p> d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean k() {
        int n2 = net.minecraft.C.m.b();
        boolean bl2 = this.h instanceof LocalChannel;
        if (n2 != 0) return bl2;
        if (bl2) return true;
        bl2 = this.h instanceof LocalServerChannel;
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    static Channel a(u u2) {
        return u2.h;
    }

    public void c() {
        this.h.config().setAutoRead(false);
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelActive(channelHandlerContext);
        this.h = channelHandlerContext.channel();
        this.f = this.h.remoteAddress();
        try {
            this.a(net.minecraft.C.p.HANDSHAKING);
        }
        catch (Throwable throwable) {
            o.fatal((Object)throwable);
        }
    }

    public k g() {
        return this.l;
    }

    private void h() {
        block6: {
            u u2;
            int n2;
            block8: {
                Channel channel;
                block7: {
                    n2 = net.minecraft.C.m.h();
                    channel = this.h;
                    if (n2 == 0) break block7;
                    if (channel == null) break block6;
                    u2 = this;
                    if (n2 == 0) break block8;
                    channel = u2.h;
                }
                if (!channel.isOpen()) break block6;
                u2 = this;
            }
            u2.j.readLock().lock();
            try {
                while (!this.g.isEmpty()) {
                    T t2 = this.g.poll();
                    this.a(T.a(t2), T.b(t2));
                    if (n2 != 0 && n2 != 0) continue;
                    break;
                }
            }
            finally {
                this.j.readLock().unlock();
            }
        }
    }

    public static u a(InetAddress inetAddress, int n2, boolean bl2) {
        l<NioEventLoopGroup> l2;
        Class<NioSocketChannel> class_;
        u u2;
        block4: {
            block3: {
                boolean bl3;
                int n3;
                block2: {
                    u2 = new u(D.CLIENTBOUND);
                    n3 = net.minecraft.C.m.b();
                    bl3 = Epoll.isAvailable();
                    if (n3 != 0) break block2;
                    if (!bl3) break block3;
                    bl3 = bl2;
                }
                if (!bl3) break block3;
                class_ = EpollSocketChannel.class;
                l2 = m;
                if (n3 == 0) break block4;
            }
            class_ = NioSocketChannel.class;
            l2 = i;
        }
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)l2.b())).handler((ChannelHandler)new B(u2))).channel(class_)).connect(inetAddress, n2).syncUninterruptibly();
        return u2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @SafeVarargs
    public final void a(K<?> k2, GenericFutureListener<? extends Future<? super Void>> genericFutureListener, GenericFutureListener<? extends Future<? super Void>> ... arrgenericFutureListener) {
        block5: {
            boolean bl2;
            block6: {
                int n2 = net.minecraft.C.m.h();
                bl2 = this.j();
                if (n2 == 0) break block5;
                if (!bl2) break block6;
                this.h();
                this.a(k2, (GenericFutureListener[])ArrayUtils.add((Object[])arrgenericFutureListener, (int)0, genericFutureListener));
                if (n2 != 0) break block5;
            }
            this.j.writeLock().lock();
            try {
                bl2 = this.g.add(new T(k2, (GenericFutureListener[])ArrayUtils.add((Object[])arrgenericFutureListener, (int)0, genericFutureListener)));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }

    private void a(K<?> k2, @Nullable GenericFutureListener<? extends Future<? super Void>>[] arrgenericFutureListener) {
        block13: {
            EventLoop eventLoop;
            p p2;
            p p3;
            block11: {
                block12: {
                    int n2;
                    block10: {
                        block9: {
                            p3 = net.minecraft.C.p.a(k2);
                            n2 = net.minecraft.C.m.h();
                            p2 = (p)((Object)this.h.attr(d).get());
                            if (n2 == 0) break block9;
                            if (p2 == p3) break block10;
                            o.debug("Disabled auto read");
                        }
                        this.h.config().setAutoRead(false);
                    }
                    eventLoop = this.h.eventLoop();
                    if (n2 == 0) break block11;
                    if (!eventLoop.inEventLoop()) break block12;
                    if (p3 != p2) {
                        this.a(p3);
                    }
                    ChannelFuture channelFuture = this.h.writeAndFlush(k2);
                    if (n2 != 0) {
                        if (arrgenericFutureListener != null) {
                            channelFuture.addListeners(arrgenericFutureListener);
                        }
                        channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
                    }
                    if (n2 != 0) break block13;
                }
                eventLoop = this.h.eventLoop();
            }
            eventLoop.execute((Runnable)new o(this, p3, p2, k2, arrgenericFutureListener));
        }
    }

    public void i() {
        int n2 = net.minecraft.C.m.h();
        this.h();
        int n3 = n2;
        u u2 = this;
        if (n3 != 0) {
            if (u2.b instanceof ao) {
                ((ao)((Object)this.b)).c();
            }
            u2 = this;
        }
        Channel channel = u2.h;
        if (n3 != 0 && channel != null) {
            channel = this.h.flush();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j() {
        int n2 = net.minecraft.C.m.b();
        Channel channel = this.h;
        if (n2 == 0) {
            if (channel == null) return false;
            channel = this.h;
        }
        boolean bl2 = channel.isOpen();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    protected void a(ChannelHandlerContext channelHandlerContext, K<?> k2) throws Exception {
        fz fz2 = new fz(k2);
        int n2 = net.minecraft.C.m.h();
        af.a(fz2);
        int n3 = n2;
        boolean bl2 = fz2.a();
        if (n3 != 0) {
            if (bl2) {
                return;
            }
            bl2 = this.h.isOpen();
        }
        if (bl2) {
            try {
                k2.a(this.b);
            }
            catch (F f10) {
                // empty catch block
            }
        }
    }

    public void a(W w2) {
        Validate.notNull((Object)w2, (String)"packetListener", (Object[])new Object[0]);
        o.debug("Set listener of {} to {}", (Object)this, (Object)w2);
        this.b = w2;
    }

    public boolean b() {
        return this.e;
    }

    public boolean f() {
        return this.h == null;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public void a(p p2) {
        this.h.attr(d).set((Object)p2);
        this.h.config().setAutoRead(true);
        o.debug("Enabled auto read");
    }

    public W d() {
        return this.b;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        h h2;
        block3: {
            block2: {
                int n2 = net.minecraft.C.m.h();
                if (!(throwable instanceof TimeoutException)) break block2;
                h2 = new h("disconnect.timeout", new Object[0]);
                if (n2 != 0) break block3;
            }
            h2 = new h("disconnect.genericReason", "Internal Exception: " + throwable);
        }
        o.debug(h2.f(), throwable);
        this.a(h2);
    }

    static {
        o = LogManager.getLogger();
        a = MarkerManager.getMarker((String)"NETWORK");
        c = MarkerManager.getMarker((String)"NETWORK_PACKETS", (Marker)a);
        d = AttributeKey.valueOf((String)"protocol");
        i = new b();
        m = new c();
        n = new d();
    }

    public void a(int n2) {
        block15: {
            ChannelHandler channelHandler;
            int n3;
            block16: {
                int n4;
                block8: {
                    block9: {
                        String string;
                        ChannelPipeline channelPipeline;
                        block13: {
                            block14: {
                                block12: {
                                    String string2;
                                    ChannelPipeline channelPipeline2;
                                    block10: {
                                        block11: {
                                            n4 = net.minecraft.C.m.b();
                                            n3 = n2;
                                            if (n4 != 0) break block8;
                                            if (n3 < 0) break block9;
                                            channelPipeline2 = this.h.pipeline();
                                            string2 = "decompress";
                                            if (n4 != 0) break block10;
                                            if (!(channelPipeline2.get(string2) instanceof Q)) break block11;
                                            ((Q)this.h.pipeline().get("decompress")).a(n2);
                                            if (n4 == 0) break block12;
                                        }
                                        channelPipeline2 = this.h.pipeline();
                                        string2 = "decoder";
                                    }
                                    channelPipeline2.addBefore(string2, "decompress", (ChannelHandler)new Q(n2));
                                }
                                channelPipeline = this.h.pipeline();
                                string = "compress";
                                if (n4 != 0) break block13;
                                if (!(channelPipeline.get(string) instanceof C)) break block14;
                                ((C)this.h.pipeline().get("compress")).a(n2);
                                if (n4 == 0) break block15;
                            }
                            channelPipeline = this.h.pipeline();
                            string = "encoder";
                        }
                        channelPipeline.addBefore(string, "compress", (ChannelHandler)new C(n2));
                        if (n4 == 0) break block15;
                    }
                    n3 = this.h.pipeline().get("decompress") instanceof Q;
                }
                if (n4 != 0) break block16;
                if (n3 != 0) {
                    this.h.pipeline().remove("decompress");
                }
                channelHandler = this.h.pipeline().get("compress");
                if (n4 != 0) break block15;
                n3 = channelHandler instanceof C;
            }
            if (n3 != 0) {
                channelHandler = this.h.pipeline().remove("compress");
            }
        }
    }

    public u(D d10) {
        this.g = Queues.newConcurrentLinkedQueue();
        this.j = new ReentrantReadWriteLock();
        this.p = d10;
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.a(new h("disconnect.endOfStream", new Object[0]));
    }

    public SocketAddress a() {
        return this.f;
    }

    public void a(K<?> k2) {
        block7: {
            boolean bl2;
            block8: {
                int n2;
                block10: {
                    f3 f32;
                    block9: {
                        n2 = net.minecraft.C.m.b();
                        bl2 = this.j();
                        if (n2 != 0) break block7;
                        if (!bl2) break block8;
                        f32 = new f3(k2, true);
                        af.a(f32);
                        if (n2 != 0) break block9;
                        if (f32.a()) break block10;
                        this.h();
                    }
                    this.a(f32.d(), null);
                }
                if (n2 == 0) break block7;
            }
            this.j.writeLock().lock();
            try {
                bl2 = this.g.add(new T(k2, new GenericFutureListener[0]));
            }
            finally {
                this.j.writeLock().unlock();
            }
        }
    }

    public static u a(SocketAddress socketAddress) {
        u u2 = new u(D.CLIENTBOUND);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)n.b())).handler((ChannelHandler)new U(u2))).channel(LocalChannel.class)).connect(socketAddress).syncUninterruptibly();
        return u2;
    }

    public void a(k k2) {
        block3: {
            Channel channel;
            block2: {
                int n2 = net.minecraft.C.m.b();
                channel = this.h;
                if (n2 != 0) break block2;
                if (!channel.isOpen()) break block3;
                channel = this.h;
            }
            channel.close().awaitUninterruptibly();
            this.l = k2;
        }
    }

    public void a(SecretKey secretKey) {
        this.e = true;
        this.h.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new S(net.minecraft.ar.B.a(2, secretKey)));
        this.h.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new y(net.minecraft.ar.B.a(1, secretKey)));
    }

    public void e() {
        block3: {
            W w2;
            block9: {
                u u2;
                int n2;
                block7: {
                    block8: {
                        block5: {
                            block6: {
                                boolean bl2;
                                block4: {
                                    Channel channel;
                                    block2: {
                                        n2 = net.minecraft.C.m.h();
                                        channel = this.h;
                                        if (n2 == 0) break block2;
                                        if (channel == null) break block3;
                                        channel = this.h;
                                    }
                                    bl2 = channel.isOpen();
                                    if (n2 == 0) break block4;
                                    if (bl2) break block3;
                                    u2 = this;
                                    if (n2 == 0) break block5;
                                    bl2 = u2.k;
                                }
                                if (!bl2) break block6;
                                o.warn("handleDisconnection() called twice");
                                if (n2 != 0) break block3;
                            }
                            this.k = true;
                            u2 = this;
                        }
                        if (n2 == 0) break block7;
                        if (u2.g() == null) break block8;
                        this.d().a(this.g());
                        if (n2 != 0) break block3;
                    }
                    u2 = this;
                }
                w2 = u2.d();
                if (n2 == 0) break block9;
                if (w2 == null) break block3;
                w2 = this.d();
            }
            w2.a(new h("multiplayer.disconnect.generic", new Object[0]));
        }
    }
}

