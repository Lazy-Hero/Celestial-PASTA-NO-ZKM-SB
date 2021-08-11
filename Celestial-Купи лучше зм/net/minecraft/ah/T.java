/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ah;

import javax.annotation.Nullable;
import net.minecraft.A.h;
import net.minecraft.N.y;
import net.minecraft.Z.i;
import net.minecraft.ah.L;
import net.minecraft.ah.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.o.a;
import net.minecraft.o.j;
import net.minecraft.u.g;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class T
implements t {
    protected /* synthetic */ int e;
    protected /* synthetic */ z c;
    protected /* synthetic */ boolean d;
    protected /* synthetic */ a[][] a;
    protected /* synthetic */ int b;

    @Nullable
    public y a(n n2, j j2) {
        int n3 = (n2.e() >> 4) - this.e;
        int n4 = (n2.a() >> 4) - this.b;
        return this.a[n3][n4].a(n2, j2);
    }

    @Override
    public i d(n n2) {
        block3: {
            a a10;
            block8: {
                a a11;
                int n3;
                int n4;
                int n5;
                String string;
                block7: {
                    block6: {
                        block5: {
                            int n6;
                            int n7;
                            block4: {
                                block2: {
                                    string = z.I();
                                    n7 = n2.b();
                                    if (string == null) break block2;
                                    if (n7 < 0) break block3;
                                    n7 = n2.b();
                                }
                                n6 = 256;
                                if (string == null) break block4;
                                if (n7 >= n6) break block3;
                                n7 = n2.e() >> 4;
                                n6 = this.e;
                            }
                            n5 = n7 - n6;
                            n4 = (n2.a() >> 4) - this.b;
                            n3 = n5;
                            if (string == null) break block5;
                            if (n3 < 0) break block3;
                            n3 = n5;
                        }
                        if (string == null) break block6;
                        if (n3 >= this.a.length) break block3;
                        n3 = n4;
                    }
                    if (string == null) break block7;
                    if (n3 < 0) break block3;
                    n3 = n4;
                }
                if (n3 >= this.a[n5].length) break block3;
                a10 = a11 = this.a[n5][n4];
                if (string == null) break block8;
                if (a10 == null) break block3;
                a10 = a11;
            }
            return a10.c(n2);
        }
        return g.bf.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(c c10, n n2) {
        String string = z.I();
        int n3 = n2.b();
        if (string == null) return n3;
        if (n3 >= 0) {
            n3 = n2.b();
            if (string == null) return n3;
            if (n3 < 256) {
                int n4 = (n2.e() >> 4) - this.e;
                int n5 = (n2.a() >> 4) - this.b;
                return this.a[n4][n5].a(c10, n2);
            }
        }
        n3 = c10.defaultLightValue;
        return n3;
    }

    @Override
    @Nullable
    public y b(n n2) {
        return this.a(n2, j.IMMEDIATE);
    }

    @Override
    public int a(n n2, int n3) {
        int n4;
        int n5 = this.b(net.minecraft.ah.c.SKY, n2);
        String string = z.I();
        int n6 = n4 = this.b(net.minecraft.ah.c.BLOCK, n2);
        int n7 = n3;
        if (string != null) {
            if (n6 < n7) {
                n4 = n3;
            }
            n6 = n5 << 20;
            n7 = n4 << 4;
        }
        return n6 | n7;
    }

    @Override
    public int a(n n2, aA aA2) {
        return this.d(n2).b(this, n2, aA2);
    }

    @Override
    public L a() {
        return this.c.a();
    }

    @Override
    public h c(n n2) {
        int n3 = (n2.e() >> 4) - this.e;
        int n4 = (n2.a() >> 4) - this.b;
        return this.a[n3][n4].a(n2, this.c.B());
    }

    public T(z z2, n n2, n n3, int n4) {
        int n5;
        int n6;
        String string;
        block8: {
            int n7;
            this.c = z2;
            this.e = n2.e() - n4 >> 4;
            this.b = n2.a() - n4 >> 4;
            int n8 = n3.e() + n4 >> 4;
            int n9 = n3.a() + n4 >> 4;
            this.a = new a[n8 - this.e + 1][n9 - this.b + 1];
            this.d = true;
            string = z.I();
            n6 = this.e;
            while (n6 <= n8) {
                block9: {
                    n7 = this.b;
                    if (string == null) break block8;
                    for (n5 = v636989; n5 <= n9; ++n5) {
                        this.a[n6 - this.e][n5 - this.b] = z2.b(n6, n5);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break block9;
                    }
                    ++n6;
                }
                if (string != null) continue;
            }
            n7 = n6 = n2.e() >> 4;
        }
        while (n6 <= n3.e() >> 4) {
            block10: {
                n5 = n2.a() >> 4;
                while (n5 <= n3.a() >> 4) {
                    a a10 = this.a[n6 - this.e][n5 - this.b];
                    if (string != null) {
                        if (string != null) {
                            if (a10 != null && !a10.e(n2.b(), n3.b())) {
                                this.d = false;
                            }
                            ++n5;
                        }
                        if (string != null) continue;
                    }
                    break block10;
                }
                ++n6;
            }
            if (string != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(n n2) {
        return this.d(n2).o() == net.minecraft.ac.c.A;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(c var1_1, n var2_2) {
        var3_3 = z.I();
        if (var1_1 == net.minecraft.ah.c.SKY) {
            v0 = this.c.D.h() ? 1 : 0;
            if (var3_3 != null) {
                if (v0 == 0) {
                    return 0;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = var2_2.b();
        }
        if (var3_3 == null) return v0;
        if (v0 < 0) ** GOTO lbl25
        v0 = var2_2.b();
        if (var3_3 == null) return v0;
        if (v0 >= 256) ** GOTO lbl25
        v1 = this.d(var2_2).c();
        if (var3_3 == null) ** GOTO lbl22
        if (v1 != 0) {
            var4_4 = 0;
            var5_6 = aA.values();
            var6_8 = var5_6.length;
        } else {
            v1 = (var2_2.e() >> 4) - this.e;
lbl22:
            // 2 sources

            var4_5 = v1;
            var5_7 = (var2_2.a() >> 4) - this.b;
            return this.a[var4_5][var5_7].a(var1_1, var2_2);
lbl25:
            // 2 sources

            v0 = var1_1.defaultLightValue;
            return v0;
        }
        for (var7_9 = 0; var7_9 < var6_8; ++var7_9) {
            var8_10 = var5_6[var7_9];
            v2 = var9_11 = this.a(var1_1, var2_2.a(var8_10));
            if (var3_3 == null) return v2;
            v3 = var4_4;
            if (var3_3 != null) {
                if (v2 > v3) {
                    var4_4 = var9_11;
                }
                v4 = var4_4;
                if (var3_3 == null) return v4;
                v3 = 15;
            }
            if (v4 < v3) continue;
            v4 = var4_4;
            return v4;
        }
        v2 = var4_4;
        return v2;
    }

    public boolean a() {
        return this.d;
    }
}

