/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.w.y;

public class z
extends y {
    public z(K k2) {
        super(k2, k2, new String[]{"intact", "slightlyDamaged", "veryDamaged"});
    }

    @Override
    public int c(int n2) {
        return n2 << 2;
    }
}

