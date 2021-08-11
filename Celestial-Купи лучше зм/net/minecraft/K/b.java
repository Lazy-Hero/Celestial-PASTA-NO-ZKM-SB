/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.K;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nullable;
import net.minecraft.K.c;
import net.minecraft.K.d;
import net.minecraft.K.e;
import net.minecraft.K.f;
import net.minecraft.K.j;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.ar.aD;
import net.minecraft.ar.v;
import net.minecraft.j.g;
import net.minecraft.k.h;
import net.minecraft.k.m;

public class b {
    private /* synthetic */ String i;
    public static /* synthetic */ b a;
    private /* synthetic */ boolean d;
    public static final /* synthetic */ net.minecraft.b.d<v, b> e;
    private final /* synthetic */ boolean c;
    public static /* synthetic */ b g;
    private /* synthetic */ int b;
    private final /* synthetic */ Map<net.minecraft.j.c, net.minecraft.j.f> j;
    private final /* synthetic */ int h;
    private /* synthetic */ double f;

    public b f() {
        this.d = true;
        return this;
    }

    public static String a(j j2, float f10) {
        int[] arrn = net.minecraft.K.j.b();
        int n2 = j2.i();
        if (arrn == null) {
            if (n2 != 0) {
                return "**:**";
            }
            n2 = net.minecraft.k.h.d((float)j2.e() * f10);
        }
        int n3 = n2;
        return aD.a(n3);
    }

    public void a(@Nullable x x2, @Nullable x x3, B b10, int n2, double d10) {
        block14: {
            int n3;
            block6: {
                block7: {
                    int[] arrn;
                    block17: {
                        boolean bl2;
                        block16: {
                            block15: {
                                block12: {
                                    int n4;
                                    block13: {
                                        b b11;
                                        b b12;
                                        block10: {
                                            block11: {
                                                block8: {
                                                    block9: {
                                                        block4: {
                                                            block5: {
                                                                arrn = net.minecraft.K.j.b();
                                                                b b11 = this;
                                                                b11 = net.minecraft.u.c.v;
                                                                if (arrn != null) break block4;
                                                                if (b12 != b11) break block5;
                                                                n3 = b10.ak();
                                                                if (arrn != null) break block6;
                                                                if (n3 == false) break block7;
                                                            }
                                                            b b11 = this;
                                                            b11 = net.minecraft.u.c.o;
                                                        }
                                                        if (arrn != null) break block8;
                                                        if (b12 != b11) break block9;
                                                        n3 = b10.ak();
                                                        if (arrn != null) break block6;
                                                        if (n3 != false) break block7;
                                                    }
                                                    b b11 = this;
                                                    b11 = net.minecraft.u.c.o;
                                                }
                                                if (arrn != null) break block10;
                                                if (b12 != b11) break block11;
                                                n4 = b10.ak();
                                                if (arrn != null) break block12;
                                                if (n4 == false) break block13;
                                            }
                                            b b11 = this;
                                            b11 = net.minecraft.u.c.v;
                                        }
                                        if (b12 != b11) break block14;
                                        n4 = b10.ak();
                                        if (arrn != null) break block12;
                                        if (n4 == false) break block14;
                                    }
                                    n4 = (bl2 = (int)(d10 * (double)(6 << n2) + 0.5)) ? 1 : 0;
                                }
                                if (arrn != null) break block15;
                                if (x2 != null) break block16;
                                b10.a(G.f, (float)bl2);
                            }
                            if (arrn == null) break block17;
                        }
                        b10.a(G.a(x2, x3), (float)bl2);
                    }
                    if (arrn == null) break block14;
                }
                n3 = (int)(d10 * (double)(4 << n2) + 0.5);
            }
            boolean bl2 = n3;
            b10.i((float)bl2);
        }
    }

    @Nullable
    public static b a(int n2) {
        return e.a((v)n2);
    }

