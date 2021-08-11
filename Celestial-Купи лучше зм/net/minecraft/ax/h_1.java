/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ax;

import net.minecraft.ax.i;
import net.minecraft.ax.j;
import net.minecraft.ax.k;
import net.minecraft.ax.l;
import net.minecraft.ax.m;
import net.minecraft.ax.n;
import net.minecraft.ax.o;
import net.minecraft.ax.p;
import net.minecraft.ax.q;
import net.minecraft.ax.r;
import net.minecraft.ax.s;
import net.minecraft.ax.t;

public abstract class h
extends Enum<h> {
    private static final /* synthetic */ h[] a;
    public static final /* synthetic */ /* enum */ h BOW;
    public static final /* synthetic */ /* enum */ h ARMOR_CHEST;
    public static final /* synthetic */ /* enum */ h ARMOR_FEET;
    public static final /* synthetic */ /* enum */ h WEAPON;
    public static final /* synthetic */ /* enum */ h ARMOR;
    public static final /* synthetic */ /* enum */ h ALL;
    public static final /* synthetic */ /* enum */ h FISHING_ROD;
    public static final /* synthetic */ /* enum */ h ARMOR_HEAD;
    public static final /* synthetic */ /* enum */ h BREAKABLE;
    public static final /* synthetic */ /* enum */ h WEARABLE;
    public static final /* synthetic */ /* enum */ h ARMOR_LEGS;
    public static final /* synthetic */ /* enum */ h DIGGER;

    public abstract boolean a(net.minecraft.w.k var1);

    static {
        ALL = new i();
        ARMOR = new m();
        ARMOR_FEET = new n();
        ARMOR_LEGS = new o();
        ARMOR_CHEST = new p();
        ARMOR_HEAD = new q();
        WEAPON = new r();
        DIGGER = new s();
        FISHING_ROD = new t();
        BREAKABLE = new j();
        BOW = new k();
        WEARABLE = new l();
        a = new h[]{ALL, ARMOR, ARMOR_FEET, ARMOR_LEGS, ARMOR_CHEST, ARMOR_HEAD, WEAPON, DIGGER, FISHING_ROD, BREAKABLE, BOW, WEARABLE};
    }

    public static h[] values() {
        return (h[])a.clone();
    }

    private h() {
    }

    h(i i2) {
        this();
    }

    public static h valueOf(String string) {
        return Enum.valueOf(h.class, string);
    }
}

