/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.az;

import java.util.Map;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.aw.C;
import net.minecraft.aw.s;
import net.minecraft.az.i;
import net.minecraft.az.r;
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class j
extends i {
    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public boolean a(net.minecraft.B.m m2, z z2) {
        d d10;
        m[] arrm;
        block20: {
            boolean bl2;
            block19: {
                block16: {
                    block18: {
                        boolean bl3;
                        block17: {
                            arrm = i.b();
                            bl3 = super.a(m2, z2);
                            if (arrm != null) break block17;
                            if (bl3) break block18;
                            bl3 = false;
                        }
                        return bl3;
                    }
                    d10 = d.m;
                    int n2 = 0;
                    while (n2 < m2.e()) {
                        bl2 = d10.G();
                        if (arrm == null && arrm == null) {
                            if (!bl2) break;
                            d d11 = m2.a(n2);
                            if (arrm == null) {
                                if (d11.w() == h.a9) {
                                    d10 = d11;
                                }
                                ++n2;
                            }
                            if (arrm == null) continue;
                        }
                        break block16;
                    }
                    bl2 = d10.G();
                }
                if (arrm != null) break block19;
                if (!bl2) break block20;
                bl2 = false;
            }
            return bl2;
        }
        s s2 = h.a9.a(d10, z2);
        if (s2 == null) {
            return false;
        }
        byte by2 = this.a(s2);
        if (arrm == null) {
            if (by2 != 0) {
                return false;
            }
            by2 = s2.c;
        }
        if (arrm == null) {
            by2 = by2 < 4 ? (byte)1 : 0;
        }
        return by2 != 0;
    }

    @Override
    public d a(net.minecraft.B.m m2) {
        d d10;
        m[] arrm;
        d d11;
        block6: {
            d11 = d.m;
            arrm = i.b();
            int n2 = 0;
            while (n2 < m2.e()) {
                d10 = d11;
                if (arrm == null && arrm == null) {
                    if (!d10.G()) break;
                    d d12 = m2.a(n2);
                    if (arrm == null) {
                        if (d12.w() == h.a9) {
                            d11 = d12;
                        }
                        ++n2;
                    }
                    if (arrm == null) continue;
                }
                break block6;
            }
            d11 = d11.C();
            d11.c(1);
            d10 = d11;
        }
        net.minecraft.P.r r2 = d10.v();
        if (arrm == null) {
            if (r2 == null) {
                d11.b(new net.minecraft.P.r());
            }
            r2 = d11.v();
        }
        r2.b("map_scale_direction", 1);
        return d11;
    }

    @Override
    public boolean b() {
        return true;
    }

    public j() {
        m[] arrm = i.b();
        super("", 3, 3, a2.a(r.a, r.a(new k[]{h.C}), r.a(new k[]{h.C}), r.a(new k[]{h.C}), r.a(new k[]{h.C}), r.a((k)h.a9), r.a(new k[]{h.C}), r.a(new k[]{h.C}), r.a(new k[]{h.C}), r.a(new k[]{h.C})), new d(h.Y));
        m[] arrm2 = arrm;
        if (arrm2 != null) {
            m.b(!m.c());
        }
    }

    private boolean a(s s2) {
        block4: {
            Map<String, net.minecraft.aw.i> map;
            m[] arrm;
            block3: {
                arrm = i.b();
                map = s2.i;
                if (arrm != null) break block3;
                if (map == null) break block4;
                map = s2.i;
            }
            for (net.minecraft.aw.i i2 : map.values()) {
                block7: {
                    block6: {
                        C c10;
                        C c11;
                        block5: {
                            c11 = i2.f();
                            c10 = C.MANSION;
                            if (arrm != null) break block5;
                            if (c11 == c10) break block6;
                            c11 = i2.f();
                            c10 = C.MONUMENT;
                        }
                        if (c11 != c10) break block7;
                    }
                    return true;
                }
                if (arrm == null) continue;
            }
        }
        return false;
    }
}

