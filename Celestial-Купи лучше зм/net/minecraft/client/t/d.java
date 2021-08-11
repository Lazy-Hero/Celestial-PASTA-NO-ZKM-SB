/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.text2speech.Narrator
 */
package net.minecraft.client.t;

import com.mojang.text2speech.Narrator;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.l.c;
import net.minecraft.client.n.e;
import net.minecraft.client.n.g;
import net.minecraft.client.t.a;
import net.minecraft.k.m;

public class d
implements a {
    private final /* synthetic */ Narrator a;
    private static /* synthetic */ int[] b;
    public static final /* synthetic */ d c;

    public boolean a() {
        return this.a.active();
    }

    public static int[] b() {
        return b;
    }

    public d() {
        this.a = Narrator.getNarrator();
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public void a(int n2) {
        block5: {
            e e10;
            block3: {
                int[] arrn;
                block4: {
                    int n3;
                    block2: {
                        int[] arrn2 = d.b();
                        this.a.clear();
                        arrn = arrn2;
                        this.a.say(new h("options.narrator", new Object[0]).f() + " : " + new h(net.minecraft.client.l.c.a_[n2], new Object[0]).f());
                        e10 = Q.P().ay();
                        n3 = this.a.active();
                        if (arrn == null) break block2;
                        if (n3 == 0) break block3;
                        n3 = n2;
                    }
                    if (n3 != 0) break block4;
                    net.minecraft.client.n.c.a(e10, g.NARRATOR_TOGGLE, new h("narrator.toast.disabled", new Object[0]), null);
                    if (arrn != null) break block5;
                    m.b(!m.c());
                }
                net.minecraft.client.n.c.a(e10, g.NARRATOR_TOGGLE, new h("narrator.toast.enabled", new Object[0]), new h(net.minecraft.client.l.c.a_[n2], new Object[0]));
                if (arrn != null) break block5;
            }
            net.minecraft.client.n.c.a(e10, g.NARRATOR_TOGGLE, new h("narrator.toast.disabled", new Object[0]), new h("options.narrator.notavailable", new Object[0]));
        }
    }

    static {
        c = new d();
        d.b(new int[4]);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void c() {
        this.a.clear();
    }

    @Override
    public void a(net.minecraft.at.a a10, k k2) {
        block10: {
            block3: {
                block9: {
                    int n2;
                    int[] arrn;
                    block8: {
                        block5: {
                            block6: {
                                int n3;
                                int n4;
                                block7: {
                                    int n5;
                                    block4: {
                                        block2: {
                                            n5 = Q.P().ac.w;
                                            arrn = d.b();
                                            n2 = n5;
                                            if (arrn == null) break block2;
                                            if (n2 == 0) break block3;
                                            n2 = this.a.active() ? 1 : 0;
                                        }
                                        if (arrn == null) break block4;
                                        if (n2 == 0) break block3;
                                        n2 = n5;
                                    }
                                    if (arrn == null) break block5;
                                    if (n2 == 1) break block6;
                                    n4 = n5;
                                    n3 = 2;
                                    if (arrn == null) break block7;
                                    if (n4 == n3 && a10 == net.minecraft.at.a.CHAT) break block6;
                                    n4 = n5;
                                    n3 = 3;
                                }
                                if (n4 != n3 || a10 != net.minecraft.at.a.SYSTEM) break block3;
                            }
                            n2 = k2 instanceof h;
                        }
                        if (arrn == null) break block8;
                        if (n2 == 0) break block9;
                        n2 = "chat.type.text".equals(((h)k2).c()) ? 1 : 0;
                    }
                    if (n2 == 0) break block9;
                    this.a.say(new h("chat.type.text.narrate", ((h)k2).f()).f());
                    if (arrn != null) break block3;
                }
                this.a.say(k2.f());
            }
            if (m.d()) break block10;
            d.b(new int[3]);
        }
    }
}

