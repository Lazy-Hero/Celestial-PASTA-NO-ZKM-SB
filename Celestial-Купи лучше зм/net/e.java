/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.G;

public enum e {
    IDENTIFIER("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz", "0123456789_:."),
    CONSTANT("0123456789", "."),
    OPERATOR("+-*/%", 1),
    COMMA(",", 1),
    BRACKET_OPEN("(", 1),
    BRACKET_CLOSE(")", 1);

    private final /* synthetic */ String b;
    private /* synthetic */ int a;
    private final /* synthetic */ String d;
    public static final /* synthetic */ e[] VALUES;

    public int c() {
        return this.a;
    }

    static {
        VALUES = e.values();
    }

    public String b() {
        return this.d;
    }

    public String a() {
        return this.b;
    }

    private e(String string2, String string3) {
        this.b = string2;
        this.d = string3;
    }

    private e(String string2, int n3) {
        this.b = string2;
        this.d = "";
        this.a = n3;
    }

    public static e b(char c10) {
        int n2 = 0;
        int[] arrn = G.c();
        while (n2 < VALUES.length) {
            e e10 = VALUES[n2];
            if (arrn == null) {
                if (e10.a().indexOf(c10) >= 0) {
                    return e10;
                }
                ++n2;
            }
            if (arrn == null) continue;
        }
        return null;
    }

    public boolean a(char c10) {
        int[] arrn = G.c();
        int n2 = this.a().indexOf(c10);
        if (arrn == null) {
            if (n2 >= 0) {
                return true;
            }
            n2 = this.b().indexOf(c10);
        }
        if (arrn == null) {
            n2 = n2 >= 0 ? 1 : 0;
        }
        return n2 != 0;
    }

    private e(String string2) {
        this.b = string2;
        this.d = "";
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

