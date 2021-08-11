/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class E
extends u {
    protected E(a a10, h h2, X ... arrx) {
        super(a10, h2, arrx);
        this.b("fishingSpeed");
    }

    @Override
    public int a(int n2) {
        return 15 + (n2 - 1) * 9;
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }
}

