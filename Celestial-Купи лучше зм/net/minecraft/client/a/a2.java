/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.G;
import net.minecraft.client.a.aV;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;

final class a2
extends aV {
    @Override
    public void b() {
        v.b(1.0f, 1.0f, 1.0f, 0.15f);
        v.a(false);
        v.a();
        v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA);
        v.a(516, 0.003921569f);
    }

    @Override
    public void a() {
        v.f();
        v.a(516, 0.1f);
        v.a(true);
    }
}

