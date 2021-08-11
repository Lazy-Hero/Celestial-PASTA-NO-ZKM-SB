/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.T.aT;
import net.minecraft.T.ao;
import net.minecraft.U.x;
import net.minecraft.W.az;
import net.minecraft.Z.i;
import net.minecraft.ah.z;
import net.minecraft.ao.A;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.ar.v;
import net.minecraft.k.n;
import net.minecraft.u.g;

public class C
extends A {
    private /* synthetic */ ae l;
    private /* synthetic */ h m;
    private /* synthetic */ String k;

    public C() {
    }

    @Override
    protected void a(String string, n n2, z z2, Random random, b b10) {
        block18: {
            Object object;
            boolean bl2;
            block19: {
                block20: {
                    String[] arrstring;
                    block8: {
                        block9: {
                            block17: {
                                boolean bl3;
                                i i2;
                                block12: {
                                    block15: {
                                        block16: {
                                            block13: {
                                                block14: {
                                                    block10: {
                                                        block11: {
                                                            arrstring = u.b();
                                                            bl2 = string.startsWith("Chest");
                                                            if (arrstring == null) break block8;
                                                            if (!bl2) break block9;
                                                            object = this.g.g();
                                                            i2 = net.minecraft.u.g.cd.d();
                                                            bl3 = "ChestWest".equals(string);
                                                            if (arrstring == null) break block10;
                                                            if (!bl3) break block11;
                                                            i2 = i2.a(az.C, ((ae)((Object)object)).a(aA.WEST));
                                                            if (arrstring != null) break block12;
                                                        }
                                                        bl3 = "ChestEast".equals(string);
                                                    }
                                                    if (arrstring == null) break block13;
                                                    if (!bl3) break block14;
                                                    i2 = i2.a(az.C, ((ae)((Object)object)).a(aA.EAST));
                                                    if (arrstring != null) break block12;
                                                }
                                                bl3 = "ChestSouth".equals(string);
                                            }
                                            if (arrstring == null) break block15;
                                            if (!bl3) break block16;
                                            i2 = i2.a(az.C, ((ae)((Object)object)).a(aA.SOUTH));
                                            if (arrstring != null) break block12;
                                        }
                                        bl3 = "ChestNorth".equals(string);
                                    }
                                    if (arrstring == null) break block17;
                                    if (bl3) {
                                        i2 = i2.a(az.C, ((ae)((Object)object)).a(aA.NORTH));
                                    }
                                }
                                bl3 = this.a(z2, b10, random, n2, net.minecraft.aj.j.d, i2);
                            }
                            if (arrstring != null) break block18;
                        }
                        bl2 = "Mage".equals(string);
                    }
                    if (arrstring == null) break block19;
                    if (!bl2) break block20;
                    object = new ao(z2);
                    ((net.minecraft.U.C)object).A();
                    ((x)object).a(n2, 0.0f, 0.0f);
                    z2.f((x)object);
                    z2.a(n2, net.minecraft.u.g.bf.d(), 2);
                    if (arrstring != null) break block18;
                }
                bl2 = "Warrior".equals(string);
            }
            if (bl2) {
                object = new aT(z2);
                ((net.minecraft.U.C)object).A();
                ((x)object).a(n2, 0.0f, 0.0f);
                ((aT)object).a(z2.h(new n((x)object)), null);
                z2.f((x)object);
                z2.a(n2, net.minecraft.u.g.bf.d(), 2);
            }
        }
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.k = r2.j("Template");
        this.l = ae.valueOf(r2.j("Rot"));
        this.m = net.minecraft.ar.h.valueOf(r2.j("Mi"));
        this.a(j2);
    }

    public C(j j2, String string, n n2, ae ae2, h h2) {
        super(0);
        this.k = string;
        this.i = n2;
        this.l = ae2;
        this.m = h2;
        this.a(j2);
    }

    public C(j j2, String string, n n2, ae ae2) {
        this(j2, string, n2, ae2, net.minecraft.ar.h.NONE);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(j j2) {
        net.minecraft.ap.g g10 = j2.a(null, new v("mansion/" + this.k));
        k k2 = new k().b(true).a(this.l).a(this.m);
        this.a(g10, this.i, k2);
    }

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Template", this.k);
        r2.a("Rot", this.g.g().name());
        r2.a("Mi", this.g.d().name());
    }
}

