/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import java.util.Iterator;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.W.bq;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ax.T;
import net.minecraft.ax.a;
import net.minecraft.ax.h;
import net.minecraft.ax.u;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.u.b;
import net.minecraft.u.g;

public class F
extends u {
    public F(a a10, X ... arrx) {
        super(a10, h.ARMOR_FEET, arrx);
        this.b("frostWalker");
    }

    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(u u2) {
        String[] arrstring = T.b();
        u u4 = this;
        u4 = u2;
        if (arrstring == null) {
            if (!super.a(u4)) return false;
            u u4 = u2;
            u4 = net.minecraft.u.b.w;
        }
        if (u3 == u4) return false;
        return true;
    }

    @Override
    public int f() {
        return 2;
    }

    public static void a(B b10, z z2, n n2, int n3) {
        block4: {
            int n4;
            String[] arrstring;
            block3: {
                arrstring = T.b();
                n4 = b10.A;
                if (arrstring != null) break block3;
                if (n4 == 0) break block4;
                n4 = Math.min(16, 2 + n3);
            }
            float f10 = n4;
            o o2 = new o(0, 0, 0);
            Iterator<o> iterator = n.a(n2.a(-f10, -1.0, -f10), n2.a(f10, -1.0, f10)).iterator();
            while (iterator.hasNext()) {
                block6: {
                    o o3;
                    block10: {
                        int n5;
                        block9: {
                            i i2;
                            block8: {
                                i i3;
                                i i4;
                                block7: {
                                    i i5;
                                    block5: {
                                        o o4 = o3 = iterator.next();
                                        if (arrstring != null) break block5;
                                        if (!(o4.a(b10.a, b10.aF, b10.ax) <= (double)(f10 * f10))) break block6;
                                        o4 = o2.a(o3.e(), o3.b() + 1, o3.a());
                                    }
                                    i4 = i5 = z2.d(o2);
                                    if (arrstring != null) break block7;
                                    if (i4.o() != c.A) break block6;
                                    i4 = z2.d(o3);
                                }
                                i2 = i3 = i4;
                                if (arrstring != null) break block8;
                                if (i2.o() != c.L) break block6;
                                i2 = i3;
                            }
                            n5 = i2.b(bq.z);
                            if (arrstring != null) break block9;
                            if (n5 != 0) break block6;
                            n5 = z2.a(g.bj, o3, false, aA.DOWN, null) ? 1 : 0;
                        }
                        if (arrstring != null) break block10;
                        if (n5 == 0) break block6;
                        n5 = z2.a((n)o3, g.bj.d()) ? 1 : 0;
                    }
                    z2.a(o3.l(), g.bj, net.minecraft.k.h.a(b10.f(), 60, 120));
                }
                if (arrstring == null) continue;
            }
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

