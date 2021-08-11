/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class Q
extends u {
    @Override
    public int a(int n2) {
        return 1;
    }

    public Q(a a10, X ... arrx) {
        super(a10, h.ARMOR_HEAD, arrx);
        this.b("waterWorker");
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 40;
    }

    @Override
    public int f() {
        return 1;
    }
}

