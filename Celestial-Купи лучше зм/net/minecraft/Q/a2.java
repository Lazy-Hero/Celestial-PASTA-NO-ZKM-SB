/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.D.e;
import net.minecraft.D.h;
import net.minecraft.Q.S;
import net.minecraft.Q.aD;
import net.minecraft.n.a;

public class a2
implements K<a> {
    private /* synthetic */ S a;
    private /* synthetic */ int c;
    private /* synthetic */ String d;
    private /* synthetic */ String b;

    public String a() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public a2(e e10) {
        this.b = "";
        this.d = "";
        this.b = e10.d();
        this.d = e10.f().e();
        this.c = e10.a();
        this.a = S.CHANGE;
    }

    public a2(String string, h h2) {
        this.b = "";
        this.d = "";
        this.b = string;
        this.d = h2.e();
        this.c = 0;
        this.a = S.REMOVE;
    }

    public String d() {
        return this.d;
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(this.b);
        boolean bl2 = aD.i();
        m2.a(this.a);
        boolean bl3 = bl2;
        m m3 = m2.a(this.d);
        if (bl3 && this.a != S.REMOVE) {
            m3 = m2.d(this.c);
        }
    }

    public S b() {
        return this.a;
    }

    @Override
    public void a(m m2) throws IOException {
        block3: {
            block2: {
                this.b = m2.c(40);
                this.a = m2.a(S.class);
                boolean bl2 = aD.c();
                this.d = m2.c(16);
                a2 a22 = this;
                if (bl2) break block2;
                if (a22.a == S.REMOVE) break block3;
                a22 = this;
            }
            a22.c = m2.a();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public a2() {
        this.b = "";
        this.d = "";
    }

    public a2(String string) {
        this.b = "";
        this.d = "";
        this.b = string;
        this.d = "";
        this.c = 0;
        this.a = S.REMOVE;
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

