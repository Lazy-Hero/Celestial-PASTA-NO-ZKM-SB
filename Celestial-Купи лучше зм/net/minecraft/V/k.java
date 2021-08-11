/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.v;

import net.minecraft.h.d;
import net.minecraft.u.E;
import net.minecraft.v.b;
import net.minecraft.v.c;
import net.minecraft.v.j;

public class k
extends j {
    private /* synthetic */ int a;

    public b<k> b() {
        return b.l;
    }

    @Override
    public void a() {
        this.c.aG.a(this.c.a, this.c.aF, this.c.ax, E.dA, this.c.ad(), 2.5f, 0.8f + this.c.f().nextFloat() * 0.3f, false);
    }

    @Override
    public void h() {
        block3: {
            k k2;
            block2: {
                int[] arrn = net.minecraft.v.c.b();
                k2 = this;
                if (arrn != null) break block2;
                if (k2.a++ < 40) break block3;
                k2 = this;
            }
            k2.c.d().b(b.f);
        }
    }

    @Override
    public void c() {
        this.a = 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public k(d d10) {
        super(d10);
    }
}

