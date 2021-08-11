/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.B;
import net.minecraft.client.b.C;
import net.minecraft.client.b.L;
import net.minecraft.client.b.b1;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.client.l.d;
import net.minecraft.client.l.f;

public class P
extends L {
    private final /* synthetic */ L C;
    private /* synthetic */ s D;
    private final /* synthetic */ c F;
    private /* synthetic */ b1 E;
    public /* synthetic */ d A;
    protected /* synthetic */ String B;
    public /* synthetic */ long y;
    private static final /* synthetic */ f[] z;

    @Override
    public void k() throws IOException {
        super.k();
        this.E.f();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static {
        z = new f[]{net.minecraft.client.l.f.INVERT_MOUSE, net.minecraft.client.l.f.SENSITIVITY, net.minecraft.client.l.f.TOUCHSCREEN, net.minecraft.client.l.f.AUTO_JUMP};
    }

    @Override
    public void r() {
        this.E = new b1(this, this.m);
        this.t.add(new s(200, h / 2 - 155 + 160, w - 29, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.D = this.b(new s(201, h / 2 - 155, w - 29, 150, 20, net.minecraft.client.D.h.a("controls.resetAll", new Object[0])));
        this.B = net.minecraft.client.D.h.a("controls.title", new Object[0]);
        int n2 = 0;
        f[] arrf = z;
        int n3 = arrf.length;
        String[] arrstring = q.b();
        for (int i2 = 0; i2 < n3; ++i2) {
            block3: {
                boolean bl2;
                f f10;
                block4: {
                    f10 = arrf[i2];
                    bl2 = f10.f();
                    if (arrstring == null) break block3;
                    if (!bl2) break block4;
                    this.t.add(new C(f10.e(), h / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), f10));
                    if (arrstring != null) break block3;
                }
                bl2 = this.t.add(new B(f10.e(), h / 2 - 155 + n2 % 2 * 160, 18 + 24 * (n2 >> 1), f10, this.F.c(f10)));
            }
            ++n2;
            if (arrstring != null) continue;
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block9: {
            block13: {
                s s3;
                int n2;
                block12: {
                    int n3;
                    String[] arrstring;
                    block10: {
                        block11: {
                            block6: {
                                block7: {
                                    block8: {
                                        arrstring = q.b();
                                        n2 = s2.g;
                                        n3 = 200;
                                        if (arrstring == null) break block7;
                                        if (n2 != n3) break block8;
                                        this.m.a(this.C);
                                        if (arrstring != null) break block9;
                                    }
                                    n2 = s2.g;
                                    n3 = 201;
                                }
                                if (arrstring == null) break block10;
                                if (n2 != n3) break block11;
                                for (d d10 : this.m.ac.ad) {
                                    d10.a(d10.d());
                                    if (arrstring != null) {
                                        if (arrstring != null) continue;
                                    }
                                    break block6;
                                }
                                net.minecraft.client.l.d.i();
                            }
                            if (arrstring != null) break block9;
                        }
                        n2 = s2.g;
                        if (arrstring == null) break block12;
                        n3 = 100;
                    }
                    if (n2 >= n3) break block9;
                    s3 = s2;
                    if (arrstring == null) break block13;
                    n2 = s3 instanceof B;
                }
                if (n2 == 0) break block9;
                this.F.b(((B)s2).b(), 1);
                s3 = s2;
            }
            s3.m = this.F.c(net.minecraft.client.l.f.a(s2.g));
        }
    }

    public P(L l2, c c10) {
        this.B = "Controls";
        this.C = l2;
        this.F = c10;
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        block5: {
            P p2;
            block4: {
                block3: {
                    int n5;
                    block2: {
                        String[] arrstring = q.b();
                        n5 = n4;
                        if (arrstring == null) break block2;
                        if (n5 != 0) break block3;
                        p2 = this;
                        if (arrstring == null) break block4;
                        n5 = p2.E.a(n2, n3, n4) ? 1 : 0;
                    }
                    if (n5 != 0) break block5;
                }
                p2 = this;
            }
            super.b(n2, n3, n4);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block14: {
            P p2;
            block7: {
                block8: {
                    String[] arrstring;
                    block11: {
                        int n3;
                        block12: {
                            block13: {
                                block9: {
                                    block10: {
                                        arrstring = q.b();
                                        p2 = this;
                                        if (arrstring == null) break block7;
                                        if (p2.A == null) break block8;
                                        n3 = n2;
                                        if (arrstring == null) break block9;
                                        if (n3 != 1) break block10;
                                        this.F.a(this.A, 0);
                                        if (arrstring != null) break block11;
                                    }
                                    n3 = n2;
                                }
                                if (arrstring == null) break block12;
                                if (n3 == 0) break block13;
                                this.F.a(this.A, n2);
                                if (arrstring != null) break block11;
                            }
                            n3 = c10;
                        }
                        if (n3 > 0) {
                            this.F.a(this.A, c10 + 256);
                        }
                    }
                    this.A = null;
                    this.y = Q.aj();
                    net.minecraft.client.l.d.i();
                    if (arrstring != null) break block14;
                }
                p2 = this;
            }
            super.a(c10, n2);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block4: {
            this.n();
            this.E.b(n2, n3, f10);
            this.b(this.v, this.B, h / 2, 8, 0xFFFFFF);
            boolean bl2 = false;
            String[] arrstring = q.b();
            d[] arrd = this.F.ad;
            int n4 = arrd.length;
            int n5 = 0;
            while (n5 < n4) {
                d d10 = arrd[n5];
                if (arrstring != null) {
                    if (arrstring != null) {
                        if (d10.e() != d10.d()) {
                            bl2 = true;
                            if (arrstring != null) break;
                        }
                        ++n5;
                    }
                    if (arrstring != null) continue;
                }
                break block4;
            }
            this.D.h = bl2;
            super.a(n2, n3, f10);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block4: {
            P p2;
            block7: {
                block6: {
                    int n5;
                    block5: {
                        String[] arrstring;
                        block3: {
                            block2: {
                                arrstring = q.b();
                                P p3 = this;
                                if (arrstring == null) break block2;
                                if (p3.A == null) break block3;
                                this.F.a(this.A, -100 + n4);
                                p3 = this;
                            }
                            p3.A = null;
                            net.minecraft.client.l.d.i();
                            if (arrstring != null) break block4;
                        }
                        n5 = n4;
                        if (arrstring == null) break block5;
                        if (n5 != 0) break block6;
                        p2 = this;
                        if (arrstring == null) break block7;
                        n5 = p2.E.b(n2, n3, n4) ? 1 : 0;
                    }
                    if (n5 != 0) break block4;
                }
                p2 = this;
            }
            super.a(n2, n3, n4);
        }
    }
}

