/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.aG;
import net.minecraft.aN;

public class aD {
    private final /* synthetic */ int h;
    private /* synthetic */ int j;
    private final /* synthetic */ aD c;
    private /* synthetic */ aD l;
    private /* synthetic */ float k;
    private /* synthetic */ float i;
    private /* synthetic */ float f;
    private final /* synthetic */ List<aD> e;
    private final /* synthetic */ aN a;
    private /* synthetic */ float b;
    private /* synthetic */ aD d;
    private final /* synthetic */ aD g;

    public static void a(aN aN2) {
        boolean bl2 = aG.a();
        if (aN2.d() == null) {
            throw new IllegalArgumentException("Can't position children of an invisible root!");
        }
        aD aD2 = new aD(aN2, null, null, 1, 0);
        aD2.e();
        float f10 = aD2.a(0.0f, 0, aD2.b);
        if (!bl2) {
            if (f10 < 0.0f) {
                aD2.a(-f10);
            }
            aD2.d();
        }
    }

    private void e() {
        block12: {
            float f10;
            block13: {
                aD aD2;
                block14: {
                    aD aD3;
                    boolean bl2;
                    block7: {
                        block9: {
                            block10: {
                                aD aD4;
                                block11: {
                                    block8: {
                                        bl2 = aG.b();
                                        aD4 = this;
                                        if (!bl2) break block8;
                                        if (!aD4.e.isEmpty()) break block9;
                                        aD4 = this.c;
                                    }
                                    if (!bl2) break block10;
                                    if (aD4 == null) break block11;
                                    this.b = this.c.b + 1.0f;
                                    if (bl2) break block12;
                                }
                                aD4 = this;
                            }
                            aD4.b = 0.0f;
                            if (bl2) break block12;
                        }
                        aD aD5 = null;
                        for (aD aD6 : this.e) {
                            aD6.e();
                            aD3 = aD6;
                            if (bl2) {
                                aD aD7 = aD5;
                                if (bl2) {
                                    aD7 = aD7 == null ? aD6 : aD5;
                                }
                                aD5 = aD3.a(aD7);
                                if (bl2) continue;
                            }
                            break block7;
                        }
                        this.b();
                        aD3 = this.e.get(0);
                    }
                    f10 = (aD3.b + this.e.get((int)(this.e.size() - 1)).b) / 2.0f;
                    aD2 = this.c;
                    if (!bl2) break block13;
                    if (aD2 == null) break block14;
                    this.b = this.c.b + 1.0f;
                    this.f = this.b - f10;
                    if (bl2) break block12;
                }
                aD2 = this;
            }
            aD2.b = f10;
        }
    }

    private void a(float f10) {
        this.b += f10;
        boolean bl2 = aG.a();
        for (aD aD2 : this.e) {
            aD2.a(f10);
            if (!bl2) continue;
        }
    }

    private void d() {
        block7: {
            List<aD> list;
            boolean bl2;
            block6: {
                bl2 = aG.b();
                aD aD2 = this;
                if (bl2) {
                    if (aD2.a.d() != null) {
                        this.a.d().a(this.j, this.b);
                    }
                    aD2 = this;
                }
                list = aD2.e;
                if (!bl2) break block6;
                if (list.isEmpty()) break block7;
                list = this.e;
            }
            for (aD aD3 : list) {
                aD3.d();
                if (bl2) continue;
            }
        }
    }

