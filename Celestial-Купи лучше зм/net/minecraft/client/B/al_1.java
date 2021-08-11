/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.ah.e;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.client.E.l;
import net.minecraft.client.b.B;
import net.minecraft.client.b.C;
import net.minecraft.client.b.L;
import net.minecraft.client.b.P;
import net.minecraft.client.b.S;
import net.minecraft.client.b.aC;
import net.minecraft.client.b.aH;
import net.minecraft.client.b.aT;
import net.minecraft.client.b.aW;
import net.minecraft.client.b.an;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.au;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.b.z;
import net.minecraft.client.l.c;
import net.minecraft.client.l.f;

public class al
extends L {
    private final /* synthetic */ c B;
    private /* synthetic */ s y;
    private /* synthetic */ z D;
    protected /* synthetic */ String C;
    private final /* synthetic */ L z;
    private static final /* synthetic */ f[] A;

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, this.C, h / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    @Override
    public void a(boolean bl2, int n2) {
        block3: {
            l l2;
            block4: {
                int n3;
                String[] arrstring;
                block2: {
                    String[] arrstring2 = q.b();
                    this.m.a(this);
                    arrstring = arrstring2;
                    n3 = n2;
                    if (arrstring == null) break block2;
                    if (n3 != 109) break block3;
                    n3 = bl2 ? 1 : 0;
                }
                if (n3 == 0) break block3;
                l2 = this.m.e;
                if (arrstring == null) break block4;
                if (l2 == null) break block3;
                l2 = this.m.e;
            }
            l2.b().d(true);
            this.D.a(true);
            this.D.h = false;
            this.y.h = false;
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block25: {
            int n2;
            int n3;
            String[] arrstring;
            block26: {
                block28: {
                    block27: {
                        block24: {
                            arrstring = q.b();
                            n3 = s2.h;
                            if (arrstring == null) break block24;
                            if (n3 == 0) break block25;
                            n3 = s2.g;
                        }
                        n2 = 100;
                        if (arrstring == null) break block26;
                        if (n3 >= n2) break block27;
                        n3 = s2 instanceof B;
                        if (arrstring == null) break block28;
                        if (n3 != 0) {
                            f f10 = ((B)s2).b();
                            this.B.b(f10, 1);
                            s2.m = this.B.c(net.minecraft.client.l.f.a(s2.g));
                        }
                    }
                    n3 = s2.g;
                }
                n2 = 108;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.e.b().a(net.minecraft.ah.e.a(this.m.e.g().a() + 1));
                    this.y.m = this.a(this.m.e.g());
                }
                n3 = s2.g;
                n2 = 109;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.a(new ao(this, new h("difficulty.lock.title", new Object[0]).a(), new h("difficulty.lock.question", new h(this.m.e.b().o().b(), new Object[0])).a(), 109));
                }
                n3 = s2.g;
                n2 = 110;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new S(this));
                }
                n3 = s2.g;
                n2 = 101;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new aW(this, this.B));
                }
                n3 = s2.g;
                n2 = 100;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new P(this, this.B));
                }
                n3 = s2.g;
                n2 = 102;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new au(this, this.B, this.m.aF()));
                }
                n3 = s2.g;
                n2 = 103;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new aT(this, this.B));
                }
                n3 = s2.g;
                n2 = 104;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new an(this, this.B));
                }
                n3 = s2.g;
                n2 = 200;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(this.z);
                }
                n3 = s2.g;
                n2 = 105;
            }
            if (arrstring != null) {
                if (n3 == n2) {
                    this.m.ac.e();
                    this.m.a(new aH(this));
                }
                n3 = s2.g;
                n2 = 106;
            }
            if (n3 != n2) break block25;
            this.m.ac.e();
            this.m.a(new aC(this, this.B));
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        String[] arrstring = q.b();
        if (arrstring != null) {
            if (n2 == 1) {
                this.m.ac.e();
            }
            super.a(c10, n2);
        }
    }

    @Override
    public void r() {
        block9: {
            al al2;
            boolean bl2;
            int n2;
            block13: {
                block14: {
                    block15: {
                        al al3;
                        block16: {
                            this.C = net.minecraft.client.D.h.a("options.title", new Object[0]);
                            String[] arrstring = q.b();
                            n2 = 0;
                            for (f f10 : A) {
                                block12: {
                                    block11: {
                                        block10: {
                                            bl2 = f10.f();
                                            if (arrstring == null) break block9;
                                            if (arrstring == null) break block10;
                                            if (!bl2) break block11;
                                            this.t.add(new C(f10.e(), h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), f10));
                                        }
                                        if (arrstring != null) break block12;
                                    }
                                    B b10 = new B(f10.e(), h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), f10, this.B.c(f10));
                                    this.t.add(b10);
                                }
                                ++n2;
                                if (arrstring != null) continue;
                            }
                            al2 = this;
                            if (arrstring == null) break block13;
                            if (al2.m.e == null) break block14;
                            e e10 = this.m.e.g();
                            this.y = new s(108, h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), 150, 20, this.a(e10));
                            this.t.add(this.y);
                            al3 = this;
                            if (arrstring == null) break block15;
                            if (!al3.m.y()) break block16;
                            al3 = this;
                            if (arrstring == null) break block15;
                            if (al3.m.e.b().a()) break block16;
                            this.y.a(this.y.a() - 20);
                            this.D = new z(109, this.y.o + this.y.a(), this.y.r);
                            this.t.add(this.D);
                            this.D.a(this.m.e.b().q());
                            boolean bl3 = this.D.a();
                            if (arrstring != null) {
                                bl3 = !bl3;
                            }
                            this.D.h = bl3;
                            boolean bl4 = this.D.a();
                            if (arrstring != null) {
                                bl4 = this.y.h = !bl4;
                            }
                            if (arrstring != null) break block9;
                        }
                        al3 = this;
                    }
                    al3.y.h = false;
                    break block9;
                }
                al2 = this;
            }
            bl2 = al2.t.add(new B(net.minecraft.client.l.f.REALMS_NOTIFICATIONS.e(), h / 2 - 155 + n2 % 2 * 160, w / 6 - 12 + 24 * (n2 >> 1), net.minecraft.client.l.f.REALMS_NOTIFICATIONS, this.B.c(net.minecraft.client.l.f.REALMS_NOTIFICATIONS)));
        }
        this.t.add(new s(110, h / 2 - 155, w / 6 + 48 - 6, 150, 20, net.minecraft.client.D.h.a("options.skinCustomisation", new Object[0])));
        this.t.add(new s(106, h / 2 + 5, w / 6 + 48 - 6, 150, 20, net.minecraft.client.D.h.a("options.sounds", new Object[0])));
        this.t.add(new s(101, h / 2 - 155, w / 6 + 72 - 6, 150, 20, net.minecraft.client.D.h.a("options.video", new Object[0])));
        this.t.add(new s(100, h / 2 + 5, w / 6 + 72 - 6, 150, 20, net.minecraft.client.D.h.a("options.controls", new Object[0])));
        this.t.add(new s(102, h / 2 - 155, w / 6 + 96 - 6, 150, 20, net.minecraft.client.D.h.a("options.language", new Object[0])));
        this.t.add(new s(103, h / 2 + 5, w / 6 + 96 - 6, 150, 20, net.minecraft.client.D.h.a("options.chat.title", new Object[0])));
        this.t.add(new s(105, h / 2 - 155, w / 6 + 120 - 6, 150, 20, net.minecraft.client.D.h.a("options.resourcepack", new Object[0])));
        this.t.add(new s(104, h / 2 + 5, w / 6 + 120 - 6, 150, 20, net.minecraft.client.D.h.a("options.snooper.view", new Object[0])));
        this.t.add(new s(200, h / 2 - 100, w / 6 + 168, net.minecraft.client.D.h.a("gui.done", new Object[0])));
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public String a(e e10) {
        g g10 = new g("");
        g10.a(new h("options.difficulty", new Object[0]));
        g10.a(": ");
        g10.a(new h(e10.b(), new Object[0]));
        return g10.a();
    }

    static {
        A = new f[]{net.minecraft.client.l.f.FOV};
    }

    public al(L l2, c c10) {
        this.C = "Options";
        this.z = l2;
        this.B = c10;
    }
}

