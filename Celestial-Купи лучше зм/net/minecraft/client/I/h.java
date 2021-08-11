/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.I;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.minecraft.B.a;
import net.minecraft.B.o;
import net.minecraft.C.m;
import net.minecraft.K.b;
import net.minecraft.N.K;
import net.minecraft.client.I.c;
import net.minecraft.client.I.d;
import net.minecraft.client.I.e;
import net.minecraft.client.I.f;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.client.a.a0;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;
import net.minecraft.d.q;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class h
extends g {
    private /* synthetic */ boolean ab;
    private /* synthetic */ e ae;
    private static final /* synthetic */ Logger ad;
    private static final /* synthetic */ net.minecraft.ar.v aa;
    private final /* synthetic */ a ac;

    static {
        ad = LogManager.getLogger();
        aa = new net.minecraft.ar.v("textures/gui/container/beacon.png");
    }

    @Override
    public void e() {
        b b10;
        block17: {
            h h2;
            block16: {
                f f10;
                b b11;
                block25: {
                    int[] arrn;
                    block24: {
                        f f11;
                        b b12;
                        int n2;
                        int n3;
                        int n4;
                        int n5;
                        int n6;
                        block15: {
                            int n7;
                            int n8;
                            block18: {
                                super.e();
                                n6 = this.ac.c(0);
                                b10 = b.a(this.ac.c(1));
                                arrn = net.minecraft.client.I.v.a();
                                b11 = b.a(this.ac.c(2));
                                h2 = this;
                                if (arrn != null) break block17;
                                if (!h2.ab) break block16;
                                n8 = n6;
                                if (arrn != null) break block18;
                                if (n8 < 0) break block16;
                                this.ab = false;
                                n8 = 100;
                            }
                            n5 = n8;
                            int n9 = 0;
                            block0: while (true) {
                                int n10 = n9;
                                int n11 = 2;
                                block1: while (n10 <= n11) {
                                    n4 = K.p[n9].length;
                                    n3 = n4 * 22 + (n4 - 1) * 2;
                                    n7 = 0;
                                    if (arrn != null) break block15;
                                    for (n2 = v385228; n2 < n4; ++n2) {
                                        block20: {
                                            block19: {
                                                b12 = K.p[n9][n2];
                                                f11 = new f(this, n5++, this.H + 76 + n2 * 24 - n3 / 2, this.B + 22 + n9 * 25, b12, n9);
                                                this.t.add(f11);
                                                if (arrn != null) break block19;
                                                n10 = n9;
                                                n11 = n6;
                                                if (arrn != null) continue block1;
                                                if (n10 < n11) break block20;
                                                f11.h = false;
                                            }
                                            if (arrn == null) continue;
                                        }
                                        if (b12 != b10) continue;
                                        f11.a(true);
                                        if (arrn == null) continue;
                                    }
                                    ++n9;
                                    if (arrn == null) continue block0;
                                }
                                break;
                            }
                            n9 = 3;
                            n4 = K.p[3].length + 1;
                            n3 = n4 * 22 + (n4 - 1) * 2;
                            n7 = n2 = 0;
                        }
                        while (n2 < n4 - 1) {
                            block23: {
                                block22: {
                                    block21: {
                                        b12 = K.p[3][n2];
                                        f11 = new f(this, n5++, this.H + 167 + n2 * 24 - n3 / 2, this.B + 47, b12, 3);
                                        this.t.add(f11);
                                        if (arrn != null) break block16;
                                        if (arrn != null) break block21;
                                        if (3 < n6) break block22;
                                        f11.h = false;
                                    }
                                    if (arrn == null) break block23;
                                }
                                if (b12 == b11) {
                                    f11.a(true);
                                }
                            }
                            ++n2;
                            if (arrn == null) continue;
                        }
                        if (b10 == null) break block16;
                        f10 = new f(this, n5++, this.H + 167 + (n4 - 1) * 24 - n3 / 2, this.B + 47, b10, 3);
                        this.t.add(f10);
                        if (arrn != null) break block24;
                        if (3 < n6) break block25;
                        f10.h = false;
                    }
                    if (arrn == null) break block16;
                }
                if (b10 == b11) {
                    f10.a(true);
                }
            }
            h2 = this;
        }
        h2.ae.h = !this.ac.a(0).G() && b10 != null;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }

    public h(net.minecraft.i.h h2, a a10) {
        super(new o(h2, a10));
        this.ac = a10;
        this.M = 230;
        this.F = 219;
    }

    @Override
    protected void a(s s2) throws IOException {
        block7: {
            block13: {
                int n2;
                block12: {
                    int[] arrn;
                    block11: {
                        s s3;
                        Object object;
                        block10: {
                            int n3;
                            block8: {
                                block9: {
                                    int n4;
                                    block5: {
                                        block6: {
                                            arrn = net.minecraft.client.I.v.a();
                                            int n4 = s2.g;
                                            n4 = -2;
                                            if (arrn != null) break block5;
                                            if (n3 != n4) break block6;
                                            this.m.s.c9.a(new q(this.m.s.cm.b));
                                            this.m.a((L)null);
                                            if (arrn == null) break block7;
                                        }
                                        n3 = s2.g;
                                        if (arrn != null) break block8;
                                        n4 = -1;
                                    }
                                    if (n3 != n4) break block9;
                                    object = "MC|Beacon";
                                    m m2 = new m(Unpooled.buffer());
                                    m2.writeInt(this.ac.c(1));
                                    m2.writeInt(this.ac.c(2));
                                    this.m.ar().a(new net.minecraft.d.h("MC|Beacon", m2));
                                    this.m.s.c9.a(new q(this.m.s.cm.b));
                                    this.m.a((L)null);
                                    if (arrn == null) break block7;
                                }
                                s3 = s2;
                                if (arrn != null) break block10;
                                n3 = s3 instanceof f;
                            }
                            if (n3 == 0) break block7;
                            s3 = s2;
                        }
                        object = (f)s3;
                        int n5 = ((c)object).a();
                        if (arrn == null) {
                            if (n5 != 0) {
                                return;
                            }
                            n5 = n2 = b.a(net.minecraft.client.I.f.a((f)object));
                        }
                        if (arrn != null) break block11;
                        if (net.minecraft.client.I.f.b((f)object) >= 3) break block12;
                        this.ac.b(1, n2);
                    }
                    if (arrn == null) break block13;
                }
                this.ac.b(2, n2);
            }
            this.t.clear();
            this.r();
            this.e();
        }
    }

    static net.minecraft.ar.v a() {
        return aa;
    }

    @Override
    protected void b(int n2, int n3) {
        block3: {
            a0.a();
            int[] arrn = net.minecraft.client.I.v.a();
            this.b(this.v, net.minecraft.client.D.h.a("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
            int[] arrn2 = arrn;
            this.b(this.v, net.minecraft.client.D.h.a("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
            for (s s2 : this.t) {
                block5: {
                    s s3;
                    block4: {
                        if (arrn2 != null) break block3;
                        s3 = s2;
                        if (arrn2 != null) break block4;
                        if (!s3.c()) break block5;
                        s3 = s2;
                    }
                    s3.a(n2 - this.H, n3 - this.B);
                    if (arrn2 == null) break;
                }
                if (arrn2 == null) continue;
            }
            a0.b();
        }
    }

    @Override
    public void r() {
        super.r();
        this.ae = new e(this, -1, this.H + 164, this.B + 107);
        this.t.add(this.ae);
        this.t.add(new d(this, -2, this.H + 190, this.B + 107));
        this.ab = true;
        this.ae.h = false;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(aa);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.F);
        this.x.g = 100.0f;
        this.x.a(new net.minecraft.w.d(net.minecraft.u.h.aO), n4 + 42, n5 + 109);
        this.x.a(new net.minecraft.w.d(net.minecraft.u.h.ag), n4 + 42 + 22, n5 + 109);
        this.x.a(new net.minecraft.w.d(net.minecraft.u.h.I), n4 + 42 + 44, n5 + 109);
        this.x.a(new net.minecraft.w.d(net.minecraft.u.h.ad), n4 + 42 + 66, n5 + 109);
        this.x.g = 0.0f;
    }
}

