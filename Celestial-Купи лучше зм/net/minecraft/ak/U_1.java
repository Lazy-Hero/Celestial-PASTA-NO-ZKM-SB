/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ag.R;
import net.minecraft.ak.h;

public class U
extends h {
    private /* synthetic */ boolean c;
    private final /* synthetic */ R d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(boolean bl2) {
        this.c = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean c() {
        double d10;
        block15: {
            String string;
            block14: {
                x x2;
                x x3;
                block13: {
                    boolean bl2;
                    block12: {
                        string = h.h();
                        bl2 = this.d.U();
                        if (string == null) {
                            if (!bl2) {
                                return false;
                            }
                            bl2 = this.d.aj();
                        }
                        if (string != null) break block12;
                        if (bl2) {
                            return false;
                        }
                        x3 = this.d;
                        if (string != null) break block13;
                        bl2 = ((R)x3).A;
                    }
                    if (!bl2) {
                        return false;
                    }
                    x3 = this.d.a();
                }
                if ((x2 = x3) == null) {
                    return true;
                }
                double d11 = this.d.s(x2) - 144.0;
                d10 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                if (string != null) break block14;
                if (d10 < 0 && ((B)x2).aA() != null) break block15;
                d10 = (double)this.c;
            }
            if (string != null) return (boolean)d10;
            if (d10 != false) {
                d10 = 1.0;
                return (boolean)d10;
            }
        }
        d10 = 0.0;
        return (boolean)d10;
    }

    @Override
    public void g() {
        this.d.r(false);
    }

    public U(R r2) {
        this.d = r2;
        this.a(5);
    }

    @Override
    public void a() {
        this.d.l().f();
        this.d.r(true);
    }
}

