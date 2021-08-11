/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.c.f;

public class Z
extends RuntimeException {
    private final /* synthetic */ f a;

    public f a() {
        return this.a;
    }

    @Override
    public String getMessage() {
        return this.a.h();
    }

    public Z(f f10) {
        this.a = f10;
    }

    @Override
    public Throwable getCause() {
        return this.a.d();
    }
}

