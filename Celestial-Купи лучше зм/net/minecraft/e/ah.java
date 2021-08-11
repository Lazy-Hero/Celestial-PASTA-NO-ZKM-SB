/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import java.util.ArrayDeque;
import net.minecraft.E.J;
import net.minecraft.E.g;
import net.minecraft.E.h;
import net.minecraft.E.i;
import net.minecraft.E.s;
import net.minecraft.aV;
import net.minecraft.aZ;
import net.minecraft.k.m;

public class ah
implements i {
    private final /* synthetic */ h a;

    @Override
    public void a(aZ aZ2, J j2, ArrayDeque<aV> arrayDeque, int n2) {
        block4: {
            g g10;
            m[] arrm;
            block3: {
                g g11 = this.a.a(aZ2);
                arrm = s.b();
                g10 = g11;
                if (arrm == null) break block3;
                if (g10 == null) break block4;
                g10 = g11;
            }
            i[] arri = g10.a();
            int n3 = n2 - arrayDeque.size();
            int n4 = Math.min(arri.length, n3);
            for (int i2 = n4 - 1; i2 >= 0; --i2) {
                arrayDeque.addFirst(new aV(aZ2, j2, arri[i2]));
                if (arrm != null) continue;
            }
        }
    }

    public ah(g g10) {
        this.a = new h(g10);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String toString() {
        return "/function " + this.a;
    }
}

