/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.at.l;
import net.minecraft.client.D.h;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.b1;
import net.minecraft.client.b.m;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.d;

public class a0
implements aJ {
    final /* synthetic */ b1 a;
    private final /* synthetic */ d d;
    private final /* synthetic */ String b;
    private final /* synthetic */ s c;
    private final /* synthetic */ s e;

    a0(b1 b12, d d10, m m2) {
        this(b12, d10);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        block16: {
            int n9;
            block15: {
                int n10;
                block9: {
                    String[] arrstring;
                    block10: {
                        int n11;
                        block11: {
                            arrstring = q.b();
                            n11 = b1.a((b1)this.a).A == this.d ? 1 : 0;
                            b1.b((b1)this.a).a6.b(this.b, n3 + 90 - b1.c(this.a), n4 + n6 / 2 - b1.b((b1)this.a).a6.p / 2, 0xFFFFFF);
                            this.c.o = n3 + 190;
                            this.c.r = n4;
                            int n12 = this.d.e();
                            if (arrstring != null) {
                                n12 = n12 != this.d.d() ? 1 : 0;
                            }
                            this.c.h = n12;
                            this.c.a(b1.b(this.a), n7, n8, f10);
                            this.e.o = n3 + 105;
                            this.e.r = n4;
                            this.e.m = net.minecraft.client.l.c.a(this.d.e());
                            n10 = 0;
                            n9 = this.d.e();
                            if (arrstring == null) break block10;
                            if (n9 == 0) break block11;
                            d[] arrd = b1.b((b1)this.a).ac.ad;
                            int n13 = arrd.length;
                            int n14 = 0;
                            while (n14 < n13) {
                                block12: {
                                    block13: {
                                        block14: {
                                            d d10 = arrd[n14];
                                            if (arrstring == null) break block9;
                                            if (arrstring == null) break block12;
                                            if (d10 == this.d) break block13;
                                            int n15 = d10.e();
                                            if (arrstring == null) break block14;
                                            if (n15 != this.d.e()) break block13;
                                            n15 = n10 = 1;
                                        }
                                        if (arrstring != null) break;
                                    }
                                    ++n14;
                                }
                                if (arrstring != null) continue;
                            }
                        }
                        n9 = n11;
                    }
                    if (arrstring == null) break block15;
                    if (n9 == 0) break block9;
                    this.e.m = (Object)((Object)l.WHITE) + "> " + (Object)((Object)l.YELLOW) + this.e.m + (Object)((Object)l.WHITE) + " <";
                    if (arrstring != null) break block16;
                }
                n9 = n10;
            }
            if (n9 != 0) {
                this.e.m = (Object)((Object)l.RED) + this.e.m;
            }
        }
        this.e.a(b1.b(this.a), n7, n8, f10);
    }

    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        String[] arrstring = q.b();
        boolean bl2 = this.e.a(b1.b(this.a), n3, n4);
        if (arrstring != null) {
            if (bl2) {
                b1.a((b1)this.a).A = this.d;
                return true;
            }
            bl2 = this.c.a(b1.b(this.a), n3, n4);
        }
        if (arrstring != null) {
            if (bl2) {
                b1.b((b1)this.a).ac.a(this.d, this.d.d());
                net.minecraft.client.l.d.i();
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }

    private a0(b1 b12, d d10) {
        this.a = b12;
        this.d = d10;
        this.b = h.a(d10.f(), new Object[0]);
        this.e = new s(0, 0, 0, 75, 20, h.a(d10.f(), new Object[0]));
        this.c = new s(0, 0, 0, 50, 20, h.a("controls.reset", new Object[0]));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.e.b(n3, n4);
        this.c.b(n3, n4);
    }
}

