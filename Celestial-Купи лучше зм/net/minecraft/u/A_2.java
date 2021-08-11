/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.U;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.U.z;
import net.minecraft.W.bA;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.u.E;

public class A
extends z {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean b() {
        return this.aG.d(this.aN).b() instanceof bA;
    }

    @Override
    public void a(@Nullable x x2) {
        this.a(net.minecraft.u.E.fS, 1.0f, 1.0f);
    }

    @Override
    public float l() {
        return -0.0625f;
    }

    @Override
    protected void e() {
        this.a = (double)this.aN.e() + 0.5;
        this.aF = (double)this.aN.b() + 0.5;
        this.ax = (double)this.aN.a() + 0.5;
    }

    @Override
    public int h() {
        return 9;
    }

    @Override
    public void a(aA aA2) {
    }

    public A(net.minecraft.ah.z z2, n n2) {
        super(z2, n2);
        this.g((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5);
        float f10 = 0.125f;
        float f11 = 0.1875f;
        float f12 = 0.25f;
        this.a(new k(this.a - 0.1875, this.aF - 0.25 + 0.125, this.ax - 0.1875, this.a + 0.1875, this.aF + 0.25 + 0.125, this.ax + 0.1875));
        this.j = true;
    }

    @Nullable
    public static A b(net.minecraft.ah.z z2, n n2) {
        int n3 = n2.e();
        int n4 = n2.b();
        int[] arrn = net.minecraft.U.M.b();
        int n5 = n2.a();
        Iterator<A> iterator = z2.a(A.class, new k((double)n3 - 1.0, (double)n4 - 1.0, (double)n5 - 1.0, (double)n3 + 1.0, (double)n4 + 1.0, (double)n5 + 1.0)).iterator();
        while (iterator.hasNext()) {
            block4: {
                A a10;
                block3: {
                    A a11;
                    a10 = a11 = iterator.next();
                    if (arrn == null) break block3;
                    if (!a10.g().equals(n2)) break block4;
                    a10 = a11;
                }
                return a10;
            }
            if (arrn != null) continue;
        }
        return null;
    }

    public A(net.minecraft.ah.z z2) {
        super(z2);
    }

    @Override
    public void d() {
        this.a(net.minecraft.u.E.dM, 1.0f, 1.0f);
    }

    @Override
    public boolean b(double d10) {
        int[] arrn = net.minecraft.U.M.b();
        double d11 = d10 - 1024.0;
        double d12 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
        if (arrn != null) {
            d12 = d12 < 0 ? 1.0 : 0.0;
        }
        return (boolean)d12;
    }

    public static A a(net.minecraft.ah.z z2, n n2) {
        A a10 = new A(z2, n2);
        z2.f(a10);
        a10.d();
        return a10;
    }

    @Override
    public boolean a(j j2, a3 a32) {
        boolean bl2;
        block11: {
            block15: {
                C c10;
                Iterator<C> iterator;
                List<C> list;
                int[] arrn;
                block10: {
                    arrn = net.minecraft.U.M.b();
                    boolean bl3 = this.aG.C;
                    if (arrn != null) {
                        if (bl3) {
                            return true;
                        }
                        bl3 = false;
                    }
                    boolean bl4 = bl3;
                    double d10 = 7.0;
                    list = this.aG.a(C.class, new k(this.a - 7.0, this.aF - 7.0, this.ax - 7.0, this.a + 7.0, this.aF + 7.0, this.ax + 7.0));
                    iterator = list.iterator();
                    while (iterator.hasNext()) {
                        block13: {
                            C c11;
                            block14: {
                                x x2;
                                block12: {
                                    x2 = c10 = iterator.next();
                                    if (arrn == null) break block12;
                                    bl2 = x2.O();
                                    if (arrn == null) break block10;
                                    if (!bl2) break block13;
                                    c11 = c10;
                                    if (arrn == null) break block14;
                                    x2 = c11.e();
                                }
                                if (x2 != j2) break block13;
                                c11 = c10;
                            }
                            c11.a((x)this, true);
                            bl4 = true;
                        }
                        if (arrn != null) continue;
                    }
                    bl2 = bl4;
                }
                if (arrn == null) break block11;
                if (bl2) break block15;
                this.a();
                bl2 = j2.cw.g;
                if (arrn == null) break block11;
                if (!bl2) break block15;
                iterator = list.iterator();
                while (iterator.hasNext()) {
                    block17: {
                        C c12;
                        block18: {
                            x x3;
                            block16: {
                                x3 = c10 = iterator.next();
                                if (arrn == null) break block16;
                                bl2 = x3.O();
                                if (arrn == null) break block11;
                                if (!bl2) break block17;
                                c12 = c10;
                                if (arrn == null) break block18;
                                x3 = c12.e();
                            }
                            if (x3 != this) break block17;
                            c12 = c10;
                        }
                        c12.a(true, false);
                    }
                    if (arrn != null) continue;
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void g(double d10, double d11, double d12) {
        super.g((double)h.f(d10) + 0.5, (double)h.f(d11) + 0.5, (double)h.f(d12) + 0.5);
    }

    @Override
    public void f(r r2) {
    }

    @Override
    public int c() {
        return 9;
    }

    @Override
    public void a(r r2) {
    }

    @Override
    public boolean e(r r2) {
        return false;
    }
}

