/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.U.D;
import net.minecraft.ag.A;
import net.minecraft.ag.G;
import net.minecraft.ak.Z;

class q
extends Z {
    private static gP c(gP gP2) {
        return gP2;
    }

    public q(G g10) {
        super((D)g10, false, new Class[0]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String[] arrstring = A.b();
        boolean bl2 = this.e instanceof G;
        if (arrstring == null) return bl2;
        if (bl2) {
            G g10 = (G)this.e;
            bl2 = G.a(g10);
            if (arrstring == null) return bl2;
            if (bl2) {
                G.a(g10, false);
                return false;
            }
        }
        bl2 = super.e();
        return bl2;
    }
}

