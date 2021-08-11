/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.List;
import java.util.Random;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.aH;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ap.j;
import net.minecraft.ar.aA;
import net.minecraft.u.g;

public class aX
extends aH {
    private /* synthetic */ int h;

    @Override
    protected void a(r r2) {
        super.a(r2);
        r2.b("Steps", this.h);
    }

    @Override
    protected void a(r r2, j j2) {
        super.a(r2, j2);
        this.h = r2.m("Steps");
    }

    @Override
    public boolean a(z z2, Random random, b b10) {
        int n2;
        block5: {
            int n3;
            String[] arrstring = u.b();
            int n4 = this.a(z2, b10);
            if (arrstring != null) {
                if (n4 != 0) {
                    return false;
                }
                n4 = n3 = 0;
            }
            while (n3 < this.h) {
                block6: {
                    this.a(z2, net.minecraft.u.g.ay.d(), 0, 0, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 1, 0, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 2, 0, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 3, 0, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 4, 0, n3, b10);
                    n2 = 1;
                    if (arrstring == null) break block5;
                    for (int i2 = v186704; i2 <= 3; ++i2) {
                        this.a(z2, net.minecraft.u.g.ay.d(), 0, i2, n3, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), 1, i2, n3, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), 2, i2, n3, b10);
                        this.a(z2, net.minecraft.u.g.bf.d(), 3, i2, n3, b10);
                        this.a(z2, net.minecraft.u.g.ay.d(), 4, i2, n3, b10);
                        if (arrstring != null) {
                            if (arrstring != null) continue;
                        }
                        break block6;
                    }
                    this.a(z2, net.minecraft.u.g.ay.d(), 0, 4, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 1, 4, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 2, 4, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 3, 4, n3, b10);
                    this.a(z2, net.minecraft.u.g.ay.d(), 4, 4, n3, b10);
                    ++n3;
                }
                if (arrstring != null) continue;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public aX(int var1_1, Random var2_2, b var3_3, aA var4_4) {
        v0 = u.b();
        super(var1_1);
        var5_5 = v0;
        this.a(var4_4);
        v1 = this;
        v2 = var3_3;
        if (var5_5 == null) ** GOTO lbl14
        v1.e = v2;
        v1 = this;
        if (var4_4 != aA.NORTH && var4_4 != aA.SOUTH) {
            v3 = var3_3.f();
        } else {
            v2 = var3_3;
lbl14:
            // 2 sources

            v3 = v2.a();
        }
        v1.h = v3;
    }

    public aX() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static b a(List<u> list, Random random, int n2, int n3, int n4, aA aA2) {
        block9: {
            int n5;
            u u2;
            String[] arrstring;
            b b10;
            block8: {
                int n6 = 3;
                b10 = b.a(n2, n3, n4, -1, -1, 0, 5, 5, 4, aA2);
                arrstring = u.b();
                u u3 = u2 = u.a(list, b10);
                if (arrstring != null) {
                    if (u3 == null) {
                        return null;
                    }
                    u3 = u2;
                }
                int n7 = u3.a().e;
                if (arrstring == null) break block8;
                if (n7 != b10.e) break block9;
                n7 = n5 = 3;
            }
            while (n5 >= 1) {
                b10 = b.a(n2, n3, n4, -1, -1, 0, 5, 5, n5 - 1, aA2);
                if (arrstring != null) {
                    if (!u2.a().b(b10)) {
                        return b.a(n2, n3, n4, -1, -1, 0, 5, 5, n5, aA2);
                    }
                    --n5;
                }
                if (arrstring != null) continue;
            }
        }
        return null;
    }
}

