/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.aF;
import net.minecraft.U.B;
import net.minecraft.ah.e;
import net.minecraft.ak.h;
import net.minecraft.u.E;
import net.minecraft.z.q;

class J
extends h {
    final /* synthetic */ aF d;
    private /* synthetic */ int c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        B b10 = this.d.J();
        int[] arrn = S.f();
        B b11 = b10;
        if (arrn != null) {
            if (b11 == null) return false;
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        if (this.d.aG.g() == e.PEACEFUL) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block3: {
            J j2;
            block6: {
                block7: {
                    block5: {
                        double d10;
                        aF aF2;
                        int[] arrn;
                        block4: {
                            B b10;
                            block2: {
                                arrn = S.f();
                                b10 = this.d;
                                if (arrn == null) break block2;
                                if (b10.aG.g() == e.PEACEFUL) break block3;
                                --this.c;
                                b10 = this.d.J();
                            }
                            aF2 = b10;
                            this.d.I().a(aF2, 180.0f, 180.0f);
                            double d11 = this.d.s(aF2);
                            double d12 = d11 - 400.0;
                            d10 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                            if (arrn == null) break block4;
                            if (d10 >= 0) break block5;
                            j2 = this;
                            if (arrn == null) break block6;
                            d10 = j2.c;
                        }
                        if (d10 > 0) break block7;
                        this.c = 20 + aF.a(this.d).nextInt(10) * 20 / 2;
                        q q2 = new q(this.d.aG, this.d, aF2, this.d.c().g());
                        this.d.aG.f(q2);
                        this.d.a(E.g6, 2.0f, (aF.c(this.d).nextFloat() - aF.b(this.d).nextFloat()) * 0.2f + 1.0f);
                        if (arrn != null) break block7;
                    }
                    this.d.d((B)null);
                }
                j2 = this;
            }
            super.b();
        }
    }

    @Override
    public void a() {
        this.c = 20;
        this.d.a(100);
    }

    @Override
    public void g() {
        this.d.a(0);
    }

    public J(aF aF2) {
        this.d = aF2;
        this.a(3);
    }
}

