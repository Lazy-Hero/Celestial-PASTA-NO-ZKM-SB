/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.k.l;

public class i {
    public /* synthetic */ float a;
    public /* synthetic */ float c;
    public /* synthetic */ l b;

    public i(i i2, float f10, float f11) {
        this.b = i2.b;
        this.a = f10;
        this.c = f11;
    }

    public i a(float f10, float f11) {
        return new i(this, f10, f11);
    }

    public i(l l2, float f10, float f11) {
        this.b = l2;
        this.a = f10;
        this.c = f11;
    }

    public i(float f10, float f11, float f12, float f13, float f14) {
        this(new l(f10, f11, f12), f13, f14);
    }
}

