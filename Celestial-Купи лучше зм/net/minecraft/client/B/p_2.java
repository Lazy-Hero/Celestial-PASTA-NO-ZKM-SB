/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.b.aZ;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.q;

class p
implements ai {
    final /* synthetic */ aZ a;

    @Override
    public void a(boolean bl2, int n2) {
        block2: {
            block1: {
                String[] arrstring;
                block0: {
                    arrstring = q.b();
                    if (arrstring == null) break block0;
                    if (!bl2) break block1;
                    aZ.d(this.a);
                }
                if (arrstring != null) break block2;
            }
            aZ.c(this.a).a(aZ.a(this.a));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    p(aZ aZ2) {
        this.a = aZ2;
    }
}

