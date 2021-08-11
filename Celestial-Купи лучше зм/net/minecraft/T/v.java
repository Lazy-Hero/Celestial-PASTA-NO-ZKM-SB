/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aH;
import net.minecraft.U.B;
import net.minecraft.ak.au;
import net.minecraft.i.j;

class v
extends au<j> {
    final /* synthetic */ aH p;

    private static gP c(gP gP2) {
        return gP2;
    }

    @Override
    public boolean c() {
        boolean bl2;
        block6: {
            block7: {
                int[] arrn = S.f();
                bl2 = this.p.Q();
                if (arrn != null) {
                    if (bl2) {
                        return false;
                    }
                    bl2 = super.c();
                }
                if (arrn == null) break block6;
                if (!bl2) break block7;
                for (aH aH2 : this.p.aG.a(aH.class, this.p.m().a(8.0, 4.0, 8.0))) {
                    block9: {
                        boolean bl3;
                        block8: {
                            bl2 = aH2.Q();
                            if (arrn == null) break block6;
                            if (arrn == null) break block8;
                            if (!bl2) break block9;
                            bl3 = true;
                        }
                        return bl3;
                    }
                    if (arrn != null) continue;
                }
            }
            this.p.d((B)null);
            bl2 = false;
        }
        return bl2;
    }

    @Override
    protected double a() {
        return super.a() * 0.5;
    }

    public v(aH aH2) {
        this.p = aH2;
        super(aH2, j.class, 20, true, true, null);
    }
}

