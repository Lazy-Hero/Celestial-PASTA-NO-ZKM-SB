/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.H;
import net.r;

public class h
implements r {
    private final /* synthetic */ H b;
    private final /* synthetic */ r[] a;

    public String toString() {
        return "" + (Object)((Object)this.b) + "()";
    }

    public h(H h2, r[] arrr) {
        this.b = h2;
        this.a = arrr;
    }

    @Override
    public float a() {
        return this.b.a(this.a);
    }
}

