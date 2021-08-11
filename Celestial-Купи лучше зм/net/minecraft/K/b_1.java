/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net.minecraft.k;

import com.google.common.collect.AbstractIterator;
import net.minecraft.k.g;
import net.minecraft.k.n;

class b
extends AbstractIterator<n> {
    private /* synthetic */ int e;
    private /* synthetic */ int a;
    private /* synthetic */ boolean c;
    final /* synthetic */ g b;
    private /* synthetic */ int d;

    private static gP a(gP gP2) {
        return gP2;
    }

    b(g g10) {
        this.b = g10;
        this.c = true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected n a() {
        block17: {
            block16: {
                block14: {
                    block15: {
                        var1_1 = n.e();
                        v0 = this.c;
                        if (!var1_1) {
                            if (v0 != 0) {
                                this.c = false;
                                this.e = this.b.e;
                                this.d = this.b.a;
                                this.a = this.b.d;
                                return new n(this.b.e, this.b.a, this.b.d);
                            }
                            v0 = this.e;
                        }
                        v1 = this.b.b;
                        if (var1_1) break block14;
                        if (v0 != v1) break block15;
                        v0 = this.d;
                        v1 = this.b.f;
                        if (var1_1) break block14;
                        if (v0 == v1) {
                            v0 = this.a;
                            v1 = this.b.c;
                            if (!var1_1) {
                                if (v0 == v1) {
                                    return (n)this.endOfData();
                                } else {
                                    ** GOTO lbl25
                                }
                            } else {
                                ** GOTO lbl24
                            }
                        }
                        break block15;
lbl24:
                        // 2 sources

                        break block14;
                    }
                    v0 = this.e;
                    v1 = this.b.b;
                }
                if (!var1_1) {
                    if (v0 < v1) {
                        ++this.e;
                        if (var1_1 == false) return new n(this.e, this.d, this.a);
                    }
                    v0 = this.d;
                    v1 = this.b.f;
                }
                if (var1_1) break block16;
                if (v0 < v1) {
                    this.e = this.b.e;
                    ++this.d;
                    if (var1_1 == false) return new n(this.e, this.d, this.a);
                }
                v2 = this;
                if (var1_1) break block17;
                v0 = v2.a;
                v1 = this.b.c;
            }
            if (v0 >= v1) return new n(this.e, this.d, this.a);
            this.e = this.b.e;
            this.d = this.b.a;
            v2 = this;
        }
        ++v2.a;
        return new n(this.e, this.d, this.a);
    }
}

