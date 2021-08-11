/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.a1;
import net.minecraft.M.al;
import net.minecraft.M.p;
import net.minecraft.M.t;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.i.k;

public class L
extends t {
    private final /* synthetic */ al a;
    private final /* synthetic */ a1 d;

    public boolean a(k k2, x x2, G g10, float f10, float f11, boolean bl2) {
        int n2 = t.b();
        boolean bl3 = this.d.a(k2, g10, f10, f11, bl2);
        if (n2 == 0) {
            if (!bl3) {
                return false;
            }
            bl3 = this.a.a(k2, x2);
        }
        return bl3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public L(a1 a12, al al2) {
        super(p.b());
        this.d = a12;
        this.a = al2;
    }
}

