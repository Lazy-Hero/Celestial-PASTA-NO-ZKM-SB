/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ak;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.Z.i;
import net.minecraft.ac.c;
import net.minecraft.ah.z;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.k.o;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class P
extends h {
    protected final /* synthetic */ D g;
    protected /* synthetic */ double c;
    protected /* synthetic */ double e;
    protected /* synthetic */ double d;
    protected /* synthetic */ double f;

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        var1_1 = h.h();
        v0 = this.g;
        if (var1_1 != null) ** GOTO lbl11
        if (v0.aA() == null) {
            v1 = this.g.p();
            if (var1_1 == null) {
                if (!v1) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = this.g;
lbl11:
            // 2 sources

            v1 = v0.p();
        }
        if (var1_1 != null) return v1;
        if (v1) {
            v2 = this;
            if (var1_1 == null) {
                var2_2 = v2.a(this.g.aG, this.g, 5, 4);
                if (var2_2 != null) {
                    this.d = var2_2.e();
                    this.e = var2_2.b();
                    this.f = var2_2.a();
                    return true;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = this;
        }
        v1 = v2.a();
        return v1;
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.g.l().o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Nullable
    private n a(z z2, x x2, int n2, int n3) {
        n n4 = new n(x2);
        int n5 = n4.e();
        int n6 = n4.b();
        int n7 = n4.a();
        float f10 = n2 * n2 * n3 * 2;
        String string = h.h();
        n n8 = null;
        o o2 = new o();
        int n9 = n5 - n2;
        block0: while (true) {
            int n10 = n9;
            block1: while (n10 <= n5 + n2) {
                int n11 = n6 - n3;
                while (n11 <= n6 + n3) {
                    block8: {
                        n10 = n7 - n2;
                        if (string != null) continue block1;
                        int n12 = n10;
                        while (n12 <= n7 + n2) {
                            block9: {
                                block10: {
                                    o2.a(n9, n11, n12);
                                    i i2 = z2.d(o2);
                                    if (string != null) break block8;
                                    if (string != null) break block9;
                                    if (i2.o() != net.minecraft.ac.c.L) break block10;
                                    float f11 = (n9 - n5) * (n9 - n5) + (n11 - n6) * (n11 - n6) + (n12 - n7) * (n12 - n7);
                                    if (string != null) break block9;
                                    if (f11 < f10) {
                                        f10 = f11;
                                        n8 = new n(o2);
                                    }
                                }
                                ++n12;
                            }
                            if (string == null) continue;
                        }
                        ++n11;
                    }
                    if (string == null) continue;
                }
                ++n9;
                if (string == null) continue block0;
            }
            break;
        }
        return n8;
    }

    public P(D d10, double d11) {
        this.g = d10;
        this.c = d11;
        this.a(1);
    }

    @Override
    public void a() {
        this.g.l().a(this.d, this.e, this.f, this.c);
    }

    protected boolean a() {
        l l2 = net.minecraft.ak.g.a(this.g, 5, 4);
        String string = h.h();
        if (string == null) {
            if (l2 == null) {
                return false;
            }
            this.d = l2.e;
            this.e = l2.d;
            this.f = l2.b;
        }
        return true;
    }
}

