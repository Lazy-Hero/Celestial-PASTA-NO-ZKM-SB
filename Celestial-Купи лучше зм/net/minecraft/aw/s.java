/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.aw;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.J.l;
import net.minecraft.P.u;
import net.minecraft.ah.z;
import net.minecraft.aw.C;
import net.minecraft.aw.e;
import net.minecraft.aw.i;
import net.minecraft.aw.r;
import net.minecraft.aw.w;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class s
extends r {
    public /* synthetic */ byte c;
    public /* synthetic */ int h;
    public /* synthetic */ byte d;
    public /* synthetic */ byte[] l;
    public /* synthetic */ boolean g;
    public /* synthetic */ boolean e;
    private final /* synthetic */ Map<j, e> f;
    public /* synthetic */ List<e> j;
    public /* synthetic */ Map<String, i> i;
    public /* synthetic */ int k;

    public s(String string) {
        super(string);
        this.l = new byte[16384];
        this.j = Lists.newArrayList();
        this.f = Maps.newHashMap();
        this.i = Maps.newLinkedHashMap();
    }

    public void a(j j2, d d10) {
        block29: {
            int n2;
            String string;
            net.minecraft.P.r r2;
            String[] arrstring;
            block30: {
                boolean bl2;
                block28: {
                    block26: {
                        block27: {
                            Object object;
                            block18: {
                                int n3;
                                arrstring = w.d();
                                int n4 = this.f.containsKey(j2);
                                if (arrstring != null) {
                                    if (n4 == 0) {
                                        e e10 = new e(this, j2);
                                        this.f.put(j2, e10);
                                        this.j.add(e10);
                                    }
                                    n4 = j2.cB.h(d10);
                                }
                                if (arrstring != null) {
                                    if (n4 == 0) {
                                        this.i.remove(j2.g());
                                    }
                                    n4 = n3 = 0;
                                }
                                while (n3 < this.j.size()) {
                                    block19: {
                                        boolean bl3;
                                        block20: {
                                            s s2;
                                            block25: {
                                                int n5;
                                                block24: {
                                                    block23: {
                                                        block21: {
                                                            block22: {
                                                                object = this.j.get(n3);
                                                                bl2 = object.c.P;
                                                                if (arrstring == null) break block18;
                                                                if (arrstring == null) break block19;
                                                                if (bl2) break block20;
                                                                n5 = object.c.cB.h(d10);
                                                                if (arrstring == null) break block21;
                                                                if (n5 != 0) break block22;
                                                                bl3 = d10.B();
                                                                if (arrstring == null) break block19;
                                                                if (!bl3) break block20;
                                                            }
                                                            n5 = d10.B();
                                                        }
                                                        if (arrstring == null) break block23;
                                                        if (n5 != 0) break block19;
                                                        n5 = object.c.p;
                                                    }
                                                    if (arrstring == null) break block24;
                                                    if (n5 != this.d) break block19;
                                                    s2 = this;
                                                    if (arrstring == null) break block25;
                                                    n5 = s2.g ? (byte)1 : 0;
                                                }
                                                if (n5 == 0) break block19;
                                                s2 = this;
                                            }
                                            s2.a(C.PLAYER, object.c.aG, ((e)object).c.g(), object.c.a, object.c.ax, object.c.e);
                                            if (arrstring != null) break block19;
                                        }
                                        this.f.remove(((e)object).c);
                                        bl3 = this.j.remove(object);
                                    }
                                    ++n3;
                                    if (arrstring != null) continue;
                                }
                                bl2 = d10.B();
                            }
                            if (arrstring == null) break block26;
                            if (!bl2) break block27;
                            bl2 = this.g;
                            if (arrstring == null) break block26;
                            if (bl2) {
                                l l2 = d10.e();
                                object = l2.g();
                                this.a(C.FRAME, j2.aG, "frame-" + l2.W(), ((m)object).e(), ((m)object).a(), l2.aL.k() * 90);
                            }
                        }
                        bl2 = d10.x();
                    }
                    if (arrstring == null) break block28;
                    if (!bl2) break block29;
                    r2 = d10.v();
                    string = "Decorations";
                    n2 = 9;
                    if (arrstring == null) break block30;
                    bl2 = r2.a(string, n2);
                }
                if (!bl2) break block29;
                r2 = d10.v();
                string = "Decorations";
                n2 = 10;
            }
            u u2 = r2.c(string, n2);
            int n6 = 0;
            while (n6 < u2.b()) {
                net.minecraft.P.r r3 = u2.d(n6);
                if (arrstring != null) {
                    if (!this.i.containsKey(r3.j("id"))) {
                        this.a(C.a(r3.r("type")), j2.aG, r3.j("id"), r3.e("x"), r3.e("z"), r3.e("rot"));
                    }
                    ++n6;
                }
                if (arrstring != null) continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public K<?> a(d d10, z z2, j j2) {
        e e10 = this.f.get(j2);
        String[] arrstring = w.d();
        e e11 = e10;
        if (arrstring != null) {
            if (e11 == null) {
                return null;
            }
            e11 = e10;
        }
        K<?> k2 = e11.a(d10);
        return k2;
    }

    @Override
    public void b(net.minecraft.P.r r2) {
        block12: {
            int n2;
            int n3;
            String[] arrstring;
            block11: {
                int n4;
                int n5;
                block10: {
                    block9: {
                        byte by2;
                        block7: {
                            s s2;
                            block8: {
                                this.d = r2.r("dimension");
                                this.h = r2.m("xCenter");
                                this.k = r2.m("zCenter");
                                arrstring = w.d();
                                this.c = r2.r("scale");
                                s2 = this;
                                by2 = (byte)net.minecraft.k.h.c(this.c, 0, 4);
                                if (arrstring == null) break block7;
                                s2.c = by2;
                                if (!r2.a("trackingPosition", 1)) break block8;
                                this.g = r2.f("trackingPosition");
                                if (arrstring != null) break block9;
                            }
                            s2 = this;
                            by2 = 1;
                        }
                        s2.g = by2;
                    }
                    this.e = r2.f("unlimitedTracking");
                    n3 = r2.q("width");
                    n2 = r2.q("height");
                    n5 = n3;
                    n4 = 128;
                    if (arrstring == null) break block10;
                    if (n5 != n4) break block11;
                    n5 = n2;
                    n4 = 128;
                }
                if (n5 != n4) break block11;
                this.l = r2.a("colors");
                if (arrstring != null) break block12;
            }
            byte[] arrby = r2.a("colors");
            this.l = new byte[16384];
            int n6 = (128 - n3) / 2;
            int n7 = (128 - n2) / 2;
            int n8 = 0;
            block0: while (true) {
                int n9 = n8;
                block1: while (n9 < n2) {
                    block15: {
                        int n10;
                        block13: {
                            int n11;
                            block14: {
                                int n12;
                                n11 = n12 = n8 + n7;
                                if (arrstring == null) break block13;
                                if (n11 >= 0) break block14;
                                n11 = n12;
                                if (arrstring == null) break block13;
                                if (n11 >= 128) break block15;
                            }
                            n11 = n10 = 0;
                        }
                        while (n10 < n3) {
                            block18: {
                                block17: {
                                    int n13;
                                    block16: {
                                        int n14;
                                        n9 = n14 = n10 + n6;
                                        if (arrstring == null) continue block1;
                                        if (arrstring == null) break block16;
                                        if (n9 >= 0) break block17;
                                        n13 = n14;
                                    }
                                    if (n13 >= 128) break block18;
                                }
                                this.l[n14 + n12 * 128] = arrby[n10 + n8 * n3];
                            }
                            ++n10;
                            if (arrstring != null) continue;
                        }
                    }
                    ++n8;
                    if (arrstring != null) continue block0;
                }
                break;
            }
        }
    }

    private void a(C c10, z z2, String string, double d10, double d11, double d12) {
        block20: {
            Object object;
            byte by2;
            byte by3;
            byte by4;
            block21: {
                float f10;
                block29: {
                    String[] arrstring;
                    float f11;
                    float f12;
                    block26: {
                        block28: {
                            block27: {
                                Object object2;
                                float f13;
                                block24: {
                                    block25: {
                                        int n2;
                                        block23: {
                                            block22: {
                                                block17: {
                                                    float f14;
                                                    block19: {
                                                        block18: {
                                                            block16: {
                                                                int n3 = 1 << this.c;
                                                                f12 = (float)(d10 - (double)this.h) / (float)n3;
                                                                f11 = (float)(d11 - (double)this.k) / (float)n3;
                                                                by4 = (byte)((double)(f12 * 2.0f) + 0.5);
                                                                arrstring = w.d();
                                                                by3 = (byte)((double)(f11 * 2.0f) + 0.5);
                                                                int n4 = 63;
                                                                float f15 = f12 - -63.0f;
                                                                f14 = f15 == 0.0f ? (byte)0 : (f15 > 0.0f ? (byte)1 : -1);
                                                                if (arrstring == null) break block16;
                                                                if (f14 < 0) break block17;
                                                                float f16 = f11 - -63.0f;
                                                                f14 = f16 == 0.0f ? (byte)0 : (f16 > 0.0f ? (byte)1 : -1);
                                                            }
                                                            if (arrstring == null) break block18;
                                                            if (f14 < 0) break block17;
                                                            float f17 = f12 - 63.0f;
                                                            f14 = f17 == 0.0f ? (byte)0 : (f17 < 0.0f ? (byte)-1 : 1);
                                                        }
                                                        if (arrstring == null) break block19;
                                                        if (f14 > 0) break block17;
                                                        float f18 = f11 - 63.0f;
                                                        f14 = f18 == 0.0f ? (byte)0 : (f18 < 0.0f ? (byte)-1 : 1);
                                                    }
                                                    if (f14 > 0) break block17;
                                                    double d13 = d12;
                                                    if (arrstring != null) {
                                                        d13 = d13 < 0.0 ? -8.0 : 8.0;
                                                    }
                                                    by2 = (byte)((d12 += d13) * 16.0 / 360.0);
                                                    object = this;
                                                    if (arrstring == null) break block20;
                                                    if (((s)object).d >= 0) break block21;
                                                    n2 = (int)(z2.b().m() / 10L);
                                                    by2 = (byte)(n2 * n2 * 34187121 + n2 * 121 >> 15 & 0xF);
                                                    if (arrstring != null) break block21;
                                                }
                                                Object object3 = c10;
                                                if (arrstring == null) break block22;
                                                if (object3 == C.PLAYER) break block23;
                                                object3 = this.i.remove(string);
                                            }
                                            return;
                                        }
                                        n2 = 320;
                                        float f19 = Math.abs(f12) - 320.0f;
                                        f13 = f19 == 0.0f ? (byte)0 : (f19 < 0.0f ? (byte)-1 : 1);
                                        if (arrstring == null) break block24;
                                        if (f13 >= 0) break block25;
                                        float f20 = Math.abs(f11) - 320.0f;
                                        f13 = f20 == 0.0f ? (byte)0 : (f20 < 0.0f ? (byte)-1 : 1);
                                        if (arrstring == null) break block24;
                                        if (f13 >= 0) break block25;
                                        c10 = C.PLAYER_OFF_MAP;
                                        if (arrstring != null) break block26;
                                    }
                                    object2 = this;
                                    if (arrstring == null) break block27;
                                    f13 = (float)((s)object2).e;
                                }
                                if (f13 != false) break block28;
                                object2 = this.i.remove(string);
                            }
                            return;
                        }
                        c10 = C.PLAYER_OFF_LIMITS;
                    }
                    by2 = 0;
                    float f21 = f12 - -63.0f;
                    f10 = f21 == 0.0f ? (byte)0 : (f21 < 0.0f ? (byte)-1 : 1);
                    if (arrstring != null) {
                        float f22;
                        if (f10 <= 0) {
                            by4 = -128;
                        }
                        f10 = (f22 = f11 - -63.0f) == 0.0f ? (byte)0 : (f22 < 0.0f ? (byte)-1 : 1);
                    }
                    if (arrstring != null) {
                        float f23;
                        if (f10 <= 0) {
                            by3 = -128;
                        }
                        f10 = (f23 = f12 - 63.0f) == 0.0f ? (byte)0 : (f23 > 0.0f ? (byte)1 : -1);
                    }
                    if (arrstring != null) {
                        float f24;
                        if (f10 >= 0) {
                            by4 = 127;
                        }
                        f10 = (f24 = f11 - 63.0f) == 0.0f ? (byte)0 : (f24 > 0.0f ? (byte)1 : -1);
                    }
                    if (arrstring == null) break block29;
                    if (f10 < 0) break block21;
                    f10 = 127;
                }
                by3 = (byte)f10;
            }
            object = this.i.put(string, new i(c10, by4, by3, by2));
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public e a(j j2) {
        e e10 = this.f.get(j2);
        String[] arrstring = w.d();
        e e11 = e10;
        if (arrstring != null) {
            if (e11 == null) {
                e10 = new e(this, j2);
                this.f.put(j2, e10);
                this.j.add(e10);
            }
            e11 = e10;
        }
        return e11;
    }

    public void a(double d10, double d11, int n2) {
        int n3 = 128 * (1 << n2);
        int n4 = net.minecraft.k.h.f((d10 + 64.0) / (double)n3);
        int n5 = net.minecraft.k.h.f((d11 + 64.0) / (double)n3);
        this.h = n4 * n3 + n3 / 2 - 64;
        this.k = n5 * n3 + n3 / 2 - 64;
    }

    public static void a(d d10, n n2, String string, C c10) {
        block9: {
            net.minecraft.P.r r2;
            block8: {
                u u2;
                String[] arrstring;
                block7: {
                    block5: {
                        int n3;
                        String string2;
                        net.minecraft.P.r r3;
                        block6: {
                            boolean bl2;
                            block4: {
                                arrstring = w.d();
                                bl2 = d10.x();
                                if (arrstring == null) break block4;
                                if (!bl2) break block5;
                                r3 = d10.v();
                                string2 = "Decorations";
                                n3 = 9;
                                if (arrstring == null) break block6;
                                bl2 = r3.a(string2, n3);
                            }
                            if (!bl2) break block5;
                            r3 = d10.v();
                            string2 = "Decorations";
                            n3 = 10;
                        }
                        u2 = r3.c(string2, n3);
                        if (arrstring != null) break block7;
                    }
                    u2 = new u();
                    d10.a("Decorations", u2);
                }
                net.minecraft.P.r r4 = new net.minecraft.P.r();
                r4.a("type", c10.c());
                r4.a("id", string);
                r4.a("x", (double)n2.e());
                r4.a("z", (double)n2.a());
                r2 = r4;
                if (arrstring == null) break block8;
                r2.a("rot", 180.0);
                u2.a(r4);
                if (!c10.a()) break block9;
                r2 = d10.a("display");
            }
            net.minecraft.P.r r5 = r2;
            r5.b("MapColor", c10.b());
        }
    }

    public void a(int n2, int n3) {
        String[] arrstring = w.d();
        super.b();
        Iterator<e> iterator = this.j.iterator();
        String[] arrstring2 = arrstring;
        while (iterator.hasNext()) {
            e e10 = iterator.next();
            e10.a(n2, n3);
            if (arrstring2 != null) continue;
        }
    }

    @Override
    public net.minecraft.P.r a(net.minecraft.P.r r2) {
        r2.a("dimension", this.d);
        r2.b("xCenter", this.h);
        r2.b("zCenter", this.k);
        r2.a("scale", this.c);
        r2.a("width", (short)128);
        r2.a("height", (short)128);
        r2.a("colors", this.l);
        r2.a("trackingPosition", this.g);
        r2.a("unlimitedTracking", this.e);
        return r2;
    }
}

