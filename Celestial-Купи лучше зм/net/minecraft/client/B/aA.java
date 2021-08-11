/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import java.io.IOException;
import java.net.URI;
import net.minecraft.ar.v;
import net.minecraft.client.D.h;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.c;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aA
extends L {
    private static final /* synthetic */ v y;
    private static final /* synthetic */ Logger z;

    @Override
    public void r() {
        this.t.clear();
        int n2 = -16;
        this.t.add(new s(1, h / 2 - 116, w / 2 + 62 + -16, 114, 20, net.minecraft.client.D.h.a("demo.help.buy", new Object[0])));
        this.t.add(new s(2, h / 2 + 2, w / 2 + 62 + -16, 114, 20, net.minecraft.client.D.h.a("demo.help.later", new Object[0])));
    }

    private static Throwable b(Throwable throwable) {
        return throwable;
    }

    @Override
    public void n() {
        super.n();
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(y);
        int n2 = (h - 248) / 2;
        int n3 = (w - 166) / 2;
        this.a(n2, n3, 0, 0, 248, 166);
    }

    static {
        z = LogManager.getLogger();
        y = new v("textures/gui/demo_background.png");
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        int n4 = (h - 248) / 2 + 10;
        int n5 = (w - 166) / 2 + 8;
        this.v.b(net.minecraft.client.D.h.a("demo.help.title", new Object[0]), n4, n5, 0x1F1F1F);
        c c10 = this.m.ac;
        this.v.b(net.minecraft.client.D.h.a("demo.help.movementShort", net.minecraft.client.l.c.a(c10.aW.e()), net.minecraft.client.l.c.a(c10.C.e()), net.minecraft.client.l.c.a(c10.O.e()), net.minecraft.client.l.c.a(c10.G.e())), n4, n5 += 12, 0x4F4F4F);
        this.v.b(net.minecraft.client.D.h.a("demo.help.movementMouse", new Object[0]), n4, n5 + 12, 0x4F4F4F);
        this.v.b(net.minecraft.client.D.h.a("demo.help.jump", net.minecraft.client.l.c.a(c10.v.e())), n4, n5 + 24, 0x4F4F4F);
        this.v.b(net.minecraft.client.D.h.a("demo.help.inventory", net.minecraft.client.l.c.a(c10.bW.e())), n4, n5 + 36, 0x4F4F4F);
        this.v.a(net.minecraft.client.D.h.a("demo.help.fullWrapped", new Object[0]), n4, n5 + 68, 218, 0x1F1F1F);
        super.a(n2, n3, f10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    protected void a(s var1_1) throws IOException {
        var2_2 = q.b();
        v0 = var1_1;
        if (var2_2 == null) ** GOTO lbl7
        switch (v0.g) {
            case 1: {
                v0 = var1_1;
lbl7:
                // 2 sources

                v0.h = false;
                try {
                    var3_3 = Class.forName("java.awt.Desktop");
                    var4_5 = var3_3.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
                    var3_3.getMethod("browse", new Class[]{URI.class}).invoke(var4_5, new Object[]{new URI("http://www.minecraft.net/store?source=demo")});
                    return;
                }
                catch (Throwable var3_4) {
                    aA.z.error("Couldn't open link", var3_4);
                    if (var2_2 != null) return;
                }
            }
            case 2: {
                this.m.a((L)null);
                this.m.i();
                return;
            }
        }
    }
}

