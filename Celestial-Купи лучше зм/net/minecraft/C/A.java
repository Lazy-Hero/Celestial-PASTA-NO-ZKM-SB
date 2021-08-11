/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net.minecraft.C;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import net.minecraft.C.a;
import net.minecraft.at.k;

class A
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ a b;
    final /* synthetic */ k a;

    public void operationComplete(Future<? super Void> future) throws Exception {
        this.b.C.a(this.a);
    }

    A(a a10, k k2) {
        this.b = a10;
        this.a = k2;
    }
}

