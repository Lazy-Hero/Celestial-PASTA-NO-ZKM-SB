/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import net.minecraft.k.h;

public class dW
extends d2 {
    private final /* synthetic */ c G;
    public static final /* synthetic */ String A;
    public static final /* synthetic */ String y;
    public static final /* synthetic */ String z;
    protected /* synthetic */ String J;
    private /* synthetic */ String H;
    private /* synthetic */ int C;
    private final /* synthetic */ L E;
    private /* synthetic */ long D;
    private /* synthetic */ String I;
    private /* synthetic */ boolean B;
    private /* synthetic */ int F;

    private String[] a(int n2, List<String> list) {
        a5 a52 = fU.aX().a6;
        String string = dB.i();
        ArrayList<String> arrayList = new ArrayList<String>();
        int n3 = 0;
        while (n3 < list.size()) {
            String string2 = list.get(n3);
            if (string != null) {
                if (string2 != null && string2.length() > 0) {
                    for (String string3 : a52.c(string2, n2)) {
                        arrayList.add(string3);
                        if (string != null) {
                            if (string != null) continue;
                        }
                        break;
                    }
                } else {
                    ++n3;
                }
            }
            if (string != null) continue;
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    private void a(int n2, int n3, List list) {
        block10: {
            s s2;
            int n4;
            int n5;
            int n6;
            long l2;
            String string;
            block11: {
                s s3;
                long l3;
                block9: {
                    int n7 = 700;
                    string = dB.i();
                    long l4 = System.currentTimeMillis() - (this.D + (long)n7);
                    l3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (string == null) break block9;
                    if (l3 < 0) break block10;
                    l3 = h / 2 - 150;
                }
                l2 = l3;
                n6 = w / 6 - 7;
                int n8 = n3;
                int n9 = n6 + 98;
                if (string != null) {
                    if (n8 <= n9) {
                        n6 += 105;
                    }
                    n8 = (int)(l2 + 150);
                    n9 = 150;
                }
                n5 = n8 + n9;
                n4 = n6 + 84 + 10;
                s2 = s3 = dW.a(list, n2, n3);
                if (string == null) break block11;
                if (!(s2 instanceof de)) break block10;
                s2 = s3;
            }
            de de2 = (de)s2;
            dB dB2 = de2.a();
            String[] arrstring = this.a(dB2, n5 - l2);
            if (string != null) {
                if (arrstring == null) {
                    return;
                }
                this.a((int)l2, n6, (double)n5, (double)n4, -536870912, -536870912);
            }
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string2 = arrstring[i2];
                int n10 = 0xDDDDDD;
                int n11 = string2.endsWith("!");
                if (string == null) continue;
                if (n11 != 0) {
                    n10 = 0xFF2020;
                }
                n11 = this.v.c(string2, l2 + 5, n6 + 5 + i2 * 11, n10);
                if (string != null) continue;
            }
        }
    }

    static {
        A = "<profile>";
        y = "*";
        z = "<empty>";
    }

    public dW(L l2, c c10) {
        this.F = 0;
        this.C = 0;
        this.D = 0L;
        this.I = null;
        this.H = null;
        this.B = false;
        this.J = "Shader Options";
        this.E = l2;
        this.G = c10;
    }

    @Override
    protected void a(s s2) {
        block16: {
            dW dW2;
            block24: {
                int n2;
                block23: {
                    int n3;
                    String string;
                    block22: {
                        block14: {
                            Object object;
                            block17: {
                                block19: {
                                    block18: {
                                        block21: {
                                            dB dB2;
                                            block20: {
                                                block15: {
                                                    string = dB.i();
                                                    n2 = s2.h;
                                                    if (string == null) break block15;
                                                    if (n2 == 0) break block16;
                                                    n2 = s2.g;
                                                }
                                                n3 = 200;
                                                if (string == null) break block17;
                                                if (n2 >= n3) break block18;
                                                n2 = s2 instanceof de;
                                                if (string == null) break block19;
                                                if (n2 == 0) break block18;
                                                object = (de)s2;
                                                dB2 = ((de)object).a();
                                                boolean bl2 = dB2 instanceof e1;
                                                if (string != null) {
                                                    if (bl2) {
                                                        String string2 = dB2.l();
                                                        dW dW3 = new dW(this, this.G, string2);
                                                        this.m.a(dW3);
                                                        return;
                                                    }
                                                    bl2 = dW.o();
                                                }
                                                if (!bl2) break block20;
                                                dB2.h();
                                                if (string != null) break block21;
                                            }
                                            dB2.m();
                                        }
                                        this.a();
                                        this.B = true;
                                    }
                                    n2 = s2.g;
                                }
                                n3 = 201;
                            }
                            if (string == null) break block22;
                            if (n2 == n3) {
                                object = cS.a(cS.u());
                                for (int i2 = 0; i2 < ((dB[])object).length; ++i2) {
                                    Object object2 = object[i2];
                                    ((dB)object2).h();
                                    this.B = true;
                                    if (string != null) {
                                        if (string != null) continue;
                                    }
                                    break block14;
                                }
                                this.a();
                            }
                        }
                        n2 = s2.g;
                        if (string == null) break block23;
                        n3 = 200;
                    }
                    if (n2 != n3) break block16;
                    dW2 = this;
                    if (string == null) break block24;
                    n2 = dW2.B ? 1 : 0;
                }
                if (n2 != 0) {
                    cS.c();
                    this.B = false;
                    cS.d();
                }
                dW2 = this;
            }
            dW2.m.a(this.E);
        }
    }

    public dW(L l2, c c10, String string) {
        block3: {
            String string2;
            block2: {
                this(l2, c10);
                String string3 = dB.i();
                dW dW2 = this;
                string2 = string;
                if (string3 == null) break block2;
                dW2.I = string2;
                if (string == null) break block3;
                dW2 = this;
                string2 = cS.b("screen." + string, string);
            }
            dW2.H = string2;
        }
    }

    private String[] a(String string) {
        String[] arrstring;
        block4: {
            String string2 = dB.i();
            String string3 = string;
            if (string2 != null) {
                if (string3.length() <= 0) {
                    return new String[0];
                }
                string3 = string = dQ.f(string, "//");
            }
            String[] arrstring2 = string3.split("\\. ");
            for (int i2 = 0; i2 < arrstring2.length; ++i2) {
                arrstring2[i2] = "- " + arrstring2[i2].trim();
                arrstring = arrstring2;
                if (string2 != null) {
                    arrstring[i2] = dQ.g(arrstring2[i2], ".");
                    if (string2 != null) continue;
                }
                break block4;
            }
            arrstring = arrstring2;
        }
        return arrstring;
    }

    @Override
    protected void b(s s2) {
        block3: {
            block6: {
                dB dB2;
                block5: {
                    String string;
                    block4: {
                        s s3;
                        block2: {
                            string = dB.i();
                            s3 = s2;
                            if (string == null) break block2;
                            if (!(s3 instanceof de)) break block3;
                            s3 = s2;
                        }
                        de de2 = (de)s3;
                        dB2 = de2.a();
                        if (string == null) break block4;
                        if (!dW.o()) break block5;
                        dB2.h();
                    }
                    if (string != null) break block6;
                }
                dB2.f();
            }
            this.a();
            this.B = true;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private String[] a(dB var1_1, int var2_2) {
        block15: {
            block16: {
                block14: {
                    block13: {
                        var3_3 = dB.i();
                        v0 = var1_1;
                        if (var3_3 != null) {
                            if (v0 instanceof d8) {
                                return null;
                            }
                            v0 = var1_1;
                        }
                        var4_4 = v0.c();
                        var5_5 = fU.a(var1_1.o()).trim();
                        var6_6 = this.a(var5_5);
                        var7_7 = null;
                        v1 = var4_4.equals(var1_1.l());
                        if (var3_3 == null) break block13;
                        if (v1) break block14;
                        v1 = this.G.aP;
                    }
                    if (v1) {
                        var7_7 = "\u00a78" + gl.a("of.general.id") + ": " + var1_1.l();
                    }
                }
                var8_8 = null;
                if (var1_1.d() != null && this.G.aP) {
                    var8_8 = "\u00a78" + gl.a("of.general.from") + ": " + fU.a(var1_1.d());
                }
                var9_9 = null;
                if (var1_1.j() == null) break block15;
                v2 = this.G.aP;
                if (var3_3 == null) break block16;
                if (!v2) break block15;
                v3 = var1_1;
                if (var3_3 == null) ** GOTO lbl33
                v2 = v3.q();
            }
            if (v2) {
                v3 = var1_1;
lbl33:
                // 2 sources

                v4 = v3.f(var1_1.j());
            } else {
                v4 = gl.a("of.general.ambiguous");
            }
            var10_10 = v4;
            var9_9 = "\u00a78" + gl.b() + ": " + (String)var10_10;
        }
        var10_10 = new ArrayList<String>();
        var10_10.add(var4_4);
        var10_10.addAll(Arrays.asList(var6_6));
        v5 = var7_7;
        if (var3_3 != null) {
            if (v5 != null) {
                var10_10.add(var7_7);
            }
            v5 = var8_8;
        }
        if (var3_3 != null) {
            if (v5 != null) {
                var10_10.add(var8_8);
            }
            v5 = var9_9;
        }
        if (v5 == null) return this.a(var2_2, (List<String>)var10_10);
        var10_10.add(var9_9);
        return this.a(var2_2, (List<String>)var10_10);
    }

    private void a() {
        Iterator iterator = this.t.iterator();
        String string = dB.i();
        while (iterator.hasNext()) {
            block7: {
                s s2;
                block6: {
                    s s3;
                    s2 = s3 = (s)iterator.next();
                    if (string == null) break block6;
                    if (!(s2 instanceof de)) break block7;
                    s2 = s3;
                }
                de de2 = (de)s2;
                dB dB2 = de2.a();
                if (string != null) {
                    if (dB2 instanceof d8) {
                        d8 d82 = (d8)dB2;
                        d82.a();
                    }
                    de2.m = dW.b(dB2, de2.a());
                }
                de2.b();
            }
            if (string != null) continue;
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block9: {
            block7: {
                block8: {
                    String string;
                    block6: {
                        dW dW2;
                        block4: {
                            block5: {
                                String string2 = dB.i();
                                this.n();
                                string = string2;
                                dW2 = this;
                                if (string == null) break block4;
                                if (dW2.H == null) break block5;
                                this.b(this.v, this.H, h / 2, 15, 0xFFFFFF);
                                if (string != null) break block6;
                            }
                            dW2 = this;
                        }
                        dW2.b(this.v, this.J, h / 2, 15, 0xFFFFFF);
                    }
                    super.a(n2, n3, f10);
                    if (string == null) break block7;
                    if (Math.abs(n2 - this.F) > 5 || Math.abs(n3 - this.C) > 5) break block8;
                    this.a(n2, n3, this.t);
                    if (string != null) break block9;
                }
                this.F = n2;
                this.C = n3;
            }
            this.D = System.currentTimeMillis();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static String b(dB var0, int var1_1) {
        block8: {
            block10: {
                block9: {
                    var3_2 = var0.c();
                    var2_3 = dB.i();
                    v0 = var0;
                    if (var2_3 == null) break block9;
                    if (!(v0 instanceof e1)) break block10;
                    v0 = var0;
                }
                var4_4 = (e1)v0;
                return var3_2 + "...";
            }
            var4_5 = fU.aX().a6;
            var5_6 = var4_5.e(": " + gl.f()) + 5;
            while (var4_5.e(var3_2) + var5_6 >= var1_1) {
                v1 = var3_2.length();
                if (var2_3 != null && var2_3 != null) {
                    if (v1 <= 0) break;
                    var3_2 = var3_2.substring(0, var3_2.length() - 1);
                    if (var2_3 != null) continue;
                }
                break block8;
            }
            v2 = var0;
            if (var2_3 == null) ** GOTO lbl26
            v1 = v2.b() ? 1 : 0;
        }
        if (v1 != 0) {
            v2 = var0;
lbl26:
            // 2 sources

            v3 = v2.e(var0.k());
        } else {
            v3 = "";
        }
        var5_7 = v3;
        var6_8 = var0.f(var0.k());
        return var3_2 + ": " + var5_7 + var6_8;
    }

    @Override
    public void r() {
        block6: {
            int n2;
            int n3;
            block7: {
                int n4;
                this.J = net.minecraft.client.D.h.a("of.options.shaderOptionsTitle", new Object[0]);
                int n5 = 100;
                int n6 = 0;
                int n7 = 30;
                String string = dB.i();
                int n8 = 20;
                int n9 = h - 130;
                n3 = 120;
                n2 = 20;
                int n10 = cS.a(this.I, 2);
                dB[] arrdB = cS.e(this.I);
                if (string == null) break block6;
                if (arrdB == null) break block7;
                int n11 = net.minecraft.k.h.i((double)arrdB.length / 9.0);
                int n12 = n10;
                if (string != null) {
                    if (n12 < n11) {
                        n10 = n11;
                    }
                    n12 = n4 = 0;
                }
                while (n4 < arrdB.length) {
                    block8: {
                        block9: {
                            de de2;
                            dB dB2;
                            block12: {
                                String string2;
                                int n13;
                                int n14;
                                int n15;
                                block11: {
                                    int n16;
                                    block10: {
                                        dB2 = arrdB[n4];
                                        if (string == null) break block6;
                                        if (string == null) break block8;
                                        if (dB2 == null) break block9;
                                        n16 = dB2.a();
                                        if (string == null) break block10;
                                        if (n16 == 0) break block9;
                                        n16 = n4 % n10;
                                    }
                                    int n17 = n16;
                                    int n18 = n4 / n10;
                                    int n19 = Math.min(h / n10, 200);
                                    n6 = (h - n19 * n10) / 2;
                                    n15 = n17 * n19 + 5 + n6;
                                    n14 = n7 + n18 * n8;
                                    n13 = n19 - 10;
                                    string2 = dW.b(dB2, n13);
                                    if (!cS.j(dB2.l())) break block11;
                                    de2 = new dG(n5 + n4, n15, n14, n13, n2, dB2, string2);
                                    if (string != null) break block12;
                                }
                                de2 = new de(n5 + n4, n15, n14, n13, n2, dB2, string2);
                            }
                            de2.h = dB2.q();
                            this.t.add(de2);
                        }
                        ++n4;
                    }
                    if (string != null) continue;
                }
            }
            this.t.add(new s(201, h / 2 - n3 - 20, w / 6 + 168 + 11, n3, n2, net.minecraft.client.D.h.a("controls.reset", new Object[0])));
            this.t.add(new s(200, h / 2 + 20, w / 6 + 168 + 11, n3, n2, net.minecraft.client.D.h.a("gui.done", new Object[0])));
        }
    }

    @Override
    public void h() {
        block3: {
            block2: {
                String string = dB.i();
                super.h();
                String string2 = string;
                dW dW2 = this;
                if (string2 == null) break block2;
                if (!dW2.B) break block3;
                cS.c();
                dW2 = this;
            }
            dW2.B = false;
            cS.d();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

