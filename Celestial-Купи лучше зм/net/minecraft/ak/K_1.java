/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.B.b;
import net.minecraft.W.Z;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ag.W;
import net.minecraft.ah.z;
import net.minecraft.ak.J;
import net.minecraft.ak.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class K
extends J {
    private /* synthetic */ boolean k;
    private final /* synthetic */ W m;
    private /* synthetic */ int l;
    private /* synthetic */ boolean n;

    @Override
    protected boolean a(z z2, n n2) {
        int n3;
        block12: {
            block5: {
                boolean bl2;
                block13: {
                    block14: {
                        i i2;
                        String string;
                        block6: {
                            i i3;
                            block7: {
                                int n4;
                                block10: {
                                    block11: {
                                        block9: {
                                            block8: {
                                                net.minecraft.W.K k2;
                                                block4: {
                                                    k2 = z2.d(n2).b();
                                                    string = net.minecraft.ak.h.h();
                                                    if (string != null) break block4;
                                                    if (k2 != g.cU) break block5;
                                                    n2 = n2.a();
                                                }
                                                i2 = i3 = z2.d(n2);
                                                if (string != null) break block6;
                                                k2 = i2.b();
                                                if (!(k2 instanceof Z)) break block7;
                                                n4 = ((Z)k2).b(i3);
                                                if (string != null) break block8;
                                                if (n4 == 0) break block7;
                                                n4 = this.n;
                                            }
                                            if (string != null) break block9;
                                            if (n4 == 0) break block7;
                                            n4 = this.l;
                                        }
                                        if (string != null) break block10;
                                        if (n4 == 0) break block11;
                                        n4 = this.l;
                                        if (string != null) break block10;
                                        if (n4 >= 0) break block7;
                                    }
                                    this.l = 0;
                                    n4 = 1;
                                }
                                return n4 != 0;
                            }
                            i2 = i3;
                        }
                        if (i2.o() != net.minecraft.ac.c.A) break block5;
                        n3 = this.k;
                        if (string != null) break block12;
                        if (n3 == 0) break block5;
                        bl2 = this.l;
                        if (string != null) break block13;
                        if (bl2) break block14;
                        n3 = this.l;
                        if (string != null) break block12;
                        if (n3 >= 0) break block5;
                    }
                    this.l = 1;
                    bl2 = true;
                }
                return bl2;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    @Override
    public void b() {
        block10: {
            block14: {
                K k2;
                block8: {
                    block13: {
                        int n2;
                        i i2;
                        n n3;
                        z z2;
                        String string;
                        block11: {
                            block12: {
                                K k3;
                                block9: {
                                    super.b();
                                    String string2 = net.minecraft.ak.h.h();
                                    this.m.I().a((double)this.h.e() + 0.5, this.h.b() + 1, (double)this.h.a() + 0.5, 10.0f, this.m.j());
                                    string = string2;
                                    k3 = this;
                                    if (string != null) break block9;
                                    if (!k3.b()) break block10;
                                    k3 = this;
                                }
                                z2 = k3.m.aG;
                                n3 = this.h.a();
                                i2 = z2.d(n3);
                                net.minecraft.W.K k4 = i2.b();
                                n2 = this.l;
                                if (string != null) break block11;
                                if (n2 != 0) break block12;
                                n2 = k4 instanceof Z;
                                if (string != null) break block11;
                                if (n2 == 0) break block12;
                                n2 = ((Z)k4).b(i2) ? 1 : 0;
                                if (string != null) break block11;
                                if (n2 == 0) break block12;
                                z2.a(n3, true);
                                if (string == null) break block13;
                            }
                            k2 = this;
                            if (string != null) break block14;
                            n2 = k2.l;
                        }
                        if (n2 != 1 || i2.o() != net.minecraft.ac.c.A) break block13;
                        b b10 = this.m.b();
                        for (int i3 = 0; i3 < b10.e(); ++i3) {
                            boolean bl2;
                            d d10;
                            block15: {
                                boolean bl3;
                                block16: {
                                    k k5;
                                    k k6;
                                    block21: {
                                        block22: {
                                            block19: {
                                                block20: {
                                                    block17: {
                                                        block18: {
                                                            d10 = b10.a(i3);
                                                            bl3 = false;
                                                            if (string != null) break block8;
                                                            bl2 = d10.G();
                                                            if (string != null) break block15;
                                                            if (bl2) break block16;
                                                            k6 = d10.w();
                                                            k5 = net.minecraft.u.h.a6;
                                                            if (string != null) break block17;
                                                            if (k6 != k5) break block18;
                                                            z2.a(n3, g.c3.d(), 3);
                                                            bl3 = true;
                                                            if (string == null) break block16;
                                                        }
                                                        k6 = d10.w();
                                                        k5 = net.minecraft.u.h.f;
                                                    }
                                                    if (string != null) break block19;
                                                    if (k6 != k5) break block20;
                                                    z2.a(n3, g.ca.d(), 3);
                                                    bl3 = true;
                                                    if (string == null) break block16;
                                                }
                                                k6 = d10.w();
                                                k5 = net.minecraft.u.h.aG;
                                            }
                                            if (string != null) break block21;
                                            if (k6 != k5) break block22;
                                            z2.a(n3, g.b4.d(), 3);
                                            bl3 = true;
                                            if (string == null) break block16;
                                        }
                                        k6 = d10.w();
                                        k5 = net.minecraft.u.h.bR;
                                    }
                                    if (k6 == k5) {
                                        z2.a(n3, g.K.d(), 3);
                                        bl3 = true;
                                    }
                                }
                                bl2 = bl3;
                            }
                            if (string == null) {
                                if (!bl2) continue;
                                d10.b(1);
                                if (string != null) break block8;
                                bl2 = d10.G();
                            }
                            if (!bl2) break;
                            b10.a(i3, d.m);
                            if (string == null) break;
                            if (string == null) continue;
                        }
                    }
                    this.l = -1;
                }
                k2 = this;
            }
            k2.c = 10;
        }
    }

    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.c;
        if (string == null) {
            if (bl2 <= false) {
                K k2 = this;
                if (string == null) {
                    if (!k2.m.aG.M().c("mobGriefing")) {
                        return false;
                    }
                    this.l = -1;
                    this.k = this.m.z();
                    k2 = this;
                }
                k2.n = this.m.U();
            }
            bl2 = super.c();
        }
        return bl2;
    }

    public K(W w2, double d10) {
        super(w2, d10, 16);
        this.m = w2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.l;
        if (string == null) {
            if (bl2 < false) return false;
            bl2 = super.e();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

