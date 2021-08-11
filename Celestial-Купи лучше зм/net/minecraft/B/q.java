/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class q
extends n {
    private final /* synthetic */ int l;
    private final /* synthetic */ a k;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public d b(j var1_1, int var2_2) {
        block8: {
            block9: {
                block6: {
                    block7: {
                        var4_3 = net.minecraft.w.d.m;
                        var5_4 = (D)this.f.get(var2_2);
                        var3_5 = n.c();
                        v0 = var5_4;
                        if (var3_5 == 0) {
                            if (v0 == null) return var4_3;
                            v0 = var5_4;
                        }
                        if (var3_5 == 0) {
                            if (v0.b() == false) return var4_3;
                            v0 = var5_4;
                        }
                        var6_6 = v0.d();
                        var4_3 = var6_6.C();
                        v1 = var2_2;
                        if (var3_5 != 0) break block6;
                        if (v1 >= this.l * 9) break block7;
                        v1 = this.a(var6_6, this.l * 9, this.f.size(), true) ? 1 : 0;
                        if (var3_5 != 0) break block8;
                        if (v1 == 0) {
                            return net.minecraft.w.d.m;
                        }
                        break block9;
                    }
                    v1 = this.a(var6_6, 0, this.l * 9, false) ? 1 : 0;
                }
                if (var3_5 == 0) {
                    if (v1 == 0) {
                        return net.minecraft.w.d.m;
                    } else {
                        ** GOTO lbl28
                    }
                }
                break block8;
            }
            v1 = var6_6.G() ? 1 : 0;
        }
        if (v1 != 0) {
            var5_4.a(net.minecraft.w.d.m);
            if (var3_5 == 0) return var4_3;
        }
        var5_4.f();
        return var4_3;
    }

    public a a() {
        return this.k;
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        this.k.d(j2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(j j2) {
        return this.k.a(j2);
    }

    public q(a a10, a a11, j j2) {
        int n2;
        int n3;
        int n4;
        block9: {
            int n5;
            int n6;
            block7: {
                int n7;
                int n8 = n.c();
                this.k = a11;
                this.l = a11.e() / 9;
                a11.c(j2);
                n4 = (this.l - 4) * 18;
                n3 = n8;
                n2 = 0;
                while (n2 < this.l) {
                    block8: {
                        n7 = 0;
                        if (n3 != 0) break block7;
                        for (n6 = v1405242; n6 < 9; ++n6) {
                            this.a(new D(a11, n6 + n2 * 9, 8 + n6 * 18, 18 + n2 * 18));
                            if (n3 == 0) {
                                if (n3 == 0) continue;
                            }
                            break block8;
                        }
                        ++n2;
                    }
                    if (n3 == 0) continue;
                }
                n7 = n2 = 0;
            }
            while (n2 < 3) {
                block10: {
                    n5 = 0;
                    if (n3 != 0) break block9;
                    for (n6 = v1405277; n6 < 9; ++n6) {
                        this.a(new D(a10, n6 + n2 * 9 + 9, 8 + n6 * 18, 103 + n2 * 18 + n4));
                        if (n3 == 0) {
                            if (n3 == 0) continue;
                        }
                        break block10;
                    }
                    ++n2;
                }
                if (n3 == 0) continue;
            }
            n5 = n2 = 0;
        }
        while (n2 < 9) {
            this.a(new D(a10, n2, 8 + n2 * 18, 161 + n4));
            ++n2;
            if (n3 == 0) continue;
        }
    }
}

