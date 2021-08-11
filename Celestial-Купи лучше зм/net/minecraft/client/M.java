/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client;

import net.minecraft.client.Q;
import net.minecraft.k.m;

class M
extends Thread {
    final /* synthetic */ Q a;

    M(Q q2, String string) {
        this.a = q2;
        super(string);
    }

    @Override
    public void run() {
        m[] arrm = Q.ag();
        while (this.a.aU) {
            try {
                Thread.sleep(Integer.MAX_VALUE);
            }
            catch (InterruptedException interruptedException) {
                if (arrm != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

