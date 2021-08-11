/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.b1;

public class a3
implements aJ {
    private final /* synthetic */ String c;
    private final /* synthetic */ int b;
    final /* synthetic */ b1 a;

    public a3(b1 b12, String string) {
        this.a = b12;
        this.c = h.a(string, new Object[0]);
        this.b = b1.b((b1)b12).a6.e(this.c);
    }

    @Override
    public boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        return false;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        b1.b((b1)this.a).a6.b(this.c, L.h / 2 - this.b / 2, n4 + n6 - b1.b((b1)this.a).a6.p - 1, 0xFFFFFF);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }
}

