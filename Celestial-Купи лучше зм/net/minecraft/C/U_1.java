/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 */
package net.minecraft.C;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import net.minecraft.C.u;

final class U
extends ChannelInitializer<Channel> {
    final /* synthetic */ u a;

    U(u u2) {
        this.a = u2;
    }

    protected void initChannel(Channel channel) throws Exception {
        channel.pipeline().addLast("packet_handler", (ChannelHandler)this.a);
    }
}

