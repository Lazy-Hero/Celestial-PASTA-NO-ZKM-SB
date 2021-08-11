/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.D;

import java.util.List;
import net.minecraft.ar.v;
import net.minecraft.at.k;
import net.minecraft.client.D.e;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.aH;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.ao;
import net.minecraft.client.b.q;
import net.minecraft.k.m;

public abstract class E
implements aJ {
    private static final /* synthetic */ k b;
    private static final /* synthetic */ k f;
    protected final /* synthetic */ Q a;
    private static final /* synthetic */ k d;
    protected final /* synthetic */ aH e;
    private static final /* synthetic */ v c;

    private static gP a(gP gP2) {
        return gP2;
    }

    protected boolean d() {
        return this.e.b(this);
    }

    protected boolean f() {
        boolean bl2 = h.c();
        boolean bl3 = this.e.b(this);
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    protected abstract String a();

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    protected boolean h() {
        return true;
    }

    public E(aH aH2) {
        this.e = aH2;
        this.a = Q.P();
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, float f10) {
        int n9;
        String string;
        String string2;
        boolean bl3;
        block38: {
            int n10;
            int n11;
            block18: {
                block19: {
                    int n12;
                    block39: {
                        block40: {
                            int n13;
                            block34: {
                                block35: {
                                    int n14;
                                    block36: {
                                        block37: {
                                            block30: {
                                                block31: {
                                                    int n15;
                                                    block32: {
                                                        block33: {
                                                            block26: {
                                                                block27: {
                                                                    int n16;
                                                                    block28: {
                                                                        block29: {
                                                                            block25: {
                                                                                block24: {
                                                                                    int n17;
                                                                                    block22: {
                                                                                        int n18;
                                                                                        block23: {
                                                                                            int n19;
                                                                                            block20: {
                                                                                                block21: {
                                                                                                    n18 = this.c();
                                                                                                    bl3 = h.c();
                                                                                                    int n20 = n18;
                                                                                                    if (bl3) {
                                                                                                        if (n20 != 3) {
                                                                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                            q.a(n3 - 1, n4 - 1, n3 + n5 - 9, n4 + n6 + 1, -8978432);
                                                                                                        }
                                                                                                        this.g();
                                                                                                        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                        n20 = n3;
                                                                                                    }
                                                                                                    q.a(n20, n4, 0.0f, 0.0f, 32.0f, 32.0f, 32.0f, 32.0f);
                                                                                                    string2 = this.a();
                                                                                                    string = this.e();
                                                                                                    n11 = this.h();
                                                                                                    if (!bl3) break block18;
                                                                                                    if (n11 == 0) break block19;
                                                                                                    n19 = this.a.ac.aZ;
                                                                                                    if (!bl3) break block20;
                                                                                                    if (n19 != 0) break block21;
                                                                                                    n11 = bl2 ? 1 : 0;
                                                                                                    if (!bl3) break block18;
                                                                                                    if (n11 == 0) break block19;
                                                                                                }
                                                                                                this.a.aN().b(c);
                                                                                                q.a(n3, n4, n3 + 32, n4 + 32, -1601138544);
                                                                                                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                                                n19 = n7 - n3;
                                                                                            }
                                                                                            n10 = n19;
                                                                                            n13 = n8 - n4;
                                                                                            n9 = n18;
                                                                                            n17 = 3;
                                                                                            if (!bl3) break block22;
                                                                                            if (n9 >= n17) break block23;
                                                                                            string2 = b.a();
                                                                                            string = f.a();
                                                                                            if (bl3) break block24;
                                                                                            m.b(!m.d());
                                                                                        }
                                                                                        n9 = n18;
                                                                                        if (!bl3) break block25;
                                                                                        n17 = 3;
                                                                                    }
                                                                                    if (n9 > n17) {
                                                                                        string2 = b.a();
                                                                                        string = d.a();
                                                                                    }
                                                                                }
                                                                                n9 = this.f() ? 1 : 0;
                                                                            }
                                                                            if (!bl3) break block26;
                                                                            if (n9 == 0) break block27;
                                                                            n16 = n10;
                                                                            if (!bl3) break block28;
                                                                            if (n16 >= 32) break block29;
                                                                            q.a(n3, n4, 0.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                                                            if (bl3) break block19;
                                                                        }
                                                                        n16 = n3;
                                                                    }
                                                                    q.a(n16, n4, 0.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                                                    if (bl3) break block19;
                                                                }
                                                                n9 = this.d() ? 1 : 0;
                                                            }
                                                            if (!bl3) break block30;
                                                            if (n9 == 0) break block31;
                                                            n15 = n10;
                                                            if (!bl3) break block32;
                                                            if (n15 >= 16) break block33;
                                                            q.a(n3, n4, 32.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                                            if (bl3) break block31;
                                                        }
                                                        n15 = n3;
                                                    }
                                                    q.a(n15, n4, 32.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                                }
                                                n9 = this.i() ? 1 : 0;
                                            }
                                            if (!bl3) break block34;
                                            if (n9 == 0) break block35;
                                            n14 = n10;
                                            if (!bl3) break block36;
                                            if (n14 >= 32) break block37;
                                            n14 = n10;
                                            if (!bl3) break block36;
                                            if (n14 <= 16) break block37;
                                            n14 = n13;
                                            if (!bl3) break block36;
                                            if (n14 >= 16) break block37;
                                            q.a(n3, n4, 96.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                            if (bl3) break block35;
                                        }
                                        n14 = n3;
                                    }
                                    q.a(n14, n4, 96.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                                }
                                n9 = this.j() ? 1 : 0;
                            }
                            if (!bl3) break block38;
                            if (n9 == 0) break block19;
                            n12 = n10;
                            if (!bl3) break block39;
                            if (n12 >= 32) break block40;
                            n12 = n10;
                            if (!bl3) break block39;
                            if (n12 <= 16) break block40;
                            n12 = n13;
                            if (!bl3) break block39;
                            if (n12 <= 16) break block40;
                            q.a(n3, n4, 64.0f, 32.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                            if (bl3) break block19;
                        }
                        n12 = n3;
                    }
                    q.a(n12, n4, 64.0f, 0.0f, 32.0f, 32.0f, 256.0f, 256.0f);
                }
                n11 = this.a.a6.e(string2);
            }
            n9 = n10 = n11;
        }
        if (bl3) {
            if (n9 > 157) {
                string2 = this.a.a6.e(string2, 157 - this.a.a6.e("...")) + "...";
            }
            n9 = this.a.a6.c(string2, n3 + 32 + 2, n4 + 1, 0xFFFFFF);
        }
        List<String> list = this.a.a6.c(string, 157);
        for (int i2 = 0; i2 < 2; ++i2) {
            int n21 = i2;
            if (!bl3) continue;
            if (n21 >= list.size()) break;
            n21 = this.a.a6.c(list.get(i2), n3 + 32 + 2, n4 + 12 + 10 * i2, 0x808080);
            if (bl3) continue;
        }
    }

    protected abstract String e();

    public boolean b() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean j() {
        int n2;
        List<E> list = this.e.a(this);
        boolean bl2 = h.b();
        int n3 = n2 = list.indexOf(this);
        if (!bl2) {
            if (n3 < 0) return 0 != 0;
            n3 = n2;
        }
        if (!bl2) {
            if (n3 >= list.size() - 1) return 0 != 0;
            n3 = list.get(n2 + 1).h() ? 1 : 0;
        }
        if (bl2) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    protected abstract void g();

    protected abstract int c();

    static {
        c = new v("textures/gui/resource_packs.png");
        b = new net.minecraft.at.h("resourcePack.incompatible", new Object[0]);
        f = new net.minecraft.at.h("resourcePack.incompatible.old", new Object[0]);
        d = new net.minecraft.at.h("resourcePack.incompatible.new", new Object[0]);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean b(int var1_1, int var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        block24: {
            block25: {
                block31: {
                    block26: {
                        block27: {
                            block30: {
                                block29: {
                                    block28: {
                                        var7_7 = h.c();
                                        v0 = this.h();
                                        if (!var7_7) break block24;
                                        if (v0 == 0) break block25;
                                        v0 = var5_5;
                                        if (!var7_7) break block24;
                                        if (v0 > 32) break block25;
                                        v0 = this.f() ? 1 : 0;
                                        if (!var7_7) break block26;
                                        if (v0 == 0) break block27;
                                        this.e.a();
                                        v1 = this.e.b().get(0).b();
                                        if (var7_7) {
                                            v1 = v1 != 0 ? 1 : 0;
                                        }
                                        var8_8 = v1;
                                        v2 = var9_11 = this.c();
                                        if (!var7_7) break block28;
                                        if (v2 != 3) break block29;
                                        v2 = this.e.a(this).remove(this) ? 1 : 0;
                                    }
                                    this.e.b().add(var8_8, this);
                                    if (var7_7) break block30;
                                }
                                var10_14 = h.a("resourcePack.incompatible.confirm.title", new Object[0]);
                                v3 = new StringBuilder();
                                v4 = "resourcePack.incompatible.confirm.";
                                if (var7_7) {
                                    v3 = v3.append(v4);
                                    v4 = var9_11 > 3 ? "new" : "old";
                                }
                                var11_15 = h.a(v3.append(v4).toString(), new Object[0]);
                                this.a.a(new ao(new e(this, var8_8), var10_14, var11_15, 0));
                            }
                            return true;
                        }
                        v0 = var5_5;
                    }
                    v5 = 16;
                    if (var7_7) {
                        if (v0 < v5) {
                            v0 = this.d() ? 1 : 0;
                            if (var7_7) {
                                if (v0 != 0) {
                                    this.e.a(this).remove(this);
                                    this.e.c().add(0, this);
                                    this.e.a();
                                    return true;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v0 = var5_5;
                        }
                        v5 = 16;
                    }
                    if (!var7_7) break block31;
                    if (v0 <= v5) ** GOTO lbl-1000
                    v0 = var6_6;
                    v5 = 16;
                    if (var7_7) {
                        ** if (v0 >= v5) goto lbl-1000
lbl-1000:
                        // 1 sources

                        {
                            v0 = (int)(this.i() ? 1 : 0);
                            if (var7_7) {
                                if (v0 != 0) {
                                    var8_9 = this.e.a((E)this);
                                    var9_12 = var8_9.indexOf((Object)this);
                                    var8_9.remove((Object)this);
                                    var8_9.add((int)(var9_12 - 1), (E)this);
                                    this.e.a();
                                    return true;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            } else {
                                ** GOTO lbl67
                            }
lbl67:
                            // 2 sources

                            ** GOTO lbl70
                        }
                    }
                    break block31;
lbl-1000:
                    // 4 sources

                    {
                        v0 = var5_5;
                    }
lbl70:
                    // 2 sources

                    if (!var7_7) break block24;
                    v5 = 16;
                }
                if (v0 <= v5) break block25;
                v0 = var6_6;
                if (var7_7) {
                    if (v0 > 16) {
                        v0 = this.j() ? 1 : 0;
                        if (var7_7) {
                            if (v0 != 0) {
                                var8_10 = this.e.a(this);
                                var9_13 = var8_10.indexOf(this);
                                var8_10.remove(this);
                                var8_10.add(var9_13 + 1, this);
                                this.e.a();
                                return true;
                            } else {
                                ** GOTO lbl90
                            }
                        } else {
                            ** GOTO lbl89
                        }
                    } else {
                        ** GOTO lbl88
                    }
                }
                break block24;
lbl88:
                // 2 sources

                break block25;
lbl89:
                // 2 sources

                break block24;
            }
            v0 = 0;
        }
        return (boolean)v0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean i() {
        List<E> list = this.e.a(this);
        int n2 = list.indexOf(this);
        boolean bl2 = h.b();
        int n3 = n2;
        if (!bl2) {
            if (n3 <= 0) return 0 != 0;
            n3 = list.get(n2 - 1).h() ? 1 : 0;
        }
        if (bl2) return n3 != 0;
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void a(int n2, int n3, int n4, float f10) {
    }
}

