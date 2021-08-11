/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.T;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.T.k;
import net.minecraft.U.x;

final class m
implements Predicate<x> {
    m() {
    }

    public boolean a(@Nullable x x2) {
        return x2 instanceof k;
    }
}

