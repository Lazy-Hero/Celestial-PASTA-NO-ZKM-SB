/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  org.lwjgl.input.Keyboard
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.minecraft.W.e;
import net.minecraft.aA.l;
import net.minecraft.aA.p;
import net.minecraft.client.b.L;
import net.minecraft.client.b.Q;
import net.minecraft.client.b.aB;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.as;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.u.d;
import net.minecraft.u.g;
import net.minecraft.u.h;
import net.minecraft.w.k;
import org.lwjgl.input.Keyboard;

public class X
extends L {
    private /* synthetic */ String E;
    private /* synthetic */ aB C;
    private /* synthetic */ aq z;
    private final /* synthetic */ Q A;
    private /* synthetic */ String y;
    private /* synthetic */ String D;
    private /* synthetic */ s B;
    private static final /* synthetic */ List<as> F;

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
    }

    static List c() {
        return F;
    }

    static aq a(X x2) {
        return x2.z;
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            int n2;
            block1: {
                block2: {
                    String[] arrstring = q.b();
                    n2 = s2.g;
                    if (arrstring == null) break block1;
                    if (n2 != 0) break block2;
                    n2 = this.a() ? 1 : 0;
                    if (arrstring == null) break block1;
                    if (n2 == 0) break block2;
                    this.A.a(this.z.n());
                    this.m.a(this.A);
                    if (arrstring != null) break block3;
                }
                n2 = s2.g;
            }
            if (n2 == 1) {
                this.m.a(this.A);
            }
        }
    }

    private static void a(String string, k k2, int n2, net.minecraft.A.h h2, List<String> list, l ... arrl) {
        p p2 = new p();
        for (int i2 = arrl.length - 1; i2 >= 0; --i2) {
            p2.e().add(arrl[i2]);
        }
        p2.a(net.minecraft.A.h.b(h2));
        p2.b();
        for (String string2 : list) {
            p2.a().put(string2, Maps.newHashMap());
        }
        F.add(new as(k2, n2, string, p2.toString()));
    }

    @Override
    public void a(int n2, int n3, float f10) {
        this.n();
        this.C.b(n2, n3, f10);
        this.b(this.v, this.y, h / 2, 8, 0xFFFFFF);
        this.a(this.v, this.E, 50, 30, 0xA0A0A0);
        this.a(this.v, this.D, 50, 70, 0xA0A0A0);
        this.z.d();
        super.a(n2, n3, f10);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        this.z.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        String[] arrstring = q.b();
        int n2 = this.C.x;
        int n3 = -1;
        if (arrstring != null) {
            if (n2 > n3) {
                n2 = this.C.x;
                if (arrstring == null) return n2 != 0;
                if (n2 < F.size()) return 1 != 0;
            }
            n2 = this.z.n().length();
            if (arrstring == null) return n2 != 0;
            n3 = 1;
        }
        if (n2 <= n3) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void e() {
        this.z.i();
        super.e();
    }

    @Override
    public void r() {
        this.t.clear();
        Keyboard.enableRepeatEvents((boolean)true);
        this.y = net.minecraft.client.D.h.a("createWorld.customize.presets.title", new Object[0]);
        this.E = net.minecraft.client.D.h.a("createWorld.customize.presets.share", new Object[0]);
        this.D = net.minecraft.client.D.h.a("createWorld.customize.presets.list", new Object[0]);
        this.z = new aq(2, this.v, 50, 40, h - 100, 20);
        this.C = new aB(this);
        this.z.b(1230);
        this.z.a(this.A.c());
        this.B = this.b(new s(0, h / 2 - 155, w - 28, 150, 20, net.minecraft.client.D.h.a("createWorld.customize.presets.select", new Object[0])));
        this.t.add(new s(1, h / 2 + 5, w - 28, 150, 20, net.minecraft.client.D.h.a("gui.cancel", new Object[0])));
        this.b();
    }

    private static void a(String string, k k2, net.minecraft.A.h h2, List<String> list, l ... arrl) {
        X.a(string, k2, 0, h2, list, arrl);
    }

    public void b() {
        this.B.h = this.a();
    }

    static {
        F = Lists.newArrayList();
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.classic_flat", new Object[0]), net.minecraft.w.k.b(g.aU), net.minecraft.u.d.s, Arrays.asList("village"), new l(1, g.aU), new l(2, g.bv), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.tunnelers_dream", new Object[0]), net.minecraft.w.k.b(g.bx), net.minecraft.u.d.W, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new l(1, g.aU), new l(5, g.bv), new l(230, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.water_world", new Object[0]), net.minecraft.u.h.ah, net.minecraft.u.d.J, Arrays.asList("biome_1", "oceanmonument"), new l(90, g.bQ), new l(5, g.aO), new l(5, g.bv), new l(5, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.overworld", new Object[0]), net.minecraft.w.k.b(g.dc), net.minecraft.W.e.GRASS.a(), net.minecraft.u.d.s, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new l(1, g.aU), new l(3, g.bv), new l(59, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.snowy_kingdom", new Object[0]), net.minecraft.w.k.b(g.o), net.minecraft.u.d.S, Arrays.asList("village", "biome_1"), new l(1, g.o), new l(1, g.aU), new l(3, g.bv), new l(59, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.bottomless_pit", new Object[0]), net.minecraft.u.h.bi, net.minecraft.u.d.s, Arrays.asList("village", "biome_1"), new l(1, g.aU), new l(3, g.bv), new l(2, g.cW));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.desert", new Object[0]), net.minecraft.w.k.b(g.aO), net.minecraft.u.d.ab, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new l(8, g.aO), new l(52, g.bC), new l(3, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.redstone_ready", new Object[0]), net.minecraft.u.h.a7, net.minecraft.u.d.ab, Collections.emptyList(), new l(52, g.bC), new l(3, g.bx), new l(1, g.g));
        X.a(net.minecraft.client.D.h.a("createWorld.customize.preset.the_void", new Object[0]), net.minecraft.w.k.b(g.ah), net.minecraft.u.d.o, Arrays.asList("decoration"), new l(1, g.bf));
    }

    @Override
    public void k() throws IOException {
        super.k();
        this.C.f();
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            X x2;
            block2: {
                String[] arrstring = q.b();
                x2 = this;
                if (arrstring == null) break block2;
                if (x2.z.a(c10, n2)) break block3;
                x2 = this;
            }
            super.a(c10, n2);
        }
    }

    static aB b(X x2) {
        return x2.C;
    }

    public X(Q q2) {
        this.A = q2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

