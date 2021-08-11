/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.ag.A;
import net.minecraft.ag.P;
import net.minecraft.ak.d;

class e
extends d {
    private final /* synthetic */ P j;
    private /* synthetic */ double i;

    @Override
    public void a() {
        e e10;
        block7: {
            block6: {
                boolean bl2;
                block4: {
                    String[] arrstring;
                    block5: {
                        arrstring = A.b();
                        bl2 = this.j.A;
                        if (arrstring == null) break block4;
                        if (!bl2) break block5;
                        bl2 = P.c(this.j);
                        if (arrstring == null) break block4;
                        if (bl2) break block5;
                        bl2 = ((A)P.a(this.j)).a();
                        if (arrstring == null) break block4;
                        if (bl2) break block5;
                        this.j.b(0.0);
                        if (arrstring != null) break block6;
                    }
                    e10 = this;
                    if (arrstring == null) break block7;
                    bl2 = e10.c();
                }
                if (bl2) {
                    this.j.b(this.i);
                }
            }
            e10 = this;
        }
        super.a();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(double d10, double d11, double d12, double d13) {
        block6: {
            double d14;
            block5: {
                e e10;
                int n2;
                block4: {
                    String[] arrstring = A.b();
                    n2 = this.j.aj();
                    if (arrstring == null) break block4;
                    if (n2 != 0) {
                        d13 = 1.5;
                    }
                    e10 = this;
                    d14 = d10;
                    if (arrstring == null) break block5;
                    super.a(d14, d11, d12, d13);
                    double d15 = d13 - 0.0;
                    n2 = d15 == 0.0 ? 0 : (d15 > 0.0 ? 1 : -1);
                }
                if (n2 <= 0) break block6;
                e10 = this;
                d14 = d13;
            }
            e10.i = d14;
        }
    }

    public e(P p2) {
        super(p2);
        this.j = p2;
    }
}

