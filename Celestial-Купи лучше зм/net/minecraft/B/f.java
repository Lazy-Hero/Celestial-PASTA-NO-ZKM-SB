/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.b;
import net.minecraft.B.n;
import net.minecraft.N.H;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class f
extends b {
    private /* synthetic */ H f;

    public void a(u u2) {
        int n2;
        int n3;
        block5: {
            n3 = n.c();
            for (n2 = 0; n2 < this.e(); ++n2) {
                this.a(n2, d.m);
                if (n3 == 0) {
                    if (n3 == 0) continue;
                }
                break block5;
            }
            n2 = 0;
        }
        while (n2 < u2.b()) {
            r r2 = u2.d(n2);
            int n4 = r2.r("Slot") & 0xFF;
            if (n3 == 0) {
                if (n4 >= 0 && n4 < this.e()) {
                    this.a(n4, new d(r2));
                }
                ++n2;
            }
            if (n3 == 0) continue;
        }
    }

    @Override
    public void d(j j2) {
        int n2 = n.c();
        f f10 = this;
        if (n2 == 0) {
            if (f10.f != null) {
                this.f.d();
            }
            super.d(j2);
            f10 = this;
        }
        f10.f = null;
    }

    public f() {
        super("container.enderchest", false, 27);
    }

    public void a(H h2) {
        this.f = h2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public u a() {
        u u2 = new u();
        int n2 = n.c();
        int n3 = 0;
        while (n3 < this.e()) {
            d d10 = this.a(n3);
            if (n2 == 0) {
                if (!d10.G()) {
                    r r2 = new r();
                    r2.a("Slot", (byte)n3);
                    d10.a(r2);
                    u2.a(r2);
                }
                ++n3;
            }
            if (n2 == 0) continue;
        }
        return u2;
    }

    @Override
    public void c(j j2) {
        int n2 = n.c();
        f f10 = this;
        if (n2 == 0) {
            if (f10.f != null) {
                this.f.e();
            }
            f10 = this;
        }
        super.c(j2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        boolean bl2;
        int n2;
        block4: {
            f f10;
            block2: {
                block3: {
                    n2 = n.b();
                    f10 = this;
                    if (n2 == 0) break block2;
                    if (f10.f == null) break block3;
                    bl2 = this.f.a(j2);
                    if (n2 == 0) break block4;
                    if (!bl2) return false;
                }
                f10 = this;
            }
            bl2 = super.a(j2);
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

