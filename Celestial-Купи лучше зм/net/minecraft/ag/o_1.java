/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.W.K;
import net.minecraft.W.a1;
import net.minecraft.Z.i;
import net.minecraft.ag.A;
import net.minecraft.ag.P;
import net.minecraft.ah.z;
import net.minecraft.ak.J;
import net.minecraft.k.n;
import net.minecraft.u.g;

class o
extends J {
    private final /* synthetic */ P m;
    private /* synthetic */ boolean k;
    private /* synthetic */ boolean l;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(z z2, n n2) {
        K k2 = z2.d(n2).b();
        String[] arrstring = A.b();
        if (k2 != g.cU) return false;
        boolean bl2 = this.l;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = this.k;
        if (arrstring == null) return bl2;
        if (bl2) return false;
        n2 = n2.a();
        i i2 = z2.d(n2);
        k2 = i2.b();
        bl2 = k2 instanceof a1;
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        bl2 = ((a1)k2).b(i2);
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        this.k = true;
        return true;
    }

    @Override
    public void b() {
        block3: {
            block4: {
                o o2;
                block5: {
                    block8: {
                        i i2;
                        n n2;
                        z z2;
                        block6: {
                            int n3;
                            Integer n4;
                            block7: {
                                o o3;
                                String[] arrstring;
                                block2: {
                                    String[] arrstring2 = A.b();
                                    super.b();
                                    arrstring = arrstring2;
                                    this.m.I().a((double)this.h.e() + 0.5, this.h.b() + 1, (double)this.h.a() + 0.5, 10.0f, this.m.j());
                                    o3 = this;
                                    if (arrstring == null) break block2;
                                    if (!o3.b()) break block3;
                                    o3 = this;
                                }
                                z2 = o3.m.aG;
                                n2 = this.h.a();
                                i2 = z2.d(n2);
                                K k2 = i2.b();
                                o2 = this;
                                if (arrstring == null) break block4;
                                if (!o2.k || !(k2 instanceof a1)) break block5;
                                n4 = i2.b(a1.A);
                                n3 = n4;
                                if (arrstring == null) break block6;
                                if (n3 != 0) break block7;
                                z2.a(n2, g.bf.d(), 2);
                                z2.a(n2, true);
                                if (arrstring != null) break block8;
                            }
                            n3 = z2.a(n2, i2.a(a1.A, n4 - 1), 2) ? 1 : 0;
                        }
                        z2.b(2001, n2, K.l(i2));
                    }
                    this.m.n();
                }
                this.k = false;
                o2 = this;
            }
            o2.c = 10;
        }
    }

    @Override
    public boolean c() {
        String[] arrstring = A.b();
        boolean bl2 = this.c;
        if (arrstring != null) {
            if (bl2 <= false) {
                o o2 = this;
                if (arrstring != null) {
                    if (!o2.m.aG.M().c("mobGriefing")) {
                        return false;
                    }
                    this.k = false;
                    this.l = P.b(this.m);
                    o2 = this;
                }
                o2.l = true;
            }
            bl2 = super.c();
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String[] arrstring = A.b();
        boolean bl2 = this.k;
        if (arrstring != null) {
            if (!bl2) return false;
            bl2 = super.e();
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public o(P p2) {
        super(p2, 0.7f, 16);
        this.m = p2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