    private float a(float f10, int n2, float f11) {
        float f12;
        block4: {
            this.b += f10;
            this.j = n2;
            boolean bl2 = aG.a();
            aD aD2 = this;
            if (!bl2) {
                if (aD2.b < f11) {
                    f11 = this.b;
                }
                aD2 = this;
            }
            for (aD aD3 : aD2.e) {
                f12 = aD3.a(f10 + this.f, n2 + 1, f11);
                if (!bl2) {
                    f11 = f12;
                    if (!bl2) continue;
                }
                break block4;
            }
            f12 = f11;
        }
        return f12;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     */
    private aD a(aD aD2, aD aD3) {
        aD aD4;
        block5: {
            boolean bl2;
            block4: {
                bl2 = aG.b();
                aD4 = this.l;
                if (!bl2) break block4;
                if (aD4 == null) break block5;
                aD4 = aD2.g;
            }
            if (!bl2) return aD4;
            if (aD4.e.contains(this.l)) {
                aD4 = this.l;
                return aD4;
            }
        }
        aD4 = aD3;
        return aD4;
    }

    private void a(aD aD2, float f10) {
        float f11 = aD2.h - this.h;
        boolean bl2 = aG.b();
        if (bl2) {
            if (f11 != 0.0f) {
                aD2.i -= f10 / f11;
                this.i += f10 / f11;
            }
            aD2.k += f10;
            aD2.b += f10;
            aD2.f += f10;
        }
    }

    private void b() {
        float f10 = 0.0f;
        boolean bl2 = aG.b();
        float f11 = 0.0f;
        for (int i2 = this.e.size() - 1; i2 >= 0; --i2) {
            aD aD2 = this.e.get(i2);
            aD2.b += f10;
            aD2.f += f10;
            f10 += aD2.k + (f11 += aD2.i);
            if (bl2) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private aD c() {
        boolean bl2 = aG.a();
        aD aD2 = this.d;
        if (!bl2) {
            if (aD2 != null) {
                return this.d;
            }
            aD2 = this;
        }
        Object object = aD2.e;
        if (!bl2) {
            if (object.isEmpty()) return null;
            object = this.e.get(0);
        }
        aD aD3 = (aD)object;
        return aD3;
    }

    public aD(aN aN2, @Nullable aD aD2, @Nullable aD aD3, int n2, int n3) {
        this.e = Lists.newArrayList();
        boolean bl2 = aG.b();
        if (bl2) {
            if (aN2.d() == null) {
                throw new IllegalArgumentException("Can't position an invisible advancement!");
            }
            this.a = aN2;
            this.g = aD2;
            this.c = aD3;
            this.h = n2;
            this.l = this;
            this.j = n3;
            this.b = -1.0f;
        }
        aD aD4 = null;
        for (aN aN3 : aN2.j()) {
            aD4 = this.a(aN3, aD4);
            if (bl2) continue;
        }
    }

    private aD a(aD aD2) {
        block14: {
            aD aD3;
            block15: {
                block16: {
                    float f10;
                    float f11;
                    aD aD4;
                    aD aD5;
                    boolean bl2;
                    block12: {
                        block13: {
                            float f12;
                            float f13;
                            aD aD6;
                            aD aD7;
                            block11: {
                                bl2 = aG.a();
                                aD aD8 = this.c;
                                if (!bl2) {
                                    if (aD8 == null) {
                                        return aD2;
                                    }
                                    aD8 = this;
                                }
                                aD5 = aD8;
                                aD7 = this;
                                aD6 = this.c;
                                aD4 = this.g.e.get(0);
                                f11 = this.f;
                                f13 = this.f;
                                f12 = aD6.f;
                                f10 = aD4.f;
                                while (aD6.a() != null) {
                                    aD3 = aD5.c();
                                    if (!bl2 && !bl2) {
                                        float f14;
                                        if (aD3 == null) break;
                                        aD6 = aD6.a();
                                        aD5 = aD5.c();
                                        aD4 = aD4.c();
                                        aD7 = aD7.a();
                                        aD7.l = this;
                                        float f15 = f14 = aD6.b + f12 - (aD5.b + f11) + 1.0f;
                                        float f16 = 0.0f;
                                        if (!bl2) {
                                            if (f15 > f16) {
                                                aD6.a(this, aD2).a(this, f14);
                                                f11 += f14;
                                                f13 += f14;
                                            }
                                            f12 += aD6.f;
                                            f11 += aD5.f;
                                            f10 += aD4.f;
                                            f15 = f13;
                                            f16 = aD7.f;
                                        }
                                        f13 = f15 + f16;
                                        if (!bl2) continue;
                                    }
                                    break block11;
                                }
                                aD3 = aD6.a();
                            }
                            if (bl2) break block12;
                            if (aD3 == null) break block13;
                            aD3 = aD7.a();
                            if (bl2) break block12;
                            if (aD3 != null) break block13;
                            aD7.d = aD6.a();
                            aD7.f += f12 - f13;
                            if (!bl2) break block14;
                        }
                        aD3 = aD5.c();
                    }
                    if (bl2) break block15;
                    if (aD3 == null) break block16;
                    aD3 = aD4.c();
                    if (bl2) break block15;
                    if (aD3 == null) {
                        aD4.d = aD5.c();
                        aD4.f += f11 - f10;
                    }
                }
                aD3 = this;
            }
            aD2 = aD3;
        }
        return aD2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private aD a() {
        boolean bl2 = aG.b();
        aD aD2 = this.d;
        if (bl2) {
            if (aD2 != null) {
                return this.d;
            }
            aD2 = this;
        }
        Object object = aD2.e;
        if (bl2) {
            if (object.isEmpty()) return null;
            object = this.e.get(this.e.size() - 1);
        }
        aD aD3 = (aD)object;
        return aD3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private aD a(aN aN2, @Nullable aD aD2) {
        aD aD3;
        block5: {
            aN aN3;
            boolean bl2;
            block3: {
                block4: {
                    bl2 = aG.a();
                    aN3 = aN2;
                    if (bl2) break block3;
                    if (aN3.d() == null) break block4;
                    aD2 = new aD(aN2, this, aD2, this.e.size() + 1, this.j + 1);
                    this.e.add(aD2);
                    if (!bl2) break block5;
                }
                aN3 = aN2;
            }
            for (aN aN4 : aN3.j()) {
                aD3 = this.a(aN4, aD2);
                if (bl2) return aD3;
                aD2 = aD3;
                if (!bl2) continue;
            }
        }
        aD3 = aD2;
        return aD3;
    }
}

