/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.T.aR;
import net.minecraft.U.B;
import net.minecraft.ak.h;

public class o
extends h {
    /* synthetic */ aR c;
    /* synthetic */ B d;

    public o(aR aR2) {
        this.c = aR2;
        this.a(1);
    }

    @Override
    public void g() {
        this.d = null;
    }

    @Override
    public void a() {
        this.c.l().f();
        this.d = this.c.J();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        B b10 = this.c.J();
        String string = h.h();
        int n2 = this.c.d();
        if (string != null) return n2 != 0;
        if (n2 > 0) return 1 != 0;
        if (b10 == null) return 0 != 0;
        double d10 = this.c.s(b10) - 9.0;
        n2 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (string != null) return n2 != 0;
        if (n2 >= 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block4: {
            aR aR2;
            block7: {
                block8: {
                    double d10;
                    String string;
                    block5: {
                        block6: {
                            double d11;
                            o o2;
                            block2: {
                                block3: {
                                    string = h.h();
                                    o2 = this;
                                    if (string != null) break block2;
                                    if (o2.d != null) break block3;
                                    this.c.a(-1);
                                    if (string == null) break block4;
                                }
                                o2 = this;
                            }
                            d10 = (d11 = o2.c.s(this.d) - 49.0) == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                            if (string != null) break block5;
                            if (d10 <= 0) break block6;
                            this.c.a(-1);
                            if (string == null) break block4;
                        }
                        aR2 = this.c;
                        if (string != null) break block7;
                        d10 = (double)aR2.v().a(this.d);
                    }
                    if (d10 != false) break block8;
                    this.c.a(-1);
                    if (string == null) break block4;
                }
                aR2 = this.c;
            }
            aR2.a(1);
        }
    }
}

