/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import java.util.Random;
import net.minecraft.T.S;
import net.minecraft.T.a3;
import net.minecraft.U.D;
import net.minecraft.W.b8;
import net.minecraft.W.d1;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ak.a9;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

class B
extends a9 {
    private /* synthetic */ aA k;
    private /* synthetic */ boolean j;

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        block4: {
            block5: {
                B b10;
                int[] arrn;
                block2: {
                    block3: {
                        arrn = S.f();
                        b10 = this;
                        if (arrn == null) break block2;
                        if (b10.j) break block3;
                        super.a();
                        if (arrn != null) break block4;
                    }
                    b10 = this;
                }
                z z2 = b10.e.aG;
                n n2 = new n(this.e.a, this.e.aF + 0.5, this.e.ax).a(this.k);
                i i2 = z2.d(n2);
                boolean bl2 = b8.a(i2);
                if (arrn == null) break block5;
                if (!bl2) break block4;
                bl2 = z2.a(n2, net.minecraft.u.g.be.d().a(b8.z, d1.a(i2)), 3);
            }
            this.e.Z();
            this.e.a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        int[] arrn = S.f();
        D d10 = this.e;
        if (arrn != null) {
            if (d10.J() != null) {
                return false;
            }
            d10 = this.e;
        }
        if (arrn != null) {
            if (!d10.l().o()) {
                return false;
            }
            d10 = this.e;
        }
        Random random = d10.f();
        int n2 = this.e.aG.M().c("mobGriefing");
        if (arrn == null) return n2 != 0;
        if (n2 != 0) {
            n2 = random.nextInt(10);
            if (arrn == null) return n2 != 0;
            if (n2 == 0) {
                this.k = aA.a(random);
                n n3 = new n(this.e.a, this.e.aF + 0.5, this.e.ax).a(this.k);
                i i2 = this.e.aG.d(n3);
                n2 = b8.a(i2) ? 1 : 0;
                if (arrn == null) return n2 != 0;
                if (n2 != 0) {
                    this.j = true;
                    return true;
                }
            }
        }
        this.j = false;
        n2 = super.c() ? 1 : 0;
        return n2 != 0;
    }

    public B(a3 a32) {
        super(a32, 1.0, 10);
        this.a(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int[] arrn = S.f();
        boolean bl2 = this.j;
        if (arrn != null) {
            if (bl2) return false;
            bl2 = super.e();
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }
}

