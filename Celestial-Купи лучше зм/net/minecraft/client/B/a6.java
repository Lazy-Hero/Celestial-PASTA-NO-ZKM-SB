/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonParseException
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import com.google.gson.JsonParseException;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.C.m;
import net.minecraft.I.a;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.P.w;
import net.minecraft.ar.X;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.at.l;
import net.minecraft.at.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.D;
import net.minecraft.client.b.L;
import net.minecraft.client.b.c;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.d.h;
import net.minecraft.i.j;
import net.minecraft.w.a4;
import net.minecraft.w.d;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class a6
extends L {
    private /* synthetic */ int H;
    private /* synthetic */ s y;
    private /* synthetic */ s B;
    private /* synthetic */ D J;
    private final /* synthetic */ int A = 192;
    private static final /* synthetic */ Logger R;
    private /* synthetic */ s G;
    private /* synthetic */ boolean z;
    private final /* synthetic */ int N = 192;
    private final /* synthetic */ boolean D;
    private /* synthetic */ String Q;
    private /* synthetic */ s L;
    private static final /* synthetic */ net.minecraft.ar.v C;
    private /* synthetic */ boolean F;
    private /* synthetic */ u P;
    private /* synthetic */ int O;
    private /* synthetic */ int I;
    private /* synthetic */ D T;
    private /* synthetic */ int E;
    private /* synthetic */ List<k> S;
    private final /* synthetic */ j M;
    private final /* synthetic */ d K;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, int var2_2, float var3_3) {
        block22: {
            block34: {
                block35: {
                    block32: {
                        block30: {
                            block16: {
                                block33: {
                                    block26: {
                                        block27: {
                                            block31: {
                                                block28: {
                                                    block29: {
                                                        block25: {
                                                            block23: {
                                                                block24: {
                                                                    block18: {
                                                                        block20: {
                                                                            block21: {
                                                                                block19: {
                                                                                    block17: {
                                                                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                        v0 = q.b();
                                                                                        this.m.aN().b(a6.C);
                                                                                        var4_4 = v0;
                                                                                        var5_5 = (a6.h - 192) / 2;
                                                                                        var6_6 = 2;
                                                                                        this.a(var5_5, 2, 0, 0, 192, 192);
                                                                                        v1 = this;
                                                                                        if (var4_4 == null) break block17;
                                                                                        if (!v1.z) break block18;
                                                                                        v1 = this;
                                                                                    }
                                                                                    var7_7 = v1.Q;
                                                                                    v2 = this.D;
                                                                                    if (var4_4 == null) break block19;
                                                                                    if (v2 == 0) break block20;
                                                                                    v2 = this.I / 6 % 2;
                                                                                }
                                                                                if (v2 != 0) break block21;
                                                                                var7_7 = var7_7 + "" + (Object)net.minecraft.at.l.BLACK + "_";
                                                                                if (var4_4 != null) break block20;
                                                                            }
                                                                            var7_7 = var7_7 + "" + (Object)net.minecraft.at.l.GRAY + "_";
                                                                        }
                                                                        var8_8 = net.minecraft.client.D.h.a("book.editTitle", new Object[0]);
                                                                        var9_9 = this.v.e(var8_8);
                                                                        this.v.b(var8_8, var5_5 + 36 + (116 - var9_9) / 2, 34.0f, 0);
                                                                        var10_12 = this.v.e(var7_7);
                                                                        this.v.b(var7_7, var5_5 + 36 + (116 - var10_12) / 2, 50.0f, 0);
                                                                        var11_13 = net.minecraft.client.D.h.a("book.byAuthor", new Object[]{this.M.g()});
                                                                        var12_16 = this.v.e(var11_13);
                                                                        this.v.b((Object)net.minecraft.at.l.DARK_GRAY + var11_13, var5_5 + 36 + (116 - var12_16) / 2, 60.0f, 0);
                                                                        var13_18 = net.minecraft.client.D.h.a("book.finalizeWarning", new Object[0]);
                                                                        this.v.a(var13_18, var5_5 + 36, 82, 116, 0);
                                                                        if (var4_4 != null) break block22;
                                                                    }
                                                                    var7_7 = net.minecraft.client.D.h.a("book.pageIndicator", new Object[]{this.H + 1, this.O});
                                                                    var8_8 = "";
                                                                    v3 = this;
                                                                    if (var4_4 == null) break block23;
                                                                    if (v3.P == null) break block24;
                                                                    v4 = this.H;
                                                                    if (var4_4 == null) break block25;
                                                                    if (v4 < 0) break block24;
                                                                    v4 = this.H;
                                                                    if (var4_4 == null) break block25;
                                                                    if (v4 < this.P.b()) {
                                                                        var8_8 = this.P.c(this.H);
                                                                    }
                                                                }
                                                                v3 = this;
                                                            }
                                                            v4 = v3.D;
                                                        }
                                                        if (var4_4 == null) break block26;
                                                        if (v4 == 0) break block27;
                                                        v5 = this.v.b();
                                                        if (var4_4 == null) break block28;
                                                        if (v5 == 0) break block29;
                                                        var8_8 = var8_8 + "_";
                                                        if (var4_4 != null) break block30;
                                                    }
                                                    v5 = this.I / 6 % 2;
                                                }
                                                if (v5 != 0) break block31;
                                                var8_8 = var8_8 + "" + (Object)net.minecraft.at.l.BLACK + "_";
                                                if (var4_4 != null) break block30;
                                            }
                                            var8_8 = var8_8 + "" + (Object)net.minecraft.at.l.GRAY + "_";
                                            if (var4_4 != null) break block30;
                                        }
                                        v4 = this.E;
                                    }
                                    if (var4_4 == null) break block32;
                                    if (v4 == this.H) break block30;
                                    if (!a4.b(this.K.v())) break block33;
                                    try {
                                        v6 = var9_10 = o.a(var8_8);
                                        if (var4_4 == null) ** GOTO lbl84
                                        if (v6 != null) {
                                            v6 = var9_10;
lbl84:
                                            // 2 sources

                                            v7 = net.minecraft.client.b.c.a(v6, 116, this.v, true, true);
                                        } else {
                                            v7 = null;
                                        }
                                        this.S = v7;
                                        break block16;
                                    }
                                    catch (JsonParseException var9_11) {
                                        this.S = null;
                                        if (var4_4 != null) break block16;
                                    }
                                }
                                var9_10 = new g((Object)net.minecraft.at.l.DARK_RED + "* Invalid book tag *");
                                this.S = Lists.newArrayList((Iterable)var9_10);
                            }
                            this.E = this.H;
                        }
                        v4 = this.v.e(var7_7);
                    }
                    var9_9 = v4;
                    v8 = this.v.b(var7_7, var5_5 - var9_9 + 192 - 44, 18.0f, 0);
                    if (var4_4 == null) break block34;
                    if (this.S != null) break block35;
                    this.v.a(var8_8, var5_5 + 36, 34, 116, 0);
                    if (var4_4 != null) break block22;
                }
                v8 = Math.min(128 / this.v.p, this.S.size());
            }
            var10_12 = v8;
            for (var11_14 = 0; var11_14 < var10_12; ++var11_14) {
                var12_17 = this.S.get(var11_14);
                this.v.b(var12_17.f(), var5_5 + 36, 34 + var11_14 * this.v.p, 0);
                if (var4_4 == null) return;
                if (var4_4 != null) continue;
            }
            var11_15 = this.a(var1_1, var2_2);
            if (var4_4 == null) return;
            if (var11_15 != null) {
                this.a(var11_15, var1_1, var2_2);
            }
        }
        super.a(var1_1, var2_2, var3_3);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(int var1_1, int var2_2, int var3_3) throws IOException {
        var4_4 = q.b();
        if (var4_4 == null) return;
        if (var3_3 != 0) ** GOTO lbl-1000
        var5_5 = this.a(var1_1, var2_2);
        if (var4_4 == null) return;
        if (var5_5 != null) {
            v0 = this;
            if (var4_4 != null) {
                if (v0.a(var5_5)) {
                    return;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 4 sources

        {
            v0 = this;
        }
        super.a(var1_1, var2_2, var3_3);
    }

    private void b(String string) {
        block2: {
            int n2;
            int n3;
            String string2;
            block1: {
                String string3 = this.b();
                string2 = string3 + string;
                int n4 = this.v.b(string2 + "" + (Object)((Object)net.minecraft.at.l.BLACK) + "_", 118);
                String[] arrstring = q.b();
                n3 = n4;
                n2 = 128;
                if (arrstring == null) break block1;
                if (n3 > n2) break block2;
                n3 = string2.length();
                n2 = 256;
            }
            if (n3 < n2) {
                this.a(string2);
            }
        }
    }

    public a6(j j2, d d10, boolean bl2) {
        block6: {
            a6 a62;
            block4: {
                block5: {
                    this.A = 192;
                    this.N = 192;
                    this.O = 1;
                    this.Q = "";
                    this.E = -1;
                    this.M = j2;
                    this.K = d10;
                    String[] arrstring = q.b();
                    a62 = this;
                    if (arrstring == null) break block4;
                    a62.D = bl2;
                    if (!d10.x()) break block5;
                    r r2 = d10.v();
                    this.P = r2.c("pages", 8).a();
                    this.O = this.P.b();
                    a62 = this;
                    if (arrstring == null) break block4;
                    if (a62.O < 1) {
                        this.O = 1;
                    }
                }
                a62 = this;
            }
            if (a62.P != null || !bl2) break block6;
            this.P = new u();
            this.P.a(new w(""));
            this.O = 1;
        }
    }

    @Nullable
    public k a(int n2, int n3) {
        block7: {
            block10: {
                block13: {
                    int n4;
                    int n5;
                    int n6;
                    String[] arrstring;
                    block12: {
                        int n7;
                        int n8;
                        block11: {
                            int n9;
                            block9: {
                                int n10;
                                block8: {
                                    block6: {
                                        arrstring = q.b();
                                        if (this.S == null) {
                                            return null;
                                        }
                                        n6 = n2 - (h - 192) / 2 - 36;
                                        n9 = n3 - 2 - 16 - 16;
                                        n10 = n6;
                                        if (arrstring == null) break block6;
                                        if (n10 < 0) break block7;
                                        n10 = n9;
                                    }
                                    if (arrstring == null) break block8;
                                    if (n10 < 0) break block7;
                                    n10 = Math.min(128 / this.v.p, this.S.size());
                                }
                                int n11 = n10;
                                n8 = n6;
                                n7 = 116;
                                if (arrstring == null) break block9;
                                if (n8 > n7) break block10;
                                n8 = n9;
                                n7 = this.m.a6.p * n11 + n11;
                            }
                            if (arrstring == null) break block11;
                            if (n8 >= n7) break block10;
                            n8 = n9;
                            n7 = this.m.a6.p;
                        }
                        n4 = n5 = n8 / n7;
                        if (arrstring == null) break block12;
                        if (n4 < 0) break block13;
                        n4 = n5;
                    }
                    if (n4 >= this.S.size()) break block13;
                    k k2 = this.S.get(n5);
                    int n12 = 0;
                    for (k k3 : k2) {
                        block15: {
                            int n13;
                            block14: {
                                n13 = k3 instanceof g;
                                if (arrstring == null) break block14;
                                if (n13 == 0) break block15;
                                n13 = n12 += this.m.a6.e(((g)k3).c());
                            }
                            if (n13 > n6) {
                                return k3;
                            }
                        }
                        if (arrstring != null) continue;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void b(boolean bl2) throws IOException {
        block6: {
            Object object;
            block16: {
                block15: {
                    String[] arrstring;
                    block14: {
                        d d10;
                        block12: {
                            block13: {
                                boolean bl3;
                                block7: {
                                    a6 a62;
                                    block9: {
                                        boolean bl4;
                                        block8: {
                                            arrstring = q.b();
                                            bl4 = this.D;
                                            if (arrstring == null) break block8;
                                            if (!bl4) break block6;
                                            a62 = this;
                                            if (arrstring == null) break block9;
                                            bl4 = a62.F;
                                        }
                                        if (!bl4) break block6;
                                        a62 = this;
                                    }
                                    u u2 = a62.P;
                                    boolean bl5 = true;
                                    do {
                                        block11: {
                                            block10: {
                                                if (!bl5 || (bl5 = false)) break block10;
                                                if (arrstring == null) break block11;
                                                if (u2 == null) break block6;
                                            }
                                            u2 = this.P;
                                        }
                                        if (u2.b() <= 1) break;
                                        object = this.P.c(this.P.b() - 1);
                                        if (arrstring == null) continue;
                                        bl3 = ((String)object).isEmpty();
                                        if (arrstring == null) break block7;
                                        if (!bl3 && arrstring != null) break;
                                        this.P.h(this.P.b() - 1);
                                    } while (arrstring != null);
                                    d10 = this.K;
                                    if (arrstring == null) break block12;
                                    bl3 = d10.x();
                                }
                                if (!bl3) break block13;
                                object = this.K.v();
                                ((r)object).a("pages", this.P);
                                if (arrstring != null) break block14;
                            }
                            d10 = this.K;
                        }
                        d10.a("pages", this.P);
                    }
                    object = "MC|BEdit";
                    if (arrstring == null) break block15;
                    if (!bl2) break block16;
                    object = "MC|BSign";
                    this.K.a("author", new w(this.M.g()));
                }
                this.K.a("title", new w(this.Q.trim()));
            }
            m m2 = new m(Unpooled.buffer());
            m2.a(this.K);
            this.m.ar().a(new h((String)object, m2));
        }
    }

    private void b(char c10, int n2) {
        block9: {
            int n3;
            String[] arrstring;
            block7: {
                block8: {
                    arrstring = q.b();
                    n3 = net.minecraft.client.b.L.d(n2);
                    if (arrstring == null) break block7;
                    if (n3 == 0) break block8;
                    this.b(net.minecraft.client.b.L.l());
                    if (arrstring != null) break block9;
                }
                n3 = n2;
            }
            if (arrstring != null) {
                switch (n3) {
                    case 14: {
                        String string = this.b();
                        if (!string.isEmpty()) {
                            this.a(string.substring(0, string.length() - 1));
                        }
                        return;
                    }
                    case 28: 
                    case 156: {
                        this.b("\n");
                        return;
                    }
                }
                n3 = X.a(c10) ? 1 : 0;
            }
            if (n3 != 0) {
                this.b(Character.toString(c10));
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String b() {
        a6 a62;
        block5: {
            int n2;
            block4: {
                String[] arrstring = q.b();
                a6 a63 = this;
                if (arrstring != null) {
                    if (a63.P == null) return "";
                    a63 = this;
                }
                n2 = a63.H;
                if (arrstring == null) break block4;
                if (n2 < 0) return "";
                a62 = this;
                if (arrstring == null) break block5;
                n2 = a62.H;
            }
            if (n2 >= this.P.b()) return "";
            a62 = this;
        }
        String string = a62.P.c(this.H);
        return string;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            a6 a62;
            block4: {
                block5: {
                    boolean bl2;
                    String[] arrstring;
                    block2: {
                        String[] arrstring2 = q.b();
                        super.a(c10, n2);
                        arrstring = arrstring2;
                        bl2 = this.D;
                        if (arrstring == null) break block2;
                        if (!bl2) break block3;
                        a62 = this;
                        if (arrstring == null) break block4;
                        bl2 = a62.z;
                    }
                    if (!bl2) break block5;
                    this.c(c10, n2);
                    if (arrstring != null) break block3;
                }
                a62 = this;
            }
            a62.b(c10, n2);
        }
    }

    @Override
    public void r() {
        block4: {
            block2: {
                a6 a62;
                block3: {
                    String[] arrstring = q.b();
                    this.t.clear();
                    String[] arrstring2 = arrstring;
                    Keyboard.enableRepeatEvents((boolean)true);
                    a62 = this;
                    if (arrstring2 == null) break block2;
                    if (!a62.D) break block3;
                    this.y = this.b(new s(3, h / 2 - 100, 196, 98, 20, net.minecraft.client.D.h.a("book.signButton", new Object[0])));
                    this.G = this.b(new s(0, h / 2 + 2, 196, 98, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
                    this.B = this.b(new s(5, h / 2 - 100, 196, 98, 20, net.minecraft.client.D.h.a("book.finalizeButton", new Object[0])));
                    this.L = this.b(new s(4, h / 2 + 2, 196, 98, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
                    if (arrstring2 != null) break block4;
                }
                a62 = this;
            }
            a62.G = this.b(new s(0, h / 2 - 100, 196, 200, 20, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        }
        int n2 = (h - 192) / 2;
        int n3 = 2;
        this.J = this.b(new D(1, n2 + 120, 156, true));
        this.T = this.b(new D(2, n2 + 38, 156, false));
        this.d();
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    static {
        R = LogManager.getLogger();
        C = new net.minecraft.ar.v("textures/gui/book.png");
    }

    private void a(String string) {
        block3: {
            block5: {
                a6 a62;
                int n2;
                block4: {
                    a6 a63;
                    String[] arrstring;
                    block2: {
                        arrstring = q.b();
                        a63 = this;
                        if (arrstring == null) break block2;
                        if (a63.P == null) break block3;
                        a63 = this;
                    }
                    n2 = a63.H;
                    if (arrstring == null) break block4;
                    if (n2 < 0) break block3;
                    a62 = this;
                    if (arrstring == null) break block5;
                    n2 = a62.H;
                }
                if (n2 >= this.P.b()) break block3;
                this.P.a(this.H, new w(string));
                a62 = this;
            }
            a62.F = true;
        }
    }

    @Override
    protected void a(s s2) throws IOException {
        block5: {
            a6 a62;
            block15: {
                block8: {
                    int n2;
                    block21: {
                        int n3;
                        String[] arrstring;
                        block18: {
                            block20: {
                                block19: {
                                    block16: {
                                        block17: {
                                            block12: {
                                                block13: {
                                                    int n4;
                                                    block14: {
                                                        block9: {
                                                            block11: {
                                                                block10: {
                                                                    block6: {
                                                                        block7: {
                                                                            block4: {
                                                                                arrstring = q.b();
                                                                                n2 = s2.h;
                                                                                if (arrstring == null) break block4;
                                                                                if (n2 == 0) break block5;
                                                                                n2 = s2.g;
                                                                            }
                                                                            if (arrstring == null) break block6;
                                                                            if (n2 != 0) break block7;
                                                                            this.m.a((L)null);
                                                                            this.b(false);
                                                                            if (arrstring != null) break block8;
                                                                        }
                                                                        n2 = s2.g;
                                                                    }
                                                                    n3 = 3;
                                                                    if (arrstring == null) break block9;
                                                                    if (n2 != n3) break block10;
                                                                    n2 = this.D ? 1 : 0;
                                                                    if (arrstring == null) break block11;
                                                                    if (n2 == 0) break block10;
                                                                    this.z = true;
                                                                    if (arrstring != null) break block8;
                                                                }
                                                                n2 = s2.g;
                                                            }
                                                            n3 = 1;
                                                        }
                                                        if (arrstring == null) break block12;
                                                        if (n2 != n3) break block13;
                                                        n4 = this.H++;
                                                        if (arrstring == null) break block14;
                                                        if (n4 < this.O - 1 && arrstring != null) break block8;
                                                        a62 = this;
                                                        if (arrstring == null) break block15;
                                                        n4 = a62.D ? 1 : 0;
                                                    }
                                                    if (n4 == 0) break block8;
                                                    this.c();
                                                    a62 = this;
                                                    if (arrstring == null) break block15;
                                                    if (a62.H >= this.O - 1) break block8;
                                                    ++this.H;
                                                    if (arrstring != null) break block8;
                                                }
                                                n2 = s2.g;
                                                n3 = 2;
                                            }
                                            if (arrstring == null) break block16;
                                            if (n2 != n3) break block17;
                                            a62 = this;
                                            if (arrstring == null) break block15;
                                            if (a62.H <= 0) break block8;
                                            --this.H;
                                            if (arrstring != null) break block8;
                                        }
                                        n2 = s2.g;
                                        n3 = 5;
                                    }
                                    if (arrstring == null) break block18;
                                    if (n2 != n3) break block19;
                                    n2 = this.z ? 1 : 0;
                                    if (arrstring == null) break block20;
                                    if (n2 == 0) break block19;
                                    this.b(true);
                                    this.m.a((L)null);
                                    if (arrstring != null) break block8;
                                }
                                n2 = s2.g;
                            }
                            if (arrstring == null) break block21;
                            n3 = 4;
                        }
                        if (n2 != n3) break block8;
                        a62 = this;
                        if (arrstring == null) break block15;
                        n2 = a62.z ? 1 : 0;
                    }
                    if (n2 != 0) {
                        this.z = false;
                    }
                }
                a62 = this;
            }
            a62.d();
        }
    }

    private void c() {
        block3: {
            u u2;
            block4: {
                String[] arrstring;
                block2: {
                    arrstring = q.b();
                    u2 = this.P;
                    if (arrstring == null) break block2;
                    if (u2 == null) break block3;
                    u2 = this.P;
                }
                if (arrstring == null) break block4;
                if (u2.b() >= 50) break block3;
                u2 = this.P;
            }
            u2.a(new w(""));
            ++this.O;
            this.F = true;
        }
    }

    @Override
    public void e() {
        super.e();
        ++this.I;
    }

    /*
     * Exception decompiling
     */
    private void d() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:453)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:232)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:646)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:52)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:681)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c(char c10, int n2) throws IOException {
        String[] arrstring = q.b();
        int n3 = n2;
        if (arrstring != null) {
            switch (n3) {
                case 14: {
                    a6 a62 = this;
                    if (arrstring != null) {
                        if (a62.Q.isEmpty()) return;
                        this.Q = this.Q.substring(0, this.Q.length() - 1);
                        a62 = this;
                    }
                    a62.d();
                    return;
                }
                case 28: 
                case 156: {
                    a6 a63 = this;
                    if (arrstring != null) {
                        if (a63.Q.isEmpty()) return;
                        this.b(true);
                        a63 = this;
                    }
                    a63.m.a((L)null);
                    return;
                }
            }
            n3 = this.Q.length();
        }
        if (arrstring != null) {
            if (n3 >= 16) return;
            n3 = X.a(c10) ? 1 : 0;
        }
        if (n3 == 0) return;
        this.Q = this.Q + c10;
        this.d();
        this.F = true;
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    @Override
    public boolean a(k k2) {
        boolean bl2;
        String[] arrstring;
        net.minecraft.I.d d10;
        block12: {
            block10: {
                net.minecraft.I.d d11;
                block11: {
                    d10 = k2.e().j();
                    arrstring = q.b();
                    d11 = d10;
                    if (arrstring != null) {
                        if (d11 == null) {
                            return false;
                        }
                        d11 = d10;
                    }
                    if (arrstring == null) break block11;
                    if (d11.d() != net.minecraft.I.a.CHANGE_PAGE) break block12;
                    d11 = d10;
                }
                String string = d11.c();
                try {
                    boolean bl3;
                    block14: {
                        int n2;
                        boolean bl4;
                        block13: {
                            bl3 = bl4 = Integer.parseInt(string) - 1;
                            if (arrstring != null) {
                                if (bl3 < false) break block10;
                                bl3 = bl4;
                            }
                            n2 = this.O;
                            if (arrstring == null) break block13;
                            if (bl3 >= n2) break block10;
                            bl3 = bl4;
                            if (arrstring == null) break block14;
                            n2 = this.H;
                        }
                        if (bl3 == n2) break block10;
                        this.H = bl4;
                        this.d();
                        bl3 = true;
                    }
                    return bl3;
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
            }
            return false;
        }
        boolean bl5 = bl2 = super.a(k2);
        if (arrstring != null) {
            if (bl5 && d10.d() == net.minecraft.I.a.RUN_COMMAND) {
                this.m.a((L)null);
            }
            bl5 = bl2;
        }
        return bl5;
    }

    static net.minecraft.ar.v a() {
        return C;
    }
}

