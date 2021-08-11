/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.Q;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.U.x;
import net.minecraft.n.a;

public class R
implements K<a> {
    private /* synthetic */ int a;
    private /* synthetic */ int b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public int a() {
        return this.a;
    }

    public R() {
    }

    public int b() {
        return this.b;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeInt(this.a);
        m2.writeInt(this.b);
    }

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.readInt();
        this.b = m2.readInt();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public R(x var1_1, @Nullable x var2_2) {
        v0 = aD.i();
        super();
        var3_3 = v0;
        this.a = var1_1.W();
        v1 = var2_2;
        if (!var3_3) ** GOTO lbl9
        if (v1 != null) {
            v1 = var2_2;
lbl9:
            // 2 sources

            v2 = v1.W();
        } else {
            v2 = -1;
        }
        this.b = v2;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

