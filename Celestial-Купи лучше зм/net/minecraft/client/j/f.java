/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import java.awt.image.BufferedImage;
import java.io.IOException;
import net.minecraft.client.D.t;
import net.minecraft.client.j.e;
import net.minecraft.client.j.p;

public class f
extends e {
    private final /* synthetic */ int j;
    private final /* synthetic */ int[] i;
    private /* synthetic */ boolean h;
    private final /* synthetic */ int g;

    public void d() {
        if (fU.ag()) {
            if (!this.h) {
                s.a(this.c(), this.j, this.g, this);
                this.h = true;
            }
            s.a(this.c(), this.i, this.j, this.g, this);
        } else {
            p.a(this.c(), this.i, this.j, this.g);
        }
    }

    public f(int n2, int n3) {
        this.h = false;
        this.j = n2;
        this.g = n3;
        this.i = new int[n2 * n3 * 3];
        if (fU.ag()) {
            s.a(this.c(), n2, n3, this);
            this.h = true;
        } else {
            p.a(this.c(), n2, n3);
        }
    }

    @Override
    public void a(t t2) throws IOException {
    }

    public f(BufferedImage bufferedImage) {
        this(bufferedImage.getWidth(), bufferedImage.getHeight());
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), this.i, 0, bufferedImage.getWidth());
        this.d();
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public int[] a() {
        return this.i;
    }
}

