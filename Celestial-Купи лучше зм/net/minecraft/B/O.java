/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.B.y;
import net.minecraft.W.bv;
import net.minecraft.ah.z;
import net.minecraft.i.j;
import net.minecraft.u.g;
import net.minecraft.w.d;

class O
extends D {
    final /* synthetic */ y g;
    final /* synthetic */ z f;
    final /* synthetic */ net.minecraft.k.n h;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(j j2) {
        int n2;
        int n3;
        block4: {
            block5: {
                n3 = n.b();
                n2 = j2.cw.g;
                if (n3 == 0) break block4;
                if (n2 != 0) break block5;
                n2 = j2.b4;
                if (n3 == 0) break block4;
                if (n2 < this.g.m) return 0 != 0;
            }
            n2 = this.g.m;
        }
        if (n3 != 0) {
            if (n2 <= 0) return 0 != 0;
            n2 = this.b();
        }
        if (n3 == 0) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    O(y y2, a a10, int n2, int n3, int n4, z z2, net.minecraft.k.n n5) {
        this.g = y2;
        this.f = z2;
        this.h = n5;
        super(a10, n2, n3, n4);
    }

    @Override
    public boolean d(d d10) {
        return false;
    }

    @Override
    public d a(j j2, d d10) {
        block26: {
            z z2;
            block27: {
                int n2;
                block21: {
                    int n3;
                    block22: {
                        block25: {
                            block23: {
                                int n4;
                                int n5;
                                Object object;
                                block24: {
                                    block20: {
                                        y y2;
                                        block14: {
                                            block15: {
                                                block19: {
                                                    block17: {
                                                        d d11;
                                                        block18: {
                                                            int n6;
                                                            block16: {
                                                                int n7;
                                                                block13: {
                                                                    n3 = n.b();
                                                                    n7 = j2.cw.g;
                                                                    if (n3 == 0) break block13;
                                                                    if (n7 == 0) {
                                                                        j2.f(-this.g.m);
                                                                    }
                                                                    y.b(this.g).a(0, net.minecraft.w.d.m);
                                                                    y2 = this.g;
                                                                    if (n3 == 0) break block14;
                                                                    n7 = y.a(y2);
                                                                }
                                                                if (n7 <= 0) break block15;
                                                                object = y.b(this.g).a(1);
                                                                n6 = ((d)object).G();
                                                                if (n3 == 0) break block16;
                                                                if (n6 != 0) break block17;
                                                                d11 = object;
                                                                if (n3 == 0) break block18;
                                                                n6 = d11.t();
                                                            }
                                                            if (n6 <= y.a(this.g)) break block17;
                                                            d11 = object;
                                                        }
                                                        d11.b(y.a(this.g));
                                                        y.b(this.g).a(1, (d)object);
                                                        if (n3 != 0) break block19;
                                                    }
                                                    y.b(this.g).a(1, net.minecraft.w.d.m);
                                                }
                                                if (n3 != 0) break block20;
                                            }
                                            y2 = this.g;
                                        }
                                        y.b(y2).a(1, net.minecraft.w.d.m);
                                    }
                                    this.g.m = 0;
                                    object = this.f.d(this.h);
                                    n2 = j2.cw.g;
                                    if (n3 == 0) break block21;
                                    if (n2 != 0) break block22;
                                    n2 = this.f.C;
                                    if (n3 == 0) break block21;
                                    if (n2 != 0 || object.b() != net.minecraft.u.g.cb) break block22;
                                    float f10 = j2.f().nextFloat() - 0.12f;
                                    n2 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                    if (n3 == 0) break block21;
                                    if (n2 >= 0) break block22;
                                    n5 = object.b(bv.E);
                                    n4 = ++n5;
                                    if (n3 == 0) break block23;
                                    if (n4 <= 2) break block24;
                                    this.f.v(this.h);
                                    this.f.b(1029, this.h, 0);
                                    if (n3 != 0) break block25;
                                }
                                n4 = this.f.a(this.h, object.a(bv.E, n5), 2) ? 1 : 0;
                            }
                            this.f.b(1030, this.h, 0);
                        }
                        if (n3 != 0) break block26;
                    }
                    z2 = this.f;
                    if (n3 == 0) break block27;
                    n2 = z2.C;
                }
                if (n2 != 0) break block26;
                z2 = this.f;
            }
            z2.b(1030, this.h, 0);
        }
        return d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

