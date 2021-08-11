/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import java.io.IOException;
import java.util.Random;
import net.minecraft.ah.K;
import net.minecraft.ar.X;
import net.minecraft.aw.w;
import net.minecraft.aw.z;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.Q;
import net.minecraft.client.b.T;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.input.Keyboard;

public class R
extends L {
    private /* synthetic */ aq Q;
    private /* synthetic */ s R;
    private /* synthetic */ String G;
    private /* synthetic */ boolean F;
    public /* synthetic */ String T;
    private /* synthetic */ s C;
    private static final /* synthetic */ String[] X;
    private /* synthetic */ String H;
    private final /* synthetic */ L y;
    private /* synthetic */ s W;
    private /* synthetic */ s O;
    private /* synthetic */ String P;
    private /* synthetic */ boolean I;
    private /* synthetic */ s N;
    private /* synthetic */ String A;
    private /* synthetic */ aq D;
    private /* synthetic */ String Y;
    private /* synthetic */ int J;
    private /* synthetic */ boolean V;
    private /* synthetic */ String E;
    private /* synthetic */ String U;
    private /* synthetic */ boolean L;
    private /* synthetic */ boolean z;
    private /* synthetic */ s S;
    private /* synthetic */ boolean B;
    private /* synthetic */ s K;
    private /* synthetic */ boolean M;

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block2: {
            boolean bl2;
            block3: {
                String[] arrstring = q.b();
                super.a(n2, n3, n4);
                String[] arrstring2 = arrstring;
                bl2 = this.B;
                if (arrstring2 == null) break block2;
                if (!bl2) break block3;
                this.D.a(n2, n3, n4);
                if (arrstring2 != null) break block2;
            }
            bl2 = this.Q.a(n2, n3, n4);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        String[] arrstring;
        block14: {
            block13: {
                int n3;
                int n4;
                block12: {
                    block11: {
                        block10: {
                            block8: {
                                block9: {
                                    arrstring = q.b();
                                    n4 = this.Q.b();
                                    if (arrstring == null) break block8;
                                    if (n4 == 0) break block9;
                                    n4 = this.B;
                                    if (arrstring == null) break block8;
                                    if (n4 != 0) break block9;
                                    this.Q.a(c10, n2);
                                    this.U = this.Q.n();
                                    if (arrstring != null) break block10;
                                }
                                n4 = this.D.b();
                            }
                            if (arrstring == null) break block11;
                            if (n4 == 0) break block10;
                            n4 = this.B ? 1 : 0;
                            if (arrstring == null) break block11;
                            if (n4 != 0) {
                                this.D.a(c10, n2);
                                this.G = this.D.n();
                            }
                        }
                        n4 = n2;
                    }
                    n3 = 28;
                    if (arrstring == null) break block12;
                    if (n4 == n3) break block13;
                    int n3 = n2;
                    n3 = 156;
                }
                if (n4 != n3) break block14;
            }
            this.a((s)this.t.get(0));
        }
        s s2 = (s)this.t.get(0);
        boolean bl2 = this.Q.n().isEmpty();
        if (arrstring != null) {
            bl2 = !bl2;
        }
        s2.h = bl2;
        this.a();
    }

    public void a(w w2) {
        block3: {
            boolean bl2;
            block4: {
                block5: {
                    String[] arrstring;
                    block1: {
                        block2: {
                            this.U = net.minecraft.client.D.h.a("selectWorld.newWorld.copyOf", w2.p());
                            arrstring = q.b();
                            this.G = w2.L() + "";
                            this.J = w2.w().e();
                            this.T = w2.r();
                            this.I = w2.D();
                            this.V = w2.F();
                            bl2 = w2.a();
                            if (arrstring == null) break block1;
                            if (!bl2) break block2;
                            this.A = "hardcore";
                            if (arrstring != null) break block3;
                        }
                        bl2 = w2.g().e();
                    }
                    if (arrstring == null) break block4;
                    if (!bl2) break block5;
                    this.A = "survival";
                    if (arrstring != null) break block3;
                }
                bl2 = w2.g().b();
            }
            if (bl2) {
                this.A = "creative";
            }
        }
    }

    private void c() {
        String[] arrstring = q.b();
        boolean bl2 = this.B;
        if (arrstring != null) {
            bl2 = !bl2;
        }
        this.b(bl2);
    }

    public static String a(z z2, String string) {
        String string2;
        block7: {
            string = string.replaceAll("[\\./\"]", "_");
            String[] arrstring = X;
            String[] arrstring2 = q.b();
            int n2 = arrstring.length;
            int n3 = 0;
            while (n3 < n2) {
                String string3 = arrstring[n3];
                if (arrstring2 != null) {
                    string2 = string;
                    if (arrstring2 == null) break block7;
                    if (string2.equalsIgnoreCase(string3)) {
                        string = "_" + string + "_";
                    }
                    ++n3;
                }
                if (arrstring2 != null) continue;
            }
            while (z2.f(string) != null) {
                string2 = string + "-";
                if (arrstring2 != null) {
                    string = string2;
                    if (arrstring2 != null) continue;
                }
                break block7;
            }
            string2 = string;
        }
        return string2;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block9: {
            block10: {
                R r2;
                block6: {
                    block7: {
                        boolean bl2;
                        String[] arrstring;
                        block8: {
                            String[] arrstring2 = q.b();
                            this.n();
                            arrstring = arrstring2;
                            this.b(this.v, net.minecraft.client.D.h.a("selectWorld.create", new Object[0]), h / 2, 20, -1);
                            r2 = this;
                            if (arrstring == null) break block6;
                            if (!r2.B) break block7;
                            this.a(this.v, net.minecraft.client.D.h.a("selectWorld.enterSeed", new Object[0]), h / 2 - 100, 47, -6250336);
                            this.a(this.v, net.minecraft.client.D.h.a("selectWorld.seedInfo", new Object[0]), h / 2 - 100, 85, -6250336);
                            bl2 = this.W.l;
                            if (arrstring != null) {
                                if (bl2) {
                                    this.a(this.v, net.minecraft.client.D.h.a("selectWorld.mapFeatures.info", new Object[0]), h / 2 - 150, 122, -6250336);
                                }
                                bl2 = this.N.l;
                            }
                            if (arrstring == null) break block8;
                            if (bl2) {
                                this.a(this.v, net.minecraft.client.D.h.a("selectWorld.allowCommands.info", new Object[0]), h / 2 - 150, 172, -6250336);
                            }
                            this.D.d();
                            if (arrstring == null) break block9;
                            bl2 = net.minecraft.ah.L.d[this.J].i();
                        }
                        if (!bl2) break block10;
                        this.v.a(net.minecraft.client.D.h.a(net.minecraft.ah.L.d[this.J].c(), new Object[0]), this.K.o + 2, this.K.r + 22, this.K.a(), 0xA0A0A0);
                        if (arrstring != null) break block10;
                    }
                    this.a(this.v, net.minecraft.client.D.h.a("selectWorld.enterName", new Object[0]), h / 2 - 100, 47, -6250336);
                    this.a(this.v, net.minecraft.client.D.h.a("selectWorld.resultFolder", new Object[0]) + " " + this.Y, h / 2 - 100, 85, -6250336);
                    this.Q.d();
                    this.a(this.v, this.H, h / 2 - 100, 137, -6250336);
                    r2 = this;
                }
                r2.a(this.v, this.P, h / 2 - 100, 149, -6250336);
            }
            super.a(n2, n3, f10);
        }
    }

    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.t.clear();
        this.t.add(new s(0, h / 2 - 155, w - 28, 150, 20, net.minecraft.client.D.h.a("selectWorld.create", new Object[0])));
        this.t.add(new s(1, h / 2 + 5, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.S = this.b(new s(2, h / 2 - 75, 115, 150, 20, net.minecraft.client.D.h.a("selectWorld.gameMode", new Object[0])));
        this.O = this.b(new s(3, h / 2 - 75, 187, 150, 20, net.minecraft.client.D.h.a("selectWorld.moreWorldOptions", new Object[0])));
        this.W = this.b(new s(4, h / 2 - 155, 100, 150, 20, net.minecraft.client.D.h.a("selectWorld.mapFeatures", new Object[0])));
        this.W.l = false;
        this.R = this.b(new s(7, h / 2 + 5, 151, 150, 20, net.minecraft.client.D.h.a("selectWorld.bonusItems", new Object[0])));
        this.R.l = false;
        this.K = this.b(new s(5, h / 2 + 5, 100, 150, 20, net.minecraft.client.D.h.a("selectWorld.mapType", new Object[0])));
        this.K.l = false;
        this.N = this.b(new s(6, h / 2 - 155, 151, 150, 20, net.minecraft.client.D.h.a("selectWorld.allowCommands", new Object[0])));
        this.N.l = false;
        this.C = this.b(new s(8, h / 2 + 5, 120, 150, 20, net.minecraft.client.D.h.a("selectWorld.customizeType", new Object[0])));
        this.C.l = false;
        this.Q = new aq(9, this.v, h / 2 - 100, 60, 200, 20);
        this.Q.c(true);
        this.Q.a(this.U);
        this.D = new aq(10, this.v, h / 2 - 100, 60, 200, 20);
        this.D.a(this.G);
        this.b(this.B);
        this.a();
        this.d();
    }

    private void d() {
        block14: {
            block12: {
                R r2;
                block13: {
                    String[] arrstring;
                    block11: {
                        block9: {
                            R r3;
                            block10: {
                                block8: {
                                    block6: {
                                        R r4;
                                        block7: {
                                            this.S.m = net.minecraft.client.D.h.a("selectWorld.gameMode", new Object[0]) + ": " + net.minecraft.client.D.h.a("selectWorld.gameMode." + this.A, new Object[0]);
                                            this.H = net.minecraft.client.D.h.a("selectWorld.gameMode." + this.A + ".line1", new Object[0]);
                                            this.P = net.minecraft.client.D.h.a("selectWorld.gameMode." + this.A + ".line2", new Object[0]);
                                            this.W.m = net.minecraft.client.D.h.a("selectWorld.mapFeatures", new Object[0]) + " ";
                                            arrstring = q.b();
                                            r4 = this;
                                            if (arrstring == null) break block6;
                                            if (!r4.I) break block7;
                                            this.W.m = this.W.m + net.minecraft.client.D.h.a("options.on", new Object[0]);
                                            if (arrstring != null) break block8;
                                        }
                                        r4 = this;
                                    }
                                    r4.W.m = this.W.m + net.minecraft.client.D.h.a("options.off", new Object[0]);
                                }
                                this.R.m = net.minecraft.client.D.h.a("selectWorld.bonusItems", new Object[0]) + " ";
                                r3 = this;
                                if (arrstring == null) break block9;
                                if (!r3.L) break block10;
                                r3 = this;
                                if (arrstring == null) break block9;
                                if (r3.z) break block10;
                                this.R.m = this.R.m + net.minecraft.client.D.h.a("options.on", new Object[0]);
                                if (arrstring != null) break block11;
                            }
                            r3 = this;
                        }
                        r3.R.m = this.R.m + net.minecraft.client.D.h.a("options.off", new Object[0]);
                    }
                    this.K.m = net.minecraft.client.D.h.a("selectWorld.mapType", new Object[0]) + " " + net.minecraft.client.D.h.a(net.minecraft.ah.L.d[this.J].g(), new Object[0]);
                    this.N.m = net.minecraft.client.D.h.a("selectWorld.allowCommands", new Object[0]) + " ";
                    r2 = this;
                    if (arrstring == null) break block12;
                    if (!r2.V) break block13;
                    r2 = this;
                    if (arrstring == null) break block12;
                    if (r2.z) break block13;
                    this.N.m = this.N.m + net.minecraft.client.D.h.a("options.on", new Object[0]);
                    if (arrstring != null) break block14;
                }
                r2 = this;
            }
            r2.N.m = this.N.m + net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
    }

    static {
        X = new String[]{"CON", "COM", "PRN", "AUX", "CLOCK$", "NUL", "COM1", "COM2", "COM3", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "LPT1", "LPT2", "LPT3", "LPT4", "LPT5", "LPT6", "LPT7", "LPT8", "LPT9"};
    }

    public R(L l2) {
        this.A = "survival";
        this.I = true;
        this.T = "";
        this.y = l2;
        this.G = "";
        this.U = net.minecraft.client.D.h.a("selectWorld.newWorld", new Object[0]);
    }

    private void a() {
        block4: {
            this.Y = this.Q.n().trim();
            String[] arrstring = q.b();
            for (char c10 : net.minecraft.ar.X.b) {
                this.Y = this.Y.replace(c10, '_');
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block4;
            }
            R r2 = this;
            if (arrstring != null) {
                if (StringUtils.isEmpty((CharSequence)r2.Y)) {
                    this.Y = "World";
                }
                r2 = this;
            }
            r2.Y = net.minecraft.client.b.R.a(this.m.e(), this.Y);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void e() {
        this.Q.i();
        this.D.i();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        block58: {
            block59: {
                block43: {
                    block50: {
                        block51: {
                            block54: {
                                block57: {
                                    block55: {
                                        block56: {
                                            block52: {
                                                block53: {
                                                    block44: {
                                                        block45: {
                                                            block48: {
                                                                block49: {
                                                                    block46: {
                                                                        block47: {
                                                                            block42: {
                                                                                var2_2 = q.b();
                                                                                v0 = var1_1.h;
                                                                                if (var2_2 != null) {
                                                                                    if (v0 == 0) return;
                                                                                    v0 = var1_1.g;
                                                                                }
                                                                                if (var2_2 != null) {
                                                                                    if (v0 == 1) {
                                                                                        this.m.a(this.y);
                                                                                        if (var2_2 != null) return;
                                                                                    }
                                                                                    v0 = var1_1.g;
                                                                                }
                                                                                if (var2_2 == null) break block44;
                                                                                if (v0 != 0) break block45;
                                                                                this.m.a((L)null);
                                                                                v1 = this;
                                                                                if (var2_2 != null) {
                                                                                    if (v1.M) {
                                                                                        return;
                                                                                    }
                                                                                    v1 = this;
                                                                                }
                                                                                v1.M = true;
                                                                                var3_3 = new Random().nextLong();
                                                                                v2 = var5_4 = this.D.n();
                                                                                if (var2_2 == null) ** GOTO lbl26
                                                                                if (StringUtils.isEmpty((CharSequence)v2)) break block42;
                                                                                try {
                                                                                    v2 = var5_4;
lbl26:
                                                                                    // 2 sources

                                                                                    v3 = var6_5 = Long.parseLong(v2);
                                                                                    if (var2_2 != null) {
                                                                                        if (v3 == 0L) break block42;
                                                                                        v3 = var6_5;
                                                                                    }
                                                                                    var3_3 = v3;
                                                                                }
                                                                                catch (NumberFormatException var6_6) {
                                                                                    var3_3 = var5_4.hashCode();
                                                                                }
                                                                            }
                                                                            var6_7 = new K(var3_3, net.minecraft.ah.s.a(this.A), this.I, this.z, net.minecraft.ah.L.d[this.J]);
                                                                            var6_7.a(this.T);
                                                                            v4 = this.L;
                                                                            if (var2_2 == null) break block46;
                                                                            if (!v4) break block47;
                                                                            v4 = this.z;
                                                                            if (var2_2 == null) break block46;
                                                                            if (!v4) {
                                                                                var6_7.g();
                                                                            }
                                                                        }
                                                                        v5 = this;
                                                                        if (var2_2 == null) break block48;
                                                                        v4 = v5.V;
                                                                    }
                                                                    if (!v4) break block49;
                                                                    v5 = this;
                                                                    if (var2_2 == null) break block48;
                                                                    if (!v5.z) {
                                                                        var6_7.b();
                                                                    }
                                                                }
                                                                v5 = this;
                                                            }
                                                            v5.m.a(this.Y, this.Q.n().trim(), var6_7);
                                                            if (var2_2 != null) return;
                                                        }
                                                        v0 = var1_1.g;
                                                    }
                                                    v6 = 3;
                                                    if (var2_2 != null) {
                                                        if (v0 == v6) {
                                                            this.c();
                                                            if (var2_2 != null) return;
                                                        }
                                                        v0 = var1_1.g;
                                                        v6 = 2;
                                                    }
                                                    if (var2_2 == null) break block50;
                                                    if (v0 != v6) break block51;
                                                    v7 = "survival".equals(this.A);
                                                    if (var2_2 == null) break block52;
                                                    if (!v7) break block53;
                                                    v8 = this;
                                                    if (var2_2 != null) {
                                                        if (!v8.F) {
                                                            this.V = false;
                                                        }
                                                        this.z = false;
                                                        this.A = "hardcore";
                                                        this.z = true;
                                                        this.N.h = false;
                                                        this.R.h = false;
                                                        v8 = this;
                                                    }
                                                    v8.d();
                                                    if (var2_2 != null) break block54;
                                                }
                                                v7 = "hardcore".equals(this.A);
                                            }
                                            if (var2_2 == null) break block55;
                                            if (!v7) break block56;
                                            v9 = this;
                                            if (var2_2 != null) {
                                                if (!v9.F) {
                                                    this.V = true;
                                                }
                                                this.z = false;
                                                this.A = "creative";
                                                this.d();
                                                this.z = false;
                                                this.N.h = true;
                                                v9 = this;
                                            }
                                            v9.R.h = true;
                                            if (var2_2 != null) break block54;
                                        }
                                        v10 = this;
                                        if (var2_2 == null) break block57;
                                        v7 = v10.F;
                                    }
                                    if (!v7) {
                                        this.V = false;
                                    }
                                    this.A = "survival";
                                    this.d();
                                    this.N.h = true;
                                    this.R.h = true;
                                    v10 = this;
                                }
                                v10.z = false;
                            }
                            this.d();
                            if (var2_2 != null) return;
                        }
                        v0 = var1_1.g;
                        v6 = 4;
                    }
                    if (var2_2 != null) {
                        if (v0 == v6) {
                            v11 = this.I;
                            if (var2_2 != null) {
                                v11 = v11 == false;
                            }
                            this.I = v11;
                            this.d();
                            if (var2_2 != null) return;
                        }
                        v0 = var1_1.g;
                        v6 = 7;
                    }
                    if (var2_2 != null) {
                        if (v0 == v6) {
                            v12 = this.L;
                            if (var2_2 != null) {
                                v12 = v12 == false;
                            }
                            this.L = v12;
                            this.d();
                            if (var2_2 != null) return;
                        }
                        v0 = var1_1.g;
                        v6 = 5;
                    }
                    if (var2_2 == null) break block58;
                    if (v0 != v6) break block59;
                    v13 = ++this.J;
                    if (var2_2 == null) ** GOTO lbl155
                    if (v13 >= net.minecraft.ah.L.d.length) {
                        this.J = 0;
                    }
                    do lbl-1000:
                    // 3 sources

                    {
                        block60: {
                            v13 = this.b() ? 1 : 0;
lbl155:
                            // 2 sources

                            if (v13 != 0) break;
                            ++this.J;
                            v14 = this;
                            if (var2_2 == null) break block43;
                            if (var2_2 == null) break block60;
                            if (v14.J < net.minecraft.ah.L.d.length) ** GOTO lbl-1000
                            v15 = this;
                        }
                        v15.J = 0;
                    } while (var2_2 != null);
                    this.T = "";
                    this.d();
                    v14 = this;
                }
                v14.b(this.B);
                if (var2_2 != null) return;
            }
            v0 = var1_1.g;
            v6 = 6;
        }
        if (var2_2 != null) {
            if (v0 == v6) {
                this.F = true;
                v16 = this.V;
                if (var2_2 != null) {
                    v16 = v16 == false;
                }
                this.V = v16;
                this.d();
                if (var2_2 != null) return;
            }
            v0 = var1_1.g;
            v6 = 8;
        }
        if (v0 != v6) return;
        if (net.minecraft.ah.L.d[this.J] == net.minecraft.ah.L.g) {
            this.m.a(new Q(this, this.T));
            if (var2_2 != null) return;
        }
        this.m.a(new T(this, this.T));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(boolean var1_1) {
        block12: {
            block13: {
                block10: {
                    block11: {
                        var2_2 = q.b();
                        v0 = this;
                        if (var2_2 == null) break block10;
                        v0.B = var1_1;
                        if (net.minecraft.ah.L.d[this.J] != net.minecraft.ah.L.e) break block11;
                        v1 = this.B;
                        if (var2_2 != null) {
                            v1 = v1 == false;
                        }
                        this.S.l = v1;
                        this.S.h = false;
                        v2 = this;
                        if (var2_2 != null) {
                            if (v2.E == null) {
                                this.E = this.A;
                            }
                            this.A = "spectator";
                            this.W.l = false;
                            this.R.l = false;
                            this.K.l = this.B;
                            this.N.l = false;
                            v2 = this;
                        }
                        v2.C.l = false;
                        if (var2_2 != null) break block12;
                    }
                    v0 = this;
                }
                v3 = this.B;
                if (var2_2 != null) {
                    v3 = v3 == false;
                }
                v0.S.l = v3;
                this.S.h = true;
                v4 = this;
                if (var2_2 != null) {
                    if (v4.E != null) {
                        this.A = this.E;
                        this.E = null;
                    }
                    v4 = this;
                }
                v4.W.l = this.B != false && net.minecraft.ah.L.d[this.J] != net.minecraft.ah.L.i;
                this.R.l = this.B;
                this.K.l = this.B;
                this.N.l = this.B;
                if (!this.B) ** GOTO lbl-1000
                v5 = net.minecraft.ah.L.d[this.J];
                v6 = net.minecraft.ah.L.g;
                if (var2_2 == null) break block13;
                if (v5 == v6) ** GOTO lbl-1000
                v5 = net.minecraft.ah.L.d[this.J];
                v6 = net.minecraft.ah.L.i;
            }
            if (v5 == v6) lbl-1000:
            // 2 sources

            {
                v7 = true;
            } else lbl-1000:
            // 2 sources

            {
                v7 = false;
            }
            this.C.l = v7;
        }
        this.d();
        v8 = this;
        if (var2_2 != null) {
            if (v8.B) {
                this.O.m = net.minecraft.client.D.h.a("gui.done", new Object[0]);
                if (var2_2 != null) return;
            }
            v8 = this;
        }
        v8.O.m = net.minecraft.client.D.h.a("selectWorld.moreWorldOptions", new Object[0]);
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        net.minecraft.ah.L l2 = net.minecraft.ah.L.d[this.J];
        String[] arrstring = q.b();
        net.minecraft.ah.L l3 = l2;
        if (arrstring != null) {
            if (l3 == null) return false;
            l3 = l2;
        }
        boolean bl2 = l3.a();
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        if (l2 != net.minecraft.ah.L.e) return true;
        boolean bl3 = net.minecraft.client.b.R.o();
        if (arrstring == null) return bl3;
        if (!bl3) return false;
        return true;
    }
}

