/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.collect.AbstractIterator
 */
package net.minecraft.a;

import com.google.common.base.Predicate;
import com.google.common.collect.AbstractIterator;
import java.util.Iterator;
import net.minecraft.a.k;
import net.minecraft.a.l;
import net.minecraft.a.s;
import net.minecraft.o.a;

class j
extends AbstractIterator<a> {
    final /* synthetic */ Iterator b;
    final /* synthetic */ s a;

    j(s s2, Iterator iterator) {
        this.a = s2;
        this.b = iterator;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected a a() {
        var1_1 = k.t();
        do lbl-1000:
        // 3 sources

        {
            block9: {
                if (!this.b.hasNext()) {
                    v0 = (a)this.endOfData();
                    return v0;
                }
                var2_2 = (l)this.b.next();
                v0 = var3_3 = var2_2.c();
                if (var1_1 == false) return v0;
                if (!var1_1) break block9;
                if (v0 == null && var1_1) ** GOTO lbl-1000
                v0 = var3_3;
            }
            v1 = v0.u();
            if (var1_1) {
                if (!v1) {
                    v1 = var3_3.j();
                    if (var1_1) {
                        if (v1) {
                            return var3_3;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                } else lbl-1000:
                // 3 sources

                {
                    v1 = var3_3.o();
                }
            }
            if (var1_1) {
                if (!v1) {
                    return var3_3;
                }
                v1 = var2_2.a(128.0, (Predicate<net.minecraft.i.k>)s.e());
            }
            if (v1 != false) return var3_3;
        } while (var1_1);
        return var3_3;
    }
}

