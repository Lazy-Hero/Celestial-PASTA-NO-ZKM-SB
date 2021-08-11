/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.p;
import net.minecraft.ak.h;
import net.minecraft.e.f;
import net.minecraft.i.j;
import net.minecraft.j.b;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class X
extends h {
    private final /* synthetic */ boolean d;
    protected /* synthetic */ B j;
    protected /* synthetic */ boolean f;
    private /* synthetic */ int i;
    private /* synthetic */ int g;
    protected /* synthetic */ int h;
    private /* synthetic */ int c;
    protected final /* synthetic */ D e;

    public X(D d10, boolean bl2, boolean bl3) {
        this.h = 60;
        this.e = d10;
        this.f = bl2;
        this.d = bl3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        block20: {
            block19: {
                block18: {
                    var2_1 = this.e.J();
                    var1_2 = net.minecraft.ak.h.h();
                    v0 = var2_1;
                    if (var1_2 == null) {
                        if (v0 == null) {
                            var2_1 = this.j;
                        }
                        v0 = var2_1;
                    }
                    if (var1_2 == null) {
                        if (v0 == null) {
                            return false;
                        }
                        v0 = var2_1;
                    }
                    v1 = v0.aL();
                    if (var1_2 != null) return v1;
                    if (!v1) {
                        return false;
                    }
                    var3_3 = this.e.aM();
                    var4_4 = var2_1.aM();
                    v2 = var3_3;
                    if (var1_2 != null) break block18;
                    if (v2 == null) break block19;
                    v2 = var4_4;
                }
                if (v2 == var3_3) {
                    return false;
                }
            }
            var5_5 = this.a();
            cfr_temp_0 = this.e.s(var2_1) - var5_5 * var5_5;
            v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
            if (var1_2 == null) {
                if (v3 > 0) {
                    return false;
                }
                v3 = (double)this.f;
            }
            if (var1_2 != null) break block20;
            if (v3 == false) ** GOTO lbl-1000
            v3 = (double)this.e.v().a(var2_1);
            if (var1_2 != null) ** GOTO lbl43
            if (v3 == false) ** GOTO lbl-1000
            this.c = 0;
            if (var1_2 != null) lbl-1000:
            // 2 sources

            {
                v4 = this.c + 1;
                v3 = v4;
                this.c = v4;
lbl43:
                // 2 sources

                if (var1_2 == null) {
                    if (v3 > this.h) {
                        return false;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 4 sources

            {
                v3 = (double)(var2_1 instanceof j);
            }
        }
        if (var1_2 != null) return (boolean)v3;
        if (v3 != false) {
            v3 = (double)((j)var2_1).cw.b;
            if (var1_2 != null) return (boolean)v3;
            if (v3 != false) {
                return false;
            }
        }
        this.e.d(var2_1);
        v3 = (double)true;
        return (boolean)v3;
    }

    protected boolean a(@Nullable B b10, boolean bl2) {
        String string = net.minecraft.ak.h.h();
        boolean bl3 = X.a(this.e, b10, bl2, this.f);
        if (string == null) {
            if (!bl3) {
                return false;
            }
            bl3 = this.e.a(new n(b10));
        }
        if (string == null) {
            if (!bl3) {
                return false;
            }
            bl3 = this.d;
        }
        if (string == null) {
            if (bl3) {
                int n2 = this.g = this.g - 1;
                if (string == null) {
                    if (n2 <= 0) {
                        this.i = 0;
                    }
                    n2 = this.i;
                }
                if (string == null) {
                    if (n2 == 0) {
                        int n3 = this.a(b10);
                        if (string == null) {
                            n3 = n3 != 0 ? 1 : 2;
                        }
                        this.i = n3;
                    }
                    n2 = this.i;
                }
                if (string == null) {
                    n2 = n2 != 2 ? 1 : 0;
                }
                return n2 != 0;
            }
            bl3 = true;
        }
        return bl3;
    }

    @Override
    public void a() {
        this.i = 0;
        this.g = 0;
        this.c = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected double a() {
        b b10 = this.e.a(M.b);
        String string = net.minecraft.ak.h.h();
        b b11 = b10;
        if (string == null) {
            if (b11 == null) {
                return 16.0;
            }
            b11 = b10;
        }
        double d10 = b11.d();
        return d10;
    }

    @Override
    public void g() {
        this.e.d((B)null);
        this.j = null;
    }

    public X(D d10, boolean bl2) {
        this(d10, bl2, false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(C var0, @Nullable B var1_1, boolean var2_2, boolean var3_3) {
        block23: {
            block22: {
                block19: {
                    block21: {
                        block20: {
                            var4_4 = net.minecraft.ak.h.h();
                            v0 = var1_1;
                            if (var4_4 == null) {
                                if (v0 == null) {
                                    return false;
                                }
                                v0 = var1_1;
                            }
                            if (var4_4 == null) {
                                if (v0 == var0) {
                                    return false;
                                }
                                v0 = var1_1;
                            }
                            v1 = v0.aL();
                            if (var4_4 == null) {
                                if (!v1) {
                                    return false;
                                }
                                v1 = var0.a((Class<? extends B>)var1_1.getClass());
                            }
                            if (var4_4 == null) {
                                if (!v1) {
                                    return false;
                                }
                                v1 = var0.e(var1_1);
                            }
                            if (var4_4 == null) {
                                if (v1) {
                                    return false;
                                }
                                v1 = var0 instanceof p;
                            }
                            if (var4_4 != null) break block19;
                            if (!v1) break block20;
                            v2 = var0;
                            if (var4_4 != null) break block21;
                            if (((p)v2).b() == null) break block20;
                            v3 = var1_1;
                            if (var4_4 == null) {
                                if (v3 instanceof p) {
                                    v3 = var0;
                                    if (var4_4 == null) {
                                        if (((p)v3).b().equals(((p)var1_1).b())) {
                                            return false;
                                        } else {
                                            ** GOTO lbl-1000
                                        }
                                    }
                                } else lbl-1000:
                                // 3 sources

                                {
                                    v3 = var1_1;
                                }
                            }
                            if (v3 == ((p)var0).a()) {
                                return false;
                            }
                            break block22;
                        }
                        v2 = var1_1;
                    }
                    v1 = v2 instanceof j;
                }
                if (var4_4 != null) break block23;
                if (!v1) break block22;
                v1 = var2_2;
                if (var4_4 != null) break block23;
                if (!v1) {
                    v1 = ((j)var1_1).cw.b;
                    if (var4_4 == null) {
                        if (v1) {
                            return false;
                        } else {
                            ** GOTO lbl57
                        }
                    } else {
                        ** GOTO lbl56
                    }
                }
                break block22;
lbl56:
                // 2 sources

                break block23;
            }
            v1 = var3_3;
        }
        if (var4_4 != null) return v1;
        if (v1 == false) return true;
        v1 = var0.v().a(var1_1);
        if (var4_4 != null) return v1;
        if (v1 != false) return true;
        return false;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public X a(int n2) {
        this.h = n2;
        return this;
    }

    private boolean a(B b10) {
        f f10;
        this.g = 10 + this.e.f().nextInt(5);
        net.minecraft.e.h h2 = this.e.l().a(b10);
        String string = net.minecraft.ak.h.h();
        net.minecraft.e.h h3 = h2;
        if (string == null) {
            if (h3 == null) {
                return false;
            }
            h3 = h2;
        }
        f f11 = f10 = h3.d();
        if (string == null) {
            if (f11 == null) {
                return false;
            }
            f11 = f10;
        }
        int n2 = f11.g - net.minecraft.k.h.f(b10.a);
        int n3 = f10.f - net.minecraft.k.h.f(b10.ax);
        double d10 = (double)(n2 * n2 + n3 * n3) - 2.25;
        double d11 = d10 == 0.0 ? 0 : (d10 < 0.0 ? -1 : 1);
        if (string == null) {
            d11 = d11 <= 0 ? 1.0 : 0.0;
        }
        return (boolean)d11;
    }
}

