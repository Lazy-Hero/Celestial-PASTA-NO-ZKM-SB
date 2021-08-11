/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.i.h;
import net.minecraft.i.j;
import net.minecraft.w.d;

public class u
extends n {
    private final /* synthetic */ a k;

    public u(h h2, a a10, j j2) {
        int n2;
        int n3;
        block7: {
            int n4;
            block6: {
                int n5 = n.b();
                n3 = n5;
                this.k = a10;
                a10.c(j2);
                int n6 = 51;
                for (n2 = 0; n2 < a10.e(); ++n2) {
                    this.a(new D(a10, n2, 44 + n2 * 18, 20));
                    if (n3 != 0) {
                        if (n3 != 0) continue;
                    }
                    break block6;
                }
                n2 = 0;
            }
            while (n2 < 3) {
                block8: {
                    n4 = 0;
                    if (n3 == 0) break block7;
                    for (int i2 = v1410124; i2 < 9; ++i2) {
                        this.a(new D(h2, i2 + n2 * 9 + 9, 8 + i2 * 18, n2 * 18 + 51));
                        if (n3 != 0) {
                            if (n3 != 0) continue;
                        }
                        break block8;
                    }
                    ++n2;
                }
                if (n3 != 0) continue;
            }
            n4 = n2 = 0;
        }
        while (n2 < 9) {
            this.a(new D(h2, n2, 8 + n2 * 18, 109));
            ++n2;
            if (n3 != 0) continue;
        }
    }

    @Override
    public void b(j j2) {
        super.b(j2);
        this.k.d(j2);
    }

    @Override
    public boolean a(j j2) {
        return this.k.a(j2);
    }

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
        block8: {
            block9: {
                block6: {
                    block7: {
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
                        if (var3_5 == 0) break block6;
                        if (v1 >= this.k.e()) break block7;
                        v1 = this.a(var6_6, this.k.e(), this.f.size(), true) ? 1 : 0;
                        if (var3_5 == 0) break block8;
                        if (v1 == 0) {
                            return net.minecraft.w.d.m;
                        }
                        break block9;
                    }
                    v1 = this.a(var6_6, 0, this.k.e(), false) ? 1 : 0;
                }
                if (var3_5 != 0) {
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
            if (var3_5 != 0) return var4_3;
        }
        var5_4.f();
        return var4_3;
    }
}

