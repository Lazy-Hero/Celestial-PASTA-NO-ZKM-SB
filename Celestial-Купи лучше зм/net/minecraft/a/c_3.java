/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.A;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.k.n;

public class c
extends b {
    private final /* synthetic */ h g;

    @Override
    public h[] a(@Nullable h[] arrh, int n2, int n3, int n4, int n5, boolean bl2) {
        return this.b(arrh, n2, n3, n4, n5);
    }

    @Override
    public boolean a(int n2, int n3, int n4, List<h> list) {
        return list.contains(this.g);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public h a(n n2) {
        return this.g;
    }

    @Override
    @Nullable
    public n a(int n2, int n3, int n4, List<h> list, Random random) {
        return list.contains(this.g) ? new n(n2 - n4 + random.nextInt(n4 * 2 + 1), 0, n3 - n4 + random.nextInt(n4 * 2 + 1)) : null;
    }

    public c(h h2) {
        this.g = h2;
    }

    @Override
    public h[] b(@Nullable h[] arrh, int n2, int n3, int n4, int n5) {
        h[] arrh2;
        block4: {
            block5: {
                h[] arrh3;
                block2: {
                    block3: {
                        boolean bl2 = b.f();
                        arrh3 = arrh;
                        if (bl2) break block2;
                        if (arrh3 == null) break block3;
                        arrh2 = arrh;
                        if (bl2) break block4;
                        if (arrh2.length >= n4 * n5) break block5;
                    }
                    arrh3 = new h[n4 * n5];
                }
                arrh = arrh3;
            }
            Arrays.fill(arrh, 0, n4 * n5, this.g);
            arrh2 = arrh;
        }
        return arrh2;
    }

    @Override
    public h[] a(h[] arrh, int n2, int n3, int n4, int n5) {
        h[] arrh2;
        block4: {
            block5: {
                h[] arrh3;
                block2: {
                    block3: {
                        boolean bl2 = b.c();
                        arrh3 = arrh;
                        if (!bl2) break block2;
                        if (arrh3 == null) break block3;
                        arrh2 = arrh;
                        if (!bl2) break block4;
                        if (arrh2.length >= n4 * n5) break block5;
                    }
                    arrh3 = new h[n4 * n5];
                }
                arrh = arrh3;
            }
            Arrays.fill(arrh, 0, n4 * n5, this.g);
            arrh2 = arrh;
        }
        return arrh2;
    }

    @Override
    public h e() {
        return this.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

