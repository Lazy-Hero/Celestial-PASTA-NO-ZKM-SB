/*
 * Decompiled with CFR 0.150.
 */
import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;

public class t {
    private static final /* synthetic */ int b;
    private static final /* synthetic */ int c;
    private static final /* synthetic */ int a;
    private static final /* synthetic */ int d;
    private static final /* synthetic */ int e;

    private static P[] a(eM eM2, int n2, eM eM3, int n3, eM eM4, int n4, c[] arrc, int n5, P p2, e9 e92) {
        P p3 = t.a(arrc[n2], eM2, n5, p2, e92);
        P p4 = t.a(arrc[n3], eM3, n5, p2, e92);
        P p5 = t.a(arrc[n4], eM4, n5, p2, e92);
        return e92.a(p3, p4, p5);
    }

    private static P[] b(int n2, int n3, c[] arrc, int n4, P p2, e9 e92) {
        return t.a(eM.UP, n2, eM.DOWN, n3, arrc, n4, p2, e92);
    }

    private static P a(c c10, eM eM2, int n2, P p2, e9 e92) {
        switch (eM2) {
            case UP: {
                return t.a(c10, eM2, 0, 0, 16, 8, n2, p2, e92);
            }
            case UP_RIGHT: {
                return t.a(c10, eM2, 8, 0, 16, 8, n2, p2, e92);
            }
            case RIGHT: {
                return t.a(c10, eM2, 8, 0, 16, 16, n2, p2, e92);
            }
            case DOWN_RIGHT: {
                return t.a(c10, eM2, 8, 8, 16, 16, n2, p2, e92);
            }
            case DOWN: {
                return t.a(c10, eM2, 0, 8, 16, 16, n2, p2, e92);
            }
            case DOWN_LEFT: {
                return t.a(c10, eM2, 0, 8, 8, 16, n2, p2, e92);
            }
            case LEFT: {
                return t.a(c10, eM2, 0, 0, 8, 16, n2, p2, e92);
            }
            case UP_LEFT: {
                return t.a(c10, eM2, 0, 0, 8, 8, n2, p2, e92);
            }
        }
        return p2;
    }

    private static P a(P p2, c c10, int n2, int n3, int n4, int n5, int n6) {
        int[] arrn = (int[])p2.d().clone();
        c c11 = p2.p();
        String string = K.d();
        for (int i2 = 0; i2 < 4; ++i2) {
            t.a(arrn, i2, c11, c10, n2, n3, n4, n5, n6);
            if (string == null) continue;
        }
        P p3 = new P(arrn, p2.q(), p2.b(), c10);
        return p3;
    }

    private static P[] a(eM eM2, int n2, eM eM3, int n3, eM eM4, int n4, eM eM5, int n5, c[] arrc, int n6, P p2, e9 e92) {
        P p3 = t.a(arrc[n2], eM2, n6, p2, e92);
        P p4 = t.a(arrc[n3], eM3, n6, p2, e92);
        P p5 = t.a(arrc[n4], eM4, n6, p2, e92);
        P p6 = t.a(arrc[n5], eM5, n6, p2, e92);
        return e92.a(p3, p4, p5, p6);
    }

