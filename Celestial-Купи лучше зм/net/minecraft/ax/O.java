/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

public class O
extends u {
    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean e() {
        return true;
    }

    public O(a a10, X ... arrx) {
        super(a10, h.ALL, arrx);
        this.b("vanishing_curse");
    }

    @Override
    public int a(int n2) {
        return 25;
    }

    @Override
    public int f() {
        return 1;
    }

    @Override
    public int b(int n2) {
        return 50;
    }
}

