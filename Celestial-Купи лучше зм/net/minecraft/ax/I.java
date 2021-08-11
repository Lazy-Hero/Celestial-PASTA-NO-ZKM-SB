/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class I
extends u {
    public I(a a10, X ... arrx) {
        super(a10, h.BREAKABLE, arrx);
        this.b("mending");
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 50;
    }

    @Override
    public int a(int n2) {
        return n2 * 25;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int f() {
        return 1;
    }
}

