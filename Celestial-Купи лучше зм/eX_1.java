/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBShaderObjects
 */
import org.lwjgl.opengl.ARBShaderObjects;

public class eX
extends eH {
    private /* synthetic */ int d;

    @Override
    protected void d() {
        this.d = -1;
    }

    public void b(int n2) {
        block3: {
            int n3;
            int n4;
            block4: {
                String string;
                block2: {
                    string = dB.i();
                    n4 = this.a();
                    if (string == null) break block2;
                    if (n4 < 0) break block3;
                    n4 = this.d;
                }
                n3 = n2;
                if (string == null) break block4;
                if (n4 == n3) break block3;
                n4 = this.a();
                n3 = n2;
            }
            ARBShaderObjects.glUniform1iARB((int)n4, (int)n3);
            cS.a(this.b());
            this.d = n2;
        }
    }

    public int b() {
        return this.d;
    }

    public eX(String string) {
        super(string);
        this.d = -1;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

