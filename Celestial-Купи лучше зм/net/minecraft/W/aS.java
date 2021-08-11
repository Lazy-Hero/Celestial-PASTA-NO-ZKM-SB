/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.G;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.d;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class aS
extends ak {
    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.k;
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        block4: {
            int n3;
            boolean bl2;
            block3: {
                y y2 = z2.b(n2);
                bl2 = cL.e();
                n3 = y2 instanceof G;
                if (!bl2) break block3;
                if (n3 == 0) break block4;
                n3 = ((G)y2).b();
            }
            int n4 = n3;
            for (int i3 = 0; i3 < n4; ++i3) {
                double d10;
                double d11;
                double d12;
                double d13;
                double d14;
                double d15;
                block7: {
                    int n5;
                    int n6;
                    block5: {
                        block6: {
                            d15 = (float)n2.e() + random.nextFloat();
                            d14 = (float)n2.b() + random.nextFloat();
                            d13 = (float)n2.a() + random.nextFloat();
                            d12 = ((double)random.nextFloat() - 0.5) * 0.5;
                            d11 = ((double)random.nextFloat() - 0.5) * 0.5;
                            d10 = ((double)random.nextFloat() - 0.5) * 0.5;
                            n6 = random.nextInt(2) * 2 - 1;
                            n5 = random.nextBoolean();
                            if (!bl2) break block5;
                            if (n5 == 0) break block6;
                            d13 = (double)n2.a() + 0.5 + 0.25 * (double)n6;
                            d10 = random.nextFloat() * 2.0f * (float)n6;
                            if (bl2) break block7;
                        }
                        n5 = n2.e();
                    }
                    d15 = (double)n5 + 0.5 + 0.25 * (double)n6;
                    d12 = random.nextFloat() * 2.0f * (float)n6;
                }
                z2.a(aH.PORTAL, d15, d14, d13, d12, d11, d10, new int[0]);
                if (bl2) continue;
            }
        }
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        i i3 = t2.d(n2.a(aA2));
        K k2 = i3.b();
        return !i3.i() && k2 != g.m;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public y a(z z2, int n2) {
        return new G();
    }

    protected aS(c c10) {
        super(c10);
        this.b(1.0f);
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return net.minecraft.w.d.m;
    }
}

