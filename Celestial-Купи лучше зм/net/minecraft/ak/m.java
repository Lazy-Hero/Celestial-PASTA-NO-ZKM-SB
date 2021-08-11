/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 */
package net.minecraft.ak;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.List;
import net.minecraft.U.D;
import net.minecraft.U.x;
import net.minecraft.ak.c;
import net.minecraft.ak.g;
import net.minecraft.ak.h;
import net.minecraft.ar.e;
import net.minecraft.e.i;
import net.minecraft.k.l;

public class m<T extends x>
extends h {
    private /* synthetic */ net.minecraft.e.h d;
    private final /* synthetic */ i e;
    protected /* synthetic */ T g;
    protected /* synthetic */ D h;
    private final /* synthetic */ Predicate<x> l;
    private final /* synthetic */ Class<T> f;
    private final /* synthetic */ double k;
    private final /* synthetic */ double i;
    private final /* synthetic */ Predicate<? super T> j;
    private final /* synthetic */ float c;

    @Override
    public void a() {
        this.e.a(this.d, this.k);
    }

    public m(D d10, Class<T> class_, Predicate<? super T> predicate, float f10, double d11, double d12) {
        this.l = new c(this);
        this.h = d10;
        this.f = class_;
        this.j = predicate;
        this.c = f10;
        this.k = d11;
        this.i = d12;
        this.e = d10.l();
        this.a(1);
    }

    @Override
    public boolean e() {
        String string = net.minecraft.ak.h.h();
        boolean bl2 = this.e.o();
        if (string == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public boolean c() {
        l l2;
        List<T> list = this.h.aG.a(this.f, this.h.m().a((double)this.c, 3.0, this.c), Predicates.and((Predicate[])new Predicate[]{net.minecraft.ar.e.d, this.l, this.j}));
        String string = net.minecraft.ak.h.h();
        if (string == null) {
            if (list.isEmpty()) {
                return false;
            }
            this.g = (x)list.get(0);
        }
        if ((l2 = net.minecraft.ak.g.c(this.h, 16, 7, new l(((x)this.g).a, ((x)this.g).aF, ((x)this.g).ax))) == null) {
            return false;
        }
        m m2 = this;
        if (string == null) {
            if (((x)m2.g).a(l2.e, l2.d, l2.b) < ((x)this.g).s(this.h)) {
                return false;
            }
            this.d = this.e.a(l2.e, l2.d, l2.b);
            m2 = this;
        }
        return m2.d != null;
    }

    @Override
    public void b() {
        block4: {
            D d10;
            block2: {
                block3: {
                    String string = net.minecraft.ak.h.h();
                    d10 = this.h;
                    if (string != null) break block2;
                    if (!(d10.s((x)this.g) < 49.0)) break block3;
                    this.h.l().a(this.i);
                    if (string == null) break block4;
                }
                d10 = this.h;
            }
            d10.l().a(this.k);
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void g() {
        this.g = null;
    }

    public m(D d10, Class<T> class_, float f10, double d11, double d12) {
        this(d10, class_, Predicates.alwaysTrue(), f10, d11, d12);
    }
}

