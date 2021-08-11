/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aS;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.X;

class A
extends X {
    final /* synthetic */ aS k;

    public A(aS aS2, D d10) {
        this.k = aS2;
        super(d10, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        A a10;
        int[] arrn;
        block3: {
            B b10;
            block2: {
                arrn = S.f();
                b10 = aS.d(this.k);
                if (arrn == null) break block2;
                if (b10 == null) return false;
                a10 = this;
                if (arrn == null) break block3;
                b10 = aS.d(a10.k).J();
            }
            if (b10 == null) return false;
            a10 = this;
        }
        boolean bl2 = a10.a(aS.d(this.k).J(), false);
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        this.k.d(aS.d(this.k).J());
        super.a();
    }
}

