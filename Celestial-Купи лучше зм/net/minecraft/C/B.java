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
import net.minecraft.C.J;
import net.minecraft.C.M;
import net.minecraft.C.R;
import net.minecraft.C.l;
import net.minecraft.C.u;

final class B
extends ChannelInitializer<Channel> {
    final /* synthetic */ u a;

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30)).addLast("splitter", (ChannelHandler)new R()).addLast("decoder", (ChannelHandler)new l(D.CLIENTBOUND)).addLast("prepender", (ChannelHandler)new M()).addLast("encoder", (ChannelHandler)new J(D.SERVERBOUND)).addLast("packet_handler", (ChannelHandler)this.a);
    }

    B(u u2) {
        this.a = u2;
    }
}

