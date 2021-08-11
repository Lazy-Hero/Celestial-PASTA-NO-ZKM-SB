/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import net.minecraft.N.y;
import net.minecraft.P.r;

public class C
extends y {
    private /* synthetic */ int i;

    @Override
    public r a(r r2) {
        super.a(r2);
        r2.b("OutputSignal", this.i);
        return r2;
    }

    @Override
    public void c(r r2) {
        super.c(r2);
        this.i = r2.m("OutputSignal");
    }

    public int a() {
        return this.i;
    }

    public void a(int n2) {
        this.i = n2;
    }
}

