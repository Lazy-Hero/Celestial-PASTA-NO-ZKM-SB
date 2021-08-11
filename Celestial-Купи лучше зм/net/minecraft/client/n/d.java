/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.n;

import net.minecraft.client.a.v;
import net.minecraft.client.b.q;

public final class d
extends Enum<d> {
    public static final /* synthetic */ /* enum */ d MOVEMENT_KEYS;
    public static final /* synthetic */ /* enum */ d RECIPE_BOOK;
    private static /* synthetic */ String[] b;
    private final /* synthetic */ int d;
    public static final /* synthetic */ /* enum */ d WOODEN_PLANKS;
    public static final /* synthetic */ /* enum */ d MOUSE;
    private static final /* synthetic */ d[] c;
    public static final /* synthetic */ /* enum */ d TREE;
    private final /* synthetic */ int e;

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static d[] values() {
        return (d[])c.clone();
    }

    public void a(q q2, int n2, int n3) {
        v.a();
        q2.a(n2, n3, 176 + this.e * 20, this.d * 20, 20, 20);
        v.a();
    }

    private d(int n3, int n4) {
        this.e = n3;
        this.d = n4;
    }

    static {
        MOVEMENT_KEYS = new d(0, 0);
        MOUSE = new d(1, 0);
        net.minecraft.client.n.d.b(new String[3]);
        TREE = new d(2, 0);
        RECIPE_BOOK = new d(0, 1);
        WOODEN_PLANKS = new d(1, 1);
        c = new d[]{MOVEMENT_KEYS, MOUSE, TREE, RECIPE_BOOK, WOODEN_PLANKS};
    }

    public static d valueOf(String string) {
        return Enum.valueOf(d.class, string);
    }

    public static String[] b() {
        return b;
    }
}

