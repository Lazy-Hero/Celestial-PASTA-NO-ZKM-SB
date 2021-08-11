/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.o.d;
import net.minecraft.o.m;
import net.minecraft.u.g;

public class f {
    private /* synthetic */ m f;
    private /* synthetic */ int c;
    private final /* synthetic */ int g;
    private final /* synthetic */ d a;
    private static /* synthetic */ int b;
    private /* synthetic */ m e;
    private /* synthetic */ int d;

    public boolean i() {
        int n2 = net.minecraft.t.f.d();
        boolean bl2 = this.d;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public static void b(int n2) {
        b = n2;
    }

    public static int e() {
        int n2 = net.minecraft.t.f.d();
        if (n2 == 0) {
            return 40;
        }
        return 0;
    }

    public f(int n2, boolean bl2) {
        block3: {
            m m2;
            block2: {
                int n3 = net.minecraft.t.f.d();
                this.g = n2;
                this.a = new d();
                int n4 = n3;
                f f10 = this;
                m2 = new m();
                if (n4 == 0) break block2;
                f10.e = m2;
                if (!bl2) break block3;
                f10 = this;
                m2 = new m();
            }
            f10.f = m2;
        }
    }

    public int b() {
        return this.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.e.a(n2, n3, n4, n5);
    }

    public void a(int n2, int n3, int n4, i i2) {
        block18: {
            block17: {
                K k2;
                block16: {
                    K k3;
                    K k4;
                    int n5;
                    block13: {
                        block15: {
                            block14: {
                                block12: {
                                    Object object;
                                    block11: {
                                        n5 = net.minecraft.t.f.d();
                                        object = cq.d;
                                        if (n5 == 0) break block11;
                                        if (!((aI)object).a(i2)) break block12;
                                        object = cq.d(i2, cq.b4, new Object[0]);
                                    }
                                    i2 = (i)object;
                                }
                                i i3 = this.c(n2, n3, n4);
                                K k5 = i3.b();
                                k4 = i2.b();
                                k2 = k5;
                                k3 = net.minecraft.u.g.bf;
                                if (n5 == 0) break block13;
                                if (k2 == k3) break block14;
                                --this.d;
                                k2 = k5;
                                if (n5 == 0) break block15;
                                if (k2.t()) {
                                    --this.c;
                                }
                            }
                            k2 = k4;
                        }
                        if (n5 == 0) break block16;
                        k3 = net.minecraft.u.g.bf;
                    }
                    if (k2 == k3) break block17;
                    ++this.d;
                    if (n5 == 0) break block18;
                    k2 = k4;
                }
                if (k2.t()) {
                    ++this.c;
                }
            }
            this.a.a(n2, n3, n4, i2);
        }
    }

    public static int d() {
        return b;
    }

    public m a() {
        return this.f;
    }

    public void a(m m2) {
        this.e = m2;
    }

    public void a(int n2, int n3, int n4, int n5) {
        this.f.a(n2, n3, n4, n5);
    }

    public i c(int n2, int n3, int n4) {
        return this.a.b(n2, n3, n4);
    }

    public boolean h() {
        int n2 = net.minecraft.t.f.d();
        boolean bl2 = this.c;
        if (n2 != 0) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    public int a(int n2, int n3, int n4) {
        return this.e.b(n2, n3, n4);
    }

    public void g() {
        block8: {
            i i2 = net.minecraft.u.g.bf.d();
            int n2 = 0;
            int n3 = net.minecraft.t.f.d();
            int n4 = 0;
            int n5 = 0;
            block0: while (true) {
                int n6 = n5;
                block1: while (n6 < 16) {
                    if (n3 == 0) break block8;
                    int n7 = 0;
                    while (n7 < 16) {
                        block9: {
                            n6 = 0;
                            if (n3 == 0) continue block1;
                            int n8 = n6;
                            while (n8 < 16) {
                                block10: {
                                    block11: {
                                        i i3 = this.a.b(n8, n5, n7);
                                        if (n3 == 0) break block9;
                                        if (n3 == 0) break block10;
                                        if (i3 == i2) break block11;
                                        ++n2;
                                        K k2 = i3.b();
                                        if (n3 == 0) break block10;
                                        if (k2.t()) {
                                            ++n4;
                                        }
                                    }
                                    ++n8;
                                }
                                if (n3 != 0) continue;
                            }
                            ++n7;
                        }
                        if (n3 != 0) continue;
                    }
                    ++n5;
                    if (n3 != 0) continue block0;
                }
                break;
            }
            this.d = n2;
            this.c = n4;
        }
    }

    public void b(m m2) {
        this.f = m2;
    }

    public int b(int n2, int n3, int n4) {
        return this.f.b(n2, n3, n4);
    }

    public d f() {
        return this.a;
    }

    public m c() {
        return this.e;
    }

    static {
        if (net.minecraft.t.f.e() != 0) {
            net.minecraft.t.f.b(99);
        }
    }
}

