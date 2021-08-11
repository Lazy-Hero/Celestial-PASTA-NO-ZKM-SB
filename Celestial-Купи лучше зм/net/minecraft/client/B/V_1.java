/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.b.L;

public class V
extends L {
    @Override
    public boolean i() {
        return false;
    }

    @Override
    public void r() {
        this.t.clear();
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.f(0);
        this.b(this.v, net.minecraft.client.D.h.a("multiplayer.downloadingTerrain", new Object[0]), h / 2, w / 2 - 50, 0xFFFFFF);
        super.a(n2, n3, f10);
    }
}

