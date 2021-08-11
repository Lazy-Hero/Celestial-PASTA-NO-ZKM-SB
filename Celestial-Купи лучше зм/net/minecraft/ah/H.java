/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import javax.annotation.Nullable;
import net.minecraft.A.c;
import net.minecraft.P.r;
import net.minecraft.aA.g;
import net.minecraft.aA.v;
import net.minecraft.ah.A;
import net.minecraft.ah.G;
import net.minecraft.ah.p;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.u.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H
extends G {
    private /* synthetic */ net.minecraft.am.g k;

    @Override
    public boolean b(int n2, int n3) {
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean s() {
        return false;
    }

    @Override
    public v o() {
        return new g(this.e, this.e.b().D(), this.e.C(), this.k());
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public l a(float f10, float f11) {
        int n2 = 0xA080A0;
        float f12 = net.minecraft.k.h.c(f10 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f12 = net.minecraft.k.h.c(f12, 0.0f, 1.0f);
        float f13 = 0.627451f;
        float f14 = 0.5019608f;
        float f15 = 0.627451f;
        return new l(f13 *= f12 * 0.0f + 0.15f, f14 *= f12 * 0.0f + 0.15f, f15 *= f12 * 0.0f + 0.15f);
    }

    @Override
    public boolean a(int n2, int n3) {
        return this.e.A(new n(n2, 0, n3)).o().n();
    }

    @Override
    public void q() {
        r r2 = new r();
        String string = z.I();
        H h2 = this;
        if (string != null) {
            if (h2.k != null) {
                r2.a("DragonFight", this.k.i());
            }
            h2 = this;
        }
        h2.e.b().a(p.THE_END, r2);
    }

    @Override
    public n k() {
        return new n(100, 50, 0);
    }

    @Nullable
    public net.minecraft.am.g a() {
        return this.k;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public p r() {
        return p.THE_END;
    }

    @Override
    public float f() {
        return 8.0f;
    }

    @Override
    public float a(long l2, float f10) {
        return 0.0f;
    }

    @Override
    public void n() {
        block3: {
            net.minecraft.am.g g10;
            block2: {
                String string = z.I();
                g10 = this.k;
                if (string == null) break block2;
                if (g10 == null) break block3;
                g10 = this.k;
            }
            g10.a();
        }
    }

    @Override
    public int c() {
        return 50;
    }

    @Override
    public void d() {
        this.h = new c(net.minecraft.u.d.ah);
        r r2 = this.e.b().a(p.THE_END);
        this.k = this.e instanceof A ? new net.minecraft.am.g((A)this.e, r2.h("DragonFight")) : null;
    }

    @Override
    @Nullable
    public float[] b(float f10, float f11) {
        return null;
    }
}

