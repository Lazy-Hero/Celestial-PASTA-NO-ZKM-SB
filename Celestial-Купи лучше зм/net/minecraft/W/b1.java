/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 *  javax.annotation.Nullable
 */
package net.minecraft.W;

import com.google.common.base.Predicates;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.W.K;
import net.minecraft.W.bF;
import net.minecraft.W.cL;
import net.minecraft.Z.f;
import net.minecraft.Z.i;
import net.minecraft.ac.a;
import net.minecraft.ae.c;
import net.minecraft.ae.e;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.au.d;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.u.h;

public class b1
extends K {
    protected static final /* synthetic */ k D;
    private static /* synthetic */ d z;
    public static final /* synthetic */ e B;
    protected static final /* synthetic */ k C;
    public static final /* synthetic */ c A;

    static {
        B = bF.z;
        A = net.minecraft.ae.c.a("eye");
        D = new k(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
        C = new k(0.3125, 0.8125, 0.3125, 0.6875, 1.0, 0.6875);
    }

    @Override
    public i a(i i2, ae ae2) {
        return i2.a(B, ae2.a(i2.b(B)));
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, B, A);
    }

    @Override
    public boolean w(i i2) {
        return false;
    }

    public static d a() {
        boolean bl2 = cL.b();
        d d10 = z;
        if (!bl2) {
            if (d10 == null) {
                z = net.minecraft.au.g.b().a("?vvv?", ">???<", ">???<", ">???<", "?^^^?").a('?', f.a(net.minecraft.au.e.b)).a('^', f.a(net.minecraft.au.e.a(g.ad).a(A, Predicates.equalTo((Object)true)).a(B, Predicates.equalTo((Object)aA.SOUTH)))).a('>', f.a(net.minecraft.au.e.a(g.ad).a(A, Predicates.equalTo((Object)true)).a(B, Predicates.equalTo((Object)aA.WEST)))).a('v', f.a(net.minecraft.au.e.a(g.ad).a(A, Predicates.equalTo((Object)true)).a(B, Predicates.equalTo((Object)aA.NORTH)))).a('<', f.a(net.minecraft.au.e.a(g.ad).a(A, Predicates.equalTo((Object)true)).a(B, Predicates.equalTo((Object)aA.EAST)))).a();
            }
            d10 = z;
        }
        return d10;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d();
        boolean bl3 = n2 & 4;
        if (bl2) {
            bl3 = bl3;
        }
        return i2.a(A, bl3).a(B, aA.b(n2 & 3));
    }

    @Override
    public i a(i i2, net.minecraft.ar.h h2) {
        return i2.a(h2.b(i2.b(B)));
    }

    @Override
    public boolean s(i i2) {
        return true;
    }

    public b1() {
        super(net.minecraft.ac.c.H, net.minecraft.ac.a.I);
        this.h(this.e.a().a(B, aA.NORTH).a(A, false));
    }

    @Override
    public void a(i i2, z z2, n n2, k k2, List<k> list, @Nullable x x2, boolean bl2) {
        block3: {
            k k3;
            List<k> list2;
            k k4;
            n n3;
            block2: {
                boolean bl3 = cL.e();
                n3 = n2;
                k4 = k2;
                list2 = list;
                k3 = D;
                if (!bl3) break block2;
                b1.a(n3, k4, list2, k3);
                if (!z2.d(n2).b(A).booleanValue()) break block3;
                n3 = n2;
                k4 = k2;
                list2 = list;
                k3 = C;
            }
            b1.a(n3, k4, list2, k3);
        }
    }

    @Override
    public int b(i i2, z z2, n n2) {
        boolean bl2 = cL.b();
        int n3 = i2.b(A).booleanValue();
        if (!bl2) {
            n3 = n3 != 0 ? 15 : 0;
        }
        return n3;
    }

    @Override
    public boolean p(i i2) {
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k a(i i2, t t2, n n2) {
        return D;
    }

    @Override
    public i a(z z2, n n2, aA aA2, float f10, float f11, float f12, int n3, B b10) {
        return this.d().a(B, b10.K().h()).a(A, false);
    }

    @Override
    public net.minecraft.Z.d a(t t2, i i2, n n2, aA aA2) {
        return aA2 == aA.DOWN ? net.minecraft.Z.d.SOLID : net.minecraft.Z.d.UNDEFINED;
    }

    @Override
    public net.minecraft.w.k a(i i2, Random random, int n2) {
        return net.minecraft.u.h.v;
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        boolean bl2 = cL.e();
        n2 |= i2.b(B).k();
        int n3 = i2.b(A).booleanValue();
        if (bl2) {
            if (n3 != 0) {
                n2 |= 4;
            }
            n3 = n2;
        }
        return n3;
    }
}

