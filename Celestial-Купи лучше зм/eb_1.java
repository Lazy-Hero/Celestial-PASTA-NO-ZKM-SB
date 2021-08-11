/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.k.m;
import org.lwjgl.opengl.GL11;

public class eb {
    public /* synthetic */ int l;
    public /* synthetic */ int h;
    public /* synthetic */ int j;
    public /* synthetic */ c4 i;
    public /* synthetic */ int g;
    public /* synthetic */ boolean c;
    private static /* synthetic */ int[] f;
    public /* synthetic */ a5 e;
    public /* synthetic */ List<fv> k;
    public /* synthetic */ double d;
    public /* synthetic */ int a;
    public /* synthetic */ int b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void g() {
        var2_1 = this.j;
        var1_2 = eb.c();
        v0 = g9.a[this.i.ordinal()];
        if (var1_2 != null) ** GOTO lbl9
        switch (v0) {
            case 1: {
                cfr_temp_0 = this.d - (double)(var2_1 + 2);
                v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
lbl9:
                // 2 sources

                if (var1_2 != null) ** GOTO lbl17
                if (v0 < 0) {
                    this.d = n.a((double)(var2_1 + 2), this.d, 0.045 * Q.o / 5.0);
                    if (var1_2 == null) return;
                }
                v1 = this;
                if (var1_2 != null) ** GOTO lbl19
                cfr_temp_1 = v1.d - (double)(var2_1 + 2);
                v0 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
lbl17:
                // 2 sources

                if (v0 < 0) return;
                v1 = this;
lbl19:
                // 2 sources

                v1.i = c4.STATIC;
                if (var1_2 == null) return;
            }
            case 2: {
                cfr_temp_2 = this.d - 0.0;
                v2 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                if (var1_2 != null) ** GOTO lbl32
                if (v2 > 0) {
                    this.d = n.a(0.0, this.d, 0.045 * Q.o / 5.0);
                    if (var1_2 == null) return;
                }
                v3 = this;
                if (var1_2 != null) ** GOTO lbl34
                cfr_temp_3 = v3.d - 0.0;
                v2 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
lbl32:
                // 2 sources

                if (v2 > 0) return;
                v3 = this;
lbl34:
                // 2 sources

                v3.i = c4.STATIC;
                if (var1_2 == null) return;
            }
            case 3: {
                v4 = this;
                if (var1_2 != null) ** GOTO lbl45
                if (!(v4.d > 0.0)) ** GOTO lbl44
                v4 = this;
                if (var1_2 != null) ** GOTO lbl45
                if (v4.d != (double)(var2_1 + 2)) {
                    this.d = n.a((double)(var2_1 + 2), this.d, 0.045 * Q.o / 5.0);
                }
lbl44:
                // 4 sources

                v4 = this;
lbl45:
                // 3 sources

                v4.d = this.a(this.d, (double)(var2_1 + 2));
                return;
            }
        }
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    private double a(double d10, double d11) {
        int[] arrn = eb.c();
        double d12 = d10;
        double d13 = 0.0;
        if (arrn == null) {
            if (d12 < d13) {
                return 0.0;
            }
            d12 = d10;
            d13 = d11;
        }
        return Math.min(d12, d13);
    }

    private void b(int n2, int n3) {
        block3: {
            block2: {
                int[] arrn = eb.c();
                eb eb2 = this;
                if (arrn != null) break block2;
                if (!eb2.c) break block3;
                this.h = n2 + this.l;
                eb2 = this;
            }
            eb2.g = n3 + this.a;
        }
    }

    private void b() {
        block2: {
            int n2 = 20;
            Iterator<fv> iterator = this.k.iterator();
            int[] arrn = eb.c();
            while (iterator.hasNext()) {
                e8 e82 = iterator.next();
                e82.a(n2);
                n2 = (int)((double)n2 + (double)e82.b() + e82.h());
                if (arrn == null) {
                    if (arrn == null) continue;
                }
                break block2;
            }
            this.j = n2 - 20;
        }
    }

    public void a(char c10, int n2) {
        block4: {
            eb eb2;
            int[] arrn;
            block3: {
                arrn = eb.c();
                eb2 = this;
                if (arrn != null) break block3;
                if (!(eb2.d > 0.0)) break block4;
                eb2 = this;
            }
            for (e8 e82 : eb2.k) {
                e82.c(c10, n2);
                if (arrn == null) continue;
            }
        }
    }

    public static int[] c() {
        return f;
    }

    public void c(int n2) {
        this.b = n2;
    }

    public void b(int n2, int n3, int n4) {
        eb eb2;
        double d10;
        int[] arrn;
        block19: {
            block7: {
                int n5;
                int n6;
                int n7;
                block20: {
                    block11: {
                        block12: {
                            block17: {
                                eb eb3;
                                block18: {
                                    double d11;
                                    block13: {
                                        double d12;
                                        block14: {
                                            block15: {
                                                eb eb4;
                                                block16: {
                                                    int n8;
                                                    block10: {
                                                        block9: {
                                                            block8: {
                                                                block6: {
                                                                    n7 = this.h;
                                                                    n6 = this.g;
                                                                    int n9 = this.b;
                                                                    arrn = eb.c();
                                                                    d10 = this.d;
                                                                    n5 = n2;
                                                                    n8 = n7 - 2;
                                                                    if (arrn != null) break block6;
                                                                    if (n5 <= n8) break block7;
                                                                    n5 = n2;
                                                                    n8 = n7 + n9 + 2;
                                                                }
                                                                if (arrn != null) break block8;
                                                                if (n5 >= n8) break block7;
                                                                n5 = n3;
                                                                n8 = n6;
                                                            }
                                                            if (arrn != null) break block9;
                                                            if (n5 <= n8) break block7;
                                                            n5 = n3;
                                                            n8 = n6 + 20;
                                                        }
                                                        if (arrn != null) break block10;
                                                        if (n5 >= n8) break block7;
                                                        n5 = n4;
                                                        if (arrn != null) break block11;
                                                        n8 = 1;
                                                    }
                                                    if (n5 != n8) break block12;
                                                    double d13 = d10 - 0.0;
                                                    d11 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                                                    if (arrn != null) break block13;
                                                    if (d11 <= 0) break block14;
                                                    eb4 = this;
                                                    if (arrn != null) break block15;
                                                    if (eb4.i == c4.EXPANDING) break block16;
                                                    eb4 = this;
                                                    if (arrn != null) break block15;
                                                    if (eb4.i != c4.STATIC) break block14;
                                                }
                                                eb4 = this;
                                            }
                                            eb4.i = c4.RETRACTING;
                                            if (arrn == null) break block7;
                                        }
                                        d11 = (d12 = d10 - (double)(this.j + 2)) == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
                                    }
                                    if (d11 >= 0) break block7;
                                    eb3 = this;
                                    if (arrn != null) break block17;
                                    if (eb3.i == c4.EXPANDING) break block18;
                                    eb2 = this;
                                    if (arrn != null) break block19;
                                    if (eb2.i != c4.STATIC) break block7;
                                }
                                eb3 = this;
                            }
                            eb3.i = c4.EXPANDING;
                            if (arrn == null) break block7;
                        }
                        n5 = n4;
                    }
                    if (arrn != null) break block20;
                    if (n5 != 0) break block7;
                    eb2 = this;
                    if (arrn != null) break block19;
                    n5 = eb2.c ? 1 : 0;
                }
                if (n5 == 0) {
                    this.l = n7 - n2;
                    this.a = n6 - n3;
                    this.c = true;
                }
            }
            eb2 = this;
        }
        for (e8 e82 : eb2.k) {
            int n10 = e82.g();
            if ((double)n10 < d10 + 20.0) {
                e82.b(n2, n3, n4);
            }
            if (arrn == null) continue;
        }
    }

    public int f() {
        return this.b;
    }

    static {
        if (eb.c() != null) {
            eb.b(new int[5]);
        }
    }

    public int a() {
        return this.j;
    }

    public void a(int n2, int n3) {
        block2: {
            int n4 = this.h;
            int n5 = this.g;
            int n6 = this.b;
            this.b();
            this.g();
            this.b(n2, n3);
            double d10 = this.d;
            int[] arrn = eb.c();
            int n7 = new Color(13, 13, 13).getRGB();
            dJ.a(n4 - 2, (float)n5, (double)(n4 + n6 + 2), (double)((float)((double)(n5 + 20) + d10)), n7);
            dJ.a((float)((double)n4 + -2.5), (float)n5, (float)(this.b + 5), 20.0f, new Color(24, 24, 24).brighter().getRGB(), new Color(n7).darker().getRGB());
            dJ.a((float)((double)n4 + -2.5), (float)n5, (float)(this.b + 5), 20.0f, a0.a(14, 235), a0.a(48, 0));
            dJ.a(n4 - 2, (float)n5, (double)(n4 + n6 + 2), (double)(n5 + 20), n7);
            int[] arrn2 = arrn;
            String string = "celestial/clickguiicons/" + this.e.name + ".png";
            dJ.b((double)this.h + -2.5, this.g + -2, (double)(this.h + this.b) + 2.5, this.g, new Color(this.e.b()).getRGB());
            dJ.a(new v(string), (float)(n4 + this.f() - 20), (float)(this.g - -2), 13.0f, 13.0f, new Color(this.e.b()));
            Q.P().m.c(this.e.name, n4 + 2, (float)n5 + 10.0f - 3.0f, -1);
            GL11.glPushMatrix();
            GL11.glEnable((int)3089);
            dJ.a(n4 - 2, n5 + 20 - 2, n4 + n6 + 2, (double)((float)((double)(n5 + 20) + d10)));
            this.k.sort(new gH());
            for (e8 e82 : this.k) {
                e82.b(n2, n3);
                dJ.a(n4 - 2, n5 + 20, n4 + n6 + 2, (double)((float)((double)(n5 + 20) + d10)));
                if (arrn2 == null) {
                    if (arrn2 == null) continue;
                    m.b(!m.d());
                    break;
                }
                break block2;
            }
            GL11.glDisable((int)3089);
            GL11.glPopMatrix();
        }
    }

    public int e() {
        return this.g;
    }

    public eb(a5 a52, int n2, int n3) {
        block3: {
            block2: {
                this.k = new ArrayList<fv>();
                this.i = c4.STATIC;
                this.e = a52;
                this.h = n2;
                this.g = n3;
                this.b = 100;
                int[] arrn = eb.c();
                int n4 = 20;
                for (bE bE2 : cj.b.i.a(a52)) {
                    fv fv2 = new fv(bE2, this, 0, n4, this.b, 15);
                    this.k.add(fv2);
                    n4 += 15;
                    if (arrn == null) {
                        if (arrn == null) continue;
                    }
                    break block2;
                }
                this.j = n4 - 20;
            }
            if (m.d()) break block3;
            eb.b(new int[2]);
        }
    }

    public void b(int n2) {
        this.g = n2;
    }

    public void a(int n2, int n3, int n4) {
        block7: {
            eb eb2;
            int[] arrn;
            block6: {
                int n5;
                block5: {
                    arrn = eb.c();
                    n5 = this.c;
                    if (arrn != null) break block5;
                    if (n5 != 0) {
                        this.c = false;
                    }
                    eb2 = this;
                    if (arrn != null) break block6;
                    double d10 = eb2.d - 0.0;
                    n5 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                }
                if (n5 <= 0) break block7;
                eb2 = this;
            }
            for (e8 e82 : eb2.k) {
                e82.a(n2, n3, n4);
                if (arrn == null) continue;
            }
        }
    }

    public void a(int n2) {
        this.j = n2;
    }

    public int d() {
        return this.h;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

