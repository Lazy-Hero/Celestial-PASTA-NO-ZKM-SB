/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.e;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.ay;
import net.minecraft.ar.d;
import net.minecraft.e.f;
import net.minecraft.e.h;
import net.minecraft.e.i;
import net.minecraft.i.j;
import net.minecraft.k.k;

public class n
implements net.minecraft.ah.k {
    private final /* synthetic */ List<i> a;

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(z z2, net.minecraft.k.n n2, net.minecraft.Z.i i2, net.minecraft.Z.i i3) {
        k k2 = i2.d(z2, n2);
        int n3 = i.g();
        k k3 = i3.d(z2, n2);
        k k4 = k2;
        if (n3 == 0) {
            if (k4 == k3) return false;
            k4 = k2;
        }
        if (n3 == 0) {
            if (k4 == null) return true;
            k4 = k2;
        }
        boolean bl2 = k4.equals(k3);
        if (n3 != 0) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public void a(int n2, net.minecraft.k.n n3, int n4) {
    }

    public n() {
        this.a = Lists.newArrayList();
    }

    @Override
    public void a(int n2, boolean bl2, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
    }

    @Override
    public void a(j j2, int n2, net.minecraft.k.n n3, int n4) {
    }

    @Override
    public void a(int n2, boolean bl2, boolean bl3, double d10, double d11, double d12, double d13, double d14, double d15, int ... arrn) {
    }

    @Override
    public void a(z z2, net.minecraft.k.n n2, net.minecraft.Z.i i2, net.minecraft.Z.i i3, int n3) {
        block6: {
            int n4;
            int n5;
            block5: {
                n5 = i.n();
                n4 = this.a(z2, n2, i2, i3);
                if (n5 == 0) break block5;
                if (n4 == 0) break block6;
                n4 = 0;
            }
            int n6 = n4;
            int n7 = this.a.size();
            while (n6 < n7) {
                block7: {
                    block8: {
                        h h2;
                        h h3;
                        i i4;
                        block11: {
                            int n8;
                            block10: {
                                i i5;
                                block9: {
                                    i4 = this.a.get(n6);
                                    if (n5 == 0) break block7;
                                    if (i4 == null) break block8;
                                    i5 = i4;
                                    if (n5 == 0) break block9;
                                    if (i5.p()) break block8;
                                    i5 = i4;
                                }
                                h3 = i5.k();
                                if (n5 == 0) break block7;
                                if (h3 == null) break block8;
                                n8 = h3.h();
                                if (n5 == 0) break block10;
                                if (n8 != 0) break block8;
                                h2 = h3;
                                if (n5 == 0) break block11;
                                n8 = h2.f();
                            }
                            if (n8 == 0) break block8;
                            h2 = i4.c;
                        }
                        f f10 = h2.d();
                        double d10 = n2.b(((double)f10.g + i4.j.a) / 2.0, ((double)f10.m + i4.j.aF) / 2.0, ((double)f10.f + i4.j.ax) / 2.0);
                        int n9 = (h3.f() - h3.a()) * (h3.f() - h3.a());
                        if (n5 == 0) break block7;
                        if (d10 < (double)n9) {
                            i4.m();
                        }
                    }
                    ++n6;
                }
                if (n5 != 0) continue;
            }
        }
    }

    @Override
    public void a(net.minecraft.k.n n2) {
    }

    @Override
    public void a(x x2) {
        int n2 = i.g();
        boolean bl2 = x2 instanceof C;
        if (n2 == 0 && bl2) {
            bl2 = this.a.add(((C)x2).l());
        }
    }

    @Override
    public void a(d d10, net.minecraft.k.n n2) {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(@Nullable j j2, d d10, ay ay2, double d11, double d12, double d13, float f10, float f11) {
    }

    @Override
    public void b(int n2, net.minecraft.k.n n3, int n4) {
    }

    @Override
    public void b(x x2) {
        int n2 = i.g();
        boolean bl2 = x2 instanceof C;
        if (n2 == 0 && bl2) {
            bl2 = this.a.remove(((C)x2).l());
        }
    }
}