    public boolean a(int n2, int n3) {
        int[] arrn = net.minecraft.K.j.b();
        b b11 = this;
        b11 = net.minecraft.u.c.t;
        if (arrn == null) {
            if (b10 == b11) {
                int n4;
                int n5 = n4 = 50 >> n3;
                if (arrn == null) {
                    if (n5 > 0) {
                        boolean bl2 = n2 % n4;
                        if (arrn == null) {
                            bl2 = !bl2;
                        }
                        return bl2;
                    }
                    n5 = 1;
                }
                return n5 != 0;
            }
            b b11 = this;
            b11 = net.minecraft.u.c.g;
        }
        if (arrn == null) {
            if (b10 == b11) {
                int n6;
                int n7 = n6 = 25 >> n3;
                if (arrn == null) {
                    if (n7 > 0) {
                        boolean bl3 = n2 % n6;
                        if (arrn == null) {
                            bl3 = !bl3;
                        }
                        return bl3;
                    }
                    n7 = 1;
                }
                return n7 != 0;
            }
            b b11 = this;
            b11 = net.minecraft.u.c.z;
        }
        if (arrn == null) {
            if (b10 == b11) {
                int n8;
                int n9 = n8 = 40 >> n3;
                if (arrn == null) {
                    if (n9 > 0) {
                        boolean bl4 = n2 % n8;
                        if (arrn == null) {
                            bl4 = !bl4;
                        }
                        return bl4;
                    }
                    n9 = 1;
                }
                return n9 != 0;
            }
            b b11 = this;
            b11 = net.minecraft.u.c.r;
        }
        return b10 == b11;
    }

    public static int a(b b10) {
        return e.c(b10);
    }

    @Nullable
    public static b b(String string) {
        return e.a(new v(string));
    }

    public static String a(j j2) {
        int[] arrn = net.minecraft.K.j.b();
        int n2 = j2.i();
        if (arrn == null) {
            if (n2 != 0) {
                return "**:**";
            }
            n2 = j2.e();
        }
        int n3 = n2;
        return aD.a(n3);
    }

    public boolean a() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected b a(double d10) {
        this.f = d10;
        return this;
    }

    public boolean c() {
        return this.d;
    }

    protected b b(int n2, int n3) {
        this.b = n2 + n3 * 8;
        return this;
    }

    public String i() {
        return this.i;
    }

    public void a(B b10, g g10, int n2) {
        Iterator<Map.Entry<net.minecraft.j.c, net.minecraft.j.f>> iterator = this.j.entrySet().iterator();
        int[] arrn = net.minecraft.K.j.b();
        while (iterator.hasNext()) {
            block4: {
                net.minecraft.j.b b11;
                Map.Entry<net.minecraft.j.c, net.minecraft.j.f> entry;
                block3: {
                    net.minecraft.j.b b12;
                    entry = iterator.next();
                    b11 = b12 = g10.a(entry.getKey());
                    if (arrn != null) break block3;
                    if (b11 == null) break block4;
                    b11 = b12;
                }
                b11.a(entry.getValue());
            }
            if (arrn == null) continue;
        }
    }

    public b a(net.minecraft.j.c c10, String string, double d10, int n2) {
        net.minecraft.j.f f10 = new net.minecraft.j.f(UUID.fromString(string), this.i(), d10, n2);
        this.j.put(c10, f10);
        return this;
    }

    public void b(B b10, g g10, int n2) {
        Iterator<Map.Entry<net.minecraft.j.c, net.minecraft.j.f>> iterator = this.j.entrySet().iterator();
        int[] arrn = net.minecraft.K.j.b();
        while (iterator.hasNext()) {
            block4: {
                Object object;
                net.minecraft.j.b b11;
                block3: {
                    Map.Entry<net.minecraft.j.c, net.minecraft.j.f> entry = iterator.next();
                    b11 = g10.a(entry.getKey());
                    object = b11;
                    if (arrn != null) break block3;
                    if (object == null) break block4;
                    object = entry.getValue();
                }
                net.minecraft.j.f f10 = (net.minecraft.j.f)object;
                b11.a(f10);
                b11.b(new net.minecraft.j.f(f10.c(), this.i() + " " + n2, this.a(n2, f10), f10.e()));
            }
            if (arrn == null) continue;
        }
    }

    public int b() {
        return this.h;
    }

    public Map<net.minecraft.j.c, net.minecraft.j.f> e() {
        return this.j;
    }

    public double a(int n2, net.minecraft.j.f f10) {
        return f10.f() * (double)(n2 + 1);
    }

    public int j() {
        return this.b;
    }

    public boolean d() {
        int[] arrn = net.minecraft.K.j.b();
        boolean bl2 = this.b;
        if (arrn == null) {
            bl2 = bl2 >= false;
        }
        return bl2;
    }

    static {
        e = new net.minecraft.b.d();
    }

    public boolean g() {
        return false;
    }

