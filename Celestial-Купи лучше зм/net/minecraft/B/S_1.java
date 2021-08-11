/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import net.minecraft.B.C;
import net.minecraft.B.D;
import net.minecraft.B.n;
import net.minecraft.U.e;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.w.d;
import net.minecraft.y.b;

public class S
extends D {
    private final /* synthetic */ e f;
    private final /* synthetic */ C g;
    private final /* synthetic */ j i;
    private /* synthetic */ int h;

    @Override
    protected void b(d d10) {
        d10.a(this.i.aG, this.i, this.h);
        this.h = 0;
    }

    @Override
    protected void a(d d10, int n2) {
        this.h += n2;
        this.b(d10);
    }

    @Override
    public d a(j j2, d d10) {
        block2: {
            S s2;
            d d11;
            block3: {
                d d12;
                b b10;
                block4: {
                    int n2 = n.b();
                    this.b(d10);
                    int n3 = n2;
                    b10 = this.g.b();
                    if (b10 == null) break block2;
                    d12 = this.g.a(0);
                    d11 = this.g.a(1);
                    s2 = this;
                    if (n3 == 0) break block3;
                    if (s2.a(b10, d12, d11)) break block4;
                    s2 = this;
                    if (n3 == 0) break block3;
                    if (!s2.a(b10, d11, d12)) break block2;
                }
                this.f.a(b10);
                j2.b(m.z);
                this.g.a(0, d12);
                s2 = this;
            }
            s2.g.a(1, d11);
        }
        return d10;
    }

    @Override
    public boolean d(d d10) {
        return false;
    }

    @Override
    public d b(int n2) {
        int n3 = n.c();
        S s2 = this;
        if (n3 == 0) {
            if (s2.b()) {
                this.h += Math.min(n2, this.d().t());
            }
            s2 = this;
        }
        return super.b(n2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(b var1_1, d var2_2, d var3_3) {
        block5: {
            block7: {
                block6: {
                    var5_4 = var1_1.k();
                    var4_5 = n.b();
                    var6_6 = var1_1.d();
                    v0 = var2_2;
                    if (var4_5 != 0) {
                        if (v0.w() != var5_4.w()) return (boolean)0;
                        v0 = var2_2;
                    }
                    v1 = v0.t();
                    if (var4_5 == 0) return (boolean)v1;
                    if (v1 < var5_4.t()) return (boolean)0;
                    v1 = var6_6.G() ? 1 : 0;
                    if (var4_5 == 0) break block5;
                    if (v1 != 0) break block6;
                    v1 = var3_3.G() ? 1 : 0;
                    if (var4_5 == 0) break block5;
                    if (v1 != 0) break block6;
                    v2 = var6_6;
                    if (var4_5 != 0) {
                        if (v2.w() == var3_3.w()) {
                            v1 = var3_3.t();
                            if (var4_5 != 0) {
                                if (v1 >= var6_6.t()) {
                                    var2_2.b(var5_4.t());
                                    var3_3.b(var6_6.t());
                                    return true;
                                } else {
                                    ** GOTO lbl29
                                }
                            } else {
                                ** GOTO lbl28
                            }
                        } else {
                            ** GOTO lbl27
                        }
                    }
                    break block7;
lbl27:
                    // 2 sources

                    break block6;
lbl28:
                    // 2 sources

                    break block5;
                }
                v2 = var6_6;
            }
            v1 = v2.G() ? 1 : 0;
        }
        if (var4_5 == 0) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        v1 = var3_3.G() ? 1 : 0;
        if (var4_5 == 0) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        var2_2.b(var5_4.t());
        return true;
    }

    public S(j j2, e e10, C c10, int n2, int n3, int n4) {
        super(c10, n2, n3, n4);
        this.i = j2;
        this.f = e10;
        this.g = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

