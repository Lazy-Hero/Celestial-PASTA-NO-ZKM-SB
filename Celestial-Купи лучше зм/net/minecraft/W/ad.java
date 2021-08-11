/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.W;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.N.U;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.ak;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aH;
import net.minecraft.ar.aW;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.l.m;
import net.minecraft.u.E;

public class ad
extends ak {
    private static final /* synthetic */ List<d> z;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, n n2, j j2) {
        block3: {
            y y2;
            block4: {
                y y3;
                z z3;
                boolean bl2;
                block2: {
                    bl2 = cL.e();
                    z3 = z2;
                    if (!bl2) break block2;
                    if (z3.C) break block3;
                    z3 = z2;
                }
                y2 = y3 = z3.b(n2);
                if (!bl2) break block4;
                if (!(y2 instanceof U)) break block3;
                y2 = y3;
            }
            ((U)y2).a(z2, n2);
            j2.b(net.minecraft.l.m.ag);
        }
    }

    @Override
    public void a(i i2, z z2, n n2, K k2, n n3) {
        block5: {
            boolean bl2;
            U u2;
            boolean bl3;
            block6: {
                y y2;
                boolean bl4;
                block4: {
                    y y3;
                    bl3 = z2.x(n2);
                    bl4 = cL.b();
                    y2 = y3 = z2.b(n2);
                    if (bl4) break block4;
                    if (!(y2 instanceof U)) break block5;
                    y2 = y3;
                }
                u2 = (U)y2;
                bl2 = u2.i;
                if (bl4) break block6;
                if (bl2 == bl3) break block5;
                bl2 = bl3;
            }
            if (bl2) {
                u2.a(z2, n2);
            }
            u2.i = bl3;
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        z z3 = z2;
        if (bl2) {
            if (z3.C) {
                return true;
            }
            z3 = z2;
        }
        y y2 = z3.b(n2);
        boolean bl3 = y2 instanceof U;
        if (bl2) {
            if (bl3) {
                U u2 = (U)y2;
                u2.a();
                u2.a(z2, n2);
                j2.b(net.minecraft.l.m.B);
            }
            bl3 = true;
        }
        return bl3;
    }

    private d a(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    boolean bl2 = cL.b();
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (bl2) break block2;
                    if (n3 < z.size()) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return z.get(n2);
    }

    static {
        z = Lists.newArrayList((Object[])new d[]{E.cE, E.aJ, E.j, E.P, E.e9, E.F, E.u, E.ea, E.dC, E.bz});
    }

    @Override
    public boolean a(i i2, z z2, n n2, int n3, int n4) {
        float f10 = (float)Math.pow(2.0, (double)(n4 - 12) / 12.0);
        z2.a(null, n2, this.a(n3), ay.RECORDS, 3.0f, f10);
        z2.a(aH.NOTE, (double)n2.e() + 0.5, (double)n2.b() + 1.2, (double)n2.a() + 0.5, (double)n4 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }

    @Override
    public y a(z z2, int n2) {
        return new U();
    }

    public ad() {
        super(net.minecraft.ac.c.k);
        this.a(net.minecraft.ad.a.p);
    }

    @Override
    public aW b(i i2) {
        return aW.MODEL;
    }
}

