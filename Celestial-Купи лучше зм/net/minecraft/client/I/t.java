/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  io.netty.buffer.Unpooled
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.I;

import com.google.common.collect.Lists;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.Locale;
import net.minecraft.N.Y;
import net.minecraft.N.r;
import net.minecraft.ar.X;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.client.I.a;
import net.minecraft.client.I.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import net.minecraft.k.m;
import net.minecraft.k.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class t
extends L {
    private /* synthetic */ aq ag;
    private /* synthetic */ boolean F;
    private /* synthetic */ s U;
    private /* synthetic */ aq ac;
    private /* synthetic */ s ab;
    private /* synthetic */ s N;
    private static final /* synthetic */ Logger S;
    private /* synthetic */ s T;
    private /* synthetic */ s D;
    private /* synthetic */ s O;
    private /* synthetic */ aq V;
    private final /* synthetic */ DecimalFormat H;
    private /* synthetic */ h ad;
    private /* synthetic */ aq E;
    private /* synthetic */ aq y;
    private final /* synthetic */ Y P;
    private /* synthetic */ aq L;
    private /* synthetic */ s ae;
    private /* synthetic */ s Z;
    private /* synthetic */ s aa;
    private /* synthetic */ aq z;
    private /* synthetic */ ae Y;
    private /* synthetic */ aq W;
    private /* synthetic */ s C;
    private /* synthetic */ boolean B;
    private /* synthetic */ aq M;
    private /* synthetic */ s I;
    private /* synthetic */ s G;
    private final /* synthetic */ List<aq> R;
    private /* synthetic */ s Q;
    private /* synthetic */ aq af;
    private /* synthetic */ boolean J;
    private /* synthetic */ s A;
    private /* synthetic */ r X;
    public static final /* synthetic */ int[] K;

    private void d() {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    boolean bl2 = this.P.v();
                    arrn = net.minecraft.client.I.v.a();
                    if (arrn != null) break block0;
                    if (!bl2) break block1;
                    this.D.m = net.minecraft.client.D.h.a("options.on", new Object[0]);
                }
                if (arrn == null) break block2;
            }
            this.D.m = net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
    }

    private void b() {
        this.W.c(false);
        this.ac.c(false);
        int[] arrn = net.minecraft.client.I.v.a();
        this.y.c(false);
        this.z.c(false);
        this.af.c(false);
        this.L.c(false);
        int[] arrn2 = arrn;
        this.M.c(false);
        this.V.c(false);
        this.E.c(false);
        this.ag.c(false);
        this.W.e(false);
        this.W.c(false);
        this.ac.e(false);
        this.y.e(false);
        this.z.e(false);
        this.af.e(false);
        this.L.e(false);
        this.M.e(false);
        this.V.e(false);
        this.E.e(false);
        this.ag.e(false);
        this.O.l = false;
        this.I.l = false;
        this.U.l = false;
        this.aa.l = false;
        this.Z.l = false;
        this.C.l = false;
        this.A.l = false;
        this.G.l = false;
        this.T.l = false;
        this.Q.l = false;
        this.D.l = false;
        if (arrn2 == null) {
            switch (this.P.o()) {
                case SAVE: {
                    this.W.e(true);
                    this.W.c(true);
                    this.ac.e(true);
                    this.y.e(true);
                    this.z.e(true);
                    this.af.e(true);
                    this.L.e(true);
                    this.M.e(true);
                    this.O.l = true;
                    this.U.l = true;
                    this.aa.l = true;
                    this.Q.l = true;
                    if (arrn2 == null) break;
                }
                case LOAD: {
                    this.W.e(true);
                    this.W.c(true);
                    this.ac.e(true);
                    this.y.e(true);
                    this.z.e(true);
                    this.V.e(true);
                    this.E.e(true);
                    this.I.l = true;
                    this.aa.l = true;
                    this.Z.l = true;
                    this.C.l = true;
                    this.A.l = true;
                    this.G.l = true;
                    this.T.l = true;
                    this.D.l = true;
                    this.a();
                    if (arrn2 == null) break;
                }
                case CORNER: {
                    this.W.e(true);
                    this.W.c(true);
                    if (arrn2 == null) break;
                }
                case DATA: {
                    this.ag.e(true);
                    this.ag.c(true);
                    break;
                }
            }
            this.ae.m = net.minecraft.client.D.h.a("structure_block.mode." + this.P.o().a(), new Object[0]);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        int n4;
        String string;
        r r2;
        r r3;
        int[] arrn;
        r r4;
        block12: {
            block13: {
                block11: {
                    block10: {
                        this.n();
                        r4 = this.P.o();
                        int[] arrn2 = net.minecraft.client.I.v.a();
                        this.b(this.v, net.minecraft.client.D.h.a("tile.structureBlock.name", new Object[0]), h / 2, 10, 0xFFFFFF);
                        arrn = arrn2;
                        r3 = r4;
                        r2 = net.minecraft.N.r.DATA;
                        if (arrn == null) {
                            if (r3 != r2) {
                                this.a(this.v, net.minecraft.client.D.h.a("structure_block.structure_name", new Object[0]), h / 2 - 153, 30, 0xA0A0A0);
                                this.W.d();
                            }
                            r3 = r4;
                            r2 = net.minecraft.N.r.LOAD;
                        }
                        if (arrn != null) break block10;
                        if (r3 == r2) break block11;
                        r3 = r4;
                        r2 = net.minecraft.N.r.SAVE;
                    }
                    if (arrn != null) break block12;
                    if (r3 != r2) break block13;
                }
                this.a(this.v, net.minecraft.client.D.h.a("structure_block.position", new Object[0]), h / 2 - 153, 70, 0xA0A0A0);
                this.ac.d();
                this.y.d();
                this.z.d();
                string = net.minecraft.client.D.h.a("structure_block.include_entities", new Object[0]);
                n4 = this.v.e(string);
                this.a(this.v, string, h / 2 + 154 - n4, 150, 0xA0A0A0);
            }
            r3 = r4;
            r2 = net.minecraft.N.r.SAVE;
        }
        if (arrn == null) {
            if (r3 == r2) {
                this.a(this.v, net.minecraft.client.D.h.a("structure_block.size", new Object[0]), h / 2 - 153, 110, 0xA0A0A0);
                this.af.d();
                this.L.d();
                this.M.d();
                string = net.minecraft.client.D.h.a("structure_block.detect_size", new Object[0]);
                n4 = this.v.e(string);
                this.a(this.v, string, h / 2 + 154 - n4, 110, 0xA0A0A0);
                String string2 = net.minecraft.client.D.h.a("structure_block.show_air", new Object[0]);
                int n5 = this.v.e(string2);
                this.a(this.v, string2, h / 2 + 154 - n5, 70, 0xA0A0A0);
            }
            r3 = r4;
            r2 = net.minecraft.N.r.LOAD;
        }
        if (arrn == null) {
            if (r3 == r2) {
                this.a(this.v, net.minecraft.client.D.h.a("structure_block.integrity", new Object[0]), h / 2 - 153, 110, 0xA0A0A0);
                this.V.d();
                this.E.d();
                string = net.minecraft.client.D.h.a("structure_block.show_boundingbox", new Object[0]);
                n4 = this.v.e(string);
                this.a(this.v, string, h / 2 + 154 - n4, 70, 0xA0A0A0);
            }
            r3 = r4;
            r2 = net.minecraft.N.r.DATA;
        }
        if (r3 == r2) {
            this.a(this.v, net.minecraft.client.D.h.a("structure_block.custom_data", new Object[0]), h / 2 - 153, 110, 0xA0A0A0);
            this.ag.d();
        }
        string = "structure_block.mode_info." + r4.a();
        this.a(this.v, net.minecraft.client.D.h.a(string, new Object[0]), h / 2 - 153, 174, 0xA0A0A0);
        super.a(n2, n3, f10);
    }

    private static boolean a(char c10, int n2) {
        int n3;
        block7: {
            int n4;
            int n5 = 1;
            int[] arrn = net.minecraft.client.I.v.a();
            Object[] arrobject = K;
            int n6 = arrobject.length;
            int n7 = 0;
            while (n7 < n6) {
                n4 = arrobject[n7];
                if (arrn == null) {
                    if (n4 == n2) {
                        return true;
                    }
                    ++n7;
                }
                if (arrn == null) continue;
            }
            arrobject = net.minecraft.ar.X.a;
            n6 = arrobject.length;
            n7 = 0;
            while (n7 < n6) {
                n4 = arrobject[n7];
                if (arrn == null) {
                    n3 = n4;
                    if (arrn != null) break block7;
                    if (n3 == c10) {
                        n5 = 0;
                        if (arrn == null) break;
                    }
                    ++n7;
                }
                if (arrn == null) continue;
            }
            n3 = n5;
        }
        return n3 != 0;
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public void e() {
        this.W.i();
        this.ac.i();
        this.y.i();
        this.z.i();
        this.af.i();
        this.L.i();
        this.M.i();
        this.V.i();
        this.E.i();
        this.ag.i();
    }

    private float c(String string) {
        try {
            return Float.valueOf(string).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            return 1.0f;
        }
    }

    static {
        S = LogManager.getLogger();
        K = new int[]{203, 205, 14, 211, 199, 207};
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(char var1_1, int var2_2) throws IOException {
        block60: {
            block61: {
                block59: {
                    block49: {
                        block46: {
                            block45: {
                                block58: {
                                    block57: {
                                        block52: {
                                            block53: {
                                                block47: {
                                                    block48: {
                                                        var3_3 = net.minecraft.client.I.v.a();
                                                        v0 = this.W.j();
                                                        if (var3_3 != null) break block47;
                                                        if (v0 == 0) break block48;
                                                        v0 = net.minecraft.client.I.t.a(var1_1, var2_2);
                                                        if (var3_3 != null) break block47;
                                                        if (v0 != 0) {
                                                            this.W.a(var1_1, var2_2);
                                                        }
                                                    }
                                                    v0 = this.ac.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.ac.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.y.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.y.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.z.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.z.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.af.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.af.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.L.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.L.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.M.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.M.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.V.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.V.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.E.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.E.a(var1_1, var2_2);
                                                    }
                                                    v0 = this.ag.j();
                                                }
                                                if (var3_3 == null) {
                                                    if (v0 != 0) {
                                                        this.ag.a(var1_1, var2_2);
                                                    }
                                                    v0 = var2_2;
                                                }
                                                v1 = 15;
                                                if (var3_3 != null) break block49;
                                                if (v0 != v1) break block45;
                                                var4_4 = null;
                                                var5_5 = null;
                                                for (aq var7_7 : this.R) {
                                                    block51: {
                                                        block50: {
                                                            if (var3_3 != null) break block45;
                                                            v2 = var4_4;
                                                            if (var3_3 != null) ** GOTO lbl75
                                                            if (v2 != null) {
                                                                v3 = var7_7.j();
                                                                if (var3_3 == null) {
                                                                    if (v3) {
                                                                        var5_5 = var7_7;
                                                                        break;
                                                                    } else {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                }
                                                            } else lbl-1000:
                                                            // 3 sources

                                                            {
                                                                v2 = var7_7;
lbl75:
                                                                // 2 sources

                                                                v3 = v2.b();
                                                            }
                                                            if (var3_3 != null) break block50;
                                                            if (!v3) continue;
                                                            v4 = var7_7;
                                                            if (var3_3 != null) break block51;
                                                            v3 = v4.j();
                                                        }
                                                        if (!v3) continue;
                                                        v4 = var7_7;
                                                    }
                                                    var4_4 = v4;
                                                }
                                                v5 = var4_4;
                                                if (var3_3 != null) break block52;
                                                if (v5 == null) break block53;
                                                v5 = var5_5;
                                                if (var3_3 != null) break block52;
                                                if (v5 != null) break block53;
                                                var6_6 = this.R.iterator();
                                                while (var6_6.hasNext()) {
                                                    block55: {
                                                        block56: {
                                                            block54: {
                                                                v6 = var7_7 = var6_6.next();
                                                                if (var3_3 != null) break block54;
                                                                v0 = v6.j() ? 1 : 0;
                                                                if (var3_3 != null) break block46;
                                                                if (v0 == 0) break block55;
                                                                v6 = var7_7;
                                                            }
                                                            if (var3_3 != null) break block56;
                                                            if (v6 == var4_4) break block55;
                                                            v6 = var5_5 = var7_7;
                                                        }
                                                        if (var3_3 == null) break;
                                                    }
                                                    if (var3_3 == null) continue;
                                                }
                                            }
                                            v5 = var5_5;
                                        }
                                        if (var3_3 != null) break block57;
                                        if (v5 == null) break block45;
                                        v5 = var5_5;
                                    }
                                    if (var3_3 != null) break block58;
                                    if (v5 == var4_4) break block45;
                                    var4_4.c(false);
                                    v5 = var5_5;
                                }
                                v5.c(true);
                            }
                            v0 = var2_2;
                        }
                        v1 = 28;
                    }
                    if (var3_3 != null) break block59;
                    if (v0 == v1) break block60;
                    v0 = var2_2;
                    v1 = 156;
                }
                if (var3_3 != null) break block61;
                if (v0 == v1) break block60;
                v0 = var2_2;
                v1 = 1;
            }
            if (v0 != v1) return;
            this.a(this.ab);
            if (var3_3 == null) return;
        }
        this.a(this.N);
    }

    private void g() {
        block3: {
            block2: {
                int[] arrn;
                block1: {
                    boolean bl2;
                    arrn = net.minecraft.client.I.v.a();
                    boolean bl3 = this.P.b();
                    if (arrn == null) {
                        bl3 = bl2 = !bl3;
                    }
                    if (arrn != null) break block1;
                    if (!bl2) break block2;
                    this.aa.m = net.minecraft.client.D.h.a("options.on", new Object[0]);
                }
                if (arrn == null) break block3;
            }
            this.aa.m = net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
    }

    @Override
    public void r() {
        Keyboard.enableRepeatEvents((boolean)true);
        this.t.clear();
        this.N = this.b(new s(0, h / 2 - 4 - 150, 210, 150, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        this.ab = this.b(new s(1, h / 2 + 4, 210, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.O = this.b(new s(9, h / 2 + 4 + 100, 185, 50, 20, net.minecraft.client.D.h.a("structure_block.button.save", new Object[0])));
        this.I = this.b(new s(10, h / 2 + 4 + 100, 185, 50, 20, net.minecraft.client.D.h.a("structure_block.button.load", new Object[0])));
        this.ae = this.b(new s(18, h / 2 - 4 - 150, 185, 50, 20, "MODE"));
        this.U = this.b(new s(19, h / 2 + 4 + 100, 120, 50, 20, net.minecraft.client.D.h.a("structure_block.button.detect_size", new Object[0])));
        this.aa = this.b(new s(20, h / 2 + 4 + 100, 160, 50, 20, "ENTITIES"));
        this.Z = this.b(new s(21, h / 2 - 20, 185, 40, 20, "MIRROR"));
        this.Q = this.b(new s(22, h / 2 + 4 + 100, 80, 50, 20, "SHOWAIR"));
        this.D = this.b(new s(23, h / 2 + 4 + 100, 80, 50, 20, "SHOWBB"));
        this.C = this.b(new s(11, h / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20, "0"));
        this.A = this.b(new s(12, h / 2 - 1 - 40 - 20, 185, 40, 20, "90"));
        this.G = this.b(new s(13, h / 2 + 1 + 20, 185, 40, 20, "180"));
        this.T = this.b(new s(14, h / 2 + 1 + 40 + 1 + 20, 185, 40, 20, "270"));
        int[] arrn = net.minecraft.client.I.v.a();
        this.W = new aq(2, this.v, h / 2 - 152, 40, 300, 20);
        this.W.b(64);
        this.W.a(this.P.f());
        int[] arrn2 = arrn;
        this.R.add(this.W);
        n n2 = this.P.d();
        this.ac = new aq(3, this.v, h / 2 - 152, 80, 80, 20);
        this.ac.b(15);
        this.ac.a(Integer.toString(n2.e()));
        this.R.add(this.ac);
        this.y = new aq(4, this.v, h / 2 - 72, 80, 80, 20);
        this.y.b(15);
        this.y.a(Integer.toString(n2.b()));
        this.R.add(this.y);
        this.z = new aq(5, this.v, h / 2 + 8, 80, 80, 20);
        this.z.b(15);
        this.z.a(Integer.toString(n2.a()));
        this.R.add(this.z);
        n n3 = this.P.k();
        this.af = new aq(6, this.v, h / 2 - 152, 120, 80, 20);
        this.af.b(15);
        this.af.a(Integer.toString(n3.e()));
        this.R.add(this.af);
        this.L = new aq(7, this.v, h / 2 - 72, 120, 80, 20);
        this.L.b(15);
        this.L.a(Integer.toString(n3.b()));
        this.R.add(this.L);
        this.M = new aq(8, this.v, h / 2 + 8, 120, 80, 20);
        this.M.b(15);
        this.M.a(Integer.toString(n3.a()));
        this.R.add(this.M);
        this.V = new aq(15, this.v, h / 2 - 152, 120, 80, 20);
        this.V.b(15);
        this.V.a(this.H.format(this.P.c()));
        this.R.add(this.V);
        this.E = new aq(16, this.v, h / 2 - 72, 120, 80, 20);
        this.E.b(31);
        this.E.a(Long.toString(this.P.n()));
        this.R.add(this.E);
        this.ag = new aq(17, this.v, h / 2 - 152, 120, 240, 20);
        this.ag.b(128);
        this.ag.a(this.P.h());
        this.R.add(this.ag);
        this.ad = this.P.s();
        this.i();
        this.Y = this.P.e();
        this.a();
        this.X = this.P.o();
        this.b();
        this.J = this.P.b();
        this.g();
        this.B = this.P.l();
        this.c();
        this.F = this.P.v();
        this.d();
        if (arrn2 != null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private boolean a(int n2) {
        try {
            net.minecraft.C.m m2 = new net.minecraft.C.m(Unpooled.buffer());
            this.P.a(m2);
            m2.writeByte(n2);
            m2.a(this.P.o().toString());
            m2.a(this.W.n());
            m2.writeInt(this.b(this.ac.n()));
            m2.writeInt(this.b(this.y.n()));
            m2.writeInt(this.b(this.z.n()));
            m2.writeInt(this.b(this.af.n()));
            m2.writeInt(this.b(this.L.n()));
            m2.writeInt(this.b(this.M.n()));
            m2.a(this.P.s().toString());
            m2.a(this.P.e().toString());
            m2.a(this.ag.n());
            m2.writeBoolean(this.P.b());
            m2.writeBoolean(this.P.l());
            m2.writeBoolean(this.P.v());
            m2.writeFloat(this.c(this.V.n()));
            m2.a(this.a(this.E.n()));
            this.m.ar().a(new net.minecraft.d.h("MC|Struct", m2));
            return true;
        }
        catch (Exception exception) {
            S.warn("Could not send structure block info", (Throwable)exception);
            return false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void i() {
        var2_1 = this.P.s();
        var1_2 = net.minecraft.client.I.v.a();
        if (var1_2 != null) ** GOTO lbl7
        switch (net.minecraft.client.I.a.a[var2_1.ordinal()]) {
            case 1: {
                this.Z.m = "|";
lbl7:
                // 2 sources

                if (var1_2 == null) return;
            }
            case 2: {
                this.Z.m = "< >";
                if (var1_2 == null) return;
            }
            case 3: {
                this.Z.m = "^ v";
                return;
            }
        }
    }

    @Override
    public boolean i() {
        return false;
    }

    private long a(String string) {
        try {
            return Long.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    private int b(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    private void c() {
        block2: {
            block1: {
                int[] arrn;
                block0: {
                    boolean bl2 = this.P.l();
                    arrn = net.minecraft.client.I.v.a();
                    if (arrn != null) break block0;
                    if (!bl2) break block1;
                    this.Q.m = net.minecraft.client.D.h.a("options.on", new Object[0]);
                }
                if (arrn == null) break block2;
            }
            this.Q.m = net.minecraft.client.D.h.a("options.off", new Object[0]);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        int[] arrn = net.minecraft.client.I.v.a();
        super.a(n2, n3, n4);
        int[] arrn2 = arrn;
        boolean bl2 = this.W.j();
        if (arrn2 == null) {
            if (bl2) {
                this.W.a(n2, n3, n4);
            }
            bl2 = this.ac.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.ac.a(n2, n3, n4);
            }
            bl2 = this.y.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.y.a(n2, n3, n4);
            }
            bl2 = this.z.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.z.a(n2, n3, n4);
            }
            bl2 = this.af.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.af.a(n2, n3, n4);
            }
            bl2 = this.L.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.L.a(n2, n3, n4);
            }
            bl2 = this.M.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.M.a(n2, n3, n4);
            }
            bl2 = this.V.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.V.a(n2, n3, n4);
            }
            bl2 = this.E.j();
        }
        if (arrn2 == null) {
            if (bl2) {
                this.E.a(n2, n3, n4);
            }
            bl2 = this.ag.j();
        }
        if (arrn2 == null && bl2) {
            bl2 = this.ag.a(n2, n3, n4);
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block12: {
            int n2;
            int[] arrn;
            block43: {
                int n3;
                block41: {
                    block42: {
                        block39: {
                            block40: {
                                block37: {
                                    block38: {
                                        block34: {
                                            block35: {
                                                t t2;
                                                block36: {
                                                    block32: {
                                                        block33: {
                                                            block30: {
                                                                block31: {
                                                                    block28: {
                                                                        block29: {
                                                                            block26: {
                                                                                block27: {
                                                                                    block24: {
                                                                                        block25: {
                                                                                            block21: {
                                                                                                block22: {
                                                                                                    t t3;
                                                                                                    block23: {
                                                                                                        block18: {
                                                                                                            block19: {
                                                                                                                t t4;
                                                                                                                block20: {
                                                                                                                    block15: {
                                                                                                                        block16: {
                                                                                                                            t t5;
                                                                                                                            block17: {
                                                                                                                                block13: {
                                                                                                                                    block14: {
                                                                                                                                        block11: {
                                                                                                                                            arrn = net.minecraft.client.I.v.a();
                                                                                                                                            n2 = s2.h;
                                                                                                                                            if (arrn != null) break block11;
                                                                                                                                            if (n2 == 0) break block12;
                                                                                                                                            n2 = s2.g;
                                                                                                                                        }
                                                                                                                                        if (arrn != null) break block13;
                                                                                                                                        if (n2 != 1) break block14;
                                                                                                                                        this.P.b(this.ad);
                                                                                                                                        this.P.b(this.Y);
                                                                                                                                        this.P.a(this.X);
                                                                                                                                        this.P.a(this.J);
                                                                                                                                        this.P.f(this.B);
                                                                                                                                        this.P.e(this.F);
                                                                                                                                        this.m.a((L)null);
                                                                                                                                        if (arrn == null) break block12;
                                                                                                                                    }
                                                                                                                                    n2 = s2.g;
                                                                                                                                }
                                                                                                                                if (arrn != null) break block15;
                                                                                                                                if (n2 != 0) break block16;
                                                                                                                                t5 = this;
                                                                                                                                if (arrn != null) break block17;
                                                                                                                                if (!t5.a(1)) break block12;
                                                                                                                                t5 = this;
                                                                                                                            }
                                                                                                                            t5.m.a((L)null);
                                                                                                                            if (arrn == null) break block12;
                                                                                                                        }
                                                                                                                        n2 = s2.g;
                                                                                                                    }
                                                                                                                    n3 = 9;
                                                                                                                    if (arrn != null) break block18;
                                                                                                                    if (n2 != n3) break block19;
                                                                                                                    t4 = this;
                                                                                                                    if (arrn != null) break block20;
                                                                                                                    if (t4.P.o() != net.minecraft.N.r.SAVE) break block12;
                                                                                                                    this.a(2);
                                                                                                                    t4 = this;
                                                                                                                }
                                                                                                                t4.m.a((L)null);
                                                                                                                if (arrn == null) break block12;
                                                                                                            }
                                                                                                            n2 = s2.g;
                                                                                                            n3 = 10;
                                                                                                        }
                                                                                                        if (arrn != null) break block21;
                                                                                                        if (n2 != n3) break block22;
                                                                                                        t3 = this;
                                                                                                        if (arrn != null) break block23;
                                                                                                        if (t3.P.o() != net.minecraft.N.r.LOAD) break block12;
                                                                                                        this.a(3);
                                                                                                        t3 = this;
                                                                                                    }
                                                                                                    t3.m.a((L)null);
                                                                                                    if (arrn == null) break block12;
                                                                                                }
                                                                                                n2 = s2.g;
                                                                                                n3 = 11;
                                                                                            }
                                                                                            if (arrn != null) break block24;
                                                                                            if (n2 != n3) break block25;
                                                                                            this.P.b(net.minecraft.ar.ae.NONE);
                                                                                            this.a();
                                                                                            if (arrn == null) break block12;
                                                                                        }
                                                                                        n2 = s2.g;
                                                                                        n3 = 12;
                                                                                    }
                                                                                    if (arrn != null) break block26;
                                                                                    if (n2 != n3) break block27;
                                                                                    this.P.b(net.minecraft.ar.ae.CLOCKWISE_90);
                                                                                    this.a();
                                                                                    if (arrn == null) break block12;
                                                                                }
                                                                                n2 = s2.g;
                                                                                n3 = 13;
                                                                            }
                                                                            if (arrn != null) break block28;
                                                                            if (n2 != n3) break block29;
                                                                            this.P.b(net.minecraft.ar.ae.CLOCKWISE_180);
                                                                            this.a();
                                                                            if (arrn == null) break block12;
                                                                        }
                                                                        n2 = s2.g;
                                                                        n3 = 14;
                                                                    }
                                                                    if (arrn != null) break block30;
                                                                    if (n2 != n3) break block31;
                                                                    this.P.b(net.minecraft.ar.ae.COUNTERCLOCKWISE_90);
                                                                    this.a();
                                                                    if (arrn == null) break block12;
                                                                }
                                                                n2 = s2.g;
                                                                n3 = 18;
                                                            }
                                                            if (arrn != null) break block32;
                                                            if (n2 != n3) break block33;
                                                            this.P.r();
                                                            this.b();
                                                            if (arrn == null) break block12;
                                                        }
                                                        n2 = s2.g;
                                                        n3 = 19;
                                                    }
                                                    if (arrn != null) break block34;
                                                    if (n2 != n3) break block35;
                                                    t2 = this;
                                                    if (arrn != null) break block36;
                                                    if (t2.P.o() != net.minecraft.N.r.SAVE) break block12;
                                                    this.a(4);
                                                    t2 = this;
                                                }
                                                t2.m.a((L)null);
                                                if (arrn == null) break block12;
                                            }
                                            n2 = s2.g;
                                            n3 = 20;
                                        }
                                        if (arrn != null) break block37;
                                        if (n2 != n3) break block38;
                                        boolean bl2 = this.P.b();
                                        if (arrn == null) {
                                            bl2 = !bl2;
                                        }
                                        this.P.a(bl2);
                                        this.g();
                                        if (arrn == null) break block12;
                                    }
                                    n2 = s2.g;
                                    n3 = 22;
                                }
                                if (arrn != null) break block39;
                                if (n2 != n3) break block40;
                                boolean bl3 = this.P.l();
                                if (arrn == null) {
                                    bl3 = !bl3;
                                }
                                this.P.f(bl3);
                                this.c();
                                if (arrn == null) break block12;
                            }
                            n2 = s2.g;
                            n3 = 23;
                        }
                        if (arrn != null) break block41;
                        if (n2 != n3) break block42;
                        boolean bl4 = this.P.v();
                        if (arrn == null) {
                            bl4 = !bl4;
                        }
                        this.P.e(bl4);
                        this.d();
                        if (arrn == null) break block12;
                    }
                    n2 = s2.g;
                    if (arrn != null) break block43;
                    n3 = 21;
                }
                if (n2 != n3) break block12;
                n2 = net.minecraft.client.I.a.a[this.P.s().ordinal()];
            }
            switch (n2) {
                case 1: {
                    this.P.b(net.minecraft.ar.h.LEFT_RIGHT);
                    if (arrn == null) break;
                }
                case 2: {
                    this.P.b(net.minecraft.ar.h.FRONT_BACK);
                    if (arrn == null) break;
                }
                case 3: {
                    this.P.b(net.minecraft.ar.h.NONE);
                    break;
                }
            }
            this.i();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void a() {
        this.C.h = true;
        this.A.h = true;
        this.G.h = true;
        var1_1 = net.minecraft.client.I.v.a();
        this.T.h = true;
        if (var1_1 != null) ** GOTO lbl10
        switch (net.minecraft.client.I.a.b[this.P.e().ordinal()]) {
            case 1: {
                this.C.h = false;
lbl10:
                // 2 sources

                if (var1_1 == null) return;
            }
            case 2: {
                this.G.h = false;
                if (var1_1 == null) return;
            }
            case 3: {
                this.T.h = false;
                if (var1_1 == null) return;
            }
            case 4: {
                this.A.h = false;
                return;
            }
        }
    }

    public t(Y y2) {
        this.ad = net.minecraft.ar.h.NONE;
        this.Y = net.minecraft.ar.ae.NONE;
        this.X = net.minecraft.N.r.DATA;
        this.R = Lists.newArrayList();
        this.H = new DecimalFormat("0.0###");
        this.P = y2;
        this.H.setDecimalFormatSymbols(new DecimalFormatSymbols(Locale.US));
    }
}