    public static void h() {
        block0: {
            e.a(1, new v("speed"), new b(false, 8171462).a("effect.moveSpeed").b(0, 0).a(M.d, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2).f());
            e.a(2, new v("slowness"), new b(true, 5926017).a("effect.moveSlowdown").b(1, 0).a(M.d, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2));
            e.a(3, new v("haste"), new b(false, 14270531).a("effect.digSpeed").b(2, 0).a(1.5).f().a(M.j, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", 0.1f, 2));
            int[] arrn = net.minecraft.K.j.b();
            e.a(4, new v("mining_fatigue"), new b(true, 4866583).a("effect.digSlowDown").b(3, 0).a(M.j, "55FCED67-E92A-486E-9800-B47F202C4386", -0.1f, 2));
            int[] arrn2 = arrn;
            e.a(5, new v("strength"), new d(false, 9643043, 3.0).a("effect.damageBoost").b(4, 0).a(M.g, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 0.0, 0).f());
            e.a(6, new v("instant_health"), new e(false, 16262179).a("effect.heal").f());
            e.a(7, new v("instant_damage"), new e(true, 4393481).a("effect.harm").f());
            e.a(8, new v("jump_boost"), new b(false, 2293580).a("effect.jump").b(2, 1).f());
            e.a(9, new v("nausea"), new b(true, 5578058).a("effect.confusion").b(3, 1).a(0.25));
            e.a(10, new v("regeneration"), new b(false, 13458603).a("effect.regeneration").b(7, 0).a(0.25).f());
            e.a(11, new v("resistance"), new b(false, 10044730).a("effect.resistance").b(6, 1).f());
            e.a(12, new v("fire_resistance"), new b(false, 14981690).a("effect.fireResistance").b(7, 1).f());
            e.a(13, new v("water_breathing"), new b(false, 3035801).a("effect.waterBreathing").b(0, 2).f());
            e.a(14, new v("invisibility"), new b(false, 8356754).a("effect.invisibility").b(0, 1).f());
            e.a(15, new v("blindness"), new b(true, 2039587).a("effect.blindness").b(5, 1).a(0.25));
            e.a(16, new v("night_vision"), new b(false, 0x1F1FA1).a("effect.nightVision").b(4, 1).f());
            e.a(17, new v("hunger"), new b(true, 5797459).a("effect.hunger").b(1, 1));
            e.a(18, new v("weakness"), new d(true, 0x484D48, -4.0).a("effect.weakness").b(5, 0).a(M.g, "22653B89-116E-49DC-9B6B-9971489B5BE5", 0.0, 0));
            e.a(19, new v("poison"), new b(true, 5149489).a("effect.poison").b(6, 0).a(0.25));
            e.a(20, new v("wither"), new b(true, 3484199).a("effect.wither").b(1, 2).a(0.25));
            e.a(21, new v("health_boost"), new f(false, 16284963).a("effect.healthBoost").b(7, 2).a(M.f, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0).f());
            e.a(22, new v("absorption"), new c(false, 0x2552A5).a("effect.absorption").b(2, 2).f());
            e.a(23, new v("saturation"), new e(false, 16262179).a("effect.saturation").f());
            e.a(24, new v("glowing"), new b(false, 9740385).a("effect.glowing").b(4, 2));
            e.a(25, new v("levitation"), new b(true, 0xCEFFFF).a("effect.levitation").b(3, 2));
            e.a(26, new v("luck"), new b(false, 0x339900).a("effect.luck").b(5, 2).f().a(M.a, "03C3C89D-7037-4B42-869F-B146BCB64D2E", 1.0, 0));
            e.a(27, new v("unluck"), new b(true, 12624973).a("effect.unluck").b(6, 2).a(M.a, "CC5AF142-2BD2-4215-B636-2605AED11727", -1.0, 0));
            if (m.d()) break block0;
            net.minecraft.K.j.b(new int[1]);
        }
    }

    protected b(boolean bl2, int n2) {
        block4: {
            block2: {
                b b10;
                block3: {
                    this.j = Maps.newHashMap();
                    this.i = "";
                    this.b = -1;
                    int[] arrn = net.minecraft.K.j.b();
                    b10 = this;
                    if (arrn != null) break block2;
                    b10.c = bl2;
                    if (!bl2) break block3;
                    this.f = 0.5;
                    if (arrn == null) break block4;
                }
                b10 = this;
            }
            b10.f = 1.0;
        }
        this.h = n2;
    }

    public b a(String string) {
        this.i = string;
        return this;
    }

    public void a(B b10, int n2) {
        block5: {
            B b11;
            block20: {
                block21: {
                    int[] arrn;
                    block26: {
                        boolean bl2;
                        block27: {
                            b b12;
                            b b13;
                            block24: {
                                block25: {
                                    block22: {
                                        block23: {
                                            block18: {
                                                block19: {
                                                    block14: {
                                                        block15: {
                                                            B b14;
                                                            block17: {
                                                                boolean bl3;
                                                                block16: {
                                                                    block11: {
                                                                        block12: {
                                                                            B b15;
                                                                            block13: {
                                                                                block9: {
                                                                                    block10: {
                                                                                        block6: {
                                                                                            block7: {
                                                                                                block8: {
                                                                                                    block2: {
                                                                                                        block3: {
                                                                                                            B b16;
                                                                                                            block4: {
                                                                                                                arrn = net.minecraft.K.j.b();
                                                                                                                b13 = this;
                                                                                                                b12 = net.minecraft.u.c.t;
                                                                                                                if (arrn != null) break block2;
                                                                                                                if (b13 != b12) break block3;
                                                                                                                b16 = b10;
                                                                                                                if (arrn != null) break block4;
                                                                                                                if (!(b16.V() < b10.H())) break block5;
                                                                                                                b16 = b10;
                                                                                                            }
                                                                                                            b16.i(1.0f);
                                                                                                            if (arrn == null) break block5;
                                                                                                        }
                                                                                                        b13 = this;
                                                                                                        b12 = net.minecraft.u.c.g;
                                                                                                    }
                                                                                                    if (arrn != null) break block6;
                                                                                                    if (b13 != b12) break block7;
                                                                                                    float f10 = b10.V() - 1.0f;
                                                                                                    float f11 = f10 == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                                                                                                    if (arrn != null) break block8;
                                                                                                    if (f11 <= 0) break block5;
                                                                                                    f11 = (float)b10.a(G.f, 1.0f);
                                                                                                }
                                                                                                if (arrn == null) break block5;
                                                                                            }
                                                                                            b13 = this;
                                                                                            b12 = net.minecraft.u.c.z;
                                                                                        }
                                                                                        if (arrn != null) break block9;
                                                                                        if (b13 != b12) break block10;
                                                                                        b10.a(G.k, 1.0f);
                                                                                        if (arrn == null) break block5;
                                                                                    }
                                                                                    b13 = this;
                                                                                    b12 = net.minecraft.u.c.r;
                                                                                }
                                                                                if (arrn != null) break block11;
                                                                                if (b13 != b12) break block12;
                                                                                b15 = b10;
                                                                                if (arrn != null) break block13;
                                                                                if (!(b15 instanceof net.minecraft.i.j)) break block12;
                                                                                b15 = b10;
                                                                            }
                                                                            ((net.minecraft.i.j)b15).c(0.005f * (float)(n2 + 1));
                                                                            if (arrn == null) break block5;
                                                                        }
                                                                        b13 = this;
                                                                        b12 = net.minecraft.u.c.y;
                                                                    }
                                                                    if (arrn != null) break block14;
                                                                    if (b13 != b12) break block15;
                                                                    bl3 = b10 instanceof net.minecraft.i.j;
                                                                    if (arrn != null) break block16;
                                                                    if (!bl3) break block15;
                                                                    b14 = b10;
                                                                    if (arrn != null) break block17;
                                                                    bl3 = b14.aG.C;
                                                                }
                                                                if (bl3) break block5;
                                                                b14 = b10;
                                                            }
                                                            ((net.minecraft.i.j)b14).S().a(n2 + 1, 1.0f);
                                                            if (arrn == null) break block5;
                                                        }
                                                        b13 = this;
                                                        b12 = net.minecraft.u.c.v;
                                                    }
                                                    if (arrn != null) break block18;
                                                    if (b13 != b12) break block19;
                                                    b11 = b10;
                                                    if (arrn != null) break block20;
                                                    if (!b11.ak()) break block21;
                                                }
                                                b13 = this;
                                                b12 = net.minecraft.u.c.o;
                                            }
                                            if (arrn != null) break block22;
                                            if (b13 != b12) break block23;
                                            b11 = b10;
                                            if (arrn != null) break block20;
                                            if (b11.ak()) break block21;
                                        }
                                        b13 = this;
                                        b12 = net.minecraft.u.c.o;
                                    }
                                    if (arrn != null) break block24;
                                    if (b13 != b12) break block25;
                                    bl2 = b10.ak();
                                    if (arrn != null) break block26;
                                    if (!bl2) break block27;
                                }
                                b13 = this;
                                b12 = net.minecraft.u.c.v;
                            }
                            if (b13 != b12) break block5;
                            bl2 = b10.ak();
                            if (arrn != null) break block26;
                            if (!bl2) break block5;
                        }
                        bl2 = b10.a(G.f, (float)(6 << n2));
                    }
                    if (arrn == null) break block5;
                }
                b11 = b10;
            }
            b11.i((float)Math.max(4 << n2, 0));
        }
    }
}

