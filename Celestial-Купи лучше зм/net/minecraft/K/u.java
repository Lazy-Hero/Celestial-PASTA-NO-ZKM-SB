/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package net.minecraft.k;

import com.google.common.collect.AbstractIterator;
import net.minecraft.k.a;
import net.minecraft.k.n;
import net.minecraft.k.o;

class u
extends AbstractIterator<o> {
    private /* synthetic */ o a;
    final /* synthetic */ a b;

    u(a a10) {
        this.b = a10;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected o a() {
        block16: {
            block17: {
                block18: {
                    block14: {
                        block15: {
                            block12: {
                                block13: {
                                    var1_1 = n.e();
                                    v0 = this.a;
                                    if (!var1_1) {
                                        if (v0 == null) {
                                            this.a = new o(this.b.a, this.b.f, this.b.c);
                                            return this.a;
                                        }
                                        v0 = this.a;
                                    }
                                    v1 = v0.r;
                                    v2 = this.b.b;
                                    if (var1_1) break block12;
                                    if (v1 != v2) break block13;
                                    v1 = this.a.q;
                                    v2 = this.b.d;
                                    if (var1_1) break block12;
                                    if (v1 == v2) {
                                        v1 = this.a.s;
                                        v2 = this.b.e;
                                        if (!var1_1) {
                                            if (v1 == v2) {
                                                return (o)this.endOfData();
                                            } else {
                                                ** GOTO lbl23
                                            }
                                        } else {
                                            ** GOTO lbl22
                                        }
                                    }
                                    break block13;
lbl22:
                                    // 2 sources

                                    break block12;
                                }
                                v1 = this.a.r;
                                v2 = this.b.b;
                            }
                            if (var1_1) break block14;
                            if (v1 >= v2) break block15;
                            ++this.a.r;
                            if (!var1_1) break block16;
                        }
                        v1 = this.a.q;
                        v2 = this.b.d;
                    }
                    if (var1_1) break block17;
                    if (v1 >= v2) break block18;
                    this.a.r = this.b.a;
                    ++this.a.q;
                    if (!var1_1) break block16;
                }
                v3 = this.a;
                if (var1_1 != false) return v3;
                v1 = v3.s;
                v2 = this.b.e;
            }
            if (v1 < v2) {
                this.a.r = this.b.a;
                this.a.q = this.b.f;
                ++this.a.s;
            }
        }
        v3 = this.a;
        return v3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

