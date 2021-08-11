/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.b;
import net.minecraft.client.k.h;

class l
implements Runnable {
    final /* synthetic */ b b;
    final /* synthetic */ h a;

    @Override
    public void run() {
        net.minecraft.client.k.b.a(this.b).remove(this.a);
    }

    l(b b10, h h2) {
        this.b = b10;
        this.a = h2;
    }
}

