/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.k;

import net.minecraft.U.x;
import net.minecraft.ar.aA;
import net.minecraft.k.j;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class i {
    public /* synthetic */ l c;
    public /* synthetic */ x e;
    public /* synthetic */ aA b;
    public /* synthetic */ j d;
    private /* synthetic */ n a;

    public String toString() {
        return "HitResult{type=" + (Object)((Object)this.d) + ", blockpos=" + this.a + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.e + '}';
    }

    public i(l l2, aA aA2, n n2) {
        this(j.BLOCK, l2, aA2, n2);
    }

    public i(j j2, l l2, aA aA2, n n2) {
        this.d = j2;
        this.a = n2;
        this.b = aA2;
        this.c = new l(l2.e, l2.d, l2.b);
    }

    public i(x x2) {
        this(x2, new l(x2.a, x2.aF, x2.ax));
    }

    public i(l l2, aA aA2) {
        this(j.BLOCK, l2, aA2, n.o);
    }

    public i(x x2, l l2) {
        this.d = j.ENTITY;
        this.e = x2;
        this.c = l2;
    }

    public n a() {
        return this.a;
    }
}

