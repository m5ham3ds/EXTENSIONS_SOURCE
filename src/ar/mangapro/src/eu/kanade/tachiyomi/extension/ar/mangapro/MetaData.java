package eu.kanade.tachiyomi.extension.ar.mangapro;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJE\u0010\u0012\u001a\u00020\u0013\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00010\u001aH\u0001¢\u0006\u0002\b\u001bR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData;", "T", "", "data", "", "meta", "Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;", "<init>", "(Ljava/util/List;Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getData", "()Ljava/util/List;", "getMeta", "()Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "write$Self$mangapro", "Meta", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class MetaData<T> {
    private static final SerialDescriptor $cachedDescriptor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<T> data;
    private final Meta meta;

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\u00060\u0005\"\u0004\b\u0001\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005¨\u0006\t"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData;", "T", "typeSerial0", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T> KSerializer<MetaData<T>> serializer(KSerializer<T> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new MetaData$$serializer<>(typeSerial0);
        }
    }

    static {
        SerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("eu.kanade.tachiyomi.extension.ar.mangapro.MetaData", (GeneratedSerializer) null, 2);
        pluginGeneratedSerialDescriptor.addElement("data", false);
        pluginGeneratedSerialDescriptor.addElement("meta", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ MetaData(int i, List list, Meta meta, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, $cachedDescriptor);
        }
        this.data = list;
        this.meta = meta;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetaData(List<? extends T> list, Meta meta) {
        Intrinsics.checkNotNullParameter(list, "data");
        Intrinsics.checkNotNullParameter(meta, "meta");
        this.data = list;
        this.meta = meta;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(MetaData self, CompositeEncoder output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        output.encodeSerializableElement(serialDesc, 0, new ArrayListSerializer(typeSerial0), self.data);
        output.encodeSerializableElement(serialDesc, 1, MetaData$Meta$$serializer.INSTANCE, self.meta);
    }

    public final List<T> getData() {
        return this.data;
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fJ%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;", "", "pages", "", "page", "<init>", "(II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "hasNextPage", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Meta {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int page;
        private final int pages;

        /* JADX INFO: compiled from: Dto.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/MetaData$Meta;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Meta> serializer() {
                return MetaData$Meta$$serializer.INSTANCE;
            }
        }

        public Meta(int i, int i2) {
            this.pages = i;
            this.page = i2;
        }

        public /* synthetic */ Meta(int i, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, MetaData$Meta$$serializer.INSTANCE.getDescriptor());
            }
            this.pages = i2;
            this.page = i3;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$mangapro(Meta self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.pages);
            output.encodeIntElement(serialDesc, 1, self.page);
        }

        public final boolean hasNextPage() {
            return this.pages > this.page;
        }
    }

    public final Meta getMeta() {
        return this.meta;
    }
}
