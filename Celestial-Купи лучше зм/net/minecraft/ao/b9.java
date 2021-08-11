/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.ao.aN;
import net.minecraft.ao.b6;
import net.minecraft.ao.u;
import net.minecraft.u.g;

class b9
extends b6 {
    @Override
    public void a(Random random, int n2, int n3, int n4, boolean bl2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = u.b();
                    if (arrstring == null) break block0;
                    if (!(random.nextFloat() < 0.4f)) break block1;
                    this.a = g.cW.d();
                }
                if (arrstring != null) break block2;
            }
            this.a = g.x.d();
        }
    }

    private b9() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    b9(aN aN2) {
        this();
    }
}

