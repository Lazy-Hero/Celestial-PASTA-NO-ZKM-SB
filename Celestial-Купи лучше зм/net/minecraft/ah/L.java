/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import net.minecraft.ah.z;

public class L {
    public static final /* synthetic */ L j;
    private final /* synthetic */ int l;
    public static final /* synthetic */ L k;
    private final /* synthetic */ int c;
    public static final /* synthetic */ L[] d;
    private /* synthetic */ boolean m;
    private /* synthetic */ boolean n;
    public static final /* synthetic */ L g;
    private final /* synthetic */ String f;
    private /* synthetic */ boolean h;
    public static final /* synthetic */ L e;
    public static final /* synthetic */ L i;
    public static final /* synthetic */ L a;
    public static final /* synthetic */ L b;

    public boolean a() {
        return this.h;
    }

    public String b() {
        return this.f;
    }

    public static L a(String string) {
        L[] arrl = d;
        int n2 = arrl.length;
        int n3 = 0;
        String string2 = z.I();
        while (n3 < n2) {
            block3: {
                block4: {
                    L l2;
                    block5: {
                        L l3 = arrl[n3];
                        if (string2 == null) break block3;
                        if (l3 == null) break block4;
                        l2 = l3;
                        if (string2 == null) break block5;
                        if (!l2.f.equalsIgnoreCase(string)) break block4;
                        l2 = l3;
                    }
                    return l2;
                }
                ++n3;
            }
            if (string2 != null) continue;
        }
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private L j() {
        this.m = true;
        return this;
    }

    public String c() {
        return this.g() + ".info";
    }

    private L(int n2, String string) {
        this(n2, string, 0);
    }

    private L a(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public boolean h() {
        return this.m;
    }

    public L a(int n2) {
        return this == a && n2 == 0 ? j : this;
    }

    private L d() {
        this.n = true;
        return this;
    }

    public String g() {
        return "generator." + this.f;
    }

    private L(int n2, String string, int n3) {
        this.f = string;
        this.l = n3;
        this.h = true;
        this.c = n2;
        L.d[n2] = this;
    }

    public boolean i() {
        return this.n;
    }

    static {
        d = new L[16];
        a = new L(0, "default", 1).j();
        g = new L(1, "flat");
        b = new L(2, "largeBiomes");
        k = new L(3, "amplified").d();
        i = new L(4, "customized");
        e = new L(5, "debug_all_block_states");
        j = new L(8, "default_1_1", 0).a(false);
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.l;
    }
}

