/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.as;

import java.util.List;
import net.minecraft.as.e;
import net.minecraft.as.g;
import net.minecraft.as.k;
import net.minecraft.k.m;

public class l
extends k {
    private /* synthetic */ int r;
    private final /* synthetic */ net.minecraft.at.k t;
    private /* synthetic */ List<String> s;
    private final /* synthetic */ String p;
    private final /* synthetic */ k q;

    @Override
    public void b(e e10) {
        block0: {
            if (e10.e() != 0) break block0;
            net.minecraft.as.g.a(this.q);
        }
    }

    public l(k k2, String string, net.minecraft.at.k k3) {
        this.q = k2;
        this.p = net.minecraft.as.l.c(string);
        this.t = k3;
    }

    @Override
    public void a(char c10, int n2) {
        block0: {
            if (n2 != 1) break block0;
            net.minecraft.as.g.a(this.q);
        }
    }

    @Override
    public void n() {
        net.minecraft.as.g.a(false);
        int n2 = net.minecraft.as.k.k();
        net.minecraft.as.g.j();
        int n3 = n2;
        this.c();
        this.s = this.a(this.t.a(), this.j() - 50);
        this.r = this.s.size() * this.e();
        this.c(net.minecraft.as.l.a(0, this.j() / 2 - 100, this.l() / 2 + this.r / 2 + this.e(), net.minecraft.as.l.c("gui.back")));
        if (n3 != 0) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1_1, int var2_2, float var3_3) {
        v0 = net.minecraft.as.k.m();
        this.f();
        this.a(this.p, this.j() / 2, this.l() / 2 - this.r / 2 - this.e() * 2, 0xAAAAAA);
        var4_4 = v0;
        var5_5 = this.l() / 2 - this.r / 2;
        v1 = this;
        if (var4_4 == 0) ** GOTO lbl16
        if (v1.s != null) {
            for (String var7_7 : this.s) {
                this.a(var7_7, this.j() / 2, var5_5, 0xFFFFFF);
                var5_5 += this.e();
                if (var4_4 != 0) {
                    if (var4_4 != 0) continue;
                }
                break;
            }
        } else {
            v1 = this;
lbl16:
            // 2 sources

            super.a(var1_1, var2_2, var3_3);
        }
        if (net.minecraft.k.m.d() != false) return;
        net.minecraft.as.k.b(++var4_4);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

