/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.W.K;
import net.minecraft.W.T;
import net.minecraft.W.cL;
import net.minecraft.Z.c;
import net.minecraft.Z.i;
import net.minecraft.ae.f;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class U
extends T {
    public static final /* synthetic */ f A;

    public U() {
        this.h(this.e.a().a(A, 0));
    }

    @Override
    public d c(z z2, n n2, i i2) {
        return d.m;
    }

    static {
        A = f.a("age", 0, 3);
    }

    @Override
    public i c(int n2) {
        return this.d().a(A, net.minecraft.k.h.c(n2, 0, 3));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, i i2, Random random) {
        block7: {
            n n3;
            z z3;
            block6: {
                block5: {
                    int n4;
                    int n5;
                    boolean bl2;
                    block4: {
                        block2: {
                            block3: {
                                bl2 = cL.e();
                                n5 = random.nextInt(3);
                                if (!bl2) break block2;
                                if (n5 == 0) break block3;
                                n5 = this.a(z2, n2);
                                n4 = 4;
                                if (!bl2) break block4;
                                if (n5 >= n4) break block5;
                            }
                            z3 = z2;
                            n3 = n2;
                            if (!bl2) break block6;
                            n5 = z3.s(n3);
                        }
                        n4 = 11 - i2.b(A) - i2.j();
                    }
                    if (n5 <= n4) break block5;
                    this.a(z2, n2, i2, random, true);
                    if (bl2) break block7;
                }
                z3 = z2;
                n3 = n2;
            }
            z3.a(n3, (K)this, net.minecraft.k.h.a(random, 20, 40));
        }
    }

    @Override
    protected c f() {
        return new c((K)this, A);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int a(z z2, n n2) {
        int n3 = 0;
        aA[] arraA = aA.values();
        int n4 = arraA.length;
        boolean bl2 = cL.e();
        int n5 = 0;
        do {
            if (n5 >= n4) return n3;
            aA aA2 = arraA[n5];
            if (!bl2) continue;
            if (z2.d(n2.a(aA2)).b() == this) {
                ++n3;
                if (!bl2) continue;
                if (n3 >= 4) {
                    return n3;
                }
            }
            ++n5;
        } while (bl2);
        return n3;
    }

    @Override
    public int d(i i2) {
        return i2.b(A);
    }

    protected void a(z z2, n n2, i i2, Random random, boolean bl2) {
        block9: {
            int n3;
            boolean bl3;
            block7: {
                block8: {
                    int n4 = i2.b(A);
                    bl3 = cL.b();
                    n3 = n4;
                    if (bl3) break block7;
                    if (n3 >= 3) break block8;
                    z2.a(n2, i2.a(A, n4 + 1), 2);
                    z2.a(n2, (K)this, net.minecraft.k.h.a(random, 20, 40));
                    if (!bl3) break block9;
                }
                this.a(z2, n2);
                n3 = bl2 ? 1 : 0;
            }
            if (n3 != 0) {
                aA[] arraA = aA.values();
                int n5 = arraA.length;
                int n6 = 0;
                while (n6 < n5) {
                    aA aA2 = arraA[n6];
                    n n7 = n2.a(aA2);
                    i i3 = z2.d(n7);
                    if (!bl3) {
                        if (i3.b() == this) {
                            this.a(z2, n7, i3, random, false);
                        }
                        ++n6;
                    }
                    if (!bl3) continue;
                }
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block0: {
            int n4;
            if (k2 != this || (n4 = this.a(z2, n2)) >= 2) break block0;
            this.a(z2, n2);
        }
    }
}

