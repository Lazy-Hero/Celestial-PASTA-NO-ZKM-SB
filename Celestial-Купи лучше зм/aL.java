/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ar.aA;

public class aL {
    private /* synthetic */ float c;
    private /* synthetic */ float e;
    private /* synthetic */ float f;
    private /* synthetic */ float b;
    private /* synthetic */ float d;
    private /* synthetic */ float a;

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(aA aA2) {
        float f10;
        block10: {
            String string;
            block12: {
                float f11;
                block11: {
                    float f12;
                    block9: {
                        float f13;
                        float f14;
                        float f15;
                        string = K.d();
                        boolean bl2 = hv.a[aA2.ordinal()];
                        if (string != null) return bl2;
                        switch (bl2) {
                            case 1: 
                            case 2: {
                                f15 = this.f();
                                f14 = this.b();
                                f12 = this.d();
                                f11 = this.a();
                                if (string == null) break;
                            }
                            case 3: 
                            case 4: {
                                f15 = this.f();
                                f14 = this.b();
                                f12 = this.e();
                                f11 = this.c();
                                if (string == null) break;
                            }
                            case 5: 
                            case 6: {
                                f15 = this.e();
                                f14 = this.c();
                                f12 = this.d();
                                f11 = this.a();
                                if (string == null) break;
                            }
                            default: {
                                return false;
                            }
                        }
                        f10 = (f13 = f15 - 0.0f) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        if (string != null) break block9;
                        if (f10 != false) break block10;
                        float f16 = f14 - 1.0f;
                        f10 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    }
                    if (string != null) break block11;
                    if (f10 != false) break block10;
                    float f17 = f12 - 0.0f;
                    f10 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                }
                if (string != null) break block12;
                if (f10 != false) break block10;
                float f18 = f11 - 1.0f;
                f10 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
            }
            if (string != null) return (boolean)f10;
            if (f10 == false) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public float c() {
        return this.c;
    }

    public float a() {
        return this.d;
    }

    public float f() {
        return this.e;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean b(aA aA2) {
        float f10;
        block13: {
            String string;
            block12: {
                float f11;
                float f12;
                float f13;
                string = K.d();
                boolean bl2 = hv.a[aA2.ordinal()];
                if (string != null) return bl2;
                switch (bl2) {
                    case 1: {
                        f13 = this.e();
                        f12 = this.c();
                        f11 = 0.0f;
                        if (string == null) break;
                    }
                    case 2: {
                        f13 = this.e();
                        f12 = this.c();
                        f11 = 1.0f;
                        if (string == null) break;
                    }
                    case 3: {
                        f13 = this.d();
                        f12 = this.a();
                        f11 = 0.0f;
                        if (string == null) break;
                    }
                    case 4: {
                        f13 = this.d();
                        f12 = this.a();
                        f11 = 1.0f;
                        if (string == null) break;
                    }
                    case 5: {
                        f13 = this.f();
                        f12 = this.b();
                        f11 = 0.0f;
                        if (string == null) break;
                    }
                    case 6: {
                        f13 = this.f();
                        f12 = this.b();
                        f11 = 1.0f;
                        if (string == null) break;
                    }
                    default: {
                        return false;
                    }
                }
                f10 = f13 == f11 ? 0 : (f13 > f11 ? 1 : -1);
                if (string != null) break block12;
                if (f10 != false) break block13;
                f10 = f12 == f11 ? 0 : (f12 > f11 ? 1 : -1);
            }
            if (string != null) return (boolean)f10;
            if (f10 == false) {
                f10 = 1.0f;
                return (boolean)f10;
            }
        }
        f10 = 0.0f;
        return (boolean)f10;
    }

    public aL(int[] arrn) {
        this.e = Float.MAX_VALUE;
        this.f = Float.MAX_VALUE;
        String string = K.d();
        this.a = Float.MAX_VALUE;
        this.b = -3.4028235E38f;
        this.c = -3.4028235E38f;
        this.d = -3.4028235E38f;
        int n2 = arrn.length / 4;
        for (int i2 = 0; i2 < 4; ++i2) {
            float f10;
            block14: {
                aL aL2;
                float f11;
                block13: {
                    int n3 = i2 * n2;
                    float f12 = Float.intBitsToFloat(arrn[n3 + 0]);
                    float f13 = Float.intBitsToFloat(arrn[n3 + 1]);
                    f10 = Float.intBitsToFloat(arrn[n3 + 2]);
                    float f14 = this.e - f12;
                    f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (string == null) {
                        float f15;
                        if (f11 > 0) {
                            this.e = f12;
                        }
                        f11 = (f15 = this.f - f13) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    }
                    if (string == null) {
                        float f16;
                        if (f11 > 0) {
                            this.f = f13;
                        }
                        f11 = (f16 = this.a - f10) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                    }
                    if (string == null) {
                        float f17;
                        if (f11 > 0) {
                            this.a = f10;
                        }
                        f11 = (f17 = this.b - f12) == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
                    }
                    if (string == null) {
                        float f18;
                        if (f11 < 0) {
                            this.b = f12;
                        }
                        f11 = (f18 = this.c - f13) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                    }
                    if (string != null) break block13;
                    if (f11 < 0) {
                        this.c = f13;
                    }
                    aL2 = this;
                    if (string != null) break block14;
                    float f19 = aL2.d - f10;
                    f11 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                }
                if (f11 >= 0) continue;
                aL2 = this;
            }
            aL2.d = f10;
            if (string == null) continue;
        }
    }

    public float e() {
        return this.f;
    }

    public float b() {
        return this.b;
    }

    public float d() {
        return this.a;
    }
}

