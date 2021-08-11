/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class D
extends u {
    @Override
    public int f() {
        return 2;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    protected D(a a10, X ... arrx) {
        super(a10, h.WEAPON, arrx);
        this.b("fire");
    }

    @Override
    public int a(int n2) {
        return 10 + 20 * (n2 - 1);
    }
}

