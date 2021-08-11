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
import net.minecraft.client.H.g;
import net.minecraft.client.n.i;
import net.minecraft.k.n;

public class c
implements e {
    private static final /* synthetic */ k b;
    private /* synthetic */ int a;
    private final /* synthetic */ d e;
    private static final /* synthetic */ k g;
    private /* synthetic */ int f;
    private /* synthetic */ i d;
    private static final /* synthetic */ Set<K> c;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b() {
        block17: {
            block18: {
                block13: {
                    block16: {
                        block15: {
                            block14: {
                                block12: {
                                    ++this.a;
                                    var1_1 = net.minecraft.client.H.d.a();
                                    v0 = this;
                                    if (var1_1) {
                                        if (v0.e.g() != s.SURVIVAL) {
                                            this.e.a(net.minecraft.client.H.f.NONE);
                                            if (var1_1 != false) return;
                                        }
                                        v0 = this;
                                    }
                                    v1 = v0.a;
                                    v2 = 1;
                                    if (!var1_1) break block13;
                                    if (v1 != v2) break block14;
                                    v3 = this;
                                    if (!var1_1) break block15;
                                    var2_2 = v3.e.d().s;
                                    if (var2_2 == null) break block14;
                                    for (K var4_4 : net.minecraft.client.H.c.c) {
                                        if (var1_1 == false) return;
                                        v1 = var2_2.cB.h(new net.minecraft.w.d(var4_4)) ? 1 : 0;
                                        if (var1_1) {
                                            if (v1 != 0) {
                                                this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                                                return;
                                            }
                                            if (var1_1) continue;
                                        }
                                        break block12;
                                    }
                                    v1 = net.minecraft.client.H.g.a(var2_2) ? 1 : 0;
                                }
                                if (var1_1) {
                                    if (v1 != 0) {
                                        this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                                        return;
                                    } else {
                                        ** GOTO lbl33
                                    }
                                }
                                break block16;
                            }
                            v3 = this;
                        }
                        if (!var1_1) break block17;
                        v1 = v3.a;
                    }
                    v2 = 600;
                }
                if (v1 >= v2) break block18;
                v3 = this;
                if (!var1_1) break block17;
                if (v3.f <= 3) return;
            }
            v3 = this;
        }
        if (var1_1) {
            if (v3.d != null) return;
            this.d = new i(net.minecraft.client.n.d.TREE, net.minecraft.client.H.c.b, net.minecraft.client.H.c.g, true);
            v3 = this;
        }
        v3.e.d().ay().a(this.d);
    }

    static {
        c = Sets.newHashSet((Object[])new K[]{net.minecraft.u.g.bu, net.minecraft.u.g.aB});
        b = new h("tutorial.punch_tree.title", new Object[0]);
        g = new h("tutorial.punch_tree.description", net.minecraft.client.H.d.a("attack"));
    }

    @Override
    public void a() {
        block3: {
            i i2;
            block2: {
                boolean bl2 = net.minecraft.client.H.d.f();
                i2 = this.d;
                if (bl2) break block2;
                if (i2 == null) break block3;
                i2 = this.d;
            }
            i2.a();
            this.d = null;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(l l2, n n2, net.minecraft.Z.i i2, float f10) {
        block10: {
            int n3;
            block12: {
                i i3;
                boolean bl2;
                block11: {
                    block7: {
                        block9: {
                            i i4;
                            block8: {
                                int n4;
                                block6: {
                                    n3 = c.contains(i2.b());
                                    bl2 = net.minecraft.client.H.d.a();
                                    n4 = n3;
                                    if (!bl2) break block6;
                                    if (n4 == 0) break block7;
                                    float f11 = f10 - 0.0f;
                                    n4 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                }
                                if (n4 <= 0) break block7;
                                i4 = this.d;
                                if (!bl2) break block8;
                                if (i4 == null) break block9;
                                i4 = this.d;
                            }
                            i4.a(f10);
                        }
                        if (!(f10 >= 1.0f)) break block10;
                        this.e.a(net.minecraft.client.H.f.OPEN_INVENTORY);
                        if (bl2) break block10;
                    }
                    i3 = this.d;
                    if (!bl2) break block11;
                    if (i3 == null) break block12;
                    i3 = this.d;
                }
                i3.a(0.0f);
                if (bl2) break block10;
            }
            if (n3 != 0) {
                ++this.f;
            }
        }
    }

    @Override
    public void a(net.minecraft.w.d d10) {
        Iterator<K> iterator = c.iterator();
        boolean bl2 = net.minecraft.client.H.d.f();
        while (iterator.hasNext()) {
            block4: {
                block3: {
                    K k2 = iterator.next();
                    if (bl2) break block3;
                    if (d10.w() != net.minecraft.w.k.b(k2)) break block4;
                    this.e.a(net.minecraft.client.H.f.CRAFT_PLANKS);
                }
                return;
            }
            if (!bl2) continue;
        }
    }

    public c(d d10) {
        this.e = d10;
    }
}

