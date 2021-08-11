/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import java.io.IOException;
import net.minecraft.client.D.h;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class aD
extends ao {
    private final /* synthetic */ String I;
    private final /* synthetic */ String G;
    private /* synthetic */ boolean J;
    private final /* synthetic */ String H;

    @Override
    protected void a(s s2) throws IOException {
        String[] arrstring = q.b();
        if (s2.g == 2) {
            this.a();
        }
        boolean bl2 = s2.g;
        if (arrstring != null) {
            bl2 = !bl2;
        }
        this.E.a(bl2, this.B);
    }

    public void b() {
        this.J = false;
    }

    public aD(ai ai2, String string, int n2, boolean bl2) {
        String[] arrstring = q.b();
        super(ai2, net.minecraft.client.D.h.a(bl2 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n2);
        this.J = true;
        aD aD2 = this;
        String string2 = net.minecraft.client.D.h.a(bl2 ? "chat.link.open" : "gui.yes", new Object[0]);
        if (arrstring != null) {
            aD2.y = string2;
            aD2 = this;
            string2 = bl2 ? "gui.cancel" : "gui.no";
        }
        aD2.F = net.minecraft.client.D.h.a(string2, new Object[0]);
        this.H = net.minecraft.client.D.h.a("chat.copy", new Object[0]);
        this.G = net.minecraft.client.D.h.a("chat.link.warning", new Object[0]);
        this.I = string;
    }

    private static Exception b(Exception exception) {
        return exception;
    }

    public void a() {
        aD.e(this.I);
    }

    @Override
    public void r() {
        super.r();
        this.t.clear();
        this.t.add(new s(0, h / 2 - 50 - 105, w / 6 + 96, 100, 20, this.y));
        this.t.add(new s(2, h / 2 - 50, w / 6 + 96, 100, 20, this.H));
        this.t.add(new s(1, h / 2 - 50 + 105, w / 6 + 96, 100, 20, this.F));
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block3: {
            aD aD2;
            block2: {
                String[] arrstring = q.b();
                super.a(n2, n3, f10);
                String[] arrstring2 = arrstring;
                aD2 = this;
                if (arrstring2 == null) break block2;
                if (!aD2.J) break block3;
                aD2 = this;
            }
            aD2.b(this.v, this.G, h / 2, 110, 0xFFCCCC);
        }
    }
}

