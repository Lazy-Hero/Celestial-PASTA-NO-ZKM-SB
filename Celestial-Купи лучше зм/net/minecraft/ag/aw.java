/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ag;

import javax.annotation.Nullable;
import net.minecraft.ag.A;
import net.minecraft.u.h;
import net.minecraft.w.d;
import net.minecraft.w.k;

public enum aw {
    NONE(0),
    IRON(5, "iron", "meo"),
    GOLD(7, "gold", "goo"),
    DIAMOND(11, "diamond", "dio");

    private final /* synthetic */ int d;
    private final /* synthetic */ String c;
    private final /* synthetic */ String b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static aw b(k k2) {
        String[] arrstring = A.b();
        k k3 = k2;
        k k4 = h.a;
        if (arrstring != null) {
            if (k3 == k4) {
                return IRON;
            }
            k3 = k2;
            k4 = h.bf;
        }
        if (arrstring != null) {
            if (k3 == k4) {
                return GOLD;
            }
            k3 = k2;
            k4 = h.aD;
        }
        return k3 == k4 ? DIAMOND : NONE;
    }

    public static aw a(int n2) {
        return aw.values()[n2];
    }

    public int b() {
        return this.ordinal();
    }

    @Nullable
    public String a() {
        return this.b;
    }

    public int c() {
        return this.d;
    }

    private aw(int n3) {
        this.d = n3;
        this.b = null;
        this.c = "";
    }

    public String d() {
        return this.c;
    }

    public static boolean a(k k2) {
        return aw.b(k2) != NONE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static aw a(d d10) {
        aw aw2;
        String[] arrstring = A.b();
        d d11 = d10;
        if (arrstring != null) {
            if (d11.G()) {
                aw2 = NONE;
                return aw2;
            }
            d11 = d10;
        }
        aw2 = aw.b(d11.w());
        return aw2;
    }

    private aw(int n3, String string2, String string3) {
        this.d = n3;
        this.b = "textures/entity/horse/armor/horse_armor_" + string2 + ".png";
        this.c = string3;
    }
}

