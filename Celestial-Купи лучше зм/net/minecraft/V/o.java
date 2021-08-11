/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.v;

import javax.annotation.Nullable;
import net.minecraft.e.h;
import net.minecraft.h.d;
import net.minecraft.k.l;
import net.minecraft.k.n;
import net.minecraft.p.z;
import net.minecraft.v.b;
import net.minecraft.v.c;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class o
extends c {
    private /* synthetic */ h a;
    private /* synthetic */ boolean e;
    private /* synthetic */ l d;

    @Override
    public void h() {
        block6: {
            o o2;
            block4: {
                block5: {
                    int[] arrn = net.minecraft.v.c.b();
                    o2 = this;
                    if (arrn != null) break block4;
                    if (o2.e) break block5;
                    o2 = this;
                    if (arrn != null) break block4;
                    if (o2.a == null) break block5;
                    n n2 = this.c.aG.c(z.d);
                    double d10 = this.c.c(n2);
                    if (d10 > 100.0) {
                        this.c.d().b(b.e);
                    }
                    if (arrn == null) break block6;
                }
                this.e = false;
                o2 = this;
            }
            o2.b();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void c() {
        this.e = true;
        this.a = null;
        this.d = null;
    }

    public b<o> b() {
        return b.k;
    }

    @Override
    @Nullable
    public l e() {
        return this.d;
    }

    private void b() {
        block10: {
            h h2;
            block9: {
                int[] arrn;
                block7: {
                    int n2;
                    int n3;
                    block8: {
                        int n4;
                        block6: {
                            block4: {
                                block5: {
                                    n3 = this.c.a();
                                    l l2 = this.c.d(1.0f);
                                    n2 = this.c.a(-l2.e * 40.0, 105.0, -l2.b * 40.0);
                                    arrn = net.minecraft.v.c.b();
                                    if (arrn != null) break block4;
                                    if (this.c.c() == null) break block5;
                                    n4 = this.c.c().h();
                                    if (arrn != null) break block6;
                                    if (n4 <= 0) break block5;
                                    n2 %= 12;
                                    if (arrn != null) break block7;
                                    if (n2 >= 0) break block8;
                                    n2 += 12;
                                    if (arrn == null) break block8;
                                }
                                n2 -= 12;
                                n2 &= 7;
                            }
                            n4 = n2 + 12;
                        }
                        n2 = n4;
                    }
                    this.a = this.c.a(n3, n2, null);
                }
                h2 = this.a;
                if (arrn != null) break block9;
                if (h2 == null) break block10;
                h2 = this.a;
            }
            h2.c();
            this.e();
        }
    }

    private void e() {
        double d10;
        int[] arrn = net.minecraft.v.c.b();
        l l2 = this.a.i();
        this.a.c();
        int[] arrn2 = arrn;
        block0: while (true) {
            d10 = l2.d + (double)(this.c.f().nextFloat() * 20.0f);
            do {
                if (!(d10 >= l2.d)) continue block0;
            } while (arrn2 != null);
            break;
        }
        this.d = new l(l2.e, d10, l2.b);
    }

    public o(d d10) {
        super(d10);
    }
}

