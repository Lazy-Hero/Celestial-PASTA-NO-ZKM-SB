/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.main;

import net.minecraft.client.main.a;
import net.minecraft.client.main.b;
import net.minecraft.client.main.d;
import net.minecraft.client.main.f;
import net.minecraft.client.main.h;
import net.minecraft.k.m;

public class e {
    public final /* synthetic */ b c;
    public final /* synthetic */ a e;
    public final /* synthetic */ d b;
    public final /* synthetic */ f d;
    public final /* synthetic */ h a;
    private static /* synthetic */ m[] f;

    public static void b(m[] arrm) {
        f = arrm;
    }

    static {
        if (net.minecraft.client.main.e.b() != null) {
            net.minecraft.client.main.e.b(new m[1]);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public e(b b10, f f10, h h2, d d10, a a10) {
        block0: {
            this.c = b10;
            m[] arrm = net.minecraft.client.main.e.b();
            this.d = f10;
            this.a = h2;
            this.b = d10;
            this.e = a10;
            if (m.d()) break block0;
            net.minecraft.client.main.e.b(new m[2]);
        }
    }

    public static m[] b() {
        return f;
    }
}

