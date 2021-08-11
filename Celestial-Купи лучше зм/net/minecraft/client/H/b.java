/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.H;

import net.minecraft.ah.s;
import net.minecraft.ar.A;
import net.minecraft.ar.a6;
import net.minecraft.at.k;
import net.minecraft.client.H.d;
import net.minecraft.client.H.e;
import net.minecraft.client.H.f;
import net.minecraft.client.n.i;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class b
implements e {
    private static final /* synthetic */ k i;
    private static final /* synthetic */ k j;
    private /* synthetic */ int c;
    private /* synthetic */ int h;
    private static final /* synthetic */ k f;
    private /* synthetic */ int b;
    private /* synthetic */ i k;
    private /* synthetic */ boolean n;
    private /* synthetic */ boolean d;
    private final /* synthetic */ d e;
    private /* synthetic */ i a;
    private /* synthetic */ int l;
    private static final /* synthetic */ k m;
    private /* synthetic */ int g;

    @Override
    public void a() {
        block6: {
            i i2;
            block5: {
                boolean bl2 = net.minecraft.client.H.d.a();
                i2 = this.k;
                if (bl2) {
                    if (i2 != null) {
                        this.k.a();
                        this.k = null;
                    }
                    i2 = this.a;
                }
                if (!bl2) break block5;
                if (i2 == null) break block6;
                i2 = this.a;
            }
            i2.a();
            this.a = null;
        }
    }

    @Override
    public void a(a6 a62) {
        block5: {
            block1: {
                boolean bl2;
                block4: {
                    boolean bl3;
                    block3: {
                        block2: {
                            block0: {
                                bl3 = net.minecraft.client.H.d.a();
                                bl2 = a62.g;
                                if (!bl3) break block0;
                                if (bl2) break block1;
                                bl2 = a62.c;
                            }
                            if (!bl3) break block2;
                            if (bl2) break block1;
                            bl2 = a62.f;
                        }
                        if (!bl3) break block3;
                        if (bl2) break block1;
                        bl2 = a62.b;
                    }
                    if (!bl3) break block4;
                    if (bl2) break block1;
                    bl2 = a62.h;
                }
                if (!bl2) break block5;
            }
            this.d = true;
        }
    }

    @Override
    public void a(A a10) {
        block2: {
            block1: {
                double d10;
                block0: {
                    boolean bl2 = net.minecraft.client.H.d.f();
                    double d11 = (double)net.minecraft.k.h.g(a10.b) - 0.01;
                    d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                    if (bl2) break block0;
                    if (d10 > 0) break block1;
                    double d12 = (double)net.minecraft.k.h.g(a10.a) - 0.01;
                    d10 = d12 == 0.0 ? 0 : (d12 > 0.0 ? 1 : -1);
                }
                if (d10 <= 0) break block2;
            }
            this.n = true;
        }
    }

    static {
        m = new net.minecraft.at.h("tutorial.move.title", net.minecraft.client.H.d.a("forward"), net.minecraft.client.H.d.a("left"), net.minecraft.client.H.d.a("back"), net.minecraft.client.H.d.a("right"));
        i = new net.minecraft.at.h("tutorial.move.description", net.minecraft.client.H.d.a("jump"));
        f = new net.minecraft.at.h("tutorial.look.title", new Object[0]);
        j = new net.minecraft.at.h("tutorial.look.description", new Object[0]);
    }

    public b(d d10) {
        this.l = -1;
        this.b = -1;
        this.e = d10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b() {
        block35: {
            b b10;
            block42: {
                boolean bl2;
                block41: {
                    int n2;
                    int n3;
                    block40: {
                        block39: {
                            block36: {
                                b b11;
                                block38: {
                                    block37: {
                                        block34: {
                                            b b12;
                                            block33: {
                                                i i2;
                                                block32: {
                                                    b b13;
                                                    block28: {
                                                        block29: {
                                                            d d10;
                                                            block30: {
                                                                block31: {
                                                                    int n4;
                                                                    int n5;
                                                                    block26: {
                                                                        block27: {
                                                                            block24: {
                                                                                block25: {
                                                                                    ++this.h;
                                                                                    bl2 = net.minecraft.client.H.d.a();
                                                                                    n5 = this.d;
                                                                                    if (bl2) {
                                                                                        if (n5 != 0) {
                                                                                            ++this.c;
                                                                                            this.d = false;
                                                                                        }
                                                                                        n5 = this.n;
                                                                                    }
                                                                                    if (bl2) {
                                                                                        if (n5 != 0) {
                                                                                            ++this.g;
                                                                                            this.n = false;
                                                                                        }
                                                                                        n5 = this.l;
                                                                                    }
                                                                                    n4 = -1;
                                                                                    if (!bl2) break block24;
                                                                                    if (n5 != n4) break block25;
                                                                                    int n4 = this.c;
                                                                                    n4 = 40;
                                                                                    if (!bl2) break block24;
                                                                                    if (n5 > n4) {
                                                                                        b b14 = this;
                                                                                        if (bl2) {
                                                                                            if (b14.k != null) {
                                                                                                this.k.a();
                                                                                                this.k = null;
                                                                                            }
                                                                                            b14 = this;
                                                                                        }
                                                                                        b14.l = this.h;
                                                                                    }
                                                                                }
                                                                                int n4 = this.b;
                                                                                n4 = -1;
                                                                            }
                                                                            if (!bl2) break block26;
                                                                            if (n5 != n4) break block27;
                                                                            int n4 = this.g;
                                                                            n4 = 40;
                                                                            if (!bl2) break block26;
                                                                            if (n5 > n4) {
                                                                                b b15 = this;
                                                                                if (bl2) {
                                                                                    if (b15.a != null) {
                                                                                        this.a.a();
                                                                                        this.a = null;
                                                                                    }
                                                                                    b15 = this;
                                                                                }
                                                                                b15.b = this.h;
                                                                            }
                                                                        }
                                                                        b13 = this;
                                                                        if (!bl2) break block28;
                                                                        int n4 = b13.l;
                                                                        n4 = -1;
                                                                    }
                                                                    if (n5 == n4) break block29;
                                                                    b13 = this;
                                                                    if (!bl2) break block28;
                                                                    if (b13.b == -1) break block29;
                                                                    d10 = this.e;
                                                                    if (!bl2) break block30;
                                                                    if (d10.g() != s.SURVIVAL) break block31;
                                                                    this.e.a(net.minecraft.client.H.f.FIND_TREE);
                                                                    if (bl2) break block29;
                                                                    net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                                                }
                                                                d10 = this.e;
                                                            }
                                                            d10.a(net.minecraft.client.H.f.NONE);
                                                        }
                                                        b13 = this;
                                                    }
                                                    i2 = b13.k;
                                                    if (!bl2) break block32;
                                                    if (i2 != null) {
                                                        this.k.a((float)this.c / 40.0f);
                                                    }
                                                    b12 = this;
                                                    if (!bl2) break block33;
                                                    i2 = b12.a;
                                                }
                                                if (i2 != null) {
                                                    this.a.a((float)this.g / 40.0f);
                                                }
                                                b12 = this;
                                            }
                                            int n2 = b12.h;
                                            n2 = 100;
                                            if (!bl2) break block34;
                                            if (n3 < n2) break block35;
                                            int n2 = this.l;
                                            n2 = -1;
                                        }
                                        if (!bl2) break block36;
                                        if (n3 != n2) break block37;
                                        b11 = this;
                                        if (!bl2) break block38;
                                        if (b11.k != null) break block37;
                                        this.k = new i(net.minecraft.client.n.d.MOVEMENT_KEYS, m, i, true);
                                        this.e.d().ay().a(this.k);
                                        if (bl2) break block35;
                                    }
                                    b11 = this;
                                }
                                int n2 = b11.l;
                                n2 = -1;
                            }
                            if (!bl2) break block39;
                            if (n3 == n2) break block35;
                            int n2 = this.h - this.l;
                            n2 = 20;
                        }
                        if (!bl2) break block40;
                        if (n3 < n2) break block35;
                        b10 = this;
                        if (!bl2) break block41;
                        int n2 = b10.b;
                        n2 = -1;
                    }
                    if (n3 != n2) break block35;
                    b10 = this;
                }
                if (!bl2) break block42;
                if (b10.a != null) break block35;
                this.a = new i(net.minecraft.client.n.d.MOUSE, f, j, true);
                b10 = this;
            }
            b10.e.d().ay().a(this.a);
        }
    }
}

