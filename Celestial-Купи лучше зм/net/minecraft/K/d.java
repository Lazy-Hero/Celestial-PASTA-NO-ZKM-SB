/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.K;

import net.minecraft.K.b;
import net.minecraft.j.f;

public class d
extends b {
    protected final /* synthetic */ double k;

    protected d(boolean bl2, int n2, double d10) {
        super(bl2, n2);
        this.k = d10;
    }

    @Override
    public double a(int n2, f f10) {
        return this.k * (double)(n2 + 1);
    }
}

