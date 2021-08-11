/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.client.o;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import javax.crypto.SecretKey;
import net.minecraft.client.o.p;

class b
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ SecretKey b;
    final /* synthetic */ p a;

    public void operationComplete(Future<? super Void> future) throws Exception {
        p.a(this.a).a(this.b);
    }

    b(p p2, SecretKey secretKey) {
        this.a = p2;
        this.b = secretKey;
    }
}

