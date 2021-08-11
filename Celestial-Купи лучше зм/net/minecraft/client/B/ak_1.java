/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.ArrayList;
import net.minecraft.B.w;
import net.minecraft.C.m;
import net.minecraft.U.e;
import net.minecraft.ah.z;
import net.minecraft.at.k;
import net.minecraft.client.I.g;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.A;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.i.h;
import net.minecraft.w.d;
import net.minecraft.y.a;
import net.minecraft.y.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ak
extends g {
    private /* synthetic */ A ac;
    private final /* synthetic */ e af;
    private /* synthetic */ A ae;
    private /* synthetic */ int ab;
    private static final /* synthetic */ Logger ad;
    private static final /* synthetic */ net.minecraft.ar.v aa;
    private final /* synthetic */ k ag;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(s s2) throws IOException {
        Object object;
        int n2;
        block15: {
            A a10;
            s s3;
            String[] arrstring;
            block11: {
                block12: {
                    block13: {
                        int n3;
                        block14: {
                            n2 = 0;
                            arrstring = q.b();
                            s3 = s2;
                            a10 = this.ac;
                            if (arrstring == null) break block11;
                            if (s3 != a10) break block12;
                            ++this.ab;
                            object = this.af.a(this.m.s);
                            if (arrstring == null) break block13;
                            if (object == null) break block14;
                            n3 = this.ab;
                            if (arrstring == null) break block13;
                            if (n3 >= ((ArrayList)object).size()) {
                                this.ab = ((ArrayList)object).size() - 1;
                            }
                        }
                        n3 = n2 = 1;
                    }
                    if (arrstring != null) break block15;
                }
                s3 = s2;
                a10 = this.ae;
            }
            if (s3 == a10) {
                int n4 = --this.ab;
                if (arrstring != null) {
                    if (n4 < 0) {
                        this.ab = 0;
                    }
                    n4 = n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            ((w)this.X).a(this.ab);
            object = new m(Unpooled.buffer());
            ((m)((Object)object)).writeInt(this.ab);
            this.m.ar().a(new net.minecraft.d.h("MC|TrSel", (m)((Object)object)));
        }
    }

    @Override
    public void r() {
        super.r();
        int n2 = (h - this.M) / 2;
        int n3 = (w - this.F) / 2;
        this.ac = this.b(new A(1, n2 + 120 + 27, n3 + 24 - 1, true));
        this.ae = this.b(new A(2, n2 + 36 - 19, n3 + 24 - 1, false));
        this.ac.h = false;
        this.ae.h = false;
    }

    static {
        ad = LogManager.getLogger();
        aa = new net.minecraft.ar.v("textures/gui/container/villager.png");
    }

    static net.minecraft.ar.v b() {
        return aa;
    }

    @Override
    protected void b(int n2, int n3) {
        String string = this.ag.f();
        this.v.b(string, this.M / 2 - this.v.e(string) / 2, 6.0f, 0x404040);
        this.v.b(net.minecraft.client.D.h.a("container.inventory", new Object[0]), 8.0f, this.F - 96 + 2, 0x404040);
    }

    public e a() {
        return this.af;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block5: {
            block6: {
                block10: {
                    ak ak2;
                    block16: {
                        block17: {
                            boolean bl2;
                            String[] arrstring;
                            block15: {
                                block13: {
                                    b b10;
                                    block14: {
                                        d d10;
                                        block11: {
                                            block12: {
                                                d d11;
                                                block8: {
                                                    block9: {
                                                        int n4;
                                                        a a10;
                                                        block7: {
                                                            this.n();
                                                            String[] arrstring2 = q.b();
                                                            super.a(n2, n3, f10);
                                                            a10 = this.af.a(this.m.s);
                                                            arrstring = arrstring2;
                                                            if (arrstring == null) break block5;
                                                            if (a10 == null) break block6;
                                                            n4 = a10.isEmpty();
                                                            if (arrstring == null) break block7;
                                                            if (n4 != 0) break block6;
                                                            n4 = (h - this.M) / 2;
                                                        }
                                                        int n5 = n4;
                                                        int n6 = (w - this.F) / 2;
                                                        int n7 = this.ab;
                                                        b10 = (b)a10.get(n7);
                                                        d d12 = b10.k();
                                                        d11 = b10.d();
                                                        d10 = b10.l();
                                                        net.minecraft.client.a.v.M();
                                                        a0.b();
                                                        net.minecraft.client.a.v.y();
                                                        net.minecraft.client.a.v.q();
                                                        net.minecraft.client.a.v.r();
                                                        net.minecraft.client.a.v.j();
                                                        this.x.g = 100.0f;
                                                        this.x.a(d12, n5 + 36, n6 + 24);
                                                        this.x.a(this.v, d12, n5 + 36, n6 + 24);
                                                        bl2 = d11.G();
                                                        if (arrstring != null) {
                                                            if (!bl2) {
                                                                this.x.a(d11, n5 + 62, n6 + 24);
                                                                this.x.a(this.v, d11, n5 + 62, n6 + 24);
                                                            }
                                                            this.x.a(d10, n5 + 120, n6 + 24);
                                                            this.x.a(this.v, d10, n5 + 120, n6 + 24);
                                                            this.x.g = 0.0f;
                                                            net.minecraft.client.a.v.y();
                                                            bl2 = this.a(36, 24, 16, 16, n2, n3);
                                                        }
                                                        if (arrstring == null) break block8;
                                                        if (!bl2) break block9;
                                                        bl2 = d12.G();
                                                        if (arrstring == null) break block8;
                                                        if (bl2) break block9;
                                                        this.a(d12, n2, n3);
                                                        if (arrstring != null) break block10;
                                                    }
                                                    bl2 = d11.G();
                                                }
                                                if (arrstring == null) break block11;
                                                if (bl2) break block12;
                                                bl2 = this.a(62, 24, 16, 16, n2, n3);
                                                if (arrstring == null) break block11;
                                                if (!bl2) break block12;
                                                bl2 = d11.G();
                                                if (arrstring == null) break block11;
                                                if (bl2) break block12;
                                                this.a(d11, n2, n3);
                                                if (arrstring != null) break block10;
                                            }
                                            bl2 = d10.G();
                                        }
                                        if (arrstring == null) break block13;
                                        if (bl2) break block14;
                                        bl2 = this.a(120, 24, 16, 16, n2, n3);
                                        if (arrstring == null) break block13;
                                        if (!bl2) break block14;
                                        bl2 = d10.G();
                                        if (arrstring == null) break block13;
                                        if (bl2) break block14;
                                        this.a(d10, n2, n3);
                                        if (arrstring != null) break block10;
                                    }
                                    bl2 = b10.j();
                                }
                                if (arrstring == null) break block15;
                                if (!bl2) break block10;
                                ak2 = this;
                                if (arrstring == null) break block16;
                                bl2 = ak2.a(83, 21, 28, 21, n2, n3);
                            }
                            if (bl2) break block17;
                            ak2 = this;
                            if (arrstring == null) break block16;
                            if (!ak2.a(83, 51, 28, 21, n2, n3)) break block10;
                        }
                        ak2 = this;
                    }
                    ak2.a(net.minecraft.client.D.h.a("merchant.deprecated", new Object[0]), n2, n3);
                }
                net.minecraft.client.a.v.B();
                net.minecraft.client.a.v.j();
                net.minecraft.client.a.v.t();
                a0.c();
            }
            this.c(n2, n3);
        }
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        block5: {
            block10: {
                int n4;
                a a10;
                String[] arrstring;
                block9: {
                    block8: {
                        int n5;
                        block7: {
                            int n6;
                            block6: {
                                a a11;
                                block4: {
                                    String[] arrstring2 = q.b();
                                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                    arrstring = arrstring2;
                                    this.m.aN().b(aa);
                                    int n7 = (h - this.M) / 2;
                                    int n8 = (w - this.F) / 2;
                                    this.a(n7, n8, 0, 0, this.M, this.F);
                                    a11 = a10 = this.af.a(this.m.s);
                                    if (arrstring == null) break block4;
                                    if (a11 == null) break block5;
                                    a11 = a10;
                                }
                                n6 = a11.isEmpty();
                                if (arrstring == null) break block6;
                                if (n6 != 0) break block5;
                                n6 = this.ab;
                            }
                            n5 = n4 = n6;
                            if (arrstring == null) break block7;
                            if (n5 < 0) break block8;
                            n5 = n4;
                        }
                        if (n5 < a10.size()) break block9;
                    }
                    return;
                }
                b b10 = (b)a10.get(n4);
                if (arrstring == null) break block10;
                if (!b10.j()) break block5;
                this.m.aN().b(aa);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                net.minecraft.client.a.v.y();
                this.a(this.H + 83, this.B + 21, 212, 0, 28, 21);
            }
            this.a(this.H + 83, this.B + 51, 212, 0, 28, 21);
        }
    }

    public ak(h h2, e e10, z z2) {
        super(new w(h2, e10, z2));
        this.af = e10;
        this.ag = e10.d();
    }

    @Override
    public void e() {
        super.e();
        a a10 = this.af.a(this.m.s);
        String[] arrstring = q.b();
        if (a10 != null) {
            int n2 = this.ab;
            if (arrstring != null) {
                n2 = n2 < a10.size() - 1 ? 1 : 0;
            }
            this.ac.h = n2;
            int n3 = this.ab;
            if (arrstring != null) {
                n3 = n3 > 0 ? 1 : 0;
            }
            this.ae.h = n3;
        }
    }
}

