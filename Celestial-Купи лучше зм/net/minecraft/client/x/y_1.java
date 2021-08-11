/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Quaternion
 */
package net.minecraft.client.x;

import net.minecraft.client.a.v;
import net.minecraft.client.x.L;
import net.minecraft.client.x.P;
import net.minecraft.client.x.d;
import net.minecraft.k.h;
import org.lwjgl.util.vector.Quaternion;

public class y {
    public final /* synthetic */ L a;
    public static /* synthetic */ float j;
    public static /* synthetic */ float l;
    public final /* synthetic */ L r;
    public static /* synthetic */ float q;
    public static /* synthetic */ float f;
    public static final /* synthetic */ y e;
    public static /* synthetic */ float b;
    public final /* synthetic */ L i;
    public static /* synthetic */ float c;
    public final /* synthetic */ L g;
    public final /* synthetic */ L k;
    public final /* synthetic */ L d;
    public static /* synthetic */ float m;
    public final /* synthetic */ L p;
    public static /* synthetic */ float h;
    public final /* synthetic */ L n;
    public static /* synthetic */ float o;

    public y(L l2, L l3, L l4, L l5, L l6, L l7, L l8, L l9) {
        this.i = l2;
        this.k = l3;
        this.g = l4;
        this.a = l5;
        this.r = l6;
        this.p = l7;
        this.n = l8;
        this.d = l9;
    }

    static {
        e = new y();
    }

    private static Quaternion a(float f10, float f11, float f12) {
        float f13 = f10 * ((float)Math.PI / 180);
        float f14 = f11 * ((float)Math.PI / 180);
        float f15 = f12 * ((float)Math.PI / 180);
        float f16 = net.minecraft.k.h.g(0.5f * f13);
        float f17 = net.minecraft.k.h.c(0.5f * f13);
        float f18 = net.minecraft.k.h.g(0.5f * f14);
        float f19 = net.minecraft.k.h.c(0.5f * f14);
        float f20 = net.minecraft.k.h.g(0.5f * f15);
        float f21 = net.minecraft.k.h.c(0.5f * f15);
        return new Quaternion(f16 * f19 * f21 + f17 * f18 * f20, f17 * f18 * f21 - f16 * f19 * f20, f16 * f18 * f21 + f17 * f19 * f20, f17 * f19 * f21 - f16 * f18 * f20);
    }

    public boolean a(d d10) {
        return this.c(d10) != L.c;
    }

    public y(y y2) {
        this.i = y2.i;
        this.k = y2.k;
        this.g = y2.g;
        this.a = y2.a;
        this.r = y2.r;
        this.p = y2.p;
        this.n = y2.n;
        this.d = y2.d;
    }

    public static void a(L l2, boolean n2) {
        String[] arrstring = P.o();
        if (l2 != L.c) {
            int n3 = n2;
            if (arrstring == null) {
                n3 = n3 != 0 ? -1 : 1;
            }
            int n4 = n3;
            v.b((float)n4 * (h + l2.a.x), c + l2.a.y, m + l2.a.z);
            float f10 = f + l2.b.x;
            float f11 = j + l2.b.y;
            float f12 = l + l2.b.z;
            if (arrstring == null) {
                if (n2 != 0) {
                    f11 = -f11;
                    f12 = -f12;
                }
                v.a(y.a(f10, f11, f12));
            }
            v.d(o + l2.d.x, q + l2.d.y, b + l2.d.z);
        }
    }

    private y() {
        this(L.c, L.c, L.c, L.c, L.c, L.c, L.c, L.c);
    }

    public void b(d d10) {
        y.a(this.c(d10), false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public L c(d d10) {
        switch (d10) {
            case THIRD_PERSON_LEFT_HAND: {
                return this.i;
            }
            case THIRD_PERSON_RIGHT_HAND: {
                return this.k;
            }
            case FIRST_PERSON_LEFT_HAND: {
                return this.g;
            }
            case FIRST_PERSON_RIGHT_HAND: {
                return this.a;
            }
            case HEAD: {
                return this.r;
            }
            case GUI: {
                return this.p;
            }
            case GROUND: {
                return this.n;
            }
            case FIXED: {
                return this.d;
            }
        }
        return L.c;
    }
}

