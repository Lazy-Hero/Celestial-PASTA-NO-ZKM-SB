/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 */
package net.minecraft.client.o;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import net.minecraft.client.E.a;
import net.minecraft.client.E.q;
import net.minecraft.client.o.o;
import net.minecraft.client.o.r;

class i
extends ChannelInitializer<Channel> {
    final /* synthetic */ o c;
    final /* synthetic */ q b;
    final /* synthetic */ a a;

    i(o o2, q q2, a a10) {
        this.c = o2;
        this.b = q2;
        this.a = a10;
    }

    protected void initChannel(Channel channel) throws Exception {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new r(this)});
    }
}

