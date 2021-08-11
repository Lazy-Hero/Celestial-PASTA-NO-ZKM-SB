/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.ImmutablePair
 *  org.apache.commons.lang3.tuple.Pair
 */
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import net.minecraft.K.b;
import net.minecraft.P.r;
import net.minecraft.U.x;
import net.minecraft.W.a7;
import net.minecraft.W.bQ;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ac.a;
import net.minecraft.ac.c;
import net.minecraft.ah.p;
import net.minecraft.ah.t;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.u.av;
import net.minecraft.client.x.P;
import net.minecraft.k.h;
import net.minecraft.k.n;
import net.minecraft.u.g;
import net.minecraft.w.aG;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class fa {
    private static final /* synthetic */ m u;
    private static /* synthetic */ fj C;
    private static /* synthetic */ fj L;
    public static /* synthetic */ Random t;
    private static /* synthetic */ int T;
    private static /* synthetic */ fj z;
    private static /* synthetic */ fj[][] v;
    private static /* synthetic */ fj j;
    private static /* synthetic */ int x;
    private static /* synthetic */ int[] O;
    private static final /* synthetic */ float[][] V;
    private static final /* synthetic */ i y;
    private static /* synthetic */ fj J;
    private static final /* synthetic */ cf c;
    private static /* synthetic */ fj e;
    private static /* synthetic */ int[] P;
    private static /* synthetic */ fj A;
    private static /* synthetic */ fj W;
    private static /* synthetic */ fj[] I;
    private static /* synthetic */ fj H;
    private static /* synthetic */ net.minecraft.k.l m;
    private static final /* synthetic */ i p;
    private static /* synthetic */ String b;
    private static final /* synthetic */ cf Z;
    private static /* synthetic */ int[] N;
    private static /* synthetic */ int F;
    private static /* synthetic */ int w;
    private static /* synthetic */ int G;
    private static final /* synthetic */ m l;
    private static final /* synthetic */ cf E;
    private static /* synthetic */ float[][] B;
    private static /* synthetic */ net.minecraft.k.l d;
    private static /* synthetic */ net.minecraft.k.l s;
    private static /* synthetic */ int k;
    private static /* synthetic */ boolean i;
    private static final /* synthetic */ m Q;
    private static /* synthetic */ fj D;
    private static final /* synthetic */ m Y;
    private static /* synthetic */ fj h;
    private static final /* synthetic */ m o;
    private static /* synthetic */ float[][] aa;
    private static /* synthetic */ fj M;
    private static /* synthetic */ int X;
    private static /* synthetic */ fj[] n;
    private static final /* synthetic */ cf S;
    private static /* synthetic */ int[] R;
    private static /* synthetic */ fj q;
    private static /* synthetic */ fj g;
    private static final /* synthetic */ float[][] a;
    private static /* synthetic */ int f;
    private static /* synthetic */ fj K;
    private static /* synthetic */ fj U;
    private static /* synthetic */ int[] r;

    private static fj b(i i2) {
        block12: {
            int n2;
            int n3;
            l l2;
            String string;
            block11: {
                string = K.d();
                if (v == null) {
                    return null;
                }
                i i3 = i2;
                if (string == null) {
                    if (!(i3 instanceof l)) {
                        return null;
                    }
                    i3 = i2;
                }
                l2 = (l)i3;
                n2 = n3 = l2.a();
                if (string != null) break block11;
                if (n2 < 0) break block12;
                n2 = n3;
            }
            if (n2 < v.length) {
                fj[] arrfj = v[n3];
                if (arrfj == null) {
                    return null;
                }
                int n4 = 0;
                while (n4 < arrfj.length) {
                    fj fj2 = arrfj[n4];
                    if (string == null) {
                        if (fj2.a(l2)) {
                            return fj2;
                        }
                        ++n4;
                    }
                    if (string == null) continue;
                }
                return null;
            }
        }
        return null;
    }

    private static int c() {
        int n2;
        block3: {
            int n3 = 0;
            Iterator iterator = net.minecraft.K.b.e.a().iterator();
            String string = K.d();
            while (iterator.hasNext()) {
                int n4;
                v v2 = (v)iterator.next();
                b b10 = net.minecraft.K.b.e.a(v2);
                n2 = n4 = net.minecraft.K.b.a(b10);
                if (string == null) {
                    if (string == null && n2 > n3) {
                        int n5 = n3 = n4;
                    }
                    if (string == null) continue;
                }
                break block3;
            }
            n2 = n3;
        }
        return n2;
    }

    static fj i() {
        return j;
    }

    public static int a(int n2) {
        String string = K.d();
        int n3 = w;
        if (string == null) {
            n3 = n3 < 0 ? n2 : w;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static net.minecraft.k.l b(net.minecraft.k.l var0, z var1_1, x var2_2, float var3_3) {
        var5_4 = var1_1.D.r();
        var4_5 = K.d();
        if (var4_5 != null) ** GOTO lbl7
        switch (df.a[var5_4.ordinal()]) {
            case 1: {
                var0 = fa.b(var0);
lbl7:
                // 2 sources

                if (var4_5 == null) return var0;
            }
            case 2: {
                var6_6 = net.minecraft.client.Q.P();
                var0 = fa.a(var0, (t)var6_6.e, var2_2.a, var2_2.aF + 1.0, var2_2.ax);
                if (var4_5 == null) return var0;
            }
            case 3: {
                return fa.c(var0);
            }
        }
        return var0;
    }

    private static void a(fj fj2, List list) {
        block3: {
            int[] arrn;
            block5: {
                int n2;
                String string;
                block6: {
                    int[] arrn2;
                    block4: {
                        arrn = fj2.e();
                        string = K.d();
                        arrn2 = arrn;
                        if (string != null) break block4;
                        if (arrn2 == null) break block5;
                        arrn2 = arrn;
                    }
                    int n3 = arrn2.length;
                    if (string != null) break block6;
                    if (n3 <= 0) break block5;
                    n3 = n2 = 0;
                }
                while (n2 < arrn.length) {
                    block9: {
                        int n4;
                        block8: {
                            block7: {
                                n4 = arrn[n2];
                                if (string != null) break block3;
                                if (string != null) break block7;
                                if (n4 >= 0) break block8;
                                fa.e("Invalid block ID: " + n4);
                            }
                            if (string == null) break block9;
                        }
                        fa.a(fj2, list, n4);
                    }
                    ++n2;
                    if (string == null) continue;
                }
                if (string == null) break block3;
            }
            fa.e("No match blocks: " + fU.a(arrn));
        }
    }

    public static float[] b(bl bl2, float[] arrf) {
        return fa.a(bl2, B, arrf);
    }

    private static void a(String string) {
        String string2 = K.d();
        try {
            int[] arrn;
            v v2 = new v(string);
            InputStream inputStream = fU.a(v2);
            if (string2 == null) {
                if (inputStream == null) {
                    return;
                }
                fa.f("Loading " + string);
            }
            Properties properties = new Properties();
            properties.load(inputStream);
            inputStream.close();
            k = fa.a(properties, new String[]{"particle.water", "drop.water"});
            f = fa.b(properties, "particle.portal");
            X = fa.b(properties, "lilypad");
            T = fa.b(properties, "text.xpbar");
            w = fa.b(properties, "text.boss");
            F = fa.b(properties, "text.sign");
            d = fa.c(properties, "fog.nether");
            s = fa.c(properties, "fog.end");
            m = fa.c(properties, "sky.end");
            n = fa.a(properties, string);
            R = fa.b(properties, string, "egg.shell.", "Spawn egg shell");
            O = fa.b(properties, string, "egg.spots.", "Spawn egg spot");
            B = fa.c(properties, string, "collar.", "Wolf collar");
            aa = fa.c(properties, string, "sheep.", "Sheep");
            P = fa.a(properties, string, "text.code.", "Text");
            int[] arrn2 = arrn = fa.d(properties, string, "map.", "Map");
            if (string2 == null) {
                if (arrn2 != null) {
                    int[] arrn3 = r;
                    if (string2 == null) {
                        if (arrn3 == null) {
                            r = fa.k();
                        }
                        arrn3 = arrn;
                    }
                    fa.a(arrn3);
                }
                arrn2 = fa.e(properties, string, "potion.", "Potion");
            }
            N = arrn2;
            x = fU.b(properties.getProperty("xporb.time"), -1);
        }
        catch (FileNotFoundException fileNotFoundException) {
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }

    private static void a(fj fj2, List arrayList, int n2) {
        ArrayList<fj> arrayList2;
        ArrayList<fj> arrayList3;
        String string;
        block4: {
            string = K.d();
            while (n2 >= arrayList.size()) {
                arrayList3 = arrayList;
                if (string == null) {
                    arrayList3.add(null);
                    if (string == null) continue;
                }
                break block4;
            }
            arrayList3 = (List)arrayList.get(n2);
        }
        ArrayList<fj> arrayList4 = arrayList2 = arrayList3;
        if (string == null) {
            if (arrayList4 == null) {
                arrayList2 = new ArrayList<fj>();
                arrayList.set(n2, (fj)((Object)arrayList2));
            }
            arrayList4 = arrayList2;
        }
        arrayList4.add(fj2);
    }

    private static int b(Properties properties, String string) {
        int n2;
        String string2 = properties.getProperty(string);
        String string3 = K.d();
        String string4 = string2;
        if (string3 == null) {
            if (string4 == null) {
                return -1;
            }
            string4 = string2 = string2.trim();
        }
        int n3 = n2 = fa.c(string4);
        if (string3 == null) {
            if (n3 < 0) {
                fa.e("Invalid color: " + string + " = " + string2);
                return n2;
            }
            fa.f(string + " = " + string2);
            n3 = n2;
        }
        return n3;
    }

    public static int b(int n2) {
        String string = K.d();
        int n3 = T;
        if (string == null) {
            n3 = n3 < 0 ? n2 : T;
        }
        return n3;
    }

    static fj b() {
        return q;
    }

    private static void a(float[][] arrf, float f10, int n2, int n3, float[][] arrf2) {
        block7: {
            String string;
            int n4;
            int n5;
            block11: {
                int n6;
                block10: {
                    n5 = (int)Math.floor(f10);
                    n4 = (int)Math.ceil(f10);
                    string = K.d();
                    int n7 = n5;
                    if (string != null) break block10;
                    if (n7 != n4) break block11;
                    n7 = n6 = 0;
                }
                while (n6 < 16) {
                    block8: {
                        float[] arrf3 = arrf[n2 + n6 * n3 + n5];
                        float[] arrf4 = arrf2[n6];
                        if (string != null) break block7;
                        for (int i2 = 0; i2 < 3; ++i2) {
                            arrf4[i2] = arrf3[i2];
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block8;
                        }
                        ++n6;
                    }
                    if (string == null) continue;
                }
                if (string == null) break block7;
            }
            float f11 = 1.0f - (f10 - (float)n5);
            float f12 = 1.0f - ((float)n4 - f10);
            int n8 = 0;
            while (n8 < 16) {
                block9: {
                    float[] arrf5 = arrf[n2 + n8 * n3 + n5];
                    float[] arrf6 = arrf[n2 + n8 * n3 + n4];
                    float[] arrf7 = arrf2[n8];
                    for (int i3 = 0; i3 < 3; ++i3) {
                        arrf7[i3] = arrf5[i3] * f11 + arrf6[i3] * f12;
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block9;
                    }
                    ++n8;
                }
                if (string == null) continue;
            }
        }
    }

    private static void e(String string) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(int n2, int n3) {
        String string = K.d();
        if (N == null) {
            return n3;
        }
        int n4 = n2;
        if (string != null) return n4;
        if (n4 >= 0) {
            n4 = n2;
            if (string != null) return n4;
            if (n4 < N.length) {
                int n5;
                int n6 = n5 = N[n2];
                if (string != null) return n6;
                n6 = n6 < 0 ? n3 : n5;
                return n6;
            }
        }
        n4 = n3;
        return n4;
    }

    public static void b(av av2) {
        block3: {
            int n2;
            block2: {
                String string = K.d();
                n2 = f;
                if (string != null) break block2;
                if (n2 < 0) break block3;
                n2 = f;
            }
            int n3 = n2;
            int n4 = n3 >> 16 & 0xFF;
            int n5 = n3 >> 8 & 0xFF;
            int n6 = n3 & 0xFF;
            float f10 = (float)n4 / 255.0f;
            float f11 = (float)n5 / 255.0f;
            float f12 = (float)n6 / 255.0f;
            av2.a(f10, f11, f12);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int d(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return -1;
            }
            string3 = string;
        }
        int n2 = string3.equals("air");
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.O.a;
            }
            n2 = string.equals("grass");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.t.a;
            }
            n2 = string.equals("sand");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.K.a;
            }
            n2 = string.equals("cloth");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.i.a;
            }
            n2 = string.equals("tnt");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.X.a;
            }
            n2 = string.equals("ice");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.u.a;
            }
            n2 = string.equals("iron");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.D.a;
            }
            n2 = string.equals("foliage");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.m.a;
            }
            n2 = string.equals("clay");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.U.a;
            }
            n2 = string.equals("dirt");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.ad.a;
            }
            n2 = string.equals("stone");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.T.a;
            }
            n2 = string.equals("water");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.B.a;
            }
            n2 = string.equals("wood");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.E.a;
            }
            n2 = string.equals("quartz");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.V.a;
            }
            n2 = string.equals("gold");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.e.a;
            }
            n2 = string.equals("diamond");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.G.a;
            }
            n2 = string.equals("lapis");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.M.a;
            }
            n2 = string.equals("emerald");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.A.a;
            }
            n2 = string.equals("podzol");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.v.a;
            }
            n2 = string.equals("netherrack");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return net.minecraft.ac.a.aa.a;
            }
            n2 = string.equals("snow") ? 1 : 0;
        }
        if (string2 != null) return n2;
        if (n2 == 0) {
            n2 = string.equals("white") ? 1 : 0;
            if (string2 != null) return n2;
            if (n2 == 0) {
                int n3 = string.equals("adobe");
                if (string2 != null) return n3;
                if (n3 == 0) {
                    n3 = string.equals("orange") ? 1 : 0;
                    if (string2 != null) return n3;
                    if (n3 == 0) {
                        int n4 = string.equals("magenta");
                        if (string2 == null) {
                            if (n4 != 0) {
                                return net.minecraft.ac.a.d.a;
                            }
                            n4 = string.equals("light_blue") ? 1 : 0;
                        }
                        if (string2 != null) return n4;
                        if (n4 == 0) {
                            n4 = string.equals("lightBlue") ? 1 : 0;
                            if (string2 != null) return n4;
                            if (n4 == 0) {
                                int n5 = string.equals("yellow");
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.g.a;
                                    }
                                    n5 = string.equals("lime");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.H.a;
                                    }
                                    n5 = string.equals("pink");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.x.a;
                                    }
                                    n5 = string.equals("gray");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.L.a;
                                    }
                                    n5 = string.equals("silver");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.l.a;
                                    }
                                    n5 = string.equals("cyan");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.h.a;
                                    }
                                    n5 = string.equals("purple");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.ab.a;
                                    }
                                    n5 = string.equals("blue");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.w.a;
                                    }
                                    n5 = string.equals("brown");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.Z.a;
                                    }
                                    n5 = string.equals("green");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.I.a;
                                    }
                                    n5 = string.equals("red");
                                }
                                if (string2 == null) {
                                    if (n5 != 0) {
                                        return net.minecraft.ac.a.W.a;
                                    }
                                    n5 = string.equals("black");
                                }
                                if (string2 != null) return n5;
                                if (n5 == 0) return -1;
                                n5 = net.minecraft.ac.a.k.a;
                                return n5;
                            }
                        }
                        n4 = net.minecraft.ac.a.q.a;
                        return n4;
                    }
                }
                n3 = net.minecraft.ac.a.N.a;
                return n3;
            }
        }
        n2 = net.minecraft.ac.a.b.a;
        return n2;
    }

    private static float[] a(bl bl2, float[][] arrf, float[] arrf2) {
        float[] arrf3;
        String string = K.d();
        if (arrf == null) {
            return arrf2;
        }
        if (bl2 == null) {
            return arrf2;
        }
        float[] arrf4 = arrf3 = arrf[bl2.ordinal()];
        if (string == null) {
            arrf4 = arrf4 == null ? arrf2 : arrf3;
        }
        return arrf4;
    }

    private static net.minecraft.k.l c(Properties properties, String string) {
        int n2 = fa.b(properties, string);
        String string2 = K.d();
        int n3 = n2;
        if (string2 == null) {
            if (n3 < 0) {
                return null;
            }
            n3 = n2 >> 16 & 0xFF;
        }
        int n4 = n3;
        int n5 = n2 >> 8 & 0xFF;
        int n6 = n2 & 0xFF;
        float f10 = (float)n4 / 255.0f;
        float f11 = (float)n5 / 255.0f;
        float f12 = (float)n6 / 255.0f;
        return new net.minecraft.k.l(f10, f11, f12);
    }

    private static String a(String string, String string2, String[] arrstring, String string3) {
        String string4 = K.d();
        try {
            String string5;
            block10: {
                String string6;
                block9: {
                    v v2 = new v(string);
                    InputStream inputStream = fU.a(v2);
                    if (inputStream == null) {
                        return string3;
                    }
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    inputStream.close();
                    string6 = string5 = properties.getProperty(string2);
                    if (string4 != null) break block9;
                    if (string6 != null) break block10;
                    string6 = string3;
                }
                return string6;
            }
            List<String> list = Arrays.asList(arrstring);
            if (string4 == null) {
                if (!list.contains(string5)) {
                    fa.e("Invalid value: " + string2 + "=" + string5);
                    fa.e("Expected values: " + fU.a(arrstring));
                    return string3;
                }
                fa.f("" + string2 + "=" + string5);
            }
            return string5;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return string3;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return string3;
        }
    }

    private static int[] d(Properties properties, String string, String string2, String string3) {
        int n2;
        int n3;
        int[] arrn;
        block5: {
            arrn = new int[net.minecraft.ac.a.F.length];
            Arrays.fill(arrn, -1);
            n3 = 0;
            String string4 = K.d();
            for (Object object : properties.keySet()) {
                block7: {
                    String string5;
                    block9: {
                        int n4;
                        int n5;
                        block10: {
                            block8: {
                                String string6;
                                String string7;
                                block6: {
                                    string5 = properties.getProperty((String)object);
                                    string7 = (String)object;
                                    string6 = string2;
                                    if (string4 != null) break block6;
                                    n2 = string7.startsWith(string6) ? 1 : 0;
                                    if (string4 != null) break block5;
                                    if (n2 == 0) break block7;
                                    string7 = (String)object;
                                    string6 = string2;
                                }
                                String string8 = dQ.f(string7, string6);
                                int n6 = fa.d(string8);
                                n5 = fa.c(string5);
                                n4 = n6;
                                if (string4 != null) break block8;
                                if (n4 < 0) break block9;
                                n4 = n6;
                            }
                            if (string4 != null) break block10;
                            if (n4 >= arrn.length) break block9;
                            n4 = n5;
                        }
                        if (n4 < 0) break block9;
                        arrn[n6] = n5;
                        ++n3;
                        if (string4 == null) break block7;
                    }
                    fa.e("Invalid color: " + object + " = " + string5);
                }
                if (string4 == null) continue;
            }
            n2 = n3;
        }
        if (n2 <= 0) {
            return null;
        }
        fa.f(string3 + " colors: " + n3);
        return arrn;
    }

    public static int a(b b10, int n2) {
        int n3;
        block3: {
            b b11;
            block2: {
                n3 = 0;
                String string = K.d();
                b11 = b10;
                if (string != null) break block2;
                if (b11 == null) break block3;
                b11 = b10;
            }
            n3 = net.minecraft.K.b.a(b11);
        }
        return fa.b(n3, n2);
    }

    private static int a(i i2) {
        if (L == null) {
            return -1;
        }
        int n2 = fa.a(i2, 15);
        int n3 = L.b(n2);
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int a(String string, int n2) {
        String string2 = K.d();
        try {
            int n3;
            InputStream inputStream;
            InputStream inputStream2 = inputStream = fU.a(new v(string));
            if (string2 == null) {
                if (inputStream2 == null) {
                    return n2;
                }
                inputStream2 = inputStream;
            }
            BufferedImage bufferedImage = ImageIO.read(inputStream2);
            inputStream.close();
            BufferedImage bufferedImage2 = bufferedImage;
            if (string2 == null) {
                if (bufferedImage2 == null) {
                    n3 = n2;
                    return n3;
                }
                bufferedImage2 = bufferedImage;
            }
            n3 = bufferedImage2.getHeight();
            return n3;
        }
        catch (IOException iOException) {
            return n2;
        }
    }

    public static net.minecraft.k.l b(t t2, double d10, double d11, double d12) {
        return fa.a(t2, d10, d11, d12, A, c);
    }

    private static int[] e(Properties properties, String string, String string2, String string3) {
        int n2;
        int n3;
        int[] arrn;
        block5: {
            String string4 = K.d();
            arrn = new int[fa.c()];
            Arrays.fill(arrn, -1);
            n3 = 0;
            String string5 = string4;
            for (Object object : properties.keySet()) {
                block7: {
                    String string6;
                    block9: {
                        int n4;
                        int n5;
                        block10: {
                            block8: {
                                int n6;
                                block6: {
                                    string6 = properties.getProperty((String)object);
                                    n2 = ((String)object).startsWith(string2) ? 1 : 0;
                                    if (string5 != null) break block5;
                                    if (string5 != null) break block6;
                                    if (n2 == 0) break block7;
                                    n6 = fa.b((String)object);
                                }
                                void var10_10 = n6;
                                n5 = fa.c(string6);
                                n4 = var10_10;
                                if (string5 != null) break block8;
                                if (n4 < 0) break block9;
                                n4 = var10_10;
                            }
                            if (string5 != null) break block10;
                            if (n4 >= arrn.length) break block9;
                            n4 = n5;
                        }
                        if (n4 < 0) break block9;
                        arrn[var10_10] = n5;
                        ++n3;
                        if (string5 == null) break block7;
                    }
                    fa.e("Invalid color: " + object + " = " + string6);
                }
                if (string5 == null) continue;
            }
            n2 = n3;
        }
        if (n2 <= 0) {
            return null;
        }
        fa.f(string3 + " colors: " + n3);
        return arrn;
    }

    public static float[] a(bl bl2, float[] arrf) {
        return fa.a(bl2, aa, arrf);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(aG aG2, d d10, int n2, int n3) {
        int[] arrn;
        r r2;
        r r3;
        String string;
        block12: {
            int[] arrn2;
            block11: {
                string = K.d();
                arrn2 = R;
                if (string != null) break block11;
                if (arrn2 != null) break block12;
                arrn2 = O;
            }
            if (arrn2 == null) {
                return n3;
            }
        }
        r r4 = r3 = d10.v();
        if (string == null) {
            if (r4 == null) {
                return n3;
            }
            r4 = r3.h("EntityTag");
        }
        r r5 = r2 = r4;
        if (string == null) {
            if (r5 == null) {
                return n3;
            }
            r5 = r2;
        }
        String string2 = r5.j("id");
        int n4 = fA.a(string2);
        int[] arrn3 = arrn = n2 == 0 ? R : O;
        if (arrn == null) {
            return n3;
        }
        int n5 = n4;
        if (string != null) return n5;
        if (n5 >= 0) {
            n5 = n4;
            if (string != null) return n5;
            if (n5 < arrn.length) {
                int n6;
                int n7 = n6 = arrn[n4];
                if (string != null) return n7;
                n7 = n7 < 0 ? n3 : n6;
                return n7;
            }
        }
        n5 = n3;
        return n5;
    }

    private static void f(String string) {
    }

    public static int a(d d10, int n2, int n3) {
        k k2;
        String string = K.d();
        d d11 = d10;
        if (string == null) {
            if (d11 == null) {
                return n3;
            }
            d11 = d10;
        }
        k k3 = k2 = d11.w();
        if (string == null) {
            if (k3 == null) {
                return n3;
            }
            k3 = k2;
        }
        int n4 = k3 instanceof aG;
        if (string == null) {
            n4 = n4 != 0 ? fa.a((aG)k2, d10, n2, n3) : n3;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static int a(P var0, i var1_1, t var2_2, n var3_3, e9 var4_4) {
        block41: {
            block40: {
                block39: {
                    block37: {
                        block38: {
                            block35: {
                                block36: {
                                    block34: {
                                        block33: {
                                            block32: {
                                                var6_5 = var1_1.b();
                                                var5_6 = K.d();
                                                var7_7 = var4_4.f();
                                                if (fa.v != null) {
                                                    if (!var0.c()) {
                                                        v0 = var6_5;
                                                        if (var5_6 == null) {
                                                            if (v0 == net.minecraft.u.g.aU) {
                                                                var7_7 = fa.p;
                                                            }
                                                            v0 = var6_5;
                                                        }
                                                        if (var5_6 == null) {
                                                            if (v0 == net.minecraft.u.g.bK) {
                                                                return -1;
                                                            } else {
                                                                ** GOTO lbl-1000
                                                            }
                                                        }
                                                    } else lbl-1000:
                                                    // 3 sources

                                                    {
                                                        v0 = var6_5;
                                                    }
                                                    if (v0 == net.minecraft.u.g.bW && var4_4.m() >= 8) {
                                                        var3_3 = var3_3.k();
                                                        var7_7 = var2_2.d(var3_3);
                                                    }
                                                    if ((var8_8 = fa.b(var7_7)) != null) {
                                                        v1 = fU.i();
                                                        if (var5_6 != null) return v1;
                                                        if (v1 != 0) {
                                                            v1 = var8_8.a() ? 1 : 0;
                                                            if (var5_6 != null) return v1;
                                                            if (v1 == 0) {
                                                                return fa.a(var1_1, var2_2, var3_3, var8_8, var4_4.g());
                                                            }
                                                        }
                                                        v1 = var8_8.a(var2_2, var3_3);
                                                        return v1;
                                                    }
                                                }
                                                v2 = var0.c();
                                                if (var5_6 != null) return v2;
                                                if (v2 == 0) {
                                                    return -1;
                                                }
                                                v3 = var6_5;
                                                if (var5_6 == null) {
                                                    if (v3 == net.minecraft.u.g.c_) {
                                                        return fa.b(var2_2, var3_3);
                                                    }
                                                    v3 = var6_5;
                                                }
                                                if (var5_6 == null) {
                                                    if (v3 == net.minecraft.u.g.bK) {
                                                        return fa.a(var4_4.f());
                                                    }
                                                    v3 = var6_5;
                                                }
                                                v4 = v3 instanceof a7;
                                                if (var5_6 == null) {
                                                    if (v4 != 0) {
                                                        return fa.a(var6_5, var2_2, var3_3, var4_4);
                                                    }
                                                    v4 = fa.i;
                                                }
                                                if (var5_6 == null) {
                                                    if (v4 != 0) {
                                                        return -1;
                                                    }
                                                    v4 = var4_4.m();
                                                }
                                                var8_9 = v4;
                                                v5 = var6_5;
                                                if (var5_6 != null) break block32;
                                                if (v5 == net.minecraft.u.g.aU) ** GOTO lbl106
                                                v5 = var6_5;
                                            }
                                            if (var5_6 != null) break block33;
                                            if (v5 == net.minecraft.u.g.dc) ** GOTO lbl106
                                            v5 = var6_5;
                                        }
                                        v6 = net.minecraft.u.g.bW;
                                        if (var5_6 != null) break block34;
                                        if (v5 == v6) ** GOTO lbl106
                                        v5 = var6_5;
                                        if (var5_6 != null) break block35;
                                        v6 = net.minecraft.u.g.bW;
                                    }
                                    if (v5 != v6) break block36;
                                    var9_10 = fa.Q;
                                    v7 = var8_9;
                                    if (var5_6 != null) break block37;
                                    if (v7 < 8) break block38;
                                    var3_3 = var3_3.k();
                                    if (var5_6 == null) break block38;
                                }
                                v5 = var6_5;
                            }
                            v8 /* !! */  = net.minecraft.u.g.bU;
                            if (var5_6 != null) ** GOTO lbl96
                            if (v5 != v8 /* !! */ ) ** GOTO lbl94
                            switch (var8_9 & 3) {
                                case 0: {
                                    var9_10 = fa.l;
                                    if (var5_6 == null) break;
                                }
                                case 1: {
                                    var9_10 = fa.Y;
                                    if (var5_6 == null) break;
                                }
                                case 2: {
                                    var9_10 = fa.u;
                                    if (var5_6 == null) break;
                                }
                                default: {
                                    var9_10 = fa.l;
                                    if (var5_6 == null) break;
lbl94:
                                    // 2 sources

                                    v5 = var6_5;
                                    v8 /* !! */  = net.minecraft.u.g.S;
lbl96:
                                    // 2 sources

                                    if (var5_6 == null) {
                                        if (v5 == v8 /* !! */ ) {
                                            var9_10 = fa.l;
                                            if (var5_6 == null) break;
                                        }
                                        v5 = var6_5;
                                        v8 /* !! */  = net.minecraft.u.g.aW;
                                    }
                                    if (v5 != v8 /* !! */ ) {
                                        return -1;
                                    }
                                    var9_10 = fa.l;
                                    if (var5_6 == null) break;
lbl106:
                                    // 4 sources

                                    var9_10 = fa.Q;
                                }
                            }
                        }
                        v7 = fU.i();
                    }
                    if (var5_6 != null) break block39;
                    if (v7 == 0) break block40;
                    v9 = var9_10;
                    if (var5_6 != null) break block41;
                    v7 = v9.a() ? 1 : 0;
                }
                if (v7 == 0) {
                    v10 = fa.a(var1_1, var2_2, var3_3, var9_10, var4_4.g());
                    return v10;
                }
            }
            v9 = var9_10;
        }
        v10 = v9.a(var7_7, var2_2, var3_3);
        return v10;
    }

    public static void a(av av2) {
        block3: {
            fj fj2;
            block2: {
                String string = K.d();
                fj2 = z;
                if (string != null) break block2;
                if (fj2 == null) break block3;
                fj2 = z;
            }
            int n2 = fj2.d();
            int n3 = n2 >> 16 & 0xFF;
            int n4 = n2 >> 8 & 0xFF;
            int n5 = n2 & 0xFF;
            float f10 = (float)n3 / 255.0f;
            float f11 = (float)n4 / 255.0f;
            float f12 = (float)n5 / 255.0f;
            av2.a(f10, f11, f12);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2, int n3) {
        String string = K.d();
        if (P == null) {
            return n3;
        }
        int n4 = n2;
        if (string != null) return n4;
        if (n4 >= 0) {
            n4 = n2;
            if (string != null) return n4;
            if (n4 < P.length) {
                int n5;
                int n6 = n5 = P[n2];
                if (string != null) return n6;
                n6 = n6 < 0 ? n3 : n5;
                return n6;
            }
        }
        n4 = n3;
        return n4;
    }

    private static net.minecraft.k.l c(net.minecraft.k.l l2) {
        String string = K.d();
        net.minecraft.k.l l3 = s;
        if (string == null) {
            l3 = l3 == null ? l2 : s;
        }
        return l3;
    }

    public static net.minecraft.k.l a(t t2, double d10, double d11, double d12, fj fj2, cf cf2) {
        String string = K.d();
        fj fj3 = fj2;
        if (string == null) {
            if (fj3 == null) {
                return null;
            }
            fj3 = fj2;
        }
        int n2 = fj3.a(t2, d10, d11, d12, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f10 = (float)n3 / 255.0f;
        float f11 = (float)n4 / 255.0f;
        float f12 = (float)n5 / 255.0f;
        net.minecraft.k.l l2 = cf2.a(f10, f11, f12);
        return l2;
    }

    private static int a(Properties properties, String[] arrstring) {
        int n2;
        block4: {
            int n3 = 0;
            String string = K.d();
            while (n3 < arrstring.length) {
                String string2 = arrstring[n3];
                int n4 = fa.b(properties, string2);
                if (string == null) {
                    n2 = n4;
                    if (string != null) break block4;
                    if (n2 >= 0) {
                        return n4;
                    }
                    ++n3;
                }
                if (string == null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    public static net.minecraft.k.l b(net.minecraft.k.l l2, t t2, double d10, double d11, double d12) {
        String string = K.d();
        fj fj2 = U;
        if (string == null) {
            if (fj2 == null) {
                return l2;
            }
            fj2 = U;
        }
        int n2 = fj2.a(t2, d10, d11, d12, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f10 = (float)n3 / 255.0f;
        float f11 = (float)n4 / 255.0f;
        float f12 = (float)n5 / 255.0f;
        float f13 = (float)l2.e / 0.5f;
        float f14 = (float)l2.d / 0.66275f;
        float f15 = (float)l2.b;
        net.minecraft.k.l l3 = Z.a(f10 *= f13, f11 *= f14, f12 *= f15);
        return l3;
    }

    private static int a(i i2, t t2, n n2, m m2, fZ fZ2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        block3: {
            int n8 = 0;
            int n9 = 0;
            n7 = 0;
            int n10 = n2.e();
            int n11 = n2.b();
            String string = K.d();
            int n12 = n2.a();
            fZ fZ3 = fZ2;
            n6 = n10 - 1;
            while (n6 <= n10 + 1) {
                block4: {
                    n5 = n12 - 1;
                    if (string != null) break block3;
                    for (n4 = v1223020; n4 <= n12 + 1; ++n4) {
                        fZ3.a(n6, n11, n4);
                        n3 = m2.a(i2, t2, fZ3);
                        n8 += n3 >> 16 & 0xFF;
                        n9 += n3 >> 8 & 0xFF;
                        n7 += n3 & 0xFF;
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block4;
                    }
                    ++n6;
                }
                if (string == null) continue;
            }
            n6 = n8 / 9;
            n5 = n9 / 9;
        }
        n4 = n5;
        n3 = n7 / 9;
        return n6 << 16 | n4 << 8 | n3;
    }

    static {
        b = "vanilla";
        q = null;
        j = null;
        M = null;
        C = null;
        K = null;
        n = null;
        v = null;
        U = null;
        Z = new cf();
        J = null;
        E = new cf();
        A = null;
        c = new cf();
        W = null;
        S = new cf();
        I = null;
        G = 0;
        a = new float[16][3];
        V = new float[16][3];
        L = null;
        H = null;
        x = -1;
        e = null;
        h = null;
        D = null;
        g = null;
        z = null;
        i = true;
        k = -1;
        f = -1;
        X = -1;
        T = -1;
        w = -1;
        F = -1;
        d = null;
        s = null;
        m = null;
        R = null;
        O = null;
        B = null;
        aa = null;
        P = null;
        r = null;
        N = null;
        p = net.minecraft.u.g.bv.d();
        y = net.minecraft.u.g.bQ.d();
        t = new Random();
        Q = new dg();
        l = new ay();
        Y = new cQ();
        u = new eK();
        o = new gr();
    }

    public static void a(av av2, t t2, double d10, double d11, double d12) {
        if (L != null) {
            i i2 = t2.d(new n(d10, d11, d12));
            int n2 = fa.a(i2, 15);
            int n3 = L.b(n2);
            int n4 = n3 >> 16 & 0xFF;
            int n5 = n3 >> 8 & 0xFF;
            int n6 = n3 & 0xFF;
            float f10 = (float)n4 / 255.0f;
            float f11 = (float)n5 / 255.0f;
            float f12 = (float)n6 / 255.0f;
            av2.a(f10, f11, f12);
        }
    }

    private static int a(net.minecraft.W.K k2, t t2, n n2, e9 e92) {
        fj fj2;
        fj fj3;
        block12: {
            block11: {
                net.minecraft.W.K k3;
                net.minecraft.W.K k4;
                String string;
                block8: {
                    block9: {
                        fj fj4;
                        block10: {
                            fj3 = h;
                            string = K.d();
                            k4 = k2;
                            k3 = net.minecraft.u.g.Q;
                            if (string != null) break block8;
                            if (k4 != k3) break block9;
                            fj4 = g;
                            if (string != null) break block10;
                            if (fj4 == null) break block9;
                            fj4 = g;
                        }
                        fj3 = fj4;
                    }
                    k4 = k2;
                    k3 = net.minecraft.u.g.aM;
                }
                if (k4 != k3) break block11;
                fj2 = D;
                if (string != null) break block12;
                if (fj2 != null) {
                    fj3 = D;
                }
            }
            fj2 = fj3;
        }
        if (fj2 == null) {
            return -1;
        }
        int n3 = e92.m();
        return fj3.b(n3);
    }

    public static fj a(String string, int n2, int n3) {
        String string2 = K.d();
        try {
            Object object;
            String string3;
            Properties properties;
            block9: {
                block7: {
                    Object object2;
                    block8: {
                        v v2 = new v(string);
                        if (string2 == null) {
                            if (!fU.b(v2)) {
                                return null;
                            }
                            fa.f("Colormap " + string);
                        }
                        properties = new Properties();
                        string3 = dQ.d(string, ".png", ".properties");
                        v v3 = new v(string3);
                        object2 = v3;
                        if (string2 != null) break block7;
                        if (!fU.b((v)object2)) break block8;
                        object = fU.a(v3);
                        properties.load((InputStream)object);
                        ((InputStream)object).close();
                        fa.f("Colormap properties: " + string3);
                        if (string2 == null) break block9;
                    }
                    properties.put("format", b);
                    object2 = properties.put("source", string);
                }
                string3 = string;
            }
            return !((fj)(object = new fj(properties, string3, n2, n3, b))).a(string3) ? null : object;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    private static net.minecraft.k.l a(net.minecraft.k.l l2) {
        String string = K.d();
        net.minecraft.k.l l3 = m;
        if (string == null) {
            l3 = l3 == null ? l2 : m;
        }
        return l3;
    }

    static fj g() {
        return K;
    }

    static fj d() {
        return M;
    }

    public static float a(float f10) {
        if (x <= 0) {
            return f10;
        }
        float f11 = 628.0f / (float)x;
        return f10 * f11;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static fj[][] a(String[] var0, fj[] var1_1, int var2_2, int var3_3) {
        var5_4 = ci.a(var0, new String[]{".properties"});
        v0 = K.d();
        Arrays.sort(var5_4);
        var6_5 = new ArrayList<E>();
        var4_8 = v0;
        for (var7_6 = 0; var7_6 < var5_4.length; ++var7_6) {
            var8_9 = var5_4[var7_6];
            fa.f("Block colormap: " + (String)var8_9);
            try {
                block20: {
                    block19: {
                        block18: {
                            block17: {
                                var9_10 = new v("minecraft", (String)var8_9);
                                var10_13 = fU.a(var9_10);
                                if (var4_8 != null) ** GOTO lbl-1000
                                if (var4_8 != null) break block17;
                                if (var10_13 != null) break block18;
                                fa.e("File not found: " + (String)var8_9);
                            }
                            if (var4_8 == null) continue;
                        }
                        var11_14 = new Properties();
                        var11_14.load(var10_13);
                        var12_15 = new fj(var11_14, (String)var8_9, var2_2, var3_3, fa.b);
                        v1 = var12_15.a((String)var8_9);
                        if (var4_8 != null) break block19;
                        if (!v1) continue;
                        v2 = var12_15;
                        if (var4_8 != null) break block20;
                        v1 = v2.e((String)var8_9);
                    }
                    if (!v1) continue;
                    v2 = var12_15;
                }
                fa.a(v2, var6_5);
                continue;
            }
            catch (FileNotFoundException var9_11) {
                fa.e("File not found: " + (String)var8_9);
                continue;
            }
            catch (Exception var9_12) {
                var9_12.printStackTrace();
            }
            if (var4_8 == null) continue;
        }
        if (var1_1 != null) {
            for (var7_6 = 0; var7_6 < var1_1.length; ++var7_6) {
                var8_9 = var1_1[var7_6];
                fa.a((fj)var8_9, var6_5);
                if (var4_8 == null) {
                    if (var4_8 == null) continue;
                }
                break;
            }
        } else lbl-1000:
        // 4 sources

        {
            v3 = var6_5;
            if (var4_8 != null) return fa.a(v3);
            if (v3.size() <= 0) {
                return null;
            }
        }
        v3 = var6_5;
        return fa.a(v3);
    }

    public static int b(float f10) {
        if (H == null) {
            return -1;
        }
        int n2 = (int)Math.round((double)((net.minecraft.k.h.g(f10) + 1.0f) * (float)(H.h() - 1)) / 2.0);
        int n3 = H.b(n2);
        return n3;
    }

    private static void a(int[] arrn) {
        block4: {
            int n2;
            block3: {
                String string = K.d();
                if (arrn == null) break block4;
                a[] arra = net.minecraft.ac.a.F;
                int n3 = 0;
                int n4 = 0;
                while (n4 < arra.length) {
                    block5: {
                        block6: {
                            int n5;
                            block7: {
                                n2 = n4;
                                if (string != null || string != null) break block3;
                                if (n2 >= arrn.length) break;
                                a a10 = arra[n4];
                                if (string != null) break block5;
                                if (a10 == null) break block6;
                                int n6 = arrn[n4];
                                if (string != null) break block5;
                                if (n6 < 0) break block6;
                                n5 = a10.J;
                                if (string != null) break block7;
                                if (n5 == n6) break block6;
                                a10.J = n6;
                                n5 = 1;
                            }
                            n3 = n5;
                        }
                        ++n4;
                    }
                    if (string == null) continue;
                }
                n2 = n3;
            }
            if (n2 == 0) break block4;
            net.minecraft.client.Q.P().aN().b();
        }
    }

    public static void a(av av2, t t2, double d10, double d11, double d12, e9 e92) {
        block2: {
            float f10;
            float f11;
            float f12;
            block4: {
                int n2;
                block3: {
                    String string = K.d();
                    if (q == null && v == null) break block2;
                    n n3 = new n(d10, d11, d12);
                    e92.a(t2, y, n3);
                    int n4 = fa.a(t2, y, n3, e92);
                    int n5 = n4 >> 16 & 0xFF;
                    int n6 = n4 >> 8 & 0xFF;
                    int n7 = n4 & 0xFF;
                    f12 = (float)n5 / 255.0f;
                    f11 = (float)n6 / 255.0f;
                    f10 = (float)n7 / 255.0f;
                    n2 = k;
                    if (string != null) break block3;
                    if (n2 < 0) break block4;
                    n2 = k >> 16 & 0xFF;
                }
                int n8 = n2;
                int n9 = k >> 8 & 0xFF;
                int n10 = k & 0xFF;
                f12 *= (float)n8 / 255.0f;
                f11 *= (float)n9 / 255.0f;
                f10 *= (float)n10 / 255.0f;
            }
            av2.a(f12, f11, f10);
        }
    }

    public static net.minecraft.k.l a(net.minecraft.k.l l2, z z2, x x2, float f10) {
        p p2 = z2.D.r();
        String string = K.d();
        switch (p2) {
            case OVERWORLD: {
                Q q2 = net.minecraft.client.Q.P();
                l2 = fa.b(l2, q2.e, x2.a, x2.aF + 1.0, x2.ax);
                if (string == null) break;
            }
            case THE_END: {
                l2 = fa.a(l2);
            }
        }
        return l2;
    }

    public static int c(int n2) {
        String string = K.d();
        int n3 = F;
        if (string == null) {
            n3 = n3 < 0 ? n2 : F;
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean a(z var0, float var1_1, int[] var2_2, boolean var3_3) {
        block29: {
            block28: {
                var4_4 = K.d();
                if (var0 == null) {
                    return false;
                }
                if (fa.I == null) {
                    return false;
                }
                var5_5 = var0.D.r().a();
                v0 = var6_6 = var5_5 - fa.G;
                if (var4_4 != null) return (boolean)v0;
                if (v0 < 0) return (boolean)0;
                v0 = var6_6;
                if (var4_4 != null) return (boolean)v0;
                if (v0 >= fa.I.length) return (boolean)0;
                v1 = var7_7 = fa.I[var6_6];
                if (var4_4 == null) {
                    if (v1 == null) {
                        return false;
                    }
                    v1 = var7_7;
                }
                var8_8 = v1.a();
                v2 = var3_3;
                if (var4_4 == null) {
                    if (v2 != 0) {
                        v2 = var8_8;
                        if (var4_4 == null) {
                            if (v2 < 64) {
                                return false;
                            } else {
                                ** GOTO lbl-1000
                            }
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        v2 = var7_7.g();
                    }
                }
                v3 = var9_9 = v2;
                if (var4_4 == null) {
                    if (v3 < 16) {
                        fa.e("Invalid lightmap width: " + var9_9 + " for dimension: " + var5_5);
                        fa.I[var6_6] = null;
                        return false;
                    }
                    v3 = 0;
                }
                var10_10 = v3;
                v4 = var3_3;
                if (var4_4 != null) break block28;
                if (v4 == 0) break block29;
                v4 = var9_9 * 16 * 2;
            }
            var10_10 = v4;
        }
        var11_11 = 1.1666666f * (var0.j(1.0f) - 0.2f);
        if (var4_4 == null) {
            if (var0.z() > 0) {
                var11_11 = 1.0f;
            }
            var11_11 = fU.a(var11_11);
        }
        var12_12 = var11_11 * (float)(var9_9 - 1);
        var13_13 = fU.a(var1_1 + 0.5f) * (float)(var9_9 - 1);
        var14_14 = fU.a(fU.a().aj);
        cfr_temp_0 = var14_14 - 1.0E-4f;
        v5 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
        if (var4_4 == null) {
            v5 = v5 > 0 ? (float)true : (float)false;
        }
        var15_15 = v5;
        var16_16 = var7_7.f();
        fa.a(var16_16, var12_12, var10_10, var9_9, fa.a);
        fa.a(var16_16, var13_13, var10_10 + 16 * var9_9, var9_9, fa.V);
        var17_17 = new float[3];
        var18_18 = 0;
        do {
            v6 = var18_18;
            block1: while (true) {
                if (v6 >= 16) return (boolean)1;
                v7 = 0;
                if (var4_4 != null) return (boolean)v7;
                for (var19_19 = v1226544; var19_19 < 16; ++var19_19) {
                    block27: {
                        v6 = 0;
                        if (var4_4 != null) continue block1;
                        var20_20 = v6;
                        while (var20_20 < 3) {
                            var21_22 = fU.a(fa.a[var18_18][var20_20] + fa.V[var19_19][var20_20]);
                            if (var4_4 == null) {
                                v8 = (int)var15_15;
                                if (var4_4 != null) break block27;
                                if (v8 != 0) {
                                    var22_24 = 1.0f - var21_22;
                                    var22_24 = 1.0f - var22_24 * var22_24 * var22_24 * var22_24;
                                    var21_22 = var14_14 * var22_24 + (1.0f - var14_14) * var21_22;
                                }
                                var17_17[var20_20] = var21_22;
                                ++var20_20;
                            }
                            if (var4_4 == null) continue;
                        }
                        var20_20 = (int)(var17_17[0] * 255.0f);
                        v8 = (int)(var17_17[1] * 255.0f);
                    }
                    var21_21 = v8;
                    var22_23 = (int)(var17_17[2] * 255.0f);
                    var2_2[var18_18 * 16 + var19_19] = -16777216 | var20_20 << 16 | var21_21 << 8 | var22_23;
                    if (var4_4 == null) continue;
                }
                break;
            }
            ++var18_18;
        } while (var4_4 == null);
        return (boolean)1;
    }

    public static net.minecraft.k.l a(t t2, double d10, double d11, double d12) {
        return fa.a(t2, d10, d11, d12, W, S);
    }

    public static int b(String string) {
        int n2;
        block6: {
            String string2 = K.d();
            String string3 = string;
            String string4 = "potion.water";
            if (string2 == null) {
                if (string3.equals(string4)) {
                    return 0;
                }
                string3 = string;
                string4 = "potion.";
            }
            string = dQ.a(string3, string4, "effect.");
            for (v v2 : net.minecraft.K.b.e.a()) {
                block8: {
                    int n3;
                    block7: {
                        b b10 = net.minecraft.K.b.e.a(v2);
                        n2 = b10.i().equals(string) ? 1 : 0;
                        if (string2 != null) break block6;
                        if (string2 != null) break block7;
                        if (n2 == 0) break block8;
                        n3 = net.minecraft.K.b.a(b10);
                    }
                    return n3;
                }
                if (string2 == null) continue;
            }
            n2 = -1;
        }
        return n2;
    }

    private static net.minecraft.k.l b(net.minecraft.k.l l2) {
        String string = K.d();
        net.minecraft.k.l l3 = d;
        if (string == null) {
            l3 = l3 == null ? l2 : d;
        }
        return l3;
    }

    /*
     * Exception decompiling
     */
    public static void j() {
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

    static fj a() {
        return C;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static fj[] a(Properties properties, String string) {
        ArrayList<fj> arrayList;
        ArrayList<fj> arrayList2;
        block11: {
            String string2;
            arrayList2 = new ArrayList<fj>();
            String string3 = "palette.block.";
            HashMap<Object, String> hashMap = new HashMap<Object, String>();
            String string4 = K.d();
            for (Object object : properties.keySet()) {
                string2 = properties.getProperty((String)object);
                String string5 = (String)object;
                if (string4 == null && string5.startsWith(string3)) {
                    string5 = hashMap.put(object, string2);
                }
                if (string4 == null) continue;
            }
            String[] arrstring = hashMap.keySet().toArray(new String[hashMap.size()]);
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                String string6;
                block16: {
                    block12: {
                        int n2;
                        R[] arrr;
                        fj fj2;
                        block17: {
                            R[] arrr2;
                            block15: {
                                block14: {
                                    block13: {
                                        string2 = arrstring[i2];
                                        string6 = properties.getProperty(string2);
                                        fa.f("Block palette: " + string2 + " = " + string6);
                                        String string7 = string2.substring(string3.length());
                                        String string8 = fp.a(string);
                                        string7 = fp.a(string7, string8);
                                        fj2 = fa.a(string7, 256, 256);
                                        if (string4 != null) break block11;
                                        if (string4 != null) break block13;
                                        if (fj2 != null) break block14;
                                        fa.e("Colormap not found: " + string7);
                                    }
                                    if (string4 == null) continue;
                                }
                                ha ha2 = new ha("CustomColors");
                                arrr2 = arrr = ha2.j(string6);
                                if (string4 != null) break block15;
                                if (arrr2 == null) break block16;
                                arrr2 = arrr;
                            }
                            int n3 = arrr2.length;
                            if (string4 != null) break block17;
                            if (n3 <= 0) break block16;
                            n3 = n2 = 0;
                        }
                        while (n2 < arrr.length) {
                            R r2 = arrr[n2];
                            fj2.a(r2);
                            ++n2;
                            if (string4 == null) {
                                if (string4 == null) continue;
                            }
                            break block12;
                        }
                        arrayList2.add(fj2);
                    }
                    if (string4 == null) continue;
                }
                fa.e("Invalid match blocks: " + string6);
                if (string4 == null) continue;
            }
            arrayList = arrayList2;
            if (string4 != null) return arrayList.toArray(new fj[arrayList2.size()]);
            if (arrayList.size() <= 0) {
                return null;
            }
        }
        arrayList = arrayList2;
        return arrayList.toArray(new fj[arrayList2.size()]);
    }

    private static int[] k() {
        a[] arra = net.minecraft.ac.a.F;
        int[] arrn = new int[arra.length];
        String string = K.d();
        Arrays.fill(arrn, -1);
        int n2 = 0;
        while (n2 < arra.length && n2 < arrn.length) {
            a a10 = arra[n2];
            if (string == null) {
                if (a10 != null) {
                    arrn[n2] = a10.J;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return arrn;
    }

    private static net.minecraft.k.l a(net.minecraft.k.l l2, t t2, double d10, double d11, double d12) {
        String string = K.d();
        fj fj2 = J;
        if (string == null) {
            if (fj2 == null) {
                return l2;
            }
            fj2 = J;
        }
        int n2 = fj2.a(t2, d10, d11, d12, 3);
        int n3 = n2 >> 16 & 0xFF;
        int n4 = n2 >> 8 & 0xFF;
        int n5 = n2 & 0xFF;
        float f10 = (float)n3 / 255.0f;
        float f11 = (float)n4 / 255.0f;
        float f12 = (float)n5 / 255.0f;
        float f13 = (float)l2.e / 0.753f;
        float f14 = (float)l2.d / 0.8471f;
        float f15 = (float)l2.b;
        net.minecraft.k.l l3 = E.a(f10 *= f13, f11 *= f14, f12 *= f15);
        return l3;
    }

    private static Pair<fj[], Integer> h() {
        int n2;
        Object[] arrobject;
        String string = "mcpatcher/lightmap/world";
        String string2 = K.d();
        String string3 = ".png";
        String[] arrstring = ci.a(string, string3);
        HashMap<Integer, Object[]> hashMap = new HashMap<Integer, Object[]>();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            block11: {
                block10: {
                    arrobject = arrstring[i2];
                    String string4 = dQ.b((String)arrobject, string, string3);
                    n2 = fU.b(string4, Integer.MIN_VALUE);
                    if (string2 != null) break block10;
                    if (n2 != Integer.MIN_VALUE) break block11;
                    fa.e("Invalid dimension ID: " + string4 + ", path: " + (String)arrobject);
                }
                if (string2 == null) continue;
            }
            hashMap.put(n2, arrobject);
            if (string2 == null) continue;
        }
        Set set = hashMap.keySet();
        arrobject = set.toArray(new Integer[set.size()]);
        Arrays.sort(arrobject);
        int n3 = arrobject.length;
        if (string2 == null) {
            if (n3 <= 0) {
                return new ImmutablePair(null, (Object)0);
            }
            n3 = (Integer)arrobject[0];
        }
        int n4 = n3;
        n2 = (Integer)arrobject[arrobject.length - 1];
        int n5 = n2 - n4 + 1;
        fj[] arrfj = new fj[n5];
        int n6 = 0;
        while (n6 < arrobject.length) {
            block12: {
                block13: {
                    int n7;
                    int n8;
                    fj fj2;
                    block14: {
                        Object object;
                        block15: {
                            object = arrobject[n6];
                            String string5 = (String)hashMap.get(object);
                            fj2 = fa.a(string5, -1, -1);
                            if (string2 != null) break block12;
                            if (fj2 == null) break block13;
                            n8 = fj2.g();
                            n7 = 16;
                            if (string2 != null) break block14;
                            if (n8 >= n7) break block15;
                            fa.e("Invalid lightmap width: " + fj2.g() + ", path: " + string5);
                            if (string2 == null) break block13;
                        }
                        n8 = (Integer)object;
                        n7 = n4;
                    }
                    int n9 = n8 - n7;
                    arrfj[n9] = fj2;
                }
                ++n6;
            }
            if (string2 == null) continue;
        }
        return new ImmutablePair((Object)arrfj, (Object)n4);
    }

    private static fj[][] a(List list) {
        fj[][] arrfj = new fj[list.size()][];
        String string = K.d();
        int n2 = 0;
        while (n2 < list.size()) {
            List list2 = (List)list.get(n2);
            if (string == null) {
                if (list2 != null) {
                    fj[] arrfj2 = list2.toArray(new fj[list2.size()]);
                    arrfj[n2] = arrfj2;
                }
                ++n2;
            }
            if (string == null) continue;
        }
        return arrfj;
    }

    private static int[] a(Properties properties, String string, String string2, String string3) {
        int n2;
        int n3;
        int[] arrn;
        block5: {
            arrn = new int[32];
            String string4 = K.d();
            Arrays.fill(arrn, -1);
            n3 = 0;
            for (Object object : properties.keySet()) {
                block7: {
                    String string5;
                    block9: {
                        int n4;
                        int n5;
                        block10: {
                            block8: {
                                String string6;
                                String string7;
                                block6: {
                                    string5 = properties.getProperty((String)object);
                                    string7 = (String)object;
                                    string6 = string2;
                                    if (string4 != null) break block6;
                                    n2 = string7.startsWith(string6) ? 1 : 0;
                                    if (string4 != null) break block5;
                                    if (n2 == 0) break block7;
                                    string7 = (String)object;
                                    string6 = string2;
                                }
                                String string8 = dQ.f(string7, string6);
                                int n6 = fU.b(string8, -1);
                                n5 = fa.c(string5);
                                n4 = n6;
                                if (string4 != null) break block8;
                                if (n4 < 0) break block9;
                                n4 = n6;
                            }
                            if (string4 != null) break block10;
                            if (n4 >= arrn.length) break block9;
                            n4 = n5;
                        }
                        if (n4 < 0) break block9;
                        arrn[n6] = n5;
                        ++n3;
                        if (string4 == null) break block7;
                    }
                    fa.e("Invalid color: " + object + " = " + string5);
                }
                if (string4 == null) continue;
            }
            n2 = n3;
        }
        if (n2 <= 0) {
            return null;
        }
        fa.f(string3 + " colors: " + n3);
        return arrn;
    }

    private static int a(i i2, int n2) {
        Integer n3;
        String string;
        block6: {
            int n4;
            block5: {
                net.minecraft.W.K k2 = i2.b();
                string = K.d();
                n4 = k2 instanceof bQ;
                if (string != null) break block5;
                if (n4 != 0) break block6;
                n4 = n2;
            }
            return n4;
        }
        Integer n5 = n3 = i2.b(bQ.z);
        if (string == null) {
            if (!(n5 instanceof Integer)) {
                return n2;
            }
            n5 = n3;
        }
        Integer n6 = n5;
        return n6;
    }

    protected static net.minecraft.A.h a(t t2, n n2) {
        net.minecraft.A.h h2 = t2.c(n2);
        String string = K.d();
        net.minecraft.A.h h3 = h2;
        if (string == null) {
            if (h3 == net.minecraft.u.d.n && !fU.at()) {
                h2 = net.minecraft.u.d.s;
            }
            h3 = h2;
        }
        return h3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int c(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 != null) return Integer.parseInt(string3, 16) & 0xFFFFFF;
        if (string3 == null) {
            return -1;
        }
        string = string.trim();
        try {
            string3 = string;
            return Integer.parseInt(string3, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException numberFormatException) {
            return -1;
        }
    }

    public static int a(float f10, int n2) {
        if (e == null) {
            return n2;
        }
        int n3 = (int)(f10 * (float)e.h());
        int n4 = e.b(n3);
        return n4;
    }

    public static void e() {
        block3: {
            int n2;
            String string;
            block2: {
                b = "vanilla";
                String string2 = K.d();
                q = null;
                M = null;
                j = null;
                K = null;
                C = null;
                U = null;
                J = null;
                A = null;
                W = null;
                L = null;
                H = null;
                x = -1;
                e = null;
                h = null;
                z = null;
                I = null;
                k = -1;
                f = -1;
                X = -1;
                T = -1;
                w = -1;
                F = -1;
                d = null;
                s = null;
                m = null;
                n = null;
                v = null;
                i = true;
                R = null;
                O = null;
                B = null;
                aa = null;
                P = null;
                fa.a(r);
                N = null;
                b = fa.a("mcpatcher/color.properties", "palette.format", fj.a, "vanilla");
                string = "mcpatcher/colormap/";
                String[] arrstring = new String[]{"water.png", "watercolorX.png"};
                q = fa.a(string, arrstring, 256, 256);
                fa.j();
                n2 = fU.g();
                if (string2 != null) break block2;
                if (n2 == 0) break block3;
                n2 = 2;
            }
            String[] arrstring = new String[n2];
            arrstring[0] = "pine.png";
            arrstring[1] = "pinecolor.png";
            String[] arrstring2 = arrstring;
            j = fa.a(string, arrstring2, 256, 256);
            String[] arrstring3 = new String[]{"birch.png", "birchcolor.png"};
            M = fa.a(string, arrstring3, 256, 256);
            String[] arrstring4 = new String[]{"swampgrass.png", "swampgrasscolor.png"};
            K = fa.a(string, arrstring4, 256, 256);
            String[] arrstring5 = new String[]{"swampfoliage.png", "swampfoliagecolor.png"};
            C = fa.a(string, arrstring5, 256, 256);
            String[] arrstring6 = new String[]{"sky0.png", "skycolor0.png"};
            U = fa.a(string, arrstring6, 256, 256);
            String[] arrstring7 = new String[]{"fog0.png", "fogcolor0.png"};
            J = fa.a(string, arrstring7, 256, 256);
            String[] arrstring8 = new String[]{"underwater.png", "underwatercolor.png"};
            A = fa.a(string, arrstring8, 256, 256);
            String[] arrstring9 = new String[]{"underlava.png", "underlavacolor.png"};
            W = fa.a(string, arrstring9, 256, 256);
            String[] arrstring10 = new String[]{"redstone.png", "redstonecolor.png"};
            L = fa.a(string, arrstring10, 16, 1);
            H = fa.a(string + "xporb.png", -1, -1);
            e = fa.a(string + "durability.png", -1, -1);
            String[] arrstring11 = new String[]{"stem.png", "stemcolor.png"};
            h = fa.a(string, arrstring11, 8, 1);
            g = fa.a(string + "pumpkinstem.png", 8, 1);
            D = fa.a(string + "melonstem.png", 8, 1);
            String[] arrstring12 = new String[]{"myceliumparticle.png", "myceliumparticlecolor.png"};
            z = fa.a(string, arrstring12, -1, -1);
            Pair<fj[], Integer> pair = fa.h();
            I = (fj[])pair.getLeft();
            G = (Integer)pair.getRight();
            fa.a("mcpatcher/color.properties");
            v = fa.a(new String[]{string + "custom/", string + "blocks/"}, n, 256, 256);
            fa.j();
        }
    }

    private static int b(t t2, n n2) {
        String string = K.d();
        int n3 = X;
        if (string == null) {
            n3 = n3 < 0 ? fa.f().a(net.minecraft.u.g.c_.d(), t2, n2, 0) : X;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static int a(t t2, i i2, n n2, e9 e92) {
        int n3;
        void v2;
        block8: {
            void var6_8;
            block7: {
                boolean bl2;
                block6: {
                    fj fj2;
                    net.minecraft.W.K k2 = i2.b();
                    String string = K.d();
                    fj fj3 = fj2 = fa.b(i2);
                    if (string == null) {
                        if (fj3 == null && i2.o() == net.minecraft.ac.c.L) {
                            m m2 = o;
                        }
                        fj3 = var6_8;
                    }
                    if (fj3 == null) {
                        return fa.f().a(i2, t2, n2, 0);
                    }
                    bl2 = fU.i();
                    if (string != null) break block6;
                    if (!bl2) break block7;
                    v2 = var6_8;
                    if (string != null) break block8;
                    bl2 = v2.a();
                }
                if (!bl2) {
                    n3 = fa.a(i2, t2, n2, (m)var6_8, e92.g());
                    return n3;
                }
            }
            v2 = var6_8;
        }
        n3 = v2.a(i2, t2, n2);
        return n3;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static int[] b(Properties properties, String string, String string2, String string3) {
        Object object;
        int n2;
        int n3;
        String string4;
        ArrayList<Integer> arrayList;
        block11: {
            arrayList = new ArrayList<Integer>();
            Set<Object> set = properties.keySet();
            string4 = K.d();
            n3 = 0;
            for (Object object2 : set) {
                block12: {
                    block13: {
                        int n4;
                        int n5;
                        int n6;
                        String string5;
                        block15: {
                            block16: {
                                String string6;
                                String string7;
                                block14: {
                                    string5 = properties.getProperty((String)object2);
                                    string7 = (String)object2;
                                    string6 = string2;
                                    if (string4 != null) break block14;
                                    n2 = string7.startsWith(string6) ? 1 : 0;
                                    if (string4 != null) break block11;
                                    if (n2 == 0) break block12;
                                    string7 = (String)object2;
                                    string6 = string2;
                                }
                                String string8 = dQ.f(string7, string6);
                                n5 = n6 = fA.b(string8);
                                if (string4 == null) {
                                    if (n5 < 0) {
                                        n6 = fA.a(new v(string8).toString());
                                    }
                                    n5 = n6;
                                }
                                if (string4 != null) break block15;
                                if (n5 >= 0) break block16;
                                fa.e("Invalid spawn egg name: " + object2);
                                if (string4 == null) break block12;
                            }
                            n5 = fa.c(string5);
                        }
                        int n7 = n4 = n5;
                        boolean bl2 = true;
                        do {
                            block18: {
                                block17: {
                                    if (!bl2 || (bl2 = false)) break block17;
                                    if (string4 != null) break block18;
                                    if (n7 < 0) {
                                        fa.e("Invalid spawn egg color: " + object2 + " = " + string5);
                                        if (string4 == null) break block12;
                                    }
                                }
                                n7 = arrayList.size();
                            }
                            if (n7 > n6) break;
                            arrayList.add(-1);
                            if (string4 != null) break block13;
                        } while (string4 == null);
                        arrayList.set(n6, n4);
                    }
                    ++n3;
                }
                if (string4 == null) continue;
            }
            n2 = n3;
        }
        if (string4 == null) {
            if (n2 <= 0) {
                return null;
            }
            fa.f(string3 + " colors: " + n3);
            n2 = arrayList.size();
        }
        Object object3 = new int[n2];
        for (int i2 = 0; i2 < ((Object)object3).length; ++i2) {
            object = object3;
            if (string4 != null) return object;
            object[i2] = (Integer)arrayList.get(i2);
            if (string4 == null) continue;
        }
        object = object3;
        return object;
    }

    public static net.minecraft.client.z.m f() {
        return net.minecraft.client.Q.P().U();
    }

    private static float[][] c(Properties properties, String string, String string2, String string3) {
        int n2;
        int n3;
        float[][] arrarrf;
        block11: {
            bl[] arrbl;
            String string4;
            HashMap<String, bl> hashMap;
            block10: {
                bl[] arrbl2 = bl.values();
                hashMap = new HashMap<String, bl>();
                string4 = K.d();
                for (int i2 = 0; i2 < arrbl2.length; ++i2) {
                    arrbl = arrbl2;
                    if (string4 == null) {
                        bl bl2 = arrbl[i2];
                        hashMap.put(bl2.a(), bl2);
                        if (string4 == null) continue;
                    }
                    break block10;
                }
                arrbl = arrbl2;
            }
            arrarrf = new float[arrbl.length][];
            n3 = 0;
            for (Object object : properties.keySet()) {
                block13: {
                    String string5;
                    block14: {
                        int n4;
                        int n5;
                        block15: {
                            String string6;
                            String string7;
                            String string8;
                            block12: {
                                string5 = properties.getProperty((String)object);
                                string8 = (String)object;
                                string7 = string2;
                                if (string4 != null) break block12;
                                n2 = string8.startsWith(string7) ? 1 : 0;
                                if (string4 != null) break block11;
                                if (n2 == 0) break block13;
                                string8 = (String)object;
                                string7 = string2;
                            }
                            String string9 = string6 = dQ.f(string8, string7);
                            if (string4 == null) {
                                if (string9.equals("lightBlue")) {
                                    string6 = "light_blue";
                                }
                                string9 = hashMap.get(string6);
                            }
                            bl bl3 = (bl)((Object)string9);
                            n5 = fa.c(string5);
                            if (bl3 == null) break block14;
                            n4 = n5;
                            if (string4 != null) break block15;
                            if (n4 < 0) break block14;
                            n4 = 3;
                        }
                        float[] arrf = new float[n4];
                        arrf[0] = (float)(n5 >> 16 & 0xFF) / 255.0f;
                        arrf[1] = (float)(n5 >> 8 & 0xFF) / 255.0f;
                        arrf[2] = (float)(n5 & 0xFF) / 255.0f;
                        float[] arrf2 = arrf;
                        arrarrf[bl3.ordinal()] = arrf2;
                        ++n3;
                        if (string4 == null) break block13;
                    }
                    fa.e("Invalid color: " + object + " = " + string5);
                }
                if (string4 == null) continue;
            }
            n2 = n3;
        }
        if (n2 <= 0) {
            return null;
        }
        fa.f(string3 + " colors: " + n3);
        return arrarrf;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static fj a(String string, String[] arrstring, int n2, int n3) {
        int n4 = 0;
        String string2 = K.d();
        while (n4 < arrstring.length) {
            String string3 = arrstring[n4];
            string3 = string + string3;
            fj fj2 = fa.a(string3, n2, n3);
            if (string2 == null) {
                if (fj2 != null) {
                    return fj2;
                }
                ++n4;
            }
            if (string2 == null) continue;
        }
        return null;
    }
}

