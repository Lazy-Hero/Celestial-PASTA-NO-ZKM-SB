/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.B;

import net.minecraft.client.B.o;

public enum n implements o
{
    NORMAL(false),
    ADVANCED(true);

    final /* synthetic */ boolean b;

    @Override
    public boolean a() {
        return this.b;
    }

    private n(boolean bl2) {
        this.b = bl2;
    }
}

