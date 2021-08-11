/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.W;

import net.minecraft.J.r;
import net.minecraft.U.B;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.bw;
import net.minecraft.W.cL;
import net.minecraft.W.dW;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ad.a;
import net.minecraft.ae.e;
import net.minecraft.ae.f;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.Q;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.at.h;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bv
extends bw {
    public static final /* synthetic */ e C;
    protected static final /* synthetic */ Logger A;
    protected static final /* synthetic */ k B;
    public static final /* synthetic */ f E;
    protected static final /* synthetic */ k D;

    @Override
    public void a(z z2, n n2, i i2, i i3) {
        z2.b(1031, n2, 0);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return net.minecraft.Z.d.UNDEFINED;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i a(i i2, ae ae2) {
        i i3;
        boolean bl2 = cL.e();
        i i4 = i2;
        if (bl2) {
            if (i4.b() != this) {
                i3 = i2;
                return i3;
            }
            i4 = i2;
        }
        i3 = i4.a(C, ae2.a(i2.b(C)));
        return i3;
    }

    protected bv() {
        super(net.minecraft.ac.c.r);
        this.h(this.e.a().a(C, aA.NORTH).a(E, 0));
        this.d(0);
        this.a(net.minecraft.ad.a.j);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(C).k();
        return n2 |= i2.b(E) << 2;
    }

    @Override
    protected void a(r r2) {
        r2.a(true);
    }

    @Override
    public k a(i i2, t t2, n n2) {
        aA aA2 = i2.b(C);
        return aA2.g() == Q.X ? D : B;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        aA aA3 = b10.K().l();
        boolean bl2 = cL.e();
        try {
            return super.a(z2, n2, aA2, f10, f11, f12, n3, b10).a(C, aA3).a(E, n3 >> 2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            block5: {
                B b11;
                block6: {
                    boolean bl3;
                    block4: {
                        bl3 = z2.C;
                        if (!bl2) break block4;
                        if (bl3) break block5;
                        A.warn(String.format("Invalid damage property for anvil at %s. Found %d, must be in [0, 1, 2]", n2, n3 >> 2));
                        b11 = b10;
                        if (!bl2) break block6;
                        bl3 = b11 instanceof j;
                    }
                    if (!bl3) break block5;
                    b11 = b10;
                }
                b11.a(new h("Invalid damage property. Please pick in [0, 1, 2]", new Object[0]));
            }
            return super.a(z2, n2, aA2, f10, f11, f12, 0, b10).a(C, aA3).a(E, 0);
        }
    }

    @Override
    public boolean a(z z2, n n2, i i2, j j2, a3 a32, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = cL.e();
        boolean bl3 = z2.C;
        if (bl2) {
            if (!bl3) {
                j2.a(new dW(z2, n2));
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    @Override
    public int g(i i2) {
        return i2.b(E);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, C, E);
    }

    @Override
    public boolean b(i i2, t t2, n n2, aA aA2) {
        return true;
    }

    @Override
    public i c(int n2) {
        return this.d().a(C, aA.b(n2 & 3)).a(E, (n2 & 0xF) >> 2);
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        a22.add(new d(this));
        a22.add(new d(this, 1, 1));
        a22.add(new d(this, 1, 2));
    }

    static {
        C = bF.z;
        E = f.a("damage", 0, 2);
        D = new k(0.0, 0.0, 0.125, 1.0, 1.0, 0.875);
        B = new k(0.125, 0.0, 0.0, 0.875, 1.0, 1.0);
        A = LogManager.getLogger();
    }

    @Override
    public void a(z z2, n n2) {
        z2.b(1029, n2, 0);
    }
}

