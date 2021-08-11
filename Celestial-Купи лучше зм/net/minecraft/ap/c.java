/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.ap;

import java.util.Iterator;
import javax.annotation.Nullable;
import net.minecraft.Z.i;
import net.minecraft.ap.d;
import net.minecraft.ap.g;
import net.minecraft.ar.m;

class c
implements Iterable<i> {
    private /* synthetic */ int b;
    final /* synthetic */ m<i> a;
    public static final /* synthetic */ i c;

    static {
        c = net.minecraft.u.g.bf.d();
    }

    @Nullable
    public i a(int n2) {
        i i2 = this.a.a(n2);
        int[] arrn = g.c();
        i i3 = i2;
        if (arrn != null) {
            i3 = i3 == null ? c : i2;
        }
        return i3;
    }

    @Override
    public Iterator<i> iterator() {
        return this.a.iterator();
    }

    public int a(i i2) {
        int n2 = this.a.a(i2);
        int[] arrn = g.c();
        int n3 = n2;
        if (arrn != null) {
            if (n3 == -1) {
                n2 = this.b++;
                this.a.a(i2, n2);
            }
            n3 = n2;
        }
        return n3;
    }

    public void a(i i2, int n2) {
        this.a.a(i2, n2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    c(d d10) {
        this();
    }

    private c() {
        this.a = new m(16);
    }
}

