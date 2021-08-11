/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.awt.Color;
import java.io.IOException;
import java.util.List;
import net.minecraft.at.k;
import net.minecraft.client.D.h;
import net.minecraft.client.E.e;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a1;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class U
extends L {
    private final /* synthetic */ L C;
    private /* synthetic */ int B;
    private /* synthetic */ List<String> z;
    private final /* synthetic */ k y;
    private final /* synthetic */ String A;

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
    }

    public U(L l2, String string, k k2) {
        this.C = l2;
        this.A = net.minecraft.client.D.h.a(string, new Object[0]);
        this.y = k2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void a(int n2, int n3, float f10) {
        l l2 = new l(this.m);
        dJ.a(-5.0, 0.0, l2.e() - -6, l2.a(), 0.5, new Color(40, 40, 40, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
        String[] arrstring = q.b();
        dJ.a(1.0, 1.4, l2.e() - 1, (double)l2.a() - 1.7, 0.5, new Color(22, 22, 22, 255).getRGB(), new Color(60, 60, 60, 255).getRGB(), true);
        this.b(this.v, this.A, h / 2, w / 2 - this.B / 2 - this.v.p * 2, 0xAAAAAA);
        String[] arrstring2 = arrstring;
        int n4 = w / 2 - this.B / 2;
        U u2 = this;
        if (arrstring2 != null) {
            if (u2.z != null) {
                for (String string : this.z) {
                    this.b(this.v, string, h / 2, n4, 0xFFFFFF);
                    n4 += this.v.p;
                    if (arrstring2 == null) return;
                    if (arrstring2 != null) continue;
                }
            }
            u2 = this;
        }
        super.a(n2, n3, f10);
    }

    @Override
    public void r() {
        this.t.clear();
        this.z = this.v.c(this.y.a(), h - 50);
        this.B = this.z.size() * this.v.p;
        this.t.add(new s(0, h / 2 - 100, Math.min(w / 2 + this.B / 2 + this.v.p, w - 30), net.minecraft.client.D.h.a("gui.toMenu", new Object[0])));
        this.t.add(new s(1, h / 2 - 100, Math.min(w / 2 + this.B / 2 + this.v.p + 23, w - 30), net.minecraft.client.D.h.a("Reconnect", new Object[0])));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        var2_2 = q.b();
        if (var2_2 == null) ** GOTO lbl6
        switch (var1_1.g) {
            case 0: {
                this.m.a(this.C);
lbl6:
                // 2 sources

                if (var2_2 != null) return;
            }
            case 1: {
                this.m.a((net.minecraft.client.E.l)null);
                this.m.a(new e(new a1(), this.m, P.a));
                return;
            }
        }
    }
}

