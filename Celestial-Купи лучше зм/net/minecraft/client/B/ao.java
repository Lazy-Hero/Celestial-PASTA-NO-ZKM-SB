/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.ai;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;

public class ao
extends L {
    protected /* synthetic */ int B;
    private final /* synthetic */ String D;
    protected /* synthetic */ ai E;
    protected /* synthetic */ String y;
    protected /* synthetic */ String z;
    protected /* synthetic */ String F;
    private /* synthetic */ int A;
    private final /* synthetic */ List<String> C;

    @Override
    public void r() {
        this.t.add(new B(0, h / 2 - 155, w / 6 + 96, this.y));
        this.t.add(new B(1, h / 2 - 155 + 160, w / 6 + 96, this.F));
        this.C.clear();
        this.C.addAll(this.v.c(this.D, h - 50));
    }

    @Override
    protected void a(s s2) throws IOException {
        String[] arrstring = q.b();
        boolean bl2 = s2.g;
        if (arrstring != null) {
            bl2 = !bl2;
        }
        this.E.a(bl2, this.B);
    }

    public ao(ai ai2, String string, String string2, int n2) {
        this.C = Lists.newArrayList();
        this.E = ai2;
        this.z = string;
        this.D = string2;
        this.B = n2;
        this.y = net.minecraft.client.D.h.a("gui.yes", new Object[0]);
        this.F = net.minecraft.client.D.h.a("gui.no", new Object[0]);
    }

    public void a(int n2) {
        this.A = n2;
        Iterator iterator = this.t.iterator();
        String[] arrstring = q.b();
        while (iterator.hasNext()) {
            s s2 = (s)iterator.next();
            s2.h = false;
            if (arrstring != null) continue;
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block2: {
            String[] arrstring = q.b();
            this.n();
            String[] arrstring2 = arrstring;
            this.b(this.v, this.z, h / 2, 70, 0xFFFFFF);
            int n4 = 90;
            for (String string : this.C) {
                this.b(this.v, string, h / 2, n4, 0xFFFFFF);
                n4 += this.v.p;
                if (arrstring2 != null) {
                    if (arrstring2 != null) continue;
                }
                break block2;
            }
            super.a(n2, n3, f10);
        }
    }

    public ao(ai ai2, String string, String string2, String string3, String string4, int n2) {
        this.C = Lists.newArrayList();
        this.E = ai2;
        this.z = string;
        this.D = string2;
        this.y = string3;
        this.F = string4;
        this.B = n2;
    }

    @Override
    public void e() {
        block4: {
            ao ao2;
            String[] arrstring;
            block3: {
                String[] arrstring2 = q.b();
                super.e();
                arrstring = arrstring2;
                ao2 = this;
                if (arrstring == null) break block3;
                if (--ao2.A != 0) break block4;
                ao2 = this;
            }
            for (s s2 : ao2.t) {
                s2.h = true;
                if (arrstring != null) continue;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

