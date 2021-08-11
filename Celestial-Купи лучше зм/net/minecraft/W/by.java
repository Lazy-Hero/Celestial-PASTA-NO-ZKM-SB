/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.cL;
import net.minecraft.W.g;
import net.minecraft.W.k;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ae.d;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;

public class by
extends K {
    private final /* synthetic */ K A;
    public static final /* synthetic */ d<k> z;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, h var2_2) {
        var4_3 = var1_1.b(by.z);
        var3_4 = cL.b();
        v0 = g.b[var2_2.ordinal()];
        if (var3_4) ** GOTO lbl8
        switch (v0) {
            case 1: {
                v0 = g.c[var4_3.ordinal()];
lbl8:
                // 2 sources

                switch (v0) {
                    case 4: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_WEST);
                    }
                    case 5: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH);
                    }
                    case 6: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_EAST);
                    }
                    default: {
                        return super.a(var1_1, var2_2);
                    }
                    case 9: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_WEST);
                    }
                    case 10: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH);
                    }
                    case 11: 
                }
                return var1_1.a(by.z, net.minecraft.W.k.NORTH_EAST);
            }
            case 2: {
                switch (g.c[var4_3.ordinal()]) {
                    case 4: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_EAST);
                    }
                    default: {
                        if (var3_4 == false) return super.a(var1_1, var2_2);
                    }
                    case 6: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(by.z, net.minecraft.W.k.EAST);
                    }
                    case 8: {
                        return var1_1.a(by.z, net.minecraft.W.k.WEST);
                    }
                    case 9: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_EAST);
                    }
                    case 11: 
                }
                return var1_1.a(by.z, net.minecraft.W.k.SOUTH_WEST);
            }
        }
        return super.a(var1_1, var2_2);
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.w.k.b(this.A);
    }

    static {
        z = d.a("variant", k.class);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d();
    }

    @Override
    public i c(int n2) {
        return this.d().a(z, net.minecraft.W.k.a(n2));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, z);
    }

    @Override
    public int a(Random random) {
        return Math.max(0, random.nextInt(10) - 7);
    }

    @Override
    public int d(i i2) {
        return i2.b(z).a();
    }

    public by(c c10, a a10, K k2) {
        super(c10, a10);
        this.h(this.e.a().a(z, net.minecraft.W.k.ALL_OUTSIDE));
        this.A = k2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.b();
        v0 = g.a[var2_2.ordinal()];
        if (var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = g.c[var1_1.b(by.z).ordinal()];
lbl7:
                // 2 sources

                switch (v0) {
                    case 3: {
                        if (!var3_3) break;
                    }
                    case 4: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_EAST);
                    }
                    case 5: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH);
                    }
                    case 6: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(by.z, net.minecraft.W.k.EAST);
                    }
                    case 8: {
                        return var1_1.a(by.z, net.minecraft.W.k.WEST);
                    }
                    case 9: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_EAST);
                    }
                    case 10: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH);
                    }
                    case 11: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_WEST);
                    }
                    default: {
                        return var1_1;
                    }
                }
            }
            case 2: {
                switch (g.c[var1_1.b(by.z).ordinal()]) {
                    case 3: {
                        if (!var3_3) break;
                    }
                    case 4: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_WEST);
                    }
                    case 5: {
                        return var1_1.a(by.z, net.minecraft.W.k.WEST);
                    }
                    case 6: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_WEST);
                    }
                    case 7: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH);
                    }
                    case 8: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH);
                    }
                    case 9: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_EAST);
                    }
                    case 10: {
                        return var1_1.a(by.z, net.minecraft.W.k.EAST);
                    }
                    case 11: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_EAST);
                    }
                    default: {
                        return var1_1;
                    }
                }
            }
            case 3: {
                switch (g.c[var1_1.b(by.z).ordinal()]) {
                    case 3: {
                        if (var3_3 == false) return var1_1;
                    }
                    case 4: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_EAST);
                    }
                    case 5: {
                        return var1_1.a(by.z, net.minecraft.W.k.EAST);
                    }
                    case 6: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_EAST);
                    }
                    case 7: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH);
                    }
                    case 8: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH);
                    }
                    case 9: {
                        return var1_1.a(by.z, net.minecraft.W.k.NORTH_WEST);
                    }
                    case 10: {
                        return var1_1.a(by.z, net.minecraft.W.k.WEST);
                    }
                    case 11: {
                        return var1_1.a(by.z, net.minecraft.W.k.SOUTH_WEST);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    @Override
    public a f(i i2, t t2, n n2) {
        switch (i2.b(z)) {
            case ALL_STEM: {
                return net.minecraft.ac.a.i;
            }
            case ALL_INSIDE: {
                return net.minecraft.ac.a.K;
            }
            case STEM: {
                return net.minecraft.ac.a.K;
            }
        }
        return super.f(i2, t2, n2);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return new net.minecraft.w.d(this.A);
    }
}

