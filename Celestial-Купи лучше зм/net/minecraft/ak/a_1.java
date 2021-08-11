/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ak;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.U.C;
import net.minecraft.U.x;
import net.minecraft.ak.h;

public class a {
    /* synthetic */ List<x> b;
    /* synthetic */ List<x> c;
    /* synthetic */ C a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean a(x x2) {
        boolean bl2;
        block7: {
            boolean bl3;
            block8: {
                String string = h.h();
                boolean bl4 = this.c.contains(x2);
                if (string == null) {
                    if (bl4) {
                        return true;
                    }
                    bl4 = this.b.contains(x2);
                }
                if (string == null) {
                    if (bl4) {
                        return false;
                    }
                    this.a.aG.H.b("canSee");
                    bl4 = this.a.c(x2);
                }
                bl2 = bl4;
                this.a.aG.H.c();
                bl3 = bl2;
                if (string != null) break block7;
                if (!bl3) break block8;
                this.c.add(x2);
                if (string == null) break block7;
            }
            bl3 = this.b.add(x2);
        }
        return bl2;
    }

    public a(C c10) {
        this.c = Lists.newArrayList();
        this.b = Lists.newArrayList();
        this.a = c10;
    }

    public void a() {
        this.c.clear();
        this.b.clear();
    }
}

