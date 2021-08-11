/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aS;
import net.minecraft.ak.h;
import net.minecraft.k.n;

class Z
extends h {
    final /* synthetic */ aS c;

    public Z(aS aS2) {
        this.c = aS2;
        this.a(1);
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public void b() {
        int[] arrn;
        n n2;
        block8: {
            n n3;
            block7: {
                n2 = this.c.g();
                arrn = S.f();
                n3 = n2;
                if (arrn == null) break block7;
                if (n3 != null) break block8;
                n3 = new n(this.c);
            }
            n2 = n3;
        }
        int n4 = 0;
        while (n4 < 3) {
            n n5 = n2.a(aS.f(this.c).nextInt(15) - 7, aS.c(this.c).nextInt(11) - 5, aS.g(this.c).nextInt(15) - 7);
            if (arrn != null) {
                if (this.c.aG.a(n5)) {
                    aS.h(this.c).a((double)n5.e() + 0.5, (double)n5.b() + 0.5, (double)n5.a() + 0.5, 0.25);
                    aS aS2 = this.c;
                    if (arrn != null) {
                        if (aS2.J() != null) break;
                        aS2 = this.c;
                    }
                    aS2.I().a((double)n5.e() + 0.5, (double)n5.b() + 0.5, (double)n5.a() + 0.5, 180.0f, 20.0f);
                    if (arrn != null) break;
                }
                ++n4;
            }
            if (arrn != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        int n2 = this.c.w().c();
        if (arrn != null) {
            if (n2 != 0) return 0 != 0;
            n2 = aS.i(this.c).nextInt(7);
        }
        if (arrn == null) return n2 != 0;
        if (n2 != 0) return 0 != 0;
        return 1 != 0;
    }
}

