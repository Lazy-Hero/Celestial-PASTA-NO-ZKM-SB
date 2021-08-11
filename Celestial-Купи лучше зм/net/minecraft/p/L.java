/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net.minecraft.p;

import com.google.common.base.Predicate;
import java.util.Random;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.p.V;
import net.minecraft.p.a;

public class L
extends a {
    private final /* synthetic */ int a;
    private final /* synthetic */ i d;
    private final /* synthetic */ Predicate<i> e;

    @Override
    public boolean a(z z2, Random random, n n2) {
        int n3;
        block11: {
            float f10 = random.nextFloat() * (float)Math.PI;
            double d10 = (float)(n2.e() + 8) + h.g(f10) * (float)this.a / 8.0f;
            double d11 = (float)(n2.e() + 8) - h.g(f10) * (float)this.a / 8.0f;
            double d12 = (float)(n2.a() + 8) + h.c(f10) * (float)this.a / 8.0f;
            double d13 = (float)(n2.a() + 8) - h.c(f10) * (float)this.a / 8.0f;
            double d14 = n2.b() + random.nextInt(3) - 2;
            boolean bl2 = net.minecraft.p.a.c();
            double d15 = n2.b() + random.nextInt(3) - 2;
            int n4 = 0;
            block0: while (true) {
                int n5 = n4;
                block1: while (n5 < this.a) {
                    float f11 = (float)n4 / (float)this.a;
                    double d16 = d10 + (d11 - d10) * (double)f11;
                    double d17 = d14 + (d15 - d14) * (double)f11;
                    double d18 = d12 + (d13 - d12) * (double)f11;
                    double d19 = random.nextDouble() * (double)this.a / 16.0;
                    double d20 = (double)(h.g((float)Math.PI * f11) + 1.0f) * d19 + 1.0;
                    double d21 = (double)(h.g((float)Math.PI * f11) + 1.0f) * d19 + 1.0;
                    int n6 = h.f(d16 - d20 / 2.0);
                    int n7 = h.f(d17 - d21 / 2.0);
                    int n8 = h.f(d18 - d20 / 2.0);
                    int n9 = h.f(d16 + d20 / 2.0);
                    int n10 = h.f(d17 + d21 / 2.0);
                    int n11 = h.f(d18 + d20 / 2.0);
                    n3 = n6;
                    if (!bl2) break block11;
                    int n12 = n3;
                    block2: while (true) {
                        int n13 = n12;
                        block3: while (n13 <= n9) {
                            block12: {
                                double d22 = ((double)n12 + 0.5 - d16) / (d20 / 2.0);
                                if (!bl2) continue block2;
                                double d23 = d22 * d22 - 1.0;
                                n5 = d23 == 0.0 ? 0 : (d23 < 0.0 ? -1 : 1);
                                if (!bl2) continue block1;
                                if (n5 >= 0) break block12;
                                int n14 = n7;
                                block4: while (true) {
                                    int n15 = n14;
                                    block5: while (n15 <= n10) {
                                        block13: {
                                            double d24 = ((double)n14 + 0.5 - d17) / (d21 / 2.0);
                                            if (!bl2) continue block4;
                                            double d25 = d22 * d22 + d24 * d24 - 1.0;
                                            n13 = d25 == 0.0 ? 0 : (d25 < 0.0 ? -1 : 1);
                                            if (!bl2) continue block3;
                                            if (n13 >= 0) break block13;
                                            int n16 = n8;
                                            while (n16 <= n11) {
                                                block14: {
                                                    block15: {
                                                        double d26 = ((double)n16 + 0.5 - d18) / (d20 / 2.0);
                                                        if (!bl2) break block14;
                                                        double d27 = d22 * d22 + d24 * d24 + d26 * d26 - 1.0;
                                                        n15 = d27 == 0.0 ? 0 : (d27 < 0.0 ? -1 : 1);
                                                        if (!bl2) continue block5;
                                                        if (n15 >= 0) break block15;
                                                        n n17 = new n(n12, n14, n16);
                                                        if (!bl2) break block14;
                                                        if (this.e.apply((Object)z2.d(n17))) {
                                                            z2.a(n17, this.d, 2);
                                                        }
                                                    }
                                                    ++n16;
                                                }
                                                if (bl2) continue;
                                            }
                                        }
                                        ++n14;
                                        if (bl2) continue block4;
                                    }
                                    break;
                                }
                            }
                            ++n12;
                            if (bl2) continue block2;
                        }
                        break;
                    }
                    ++n4;
                    if (bl2) continue block0;
                }
                break;
            }
            n3 = 1;
        }
        return n3 != 0;
    }

    public L(i i2, int n2, Predicate<i> predicate) {
        this.d = i2;
        this.a = n2;
        this.e = predicate;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public L(i i2, int n2) {
        this(i2, n2, new V(null));
    }
}

