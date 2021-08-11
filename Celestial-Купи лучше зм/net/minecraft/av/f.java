/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.av;

import net.minecraft.av.d;
import net.minecraft.k.m;

public final class f
extends Enum<f>
implements d {
    public static final /* synthetic */ /* enum */ f CHUNK;
    public static final /* synthetic */ /* enum */ f BLOCK_ENTITY;
    public static final /* synthetic */ /* enum */ f STRUCTURE;
    private static final /* synthetic */ f[] a;
    public static final /* synthetic */ /* enum */ f LEVEL;
    public static final /* synthetic */ /* enum */ f ENTITY;
    private static /* synthetic */ m[] b;
    public static final /* synthetic */ /* enum */ f PLAYER;
    public static final /* synthetic */ /* enum */ f ITEM_INSTANCE;
    public static final /* synthetic */ /* enum */ f OPTIONS;

    static {
        LEVEL = new f();
        PLAYER = new f();
        f.b(new m[3]);
        CHUNK = new f();
        BLOCK_ENTITY = new f();
        ENTITY = new f();
        ITEM_INSTANCE = new f();
        OPTIONS = new f();
        STRUCTURE = new f();
        a = new f[]{LEVEL, PLAYER, CHUNK, BLOCK_ENTITY, ENTITY, ITEM_INSTANCE, OPTIONS, STRUCTURE};
    }

    public static void b(m[] arrm) {
        b = arrm;
    }

    public static f valueOf(String string) {
        return Enum.valueOf(f.class, string);
    }

    public static m[] b() {
        return b;
    }

    public static f[] values() {
        return (f[])a.clone();
    }
}

