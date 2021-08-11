/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.client.q;

import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.ah.s;
import net.minecraft.ah.z;
import net.minecraft.ar.aD;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.A;
import net.minecraft.client.a.aI;
import net.minecraft.client.j.d;
import net.minecraft.client.j.u;
import net.minecraft.client.o.e;
import net.minecraft.i.j;
import net.minecraft.j.b;
import net.minecraft.u.h;

public abstract class a
extends j {
    private static final /* synthetic */ v cH;
    public /* synthetic */ float cE;
    private /* synthetic */ String cI;
    private /* synthetic */ e cG;
    private /* synthetic */ v cF;
    public /* synthetic */ float cD;
    public /* synthetic */ float cC;

    /*
     * Enabled aggressive block sorting
     */
    public String h() {
        String string;
        e e10 = this.j();
        int n2 = net.minecraft.U.B.ah();
        e e11 = e10;
        if (n2 == 0) {
            if (e11 == null) {
                string = net.minecraft.client.D.z.b(this.u());
                return string;
            }
            e11 = e10;
        }
        string = e11.m();
        return string;
    }

    @Nullable
    protected e j() {
        int n2 = net.minecraft.U.B.ah();
        e e10 = this.cG;
        if (n2 == 0) {
            if (e10 == null) {
                this.cG = net.minecraft.client.Q.P().ar().a(this.u());
            }
            e10 = this.cG;
        }
        return e10;
    }

    public a(z z2, GameProfile gameProfile) {
        a a10;
        block4: {
            block5: {
                super(z2, gameProfile);
                this.cF = null;
                this.cI = null;
                this.cI = gameProfile.getName();
                int n2 = net.minecraft.U.B.aL();
                a10 = this;
                if (n2 == 0) break block4;
                if (a10.cI == null) break block5;
                a10 = this;
                if (n2 == 0) break block4;
                if (!a10.cI.isEmpty()) {
                    this.cI = net.minecraft.ar.aD.b(this.cI);
                }
            }
            d1.a(this);
            a10 = this;
        }
        fB.a(a10);
    }

    public String r() {
        return this.cI;
    }

    public v q() {
        return this.cF;
    }

    public boolean m() {
        return this.j() != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public v i() {
        e e10;
        int n2 = net.minecraft.U.B.aL();
        if (!fU.ab()) {
            return null;
        }
        a a10 = this;
        if (n2 != 0) {
            if (a10.cF != null) {
                return this.cF;
            }
            a10 = this;
        }
        e e11 = e10 = a10.j();
        if (n2 != 0) {
            if (e11 == null) {
                return null;
            }
            e11 = e10;
        }
        v v2 = e11.a();
        return v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean C() {
        e e10 = net.minecraft.client.Q.P().ar().a(this.m().getId());
        int n2 = net.minecraft.U.B.ah();
        e e11 = e10;
        if (n2 == 0) {
            if (e11 == null) return false;
            e11 = e10;
        }
        if (e11.l() != net.minecraft.ah.s.CREATIVE) return false;
        return true;
    }

    public v e() {
        e e10;
        block4: {
            block2: {
                boolean bl2;
                block3: {
                    e10 = this.j();
                    int n2 = net.minecraft.U.B.ah();
                    if (e10 == null) break block2;
                    bl2 = cj.b.i.a(ch.class).i();
                    if (n2 != 0) break block3;
                    if (!bl2) break block4;
                    bl2 = ch.k.l();
                }
                if (!bl2) break block4;
            }
            return net.minecraft.client.D.z.c(this.u());
        }
        return e10.b();
    }

    public static A a(v v2, String string) {
        u u2 = net.minecraft.client.Q.P().aN();
        d d10 = u2.a(v2);
        int n2 = net.minecraft.U.B.aL();
        d d11 = d10;
        if (n2 != 0) {
            if (d11 == null) {
                d10 = new A(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", net.minecraft.ar.aD.b(string)), net.minecraft.client.D.z.c(net.minecraft.client.q.a.a(string)), new aI());
                u2.a(v2, d10);
            }
            d11 = d10;
        }
        return (A)d11;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float s() {
        float f10;
        ak ak2;
        float f11;
        block22: {
            boolean bl2;
            block16: {
                int n2;
                block17: {
                    float f12;
                    block21: {
                        float f13;
                        float f14;
                        block19: {
                            block20: {
                                a a10;
                                block18: {
                                    block14: {
                                        block15: {
                                            float f15;
                                            block12: {
                                                block13: {
                                                    f11 = 1.0f;
                                                    n2 = net.minecraft.U.B.aL();
                                                    a a11 = this;
                                                    if (n2 != 0) {
                                                        if (a11.cw.e) {
                                                            f11 *= 1.1f;
                                                        }
                                                        a11 = this;
                                                    }
                                                    b b10 = a11.a(net.minecraft.U.M.d);
                                                    f11 = (float)((double)f11 * ((b10.d() / (double)this.cw.c() + 1.0) / 2.0));
                                                    f15 = this.cw.c();
                                                    if (n2 == 0) break block12;
                                                    if (f15 == 0.0f) break block13;
                                                    f15 = f11;
                                                    if (n2 == 0) break block12;
                                                    if (Float.isNaN(f15)) break block13;
                                                    bl2 = Float.isInfinite(f11);
                                                    if (n2 == 0) break block14;
                                                    if (!bl2) break block15;
                                                }
                                                f15 = 1.0f;
                                            }
                                            f11 = f15;
                                        }
                                        bl2 = this.aq();
                                    }
                                    if (n2 == 0) break block16;
                                    if (!bl2) break block17;
                                    a10 = this;
                                    if (n2 == 0) break block18;
                                    if (a10.a().w() != h.i) break block17;
                                    a10 = this;
                                }
                                int n3 = a10.v();
                                f14 = f12 = (float)n3 / 20.0f;
                                f13 = 1.0f;
                                if (n2 == 0) break block19;
                                if (!(f14 > f13)) break block20;
                                f12 = 1.0f;
                                if (n2 != 0) break block21;
                            }
                            f14 = f12;
                            f13 = f12;
                        }
                        f12 = f14 * f13;
                    }
                    f11 *= 1.0f - f12 * 0.15f;
                }
                ak2 = cq.at;
                if (n2 == 0) break block22;
                bl2 = ak2.b();
            }
            if (!bl2) {
                f10 = f11;
                return f10;
            }
            ak2 = cq.at;
        }
        f10 = cq.f(ak2, this, Float.valueOf(f11));
        return f10;
    }

    public boolean d() {
        return this.j() != null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean ae() {
        e e10 = net.minecraft.client.Q.P().ar().a(this.m().getId());
        int n2 = net.minecraft.U.B.aL();
        e e11 = e10;
        if (n2 != 0) {
            if (e11 == null) return false;
            e11 = e10;
        }
        if (e11.l() != net.minecraft.ah.s.SPECTATOR) return false;
        return true;
    }

    static {
        cH = new v("textures/entity/elytra.png");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public v p() {
        e e10 = this.j();
        int n2 = net.minecraft.U.B.ah();
        e e11 = e10;
        if (n2 == 0) {
            if (e11 == null) {
                return null;
            }
            e11 = e10;
        }
        v v2 = e11.k();
        return v2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean o() {
        e e10 = this.j();
        int n2 = net.minecraft.U.B.ah();
        e e11 = e10;
        if (n2 == 0) {
            if (e11 == null) return false;
            e11 = e10;
        }
        boolean bl2 = e11.o();
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public static v a(String string) {
        return new v("skins/" + net.minecraft.ar.aD.b(string));
    }

    public boolean f() {
        v v2 = this.i();
        int n2 = net.minecraft.U.B.ah();
        v v3 = v2;
        if (n2 == 0) {
            if (v3 == null) {
                return false;
            }
            v3 = v2;
        }
        return v3 != this.cF;
    }

    public void a(v v2) {
        this.cF = v2;
    }
}

