/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.client.q;

import com.mojang.authlib.GameProfile;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.q.a;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class b
extends a {
    private /* synthetic */ int cJ;
    private /* synthetic */ double cK;
    private /* synthetic */ double cN;
    private /* synthetic */ double cM;
    private /* synthetic */ double cO;
    private /* synthetic */ double cL;

    @Override
    public void E() {
        block27: {
            b b10;
            int n2;
            block25: {
                float f10;
                float f11;
                block26: {
                    block24: {
                        float f12;
                        block23: {
                            block21: {
                                block22: {
                                    block20: {
                                        block19: {
                                            n2 = net.minecraft.U.B.aL();
                                            b b11 = this;
                                            if (n2 != 0) {
                                                if (b11.cJ > 0) {
                                                    block18: {
                                                        double d10;
                                                        double d11 = this.a + (this.cN - this.a) / (double)this.cJ;
                                                        double d12 = this.aF + (this.cM - this.aF) / (double)this.cJ;
                                                        double d13 = this.ax + (this.cO - this.ax) / (double)this.cJ;
                                                        for (d10 = this.cK - (double)this.e; d10 < -180.0; d10 += 360.0) {
                                                            if (n2 != 0) {
                                                                if (n2 != 0) continue;
                                                            }
                                                            break block18;
                                                        }
                                                        while (d10 >= 180.0) {
                                                            d10 -= 360.0;
                                                            if (n2 != 0) {
                                                                if (n2 != 0) continue;
                                                            }
                                                            break block18;
                                                        }
                                                        this.e = (float)((double)this.e + d10 / (double)this.cJ);
                                                        this.at = (float)((double)this.at + (this.cL - (double)this.at) / (double)this.cJ);
                                                        --this.cJ;
                                                        this.g(d11, d12, d13);
                                                    }
                                                    this.e(this.e, this.at);
                                                }
                                                this.bZ = this.b9;
                                                this.aE();
                                                b11 = this;
                                            }
                                            f11 = h.e(b11.aq * this.aq + this.d * this.d);
                                            f10 = (float)Math.atan(-this.G * (double)0.2f) * 15.0f;
                                            float f13 = f11 - 0.1f;
                                            f12 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                            if (n2 != 0) {
                                                if (f12 > 0) {
                                                    f11 = 0.1f;
                                                }
                                                f12 = (float)this.A;
                                            }
                                            if (n2 == 0) break block19;
                                            if (f12 == false) break block20;
                                            float f14 = this.V() - 0.0f;
                                            f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                        }
                                        if (n2 == 0) break block21;
                                        if (f12 > 0) break block22;
                                    }
                                    f11 = 0.0f;
                                }
                                f12 = (float)this.A;
                            }
                            if (n2 == 0) break block23;
                            if (f12 != false) break block24;
                            b10 = this;
                            if (n2 == 0) break block25;
                            float f15 = b10.V() - 0.0f;
                            f12 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                        }
                        if (f12 > 0) break block26;
                    }
                    f10 = 0.0f;
                }
                this.b9 += (f11 - this.b9) * 0.4f;
                this.bF += (f10 - this.bF) * 0.8f;
                this.aG.H.b("push");
                this.af();
                b10 = this;
            }
            b10.aG.H.c();
            if (!net.minecraft.k.m.c()) break block27;
            net.minecraft.U.B.e(++n2);
        }
    }

    @Override
    public boolean a(G g10, float f10) {
        return true;
    }

    @Override
    public boolean b(double d10) {
        double d11 = this.m().d() * 10.0;
        int n2 = net.minecraft.U.B.ah();
        boolean bl2 = Double.isNaN(d11);
        if (n2 == 0) {
            if (bl2) {
                d11 = 1.0;
            }
            d11 = d11 * 64.0 * b.al();
            double d12 = d10 - d11 * d11;
            bl2 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        }
        if (n2 == 0) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    public b(z z2, GameProfile gameProfile) {
        super(z2, gameProfile);
        this.aI = 1.0f;
        this.K = true;
        this.cA = 0.25f;
    }

    @Override
    public void ae() {
        this.cA = 0.0f;
        int n2 = net.minecraft.U.B.aL();
        super.ae();
        this.bR = this.a3;
        int n3 = n2;
        double d10 = this.a - this.N;
        double d11 = this.ax - this.k;
        float f10 = h.e(d10 * d10 + d11 * d11) * 4.0f;
        if (n3 != 0) {
            if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            this.a3 += (f10 - this.a3) * 0.4f;
            this.bK += this.a3;
        }
    }

    @Override
    public void a(double d10, double d11, double d12, float f10, float f11, int n2, boolean bl2) {
        this.cN = d10;
        this.cM = d11;
        this.cO = d12;
        this.cK = f10;
        this.cL = f11;
        this.cJ = n2;
    }

    @Override
    public n f() {
        return new n(this.a + 0.5, this.aF + 0.5, this.ax + 0.5);
    }

    @Override
    public boolean a(int n2, String string) {
        return false;
    }

    @Override
    public void a(k k2) {
        net.minecraft.client.Q.P().n.f().a(k2);
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

