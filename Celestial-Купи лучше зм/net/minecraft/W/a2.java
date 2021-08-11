/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.N.z;
import net.minecraft.W.ak;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ab.a;
import net.minecraft.ac.c;
import net.minecraft.ae.e;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a2
extends ak {
    protected static final /* synthetic */ k A;
    public static final /* synthetic */ e B;
    public static final /* synthetic */ f z;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public y a(net.minecraft.ah.z z2, int n2) {
        return new z();
    }

    static {
        B = bF.z;
        z = f.a("rotation", 0, 15);
        A = new k(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);
    }

    @Override
    public void a(net.minecraft.ah.z z2, n n2, i i2, float f10, int n3) {
        block2: {
            d d10;
            block1: {
                boolean bl2;
                block0: {
                    d10 = this.a(z2, n2);
                    bl2 = cL.e();
                    if (!bl2) break block0;
                    if (!d10.G()) break block1;
                    super.a(z2, n2, i2, f10, n3);
                }
                if (bl2) break block2;
            }
            a2.a(z2, n2, d10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private d a(net.minecraft.ah.z z2, n n2) {
        d d10;
        y y2 = z2.b(n2);
        boolean bl2 = cL.b();
        y y3 = y2;
        if (!bl2) {
            if (!(y3 instanceof z)) {
                d10 = d.m;
                return d10;
            }
            y3 = y2;
        }
        d10 = ((z)y3).d();
        return d10;
    }

    @Override
    public String n() {
        return net.minecraft.ab.a.a("item.banner.white.name");
    }

    @Override
    @Nullable
    public k c(i i2, t t2, n n2) {
        return a;
    }

    @Override
    public void a(net.minecraft.ah.z z2, j j2, n n2, i i2, @Nullable y y2, d d10) {
        block2: {
            block1: {
                y y3;
                boolean bl2;
                block0: {
                    bl2 = cL.b();
                    y3 = y2;
                    if (bl2) break block0;
                    if (!(y3 instanceof z)) break block1;
                    y3 = y2;
                }
                z z3 = (z)y3;
                d d11 = z3.d();
                a2.a(z2, n2, d11);
                if (!bl2) break block2;
            }
            super.a(z2, j2, n2, i2, null, d10);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.ah.z z2, n n2) {
        boolean bl2 = cL.b();
        boolean bl3 = this.b(z2, n2);
        if (!bl2) {
            if (bl3) return false;
            bl3 = super.a(z2, n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public d c(net.minecraft.ah.z z2, n n2, i i2) {
        d d10 = this.a(z2, n2);
        boolean bl2 = cL.b();
        d d11 = d10;
        if (!bl2) {
            d11 = d11.G() ? new d(net.minecraft.u.h.aU) : d10;
        }
        return d11;
    }

    protected a2() {
        super(net.minecraft.ac.c.k);
    }

    @Override
    public boolean a(t t2, n n2) {
        return true;
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    public boolean m() {
        return true;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.aU;
    }
}

