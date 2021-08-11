/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import javax.annotation.Nullable;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aF;
import net.minecraft.client.k.j;
import net.minecraft.client.k.s;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class aC {
    protected final /* synthetic */ aF b;
    protected final /* synthetic */ z c;
    protected /* synthetic */ int a;
    public /* synthetic */ s[] e;
    protected /* synthetic */ int f;
    protected /* synthetic */ int d;

    private int a(int n2, int n3, int n4) {
        int n5 = n4 * 16;
        int n6 = n5 - n2 + n3 / 2;
        String string = I.j();
        int n7 = n6;
        if (string == null) {
            if (n7 < 0) {
                n6 -= n3 - 1;
            }
            n7 = n5 - n6 / n3 * n3;
        }
        return n7;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public s a(n n2) {
        block8: {
            int n3;
            int n4;
            String string;
            int n5;
            int n6;
            int n7;
            block9: {
                block7: {
                    n7 = n2.e() >> 4;
                    n6 = n2.b() >> 4;
                    n5 = n2.a() >> 4;
                    string = I.j();
                    n4 = n6;
                    if (string != null) break block7;
                    if (n4 < 0) break block8;
                    n4 = n6;
                }
                n3 = this.f;
                if (string != null) break block9;
                if (n4 >= n3) break block8;
                n4 = n7;
                n3 = this.d;
            }
            int n8 = n7 = n4 % n3;
            if (string == null) {
                if (n8 < 0) {
                    n7 += this.d;
                }
                n8 = n5 %= this.a;
            }
            if (string == null) {
                if (n8 < 0) {
                    n5 += this.a;
                }
                n8 = (n5 * this.f + n6) * this.d + n7;
            }
            int n9 = n8;
            return this.e[n9];
        }
        return null;
    }

    public void a(double d10, double d11) {
        int n2 = h.f(d10) - 8;
        int n3 = h.f(d11) - 8;
        String string = I.j();
        int n4 = this.d * 16;
        int n5 = 0;
        block0: while (true) {
            int n6 = n5;
            block1: while (n6 < this.d) {
                int n7 = this.a(n2, n4, n5);
                int n8 = 0;
                while (n8 < this.a) {
                    block5: {
                        int n9 = this.a(n3, n4, n8);
                        n6 = 0;
                        if (string != null) continue block1;
                        for (int i2 = v1522856; i2 < this.f; ++i2) {
                            int n10 = i2 * 16;
                            s s2 = this.e[(n8 * this.f + i2) * this.d + n5];
                            s2.a(n7, n10, n9);
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block5;
                        }
                        ++n8;
                    }
                    if (string == null) continue;
                }
                ++n5;
                if (string == null) continue block0;
            }
            break;
        }
    }

    protected void a(j j2) {
        int n2 = this.d * this.f * this.a;
        this.e = new s[n2];
        String string = I.j();
        int n3 = 0;
        int n4 = 0;
        block0: while (true) {
            int n5 = n4;
            block1: while (n5 < this.d) {
                int n6 = 0;
                while (n6 < this.f) {
                    block5: {
                        n5 = 0;
                        if (string != null) continue block1;
                        for (int i2 = v1522922; i2 < this.a; ++i2) {
                            int n7 = (i2 * this.f + n6) * this.d + n4;
                            this.e[n7] = j2.a(this.c, this.b, n3++);
                            this.e[n7].a(n4 * 16, n6 * 16, i2 * 16);
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block5;
                        }
                        ++n6;
                    }
                    if (string == null) continue;
                }
                ++n4;
                if (string == null) continue block0;
            }
            break;
        }
    }

    public void a() {
        s[] arrs = this.e;
        String string = I.j();
        for (s s2 : arrs) {
            s2.e();
            if (string == null) continue;
        }
    }

    public aC(z z2, int n2, aF aF2, j j2) {
        this.b = aF2;
        this.c = z2;
        this.a(n2);
        this.a(j2);
    }

    protected void a(int n2) {
        int n3;
        this.d = n3 = n2 * 2 + 1;
        this.f = 16;
        this.a = n3;
    }

    /*
     * WARNING - void declaration
     */
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        int n8 = h.b(n2, 16);
        String string = I.j();
        int n9 = h.b(n3, 16);
        int n10 = h.b(n4, 16);
        int n11 = h.b(n5, 16);
        int n12 = h.b(n6, 16);
        int n13 = h.b(n7, 16);
        int n14 = n8;
        block0: while (true) {
            int n15 = n14;
            block1: while (n15 <= n11) {
                int n16;
                int n17 = n16 = n14 % this.d;
                if (string == null) {
                    if (n17 < 0) {
                        n16 += this.d;
                    }
                    n17 = n9;
                }
                int n18 = n17;
                block2: while (true) {
                    int n19 = n18;
                    block3: while (n19 <= n12) {
                        void var19_19;
                        int n20;
                        n15 = n20 = n18 % this.f;
                        if (string != null) continue block1;
                        if (string == null) {
                            if (n15 < 0) {
                                n20 += this.f;
                            }
                            int n21 = var19_19 = n10;
                        }
                        while (var19_19 <= n13) {
                            void v4;
                            void var20_20 = var19_19 % this.a;
                            n19 = var20_20;
                            if (string != null) continue block3;
                            if (string == null) {
                                if (n19 < 0) {
                                    var20_20 += this.a;
                                }
                                v4 = (var20_20 * this.f + n20) * this.d + n16;
                            }
                            void var21_21 = v4;
                            s s2 = this.e[var21_21];
                            s2.a(bl2);
                            ++var19_19;
                            if (string == null) continue;
                        }
                        ++n18;
                        if (string == null) continue block2;
                    }
                    break;
                }
                ++n14;
                if (string == null) continue block0;
            }
            break;
        }
    }
}

