/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.b;

import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.aU;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class y
extends s {
    private final /* synthetic */ aU u;
    private /* synthetic */ boolean s;
    private final /* synthetic */ String t;

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = q.b();
        boolean bl2 = super.a(q2, n2, n3);
        if (arrstring != null) {
            if (bl2) {
                boolean bl3 = this.s;
                if (arrstring != null) {
                    bl3 = !bl3;
                }
                this.s = bl3;
                this.m = this.a();
                this.u.a(this.g, this.s);
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    private String a() {
        String[] arrstring = q.b();
        StringBuilder stringBuilder = new StringBuilder().append(net.minecraft.client.D.h.a(this.t, new Object[0]));
        String string = ": ";
        if (arrstring != null) {
            stringBuilder = stringBuilder.append(string);
            string = this.s ? "gui.yes" : "gui.no";
        }
        return stringBuilder.append(net.minecraft.client.D.h.a(string, new Object[0])).toString();
    }

    public y(aU aU2, int n2, int n3, int n4, String string, boolean bl2) {
        super(n2, n3, n4, 150, 20, "");
        this.t = string;
        this.s = bl2;
        this.m = this.a();
        this.u = aU2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(boolean bl2) {
        this.s = bl2;
        this.m = this.a();
        this.u.a(this.g, bl2);
    }
}

