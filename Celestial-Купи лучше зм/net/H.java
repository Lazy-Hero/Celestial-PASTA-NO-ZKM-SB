/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;
import net.minecraft.client.E.l;
import net.minecraft.client.Q;
import net.minecraft.k.h;
import net.r;
import net.y;

public enum H {
    PLUS("+", 2, 0),
    MINUS("-", 2, 0),
    MUL("*", 2, 1),
    DIV("/", 2, 1),
    MOD("%", 2, 1),
    NEG("neg", 1),
    PI("pi", 0),
    SIN("sin", 1),
    COS("cos", 1),
    TAN("tan", 1),
    ATAN("atan", 1),
    ATAN2("atan2", 2),
    TORAD("torad", 1),
    TODEG("todeg", 1),
    MIN("min", 2),
    MAX("max", 2),
    CLAMP("clamp", 3),
    ABS("abs", 1),
    FLOOR("floor", 1),
    CEIL("ceil", 1),
    FRAC("frac", 1),
    ROUND("round", 1),
    SQRT("sqrt", 1),
    FMOD("fmod", 2),
    TIME("time", 0);

    private final /* synthetic */ int d;
    public static /* synthetic */ H[] VALUES;
    private /* synthetic */ int b;
    private final /* synthetic */ String a;

    public float a(r[] arrr) {
        int[] arrn = G.c();
        int n2 = arrr.length;
        if (arrn == null) {
            if (n2 != this.d) {
                fU.h("Invalid number of arguments, function: " + (Object)((Object)this) + ", arguments: " + arrr.length + ", should be: " + this.d);
                return 0.0f;
            }
            n2 = y.a[this.ordinal()];
        }
        switch (n2) {
            case 1: {
                return arrr[0].a() + arrr[1].a();
            }
            case 2: {
                return arrr[0].a() - arrr[1].a();
            }
            case 3: {
                return arrr[0].a() * arrr[1].a();
            }
            case 4: {
                return arrr[0].a() / arrr[1].a();
            }
            case 5: {
                float f10 = arrr[0].a();
                float f11 = arrr[1].a();
                return f10 - f11 * (float)((int)(f10 / f11));
            }
            case 6: {
                return -arrr[0].a();
            }
            case 7: {
                return (float)Math.PI;
            }
            case 8: {
                return h.g(arrr[0].a());
            }
            case 9: {
                return h.c(arrr[0].a());
            }
            case 10: {
                return (float)Math.tan(arrr[0].a());
            }
            case 11: {
                return (float)Math.atan(arrr[0].a());
            }
            case 12: {
                return (float)h.a((double)arrr[0].a(), (double)arrr[1].a());
            }
            case 13: {
                return c5.b(arrr[0].a());
            }
            case 14: {
                return c5.a(arrr[0].a());
            }
            case 15: {
                return Math.min(arrr[0].a(), arrr[1].a());
            }
            case 16: {
                return Math.max(arrr[0].a(), arrr[1].a());
            }
            case 17: {
                return h.c(arrr[0].a(), arrr[1].a(), arrr[2].a());
            }
            case 18: {
                return h.e(arrr[0].a());
            }
            case 19: {
                return h.d(arrr[0].a());
            }
            case 20: {
                return h.f(arrr[0].a());
            }
            case 21: {
                return (float)h.a((double)arrr[0].a());
            }
            case 22: {
                return Math.round(arrr[0].a());
            }
            case 23: {
                return h.a(arrr[0].a());
            }
            case 24: {
                float f12 = arrr[0].a();
                float f13 = arrr[1].a();
                return f12 - f13 * (float)h.d(f12 / f13);
            }
            case 25: {
                l l2;
                Q q2 = Q.P();
                l l3 = l2 = q2.e;
                if (arrn == null) {
                    if (l3 == null) {
                        return 0.0f;
                    }
                    l3 = l2;
                }
                return (float)(l3.r() % 24000L) + q2.aD();
            }
        }
        fU.h("Unknown function type: " + (Object)((Object)this));
        return 0.0f;
    }

    public int c() {
        return this.b;
    }

    public String a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.d;
    }

    private H(String string2, int n3) {
        this.a = string2;
        this.d = n3;
    }

    public static H a(String string) {
        int n2 = 0;
        int[] arrn = G.c();
        while (n2 < VALUES.length) {
            H h2 = VALUES[n2];
            if (arrn == null) {
                if (h2.a().equals(string)) {
                    return h2;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    private H(String string2, int n3, int n4) {
        this.a = string2;
        this.d = n3;
        this.b = n4;
    }

    static {
        VALUES = H.values();
    }
}

