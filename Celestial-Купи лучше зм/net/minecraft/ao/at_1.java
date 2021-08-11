/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.N.T;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.T.a3;
import net.minecraft.U.h;
import net.minecraft.W.b1;
import net.minecraft.W.cG;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.aV;
import net.minecraft.ao.ai;
import net.minecraft.ao.b;
import net.minecraft.ao.b7;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class at
extends aH {
    private /* synthetic */ boolean h;

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Mob", this.h);
    }

    public at(int n2, Random random, b b10, aA aA2) {
        super(n2);
        this.a(aA2);
        this.e = b10;
    }

    @Override
    public void a(u u2, List<u> list, Random random) {
        block3: {
            block2: {
                String[] arrstring = u.b();
                u u3 = u2;
                if (arrstring == null) break block2;
                if (u3 == null) break block3;
                u3 = u2;
            }
            ((aV)u3).j = this;
        }
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.f("Mob");
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public at() {
    }

    public static at a(List<u> list, Random random, int n2, int n3, int n4, aA aA2, int n5) {
        b b10 = b.a(n2, n3, n4, -4, -1, 0, 11, 8, 16, aA2);
        return at.a(b10) && u.a(list, b10) == null ? new at(n5, random, b10, aA2) : null;
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        boolean bl2;
        block16: {
            block17: {
                boolean bl3;
                int n2;
                String[] arrstring;
                block15: {
                    int n3;
                    block14: {
                        String[] arrstring2 = u.b();
                        this.a(z2, b10, 0, 0, 0, 10, 7, 15, false, random, b7.b());
                        this.a(z2, random, b10, ai.GRATES, 4, 1, 0);
                        arrstring = arrstring2;
                        n2 = 6;
                        this.a(z2, b10, 1, n2, 1, 1, n2, 14, false, random, b7.b());
                        this.a(z2, b10, 9, n2, 1, 9, n2, 14, false, random, b7.b());
                        this.a(z2, b10, 2, n2, 1, 8, n2, 2, false, random, b7.b());
                        this.a(z2, b10, 2, n2, 14, 8, n2, 14, false, random, b7.b());
                        this.a(z2, b10, 1, 1, 1, 2, 1, 4, false, random, b7.b());
                        this.a(z2, b10, 8, 1, 1, 9, 1, 4, false, random, b7.b());
                        this.a(z2, b10, 1, 1, 1, 1, 1, 3, net.minecraft.u.g.ag.d(), net.minecraft.u.g.ag.d(), false);
                        this.a(z2, b10, 9, 1, 1, 9, 1, 3, net.minecraft.u.g.ag.d(), net.minecraft.u.g.ag.d(), false);
                        this.a(z2, b10, 3, 1, 8, 7, 1, 12, false, random, b7.b());
                        this.a(z2, b10, 4, 1, 9, 6, 1, 11, net.minecraft.u.g.ag.d(), net.minecraft.u.g.ag.d(), false);
                        for (n3 = 3; n3 < 14; n3 += 2) {
                            this.a(z2, b10, 0, 3, n3, 0, 4, n3, net.minecraft.u.g.dd.d(), net.minecraft.u.g.dd.d(), false);
                            this.a(z2, b10, 10, 3, n3, 10, 4, n3, net.minecraft.u.g.dd.d(), net.minecraft.u.g.dd.d(), false);
                            if (arrstring != null) {
                                if (arrstring != null) continue;
                            }
                            break block14;
                        }
                        n3 = 2;
                    }
                    while (n3 < 9) {
                        this.a(z2, b10, n3, 3, 15, n3, 4, 15, net.minecraft.u.g.dd.d(), net.minecraft.u.g.dd.d(), false);
                        n3 += 2;
                        if (arrstring != null) continue;
                    }
                    i i2 = net.minecraft.u.g.cX.d().a(cG.V, aA.NORTH);
                    this.a(z2, b10, 4, 1, 5, 6, 1, 7, false, random, b7.b());
                    this.a(z2, b10, 4, 2, 6, 6, 2, 7, false, random, b7.b());
                    this.a(z2, b10, 4, 3, 7, 6, 3, 7, false, random, b7.b());
                    for (int i3 = 4; i3 <= 6; ++i3) {
                        this.a(z2, i2, i3, 1, 4, b10);
                        this.a(z2, i2, i3, 2, 5, b10);
                        this.a(z2, i2, i3, 3, 6, b10);
                        if (arrstring != null) continue;
                    }
                    i i4 = net.minecraft.u.g.ad.d().a(b1.B, aA.NORTH);
                    i i5 = net.minecraft.u.g.ad.d().a(b1.B, aA.SOUTH);
                    i i6 = net.minecraft.u.g.ad.d().a(b1.B, aA.EAST);
                    i i7 = net.minecraft.u.g.ad.d().a(b1.B, aA.WEST);
                    bl3 = true;
                    boolean[] arrbl = new boolean[12];
                    for (int i8 = 0; i8 < arrbl.length; ++i8) {
                        if (arrstring != null) {
                            float f10 = random.nextFloat() - 0.9f;
                            float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                            if (arrstring != null) {
                                f11 = f11 > 0 ? 1.0f : 0.0f;
                            }
                            arrbl[i8] = f11;
                            bl3 &= arrbl[i8];
                            if (arrstring != null) continue;
                        }
                        break block15;
                    }
                    this.a(z2, i4.a(b1.A, arrbl[0]), 4, 3, 8, b10);
                    this.a(z2, i4.a(b1.A, arrbl[1]), 5, 3, 8, b10);
                    this.a(z2, i4.a(b1.A, arrbl[2]), 6, 3, 8, b10);
                    this.a(z2, i5.a(b1.A, arrbl[3]), 4, 3, 12, b10);
                    this.a(z2, i5.a(b1.A, arrbl[4]), 5, 3, 12, b10);
                    this.a(z2, i5.a(b1.A, arrbl[5]), 6, 3, 12, b10);
                    this.a(z2, i6.a(b1.A, arrbl[6]), 3, 3, 9, b10);
                    this.a(z2, i6.a(b1.A, arrbl[7]), 3, 3, 10, b10);
                    this.a(z2, i6.a(b1.A, arrbl[8]), 3, 3, 11, b10);
                    this.a(z2, i7.a(b1.A, arrbl[9]), 7, 3, 9, b10);
                    this.a(z2, i7.a(b1.A, arrbl[10]), 7, 3, 10, b10);
                    this.a(z2, i7.a(b1.A, arrbl[11]), 7, 3, 11, b10);
                }
                bl2 = bl3;
                if (arrstring != null) {
                    if (bl2) {
                        i i9 = net.minecraft.u.g.df.d();
                        this.a(z2, i9, 4, 3, 9, b10);
                        this.a(z2, i9, 5, 3, 9, b10);
                        this.a(z2, i9, 6, 3, 9, b10);
                        this.a(z2, i9, 4, 3, 10, b10);
                        this.a(z2, i9, 5, 3, 10, b10);
                        this.a(z2, i9, 6, 3, 10, b10);
                        this.a(z2, i9, 4, 3, 11, b10);
                        this.a(z2, i9, 5, 3, 11, b10);
                        this.a(z2, i9, 6, 3, 11, b10);
                    }
                    bl2 = this.h;
                }
                if (arrstring == null) break block16;
                if (bl2) break block17;
                n2 = this.a(3);
                n n4 = new n(this.b(5, 6), n2, this.a(5, 6));
                bl2 = b10.a(n4);
                if (arrstring == null) break block16;
                if (!bl2) break block17;
                this.h = true;
                z2.a(n4, net.minecraft.u.g.i.d(), 2);
                y y2 = z2.b(n4);
                bl2 = y2 instanceof T;
                if (arrstring == null) break block16;
                if (bl2) {
                    ((T)y2).a().a(net.minecraft.U.h.a(a3.class));
                }
            }
            bl2 = true;
        }
        return bl2;
    }
}

