/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.D;
import net.minecraft.ao.aP;
import net.minecraft.ao.aQ;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class G
extends D {
    private final /* synthetic */ List<b> h;

    @Override
    public boolean a(z z2, Random random, b b10) {
        block4: {
            String[] arrstring = u.b();
            G g10 = this;
            z z3 = z2;
            b b11 = b10;
            if (arrstring != null) {
                if (g10.a(z3, b11)) {
                    return false;
                }
                this.a(z2, b10, this.e.c, this.e.e, this.e.f, this.e.a, this.e.e, this.e.d, net.minecraft.u.g.bv.d(), net.minecraft.u.g.bf.d(), true);
                g10 = this;
                z3 = z2;
                b11 = b10;
            }
            g10.a(z3, b11, this.e.c, this.e.e + 1, this.e.f, this.e.a, Math.min(this.e.e + 3, this.e.b), this.e.d, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
            for (b b12 : this.h) {
                this.a(z2, b10, b12.c, b12.b - 2, b12.f, b12.a, b12.b, b12.d, net.minecraft.u.g.bf.d(), net.minecraft.u.g.bf.d(), false);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block4;
            }
            this.a(z2, b10, this.e.c, this.e.e + 4, this.e.f, this.e.a, this.e.b, this.e.d, net.minecraft.u.g.bf.d(), false);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(u var1_1, List<u> var2_2, Random var3_3) {
        var5_4 = this.d();
        var6_5 = this.e.c() - 3 - 1;
        var4_6 = u.b();
        v0 = var6_5;
        if (var4_6 != null) {
            if (v0 <= 0) {
                var6_5 = 1;
            }
            v0 = var7_7 = 0;
        }
        while (var7_7 < this.e.f()) {
            v1 = (var7_7 += var3_3.nextInt(this.e.f())) + 3;
            v2 = this.e.f();
            if (var4_6 != null) {
                if (v1 > v2 && var4_6 != null) break;
                var8_8 = aP.a(var1_1, var2_2, var3_3, this.e.c + var7_7, this.e.e + var3_3.nextInt(var6_5) + 1, this.e.f - 1, aA.NORTH, var5_4);
                if (var4_6 != null) {
                    if (var8_8 != null) {
                        var9_9 = var8_8.a();
                        this.h.add(new b(var9_9.c, var9_9.e, this.e.f, var9_9.a, var9_9.b, this.e.f + 1));
                    }
                    var7_7 += 4;
                }
                if (var4_6 != null) continue;
            }
            ** GOTO lbl27
        }
        var7_7 = 0;
        do {
            v1 = var7_7;
            v2 = this.e.f();
lbl27:
            // 2 sources

            if (v1 >= v2) break;
            v3 = (var7_7 += var3_3.nextInt(this.e.f())) + 3;
            v4 = this.e.f();
            if (var4_6 == null) ** GOTO lbl44
            if (v3 > v4 && var4_6 != null) break;
            var8_8 = aP.a(var1_1, var2_2, var3_3, this.e.c + var7_7, this.e.e + var3_3.nextInt(var6_5) + 1, this.e.d + 1, aA.SOUTH, var5_4);
            if (var4_6 == null) continue;
            if (var8_8 != null) {
                var9_9 = var8_8.a();
                this.h.add(new b(var9_9.c, var9_9.e, this.e.d - 1, var9_9.a, var9_9.b, this.e.d));
            }
            var7_7 += 4;
        } while (var4_6 != null);
        var7_7 = 0;
        do {
            v3 = var7_7;
            v4 = this.e.a();
lbl44:
            // 2 sources

            if (v3 >= v4) break;
            v5 = (var7_7 += var3_3.nextInt(this.e.a())) + 3;
            v6 = this.e.a();
            if (var4_6 == null) ** GOTO lbl61
            if (v5 > v6 && var4_6 != null) break;
            var8_8 = aP.a(var1_1, var2_2, var3_3, this.e.c - 1, this.e.e + var3_3.nextInt(var6_5) + 1, this.e.f + var7_7, aA.WEST, var5_4);
            if (var4_6 == null) continue;
            if (var8_8 != null) {
                var9_9 = var8_8.a();
                this.h.add(new b(this.e.c, var9_9.e, var9_9.f, this.e.c + 1, var9_9.b, var9_9.d));
            }
            var7_7 += 4;
        } while (var4_6 != null);
        var7_7 = 0;
        do {
            v5 = var7_7;
            v6 = this.e.a();
lbl61:
            // 2 sources

            if (v5 >= v6) return;
            if ((var7_7 += var3_3.nextInt(this.e.a())) + 3 > this.e.a()) {
                if (var4_6 != null) return;
            }
            var8_8 = aP.a(var1_1, var2_2, var3_3, this.e.a + 1, this.e.e + var3_3.nextInt(var6_5) + 1, this.e.f + var7_7, aA.EAST, var5_4);
            if (var4_6 == null) continue;
            if (var8_8 != null) {
                var9_9 = var8_8.a();
                this.h.add(new b(this.e.a - 1, var9_9.e, var9_9.f, this.e.a, var9_9.b, var9_9.d));
            }
            var7_7 += 4;
        } while (var4_6 != null);
    }

    public G() {
        this.h = Lists.newLinkedList();
    }

    @Override
    protected void a(r r2) {
        block2: {
            super.a(r2);
            net.minecraft.P.u u2 = new net.minecraft.P.u();
            Iterator<b> iterator = this.h.iterator();
            String[] arrstring = u.b();
            while (iterator.hasNext()) {
                b b10 = iterator.next();
                u2.a(b10.e());
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            r2.a("Entrances", u2);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        net.minecraft.P.u u2 = r2.c("Entrances", 11);
        String[] arrstring = u.b();
        for (int i2 = 0; i2 < u2.b(); ++i2) {
            this.h.add(new b(u2.e(i2)));
            if (arrstring != null) continue;
        }
    }

    public G(int n2, Random random, int n3, int n4, aQ aQ2) {
        super(n2, aQ2);
        this.h = Lists.newLinkedList();
        this.g = aQ2;
        this.e = new b(n3, 50, n4, n3 + 7 + random.nextInt(6), 54 + random.nextInt(6), n4 + 7 + random.nextInt(6));
    }

    @Override
    public void a(int n2, int n3, int n4) {
        String[] arrstring = u.b();
        super.a(n2, n3, n4);
        String[] arrstring2 = arrstring;
        for (b b10 : this.h) {
            b10.a(n2, n3, n4);
            if (arrstring2 != null) continue;
        }
    }
}

