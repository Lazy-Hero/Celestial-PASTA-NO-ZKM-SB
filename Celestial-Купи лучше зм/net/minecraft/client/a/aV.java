/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.a2;
import net.minecraft.client.a.ak;
import net.minecraft.client.a.au;
import net.minecraft.client.a.ay;

public abstract class aV
extends Enum<aV> {
    public static final /* synthetic */ /* enum */ aV DEFAULT;
    public static final /* synthetic */ /* enum */ aV TRANSPARENT_MODEL;
    private static final /* synthetic */ aV[] a;
    public static final /* synthetic */ /* enum */ aV PLAYER_SKIN;

    public static aV valueOf(String string) {
        return Enum.valueOf(aV.class, string);
    }

    public abstract void a();

    public static aV[] values() {
        return (aV[])a.clone();
    }

    static {
        DEFAULT = new ay();
        PLAYER_SKIN = new ak();
        TRANSPARENT_MODEL = new a2();
        a = new aV[]{DEFAULT, PLAYER_SKIN, TRANSPARENT_MODEL};
    }

    aV(au au2) {
        this();
    }

    private aV() {
    }

    public abstract void b();
}

