/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.W.cV;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class aF
extends aH {
    private /* synthetic */ boolean h;
    private /* synthetic */ boolean j;
    private /* synthetic */ boolean i;
    private /* synthetic */ boolean k;

    public aF(int n2, Random random, b b10, aA aA2) {
        String[] arrstring = u.b();
        super(n2);
        this.a(aA2);
        this.g = this.a(random);
        this.e = b10;
        this.i = random.nextBoolean();
        this.h = random.nextBoolean();
        this.k = random.nextBoolean();
        String[] arrstring2 = arrstring;
        int n3 = random.nextInt(3);
        if (arrstring2 != null) {
            n3 = n3 > 0 ? 1 : 0;
        }
        this.j = n3;
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("leftLow", this.i);
        r2.a("leftHigh", this.h);
        r2.a("rightLow", this.k);
        r2.a("rightHigh", this.j);
    }

    public aF() {
    }

    public static aF a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -4, -3, 0, 10, 9, 11, aA2);
        return aF.a(b10) && u.a(list, b10) == null ? new aF(n5, random, b10, aA2) : null;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        boolean bl2 = this.a(z2, b10);
        if (arrstring != null) {
            if (bl2) {
                return false;
            }
            this.a(z2, b10, 0, 0, 0, 9, 8, 10, true, random, b7.b());
            this.a(z2, random, b10, this.g, 4, 3, 0);
            bl2 = this.i;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 3, 1, 0, 5, 3, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            bl2 = this.k;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 9, 3, 1, 9, 5, 3, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            bl2 = this.h;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 0, 5, 7, 0, 7, 9, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            bl2 = this.j;
        }
        if (arrstring != null) {
            if (bl2) {
                this.a(z2, b10, 9, 5, 7, 9, 7, 9, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            }
            this.a(z2, b10, 5, 1, 10, 7, 3, 10, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            this.a(z2, b10, 1, 2, 1, 8, 2, 6, false, random, b7.b());
            this.a(z2, b10, 4, 1, 5, 4, 4, 9, false, random, b7.b());
            this.a(z2, b10, 8, 1, 5, 8, 4, 9, false, random, b7.b());
            this.a(z2, b10, 1, 4, 7, 3, 4, 9, false, random, b7.b());
            this.a(z2, b10, 1, 3, 5, 3, 3, 6, false, random, b7.b());
            this.a(z2, b10, 1, 3, 4, 3, 3, 4, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 1, 4, 6, 3, 4, 6, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 5, 1, 7, 7, 1, 8, false, random, b7.b());
            this.a(z2, b10, 5, 1, 9, 7, 1, 9, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 5, 2, 7, 7, 2, 7, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 4, 5, 7, 4, 5, 9, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 8, 5, 7, 8, 5, 9, net.minecraft.u.g.bO.d(), net.minecraft.u.g.bO.d(), false);
            this.a(z2, b10, 5, 5, 7, 7, 5, 9, net.minecraft.u.g.H.d(), net.minecraft.u.g.H.d(), false);
            this.a(z2, net.minecraft.u.g.h.d().a(cV.z, aA.SOUTH), 6, 5, 6, b10);
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        block15: {
            u u3;
            boolean bl2;
            int n2;
            block14: {
                String[] arrstring;
                int n3;
                block13: {
                    block12: {
                        n3 = 3;
                        n2 = 5;
                        aA aA2 = this.e();
                        arrstring = u.b();
                        if (arrstring == null) break block12;
                        if (aA2 != aA.WEST && aA2 != aA.NORTH) break block13;
                        n3 = 8 - n3;
                    }
                    n2 = 8 - n2;
                }
                this.a((aV)u2, list, random, 5, 1);
                bl2 = this.i;
                if (arrstring != null) {
                    if (bl2) {
                        this.c((aV)u2, list, random, n3, 1);
                    }
                    bl2 = this.h;
                }
                if (arrstring != null) {
                    if (bl2) {
                        this.c((aV)u2, list, random, n2, 7);
                    }
                    bl2 = this.k;
                }
                if (arrstring == null) break block14;
                if (bl2) {
                    this.b((aV)u2, list, random, n3, 1);
                }
                u3 = this;
                if (arrstring == null) break block15;
                bl2 = u3.j;
            }
            if (bl2) {
                u3 = this.b((aV)u2, list, random, n2, 7);
            }
        }
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.i = r2.f("leftLow");
        this.h = r2.f("leftHigh");
        this.k = r2.f("rightLow");
        this.j = r2.f("rightHigh");
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

