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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@SerialName("direct")
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nBU\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImage;", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledData;", "mode", "", "order", "", "", "pieces", "dim", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMode", "()Ljava/lang/String;", "getOrder", "()Ljava/util/List;", "getPieces", "getDim", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class ScrambledImage extends ScrambledData {
    private final List<Integer> dim;
    private final String mode;
    private final List<Integer> order;
    private final List<String> pieces;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImage$$ExternalSyntheticLambda0
        public final Object invoke() {
            return ScrambledImage._childSerializers$_anonymous_();
        }
    }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImage$$ExternalSyntheticLambda1
        public final Object invoke() {
            return ScrambledImage._childSerializers$_anonymous_$0();
        }
    }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.ScrambledImage$$ExternalSyntheticLambda2
        public final Object invoke() {
            return ScrambledImage._childSerializers$_anonymous_$1();
        }
    })};

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new ArrayListSerializer(IntSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(IntSerializer.INSTANCE);
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImage$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/ScrambledImage;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ScrambledImage> serializer() {
            return ScrambledImage$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScrambledImage(int i, String str, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ScrambledImage$$serializer.INSTANCE.getDescriptor());
        }
        this.mode = str;
        this.order = list;
        this.pieces = list2;
        this.dim = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrambledImage(String str, List<Integer> list, List<String> list2, List<Integer> list3) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "mode");
        Intrinsics.checkNotNullParameter(list, "order");
        Intrinsics.checkNotNullParameter(list2, "pieces");
        Intrinsics.checkNotNullParameter(list3, "dim");
        this.mode = str;
        this.order = list;
        this.pieces = list2;
        this.dim = list3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(ScrambledImage self, CompositeEncoder output, SerialDescriptor serialDesc) {
        ScrambledData.write$Self(self, output, serialDesc);
        Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.mode);
        output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy) lazyArr[1].getValue(), self.order);
        output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy) lazyArr[2].getValue(), self.pieces);
        output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy) lazyArr[3].getValue(), self.dim);
    }

    public final String getMode() {
        return this.mode;
    }

    public final List<Integer> getOrder() {
        return this.order;
    }

    public final List<String> getPieces() {
        return this.pieces;
    }

    public final List<Integer> getDim() {
        return this.dim;
    }
}