    private static void a(int[] arrn, int n2, c c10, c c11, int n3, int n4, int n5, int n6, int n7) {
        float f10;
        float f11;
        int n8 = arrn.length / 4;
        int n9 = n8 * n2;
        float f12 = Float.intBitsToFloat(arrn[n9 + 4]);
        float f13 = Float.intBitsToFloat(arrn[n9 + 4 + 1]);
        String string = K.d();
        double d10 = c10.f(f12);
        double d11 = c10.d(f13);
        float f14 = Float.intBitsToFloat(arrn[n9 + 0]);
        float f15 = Float.intBitsToFloat(arrn[n9 + 1]);
        float f16 = Float.intBitsToFloat(arrn[n9 + 2]);
        switch (n3) {
            case 0: {
                f11 = f14;
                f10 = 1.0f - f16;
                if (string == null) break;
            }
            case 1: {
                f11 = f14;
                f10 = f16;
                if (string == null) break;
            }
            case 2: {
                f11 = 1.0f - f14;
                f10 = 1.0f - f15;
                if (string == null) break;
            }
            case 3: {
                f11 = f14;
                f10 = 1.0f - f15;
                if (string == null) break;
            }
            case 4: {
                f11 = f16;
                f10 = 1.0f - f15;
                if (string == null) break;
            }
            case 5: {
                f11 = 1.0f - f16;
                f10 = 1.0f - f15;
                if (string == null) break;
            }
            default: {
                return;
            }
        }
        float f17 = 15.968f;
        float f18 = 15.968f;
        double d12 = d10 - (double)n4;
        double d13 = d12 == 0.0 ? 0 : (d12 < 0.0 ? -1 : 1);
        if (string == null) {
            double d14;
            if (d13 < 0) {
                f11 = (float)((double)f11 + ((double)n4 - d10) / (double)f17);
                d10 = n4;
            }
            d13 = (d14 = d10 - (double)n6) == 0.0 ? 0 : (d14 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            double d15;
            if (d13 > 0) {
                f11 = (float)((double)f11 - (d10 - (double)n6) / (double)f17);
                d10 = n6;
            }
            d13 = (d15 = d11 - (double)n5) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
        }
        if (string == null) {
            double d16;
            if (d13 < 0) {
                f10 = (float)((double)f10 + ((double)n5 - d11) / (double)f18);
                d11 = n5;
            }
            d13 = (d16 = d11 - (double)n7) == 0.0 ? 0 : (d16 > 0.0 ? 1 : -1);
        }
        if (string == null) {
            if (d13 > 0) {
                f10 = (float)((double)f10 - (d11 - (double)n7) / (double)f18);
                d11 = n7;
            }
            d13 = n3;
        }
        switch (d13) {
            case 0: {
                f14 = f11;
                f16 = 1.0f - f10;
                if (string == null) break;
            }
            case 1: {
                f14 = f11;
                f16 = f10;
                if (string == null) break;
            }
            case 2: {
                f14 = 1.0f - f11;
                f15 = 1.0f - f10;
                if (string == null) break;
            }
            case 3: {
                f14 = f11;
                f15 = 1.0f - f10;
                if (string == null) break;
            }
            case 4: {
                f16 = f11;
                f15 = 1.0f - f10;
                if (string == null) break;
            }
            case 5: {
                f16 = 1.0f - f11;
                f15 = 1.0f - f10;
                if (string == null) break;
            }
            default: {
                return;
            }
        }
        arrn[n9 + 4] = Float.floatToRawIntBits(c11.a(d10));
        arrn[n9 + 4 + 1] = Float.floatToRawIntBits(c11.b(d11));
        arrn[n9 + 0] = Float.floatToRawIntBits(f14);
        arrn[n9 + 1] = Float.floatToRawIntBits(f15);
        arrn[n9 + 2] = Float.floatToRawIntBits(f16);
    }

    private static P[] a(eM eM2, int n2, eM eM3, int n3, c[] arrc, int n4, P p2, e9 e92) {
        P p3 = t.a(arrc[n2], eM2, n4, p2, e92);
        P p4 = t.a(arrc[n3], eM3, n4, p2, e92);
        return e92.a(p3, p4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static P[] a(int var0, gf var1_1, int var2_2, P var3_3, e9 var4_4) {
        block54: {
            block53: {
                var5_5 = K.d();
                if (var1_1.ab == null) break block53;
                v0 = var0;
                if (var5_5 != null) break block54;
                if (v0 < 0) break block53;
                v0 = var0;
                if (var5_5 != null) break block54;
                if (v0 < var1_1.ab.length) {
                    v0 = var6_6 = var1_1.ab[var0];
                    if (var5_5 == null) {
                        if (v0 >= 0) {
                            v0 = var6_6;
                            if (var5_5 == null) {
                                if (v0 <= var1_1.g.length) {
                                    return t.a(var6_6, var1_1.g, var3_3, var4_4);
                                } else {
                                    ** GOTO lbl20
                                }
                            } else {
                                ** GOTO lbl19
                            }
                        } else {
                            ** GOTO lbl18
                        }
                    } else {
                        ** GOTO lbl17
                    }
                }
                break block53;
lbl17:
                // 2 sources

                break block54;
lbl18:
                // 2 sources

                break block53;
lbl19:
                // 2 sources

                break block54;
            }
            v0 = var0;
        }
        if (var5_5 != null) return t.a(v0, var1_1.g, var3_3, var4_4);
        switch (v0) {
            case 1: {
                return t.a(0, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 2: {
                return t.a(3, var1_1.g, var3_3, var4_4);
            }
            case 3: {
                return t.a(3, 0, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 4: {
                return t.a(0, 3, 2, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 5: {
                return t.a(3, 0, 4, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 6: {
                return t.a(2, 4, 2, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 7: {
                return t.a(3, 3, 4, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 8: {
                return t.a(4, 1, 4, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 9: {
                return t.a(4, 4, 4, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 10: {
                return t.a(1, 4, 1, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 11: {
                return t.a(1, 1, 4, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 12: {
                return t.b(0, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 13: {
                return t.a(0, 3, 2, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 14: {
                return t.b(3, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 15: {
                return t.a(3, 0, 1, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 16: {
                return t.a(2, 4, 0, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 17: {
                return t.a(4, 2, 3, 0, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 18: {
                return t.a(4, 4, 3, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 19: {
                return t.a(4, 2, 4, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 20: {
                return t.a(1, 4, 4, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 21: {
                return t.a(4, 4, 1, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 22: {
                return t.a(4, 4, 1, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 23: {
                return t.a(4, 1, 4, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 24: {
                return t.a(2, var1_1.g, var3_3, var4_4);
            }
            case 25: {
                return t.a(2, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 26: {
                return t.a(1, var1_1.g, var3_3, var4_4);
            }
            case 27: {
                return t.a(1, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 28: {
                return t.a(2, 4, 2, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 29: {
                return t.a(3, 3, 1, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 30: {
                return t.a(2, 1, 2, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 31: {
                return t.a(3, 3, 4, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 32: {
                return t.a(1, 1, 1, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 33: {
                return t.a(1, 1, 4, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 34: {
                return t.a(4, 1, 1, 4, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 35: {
                return t.a(1, 4, 4, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 36: {
                return t.b(2, 0, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 37: {
                return t.a(2, 1, 0, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 38: {
                return t.b(1, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 39: {
                return t.a(1, 2, 3, 0, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 40: {
                return t.a(4, 1, 3, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 41: {
                return t.a(1, 2, 4, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 42: {
                return t.a(1, 4, 3, 3, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 43: {
                return t.a(4, 2, 1, 2, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 44: {
                return t.a(1, 4, 1, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 45: {
                return t.a(4, 1, 1, 1, var1_1.g, var2_2, var3_3, var4_4);
            }
            case 46: {
                return t.a(4, var1_1.g, var3_3, var4_4);
            }
        }
        v0 = 0;
        return t.a(v0, var1_1.g, var3_3, var4_4);
    }

    private static P[] a(int n2, c[] arrc, P p2, e9 e92) {
        c c10 = arrc[n2];
        return cJ.a(c10, p2, e92);
    }

    private static P[] a(int n2, int n3, int n4, int n5, c[] arrc, int n6, P p2, e9 e92) {
        String string = K.d();
        int n7 = n2;
        int n8 = n3;
        if (string == null) {
            if (n7 == n8) {
                return n4 == n5 ? t.a(eM.UP, n2, eM.DOWN, n4, arrc, n6, p2, e92) : t.a(eM.UP, n2, eM.DOWN_LEFT, n4, eM.DOWN_RIGHT, n5, arrc, n6, p2, e92);
            }
            n7 = n4;
            n8 = n5;
        }
        if (string == null) {
            if (n7 == n8) {
                return t.a(eM.UP_LEFT, n2, eM.UP_RIGHT, n3, eM.DOWN, n4, arrc, n6, p2, e92);
            }
            n7 = n2;
            n8 = n4;
        }
        if (string == null) {
            if (n7 == n8) {
                return n3 == n5 ? t.a(eM.LEFT, n2, eM.RIGHT, n3, arrc, n6, p2, e92) : t.a(eM.LEFT, n2, eM.UP_RIGHT, n3, eM.DOWN_RIGHT, n5, arrc, n6, p2, e92);
            }
            n7 = n3;
            n8 = n5;
        }
        return n7 == n8 ? t.a(eM.UP_LEFT, n2, eM.DOWN_LEFT, n4, eM.RIGHT, n3, arrc, n6, p2, e92) : t.a(eM.UP_LEFT, n2, eM.UP_RIGHT, n3, eM.DOWN_LEFT, n4, eM.DOWN_RIGHT, n5, arrc, n6, p2, e92);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private static P a(c c10, eM eM2, int n2, int n3, int n4, int n5, int n6, P p2, e9 e92) {
        block12: {
            int n7;
            int n8;
            String string;
            Map[][] arrmap;
            block11: {
                arrmap = cJ.a();
                string = K.d();
                if (arrmap == null) {
                    return p2;
                }
                n7 = n8 = c10.h();
                if (string != null) break block11;
                if (n7 < 0) break block12;
                n7 = n8;
            }
            if (n7 < arrmap.length) {
                P p3;
                IdentityHashMap<P, P> identityHashMap;
                Map[] arrmap2;
                Map[] arrmap3 = arrmap2 = arrmap[n8];
                if (string == null) {
                    if (arrmap3 == null) {
                        arrmap2 = new Map[eM.VALUES.length];
                        arrmap[n8] = arrmap2;
                    }
                    arrmap3 = arrmap2;
                }
                IdentityHashMap<P, P> identityHashMap2 = identityHashMap = arrmap3[eM2.ordinal()];
                if (string == null) {
                    if (identityHashMap2 == null) {
                        arrmap2[eM2.ordinal()] = identityHashMap = new IdentityHashMap<P, P>(1);
                    }
                    identityHashMap2 = identityHashMap.get(p2);
                }
                P p4 = p3 = (P)((Object)identityHashMap2);
                if (string == null) {
                    if (p4 == null) {
                        p3 = t.a(p2, c10, n6, n2, n3, n4, n5);
                        identityHashMap.put(p2, p3);
                    }
                    p4 = p3;
                }
                return p4;
            }
        }
        return p2;
    }

    private static P[] a(int n2, int n3, c[] arrc, int n4, P p2, e9 e92) {
        return t.a(eM.LEFT, n2, eM.RIGHT, n3, arrc, n4, p2, e92);
    }

    static {
        d = 0;
        b = 1;
        c = 3;
        e = 4;
        a = 2;
    }
}

