/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class v
extends u {
    @Override
    public int a(int n2) {
        return 1 + (n2 - 1) * 10;
    }

    public v(a a10, X ... arrx) {
        super(a10, h.BOW, arrx);
        this.b("arrowDamage");
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int f() {
        return 5;
    }
}

