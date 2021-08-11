/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class aw
extends j {
    public /* synthetic */ c j;
    public /* synthetic */ c i;

    public void a() {
        this.i.b(0.0625f);
        this.j.b(0.0625f);
    }

    public aw() {
        this.g = 64;
        this.f = 64;
        this.i = new c(this, 0, 0);
        this.i.b(-6.0f, -11.0f, -2.0f, 12, 22, 1, 0.0f);
        this.j = new c(this, 26, 0);
        this.j.b(-1.0f, -3.0f, -1.0f, 2, 6, 6, 0.0f);
    }
}

