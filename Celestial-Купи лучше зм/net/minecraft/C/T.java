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
import net.minecraft.C.K;

class T {
    private final /* synthetic */ GenericFutureListener<? extends Future<? super Void>>[] b;
    private final /* synthetic */ K<?> a;

    public T(K<?> k2, GenericFutureListener<? extends Future<? super Void>> ... arrgenericFutureListener) {
        this.a = k2;
        this.b = arrgenericFutureListener;
    }

    static GenericFutureListener[] b(T t2) {
        return t2.b;
    }

    static K a(T t2) {
        return t2.a;
    }
}

