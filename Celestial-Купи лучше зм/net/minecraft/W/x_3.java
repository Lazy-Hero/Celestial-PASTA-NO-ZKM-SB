/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.b2;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class x
extends s {
    private final /* synthetic */ b2 t;

    @Override
    public int c(int n2) {
        return n2 | 4;
    }

    @Override
    public String d(d d10) {
        return super.h() + "." + this.t.a(d10.d()).c();
    }

    public x(b2 b22) {
        super(b22);
        this.t = b22;
        this.d(0);
        this.a(true);
    }
}

