/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.aw.z;
import net.minecraft.client.b.aX;
import net.minecraft.client.b.aZ;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.q;

class ag
implements ai {
    final /* synthetic */ aZ a;

    ag(aZ aZ2) {
        this.a = aZ2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(boolean bl2, int n2) {
        String[] arrstring = q.b();
        if (arrstring != null) {
            if (bl2) {
                aZ.c(this.a).a(new aX());
                z z2 = aZ.c(this.a).e();
                z2.a();
                z2.d(aZ.e(this.a).a());
                aZ.b(this.a).d();
            }
            aZ.c(this.a).a(aZ.a(this.a));
        }
    }
}

