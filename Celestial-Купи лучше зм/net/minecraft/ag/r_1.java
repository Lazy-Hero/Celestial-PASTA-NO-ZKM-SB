/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.U.B;
import net.minecraft.ag.A;
import net.minecraft.ag.G;
import net.minecraft.ag.V;
import net.minecraft.ak.au;

class r
extends au<V> {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        var1_1 = A.b();
        v0 = super.c();
        if (var1_1 == null) return v0;
        if (v0) {
            v1 = this;
            if (var1_1 != null) {
                if (v1.l != null) {
                    v0 = ((V)this.l).U();
                    if (var1_1 == null) return v0;
                    if (!v0) {
                        return true;
                    } else {
                        ** GOTO lbl-1000
                    }
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 5 sources

        {
            v1 = this;
        }
        v1.e.d((B)null);
        return false;
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    public r(G g10) {
        super(g10, V.class, 16, false, true, null);
    }

    @Override
    protected double a() {
        return super.a() * 0.25;
    }
}

