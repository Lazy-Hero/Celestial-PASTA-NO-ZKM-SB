/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.aA;

import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.aA.h;

public class l {
    private /* synthetic */ int b;
    private final /* synthetic */ int d;
    private /* synthetic */ int c;
    private /* synthetic */ i a;

    public int e() {
        return this.b;
    }

    public int d() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String toString() {
        block10: {
            block9: {
                block7: {
                    block8: {
                        var1_1 = h.b();
                        v0 = this.d;
                        if (!var1_1) break block7;
                        if (v0 < 3) break block8;
                        v1 = var3_2 = K.h.b(this.c());
                        if (!var1_1) ** GOTO lbl11
                        if (v1 == null) {
                            v2 = "null";
                        } else {
                            v1 = var3_2;
lbl11:
                            // 2 sources

                            v2 = var2_4 = v1.toString();
                        }
                        if (this.c > 1) {
                            var2_4 = this.c + "*" + var2_4;
                        }
                        if (var1_1) break block9;
                    }
                    v0 = K.b(this.c());
                }
                var2_4 = Integer.toString(v0);
                v3 = this.c;
                if (!var1_1) break block10;
                if (v3 > 1) {
                    var2_4 = this.c + "x" + var2_4;
                }
            }
            v3 = this.a();
        }
        if ((var3_3 = v3) <= 0) return var2_4;
        return var2_4 + ":" + var3_3;
    }

    public l(int n2, K k2) {
        this(3, n2, k2);
    }

    public l(int n2, int n3, K k2, int n4) {
        this(n2, n3, k2);
        this.a = k2.c(n4);
    }

    private int a() {
        return this.a.b().d(this.a);
    }

    public void a(int n2) {
        this.b = n2;
    }

    private K c() {
        return this.a.b();
    }

    public l(int n2, int n3, K k2) {
        this.c = 1;
        this.d = n2;
        this.c = n3;
        this.a = k2.d();
    }

    public i b() {
        return this.a;
    }
}

