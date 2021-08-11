/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class k
extends j {
    public /* synthetic */ c i;
    public /* synthetic */ c j;
    public /* synthetic */ c k;

    public k() {
        this.g = 64;
        this.f = 64;
        this.i = new c(this, 0, 0);
        this.i.b(-10.0f, 0.0f, -2.0f, 20, 40, 1, 0.0f);
        this.k = new c(this, 44, 0);
        this.k.b(-1.0f, -30.0f, -1.0f, 2, 42, 2, 0.0f);
        this.j = new c(this, 0, 42);
        this.j.b(-10.0f, -32.0f, -1.0f, 20, 2, 2, 0.0f);
    }

    public void a() {
        this.i.h = -32.0f;
        this.i.b(0.0625f);
        this.k.b(0.0625f);
        this.j.b(0.0625f);
    }
}

