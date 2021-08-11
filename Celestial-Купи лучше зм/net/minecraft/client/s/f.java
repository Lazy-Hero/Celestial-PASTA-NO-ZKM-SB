/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.s;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.a.as;
import net.minecraft.client.s.a;
import net.minecraft.client.s.b;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.BufferUtils;
import org.lwjgl.util.vector.Matrix4f;

public class f {
    private final /* synthetic */ IntBuffer e;
    private /* synthetic */ boolean i;
    private final /* synthetic */ String f;
    private final /* synthetic */ a c;
    private static final /* synthetic */ Logger a;
    private final /* synthetic */ int d;
    private final /* synthetic */ FloatBuffer b;
    private final /* synthetic */ int g;
    private /* synthetic */ int h;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b() {
        var1_1 = net.minecraft.client.s.b.g();
        v0 = this.g;
        if (var1_1 != 0) ** GOTO lbl7
        switch (v0) {
            case 4: {
                v0 = this.h;
lbl7:
                // 2 sources

                as.d(v0, this.b);
                if (var1_1 == 0) return;
            }
            case 5: {
                as.b(this.h, this.b);
                if (var1_1 == 0) return;
            }
            case 6: {
                as.c(this.h, this.b);
                if (var1_1 == 0) return;
            }
            case 7: {
                as.a(this.h, this.b);
                if (var1_1 == 0) return;
            }
        }
        net.minecraft.client.s.f.a.warn("Uniform.upload called, but count value ({}) is not in the range of 1 to 4. Ignoring.", (Object)this.d);
    }

    public void a(float f10, float f11, float f12) {
        this.b.position(0);
        this.b.put(0, f10);
        this.b.put(1, f11);
        this.b.put(2, f12);
        this.d();
    }

    public void b(float f10, float f11, float f12, float f13) {
        this.b.position(0);
        this.b.put(f10);
        this.b.put(f11);
        this.b.put(f12);
        this.b.put(f13);
        this.b.flip();
        this.d();
    }

