/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.D.h;
import net.minecraft.client.E.a;
import net.minecraft.client.E.e;
import net.minecraft.client.E.p;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a7;
import net.minecraft.client.b.aE;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aN;
import net.minecraft.client.b.ad;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.az;
import net.minecraft.client.b.bA;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.o.f;
import net.minecraft.client.o.g;
import net.minecraft.client.o.l;
import net.minecraft.client.o.o;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class av
extends L {
    private /* synthetic */ boolean C;
    private /* synthetic */ g z;
    private /* synthetic */ boolean G;
    private static final /* synthetic */ Logger I;
    private /* synthetic */ s A;
    private /* synthetic */ boolean O;
    private /* synthetic */ String N;
    private /* synthetic */ s M;
    private final /* synthetic */ o H;
    private /* synthetic */ f L;
    private /* synthetic */ s B;
    private /* synthetic */ p D;
    private /* synthetic */ boolean E;
    private /* synthetic */ a F;
    private /* synthetic */ bA J;
    private /* synthetic */ boolean y;
    public static /* synthetic */ dv K;
    private final /* synthetic */ L P;

    private void a(a a10) {
        this.m.a(new e(this, this.m, a10));
    }

    public boolean a(aN aN2, int n2) {
        String[] arrstring = q.b();
        int n3 = n2;
        if (arrstring != null) {
            n3 = n3 < this.D.a() - 1 ? 1 : 0;
        }
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(boolean var1_1, int var2_2) {
        block18: {
            block19: {
                block20: {
                    block17: {
                        var3_3 = q.b();
                        v0 = this.J;
                        if (var3_3 == null) ** GOTO lbl8
                        if (v0.b() < 0) {
                            v1 = null;
                        } else {
                            v0 = this.J;
lbl8:
                            // 2 sources

                            v1 = v0.a(this.J.b());
                        }
                        var4_4 = v1;
                        v2 = this.E;
                        if (var3_3 != null) {
                            if (v2) {
                                this.E = false;
                                if (var3_3 != null) {
                                    if (var1_1 && var4_4 instanceof aN) {
                                        this.D.b(this.J.b());
                                        this.D.c();
                                        this.J.a(-1);
                                        this.J.a(this.D);
                                    }
                                    this.m.a(this);
                                }
                                if (var3_3 != null) return;
                            }
                            v2 = this.O;
                        }
                        if (var3_3 != null) {
                            if (v2) {
                                this.O = false;
                                if (var3_3 != null) {
                                    if (var1_1) {
                                        this.a(this.F);
                                        if (var3_3 != null) return;
                                    }
                                    this.m.a(this);
                                }
                                if (var3_3 != null) return;
                            }
                            v2 = this.y;
                        }
                        if (var3_3 != null) {
                            if (v2) {
                                this.y = false;
                                if (var3_3 != null) {
                                    if (var1_1) {
                                        this.D.a(this.F);
                                        this.D.c();
                                        this.J.a(-1);
                                        this.J.a(this.D);
                                    }
                                    this.m.a(this);
                                }
                                if (var3_3 != null) return;
                            }
                            v2 = this.C;
                        }
                        if (var3_3 == null) break block17;
                        if (v2 == false) return;
                        v3 = this;
                        if (var3_3 == null) break block18;
                        v3.C = false;
                        v2 = var1_1;
                    }
                    if (!v2) break block19;
                    v4 = var4_4;
                    if (var3_3 == null) break block20;
                    if (!(v4 instanceof aN)) break block19;
                    v4 = var4_4;
                }
                var5_5 = ((aN)v4).b();
                var5_5.c = this.F.c;
                var5_5.h = this.F.h;
                var5_5.a(this.F);
                this.D.c();
                this.J.a(this.D);
            }
            v3 = this;
        }
        v3.m.a(this);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(aN var1_1, int var2_2, boolean var3_3) {
        var4_4 = q.b();
        v0 = var3_3;
        if (var4_4 == null) ** GOTO lbl8
        if (v0 != 0) {
            v1 = this.D.a() - 1;
        } else {
            v0 = var2_2;
lbl8:
            // 2 sources

            v1 = v0 + 1;
        }
        var5_5 = v1;
        this.D.a(var2_2, var5_5);
        v2 = this.J;
        if (var4_4 != null) {
            if (v2.b() == var2_2) {
                this.a(var5_5);
            }
            v2 = this.J;
        }
        v2.a(this.D);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block4: {
            block6: {
                String[] arrstring;
                block27: {
                    int n3;
                    int n4;
                    block26: {
                        block17: {
                            block18: {
                                block22: {
                                    av av2;
                                    block24: {
                                        block25: {
                                            int n5;
                                            block23: {
                                                block21: {
                                                    block19: {
                                                        int n6;
                                                        block20: {
                                                            block7: {
                                                                block8: {
                                                                    block13: {
                                                                        av av3;
                                                                        block15: {
                                                                            block16: {
                                                                                int n7;
                                                                                block14: {
                                                                                    block12: {
                                                                                        block9: {
                                                                                            block10: {
                                                                                                int n8;
                                                                                                block11: {
                                                                                                    aJ aJ2;
                                                                                                    block5: {
                                                                                                        block2: {
                                                                                                            block3: {
                                                                                                                n6 = this.J.b();
                                                                                                                arrstring = q.b();
                                                                                                                aJ2 = n6 < 0 ? null : this.J.a(n6);
                                                                                                                n4 = n2;
                                                                                                                if (arrstring == null) break block2;
                                                                                                                if (n4 != 63) break block3;
                                                                                                                this.a();
                                                                                                                if (arrstring != null) break block4;
                                                                                                            }
                                                                                                            n4 = n6;
                                                                                                        }
                                                                                                        if (arrstring == null) break block5;
                                                                                                        if (n4 < 0) break block6;
                                                                                                        n4 = n2;
                                                                                                    }
                                                                                                    n3 = 200;
                                                                                                    if (arrstring == null) break block7;
                                                                                                    if (n4 != n3) break block8;
                                                                                                    n7 = av.o();
                                                                                                    if (arrstring == null) break block9;
                                                                                                    if (n7 == 0) break block10;
                                                                                                    n8 = n6;
                                                                                                    if (arrstring == null) break block11;
                                                                                                    if (n8 <= 0) break block4;
                                                                                                    n8 = aJ2 instanceof aN;
                                                                                                }
                                                                                                if (n8 == 0) break block4;
                                                                                                this.D.a(n6, n6 - 1);
                                                                                                this.a(this.J.b() - 1);
                                                                                                this.J.d(-this.J.i());
                                                                                                this.J.a(this.D);
                                                                                                if (arrstring != null) break block4;
                                                                                            }
                                                                                            n7 = n6;
                                                                                        }
                                                                                        if (arrstring == null) break block12;
                                                                                        if (n7 <= 0) break block13;
                                                                                        this.a(this.J.b() - 1);
                                                                                        this.J.d(-this.J.i());
                                                                                        n7 = this.J.a(this.J.b()) instanceof az;
                                                                                    }
                                                                                    if (arrstring == null) break block14;
                                                                                    if (n7 == 0) break block4;
                                                                                    av3 = this;
                                                                                    if (arrstring == null) break block15;
                                                                                    n7 = av3.J.b();
                                                                                }
                                                                                if (n7 <= 0) break block16;
                                                                                this.a(this.J.d() - 1);
                                                                                this.J.d(-this.J.i());
                                                                                if (arrstring != null) break block4;
                                                                            }
                                                                            av3 = this;
                                                                        }
                                                                        av3.a(-1);
                                                                        if (arrstring != null) break block4;
                                                                    }
                                                                    this.a(-1);
                                                                    if (arrstring != null) break block4;
                                                                }
                                                                n4 = n2;
                                                                n3 = 208;
                                                            }
                                                            if (arrstring == null) break block17;
                                                            if (n4 != n3) break block18;
                                                            n5 = av.o();
                                                            if (arrstring == null) break block19;
                                                            if (n5 == 0) break block20;
                                                            if (n6 >= this.D.a() - 1) break block4;
                                                            this.D.a(n6, n6 + 1);
                                                            this.a(n6 + 1);
                                                            this.J.d(this.J.i());
                                                            this.J.a(this.D);
                                                            if (arrstring != null) break block4;
                                                        }
                                                        n5 = n6;
                                                    }
                                                    if (arrstring == null) break block21;
                                                    if (n5 >= this.J.d()) break block22;
                                                    this.a(this.J.b() + 1);
                                                    this.J.d(this.J.i());
                                                    n5 = this.J.a(this.J.b()) instanceof az;
                                                }
                                                if (arrstring == null) break block23;
                                                if (n5 == 0) break block4;
                                                av2 = this;
                                                if (arrstring == null) break block24;
                                                n5 = av2.J.b();
                                            }
                                            if (n5 >= this.J.d() - 1) break block25;
                                            this.a(this.J.d() + 1);
                                            this.J.d(this.J.i());
                                            if (arrstring != null) break block4;
                                        }
                                        av2 = this;
                                    }
                                    av2.a(-1);
                                    if (arrstring != null) break block4;
                                }
                                this.a(-1);
                                if (arrstring != null) break block4;
                            }
                            n4 = n2;
                            n3 = 28;
                        }
                        if (arrstring == null) break block26;
                        if (n4 == n3) break block27;
                        n4 = n2;
                        n3 = 156;
                    }
                    if (n4 == n3) break block27;
                    super.a(c10, n2);
                    if (arrstring != null) break block4;
                }
                this.a((s)this.t.get(2));
                if (arrstring != null) break block4;
            }
            super.a(c10, n2);
        }
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.J.f();
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            av av2;
            block2: {
                this.N = null;
                this.J.a(n2, n3, f10);
                this.m.ax.b(net.minecraft.client.D.h.a("multiplayer.title", new Object[0]), (float)h / 2.0f, 14.0f, 0xFFFFFF);
                String[] arrstring = q.b();
                super.a(n2, n3, f10);
                String[] arrstring2 = arrstring;
                av2 = this;
                if (arrstring2 == null) break block2;
                if (av2.N == null) break block3;
                av2 = this;
            }
            av2.a(Lists.newArrayList((Iterable)Splitter.on((String)"\n").split((CharSequence)this.N)), n2, n3);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void r() {
        block4: {
            block3: {
                Keyboard.enableRepeatEvents((boolean)true);
                v0 = q.b();
                this.t.clear();
                var1_1 = v0;
                v1 = this;
                if (var1_1 == null) ** GOTO lbl18
                if (!v1.G) break block3;
                this.J.a(av.h, av.w, 32, av.w - 64);
                if (var1_1 != null) break block4;
            }
            this.G = true;
            this.D = new p(this.m);
            this.D.b();
            this.L = new f();
            try {
                this.z = new g(this.L);
                v1 = this;
lbl18:
                // 2 sources

                v1.z.start();
            }
            catch (Exception var2_2) {
                av.I.warn("Unable to start LAN server detection: {}", (Object)var2_2.getMessage());
            }
            this.J = new bA(this, this.m, av.h, av.w, 32, av.w - 64, 36);
            this.J.a(this.D);
        }
        this.d();
    }

    public p e() {
        return this.D;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void e() {
        String[] arrstring = q.b();
        super.e();
        String[] arrstring2 = arrstring;
        av av2 = this;
        if (arrstring2 != null) {
            if (av2.L.c()) {
                List<l> list = this.L.b();
                this.L.a();
                this.J.a(list);
            }
            av2 = this;
        }
        av2.H.c();
    }

    static {
        I = LogManager.getLogger();
        K = new dv();
    }

    public boolean b(aN aN2, int n2) {
        String[] arrstring = q.b();
        boolean bl2 = n2;
        if (arrstring != null) {
            bl2 = bl2 > false;
        }
        return bl2;
    }

    @Override
    protected void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        this.J.a(n2, n3, n4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(aN var1_1, int var2_2, boolean var3_3) {
        var4_4 = q.b();
        v0 = var3_3;
        if (var4_4 == null) ** GOTO lbl8
        if (v0 != 0) {
            v1 = 0;
        } else {
            v0 = var2_2;
lbl8:
            // 2 sources

            v1 = v0 - 1;
        }
        var5_5 = v1;
        this.D.a(var2_2, var5_5);
        v2 = this.J;
        if (var4_4 != null) {
            if (v2.b() == var2_2) {
                this.a(var5_5);
            }
            v2 = this.J;
        }
        v2.a(this.D);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(int var1_1) {
        block7: {
            block6: {
                var2_2 = q.b();
                v0 = this.J;
                v1 = var1_1;
                if (var2_2 == null) ** GOTO lbl11
                v0.a(v1);
                if (var1_1 < 0) {
                    v2 = null;
                } else {
                    v0 = this.J;
                    v1 = var1_1;
lbl11:
                    // 2 sources

                    v2 = v0.a(v1);
                }
                var3_3 = v2;
                this.B.h = false;
                this.A.h = false;
                this.M.h = false;
                v3 = var3_3;
                if (var2_2 != null) {
                    if (v3 == null) return;
                    v3 = var3_3;
                }
                v4 = v3 instanceof az;
                if (var2_2 == null) break block6;
                if (v4 != false) return;
                this.B.h = true;
                if (var2_2 == null) break block7;
                v4 = var3_3 instanceof aN;
            }
            if (v4 == false) return;
            this.A.h = true;
        }
        this.M.h = true;
    }

    private void a() {
        this.m.a(new av(this.P));
    }

    public void d() {
        this.A = this.b(new s(7, h / 2 - 154, w - 28, 70, 20, net.minecraft.client.D.h.a("selectServer.edit", new Object[0])));
        this.M = this.b(new s(2, h / 2 - 74, w - 28, 70, 20, net.minecraft.client.D.h.a("selectServer.delete", new Object[0])));
        this.B = this.b(new s(1, h / 2 - 154, w - 52, 100, 20, net.minecraft.client.D.h.a("selectServer.select", new Object[0])));
        this.t.add(new s(4, h / 2 - 50, w - 52, 100, 20, net.minecraft.client.D.h.a("selectServer.direct", new Object[0])));
        this.t.add(new s(3, h / 2 + 4 + 50, w - 52, 100, 20, net.minecraft.client.D.h.a("selectServer.add", new Object[0])));
        this.t.add(new s(8, h / 2 + 4, w - 28, 70, 20, net.minecraft.client.D.h.a("selectServer.refresh", new Object[0])));
        this.t.add(new s(0, h / 2 + 4 + 76, w - 28, 75, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.a(this.J.b());
    }

    public av(L l2) {
        this.H = new o();
        this.P = l2;
    }

    public o c() {
        return this.H;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        super.a(n2, n3, n4);
        this.J.b(n2, n3, n4);
    }

    @Override
    public void h() {
        String[] arrstring = q.b();
        Keyboard.enableRepeatEvents((boolean)false);
        String[] arrstring2 = arrstring;
        av av2 = this;
        if (arrstring2 != null) {
            if (av2.z != null) {
                this.z.interrupt();
                this.z = null;
            }
            av2 = this;
        }
        av2.H.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b() {
        block7: {
            block6: {
                var1_1 = q.b();
                v0 = this.J;
                if (var1_1 == null) ** GOTO lbl8
                if (v0.b() < 0) {
                    v1 = null;
                } else {
                    v0 = this.J;
lbl8:
                    // 2 sources

                    v1 = v0.a(this.J.b());
                }
                var2_2 = v1;
                v2 = var2_2 instanceof aN;
                if (var1_1 == null) break block6;
                if (v2) {
                    this.a(((aN)var2_2).b());
                    if (var1_1 != null) return;
                }
                v3 = var2_2;
                if (var1_1 == null) break block7;
                v2 = v3 instanceof ad;
            }
            if (v2 == false) return;
            v3 = var2_2;
        }
        var3_3 = ((ad)v3).a();
        this.a(new a(var3_3.c(), var3_3.a(), true));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        block23: {
            block24: {
                block22: {
                    block17: {
                        block19: {
                            block18: {
                                block21: {
                                    block20: {
                                        block16: {
                                            var2_2 = q.b();
                                            v0 = var1_1.h;
                                            if (var2_2 == null) break block16;
                                            if (v0 == 0) return;
                                            v1 = this.J;
                                            if (var2_2 == null) ** GOTO lbl13
                                            v0 = v1.b();
                                        }
                                        if (v0 < 0) {
                                            v2 = null;
                                        } else {
                                            v1 = this.J;
lbl13:
                                            // 2 sources

                                            v2 = v1.a(this.J.b());
                                        }
                                        var3_3 = v2;
                                        v3 = var1_1.g;
                                        v4 = 2;
                                        if (var2_2 == null) break block17;
                                        if (v3 != v4) break block18;
                                        v3 = var3_3 instanceof aN;
                                        if (var2_2 == null) break block19;
                                        if (v3 == 0) break block18;
                                        var4_4 = ((aN)var3_3).b().c;
                                        v5 = var4_4;
                                        if (var2_2 == null) break block20;
                                        if (v5 == null) break block21;
                                        this.E = true;
                                        v5 = net.minecraft.client.D.h.a("selectServer.deleteQuestion", new Object[0]);
                                    }
                                    var5_5 = v5;
                                    var6_6 = "'" + (String)var4_4 + "' " + net.minecraft.client.D.h.a("selectServer.deleteWarning", new Object[0]);
                                    var7_7 = net.minecraft.client.D.h.a("selectServer.deleteButton", new Object[0]);
                                    var8_8 = net.minecraft.client.D.h.a("gui.cancel", new Object[0]);
                                    var9_9 = new ao(this, var5_5, var6_6, var7_7, var8_8, this.J.b());
                                    this.m.a(var9_9);
                                }
                                if (var2_2 != null) return;
                            }
                            v3 = var1_1.g;
                        }
                        v4 = 1;
                    }
                    if (var2_2 != null) {
                        if (v3 == v4) {
                            this.b();
                            if (var2_2 != null) return;
                        }
                        v3 = var1_1.g;
                        v4 = 4;
                    }
                    if (var2_2 != null) {
                        if (v3 == v4) {
                            this.O = true;
                            this.F = new a(net.minecraft.client.D.h.a("selectServer.defaultName", new Object[0]), "", false);
                            this.m.a(new a7(this, this.F));
                            if (var2_2 != null) return;
                        }
                        v3 = var1_1.g;
                        v4 = 3;
                    }
                    if (var2_2 == null) break block22;
                    if (v3 == v4) {
                        this.y = true;
                        this.F = new a(net.minecraft.client.D.h.a("selectServer.defaultName", new Object[0]), "", false);
                        this.m.a(new aE(this, this.F));
                        if (var2_2 != null) return;
                    }
                    v3 = var1_1.g;
                    if (var2_2 == null) break block23;
                    v4 = 7;
                }
                if (v3 != v4) break block24;
                v3 = var3_3 instanceof aN;
                if (var2_2 == null) break block23;
                if (v3 != 0) {
                    this.C = true;
                    var4_4 = ((aN)var3_3).b();
                    this.F = new a(var4_4.c, var4_4.h, false);
                    this.F.a((a)var4_4);
                    this.m.a(new aE(this, this.F));
                    if (var2_2 != null) return;
                }
            }
            v3 = var1_1.g;
        }
        if (var2_2 != null) {
            if (v3 == 0) {
                this.m.a(this.P);
                if (var2_2 != null) return;
            }
            v3 = var1_1.g;
        }
        if (v3 != 8) return;
        this.a();
    }

    public void a(String string) {
        this.N = string;
    }
}

