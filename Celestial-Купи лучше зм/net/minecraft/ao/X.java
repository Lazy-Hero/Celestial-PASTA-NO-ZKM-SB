/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.T.aW;
import net.minecraft.U.h;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class X
extends I {
    private /* synthetic */ boolean g;

    public X(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block8: {
            int n3;
            String[] arrstring;
            block10: {
                int n4;
                block11: {
                    this.a(z2, b10, 0, 2, 0, 6, 7, 7, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                    this.a(z2, b10, 1, 0, 0, 5, 1, 7, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 2, 1, 5, 2, 7, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 3, 2, 5, 3, 7, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 4, 3, 5, 4, 7, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 2, 0, 1, 4, 2, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 5, 2, 0, 5, 4, 2, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 5, 2, 1, 5, 3, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 5, 5, 2, 5, 5, 3, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 0, 5, 3, 0, 5, 8, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 6, 5, 3, 6, 5, 8, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 5, 8, 5, 5, 8, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, net.minecraft.u.g.dn.d(), 1, 6, 3, b10);
                    this.a(z2, net.minecraft.u.g.dn.d(), 5, 6, 3, b10);
                    this.a(z2, b10, 0, 6, 3, 0, 6, 8, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    this.a(z2, b10, 6, 6, 3, 6, 6, 8, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    String[] arrstring2 = u.b();
                    this.a(z2, b10, 1, 6, 8, 5, 7, 8, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    arrstring = arrstring2;
                    this.a(z2, b10, 2, 8, 8, 4, 8, 8, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    n4 = this.g;
                    if (arrstring == null) break block10;
                    if (n4 != 0) break block11;
                    n n5 = new n(this.b(3, 5), this.a(5), this.a(3, 5));
                    n4 = b10.a(n5) ? 1 : 0;
                    if (arrstring == null) break block10;
                    if (n4 == 0) break block11;
                    this.g = true;
                    z2.a(n5, net.minecraft.u.g.i.d(), 2);
                    y y2 = z2.b(n5);
                    n4 = y2 instanceof T;
                    if (arrstring == null) break block10;
                    if (n4 != 0) {
                        ((T)y2).a().a(h.a(aW.class));
                    }
                }
                n4 = n3 = 0;
            }
            while (n3 <= 6) {
                block9: {
                    n2 = 0;
                    if (arrstring == null) break block8;
                    for (int i2 = v481874; i2 <= 6; ++i2) {
                        this.b(z2, net.minecraft.u.g.dk.d(), n3, -1, i2, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block9;
                    }
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.g = r2.f("Mob");
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Mob", this.g);
    }

    public X() {
    }

    public static X a(List<u> list, Random random, int n2, int n3, int n4, int n5, aA aA2) {
        b b10 = b.a(n2, n3, n4, -2, 0, 0, 7, 8, 9, aA2);
        return X.a(b10) && u.a(list, b10) == null ? new X(n5, random, b10, aA2) : null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

