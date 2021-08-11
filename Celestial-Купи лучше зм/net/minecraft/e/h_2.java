/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import javax.annotation.Nullable;
import net.minecraft.E.g;
import net.minecraft.E.s;
import net.minecraft.aZ;
import net.minecraft.ar.v;
import net.minecraft.k.m;

public class h {
    private /* synthetic */ boolean d;
    public static final /* synthetic */ h b;
    private /* synthetic */ g c;
    @Nullable
    private final /* synthetic */ v a;

    static {
        b = new h((v)null);
    }

    @Nullable
    public g a(aZ aZ2) {
        m[] arrm = s.b();
        h h2 = this;
        if (arrm != null) {
            if (!h2.d) {
                h h3 = this;
                if (arrm != null) {
                    if (h3.a != null) {
                        this.c = aZ2.a(this.a);
                    }
                    h3 = this;
                }
                h3.d = true;
            }
            h2 = this;
        }
        return h2.c;
    }

    public h(g g10) {
        this.a = null;
        this.c = g10;
    }

    public h(@Nullable v v2) {
        this.a = v2;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

