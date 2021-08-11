/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package net.minecraft.client.i;

import com.google.common.base.MoreObjects;
import java.util.List;
import net.minecraft.client.g.b;
import net.minecraft.client.g.h;
import net.minecraft.client.i.c;

public class a {
    private final /* synthetic */ int a;
    private final /* synthetic */ List<b> c;
    private final /* synthetic */ h b;

    public a(h h2, List<b> list, int n2) {
        this.b = h2;
        this.c = list;
        this.a = n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public b a(int n2) {
        b b10;
        block5: {
            int n3;
            block4: {
                String string = net.minecraft.client.i.c.b();
                n3 = n2;
                if (string == null) break block4;
                if (n3 < 0) break block5;
                n3 = n2;
            }
            if (n3 < this.c.size()) {
                b10 = (b)MoreObjects.firstNonNull((Object)this.c.get(n2), (Object)net.minecraft.client.g.a.j);
                return b10;
            }
        }
        b10 = net.minecraft.client.g.a.j;
        return b10;
    }
}

