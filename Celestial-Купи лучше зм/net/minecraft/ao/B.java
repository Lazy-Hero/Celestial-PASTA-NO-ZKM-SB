/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.J.l;
import net.minecraft.N.O;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.T.aF;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ao.A;
import net.minecraft.ao.b;
import net.minecraft.ao.t;
import net.minecraft.ao.u;
import net.minecraft.ap.g;
import net.minecraft.ap.j;
import net.minecraft.ap.k;
import net.minecraft.ar.aA;
import net.minecraft.ar.ae;
import net.minecraft.ar.v;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.u.h;
import net.minecraft.w.d;

public class B
extends A {
    private /* synthetic */ String m;
    private /* synthetic */ ae l;
    private /* synthetic */ boolean k;

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.a("Template", this.m);
        r2.a("Rot", this.l.name());
        r2.a("OW", this.k);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.m = r2.j("Template");
        this.l = ae.valueOf(r2.j("Rot"));
        this.k = r2.f("OW");
        this.a(j2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private void a(j j2) {
        g g10 = j2.a(null, new v("endcity/" + this.m));
        k k2 = (this.k ? t.d() : t.b()).i().a(this.l);
        this.a(g10, this.i, k2);
    }

    @Override
    protected void a(String string, n n2, z z2, Random random, b b10) {
        block11: {
            Object object;
            boolean bl2;
            block12: {
                block13: {
                    String[] arrstring;
                    block7: {
                        block8: {
                            block9: {
                                y y2;
                                block10: {
                                    y y3;
                                    arrstring = u.b();
                                    bl2 = string.startsWith("Chest");
                                    if (arrstring == null) break block7;
                                    if (!bl2) break block8;
                                    object = n2.k();
                                    if (!b10.a((m)object)) break block9;
                                    y2 = y3 = z2.b((n)object);
                                    if (arrstring == null) break block10;
                                    if (!(y2 instanceof O)) break block9;
                                    y2 = y3;
                                }
                                ((O)y2).a(net.minecraft.aj.j.L, random.nextLong());
                            }
                            if (arrstring != null) break block11;
                        }
                        bl2 = string.startsWith("Sentry");
                    }
                    if (arrstring == null) break block12;
                    if (!bl2) break block13;
                    object = new aF(z2);
                    ((aF)object).g((double)n2.e() + 0.5, (double)n2.b() + 0.5, (double)n2.a() + 0.5);
                    ((aF)object).c(n2);
                    z2.f((x)object);
                    if (arrstring != null) break block11;
                }
                bl2 = string.startsWith("Elytra");
            }
            if (bl2) {
                object = new l(z2, n2, this.l.a(aA.SOUTH));
                ((l)object).a(new d(net.minecraft.u.h.cf));
                z2.f((x)object);
            }
        }
    }

    public B(j j2, String string, n n2, ae ae2, boolean bl2) {
        super(0);
        this.m = string;
        this.i = n2;
        this.l = ae2;
        this.k = bl2;
        this.a(j2);
    }

    public B() {
    }
}

