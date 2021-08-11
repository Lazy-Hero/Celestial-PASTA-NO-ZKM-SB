/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import net.minecraft.U.C;
import net.minecraft.ar.w;

public class d
extends w {
    public /* synthetic */ int c;
    public /* synthetic */ int d;
    public /* synthetic */ Class<? extends C> b;

    public d(Class<? extends C> class_, int n2, int n3, int n4) {
        super(n2);
        this.b = class_;
        this.d = n3;
        this.c = n4;
    }

    public String toString() {
        return this.b.getSimpleName() + "*(" + this.d + "-" + this.c + "):" + this.a;
    }
}

