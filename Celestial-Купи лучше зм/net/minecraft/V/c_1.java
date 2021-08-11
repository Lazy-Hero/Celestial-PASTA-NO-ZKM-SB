/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.U.G;
import net.minecraft.h.d;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.v.p;

public abstract class c
implements p {
    protected final /* synthetic */ d c;
    private static /* synthetic */ int[] b;

    @Override
    public float g() {
        return 0.6f;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    static {
        if (net.minecraft.v.c.b() != null) {
            net.minecraft.v.c.b(new int[4]);
        }
    }

    public c(d d10) {
        this.c = d10;
    }

    public static int[] b() {
        return b;
    }

    @Override
    public float a(G g10, net.minecraft.ar.G g11, float f10) {
        return f10;
    }

    @Override
    public void c() {
    }

    @Override
    public void h() {
    }

    @Override
    public void a(net.minecraft.J.p p2, n n2, net.minecraft.ar.G g10, @Nullable j j2) {
    }

    @Override
    public void a() {
    }

    @Override
    public boolean i() {
        return false;
    }

    @Override
    @Nullable
    public l e() {
        return null;
    }

    @Override
    public float f() {
        float f10 = h.e(this.c.aq * this.c.aq + this.c.d * this.c.d) + 1.0f;
        float f11 = Math.min(f10, 40.0f);
        return 0.7f / f11 / f10;
    }

    @Override
    public void d() {
    }
}

