/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.P.r;
import net.minecraft.ar.v;
import net.minecraft.ar.w;

public class x
extends w {
    private final /* synthetic */ r b;

    public r a() {
        String string;
        r r2;
        r r3;
        block7: {
            block6: {
                boolean bl2;
                block4: {
                    int n2;
                    block5: {
                        r3 = new r();
                        n2 = v.d();
                        bl2 = this.b.a("id", 8);
                        if (n2 == 0) break block4;
                        if (bl2) break block5;
                        this.b.a("id", "minecraft:pig");
                        if (n2 != 0) break block6;
                    }
                    r2 = this.b;
                    string = "id";
                    if (n2 == 0) break block7;
                    bl2 = r2.j(string).contains(":");
                }
                if (!bl2) {
                    this.b.a("id", new v(this.b.j("id")).toString());
                }
            }
            r3.a("Entity", this.b);
            r2 = r3;
            string = "Weight";
        }
        r2.b(string, this.a);
        return r3;
    }

    public x(r r2) {
        this(r2.a("Weight", 99) ? r2.m("Weight") : 1, r2.h("Entity"));
    }

    public x(int n2, r r2) {
        super(n2);
        this.b = r2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public r b() {
        return this.b;
    }

    public x() {
        super(1);
        this.b = new r();
        this.b.a("id", "minecraft:pig");
    }
}

