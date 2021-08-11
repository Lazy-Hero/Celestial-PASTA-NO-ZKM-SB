/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.f;
import net.minecraft.c.k;
import net.minecraft.c.l;
import net.minecraft.k.m;

class i
implements k<String> {
    final /* synthetic */ f a;

    private static gP a(gP gP2) {
        return gP2;
    }

    i(f f10) {
        this.a = f10;
    }

    public String a() {
        String string;
        block0: {
            Runtime runtime = Runtime.getRuntime();
            String string2 = l.b();
            long l2 = runtime.maxMemory();
            long l3 = runtime.totalMemory();
            long l4 = runtime.freeMemory();
            long l5 = l2 / 1024L / 1024L;
            long l6 = l3 / 1024L / 1024L;
            long l7 = l4 / 1024L / 1024L;
            string = l4 + " bytes (" + l7 + " MB) / " + l3 + " bytes (" + l6 + " MB) up to " + l2 + " bytes (" + l5 + " MB)";
            if (m.d()) break block0;
            l.b("qDSmac");
        }
        return string;
    }
}

