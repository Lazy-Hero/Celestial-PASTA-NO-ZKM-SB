/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.I;
import net.minecraft.ao.R;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class K
extends I {
    private /* synthetic */ boolean g;

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Chest", this.g);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.g = r2.f("Chest");
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        this.c((R)u2, list, random, 0, 1, true);
    }

    public K() {
    }

    private static gP a(gP gP2) {
        return gP2;
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
                    String[] arrstring2 = u.b();
                    this.a(z2, b10, 0, 0, 0, 4, 1, 4, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 0, 2, 0, 4, 5, 4, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                    this.a(z2, b10, 0, 2, 0, 0, 5, 4, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    arrstring = arrstring2;
                    this.a(z2, b10, 0, 3, 1, 0, 4, 1, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    this.a(z2, b10, 0, 3, 3, 0, 4, 3, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dn.d(), false);
                    this.a(z2, b10, 4, 2, 0, 4, 5, 0, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 2, 4, 4, 5, 4, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 1, 3, 4, 1, 4, 4, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dk.d(), false);
                    this.a(z2, b10, 3, 3, 4, 3, 4, 4, net.minecraft.u.g.dn.d(), net.minecraft.u.g.dk.d(), false);
                    n4 = this.g;
                    if (arrstring == null) break block10;
                    if (n4 == 0) break block11;
                    n4 = b10.a(new n(this.b(1, 3), this.a(2), this.a(1, 3))) ? 1 : 0;
                    if (arrstring == null) break block10;
                    if (n4 != 0) {
                        this.g = false;
                        this.a(z2, b10, random, 1, 2, 3, net.minecraft.aj.j.an);
                    }
                }
                this.a(z2, b10, 0, 6, 0, 4, 6, 4, net.minecraft.u.g.dk.d(), net.minecraft.u.g.dk.d(), false);
                n4 = n3 = 0;
            }
            while (n3 <= 4) {
                block9: {
                    n2 = 0;
                    if (arrstring == null) break block8;
                    for (int i2 = v443637; i2 <= 4; ++i2) {
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

    public K(int n2, Random random, b b10, aA aA2) {
        super(n2);
        String[] arrstring = u.b();
        this.a(aA2);
        String[] arrstring2 = arrstring;
        this.e = b10;
        int n3 = random.nextInt(3);
        if (arrstring2 != null) {
            n3 = n3 == 0 ? 1 : 0;
        }
        this.g = n3;
    }

    public static K a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -1, 0, 0, 5, 7, 5, aA2);
        return K.a(b10) && u.a(list, b10) == null ? new K(n5, random, b10, aA2) : null;
    }
}

