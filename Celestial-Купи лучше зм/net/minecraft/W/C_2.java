/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.W.K;
import net.minecraft.W.cu;
import net.minecraft.W.d_;
import net.minecraft.W.dm;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ae.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.ay;
import net.minecraft.i.j;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.s;

public class C
extends s {
    private final /* synthetic */ cu u;
    private final /* synthetic */ cu t;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        aX aX2;
        Comparable<?> comparable;
        int n3;
        d d10;
        block8: {
            Object object;
            dm dm2;
            Object obj;
            a<?> a10;
            block11: {
                block12: {
                    aA aA3;
                    aA aA4;
                    dm dm3;
                    block9: {
                        block10: {
                            d10 = j2.c(a32);
                            n3 = bl.c();
                            boolean bl2 = d10.G();
                            if (n3 == 0) {
                                if (bl2) return aX.FAIL;
                                bl2 = j2.a(n2.a(aA2), aA2, d10);
                            }
                            if (!bl2) return aX.FAIL;
                            comparable = this.u.a(d10);
                            i i2 = z2.d(n2);
                            if (i2.b() != this.u) break block8;
                            a10 = this.u.a();
                            obj = i2.b(a10);
                            dm3 = i2.b(cu.B);
                            aA aA3 = aA2;
                            aA3 = aA.UP;
                            if (n3 != 0) break block9;
                            if (aA4 != aA3) break block10;
                            dm2 = dm3;
                            object = dm.BOTTOM;
                            if (n3 != 0) break block11;
                            if (dm2 == object) break block12;
                        }
                        aA aA3 = aA2;
                        aA3 = aA.DOWN;
                    }
                    if (aA4 != aA3) break block8;
                    dm2 = dm3;
                    object = dm.TOP;
                    if (n3 != 0) break block11;
                    if (dm2 != object) break block8;
                }
                dm2 = obj;
                object = comparable;
            }
            if (dm2 == object) {
                i i3 = this.a(a10, (Comparable<?>)obj);
                k k2 = i3.d(z2, n2);
                if (k2 == K.a) return aX.SUCCESS;
                boolean bl3 = z2.e(k2.a(n2));
                if (n3 == 0) {
                    if (!bl3) return aX.SUCCESS;
                    bl3 = z2.a(n2, i3, 11);
                }
                if (!bl3) return aX.SUCCESS;
                d_ d_2 = this.t.l();
                z2.a(j2, n2, d_2.a(), ay.BLOCKS, (d_2.c() + 1.0f) / 2.0f, d_2.e() * 0.8f);
                d10.b(1);
                if (!(j2 instanceof net.minecraft.i.k)) return aX.SUCCESS;
                a6.s.a((net.minecraft.i.k)j2, n2, d10);
                return aX.SUCCESS;
            }
        }
        C c10 = this;
        j j3 = j2;
        if (n3 == 0) {
            if (c10.a(j3, d10, z2, n2.a(aA2), comparable)) {
                aX2 = aX.SUCCESS;
                return aX2;
            }
            c10 = this;
            j3 = j2;
        }
        aX2 = super.a(j3, z2, n2, a32, aA2, f10, f11, f12);
        return aX2;
    }

    @Override
    public String d(d d10) {
        return this.u.a(d10.d());
    }

    public C(K k2, cu cu2, cu cu3) {
        super(k2);
        this.u = cu2;
        this.t = cu3;
        this.d(0);
        this.a(true);
    }

    @Override
    public int c(int n2) {
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(z z2, n n2, aA aA2, j j2, d d10) {
        i i2;
        i i3;
        Comparable<?> comparable;
        int n3;
        a<?> a10;
        n n4;
        block5: {
            block6: {
                i i4;
                block8: {
                    aA aA3;
                    aA aA4;
                    boolean bl2;
                    block7: {
                        n4 = n2;
                        a10 = this.u.a();
                        n3 = bl.g();
                        comparable = this.u.a(d10);
                        i3 = i4 = z2.d(n2);
                        if (n3 == 0) break block5;
                        if (i3.b() != this.u) break block6;
                        bl2 = i4.b(cu.B) == dm.TOP;
                        aA4 = aA2;
                        aA3 = aA.UP;
                        if (n3 == 0) break block7;
                        if (aA4 == aA3 && !bl2) break block8;
                        aA4 = aA2;
                        aA3 = aA.DOWN;
                    }
                    if (aA4 != aA3 || !bl2) break block6;
                }
                if (comparable == i4.b(a10)) {
                    return true;
                }
            }
            n2 = n2.a(aA2);
            i3 = z2.d(n2);
        }
        if ((i2 = i3).b() == this.u) {
            if (comparable == i2.b(a10)) return true;
        }
        boolean bl3 = super.a(z2, n4, aA2, j2, d10);
        if (n3 == 0) return bl3;
        if (!bl3) return false;
        return true;
    }

    private boolean a(j j2, d d10, z z2, n n2, Object object) {
        block5: {
            boolean bl2;
            block7: {
                block6: {
                    Object obj;
                    i i2;
                    int n3;
                    block4: {
                        i i3 = z2.d(n2);
                        n3 = bl.c();
                        i2 = i3;
                        if (n3 != 0) break block4;
                        if (i2.b() != this.u) break block5;
                        i2 = i3;
                    }
                    if ((obj = i2.b(this.u.a())) != object) break block5;
                    i i4 = this.a(this.u.a(), (Comparable<?>)obj);
                    k k2 = i4.d(z2, n2);
                    if (k2 == K.a) break block6;
                    bl2 = z2.e(k2.a(n2));
                    if (n3 != 0) break block7;
                    if (!bl2) break block6;
                    bl2 = z2.a(n2, i4, 11);
                    if (n3 != 0) break block7;
                    if (bl2) {
                        d_ d_2 = this.t.l();
                        z2.a(j2, n2, d_2.a(), ay.BLOCKS, (d_2.c() + 1.0f) / 2.0f, d_2.e() * 0.8f);
                        d10.b(1);
                    }
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    protected <T extends Comparable<T>> i a(a<T> a10, Comparable<?> comparable) {
        return this.t.d().a(a10, comparable);
    }
}

