/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.M;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.M.a0;
import net.minecraft.M.aA;
import net.minecraft.M.a_;
import net.minecraft.M.t;
import net.minecraft.i.h;
import net.minecraft.w.d;

public class F
extends t {
    private final /* synthetic */ aA d;
    private final /* synthetic */ aA a;
    private final /* synthetic */ aA e;
    private final /* synthetic */ a0[] f;

    public F(aA aA2, aA aA3, aA aA4, a0[] arra0) {
        super(a_.b());
        this.d = aA2;
        this.e = aA3;
        this.a = aA4;
        this.f = arra0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(h h2) {
        boolean bl2;
        int n2;
        ArrayList arrayList;
        int n3;
        int n4;
        block14: {
            int n5 = 0;
            n4 = 0;
            n3 = 0;
            arrayList = Lists.newArrayList((Object[])this.f);
            n2 = t.b();
            int n6 = 0;
            block0: while (true) {
                int n7 = n6;
                block1: while (n7 < h2.e()) {
                    block17: {
                        int n8;
                        d d10;
                        block15: {
                            block16: {
                                d10 = h2.a(n6);
                                bl2 = d10.G();
                                if (n2 != 0) break block14;
                                if (n2 != 0) break block15;
                                if (!bl2) break block16;
                                ++n4;
                                if (n2 == 0) break block17;
                            }
                            ++n3;
                            n8 = d10.t();
                        }
                        if (n8 >= d10.f()) {
                            ++n5;
                        }
                        Iterator iterator = arrayList.iterator();
                        while (iterator.hasNext()) {
                            a0 a02 = (a0)iterator.next();
                            n7 = a02.a(d10) ? 1 : 0;
                            if (n2 != 0) continue block1;
                            if (n7 != 0) {
                                iterator.remove();
                            }
                            if (n2 == 0) continue;
                        }
                    }
                    ++n6;
                    if (n2 == 0) continue block0;
                }
                break;
            }
            bl2 = this.e.a(n5);
        }
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.a.a(n4);
        }
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = this.d.a(n3);
        }
        if (n2 == 0) {
            if (!bl2) {
                return false;
            }
            bl2 = arrayList.isEmpty();
        }
        return bl2;
    }
}

