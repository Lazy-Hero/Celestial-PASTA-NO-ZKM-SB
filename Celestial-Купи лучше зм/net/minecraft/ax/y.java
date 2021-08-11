/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class y
extends u {
    public y(a a10, X ... arrx) {
        super(a10, h.BOW, arrx);
        this.b("arrowKnockback");
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 25;
    }

    @Override
    public int a(int n2) {
        return 12 + (n2 - 1) * 20;
    }

    @Override
    public int f() {
        return 2;
    }
}

