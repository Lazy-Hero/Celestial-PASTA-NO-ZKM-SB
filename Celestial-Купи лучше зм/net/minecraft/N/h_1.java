/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.N;

import javax.annotation.Nullable;
import net.minecraft.N.j;
import net.minecraft.W.C;
import net.minecraft.k.m;
import net.minecraft.u.g;
import net.minecraft.w.d;

public enum h {
    BASE("base", "b"),
    SQUARE_BOTTOM_LEFT("square_bottom_left", "bl", "   ", "   ", "#  "),
    SQUARE_BOTTOM_RIGHT("square_bottom_right", "br", "   ", "   ", "  #"),
    SQUARE_TOP_LEFT("square_top_left", "tl", "#  ", "   ", "   "),
    SQUARE_TOP_RIGHT("square_top_right", "tr", "  #", "   ", "   "),
    STRIPE_BOTTOM("stripe_bottom", "bs", "   ", "   ", "###"),
    STRIPE_TOP("stripe_top", "ts", "###", "   ", "   "),
    STRIPE_LEFT("stripe_left", "ls", "#  ", "#  ", "#  "),
    STRIPE_RIGHT("stripe_right", "rs", "  #", "  #", "  #"),
    STRIPE_CENTER("stripe_center", "cs", " # ", " # ", " # "),
    STRIPE_MIDDLE("stripe_middle", "ms", "   ", "###", "   "),
    STRIPE_DOWNRIGHT("stripe_downright", "drs", "#  ", " # ", "  #"),
    STRIPE_DOWNLEFT("stripe_downleft", "dls", "  #", " # ", "#  "),
    STRIPE_SMALL("small_stripes", "ss", "# #", "# #", "   "),
    CROSS("cross", "cr", "# #", " # ", "# #"),
    STRAIGHT_CROSS("straight_cross", "sc", " # ", "###", " # "),
    TRIANGLE_BOTTOM("triangle_bottom", "bt", "   ", " # ", "# #"),
    TRIANGLE_TOP("triangle_top", "tt", "# #", " # ", "   "),
    TRIANGLES_BOTTOM("triangles_bottom", "bts", "   ", "# #", " # "),
    TRIANGLES_TOP("triangles_top", "tts", " # ", "# #", "   "),
    DIAGONAL_LEFT("diagonal_left", "ld", "## ", "#  ", "   "),
    DIAGONAL_RIGHT("diagonal_up_right", "rd", "   ", "  #", " ##"),
    DIAGONAL_LEFT_MIRROR("diagonal_up_left", "lud", "   ", "#  ", "## "),
    DIAGONAL_RIGHT_MIRROR("diagonal_right", "rud", " ##", "  #", "   "),
    CIRCLE_MIDDLE("circle", "mc", "   ", " # ", "   "),
    RHOMBUS_MIDDLE("rhombus", "mr", " # ", "# #", " # "),
    HALF_VERTICAL("half_vertical", "vh", "## ", "## ", "## "),
    HALF_HORIZONTAL("half_horizontal", "hh", "###", "###", "   "),
    HALF_VERTICAL_MIRROR("half_vertical_right", "vhr", " ##", " ##", " ##"),
    HALF_HORIZONTAL_MIRROR("half_horizontal_bottom", "hhb", "   ", "###", "###"),
    BORDER("border", "bo", "###", "# #", "###"),
    CURLY_BORDER("curly_border", "cbo", new d(g.aW)),
    CREEPER("creeper", "cre", new d(net.minecraft.u.h.cp, 1, 4)),
    GRADIENT("gradient", "gra", "# #", " # ", " # "),
    GRADIENT_UP("gradient_up", "gru", " # ", " # ", "# #"),
    BRICKS("bricks", "bri", new d(g.cY)),
    SKULL("skull", "sku", new d(net.minecraft.u.h.cp, 1, 1)),
    FLOWER("flower", "flo", new d(g.cj, 1, C.OXEYE_DAISY.b())),
    MOJANG("mojang", "moj", new d(net.minecraft.u.h.bt, 1, 1));

    private /* synthetic */ d a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String d;
    private final /* synthetic */ String[] c;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean f() {
        m[] arrm = j.f();
        boolean bl2 = this.a.G();
        if (arrm == null) {
            bl2 = !bl2 || this.c[0] != null;
        }
        return bl2;
    }

    private h(String string2, String string3) {
        this.c = new String[3];
        this.a = net.minecraft.w.d.m;
        this.b = string2;
        this.d = string3;
    }

    @Nullable
    public static h a(String string) {
        h[] arrh = h.values();
        int n2 = arrh.length;
        m[] arrm = j.f();
        int n3 = 0;
        while (n3 < n2) {
            h h2 = arrh[n3];
            if (arrm == null) {
                if (h2.d.equals(string)) {
                    return h2;
                }
                ++n3;
            }
            if (arrm == null) continue;
        }
        return null;
    }

    private h(String string2, String string3, d d10) {
        this(string2, string3);
        this.a = d10;
    }

    public String d() {
        return this.d;
    }

    public boolean a() {
        m[] arrm = j.f();
        boolean bl2 = this.a.G();
        if (arrm == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public String c() {
        return this.b;
    }

    private h(String string2, String string3, String string4, String string5, String string6) {
        this(string2, string3);
        this.c[0] = string4;
        this.c[1] = string5;
        this.c[2] = string6;
    }

    public d e() {
        return this.a;
    }

    public String[] b() {
        return this.c;
    }
}

