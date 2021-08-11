/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.handler.timeout.ReadTimeoutHandler
 */
package net.minecraft.C;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import net.minecraft.C.D;
import net.minecraft.C.G;
import net.minecraft.C.J;
import net.minecraft.C.M;
import net.minecraft.C.O;
import net.minecraft.C.R;
import net.minecraft.C.l;
import net.minecraft.C.u;
import net.minecraft.ai.c;

class z
extends ChannelInitializer<Channel> {
    final /* synthetic */ G a;

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("legacy_query", (ChannelHandler)new O(this.a)).addLast("splitter", (ChannelHandler)new R()).addLast("decoder", (ChannelHandler)new l(D.SERVERBOUND)).addLast("prepender", (ChannelHandler)new M()).addLast("encoder", (ChannelHandler)new J(D.CLIENTBOUND));
        u u2 = new u(D.SERVERBOUND);
        G.b(this.a).add(u2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)u2);
        u2.a(new c(G.a(this.a), u2));
    }

    z(G g10) {
        this.a = g10;
    }
}

