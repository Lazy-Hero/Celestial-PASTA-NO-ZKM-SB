/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.D;
import net.minecraft.ah.z;
import net.minecraft.ak.h;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class J
extends h {
    private final /* synthetic */ int f;
    private /* synthetic */ int e;
    private /* synthetic */ int g;
    private /* synthetic */ boolean j;
    private final /* synthetic */ double i;
    protected /* synthetic */ n h;
    private final /* synthetic */ D d;
    protected /* synthetic */ int c;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int n2;
        String string;
        block3: {
            int n3;
            block2: {
                string = net.minecraft.ak.h.h();
                n2 = this.e;
                n3 = -this.g;
                if (string != null) break block2;
                if (n2 < n3) return 0 != 0;
                n2 = this.e;
                if (string != null) break block3;
                n3 = 1200;
            }
            if (n2 > n3) return 0 != 0;
            n2 = this.a(this.d.aG, this.h) ? 1 : 0;
        }
        if (string != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a() {
        this.d.l().a((double)this.h.e() + 0.5, this.h.b() + 1, (double)this.h.a() + 0.5, this.i);
        this.e = 0;
        this.g = this.d.f().nextInt(this.d.f().nextInt(1200) + 1200) + 1200;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a() {
        var2_1 = this.f;
        var1_2 = net.minecraft.ak.h.h();
        var3_3 = true;
        var4_4 = new n(this.d);
        var5_5 = 0;
        do {
            block21: {
                if (var5_5 > true) return (boolean)0;
                v0 = 0;
                if (var1_2 != null) return (boolean)v0;
                var6_6 = v0;
                block1: while (true) {
                    v1 = var6_6;
                    v2 = var2_1;
                    block2: while (v1 < v2) {
                        v3 = 0;
                        if (var1_2 != null) break block21;
                        var7_7 = v3;
                        while (var7_7 <= var6_6) {
                            block22: {
                                block24: {
                                    block23: {
                                        v1 = var7_7;
                                        v2 = var6_6;
                                        if (var1_2 != null) continue block2;
                                        if (var1_2 != null) break block23;
                                        if (v1 >= v2) ** GOTO lbl-1000
                                        v4 = var7_7;
                                        if (var1_2 != null) break block24;
                                        v5 = -var6_6;
                                    }
                                    ** if (v4 <= v5) goto lbl-1000
lbl-1000:
                                    // 1 sources

                                    {
                                        v4 = var6_6;
                                        ** GOTO lbl33
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        v4 = var8_8 = 0;
                                    }
                                }
                                while (var8_8 <= var6_6) {
                                    var9_9 = var4_4.a(var7_7, var5_5 - 1, var8_8);
                                    v6 = this.d.a(var9_9) ? 1 : 0;
                                    if (var1_2 != null) break block22;
                                    if (var1_2 == null) {
                                        if (v6 != 0) {
                                            v7 = this.a(this.d.aG, var9_9) ? 1 : 0;
                                            if (var1_2 == null) {
                                                if (v7 != 0) {
                                                    this.h = var9_9;
                                                    return true;
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v7 = var8_8;
                                        }
                                    }
                                    if (var1_2 != null) ** GOTO lbl52
                                    if (v7 > 0) {
                                        v8 = -var8_8;
                                    } else {
                                        v7 = 1;
lbl52:
                                        // 2 sources

                                        v8 = var8_8 = v7 - var8_8;
                                    }
                                    if (var1_2 == null) continue;
                                }
                                v6 = var7_7;
                            }
                            if (var1_2 != null) ** GOTO lbl61
                            if (v6 > 0) {
                                v9 = -var7_7;
                            } else {
                                v6 = 1;
lbl61:
                                // 2 sources

                                v9 = var7_7 = v6 - var7_7;
                            }
                            if (var1_2 == null) continue;
                        }
                        ++var6_6;
                        if (var1_2 == null) continue block1;
                    }
                    break;
                }
                v3 = var5_5;
            }
            if (var1_2 == null) {
                if (v3 > 0) {
                    v10 = -var5_5;
                    continue;
                }
                v3 = 1;
            }
            v10 = var5_5 = v3 - var5_5;
        } while (var1_2 == null);
        return (boolean)0;
    }

    public J(D d10, double d11, int n2) {
        this.h = n.o;
        this.d = d10;
        this.i = d11;
        this.f = n2;
        this.a(5);
    }

    protected abstract boolean a(z var1, n var2);

    @Override
    public void b() {
        block5: {
            J j2;
            block2: {
                block3: {
                    String string;
                    block4: {
                        string = net.minecraft.ak.h.h();
                        j2 = this;
                        if (string != null) break block2;
                        if (!(j2.d.c(this.h.a()) > 1.0)) break block3;
                        this.j = false;
                        ++this.e;
                        int n2 = this.e % 40;
                        if (string != null) break block4;
                        if (n2 != 0) break block5;
                        n2 = this.d.l().a((double)this.h.e() + 0.5, this.h.b() + 1, (double)this.h.a() + 0.5, this.i) ? 1 : 0;
                    }
                    if (string == null) break block5;
                }
                this.j = true;
                j2 = this;
            }
            --j2.e;
        }
    }

    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        int n2 = this.c--;
        if (string == null) {
            if (n2 > 0) {
                return false;
            }
            this.c = 200 + this.d.f().nextInt(200);
            n2 = this.a();
        }
        return n2 != 0;
    }

    protected boolean b() {
        return this.j;
    }
}

