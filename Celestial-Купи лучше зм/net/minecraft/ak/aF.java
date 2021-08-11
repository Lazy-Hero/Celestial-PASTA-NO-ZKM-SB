/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ak.X;
import net.minecraft.ak.h;
import net.minecraft.ak.u;
import net.minecraft.i.j;

class aF
implements Predicate<x> {
    final /* synthetic */ u a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(@Nullable x x2) {
        boolean bl2;
        String string;
        block9: {
            double d10;
            double d11;
            block10: {
                float f10;
                block12: {
                    float f11;
                    block11: {
                        string = h.h();
                        boolean bl3 = x2 instanceof j;
                        if (string == null) {
                            if (!bl3) {
                                return false;
                            }
                            bl3 = ((j)x2).cw.b;
                        }
                        if (string != null) return bl3;
                        if (bl3) {
                            return false;
                        }
                        d11 = this.a.a();
                        bl2 = x2.a4();
                        if (string == null) {
                            if (bl2) {
                                d11 *= (double)0.8f;
                            }
                            bl2 = x2.a3();
                        }
                        if (string != null) break block9;
                        if (!bl2) break block10;
                        f11 = f10 = ((j)x2).Q();
                        if (string != null) break block11;
                        if (!(f11 < 0.1f)) break block12;
                        f11 = 0.1f;
                    }
                    f10 = f11;
                }
                d11 *= (double)(0.7f * f10);
            }
            bl2 = (d10 = (double)x2.o(u.a(this.a)) - d11) == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (bl2 > false) return false;
            bl2 = X.a(u.a(this.a), (B)x2, false, true);
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    aF(u u2) {
        this.a = u2;
    }
}

