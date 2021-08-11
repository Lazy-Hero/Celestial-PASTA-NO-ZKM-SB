/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.am;
import net.minecraft.ar.v;
import net.minecraft.client.C.A;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.u;
import net.minecraft.client.w.aH;

public class aA<T extends am>
extends u<T> {
    private static final /* synthetic */ v z;

    public aA(a4 a42) {
        super(a42, new aH(), 1.0f);
        this.a(new A(this));
    }

    protected float b(T t2) {
        return 180.0f;
    }

    protected v a(T t2) {
        return z;
    }

    static {
        z = new v("textures/entity/spider/spider.png");
    }
}

