/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.r;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ax.f;
import net.minecraft.ax.u;
import net.minecraft.client.B.o;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.h;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class S
extends k {
    @Override
    public boolean f(d d10) {
        return false;
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block11: {
            a a11;
            int n2;
            block12: {
                block13: {
                    n2 = bl.c();
                    a11 = a10;
                    if (n2 != 0) break block12;
                    if (a11 != net.minecraft.ad.a.b) break block13;
                    block0: for (u u2 : u.e) {
                        block15: {
                            block14: {
                                if (n2 != 0) break block11;
                                u u3 = u2;
                                if (n2 != 0) break block14;
                                if (u3.b == null) break block15;
                                u3 = u2;
                            }
                            for (int i2 = (v1724540).g(); i2 <= u2.f(); ++i2) {
                                a22.add(S.a(new f(u2, i2)));
                                if (n2 != 0) continue block0;
                                if (n2 == 0) continue;
                            }
                        }
                        if (n2 == 0) continue;
                    }
                    if (n2 == 0) break block11;
                }
                a11 = a10;
            }
            if (a11.b().length != 0) {
                for (u u2 : u.e) {
                    boolean bl2 = a10.a(u2.b);
                    if (n2 == 0 && bl2) {
                        bl2 = a22.add(S.a(new f(u2, u2.f())));
                    }
                    if (n2 == 0) continue;
                }
            }
        }
    }

    public static void a(d d10, f f10) {
        d d11;
        net.minecraft.P.u u2;
        block14: {
            short s2;
            block13: {
                int n2;
                block12: {
                    u2 = S.a(d10);
                    short s3 = 1;
                    int n3 = 0;
                    n2 = bl.c();
                    while (n3 < u2.b()) {
                        r r2 = u2.d(n3);
                        if (n2 == 0) {
                            s2 = r2.q("id");
                            if (n2 != 0) break block12;
                            if (u.c(s2) == f10.b) {
                                short s4 = r2.q("lvl");
                                if (n2 == 0) {
                                    if (s4 < f10.c) {
                                        r2.a("lvl", (short)f10.c);
                                    }
                                    s4 = s3 = 0;
                                }
                                if (n2 == 0) break;
                            }
                            ++n3;
                        }
                        if (n2 == 0) continue;
                    }
                    s2 = s3;
                }
                if (n2 != 0) break block13;
                if (s2 != 0) {
                    r r3 = new r();
                    r3.a("id", (short)u.c(f10.b));
                    r3.a("lvl", (short)f10.c);
                    u2.a(r3);
                }
                d11 = d10;
                if (n2 != 0) break block14;
                s2 = d11.x();
            }
            if (s2 == 0) {
                d10.b(new r());
            }
            d11 = d10;
        }
        d11.v().a("StoredEnchantments", u2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static net.minecraft.P.u a(d d10) {
        net.minecraft.P.u u2;
        r r2 = d10.v();
        int n2 = bl.c();
        r r3 = r2;
        if (n2 == 0) {
            if (r3 == null) {
                u2 = new net.minecraft.P.u();
                return u2;
            }
            r3 = r2;
        }
        u2 = r3.c("StoredEnchantments", 10);
        return u2;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        super.a(d10, z2, list, o2);
        net.minecraft.P.u u2 = S.a(d10);
        int n2 = 0;
        int n3 = bl.g();
        while (n2 < u2.b()) {
            r r2 = u2.d(n2);
            short s2 = r2.q("id");
            u u3 = u.c(s2);
            if (n3 != 0) {
                if (u3 != null) {
                    list.add(u3.d(r2.q("lvl")));
                }
                ++n2;
            }
            if (n3 != 0) continue;
        }
    }

    public static d a(f f10) {
        d d10 = new d(net.minecraft.u.h.a0);
        S.a(d10, f10);
        return d10;
    }

    @Override
    public h a(d d10) {
        return S.a(d10).c() ? super.a(d10) : net.minecraft.w.h.UNCOMMON;
    }

    @Override
    public boolean e(d d10) {
        return true;
    }
}

