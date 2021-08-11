/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.K;

import net.minecraft.K.b;
import net.minecraft.U.B;
import net.minecraft.j.g;

public class c
extends b {
    @Override
    public void b(B b10, g g10, int n2) {
        b10.d(b10.ax() + (float)(4 * (n2 + 1)));
        super.b(b10, g10, n2);
    }

    protected c(boolean bl2, int n2) {
        super(bl2, n2);
    }

    @Override
    public void a(B b10, g g10, int n2) {
        b10.d(b10.ax() - (float)(4 * (n2 + 1)));
        super.a(b10, g10, n2);
    }
}

