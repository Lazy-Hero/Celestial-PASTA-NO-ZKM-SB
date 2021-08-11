/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.ag.W;
import net.minecraft.ak.h;
import net.minecraft.i.j;

public class aE
extends h {
    private final /* synthetic */ W c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public aE(W w2) {
        this.c = w2;
        this.a(5);
    }

    @Override
    public void a() {
        this.c.l().f();
    }

    @Override
    public boolean c() {
        j j2;
        block16: {
            double d10;
            block15: {
                W w2;
                String string;
                block14: {
                    boolean bl2;
                    block13: {
                        string = h.h();
                        bl2 = this.c.aL();
                        if (string == null) {
                            if (!bl2) {
                                return false;
                            }
                            bl2 = this.c.aj();
                        }
                        if (string == null) {
                            if (bl2) {
                                return false;
                            }
                            bl2 = this.c.A;
                        }
                        if (string != null) break block13;
                        if (!bl2) {
                            return false;
                        }
                        w2 = this.c;
                        if (string != null) break block14;
                        bl2 = w2.M;
                    }
                    if (bl2) {
                        return false;
                    }
                    w2 = this.c;
                }
                if ((j2 = w2.b()) == null) {
                    return false;
                }
                double d11 = this.c.s(j2) - 16.0;
                d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                if (string != null) break block15;
                if (d10 <= 0) break block16;
                d10 = 0.0;
            }
            return (boolean)d10;
        }
        return j2.cm != null;
    }

    @Override
    public void g() {
        this.c.b((j)null);
    }
}

