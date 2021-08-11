/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.w;

import com.mojang.authlib.GameProfile;
import net.minecraft.N.X;
import net.minecraft.N.y;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.W.K;
import net.minecraft.W.aY;
import net.minecraft.Z.i;
import net.minecraft.a6;
import net.minecraft.ad.a;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.a2;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.commons.lang3.StringUtils;

public class az
extends k {
    private static final /* synthetic */ String[] s;

    @Override
    public String h(d d10) {
        block6: {
            r r2;
            String string;
            r r3;
            block9: {
                int n2;
                block8: {
                    int n3;
                    block7: {
                        block5: {
                            n3 = bl.c();
                            n2 = d10.d();
                            if (n3 != 0) break block5;
                            if (n2 != 3) break block6;
                            n2 = d10.x() ? 1 : 0;
                        }
                        if (n3 != 0) break block7;
                        if (n2 == 0) break block6;
                        n2 = d10.v().a("SkullOwner", 8) ? 1 : 0;
                    }
                    if (n3 != 0) break block8;
                    if (n2 != 0) {
                        return net.minecraft.ab.a.a("item.skull.player.name", d10.v().j("SkullOwner"));
                    }
                    r3 = d10.v();
                    string = "SkullOwner";
                    if (n3 != 0) break block9;
                    n2 = r3.a(string, 10) ? 1 : 0;
                }
                if (n2 == 0) break block6;
                r3 = d10.v();
                string = "SkullOwner";
            }
            if ((r2 = r3.h(string)).a("Name", 8)) {
                return net.minecraft.ab.a.a("item.skull.player.name", r2.j("Name"));
            }
        }
        return super.h(d10);
    }

    public az() {
        this.a(net.minecraft.ad.a.j);
        this.d(0);
        this.a(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(r r2) {
        int n2 = bl.g();
        super.a(r2);
        int n3 = n2;
        boolean bl2 = r2.a("SkullOwner", 8);
        if (n3 == 0) return bl2;
        if (!bl2) return false;
        bl2 = StringUtils.isBlank((CharSequence)r2.j("SkullOwner"));
        if (n3 == 0) return bl2;
        if (bl2) return false;
        GameProfile gameProfile = new GameProfile(null, r2.j("SkullOwner"));
        gameProfile = X.b(gameProfile);
        r2.a("SkullOwner", c.a(new r(), gameProfile));
        return true;
    }

    @Override
    public String d(d d10) {
        int n2;
        block4: {
            int n3;
            block2: {
                block3: {
                    n2 = d10.d();
                    int n4 = bl.g();
                    n3 = n2;
                    if (n4 == 0) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (n4 == 0) break block2;
                    if (n3 < s.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return super.h() + "." + s[n2];
    }

    static {
        s = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};
    }

    @Override
    public void a(a a10, a2<d> a22) {
        block4: {
            int n2;
            int n3;
            block3: {
                n3 = bl.g();
                int n4 = this.b(a10);
                if (n3 == 0) break block3;
                if (n4 == 0) break block4;
                n4 = n2 = 0;
            }
            while (n2 < s.length) {
                a22.add(new d(this, 1, n2));
                ++n2;
                if (n3 != 0) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int c(int n2) {
        return n2;
    }

    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block19: {
            boolean bl2;
            d d10;
            block21: {
                block22: {
                    X x2;
                    int n3;
                    block29: {
                        block23: {
                            GameProfile gameProfile;
                            int n4;
                            block25: {
                                boolean bl3;
                                r r2;
                                block28: {
                                    block26: {
                                        block27: {
                                            d d11;
                                            block24: {
                                                int n5;
                                                block20: {
                                                    block18: {
                                                        block17: {
                                                            boolean bl4;
                                                            block16: {
                                                                boolean bl5;
                                                                n4 = bl.c();
                                                                if (aA2 == aA.DOWN) {
                                                                    return aX.FAIL;
                                                                }
                                                                i i2 = z2.d(n2);
                                                                K k2 = i2.b();
                                                                bl4 = bl5 = k2.b((t)z2, n2);
                                                                if (n4 != 0) break block16;
                                                                if (bl4) break block17;
                                                                bl4 = z2.d(n2).o().d();
                                                            }
                                                            if (!bl4) {
                                                                return aX.FAIL;
                                                            }
                                                            n2 = n2.a(aA2);
                                                        }
                                                        d10 = j2.c(a32);
                                                        n5 = j2.a(n2, aA2, d10);
                                                        if (n4 != 0) break block18;
                                                        if (n5 == 0) break block19;
                                                        n5 = g.bY.a(z2, n2);
                                                    }
                                                    if (n4 != 0) break block20;
                                                    if (n5 == 0) break block19;
                                                    n5 = z2.C;
                                                }
                                                if (n4 == 0) {
                                                    if (n5 != 0) {
                                                        return aX.SUCCESS;
                                                    }
                                                    z2.a(n2, g.bY.d().a(aY.I, aA2), 11);
                                                    n5 = n3 = 0;
                                                }
                                                if (aA2 == aA.UP) {
                                                    n3 = net.minecraft.k.h.f((double)(j2.e * 16.0f / 360.0f) + 0.5) & 0xF;
                                                }
                                                y y2 = z2.b(n2);
                                                bl2 = y2 instanceof X;
                                                if (n4 != 0) break block21;
                                                if (!bl2) break block22;
                                                x2 = (X)y2;
                                                if (d10.d() != 3) break block23;
                                                gameProfile = null;
                                                d11 = d10;
                                                if (n4 != 0) break block24;
                                                if (!d11.x()) break block25;
                                                d11 = d10;
                                            }
                                            r2 = d11.v();
                                            bl3 = r2.a("SkullOwner", 10);
                                            if (n4 != 0) break block26;
                                            if (!bl3) break block27;
                                            gameProfile = c.a(r2.h("SkullOwner"));
                                            break block25;
                                        }
                                        bl3 = r2.a("SkullOwner", 8);
                                    }
                                    if (n4 != 0) break block28;
                                    if (!bl3) break block25;
                                    bl3 = StringUtils.isBlank((CharSequence)r2.j("SkullOwner"));
                                }
                                if (!bl3) {
                                    gameProfile = new GameProfile(null, r2.j("SkullOwner"));
                                }
                            }
                            x2.a(gameProfile);
                            if (n4 == 0) break block29;
                        }
                        x2.b(d10.d());
                    }
                    x2.a(n3);
                    g.bY.a(z2, n2, x2);
                }
                bl2 = j2 instanceof net.minecraft.i.k;
            }
            if (bl2) {
                a6.s.a((net.minecraft.i.k)j2, n2, d10);
            }
            d10.b(1);
            return aX.SUCCESS;
        }
        return aX.FAIL;
    }
}

