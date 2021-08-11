/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.M;

import javax.annotation.Nullable;
import net.minecraft.M.an;
import net.minecraft.M.t;
import net.minecraft.ah.p;

public class w
extends t {
    @Nullable
    private final /* synthetic */ p a;
    @Nullable
    private final /* synthetic */ p d;

    public w(@Nullable p p2, @Nullable p p3) {
        super(an.b());
        this.a = p2;
        this.d = p3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean a(p var1_1, p var2_2) {
        var3_3 = t.c();
        v0 = this.a;
        if (var3_3 != 0) {
            if (v0 != null) {
                v0 = this.a;
                if (var3_3 != 0) {
                    if (v0 != var1_1) {
                        return false;
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
        if (var3_3 != 0) {
            if (v0 == null) return true;
            v0 = this.d;
        }
        if (v0 == var2_2) return true;
        return false;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

