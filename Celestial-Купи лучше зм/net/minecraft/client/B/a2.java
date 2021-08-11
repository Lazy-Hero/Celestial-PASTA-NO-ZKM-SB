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
import net.minecraft.B.D;
import net.minecraft.B.a;
import net.minecraft.B.j;
import net.minecraft.B.n;
import net.minecraft.B.y;
import net.minecraft.C.m;
import net.minecraft.ah.z;
import net.minecraft.client.I.g;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.i.h;
import net.minecraft.w.d;
import org.lwjgl.input.Keyboard;

public class a2
extends g
implements j {
    private /* synthetic */ aq ac;
    private final /* synthetic */ h ad;
    private final /* synthetic */ y aa;
    private static final /* synthetic */ net.minecraft.ar.v ab;

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
        net.minecraft.client.a.v.y();
        net.minecraft.client.a.v.f();
        this.ac.d();
    }

    public a2(h h2, z z2) {
        super(new y(h2, z2, Q.P().s));
        this.ad = h2;
        this.aa = (y)this.X;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        block6: {
            a2 a22;
            int n4;
            int n5;
            block7: {
                boolean bl2;
                block4: {
                    String[] arrstring;
                    block5: {
                        String[] arrstring2 = q.b();
                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                        arrstring = arrstring2;
                        this.m.aN().b(ab);
                        n5 = (h - this.M) / 2;
                        n4 = (w - this.F) / 2;
                        this.a(n5, n4, 0, 0, this.M, this.F);
                        int n6 = this.aa.a(0).b();
                        if (arrstring != null) {
                            n6 = n6 != 0 ? 0 : 16;
                        }
                        this.a(n5 + 59, n4 + 20, 0, this.F + n6, 110, 16);
                        bl2 = this.aa.a(0).b();
                        if (arrstring == null) break block4;
                        if (bl2) break block5;
                        bl2 = this.aa.a(1).b();
                        if (arrstring == null) break block4;
                        if (!bl2) break block6;
                    }
                    a22 = this;
                    if (arrstring == null) break block7;
                    bl2 = a22.aa.a(2).b();
                }
                if (bl2) break block6;
                a22 = this;
            }
            a22.a(n5 + 99, n4 + 45, this.M, 0, 28, 21);
        }
    }

    @Override
    public void a(n n2, a a10) {
    }

    @Override
    public void h() {
        super.h();
        Keyboard.enableRepeatEvents((boolean)false);
        this.X.a(this);
    }

    @Override
    public void a(n n2, int n3, int n4) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(n var1_1, int var2_2, d var3_3) {
        var4_4 = q.b();
        if (var2_2 != 0) return;
        v0 = var3_3;
        if (var4_4 == null) ** GOTO lbl9
        if (v0.G()) {
            v1 = "";
        } else {
            v0 = var3_3;
lbl9:
            // 2 sources

            v1 = v0.g();
        }
        this.ac.a(v1);
        v2 = var3_3.G();
        if (var4_4 != null) {
            v2 = v2 == false;
        }
        this.ac.a(v2);
        if (var3_3.G() != false) return;
        this.a();
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.ac.a(n2, n3, n4);
    }

    @Override
    protected void b(int n2, int n3) {
        block7: {
            block8: {
                int n4;
                String string;
                int n5;
                block16: {
                    int n6;
                    int n7;
                    block17: {
                        int n8;
                        String[] arrstring;
                        block15: {
                            block14: {
                                int n9;
                                block11: {
                                    block12: {
                                        block13: {
                                            block9: {
                                                block10: {
                                                    String[] arrstring2 = q.b();
                                                    net.minecraft.client.a.v.y();
                                                    arrstring = arrstring2;
                                                    net.minecraft.client.a.v.f();
                                                    this.v.b(net.minecraft.client.D.h.a("container.repair", new Object[0]), 60.0f, 6.0f, 0x404040);
                                                    if (arrstring == null) break block7;
                                                    if (this.aa.m <= 0) break block8;
                                                    n5 = 8453920;
                                                    n9 = 1;
                                                    string = net.minecraft.client.D.h.a("container.repair.cost", this.aa.m);
                                                    n8 = this.aa.m;
                                                    if (arrstring == null) break block9;
                                                    if (n8 < 40) break block10;
                                                    n8 = this.m.s.cw.g ? 1 : 0;
                                                    if (arrstring == null) break block9;
                                                    if (n8 != 0) break block10;
                                                    string = net.minecraft.client.D.h.a("container.repair.expensive", new Object[0]);
                                                    n5 = 0xFF6060;
                                                    if (arrstring != null) break block11;
                                                }
                                                n8 = this.aa.a(2).b() ? 1 : 0;
                                            }
                                            if (arrstring == null) break block12;
                                            if (n8 != 0) break block13;
                                            n9 = 0;
                                            if (arrstring != null) break block11;
                                        }
                                        n8 = this.aa.a(2).a(this.ad.g) ? 1 : 0;
                                    }
                                    if (arrstring == null) break block14;
                                    if (n8 == 0) {
                                        n5 = 0xFF6060;
                                    }
                                }
                                n8 = n9;
                            }
                            if (arrstring == null) break block15;
                            if (n8 == 0) break block8;
                            n8 = 0xFF000000 | (n5 & 0xFCFCFC) >> 2 | n5 & 0xFF000000;
                        }
                        n7 = n8;
                        n4 = this.M - 8 - this.v.e(string);
                        int n10 = 67;
                        n6 = this.v.f();
                        if (arrstring == null) break block16;
                        if (n6 == 0) break block17;
                        a2.a(n4 - 3, 65, this.M - 7, 77, -16777216);
                        a2.a(n4 - 2, 66, this.M - 8, 76, -12895429);
                        if (arrstring != null) break block16;
                    }
                    this.v.b(string, n4, 68.0f, n7);
                    this.v.b(string, n4 + 1, 67.0f, n7);
                    n6 = this.v.b(string, n4 + 1, 68.0f, n7);
                }
                this.v.b(string, n4, 67.0f, n5);
            }
            net.minecraft.client.a.v.j();
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(n n2, net.minecraft.ar.a2<d> a22) {
        this.a(n2, 0, n2.a(0).d());
    }

    @Override
    public void r() {
        super.r();
        Keyboard.enableRepeatEvents((boolean)true);
        int n2 = (h - this.M) / 2;
        int n3 = (w - this.F) / 2;
        this.ac = new aq(0, this.v, n2 + 62, n3 + 24, 103, 12);
        this.ac.c(-1);
        this.ac.f(-1);
        this.ac.d(false);
        this.ac.b(35);
        this.X.a(this);
        this.X.b(this);
    }

    private void a() {
        block2: {
            String string;
            block3: {
                String string2;
                block6: {
                    boolean bl2;
                    block5: {
                        String[] arrstring;
                        D d10;
                        block4: {
                            string = this.ac.n();
                            d10 = this.aa.a(0);
                            arrstring = q.b();
                            if (arrstring == null) break block2;
                            if (d10 == null) break block3;
                            bl2 = d10.b();
                            if (arrstring == null) break block4;
                            if (!bl2) break block3;
                            bl2 = d10.d().c();
                        }
                        if (arrstring == null) break block5;
                        if (bl2) break block3;
                        string2 = string;
                        if (arrstring == null) break block6;
                        bl2 = string2.equals(d10.d().g());
                    }
                    if (!bl2) break block3;
                    string2 = "";
                }
                string = string2;
            }
            this.aa.a(string);
            this.m.s.c9.a(new net.minecraft.d.h("MC|ItemName", new m(Unpooled.buffer()).a(string)));
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block4: {
            a2 a22;
            block2: {
                block3: {
                    String[] arrstring = q.b();
                    a22 = this;
                    if (arrstring == null) break block2;
                    if (!a22.ac.a(c10, n2)) break block3;
                    this.a();
                    if (arrstring != null) break block4;
                }
                a22 = this;
            }
            super.a(c10, n2);
        }
    }

    static {
        ab = new net.minecraft.ar.v("textures/gui/container/anvil.png");
    }
}

