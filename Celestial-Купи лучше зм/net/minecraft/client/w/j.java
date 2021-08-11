/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.w;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.client.w.c;
import net.minecraft.client.w.h;

public abstract class j {
    private static /* synthetic */ int[] c;
    public /* synthetic */ List<c> b;
    public /* synthetic */ float a;
    public /* synthetic */ int f;
    public /* synthetic */ int g;
    public /* synthetic */ boolean h;
    public /* synthetic */ boolean d;
    private final /* synthetic */ Map<String, h> e;

    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
    }

    public void a(B b10, float f10, float f11, float f12) {
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15, x x2) {
    }

    public static void b(int[] arrn) {
        c = arrn;
    }

    protected void a(String string, int n2, int n3) {
        this.e.put(string, new h(n2, n3));
    }

    public h a(String string) {
        return this.e.get(string);
    }

    public static void a(c c10, c c11) {
        c11.y = c10.y;
        c11.e = c10.e;
        c11.r = c10.r;
        c11.v = c10.v;
        c11.h = c10.h;
        c11.u = c10.u;
    }

    public j() {
        this.h = true;
        this.b = Lists.newArrayList();
        this.e = Maps.newHashMap();
        this.g = 64;
        this.f = 32;
    }

    public void a(j j2) {
        this.a = j2.a;
        this.d = j2.d;
        this.h = j2.h;
    }

    public c a(Random random) {
        return this.b.get(random.nextInt(this.b.size()));
    }

    public static int[] b() {
        return c;
    }

    static {
        if (j.b() != null) {
            j.b(new int[5]);
        }
    }
}

