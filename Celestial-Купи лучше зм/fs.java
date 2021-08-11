/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.W.K;
import net.minecraft.W.L;
import net.minecraft.Z.i;
import net.minecraft.k.h;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class fs
implements ag {
    private static /* synthetic */ int e;

    public static boolean a(k k2, float f10, f7 f72) {
        int n2;
        block5: {
            int n3 = h.f(fs.b.s.m().e);
            int n4 = fs.b();
            block0: while (true) {
                int n5 = n3;
                block1: while (n5 < h.f(fs.b.s.m().f) + 1) {
                    n2 = h.f(fs.b.s.m().d);
                    if (n4 != 0) break block5;
                    int n6 = n2;
                    while (n6 < h.f(fs.b.s.m().g) + 1) {
                        K k3 = fs.a(new n((double)n3, k2.b + (double)f10, (double)n6));
                        if (n4 == 0) {
                            n5 = f72.a(k3) ? 1 : 0;
                            if (n4 != 0) continue block1;
                            if (n5 == 0) {
                                return false;
                            }
                            ++n6;
                        }
                        if (n4 == 0) continue;
                    }
                    ++n3;
                    if (n4 == 0) continue block0;
                }
                break;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public static ArrayList<n> a(int n2, int n3, int n4) {
        ArrayList<n> arrayList;
        block0: {
            n n5 = new n(fs.b.s.a - (double)n2, fs.b.s.aF - (double)n3, fs.b.s.ax - (double)n4);
            n n6 = new n(fs.b.s.a + (double)n2, fs.b.s.aF + (double)n3, fs.b.s.ax + (double)n4);
            int n7 = fs.b();
            arrayList = fs.a(n5, n6);
            if (m.d()) break block0;
            fs.b(++n7);
        }
        return arrayList;
    }

    public static ArrayList<n> a(n n2, n n3) {
        ArrayList<n> arrayList = new ArrayList<n>();
        int n4 = fs.c();
        n n5 = new n(Math.min(n2.e(), n3.e()), Math.min(n2.b(), n3.b()), Math.min(n2.a(), n3.a()));
        n n6 = new n(Math.max(n2.e(), n3.e()), Math.max(n2.b(), n3.b()), Math.max(n2.a(), n3.a()));
        int n7 = n5.e();
        block0: while (true) {
            int n8 = n7;
            block1: while (n8 <= n6.e()) {
                int n9 = n5.b();
                while (n9 <= n6.b()) {
                    block5: {
                        n8 = n5.a();
                        if (n4 == 0) continue block1;
                        for (int i2 = v1259067; i2 <= n6.a(); ++i2) {
                            arrayList.add(new n(n7, n9, i2));
                            if (n4 != 0) {
                                if (n4 != 0) continue;
                                m.b(!m.c());
                                break;
                            }
                            break block5;
                        }
                        ++n9;
                    }
                    if (n4 != 0) continue;
                }
                ++n7;
                if (n4 != 0) continue block0;
            }
            break;
        }
        return arrayList;
    }

    static {
        if (fs.c() == 0) {
            fs.b(90);
        }
    }

    public static i b(n n2) {
        return fs.b.e.d(n2);
    }

    public static int b() {
        return e;
    }

    public static K a(n n2) {
        return fs.b(n2).b();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int c() {
        int n2 = fs.b();
        if (n2 == 0) {
            return 123;
        }
        return 0;
    }

    public static void b(int n2) {
        e = n2;
    }

    public static K b(int n2, int n3, int n4) {
        return fs.b.e.d(new n(n2, n3, n4)).b();
    }

    public static au a(float f10, int n2) {
        au au2 = null;
        int n3 = fs.b();
        float f11 = f10;
        float f12 = f10;
        while (f12 >= -f10) {
            block8: {
                float f13;
                float f14 = -f10;
                block1: while (true) {
                    float f15 = f14 == f10 ? 0 : (f14 < f10 ? -1 : 1);
                    block2: while (f15 <= 0) {
                        f13 = f10;
                        if (n3 != 0) break block8;
                        float f16 = f13;
                        while (f16 >= -f10) {
                            block9: {
                                float f17;
                                float f18;
                                block12: {
                                    block10: {
                                        int n4;
                                        float f19;
                                        int n5;
                                        int n6;
                                        int n7;
                                        block11: {
                                            n7 = (int)(fs.b.s.a + (double)f12);
                                            n6 = (int)(fs.b.s.aF + (double)f14);
                                            n5 = (int)(fs.b.s.ax + (double)f16);
                                            f19 = (float)fs.b.s.f(n7, n6, n5);
                                            if (n3 != 0) break block9;
                                            f15 = K.b(fs.b(n7, n6 - 1, n5));
                                            if (n3 != 0) continue block2;
                                            if (f15 != n2) break block10;
                                            n4 = fs.b(n7, n6, n5) instanceof L;
                                            if (n3 != 0) break block11;
                                            if (n4 == 0) break block10;
                                            f18 = f19;
                                            f17 = f11;
                                            if (n3 != 0) break block12;
                                            float f20 = f18 - f17;
                                            n4 = f20 == 0.0f ? 0 : (f20 < 0.0f ? -1 : 1);
                                        }
                                        if (n4 <= 0) {
                                            f11 = f19;
                                            au2 = new au(n7, n6, n5);
                                        }
                                    }
                                    f18 = f16;
                                    f17 = 1.0f;
                                }
                                f16 = f18 - f17;
                            }
                            if (n3 == 0) continue;
                        }
                        f14 += 1.0f;
                        if (n3 == 0) continue block1;
                    }
                    break;
                }
                f13 = f12 = f12 - 1.0f;
            }
            if (n3 == 0) continue;
        }
        return au2;
    }
}

