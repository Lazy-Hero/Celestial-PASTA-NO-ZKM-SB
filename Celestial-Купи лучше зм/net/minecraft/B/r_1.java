/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class r
extends n {
    private final /* synthetic */ a k;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(j var1_1, int var2_2) {
        block15: {
            block14: {
                block12: {
                    block13: {
                        block10: {
                            block11: {
                                var4_3 = net.minecraft.w.d.m;
                                var5_4 = (D)this.f.get(var2_2);
                                var3_5 = n.b();
                                v0 = var5_4;
                                if (var3_5 != 0) {
                                    if (v0 == null) return var4_3;
                                    v0 = var5_4;
                                }
                                if (var3_5 != 0) {
                                    if (v0.b() == false) return var4_3;
                                    v0 = var5_4;
                                }
                                var6_6 = v0.d();
                                var4_3 = var6_6.C();
                                v1 = var2_2;
                                if (var3_5 == 0) break block10;
                                if (v1 >= 9) break block11;
                                v1 = this.a(var6_6, 9, 45, true) ? 1 : 0;
                                if (var3_5 == 0) break block12;
                                if (v1 == 0) {
                                    return net.minecraft.w.d.m;
                                }
                                break block13;
                            }
                            v1 = this.a(var6_6, 0, 9, false) ? 1 : 0;
                        }
                        if (var3_5 != 0) {
                            if (v1 == 0) {
                                return net.minecraft.w.d.m;
                            } else {
                                ** GOTO lbl28
                            }
                        }
                        break block12;
                    }
                    v1 = var6_6.G() ? 1 : 0;
                }
                if (v1 == 0) break block14;
                var5_4.a(net.minecraft.w.d.m);
                if (var3_5 != 0) break block15;
            }
            var5_4.f();
        }
        v2 = var6_6;
        if (var3_5 == 0) return var4_3;
        if (v2.t() == var4_3.t()) {
            return net.minecraft.w.d.m;
        }
        v2 = var5_4.a(var1_1, var6_6);
        return var4_3;
    }

    @Override
    public boolean a(j j2) {
        return this.k.a(j2);
    }

    public r(a a10, a a11) {
        int n2;
        int n3;
        block9: {
            int n4;
            int n5;
            block7: {
                int n6;
                int n7 = n.b();
                this.k = a11;
                n3 = 0;
                n2 = n7;
                while (n3 < 3) {
                    block8: {
                        n6 = 0;
                        if (n2 == 0) break block7;
                        for (n5 = v1404573; n5 < 3; ++n5) {
                            this.a(new D(a11, n5 + n3 * 3, 62 + n5 * 18, 17 + n3 * 18));
                            if (n2 != 0) {
                                if (n2 != 0) continue;
                            }
                            break block8;
                        }
                        ++n3;
                    }
                    if (n2 != 0) continue;
                }
                n6 = n3 = 0;
            }
            while (n3 < 3) {
                block10: {
                    n4 = 0;
                    if (n2 == 0) break block9;
                    for (n5 = v1404606; n5 < 9; ++n5) {
                        this.a(new D(a10, n5 + n3 * 9 + 9, 8 + n5 * 18, 84 + n3 * 18));
                        if (n2 != 0) {
                            if (n2 != 0) continue;
                        }
                        break block10;
                    }
                    ++n3;
                }
                if (n2 != 0) continue;
            }
            n4 = n3 = 0;
        }
        while (n3 < 9) {
            this.a(new D(a10, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n2 != 0) continue;
        }
    }
}

