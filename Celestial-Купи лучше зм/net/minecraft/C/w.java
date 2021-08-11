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
import net.minecraft.C.D;
import net.minecraft.C.G;
import net.minecraft.C.u;
import net.minecraft.client.o.m;

class w
extends ChannelInitializer<Channel> {
    final /* synthetic */ G a;

    w(G g10) {
        this.a = g10;
    }

    protected void initChannel(Channel channel) throws Exception {
        u u2 = new u(D.SERVERBOUND);
        u2.a(new m(G.a(this.a), u2));
        G.b(this.a).add(u2);
        channel.pipeline().addLast("packet_handler", (ChannelHandler)u2);
    }
}

