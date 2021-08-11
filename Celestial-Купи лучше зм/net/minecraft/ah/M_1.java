/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.P;
import net.minecraft.ah.z;

class M {
    private /* synthetic */ String d;
    private /* synthetic */ int c;
    private /* synthetic */ boolean b;
    private final /* synthetic */ P e;
    private /* synthetic */ double a;

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    public P d() {
        return this.e;
    }

    public M(String string, P p2) {
        this.e = p2;
        this.a(string);
    }

    public void a(String string) {
        this.d = string;
        String string2 = z.I();
        if (string2 != null) {
            if (string != null) {
                boolean bl2 = string.equals("false");
                if (string2 != null) {
                    if (bl2) {
                        this.b = false;
                        return;
                    }
                    bl2 = string.equals("true");
                }
                if (bl2) {
                    this.b = true;
                    return;
                }
            }
            this.b = Boolean.parseBoolean(string);
        }
        boolean bl3 = this.b;
        if (string2 != null) {
            bl3 = bl3;
        }
        this.c = bl3 ? 1 : 0;
        try {
            this.c = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        try {
            this.a = Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
    }

    public boolean c() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String a() {
        return this.d;
    }
}

