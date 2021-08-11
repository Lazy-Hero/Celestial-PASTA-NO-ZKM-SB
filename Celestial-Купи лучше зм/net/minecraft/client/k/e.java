/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net.minecraft.client.k;

import com.google.common.util.concurrent.ListenableFuture;
import net.minecraft.client.k.g;

class e
implements Runnable {
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ g a;

    e(g g10, ListenableFuture listenableFuture) {
        this.a = g10;
        this.b = listenableFuture;
    }

    @Override
    public void run() {
        this.b.cancel(false);
    }
}

