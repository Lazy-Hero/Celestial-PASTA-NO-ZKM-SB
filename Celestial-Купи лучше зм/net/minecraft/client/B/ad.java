/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.av;
import net.minecraft.client.b.q;
import net.minecraft.client.o.l;

public class ad
implements aJ {
    private final /* synthetic */ av c;
    private /* synthetic */ long d;
    protected final /* synthetic */ l b;
    protected final /* synthetic */ Q a;

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        block2: {
            int n9;
            block3: {
                String[] arrstring = q.b();
                this.a.a6.b(h.a("lanServer.title", new Object[0]), n3 + 32 + 3, n4 + 1, 0xFFFFFF);
                String[] arrstring2 = arrstring;
                this.a.a6.b(this.b.c(), n3 + 32 + 3, n4 + 12, 0x808080);
                n9 = this.a.ac.ar;
                if (arrstring2 == null) break block2;
                if (n9 == 0) break block3;
                this.a.a6.b(h.a("selectServer.hiddenAddress", new Object[0]), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
                if (arrstring2 != null) break block2;
            }
            n9 = this.a.a6.b(this.b.a(), n3 + 32 + 3, n4 + 12 + 11, 0x303030);
        }
    }

    public l a() {
        return this.b;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        String[] arrstring = q.b();
        this.c.a(n2);
        String[] arrstring2 = arrstring;
        long l2 = Q.aj() - this.d - 250L;
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (arrstring2 != null) {
            if (l3 < 0) {
                this.c.b();
            }
            this.d = Q.aj();
            l3 = 0;
        }
        return (boolean)l3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected ad(av av2, l l2) {
        this.c = av2;
        this.b = l2;
        this.a = Q.P();
    }
}

