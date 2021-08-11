/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aV;
import net.minecraft.ar.v;
import net.minecraft.client.C.c;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.z;

public class A
extends z {
    private static final /* synthetic */ v B;

    @Override
    protected v a(aV aV2) {
        return B;
    }

    static {
        B = new v("textures/entity/skeleton/stray.png");
    }

    public A(a4 a42) {
        super(a42);
        this.a(new c(this));
    }
}

