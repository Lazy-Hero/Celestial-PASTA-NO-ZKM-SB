/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import java.util.Random;
import net.minecraft.T.S;
import net.minecraft.T.ah;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;

class D
extends net.minecraft.ak.h {
    private final /* synthetic */ ah c;

    @Override
    public boolean c() {
        int[] arrn = S.f();
        ah ah2 = this.c;
        if (arrn != null) {
            if (ah2.Q() == null) {
                return false;
            }
            ah2 = this.c;
        }
        int n2 = ah2.aG.M().c("mobGriefing");
        if (arrn != null) {
            if (n2 == 0) {
                return false;
            }
            n2 = this.c.f().nextInt(2000);
        }
        if (arrn != null) {
            n2 = n2 == 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    @Override
    public void b() {
        block2: {
            block3: {
                Random random = this.c.f();
                z z2 = this.c.aG;
                int n2 = h.f(this.c.a - 1.0 + random.nextDouble() * 2.0);
                int n3 = h.f(this.c.aF + random.nextDouble() * 2.0);
                int[] arrn = S.f();
                int n4 = h.f(this.c.ax - 1.0 + random.nextDouble() * 2.0);
                n n5 = new n(n2, n3, n4);
                i i2 = z2.d(n5);
                i i3 = z2.d(n5.k());
                i i4 = this.c.Q();
                if (i4 == null) break block2;
                boolean bl2 = this.a(z2, n5, i4.b(), i2, i3);
                if (arrn == null) break block3;
                if (!bl2) break block2;
                bl2 = z2.a(n5, i4, 3);
            }
            this.c.b((i)null);
        }
    }

    public D(ah ah2) {
        this.c = ah2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private boolean a(z z2, n n2, K k2, i i2, i i3) {
        i i4;
        block11: {
            c c10;
            c c11;
            block10: {
                int[] arrn;
                block9: {
                    boolean bl2;
                    block8: {
                        arrn = S.f();
                        bl2 = k2.a(z2, n2);
                        if (arrn == null) break block8;
                        if (bl2) break block9;
                        bl2 = false;
                    }
                    return bl2;
                }
                c11 = i2.o();
                c10 = net.minecraft.ac.c.A;
                if (arrn == null) break block10;
                if (c11 != c10) {
                    return false;
                }
                i4 = i3;
                if (arrn == null) break block11;
                c11 = i4.o();
                c10 = net.minecraft.ac.c.A;
            }
            if (c11 == c10) {
                return false;
            }
            i4 = i3;
        }
        return i4.k();
    }
}

