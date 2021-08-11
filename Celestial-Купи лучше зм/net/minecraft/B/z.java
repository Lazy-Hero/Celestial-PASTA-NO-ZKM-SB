/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.T;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class z
extends n {
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
                        if (v1 >= this.k.e()) break block7;
                        v1 = this.a(var6_6, this.k.e(), this.f.size(), true) ? 1 : 0;
                        if (var3_5 != 0) break block8;
                        if (v1 == 0) {
                            return net.minecraft.w.d.m;
                        }
                        break block9;
                    }
                    v1 = this.a(var6_6, 0, this.k.e(), false) ? 1 : 0;
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

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(j j2) {
        return this.k.a(j2);
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        this.k.d(j2);
    }

    public z(h h2, a a10, j j2) {
        int n2;
        int n3;
        block9: {
            int n4;
            int n5;
            block7: {
                int n6;
                this.k = a10;
                a10.c(j2);
                int n7 = 3;
                int n8 = 9;
                n3 = 0;
                n2 = n.b();
                while (n3 < 3) {
                    block8: {
                        n6 = 0;
                        if (n2 == 0) break block7;
                        for (n5 = v1411252; n5 < 9; ++n5) {
                            this.a(new T(a10, n5 + n3 * 9, 8 + n5 * 18, 18 + n3 * 18));
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
                    for (n5 = v1411285; n5 < 9; ++n5) {
                        this.a(new D(h2, n5 + n3 * 9 + 9, 8 + n5 * 18, 84 + n3 * 18));
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
            this.a(new D(h2, n3, 8 + n3 * 18, 142));
            ++n3;
            if (n2 != 0) continue;
        }
    }
}

