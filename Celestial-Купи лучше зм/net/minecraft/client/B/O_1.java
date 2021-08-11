/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.N.B;
import net.minecraft.N.g;
import net.minecraft.N.j;
import net.minecraft.ar.U;
import net.minecraft.at.k;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.ab;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.ar;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class O
extends L
implements net.minecraft.ar.q {
    private /* synthetic */ s H;
    private /* synthetic */ s D;
    private /* synthetic */ s I;
    private /* synthetic */ aq L;
    private /* synthetic */ boolean C;
    private /* synthetic */ aq y;
    private final /* synthetic */ B G;
    private /* synthetic */ U A;
    private /* synthetic */ s F;
    private /* synthetic */ g B;
    private /* synthetic */ boolean J;
    private /* synthetic */ s z;
    private /* synthetic */ boolean K;
    private /* synthetic */ s E;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b() {
        var1_1 = q.b();
        if (var1_1 == null) ** GOTO lbl6
        switch (ar.a[this.B.ordinal()]) {
            case 1: {
                this.B = g.AUTO;
lbl6:
                // 2 sources

                if (var1_1 != null) return;
            }
            case 2: {
                this.B = g.REDSTONE;
                if (var1_1 != null) return;
            }
            case 3: {
                this.B = g.SEQUENCE;
                return;
            }
        }
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    private void d() {
        block4: {
            block2: {
                O o2;
                block3: {
                    String[] arrstring = q.b();
                    o2 = this;
                    if (arrstring == null) break block2;
                    if (!o2.K) break block3;
                    this.H.m = net.minecraft.client.D.h.a("advMode.mode.conditional", new Object[0]);
                    if (arrstring != null) break block4;
                }
                o2 = this;
            }
            o2.H.m = net.minecraft.client.D.h.a("advMode.mode.unconditional", new Object[0]);
        }
    }

    @Override
    public void a(String ... arrstring) {
        this.A.a(arrstring);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block10: {
            O o2;
            block7: {
                block8: {
                    int n3;
                    int n4;
                    String[] arrstring;
                    block9: {
                        block6: {
                            U u2;
                            block4: {
                                block5: {
                                    arrstring = q.b();
                                    u2 = this.A;
                                    if (arrstring == null) break block4;
                                    u2.b();
                                    if (n2 != 15) break block5;
                                    this.A.a();
                                    if (arrstring != null) break block6;
                                }
                                u2 = this.A;
                            }
                            u2.c();
                        }
                        this.L.a(c10, n2);
                        o2 = this;
                        if (arrstring == null) break block7;
                        o2.y.a(c10, n2);
                        if (n2 == 28) break block8;
                        n4 = n2;
                        n3 = 156;
                        if (arrstring == null) break block9;
                        if (n4 == n3) break block8;
                        n4 = n2;
                        n3 = 1;
                    }
                    if (n4 != n3) break block10;
                    this.a(this.D);
                    if (arrstring != null) break block10;
                }
                o2 = this;
            }
            o2.a(this.I);
        }
    }

    private void a() {
        block4: {
            block2: {
                O o2;
                block3: {
                    String[] arrstring = q.b();
                    o2 = this;
                    if (arrstring == null) break block2;
                    if (!o2.C) break block3;
                    this.E.m = net.minecraft.client.D.h.a("advMode.mode.autoexec.bat", new Object[0]);
                    if (arrstring != null) break block4;
                }
                o2 = this;
            }
            o2.E.m = net.minecraft.client.D.h.a("advMode.mode.redstoneTriggered", new Object[0]);
        }
    }

    @Override
    public void r() {
        j j2 = this.G.k();
        Keyboard.enableRepeatEvents((boolean)true);
        this.t.clear();
        this.I = this.b(new s(0, h / 2 - 4 - 150, w / 4 + 120 + 12, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.D = this.b(new s(1, h / 2 + 4, w / 4 + 120 + 12, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.z = this.b(new s(4, h / 2 + 150 - 20, 135, 20, 20, "O"));
        this.F = this.b(new s(5, h / 2 - 50 - 100 - 4, 165, 100, 20, net.minecraft.client.D.h.a("advMode.mode.sequence", new Object[0])));
        this.H = this.b(new s(6, h / 2 - 50, 165, 100, 20, net.minecraft.client.D.h.a("advMode.mode.unconditional", new Object[0])));
        this.E = this.b(new s(7, h / 2 + 50 + 4, 165, 100, 20, net.minecraft.client.D.h.a("advMode.mode.redstoneTriggered", new Object[0])));
        this.L = new aq(2, this.v, h / 2 - 150, 50, 300, 20);
        this.L.b(32500);
        this.L.c(true);
        this.y = new aq(3, this.v, h / 2 - 150, 135, 276, 20);
        this.y.b(32500);
        this.y.a(false);
        this.y.a("-");
        this.I.h = false;
        this.z.h = false;
        this.F.h = false;
        this.H.h = false;
        this.E.h = false;
        this.A = new ab(this, this.L, true, j2);
    }

    public void g() {
        j j2 = this.G.k();
        this.L.a(j2.d());
        this.J = j2.g();
        this.B = this.G.e();
        this.K = this.G.d();
        this.C = this.G.b();
        this.i();
        this.c();
        this.d();
        this.a();
        this.I.h = true;
        this.z.h = true;
        this.F.h = true;
        this.H.h = true;
        this.E.h = true;
    }

    private void i() {
        block5: {
            block2: {
                block3: {
                    String[] arrstring;
                    block4: {
                        j j2 = this.G.k();
                        arrstring = q.b();
                        if (arrstring == null) break block2;
                        if (!j2.g()) break block3;
                        this.z.m = "O";
                        if (arrstring == null) break block4;
                        if (j2.e() == null) break block5;
                        this.y.a(j2.e().f());
                    }
                    if (arrstring != null) break block5;
                }
                this.z.m = "X";
            }
            this.y.a("-");
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        String[] arrstring = q.b();
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("advMode.setCommand", new Object[0]), h / 2, 20, 0xFFFFFF);
        String[] arrstring2 = arrstring;
        this.a(this.v, net.minecraft.client.D.h.a("advMode.command", new Object[0]), h / 2 - 150, 40, 0xA0A0A0);
        this.L.d();
        int n4 = 75;
        int n5 = 0;
        this.a(this.v, net.minecraft.client.D.h.a("advMode.nearestPlayer", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.randomPlayer", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.allPlayers", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.allEntities", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.self", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        O o2 = this;
        if (arrstring2 != null) {
            if (!o2.y.n().isEmpty()) {
                n4 = n4 + n5 * this.v.p + 1;
                this.a(this.v, net.minecraft.client.D.h.a("advMode.previousOutput", new Object[0]), h / 2 - 150, n4 + 4, 0xA0A0A0);
                this.y.d();
            }
            o2 = this;
        }
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.L.a(n2, n3, n4);
        this.y.a(n2, n3, n4);
    }

    @Override
    public void e() {
        this.L.i();
    }

    public O(B b10) {
        this.B = g.REDSTONE;
        this.G = b10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void c() {
        var1_1 = q.b();
        if (var1_1 == null) ** GOTO lbl6
        switch (ar.a[this.B.ordinal()]) {
            case 1: {
                this.F.m = net.minecraft.client.D.h.a("advMode.mode.sequence", new Object[0]);
lbl6:
                // 2 sources

                if (var1_1 != null) return;
            }
            case 2: {
                this.F.m = net.minecraft.client.D.h.a("advMode.mode.auto", new Object[0]);
                if (var1_1 != null) return;
            }
            case 3: {
                this.F.m = net.minecraft.client.D.h.a("advMode.mode.redstone", new Object[0]);
                return;
            }
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block9: {
            int n2;
            int n3;
            String[] arrstring;
            block18: {
                block19: {
                    block16: {
                        block17: {
                            block14: {
                                block15: {
                                    j j2;
                                    block12: {
                                        block13: {
                                            block10: {
                                                block11: {
                                                    arrstring = q.b();
                                                    if (!s2.h) break block9;
                                                    j2 = this.G.k();
                                                    n3 = s2.g;
                                                    if (arrstring == null) break block10;
                                                    if (n3 != 1) break block11;
                                                    j2.a(this.J);
                                                    this.m.a((L)null);
                                                    if (arrstring != null) break block9;
                                                }
                                                n3 = s2.g;
                                            }
                                            if (arrstring == null) break block12;
                                            if (n3 != 0) break block13;
                                            m m2 = new m(Unpooled.buffer());
                                            j2.a(m2);
                                            m2.a(this.L.n());
                                            m2.writeBoolean(j2.g());
                                            m2.a(this.B.name());
                                            m2.writeBoolean(this.K);
                                            m2.writeBoolean(this.C);
                                            this.m.ar().a(new net.minecraft.d.h("MC|AutoCmd", m2));
                                            if (arrstring != null) {
                                                if (!j2.g()) {
                                                    j2.b((k)null);
                                                }
                                                this.m.a((L)null);
                                            }
                                            if (arrstring != null) break block9;
                                        }
                                        n3 = s2.g;
                                    }
                                    n2 = 4;
                                    if (arrstring == null) break block14;
                                    if (n3 != n2) break block15;
                                    boolean bl2 = j2.g();
                                    if (arrstring != null) {
                                        bl2 = !bl2;
                                    }
                                    j2.a(bl2);
                                    this.i();
                                    if (arrstring != null) break block9;
                                }
                                n3 = s2.g;
                                n2 = 5;
                            }
                            if (arrstring == null) break block16;
                            if (n3 != n2) break block17;
                            this.b();
                            this.c();
                            if (arrstring != null) break block9;
                        }
                        n3 = s2.g;
                        n2 = 6;
                    }
                    if (arrstring == null) break block18;
                    if (n3 != n2) break block19;
                    boolean bl3 = this.K;
                    if (arrstring != null) {
                        bl3 = !bl3;
                    }
                    this.K = bl3;
                    this.d();
                    if (arrstring != null) break block9;
                }
                n3 = s2.g;
                n2 = 7;
            }
            if (n3 == n2) {
                boolean bl4 = this.C;
                if (arrstring != null) {
                    bl4 = !bl4;
                }
                this.C = bl4;
                this.a();
            }
        }
    }
}

