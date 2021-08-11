/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 */
package net.minecraft.ai;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import net.minecraft.ai.f;

class a
implements ChannelFutureListener {
    final /* synthetic */ f a;

    a(f f10) {
        this.a = f10;
    }

    public void a(ChannelFuture channelFuture) throws Exception {
        this.a.l.a(f.b(this.a).C());
    }
}

