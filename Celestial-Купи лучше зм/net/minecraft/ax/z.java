/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class z
extends u {
    @Override
    public int a(int n2) {
        return 25;
    }

    @Override
    public int b(int n2) {
        return 50;
    }

    public z(a a10, X ... arrx) {
        super(a10, h.WEARABLE, arrx);
        this.b("binding_curse");
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    public boolean d() {
        return true;
    }
}

