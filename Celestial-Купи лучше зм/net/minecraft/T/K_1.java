/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aF;
import net.minecraft.T.as;
import net.minecraft.ak.h;

class K
extends h {
    final /* synthetic */ aF d;
    private /* synthetic */ int c;

    K(aF aF2, as as2) {
        this(aF2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int[] arrn = S.f();
        K k2 = this;
        if (arrn != null) {
            if (k2.d.J() != null) return false;
            k2 = this;
        }
        boolean bl2 = k2.c;
        if (arrn == null) return bl2;
        if (bl2 <= false) return false;
        return true;
    }

    private K(aF aF2) {
        this.d = aF2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        aF aF2 = this.d;
        if (arrn != null) {
            if (aF2.J() != null) return 0 != 0;
            aF2 = this.d;
        }
        int n2 = aF.e(aF2).nextInt(40);
        if (arrn == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void b() {
        --this.c;
    }

    @Override
    public void a() {
        this.c = 20 * (1 + aF.d(this.d).nextInt(3));
        this.d.a(30);
    }

    @Override
    public void g() {
        block3: {
            aF aF2;
            block2: {
                int[] arrn = S.f();
                aF2 = this.d;
                if (arrn == null) break block2;
                if (aF2.J() != null) break block3;
                aF2 = this.d;
            }
            aF2.a(0);
        }
    }
}

