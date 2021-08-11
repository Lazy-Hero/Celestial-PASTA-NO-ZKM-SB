/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.C;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.C.p;
import net.minecraft.C.u;

class o
implements Runnable {
    final /* synthetic */ GenericFutureListener[] e;
    final /* synthetic */ p d;
    final /* synthetic */ K b;
    final /* synthetic */ p c;
    final /* synthetic */ u a;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void run() {
        int n2 = m.b();
        o o2 = this;
        if (n2 == 0) {
            if (o2.d != this.c) {
                this.a.a(this.d);
            }
            o2 = this;
        }
        ChannelFuture channelFuture = u.a(o2.a).writeAndFlush((Object)this.b);
        if (n2 == 0) {
            if (this.e != null) {
                channelFuture.addListeners(this.e);
            }
            channelFuture.addListener((GenericFutureListener)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
    }

    o(u u2, p p2, p p3, K k2, GenericFutureListener[] arrgenericFutureListener) {
        this.a = u2;
        this.d = p2;
        this.c = p3;
        this.b = k2;
        this.e = arrgenericFutureListener;
    }
}

