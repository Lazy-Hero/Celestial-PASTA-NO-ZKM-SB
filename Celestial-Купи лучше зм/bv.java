/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.a.v;

public class bv {
    public static final /* synthetic */ int b;
    public static final /* synthetic */ int i;
    public static final /* synthetic */ int c;
    public static final /* synthetic */ int f;
    public static final /* synthetic */ int j;
    public static final /* synthetic */ int h;
    public static final /* synthetic */ int d;
    public static final /* synthetic */ int e;
    public static final /* synthetic */ int a;
    public static final /* synthetic */ int g;

    public static void a(int n2, float f10) {
        String string = K.d();
        if (string == null) {
            switch (n2) {
                case 0: {
                    v.v();
                    v.a();
                    v.f(770, 771);
                    v.b(1.0f, 1.0f, 1.0f, f10);
                    if (string == null) break;
                }
                case 1: {
                    v.v();
                    v.a();
                    v.f(770, 1);
                    v.b(1.0f, 1.0f, 1.0f, f10);
                    if (string == null) break;
                }
                case 2: {
                    v.v();
                    v.a();
                    v.f(775, 0);
                    v.b(f10, f10, f10, 1.0f);
                    if (string == null) break;
                }
                case 3: {
                    v.v();
                    v.a();
                    v.f(774, 771);
                    v.b(f10, f10, f10, f10);
                    if (string == null) break;
                }
                case 4: {
                    v.v();
                    v.a();
                    v.f(1, 1);
                    v.b(f10, f10, f10, 1.0f);
                    if (string == null) break;
                }
                case 5: {
                    v.v();
                    v.a();
                    v.f(0, 769);
                    v.b(f10, f10, f10, 1.0f);
                    if (string == null) break;
                }
                case 6: {
                    v.v();
                    v.a();
                    v.f(1, 769);
                    v.b(f10, f10, f10, 1.0f);
                    if (string == null) break;
                }
                case 7: {
                    v.v();
                    v.a();
                    v.f(774, 768);
                    v.b(f10, f10, f10, 1.0f);
                    if (string == null) break;
                }
                case 8: {
                    v.e();
                    v.f();
                    v.b(1.0f, 1.0f, 1.0f, f10);
                    break;
                }
            }
            v.x();
        }
    }

    static {
        j = 2;
        h = 1;
        c = 1;
        f = 4;
        d = 0;
        b = 5;
        g = 6;
        a = 3;
        e = 7;
        i = 8;
    }

    public static void a(float f10) {
        v.v();
        v.a();
        v.f(770, 1);
        v.b(1.0f, 1.0f, 1.0f, f10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int a(String string) {
        String string2 = K.d();
        String string3 = string;
        if (string2 == null) {
            if (string3 == null) {
                return 1;
            }
            string3 = string = string.toLowerCase().trim();
        }
        int n2 = string3.equals("alpha");
        if (string2 == null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = string.equals("add");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.equals("subtract");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.equals("multiply");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.equals("dodge");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 4;
            }
            n2 = string.equals("burn");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 5;
            }
            n2 = string.equals("screen");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 6;
            }
            n2 = string.equals("overlay");
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 7;
            }
            n2 = string.equals("replace") ? 1 : 0;
        }
        if (string2 == null) {
            if (n2 != 0) {
                return 8;
            }
            fU.h("Unknown blend: " + string);
            n2 = 1;
        }
        return n2;
    }
}

