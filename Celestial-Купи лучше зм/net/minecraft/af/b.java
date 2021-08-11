/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.af;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;
import net.minecraft.P.r;
import net.minecraft.a.k;
import net.minecraft.af.c;

public class b
extends k {
    private /* synthetic */ r x;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public r f() {
        return this.x;
    }

    public c a() {
        return (c)super.n();
    }

    public b(c c10) {
        super(c10);
        this.a(10);
    }

    @Override
    protected void c(net.minecraft.i.k k2) {
        int n2 = c.a();
        if (n2 == 0) {
            if (k2.g().equals(this.a().aa())) {
                this.x = k2.b(new r());
            }
            super.c(k2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public String a(SocketAddress var1_1, GameProfile var2_2) {
        var3_3 = c.c();
        if (var2_2.getName().equalsIgnoreCase(this.a().aa())) {
            v0 = this;
            if (var3_3 != 0) {
                if (v0.a(var2_2.getName()) != null) {
                    return "That name is already taken.";
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v0 = this;
        }
        v1 = super.a(var1_1, var2_2);
        return v1;
    }
}

