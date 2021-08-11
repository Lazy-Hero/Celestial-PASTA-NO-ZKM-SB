/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.M;
import net.minecraft.B.N;
import net.minecraft.B.P;
import net.minecraft.B.X;
import net.minecraft.B.a;
import net.minecraft.B.i;
import net.minecraft.B.l;
import net.minecraft.B.m;
import net.minecraft.B.n;
import net.minecraft.U.C;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class x
extends n {
    public /* synthetic */ boolean n;
    private static final /* synthetic */ X[] k;
    public /* synthetic */ l o;
    public /* synthetic */ m m;
    private final /* synthetic */ j l;

    @Override
    public boolean a(j j2) {
        return true;
    }

    @Override
    public void b(j j2) {
        block3: {
            x x2;
            block2: {
                int n2 = net.minecraft.B.n.c();
                super.b(j2);
                int n3 = n2;
                x2 = this;
                if (n3 != 0) break block2;
                x2.o.d();
                if (j2.aG.C) break block3;
                x2 = this;
            }
            x2.a(j2, j2.aG, this.m);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(j var1_1, int var2_2) {
        block17: {
            block39: {
                block38: {
                    block24: {
                        block21: {
                            block36: {
                                block37: {
                                    block34: {
                                        block35: {
                                            block33: {
                                                block32: {
                                                    block31: {
                                                        block28: {
                                                            block29: {
                                                                block30: {
                                                                    block26: {
                                                                        block27: {
                                                                            block25: {
                                                                                block22: {
                                                                                    block23: {
                                                                                        block19: {
                                                                                            block20: {
                                                                                                block18: {
                                                                                                    block16: {
                                                                                                        var4_3 = net.minecraft.w.d.m;
                                                                                                        var3_4 = net.minecraft.B.n.c();
                                                                                                        v0 = var5_5 = (D)this.f.get(var2_2);
                                                                                                        if (var3_4 != 0) break block16;
                                                                                                        if (v0 == null) break block17;
                                                                                                        v0 = var5_5;
                                                                                                    }
                                                                                                    if (var3_4 != 0) break block18;
                                                                                                    if (!v0.b()) break block17;
                                                                                                    v0 = var5_5;
                                                                                                }
                                                                                                var6_6 = v0.d();
                                                                                                var4_3 = var6_6.C();
                                                                                                var7_7 = C.a(var4_3);
                                                                                                v1 = var2_2;
                                                                                                if (var3_4 != 0) break block19;
                                                                                                if (v1 != 0) break block20;
                                                                                                if (!this.a(var6_6, 9, 45, true)) {
                                                                                                    return net.minecraft.w.d.m;
                                                                                                }
                                                                                                var5_5.a(var6_6, var4_3);
                                                                                                if (var3_4 == 0) break block21;
                                                                                            }
                                                                                            v1 = var2_2;
                                                                                        }
                                                                                        v2 = 1;
                                                                                        if (var3_4 != 0) break block22;
                                                                                        if (v1 < v2) break block23;
                                                                                        v1 = var2_2;
                                                                                        v2 = 5;
                                                                                        if (var3_4 != 0) break block22;
                                                                                        if (v1 >= v2) break block23;
                                                                                        v1 = this.a(var6_6, 9, 45, false) ? 1 : 0;
                                                                                        if (var3_4 != 0) break block24;
                                                                                        if (v1 == 0) {
                                                                                            return net.minecraft.w.d.m;
                                                                                        }
                                                                                        break block21;
                                                                                    }
                                                                                    v1 = var2_2;
                                                                                    v2 = 5;
                                                                                }
                                                                                if (var3_4 != 0) break block25;
                                                                                if (v1 < v2) break block26;
                                                                                v1 = var2_2;
                                                                                if (var3_4 != 0) break block27;
                                                                                v2 = 9;
                                                                            }
                                                                            if (v1 >= v2) break block26;
                                                                            v1 = this.a(var6_6, 9, 45, false) ? 1 : 0;
                                                                        }
                                                                        if (var3_4 != 0) break block24;
                                                                        if (v1 == 0) {
                                                                            return net.minecraft.w.d.m;
                                                                        }
                                                                        break block21;
                                                                    }
                                                                    v3 /* !! */  = var7_7;
                                                                    if (var3_4 != 0) break block28;
                                                                    if (v3 /* !! */ .b() != i.ARMOR) break block29;
                                                                    v4 = ((D)this.f.get(8 - var7_7.a())).b();
                                                                    if (var3_4 != 0) break block30;
                                                                    if (v4 != 0) break block29;
                                                                    v4 = 8 - var7_7.a();
                                                                }
                                                                if (!this.a(var6_6, var8_8 = v4, var8_8 + 1, false)) {
                                                                    return net.minecraft.w.d.m;
                                                                }
                                                                if (var3_4 == 0) break block21;
                                                            }
                                                            v3 /* !! */  = var7_7;
                                                        }
                                                        if (var3_4 != 0) break block31;
                                                        if (v3 /* !! */  != X.OFFHAND) break block32;
                                                        v3 /* !! */  = this.f.get(45);
                                                    }
                                                    v1 = ((D)v3 /* !! */ ).b() ? 1 : 0;
                                                    if (var3_4 != 0) break block33;
                                                    if (v1 != 0) break block32;
                                                    v1 = this.a(var6_6, 45, 46, false) ? 1 : 0;
                                                    if (var3_4 != 0) break block24;
                                                    if (v1 == 0) {
                                                        return net.minecraft.w.d.m;
                                                    }
                                                    break block21;
                                                }
                                                v1 = var2_2;
                                            }
                                            v5 = 9;
                                            if (var3_4 != 0) break block34;
                                            if (v1 < v5) break block35;
                                            v1 = var2_2;
                                            v5 = 36;
                                            if (var3_4 != 0) break block34;
                                            if (v1 >= v5) break block35;
                                            v1 = this.a(var6_6, 36, 45, false) ? 1 : 0;
                                            if (var3_4 != 0) break block24;
                                            if (v1 == 0) {
                                                return net.minecraft.w.d.m;
                                            }
                                            break block21;
                                        }
                                        v1 = var2_2;
                                        if (var3_4 != 0) break block36;
                                        v5 = 36;
                                    }
                                    if (v1 < v5) break block37;
                                    v1 = var2_2;
                                    if (var3_4 != 0) break block36;
                                    if (v1 >= 45) break block37;
                                    v1 = this.a(var6_6, 9, 36, false) ? 1 : 0;
                                    if (var3_4 != 0) break block24;
                                    if (v1 == 0) {
                                        return net.minecraft.w.d.m;
                                    }
                                    break block21;
                                }
                                v1 = this.a(var6_6, 9, 45, false) ? 1 : 0;
                            }
                            if (var3_4 == 0) {
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                } else {
                                    ** GOTO lbl117
                                }
                            }
                            break block24;
                        }
                        v1 = var6_6.G() ? 1 : 0;
                    }
                    if (v1 == 0) break block38;
                    var5_5.a(net.minecraft.w.d.m);
                    if (var3_4 == 0) break block39;
                }
                var5_5.f();
            }
            v6 = var6_6;
            if (var3_4 == 0) {
                if (v6.t() == var4_3.t()) {
                    return net.minecraft.w.d.m;
                }
                v6 = var5_5.a(var1_1, var6_6);
            }
            if (var3_4 != 0) return v6;
            var8_9 = v6;
            if (var2_2 == 0) {
                var1_1.a(var8_9, false);
            }
        }
        v6 = var4_3;
        return v6;
    }

    static {
        k = new X[]{X.HEAD, X.CHEST, X.LEGS, X.FEET};
    }

    @Override
    public void a(a a10) {
        this.a(this.l.aG, this.l, this.m, this.o);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, D d11) {
        int n2 = net.minecraft.B.n.c();
        if (d11.c == this.o) return false;
        boolean bl2 = super.a(d10, d11);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public x(h h2, boolean bl2, j j2) {
        block15: {
            int n2;
            int n3;
            block13: {
                int n4;
                block12: {
                    block10: {
                        int n5;
                        int n6 = net.minecraft.B.n.c();
                        this.m = new m(this, 2, 2);
                        this.o = new l();
                        this.n = bl2;
                        this.l = j2;
                        this.a(new P(h2.g, this.m, this.o, 0, 154, 28));
                        n3 = 0;
                        n2 = n6;
                        while (n3 < 2) {
                            block11: {
                                n5 = 0;
                                if (n2 != 0) break block10;
                                for (int i2 = v1407436; i2 < 2; ++i2) {
                                    this.a(new D(this.m, i2 + n3 * 2, 98 + i2 * 18, 18 + n3 * 18));
                                    if (n2 == 0) {
                                        if (n2 == 0) continue;
                                    }
                                    break block11;
                                }
                                ++n3;
                            }
                            if (n2 == 0) continue;
                        }
                        n5 = n3 = 0;
                    }
                    while (n3 < 4) {
                        X x2 = k[n3];
                        this.a(new M(this, h2, 36 + (3 - n3), 8, 8 + n3 * 18, x2));
                        ++n3;
                        if (n2 == 0) {
                            if (n2 == 0) continue;
                        }
                        break block12;
                    }
                    n3 = 0;
                }
                while (n3 < 3) {
                    block14: {
                        n4 = 0;
                        if (n2 != 0) break block13;
                        for (int i3 = v1407496; i3 < 9; ++i3) {
                            this.a(new D(h2, i3 + (n3 + 1) * 9, 8 + i3 * 18, 84 + n3 * 18));
                            if (n2 == 0) {
                                if (n2 == 0) continue;
                            }
                            break block14;
                        }
                        ++n3;
                    }
                    if (n2 == 0) continue;
                }
                n4 = n3 = 0;
            }
            while (n3 < 9) {
                this.a(new D(h2, n3, 8 + n3 * 18, 142));
                ++n3;
                if (n2 == 0) {
                    if (n2 == 0) continue;
                }
                break block15;
            }
            this.a(new N(this, h2, 40, 77, 62));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

