/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import net.minecraft.ah.z;
import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.v;
import net.minecraft.client.y.b;

public class O {
    private static final /* synthetic */ String f;
    private /* synthetic */ int c;
    public static final /* synthetic */ float[] o;
    private /* synthetic */ int q;
    private /* synthetic */ float a;
    private /* synthetic */ int m;
    private /* synthetic */ cZ i;
    private /* synthetic */ int b;
    private /* synthetic */ int j;
    private /* synthetic */ boolean d;
    public /* synthetic */ String p;
    private /* synthetic */ boolean l;
    private /* synthetic */ int h;
    private static final /* synthetic */ String g;
    private /* synthetic */ boolean e;
    private /* synthetic */ boolean r;
    public /* synthetic */ int s;
    private /* synthetic */ float[] k;
    private static final /* synthetic */ String n;

    private float a(String string, float f10) {
        float f11;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return f10;
            }
            string3 = string;
        }
        float f12 = f11 = fU.a(string3, Float.MIN_VALUE);
        if (string2 == null) {
            if (f12 == Float.MIN_VALUE) {
                fU.h("Invalid value: " + string);
                return f10;
            }
            f12 = f11;
        }
        return f12;
    }

    static {
        g = "clear";
        f = "rain";
        n = "thunder";
        o = new float[]{1.0f, 0.0f, 0.0f};
    }

    private void a(W w2, int n2) {
        I i2 = w2.b();
        double d10 = (double)(n2 % 3) / 3.0;
        double d11 = (double)(n2 / 3) / 2.0;
        i2.a(7, net.minecraft.client.y.b.m);
        i2.c(-100.0, -100.0, -100.0).a(d10, d11).d();
        i2.c(-100.0, -100.0, 100.0).a(d10, d11 + 0.5).d();
        i2.c(100.0, -100.0, 100.0).a(d10 + 0.3333333333333333, d11 + 0.5).d();
        i2.c(100.0, -100.0, -100.0).a(d10 + 0.3333333333333333, d11).d();
        w2.a();
    }

    public String toString() {
        return "" + this.p + ", " + this.j + "-" + this.m + " " + this.h + "-" + this.b;
    }

    public boolean b(String string) {
        int n2;
        block12: {
            block13: {
                int n3;
                int n4;
                int n5;
                String string2;
                block14: {
                    block15: {
                        string2 = K.d();
                        O o2 = this;
                        if (string2 == null) {
                            if (o2.p == null) {
                                fU.h("No source texture: " + string);
                                return false;
                            }
                            this.p = fp.a(this.p, fp.a(string));
                            o2 = this;
                        }
                        n2 = o2.j;
                        if (string2 != null) break block12;
                        if (n2 < 0) break block13;
                        n2 = this.m;
                        if (string2 != null) break block12;
                        if (n2 < 0) break block13;
                        n2 = this.b;
                        if (string2 != null) break block12;
                        if (n2 < 0) break block13;
                        n5 = this.a(this.m - this.j);
                        n4 = this.h;
                        if (string2 != null) break block14;
                        if (n4 >= 0) break block15;
                        this.h = this.a(this.b - n5);
                        n4 = this.a(this.h, this.j, this.m) ? 1 : 0;
                        if (string2 != null) break block14;
                        if (n4 != 0) {
                            this.h = this.m;
                        }
                    }
                    n4 = this.a(this.h - this.m);
                }
                int n6 = n4;
                int n7 = this.a(this.b - this.h);
                int n8 = this.a(this.j - this.b);
                int n9 = n3 = n5 + n6 + n7 + n8;
                if (string2 == null) {
                    if (n9 != 24000) {
                        fU.h("Invalid fadeIn/fadeOut times, sum is not 24h: " + n3);
                        return false;
                    }
                    float f10 = this.a - 0.0f;
                    n9 = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                }
                if (string2 == null) {
                    if (n9 < 0) {
                        fU.h("Invalid speed: " + this.a);
                        return false;
                    }
                    n9 = this.q;
                }
                if (string2 == null) {
                    if (n9 <= 0) {
                        fU.h("Invalid daysLoop: " + this.q);
                        return false;
                    }
                    n9 = 1;
                }
                return n9 != 0;
            }
            fU.h("Invalid times, required are: startFadeIn, endFadeIn and endFadeOut.");
            n2 = 0;
        }
        return n2 != 0;
    }

    private int a(int n2) {
        block3: {
            String string = K.d();
            while (n2 >= 24000) {
                n2 -= 24000;
                if (string == null) {
                    if (string == null) continue;
                }
                break block3;
            }
            while (n2 < 0) {
                n2 += 24000;
                if (string == null) continue;
            }
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(String string) {
        String[] arrstring;
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return -1;
            }
            string3 = string;
        }
        String[] arrstring2 = arrstring = fU.c(string3, ":");
        if (string2 == null) {
            if (arrstring2.length != 2) {
                fU.h("Invalid time: " + string);
                return -1;
            }
            arrstring2 = arrstring;
        }
        String string4 = arrstring2[0];
        String string5 = arrstring[1];
        int n2 = fU.b(string4, -1);
        int n3 = fU.b(string5, -1);
        int n4 = n2;
        if (string2 != null) return n4;
        if (n4 >= 0) {
            n4 = n2;
            if (string2 != null) return n4;
            if (n4 <= 23) {
                n4 = n3;
                if (string2 != null) return n4;
                if (n4 >= 0) {
                    n4 = n3;
                    if (string2 != null) return n4;
                    if (n4 <= 59) {
                        int n5 = n2 -= 6;
                        if (string2 != null) return n5;
                        if (n5 < 0) {
                            n2 += 24;
                        }
                        n5 = n2 * 1000 + (int)((double)n3 / 60.0 * 1000.0);
                        return n5;
                    }
                }
            }
        }
        fU.h("Invalid time: " + string);
        return -1;
    }

    public void a(int n2, float f10, float f11, float f12) {
        block10: {
            float f13;
            block9: {
                float f14 = 1.0f - f11;
                String string = K.d();
                float f15 = f11 - f12;
                float f16 = 0.0f;
                boolean bl2 = this.d;
                if (string == null) {
                    if (bl2) {
                        f16 += f14;
                    }
                    bl2 = this.l;
                }
                if (string == null) {
                    if (bl2) {
                        f16 += f15;
                    }
                    bl2 = this.e;
                }
                if (bl2) {
                    f16 += f12;
                }
                f16 = fU.a(f16, 0.0f, 1.0f);
                float f17 = f16 * this.b(n2);
                f17 = fU.a(f17, 0.0f, 1.0f);
                float f18 = f17 - 1.0E-4f;
                f13 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                if (string != null) break block9;
                if (f13 < 0) break block10;
                v.t(this.s);
                bv.a(this.c, f17);
                v.M();
                f13 = (float)this.r;
            }
            if (f13 != false) {
                v.a(f10 * 360.0f * this.a, this.k[0], this.k[1], this.k[2]);
            }
            W w2 = W.c();
            v.a(90.0f, 1.0f, 0.0f, 0.0f);
            v.a(-90.0f, 0.0f, 0.0f, 1.0f);
            this.a(w2, 4);
            v.M();
            v.a(90.0f, 1.0f, 0.0f, 0.0f);
            this.a(w2, 1);
            v.B();
            v.M();
            v.a(-90.0f, 1.0f, 0.0f, 0.0f);
            this.a(w2, 0);
            v.B();
            v.a(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(w2, 5);
            v.a(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(w2, 2);
            v.a(90.0f, 0.0f, 0.0f, 1.0f);
            this.a(w2, 3);
            v.B();
        }
    }

    private List<String> c(String string) {
        List<String> list = Arrays.asList("clear", "rain", "thunder");
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring = fU.c(string, " ");
        String string2 = K.d();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string3 = arrstring[i2];
            boolean bl2 = list.contains(string3);
            if (string2 != null) continue;
            if (!bl2) {
                fU.h("Unknown weather: " + string3);
                if (string2 == null) continue;
            }
            bl2 = arrayList.add(string3);
            if (string2 == null) continue;
        }
        return arrayList;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2, int n3, int n4) {
        String string = K.d();
        int n5 = n3;
        int n6 = n4;
        if (string == null) {
            if (n5 <= n6) {
                int n7 = n2;
                int n8 = n3;
                if (string == null) {
                    if (n7 < n8) return 0 != 0;
                    n7 = n2;
                    if (string != null) return n7 != 0;
                    n8 = n4;
                }
                if (n7 > n8) return 0 != 0;
                return 1 != 0;
            }
            n5 = n2;
            if (string != null) return n5 != 0;
            n6 = n3;
        }
        if (n5 >= n6) return 1 != 0;
        n5 = n2;
        if (string != null) return n5 != 0;
        if (n5 > n4) return 0 != 0;
        return 1 != 0;
    }

    public O(Properties properties, String string) {
        this.p = null;
        this.j = -1;
        this.m = -1;
        this.h = -1;
        this.b = -1;
        this.c = 1;
        this.r = false;
        this.a = 1.0f;
        this.k = o;
        this.i = null;
        this.q = 8;
        this.d = true;
        this.l = false;
        this.e = false;
        this.s = -1;
        ha ha2 = new ha("CustomSky");
        this.p = properties.getProperty("source", string);
        this.j = this.a(properties.getProperty("startFadeIn"));
        this.m = this.a(properties.getProperty("endFadeIn"));
        this.h = this.a(properties.getProperty("startFadeOut"));
        this.b = this.a(properties.getProperty("endFadeOut"));
        this.c = bv.a(properties.getProperty("blend"));
        this.r = this.a(properties.getProperty("rotate"), true);
        this.a = this.a(properties.getProperty("speed"), 1.0f);
        this.k = this.a(properties.getProperty("axis"), o);
        this.i = ha2.c(properties.getProperty("days"));
        this.q = ha2.b(properties.getProperty("daysLoop"), 8);
        List<String> list = this.c(properties.getProperty("weather", "clear"));
        this.d = list.contains("clear");
        this.l = list.contains("rain");
        this.e = list.contains("thunder");
    }

    private boolean a(String string, boolean bl2) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return bl2;
            }
            string3 = string;
        }
        boolean bl3 = string3.equalsIgnoreCase("true");
        if (string2 == null) {
            if (bl3) {
                return true;
            }
            bl3 = string.equalsIgnoreCase("false");
        }
        if (string2 == null) {
            if (bl3) {
                return false;
            }
            fU.h("Unknown boolean: " + string);
            bl3 = bl2;
        }
        return bl3;
    }

    public boolean a(z z2, int n2) {
        String string = K.d();
        O o2 = this;
        if (string == null) {
            if (o2.a(n2, this.b, this.j)) {
                return false;
            }
            o2 = this;
        }
        if (o2.i != null) {
            long l2;
            block5: {
                long l3 = z2.s();
                long l4 = l3 - (long)this.j;
                while (l4 < 0L) {
                    l2 = l4 + (long)(24000 * this.q);
                    if (string == null) {
                        l4 = l2;
                        if (string == null) continue;
                    }
                    break block5;
                }
                l2 = l4 / 24000L;
            }
            int n3 = (int)l2;
            int n4 = n3 % this.q;
            return this.i.b(n4);
        }
        return true;
    }

    private float[] a(String string, float[] arrf) {
        float f10;
        float[] arrf2;
        String string2;
        block14: {
            string2 = K.d();
            String string3 = string;
            if (string2 == null) {
                if (string3 == null) {
                    return arrf;
                }
                string3 = string;
            }
            String[] arrstring = fU.c(string3, " ");
            int n2 = arrstring.length;
            if (string2 == null) {
                if (n2 != 3) {
                    fU.h("Invalid axis: " + string);
                    return arrf;
                }
                n2 = 3;
            }
            arrf2 = new float[n2];
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                float[] arrf3;
                block16: {
                    float f11;
                    block15: {
                        arrf2[i2] = fU.a(arrstring[i2], Float.MIN_VALUE);
                        f10 = arrf2[i2];
                        if (string2 != null) break block14;
                        float f12 = f10 - Float.MIN_VALUE;
                        f11 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                        if (string2 != null) break block15;
                        if (f11 == false) {
                            fU.h("Invalid axis: " + string);
                            return arrf;
                        }
                        arrf3 = arrf2;
                        if (string2 != null) break block16;
                        float f13 = arrf3[i2] - -1.0f;
                        f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                    }
                    if (f11 >= 0) {
                        arrf3 = arrf2;
                        if (string2 == null) {
                            if (!(arrf3[i2] > 1.0f)) continue;
                        }
                    } else {
                        fU.h("Invalid axis values: " + string);
                        arrf3 = arrf;
                    }
                }
                return arrf3;
            }
            f10 = arrf2[0];
        }
        float f14 = f10;
        float f15 = arrf2[1];
        float f16 = arrf2[2];
        float f17 = f14 * f14 + f15 * f15 + f16 * f16 - 1.0E-5f;
        float f18 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
        if (string2 == null) {
            if (f18 < 0) {
                fU.h("Invalid axis values: " + string);
                return arrf;
            }
            f18 = 3;
        }
        float[] arrf4 = new float[f18];
        arrf4[0] = f16;
        arrf4[1] = f15;
        arrf4[2] = -f14;
        float[] arrf5 = arrf4;
        return arrf5;
    }

    private float b(int n2) {
        block8: {
            int n3;
            block7: {
                String string = K.d();
                n3 = this.a(n2, this.j, this.m);
                if (string == null) {
                    if (n3 != 0) {
                        int n4 = this.a(this.m - this.j);
                        int n5 = this.a(n2 - this.j);
                        return (float)n5 / (float)n4;
                    }
                    n3 = this.a(n2, this.m, this.h);
                }
                if (string == null) {
                    if (n3 != 0) {
                        return 1.0f;
                    }
                    n3 = this.a(n2, this.h, this.b);
                }
                if (string != null) break block7;
                if (n3 == 0) break block8;
                n3 = this.a(this.b - this.h);
            }
            int n6 = n3;
            int n7 = this.a(n2 - this.h);
            return 1.0f - (float)n7 / (float)n6;
        }
        return 0.0f;
    }
}

