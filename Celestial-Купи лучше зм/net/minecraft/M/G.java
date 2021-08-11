/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.aD;
import net.minecraft.M.t;
import net.minecraft.w.d;

public class G
extends t {
    private final /* synthetic */ a0 d;
    private final /* synthetic */ aA a;
    private final /* synthetic */ aA e;

    public G(a0 a02, aA aA2, aA aA3) {
        super(aD.b());
        this.d = a02;
        this.a = aA2;
        this.e = aA3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(d d10, int n2) {
        int n3 = t.b();
        boolean bl2 = this.d.a(d10);
        if (n3 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.a.a(d10.E() - n2);
        }
        if (n3 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.e.a(d10.u() - n2);
        }
        return bl2;
    }
}

