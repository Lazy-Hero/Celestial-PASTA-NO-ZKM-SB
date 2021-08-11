/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.w.aK;
import net.minecraft.w.ar;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class y
extends s {
    protected final /* synthetic */ ar u;
    protected final /* synthetic */ K t;

    @Override
    public int c(int n2) {
        return n2;
    }

    public y(K k2, K k3, String[] arrstring) {
        this(k2, k3, new aK(arrstring));
    }

    public y(K k2, K k3, ar ar2) {
        super(k2);
        this.t = k3;
        this.u = ar2;
        this.d(0);
        this.a(true);
    }

    @Override
    public String d(d d10) {
        return super.h() + "." + this.u.a(d10);
    }
}

