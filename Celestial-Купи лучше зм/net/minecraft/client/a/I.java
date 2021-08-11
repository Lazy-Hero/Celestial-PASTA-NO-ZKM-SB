/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.opengl.GL11
 */
package net.minecraft.client.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.BitSet;
import net.minecraft.Z.i;
import net.minecraft.ah.t;
import net.minecraft.ar.aC;
import net.minecraft.client.a.P;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.aa;
import net.minecraft.client.j.c;
import net.minecraft.client.y.d;
import net.minecraft.client.y.e;
import net.minecraft.client.y.g;
import net.minecraft.k.h;
import net.minecraft.k.n;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class I {
    public /* synthetic */ IntBuffer l;
    public /* synthetic */ int p;
    private /* synthetic */ aC d;
    private /* synthetic */ c[] s;
    public /* synthetic */ e9 j;
    private /* synthetic */ c f;
    public /* synthetic */ int h;
    private /* synthetic */ double i;
    private static /* synthetic */ String q;
    private /* synthetic */ ShortBuffer t;
    private /* synthetic */ boolean[] e;
    private /* synthetic */ boolean k;
    private /* synthetic */ e m;
    private /* synthetic */ boolean b;
    private /* synthetic */ g c;
    private static final /* synthetic */ Logger u;
    private /* synthetic */ ByteBuffer v;
    private /* synthetic */ double g;
    private /* synthetic */ int a;
    private /* synthetic */ c[] r;
    public /* synthetic */ fX n;
    public /* synthetic */ FloatBuffer o;
    private /* synthetic */ double w;

    public int t() {
        return this.h;
    }

    public void k() {
        this.p = 0;
        this.c = null;
        this.a = 0;
        this.f = null;
    }

    public e9 a(t t2, i i2, n n2) {
        String string = I.j();
        e9 e92 = this.j;
        if (string == null) {
            if (e92 == null) {
                this.j = new e9(t2, i2, n2);
                return this.j;
            }
            this.j.a(t2, i2, n2);
            e92 = this.j;
        }
        return e92;
    }

    public I d(float f10, float f11, float f12) {
        int n2 = this.p * this.m.c() + this.m.c(this.a);
        String string = I.j();
        if (string == null) {
            switch (this.c.a()) {
                case FLOAT: {
                    this.v.putFloat(n2, f10);
                    this.v.putFloat(n2 + 4, f11);
                    this.v.putFloat(n2 + 8, f12);
                    if (string == null) break;
                }
                case UINT: 
                case INT: {
                    this.v.putInt(n2, (int)f10);
                    this.v.putInt(n2 + 4, (int)f11);
                    this.v.putInt(n2 + 8, (int)f12);
                    if (string == null) break;
                }
                case USHORT: 
                case SHORT: {
                    this.v.putShort(n2, (short)((int)(f10 * 32767.0f) & 0xFFFF));
                    this.v.putShort(n2 + 2, (short)((int)(f11 * 32767.0f) & 0xFFFF));
                    this.v.putShort(n2 + 4, (short)((int)(f12 * 32767.0f) & 0xFFFF));
                    if (string == null) break;
                }
                case UBYTE: 
                case BYTE: {
                    this.v.put(n2, (byte)((int)(f10 * 127.0f) & 0xFF));
                    this.v.put(n2 + 1, (byte)((int)(f11 * 127.0f) & 0xFF));
                    this.v.put(n2 + 2, (byte)((int)(f12 * 127.0f) & 0xFF));
                    break;
                }
            }
            this.h();
        }
        return this;
    }

    private void h() {
        block3: {
            I i2;
            block2: {
                ++this.a;
                String string = I.j();
                this.a %= this.m.g();
                this.c = this.m.d(this.a);
                i2 = this;
                if (string != null) break block2;
                if (i2.c.g() != net.minecraft.client.y.d.PADDING) break block3;
                i2 = this;
            }
            i2.h();
        }
    }

    public I b(int n2, int n3, int n4, int n5) {
        int n6;
        String string = I.j();
        int n7 = this.b;
        if (string == null) {
            if (n7 != 0) {
                return this;
            }
            n7 = n6 = this.p * this.m.c() + this.m.c(this.a);
        }
        if (string == null) {
            switch (this.c.a()) {
                case FLOAT: {
                    this.v.putFloat(n6, (float)n2 / 255.0f);
                    this.v.putFloat(n6 + 4, (float)n3 / 255.0f);
                    this.v.putFloat(n6 + 8, (float)n4 / 255.0f);
                    this.v.putFloat(n6 + 12, (float)n5 / 255.0f);
                    if (string == null) break;
                }
                case UINT: 
                case INT: {
                    this.v.putFloat(n6, n2);
                    this.v.putFloat(n6 + 4, n3);
                    this.v.putFloat(n6 + 8, n4);
                    this.v.putFloat(n6 + 12, n5);
                    if (string == null) break;
                }
                case USHORT: 
                case SHORT: {
                    this.v.putShort(n6, (short)n2);
                    this.v.putShort(n6 + 2, (short)n3);
                    this.v.putShort(n6 + 4, (short)n4);
                    this.v.putShort(n6 + 6, (short)n5);
                    if (string == null) break;
                }
                case UBYTE: 
                case BYTE: {
                    if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
                        this.v.put(n6, (byte)n2);
                        this.v.put(n6 + 1, (byte)n3);
                        this.v.put(n6 + 2, (byte)n4);
                        this.v.put(n6 + 3, (byte)n5);
                        if (string == null) break;
                    }
                    this.v.put(n6, (byte)n5);
                    this.v.put(n6 + 1, (byte)n4);
                    this.v.put(n6 + 2, (byte)n3);
                    this.v.put(n6 + 3, (byte)n2);
                    break;
                }
            }
            this.h();
        }
        return this;
    }

    public void b(c c10) {
        block3: {
            I i2;
            block2: {
                String string = I.j();
                i2 = this;
                if (string != null) break block2;
                if (i2.r == null) break block3;
                i2 = this;
            }
            int n2 = i2.p / 4;
            this.r[n2 - 1] = c10;
        }
    }

    public double n() {
        return this.i;
    }

    public e g() {
        return this.m;
    }

    public void a(int[] arrn) {
        block6: {
            I i2;
            block5: {
                boolean bl2;
                block4: {
                    String string = I.j();
                    bl2 = fU.ag();
                    if (string != null) break block4;
                    if (bl2) {
                        fX.a(this, arrn);
                    }
                    this.b(arrn.length * 4);
                    this.l.position(this.m());
                    this.l.put(arrn);
                    i2 = this;
                    if (string != null) break block5;
                    i2.p += arrn.length / this.m.a();
                    bl2 = fU.ag();
                }
                if (!bl2) break block6;
                i2 = this;
            }
            fX.d(i2);
        }
    }

    public I a(float f10, float f11, float f12, float f13) {
        return this.b((int)(f10 * 255.0f), (int)(f11 * 255.0f), (int)(f12 * 255.0f), (int)(f13 * 255.0f));
    }

    public void a(int n2, e e10) {
        block12: {
            String string;
            block10: {
                block14: {
                    I i2;
                    block15: {
                        c[] arrc;
                        block13: {
                            I i3;
                            block11: {
                                string = I.j();
                                boolean bl2 = this.k;
                                if (string == null) {
                                    if (bl2) {
                                        throw new IllegalStateException("Already building!");
                                    }
                                    this.k = true;
                                    this.k();
                                    this.h = n2;
                                    this.m = e10;
                                    this.c = e10.d(this.a);
                                    this.b = false;
                                    this.v.limit(this.v.capacity());
                                    bl2 = fU.ag();
                                }
                                if (string == null) {
                                    if (bl2) {
                                        fX.f(this);
                                    }
                                    bl2 = fU.aR();
                                }
                                if (!bl2) break block10;
                                i3 = this;
                                if (string != null) break block11;
                                if (i3.d == null) break block12;
                                i3 = this;
                            }
                            arrc = i3.r;
                            if (string != null) break block13;
                            if (arrc == null) {
                                this.r = this.s;
                            }
                            i2 = this;
                            if (string != null) break block14;
                            arrc = i2.r;
                        }
                        if (arrc == null) break block15;
                        i2 = this;
                        if (string != null) break block14;
                        if (i2.r.length >= this.o()) break block12;
                    }
                    i2 = this;
                }
                i2.r = new c[this.o()];
                if (string == null) break block12;
            }
            I i4 = this;
            if (string == null) {
                if (i4.r != null) {
                    this.s = this.r;
                }
                i4 = this;
            }
            i4.r = null;
        }
    }

    public double l() {
        return this.g;
    }

    public void b(double d10, double d11, double d12) {
        int n2 = this.m.a();
        String string = I.j();
        int n3 = (this.p - 4) * n2;
        for (int i2 = 0; i2 < 4; ++i2) {
            int n4 = n3 + i2 * n2;
            int n5 = n4 + 1;
            int n6 = n5 + 1;
            this.l.put(n4, Float.floatToRawIntBits((float)(d10 + this.w) + Float.intBitsToFloat(this.l.get(n4))));
            this.l.put(n5, Float.floatToRawIntBits((float)(d11 + this.i) + Float.intBitsToFloat(this.l.get(n5))));
            this.l.put(n6, Float.floatToRawIntBits((float)(d12 + this.g) + Float.intBitsToFloat(this.l.get(n6))));
            if (string == null) continue;
        }
    }

    public boolean c() {
        return this.r != null;
    }

    public void c(int n2, int n3, int n4, int n5) {
        int n6 = (this.p - 4) * this.m.a() + this.m.b(1) / 4;
        int n7 = this.m.c() >> 2;
        this.l.put(n6, n2);
        this.l.put(n6 + n7, n3);
        this.l.put(n6 + n7 * 2, n4);
        this.l.put(n6 + n7 * 3, n5);
    }

    public void a(float f10, float f11, float f12) {
        block17: {
            c[] arrc;
            int n2;
            int n3;
            int n4;
            Integer[] arrinteger;
            String string;
            block18: {
                int n5;
                int n6;
                block15: {
                    block14: {
                        int n7 = this.p / 4;
                        float[] arrf = new float[n7];
                        string = I.j();
                        for (int i2 = 0; i2 < n7; ++i2) {
                            arrf[i2] = I.a(this.o, (float)((double)f10 + this.w), (float)((double)f11 + this.i), (float)((double)f12 + this.g), this.m.a(), i2 * this.m.c());
                            if (string == null) continue;
                        }
                        arrinteger = new Integer[n7];
                        for (int i3 = 0; i3 < arrinteger.length; ++i3) {
                            arrinteger[i3] = i3;
                            if (string == null) {
                                if (string == null) continue;
                            }
                            break block14;
                        }
                        Arrays.sort(arrinteger, new aa(this, arrf));
                    }
                    BitSet bitSet = new BitSet();
                    int n8 = this.m.c();
                    int[] arrn = new int[n8];
                    int n9 = bitSet.nextClearBit(0);
                    while (n9 < arrinteger.length) {
                        int n10 = n4 = arrinteger[n9].intValue();
                        if (string == null) {
                            n6 = n9;
                            if (string != null) break block15;
                            if (n10 != n6) {
                                block16: {
                                    this.l.limit(n4 * n8 + n8);
                                    this.l.position(n4 * n8);
                                    this.l.get(arrn);
                                    n3 = n4;
                                    n2 = arrinteger[n4];
                                    while (n3 != n9) {
                                        this.l.limit(n2 * n8 + n8);
                                        this.l.position(n2 * n8);
                                        IntBuffer intBuffer = this.l.slice();
                                        this.l.limit(n3 * n8 + n8);
                                        this.l.position(n3 * n8);
                                        this.l.put(intBuffer);
                                        bitSet.set(n3);
                                        n3 = n2;
                                        n2 = arrinteger[n2];
                                        if (string == null) {
                                            if (string == null) continue;
                                        }
                                        break block16;
                                    }
                                    this.l.limit(n9 * n8 + n8);
                                    this.l.position(n9 * n8);
                                }
                                this.l.put(arrn);
                            }
                            bitSet.set(n9);
                            n10 = n9 = bitSet.nextClearBit(n9 + 1);
                        }
                        if (string == null) continue;
                    }
                    this.l.limit(this.l.capacity());
                    this.l.position(this.m());
                    arrc = this.r;
                    if (string != null) break block18;
                    if (arrc == null) break block17;
                    n5 = this.p;
                    n6 = 4;
                }
                arrc = new c[n5 / n6];
            }
            c[] arrc2 = arrc;
            n4 = this.m.c() / 4 * 4;
            for (n3 = 0; n3 < arrinteger.length; ++n3) {
                n2 = arrinteger[n3];
                arrc2[n3] = this.r[n2];
                if (string == null) {
                    if (string == null) continue;
                }
                break block17;
            }
            System.arraycopy(arrc2, 0, this.r, 0, arrc2.length);
        }
    }

    private static float a(FloatBuffer floatBuffer, float f10, float f11, float f12, int n2, int n3) {
        float f13 = floatBuffer.get(n3 + n2 * 0 + 0);
        float f14 = floatBuffer.get(n3 + n2 * 0 + 1);
        float f15 = floatBuffer.get(n3 + n2 * 0 + 2);
        float f16 = floatBuffer.get(n3 + n2 * 1 + 0);
        float f17 = floatBuffer.get(n3 + n2 * 1 + 1);
        float f18 = floatBuffer.get(n3 + n2 * 1 + 2);
        float f19 = floatBuffer.get(n3 + n2 * 2 + 0);
        float f20 = floatBuffer.get(n3 + n2 * 2 + 1);
        float f21 = floatBuffer.get(n3 + n2 * 2 + 2);
        float f22 = floatBuffer.get(n3 + n2 * 3 + 0);
        float f23 = floatBuffer.get(n3 + n2 * 3 + 1);
        float f24 = floatBuffer.get(n3 + n2 * 3 + 2);
        float f25 = (f13 + f16 + f19 + f22) * 0.25f - f10;
        float f26 = (f14 + f17 + f20 + f23) * 0.25f - f11;
        float f27 = (f15 + f18 + f21 + f24) * 0.25f - f12;
        return f25 * f25 + f26 * f26 + f27 * f27;
    }

    public boolean e() {
        return this.k;
    }

    private void b(int n2, int n3) {
        int n4 = this.a(n3);
        int n5 = n2 >> 16 & 0xFF;
        int n6 = n2 >> 8 & 0xFF;
        int n7 = n2 & 0xFF;
        this.a(n4, n5, n6, n7);
    }

    public void b(float f10, float f11, float f12, int n2) {
        I i2;
        int n3;
        int n4;
        block2: {
            block3: {
                int n5;
                int n6;
                int n7;
                int n8;
                block4: {
                    block5: {
                        n4 = this.a(n2);
                        String string = I.j();
                        n3 = -1;
                        i2 = this;
                        if (string != null) break block2;
                        if (i2.b) break block3;
                        n8 = this.l.get(n4);
                        if (string != null) break block4;
                        n3 = n8;
                        if (ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN) break block5;
                        n7 = (int)((float)(n3 & 0xFF) * f10);
                        n6 = (int)((float)(n3 >> 8 & 0xFF) * f11);
                        n5 = (int)((float)(n3 >> 16 & 0xFF) * f12);
                        n3 &= 0xFF000000;
                        n3 = n3 | n5 << 16 | n6 << 8 | n7;
                        if (string == null) break block3;
                    }
                    n8 = (int)((float)(n3 >> 24 & 0xFF) * f10);
                }
                n7 = n8;
                n6 = (int)((float)(n3 >> 16 & 0xFF) * f11);
                n5 = (int)((float)(n3 >> 8 & 0xFF) * f12);
                n3 &= 0xFF;
                n3 = n3 | n7 << 24 | n6 << 16 | n5 << 8;
            }
            i2 = this;
        }
        i2.l.put(n4, n3);
    }

    public void c(float f10, float f11, float f12) {
        int n2 = (byte)(f10 * 127.0f) & 0xFF;
        int n3 = (byte)(f11 * 127.0f) & 0xFF;
        int n4 = (byte)(f12 * 127.0f) & 0xFF;
        int n5 = n2 | n3 << 8 | n4 << 16;
        int n6 = this.m.c() >> 2;
        int n7 = (this.p - 4) * n6 + this.m.e() / 4;
        this.l.put(n7, n5);
        this.l.put(n7 + n6, n5);
        this.l.put(n7 + n6 * 2, n5);
        this.l.put(n7 + n6 * 3, n5);
    }

    public static String j() {
        return q;
    }

    public I a(double d10, double d11) {
        I i2;
        String string;
        block11: {
            block12: {
                string = I.j();
                i2 = this;
                if (string != null) break block11;
                if (i2.f == null) break block12;
                i2 = this;
                if (string != null) break block11;
                if (i2.r != null) {
                    d10 = this.f.e((float)d10);
                    d11 = this.f.c((float)d11);
                    this.r[this.p / 4] = this.f;
                }
            }
            i2 = this;
        }
        int n2 = i2.p * this.m.c() + this.m.c(this.a);
        if (string == null) {
            switch (this.c.a()) {
                case FLOAT: {
                    this.v.putFloat(n2, (float)d10);
                    this.v.putFloat(n2 + 4, (float)d11);
                    if (string == null) break;
                }
                case UINT: 
                case INT: {
                    this.v.putInt(n2, (int)d10);
                    this.v.putInt(n2 + 4, (int)d11);
                    if (string == null) break;
                }
                case USHORT: 
                case SHORT: {
                    this.v.putShort(n2, (short)d11);
                    this.v.putShort(n2 + 2, (short)d10);
                    if (string == null) break;
                }
                case UBYTE: 
                case BYTE: {
                    this.v.put(n2, (byte)d11);
                    this.v.put(n2 + 1, (byte)d10);
                    break;
                }
            }
            this.h();
        }
        return this;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public ByteBuffer b() {
        return this.v;
    }

    public boolean s() {
        return this.b;
    }

    public void a(aC aC2) {
        block6: {
            I i2;
            String string;
            block5: {
                string = I.j();
                i2 = this;
                if (string != null) break block5;
                i2.d = aC2;
                if (aC2 != null) break block6;
                i2 = this;
            }
            if (string == null) {
                if (i2.r != null) {
                    this.s = this.r;
                }
                this.r = null;
                i2 = this;
            }
            i2.f = null;
        }
    }

    public I c(double d10, double d11, double d12) {
        int n2;
        String string = I.j();
        int n3 = fU.ag();
        if (string == null) {
            if (n3 != 0) {
                fX.c(this);
            }
            n3 = n2 = this.p * this.m.c() + this.m.c(this.a);
        }
        if (string == null) {
            switch (this.c.a()) {
                case FLOAT: {
                    this.v.putFloat(n2, (float)(d10 + this.w));
                    this.v.putFloat(n2 + 4, (float)(d11 + this.i));
                    this.v.putFloat(n2 + 8, (float)(d12 + this.g));
                    if (string == null) break;
                }
                case UINT: 
                case INT: {
                    this.v.putInt(n2, Float.floatToRawIntBits((float)(d10 + this.w)));
                    this.v.putInt(n2 + 4, Float.floatToRawIntBits((float)(d11 + this.i)));
                    this.v.putInt(n2 + 8, Float.floatToRawIntBits((float)(d12 + this.g)));
                    if (string == null) break;
                }
                case USHORT: 
                case SHORT: {
                    this.v.putShort(n2, (short)(d10 + this.w));
                    this.v.putShort(n2 + 2, (short)(d11 + this.i));
                    this.v.putShort(n2 + 4, (short)(d12 + this.g));
                    if (string == null) break;
                }
                case UBYTE: 
                case BYTE: {
                    this.v.put(n2, (byte)(d10 + this.w));
                    this.v.put(n2 + 1, (byte)(d11 + this.i));
                    this.v.put(n2 + 2, (byte)(d12 + this.g));
                    break;
                }
            }
            this.h();
        }
        return this;
    }

    public void p() {
        String string = I.j();
        I i2 = this;
        if (string == null) {
            if (!i2.k) {
                throw new IllegalStateException("Not building!");
            }
            this.k = false;
            this.v.position(0);
            i2 = this;
        }
        i2.v.limit(this.m() * 4);
    }

    public static void b(String string) {
        q = string;
    }

    public void f() {
        this.b = true;
    }

    public void i() {
        block13: {
            int n2;
            block18: {
                int n3;
                block12: {
                    String string = I.j();
                    if (this.r == null) break block13;
                    int n4 = fU.aX().an().a();
                    int n5 = this.e.length;
                    if (string == null) {
                        if (n5 <= n4) {
                            this.e = new boolean[n4 + 1];
                        }
                        Arrays.fill(this.e, false);
                        n5 = 0;
                    }
                    n3 = n5;
                    int n6 = -1;
                    int n7 = this.p / 4;
                    int n8 = 0;
                    while (n8 < n7) {
                        block14: {
                            block15: {
                                c c10;
                                block16: {
                                    block17: {
                                        c10 = this.r[n8];
                                        if (string != null) break block12;
                                        if (string != null) break block14;
                                        if (c10 == null) break block15;
                                        int n9 = c10.h();
                                        if (string != null) break block14;
                                        if (this.e[n9]) break block15;
                                        if (c10 != fp.aj) break block16;
                                        int n10 = n6;
                                        if (string != null) break block17;
                                        if (n10 >= 0) break block15;
                                        n10 = n6 = n8;
                                    }
                                    if (string == null) break block15;
                                }
                                n8 = this.a(c10, n8) - 1;
                                ++n3;
                                if (string != null) break block14;
                                if (this.d != aC.TRANSLUCENT) {
                                    this.e[n9] = true;
                                }
                            }
                            ++n8;
                        }
                        if (string == null) continue;
                    }
                    n2 = n6;
                    if (string != null) break block18;
                    if (n2 >= 0) {
                        this.a(fp.aj, n6);
                    }
                }
                n2 = ++n3;
            }
            if (n2 > 0) {
                // empty if block
            }
        }
    }

    public I(int n2) {
        this.d = null;
        this.e = new boolean[256];
        this.r = null;
        this.s = null;
        this.f = null;
        this.j = null;
        if (fU.ag()) {
            n2 *= 2;
        }
        this.v = aZ.d(n2 * 4);
        this.l = this.v.asIntBuffer();
        this.t = this.v.asShortBuffer();
        this.o = this.v.asFloatBuffer();
        fX.b(this);
    }

    static {
        u = LogManager.getLogger();
        I.b(null);
    }

    public void a(int n2, int n3, int n4, int n5) {
        block2: {
            block1: {
                String string;
                block0: {
                    string = I.j();
                    if (string != null) break block0;
                    if (ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN) break block1;
                    this.l.put(n2, 0xFF000000 | n5 << 16 | n4 << 8 | n3);
                }
                if (string == null) break block2;
            }
            this.l.put(n2, n3 << 24 | n4 << 16 | n5 << 8 | 0xFF);
        }
    }

    public void a(float f10, float f11, float f12, int n2) {
        int n3 = this.a(n2);
        int n4 = net.minecraft.k.h.c((int)(f10 * 255.0f), 0, 255);
        int n5 = net.minecraft.k.h.c((int)(f11 * 255.0f), 0, 255);
        int n6 = net.minecraft.k.h.c((int)(f12 * 255.0f), 0, 255);
        this.a(n3, n4, n5, n6);
    }

    private int a(c c10, int n2) {
        int n3;
        int n4;
        int n5;
        String string;
        block18: {
            block13: {
                String string2 = I.j();
                GL11.glBindTexture((int)3553, (int)c10.x);
                string = string2;
                n5 = -1;
                int n6 = -1;
                n4 = this.p / 4;
                int n7 = n2;
                while (n7 < n4) {
                    block17: {
                        block16: {
                            block14: {
                                block15: {
                                    c c11 = this.r[n7];
                                    if (string != null) break block13;
                                    if (c11 != c10) break block14;
                                    int n8 = n6;
                                    if (string != null) break block15;
                                    if (n8 >= 0) break block16;
                                    n8 = n6 = n7;
                                }
                                if (string == null) break block16;
                            }
                            if (n6 < 0) break block16;
                            this.c(n6, n7);
                            if (string == null) {
                                if (this.d == aC.TRANSLUCENT) {
                                    return n7;
                                }
                                n6 = -1;
                            }
                            if (string != null) break block17;
                            if (n5 < 0) {
                                n5 = n7;
                            }
                        }
                        ++n7;
                    }
                    if (string == null) continue;
                }
                n3 = n6;
                if (string != null) break block18;
                if (n3 >= 0) {
                    this.c(n6, n4);
                }
            }
            n3 = n5;
        }
        if (string == null) {
            if (n3 < 0) {
                n5 = n4;
            }
            n3 = n5;
        }
        return n3;
    }

    public void d() {
        block3: {
            I i2;
            block2: {
                String string = I.j();
                ++this.p;
                this.b(this.m.c());
                String string2 = string;
                this.a = 0;
                i2 = this;
                if (string2 != null) break block2;
                i2.c = this.m.d(this.a);
                if (!fU.ag()) break block3;
                i2 = this;
            }
            fX.e(i2);
        }
    }

    public void b(float f10, float f11, float f12) {
        String string = I.j();
        for (int i2 = 0; i2 < 4; ++i2) {
            this.a(f10, f11, f12, i2 + 1);
            if (string == null) continue;
        }
    }

    public I a(int n2, int n3) {
        int n4 = this.p * this.m.c() + this.m.c(this.a);
        String string = I.j();
        if (string == null) {
            switch (this.c.a()) {
                case FLOAT: {
                    this.v.putFloat(n4, n2);
                    this.v.putFloat(n4 + 4, n3);
                    if (string == null) break;
                }
                case UINT: 
                case INT: {
                    this.v.putInt(n4, n2);
                    this.v.putInt(n4 + 4, n3);
                    if (string == null) break;
                }
                case USHORT: 
                case SHORT: {
                    this.v.putShort(n4, (short)n3);
                    this.v.putShort(n4 + 2, (short)n2);
                    if (string == null) break;
                }
                case UBYTE: 
                case BYTE: {
                    this.v.put(n4, (byte)n3);
                    this.v.put(n4 + 1, (byte)n2);
                    break;
                }
            }
            this.h();
        }
        return this;
    }

    public int m() {
        return this.p * this.m.a();
    }

    public void a(double d10, double d11, double d12) {
        this.w = d10;
        this.i = d11;
        this.g = d12;
    }

    private void c(int n2, int n3) {
        block3: {
            int n4;
            int n5;
            block2: {
                n5 = n3 - n2;
                String string = I.j();
                n4 = n5;
                if (string != null) break block2;
                if (n4 <= 0) break block3;
                n4 = n2 * 4;
            }
            int n6 = n4;
            int n7 = n5 * 4;
            GL11.glDrawArrays((int)this.h, (int)n6, (int)n7);
        }
    }

    public void a(c c10) {
        block3: {
            block2: {
                String string = I.j();
                I i2 = this;
                if (string != null) break block2;
                if (i2.r == null) break block3;
                i2 = this;
            }
            i2.f = c10;
        }
    }

    public void a(P p2) {
        block15: {
            block16: {
                I i2;
                c[] arrc;
                block8: {
                    String string;
                    block9: {
                        c[] arrc2;
                        block13: {
                            block14: {
                                block11: {
                                    I i3;
                                    block12: {
                                        c[] arrc3;
                                        block10: {
                                            this.l.clear();
                                            String string2 = I.j();
                                            this.b(p2.b().length * 4);
                                            this.l.put(p2.b());
                                            this.p = p2.c();
                                            this.m = new e(p2.a());
                                            string = string2;
                                            arrc = P.a(p2);
                                            if (string != null) break block8;
                                            if (arrc == null) break block9;
                                            arrc3 = this.r;
                                            if (string != null) break block10;
                                            if (arrc3 == null) {
                                                this.r = this.s;
                                            }
                                            i3 = this;
                                            if (string != null) break block11;
                                            arrc3 = i3.r;
                                        }
                                        if (arrc3 == null) break block12;
                                        arrc2 = this.r;
                                        if (string != null) break block13;
                                        if (arrc2.length >= this.o()) break block14;
                                    }
                                    i3 = this;
                                }
                                i3.r = new c[this.o()];
                            }
                            arrc2 = P.a(p2);
                        }
                        c[] arrc4 = arrc2;
                        System.arraycopy(arrc4, 0, this.r, 0, arrc4.length);
                        if (string == null) break block15;
                    }
                    i2 = this;
                    if (string != null) break block16;
                    arrc = i2.r;
                }
                if (arrc != null) {
                    this.s = this.r;
                }
                i2 = this;
            }
            i2.r = null;
        }
    }

    public P r() {
        c[] arrc;
        int[] arrn;
        block3: {
            I i2;
            block2: {
                this.l.rewind();
                String string = I.j();
                int n2 = this.m();
                this.l.limit(n2);
                arrn = new int[n2];
                this.l.get(arrn);
                this.l.limit(this.l.capacity());
                String string2 = string;
                this.l.position(n2);
                arrc = null;
                i2 = this;
                if (string2 != null) break block2;
                if (i2.r == null) break block3;
                i2 = this;
            }
            int n3 = i2.p / 4;
            arrc = new c[n3];
            System.arraycopy(this.r, 0, arrc, 0, n3);
        }
        return new P(this, arrn, new e(this.m), arrc);
    }

    private int o() {
        int n2 = this.l.capacity() * 4 / (this.m.a() * 4);
        return n2;
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        block2: {
            block1: {
                String string;
                block0: {
                    string = I.j();
                    if (string != null) break block0;
                    if (ByteOrder.nativeOrder() != ByteOrder.LITTLE_ENDIAN) break block1;
                    this.l.put(n2, n6 << 24 | n5 << 16 | n4 << 8 | n3);
                }
                if (string == null) break block2;
            }
            this.l.put(n2, n3 << 24 | n4 << 16 | n5 << 8 | n6);
        }
    }

    private void b(int n2) {
        block7: {
            c[] arrc;
            block8: {
                int n3;
                String string;
                block5: {
                    block6: {
                        string = I.j();
                        n3 = fU.ag();
                        if (string == null) {
                            if (n3 != 0) {
                                n2 *= 2;
                            }
                            n3 = net.minecraft.k.h.d(n2, 4) / 4;
                        }
                        if (string != null) break block5;
                        if (n3 > this.l.remaining()) break block6;
                        n3 = this.p * this.m.c() + n2;
                        if (string != null) break block5;
                        if (n3 <= this.v.capacity()) break block7;
                    }
                    n3 = this.v.capacity();
                }
                int n4 = n3;
                int n5 = n4 + net.minecraft.k.h.d(n2, 0x200000);
                u.debug("Needed to grow BufferBuilder buffer: Old size {} bytes, new size {} bytes.", (Object)n4, (Object)n5);
                int n6 = this.l.position();
                ByteBuffer byteBuffer = aZ.d(n5);
                this.v.position(0);
                byteBuffer.put(this.v);
                byteBuffer.rewind();
                this.v = byteBuffer;
                this.o = this.v.asFloatBuffer();
                this.l = this.v.asIntBuffer();
                this.l.position(n6);
                this.t = this.v.asShortBuffer();
                this.t.position(n6 << 1);
                arrc = this.r;
                if (string != null) break block8;
                if (arrc == null) break block7;
                arrc = this.r;
            }
            c[] arrc2 = arrc;
            int n7 = this.o();
            this.r = new c[n7];
            System.arraycopy(arrc2, 0, this.r, 0, Math.min(arrc2.length, this.r.length));
            this.s = null;
        }
    }

    public int a(int n2) {
        return ((this.p - n2) * this.m.c() + this.m.d()) / 4;
    }

    public double q() {
        return this.w;
    }

    public void c(int n2) {
        String string = I.j();
        for (int i2 = 0; i2 < 4; ++i2) {
            this.b(n2, i2 + 1);
            if (string == null) continue;
        }
    }

    public int a() {
        return this.p;
    }
}

