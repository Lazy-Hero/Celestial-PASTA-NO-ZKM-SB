/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class G
extends u {
    @Override
    public int a(int n2) {
        return 5 + 20 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    protected G(a a10, X ... arrx) {
        super(a10, h.WEAPON, arrx);
        this.b("knockback");
    }

    @Override
    public int f() {
        return 2;
    }
}

