/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.r;

import javax.annotation.Nullable;
import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;

public class j
extends b<x> {
    @Override
    public void d(x x2, double d10, double d11, double d12, float f10, float f11) {
        v.M();
        j.a(x2.m(), d10 - x2.am, d11 - x2.af, d12 - x2.n);
        v.B();
        super.d(x2, d10, d11, d12, f10, f11);
    }

    public j(a4 a42) {
        super(a42);
    }

    @Override
    @Nullable
    protected net.minecraft.ar.v d(x x2) {
        return null;
    }
}

