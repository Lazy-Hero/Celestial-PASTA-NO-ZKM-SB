/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.M;

import net.minecraft.M.aA;
import net.minecraft.M.n;
import net.minecraft.M.q;
import net.minecraft.M.t;
import net.minecraft.i.k;
import net.minecraft.k.l;

public class I
extends t {
    private final /* synthetic */ aA a;
    private final /* synthetic */ q d;

    public boolean a(k k2, l l2, int n2) {
        int n3 = t.b();
        boolean bl2 = this.d.a(l2.e, l2.d, l2.b, k2.a, k2.aF, k2.ax);
        if (n3 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.a.a(n2);
        }
        return bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public I(q q2, aA aA2) {
        super(n.b());
        this.d = q2;
        this.a = aA2;
    }
}

