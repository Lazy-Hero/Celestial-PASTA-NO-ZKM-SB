/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.E;
import net.minecraft.Q.Z;
import net.minecraft.Q.aD;
import net.minecraft.V.a;

public class I
implements K<net.minecraft.n.a> {
    private /* synthetic */ int g;
    private /* synthetic */ double e;
    private /* synthetic */ double c;
    private /* synthetic */ long b;
    private /* synthetic */ int h;
    private /* synthetic */ int a;
    private /* synthetic */ E i;
    private /* synthetic */ double d;
    private /* synthetic */ double f;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(m var1_1) throws IOException {
        this.i = var1_1.a(E.class);
        var2_2 = aD.c();
        if (var2_2) ** GOTO lbl7
        switch (Z.a[this.i.ordinal()]) {
            case 1: {
                this.c = var1_1.readDouble();
lbl7:
                // 2 sources

                if (var2_2 == false) return;
            }
            case 2: {
                this.e = var1_1.readDouble();
                this.c = var1_1.readDouble();
                this.b = var1_1.k();
                if (var2_2 == false) return;
            }
            case 3: {
                this.d = var1_1.readDouble();
                this.f = var1_1.readDouble();
                if (var2_2 == false) return;
            }
            case 4: {
                this.h = var1_1.a();
                if (var2_2 == false) return;
            }
            case 5: {
                this.g = var1_1.a();
                if (var2_2 == false) return;
            }
            case 6: {
                this.d = var1_1.readDouble();
                this.f = var1_1.readDouble();
                this.e = var1_1.readDouble();
                this.c = var1_1.readDouble();
                this.b = var1_1.k();
                this.a = var1_1.a();
                this.h = var1_1.a();
                this.g = var1_1.a();
                return;
            }
        }
    }

    public I(a a10, E e10) {
        this.i = e10;
        this.d = a10.n();
        this.f = a10.l();
        this.e = a10.c();
        this.c = a10.e();
        this.b = a10.i();
        this.a = a10.k();
        this.h = a10.s();
        this.g = a10.q();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(a var1_1) {
        var2_2 = aD.c();
        if (var2_2) ** GOTO lbl6
        switch (Z.a[this.i.ordinal()]) {
            case 1: {
                var1_1.c(this.c);
lbl6:
                // 2 sources

                if (var2_2 == false) return;
            }
            case 2: {
                var1_1.a(this.e, this.c, this.b);
                if (var2_2 == false) return;
            }
            case 3: {
                var1_1.b(this.d, this.f);
                if (var2_2 == false) return;
            }
            case 4: {
                var1_1.c(this.h);
                if (var2_2 == false) return;
            }
            case 5: {
                var1_1.a(this.g);
                if (var2_2 == false) return;
            }
            case 6: {
                v0 = var1_1;
                v1 = this.d;
                if (var2_2) ** GOTO lbl29
                v0.b(v1, this.f);
                if (this.b <= 0L) ** GOTO lbl27
                var1_1.a(this.e, this.c, this.b);
                if (!var2_2) ** GOTO lbl30
lbl27:
                // 2 sources

                v0 = var1_1;
                v1 = this.c;
lbl29:
                // 2 sources

                v0.c(v1);
lbl30:
                // 2 sources

                var1_1.b(this.a);
                var1_1.c(this.h);
                var1_1.a(this.g);
                return;
            }
        }
    }

    @Override
    public void a(net.minecraft.n.a a10) {
        a10.a(this);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public I() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(m var1_1) throws IOException {
        v0 = aD.c();
        var1_1.a(this.i);
        var2_2 = v0;
        if (var2_2) ** GOTO lbl10
        switch (Z.a[this.i.ordinal()]) {
            case 1: {
                var1_1.writeDouble(this.c);
lbl10:
                // 2 sources

                if (var2_2 == false) return;
            }
            case 2: {
                var1_1.writeDouble(this.e);
                var1_1.writeDouble(this.c);
                var1_1.a(this.b);
                if (var2_2 == false) return;
            }
            case 3: {
                var1_1.writeDouble(this.d);
                var1_1.writeDouble(this.f);
                if (var2_2 == false) return;
            }
            case 4: {
                var1_1.d(this.h);
                if (var2_2 == false) return;
            }
            case 5: {
                var1_1.d(this.g);
                if (var2_2 == false) return;
            }
            case 6: {
                var1_1.writeDouble(this.d);
                var1_1.writeDouble(this.f);
                var1_1.writeDouble(this.e);
                var1_1.writeDouble(this.c);
                var1_1.a(this.b);
                var1_1.d(this.a);
                var1_1.d(this.h);
                var1_1.d(this.g);
                return;
            }
        }
    }
}

