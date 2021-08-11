/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.b;
import net.minecraft.B.s;

class c
extends b {
    final /* synthetic */ s f;

    @Override
    public int c() {
        return 64;
    }

    c(s s2, String string, boolean bl2, int n2) {
        this.f = s2;
        super(string, bl2, n2);
    }

    @Override
    public void b() {
        super.b();
        this.f.a(this);
    }
}

