/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.n;

import net.minecraft.ar.d;
import net.minecraft.client.e.C;
import net.minecraft.client.e.y;
import net.minecraft.u.E;

public enum h {
    SHOW(E.aA),
    HIDE(E.af);

    private final /* synthetic */ d a;

    private h(d d10) {
        this.a = d10;
    }

    public void a(C c10) {
        c10.c(y.a(this.a, 1.0f, 1.0f));
    }
}

