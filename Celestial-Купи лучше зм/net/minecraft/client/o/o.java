/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.EventLoopGroup
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.o;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandler;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.minecraft.C.p;
import net.minecraft.C.u;
import net.minecraft.H.b;
import net.minecraft.aa.a;
import net.minecraft.at.h;
import net.minecraft.client.E.q;
import net.minecraft.client.o.d;
import net.minecraft.client.o.i;
import net.minecraft.client.o.j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class o {
    private static final /* synthetic */ Splitter b;
    private final /* synthetic */ List<u> c;
    private static final /* synthetic */ Logger a;

    static void a(o o2, net.minecraft.client.E.a a10) {
        o2.a(a10);
    }

    public o() {
        this.c = Collections.synchronizedList(Lists.newArrayList());
    }

    static Logger b() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(net.minecraft.client.E.a a10) {
        q q2 = q.b(a10.h);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group((EventLoopGroup)u.i.b())).handler((ChannelHandler)new i(this, q2, a10))).channel(NioSocketChannel.class)).connect(q2.a(), q2.b());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        List<u> list = this.c;
        synchronized (list) {
            block10: {
                int[] arrn = j.b();
                Iterator<u> iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    block12: {
                        u u2;
                        block11: {
                            u u3 = iterator.next();
                            if (arrn == null) break block10;
                            u2 = u3;
                            if (arrn == null) break block11;
                            if (!u2.j()) break block12;
                            iterator.remove();
                            u2 = u3;
                        }
                        u2.a(new h("multiplayer.status.cancelled", new Object[0]));
                    }
                    if (arrn != null) continue;
                    break;
                }
            }
            return;
        }
    }

    static Splitter d() {
        return b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List<u> list = this.c;
        synchronized (list) {
            block11: {
                int[] arrn = j.b();
                Iterator<u> iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    block14: {
                        u u2;
                        block12: {
                            u u3;
                            block13: {
                                u3 = iterator.next();
                                if (arrn == null) break block11;
                                u2 = u3;
                                if (arrn == null) break block12;
                                if (!u2.j()) break block13;
                                u3.i();
                                if (arrn != null) break block14;
                            }
                            iterator.remove();
                            u2 = u3;
                        }
                        u2.e();
                    }
                    if (arrn != null) continue;
                    break;
                }
            }
            return;
        }
    }

    public void b(net.minecraft.client.E.a a10) throws UnknownHostException {
        q q2 = q.b(a10.h);
        u u2 = u.a(InetAddress.getByName(q2.a()), q2.b(), false);
        this.c.add(u2);
        a10.k = net.minecraft.client.D.h.a("multiplayer.status.pinging", new Object[0]);
        a10.b = -1L;
        a10.d = null;
        u2.a(new d(this, u2, a10));
        try {
            u2.a(new a(q2.a(), q2.b(), p.STATUS));
            u2.a(new b());
        }
        catch (Throwable throwable) {
            a.error((Object)throwable);
        }
    }

    static {
        b = Splitter.on((char)'\u0000').limit(6);
        a = LogManager.getLogger();
    }
}

