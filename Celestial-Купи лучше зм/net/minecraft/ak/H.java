/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.U.D;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.y.d;

public class H
extends h {
    private /* synthetic */ int f;
    private /* synthetic */ d c;
    private final /* synthetic */ D d;
    private /* synthetic */ int e;

    public H(D d10) {
        this.e = -1;
        this.f = -1;
        this.d = d10;
        this.a(1);
    }

    @Override
    public boolean e() {
        String string = h.h();
        boolean bl2 = this.d.l().o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public void a() {
        block4: {
            double d10;
            int n2;
            int n3;
            int n4;
            block5: {
                this.e = -1;
                n n5 = this.c.g();
                String string = h.h();
                n4 = n5.e();
                n3 = n5.b();
                n2 = n5.a();
                double d11 = this.d.b(n5) - 256.0;
                d10 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                if (string != null) break block4;
                if (d10 <= 0) break block5;
                l l2 = g.b(this.d, 14, 3, new l((double)n4 + 0.5, n3, (double)n2 + 0.5));
                if (l2 != null) {
                    this.d.l().a(l2.e, l2.d, l2.b, 1.0);
                }
                if (string == null) break block4;
            }
            d10 = (double)this.d.l().a((double)n4 + 0.5, n3, (double)n2 + 0.5, 1.0);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.e = this.c.g().e();
        this.f = this.c.g().a();
        this.c = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        block9: {
            var2_1 = new n(this.d);
            var1_2 = h.h();
            v0 = this.d.aG.R();
            if (var1_2 == null) {
                if (v0) {
                    v0 = this.d.aG.J();
                    if (var1_2 != null) return v0;
                    if (v0 == false) return false;
                    v0 = this.d.aG.c(var2_1).p();
                    if (var1_2 != null) return v0;
                    if (v0 != false) return false;
                }
                v0 = this.d.aG.D.h();
            }
            if (var1_2 != null) return v0;
            if (v0 == false) return false;
            v1 = this.d.f().nextInt(50);
            if (var1_2 != null) break block9;
            if (v1 != 0) {
                return false;
            }
            v2 = this;
            if (var1_2 != null) ** GOTO lbl30
            v1 = v2.e;
        }
        if (v1 != -1) {
            v3 = this.d;
            if (var1_2 == null) {
                if (v3.a((double)this.e, this.d.aF, (double)this.f) < 4.0) {
                    return false;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v2 = this;
lbl30:
            // 2 sources

            v3 = v2.d;
        }
        var3_3 = v3.aG.n().a(var2_1, 14);
        if (var1_2 == null) {
            if (var3_3 == null) {
                return false;
            }
            this.c = var3_3.b(var2_1);
        }
        if (this.c == null) return false;
        return true;
    }
}

