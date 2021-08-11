/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.Sets
 */
package net.minecraft.ah;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import net.minecraft.Q.a;
import net.minecraft.Q.av;
import net.minecraft.ah.R;
import net.minecraft.ah.d;
import net.minecraft.ah.i;
import net.minecraft.ah.z;
import net.minecraft.i.k;
import net.minecraft.k.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class S
extends R {
    private final /* synthetic */ Set<k> k;
    private final /* synthetic */ Set<k> i;
    private /* synthetic */ boolean j;

    private void a(av av2) {
        String string = z.I();
        if (this.j) {
            a a10 = new a(av2, this);
            for (k k2 : this.i) {
                k2.cD.a(a10);
                if (string != null) continue;
            }
        }
    }

    @Override
    public void a(float f10) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (f10 == this.d) break block3;
                super.a(f10);
            }
            this.a(av.UPDATE_PCT);
        }
    }

    public Collection<k> a() {
        return this.k;
    }

    @Override
    public R c(boolean bl2) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (bl2 == this.h) break block3;
                super.c(bl2);
            }
            this.a(av.UPDATE_PROPERTIES);
        }
        return this;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(net.minecraft.at.k k2) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (Objects.equal((Object)k2, (Object)this.c)) break block3;
                super.a(k2);
            }
            this.a(av.UPDATE_NAME);
        }
    }

    @Override
    public void a(i i2) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (i2 == this.f) break block3;
                super.a(i2);
            }
            this.a(av.UPDATE_STYLE);
        }
    }

    @Override
    public R b(boolean bl2) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (bl2 == this.a) break block3;
                super.b(bl2);
            }
            this.a(av.UPDATE_PROPERTIES);
        }
        return this;
    }

    @Override
    public R a(boolean bl2) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (bl2 == this.e) break block3;
                super.a(bl2);
            }
            this.a(av.UPDATE_PROPERTIES);
        }
        return this;
    }

    public void a(k k2) {
        block2: {
            boolean bl2;
            block1: {
                String string = z.I();
                bl2 = this.i.add(k2);
                if (string == null) break block1;
                if (!bl2) break block2;
                bl2 = this.j;
            }
            if (bl2) {
                k2.cD.a(new a(av.ADD, this));
            }
        }
    }

    @Override
    public void a(d d10) {
        block3: {
            block2: {
                String string = z.I();
                if (string == null) break block2;
                if (d10 == this.b) break block3;
                super.a(d10);
            }
            this.a(av.UPDATE_STYLE);
        }
    }

    public void a(boolean bl2) {
        block4: {
            String string;
            block3: {
                string = z.I();
                if (string == null) break block3;
                if (bl2 == this.j) break block4;
                this.j = bl2;
            }
            for (k k2 : this.i) {
                k2.cD.a(new a(bl2 ? av.ADD : av.REMOVE, this));
                if (string != null) continue;
            }
        }
    }

    public void b(k k2) {
        block2: {
            boolean bl2;
            block1: {
                String string = z.I();
                bl2 = this.i.remove(k2);
                if (string == null) break block1;
                if (!bl2) break block2;
                bl2 = this.j;
            }
            if (bl2) {
                k2.cD.a(new a(av.REMOVE, this));
            }
        }
    }

    public S(net.minecraft.at.k k2, d d10, i i2) {
        super(net.minecraft.k.h.a(), k2, d10, i2);
        this.i = Sets.newHashSet();
        this.k = Collections.unmodifiableSet(this.i);
        this.j = true;
    }
}

