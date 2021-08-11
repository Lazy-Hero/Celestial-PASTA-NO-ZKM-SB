/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.h.d;
import net.minecraft.k.l;
import net.minecraft.v.b;
import net.minecraft.v.c;

public class g
extends c {
    private /* synthetic */ l a;

    public g(d d10) {
        super(d10);
    }

    public b<g> b() {
        return b.n;
    }

    @Override
    public void c() {
        this.a = null;
    }

    @Override
    @Nullable
    public l e() {
        return this.a;
    }

    @Override
    public void h() {
        block3: {
            block2: {
                int[] arrn = net.minecraft.v.c.b();
                g g10 = this;
                if (arrn != null) break block2;
                if (g10.a != null) break block3;
                g10 = this;
            }
            g10.a = new l(this.c.a, this.c.aF, this.c.ax);
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public float g() {
        return 1.0f;
    }
}

