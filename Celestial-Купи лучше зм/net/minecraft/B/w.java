/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.C;
import net.minecraft.B.D;
import net.minecraft.B.S;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.U.e;
import net.minecraft.ah.z;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class w
extends n {
    private final /* synthetic */ C l;
    private final /* synthetic */ z m;
    private final /* synthetic */ e k;

    @Override
    public void a(a a10) {
        this.l.a();
        super.a(a10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public C a() {
        return this.l;
    }

    public w(h h2, e e10, z z2) {
        int n2;
        int n3;
        block4: {
            int n4;
            this.k = e10;
            this.m = z2;
            n3 = n.b();
            this.l = new C(h2.g, e10);
            this.a(new D(this.l, 0, 36, 53));
            this.a(new D(this.l, 1, 62, 53));
            this.a(new S(h2.g, e10, this.l, 2, 120, 53));
            n2 = 0;
            while (n2 < 3) {
                block5: {
                    n4 = 0;
                    if (n3 == 0) break block4;
                    for (int i2 = v1407624; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block5;
                    }
                    ++n2;
                }
                if (n3 != 0) continue;
            }
            n4 = n2 = 0;
        }
        while (n2 < 9) {
            this.a(new D(h2, n2, 8 + n2 * 18, 142));
            ++n2;
            if (n3 != 0) continue;
        }
    }

    public void a(int n2) {
        this.l.b(n2);
    }

    @Override
    public boolean a(j j2) {
        return this.k.b() == j2;
    }

    @Override
    public void b(j j2) {
        block4: {
            w w2;
            int n2;
            block3: {
                int n3 = n.c();
                super.b(j2);
                n2 = n3;
                this.k.b(null);
                super.b(j2);
                w2 = this;
                if (n2 != 0) break block3;
                if (w2.m.C) break block4;
                w2 = this;
            }
            d d10 = w2.l.b(0);
            boolean bl2 = d10.G();
            if (n2 == 0) {
                if (!bl2) {
                    j2.a(d10, false);
                }
                d10 = this.l.b(1);
                bl2 = d10.G();
            }
            if (!bl2) {
                j2.a(d10, false);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(j var1_1, int var2_2) {
        block22: {
            block21: {
                block20: {
                    block15: {
                        block16: {
                            block17: {
                                block18: {
                                    block19: {
                                        block13: {
                                            block14: {
                                                var4_3 = net.minecraft.w.d.m;
                                                var3_4 = n.c();
                                                v0 = var5_5 = (D)this.f.get(var2_2);
                                                if (var3_4 == 0) {
                                                    if (v0 == null) return var4_3;
                                                    v0 = var5_5;
                                                }
                                                if (var3_4 == 0) {
                                                    if (v0.b() == false) return var4_3;
                                                    v0 = var5_5;
                                                }
                                                var6_6 = v0.d();
                                                var4_3 = var6_6.C();
                                                v1 = var2_2;
                                                if (var3_4 != 0) break block13;
                                                if (v1 != 2) break block14;
                                                if (!this.a(var6_6, 3, 39, true)) {
                                                    return net.minecraft.w.d.m;
                                                }
                                                var5_5.a(var6_6, var4_3);
                                                if (var3_4 == 0) break block15;
                                            }
                                            v1 = var2_2;
                                        }
                                        if (var3_4 != 0) break block16;
                                        if (v1 == 0) break block17;
                                        v1 = var2_2;
                                        if (var3_4 != 0) break block16;
                                        if (v1 == 1) break block17;
                                        v1 = var2_2;
                                        v2 = 3;
                                        if (var3_4 != 0) break block18;
                                        if (v1 < v2) break block19;
                                        v1 = var2_2;
                                        v2 = 30;
                                        if (var3_4 != 0) break block18;
                                        if (v1 >= v2) break block19;
                                        v1 = this.a(var6_6, 30, 39, false) ? 1 : 0;
                                        if (var3_4 != 0) break block20;
                                        if (v1 == 0) {
                                            return net.minecraft.w.d.m;
                                        }
                                        break block15;
                                    }
                                    v1 = var2_2;
                                    if (var3_4 != 0) break block20;
                                    v2 = 30;
                                }
                                if (v1 < v2) break block15;
                                v1 = var2_2;
                                if (var3_4 != 0) break block20;
                                if (v1 >= 39) break block15;
                                v1 = this.a(var6_6, 3, 30, false) ? 1 : 0;
                                if (var3_4 != 0) break block20;
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                }
                                break block15;
                            }
                            v1 = this.a(var6_6, 3, 39, false) ? 1 : 0;
                        }
                        if (var3_4 == 0) {
                            if (v1 == 0) {
                                return net.minecraft.w.d.m;
                            } else {
                                ** GOTO lbl61
                            }
                        }
                        break block20;
                    }
                    v1 = var6_6.G() ? 1 : 0;
                }
                if (v1 == 0) break block21;
                var5_5.a(net.minecraft.w.d.m);
                if (var3_4 == 0) break block22;
            }
            var5_5.f();
        }
        v3 = var6_6;
        if (var3_4 != 0) return var4_3;
        if (v3.t() == var4_3.t()) {
            return net.minecraft.w.d.m;
        }
        v3 = var5_5.a(var1_1, var6_6);
        return var4_3;
    }
}

