/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class z
extends j {
    public /* synthetic */ c k;
    public /* synthetic */ c i;
    public /* synthetic */ c j;

    public z() {
        this.i = new c(this, 0, 0).a(64, 64);
        this.i.b(0.0f, -5.0f, -14.0f, 14, 5, 14, 0.0f);
        this.i.v = 1.0f;
        this.i.h = 7.0f;
        this.i.u = 15.0f;
        this.j = new c(this, 0, 0).a(64, 64);
        this.j.b(-1.0f, -2.0f, -15.0f, 2, 4, 1, 0.0f);
        this.j.v = 8.0f;
        this.j.h = 7.0f;
        this.j.u = 15.0f;
        this.k = new c(this, 0, 19).a(64, 64);
        this.k.b(0.0f, 0.0f, 0.0f, 14, 10, 14, 0.0f);
        this.k.v = 1.0f;
        this.k.h = 6.0f;
        this.k.u = 1.0f;
    }

    public void a() {
        this.j.y = this.i.y;
        this.i.b(0.0625f);
        this.j.b(0.0625f);
        this.k.b(0.0625f);
    }
}

