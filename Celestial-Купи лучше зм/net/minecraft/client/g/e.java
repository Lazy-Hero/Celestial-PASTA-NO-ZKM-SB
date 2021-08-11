/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.aR;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.g.b;
import net.minecraft.client.g.d;

class e
implements b {
    @Override
    public k b() {
        return new h("spectatorMenu.close", new Object[0]);
    }

    @Override
    public void a(a a10) {
        a10.h();
    }

    e(d d10) {
        this();
    }

    @Override
    public void a(float f10, int n2) {
        Q.P().aN().b(aR.j);
        q.a(0.0f, 0.0f, 128.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    @Override
    public boolean a() {
        return true;
    }

    private e() {
    }
}

