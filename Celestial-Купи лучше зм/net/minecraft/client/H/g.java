/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.client.H;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import net.minecraft.W.K;
import net.minecraft.ah.s;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.E.l;
import net.minecraft.client.H.d;
import net.minecraft.client.H.e;
import net.minecraft.client.H.f;
import net.minecraft.client.q.c;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.m;

public class g
implements e {
    private static final /* synthetic */ Set<K> a;
    private static final /* synthetic */ k c;
    private /* synthetic */ net.minecraft.client.n.i f;
    private final /* synthetic */ d e;
    private static final /* synthetic */ k d;
    private /* synthetic */ int b;

    @Override
    public void a(net.minecraft.w.d d10) {
        Iterator<K> iterator = a.iterator();
        boolean bl2 = net.minecraft.client.H.d.a();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    K k2 = iterator.next();
                    if (!bl2) break block3;
                    if (d10.w() != net.minecraft.w.k.b(k2)) break block4;
                    this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                }
                return;
            }
            if (bl2) continue;
        }
    }

    public static boolean a(c c10) {
        Iterator<K> iterator = a.iterator();
        boolean bl2 = net.minecraft.client.H.d.f();
        while (iterator.hasNext()) {
            block3: {
                int n2;
                block4: {
                    K k2 = iterator.next();
                    net.minecraft.l.d d10 = net.minecraft.l.m.a(k2);
                    if (d10 == null) break block3;
                    n2 = c10.a().a(d10);
                    if (bl2) break block4;
                    if (n2 <= 0) break block3;
                    n2 = 1;
                }
                return n2 != 0;
            }
            if (!bl2) continue;
        }
        return false;
    }

    @Override
    public void a() {
        block3: {
            net.minecraft.client.n.i i2;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.a();
                i2 = this.f;
                if (!bl2) break block2;
                if (i2 == null) break block3;
                i2 = this.f;
            }
            i2.a();
            this.f = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block12: {
            block18: {
                block17: {
                    block13: {
                        block16: {
                            block15: {
                                block14: {
                                    block9: {
                                        block10: {
                                            block11: {
                                                ++this.b;
                                                var1_1 = net.minecraft.client.H.d.a();
                                                v0 = this;
                                                if (!var1_1) break block10;
                                                if (v0.e.g() == s.SURVIVAL) break block11;
                                                this.e.a(net.minecraft.client.H.f.NONE);
                                                if (var1_1) break block12;
                                            }
                                            v0 = this;
                                        }
                                        v1 = v0.b;
                                        v2 = 1;
                                        if (!var1_1) break block13;
                                        if (v1 != v2) break block14;
                                        v3 = this;
                                        if (!var1_1) break block15;
                                        var2_2 = v3.e.d().s;
                                        if (var2_2 == null) break block14;
                                        for (K var4_4 : g.a) {
                                            if (var1_1 == false) return;
                                            v1 = var2_2.cB.h(new net.minecraft.w.d(var4_4)) ? 1 : 0;
                                            if (var1_1) {
                                                if (v1 != 0) {
                                                    this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                                                    return;
                                                }
                                                if (var1_1) continue;
                                            }
                                            break block9;
                                        }
                                        v1 = g.a(var2_2) ? 1 : 0;
                                    }
                                    if (var1_1) {
                                        if (v1 != 0) {
                                            this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                                            return;
                                        } else {
                                            ** GOTO lbl35
                                        }
                                    }
                                    break block16;
                                }
                                v3 = this;
                            }
                            if (!var1_1) break block17;
                            v1 = v3.b;
                        }
                        v2 = 6000;
                    }
                    if (v1 < v2) break block12;
                    v3 = this;
                }
                if (!var1_1) break block18;
                if (v3.f != null) break block12;
                this.f = new net.minecraft.client.n.i(net.minecraft.client.n.d.TREE, g.d, g.c, false);
                v3 = this;
            }
            v3.e.d().ay().a(this.f);
        }
        if (m.c() == false) return;
        net.minecraft.client.H.d.b(var1_1 == false);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public g(d d10) {
        this.e = d10;
    }

    @Override
    public void a(l l2, i i2) {
        block2: {
            net.minecraft.Z.i i3;
            i i4;
            block1: {
                boolean bl2 = net.minecraft.client.H.d.a();
                i4 = i2;
                if (!bl2) break block1;
                if (i4.d != j.BLOCK) break block2;
                i4 = i2;
            }
            if (i4.a() != null && a.contains((i3 = l2.d(i2.a())).b())) {
                this.e.a(net.minecraft.client.H.f.PUNCH_TREE);
            }
        }
    }

    static {
        a = Sets.newHashSet((Object[])new K[]{net.minecraft.u.g.bu, net.minecraft.u.g.aB, net.minecraft.u.g.bU, net.minecraft.u.g.S});
        d = new h("tutorial.find_tree.title", new Object[0]);
        c = new h("tutorial.find_tree.description", new Object[0]);
    }
}

