/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.U.C;
import net.minecraft.client.C.e;
import net.minecraft.client.C.z;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.n;

public class x<T extends C>
extends u<T> {
    private static final /* synthetic */ net.minecraft.ar.v z;

    static {
        z = new net.minecraft.ar.v("textures/entity/steve.png");
    }

    @Override
    public void f() {
        net.minecraft.client.a.v.b(0.0f, 0.1875f, 0.0f);
    }

    protected net.minecraft.ar.v a(T t2) {
        return z;
    }

    public x(a4 a42, n n2, float f10) {
        super(a42, n2, f10);
        this.a(new net.minecraft.client.C.u(n2.n));
        this.a(new e(this));
        this.a(new z(this));
    }
}

