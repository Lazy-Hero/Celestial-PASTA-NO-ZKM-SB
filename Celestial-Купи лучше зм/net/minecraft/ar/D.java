/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ar;

import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.ar.G;
import net.minecraft.ar.v;
import net.minecraft.at.k;

public class D {
    private final /* synthetic */ int c;
    private final /* synthetic */ G b;
    private final /* synthetic */ String d;
    private final /* synthetic */ float e;
    private final /* synthetic */ float a;
    private final /* synthetic */ float f;

    public D(G g10, int n2, float f10, float f11, String string, float f12) {
        this.b = g10;
        this.c = n2;
        this.e = f11;
        this.f = f10;
        this.d = string;
        this.a = f12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float f() {
        int n2 = v.b();
        D d10 = this;
        if (n2 == 0) {
            if (d10.b == G.l) {
                return Float.MAX_VALUE;
            }
            d10 = this;
        }
        float f10 = d10.a;
        return f10;
    }

    public boolean d() {
        return this.b.h() instanceof B;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Nullable
    public String a() {
        return this.d;
    }

    public float b() {
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public k e() {
        int n2 = v.d();
        x x2 = this.c().h();
        if (n2 != 0) {
            if (x2 == null) {
                return null;
            }
            x2 = this.c().h();
        }
        k k2 = x2.d();
        return k2;
    }

    public G c() {
        return this.b;
    }
}