    public void a(float f10, float f11) {
        this.b.position(0);
        this.b.put(0, f10);
        this.b.put(1, f11);
        this.d();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void a(float[] arrf) {
        block4: {
            block2: {
                block3: {
                    int n2 = net.minecraft.client.s.b.g();
                    if (n2 != 0) break block2;
                    if (arrf.length >= this.d) break block3;
                    a.warn("Uniform.set called with a too-small value array (expected {}, got {}). Ignoring.", (Object)this.d, (Object)arrf.length);
                    if (n2 == 0) break block4;
                }
                this.b.position(0);
                this.b.put(arrf);
                this.b.position(0);
            }
            this.d();
        }
    }

    public void a(int n2) {
        this.h = n2;
    }

    public void a(float f10) {
        this.b.position(0);
        this.b.put(0, f10);
        this.d();
    }

    public void a(Matrix4f matrix4f) {
        this.a(matrix4f.m00, matrix4f.m01, matrix4f.m02, matrix4f.m03, matrix4f.m10, matrix4f.m11, matrix4f.m12, matrix4f.m13, matrix4f.m20, matrix4f.m21, matrix4f.m22, matrix4f.m23, matrix4f.m30, matrix4f.m31, matrix4f.m32, matrix4f.m33);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        this.b.position(0);
        this.b.put(0, f10);
        this.b.put(1, f11);
        this.b.put(2, f12);
        this.b.put(3, f13);
        this.b.put(4, f14);
        this.b.put(5, f15);
        this.b.put(6, f16);
        this.b.put(7, f17);
        this.b.put(8, f18);
        this.b.put(9, f19);
        this.b.put(10, f20);
        this.b.put(11, f21);
        this.b.put(12, f22);
        this.b.put(13, f23);
        this.b.put(14, f24);
        this.b.put(15, f25);
        this.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void e() {
        var1_1 = net.minecraft.client.s.b.c();
        v0 = this.g;
        if (var1_1 == 0) ** GOTO lbl7
        switch (v0) {
            case 8: {
                v0 = this.h;
lbl7:
                // 2 sources

                as.a(v0, true, this.b);
                if (var1_1 != 0) return;
            }
            case 9: {
                as.b(this.h, true, this.b);
                if (var1_1 != 0) return;
            }
            case 10: {
                as.c(this.h, true, this.b);
                return;
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        f f10;
        block10: {
            int n6;
            int n7;
            block9: {
                int n8 = net.minecraft.client.s.b.g();
                this.e.position(0);
                int n9 = n8;
                n7 = this.g;
                if (n9 == 0) {
                    if (n7 >= 0) {
                        this.e.put(0, n2);
                    }
                    n7 = this.g;
                }
                n6 = 1;
                if (n9 == 0) {
                    if (n7 >= n6) {
                        this.e.put(1, n3);
                    }
                    n7 = this.g;
                    n6 = 2;
                }
                if (n9 != 0) break block9;
                if (n7 >= n6) {
                    this.e.put(2, n4);
                }
                f10 = this;
                if (n9 != 0) break block10;
                n7 = f10.g;
                n6 = 3;
            }
            if (n7 >= n6) {
                this.e.put(3, n5);
            }
            f10 = this;
        }
        f10.d();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void f() {
        var1_1 = net.minecraft.client.s.b.c();
        v0 = this.g;
        if (var1_1 == 0) ** GOTO lbl7
        switch (v0) {
            case 0: {
                v0 = this.h;
lbl7:
                // 2 sources

                as.a(v0, this.e);
                if (var1_1 != 0) return;
            }
            case 1: {
                as.c(this.h, this.e);
                if (var1_1 != 0) return;
            }
            case 2: {
                as.d(this.h, this.e);
                if (var1_1 != 0) return;
            }
            case 3: {
                as.b(this.h, this.e);
                if (var1_1 != 0) return;
            }
        }
        net.minecraft.client.s.f.a.warn("Uniform.upload called, but count value ({}) is  not in the range of 1 to 4. Ignoring.", (Object)this.d);
    }

    public String c() {
        return this.f;
    }

    private void d() {
        block0: {
            this.i = true;
            if (this.c == null) break block0;
            this.c.a();
        }
    }

    public static int a(String string) {
        int n2;
        block9: {
            int n3;
            block6: {
                int n4;
                block12: {
                    block13: {
                        block10: {
                            block11: {
                                block7: {
                                    block8: {
                                        block4: {
                                            block5: {
                                                n3 = -1;
                                                n4 = net.minecraft.client.s.b.c();
                                                n2 = "int".equals(string);
                                                if (n4 == 0) break block4;
                                                if (n2 == 0) break block5;
                                                n3 = 0;
                                                if (n4 != 0) break block6;
                                            }
                                            n2 = "float".equals(string);
                                        }
                                        if (n4 == 0) break block7;
                                        if (n2 == 0) break block8;
                                        n3 = 4;
                                        if (n4 != 0) break block6;
                                    }
                                    n2 = string.startsWith("matrix") ? 1 : 0;
                                }
                                if (n4 == 0) break block9;
                                if (n2 == 0) break block6;
                                n2 = string.endsWith("2x2") ? 1 : 0;
                                if (n4 == 0) break block10;
                                if (n2 == 0) break block11;
                                n3 = 8;
                                if (n4 != 0) break block6;
                            }
                            n2 = string.endsWith("3x3") ? 1 : 0;
                        }
                        if (n4 == 0) break block12;
                        if (n2 == 0) break block13;
                        n3 = 9;
                        if (n4 != 0) break block6;
                    }
                    n2 = string.endsWith("4x4") ? 1 : 0;
                }
                if (n4 == 0) break block9;
                if (n2 != 0) {
                    n3 = 10;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    static {
        a = LogManager.getLogger();
    }

    public f(String string, int n2, int n3, a a10) {
        this.f = string;
        this.d = n3;
        this.g = n2;
        this.c = a10;
        if (n2 <= 3) {
            this.e = BufferUtils.createIntBuffer((int)n3);
            this.b = null;
        } else {
            this.e = null;
            this.b = BufferUtils.createFloatBuffer((int)n3);
        }
        this.h = -1;
        this.d();
    }

    public void a(float f10, float f11, float f12, float f13) {
        f f14;
        block10: {
            int n2;
            int n3;
            block9: {
                int n4 = net.minecraft.client.s.b.c();
                this.b.position(0);
                int n5 = n4;
                n3 = this.g;
                n2 = 4;
                if (n5 != 0) {
                    if (n3 >= n2) {
                        this.b.put(0, f10);
                    }
                    n3 = this.g;
                    n2 = 5;
                }
                if (n5 != 0) {
                    if (n3 >= n2) {
                        this.b.put(1, f11);
                    }
                    n3 = this.g;
                    n2 = 6;
                }
                if (n5 == 0) break block9;
                if (n3 >= n2) {
                    this.b.put(2, f12);
                }
                f14 = this;
                if (n5 == 0) break block10;
                n3 = f14.g;
                n2 = 7;
            }
            if (n3 >= n2) {
                this.b.put(3, f13);
            }
            f14 = this;
        }
        f14.d();
    }

    public void a() {
        block7: {
            f f10;
            block10: {
                int n2;
                int n3;
                block8: {
                    int n4;
                    block9: {
                        block5: {
                            block6: {
                                n4 = net.minecraft.client.s.b.c();
                                if (!this.i) {
                                    // empty if block
                                }
                                this.i = false;
                                n3 = this.g;
                                n2 = 3;
                                if (n4 == 0) break block5;
                                if (n3 > n2) break block6;
                                this.f();
                                if (n4 != 0) break block7;
                            }
                            n3 = this.g;
                            n2 = 7;
                        }
                        if (n4 == 0) break block8;
                        if (n3 > n2) break block9;
                        this.b();
                        if (n4 != 0) break block7;
                    }
                    f10 = this;
                    if (n4 == 0) break block10;
                    n3 = f10.g;
                    n2 = 10;
                }
                if (n3 > n2) {
                    a.warn("Uniform.upload called, but type value ({}) is not a valid type. Ignoring.", (Object)this.g);
                    return;
                }
                f10 = this;
            }
            f10.e();
        }
    }
}

