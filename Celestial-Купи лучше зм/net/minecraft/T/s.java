/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aH;
import net.minecraft.U.B;
import net.minecraft.U.D;
import net.minecraft.ak.Z;

class s
extends Z {
    final /* synthetic */ aH n;

    public s(aH aH2) {
        this.n = aH2;
        super((D)aH2, false, new Class[0]);
    }

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(D d10, B b10) {
        block2: {
            boolean bl2;
            block1: {
                int[] arrn = S.f();
                bl2 = d10 instanceof aH;
                if (arrn == null) break block1;
                if (!bl2) break block2;
                bl2 = d10.Q();
            }
            if (!bl2) {
                super.a(d10, b10);
            }
        }
    }

    @Override
    public void a() {
        block3: {
            s s2;
            block2: {
                int[] arrn = S.f();
                super.a();
                int[] arrn2 = arrn;
                s2 = this;
                if (arrn2 == null) break block2;
                if (!s2.n.Q()) break block3;
                this.c();
                s2 = this;
            }
            s2.g();
        }
    }
}

