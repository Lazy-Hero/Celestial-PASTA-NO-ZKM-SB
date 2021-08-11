/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ag;

import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.ag.A;
import net.minecraft.ag.D;
import net.minecraft.ah.z;
import net.minecraft.ar.G;
import net.minecraft.ar.a3;
import net.minecraft.av.b;
import net.minecraft.av.f;
import net.minecraft.i.j;
import net.minecraft.q.m;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public abstract class E
extends D {
    private static final /* synthetic */ net.minecraft.q.r<Boolean> c3;

    @Override
    protected void D() {
        super.D();
        this.a(net.minecraft.U.M.f).a(this.at());
        this.a(net.minecraft.U.M.d).a(0.175f);
        this.a(cT).a(0.5);
    }

    public int a() {
        return 5;
    }

    public static void c(b b10, Class<?> class_) {
        net.minecraft.ag.D.b(b10, class_);
        b10.a(net.minecraft.av.f.ENTITY, (net.minecraft.av.g)new net.minecraft.x.d(class_, "Items"));
    }

    public void y(boolean bl2) {
        this.ap.b(c3, bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected int ao() {
        String[] arrstring = net.minecraft.ag.A.b();
        E e10 = this;
        if (arrstring != null) {
            if (e10.F()) {
                return 17;
            }
            e10 = this;
        }
        int n2 = super.ao();
        return n2;
    }

    static {
        c3 = net.minecraft.q.m.a(E.class, net.minecraft.q.h.g);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(c3, false);
    }

    @Override
    protected net.minecraft.ar.d ap() {
        super.ap();
        return net.minecraft.u.E.c1;
    }

    protected void R() {
        this.a(net.minecraft.u.E.dm, 1.0f, (this.g.nextFloat() - this.g.nextFloat()) * 0.2f + 1.0f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(r r2) {
        super.a(r2);
        String[] arrstring = net.minecraft.ag.A.b();
        this.y(r2.f("ChestedHorse"));
        String[] arrstring2 = arrstring;
        E e10 = this;
        if (arrstring2 != null) {
            if (e10.F()) {
                u u2 = r2.c("Items", 10);
                this.ar();
                int n2 = 0;
                while (n2 < u2.b()) {
                    r r3 = u2.d(n2);
                    int n3 = r3.r("Slot") & 0xFF;
                    if (arrstring2 == null) return;
                    if (arrstring2 != null) {
                        if (n3 >= 2 && n3 < this.cO.e()) {
                            this.cO.a(n3, new d(r3));
                        }
                        ++n2;
                    }
                    if (arrstring2 != null) continue;
                }
            }
            e10 = this;
        }
        e10.ah();
    }

    @Override
    public void f(r r2) {
        block5: {
            String[] arrstring = net.minecraft.ag.A.b();
            super.f(r2);
            r2.a("ChestedHorse", this.F());
            String[] arrstring2 = arrstring;
            if (this.F()) {
                u u2 = new u();
                int n2 = 2;
                while (n2 < this.cO.e()) {
                    d d10 = this.cO.a(n2);
                    if (arrstring2 != null) {
                        if (arrstring2 != null) {
                            if (!d10.G()) {
                                r r3 = new r();
                                r3.a("Slot", (byte)n2);
                                d10.a(r3);
                                u2.a(r3);
                            }
                            ++n2;
                        }
                        if (arrstring2 != null) continue;
                    }
                    break block5;
                }
                r2.a("Items", u2);
            }
        }
    }

    public E(z z2) {
        super(z2);
        this.cR = false;
    }

    @Override
    public double o() {
        return super.o() - 0.25;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(int var1_1, d var2_2) {
        var3_3 = net.minecraft.ag.A.b();
        v0 = var1_1;
        if (var3_3 == null) return (boolean)v0;
        if (v0 == 499) {
            v0 = this.F() ? 1 : 0;
            if (var3_3 != null) {
                if (v0 != 0) {
                    v0 = var2_2.G() ? 1 : 0;
                    if (var3_3 != null) {
                        if (v0 != 0) {
                            this.y(false);
                            this.ar();
                            return true;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v0 = this.F() ? 1 : 0;
                }
            }
            if (var3_3 == null) return (boolean)v0;
            if (v0 == 0 && var2_2.w() == net.minecraft.w.k.b(net.minecraft.u.g.cd)) {
                this.y(true);
                this.ar();
                return true;
            }
        }
        v0 = super.a(var1_1, var2_2) ? 1 : 0;
        return (boolean)v0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(j var1_1, a3 var2_2) {
        block32: {
            block33: {
                block36: {
                    block37: {
                        block34: {
                            block35: {
                                var4_3 = var1_1.c(var2_2);
                                var3_4 = net.minecraft.ag.A.b();
                                if (var4_3.w() == h.bn) {
                                    return super.b(var1_1, var2_2);
                                }
                                v0 = this.Q();
                                if (var3_4 != null) {
                                    if (!v0) {
                                        v0 = this.aD();
                                        if (var3_4 != null) {
                                            if (v0) {
                                                v0 = var1_1.a4();
                                                if (var3_4 != null) {
                                                    if (v0) {
                                                        this.f(var1_1);
                                                        return true;
                                                    } else {
                                                        ** GOTO lbl-1000
                                                    }
                                                }
                                            } else lbl-1000:
                                            // 3 sources

                                            {
                                                v0 = this.aU();
                                            }
                                        }
                                        if (var3_4 != null) {
                                            if (v0) {
                                                return super.b(var1_1, var2_2);
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v0 = var4_3.G();
                                    }
                                }
                                if (var3_4 == null) break block32;
                                if (v0) break block33;
                                v0 = var5_5 = this.a(var1_1, var4_3);
                                if (var3_4 != null) {
                                    if (!v0) {
                                        v0 = this.aD();
                                        if (var3_4 != null) {
                                            if (!v0) {
                                                v1 = var4_3.a(var1_1, (B)this, var2_2);
                                                if (var3_4 == null) return v1;
                                                if (v1) {
                                                    return true;
                                                }
                                                this.P();
                                                return true;
                                            } else {
                                                ** GOTO lbl-1000
                                            }
                                        }
                                    } else lbl-1000:
                                    // 3 sources

                                    {
                                        v0 = var5_5;
                                    }
                                }
                                if (var3_4 == null) break block34;
                                if (v0) break block35;
                                v0 = this.F();
                                if (var3_4 == null) break block34;
                                if (!v0 && var4_3.w() == net.minecraft.w.k.b(net.minecraft.u.g.cd)) {
                                    this.y(true);
                                    this.R();
                                    var5_5 = true;
                                    this.ar();
                                }
                            }
                            v0 = var5_5;
                        }
                        if (var3_4 == null) break block36;
                        if (v0) break block37;
                        v0 = this.Q();
                        if (var3_4 == null) break block36;
                        if (!v0) {
                            v0 = this.ac();
                            if (var3_4 != null) {
                                if (!v0 && var4_3.w() == h.be) {
                                    this.f(var1_1);
                                    return true;
                                } else {
                                    ** GOTO lbl63
                                }
                            } else {
                                ** GOTO lbl62
                            }
                        }
                        break block37;
lbl62:
                        // 2 sources

                        break block36;
                    }
                    v0 = var5_5;
                }
                if (var3_4 != null) {
                    if (v0) {
                        v2 = var1_1.cw.g;
                        if (var3_4 == null) return v2;
                        if (v2 != false) return true;
                        var4_3.b(1);
                        return true;
                    } else {
                        ** GOTO lbl74
                    }
                }
                break block32;
            }
            v0 = this.Q();
        }
        if (var3_4 != null) {
            if (v0) {
                return super.b(var1_1, var2_2);
            }
            v0 = var4_3.a(var1_1, (B)this, var2_2);
        }
        if (var3_4 == null) return v0;
        if (v0) {
            return true;
        }
        this.d(var1_1);
        return true;
    }

    @Override
    public void a(G g10) {
        block5: {
            E e10;
            block6: {
                boolean bl2;
                block4: {
                    String[] arrstring = net.minecraft.ag.A.b();
                    super.a(g10);
                    String[] arrstring2 = arrstring;
                    bl2 = this.F();
                    if (arrstring2 == null) break block4;
                    if (!bl2) break block5;
                    e10 = this;
                    if (arrstring2 == null) break block6;
                    bl2 = e10.aG.C;
                }
                if (!bl2) {
                    this.a(net.minecraft.w.k.b(net.minecraft.u.g.cd), 1);
                }
                e10 = this;
            }
            e10.y(false);
        }
    }

    public boolean F() {
        return this.ap.b(c3);
    }
}

