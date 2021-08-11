/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.U.C;
import net.minecraft.ah.z;
import net.minecraft.e.c;
import net.minecraft.e.i;
import net.minecraft.e.o;
import net.minecraft.k.j;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class m
extends i {
    @Override
    protected void e() {
        block6: {
            double d10;
            l l2 = this.q();
            float f10 = this.j.ad * this.j.ad;
            int n2 = i.g();
            int n3 = 6;
            double d11 = l2.f(this.c.a(this.j, this.c.a())) - (double)f10;
            double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
            if (n2 == 0) {
                if (d12 < 0) {
                    this.c.c();
                }
                d12 = d10 = (double)Math.min(this.c.a() + 6, this.c.f() - 1);
            }
            while (d10 > this.c.a()) {
                block7: {
                    block8: {
                        m m2;
                        block9: {
                            l l3 = this.c.a(this.j, (int)d10);
                            if (n2 != 0) break block6;
                            if (n2 != 0) break block7;
                            if (!(l3.f(l2) <= 36.0)) break block8;
                            m2 = this;
                            if (n2 != 0) break block9;
                            if (!m2.a(l2, l3, 0, 0, 0)) break block8;
                            m2 = this;
                        }
                        m2.c.a((int)d10);
                        if (n2 == 0) break;
                    }
                    --d10;
                }
                if (n2 == 0) continue;
            }
            this.a(l2);
        }
    }

    @Override
    public boolean a(n n2) {
        int n3 = i.g();
        boolean bl2 = this.r.d(n2).m();
        if (n3 == 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    protected o l() {
        return new o(new c());
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public m(C c10, z z2) {
        super(c10, z2);
    }

    @Override
    protected l q() {
        return new l(this.j.a, this.j.aF + (double)this.j.aD * 0.5, this.j.ax);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(l l2, l l3, int n2, int n3, int n4) {
        net.minecraft.k.i i2 = this.r.a(l2, new l(l3.e, l3.d + (double)this.j.aD * 0.5, l3.b), false, true, false);
        int n5 = i.g();
        net.minecraft.k.i i3 = i2;
        if (n5 == 0) {
            if (i3 == null) return true;
            i3 = i2;
        }
        if (i3.d != net.minecraft.k.j.MISS) return false;
        return true;
    }

    @Override
    protected boolean h() {
        return this.j();
    }
}

