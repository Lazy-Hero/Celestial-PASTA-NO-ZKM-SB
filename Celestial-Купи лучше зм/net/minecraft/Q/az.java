/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.Q;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.n.a;

public class az
implements K<a> {
    private /* synthetic */ int b;
    private /* synthetic */ float c;
    public static final /* synthetic */ String[] a;

    public float a() {
        return this.c;
    }

    public az() {
    }

    public int b() {
        return this.b;
    }

    public az(int n2, float f10) {
        this.b = n2;
        this.c = f10;
    }

    @Override
    public void a(m m2) throws IOException {
        this.b = m2.readUnsignedByte();
        this.c = m2.readFloat();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.writeByte(this.b);
        m2.writeFloat(this.c);
    }

    static {
        a = new String[]{"tile.bed.notValid"};
    }
}

