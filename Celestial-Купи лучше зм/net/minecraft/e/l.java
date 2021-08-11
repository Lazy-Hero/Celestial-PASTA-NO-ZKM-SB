/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.e.h;
import net.minecraft.e.i;
import net.minecraft.e.k;
import net.minecraft.k.n;

public class l
extends k {
    private /* synthetic */ n u;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public h a(x x2) {
        this.u = new n(x2);
        return super.a(x2);
    }

    @Override
    public h b(n n2) {
        this.u = n2;
        return super.b(n2);
    }

    @Override
    public boolean a(x x2, double d10) {
        h h2 = this.a(x2);
        int n2 = i.g();
        if (n2 == 0) {
            if (h2 != null) {
                return this.a(h2, d10);
            }
            this.u = new n(x2);
            this.s = d10;
        }
        return true;
    }

    public l(C c10, z z2) {
        super(c10, z2);
    }

    @Override
    public void d() {
        block4: {
            block6: {
                l l2;
                block7: {
                    C c10;
                    int n2;
                    block8: {
                        block9: {
                            l l3;
                            block5: {
                                block2: {
                                    block3: {
                                        n2 = i.n();
                                        l3 = this;
                                        if (n2 == 0) break block2;
                                        if (l3.o()) break block3;
                                        super.d();
                                        if (n2 != 0) break block4;
                                    }
                                    l3 = this;
                                }
                                if (n2 == 0) break block5;
                                if (l3.u == null) break block4;
                                l3 = this;
                            }
                            double d10 = l3.j.ad * this.j.ad;
                            l2 = this;
                            if (n2 == 0) break block6;
                            if (!(l2.j.c(this.u) >= d10)) break block7;
                            c10 = this.j;
                            if (n2 == 0) break block8;
                            if (c10.aF <= (double)this.u.b()) break block9;
                            l2 = this;
                            if (n2 == 0) break block6;
                            n n3 = new n(this.u.e(), net.minecraft.k.h.f(this.j.aF), this.u.a());
                            if (!(l2.j.c(n3) >= d10)) break block7;
                        }
                        c10 = this.j;
                    }
                    c10.w().a(this.u.e(), this.u.b(), this.u.a(), this.s);
                    if (n2 != 0) break block4;
                }
                l2 = this;
            }
            l2.u = null;
        }
    }
}

