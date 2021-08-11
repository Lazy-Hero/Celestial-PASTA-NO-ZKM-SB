/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 */
package net.minecraft.client.B;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Iterator;
import net.minecraft.client.B.d;

class b<T>
extends AbstractIterator<T> {
    private final /* synthetic */ Object2IntMap<T> c;
    private /* synthetic */ T b;
    private /* synthetic */ T d;
    private final /* synthetic */ Iterator<T> a;
    private final /* synthetic */ Iterator<T> e;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected T computeNext() {
        block15: {
            block18: {
                block19: {
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    var1_1 = net.minecraft.client.B.d.b();
                                    v0 = this.d;
                                    if (var1_1 != 0) {
                                        if (v0 == null) {
                                            v0 = this.b;
                                            if (var1_1 != 0) {
                                                if (v0 == null) {
                                                    return (T)this.endOfData();
                                                } else {
                                                    ** GOTO lbl-1000
                                                }
                                            }
                                        } else lbl-1000:
                                        // 3 sources

                                        {
                                            v0 = this.d;
                                        }
                                    }
                                    if (var1_1 == 0) break block13;
                                    if (v0 != this.b) break block14;
                                    var2_2 = 0;
                                    if (var1_1 != 0) break block15;
                                }
                                v0 = this.d;
                            }
                            if (var1_1 == 0) break block16;
                            if (v0 != null) break block17;
                            var2_2 = 1;
                            if (var1_1 != 0) break block15;
                        }
                        v1 = this;
                        if (var1_1 == 0) break block18;
                        v0 = v1.b;
                    }
                    if (v0 != null) break block19;
                    var2_2 = -1;
                    if (var1_1 != 0) break block15;
                }
                v1 = this;
            }
            var2_2 = Integer.compare(v1.c.getInt(this.d), this.c.getInt(this.b));
        }
        var3_3 = var2_2 <= 0 ? this.d : this.b;
        v2 = var2_2;
        if (var1_1 != 0) {
            if (v2 <= 0) {
                v3 /* !! */  = this.e;
                if (var1_1 != 0) {
                    v3 /* !! */  = v3 /* !! */ .hasNext() != false ? this.e.next() : null;
                }
                this.d = v3 /* !! */ ;
            }
            v2 = var2_2;
        }
        if (v2 < 0) return var3_3;
        v4 /* !! */  = this.a;
        if (var1_1 != 0) {
            v4 /* !! */  = v4 /* !! */ .hasNext() != false ? this.a.next() : null;
        }
        this.b = v4 /* !! */ ;
        return var3_3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public b(Iterator<T> iterator, Iterator<T> iterator2, Object2IntMap<T> object2IntMap) {
        int n2 = net.minecraft.client.B.d.c();
        this.e = iterator;
        int n3 = n2;
        this.a = iterator2;
        this.c = object2IntMap;
        Iterator<Object> iterator3 = iterator;
        if (n3 == 0) {
            iterator3 = iterator3.hasNext() ? iterator.next() : null;
        }
        this.d = iterator3;
        Iterator<Object> iterator4 = iterator2;
        if (n3 == 0) {
            iterator4 = iterator4.hasNext() ? iterator2.next() : null;
        }
        this.b = iterator4;
    }
}

