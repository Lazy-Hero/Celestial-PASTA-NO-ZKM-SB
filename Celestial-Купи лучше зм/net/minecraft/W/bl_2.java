/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.ar.p;
import net.minecraft.at.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bl
extends Enum<bl>
implements p {
    public static final /* synthetic */ /* enum */ bl CYAN;
    private static final /* synthetic */ bl[] b;
    private static /* synthetic */ int f;
    public static final /* synthetic */ /* enum */ bl YELLOW;
    public static final /* synthetic */ /* enum */ bl BROWN;
    public static final /* synthetic */ /* enum */ bl PURPLE;
    private final /* synthetic */ int c;
    public static final /* synthetic */ /* enum */ bl SILVER;
    public static final /* synthetic */ /* enum */ bl LIGHT_BLUE;
    public static final /* synthetic */ /* enum */ bl WHITE;
    private static final /* synthetic */ bl[] g;
    private final /* synthetic */ int k;
    private final /* synthetic */ String e;
    public static final /* synthetic */ /* enum */ bl LIME;
    private final /* synthetic */ int j;
    public static final /* synthetic */ /* enum */ bl MAGENTA;
    private final /* synthetic */ l h;
    private final /* synthetic */ float[] i;
    public static final /* synthetic */ /* enum */ bl RED;
    private static final /* synthetic */ bl[] a;
    private final /* synthetic */ String d;
    public static final /* synthetic */ /* enum */ bl BLACK;
    public static final /* synthetic */ /* enum */ bl GREEN;
    public static final /* synthetic */ /* enum */ bl PINK;
    public static final /* synthetic */ /* enum */ bl ORANGE;
    public static final /* synthetic */ /* enum */ bl BLUE;
    public static final /* synthetic */ /* enum */ bl GRAY;

    public int a() {
        return this.k;
    }

    public static int g() {
        return f;
    }

    private bl(int n3, int n4, String string2, String string3, int n5, l l2) {
        this.j = n3;
        this.k = n4;
        this.e = string2;
        this.d = string3;
        this.c = n5;
        this.h = l2;
        int n6 = (n5 & 0xFF0000) >> 16;
        int n7 = (n5 & 0xFF00) >> 8;
        int n8 = (n5 & 0xFF) >> 0;
        this.i = new float[]{(float)n6 / 255.0f, (float)n7 / 255.0f, (float)n8 / 255.0f};
    }

    public static int c() {
        int n2 = bl.g();
        if (n2 == 0) {
            return 57;
        }
        return 0;
    }

    public String b() {
        return this.e;
    }

    public float[] f() {
        return this.i;
    }

    public String toString() {
        return this.d;
    }

    public static bl c(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    int n4 = bl.c();
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < a.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return a[n2];
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        WHITE = new bl(0, 15, "white", "white", 0xF9FFFE, l.WHITE);
        bl.b(109);
        ORANGE = new bl(1, 14, "orange", "orange", 16351261, l.GOLD);
        MAGENTA = new bl(2, 13, "magenta", "magenta", 13061821, l.AQUA);
        LIGHT_BLUE = new bl(3, 12, "light_blue", "lightBlue", 3847130, l.BLUE);
        YELLOW = new bl(4, 11, "yellow", "yellow", 16701501, l.YELLOW);
        LIME = new bl(5, 10, "lime", "lime", 8439583, l.GREEN);
        PINK = new bl(6, 9, "pink", "pink", 15961002, l.LIGHT_PURPLE);
        GRAY = new bl(7, 8, "gray", "gray", 4673362, l.DARK_GRAY);
        SILVER = new bl(8, 7, "silver", "silver", 0x9D9D97, l.GRAY);
        CYAN = new bl(9, 6, "cyan", "cyan", 1481884, l.DARK_AQUA);
        PURPLE = new bl(10, 5, "purple", "purple", 8991416, l.DARK_PURPLE);
        BLUE = new bl(11, 4, "blue", "blue", 3949738, l.DARK_BLUE);
        BROWN = new bl(12, 3, "brown", "brown", 8606770, l.GOLD);
        GREEN = new bl(13, 2, "green", "green", 6192150, l.DARK_GREEN);
        RED = new bl(14, 1, "red", "red", 11546150, l.DARK_RED);
        BLACK = new bl(15, 0, "black", "black", 0x1D1D21, l.BLACK);
        g = new bl[]{WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, SILVER, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK};
        a = new bl[bl.values().length];
        b = new bl[bl.values().length];
        bl[] arrbl = bl.values();
        int n2 = arrbl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bl bl2;
            bl.a[bl2.e()] = bl2 = arrbl[i2];
            bl.b[bl2.a()] = bl2;
        }
    }

    public static void b(int n2) {
        f = n2;
    }

    public int e() {
        return this.j;
    }

    public static bl d(int n2) {
        block4: {
            int n3;
            block2: {
                block3: {
                    int n4 = bl.c();
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < 0) break block3;
                    n3 = n2;
                    if (n4 != 0) break block2;
                    if (n3 < b.length) break block4;
                }
                n3 = 0;
            }
            n2 = n3;
        }
        return b[n2];
    }

    public static bl valueOf(String string) {
        return Enum.valueOf(bl.class, string);
    }

    public static bl[] values() {
        return (bl[])g.clone();
    }

    public int h() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    @Override
    public String a() {
        return this.e;
    }
}

