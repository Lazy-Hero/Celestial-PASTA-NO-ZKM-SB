/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.U.B;
import net.minecraft.ah.z;
import net.minecraft.ar.v;
import net.minecraft.client.x.P;
import net.minecraft.client.x.b;
import net.minecraft.w.d;

public class a1 {
    public static final /* synthetic */ a1 b;
    private final /* synthetic */ List<b> a;

    @Nullable
    public v a(d d10, @Nullable z z2, @Nullable B b10) {
        block4: {
            List<b> list;
            String[] arrstring;
            block3: {
                arrstring = P.o();
                list = this.a;
                if (arrstring != null) break block3;
                if (list.isEmpty()) break block4;
                list = this.a;
            }
            Iterator<b> iterator = list.iterator();
            while (iterator.hasNext()) {
                block6: {
                    b b11;
                    block5: {
                        b b12;
                        b11 = b12 = iterator.next();
                        if (arrstring != null) break block5;
                        if (!b11.a(d10, z2, b10)) break block6;
                        b11 = b12;
                    }
                    return b11.a();
                }
                if (arrstring == null) continue;
            }
        }
        return null;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    private a1() {
        this.a = Lists.newArrayList();
    }

    public a1(List<b> list) {
        this.a = Lists.newArrayList();
        String[] arrstring = P.o();
        for (int i2 = list.size() - 1; i2 >= 0; --i2) {
            this.a.add(list.get(i2));
            if (arrstring == null) continue;
        }
    }

    static {
        b = new a1();
    }
}

