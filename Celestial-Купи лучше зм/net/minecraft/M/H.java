/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.aC;
import net.minecraft.M.al;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.i.k;

public class H
extends t {
    private final /* synthetic */ al d;
    private final /* synthetic */ aC a;

    public H(v v2, al al2, aC aC2) {
        super(v2);
        this.d = al2;
        this.a = aC2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(k k2, x x2, G g10) {
        int n2 = t.b();
        boolean bl2 = this.a.a(k2, g10);
        if (n2 == 0) {
            if (!bl2) return false;
            bl2 = this.d.a(k2, x2);
        }
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }
}

