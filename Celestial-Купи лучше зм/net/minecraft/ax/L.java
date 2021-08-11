/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.B.X;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class L
extends u {
    public L(a a10, X ... arrx) {
        super(a10, h.WEAPON, arrx);
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public String a() {
        return "enchantment.sweeping";
    }

    @Override
    public int a(int n2) {
        return 5 + (n2 - 1) * 9;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    public static float a(int n2) {
        return 1.0f - 1.0f / (float)(n2 + 1);
    }
}

