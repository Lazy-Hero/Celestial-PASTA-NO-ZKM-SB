/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import net.minecraft.client.D.w;
import net.minecraft.client.Q;
import net.minecraft.client.b.aX;

class g
implements Runnable {
    final /* synthetic */ aX c;
    final /* synthetic */ Q b;
    final /* synthetic */ w a;

    @Override
    public void run() {
        this.b.a(this.c);
    }

    g(w w2, Q q2, aX aX2) {
        this.a = w2;
        this.b = q2;
        this.c = aX2;
    }
}

