/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.bootstrap.ServerBootstrap
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.epoll.Epoll
 *  io.netty.channel.epoll.EpollEventLoopGroup
 *  io.netty.channel.epoll.EpollServerSocketChannel
 *  io.netty.channel.local.LocalAddress
 *  io.netty.channel.local.LocalEventLoopGroup
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.nio.NioEventLoopGroup
 *  io.netty.channel.socket.nio.NioServerSocketChannel
 *  io.netty.util.concurrent.GenericFutureListener
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.C;

import com.google.common.collect.Lists;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.local.LocalAddress;
import io.netty.channel.local.LocalEventLoopGroup;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.concurrent.GenericFutureListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.C.V;
import net.minecraft.C.e;
import net.minecraft.C.f;
import net.minecraft.C.g;
import net.minecraft.C.m;
import net.minecraft.C.n;
import net.minecraft.C.u;
import net.minecraft.C.w;
import net.minecraft.C.z;
import net.minecraft.Q.ak;
import net.minecraft.R.b;
import net.minecraft.ar.Z;
import net.minecraft.at.k;
import net.minecraft.c.l;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class G {
    private final /* synthetic */ b e;
    public static final /* synthetic */ net.minecraft.ar.l<NioEventLoopGroup> b;
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ List<u> f;
    public static final /* synthetic */ net.minecraft.ar.l<EpollEventLoopGroup> c;
    private final /* synthetic */ List<ChannelFuture> g;
    public static final /* synthetic */ net.minecraft.ar.l<LocalEventLoopGroup> d;
    public volatile /* synthetic */ boolean h;

    static {
        a = LogManager.getLogger();
        b = new e();
        c = new f();
        d = new g();
    }

    public void b() {
        this.h = false;
        Iterator<ChannelFuture> iterator = this.g.iterator();
        int n2 = m.h();
        while (iterator.hasNext()) {
            ChannelFuture channelFuture = iterator.next();
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException interruptedException) {
                a.error("Interrupted whilst closing channel");
            }
            if (n2 != 0) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static b a(G g10) {
        return g10.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List<u> list = this.f;
        synchronized (list) {
            block18: {
                int n2 = m.h();
                Iterator<u> iterator = this.f.iterator();
                while (iterator.hasNext()) {
                    block19: {
                        u u2;
                        block21: {
                            boolean bl2;
                            u u3;
                            block20: {
                                u3 = iterator.next();
                                if (n2 == 0) break block18;
                                bl2 = u3.f();
                                if (n2 == 0) break block20;
                                if (bl2) break block19;
                                u2 = u3;
                                if (n2 == 0) break block21;
                                bl2 = u2.j();
                            }
                            if (bl2) {
                                try {
                                    u3.i();
                                    break block19;
                                }
                                catch (Exception exception) {
                                    Object object;
                                    if (n2 != 0) {
                                        if (u3.k()) {
                                            object = net.minecraft.c.f.a(exception, "Ticking memory connection");
                                            l l2 = ((net.minecraft.c.f)object).a("Ticking connection");
                                            l2.a("Connection", new n(this, u3));
                                            throw new Z((net.minecraft.c.f)object);
                                        }
                                        a.warn("Failed to handle packet for {}", (Object)u3.a(), (Object)exception);
                                    }
                                    object = new net.minecraft.at.g("Internal server error");
                                    u3.a(new ak((k)object), new V(this, u3, (net.minecraft.at.g)object), new GenericFutureListener[0]);
                                    u3.c();
                                    if (n2 != 0) break block19;
                                }
                            }
                            iterator.remove();
                            u2 = u3;
                        }
                        u2.e();
                    }
                    if (n2 != 0) continue;
                    break;
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public SocketAddress d() {
        ChannelFuture channelFuture;
        List<ChannelFuture> list = this.g;
        synchronized (list) {
            channelFuture = ((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(LocalServerChannel.class)).childHandler((ChannelHandler)new w(this)).group((EventLoopGroup)b.b()).localAddress((SocketAddress)LocalAddress.ANY)).bind().syncUninterruptibly();
            this.g.add(channelFuture);
        }
        return channelFuture.channel().localAddress();
    }

    public b a() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(InetAddress inetAddress, int n2) throws IOException {
        List<ChannelFuture> list = this.g;
        synchronized (list) {
            net.minecraft.ar.l<NioEventLoopGroup> l2;
            Class<NioServerSocketChannel> class_;
            block8: {
                block7: {
                    boolean bl2;
                    int n3;
                    block6: {
                        n3 = m.h();
                        bl2 = Epoll.isAvailable();
                        if (n3 == 0) break block6;
                        if (!bl2) break block7;
                        bl2 = this.e.y();
                    }
                    if (!bl2) break block7;
                    class_ = EpollServerSocketChannel.class;
                    l2 = c;
                    a.info("Using epoll channel type");
                    if (n3 != 0) break block8;
                }
                class_ = NioServerSocketChannel.class;
                l2 = b;
                a.info("Using default channel type");
            }
            this.g.add(((ServerBootstrap)((ServerBootstrap)new ServerBootstrap().channel(class_)).childHandler((ChannelHandler)new z(this)).group((EventLoopGroup)l2.b()).localAddress(inetAddress, n2)).bind().syncUninterruptibly());
            return;
        }
    }

    static List b(G g10) {
        return g10.f;
    }

    public G(b b10) {
        this.g = Collections.synchronizedList(Lists.newArrayList());
        this.f = Collections.synchronizedList(Lists.newArrayList());
        this.e = b10;
        this.h = true;
    }
}

