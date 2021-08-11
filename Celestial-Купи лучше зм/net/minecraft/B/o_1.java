/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.E;
import net.minecraft.B.a;
import net.minecraft.B.j;
import net.minecraft.B.n;
import net.minecraft.w.d;

public class o
extends n {
    private final /* synthetic */ E l;
    private final /* synthetic */ a k;

    @Override
    public boolean a(net.minecraft.i.j j2) {
        return this.k.a(j2);
    }

    @Override
    public void a(int n2, int n3) {
        this.k.b(n2, n3);
    }

    public a a() {
        return this.k;
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        j2.a((n)this, this.k);
    }

    public o(a a10, a a11) {
        int n2;
        int n3;
        block4: {
            int n4;
            int n5 = n.c();
            n3 = n5;
            this.k = a11;
            this.l = new E(this, a11, 0, 136, 110);
            this.a(this.l);
            int n6 = 36;
            int n7 = 137;
            n2 = 0;
            while (n2 < 3) {
                block5: {
                    n4 = 0;
                    if (n3 != 0) break block4;
                    for (int i2 = v1418802; i2 < 9; ++i2) {
                        this.a(new D(a10, i2 + n2 * 9 + 9, 36 + i2 * 18, 137 + n2 * 18));
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                        }
                        break block5;
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            n4 = n2 = 0;
        }
        while (n2 < 9) {
            this.a(new D(a10, n2, 36 + n2 * 18, 195));
            ++n2;
            if (n3 == 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(net.minecraft.i.j var1_1, int var2_2) {
        block25: {
            block24: {
                block19: {
                    block15: {
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        block18: {
                                            block16: {
                                                block17: {
                                                    block13: {
                                                        block14: {
                                                            var4_3 = net.minecraft.w.d.m;
                                                            var3_4 = n.b();
                                                            v0 = var5_5 = (D)this.f.get(var2_2);
                                                            if (var3_4 != 0) {
                                                                if (v0 == null) return var4_3;
                                                                v0 = var5_5;
                                                            }
                                                            if (var3_4 != 0) {
                                                                if (v0.b() == false) return var4_3;
                                                                v0 = var5_5;
                                                            }
                                                            var6_6 = v0.d();
                                                            var4_3 = var6_6.C();
                                                            v1 = var2_2;
                                                            if (var3_4 == 0) break block13;
                                                            if (v1 != 0) break block14;
                                                            if (!this.a(var6_6, 1, 37, true)) {
                                                                return net.minecraft.w.d.m;
                                                            }
                                                            var5_5.a(var6_6, var4_3);
                                                            if (var3_4 != 0) break block15;
                                                        }
                                                        v1 = this.l.b() ? 1 : 0;
                                                    }
                                                    if (var3_4 == 0) break block16;
                                                    if (v1 != 0) break block17;
                                                    v1 = this.l.d(var6_6) ? 1 : 0;
                                                    if (var3_4 == 0) break block16;
                                                    if (v1 == 0) break block17;
                                                    v1 = var6_6.t();
                                                    v2 = 1;
                                                    if (var3_4 == 0) break block18;
                                                    if (v1 != v2) break block17;
                                                    v1 = this.a(var6_6, 0, 1, false) ? 1 : 0;
                                                    if (var3_4 == 0) break block19;
                                                    if (v1 == 0) {
                                                        return net.minecraft.w.d.m;
                                                    }
                                                    break block15;
                                                }
                                                v1 = var2_2;
                                            }
                                            v2 = 1;
                                        }
                                        if (var3_4 == 0) break block20;
                                        if (v1 < v2) break block21;
                                        v1 = var2_2;
                                        v2 = 28;
                                        if (var3_4 == 0) break block20;
                                        if (v1 >= v2) break block21;
                                        v1 = this.a(var6_6, 28, 37, false) ? 1 : 0;
                                        if (var3_4 == 0) break block19;
                                        if (v1 == 0) {
                                            return net.minecraft.w.d.m;
                                        }
                                        break block15;
                                    }
                                    v1 = var2_2;
                                    if (var3_4 == 0) break block22;
                                    v2 = 28;
                                }
                                if (v1 < v2) break block23;
                                v1 = var2_2;
                                if (var3_4 == 0) break block22;
                                if (v1 >= 37) break block23;
                                v1 = this.a(var6_6, 1, 28, false) ? 1 : 0;
                                if (var3_4 == 0) break block19;
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                }
                                break block15;
                            }
                            v1 = this.a(var6_6, 1, 37, false) ? 1 : 0;
                        }
                        if (var3_4 != 0) {
                            if (v1 == 0) {
                                return net.minecraft.w.d.m;
                            } else {
                                ** GOTO lbl73
                            }
                        }
                        break block19;
                    }
                    v1 = var6_6.G() ? 1 : 0;
                }
                if (v1 == 0) break block24;
                var5_5.a(net.minecraft.w.d.m);
                if (var3_4 != 0) break block25;
            }
            var5_5.f();
        }
        v3 = var6_6;
        if (var3_4 == 0) return var4_3;
        if (v3.t() == var4_3.t()) {
            return net.minecraft.w.d.m;
        }
        v3 = var5_5.a(var1_1, var6_6);
        return var4_3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void b(net.minecraft.i.j j2) {
        block2: {
            d d10;
            o o2;
            block1: {
                int n2 = n.b();
                o2 = this;
                if (n2 == 0) break block1;
                super.b(j2);
                if (j2.aG.C) break block2;
                o2 = this;
            }
            if (!(d10 = o2.l.b(this.l.a())).G()) {
                j2.a(d10, false);
            }
        }
    }
}

