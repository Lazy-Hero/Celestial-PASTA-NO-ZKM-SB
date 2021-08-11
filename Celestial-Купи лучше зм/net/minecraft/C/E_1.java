/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.C;

import net.minecraft.C.K;
import net.minecraft.C.W;

final class E
implements Runnable {
    final /* synthetic */ W b;
    final /* synthetic */ K a;

    E(K k2, W w2) {
        this.a = k2;
        this.b = w2;
    }

    @Override
    public void run() {
        this.a.a(this.b);
    }
}

