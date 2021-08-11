/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.v;

public abstract class l<T> {
    private /* synthetic */ boolean a;
    private /* synthetic */ T b;

    protected abstract T a();

    private static gP a(gP gP2) {
        return gP2;
    }

    public T b() {
        int n2 = v.d();
        l<T> l2 = this;
        if (n2 != 0) {
            if (!l2.a) {
                this.a = true;
                this.b = this.a();
            }
            l2 = this.b;
        }
        return (T)l2;
    }
}

