package eu.kanade.tachiyomi.extension.ar.mangapro;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@SerialName("indirect")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ%\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImageToken;", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledData;", "token", "", "method", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getToken", "()Ljava/lang/String;", "getMethod", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class ScrambledImageToken extends ScrambledData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String method;
    private final String token;

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImageToken$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImageToken;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ScrambledImageToken> serializer() {
            return ScrambledImageToken$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrambledImageToken(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, ScrambledImageToken$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.method = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrambledImageToken(String str, String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "method");
        this.token = str;
        this.method = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(ScrambledImageToken self, CompositeEncoder output, SerialDescriptor serialDesc) {
        ScrambledData.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.token);
        output.encodeStringElement(serialDesc, 1, self.method);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getMethod() {
        return this.method;
    }
}
