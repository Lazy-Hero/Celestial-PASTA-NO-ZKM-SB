/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.y.a;

class c
implements a1 {
    public /* synthetic */ d c;
    public /* synthetic */ b b;
    public /* synthetic */ d d;
    public /* synthetic */ b a;

    public c(k k2, b b10, k k3, b b11) {
        this.c = new d(k2);
        this.a = b10;
        this.d = new d(k3);
        this.b = b11;
    }

    @Override
    public void a(e e10, a a10, Random random) {
        int n2 = this.a.a(random);
        int n3 = this.b.a(random);
        a10.add(new net.minecraft.y.b(new d(this.c.w(), n2, this.c.d()), new d(h.aO), new d(this.d.w(), n3, this.d.d())));
    }
}

