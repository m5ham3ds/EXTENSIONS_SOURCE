package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ%\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/InitialChapters;", "", "initialChapters", "", "Leu/kanade/tachiyomi/extension/ar/mangapro/Chapter;", "totalChapters", "", "<init>", "(Ljava/util/List;I)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInitialChapters", "()Ljava/util/List;", "getTotalChapters", "()I", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class InitialChapters {
    private final List<Chapter> initialChapters;
    private final int totalChapters;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.InitialChapters$$ExternalSyntheticLambda0
        public final Object invoke() {
            return InitialChapters._childSerializers$_anonymous_();
        }
    }), null};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Chapter$$serializer.INSTANCE);
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/InitialChapters$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/InitialChapters;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InitialChapters> serializer() {
            return InitialChapters$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InitialChapters(int i, List list, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, InitialChapters$$serializer.INSTANCE.getDescriptor());
        }
        this.initialChapters = list;
        this.totalChapters = i2;
    }

    public InitialChapters(List<Chapter> list, int i) {
        Intrinsics.checkNotNullParameter(list, "initialChapters");
        this.initialChapters = list;
        this.totalChapters = i;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(InitialChapters self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy) $childSerializers[0].getValue(), self.initialChapters);
        output.encodeIntElement(serialDesc, 1, self.totalChapters);
    }

    public final List<Chapter> getInitialChapters() {
        return this.initialChapters;
    }

    public final int getTotalChapters() {
        return this.totalChapters;
    }
}
