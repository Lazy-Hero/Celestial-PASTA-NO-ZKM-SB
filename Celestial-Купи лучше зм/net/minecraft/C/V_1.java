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
import net.minecraft.C.G;
import net.minecraft.C.u;
import net.minecraft.at.g;

class V
implements GenericFutureListener<Future<? super Void>> {
    final /* synthetic */ g a;
    final /* synthetic */ u c;
    final /* synthetic */ G b;

    V(G g10, u u2, g g11) {
        this.b = g10;
        this.c = u2;
        this.a = g11;
    }

    public void operationComplete(Future<? super Void> future) throws Exception {
        this.c.a(this.a);
    }
}

