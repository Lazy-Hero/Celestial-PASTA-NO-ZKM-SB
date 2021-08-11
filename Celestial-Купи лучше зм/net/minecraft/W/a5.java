/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.F;
import net.minecraft.N.y;
import net.minecraft.U.x;
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

public class a5
extends ak {
    protected static final /* synthetic */ k z;

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public void a(z z2, n n2, i i2, x x2) {
        block5: {
            x x3;
            boolean bl2;
            block8: {
                boolean bl3;
                block7: {
                    block6: {
                        block4: {
                            bl3 = cL.b();
                            bl2 = z2.C;
                            if (bl3) break block4;
                            if (bl2) break block5;
                            bl2 = x2.N();
                        }
                        if (bl3) break block6;
                        if (bl2) break block5;
                        bl2 = x2.aU();
                    }
                    if (bl3) break block7;
                    if (bl2) break block5;
                    bl2 = x2.A();
                }
                if (bl3) break block8;
                if (!bl2) break block5;
                x3 = x2;
                if (bl3) break block5;
                bl2 = x3.m().c(i2.f(z2, n2).a(n2));
            }
            if (bl2) {
                x3 = x2.e(1);
            }
        }
    }

    @Override
    public void a(i i2, z z2, n n2, Random random) {
        double d10 = (float)n2.e() + random.nextFloat();
        double d11 = (float)n2.b() + 0.8f;
        double d12 = (float)n2.a() + random.nextFloat();
        double d13 = 0.0;
        double d14 = 0.0;
        double d15 = 0.0;
        z2.a(aH.SMOKE_NORMAL, d10, d11, d12, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public a f(i i2, t t2, n n2) {
        return net.minecraft.ac.a.k;
    }

    @Override
    public d a(t t2, i i2, n n2, aA aA2) {
        return d.UNDEFINED;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        boolean bl2 = cL.b();
        if (aA2 != aA.DOWN) return false;
        boolean bl3 = super.b(i2, t2, n2, aA2);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public y a(z z2, int n2) {
        return new F();
    }

    protected a5(c c10) {
        super(c10);
        this.b(1.0f);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return z;
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    static {
        z = new k(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);
    }

    @Override
    public net.minecraft.w.d c(z z2, n n2, i i2) {
        return net.minecraft.w.d.m;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

