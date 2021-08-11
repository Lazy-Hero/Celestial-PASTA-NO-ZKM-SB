/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.Unpooled
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.I;

import io.netty.buffer.Unpooled;
import java.io.IOException;
import net.minecraft.C.m;
import net.minecraft.N.j;
import net.minecraft.ar.U;
import net.minecraft.ar.q;
import net.minecraft.at.k;
import net.minecraft.client.D.h;
import net.minecraft.client.I.u;
import net.minecraft.client.I.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import org.lwjgl.input.Keyboard;

public class r
extends L
implements q {
    private /* synthetic */ U z;
    private final /* synthetic */ j D;
    private /* synthetic */ aq F;
    private /* synthetic */ aq C;
    private /* synthetic */ boolean B;
    private /* synthetic */ s A;
    private /* synthetic */ s E;
    private /* synthetic */ s y;

    @Override
    public void e() {
        this.F.i();
    }

    private void a() {
        block5: {
            r r2;
            block2: {
                block3: {
                    r r3;
                    int[] arrn;
                    block4: {
                        arrn = net.minecraft.client.I.v.a();
                        r2 = this;
                        if (arrn != null) break block2;
                        if (!r2.D.g()) break block3;
                        this.A.m = "O";
                        r3 = this;
                        if (arrn != null) break block4;
                        if (r3.D.e() == null) break block5;
                        r3 = this;
                    }
                    r3.C.a(this.D.e().f());
                    if (arrn == null) break block5;
                }
                this.A.m = "X";
                r2 = this;
            }
            r2.C.a("-");
        }
    }

    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.t.clear();
        int[] arrn = net.minecraft.client.I.v.a();
        this.E = this.b(new s(0, h / 2 - 4 - 150, w / 4 + 120 + 12, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.y = this.b(new s(1, h / 2 + 4, w / 4 + 120 + 12, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.A = this.b(new s(4, h / 2 + 150 - 20, 150, 20, 20, "O"));
        this.F = new aq(2, this.v, h / 2 - 150, 50, 300, 20);
        this.F.b(32500);
        this.F.c(true);
        this.F.a(this.D.d());
        this.C = new aq(3, this.v, h / 2 - 150, 150, 276, 20);
        this.C.b(32500);
        this.C.a(false);
        this.C.a("-");
        this.B = this.D.g();
        this.a();
        int[] arrn2 = arrn;
        boolean bl2 = this.F.n().trim().isEmpty();
        if (arrn2 == null) {
            bl2 = !bl2;
        }
        this.E.h = bl2;
        this.z = new u(this, this.F, true);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    static j a(r r2) {
        return r2.D;
    }

    public r(j j2) {
        this.D = j2;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.F.a(n2, n3, n4);
        this.C.a(n2, n3, n4);
    }

    @Override
    public void a(String ... arrstring) {
        this.z.a(arrstring);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block13: {
            block11: {
                int n3;
                int n4;
                int[] arrn;
                block12: {
                    block10: {
                        block9: {
                            U u2;
                            block7: {
                                block8: {
                                    arrn = net.minecraft.client.I.v.a();
                                    u2 = this.z;
                                    if (arrn != null) break block7;
                                    u2.b();
                                    if (n2 != 15) break block8;
                                    this.z.a();
                                    if (arrn == null) break block9;
                                }
                                u2 = this.z;
                            }
                            u2.c();
                        }
                        this.F.a(c10, n2);
                        this.C.a(c10, n2);
                        boolean bl2 = this.F.n().trim().isEmpty();
                        if (arrn == null) {
                            bl2 = !bl2;
                        }
                        this.E.h = bl2;
                        n4 = n2;
                        n3 = 28;
                        if (arrn != null) break block10;
                        if (n4 == n3) break block11;
                        n4 = n2;
                        n3 = 156;
                    }
                    if (arrn != null) break block12;
                    if (n4 == n3) break block11;
                    n4 = n2;
                    n3 = 1;
                }
                if (n4 != n3) break block13;
                this.a(this.y);
                if (arrn == null) break block13;
            }
            this.a(this.E);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.b(this.v, net.minecraft.client.D.h.a("advMode.setCommand", new Object[0]), h / 2, 20, 0xFFFFFF);
        int[] arrn = net.minecraft.client.I.v.a();
        this.a(this.v, net.minecraft.client.D.h.a("advMode.command", new Object[0]), h / 2 - 150, 40, 0xA0A0A0);
        this.F.d();
        int n4 = 75;
        int n5 = 0;
        this.a(this.v, net.minecraft.client.D.h.a("advMode.nearestPlayer", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.randomPlayer", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        int[] arrn2 = arrn;
        this.a(this.v, net.minecraft.client.D.h.a("advMode.allPlayers", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.allEntities", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        this.a(this.v, net.minecraft.client.D.h.a("advMode.self", new Object[0]), h / 2 - 140, n4 + n5++ * this.v.p, 0xA0A0A0);
        r r2 = this;
        if (arrn2 == null) {
            if (!r2.C.n().isEmpty()) {
                n4 = n4 + n5 * this.v.p + 20;
                this.a(this.v, net.minecraft.client.D.h.a("advMode.previousOutput", new Object[0]), h / 2 - 150, n4, 0xA0A0A0);
                this.C.d();
            }
            r2 = this;
        }
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(s s2) throws IOException {
        block8: {
            int n2;
            int[] arrn;
            block11: {
                block12: {
                    block9: {
                        block10: {
                            block7: {
                                arrn = net.minecraft.client.I.v.a();
                                n2 = s2.h;
                                if (arrn != null) break block7;
                                if (n2 == 0) break block8;
                                n2 = s2.g;
                            }
                            if (arrn != null) break block9;
                            if (n2 != 1) break block10;
                            this.D.a(this.B);
                            this.m.a((L)null);
                            if (arrn == null) break block8;
                        }
                        n2 = s2.g;
                    }
                    if (arrn != null) break block11;
                    if (n2 != 0) break block12;
                    m m2 = new m(Unpooled.buffer());
                    m2.writeByte(this.D.c());
                    this.D.a(m2);
                    m2.a(this.F.n());
                    m2.writeBoolean(this.D.g());
                    this.m.ar().a(new net.minecraft.d.h("MC|AdvCmd", m2));
                    r r2 = this;
                    if (arrn == null) {
                        if (!r2.D.g()) {
                            this.D.b((k)null);
                        }
                        r2 = this;
                    }
                    r2.m.a((L)null);
                    if (arrn == null) break block8;
                }
                n2 = s2.g;
            }
            if (n2 == 4) {
                boolean bl2 = this.D.g();
                if (arrn == null) {
                    bl2 = !bl2;
                }
                this.D.a(bl2);
                this.a();
            }
        }
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }
}

