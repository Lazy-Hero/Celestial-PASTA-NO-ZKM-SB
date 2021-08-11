/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.J;

import net.minecraft.J.j;
import net.minecraft.J.u;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.bp;
import net.minecraft.Z.i;
import net.minecraft.ah.U;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.aH;
import net.minecraft.ar.ay;
import net.minecraft.av.b;
import net.minecraft.k.n;
import net.minecraft.u.E;
import net.minecraft.u.g;
import net.minecraft.w.d;
import net.minecraft.z.f;

public class C
extends u {
    private /* synthetic */ int a1;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(U u2, z z2, n n2, i i2, float f10) {
        boolean bl2;
        int n3;
        block4: {
            block5: {
                n3 = net.minecraft.J.j.d();
                bl2 = this.b();
                if (n3 == 0) break block4;
                if (!bl2) break block5;
                bl2 = bp.a(i2);
                if (n3 != 0) {
                    if (bl2) return false;
                    bl2 = bp.b(z2, n2.a());
                }
                if (n3 == 0) break block4;
                if (bl2) return false;
            }
            bl2 = super.a(u2, z2, n2, i2, f10);
        }
        if (n3 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    public C(z z2) {
        super(z2);
        this.a1 = -1;
    }

    @Override
    protected void f(r r2) {
        super.f(r2);
        r2.b("TNTFuse", this.a1);
    }

    @Override
    public boolean a(G g10, float f10) {
        boolean bl2;
        block4: {
            block5: {
                x x2 = g10.q();
                int n2 = net.minecraft.J.j.c();
                bl2 = x2 instanceof f;
                if (n2 != 0) break block4;
                if (!bl2) break block5;
                f f11 = (f)x2;
                bl2 = f11.p();
                if (n2 != 0) break block4;
                if (bl2) {
                    this.b(f11.aq * f11.aq + f11.G * f11.G + f11.d * f11.d);
                }
            }
            bl2 = super.a(g10, f10);
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(U u2, z z2, n n2, i i2) {
        int n3 = net.minecraft.J.j.d();
        C c10 = this;
        if (n3 != 0) {
            if (c10.b()) {
                boolean bl2 = bp.a(i2);
                if (n3 != 0) {
                    if (bl2) return 0.0f;
                    bl2 = bp.b(z2, n2.a());
                }
                if (bl2) return 0.0f;
            }
            c10 = this;
        }
        float f10 = super.a(u2, z2, n2, i2);
        return f10;
    }

    @Override
    public j o() {
        return net.minecraft.J.j.TNT;
    }

    protected void b(double d10) {
        int n2 = net.minecraft.J.j.d();
        if (!this.aG.C) {
            double d11 = Math.sqrt(d10);
            if (n2 != 0) {
                if (d11 > 5.0) {
                    d11 = 5.0;
                }
                this.aG.a(this, this.a, this.aF, this.ax, (float)(4.0 + this.g.nextDouble() * 1.5 * d11), true);
            }
            this.a();
        }
    }

    public boolean b() {
        int n2 = net.minecraft.J.j.c();
        boolean bl2 = this.a1;
        if (n2 == 0) {
            bl2 = bl2 > BADBOOL -1;
        }
        return bl2;
    }

    public static void b(b b10) {
        net.minecraft.J.u.a(b10, C.class);
    }

    @Override
    public i n() {
        return net.minecraft.u.g.cR.d();
    }

    public C(z z2, double d10, double d11, double d12) {
        super(z2, d10, d11, d12);
        this.a1 = -1;
    }

    @Override
    public void a(G g10) {
        block5: {
            block7: {
                C c10;
                int n2;
                block2: {
                    int n3;
                    block3: {
                        C c11;
                        block6: {
                            boolean bl2;
                            block4: {
                                double d10 = this.aq * this.aq + this.d * this.d;
                                n3 = net.minecraft.J.j.d();
                                n2 = g10.n();
                                if (n3 == 0) break block2;
                                if (n2 != 0) break block3;
                                n2 = g10.j() ? 1 : 0;
                                if (n3 == 0) break block2;
                                if (n2 != 0) break block3;
                                double d11 = d10 - (double)0.01f;
                                n2 = d11 == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                if (n3 == 0) break block2;
                                if (n2 >= 0) break block3;
                                super.a(g10);
                                bl2 = g10.j();
                                if (n3 == 0) break block4;
                                if (bl2) break block5;
                                c11 = this;
                                if (n3 == 0) break block6;
                                bl2 = c11.aG.M().c("doEntityDrops");
                            }
                            if (!bl2) break block5;
                            c11 = this;
                        }
                        c11.a(new d(net.minecraft.u.g.cR, 1), 0.0f);
                        if (n3 != 0) break block5;
                    }
                    c10 = this;
                    if (n3 == 0) break block7;
                    n2 = c10.a1;
                }
                if (n2 >= 0) break block5;
                this.c();
                c10 = this;
            }
            c10.a1 = this.g.nextInt(20) + this.g.nextInt(20);
        }
    }

    @Override
    protected void a(r r2) {
        block3: {
            r r3;
            block2: {
                int n2 = net.minecraft.J.j.c();
                C c10 = this;
                r3 = r2;
                if (n2 != 0) break block2;
                super.a(r3);
                if (!r2.a("TNTFuse", 99)) break block3;
                c10 = this;
                r3 = r2;
            }
            c10.a1 = r3.m("TNTFuse");
        }
    }

    @Override
    public void a(int n2, int n3, int n4, boolean n5) {
        block3: {
            C c10;
            block4: {
                int n6;
                block2: {
                    int n7 = net.minecraft.J.j.c();
                    n6 = n5;
                    if (n7 != 0) break block2;
                    if (n6 == 0) break block3;
                    c10 = this;
                    if (n7 != 0) break block4;
                    n6 = c10.a1;
                }
                if (n6 >= 0) break block3;
                c10 = this;
            }
            c10.c();
        }
    }

    @Override
    public void ae() {
        block7: {
            double d10;
            C c10;
            block6: {
                int n2;
                block5: {
                    int n3;
                    block4: {
                        block2: {
                            block3: {
                                int n4 = net.minecraft.J.j.c();
                                super.ae();
                                n3 = n4;
                                n2 = this.a1--;
                                if (n3 != 0) break block2;
                                if (n2 <= 0) break block3;
                                this.aG.a(net.minecraft.ar.aH.SMOKE_NORMAL, this.a, this.aF + 0.5, this.ax, 0.0, 0.0, 0.0, new int[0]);
                                if (n3 == 0) break block4;
                            }
                            n2 = this.a1;
                        }
                        if (n3 != 0) break block5;
                        if (n2 == 0) {
                            this.b(this.aq * this.aq + this.d * this.d);
                        }
                    }
                    c10 = this;
                    if (n3 != 0) break block6;
                    n2 = c10.aE ? 1 : 0;
                }
                if (n2 == 0) break block7;
                c10 = this;
            }
            if ((d10 = c10.aq * this.aq + this.d * this.d) >= (double)0.01f) {
                this.b(d10);
            }
        }
    }

    public void c() {
        block3: {
            C c10;
            block4: {
                boolean bl2;
                block2: {
                    this.a1 = 80;
                    int n2 = net.minecraft.J.j.d();
                    bl2 = this.aG.C;
                    if (n2 == 0) break block2;
                    if (bl2) break block3;
                    this.aG.a((x)this, (byte)10);
                    c10 = this;
                    if (n2 == 0) break block4;
                    bl2 = c10.aR();
                }
                if (bl2) break block3;
                c10 = this;
            }
            c10.aG.a(null, this.a, this.aF, this.ax, net.minecraft.u.E.ei, ay.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public void d(float f10, float f11) {
        int n2 = net.minecraft.J.j.c();
        if (n2 == 0) {
            if (f10 >= 3.0f) {
                float f12 = f10 / 10.0f;
                this.b((double)(f12 * f12));
            }
            super.d(f10, f11);
        }
    }

    @Override
    public void a(byte by2) {
        block2: {
            block1: {
                int n2;
                block0: {
                    n2 = net.minecraft.J.j.d();
                    if (n2 == 0) break block0;
                    if (by2 != 10) break block1;
                    this.c();
                }
                if (n2 != 0) break block2;
            }
            super.a(by2);
        }
    }

    public int e() {
        return this.a1;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

