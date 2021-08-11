/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 *  com.google.common.util.concurrent.ListenableFutureTask
 */
package net.minecraft.client.k;

import com.google.common.primitives.Doubles;
import com.google.common.util.concurrent.ListenableFutureTask;
import net.minecraft.client.k.b;

class u
implements Comparable<u> {
    private final /* synthetic */ ListenableFutureTask<Object> c;
    private final /* synthetic */ double b;
    final /* synthetic */ b a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public u(b b10, ListenableFutureTask listenableFutureTask, double d10) {
        this.a = b10;
        this.c = listenableFutureTask;
        this.b = d10;
    }

    public int a(u u2) {
        return Doubles.compare((double)this.b, (double)u2.b);
    }

    static ListenableFutureTask b(u u2) {
        return u2.c;
    }
}

