/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.client.F;

import com.mojang.authlib.GameProfile;
import net.minecraft.N.A;
import net.minecraft.N.H;
import net.minecraft.N.O;
import net.minecraft.N.S;
import net.minecraft.N.X;
import net.minecraft.N.z;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.W.as;
import net.minecraft.W.cd;
import net.minecraft.ar.aA;
import net.minecraft.client.F.b;
import net.minecraft.client.F.f;
import net.minecraft.client.F.s;
import net.minecraft.client.Q;
import net.minecraft.client.a.l;
import net.minecraft.client.a.v;
import net.minecraft.client.w.aw;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.commons.lang3.StringUtils;

public class e {
    private final /* synthetic */ A a;
    private final /* synthetic */ O h;
    private static final /* synthetic */ S[] c;
    private final /* synthetic */ z e;
    public static /* synthetic */ e d;
    private final /* synthetic */ O f;
    private final /* synthetic */ H b;
    private final /* synthetic */ aw i;
    private final /* synthetic */ X g;

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(d d10, float f10) {
        block12: {
            block32: {
                k k2;
                String[] arrstring;
                k k3;
                block30: {
                    block31: {
                        k k4;
                        block28: {
                            block29: {
                                block19: {
                                    block20: {
                                        block27: {
                                            s s2;
                                            GameProfile gameProfile;
                                            block26: {
                                                block22: {
                                                    boolean bl2;
                                                    r r2;
                                                    block25: {
                                                        block23: {
                                                            block24: {
                                                                d d11;
                                                                block21: {
                                                                    block15: {
                                                                        block16: {
                                                                            block18: {
                                                                                block17: {
                                                                                    block13: {
                                                                                        block14: {
                                                                                            block10: {
                                                                                                block11: {
                                                                                                    k3 = d10.w();
                                                                                                    arrstring = net.minecraft.client.F.f.b();
                                                                                                    k2 = k3;
                                                                                                    k4 = net.minecraft.u.h.aU;
                                                                                                    if (arrstring == null) break block10;
                                                                                                    if (k2 != k4) break block11;
                                                                                                    this.e.a(d10, false);
                                                                                                    net.minecraft.client.F.b.e.a(this.e, 0.0, 0.0, 0.0, 0.0f, f10);
                                                                                                    if (arrstring != null) break block12;
                                                                                                }
                                                                                                k2 = k3;
                                                                                                k4 = net.minecraft.u.h.bl;
                                                                                            }
                                                                                            if (arrstring == null) break block13;
                                                                                            if (k2 != k4) break block14;
                                                                                            this.a.a(d10);
                                                                                            net.minecraft.client.F.b.e.a(this.a, 0.0, 0.0, 0.0, 0.0f);
                                                                                            if (arrstring != null) break block12;
                                                                                        }
                                                                                        k2 = k3;
                                                                                        k4 = net.minecraft.u.h.cq;
                                                                                    }
                                                                                    if (arrstring == null) break block15;
                                                                                    if (k2 != k4) break block16;
                                                                                    if (d10.c("BlockEntityTag") == null) break block17;
                                                                                    this.e.a(d10, true);
                                                                                    Q.P().aN().b(l.a.a(this.e.a(), this.e.b(), this.e.e()));
                                                                                    if (arrstring != null) break block18;
                                                                                }
                                                                                Q.P().aN().b(l.c);
                                                                            }
                                                                            v.M();
                                                                            v.d(1.0f, -1.0f, -1.0f);
                                                                            this.i.a();
                                                                            v.B();
                                                                            if (arrstring != null) break block12;
                                                                        }
                                                                        k2 = k3;
                                                                        k4 = net.minecraft.u.h.cp;
                                                                    }
                                                                    if (arrstring == null) break block19;
                                                                    if (k2 != k4) break block20;
                                                                    gameProfile = null;
                                                                    d11 = d10;
                                                                    if (arrstring == null) break block21;
                                                                    if (!d11.x()) break block22;
                                                                    d11 = d10;
                                                                }
                                                                r2 = d11.v();
                                                                bl2 = r2.a("SkullOwner", 10);
                                                                if (arrstring == null) break block23;
                                                                if (!bl2) break block24;
                                                                gameProfile = net.minecraft.P.c.a(r2.h("SkullOwner"));
                                                                break block22;
                                                            }
                                                            bl2 = r2.a("SkullOwner", 8);
                                                        }
                                                        if (arrstring == null) break block25;
                                                        if (!bl2) break block22;
                                                        bl2 = StringUtils.isBlank((CharSequence)r2.j("SkullOwner"));
                                                    }
                                                    if (!bl2) {
                                                        GameProfile gameProfile2 = new GameProfile(null, r2.j("SkullOwner"));
                                                        gameProfile = X.b(gameProfile2);
                                                        r2.k("SkullOwner");
                                                        r2.a("SkullOwner", net.minecraft.P.c.a(new r(), gameProfile));
                                                    }
                                                }
                                                s2 = s.j;
                                                if (arrstring == null) break block26;
                                                if (s2 == null) break block27;
                                                v.M();
                                                v.E();
                                                s2 = s.j;
                                            }
                                            s2.a(0.0f, 0.0f, 0.0f, aA.UP, 180.0f, d10.d(), gameProfile, -1, 0.0f);
                                            v.c();
                                            v.B();
                                        }
                                        if (arrstring != null) break block12;
                                    }
                                    k2 = k3;
                                    k4 = k.b(net.minecraft.u.g.ba);
                                }
                                if (arrstring == null) break block28;
                                if (k2 != k4) break block29;
                                net.minecraft.client.F.b.e.a(this.b, 0.0, 0.0, 0.0, 0.0f, f10);
                                if (arrstring != null) break block12;
                            }
                            k2 = k3;
                            if (arrstring == null) break block30;
                            k4 = k.b(net.minecraft.u.g.c4);
                        }
                        if (k2 != k4) break block31;
                        net.minecraft.client.F.b.e.a(this.h, 0.0, 0.0, 0.0, 0.0f, f10);
                        if (arrstring != null) break block12;
                    }
                    k2 = k3;
                }
                if (!(K.a(k2) instanceof as)) break block32;
                net.minecraft.client.F.b.e.a(c[as.a(k3).e()], 0.0, 0.0, 0.0, 0.0f, f10);
                if (arrstring != null) break block12;
            }
            net.minecraft.client.F.b.e.a(this.f, 0.0, 0.0, 0.0, 0.0f, f10);
        }
    }

    public void a(d d10) {
        this.a(d10, 1.0f);
    }

    public e() {
        this.f = new O(cd.BASIC);
        this.h = new O(cd.TRAP);
        this.b = new H();
        this.e = new z();
        this.a = new A();
        this.g = new X();
        this.i = new aw();
    }

    static {
        c = new S[16];
        for (bl bl2 : bl.values()) {
            net.minecraft.client.F.e.c[bl2.e()] = new S(bl2);
        }
        d = new e();
    }
}

