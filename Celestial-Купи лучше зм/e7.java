/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
import org.lwjgl.opengl.ARBShaderObjects;

public class e7
extends eH {
    private final /* synthetic */ float[] d;

    private static gP b(gP gP2) {
        return gP2;
    }

    public float[] a() {
        return this.d;
    }

    @Override
    protected void d() {
        this.d[0] = 0.0f;
        this.d[1] = 0.0f;
        this.d[2] = 0.0f;
        this.d[3] = 0.0f;
    }

    public void a(float f10, float f11, float f12, float f13) {
        block3: {
            block4: {
                int n2;
                block5: {
                    String string;
                    block2: {
                        string = dB.i();
                        n2 = this.a();
                        if (string == null) break block2;
                        if (n2 < 0) break block3;
                        float f14 = this.d[0] - f10;
                        n2 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    }
                    if (string == null) break block4;
                    if (n2 != 0) break block5;
                    float f15 = this.d[1] - f11;
                    n2 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (string == null) break block4;
                    if (n2 != 0) break block5;
                    float f16 = this.d[2] - f12;
                    n2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    if (string == null) break block4;
                    if (n2 != 0) break block5;
                    float f17 = this.d[3] - f13;
                    n2 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                    if (string == null) break block4;
                    if (n2 == 0) break block3;
                }
                ARBShaderObjects.glUniform4fARB((int)this.a(), (float)f10, (float)f11, (float)f12, (float)f13);
                n2 = cS.a(this.b());
            }
            this.d[0] = f10;
            this.d[1] = f11;
            this.d[2] = f12;
            this.d[3] = f13;
        }
    }

    public e7(String string) {
        super(string);
        this.d = new float[4];
    }
}

