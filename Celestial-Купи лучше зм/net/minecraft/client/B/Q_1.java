/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.aA.p;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.R;
import net.minecraft.client.b.X;
import net.minecraft.client.b.ax;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class Q
extends L {
    private final /* synthetic */ R A;
    private /* synthetic */ s F;
    private /* synthetic */ s C;
    private /* synthetic */ String E;
    private /* synthetic */ String z;
    private /* synthetic */ p D;
    private /* synthetic */ s y;
    private /* synthetic */ ax B;
    private /* synthetic */ String G;

    @Override
    public void k() throws IOException {
        super.k();
        this.B.f();
    }

    @Override
    public void r() {
        this.t.clear();
        this.z = net.minecraft.client.D.h.a("createWorld.customize.flat.title", new Object[0]);
        this.G = net.minecraft.client.D.h.a("createWorld.customize.flat.tile", new Object[0]);
        this.E = net.minecraft.client.D.h.a("createWorld.customize.flat.height", new Object[0]);
        this.B = new ax(this);
        this.C = this.b(new s(2, h / 2 - 154, w - 52, 100, 20, net.minecraft.client.D.h.a("createWorld.customize.flat.addLayer", new Object[0]) + " (NYI)"));
        this.y = this.b(new s(3, h / 2 - 50, w - 52, 100, 20, net.minecraft.client.D.h.a("createWorld.customize.flat.editLayer", new Object[0]) + " (NYI)"));
        this.F = this.b(new s(4, h / 2 - 155, w - 52, 150, 20, net.minecraft.client.D.h.a("createWorld.customize.flat.removeLayer", new Object[0])));
        this.t.add(new s(0, h / 2 - 155, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.t.add(new s(5, h / 2 + 5, w - 52, 150, 20, net.minecraft.client.D.h.a("createWorld.customize.presets", new Object[0])));
        this.t.add(new s(1, h / 2 + 5, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.C.l = false;
        this.y.l = false;
        this.D.b();
        this.a();
    }

    public String c() {
        return this.D.toString();
    }

    public void a() {
        boolean bl2;
        this.F.h = bl2 = this.b();
        this.y.h = bl2;
        this.y.h = false;
        this.C.h = false;
    }

    @Override
    protected void a(s s2) throws IOException {
        Q q2;
        block12: {
            block6: {
                int n2;
                int n3;
                block11: {
                    int n4;
                    String[] arrstring;
                    block9: {
                        block10: {
                            block7: {
                                block8: {
                                    block4: {
                                        block5: {
                                            n3 = this.D.e().size() - this.B.x - 1;
                                            arrstring = q.b();
                                            n2 = s2.g;
                                            if (arrstring == null) break block4;
                                            if (n2 != 1) break block5;
                                            this.m.a(this.A);
                                            if (arrstring != null) break block6;
                                        }
                                        n2 = s2.g;
                                    }
                                    if (arrstring == null) break block7;
                                    if (n2 != 0) break block8;
                                    this.A.T = this.c();
                                    this.m.a(this.A);
                                    if (arrstring != null) break block6;
                                }
                                n2 = s2.g;
                            }
                            n4 = 5;
                            if (arrstring == null) break block9;
                            if (n2 != n4) break block10;
                            this.m.a(new X(this));
                            if (arrstring != null) break block6;
                        }
                        n2 = s2.g;
                        if (arrstring == null) break block11;
                        n4 = 4;
                    }
                    if (n2 != n4) break block6;
                    q2 = this;
                    if (arrstring == null) break block12;
                    n2 = q2.b() ? 1 : 0;
                }
                if (n2 != 0) {
                    this.D.e().remove(n3);
                    this.B.x = Math.min(this.B.x, this.D.e().size() - 1);
                }
            }
            this.D.b();
            q2 = this;
        }
        q2.a();
    }

    static p a(Q q2) {
        return q2.D;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        String[] arrstring = q.b();
        int n2 = this.B.x;
        int n3 = -1;
        if (arrstring != null) {
            if (n2 <= n3) return 0 != 0;
            n2 = this.B.x;
            if (arrstring == null) return n2 != 0;
            n3 = this.D.e().size();
        }
        if (n2 >= n3) return 0 != 0;
        return 1 != 0;
    }

    public Q(R r2, String string) {
        this.D = p.c();
        this.A = r2;
        this.a(string);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.B.b(n2, n3, f10);
        this.b(this.v, this.z, h / 2, 8, 0xFFFFFF);
        int n4 = h / 2 - 92 - 16;
        this.a(this.v, this.G, n4, 32, 0xFFFFFF);
        this.a(this.v, this.E, n4 + 2 + 213 - this.v.e(this.E), 32, 0xFFFFFF);
        super.a(n2, n3, f10);
    }

    public void a(String string) {
        this.D = p.a(string);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

