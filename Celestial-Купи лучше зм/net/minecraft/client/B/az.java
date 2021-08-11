/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.q;

public class az
implements aJ {
    private final /* synthetic */ Q a;

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        String string;
        int n9 = n4 + n6 / 2 - this.a.a6.p / 2;
        String[] arrstring = q.b();
        this.a.a6.b(h.a("lanServer.scanning", new Object[0]), L.h / 2 - this.a.a6.e(h.a("lanServer.scanning", new Object[0])) / 2, n9, 0xFFFFFF);
        switch ((int)(Q.aj() / 300L % 4L)) {
            default: {
                string = "O o o";
                if (arrstring != null) break;
            }
            case 1: 
            case 3: {
                string = "o O o";
                if (arrstring != null) break;
            }
            case 2: {
                string = "o o O";
            }
        }
        this.a.a6.b(string, L.h / 2 - this.a.a6.e(string) / 2, n9 + this.a.a6.p, 0x808080);
    }

    public az() {
        this.a = Q.P();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }
}

