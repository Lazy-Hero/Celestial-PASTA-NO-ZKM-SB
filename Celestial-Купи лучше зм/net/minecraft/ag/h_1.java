/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import java.util.Random;
import net.minecraft.U.e;
import net.minecraft.ag.A;
import net.minecraft.ag.a1;
import net.minecraft.ag.b;
import net.minecraft.w.d;
import net.minecraft.w.k;
import net.minecraft.y.a;

class h
implements a1 {
    public /* synthetic */ b b;
    public /* synthetic */ k a;

    @Override
    public void a(e e10, a a10, Random random) {
        int n2 = 1;
        String[] arrstring = A.b();
        if (arrstring != null) {
            if (this.b != null) {
                n2 = this.b.a(random);
            }
            a10.add(new net.minecraft.y.b(new d(this.a, n2, 0), net.minecraft.u.h.aO));
        }
    }

    public h(k k2, b b10) {
        this.a = k2;
        this.b = b10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

