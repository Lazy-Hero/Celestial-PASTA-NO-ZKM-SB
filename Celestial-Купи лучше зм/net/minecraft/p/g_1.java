/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import java.util.Random;
import net.minecraft.W.cR;
import net.minecraft.Z.i;
import net.minecraft.ae.c;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.p.a;
import net.minecraft.p.f;

public class g
extends f {
    public g(boolean bl2, int n2, int n3, i i2, i i3) {
        super(bl2, n2, n3, i2, i3);
    }

    private void c(z z2, n n2, int n3) {
        int n4 = 2;
        boolean bl2 = net.minecraft.p.a.d();
        for (int i2 = -2; i2 <= 0; ++i2) {
            this.a(z2, n2.c(i2), n3 + 1 - i2);
            if (!bl2) continue;
        }
    }

    @Override
    public boolean a(z z2, Random random, n n2) {
        boolean bl2;
        block29: {
            int n3;
            boolean bl3;
            int n4;
            block26: {
                int n5;
                n4 = this.a(random);
                bl3 = net.minecraft.p.a.d();
                int n6 = this.a(z2, random, n2, n4);
                if (!bl3) {
                    if (n6 == 0) {
                        return false;
                    }
                    this.c(z2, n2.c(n4), 2);
                    n6 = n3 = n2.b() + n4 - 2 - random.nextInt(4);
                }
                while (n3 > n2.b() + n4 / 2) {
                    block28: {
                        int n7;
                        int n8;
                        block27: {
                            int n9;
                            float f10 = random.nextFloat() * ((float)Math.PI * 2);
                            n8 = n2.e() + (int)(0.5f + h.c(f10) * 4.0f);
                            n7 = n2.a() + (int)(0.5f + h.g(f10) * 4.0f);
                            n5 = 0;
                            if (bl3) break block26;
                            for (n9 = v2049861; n9 < 5; ++n9) {
                                n8 = n2.e() + (int)(1.5f + h.c(f10) * (float)n9);
                                n7 = n2.a() + (int)(1.5f + h.g(f10) * (float)n9);
                                this.a(z2, new n(n8, n3 - 3 + n9 / 2, n7), this.a);
                                if (!bl3) {
                                    if (!bl3) continue;
                                }
                                break block27;
                            }
                            n9 = 1 + random.nextInt(2);
                        }
                        int n10 = n3;
                        for (int i2 = n3 - n9; i2 <= n10; ++i2) {
                            int n11 = i2 - n10;
                            this.b(z2, new n(n8, i2, n7), 1 - n11);
                            if (!bl3) {
                                if (!bl3) continue;
                            }
                            break block28;
                        }
                        n3 -= 2 + random.nextInt(4);
                    }
                    if (!bl3) continue;
                }
                n5 = n3 = 0;
            }
            while (n3 < n4) {
                block39: {
                    block32: {
                        n n12;
                        block37: {
                            n n13;
                            block38: {
                                int n14;
                                block36: {
                                    block34: {
                                        n n15;
                                        block35: {
                                            int n16;
                                            block33: {
                                                int n17;
                                                block30: {
                                                    block31: {
                                                        n12 = n2.c(n3);
                                                        bl2 = this.a(z2.d(n12).b());
                                                        if (bl3) break block29;
                                                        if (bl3) break block30;
                                                        if (!bl2) break block31;
                                                        this.a(z2, n12, this.a);
                                                        n17 = n3;
                                                        if (bl3) break block30;
                                                        if (n17 > 0) {
                                                            this.a(z2, random, n12.b(), cR.C);
                                                            this.a(z2, random, n12.i(), cR.E);
                                                        }
                                                    }
                                                    n17 = n3;
                                                }
                                                if (n17 >= n4 - 1) break block32;
                                                n15 = n12.m();
                                                n16 = this.a(z2.d(n15).b());
                                                if (bl3) break block33;
                                                if (n16 == 0) break block34;
                                                this.a(z2, n15, this.a);
                                                if (bl3) break block35;
                                                n16 = n3;
                                            }
                                            if (n16 <= 0) break block34;
                                            this.a(z2, random, n15.m(), cR.D);
                                        }
                                        this.a(z2, random, n15.i(), cR.E);
                                    }
                                    n13 = n12.j().m();
                                    n14 = this.a(z2.d(n13).b());
                                    if (bl3) break block36;
                                    if (n14 == 0) break block37;
                                    this.a(z2, n13, this.a);
                                    if (bl3) break block38;
                                    n14 = n3;
                                }
                                if (n14 <= 0) break block37;
                                this.a(z2, random, n13.m(), cR.D);
                            }
                            this.a(z2, random, n13.j(), cR.J);
                        }
                        n n18 = n12.j();
                        if (bl3) break block39;
                        if (!this.a(z2.d(n18).b())) break block32;
                        this.a(z2, n18, this.a);
                        if (bl3) break block39;
                        if (n3 > 0) {
                            this.a(z2, random, n18.b(), cR.C);
                            this.a(z2, random, n18.j(), cR.J);
                        }
                    }
                    ++n3;
                }
                if (!bl3) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private void a(z z2, Random random, n n2, c c10) {
        block2: {
            int n3;
            block1: {
                boolean bl2 = net.minecraft.p.a.c();
                n3 = random.nextInt(3);
                if (!bl2) break block1;
                if (n3 <= 0) break block2;
                n3 = z2.a(n2) ? 1 : 0;
            }
            if (n3 != 0) {
                this.a(z2, n2, net.minecraft.u.g.aW.d().a(c10, true));
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

