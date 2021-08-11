/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.b;

import javax.annotation.Nullable;
import net.minecraft.ar.U;
import net.minecraft.at.g;
import net.minecraft.client.Q;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.q;
import net.minecraft.k.i;
import net.minecraft.k.j;
import net.minecraft.k.n;

public class am
extends U {
    private final /* synthetic */ Q g;

    @Override
    @Nullable
    public n d() {
        n n2;
        block3: {
            i i2;
            block4: {
                String[] arrstring;
                block2: {
                    n2 = null;
                    arrstring = q.b();
                    i2 = this.g.ao;
                    if (arrstring == null) break block2;
                    if (i2 == null) break block3;
                    i2 = this.g.ao;
                }
                if (arrstring == null) break block4;
                if (i2.d != j.BLOCK) break block3;
                i2 = this.g.ao;
            }
            n2 = i2.a();
        }
        return n2;
    }

    @Override
    public void a() {
        block5: {
            String[] arrstring = q.b();
            super.a();
            String[] arrstring2 = arrstring;
            if (this.a.size() > 1) {
                StringBuilder stringBuilder = new StringBuilder();
                for (String string : this.a) {
                    if (arrstring2 != null) {
                        StringBuilder stringBuilder2 = stringBuilder;
                        if (arrstring2 != null) {
                            if (stringBuilder2.length() > 0) {
                                stringBuilder.append(", ");
                            }
                            stringBuilder2 = stringBuilder.append(string);
                        }
                        if (arrstring2 != null) continue;
                    }
                    break block5;
                }
                this.g.n.f().a(new g(stringBuilder.toString()), 1);
            }
        }
    }

    public am(aq aq2) {
        super(aq2, false);
        this.g = Q.P();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

